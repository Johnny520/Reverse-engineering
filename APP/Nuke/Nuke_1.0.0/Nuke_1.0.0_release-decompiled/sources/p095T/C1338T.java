package p095T;

import com.bumptech.glide.AbstractC1924f;
import java.util.concurrent.CancellationException;
import p000A.C0073m;
import p074O2.InterfaceC1049g;
import p074O2.InterfaceC1050h;
import p074O2.InterfaceC1051i;
import p112W2.InterfaceC1603e;
import p128a.AbstractC1785a;
import p160f3.AbstractC2162v;
import p160f3.C2136g0;
import p160f3.C2155q;
import p160f3.InterfaceC2157r;
import p163g0.C2172d;
import p190k3.C2455c;

/* JADX INFO: renamed from: T.T */
/* JADX INFO: loaded from: classes.dex */
public final class C1338T implements InterfaceC1306C0, InterfaceC2157r {

    /* JADX INFO: renamed from: d */
    public final InterfaceC1051i f4775d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1603e f4776e;

    /* JADX INFO: renamed from: f */
    public final C2455c f4777f;

    /* JADX INFO: renamed from: g */
    public C2136g0 f4778g;

    public C1338T(InterfaceC1051i interfaceC1051i, InterfaceC1603e interfaceC1603e) {
        this.f4775d = interfaceC1051i;
        this.f4776e = interfaceC1603e;
        this.f4777f = AbstractC2162v.m3979a(interfaceC1051i.mo1168m(this));
    }

    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: A */
    public final Object mo1165A(InterfaceC1603e interfaceC1603e, Object obj) {
        return interfaceC1603e.mo0g(obj, this);
    }

    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: C */
    public final InterfaceC1049g mo1166C(InterfaceC1050h interfaceC1050h) {
        return AbstractC1785a.m3250j(this, interfaceC1050h);
    }

    @Override // p095T.InterfaceC1306C0
    /* JADX INFO: renamed from: a */
    public final void mo2401a() {
        C2136g0 c2136g0 = this.f4778g;
        if (c2136g0 != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            c2136g0.mo3905c(cancellationException);
        }
        this.f4778g = AbstractC2162v.m3994p(this.f4777f, null, this.f4776e, 3);
    }

    @Override // p095T.InterfaceC1306C0
    /* JADX INFO: renamed from: d */
    public final void mo2402d() {
        C2136g0 c2136g0 = this.f4778g;
        if (c2136g0 != null) {
            c2136g0.mo3946z(new C1321K(1));
        }
        this.f4778g = null;
    }

    @Override // p095T.InterfaceC1306C0
    /* JADX INFO: renamed from: e */
    public final void mo2403e() {
        C2136g0 c2136g0 = this.f4778g;
        if (c2136g0 != null) {
            c2136g0.mo3946z(new C1321K(1));
        }
        this.f4778g = null;
    }

    @Override // p074O2.InterfaceC1049g
    public final InterfaceC1050h getKey() {
        return C2155q.f7101d;
    }

    @Override // p160f3.InterfaceC2157r
    /* JADX INFO: renamed from: h */
    public final void mo2409h(InterfaceC1051i interfaceC1051i, Throwable th) throws Throwable {
        C2172d c2172d = (C2172d) interfaceC1051i.mo1166C(C2172d.f7131e);
        if (c2172d != null) {
            AbstractC1924f.m3491A(th, new C0073m(23, c2172d, this));
        }
        InterfaceC2157r interfaceC2157r = (InterfaceC2157r) this.f4775d.mo1166C(C2155q.f7101d);
        if (interfaceC2157r == null) {
            throw th;
        }
        interfaceC2157r.mo2409h(interfaceC1051i, th);
    }

    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: j */
    public final InterfaceC1051i mo1167j(InterfaceC1050h interfaceC1050h) {
        return AbstractC1785a.m3253n(this, interfaceC1050h);
    }

    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: m */
    public final InterfaceC1051i mo1168m(InterfaceC1051i interfaceC1051i) {
        return AbstractC1785a.m3254o(this, interfaceC1051i);
    }
}
