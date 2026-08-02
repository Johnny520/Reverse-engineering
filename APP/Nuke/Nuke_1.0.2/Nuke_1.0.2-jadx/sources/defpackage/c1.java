package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {
    public static final b1 Companion;
    public static final j71 h;
    public static final c1 i;
    public static final c1 j;
    public static final /* synthetic */ c1[] k;
    public static final /* synthetic */ yf0 l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        c1 c1Var = new c1("BLACKLIST", 0);
        i = c1Var;
        c1 c1Var2 = new c1("WHITELIST", 1);
        j = c1Var2;
        c1[] c1VarArr = {c1Var, c1Var2};
        k = c1VarArr;
        l = new yf0(c1VarArr);
        Companion = new b1();
        h = p7.B(i91.h, new c0(2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static c1 valueOf(String str) {
        return (c1) Enum.valueOf(c1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static c1[] values() {
        return (c1[]) k.clone();
    }
}
