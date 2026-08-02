package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {
    public static final a1 h;
    public static final a1 i;
    public static final a1 j;
    public static final a1 k;
    public static final a1 l;
    public static final /* synthetic */ a1[] m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        a1 a1Var = new a1("INVALID_CONFIGURATION", 0);
        h = a1Var;
        a1 a1Var2 = new a1("NETWORK", 1);
        i = a1Var2;
        a1 a1Var3 = new a1("HTTP", 2);
        j = a1Var3;
        a1 a1Var4 = new a1("INVALID_RESPONSE", 3);
        k = a1Var4;
        a1 a1Var5 = new a1("EMPTY_RESPONSE", 4);
        l = a1Var5;
        m = new a1[]{a1Var, a1Var2, a1Var3, a1Var4, a1Var5};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static a1[] values() {
        return (a1[]) m.clone();
    }
}
