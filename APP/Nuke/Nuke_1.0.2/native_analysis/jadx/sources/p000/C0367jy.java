package p000;

import android.graphics.PathMeasure;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: jy */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0367jy extends w51 implements xm0 {

    /* JADX INFO: renamed from: j */
    public static final C0367jy f5258j;

    /* JADX INFO: renamed from: k */
    public static final C0367jy f5259k;

    /* JADX INFO: renamed from: l */
    public static final C0367jy f5260l;

    /* JADX INFO: renamed from: m */
    public static final C0367jy f5261m;

    /* JADX INFO: renamed from: n */
    public static final C0367jy f5262n;

    /* JADX INFO: renamed from: o */
    public static final C0367jy f5263o;

    /* JADX INFO: renamed from: p */
    public static final C0367jy f5264p;

    /* JADX INFO: renamed from: q */
    public static final C0367jy f5265q;

    /* JADX INFO: renamed from: r */
    public static final C0367jy f5266r;

    /* JADX INFO: renamed from: s */
    public static final C0367jy f5267s;

    /* JADX INFO: renamed from: t */
    public static final C0367jy f5268t;

    /* JADX INFO: renamed from: u */
    public static final C0367jy f5269u;

    /* JADX INFO: renamed from: v */
    public static final C0367jy f5270v;

    /* JADX INFO: renamed from: w */
    public static final C0367jy f5271w;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f5272i;

    static {
        int i = 0;
        f5258j = new C0367jy(i, 0);
        f5259k = new C0367jy(i, 1);
        f5260l = new C0367jy(i, 2);
        f5261m = new C0367jy(i, 3);
        f5262n = new C0367jy(i, 4);
        f5263o = new C0367jy(i, 5);
        f5264p = new C0367jy(i, 6);
        f5265q = new C0367jy(i, 7);
        f5266r = new C0367jy(i, 8);
        f5267s = new C0367jy(i, 9);
        f5268t = new C0367jy(i, 10);
        f5269u = new C0367jy(i, 11);
        f5270v = new C0367jy(i, 12);
        f5271w = new C0367jy(i, 13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0367jy(int i, int i2) {
        super(i);
        this.f5272i = i2;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f5272i) {
            case 0:
                return Boolean.FALSE;
            case 1:
            case 2:
                return null;
            case 3:
                AbstractC0441ly.m2987b("LocalTextToolbar");
                throw null;
            case 4:
                AbstractC0441ly.m2987b("LocalUriHandler");
                throw null;
            case 5:
                AbstractC0441ly.m2987b("LocalViewConfiguration");
                throw null;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                AbstractC0441ly.m2987b("LocalWindowInfo");
                throw null;
            case 7:
                return Boolean.TRUE;
            case 8:
                return Boolean.FALSE;
            case 9:
                return new r61(3);
            case 10:
                return new C0954z9(new PathMeasure());
            case 11:
            case 12:
                return null;
            default:
                return a83.f116a;
        }
    }
}
