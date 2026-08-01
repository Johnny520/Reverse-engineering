package org.fusesource.jansi;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public enum AnsiColors {
    Colors16("16 colors"),
    Colors256("256 colors"),
    TrueColor("24-bit colors");

    private final String description;

    AnsiColors(String str) {
        this.description = str;
    }

    public String getDescription() {
        return this.description;
    }
}
