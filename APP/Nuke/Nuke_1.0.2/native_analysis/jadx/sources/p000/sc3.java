package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sc3 {

    /* JADX INFO: renamed from: h */
    public static final sc3 f10046h;

    /* JADX INFO: renamed from: i */
    public static final sc3 f10047i;

    /* JADX INFO: renamed from: j */
    public static final sc3 f10048j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ sc3[] f10049k;

    static {
        sc3 sc3Var = new sc3("FRIEND", 0);
        f10046h = sc3Var;
        sc3 sc3Var2 = new sc3("GROUP", 1);
        f10047i = sc3Var2;
        sc3 sc3Var3 = new sc3("OFFICIAL_ACCOUNT", 2);
        f10048j = sc3Var3;
        f10049k = new sc3[]{sc3Var, sc3Var2, sc3Var3};
    }

    public static sc3 valueOf(String str) {
        return (sc3) Enum.valueOf(sc3.class, str);
    }

    public static sc3[] values() {
        return (sc3[]) f10049k.clone();
    }
}
