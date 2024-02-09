package com.npcmanager.npcmanager.NPCs;

import com.npcmanager.npcmanager.exceptions.IncompleteDataException;
import jakarta.transaction.Transactional;
import java.util.List;
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
        newNpc.getAge() < 0
      )
    ) {
      throw new IncompleteDataException(
        "Required fields are missing or incompatible"
      );
    }
    return this.npcRepository.save(newNpc);
  }
}
