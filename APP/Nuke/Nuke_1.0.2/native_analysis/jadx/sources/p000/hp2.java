package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hp2 extends t70 implements w70 {

    /* JADX INFO: renamed from: d */
    public static final hp2 f4103d = new hp2(true);

    /* JADX INFO: renamed from: e */
    public static final String f4104e = "ServiceManager";

    /* JADX INFO: renamed from: f */
    public static final hx2 f4105f = new hx2(new hn1(16));

    /* JADX INFO: renamed from: j */
    public static Object m2227j(Class cls) throws IllegalAccessException, InvocationTargetException {
        cls.getClass();
        Object objInvoke = ((Method) f4105f.getValue()).invoke(null, cls);
        if (objInvoke != null) {
            return objInvoke;
        }
        C0676s.m4645c("ServiceManager returned null for ".concat(cls.getName()));
        return null;
    }

    @Override // p000.w70
    /* JADX INFO: renamed from: a */
    public final void mo8a(ArrayList arrayList) {
        arrayList.add(gp2.f3652b);
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f4104e;
    }
}
