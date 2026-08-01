package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class k50 {

    /* JADX INFO: renamed from: d */
    public static final k50 f3015d;

    /* JADX INFO: renamed from: e */
    public static final k50 f3016e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ k50[] f3017f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        k50 k50Var = new k50("Ltr", 0);
        f3015d = k50Var;
        k50 k50Var2 = new k50("Rtl", 1);
        f3016e = k50Var2;
        f3017f = new k50[]{k50Var, k50Var2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static k50 valueOf(String str) {
        return (k50) Enum.valueOf(k50.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static k50[] values() {
        return (k50[]) f3017f.clone();
    }
}
