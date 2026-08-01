package p227r;

import java.util.concurrent.CancellationException;
import p056K2.C0891q;
import p058L.C0917T;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p160f3.AbstractC2162v;
import p160f3.InterfaceC2115S;
import p160f3.InterfaceC2160t;
import p216p.EnumC2824Q;

/* JADX INFO: renamed from: r.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2990h extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public int f9464h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f9465i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C2992i f9466j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2962L0 f9467k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC2982d f9468l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ long f9469m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2990h(C2992i c2992i, C2962L0 c2962l0, InterfaceC2982d interfaceC2982d, long j5, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f9466j = c2992i;
        this.f9467k = c2962l0;
        this.f9468l = interfaceC2982d;
        this.f9469m = j5;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C2990h) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        C2990h c2990h = new C2990h(this.f9466j, this.f9467k, this.f9468l, this.f9469m, interfaceC1046d);
        c2990h.f9465i = obj;
        return c2990h;
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        C2992i c2992i = this.f9466j;
        C2976a c2976a = c2992i.f9474v;
        int i5 = this.f9464h;
        try {
            try {
                if (i5 == 0) {
                    AbstractC1784a.m3205S(obj);
                    InterfaceC2115S interfaceC2115SM3988j = AbstractC2162v.m3988j(((InterfaceC2160t) this.f9465i).mo1202f());
                    c2992i.f9477y = true;
                    C2940A0 c2940a0 = c2992i.f9471s;
                    EnumC2824Q enumC2824Q = EnumC2824Q.f8890d;
                    C0917T c0917t = new C0917T(this.f9467k, c2992i, this.f9468l, this.f9469m, interfaceC2115SM3988j, null);
                    this.f9464h = 1;
                    Object objM5146f = c2940a0.m5146f(enumC2824Q, c0917t, this);
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
                c2976a.m5173b();
                c2992i.f9477y = false;
                c2976a.m5172a(null);
                c2992i.f9475w = false;
                return C0891q.f2780a;
            } catch (CancellationException e5) {
                throw e5;
            }
        } catch (Throwable th) {
            c2992i.f9477y = false;
            c2976a.m5172a(null);
            c2992i.f9475w = false;
            throw th;
        }
    }
}
