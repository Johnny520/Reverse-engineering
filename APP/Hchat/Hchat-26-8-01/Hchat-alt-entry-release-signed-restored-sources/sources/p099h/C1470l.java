package p099h;

import gg.AbstractC1417m;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;
import p308v1.AbstractC4374a1;
import p308v1.AbstractC4377b1;

/* JADX INFO: renamed from: h.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1470l extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC4377b1[] f4885g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4886h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f4887i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1470l(AbstractC4377b1[] abstractC4377b1Arr, C1472m c1472m, int i9, int i10) {
        super(1);
        this.f4885g = abstractC4377b1Arr;
        this.f4886h = i9;
        this.f4887i = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        AbstractC4374a1 abstractC4374a1 = (AbstractC4374a1) obj;
        for (AbstractC4377b1 abstractC4377b1 : this.f4885g) {
            if (abstractC4377b1 != null) {
                long j3 = (((long) abstractC4377b1.f14593g) << 32) | (((long) abstractC4377b1.f14594h) & 4294967295L);
                long j4 = (((long) this.f4886h) << 32) | (((long) this.f4887i) & 4294967295L);
                float f3 = 1;
                long jRound = (((long) Math.round((f3 - 1.0f) * ((((int) (j4 & 4294967295L)) - ((int) (j3 & 4294967295L))) / 2.0f))) & 4294967295L) | (((long) Math.round((f3 - 1.0f) * ((((int) (j4 >> 32)) - ((int) (j3 >> 32))) / 2.0f))) << 32);
                abstractC4374a1.m8816A(abstractC4377b1, (int) (jRound >> 32), (int) (jRound & 4294967295L), 0.0f);
            }
        }
        return C3967n.f12976a;
    }
}
