package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class p03 {

    /* JADX INFO: renamed from: h */
    public static final p03 f7915h;

    /* JADX INFO: renamed from: i */
    public static final p03 f7916i;

    /* JADX INFO: renamed from: j */
    public static final p03 f7917j;

    /* JADX INFO: renamed from: k */
    public static final p03 f7918k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ p03[] f7919l;

    static {
        p03 p03Var = new p03("StartInput", 0);
        f7915h = p03Var;
        p03 p03Var2 = new p03("StopInput", 1);
        f7916i = p03Var2;
        p03 p03Var3 = new p03("ShowKeyboard", 2);
        f7917j = p03Var3;
        p03 p03Var4 = new p03("HideKeyboard", 3);
        f7918k = p03Var4;
        f7919l = new p03[]{p03Var, p03Var2, p03Var3, p03Var4};
    }

    public static p03 valueOf(String str) {
        return (p03) Enum.valueOf(p03.class, str);
    }

    public static p03[] values() {
        return (p03[]) f7919l.clone();
    }
}
