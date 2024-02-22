package com.npcmanager.npcmanager.NPCs;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class NpcCreateDTO {

  @NotBlank(message = "Age cannot be empty.")
  private Integer age;

  @NotBlank(message = "Name cannot be empty.")
  private String name;

  @NotBlank(message = "Race cannot be empty.")
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

  private String image_url;
}
