package defpackage;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vn extends gx2 {
    public static final vn d = new vn(false);
    public static final int e = R.string.bypass_teen_mode;
    public static final int f = R.string.bypass_teen_mode_desc;
    public static final wm0 g = wm0.n;
    public static final String h = "BypassTeenMode";
    public static final boolean i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String str = up0.m;
        if (str != null) {
            i = wv2.d0(str, "com.tencent.mm:appbrand", false);
        } else {
            t11.S("hostProcess");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final boolean f() {
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void g() {
        String[] strArr = {"com.tencent.xweb.pinus.PSWebview", "com.tencent.xweb.pinus.sdk.WebView", "com.tencent.xweb.WebView"};
        for (int i2 = 0; i2 < 3; i2++) {
            String str = strArr[i2];
            vn vnVar = d;
            try {
                sg1 sg1VarV = op0.y(up0.H(str)).v();
                sg1VarV.b = "loadUrl";
                sg1VarV.b();
                Method method = ((zg1) du.o0(sg1VarV.c())).j;
                method.getClass();
                XposedBridge.hookMethod(method, new kg3(vnVar, new w(26), null)).getClass();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final Integer k() {
        return Integer.valueOf(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final int m() {
        return e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final wm0 n() {
        return g;
    }
}
