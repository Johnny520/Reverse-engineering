package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class si2 {
    public static final si2 h;
    public static final si2 i;
    public static final si2 j;
    public static final si2 k;
    public static final si2 l;
    public static final si2 m;
    public static final si2 n;
    public static final si2 o;
    public static final /* synthetic */ si2[] p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        si2 si2Var = new si2("DISCOVER", 0);
        h = si2Var;
        si2 si2Var2 = new si2("READ", 1);
        i = si2Var2;
        si2 si2Var3 = new si2("VALIDATE", 2);
        j = si2Var3;
        si2 si2Var4 = new si2("RUNTIME_CREATE", 3);
        k = si2Var4;
        si2 si2Var5 = new si2("MODULE_REGISTER", 4);
        l = si2Var5;
        si2 si2Var6 = new si2("BOOTSTRAP", 5);
        m = si2Var6;
        si2 si2Var7 = new si2("EVALUATE", 6);
        si2 si2Var8 = new si2("EVENT_DISPATCH", 7);
        n = si2Var8;
        si2 si2Var9 = new si2("SHUTDOWN", 8);
        o = si2Var9;
        p = new si2[]{si2Var, si2Var2, si2Var3, si2Var4, si2Var5, si2Var6, si2Var7, si2Var8, si2Var9};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static si2 valueOf(String str) {
        return (si2) Enum.valueOf(si2.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static si2[] values() {
        return (si2[]) p.clone();
    }
}
