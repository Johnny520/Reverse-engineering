package p095T;

import com.bumptech.glide.AbstractC1924f;
import p000A.C0073m;
import p074O2.AbstractC1043a;
import p074O2.InterfaceC1051i;
import p160f3.C2155q;
import p160f3.InterfaceC2157r;
import p163g0.C2172d;

/* JADX INFO: renamed from: T.E0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1310E0 extends AbstractC1043a implements InterfaceC2157r {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2172d f4680e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1312F0 f4681f;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1310E0(C2172d c2172d, C1312F0 c1312f0) {
        C2155q c2155q = C2155q.f7101d;
        this.f4680e = c2172d;
        this.f4681f = c1312f0;
        super(c2155q);
    }

    @Override // p160f3.InterfaceC2157r
    /* JADX INFO: renamed from: h */
    public final void mo2409h(InterfaceC1051i interfaceC1051i, Throwable th) throws Throwable {
        C2172d c2172d = this.f4680e;
        C1312F0 c1312f0 = this.f4681f;
        AbstractC1924f.m3491A(th, new C0073m(23, c2172d, c1312f0));
        InterfaceC2157r interfaceC2157r = (InterfaceC2157r) c1312f0.f4686d.mo1166C(C2155q.f7101d);
        if (interfaceC2157r == null) {
            throw th;
        }
        interfaceC2157r.mo2409h(interfaceC1051i, th);
    }
}
