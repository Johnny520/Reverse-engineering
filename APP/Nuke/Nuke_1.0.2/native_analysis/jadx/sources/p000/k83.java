package p000;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class k83 extends m83 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f5396b;

    public k83(Method method) {
        this.f5396b = method;
    }

    @Override // p000.m83
    /* JADX INFO: renamed from: a */
    public final Object mo2304a(Class cls) {
        String strM5026r = sz0.m5026r(cls);
        if (strM5026r == null) {
            return this.f5396b.invoke(null, cls, Object.class);
        }
        C0676s.m4650i("UnsafeAllocator is used for non-instantiable type: ".concat(strM5026r));
        return null;
    }
}
