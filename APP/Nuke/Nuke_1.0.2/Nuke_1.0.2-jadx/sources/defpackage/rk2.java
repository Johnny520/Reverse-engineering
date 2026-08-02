package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rk2 {
    public static final rk2 h;
    public static final rk2 i;
    public static final rk2 j;
    public static final rk2 k;
    public static final rk2 l;
    public static final rk2 m;
    public static final /* synthetic */ rk2[] n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        rk2 rk2Var = new rk2("CREATED", 0);
        h = rk2Var;
        rk2 rk2Var2 = new rk2("STARTING", 1);
        i = rk2Var2;
        rk2 rk2Var3 = new rk2("RUNNING", 2);
        j = rk2Var3;
        rk2 rk2Var4 = new rk2("STOPPING", 3);
        k = rk2Var4;
        rk2 rk2Var5 = new rk2("STOPPED", 4);
        l = rk2Var5;
        rk2 rk2Var6 = new rk2("FAILED", 5);
        m = rk2Var6;
        n = new rk2[]{rk2Var, rk2Var2, rk2Var3, rk2Var4, rk2Var5, rk2Var6};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static rk2 valueOf(String str) {
        return (rk2) Enum.valueOf(rk2.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static rk2[] values() {
        return (rk2[]) n.clone();
    }
}
