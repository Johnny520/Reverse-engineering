package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vu0 {

    /* JADX INFO: renamed from: h */
    public static final vu0 f12173h;

    /* JADX INFO: renamed from: i */
    public static final vu0 f12174i;

    /* JADX INFO: renamed from: j */
    public static final vu0 f12175j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ vu0[] f12176k;

    static {
        vu0 vu0Var = new vu0("MOBILE_QQ", 0);
        f12173h = vu0Var;
        vu0 vu0Var2 = new vu0(z02.WECHAT, 1);
        f12174i = vu0Var2;
        vu0 vu0Var3 = new vu0(z02.TIKTOK, 2);
        f12175j = vu0Var3;
        f12176k = new vu0[]{vu0Var, vu0Var2, vu0Var3};
    }

    public static vu0 valueOf(String str) {
        return (vu0) Enum.valueOf(vu0.class, str);
    }

    public static vu0[] values() {
        return (vu0[]) f12176k.clone();
    }
}
