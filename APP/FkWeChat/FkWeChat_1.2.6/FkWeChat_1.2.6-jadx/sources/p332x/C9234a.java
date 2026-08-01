package p332x;

import java.util.concurrent.CancellationException;
import p058e2.AbstractC2005g;
import p058e2.InterfaceC1999a;
import p080f9.AbstractC2368o;
import p121i3.C3196z;
import p219p.EnumC5898w0;
import p228p8.InterfaceC5976f;
import p250r1.C6455e;

/* JADX INFO: renamed from: x.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9234a implements InterfaceC1999a {

    /* JADX INFO: renamed from: q */
    public final AbstractC9242c1 f31504q;

    /* JADX INFO: renamed from: r */
    public final EnumC5898w0 f31505r;

    public C9234a(AbstractC9242c1 abstractC9242c1, EnumC5898w0 enumC5898w0) {
        this.f31504q = abstractC9242c1;
        this.f31505r = enumC5898w0;
    }

    @Override // p058e2.InterfaceC1999a
    /* JADX INFO: renamed from: L1 */
    public long mo7210L1(long j10, long j11, int i10) {
        if (!AbstractC2005g.m7247d(i10, AbstractC2005g.f5574a.m7248a()) || m35952b(j11) == 0.0f) {
            return C6455e.f20314b.m25569c();
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // p058e2.InterfaceC1999a
    /* JADX INFO: renamed from: V1 */
    public Object mo7211V1(long j10, long j11, InterfaceC5976f interfaceC5976f) {
        return C3196z.m12131b(m35951a(j11, this.f31505r));
    }

    /* JADX INFO: renamed from: a */
    public final long m35951a(long j10, EnumC5898w0 enumC5898w0) {
        return enumC5898w0 == EnumC5898w0.f18786q ? C3196z.m12134e(j10, 0.0f, 0.0f, 2, null) : C3196z.m12134e(j10, 0.0f, 0.0f, 1, null);
    }

    @Override // p058e2.InterfaceC1999a
    /* JADX INFO: renamed from: a1 */
    public long mo7213a1(long j10, int i10) {
        if (!AbstractC2005g.m7247d(i10, AbstractC2005g.f5574a.m7249b()) || Math.abs(this.f31504q.m36037y()) <= 1.0E-6d) {
            return C6455e.f20314b.m25569c();
        }
        float fM36037y = this.f31504q.m36037y() * this.f31504q.m36000K();
        float fMo35972k = ((this.f31504q.m35994E().mo35972k() + this.f31504q.m35994E().mo35973n()) * (-Math.signum(this.f31504q.m36037y()))) + fM36037y;
        if (this.f31504q.m36037y() > 0.0f) {
            fMo35972k = fM36037y;
            fM36037y = fMo35972k;
        }
        EnumC5898w0 enumC5898w0 = this.f31505r;
        EnumC5898w0 enumC5898w02 = EnumC5898w0.f18787r;
        float fIntBitsToFloat = -this.f31504q.mo2981f(-AbstractC2368o.m8585l(Float.intBitsToFloat((int) (enumC5898w0 == enumC5898w02 ? j10 >> 32 : j10 & 4294967295L)), fM36037y, fMo35972k));
        float fIntBitsToFloat2 = this.f31505r == enumC5898w02 ? fIntBitsToFloat : Float.intBitsToFloat((int) (j10 >> 32));
        if (this.f31505r != EnumC5898w0.f18786q) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        return C6455e.m25552f(j10, fIntBitsToFloat2, fIntBitsToFloat);
    }

    /* JADX INFO: renamed from: b */
    public final float m35952b(long j10) {
        return Float.intBitsToFloat((int) (this.f31505r == EnumC5898w0.f18787r ? j10 >> 32 : j10 & 4294967295L));
    }
}
