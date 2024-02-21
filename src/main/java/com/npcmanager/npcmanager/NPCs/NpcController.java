package com.npcmanager.npcmanager.NPCs;

import com.npcmanager.npcmanager.exceptions.NotFoundException;
import java.util.List;
import java.util.Optional;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

  @GetMapping("/{id}")
  public ResponseEntity<Npc> getById(@PathVariable Long id) {
    Optional<Npc> found = this.npcService.getById(id);

    if (found.isPresent()) {
      return new ResponseEntity<Npc>(found.get(), HttpStatus.OK);
    }

    throw new NotFoundException(
      String.format("NPC with id: %d does not exist", id)
    );
  }

  @PostMapping
  public ResponseEntity<Npc> createNpc(@Valid @RequestBody NpcCreateDTO data) {
    Npc newNpc = this.npcService.createNpc(data);
    return new ResponseEntity<Npc>(newNpc, HttpStatus.CREATED);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Npc> deleteById(@PathVariable Long id) {
    boolean deleted = this.npcService.deleteById(id);

    if (deleted) {
      return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
    }

    throw new NotFoundException(
      String.format("NPC with id: %d does not exist, could not delete", id)
    );
  }

  @PatchMapping("/{id}")
  public ResponseEntity<Npc> updateById(
    @PathVariable Long id,
    @Valid @RequestBody NpcUpdateDTO data
  ) {
    Optional<Npc> updated = this.npcService.updateById(id, data);

    if (updated.isPresent()) {
      return new ResponseEntity<Npc>(updated.get(), HttpStatus.OK);
    }

    throw new NotFoundException(
      String.format("NPC with id: %d does not exist, could not update", id)
    );
  }
}
