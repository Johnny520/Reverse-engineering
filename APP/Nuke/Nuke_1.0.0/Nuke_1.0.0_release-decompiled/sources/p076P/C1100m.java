package p076P;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p081Q.AbstractC1164g;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p153e1.C2010f;
import p160f3.InterfaceC2160t;
import p203n.C2647c;
import p203n.C2650d0;
import p232s.C3155b;
import p232s.C3157d;
import p232s.C3159f;
import p232s.C3164k;
import p232s.InterfaceC3161h;

/* JADX INFO: renamed from: P.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1100m extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public int f3545h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2647c f3546i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ float f3547j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f3548k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC3161h f3549l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1100m(C2647c c2647c, float f2, boolean z5, AbstractC1072S abstractC1072S, InterfaceC3161h interfaceC3161h, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f3546i = c2647c;
        this.f3547j = f2;
        this.f3548k = z5;
        this.f3549l = interfaceC3161h;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C1100m) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        return new C1100m(this.f3546i, this.f3547j, this.f3548k, null, this.f3549l, interfaceC1046d);
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        Object objM4606e;
        int i5 = this.f3545h;
        C0891q c0891q = C0891q.f2780a;
        if (i5 != 0) {
            if (i5 == 1) {
                AbstractC1784a.m3205S(obj);
                return c0891q;
            }
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1784a.m3205S(obj);
            return c0891q;
        }
        AbstractC1784a.m3205S(obj);
        C2647c c2647c = this.f3546i;
        float f2 = ((C2010f) c2647c.f8430e.getValue()).f6732d;
        float f5 = this.f3547j;
        if (!C2010f.m3696b(f2, f5)) {
            boolean z5 = this.f3548k;
            EnumC1152a enumC1152a = EnumC1152a.f3788d;
            if (z5) {
                float f6 = ((C2010f) c2647c.f8430e.getValue()).f6732d;
                C2650d0 c2650d0 = null;
                Object c3164k = C2010f.m3696b(f6, 0.0f) ? new C3164k(0L) : C2010f.m3696b(f6, 0.0f) ? new C3159f() : C2010f.m3696b(f6, 0.0f) ? new C3157d() : null;
                this.f3545h = 2;
                C2650d0 c2650d02 = AbstractC1164g.f3809b;
                C2650d0 c2650d03 = AbstractC1164g.f3808a;
                InterfaceC3161h interfaceC3161h = this.f3549l;
                if (interfaceC3161h != null) {
                    if ((interfaceC3161h instanceof C3164k) || (interfaceC3161h instanceof C3155b) || (interfaceC3161h instanceof C3159f) || (interfaceC3161h instanceof C3157d)) {
                        c2650d0 = c2650d03;
                    }
                } else if (c3164k != null) {
                    if (!(c3164k instanceof C3164k) && !(c3164k instanceof C3155b)) {
                        if (c3164k instanceof C3159f) {
                            c2650d0 = AbstractC1164g.f3810c;
                        } else if (c3164k instanceof C3157d) {
                        }
                    }
                    c2650d0 = c2650d02;
                }
                C2650d0 c2650d04 = c2650d0;
                C2647c c2647c2 = this.f3546i;
                if (c2650d04 == null ? (objM4606e = c2647c2.m4606e(this, new C2010f(f5))) != enumC1152a : (objM4606e = C2647c.m4604c(c2647c2, new C2010f(f5), c2650d04, null, this, 12)) != enumC1152a) {
                    objM4606e = c0891q;
                }
                if (objM4606e == enumC1152a) {
                }
            } else {
                C2010f c2010f = new C2010f(f5);
                this.f3545h = 1;
                if (c2647c.m4606e(this, c2010f) == enumC1152a) {
                }
            }
            return enumC1152a;
        }
        return c0891q;
    }
}
