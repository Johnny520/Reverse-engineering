package p000;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: ae */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0015ae extends gx2 {

    /* JADX INFO: renamed from: d */
    public static final C0015ae f164d = new C0015ae(false);

    /* JADX INFO: renamed from: e */
    public static final int f165e = R.string.anti_moments_revoke;

    /* JADX INFO: renamed from: f */
    public static final int f166f = R.string.anti_moments_revoke_description;

    /* JADX INFO: renamed from: g */
    public static final wm0 f167g = wm0.f12577k;

    /* JADX INFO: renamed from: h */
    public static final String f168h = "AntiMomentsRevoke";

    /* JADX INFO: renamed from: i */
    public static final boolean f169i = true;

    /* JADX INFO: renamed from: j */
    public static final hx2 f170j = new hx2(new C0074c0(3));

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f168h;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: e */
    public final boolean mo139e() {
        return f169i;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: g */
    public final void mo140g() {
        xs2.f13162d.getClass();
        Method method = (Method) xs2.f13165g.getValue();
        method.getClass();
        XposedBridge.hookMethod(method, new kg3(this, new C0829w(6), null)).getClass();
        Method method2 = (Method) xs2.f13164f.getValue();
        method2.getClass();
        XposedBridge.hookMethod(method2, new kg3(this, new C0829w(7), null)).getClass();
        Method method3 = (Method) xs2.f13166h.getValue();
        method3.getClass();
        XposedBridge.hookMethod(method3, new kg3(this, new C0829w(5), null)).getClass();
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: k */
    public final Integer mo141k() {
        return Integer.valueOf(f166f);
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: m */
    public final int mo142m() {
        return f165e;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: n */
    public final wm0 mo143n() {
        return f167g;
    }
}
