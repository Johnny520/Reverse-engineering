package org.fusesource.jansi;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public enum Ansi$Attribute {
    RESET(0, "RESET"),
    INTENSITY_BOLD(1, "INTENSITY_BOLD"),
    INTENSITY_FAINT(2, "INTENSITY_FAINT"),
    ITALIC(3, "ITALIC_ON"),
    UNDERLINE(4, "UNDERLINE_ON"),
    BLINK_SLOW(5, "BLINK_SLOW"),
    BLINK_FAST(6, "BLINK_FAST"),
    NEGATIVE_ON(7, "NEGATIVE_ON"),
    CONCEAL_ON(8, "CONCEAL_ON"),
    STRIKETHROUGH_ON(9, "STRIKETHROUGH_ON"),
    UNDERLINE_DOUBLE(21, "UNDERLINE_DOUBLE"),
    INTENSITY_BOLD_OFF(22, "INTENSITY_BOLD_OFF"),
    ITALIC_OFF(23, "ITALIC_OFF"),
    UNDERLINE_OFF(24, "UNDERLINE_OFF"),
    BLINK_OFF(25, "BLINK_OFF"),
    NEGATIVE_OFF(27, "NEGATIVE_OFF"),
    CONCEAL_OFF(28, "CONCEAL_OFF"),
    STRIKETHROUGH_OFF(29, "STRIKETHROUGH_OFF");

    private final String name;
    private final int value;

    Ansi$Attribute(int i, String str) {
        this.value = i;
        this.name = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }

    public int value() {
        return this.value;
    }
}
