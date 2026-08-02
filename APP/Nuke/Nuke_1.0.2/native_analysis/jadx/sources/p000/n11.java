package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n11 {

    /* JADX INFO: renamed from: h */
    public static final n11 f6965h;

    /* JADX INFO: renamed from: i */
    public static final n11 f6966i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ n11[] f6967j;

    static {
        n11 n11Var = new n11("Min", 0);
        f6965h = n11Var;
        n11 n11Var2 = new n11("Max", 1);
        f6966i = n11Var2;
        f6967j = new n11[]{n11Var, n11Var2};
    }

    public static n11 valueOf(String str) {
        return (n11) Enum.valueOf(n11.class, str);
    }

    public static n11[] values() {
        return (n11[]) f6967j.clone();
    }
}
