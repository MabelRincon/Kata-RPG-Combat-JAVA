package dev.mabelrb.kata;

import static org.junit.jupiter.api.Assertions.*;
import  org.junit.jupiter.api.DisplayName;



import org.junit.jupiter.api.Test;

public class CharacterTest {

    @Test
    @DisplayName("Test that the character is created wit the expected characteristics")
    public void testCharacterCreatedAsExpected() {
        Character character = new Character();
        assertEquals(1000, character.getHealth());
        assertEquals(1, character.getLevel());
        assertTrue(character.isAlive());
    }

}
