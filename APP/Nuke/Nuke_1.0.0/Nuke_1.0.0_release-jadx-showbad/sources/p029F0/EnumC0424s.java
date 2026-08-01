package p029F0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: F0.s */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0424s {

    /* JADX INFO: renamed from: d */
    public static final EnumC0424s f1279d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0424s f1280e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC0424s[] f1281f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0424s enumC0424s = new EnumC0424s("Width", 0);
        f1279d = enumC0424s;
        EnumC0424s enumC0424s2 = new EnumC0424s("Height", 1);
        f1280e = enumC0424s2;
        f1281f = new EnumC0424s[]{enumC0424s, enumC0424s2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0424s valueOf(String str) {
        return (EnumC0424s) Enum.valueOf(EnumC0424s.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0424s[] values() {
        return (EnumC0424s[]) f1281f.clone();
    }
}
