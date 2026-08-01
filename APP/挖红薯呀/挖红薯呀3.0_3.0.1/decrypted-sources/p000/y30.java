package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class y30 {

    /* JADX INFO: renamed from: d */
    public static final y30 f7506d;

    /* JADX INFO: renamed from: e */
    public static final y30 f7507e;

    /* JADX INFO: renamed from: f */
    public static final y30 f7508f;

    /* JADX INFO: renamed from: g */
    public static final y30 f7509g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ y30[] f7510h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        y30 y30Var = new y30("IGNORED", 0);
        f7506d = y30Var;
        y30 y30Var2 = new y30("SCHEDULED", 1);
        f7507e = y30Var2;
        y30 y30Var3 = new y30("DEFERRED", 2);
        f7508f = y30Var3;
        y30 y30Var4 = new y30("IMMINENT", 3);
        f7509g = y30Var4;
        f7510h = new y30[]{y30Var, y30Var2, y30Var3, y30Var4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static y30 valueOf(String str) {
        return (y30) Enum.valueOf(y30.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static y30[] values() {
        return (y30[]) f7510h.clone();
    }
}
