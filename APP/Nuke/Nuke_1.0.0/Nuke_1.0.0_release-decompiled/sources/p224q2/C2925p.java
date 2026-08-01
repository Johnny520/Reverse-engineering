package p224q2;

import java.lang.reflect.Method;
import p154e2.C2029h;

/* JADX INFO: renamed from: q2.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2925p extends AbstractC2929t {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f9244b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f9245c;

    public C2925p(Method method, Object obj) {
        this.f9244b = method;
        this.f9245c = obj;
    }

    @Override // p224q2.AbstractC2929t
    /* JADX INFO: renamed from: a */
    public final Object mo5129a(Class cls) {
        String strM3723b = C2029h.m3723b(cls);
        if (strM3723b != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM3723b));
        }
        return this.f9244b.invoke(this.f9245c, cls);
    }
}
