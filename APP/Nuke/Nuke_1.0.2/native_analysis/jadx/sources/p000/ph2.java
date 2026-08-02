package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ph2 {

    /* JADX INFO: renamed from: h */
    public static final ph2 f8351h;

    /* JADX INFO: renamed from: i */
    public static final ph2 f8352i;

    /* JADX INFO: renamed from: j */
    public static final ph2 f8353j;

    /* JADX INFO: renamed from: k */
    public static final ph2 f8354k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ ph2[] f8355l;

    static {
        ph2 ph2Var = new ph2("DEBUG", 0);
        f8351h = ph2Var;
        ph2 ph2Var2 = new ph2("INFO", 1);
        f8352i = ph2Var2;
        ph2 ph2Var3 = new ph2("WARN", 2);
        f8353j = ph2Var3;
        ph2 ph2Var4 = new ph2("ERROR", 3);
        f8354k = ph2Var4;
        f8355l = new ph2[]{ph2Var, ph2Var2, ph2Var3, ph2Var4};
    }

    public static ph2 valueOf(String str) {
        return (ph2) Enum.valueOf(ph2.class, str);
    }

    public static ph2[] values() {
        return (ph2[]) f8355l.clone();
    }
}
