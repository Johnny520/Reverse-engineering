package p216p;

import p000A.C0009E0;
import p000A.C0010F;
import p000A.C0073m;
import p023E0.AbstractC0277a;
import p028F.C0354o;
import p034G.C0466k;
import p041H0.AbstractC0596h0;
import p041H0.AbstractC0599j;
import p041H0.AbstractC0601k;
import p041H0.C0564I;
import p041H0.C0590e0;
import p041H0.InterfaceC0558E0;
import p041H0.InterfaceC0595h;
import p041H0.InterfaceC0604l0;
import p041H0.InterfaceC0607n;
import p041H0.InterfaceC0632z0;
import p077P0.AbstractC1124k;
import p077P0.AbstractC1132s;
import p077P0.AbstractC1134u;
import p077P0.C1114a;
import p077P0.C1135v;
import p077P0.InterfaceC1136w;
import p105V.C1483e;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p137b3.InterfaceC1855c;
import p160f3.AbstractC2162v;
import p160f3.C2155q;
import p160f3.InterfaceC2115S;
import p169h0.AbstractC2206o;
import p170h1.C2229t;
import p190k3.C2455c;
import p198m0.C2567A;
import p232s.C3157d;
import p232s.C3158e;
import p232s.C3162i;
import p232s.InterfaceC3161h;
import p260x.C3395A;

/* JADX INFO: renamed from: p.D */
/* JADX INFO: loaded from: classes.dex */
public final class C2811D extends AbstractC0599j implements InterfaceC0632z0, InterfaceC0607n, InterfaceC0595h, InterfaceC0604l0, InterfaceC0558E0 {

    /* JADX INFO: renamed from: z */
    public static final C2835b f8852z = new C2835b();

    /* JADX INFO: renamed from: t */
    public C3162i f8853t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC1601c f8854u;

    /* JADX INFO: renamed from: v */
    public C3157d f8855v;

    /* JADX INFO: renamed from: w */
    public C3395A f8856w;

    /* JADX INFO: renamed from: x */
    public AbstractC0596h0 f8857x;

    /* JADX INFO: renamed from: y */
    public final C2567A f8858y;

    public C2811D(C3162i c3162i, int i5, C0009E0 c0009e0) {
        this.f8853t = c3162i;
        this.f8854u = c0009e0;
        C2567A c2567a = new C2567A(i5, new C2229t(2, this, C2811D.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0, 1), 10);
        m1021J0(c2567a);
        this.f8858y = c2567a;
    }

    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: D0 */
    public final void mo4022D0() {
        C3395A c3395a = this.f8856w;
        if (c3395a != null) {
            c3395a.m5672b();
        }
        this.f8856w = null;
    }

