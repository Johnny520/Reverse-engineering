package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zt0 {

    /* JADX INFO: renamed from: h */
    public static final zt0 f14090h;

    /* JADX INFO: renamed from: i */
    public static final zt0 f14091i;

    /* JADX INFO: renamed from: j */
    public static final zt0 f14092j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ zt0[] f14093k;

    static {
        zt0 zt0Var = new zt0(hx0.NORMAL, 0);
        f14090h = zt0Var;
        zt0 zt0Var2 = new zt0("UNAVAILABLE", 1);
        f14091i = zt0Var2;
        zt0 zt0Var3 = new zt0("LOCKED", 2);
        f14092j = zt0Var3;
        f14093k = new zt0[]{zt0Var, zt0Var2, zt0Var3};
    }

    public static zt0 valueOf(String str) {
        return (zt0) Enum.valueOf(zt0.class, str);
    }

    public static zt0[] values() {
        return (zt0[]) f14093k.clone();
    }
}
