// Decompiled by JEB v5.42.0.202606242140

package net.glxn.qrgen.core.scheme;

public enum Girocode.Encoding {
    UTF_8,
    ISO_8859_1,
    ISO_8859_2,
    ISO_8859_4,
    ISO_8859_5,
    ISO_8859_7,
    ISO_8859_10,
    ISO_8859_15;

    public static Girocode.Encoding encodingFor(String s) {
        Girocode.Encoding[] arr_girocode$Encoding = Girocode.Encoding.values();
        for(int v = 0; v < arr_girocode$Encoding.length; ++v) {
            Girocode.Encoding girocode$Encoding0 = arr_girocode$Encoding[v];
            if(girocode$Encoding0.value().equals(s)) {
                return girocode$Encoding0;
            }
        }
        throw new IllegalArgumentException(String.format("unknown encoding value \'%s\'", s));
    }

    @Override
    public String toString() {
        return this.value();
    }

    public String value() {
        return "" + (this.ordinal() + 1);
    }
}

