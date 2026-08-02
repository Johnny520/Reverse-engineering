package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o11 {

    /* JADX INFO: renamed from: h */
    public static final o11 f7417h;

    /* JADX INFO: renamed from: i */
    public static final o11 f7418i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ o11[] f7419j;

    static {
        o11 o11Var = new o11("Min", 0);
        f7417h = o11Var;
        o11 o11Var2 = new o11("Max", 1);
        f7418i = o11Var2;
        f7419j = new o11[]{o11Var, o11Var2};
    }

    public static o11 valueOf(String str) {
        return (o11) Enum.valueOf(o11.class, str);
    }

    public static o11[] values() {
        return (o11[]) f7419j.clone();
    }
}
