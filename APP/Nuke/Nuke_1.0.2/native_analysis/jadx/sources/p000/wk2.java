package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wk2 {

    /* JADX INFO: renamed from: h */
    public static final wk2 f12566h;

    /* JADX INFO: renamed from: i */
    public static final wk2 f12567i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ wk2[] f12568j;

    static {
        wk2 wk2Var = new wk2("SHORT", 0);
        f12566h = wk2Var;
        wk2 wk2Var2 = new wk2("LONG", 1);
        f12567i = wk2Var2;
        f12568j = new wk2[]{wk2Var, wk2Var2};
    }

    public static wk2 valueOf(String str) {
        return (wk2) Enum.valueOf(wk2.class, str);
    }

    public static wk2[] values() {
        return (wk2[]) f12568j.clone();
    }
}
