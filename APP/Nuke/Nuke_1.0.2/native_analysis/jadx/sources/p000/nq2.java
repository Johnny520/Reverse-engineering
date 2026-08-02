package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nq2 {

    /* JADX INFO: renamed from: h */
    public static final nq2 f7284h;

    /* JADX INFO: renamed from: i */
    public static final nq2 f7285i;

    /* JADX INFO: renamed from: j */
    public static final nq2 f7286j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ nq2[] f7287k;

    static {
        nq2 nq2Var = new nq2("START", 0);
        f7284h = nq2Var;
        nq2 nq2Var2 = new nq2("STOP", 1);
        f7285i = nq2Var2;
        nq2 nq2Var3 = new nq2("STOP_AND_RESET_REPLAY_CACHE", 2);
        f7286j = nq2Var3;
        f7287k = new nq2[]{nq2Var, nq2Var2, nq2Var3};
    }

    public static nq2 valueOf(String str) {
        return (nq2) Enum.valueOf(nq2.class, str);
    }

    public static nq2[] values() {
        return (nq2[]) f7287k.clone();
    }
}
