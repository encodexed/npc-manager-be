package com.npcmanager.npcmanager.NPCs;

import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class NpcService {

  @Autowired
  private NpcRepository npcRepository;

  public List<Npc> getAll() {
    return this.npcRepository.findAll();
  }
}
