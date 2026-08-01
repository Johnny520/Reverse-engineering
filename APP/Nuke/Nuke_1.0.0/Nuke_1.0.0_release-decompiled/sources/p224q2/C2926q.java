package p224q2;

import java.lang.reflect.Method;
import p154e2.C2029h;

/* JADX INFO: renamed from: q2.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2926q extends AbstractC2929t {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f9246b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f9247c;

    public C2926q(Method method, int i5) {
        this.f9246b = method;
        this.f9247c = i5;
    }

    @Override // p224q2.AbstractC2929t
    /* JADX INFO: renamed from: a */
    public final Object mo5129a(Class cls) {
        String strM3723b = C2029h.m3723b(cls);
        if (strM3723b != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM3723b));
        }
        return this.f9246b.invoke(null, cls, Integer.valueOf(this.f9247c));
    }
}
