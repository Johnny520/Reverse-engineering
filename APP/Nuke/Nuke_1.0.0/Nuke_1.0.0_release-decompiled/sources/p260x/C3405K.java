package p260x;

import p000A.C0038T0;
import p000A.C0098y0;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p160f3.InterfaceC2160t;
import p216p.EnumC2824Q;
import p255w.C3373d;
import p255w.C3385p;

/* JADX INFO: renamed from: x.K */
/* JADX INFO: loaded from: classes.dex */
public final class C3405K extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public int f10643h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3406L f10644i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f10645j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3405K(C3406L c3406l, int i5, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f10644i = c3406l;
        this.f10645j = i5;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C3405K) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        return new C3405K(this.f10644i, this.f10645j, interfaceC1046d);
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) throws Throwable {
        int i5 = this.f10643h;
        C0891q c0891q = C0891q.f2780a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1784a.m3205S(obj);
            return c0891q;
        }
        AbstractC1784a.m3205S(obj);
        C3373d c3373d = this.f10644i.f10647s;
        this.f10643h = 1;
        C3385p c3385p = c3373d.f10488b;
        C0038T0 c0038t0 = C3385p.f10558x;
        c3385p.getClass();
        Object objMo12c = c3385p.mo12c(EnumC2824Q.f8890d, new C0098y0(c3385p, this.f10645j, (InterfaceC1046d) null), this);
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        if (objMo12c != enumC1152a) {
            objMo12c = c0891q;
        }
        if (objMo12c != enumC1152a) {
            objMo12c = c0891q;
        }
        return objMo12c == enumC1152a ? enumC1152a : c0891q;
    }
}
