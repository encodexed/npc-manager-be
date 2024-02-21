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
  private Integer age;

  @NotBlank
  private String name;

  @NotBlank
  private String race;

  private String character_class;

  private Integer level;

  private String alignment;

  private String backstory;

  private Integer experience_points;

  private Integer hit_points;

  private Integer armor_class;

  private Integer strength;

  private Integer dexterity;

  private Integer constitution;

  private Integer intelligence;

  private Integer wisdom;

  private Integer charisma;

  private String inventory;

  private String notes;
}
