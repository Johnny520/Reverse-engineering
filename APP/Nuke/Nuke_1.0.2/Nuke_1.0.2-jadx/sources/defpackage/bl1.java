package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bl1 {
    public static final bl1 h;
    public static final bl1 i;
    public static final /* synthetic */ bl1[] j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        bl1 bl1Var = new bl1("Default", 0);
        h = bl1Var;
        bl1 bl1Var2 = new bl1("UserInput", 1);
        i = bl1Var2;
        j = new bl1[]{bl1Var, bl1Var2, new bl1("PreventUserInput", 2)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static bl1 valueOf(String str) {
        return (bl1) Enum.valueOf(bl1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static bl1[] values() {
        return (bl1[]) j.clone();
    }
}
