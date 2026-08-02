package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wf2 {
    public static final j51 i;
    public static final wf2 j;
    public static final wf2 k;
    public static final wf2 l;
    public static final wf2 m;
    public static final wf2 n;
    public static final wf2 o;
    public static final wf2 p;
    public static final wf2 q;
    public static final /* synthetic */ wf2[] r;
    public static final /* synthetic */ yf0 s;
    public final String h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        wf2 wf2Var = new wf2(0, "SWITCH", "switch");
        j = wf2Var;
        wf2 wf2Var2 = new wf2(1, "CHECKBOX", "checkbox");
        k = wf2Var2;
        wf2 wf2Var3 = new wf2(2, "TEXT", "text");
        l = wf2Var3;
        wf2 wf2Var4 = new wf2(3, "PASSWORD", "password");
        m = wf2Var4;
        wf2 wf2Var5 = new wf2(4, "TEXTAREA", "textarea");
        n = wf2Var5;
        wf2 wf2Var6 = new wf2(5, "SELECT", "select");
        o = wf2Var6;
        wf2 wf2Var7 = new wf2(6, "NUMBER", "number");
        p = wf2Var7;
        wf2 wf2Var8 = new wf2(7, "LIST", "list");
        q = wf2Var8;
        wf2[] wf2VarArr = {wf2Var, wf2Var2, wf2Var3, wf2Var4, wf2Var5, wf2Var6, wf2Var7, wf2Var8};
        r = wf2VarArr;
        s = new yf0(wf2VarArr);
        i = new j51(22);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wf2(int i2, String str, String str2) {
        this.h = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static wf2 valueOf(String str) {
        return (wf2) Enum.valueOf(wf2.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static wf2[] values() {
        return (wf2[]) r.clone();
    }
}
