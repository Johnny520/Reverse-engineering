package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class x50 {

    /* JADX INFO: renamed from: d */
    public static final x50 f7264d;

    /* JADX INFO: renamed from: e */
    public static final x50 f7265e;

    /* JADX INFO: renamed from: f */
    public static final x50 f7266f;

    /* JADX INFO: renamed from: g */
    public static final x50 f7267g;

    /* JADX INFO: renamed from: h */
    public static final x50 f7268h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ x50[] f7269i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        x50 x50Var = new x50("Measuring", 0);
        f7264d = x50Var;
        x50 x50Var2 = new x50("LookaheadMeasuring", 1);
        f7265e = x50Var2;
        x50 x50Var3 = new x50("LayingOut", 2);
        f7266f = x50Var3;
        x50 x50Var4 = new x50("LookaheadLayingOut", 3);
        f7267g = x50Var4;
        x50 x50Var5 = new x50("Idle", 4);
        f7268h = x50Var5;
        f7269i = new x50[]{x50Var, x50Var2, x50Var3, x50Var4, x50Var5};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static x50 valueOf(String str) {
        return (x50) Enum.valueOf(x50.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static x50[] values() {
        return (x50[]) f7269i.clone();
    }
}
