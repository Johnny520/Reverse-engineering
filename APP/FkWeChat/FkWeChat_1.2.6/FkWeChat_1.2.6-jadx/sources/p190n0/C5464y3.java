package p190n0;

import java.util.List;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p015b0.C0882w4;
import p018b3.C0934a;
import p018b3.C0972q0;
import p018b3.C0978t0;
import p018b3.InterfaceC0955i;
import p018b3.InterfaceC0956i0;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p319w2.C9137t3;

/* JADX INFO: renamed from: n0.y3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5464y3 extends AbstractC5370j {

    /* JADX INFO: renamed from: j */
    public final C0978t0 f16801j;

    /* JADX INFO: renamed from: k */
    public final C0882w4 f16802k;

    public C5464y3(C0978t0 c0978t0, InterfaceC0956i0 interfaceC0956i0, C0882w4 c0882w4, C5323b5 c5323b5) {
        super(c0978t0.m3583h(), c0978t0.m3585j(), c0882w4 != null ? c0882w4.m3243f() : null, interfaceC0956i0, c5323b5, null);
        this.f16801j = c0978t0;
        this.f16802k = c0882w4;
    }

    /* JADX INFO: renamed from: Z */
    public final List m22228Z(InterfaceC0184l interfaceC0184l) {
        if (!C9137t3.m35517h(m21913v())) {
            return AbstractC5114x.m20803r(new C0934a(_UrlKt.FRAGMENT_ENCODE_SET, 0), new C0972q0(C9137t3.m35521l(m21913v()), C9137t3.m35521l(m21913v())));
        }
        InterfaceC0955i interfaceC0955i = (InterfaceC0955i) interfaceC0184l.mo27m(this);
        if (interfaceC0955i != null) {
            return AbstractC5112w.m20789e(interfaceC0955i);
        }
        return null;
    }

    /* JADX INFO: renamed from: a0 */
    public final C0978t0 m22229a0() {
        return C0978t0.m3580g(this.f16801j, m21900e(), m21913v(), null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /* JADX INFO: renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m22230b0(p015b0.C0882w4 r9, int r10) {
        /*
            r8 = this;
            j2.w r0 = r9.m3241c()
            if (r0 == 0) goto L15
            j2.w r1 = r9.m3240b()
            r2 = 0
            if (r1 == 0) goto L13
            r3 = 0
            r4 = 2
            r1.g r2 = p135j2.InterfaceC3578w.m13371r0(r1, r0, r3, r4, r2)
        L13:
            if (r2 != 0) goto L1b
        L15:
            r1.g$a r0 = p250r1.C6457g.f20319e
            r1.g r2 = r0.m25594a()
        L1b:
            b3.i0 r0 = r8.m21908p()
            b3.t0 r1 = r8.f16801j
            long r3 = r1.m3585j()
            int r1 = p319w2.C9137t3.m35518i(r3)
            int r0 = r0.mo3268b(r1)
            w2.q3 r1 = r9.m3243f()
            r1.g r0 = r1.m35386e(r0)
            float r1 = r0.m25583l()
            float r0 = r0.m25586o()
            long r2 = r2.m25585n()
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r10 = (float) r10
            float r2 = r2 * r10
            float r0 = r0 + r2
            b3.i0 r10 = r8.m21908p()
            w2.q3 r9 = r9.m3243f()
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r1 = (long) r1
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r6 = (long) r0
            r0 = 32
            long r0 = r1 << r0
            long r2 = r6 & r4
            long r0 = r0 | r2
            long r0 = p250r1.C6455e.m25551e(r0)
            int r9 = r9.m35404x(r0)
            int r9 = r10.mo3267a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p190n0.C5464y3.m22230b0(b0.w4, int):int");
    }

    /* JADX INFO: renamed from: c0 */
    public final C5464y3 m22231c0() {
        C0882w4 c0882w4;
        if (m21915x().length() > 0 && (c0882w4 = this.f16802k) != null) {
            m21891U(m22230b0(c0882w4, 1));
        }
        return this;
    }

    /* JADX INFO: renamed from: d0 */
    public final C5464y3 m22232d0() {
        C0882w4 c0882w4;
        if (m21915x().length() > 0 && (c0882w4 = this.f16802k) != null) {
            m21891U(m22230b0(c0882w4, -1));
        }
        return this;
    }
}
