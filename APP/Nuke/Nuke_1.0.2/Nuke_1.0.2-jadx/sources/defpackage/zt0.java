package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zt0 {
    public static final zt0 h;
    public static final zt0 i;
    public static final zt0 j;
    public static final /* synthetic */ zt0[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        zt0 zt0Var = new zt0(hx0.NORMAL, 0);
        h = zt0Var;
        zt0 zt0Var2 = new zt0("UNAVAILABLE", 1);
        i = zt0Var2;
        zt0 zt0Var3 = new zt0("LOCKED", 2);
        j = zt0Var3;
        k = new zt0[]{zt0Var, zt0Var2, zt0Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static zt0 valueOf(String str) {
        return (zt0) Enum.valueOf(zt0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static zt0[] values() {
        return (zt0[]) k.clone();
    }
}
