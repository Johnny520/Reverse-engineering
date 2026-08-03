package p001;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۟.u8 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0417u8 {

    /* JADX INFO: renamed from: ۥ */
    public static final /* synthetic */ EnumC0417u8[] f1140;

    static {
        EnumC0417u8[] enumC0417u8Arr = {new EnumC0417u8("IGNORE_CASE", 0, 2), new EnumC0417u8("MULTILINE", 1, 8), new EnumC0417u8("LITERAL", 2, 16), new EnumC0417u8("UNIX_LINES", 3, 1), new EnumC0417u8("COMMENTS", 4, 4), new EnumC0417u8("DOT_MATCHES_ALL", 5, 32), new EnumC0417u8("CANON_EQ", 6, 128)};
        f1140 = enumC0417u8Arr;
        new C0359q2(enumC0417u8Arr);
    }

    public EnumC0417u8() {
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EnumC0417u8(String str, int i, int i2) {
    }

    public static EnumC0417u8 valueOf(String str) {
        return (EnumC0417u8) Enum.valueOf(EnumC0417u8.class, str);
    }

    public static EnumC0417u8[] values() {
        return (EnumC0417u8[]) f1140.clone();
    }
}
