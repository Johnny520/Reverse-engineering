package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d61 {
    public static final d61 h;
    public static final d61 i;
    public static final /* synthetic */ d61[] j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        d61 d61Var = new d61("Ltr", 0);
        h = d61Var;
        d61 d61Var2 = new d61("Rtl", 1);
        i = d61Var2;
        j = new d61[]{d61Var, d61Var2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static d61 valueOf(String str) {
        return (d61) Enum.valueOf(d61.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static d61[] values() {
        return (d61[]) j.clone();
    }
}
