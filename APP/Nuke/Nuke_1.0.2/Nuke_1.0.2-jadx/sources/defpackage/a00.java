package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class a00 {
    public static final a00 h;
    public static final a00 i;
    public static final /* synthetic */ a00[] j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        a00 a00Var = new a00("VIEW_APPEAR", 0);
        h = a00Var;
        a00 a00Var2 = new a00("VIEW_DISAPPEAR", 1);
        i = a00Var2;
        j = new a00[]{a00Var, a00Var2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static a00 valueOf(String str) {
        return (a00) Enum.valueOf(a00.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static a00[] values() {
        return (a00[]) j.clone();
    }
}
