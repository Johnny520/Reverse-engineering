package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sf1 {
    public static final sf1 h;
    public static final sf1 i;
    public static final /* synthetic */ sf1[] j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        sf1 sf1Var = new sf1("Width", 0);
        h = sf1Var;
        sf1 sf1Var2 = new sf1("Height", 1);
        i = sf1Var2;
        j = new sf1[]{sf1Var, sf1Var2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static sf1 valueOf(String str) {
        return (sf1) Enum.valueOf(sf1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static sf1[] values() {
        return (sf1[]) j.clone();
    }
}
