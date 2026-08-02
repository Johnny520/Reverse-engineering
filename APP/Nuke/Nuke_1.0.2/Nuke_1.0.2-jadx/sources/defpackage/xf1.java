package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xf1 {
    public static final xf1 h;
    public static final xf1 i;
    public static final xf1 j;
    public static final /* synthetic */ xf1[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        xf1 xf1Var = new xf1("NO", 0);
        h = xf1Var;
        xf1 xf1Var2 = new xf1("NOTICE", 1);
        i = xf1Var2;
        xf1 xf1Var3 = new xf1("SILENT", 2);
        j = xf1Var3;
        k = new xf1[]{xf1Var, xf1Var2, xf1Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static xf1 valueOf(String str) {
        return (xf1) Enum.valueOf(xf1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static xf1[] values() {
        return (xf1[]) k.clone();
    }
}
