package p000;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: vn */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0816vn extends gx2 {

    /* JADX INFO: renamed from: d */
    public static final C0816vn f12024d = new C0816vn(false);

    /* JADX INFO: renamed from: e */
    public static final int f12025e = R.string.bypass_teen_mode;

    /* JADX INFO: renamed from: f */
    public static final int f12026f = R.string.bypass_teen_mode_desc;

    /* JADX INFO: renamed from: g */
    public static final wm0 f12027g = wm0.f12580n;

    /* JADX INFO: renamed from: h */
    public static final String f12028h = "BypassTeenMode";

    /* JADX INFO: renamed from: i */
    public static final boolean f12029i;

    static {
        String str = up0.f11405m;
        if (str != null) {
            f12029i = wv2.m6012d0(str, "com.tencent.mm:appbrand", false);
        } else {
            t11.m5067S("hostProcess");
            throw null;
        }
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f12028h;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: f */
    public final boolean mo5706f() {
        return f12029i;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: g */
    public final void mo140g() {
        String[] strArr = {"com.tencent.xweb.pinus.PSWebview", "com.tencent.xweb.pinus.sdk.WebView", "com.tencent.xweb.WebView"};
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            C0816vn c0816vn = f12024d;
            try {
                sg1 sg1VarM3244v = op0.m3602y(up0.m5529H(str)).m3244v();
                sg1VarM3244v.f13871b = "loadUrl";
                sg1VarM3244v.m6411b();
                Method method = ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v.m4863c())).f13895j;
                method.getClass();
                XposedBridge.hookMethod(method, new kg3(c0816vn, new C0829w(26), null)).getClass();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: k */
    public final Integer mo141k() {
        return Integer.valueOf(f12026f);
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: m */
    public final int mo142m() {
        return f12025e;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: n */
    public final wm0 mo143n() {
        return f12027g;
    }
}
