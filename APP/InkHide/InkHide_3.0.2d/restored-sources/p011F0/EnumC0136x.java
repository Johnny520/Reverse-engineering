package p011F0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: F0.x */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0136x {

    /* JADX INFO: renamed from: a */
    public static final EnumC0136x f429a;

    /* JADX INFO: renamed from: b */
    public static final EnumC0136x f430b;

    /* JADX INFO: renamed from: c */
    public static final EnumC0136x f431c;

    /* JADX INFO: renamed from: d */
    public static final EnumC0136x f432d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ EnumC0136x[] f433e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0136x enumC0136x = new EnumC0136x("Ready", 0);
        f429a = enumC0136x;
        EnumC0136x enumC0136x2 = new EnumC0136x("NotReady", 1);
        f430b = enumC0136x2;
        EnumC0136x enumC0136x3 = new EnumC0136x("Done", 2);
        f431c = enumC0136x3;
        EnumC0136x enumC0136x4 = new EnumC0136x("Failed", 3);
        f432d = enumC0136x4;
        f433e = new EnumC0136x[]{enumC0136x, enumC0136x2, enumC0136x3, enumC0136x4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0136x valueOf(String str) {
        return (EnumC0136x) Enum.valueOf(EnumC0136x.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0136x[] values() {
        return (EnumC0136x[]) f433e.clone();
    }
}
