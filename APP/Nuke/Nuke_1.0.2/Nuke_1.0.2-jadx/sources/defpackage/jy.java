package defpackage;

import android.graphics.PathMeasure;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jy extends w51 implements xm0 {
    public static final jy j;
    public static final jy k;
    public static final jy l;
    public static final jy m;
    public static final jy n;
    public static final jy o;
    public static final jy p;
    public static final jy q;
    public static final jy r;
    public static final jy s;
    public static final jy t;
    public static final jy u;
    public static final jy v;
    public static final jy w;
    public final /* synthetic */ int i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 0;
        j = new jy(i, 0);
        k = new jy(i, 1);
        l = new jy(i, 2);
        m = new jy(i, 3);
        n = new jy(i, 4);
        o = new jy(i, 5);
        p = new jy(i, 6);
        q = new jy(i, 7);
        r = new jy(i, 8);
        s = new jy(i, 9);
        t = new jy(i, 10);
        u = new jy(i, 11);
        v = new jy(i, 12);
        w = new jy(i, 13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jy(int i, int i2) {
        super(i);
        this.i = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        switch (this.i) {
            case 0:
                return Boolean.FALSE;
            case 1:
            case 2:
                return null;
            case 3:
                ly.b("LocalTextToolbar");
                throw null;
            case 4:
                ly.b("LocalUriHandler");
                throw null;
            case 5:
                ly.b("LocalViewConfiguration");
                throw null;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                ly.b("LocalWindowInfo");
                throw null;
            case 7:
                return Boolean.TRUE;
            case 8:
                return Boolean.FALSE;
            case 9:
                return new r61(3);
            case 10:
                return new z9(new PathMeasure());
            case 11:
            case 12:
                return null;
            default:
                return a83.a;
        }
    }
}
