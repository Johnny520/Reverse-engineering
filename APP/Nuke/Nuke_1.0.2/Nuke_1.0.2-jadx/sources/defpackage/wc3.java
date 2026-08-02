package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wc3 {
    public static final wc3 h;
    public static final wc3 i;
    public static final wc3 j;
    public static final /* synthetic */ wc3[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        wc3 wc3Var = new wc3("DATABASE_RESOLUTION_FAILED", 0);
        h = wc3Var;
        wc3 wc3Var2 = new wc3("QUERY_FAILED", 1);
        i = wc3Var2;
        wc3 wc3Var3 = new wc3("CURSOR_READ_FAILED", 2);
        j = wc3Var3;
        k = new wc3[]{wc3Var, wc3Var2, wc3Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static wc3 valueOf(String str) {
        return (wc3) Enum.valueOf(wc3.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static wc3[] values() {
        return (wc3[]) k.clone();
    }
}
