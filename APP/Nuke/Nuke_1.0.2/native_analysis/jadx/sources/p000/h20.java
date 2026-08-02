package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h20 {

    /* JADX INFO: renamed from: h */
    public static final h20 f3788h;

    /* JADX INFO: renamed from: i */
    public static final h20 f3789i;

    /* JADX INFO: renamed from: j */
    public static final h20 f3790j;

    /* JADX INFO: renamed from: k */
    public static final h20 f3791k;

    /* JADX INFO: renamed from: l */
    public static final h20 f3792l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ h20[] f3793m;

    static {
        h20 h20Var = new h20("CPU_ACQUIRED", 0);
        f3788h = h20Var;
        h20 h20Var2 = new h20("BLOCKING", 1);
        f3789i = h20Var2;
        h20 h20Var3 = new h20("PARKING", 2);
        f3790j = h20Var3;
        h20 h20Var4 = new h20("DORMANT", 3);
        f3791k = h20Var4;
        h20 h20Var5 = new h20("TERMINATED", 4);
        f3792l = h20Var5;
        f3793m = new h20[]{h20Var, h20Var2, h20Var3, h20Var4, h20Var5};
    }

    public static h20 valueOf(String str) {
        return (h20) Enum.valueOf(h20.class, str);
    }

    public static h20[] values() {
        return (h20[]) f3793m.clone();
    }
}
