package me.dolia.metronome;

public enum RhythmicPattern {
    QUARTERS(new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}),
    EIGHTHS(new int[]{1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}),
    TRIPLE_EIGHTHS(new int[]{1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}),
    SIXTEENTHS(new int[]{1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0}),
    EIGHTH_DOT_SIXTEENTH(new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0}),
    EIGHTH_TWO_SIXTEENTHS(new int[]{1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0}),
    TWO_SIXTEENTHS_EIGHT(new int[]{1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0});

    public final int[] template;

    RhythmicPattern(int[] template) {
        this.template = template;
    }
}
