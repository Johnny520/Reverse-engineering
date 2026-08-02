package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u20 {
    public static final u20 h;
    public static final u20 i;
    public static final u20 j;
    public static final /* synthetic */ u20[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        u20 u20Var = new u20("CROSSED", 0);
        h = u20Var;
        u20 u20Var2 = new u20("NOT_CROSSED", 1);
        i = u20Var2;
        u20 u20Var3 = new u20("COLLAPSED", 2);
        j = u20Var3;
        k = new u20[]{u20Var, u20Var2, u20Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static u20 valueOf(String str) {
        return (u20) Enum.valueOf(u20.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static u20[] values() {
        return (u20[]) k.clone();
    }
}
