package p099h;

import gg.AbstractC1417m;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;
import p293u2.EnumC4243m;
import p308v1.AbstractC4374a1;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4418p0;

/* JADX INFO: renamed from: h.c1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1448c1 extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f4803g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4804h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f4805i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC4418p0 f4806j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ AbstractC4377b1 f4807k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1448c1(C1451d1 c1451d1, long j3, int i9, int i10, InterfaceC4418p0 interfaceC4418p0, AbstractC4377b1 abstractC4377b1) {
        super(1);
        this.f4803g = j3;
        this.f4804h = i9;
        this.f4805i = i10;
        this.f4806j = interfaceC4418p0;
        this.f4807k = abstractC4377b1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        AbstractC4374a1 abstractC4374a1 = (AbstractC4374a1) obj;
        long j3 = (((long) this.f4804h) << 32) | (((long) this.f4805i) & 4294967295L);
        EnumC4243m layoutDirection = this.f4806j.getLayoutDirection();
        long j4 = this.f4803g;
        float f3 = (((int) (j3 >> 32)) - ((int) (j4 >> 32))) / 2.0f;
        float f10 = (((int) (j3 & 4294967295L)) - ((int) (j4 & 4294967295L))) / 2.0f;
        float f11 = layoutDirection == EnumC4243m.f13919g ? -1.0f : (-1) * (-1.0f);
        float f12 = 1;
        float f13 = (f11 + f12) * f3;
        AbstractC4374a1.m8810C(abstractC4374a1, this.f4807k, (((long) Math.round((f12 - 1.0f) * f10)) & 4294967295L) | (((long) Math.round(f13)) << 32));
        return C3967n.f12976a;
    }
}
