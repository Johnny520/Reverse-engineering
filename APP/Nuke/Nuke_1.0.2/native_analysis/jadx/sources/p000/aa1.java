package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class aa1 {

    /* JADX INFO: renamed from: h */
    public static final aa1 f119h;

    /* JADX INFO: renamed from: i */
    public static final aa1 f120i;

    /* JADX INFO: renamed from: j */
    public static final aa1 f121j;

    /* JADX INFO: renamed from: k */
    public static final aa1 f122k;

    /* JADX INFO: renamed from: l */
    public static final aa1 f123l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ aa1[] f124m;

    static {
        aa1 aa1Var = new aa1("DESTROYED", 0);
        f119h = aa1Var;
        aa1 aa1Var2 = new aa1("INITIALIZED", 1);
        f120i = aa1Var2;
        aa1 aa1Var3 = new aa1("CREATED", 2);
        f121j = aa1Var3;
        aa1 aa1Var4 = new aa1("STARTED", 3);
        f122k = aa1Var4;
        aa1 aa1Var5 = new aa1("RESUMED", 4);
        f123l = aa1Var5;
        f124m = new aa1[]{aa1Var, aa1Var2, aa1Var3, aa1Var4, aa1Var5};
    }

    public static aa1 valueOf(String str) {
        return (aa1) Enum.valueOf(aa1.class, str);
    }

    public static aa1[] values() {
        return (aa1[]) f124m.clone();
    }
}
