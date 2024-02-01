package com.npcmanager.npcmanager.NPCs;

import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class NpcCreateDTO {

  @NotBlank
  private int age;

  @NotBlank
  private String name;

  @NotBlank
  private String race;

  private String character_class;

  private int level;

  private String alignment;

  private String backstory;

  private int experience_points;

  private int hit_points;

  private int armor_class;

  private int strength;

  private int dexterity;

  private int constitution;

  private int intelligence;

  private int wisdom;

  private int charisma;

  private String inventory;

  private String notes;
}
