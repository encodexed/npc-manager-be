package com.npcmanager.npcmanager.NPCs;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "NPCs")
@Getter
@Setter
public class Npc {

  @Id
  @Nonnull
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private String name;

  @Column
  @Nonnull
  private String race;

  @Column
  @Nonnull
  private int age;

  @Column
  private String character_class;

  @Column
  private int level;

  @Column
  private String alignment;

  @Column
  private String backstory;

  @Column
  private int experience_points;

  @Column
  private int hit_points;

  @Column
  private int armor_class;

  @Column
  private int strength;

  @Column
  private int dexterity;

  @Column
  private int constitution;

  @Column
  private int intelligence;

  @Column
  private int wisdom;

  @Column
  private int charisma;

  @Column
  private String inventory;

  @Column
  private String notes;
}
