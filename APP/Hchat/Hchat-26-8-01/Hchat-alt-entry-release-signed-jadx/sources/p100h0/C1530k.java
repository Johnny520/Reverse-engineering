package p100h0;

import p129ig.AbstractC2043a;
import p293u2.C4240j;
import p293u2.C4241k;
import p293u2.EnumC4243m;
import p356y0.InterfaceC5841c;
import p358y2.InterfaceC5965b0;

/* JADX INFO: renamed from: h0.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1530k implements InterfaceC5965b0 {

    /* JADX INFO: renamed from: g */
    public final InterfaceC5841c f5104g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC1533l f5105h;

    /* JADX INFO: renamed from: i */
    public long f5106i = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1530k(InterfaceC5841c interfaceC5841c, InterfaceC1533l interfaceC1533l) {
        this.f5104g = interfaceC5841c;
        this.f5105h = interfaceC1533l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p358y2.InterfaceC5965b0
    /* JADX INFO: renamed from: e */
    public final long mo600e(C4241k c4241k, long j3, EnumC4243m enumC4243m, long j4) {
        long jMo4036a = this.f5105h.mo4036a();
        if ((9223372034707292159L & jMo4036a) == 9205357640488583168L) {
            jMo4036a = this.f5106i;
        }
        this.f5106i = jMo4036a;
        return C4240j.m8530d(C4240j.m8530d(c4241k.m8533b(), AbstractC2043a.m5017W(jMo4036a)), this.f5104g.mo10544a(j4, 0L, enumC4243m));
    }
}
