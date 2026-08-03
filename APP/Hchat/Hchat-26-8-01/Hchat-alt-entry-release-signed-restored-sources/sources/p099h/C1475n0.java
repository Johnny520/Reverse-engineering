package p099h;

import gg.AbstractC1417m;
import p016b1.C0167g;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;
import p293u2.C4240j;
import p308v1.AbstractC4374a1;
import p308v1.AbstractC4377b1;

/* JADX INFO: renamed from: h.n0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1475n0 extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC4377b1 f4895g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f4896h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long f4897i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0167g f4898j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1475n0(AbstractC4377b1 abstractC4377b1, long j3, long j4, C0167g c0167g) {
        super(1);
        this.f4895g = abstractC4377b1;
        this.f4896h = j3;
        this.f4897i = j4;
        this.f4898j = c0167g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        AbstractC4374a1 abstractC4374a1 = (AbstractC4374a1) obj;
        long j3 = this.f4896h;
        long j4 = this.f4897i;
        abstractC4374a1.getClass();
        AbstractC4377b1 abstractC4377b1 = this.f4895g;
        AbstractC4374a1.m8815e(abstractC4374a1, abstractC4377b1);
        abstractC4377b1.mo8820A0(C4240j.m8530d((((long) (((int) (j3 >> 32)) + ((int) (j4 >> 32)))) << 32) | (((long) (((int) (j3 & 4294967295L)) + ((int) (j4 & 4294967295L)))) & 4294967295L), abstractC4377b1.f14597k), 0.0f, this.f4898j);
        return C3967n.f12976a;
    }
}
