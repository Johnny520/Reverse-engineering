package p161kc;

import ec.C2209z0;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p145jc.AbstractC3810i;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p172l8.C4712s;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6324b;

/* JADX INFO: renamed from: kc.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4243a {
    /* JADX INFO: renamed from: a */
    public static final void m16720a(InterfaceC5976f interfaceC5976f, Throwable th) throws Throwable {
        if (th instanceof C2209z0) {
            th = ((C2209z0) th).getCause();
        }
        C4712s.a aVar = C4712s.f13928r;
        interfaceC5976f.resumeWith(C4712s.m18798b(AbstractC4713t.m18807a(th)));
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public static final void m16721b(InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) throws Throwable {
        try {
            InterfaceC5976f interfaceC5976fM24989d = AbstractC6324b.m24989d(AbstractC6324b.m24986a(interfaceC0184l, interfaceC5976f));
            C4712s.a aVar = C4712s.f13928r;
            AbstractC3810i.m15179b(interfaceC5976fM24989d, C4712s.m18798b(C4700i0.f13910a));
        } catch (Throwable th) {
            m16720a(interfaceC5976f, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m16722c(InterfaceC0188p interfaceC0188p, Object obj, InterfaceC5976f interfaceC5976f) {
        try {
            InterfaceC5976f interfaceC5976fM24989d = AbstractC6324b.m24989d(AbstractC6324b.m24987b(interfaceC0188p, obj, interfaceC5976f));
            C4712s.a aVar = C4712s.f13928r;
            AbstractC3810i.m15179b(interfaceC5976fM24989d, C4712s.m18798b(C4700i0.f13910a));
        } catch (Throwable th) {
            m16720a(interfaceC5976f, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m16723d(InterfaceC5976f interfaceC5976f, InterfaceC5976f interfaceC5976f2) throws Throwable {
        try {
            InterfaceC5976f interfaceC5976fM24989d = AbstractC6324b.m24989d(interfaceC5976f);
            C4712s.a aVar = C4712s.f13928r;
            AbstractC3810i.m15179b(interfaceC5976fM24989d, C4712s.m18798b(C4700i0.f13910a));
        } catch (Throwable th) {
            m16720a(interfaceC5976f2, th);
        }
    }
}
