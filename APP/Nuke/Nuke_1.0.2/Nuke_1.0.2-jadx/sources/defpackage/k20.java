package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class k20 {
    public static final k20 h;
    public static final k20 i;
    public static final k20 j;
    public static final /* synthetic */ k20[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        k20 k20Var = new k20("COROUTINE_SUSPENDED", 0);
        h = k20Var;
        k20 k20Var2 = new k20("UNDECIDED", 1);
        i = k20Var2;
        k20 k20Var3 = new k20("RESUMED", 2);
        j = k20Var3;
        k = new k20[]{k20Var, k20Var2, k20Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static k20 valueOf(String str) {
        return (k20) Enum.valueOf(k20.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static k20[] values() {
        return (k20[]) k.clone();
    }
}
