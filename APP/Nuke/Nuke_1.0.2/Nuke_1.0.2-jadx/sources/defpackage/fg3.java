package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fg3 {
    public static final fg3 j;
    public static final fg3 k;
    public static final fg3 l;
    public static final fg3 m;
    public static final /* synthetic */ fg3[] n;
    public static final /* synthetic */ yf0 o;
    public final char h;
    public final char i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        fg3 fg3Var = new fg3("OBJ", 0, '{', '}');
        j = fg3Var;
        fg3 fg3Var2 = new fg3("LIST", 1, '[', ']');
        k = fg3Var2;
        fg3 fg3Var3 = new fg3("MAP", 2, '{', '}');
        l = fg3Var3;
        fg3 fg3Var4 = new fg3("POLY_OBJ", 3, '[', ']');
        m = fg3Var4;
        fg3[] fg3VarArr = {fg3Var, fg3Var2, fg3Var3, fg3Var4};
        n = fg3VarArr;
        o = new yf0(fg3VarArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public fg3(String str, int i, char c, char c2) {
        this.h = c;
        this.i = c2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static fg3 valueOf(String str) {
        return (fg3) Enum.valueOf(fg3.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static fg3[] values() {
        return (fg3[]) n.clone();
    }
}
