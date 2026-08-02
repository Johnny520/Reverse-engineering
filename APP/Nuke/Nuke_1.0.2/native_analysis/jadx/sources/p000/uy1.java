package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uy1 {

    /* JADX INFO: renamed from: h */
    public static final uy1 f11555h;

    /* JADX INFO: renamed from: i */
    public static final uy1 f11556i;

    /* JADX INFO: renamed from: j */
    public static final uy1 f11557j;

    /* JADX INFO: renamed from: k */
    public static final uy1 f11558k;

    /* JADX INFO: renamed from: l */
    public static final uy1 f11559l;

    /* JADX INFO: renamed from: m */
    public static final uy1 f11560m;

    /* JADX INFO: renamed from: n */
    public static final uy1 f11561n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ uy1[] f11562o;

    static {
        uy1 uy1Var = new uy1("Invalid", 0);
        f11555h = uy1Var;
        uy1 uy1Var2 = new uy1("Cancelled", 1);
        f11556i = uy1Var2;
        uy1 uy1Var3 = new uy1("InitialPending", 2);
        f11557j = uy1Var3;
        uy1 uy1Var4 = new uy1("RecomposePending", 3);
        f11558k = uy1Var4;
        uy1 uy1Var5 = new uy1("Recomposing", 4);
        f11559l = uy1Var5;
        uy1 uy1Var6 = new uy1("ApplyPending", 5);
        f11560m = uy1Var6;
        uy1 uy1Var7 = new uy1("Applied", 6);
        f11561n = uy1Var7;
        f11562o = new uy1[]{uy1Var, uy1Var2, uy1Var3, uy1Var4, uy1Var5, uy1Var6, uy1Var7};
    }

    public static uy1 valueOf(String str) {
        return (uy1) Enum.valueOf(uy1.class, str);
    }

    public static uy1[] values() {
        return (uy1[]) f11562o.clone();
    }
}
