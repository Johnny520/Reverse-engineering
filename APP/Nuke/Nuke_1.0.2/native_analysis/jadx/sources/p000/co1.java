package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class co1 {

    /* JADX INFO: renamed from: h */
    public static final co1 f1637h;

    /* JADX INFO: renamed from: i */
    public static final co1 f1638i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ co1[] f1639j;

    static {
        co1 co1Var = new co1("Min", 0);
        f1637h = co1Var;
        co1 co1Var2 = new co1("Max", 1);
        f1638i = co1Var2;
        f1639j = new co1[]{co1Var, co1Var2};
    }

    public static co1 valueOf(String str) {
        return (co1) Enum.valueOf(co1.class, str);
    }

    public static co1[] values() {
        return (co1[]) f1639j.clone();
    }
}
