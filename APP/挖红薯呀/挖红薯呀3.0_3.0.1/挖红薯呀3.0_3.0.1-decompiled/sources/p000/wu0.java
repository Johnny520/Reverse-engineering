package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class wu0 {

    /* JADX INFO: renamed from: d */
    public static final wu0 f7190d;

    /* JADX INFO: renamed from: e */
    public static final wu0 f7191e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ wu0[] f7192f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        wu0 wu0Var = new wu0("Ltr", 0);
        f7190d = wu0Var;
        wu0 wu0Var2 = new wu0("Rtl", 1);
        f7191e = wu0Var2;
        f7192f = new wu0[]{wu0Var, wu0Var2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static wu0 valueOf(String str) {
        return (wu0) Enum.valueOf(wu0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static wu0[] values() {
        return (wu0[]) f7192f.clone();
    }
}
