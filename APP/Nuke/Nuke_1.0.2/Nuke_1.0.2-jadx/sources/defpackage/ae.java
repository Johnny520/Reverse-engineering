package defpackage;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ae extends gx2 {
    public static final ae d = new ae(false);
    public static final int e = R.string.anti_moments_revoke;
    public static final int f = R.string.anti_moments_revoke_description;
    public static final wm0 g = wm0.k;
    public static final String h = "AntiMomentsRevoke";
    public static final boolean i = true;
    public static final hx2 j = new hx2(new c0(3));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final boolean e() {
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void g() {
        xs2.d.getClass();
        Method method = (Method) xs2.g.getValue();
        method.getClass();
        XposedBridge.hookMethod(method, new kg3(this, new w(6), null)).getClass();
        Method method2 = (Method) xs2.f.getValue();
        method2.getClass();
        XposedBridge.hookMethod(method2, new kg3(this, new w(7), null)).getClass();
        Method method3 = (Method) xs2.h.getValue();
        method3.getClass();
        XposedBridge.hookMethod(method3, new kg3(this, new w(5), null)).getClass();
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
