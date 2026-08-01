// Decompiled by JEB v5.42.0.202606242140

package com.google.zxing.qrcode.decoder;

import c.ᵢˎ.CLS327;

public enum Mode {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);

    public final int[] FLD1798;
    public final int FLD1799;

    public Mode(int[] arr_v, int v1) {
        this.FLD1798 = arr_v;
        this.FLD1799 = v1;
    }

    public static Mode forBits(int v) {
        switch(v) {
            case 0: {
                return Mode.TERMINATOR;
            }
            case 1: {
                return Mode.NUMERIC;
            }
            case 2: {
                return Mode.ALPHANUMERIC;
            }
            case 3: {
                return Mode.STRUCTURED_APPEND;
            }
            case 4: {
                return Mode.BYTE;
            }
            case 5: {
                return Mode.FNC1_FIRST_POSITION;
            }
            case 7: {
                return Mode.ECI;
            }
            case 8: {
                return Mode.KANJI;
            }
            case 9: {
                return Mode.FNC1_SECOND_POSITION;
            }
            case 13: {
                return Mode.HANZI;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }

    public int getBits() {
        return this.FLD1799;
    }

    public int getCharacterCountBits(CLS327 ᵔʼ0) {
        int v = ᵔʼ0.MTH4746();
        if(v <= 9) {
            return this.FLD1798[0];
        }
        return v > 26 ? this.FLD1798[2] : this.FLD1798[1];
    }
}

