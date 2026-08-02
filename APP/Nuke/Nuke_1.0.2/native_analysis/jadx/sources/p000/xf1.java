package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xf1 {

    /* JADX INFO: renamed from: h */
    public static final xf1 f13006h;

    /* JADX INFO: renamed from: i */
    public static final xf1 f13007i;

    /* JADX INFO: renamed from: j */
    public static final xf1 f13008j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ xf1[] f13009k;

    static {
        xf1 xf1Var = new xf1("NO", 0);
        f13006h = xf1Var;
        xf1 xf1Var2 = new xf1("NOTICE", 1);
        f13007i = xf1Var2;
        xf1 xf1Var3 = new xf1("SILENT", 2);
        f13008j = xf1Var3;
        f13009k = new xf1[]{xf1Var, xf1Var2, xf1Var3};
    }

    public static xf1 valueOf(String str) {
        return (xf1) Enum.valueOf(xf1.class, str);
    }

    public static xf1[] values() {
        return (xf1[]) f13009k.clone();
    }
}
