package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uf2 {
    public static final i51 i;
    public static final uf2 j;
    public static final uf2 k;
    public static final uf2 l;
    public static final uf2 m;
    public static final uf2 n;
    public static final /* synthetic */ uf2[] o;
    public static final /* synthetic */ yf0 p;
    public final String h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        uf2 uf2Var = new uf2(0, "BOOLEAN", "boolean");
        j = uf2Var;
        uf2 uf2Var2 = new uf2(1, "INTEGER", "integer");
        k = uf2Var2;
        uf2 uf2Var3 = new uf2(2, "NUMBER", "number");
        l = uf2Var3;
        uf2 uf2Var4 = new uf2(3, "STRING", "string");
        m = uf2Var4;
        uf2 uf2Var5 = new uf2(4, "ARRAY", "array");
        n = uf2Var5;
        uf2[] uf2VarArr = {uf2Var, uf2Var2, uf2Var3, uf2Var4, uf2Var5};
        o = uf2VarArr;
        p = new yf0(uf2VarArr);
        i = new i51(22);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public uf2(int i2, String str, String str2) {
        this.h = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static uf2 valueOf(String str) {
        return (uf2) Enum.valueOf(uf2.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static uf2[] values() {
        return (uf2[]) o.clone();
    }
}
