package p145jc;

import ec.InterfaceC2183s2;
import p010a9.InterfaceC0188p;
import p055e.AbstractC1960a;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: jc.k0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3815k0 {

    /* JADX INFO: renamed from: a */
    public static final C3801d0 f10996a = new C3801d0("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0188p f10997b = new InterfaceC0188p() { // from class: jc.h0
        @Override // p010a9.InterfaceC0188p
        public final Object invoke(Object obj, Object obj2) {
            return AbstractC3815k0.m15194b(obj, (InterfaceC5980j.b) obj2);
        }
    };

    /* JADX INFO: renamed from: c */
    public static final InterfaceC0188p f10998c = new InterfaceC0188p() { // from class: jc.i0
        @Override // p010a9.InterfaceC0188p
        public final Object invoke(Object obj, Object obj2) {
            AbstractC1960a.m7104a(obj);
            AbstractC3815k0.m15193a(null, (InterfaceC5980j.b) obj2);
            return null;
        }
    };

    /* JADX INFO: renamed from: d */
    public static final InterfaceC0188p f10999d = new InterfaceC0188p() { // from class: jc.j0
        @Override // p010a9.InterfaceC0188p
        public final Object invoke(Object obj, Object obj2) {
            return AbstractC3815k0.m15195c((C3823o0) obj, (InterfaceC5980j.b) obj2);
        }
    };

    /* JADX INFO: renamed from: a */
    public static InterfaceC2183s2 m15193a(InterfaceC2183s2 interfaceC2183s2, InterfaceC5980j.b bVar) {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final void m15196d(InterfaceC5980j interfaceC5980j, Object obj) {
        if (obj == f10996a) {
            return;
        }
        if (obj instanceof C3823o0) {
            ((C3823o0) obj).m15233a(interfaceC5980j);
            return;
        }
        Object objMo1655q = interfaceC5980j.mo1655q(null, f10998c);
        objMo1655q.getClass();
        AbstractC1960a.m7104a(objMo1655q);
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static final Object m15197e(InterfaceC5980j interfaceC5980j) {
        Object objMo1655q = interfaceC5980j.mo1655q(0, f10997b);
        objMo1655q.getClass();
        return objMo1655q;
    }

    /* JADX INFO: renamed from: f */
    public static final Object m15198f(InterfaceC5980j interfaceC5980j, Object obj) {
        if (obj == null) {
            obj = m15197e(interfaceC5980j);
        }
        if (obj == 0) {
            return f10996a;
        }
        if (obj instanceof Integer) {
            return interfaceC5980j.mo1655q(new C3823o0(interfaceC5980j, ((Number) obj).intValue()), f10999d);
        }
        obj.getClass();
        AbstractC1960a.m7104a(obj);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static Object m15194b(Object obj, InterfaceC5980j.b bVar) {
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public static C3823o0 m15195c(C3823o0 c3823o0, InterfaceC5980j.b bVar) {
        return c3823o0;
    }
}
