package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class a00 {

    /* JADX INFO: renamed from: h */
    public static final a00 f5h;

    /* JADX INFO: renamed from: i */
    public static final a00 f6i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ a00[] f7j;

    static {
        a00 a00Var = new a00("VIEW_APPEAR", 0);
        f5h = a00Var;
        a00 a00Var2 = new a00("VIEW_DISAPPEAR", 1);
        f6i = a00Var2;
        f7j = new a00[]{a00Var, a00Var2};
    }

    public static a00 valueOf(String str) {
        return (a00) Enum.valueOf(a00.class, str);
    }

    public static a00[] values() {
        return (a00[]) f7j.clone();
    }
}
