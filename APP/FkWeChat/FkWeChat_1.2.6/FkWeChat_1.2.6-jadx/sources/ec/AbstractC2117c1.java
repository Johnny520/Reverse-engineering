package ec;

import p145jc.AbstractC3810i;
import p145jc.AbstractC3815k0;
import p145jc.C3808h;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p172l8.C4712s;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: ec.c1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2117c1 {
    /* JADX INFO: renamed from: a */
    public static final void m7636a(AbstractC2112b1 abstractC2112b1, int i10) {
        InterfaceC5976f interfaceC5976fMo7623c = abstractC2112b1.mo7623c();
        boolean z10 = i10 == 4;
        if (z10 || !(interfaceC5976fMo7623c instanceof C3808h) || m7637b(i10) != m7637b(abstractC2112b1.f5914s)) {
            m7639d(abstractC2112b1, interfaceC5976fMo7623c, z10);
            return;
        }
        C3808h c3808h = (C3808h) interfaceC5976fMo7623c;
        AbstractC2149k0 abstractC2149k0 = c3808h.f10981t;
        InterfaceC5980j context = c3808h.getContext();
        if (AbstractC3810i.m15181d(abstractC2149k0, context)) {
            AbstractC3810i.m15180c(abstractC2149k0, context, abstractC2112b1);
        } else {
            m7640e(abstractC2112b1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m7637b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m7638c(int i10) {
        return i10 == 2;
    }

    /* JADX INFO: renamed from: d */
    public static final void m7639d(AbstractC2112b1 abstractC2112b1, InterfaceC5976f interfaceC5976f, boolean z10) {
        Object objMo7625e;
        Object objMo7627h = abstractC2112b1.mo7627h();
        Throwable thMo7624d = abstractC2112b1.mo7624d(objMo7627h);
        if (thMo7624d != null) {
            C4712s.a aVar = C4712s.f13928r;
            objMo7625e = AbstractC4713t.m18807a(thMo7624d);
        } else {
            C4712s.a aVar2 = C4712s.f13928r;
            objMo7625e = abstractC2112b1.mo7625e(objMo7627h);
        }
        Object objM18798b = C4712s.m18798b(objMo7625e);
        if (!z10) {
            interfaceC5976f.resumeWith(objM18798b);
            return;
        }
        interfaceC5976f.getClass();
        C3808h c3808h = (C3808h) interfaceC5976f;
        InterfaceC5976f interfaceC5976f2 = c3808h.f10982u;
        Object obj = c3808h.f10984w;
        InterfaceC5980j context = interfaceC5976f2.getContext();
        Object objM15198f = AbstractC3815k0.m15198f(context, obj);
        C2207y2 c2207y2M7772j = objM15198f != AbstractC3815k0.f10996a ? AbstractC2141i0.m7772j(interfaceC5976f2, context, objM15198f) : null;
        try {
            c3808h.f10982u.resumeWith(objM18798b);
            C4700i0 c4700i0 = C4700i0.f13910a;
            if (c2207y2M7772j == null || c2207y2M7772j.m7945l1()) {
                AbstractC3815k0.m15196d(context, objM15198f);
            }
        } catch (Throwable th) {
            if (c2207y2M7772j == null || c2207y2M7772j.m7945l1()) {
                AbstractC3815k0.m15196d(context, objM15198f);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m7640e(AbstractC2112b1 abstractC2112b1) {
        AbstractC2142i1 abstractC2142i1M7908b = C2187t2.f6012a.m7908b();
        if (abstractC2142i1M7908b.m7779Q0()) {
            abstractC2142i1M7908b.m7776M0(abstractC2112b1);
            return;
        }
        abstractC2142i1M7908b.m7778O0(true);
        try {
            m7639d(abstractC2112b1, abstractC2112b1.mo7623c(), true);
            do {
            } while (abstractC2142i1M7908b.m7782T0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
