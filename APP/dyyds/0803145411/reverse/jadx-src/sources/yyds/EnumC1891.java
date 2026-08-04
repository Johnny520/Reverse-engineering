package yyds;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: yyds.ᛸᲇᛱᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1891 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final EnumC1891 f9531;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1891[] f9532;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1891 EF0;

    static {
        EnumC1891 enumC1891 = new EnumC1891("SRGB", 0);
        EnumC1891 enumC18912 = new EnumC1891("DISPLAY_P3", 1);
        f9531 = enumC18912;
        f9532 = new EnumC1891[]{enumC1891, enumC18912};
    }

    public static EnumC1891 valueOf(String str) {
        return (EnumC1891) Enum.valueOf(EnumC1891.class, str);
    }

    public static EnumC1891[] values() {
        return (EnumC1891[]) f9532.clone();
    }
}
