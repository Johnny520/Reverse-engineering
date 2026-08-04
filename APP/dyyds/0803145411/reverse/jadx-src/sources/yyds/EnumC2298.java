package yyds;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: yyds.ᲁᛸᲀᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2298 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC2298[] f11295;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final /* synthetic */ C0468 f11296;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final EnumC2298 f11297;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final EnumC2298 f11298;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final EnumC2298 f11299;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final EnumC2298 f11300;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f11301;

    static {
        EnumC2298 enumC2298 = new EnumC2298("PUBLIC", 0, 1);
        f11300 = enumC2298;
        EnumC2298 enumC22982 = new EnumC2298("PRIVATE", 1, 2);
        f11297 = enumC22982;
        EnumC2298 enumC22983 = new EnumC2298("PROTECTED", 2, 4);
        EnumC2298 enumC22984 = new EnumC2298("STATIC", 3, 8);
        f11299 = enumC22984;
        EnumC2298 enumC22985 = new EnumC2298("FINAL", 4, 16);
        f11298 = enumC22985;
        EnumC2298[] enumC2298Arr = {enumC2298, enumC22982, enumC22983, enumC22984, enumC22985, new EnumC2298("SYNCHRONIZED", 5, 32), new EnumC2298("VOLATILE", 6, 64), new EnumC2298("TRANSIENT", 7, 128), new EnumC2298("NATIVE", 8, 256), new EnumC2298("INTERFACE", 9, 512), new EnumC2298("ABSTRACT", 10, 1024), new EnumC2298("STRICT", 11, 2048)};
        f11295 = enumC2298Arr;
        f11296 = new C0468(enumC2298Arr);
    }

    public EnumC2298(String str, int i, int i2) {
        this.f11301 = i2;
    }

    public static EnumC2298 valueOf(String str) {
        return (EnumC2298) Enum.valueOf(EnumC2298.class, str);
    }

    public static EnumC2298[] values() {
        return (EnumC2298[]) f11295.clone();
    }
}
