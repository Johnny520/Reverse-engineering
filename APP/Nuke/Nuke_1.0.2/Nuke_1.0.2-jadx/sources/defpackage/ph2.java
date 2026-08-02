package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ph2 {
    public static final ph2 h;
    public static final ph2 i;
    public static final ph2 j;
    public static final ph2 k;
    public static final /* synthetic */ ph2[] l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ph2 ph2Var = new ph2("DEBUG", 0);
        h = ph2Var;
        ph2 ph2Var2 = new ph2("INFO", 1);
        i = ph2Var2;
        ph2 ph2Var3 = new ph2("WARN", 2);
        j = ph2Var3;
        ph2 ph2Var4 = new ph2("ERROR", 3);
        k = ph2Var4;
        l = new ph2[]{ph2Var, ph2Var2, ph2Var3, ph2Var4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ph2 valueOf(String str) {
        return (ph2) Enum.valueOf(ph2.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ph2[] values() {
        return (ph2[]) l.clone();
    }
}
