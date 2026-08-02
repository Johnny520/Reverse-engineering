package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rk2 {

    /* JADX INFO: renamed from: h */
    public static final rk2 f9624h;

    /* JADX INFO: renamed from: i */
    public static final rk2 f9625i;

    /* JADX INFO: renamed from: j */
    public static final rk2 f9626j;

    /* JADX INFO: renamed from: k */
    public static final rk2 f9627k;

    /* JADX INFO: renamed from: l */
    public static final rk2 f9628l;

    /* JADX INFO: renamed from: m */
    public static final rk2 f9629m;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ rk2[] f9630n;

    static {
        rk2 rk2Var = new rk2("CREATED", 0);
        f9624h = rk2Var;
        rk2 rk2Var2 = new rk2("STARTING", 1);
        f9625i = rk2Var2;
        rk2 rk2Var3 = new rk2("RUNNING", 2);
        f9626j = rk2Var3;
        rk2 rk2Var4 = new rk2("STOPPING", 3);
        f9627k = rk2Var4;
        rk2 rk2Var5 = new rk2("STOPPED", 4);
        f9628l = rk2Var5;
        rk2 rk2Var6 = new rk2("FAILED", 5);
        f9629m = rk2Var6;
        f9630n = new rk2[]{rk2Var, rk2Var2, rk2Var3, rk2Var4, rk2Var5, rk2Var6};
    }

    public static rk2 valueOf(String str) {
        return (rk2) Enum.valueOf(rk2.class, str);
    }

    public static rk2[] values() {
        return (rk2[]) f9630n.clone();
    }
}
