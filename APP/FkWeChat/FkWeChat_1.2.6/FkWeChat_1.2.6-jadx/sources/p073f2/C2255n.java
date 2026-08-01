package p073f2;

import p024b9.AbstractC1061t;
import p117i.C3037a0;
import p117i.C3076o0;
import p135j2.InterfaceC3578w;
import p165l1.InterfaceC4507m;
import p349y0.C9508c;

/* JADX INFO: renamed from: f2.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C2255n {

    /* JADX INFO: renamed from: a */
    public final C9508c f6193a = new C9508c(new C2253m[16], 0);

    /* JADX INFO: renamed from: b */
    public final C3076o0 f6194b = new C3076o0(10);

    /* JADX INFO: renamed from: a */
    public boolean mo8179a(C3037a0 c3037a0, InterfaceC3578w interfaceC3578w, C2241g c2241g, boolean z10) {
        C9508c c9508c = this.f6193a;
        Object[] objArr = c9508c.f32299q;
        int iM37039l = c9508c.m37039l();
        boolean z11 = false;
        for (int i10 = 0; i10 < iM37039l; i10++) {
            z11 = ((C2253m) objArr[i10]).mo8179a(c3037a0, interfaceC3578w, c2241g, z10) || z11;
        }
        return z11;
    }

    /* JADX INFO: renamed from: b */
    public void mo8180b(C2241g c2241g) {
        int iM37039l = this.f6193a.m37039l();
        while (true) {
            iM37039l--;
            if (-1 >= iM37039l) {
                return;
            }
            if (((C2253m) this.f6193a.f32299q[iM37039l]).m8187l().m8996f()) {
                this.f6193a.m37045r(iM37039l);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8190c() {
        this.f6193a.m37035h();
    }

    /* JADX INFO: renamed from: d */
    public void mo8181d() {
        C9508c c9508c = this.f6193a;
        Object[] objArr = c9508c.f32299q;
        int iM37039l = c9508c.m37039l();
        for (int i10 = 0; i10 < iM37039l; i10++) {
            ((C2253m) objArr[i10]).mo8181d();
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean mo8182e(C2241g c2241g) {
        C9508c c9508c = this.f6193a;
        Object[] objArr = c9508c.f32299q;
        int iM37039l = c9508c.m37039l();
        boolean z10 = false;
        for (int i10 = 0; i10 < iM37039l; i10++) {
            z10 = ((C2253m) objArr[i10]).mo8182e(c2241g) || z10;
        }
        mo8180b(c2241g);
        return z10;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo8183f(C3037a0 c3037a0, InterfaceC3578w interfaceC3578w, C2241g c2241g, boolean z10) {
        C9508c c9508c = this.f6193a;
        Object[] objArr = c9508c.f32299q;
        int iM37039l = c9508c.m37039l();
        boolean z11 = false;
        for (int i10 = 0; i10 < iM37039l; i10++) {
            z11 = ((C2253m) objArr[i10]).mo8183f(c3037a0, interfaceC3578w, c2241g, z10) || z11;
        }
        return z11;
    }

    /* JADX INFO: renamed from: g */
    public final C9508c m8191g() {
        return this.f6193a;
    }

    /* JADX INFO: renamed from: h */
    public void mo8184h(long j10, C3076o0 c3076o0) {
        C9508c c9508c = this.f6193a;
        Object[] objArr = c9508c.f32299q;
        int iM37039l = c9508c.m37039l();
        for (int i10 = 0; i10 < iM37039l; i10++) {
            ((C2253m) objArr[i10]).mo8184h(j10, c3076o0);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m8192i(InterfaceC4507m.c cVar) {
        this.f6194b.m11468u();
        this.f6194b.m11461n(this);
        while (this.f6194b.m11590h()) {
            C2255n c2255n = (C2255n) this.f6194b.m11454B(r0.m11587e() - 1);
            int i10 = 0;
            while (i10 < c2255n.f6193a.m37039l()) {
                C2253m c2253m = (C2253m) c2255n.f6193a.f32299q[i10];
                if (AbstractC1061t.m3842c(c2253m.m8186k(), cVar)) {
                    c2255n.f6193a.m37043p(c2253m);
                    c2253m.mo8181d();
                } else {
                    this.f6194b.m11461n(c2253m);
                    i10++;
                }
            }
        }
    }
}
