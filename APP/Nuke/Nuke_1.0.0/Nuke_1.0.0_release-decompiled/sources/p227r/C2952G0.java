package p227r;

import p007B0.C0209w;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p112W2.InterfaceC1604f;
import p127Z2.AbstractC1784a;
import p160f3.InterfaceC2160t;
import p204n0.C2683b;

/* JADX INFO: renamed from: r.G0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2952G0 extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f9331h;

    /* JADX INFO: renamed from: i */
    public int f9332i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1604f f9333j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2989g0 f9334k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C0209w f9335l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2952G0(InterfaceC1604f interfaceC1604f, C2989g0 c2989g0, C0209w c0209w, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f9331h = i5;
        this.f9333j = interfaceC1604f;
        this.f9334k = c2989g0;
        this.f9335l = c0209w;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC2160t interfaceC2160t = (InterfaceC2160t) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f9331h) {
        }
        return ((C2952G0) mo7n(interfaceC1046d, interfaceC2160t)).mo8p(C0891q.f2780a);
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f9331h) {
            case 0:
                return new C2952G0(this.f9333j, this.f9334k, this.f9335l, interfaceC1046d, 0);
            default:
                return new C2952G0(this.f9333j, this.f9334k, this.f9335l, interfaceC1046d, 1);
        }
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        switch (this.f9331h) {
            case 0:
                int i5 = this.f9332i;
                if (i5 == 0) {
                    AbstractC1784a.m3205S(obj);
                    C2683b c2683b = new C2683b(this.f9335l.f713c);
                    this.f9332i = 1;
                    Object objMo5f = this.f9333j.mo5f(this.f9334k, c2683b, this);
                    EnumC1152a enumC1152a = EnumC1152a.f3788d;
                    if (objMo5f == enumC1152a) {
                        return enumC1152a;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                return C0891q.f2780a;
            default:
                int i6 = this.f9332i;
                if (i6 == 0) {
                    AbstractC1784a.m3205S(obj);
                    C2683b c2683b2 = new C2683b(this.f9335l.f713c);
                    this.f9332i = 1;
                    Object objMo5f2 = this.f9333j.mo5f(this.f9334k, c2683b2, this);
                    EnumC1152a enumC1152a2 = EnumC1152a.f3788d;
                    if (objMo5f2 == enumC1152a2) {
                        return enumC1152a2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                return C0891q.f2780a;
        }
    }
}
