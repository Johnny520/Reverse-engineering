package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n11 {
    public static final n11 h;
    public static final n11 i;
    public static final /* synthetic */ n11[] j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        n11 n11Var = new n11("Min", 0);
        h = n11Var;
        n11 n11Var2 = new n11("Max", 1);
        i = n11Var2;
        j = new n11[]{n11Var, n11Var2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static n11 valueOf(String str) {
        return (n11) Enum.valueOf(n11.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static n11[] values() {
        return (n11[]) j.clone();
    }
}
