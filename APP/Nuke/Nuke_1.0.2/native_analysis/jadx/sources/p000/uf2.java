package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uf2 {

    /* JADX INFO: renamed from: i */
    public static final i51 f11269i;

    /* JADX INFO: renamed from: j */
    public static final uf2 f11270j;

    /* JADX INFO: renamed from: k */
    public static final uf2 f11271k;

    /* JADX INFO: renamed from: l */
    public static final uf2 f11272l;

    /* JADX INFO: renamed from: m */
    public static final uf2 f11273m;

    /* JADX INFO: renamed from: n */
    public static final uf2 f11274n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ uf2[] f11275o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ yf0 f11276p;

    /* JADX INFO: renamed from: h */
    public final String f11277h;

    static {
        uf2 uf2Var = new uf2(0, "BOOLEAN", "boolean");
        f11270j = uf2Var;
        uf2 uf2Var2 = new uf2(1, "INTEGER", "integer");
        f11271k = uf2Var2;
        uf2 uf2Var3 = new uf2(2, "NUMBER", "number");
        f11272l = uf2Var3;
        uf2 uf2Var4 = new uf2(3, "STRING", "string");
        f11273m = uf2Var4;
        uf2 uf2Var5 = new uf2(4, "ARRAY", "array");
        f11274n = uf2Var5;
        uf2[] uf2VarArr = {uf2Var, uf2Var2, uf2Var3, uf2Var4, uf2Var5};
        f11275o = uf2VarArr;
        f11276p = new yf0(uf2VarArr);
        f11269i = new i51(22);
    }

    public uf2(int i, String str, String str2) {
        this.f11277h = str2;
    }

    public static uf2 valueOf(String str) {
        return (uf2) Enum.valueOf(uf2.class, str);
    }

    public static uf2[] values() {
        return (uf2[]) f11275o.clone();
    }
}
