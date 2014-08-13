package jfx8ibe;

public interface Purrable {
    default void purr() {
        System.out.println("Purrrrrrr...");
    }
}
