package yyds;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: yyds.ᛱᛷᛴᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0161 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0161[] f975;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final EnumC0161 f976;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final EnumC0161 f977;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final EnumC0161 f978;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final EnumC0161 f979;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final EnumC0161 f980;

    static {
        EnumC0161 enumC0161 = new EnumC0161("LevelDebug", 0);
        f978 = enumC0161;
        EnumC0161 enumC01612 = new EnumC0161("LevelInfo", 1);
        f980 = enumC01612;
        EnumC0161 enumC01613 = new EnumC0161("LevelWarning", 2);
        f976 = enumC01613;
        EnumC0161 enumC01614 = new EnumC0161("LevelError", 3);
        f979 = enumC01614;
        EnumC0161 enumC01615 = new EnumC0161("LevelNone", 4);
        f977 = enumC01615;
        f975 = new EnumC0161[]{enumC0161, enumC01612, enumC01613, enumC01614, enumC01615};
    }

    public static EnumC0161 valueOf(String str) {
        return (EnumC0161) Enum.valueOf(EnumC0161.class, str);
    }

    public static EnumC0161[] values() {
        return (EnumC0161[]) f975.clone();
    }
}
