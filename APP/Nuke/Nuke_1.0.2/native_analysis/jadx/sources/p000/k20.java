package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class k20 {

    /* JADX INFO: renamed from: h */
    public static final k20 f5323h;

    /* JADX INFO: renamed from: i */
    public static final k20 f5324i;

    /* JADX INFO: renamed from: j */
    public static final k20 f5325j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ k20[] f5326k;

    static {
        k20 k20Var = new k20("COROUTINE_SUSPENDED", 0);
        f5323h = k20Var;
        k20 k20Var2 = new k20("UNDECIDED", 1);
        f5324i = k20Var2;
        k20 k20Var3 = new k20("RESUMED", 2);
        f5325j = k20Var3;
        f5326k = new k20[]{k20Var, k20Var2, k20Var3};
    }

    public static k20 valueOf(String str) {
        return (k20) Enum.valueOf(k20.class, str);
    }

    public static k20[] values() {
        return (k20[]) f5326k.clone();
    }
}
