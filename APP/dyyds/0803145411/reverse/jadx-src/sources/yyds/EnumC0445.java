package yyds;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: yyds.ᛲᲀᲇᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0445 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0445[] f2266;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final EnumC0445 f2267;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final EnumC0445 f2268;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final EnumC0445 f2269;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final EnumC0445 f2270;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final EnumC0445 f2271;

    static {
        EnumC0445 enumC0445 = new EnumC0445("DEFAULT_PATH_LEAF_TO_NULL", 0);
        f2269 = enumC0445;
        EnumC0445 enumC04452 = new EnumC0445("ALWAYS_RETURN_LIST", 1);
        f2271 = enumC04452;
        EnumC0445 enumC04453 = new EnumC0445("AS_PATH_LIST", 2);
        f2267 = enumC04453;
        EnumC0445 enumC04454 = new EnumC0445("SUPPRESS_EXCEPTIONS", 3);
        f2270 = enumC04454;
        EnumC0445 enumC04455 = new EnumC0445("REQUIRE_PROPERTIES", 4);
        f2268 = enumC04455;
        f2266 = new EnumC0445[]{enumC0445, enumC04452, enumC04453, enumC04454, enumC04455};
    }

    public static EnumC0445 valueOf(String str) {
        return (EnumC0445) Enum.valueOf(EnumC0445.class, str);
    }

    public static EnumC0445[] values() {
        return (EnumC0445[]) f2266.clone();
    }
}
