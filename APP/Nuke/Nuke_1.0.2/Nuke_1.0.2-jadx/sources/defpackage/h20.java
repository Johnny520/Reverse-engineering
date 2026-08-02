package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h20 {
    public static final h20 h;
    public static final h20 i;
    public static final h20 j;
    public static final h20 k;
    public static final h20 l;
    public static final /* synthetic */ h20[] m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        h20 h20Var = new h20("CPU_ACQUIRED", 0);
        h = h20Var;
        h20 h20Var2 = new h20("BLOCKING", 1);
        i = h20Var2;
        h20 h20Var3 = new h20("PARKING", 2);
        j = h20Var3;
        h20 h20Var4 = new h20("DORMANT", 3);
        k = h20Var4;
        h20 h20Var5 = new h20("TERMINATED", 4);
        l = h20Var5;
        m = new h20[]{h20Var, h20Var2, h20Var3, h20Var4, h20Var5};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static h20 valueOf(String str) {
        return (h20) Enum.valueOf(h20.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static h20[] values() {
        return (h20[]) m.clone();
    }
}
