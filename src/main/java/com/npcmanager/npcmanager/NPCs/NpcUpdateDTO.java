package com.npcmanager.npcmanager.NPCs;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NpcUpdateDTO {

  private Integer age;

  private String name;

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
