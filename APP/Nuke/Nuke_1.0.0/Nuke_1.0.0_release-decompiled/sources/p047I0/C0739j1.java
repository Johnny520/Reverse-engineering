package p047I0;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p160f3.InterfaceC2160t;

/* JADX INFO: renamed from: I0.j1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0739j1 extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2318h;

    /* JADX INFO: renamed from: i */
    public int f2319i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0745l1 f2320j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0739j1(C0745l1 c0745l1, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f2318h = i5;
        this.f2320j = c0745l1;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC2160t interfaceC2160t = (InterfaceC2160t) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f2318h) {
        }
        return ((C0739j1) mo7n(interfaceC1046d, interfaceC2160t)).mo8p(C0891q.f2780a);
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f2318h) {
            case 0:
                return new C0739j1(this.f2320j, interfaceC1046d, 0);
            default:
                return new C0739j1(this.f2320j, interfaceC1046d, 1);
        }
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) throws Throwable {
        switch (this.f2318h) {
            case 0:
                int i5 = this.f2319i;
                C0891q c0891q = C0891q.f2780a;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                    return c0891q;
                }
                AbstractC1784a.m3205S(obj);
                ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = this.f2320j.f2327d;
                this.f2319i = 1;
                Object objM1147e = viewTreeObserverOnGlobalLayoutListenerC0772y.f2428B.m1147e(this);
                EnumC1152a enumC1152a = EnumC1152a.f3788d;
                if (objM1147e != enumC1152a) {
                    objM1147e = c0891q;
                }
                return objM1147e == enumC1152a ? enumC1152a : c0891q;
            default:
                int i6 = this.f2319i;
                C0891q c0891q2 = C0891q.f2780a;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                    return c0891q2;
                }
                AbstractC1784a.m3205S(obj);
                ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y2 = this.f2320j.f2327d;
                this.f2319i = 1;
                Object objM4218a = viewTreeObserverOnGlobalLayoutListenerC0772y2.f2430C.m4218a(this);
                EnumC1152a enumC1152a2 = EnumC1152a.f3788d;
                if (objM4218a != enumC1152a2) {
                    objM4218a = c0891q2;
                }
                return objM4218a == enumC1152a2 ? enumC1152a2 : c0891q2;
        }
    }
}
