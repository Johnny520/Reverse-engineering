package p161kc;

import ec.AbstractC2123d2;
import ec.C2111b0;
import ec.C2191u2;
import ec.C2209z0;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1064u0;
import p145jc.AbstractC3815k0;
import p145jc.C3835z;
import p172l8.AbstractC4713t;
import p172l8.C4712s;
import p215oc.C5706c;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6324b;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6532a;
import p257r8.AbstractC6539h;

/* JADX INFO: renamed from: kc.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4244b {
    /* JADX INFO: renamed from: a */
    public static final Void m16724a(C3835z c3835z, C2209z0 c2209z0) throws Throwable {
        c3835z.m7655I0(new C2111b0(c2209z0.getCause(), false, 2, null));
        throw c2209z0.getCause();
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m16725b(C3835z c3835z, Throwable th) {
        return ((th instanceof C2191u2) && ((C2191u2) th).f6019q == c3835z) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static final void m16726c(InterfaceC0188p interfaceC0188p, Object obj, InterfaceC5976f interfaceC5976f) {
        InterfaceC5976f interfaceC5976fM25858a = AbstractC6539h.m25858a(interfaceC5976f);
        try {
            InterfaceC5980j context = interfaceC5976fM25858a.getContext();
            Object objM15198f = AbstractC3815k0.m15198f(context, null);
            try {
                AbstractC6539h.m25859b(interfaceC5976fM25858a);
                Object objM24990e = !(interfaceC0188p instanceof AbstractC6532a) ? AbstractC6324b.m24990e(interfaceC0188p, obj, interfaceC5976fM25858a) : ((InterfaceC0188p) AbstractC1064u0.m3858f(interfaceC0188p, 2)).invoke(obj, interfaceC5976fM25858a);
                AbstractC3815k0.m15196d(context, objM15198f);
                if (objM24990e != AbstractC6325c.m24992g()) {
                    interfaceC5976fM25858a.resumeWith(C4712s.m18798b(objM24990e));
                }
            } catch (Throwable th) {
                AbstractC3815k0.m15196d(context, objM15198f);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof C2209z0) {
                th = ((C2209z0) th).getCause();
            }
            C4712s.a aVar = C4712s.f13928r;
            interfaceC5976fM25858a.resumeWith(C4712s.m18798b(AbstractC4713t.m18807a(th)));
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Object m16727d(C3835z c3835z, Object obj, InterfaceC0188p interfaceC0188p) {
        return m16729f(c3835z, true, obj, interfaceC0188p);
    }

    /* JADX INFO: renamed from: e */
    public static final Object m16728e(C3835z c3835z, Object obj, InterfaceC0188p interfaceC0188p) {
        return m16729f(c3835z, false, obj, interfaceC0188p);
    }

    /* JADX INFO: renamed from: f */
    public static final Object m16729f(C3835z c3835z, boolean z10, Object obj, InterfaceC0188p interfaceC0188p) throws Throwable {
        Object c2111b0;
        try {
            c2111b0 = !(interfaceC0188p instanceof AbstractC6532a) ? AbstractC6324b.m24990e(interfaceC0188p, obj, c3835z) : ((InterfaceC0188p) AbstractC1064u0.m3858f(interfaceC0188p, 2)).invoke(obj, c3835z);
        } catch (C2209z0 e10) {
            m16724a(c3835z, e10);
            C5706c.m23089a();
            return null;
        } catch (Throwable th) {
            c2111b0 = new C2111b0(th, false, 2, null);
        }
        if (c2111b0 == AbstractC6325c.m24992g()) {
            return AbstractC6325c.m24992g();
        }
        Object objM7658K0 = c3835z.m7658K0(c2111b0);
        if (objM7658K0 == AbstractC2123d2.f5939b) {
            return AbstractC6325c.m24992g();
        }
        c3835z.mo7944k1();
        if (!(objM7658K0 instanceof C2111b0)) {
            return AbstractC2123d2.m7737h(objM7658K0);
        }
        if (z10 || m16725b(c3835z, ((C2111b0) objM7658K0).f5913a)) {
            throw ((C2111b0) objM7658K0).f5913a;
        }
        if (c2111b0 instanceof C2111b0) {
            throw ((C2111b0) c2111b0).f5913a;
        }
        return c2111b0;
    }
}
