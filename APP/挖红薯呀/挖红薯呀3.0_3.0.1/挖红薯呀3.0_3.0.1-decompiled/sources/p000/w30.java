package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class w30 {

    /* JADX INFO: renamed from: d */
    public static final w30 f6993d;

    /* JADX INFO: renamed from: e */
    public static final w30 f6994e;

    /* JADX INFO: renamed from: f */
    public static final w30 f6995f;

    /* JADX INFO: renamed from: g */
    public static final w30 f6996g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ w30[] f6997h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        w30 w30Var = new w30("LookaheadMeasurement", 0);
        f6993d = w30Var;
        w30 w30Var2 = new w30("LookaheadPlacement", 1);
        f6994e = w30Var2;
        w30 w30Var3 = new w30("Measurement", 2);
        f6995f = w30Var3;
        w30 w30Var4 = new w30("Placement", 3);
        f6996g = w30Var4;
        f6997h = new w30[]{w30Var, w30Var2, w30Var3, w30Var4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static w30 valueOf(String str) {
        return (w30) Enum.valueOf(w30.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static w30[] values() {
        return (w30[]) f6997h.clone();
    }
}
