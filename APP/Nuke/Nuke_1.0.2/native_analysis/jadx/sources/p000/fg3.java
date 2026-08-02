package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fg3 {

    /* JADX INFO: renamed from: j */
    public static final fg3 f2990j;

    /* JADX INFO: renamed from: k */
    public static final fg3 f2991k;

    /* JADX INFO: renamed from: l */
    public static final fg3 f2992l;

    /* JADX INFO: renamed from: m */
    public static final fg3 f2993m;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ fg3[] f2994n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ yf0 f2995o;

    /* JADX INFO: renamed from: h */
    public final char f2996h;

    /* JADX INFO: renamed from: i */
    public final char f2997i;

    static {
        fg3 fg3Var = new fg3("OBJ", 0, '{', '}');
        f2990j = fg3Var;
        fg3 fg3Var2 = new fg3("LIST", 1, '[', ']');
        f2991k = fg3Var2;
        fg3 fg3Var3 = new fg3("MAP", 2, '{', '}');
        f2992l = fg3Var3;
        fg3 fg3Var4 = new fg3("POLY_OBJ", 3, '[', ']');
        f2993m = fg3Var4;
        fg3[] fg3VarArr = {fg3Var, fg3Var2, fg3Var3, fg3Var4};
        f2994n = fg3VarArr;
        f2995o = new yf0(fg3VarArr);
    }

    public fg3(String str, int i, char c, char c2) {
        this.f2996h = c;
        this.f2997i = c2;
    }

    public static fg3 valueOf(String str) {
        return (fg3) Enum.valueOf(fg3.class, str);
    }

    public static fg3[] values() {
        return (fg3[]) f2994n.clone();
    }
}
