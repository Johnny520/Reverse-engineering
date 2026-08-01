package p230r2;

import java.lang.reflect.Field;
import p213o2.C2789r;
import p224q2.InterfaceC2924o;
import p241t2.AbstractC3211c;
import p258w2.C3390a;

/* JADX INFO: renamed from: r2.t */
/* JADX INFO: loaded from: classes.dex */
public final class C3144t extends AbstractC3143s {

    /* JADX INFO: renamed from: b */
    public final InterfaceC2924o f9897b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3144t(InterfaceC2924o interfaceC2924o, C3145u c3145u) {
        super(c3145u);
        this.f9897b = interfaceC2924o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p230r2.AbstractC3143s
    /* JADX INFO: renamed from: d */
    public final Object mo5416d() {
        return this.f9897b.mo602c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p230r2.AbstractC3143s
    /* JADX INFO: renamed from: f */
    public final void mo5418f(Object obj, C3390a c3390a, C3142r c3142r) throws IllegalAccessException {
        Field field = c3142r.f9889b;
        Object objMo4964b = c3142r.f9893f.mo4964b(c3390a);
        if (objMo4964b == null && c3142r.f9894g) {
            return;
        }
        if (!c3142r.f9895h) {
            field.set(obj, objMo4964b);
            return;
        }
        throw new C2789r("Cannot set value of 'static final' " + AbstractC3211c.m5490d(field, false));
    }

    @Override // p230r2.AbstractC3143s
    /* JADX INFO: renamed from: e */
    public final Object mo5417e(Object obj) {
        return obj;
    }
}