    /* JADX INFO: renamed from: M0 */
    public final void m5014M0(C3162i c3162i, InterfaceC3161h interfaceC3161h) {
        if (!this.f7199q) {
            c3162i.m5430b(interfaceC3161h);
            return;
        }
        InterfaceC2115S interfaceC2115S = (InterfaceC2115S) ((C2455c) m4023x0()).f7926d.mo1166C(C2155q.f7102e);
        AbstractC2162v.m3994p(m4023x0(), null, new C0466k(c3162i, interfaceC3161h, interfaceC2115S != null ? interfaceC2115S.mo3909w(new C0010F(17, c3162i, interfaceC3161h)) : null, null, 9), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [V.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX INFO: renamed from: N0 */
    public final void m5015N0() {
        C0590e0 c0590e0;
        if (this.f7199q) {
            if (!this.f7186d.f7199q) {
                AbstractC0277a.m483b("visitAncestors called on an unattached node");
            }
            AbstractC2206o abstractC2206o = this.f7186d.f7190h;
            C0564I c0564iM1044t = AbstractC0601k.m1044t(this);
            while (c0564iM1044t != null) {
                if ((c0564iM1044t.f1699J.f1896f.f7189g & 262144) != 0) {
                    while (abstractC2206o != null) {
                        if ((abstractC2206o.f7188f & 262144) != 0) {
                            ?? M1029e = abstractC2206o;
                            ?? c1483e = 0;
                            while (M1029e != 0) {
                                if (M1029e instanceof InterfaceC0558E0) {
                                    if (AbstractC2812E.f8859r.equals(((InterfaceC0558E0) M1029e).mo146s())) {
                                        return;
                                    }
                                } else if ((M1029e.f7188f & 262144) != 0 && (M1029e instanceof AbstractC0599j)) {
                                    AbstractC2206o abstractC2206o2 = ((AbstractC0599j) M1029e).f1943s;
                                    int i5 = 0;
                                    M1029e = M1029e;
                                    c1483e = c1483e;
                                    while (abstractC2206o2 != null) {
                                        if ((abstractC2206o2.f7188f & 262144) != 0) {
                                            i5++;
                                            c1483e = c1483e;
                                            if (i5 == 1) {
                                                M1029e = abstractC2206o2;
                                            } else {
                                                if (c1483e == 0) {
                                                    c1483e = new C1483e(new AbstractC2206o[16]);
                                                }
                                                if (M1029e != 0) {
                                                    c1483e.m2753b(M1029e);
                                                    M1029e = 0;
                                                }
                                                c1483e.m2753b(abstractC2206o2);
                                            }
                                        }
                                        abstractC2206o2 = abstractC2206o2.f7191i;
                                        M1029e = M1029e;
                                        c1483e = c1483e;
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                M1029e = AbstractC0601k.m1029e(c1483e);
                            }
                        }
                        abstractC2206o = abstractC2206o.f7190h;
                    }
                }
                c0564iM1044t = c0564iM1044t.m839u();
                abstractC2206o = (c0564iM1044t == null || (c0590e0 = c0564iM1044t.f1699J) == null) ? null : c0590e0.f1895e;
            }
        }
    }

    @Override // p041H0.InterfaceC0604l0
    /* JADX INFO: renamed from: O */
    public final void mo1051O() {
        C1675t c1675t = new C1675t();
        AbstractC0601k.m1040p(this, new C0073m(26, c1675t, this));
        C3395A c3395a = (C3395A) c1675t.f5710e;
        if (this.f8858y.m4488O0().m4540a()) {
            C3395A c3395a2 = this.f8856w;
            if (c3395a2 != null) {
                c3395a2.m5672b();
            }
            if (c3395a != null) {
                c3395a.m5671a();
            } else {
                c3395a = null;
            }
            this.f8856w = c3395a;
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final void m5016O0(C3162i c3162i) {
        C3157d c3157d;
        if (AbstractC1665j.m2981a(this.f8853t, c3162i)) {
            return;
        }
        C3162i c3162i2 = this.f8853t;
        if (c3162i2 != null && (c3157d = this.f8855v) != null) {
            c3162i2.m5430b(new C3158e(c3157d));
        }
        this.f8855v = null;
        this.f8853t = c3162i;
    }

    @Override // p041H0.InterfaceC0607n
    /* JADX INFO: renamed from: P */
    public final void mo654P(AbstractC0596h0 abstractC0596h0) {
        this.f8857x = abstractC0596h0;
        if (this.f8858y.m4488O0().m4540a()) {
            if (!abstractC0596h0.mo981R0().f7199q) {
                m5015N0();
                return;
            }
            AbstractC0596h0 abstractC0596h02 = this.f8857x;
            if (abstractC0596h02 == null || !abstractC0596h02.mo981R0().f7199q) {
                return;
            }
            m5015N0();
        }
    }

    @Override // p041H0.InterfaceC0632z0
    /* JADX INFO: renamed from: X */
    public final void mo943X(InterfaceC1136w interfaceC1136w) {
        boolean zM4540a = this.f8858y.m4488O0().m4540a();
        InterfaceC1855c[] interfaceC1855cArr = AbstractC1134u.f3766a;
        C1135v c1135v = AbstractC1132s.f3748k;
        InterfaceC1855c interfaceC1855c = AbstractC1134u.f3766a[4];
        interfaceC1136w.mo1128a(c1135v, Boolean.valueOf(zM4540a));
        interfaceC1136w.mo1128a(AbstractC1124k.f3698w, new C1114a(null, new C0354o(0, this, C2811D.class, "requestFocus", "requestFocus()Z", 0, 0, 3)));
    }

    @Override // p041H0.InterfaceC0558E0
    /* JADX INFO: renamed from: s */
    public final Object mo146s() {
        return f8852z;
    }

    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: y0 */
    public final boolean mo656y0() {
        return false;
    }
}
