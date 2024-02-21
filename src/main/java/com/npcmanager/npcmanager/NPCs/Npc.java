package com.npcmanager.npcmanager.NPCs;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "NPCs")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Npc {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private String name;

  @Column
  private String race;

  @Column
  private Integer age;

  @Column
  private String character_class;

  @Column
  private Integer level;

  @Column
  private String alignment;

  @Column
  private String backstory;

  @Column
  private Integer experience_points;

  @Column
  private Integer hit_points;

  @Column
  private Integer armor_class;

  @Column
  private Integer strength;

  @Column
  private Integer dexterity;

  @Column
  private Integer constitution;

  @Column
  private Integer intelligence;

  @Column
  private Integer wisdom;

  @Column
  private Integer charisma;

  @Column
  private String inventory;

  @Column
  private String notes;
}
