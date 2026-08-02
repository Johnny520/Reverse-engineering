package p000;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i83 extends m83 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f4487b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f4488c;

    public i83(Method method, Object obj) {
        this.f4487b = method;
        this.f4488c = obj;
    }

    @Override // p000.m83
    /* JADX INFO: renamed from: a */
    public final Object mo2304a(Class cls) {
        String strM5026r = sz0.m5026r(cls);
        if (strM5026r == null) {
            return this.f4487b.invoke(this.f4488c, cls);
        }
        C0676s.m4650i("UnsafeAllocator is used for non-instantiable type: ".concat(strM5026r));
        return null;
    }
}
