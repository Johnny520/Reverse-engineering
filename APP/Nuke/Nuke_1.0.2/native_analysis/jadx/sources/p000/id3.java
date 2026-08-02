package p000;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class id3 extends tb1 {

    /* JADX INFO: renamed from: e */
    public static final id3 f4575e = new id3();

    /* JADX INFO: renamed from: f */
    public static final String f4576f = "WeMsgListener";

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f4576f;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: g */
    public final void mo140g() {
        bj1.f895d.getClass();
        Method method = (Method) bj1.f898g.getValue();
        method.getClass();
        XposedBridge.hookMethod(method, new kg3(this, null, new yb3(18))).getClass();
    }
}
