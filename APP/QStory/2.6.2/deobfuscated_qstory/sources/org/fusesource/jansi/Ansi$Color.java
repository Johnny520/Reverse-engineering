package org.fusesource.jansi;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public enum Ansi$Color {
    BLACK(0, "BLACK"),
    RED(1, "RED"),
    GREEN(2, "GREEN"),
    YELLOW(3, "YELLOW"),
    BLUE(4, "BLUE"),
    MAGENTA(5, "MAGENTA"),
    CYAN(6, "CYAN"),
    WHITE(7, "WHITE"),
    DEFAULT(9, "DEFAULT");

    private final String name;
    private final int value;

    Ansi$Color(int i, String str) {
        this.value = i;
        this.name = str;
    }

    public int bg() {
        return this.value + 40;
    }

    public int bgBright() {
        return this.value + 100;
    }

    public int fg() {
        return this.value + 30;
    }

    public int fgBright() {
        return this.value + 90;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }

    public int value() {
        return this.value;
    }
}
