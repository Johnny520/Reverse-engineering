package p153e1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: e1.m */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2017m {

    /* JADX INFO: renamed from: d */
    public static final EnumC2017m f6742d;

    /* JADX INFO: renamed from: e */
    public static final EnumC2017m f6743e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC2017m[] f6744f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC2017m enumC2017m = new EnumC2017m("Ltr", 0);
        f6742d = enumC2017m;
        EnumC2017m enumC2017m2 = new EnumC2017m("Rtl", 1);
        f6743e = enumC2017m2;
        f6744f = new EnumC2017m[]{enumC2017m, enumC2017m2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC2017m valueOf(String str) {
        return (EnumC2017m) Enum.valueOf(EnumC2017m.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC2017m[] values() {
        return (EnumC2017m[]) f6744f.clone();
    }
}
