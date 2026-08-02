package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n61 {

    /* JADX INFO: renamed from: h */
    public static final n61 f7018h;

    /* JADX INFO: renamed from: i */
    public static final n61 f7019i;

    /* JADX INFO: renamed from: j */
    public static final n61 f7020j;

    /* JADX INFO: renamed from: k */
    public static final n61 f7021k;

    /* JADX INFO: renamed from: l */
    public static final n61 f7022l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ n61[] f7023m;

    static {
        n61 n61Var = new n61("Measuring", 0);
        f7018h = n61Var;
        n61 n61Var2 = new n61("LookaheadMeasuring", 1);
        f7019i = n61Var2;
        n61 n61Var3 = new n61("LayingOut", 2);
        f7020j = n61Var3;
        n61 n61Var4 = new n61("LookaheadLayingOut", 3);
        f7021k = n61Var4;
        n61 n61Var5 = new n61("Idle", 4);
        f7022l = n61Var5;
        f7023m = new n61[]{n61Var, n61Var2, n61Var3, n61Var4, n61Var5};
    }

    public static n61 valueOf(String str) {
        return (n61) Enum.valueOf(n61.class, str);
    }

    public static n61[] values() {
        return (n61[]) f7023m.clone();
    }
}
