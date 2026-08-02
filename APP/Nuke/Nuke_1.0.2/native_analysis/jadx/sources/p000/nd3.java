package p000;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nd3 extends tb1 {

    /* JADX INFO: renamed from: e */
    public static final nd3 f7114e = new nd3();

    /* JADX INFO: renamed from: f */
    public static final String f7115f = "WeXmlParseListener";

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f7115f;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: g */
    public final void mo140g() {
        ng3.f7155d.getClass();
        Method method = (Method) ng3.f7157f.getValue();
        method.getClass();
        XposedBridge.hookMethod(method, new kg3(this, null, new yb3(19))).getClass();
    }
}
