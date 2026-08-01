package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class jt0 {

    /* JADX INFO: renamed from: d */
    public static final jt0 f2941d;

    /* JADX INFO: renamed from: e */
    public static final jt0 f2942e;

    /* JADX INFO: renamed from: f */
    public static final jt0 f2943f;

    /* JADX INFO: renamed from: g */
    public static final jt0 f2944g;

    /* JADX INFO: renamed from: h */
    public static final jt0 f2945h;

    /* JADX INFO: renamed from: i */
    public static final jt0 f2946i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ jt0[] f2947j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        jt0 jt0Var = new jt0("ShutDown", 0);
        f2941d = jt0Var;
        jt0 jt0Var2 = new jt0("ShuttingDown", 1);
        f2942e = jt0Var2;
        jt0 jt0Var3 = new jt0("Inactive", 2);
        f2943f = jt0Var3;
        jt0 jt0Var4 = new jt0("InactivePendingWork", 3);
        f2944g = jt0Var4;
        jt0 jt0Var5 = new jt0("Idle", 4);
        f2945h = jt0Var5;
        jt0 jt0Var6 = new jt0("PendingWork", 5);
        f2946i = jt0Var6;
        f2947j = new jt0[]{jt0Var, jt0Var2, jt0Var3, jt0Var4, jt0Var5, jt0Var6};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static jt0 valueOf(String str) {
        return (jt0) Enum.valueOf(jt0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static jt0[] values() {
        return (jt0[]) f2947j.clone();
    }
}
