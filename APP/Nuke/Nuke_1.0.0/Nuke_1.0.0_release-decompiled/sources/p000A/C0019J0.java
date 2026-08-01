package p000A;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p095T.InterfaceC1347Y;
import p112W2.InterfaceC1604f;
import p127Z2.AbstractC1784a;
import p160f3.AbstractC2162v;
import p160f3.InterfaceC2160t;
import p204n0.C2683b;
import p227r.C2989g0;

/* JADX INFO: renamed from: A.J0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0019J0 extends AbstractC1184i implements InterfaceC1604f {

    /* JADX INFO: renamed from: h */
    public int f105h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ C2989g0 f106i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ long f107j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC2160t f108k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1347Y f109l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0019J0(InterfaceC2160t interfaceC2160t, InterfaceC1347Y interfaceC1347Y, InterfaceC1046d interfaceC1046d) {
        super(3, interfaceC1046d);
        this.f108k = interfaceC2160t;
        this.f109l = interfaceC1347Y;
    }

    @Override // p112W2.InterfaceC1604f
    /* JADX INFO: renamed from: f */
    public final Object mo5f(Object obj, Object obj2, Object obj3) {
        long j5 = ((C2683b) obj2).f8556a;
        C0019J0 c0019j0 = new C0019J0(this.f108k, this.f109l, (InterfaceC1046d) obj3);
        c0019j0.f106i = (C2989g0) obj;
        c0019j0.f107j = j5;
        return c0019j0.mo8p(C0891q.f2780a);
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        int i5 = this.f105h;
        InterfaceC1347Y interfaceC1347Y = this.f109l;
        InterfaceC2160t interfaceC2160t = this.f108k;
        if (i5 == 0) {
            AbstractC1784a.m3205S(obj);
            C2989g0 c2989g0 = this.f106i;
            AbstractC2162v.m3994p(interfaceC2160t, null, new C0015H0(interfaceC1347Y, this.f107j, null), 3);
            this.f105h = 1;
            obj = c2989g0.m5201f(this);
            EnumC1152a enumC1152a = EnumC1152a.f3788d;
            if (obj == enumC1152a) {
                return enumC1152a;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1784a.m3205S(obj);
        }
        AbstractC2162v.m3994p(interfaceC2160t, null, new C0017I0(interfaceC1347Y, ((Boolean) obj).booleanValue(), (InterfaceC1046d) null), 3);
        return C0891q.f2780a;
    }
}
