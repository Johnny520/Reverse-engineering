package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t80 {

    /* JADX INFO: renamed from: h */
    public static final t80 f10603h;

    /* JADX INFO: renamed from: i */
    public static final t80 f10604i;

    /* JADX INFO: renamed from: j */
    public static final t80 f10605j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ t80[] f10606k;

    static {
        t80 t80Var = new t80("Vertical", 0);
        f10603h = t80Var;
        t80 t80Var2 = new t80("Horizontal", 1);
        f10604i = t80Var2;
        t80 t80Var3 = new t80("Both", 2);
        f10605j = t80Var3;
        f10606k = new t80[]{t80Var, t80Var2, t80Var3};
    }

    public static t80 valueOf(String str) {
        return (t80) Enum.valueOf(t80.class, str);
    }

    public static t80[] values() {
        return (t80[]) f10606k.clone();
    }
}
