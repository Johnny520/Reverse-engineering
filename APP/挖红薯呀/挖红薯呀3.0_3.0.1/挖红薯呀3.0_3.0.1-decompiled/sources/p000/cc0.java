package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class cc0 {

    /* JADX INFO: renamed from: d */
    public static final cc0 f782d;

    /* JADX INFO: renamed from: e */
    public static final cc0 f783e;

    /* JADX INFO: renamed from: f */
    public static final cc0 f784f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ cc0[] f785g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        cc0 cc0Var = new cc0("IsPlacedInLookahead", 0);
        f782d = cc0Var;
        cc0 cc0Var2 = new cc0("IsPlacedInApproach", 1);
        f783e = cc0Var2;
        cc0 cc0Var3 = new cc0("IsNotPlaced", 2);
        f784f = cc0Var3;
        f785g = new cc0[]{cc0Var, cc0Var2, cc0Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static cc0 valueOf(String str) {
        return (cc0) Enum.valueOf(cc0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static cc0[] values() {
        return (cc0[]) f785g.clone();
    }
}
