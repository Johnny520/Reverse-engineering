package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c92 {
    public static final c92 h;
    public static final c92 i;
    public static final /* synthetic */ c92[] j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        c92 c92Var = new c92("Ltr", 0);
        h = c92Var;
        c92 c92Var2 = new c92("Rtl", 1);
        i = c92Var2;
        j = new c92[]{c92Var, c92Var2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static c92 valueOf(String str) {
        return (c92) Enum.valueOf(c92.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static c92[] values() {
        return (c92[]) j.clone();
    }
}
