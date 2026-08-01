package org.fusesource.jansi;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BLACK' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class AnsiRenderer$Code {
    private static final /* synthetic */ AnsiRenderer$Code[] $VALUES;
    public static final AnsiRenderer$Code BG_BLACK;
    public static final AnsiRenderer$Code BG_BLUE;
    public static final AnsiRenderer$Code BG_CYAN;
    public static final AnsiRenderer$Code BG_DEFAULT;
    public static final AnsiRenderer$Code BG_GREEN;
    public static final AnsiRenderer$Code BG_MAGENTA;
    public static final AnsiRenderer$Code BG_RED;
    public static final AnsiRenderer$Code BG_WHITE;
    public static final AnsiRenderer$Code BG_YELLOW;
    public static final AnsiRenderer$Code BLACK;
    public static final AnsiRenderer$Code BLINK_FAST;
    public static final AnsiRenderer$Code BLINK_OFF;
    public static final AnsiRenderer$Code BLINK_SLOW;
    public static final AnsiRenderer$Code BLUE;
    public static final AnsiRenderer$Code BOLD;
    public static final AnsiRenderer$Code CONCEAL_OFF;
    public static final AnsiRenderer$Code CONCEAL_ON;
    public static final AnsiRenderer$Code CYAN;
    public static final AnsiRenderer$Code DEFAULT;
    public static final AnsiRenderer$Code FAINT;
    public static final AnsiRenderer$Code FG_BLACK;
    public static final AnsiRenderer$Code FG_BLUE;
    public static final AnsiRenderer$Code FG_CYAN;
    public static final AnsiRenderer$Code FG_DEFAULT;
    public static final AnsiRenderer$Code FG_GREEN;
    public static final AnsiRenderer$Code FG_MAGENTA;
    public static final AnsiRenderer$Code FG_RED;
    public static final AnsiRenderer$Code FG_WHITE;
    public static final AnsiRenderer$Code FG_YELLOW;
    public static final AnsiRenderer$Code GREEN;
    public static final AnsiRenderer$Code INTENSITY_BOLD;
    public static final AnsiRenderer$Code INTENSITY_FAINT;
    public static final AnsiRenderer$Code ITALIC;
    public static final AnsiRenderer$Code MAGENTA;
    public static final AnsiRenderer$Code NEGATIVE_OFF;
    public static final AnsiRenderer$Code NEGATIVE_ON;
    public static final AnsiRenderer$Code RED;
    public static final AnsiRenderer$Code RESET;
    public static final AnsiRenderer$Code UNDERLINE;
    public static final AnsiRenderer$Code UNDERLINE_DOUBLE;
    public static final AnsiRenderer$Code UNDERLINE_OFF;
    public static final AnsiRenderer$Code WHITE;
    public static final AnsiRenderer$Code YELLOW;
    private final boolean background;
    private final Enum<?> n;

    static {
        Ansi$Color ansi$Color = Ansi$Color.BLACK;
        AnsiRenderer$Code ansiRenderer$Code = new AnsiRenderer$Code("BLACK", 0, ansi$Color);
        BLACK = ansiRenderer$Code;
        Ansi$Color ansi$Color2 = Ansi$Color.RED;
        AnsiRenderer$Code ansiRenderer$Code2 = new AnsiRenderer$Code("RED", 1, ansi$Color2);
        RED = ansiRenderer$Code2;
        Ansi$Color ansi$Color3 = Ansi$Color.GREEN;
        AnsiRenderer$Code ansiRenderer$Code3 = new AnsiRenderer$Code("GREEN", 2, ansi$Color3);
        GREEN = ansiRenderer$Code3;
        Ansi$Color ansi$Color4 = Ansi$Color.YELLOW;
        AnsiRenderer$Code ansiRenderer$Code4 = new AnsiRenderer$Code("YELLOW", 3, ansi$Color4);
        YELLOW = ansiRenderer$Code4;
        Ansi$Color ansi$Color5 = Ansi$Color.BLUE;
        AnsiRenderer$Code ansiRenderer$Code5 = new AnsiRenderer$Code("BLUE", 4, ansi$Color5);
        BLUE = ansiRenderer$Code5;
        Ansi$Color ansi$Color6 = Ansi$Color.MAGENTA;
        AnsiRenderer$Code ansiRenderer$Code6 = new AnsiRenderer$Code("MAGENTA", 5, ansi$Color6);
        MAGENTA = ansiRenderer$Code6;
        Ansi$Color ansi$Color7 = Ansi$Color.CYAN;
        AnsiRenderer$Code ansiRenderer$Code7 = new AnsiRenderer$Code("CYAN", 6, ansi$Color7);
        CYAN = ansiRenderer$Code7;
        Ansi$Color ansi$Color8 = Ansi$Color.WHITE;
        AnsiRenderer$Code ansiRenderer$Code8 = new AnsiRenderer$Code("WHITE", 7, ansi$Color8);
        WHITE = ansiRenderer$Code8;
        Ansi$Color ansi$Color9 = Ansi$Color.DEFAULT;
        AnsiRenderer$Code ansiRenderer$Code9 = new AnsiRenderer$Code("DEFAULT", 8, ansi$Color9);
        DEFAULT = ansiRenderer$Code9;
        AnsiRenderer$Code ansiRenderer$Code10 = new AnsiRenderer$Code("FG_BLACK", 9, ansi$Color, false);
        FG_BLACK = ansiRenderer$Code10;
        AnsiRenderer$Code ansiRenderer$Code11 = new AnsiRenderer$Code("FG_RED", 10, ansi$Color2, false);
        FG_RED = ansiRenderer$Code11;
        AnsiRenderer$Code ansiRenderer$Code12 = new AnsiRenderer$Code("FG_GREEN", 11, ansi$Color3, false);
        FG_GREEN = ansiRenderer$Code12;
        AnsiRenderer$Code ansiRenderer$Code13 = new AnsiRenderer$Code("FG_YELLOW", 12, ansi$Color4, false);
        FG_YELLOW = ansiRenderer$Code13;
        AnsiRenderer$Code ansiRenderer$Code14 = new AnsiRenderer$Code("FG_BLUE", 13, ansi$Color5, false);
        FG_BLUE = ansiRenderer$Code14;
        AnsiRenderer$Code ansiRenderer$Code15 = new AnsiRenderer$Code("FG_MAGENTA", 14, ansi$Color6, false);
        FG_MAGENTA = ansiRenderer$Code15;
        AnsiRenderer$Code ansiRenderer$Code16 = new AnsiRenderer$Code("FG_CYAN", 15, ansi$Color7, false);
        FG_CYAN = ansiRenderer$Code16;
        AnsiRenderer$Code ansiRenderer$Code17 = new AnsiRenderer$Code("FG_WHITE", 16, ansi$Color8, false);
        FG_WHITE = ansiRenderer$Code17;
        AnsiRenderer$Code ansiRenderer$Code18 = new AnsiRenderer$Code("FG_DEFAULT", 17, ansi$Color9, false);
        FG_DEFAULT = ansiRenderer$Code18;
        AnsiRenderer$Code ansiRenderer$Code19 = new AnsiRenderer$Code("BG_BLACK", 18, ansi$Color, true);
        BG_BLACK = ansiRenderer$Code19;
        AnsiRenderer$Code ansiRenderer$Code20 = new AnsiRenderer$Code("BG_RED", 19, ansi$Color2, true);
        BG_RED = ansiRenderer$Code20;
        AnsiRenderer$Code ansiRenderer$Code21 = new AnsiRenderer$Code("BG_GREEN", 20, ansi$Color3, true);
        BG_GREEN = ansiRenderer$Code21;
        AnsiRenderer$Code ansiRenderer$Code22 = new AnsiRenderer$Code("BG_YELLOW", 21, ansi$Color4, true);
        BG_YELLOW = ansiRenderer$Code22;
        AnsiRenderer$Code ansiRenderer$Code23 = new AnsiRenderer$Code("BG_BLUE", 22, ansi$Color5, true);
        BG_BLUE = ansiRenderer$Code23;
        AnsiRenderer$Code ansiRenderer$Code24 = new AnsiRenderer$Code("BG_MAGENTA", 23, ansi$Color6, true);
        BG_MAGENTA = ansiRenderer$Code24;
        AnsiRenderer$Code ansiRenderer$Code25 = new AnsiRenderer$Code("BG_CYAN", 24, ansi$Color7, true);
        BG_CYAN = ansiRenderer$Code25;
        AnsiRenderer$Code ansiRenderer$Code26 = new AnsiRenderer$Code("BG_WHITE", 25, ansi$Color8, true);
        BG_WHITE = ansiRenderer$Code26;
        AnsiRenderer$Code ansiRenderer$Code27 = new AnsiRenderer$Code("BG_DEFAULT", 26, ansi$Color9, true);
        BG_DEFAULT = ansiRenderer$Code27;
        AnsiRenderer$Code ansiRenderer$Code28 = new AnsiRenderer$Code("RESET", 27, Ansi$Attribute.RESET);
        RESET = ansiRenderer$Code28;
        Ansi$Attribute ansi$Attribute = Ansi$Attribute.INTENSITY_BOLD;
        AnsiRenderer$Code ansiRenderer$Code29 = new AnsiRenderer$Code("INTENSITY_BOLD", 28, ansi$Attribute);
        INTENSITY_BOLD = ansiRenderer$Code29;
        Ansi$Attribute ansi$Attribute2 = Ansi$Attribute.INTENSITY_FAINT;
        AnsiRenderer$Code ansiRenderer$Code30 = new AnsiRenderer$Code("INTENSITY_FAINT", 29, ansi$Attribute2);
        INTENSITY_FAINT = ansiRenderer$Code30;
        AnsiRenderer$Code ansiRenderer$Code31 = new AnsiRenderer$Code("ITALIC", 30, Ansi$Attribute.ITALIC);
        ITALIC = ansiRenderer$Code31;
        AnsiRenderer$Code ansiRenderer$Code32 = new AnsiRenderer$Code("UNDERLINE", 31, Ansi$Attribute.UNDERLINE);
        UNDERLINE = ansiRenderer$Code32;
        AnsiRenderer$Code ansiRenderer$Code33 = new AnsiRenderer$Code("BLINK_SLOW", 32, Ansi$Attribute.BLINK_SLOW);
        BLINK_SLOW = ansiRenderer$Code33;
        AnsiRenderer$Code ansiRenderer$Code34 = new AnsiRenderer$Code("BLINK_FAST", 33, Ansi$Attribute.BLINK_FAST);
        BLINK_FAST = ansiRenderer$Code34;
        AnsiRenderer$Code ansiRenderer$Code35 = new AnsiRenderer$Code("BLINK_OFF", 34, Ansi$Attribute.BLINK_OFF);
        BLINK_OFF = ansiRenderer$Code35;
        AnsiRenderer$Code ansiRenderer$Code36 = new AnsiRenderer$Code("NEGATIVE_ON", 35, Ansi$Attribute.NEGATIVE_ON);
        NEGATIVE_ON = ansiRenderer$Code36;
        AnsiRenderer$Code ansiRenderer$Code37 = new AnsiRenderer$Code("NEGATIVE_OFF", 36, Ansi$Attribute.NEGATIVE_OFF);
        NEGATIVE_OFF = ansiRenderer$Code37;
        AnsiRenderer$Code ansiRenderer$Code38 = new AnsiRenderer$Code("CONCEAL_ON", 37, Ansi$Attribute.CONCEAL_ON);
        CONCEAL_ON = ansiRenderer$Code38;
        AnsiRenderer$Code ansiRenderer$Code39 = new AnsiRenderer$Code("CONCEAL_OFF", 38, Ansi$Attribute.CONCEAL_OFF);
        CONCEAL_OFF = ansiRenderer$Code39;
        AnsiRenderer$Code ansiRenderer$Code40 = new AnsiRenderer$Code("UNDERLINE_DOUBLE", 39, Ansi$Attribute.UNDERLINE_DOUBLE);
        UNDERLINE_DOUBLE = ansiRenderer$Code40;
        AnsiRenderer$Code ansiRenderer$Code41 = new AnsiRenderer$Code("UNDERLINE_OFF", 40, Ansi$Attribute.UNDERLINE_OFF);
        UNDERLINE_OFF = ansiRenderer$Code41;
        AnsiRenderer$Code ansiRenderer$Code42 = new AnsiRenderer$Code("BOLD", 41, ansi$Attribute);
        BOLD = ansiRenderer$Code42;
        AnsiRenderer$Code ansiRenderer$Code43 = new AnsiRenderer$Code("FAINT", 42, ansi$Attribute2);
        FAINT = ansiRenderer$Code43;
        $VALUES = new AnsiRenderer$Code[]{ansiRenderer$Code, ansiRenderer$Code2, ansiRenderer$Code3, ansiRenderer$Code4, ansiRenderer$Code5, ansiRenderer$Code6, ansiRenderer$Code7, ansiRenderer$Code8, ansiRenderer$Code9, ansiRenderer$Code10, ansiRenderer$Code11, ansiRenderer$Code12, ansiRenderer$Code13, ansiRenderer$Code14, ansiRenderer$Code15, ansiRenderer$Code16, ansiRenderer$Code17, ansiRenderer$Code18, ansiRenderer$Code19, ansiRenderer$Code20, ansiRenderer$Code21, ansiRenderer$Code22, ansiRenderer$Code23, ansiRenderer$Code24, ansiRenderer$Code25, ansiRenderer$Code26, ansiRenderer$Code27, ansiRenderer$Code28, ansiRenderer$Code29, ansiRenderer$Code30, ansiRenderer$Code31, ansiRenderer$Code32, ansiRenderer$Code33, ansiRenderer$Code34, ansiRenderer$Code35, ansiRenderer$Code36, ansiRenderer$Code37, ansiRenderer$Code38, ansiRenderer$Code39, ansiRenderer$Code40, ansiRenderer$Code41, ansiRenderer$Code42, ansiRenderer$Code43};
    }

    private AnsiRenderer$Code(String str, int i, Enum r3, boolean z) {
        this.n = r3;
        this.background = z;
    }

    public static AnsiRenderer$Code valueOf(String str) {
        return (AnsiRenderer$Code) Enum.valueOf(AnsiRenderer$Code.class, str);
    }

    public static AnsiRenderer$Code[] values() {
        return (AnsiRenderer$Code[]) $VALUES.clone();
    }

    public Ansi$Attribute getAttribute() {
        return (Ansi$Attribute) this.n;
    }

    public Ansi$Color getColor() {
        return (Ansi$Color) this.n;
    }

    public boolean isAttribute() {
        return this.n instanceof Ansi$Attribute;
    }

    public boolean isBackground() {
        return this.background;
    }

    public boolean isColor() {
        return this.n instanceof Ansi$Color;
    }

    private AnsiRenderer$Code(String str, int i, Enum r4) {
        this(str, i, r4, false);
    }
}
