package p227r;

import me.dartcv.nuke.BuildConfig;
import p000A.C0015H0;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p160f3.InterfaceC2160t;
import p204n0.C2683b;
import p216p.EnumC2824Q;

/* JADX INFO: renamed from: r.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3011r0 extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f9525h;

    /* JADX INFO: renamed from: i */
    public int f9526i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C3015t0 f9527j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ long f9528k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3011r0(C3015t0 c3015t0, long j5, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f9525h = i5;
        this.f9527j = c3015t0;
        this.f9528k = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f9525h) {
            case 0:
                return ((C3011r0) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case BuildConfig.VERSION_CODE /* 1 */:
                return ((C3011r0) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            default:
                long j5 = ((C2683b) obj).f8556a;
                C3011r0 c3011r0 = new C3011r0(this.f9527j, (InterfaceC1046d) obj2);
                c3011r0.f9528k = j5;
                return c3011r0.mo8p(C0891q.f2780a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f9525h) {
            case 0:
                return new C3011r0(this.f9527j, this.f9528k, interfaceC1046d, 0);
            case BuildConfig.VERSION_CODE /* 1 */:
                return new C3011r0(this.f9527j, this.f9528k, interfaceC1046d, 1);
            default:
                C3011r0 c3011r0 = new C3011r0(this.f9527j, interfaceC1046d);
                c3011r0.f9528k = ((C2683b) obj).f8556a;
                return c3011r0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        switch (this.f9525h) {
            case 0:
                int i5 = this.f9526i;
                if (i5 == 0) {
                    AbstractC1784a.m3205S(obj);
                    C2940A0 c2940a0 = this.f9527j.f9552Q;
                    C0015H0 c0015h0 = new C0015H0(this.f9528k, null);
                    this.f9526i = 1;
                    Object objM5146f = c2940a0.m5146f(EnumC2824Q.f8891e, c0015h0, this);
                    EnumC1152a enumC1152a = EnumC1152a.f3788d;
                    if (objM5146f == enumC1152a) {
                        return enumC1152a;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                return C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                int i6 = this.f9526i;
                if (i6 == 0) {
                    AbstractC1784a.m3205S(obj);
                    C2940A0 c2940a02 = this.f9527j.f9552Q;
                    long j5 = this.f9528k;
                    this.f9526i = 1;
                    Object objM5142b = c2940a02.m5142b(j5, true, this);
                    EnumC1152a enumC1152a2 = EnumC1152a.f3788d;
                    if (objM5142b == enumC1152a2) {
                        return enumC1152a2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                return C0891q.f2780a;
            default:
                int i7 = this.f9526i;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                    return obj;
                }
                AbstractC1784a.m3205S(obj);
                long j6 = this.f9528k;
                C2940A0 c2940a03 = this.f9527j.f9552Q;
                this.f9526i = 1;
                Object objM5207a = AbstractC3005o0.m5207a(c2940a03, j6, this);
                EnumC1152a enumC1152a3 = EnumC1152a.f3788d;
                return objM5207a == enumC1152a3 ? enumC1152a3 : objM5207a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3011r0(C3015t0 c3015t0, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f9525h = 2;
        this.f9527j = c3015t0;
    }
}
