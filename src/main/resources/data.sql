DROP TABLE IF EXISTS npcs;

CREATE TABLE npcs (
    id INT PRIMARY KEY,
    age INT NOT NULL,
    alignment VARCHAR(20),
    armor_class INT,
    backstory TEXT,
    character_class VARCHAR(20),
    charisma INT,
    constitution INT,
    dexterity INT,
    experience_points INT,
    hit_points INT,
    image_url VARCHAR(255),
    intelligence INT,
    inventory TEXT,
    level INT,
    name VARCHAR(50) NOT NULL,
    notes TEXT,
    race VARCHAR(20) NOT NULL,
    strength INT,
    wisdom INT
);


INSERT INTO npcs (id, age, alignment, armor_class, backstory, character_class, charisma, constitution, dexterity, experience_points, hit_points, intelligence, inventory, level, name, notes, race, strength, wisdom)
VALUES (1, 35, "Lawful Good", 16, "Raised in a small village, this NPC was once a skilled blacksmith before answering the call to adventure.", "Fighter", 14, 16, 12, 2500, 42, 10, "Longsword, Chain Mail, Shield, Healing Potion, Traveler's Clothes, 10 gold pieces", 4, "Thrain Ironheart", "Has a scar across the left cheek from a past encounter with a fearsome orc.", "Dwarf", 18, 12), 
(2, 28, "Chaotic Neutral", 14, "A former street thief turned rogue, seeking redemption through heroic deeds.", "Rogue", 16, 12, 18, 1500, 30, 14, "Dagger, Thieves' Tools, Leather Armor, Cloak of Shadows, 20 gold pieces", 3, "Sylas Shadowblade", "Carries a mysterious locket with a faded portrait inside.", "Elf", 10, 13),
(3, 45, "Lawful Evil", 17, "A disgraced noble seeking power through dark magic after being exiled from the kingdom.", "Warlock", 15, 13, 10, 3000, 40, 16, "Book of Shadows, Robes of the Occult, Potion of Invisibility, 50 gold pieces", 5, "Lady Morgana Darkheart", "Hides a cursed mark on her left hand, the source of her dark powers.", "Tiefling", 12, 14);

