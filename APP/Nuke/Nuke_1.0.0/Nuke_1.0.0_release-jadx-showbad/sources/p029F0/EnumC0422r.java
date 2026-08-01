package p029F0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: F0.r */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0422r {

    /* JADX INFO: renamed from: d */
    public static final EnumC0422r f1266d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0422r f1267e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC0422r[] f1268f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0422r enumC0422r = new EnumC0422r("Min", 0);
        f1266d = enumC0422r;
        EnumC0422r enumC0422r2 = new EnumC0422r("Max", 1);
        f1267e = enumC0422r2;
        f1268f = new EnumC0422r[]{enumC0422r, enumC0422r2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0422r valueOf(String str) {
        return (EnumC0422r) Enum.valueOf(EnumC0422r.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0422r[] values() {
        return (EnumC0422r[]) f1268f.clone();
    }
}
