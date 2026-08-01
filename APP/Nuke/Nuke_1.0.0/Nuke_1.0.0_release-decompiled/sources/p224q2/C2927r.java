package p224q2;

import java.lang.reflect.Method;
import p154e2.C2029h;

/* JADX INFO: renamed from: q2.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2927r extends AbstractC2929t {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f9248b;

    public C2927r(Method method) {
        this.f9248b = method;
    }

    @Override // p224q2.AbstractC2929t
    /* JADX INFO: renamed from: a */
    public final Object mo5129a(Class cls) {
        String strM3723b = C2029h.m3723b(cls);
        if (strM3723b != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM3723b));
        }
        return this.f9248b.invoke(null, cls, Object.class);
    }
}
