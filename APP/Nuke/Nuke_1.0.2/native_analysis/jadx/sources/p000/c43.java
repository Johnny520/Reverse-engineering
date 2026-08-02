package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c43 {

    /* JADX INFO: renamed from: h */
    public static final c43 f1146h;

    /* JADX INFO: renamed from: i */
    public static final c43 f1147i;

    /* JADX INFO: renamed from: j */
    public static final c43 f1148j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ c43[] f1149k;

    static {
        c43 c43Var = new c43("ContinueTraversal", 0);
        f1146h = c43Var;
        c43 c43Var2 = new c43("SkipSubtreeAndContinueTraversal", 1);
        f1147i = c43Var2;
        c43 c43Var3 = new c43("CancelTraversal", 2);
        f1148j = c43Var3;
        f1149k = new c43[]{c43Var, c43Var2, c43Var3};
    }

    public static c43 valueOf(String str) {
        return (c43) Enum.valueOf(c43.class, str);
    }

    public static c43[] values() {
        return (c43[]) f1149k.clone();
    }
}
