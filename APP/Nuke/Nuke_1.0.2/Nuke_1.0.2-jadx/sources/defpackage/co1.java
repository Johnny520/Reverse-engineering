package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class co1 {
    public static final co1 h;
    public static final co1 i;
    public static final /* synthetic */ co1[] j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        co1 co1Var = new co1("Min", 0);
        h = co1Var;
        co1 co1Var2 = new co1("Max", 1);
        i = co1Var2;
        j = new co1[]{co1Var, co1Var2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static co1 valueOf(String str) {
        return (co1) Enum.valueOf(co1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static co1[] values() {
        return (co1[]) j.clone();
    }
}
