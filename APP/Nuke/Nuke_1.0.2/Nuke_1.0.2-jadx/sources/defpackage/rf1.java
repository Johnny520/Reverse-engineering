package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rf1 {
    public static final rf1 h;
    public static final rf1 i;
    public static final /* synthetic */ rf1[] j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        rf1 rf1Var = new rf1("Min", 0);
        h = rf1Var;
        rf1 rf1Var2 = new rf1("Max", 1);
        i = rf1Var2;
        j = new rf1[]{rf1Var, rf1Var2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static rf1 valueOf(String str) {
        return (rf1) Enum.valueOf(rf1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static rf1[] values() {
        return (rf1[]) j.clone();
    }
}
