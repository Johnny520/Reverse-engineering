package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class p81 {

    /* JADX INFO: renamed from: d */
    public static final p81 f4779d;

    /* JADX INFO: renamed from: e */
    public static final p81 f4780e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ p81[] f4781f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        p81 p81Var = new p81("On", 0);
        f4779d = p81Var;
        p81 p81Var2 = new p81("Off", 1);
        f4780e = p81Var2;
        f4781f = new p81[]{p81Var, p81Var2, new p81("Indeterminate", 2)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static p81 valueOf(String str) {
        return (p81) Enum.valueOf(p81.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static p81[] values() {
        return (p81[]) f4781f.clone();
    }
}
