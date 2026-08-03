package p099h;

import gg.AbstractC1417m;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;
import p308v1.AbstractC4374a1;
import p308v1.AbstractC4377b1;

/* JADX INFO: renamed from: h.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1480q extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1484s f4908g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC4377b1 f4909h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long f4910i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1480q(C1484s c1484s, AbstractC4377b1 abstractC4377b1, long j3) {
        super(1);
        this.f4908g = c1484s;
        this.f4909h = abstractC4377b1;
        this.f4910i = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        this.f4908g.f4930x.getClass();
        AbstractC4377b1 abstractC4377b1 = this.f4909h;
        long j3 = (((long) abstractC4377b1.f14593g) << 32) | (((long) abstractC4377b1.f14594h) & 4294967295L);
        long j4 = this.f4910i;
        float f3 = 1;
        AbstractC4374a1.m8810C((AbstractC4374a1) obj, abstractC4377b1, (((long) Math.round((f3 - 1.0f) * ((((int) (j4 >> 32)) - ((int) (j3 >> 32))) / 2.0f))) << 32) | (((long) Math.round((f3 - 1.0f) * ((((int) (j4 & 4294967295L)) - ((int) (j3 & 4294967295L))) / 2.0f))) & 4294967295L));
        return C3967n.f12976a;
    }
}
