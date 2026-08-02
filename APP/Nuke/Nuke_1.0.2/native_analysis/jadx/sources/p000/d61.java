package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d61 {

    /* JADX INFO: renamed from: h */
    public static final d61 f1885h;

    /* JADX INFO: renamed from: i */
    public static final d61 f1886i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ d61[] f1887j;

    static {
        d61 d61Var = new d61("Ltr", 0);
        f1885h = d61Var;
        d61 d61Var2 = new d61("Rtl", 1);
        f1886i = d61Var2;
        f1887j = new d61[]{d61Var, d61Var2};
    }

    public static d61 valueOf(String str) {
        return (d61) Enum.valueOf(d61.class, str);
    }

    public static d61[] values() {
        return (d61[]) f1887j.clone();
    }
}
