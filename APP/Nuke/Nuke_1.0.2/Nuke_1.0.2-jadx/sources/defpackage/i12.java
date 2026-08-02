package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i12 {
    public static final i12 h;
    public static final i12 i;
    public static final i12 j;
    public static final /* synthetic */ i12[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        i12 i12Var = new i12("Initial", 0);
        h = i12Var;
        i12 i12Var2 = new i12("Main", 1);
        i = i12Var2;
        i12 i12Var3 = new i12("Final", 2);
        j = i12Var3;
        k = new i12[]{i12Var, i12Var2, i12Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static i12 valueOf(String str) {
        return (i12) Enum.valueOf(i12.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static i12[] values() {
        return (i12[]) k.clone();
    }
}
