package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t12 {

    /* JADX INFO: renamed from: h */
    public static final t12 f10489h;

    /* JADX INFO: renamed from: i */
    public static final t12 f10490i;

    /* JADX INFO: renamed from: j */
    public static final t12 f10491j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ t12[] f10492k;

    static {
        t12 t12Var = new t12("Unknown", 0);
        f10489h = t12Var;
        t12 t12Var2 = new t12("Dispatching", 1);
        f10490i = t12Var2;
        t12 t12Var3 = new t12("NotDispatching", 2);
        f10491j = t12Var3;
        f10492k = new t12[]{t12Var, t12Var2, t12Var3};
    }

    public static t12 valueOf(String str) {
        return (t12) Enum.valueOf(t12.class, str);
    }

    public static t12[] values() {
        return (t12[]) f10492k.clone();
    }
}
