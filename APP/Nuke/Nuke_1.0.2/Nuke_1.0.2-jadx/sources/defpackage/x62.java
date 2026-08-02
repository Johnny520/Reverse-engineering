package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x62 {
    public static final j51 h;
    public static final x62 i;
    public static final x62 j;
    public static final /* synthetic */ x62[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        x62 x62Var = new x62("FOLLOW", 0);
        i = x62Var;
        x62 x62Var2 = new x62("ERROR", 1);
        j = x62Var2;
        k = new x62[]{x62Var, x62Var2};
        h = new j51(16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static x62 valueOf(String str) {
        return (x62) Enum.valueOf(x62.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static x62[] values() {
        return (x62[]) k.clone();
    }
}
