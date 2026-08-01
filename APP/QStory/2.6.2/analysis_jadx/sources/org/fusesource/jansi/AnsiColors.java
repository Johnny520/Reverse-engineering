package org.fusesource.jansi;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
