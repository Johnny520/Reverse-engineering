package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u20 {

    /* JADX INFO: renamed from: h */
    public static final u20 f11067h;

    /* JADX INFO: renamed from: i */
    public static final u20 f11068i;

    /* JADX INFO: renamed from: j */
    public static final u20 f11069j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ u20[] f11070k;

    static {
        u20 u20Var = new u20("CROSSED", 0);
        f11067h = u20Var;
        u20 u20Var2 = new u20("NOT_CROSSED", 1);
        f11068i = u20Var2;
        u20 u20Var3 = new u20("COLLAPSED", 2);
        f11069j = u20Var3;
        f11070k = new u20[]{u20Var, u20Var2, u20Var3};
    }

    public static u20 valueOf(String str) {
        return (u20) Enum.valueOf(u20.class, str);
    }

    public static u20[] values() {
        return (u20[]) f11070k.clone();
    }
}
