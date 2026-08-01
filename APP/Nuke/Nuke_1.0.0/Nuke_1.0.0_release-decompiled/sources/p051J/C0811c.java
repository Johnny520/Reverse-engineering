package p051J;

import android.graphics.Rect;
import java.lang.ref.WeakReference;
import p000A.C0001A0;
import p000A.C0012G;
import p000A.C0039U;
import p000A.C0042V0;
import p000A.C0075n;
import p000A.C0096x0;
import p041H0.AbstractC0601k;
import p046I.AbstractC0658e;
import p047I0.AbstractC0757q0;
import p047I0.C0761s0;
import p047I0.InterfaceC0686N0;
import p092S0.C1257J;
import p092S0.C1259L;
import p115X0.C1636k;
import p115X0.C1646u;
import p115X0.InterfaceC1641p;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p160f3.AbstractC2162v;
import p160f3.C2136g0;
import p172h3.EnumC2241a;
import p178i3.AbstractC2339t;
import p178i3.C2338s;
import p178i3.InterfaceC2333n;
import p204n0.C2684c;
import p238t.AbstractC3204b;

/* JADX INFO: renamed from: J.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0811c implements InterfaceC1641p {

    /* JADX INFO: renamed from: a */
    public C0824p f2606a;

    /* JADX INFO: renamed from: b */
    public C2136g0 f2607b;

    /* JADX INFO: renamed from: c */
    public C0829u f2608c;

    /* JADX INFO: renamed from: d */
    public C2338s f2609d;

    @Override // p115X0.InterfaceC1641p
    /* JADX INFO: renamed from: a */
    public final void mo1411a(C1646u c1646u, C1636k c1636k, C0075n c0075n, C0012G c0012g) {
        m1420j(new C0096x0(c1646u, this, c1636k, c0075n, c0012g));
    }

    @Override // p115X0.InterfaceC1641p
    /* JADX INFO: renamed from: b */
    public final void mo1412b() {
        m1420j(null);
    }

    @Override // p115X0.InterfaceC1641p
    /* JADX INFO: renamed from: c */
    public final void mo1413c(C2684c c2684c) {
        Rect rect;
        C0829u c0829u = this.f2608c;
        if (c0829u != null) {
            c0829u.f2679l = new Rect(AbstractC1784a.m3200N(c2684c.f8558a), AbstractC1784a.m3200N(c2684c.f8559b), AbstractC1784a.m3200N(c2684c.f8560c), AbstractC1784a.m3200N(c2684c.f8561d));
            if (!c0829u.f2677j.isEmpty() || (rect = c0829u.f2679l) == null) {
                return;
            }
            c0829u.f2668a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // p115X0.InterfaceC1641p
    /* JADX INFO: renamed from: d */
    public final void mo1414d() {
        InterfaceC0686N0 interfaceC0686N0;
        C0824p c0824p = this.f2606a;
        if (c0824p == null || (interfaceC0686N0 = (InterfaceC0686N0) AbstractC0601k.m1032h(c0824p, AbstractC0757q0.f2366p)) == null) {
            return;
        }
        ((C0761s0) interfaceC0686N0).m1274b();
    }

    @Override // p115X0.InterfaceC1641p
    /* JADX INFO: renamed from: e */
    public final void mo1415e() {
        InterfaceC0686N0 interfaceC0686N0;
        C0824p c0824p = this.f2606a;
        if (c0824p == null || (interfaceC0686N0 = (InterfaceC0686N0) AbstractC0601k.m1032h(c0824p, AbstractC0757q0.f2366p)) == null) {
            return;
        }
        ((C0761s0) interfaceC0686N0).m1273a();
    }

    @Override // p115X0.InterfaceC1641p
    /* JADX INFO: renamed from: f */
    public final void mo1416f(C1646u c1646u, C1646u c1646u2) {
        C0829u c0829u = this.f2608c;
        if (c0829u != null) {
            boolean z5 = (C1259L.m2334b(c0829u.f2675h.f5651b, c1646u2.f5651b) && AbstractC1665j.m2981a(c0829u.f2675h.f5652c, c1646u2.f5652c)) ? false : true;
            c0829u.f2675h = c1646u2;
            int size = c0829u.f2677j.size();
            for (int i5 = 0; i5 < size; i5++) {
                InputConnectionC0830v inputConnectionC0830v = (InputConnectionC0830v) ((WeakReference) c0829u.f2677j.get(i5)).get();
                if (inputConnectionC0830v != null) {
                    inputConnectionC0830v.f2687g = c1646u2;
                }
            }
            C0826r c0826r = c0829u.f2680m;
            synchronized (c0826r.f2651c) {
                c0826r.f2658j = null;
                c0826r.f2660l = null;
                c0826r.f2659k = null;
                c0826r.f2661m = null;
                c0826r.f2662n = null;
            }
            if (AbstractC1665j.m2981a(c1646u, c1646u2)) {
                if (z5) {
                    C0822n c0822n = c0829u.f2669b;
                    int iM2338f = C1259L.m2338f(c1646u2.f5651b);
                    int iM2337e = C1259L.m2337e(c1646u2.f5651b);
                    C1259L c1259l = c0829u.f2675h.f5652c;
                    int iM2338f2 = c1259l != null ? C1259L.m2338f(c1259l.f4538a) : -1;
                    C1259L c1259l2 = c0829u.f2675h.f5652c;
                    c0822n.m1454a().updateSelection(c0822n.f2641b, iM2338f, iM2337e, iM2338f2, c1259l2 != null ? C1259L.m2337e(c1259l2.f4538a) : -1);
                    return;
                }
                return;
            }
            if (c1646u != null && (!AbstractC1665j.m2981a(c1646u.f5650a.f4563e, c1646u2.f5650a.f4563e) || (C1259L.m2334b(c1646u.f5651b, c1646u2.f5651b) && !AbstractC1665j.m2981a(c1646u.f5652c, c1646u2.f5652c)))) {
                C0822n c0822n2 = c0829u.f2669b;
                c0822n2.m1454a().restartInput(c0822n2.f2641b);
                return;
            }
            int size2 = c0829u.f2677j.size();
            for (int i6 = 0; i6 < size2; i6++) {
                InputConnectionC0830v inputConnectionC0830v2 = (InputConnectionC0830v) ((WeakReference) c0829u.f2677j.get(i6)).get();
                if (inputConnectionC0830v2 != null) {
                    C1646u c1646u3 = c0829u.f2675h;
                    C0822n c0822n3 = c0829u.f2669b;
                    if (inputConnectionC0830v2.f2691k) {
                        inputConnectionC0830v2.f2687g = c1646u3;
                        if (inputConnectionC0830v2.f2689i) {
                            c0822n3.m1454a().updateExtractedText(c0822n3.f2641b, inputConnectionC0830v2.f2688h, AbstractC0825q.m1459d(c1646u3));
                        }
                        C1259L c1259l3 = c1646u3.f5652c;
                        long j5 = c1646u3.f5651b;
                        int iM2338f3 = c1259l3 != null ? C1259L.m2338f(c1259l3.f4538a) : -1;
                        C1259L c1259l4 = c1646u3.f5652c;
                        c0822n3.m1454a().updateSelection(c0822n3.f2641b, C1259L.m2338f(j5), C1259L.m2337e(j5), iM2338f3, c1259l4 != null ? C1259L.m2337e(c1259l4.f4538a) : -1);
                    }
                }
            }
        }
    }

    @Override // p115X0.InterfaceC1641p
    /* JADX INFO: renamed from: g */
    public final void mo1417g() {
        C2136g0 c2136g0 = this.f2607b;
        if (c2136g0 != null) {
            c2136g0.mo3905c(null);
        }
        this.f2607b = null;
        InterfaceC2333n interfaceC2333nM1419i = m1419i();
        if (interfaceC2333nM1419i != null) {
            C2338s c2338s = (C2338s) interfaceC2333nM1419i;
            synchronized (c2338s) {
                c2338s.m4163u(c2338s.m4157o() + ((long) c2338s.f7623n), c2338s.f7622m, c2338s.m4157o() + ((long) c2338s.f7623n), c2338s.m4157o() + ((long) c2338s.f7623n) + ((long) c2338s.f7624o));
            }
        }
    }

    @Override // p115X0.InterfaceC1641p
    /* JADX INFO: renamed from: h */
    public final void mo1418h(C1646u c1646u, C0042V0 c0042v0, C1257J c1257j, C0001A0 c0001a0, C2684c c2684c, C2684c c2684c2) {
        C0829u c0829u = this.f2608c;
        if (c0829u != null) {
            C0826r c0826r = c0829u.f2680m;
            synchronized (c0826r.f2651c) {
                try {
                    c0826r.f2658j = c1646u;
                    c0826r.f2660l = c0042v0;
                    c0826r.f2659k = c1257j;
                    c0826r.f2661m = c2684c;
                    c0826r.f2662n = c2684c2;
                    if (c0826r.f2653e || c0826r.f2652d) {
                        c0826r.m1470a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC2333n m1419i() {
        C2338s c2338s = this.f2609d;
        if (c2338s != null) {
            return c2338s;
        }
        if (!AbstractC0658e.f2084a) {
            return null;
        }
        C2338s c2338sM4165a = AbstractC2339t.m4165a(2, EnumC2241a.f7353f);
        this.f2609d = c2338sM4165a;
        return c2338sM4165a;
    }

    /* JADX INFO: renamed from: j */
    public final void m1420j(C0096x0 c0096x0) {
        C0824p c0824p = this.f2606a;
        if (c0824p == null) {
            return;
        }
        this.f2607b = c0824p.f7199q ? AbstractC2162v.m3994p(c0824p.m4023x0(), null, new C0039U(c0824p, new C0810b(c0096x0, this, c0824p, c2136g0, 0), c2136g0, 6), 1) : null;
    }

    /* JADX INFO: renamed from: k */
    public final void m1421k(C0824p c0824p) {
        if (this.f2606a != c0824p) {
            AbstractC3204b.m5477c("Expected textInputModifierNode to be " + c0824p + " but was " + this.f2606a);
        }
        this.f2606a = null;
    }
}
