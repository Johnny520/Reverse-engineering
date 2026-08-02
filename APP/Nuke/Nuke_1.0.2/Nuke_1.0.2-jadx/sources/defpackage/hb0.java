package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hb0 {
    public static final hb0 h;
    public static final hb0 i;
    public static final hb0 j;
    public static final /* synthetic */ hb0[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        hb0 hb0Var = new hb0("Yes", 0);
        h = hb0Var;
        hb0 hb0Var2 = new hb0("No", 1);
        i = hb0Var2;
        hb0 hb0Var3 = new hb0("NotInitialized", 2);
        j = hb0Var3;
        k = new hb0[]{hb0Var, hb0Var2, hb0Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static hb0 valueOf(String str) {
        return (hb0) Enum.valueOf(hb0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static hb0[] values() {
        return (hb0[]) k.clone();
    }
}
