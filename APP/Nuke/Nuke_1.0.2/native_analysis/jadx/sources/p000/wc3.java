package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wc3 {

    /* JADX INFO: renamed from: h */
    public static final wc3 f12460h;

    /* JADX INFO: renamed from: i */
    public static final wc3 f12461i;

    /* JADX INFO: renamed from: j */
    public static final wc3 f12462j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ wc3[] f12463k;

    static {
        wc3 wc3Var = new wc3("DATABASE_RESOLUTION_FAILED", 0);
        f12460h = wc3Var;
        wc3 wc3Var2 = new wc3("QUERY_FAILED", 1);
        f12461i = wc3Var2;
        wc3 wc3Var3 = new wc3("CURSOR_READ_FAILED", 2);
        f12462j = wc3Var3;
        f12463k = new wc3[]{wc3Var, wc3Var2, wc3Var3};
    }

    public static wc3 valueOf(String str) {
        return (wc3) Enum.valueOf(wc3.class, str);
    }

    public static wc3[] values() {
        return (wc3[]) f12463k.clone();
    }
}
