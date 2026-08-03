package p088g0;

import p085fg.InterfaceC1231l;
import p276sf.C3967n;
import p293u2.C4240j;
import p293u2.EnumC4243m;
import p308v1.AbstractC4374a1;
import p308v1.AbstractC4377b1;

/* JADX INFO: renamed from: g0.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1263g implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4175g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC4377b1 f4176h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1263g(AbstractC4377b1 abstractC4377b1, int i9) {
        this.f4175g = i9;
        this.f4176h = abstractC4377b1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        AbstractC4374a1 abstractC4374a1 = (AbstractC4374a1) obj;
        switch (this.f4175g) {
            case 0:
                abstractC4374a1.m8816A(this.f4176h, 0, 0, 0.0f);
                break;
            case 1:
                abstractC4374a1.m8816A(this.f4176h, 0, 0, 0.0f);
                break;
            case 2:
                AbstractC4374a1.m8811E(abstractC4374a1, this.f4176h, 0, 0);
                break;
            case 3:
                EnumC4243m enumC4243mMo8818m = abstractC4374a1.mo8818m();
                EnumC4243m enumC4243m = EnumC4243m.f13919g;
                AbstractC4377b1 abstractC4377b1 = this.f4176h;
                if (enumC4243mMo8818m == enumC4243m || abstractC4374a1.mo8819w() == 0) {
                    AbstractC4374a1.m8815e(abstractC4374a1, abstractC4377b1);
                    abstractC4377b1.mo8820A0(C4240j.m8530d(0L, abstractC4377b1.f14597k), 0.0f, null);
                } else {
                    int i9 = (int) 0;
                    long jMo8819w = ((long) ((abstractC4374a1.mo8819w() - abstractC4377b1.f14593g) - i9)) << 32;
                    AbstractC4374a1.m8815e(abstractC4374a1, abstractC4377b1);
                    abstractC4377b1.mo8820A0(C4240j.m8530d((((long) i9) & 4294967295L) | jMo8819w, abstractC4377b1.f14597k), 0.0f, null);
                }
                return C3967n.f12976a;
            case 4:
                AbstractC4374a1.m8811E(abstractC4374a1, this.f4176h, 0, 0);
                break;
            case 5:
                AbstractC4374a1.m8811E(abstractC4374a1, this.f4176h, 0, 0);
                break;
            case 6:
                abstractC4374a1.m8816A(this.f4176h, 0, 0, 0.0f);
                break;
            case 7:
                AbstractC4374a1.m8811E(abstractC4374a1, this.f4176h, 0, 0);
                break;
            default:
                AbstractC4374a1.m8811E(abstractC4374a1, this.f4176h, 0, 0);
                break;
        }
        return C3967n.f12976a;
    }
}
