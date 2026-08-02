package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n61 {
    public static final n61 h;
    public static final n61 i;
    public static final n61 j;
    public static final n61 k;
    public static final n61 l;
    public static final /* synthetic */ n61[] m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        n61 n61Var = new n61("Measuring", 0);
        h = n61Var;
        n61 n61Var2 = new n61("LookaheadMeasuring", 1);
        i = n61Var2;
        n61 n61Var3 = new n61("LayingOut", 2);
        j = n61Var3;
        n61 n61Var4 = new n61("LookaheadLayingOut", 3);
        k = n61Var4;
        n61 n61Var5 = new n61("Idle", 4);
        l = n61Var5;
        m = new n61[]{n61Var, n61Var2, n61Var3, n61Var4, n61Var5};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static n61 valueOf(String str) {
        return (n61) Enum.valueOf(n61.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static n61[] values() {
        return (n61[]) m.clone();
    }
}
