package p227r;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p160f3.InterfaceC2160t;

/* JADX INFO: renamed from: r.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3013s0 extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public int f9530h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3015t0 f9531i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ float f9532j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ float f9533k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3013s0(C3015t0 c3015t0, float f2, float f5, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f9531i = c3015t0;
        this.f9532j = f2;
        this.f9533k = f5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C3013s0) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        return new C3013s0(this.f9531i, this.f9532j, this.f9533k, interfaceC1046d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        int i5 = this.f9530h;
        if (i5 == 0) {
            AbstractC1784a.m3205S(obj);
            C2940A0 c2940a0 = this.f9531i.f9552Q;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f9532j)) << 32) | (((long) Float.floatToRawIntBits(this.f9533k)) & 4294967295L);
            this.f9530h = 1;
            Object objM5207a = AbstractC3005o0.m5207a(c2940a0, jFloatToRawIntBits, this);
            EnumC1152a enumC1152a = EnumC1152a.f3788d;
            if (objM5207a == enumC1152a) {
                return enumC1152a;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1784a.m3205S(obj);
        }
        return C0891q.f2780a;
    }
}
