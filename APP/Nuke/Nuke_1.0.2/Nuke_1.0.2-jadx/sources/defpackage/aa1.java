package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class aa1 {
    public static final aa1 h;
    public static final aa1 i;
    public static final aa1 j;
    public static final aa1 k;
    public static final aa1 l;
    public static final /* synthetic */ aa1[] m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        aa1 aa1Var = new aa1("DESTROYED", 0);
        h = aa1Var;
        aa1 aa1Var2 = new aa1("INITIALIZED", 1);
        i = aa1Var2;
        aa1 aa1Var3 = new aa1("CREATED", 2);
        j = aa1Var3;
        aa1 aa1Var4 = new aa1("STARTED", 3);
        k = aa1Var4;
        aa1 aa1Var5 = new aa1("RESUMED", 4);
        l = aa1Var5;
        m = new aa1[]{aa1Var, aa1Var2, aa1Var3, aa1Var4, aa1Var5};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static aa1 valueOf(String str) {
        return (aa1) Enum.valueOf(aa1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static aa1[] values() {
        return (aa1[]) m.clone();
    }
}
