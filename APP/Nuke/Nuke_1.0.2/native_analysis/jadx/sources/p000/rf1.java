package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rf1 {

    /* JADX INFO: renamed from: h */
    public static final rf1 f9541h;

    /* JADX INFO: renamed from: i */
    public static final rf1 f9542i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ rf1[] f9543j;

    static {
        rf1 rf1Var = new rf1("Min", 0);
        f9541h = rf1Var;
        rf1 rf1Var2 = new rf1("Max", 1);
        f9542i = rf1Var2;
        f9543j = new rf1[]{rf1Var, rf1Var2};
    }

    public static rf1 valueOf(String str) {
        return (rf1) Enum.valueOf(rf1.class, str);
    }

    public static rf1[] values() {
        return (rf1[]) f9543j.clone();
    }
}
