package p333x0;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.C0460b;
import androidx.compose.runtime.C0556o4;
import androidx.compose.runtime.InterfaceC0474d;
import java.util.List;
import p010a9.InterfaceC0173a;
import p150k1.AbstractC3910c;
import p150k1.AbstractC3912e;
import p150k1.C3907a;
import p150k1.C3911d;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5112w;

/* JADX INFO: renamed from: x0.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9302h {

    /* JADX INFO: renamed from: x0.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC9300f {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC9300f f31836q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C0556o4 f31837r;

        public a(InterfaceC9300f interfaceC9300f, C0556o4 c0556o4) {
            this.f31836q = interfaceC9300f;
            this.f31837r = c0556o4;
        }

        @Override // p333x0.InterfaceC9300f
        /* JADX INFO: renamed from: b */
        public List mo15598b(Integer num) {
            List listMo15598b = this.f31836q.mo15598b(null);
            int iM2062b0 = this.f31837r.m2062b0();
            if (iM2062b0 < 0) {
                return listMo15598b;
            }
            C0556o4 c0556o4 = this.f31837r;
            return AbstractC5081g0.m20533E0(AbstractC3910c.m15573b(c0556o4, num, iM2062b0, Integer.valueOf(c0556o4.m2019F0(iM2062b0))), listMo15598b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C3907a m36237a(C0460b c0460b, C0556o4 c0556o4, InterfaceC9300f interfaceC9300f) {
        if (c0460b != null) {
            c0556o4.m2045S0(c0460b);
        }
        List listM15574c = AbstractC3910c.m15574c(c0556o4, null, 0, null, 7, null);
        C3911d c3911d = (C3911d) AbstractC5081g0.m20589w0(listM15574c);
        Integer numM15582d = c3911d != null ? c3911d.m15582d() : null;
        List listMo15598b = interfaceC9300f.mo15598b(numM15582d);
        if (numM15582d != null && !listMo15598b.isEmpty()) {
            listMo15598b = AbstractC5081g0.m20533E0(AbstractC5112w.m20789e(C3911d.m15579b((C3911d) AbstractC5081g0.m20576j0(listMo15598b), 0, null, numM15582d, 3, null)), AbstractC5081g0.m20565d0(listMo15598b, 1));
        }
        return new C3907a(AbstractC5081g0.m20533E0(listM15574c, listMo15598b));
    }

    /* JADX INFO: renamed from: f */
    public static final Throwable m36242f(Throwable th, final InterfaceC9300f interfaceC9300f, final C0556o4 c0556o4, final C0460b c0460b) {
        return interfaceC9300f == null ? th : AbstractC3912e.m15587d(th, new InterfaceC0173a() { // from class: x0.g
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return AbstractC9302h.m36237a(c0460b, c0556o4, interfaceC9300f);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static final int m36243g(C0556o4 c0556o4) {
        int iM2060a0 = c0556o4.m2060a0();
        int iM2062b0 = c0556o4.m2062b0();
        while (iM2062b0 >= 0 && !c0556o4.m2094r0(iM2062b0)) {
            iM2062b0 = c0556o4.m2019F0(iM2062b0);
        }
        int iM2076i0 = iM2062b0 + 1;
        int iM2015D0 = 0;
        while (iM2076i0 < iM2060a0) {
            if (c0556o4.m2084m0(iM2060a0, iM2076i0)) {
                if (c0556o4.m2094r0(iM2076i0)) {
                    iM2015D0 = 0;
                }
                iM2076i0++;
            } else {
                iM2015D0 += c0556o4.m2094r0(iM2076i0) ? 1 : c0556o4.m2015D0(iM2076i0);
                iM2076i0 += c0556o4.m2076i0(iM2076i0);
            }
        }
        return iM2015D0;
    }

    /* JADX INFO: renamed from: h */
    public static final int m36244h(C0556o4 c0556o4, C0460b c0460b, InterfaceC0474d interfaceC0474d) {
        int iM2012C = c0556o4.m2012C(c0460b);
        if (!(c0556o4.m2060a0() < iM2012C)) {
            AbstractC0468c0.m1548b("Check failed");
        }
        m36245i(c0556o4, interfaceC0474d, iM2012C);
        int iM36243g = m36243g(c0556o4);
        while (c0556o4.m2060a0() < iM2012C) {
            if (c0556o4.m2082l0(iM2012C)) {
                if (c0556o4.m2092q0()) {
                    interfaceC0474d.mo1477d(c0556o4.m2011B0(c0556o4.m2060a0()));
                    iM36243g = 0;
                }
                c0556o4.m2073g1();
            } else {
                iM36243g += c0556o4.m2053W0();
            }
        }
        if (!(c0556o4.m2060a0() == iM2012C)) {
            AbstractC0468c0.m1548b("Check failed");
        }
        return iM36243g;
    }

    /* JADX INFO: renamed from: i */
    public static final void m36245i(C0556o4 c0556o4, InterfaceC0474d interfaceC0474d, int i10) {
        while (!c0556o4.m2086n0(i10)) {
            c0556o4.m2055X0();
            if (c0556o4.m2094r0(c0556o4.m2062b0())) {
                interfaceC0474d.mo1478h();
            }
            c0556o4.m2044S();
        }
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC9300f m36246j(InterfaceC9300f interfaceC9300f, C0556o4 c0556o4) {
        return new a(interfaceC9300f, c0556o4);
    }
}
