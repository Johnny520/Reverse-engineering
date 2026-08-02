package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uy1 {
    public static final uy1 h;
    public static final uy1 i;
    public static final uy1 j;
    public static final uy1 k;
    public static final uy1 l;
    public static final uy1 m;
    public static final uy1 n;
    public static final /* synthetic */ uy1[] o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        uy1 uy1Var = new uy1("Invalid", 0);
        h = uy1Var;
        uy1 uy1Var2 = new uy1("Cancelled", 1);
        i = uy1Var2;
        uy1 uy1Var3 = new uy1("InitialPending", 2);
        j = uy1Var3;
        uy1 uy1Var4 = new uy1("RecomposePending", 3);
        k = uy1Var4;
        uy1 uy1Var5 = new uy1("Recomposing", 4);
        l = uy1Var5;
        uy1 uy1Var6 = new uy1("ApplyPending", 5);
        m = uy1Var6;
        uy1 uy1Var7 = new uy1("Applied", 6);
        n = uy1Var7;
        o = new uy1[]{uy1Var, uy1Var2, uy1Var3, uy1Var4, uy1Var5, uy1Var6, uy1Var7};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static uy1 valueOf(String str) {
        return (uy1) Enum.valueOf(uy1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static uy1[] values() {
        return (uy1[]) o.clone();
    }
}
