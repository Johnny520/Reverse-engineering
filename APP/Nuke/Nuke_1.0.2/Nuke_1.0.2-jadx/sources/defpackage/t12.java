package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t12 {
    public static final t12 h;
    public static final t12 i;
    public static final t12 j;
    public static final /* synthetic */ t12[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        t12 t12Var = new t12("Unknown", 0);
        h = t12Var;
        t12 t12Var2 = new t12("Dispatching", 1);
        i = t12Var2;
        t12 t12Var3 = new t12("NotDispatching", 2);
        j = t12Var3;
        k = new t12[]{t12Var, t12Var2, t12Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static t12 valueOf(String str) {
        return (t12) Enum.valueOf(t12.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static t12[] values() {
        return (t12[]) k.clone();
    }
}
