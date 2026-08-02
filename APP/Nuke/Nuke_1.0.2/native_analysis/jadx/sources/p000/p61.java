package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class p61 {

    /* JADX INFO: renamed from: h */
    public static final p61 f7985h;

    /* JADX INFO: renamed from: i */
    public static final p61 f7986i;

    /* JADX INFO: renamed from: j */
    public static final p61 f7987j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ p61[] f7988k;

    static {
        p61 p61Var = new p61("InMeasureBlock", 0);
        f7985h = p61Var;
        p61 p61Var2 = new p61("InLayoutBlock", 1);
        f7986i = p61Var2;
        p61 p61Var3 = new p61("NotUsed", 2);
        f7987j = p61Var3;
        f7988k = new p61[]{p61Var, p61Var2, p61Var3};
    }

    public static p61 valueOf(String str) {
        return (p61) Enum.valueOf(p61.class, str);
    }

    public static p61[] values() {
        return (p61[]) f7988k.clone();
    }
}
