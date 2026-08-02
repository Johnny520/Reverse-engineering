package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xj2 {
    public static final xj2 h;
    public static final xj2 i;
    public static final xj2 j;
    public static final xj2 k;
    public static final /* synthetic */ xj2[] l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        xj2 xj2Var = new xj2("START", 0);
        h = xj2Var;
        xj2 xj2Var2 = new xj2("STOP", 1);
        i = xj2Var2;
        xj2 xj2Var3 = new xj2("RESTART", 2);
        j = xj2Var3;
        xj2 xj2Var4 = new xj2("STOP_ALL", 3);
        k = xj2Var4;
        l = new xj2[]{xj2Var, xj2Var2, xj2Var3, xj2Var4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static xj2 valueOf(String str) {
        return (xj2) Enum.valueOf(xj2.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static xj2[] values() {
        return (xj2[]) l.clone();
    }
}
