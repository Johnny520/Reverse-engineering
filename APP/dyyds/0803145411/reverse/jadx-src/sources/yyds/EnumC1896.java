package yyds;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: yyds.ᛸᲇᛵᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1896 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final EnumC1896 f9603;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final EnumC1896 f9604;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1896[] f9605;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final EnumC1896 f9606;

    static {
        EnumC1896 enumC1896 = new EnumC1896("PREFER_ARGB_8888", 0);
        f9604 = enumC1896;
        EnumC1896 enumC18962 = new EnumC1896("PREFER_RGB_565", 1);
        f9606 = enumC18962;
        f9605 = new EnumC1896[]{enumC1896, enumC18962};
        f9603 = enumC1896;
    }

    public static EnumC1896 valueOf(String str) {
        return (EnumC1896) Enum.valueOf(EnumC1896.class, str);
    }

    public static EnumC1896[] values() {
        return (EnumC1896[]) f9605.clone();
    }
}
