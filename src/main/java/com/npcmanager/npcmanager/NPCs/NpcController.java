package com.npcmanager.npcmanager.NPCs;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/npcs")
public class NpcController {

  @Autowired
  private NpcService npcService;

  @GetMapping
  public ResponseEntity<List<Npc>> getAll() {
    List<Npc> allNpcs = this.npcService.getAll();
    return new ResponseEntity<>(allNpcs, HttpStatus.OK);
  }
}
