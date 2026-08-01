package p135j2;

import p215oc.C5725t;
import p250r1.C6455e;
import p250r1.C6457g;

/* JADX INFO: renamed from: j2.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3578w {
    /* JADX INFO: renamed from: Q */
    static /* synthetic */ long m13370Q(InterfaceC3578w interfaceC3578w, InterfaceC3578w interfaceC3578w2, long j10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: localPositionOf-S_NoaFU");
            return 0L;
        }
        if ((i10 & 2) != 0) {
            j10 = C6455e.f20314b.m25569c();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return interfaceC3578w.mo13246f0(interfaceC3578w2, j10, z10);
    }

    /* JADX INFO: renamed from: r0 */
    static /* synthetic */ C6457g m13371r0(InterfaceC3578w interfaceC3578w, InterfaceC3578w interfaceC3578w2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
            return null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return interfaceC3578w.mo13249j0(interfaceC3578w2, z10);
    }

    /* JADX INFO: renamed from: B */
    InterfaceC3578w mo13239B();

    /* JADX INFO: renamed from: P */
    void mo13240P(float[] fArr);

    /* JADX INFO: renamed from: Z */
    long mo13241Z(long j10);

    /* JADX INFO: renamed from: a */
    long mo13242a();

    /* JADX INFO: renamed from: d */
    boolean mo13245d();

    /* JADX INFO: renamed from: f0 */
    long mo13246f0(InterfaceC3578w interfaceC3578w, long j10, boolean z10);

    /* JADX INFO: renamed from: g */
    long mo13247g(long j10);

    /* JADX INFO: renamed from: h0 */
    InterfaceC3578w mo13248h0();

    /* JADX INFO: renamed from: j0 */
    C6457g mo13249j0(InterfaceC3578w interfaceC3578w, boolean z10);

    /* JADX INFO: renamed from: q */
    long mo13250q(long j10);

    /* JADX INFO: renamed from: s0 */
    void mo13251s0(InterfaceC3578w interfaceC3578w, float[] fArr);

    /* JADX INFO: renamed from: u0 */
    long mo13252u0(long j10);

    /* JADX INFO: renamed from: v */
    long mo13253v(InterfaceC3578w interfaceC3578w, long j10);

    /* JADX INFO: renamed from: x */
    long mo13254x(long j10);
}
