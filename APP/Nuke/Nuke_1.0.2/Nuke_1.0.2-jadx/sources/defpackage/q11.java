package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q11 {
    public static final q11 h;
    public static final q11 i;
    public static final /* synthetic */ q11[] j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        q11 q11Var = new q11("Width", 0);
        h = q11Var;
        q11 q11Var2 = new q11("Height", 1);
        i = q11Var2;
        j = new q11[]{q11Var, q11Var2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static q11 valueOf(String str) {
        return (q11) Enum.valueOf(q11.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static q11[] values() {
        return (q11[]) j.clone();
    }
}
