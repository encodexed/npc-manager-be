package com.npcmanager.npcmanager.NPCs;

import com.npcmanager.npcmanager.exceptions.IncompleteDataException;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class NpcService {

  @Autowired
  private NpcRepository npcRepository;

  @Autowired
  private ModelMapper modelMapper;

  public List<Npc> getAll() {
    return this.npcRepository.findAll();
  }

  public Npc createNpc(NpcCreateDTO data) {
    Npc newNpc = modelMapper.map(data, Npc.class);
    if (
      (
        newNpc.getName() == null ||
        newNpc.getRace() == null ||
        !(newNpc.getAge() > 0)
      )
    ) {
      throw new IncompleteDataException(
        "Required fields are missing or incompatible"
      );
    }
    return this.npcRepository.save(newNpc);
  }

  public Optional<Npc> getById(Long id) {
    Optional<Npc> foundNpc = npcRepository.findById(id);
    return foundNpc;
  }

  public boolean deleteById(Long id) {
    Optional<Npc> foundNpc = this.npcRepository.findById(id);
    if (foundNpc.isPresent()) {
      this.npcRepository.delete(foundNpc.get());
      return true;
    }
    return false;
  }

  public Optional<Npc> updateById(Long id, NpcCreateDTO data) {
    Optional<Npc> foundNpc = getById(id);
    if (foundNpc.isPresent()) {
      Npc toUpdate = foundNpc.get();
      modelMapper.map(data, toUpdate);
      Npc updatedNpc = this.npcRepository.save(toUpdate);
      return Optional.of(updatedNpc);
    }

    return foundNpc;
  }
}
