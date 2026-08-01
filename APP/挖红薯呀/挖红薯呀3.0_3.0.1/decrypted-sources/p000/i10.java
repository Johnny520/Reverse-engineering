package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class i10 {

    /* JADX INFO: renamed from: d */
    public static final i10 f2391d;

    /* JADX INFO: renamed from: e */
    public static final i10 f2392e;

    /* JADX INFO: renamed from: f */
    public static final i10 f2393f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ i10[] f2394g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        i10 i10Var = new i10("Yes", 0);
        f2391d = i10Var;
        i10 i10Var2 = new i10("No", 1);
        f2392e = i10Var2;
        i10 i10Var3 = new i10("NotInitialized", 2);
        f2393f = i10Var3;
        f2394g = new i10[]{i10Var, i10Var2, i10Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static i10 valueOf(String str) {
        return (i10) Enum.valueOf(i10.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static i10[] values() {
        return (i10[]) f2394g.clone();
    }
}
