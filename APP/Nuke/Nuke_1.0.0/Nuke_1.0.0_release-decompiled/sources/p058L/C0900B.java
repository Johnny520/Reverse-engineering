package p058L;

import p000A.C0002B;
import p007B0.AbstractC0208v;
import p007B0.C0185S;
import p007B0.C0209w;
import p056K2.C0891q;
import p061L2.AbstractC0973m;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1183h;
import p112W2.InterfaceC1603e;
import p117X2.C1674s;
import p127Z2.AbstractC1784a;
import p227r.AbstractC2945D;

/* JADX INFO: renamed from: L.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0900B extends AbstractC1183h implements InterfaceC1603e {

    /* JADX INFO: renamed from: f */
    public int f2797f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f2798g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f2799h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1674s f2800i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0900B(long j5, C1674s c1674s, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f2799h = j5;
        this.f2800i = c1674s;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C0900B) mo7n((InterfaceC1046d) obj2, (C0185S) obj)).mo8p(C0891q.f2780a);
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        C0900B c0900b = new C0900B(this.f2799h, this.f2800i, interfaceC1046d);
        c0900b.f2798g = obj;
        return c0900b;
    }

    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.List] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        C0185S c0185s;
        int i5 = this.f2797f;
        C1674s c1674s = this.f2800i;
        if (i5 == 0) {
            AbstractC1784a.m3205S(obj);
            c0185s = (C0185S) this.f2798g;
            C0002B c0002b = new C0002B(5, c1674s);
            this.f2798g = c0185s;
            this.f2797f = 1;
            obj = AbstractC2945D.m5152c(c0185s, this.f2799h, c0002b, this);
            EnumC1152a enumC1152a = EnumC1152a.f3788d;
            if (obj == enumC1152a) {
                return enumC1152a;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0185s = (C0185S) this.f2798g;
            AbstractC1784a.m3205S(obj);
        }
        if (((C0209w) obj) != null && (c1674s.f5708d & 9223372034707292159L) != 9205357640488583168L) {
            return EnumC0938j.f2941e;
        }
        C0209w c0209w = (C0209w) AbstractC0973m.m2012S(c0185s.f645i.f653w.f696a);
        if (!AbstractC0208v.m314d(c0209w)) {
            return EnumC0938j.f2943g;
        }
        c0209w.m320a();
        return EnumC0938j.f2940d;
    }
}
