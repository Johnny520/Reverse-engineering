package p058L;

import com.bumptech.glide.AbstractC1923e;
import p000A.C0036S0;
import p000A.C0042V0;
import p000A.C0078o0;
import p000A.EnumC0050a0;
import p000A.EnumC0052b0;
import p000A.InterfaceC0092v0;
import p029F0.C0363A;
import p092S0.AbstractC1251D;
import p092S0.C1259L;
import p095T.C1366i0;
import p115X0.C1646u;
import p117X2.AbstractC1665j;
import p204n0.C2683b;
import p256w0.InterfaceC3388a;

/* JADX INFO: renamed from: L.U */
/* JADX INFO: loaded from: classes.dex */
public final class C0918U implements InterfaceC0092v0 {

    /* JADX INFO: renamed from: b */
    public C1259L f2857b;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0920W f2859d;

    /* JADX INFO: renamed from: a */
    public boolean f2856a = true;

    /* JADX INFO: renamed from: c */
    public C0363A f2858c = C0950v.f2989d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0918U(C0920W c0920w) {
        this.f2859d = c0920w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000A.InterfaceC0092v0
    /* JADX INFO: renamed from: a */
    public final void mo128a(long j5, C0363A c0363a) {
        long j6;
        C0036S0 c0036s0M123d;
        C0036S0 c0036s0M123d2;
        C0920W c0920w = this.f2859d;
        C1366i0 c1366i0 = c0920w.f2881q;
        if (c0920w.m1936k() && ((EnumC0050a0) c1366i0.getValue()) == null) {
            c1366i0.setValue(EnumC0050a0.f206f);
            c0920w.f2883s = -1;
            this.f2856a = true;
            this.f2858c = c0363a;
            c0920w.m1940o();
            C0078o0 c0078o0 = c0920w.f2868d;
            if (c0078o0 == null || (c0036s0M123d2 = c0078o0.m123d()) == null || !c0036s0M123d2.m22c(j5)) {
                j6 = j5;
                C0078o0 c0078o02 = c0920w.f2868d;
                if (c0078o02 != null && (c0036s0M123d = c0078o02.m123d()) != null) {
                    int iM21b = c0036s0M123d.m21b(j6, true);
                    c0920w.f2866b.m58b(iM21b);
                    C1646u c1646uM1929e = C0920W.m1929e(c0920w.m1939n().f5650a, AbstractC1251D.m2313b(iM21b, iM21b));
                    c0920w.m1933h(false);
                    InterfaceC3388a interfaceC3388a = c0920w.f2874j;
                    if (interfaceC3388a != null) {
                        interfaceC3388a.mo1172a(9);
                    }
                    c0920w.f2867c.mo1h(c1646uM1929e);
                    c0920w.f2886v = new C1259L(c1646uM1929e.f5651b);
                }
                this.f2856a = false;
            } else {
                if (c0920w.m1939n().f5650a.f4563e.length() == 0) {
                    return;
                }
                c0920w.m1933h(false);
                long jM1928c = C0920W.m1928c(c0920w, C1646u.m2944a(c0920w.m1939n(), null, C1259L.f4536b, 5), j5, true, false, this.f2858c, true);
                j6 = j5;
                c0920w.f2879o = new C1259L(jM1928c);
                this.f2857b = new C1259L(jM1928c);
            }
            c0920w.m1942q(EnumC0052b0.f211d);
            c0920w.f2878n = j6;
            c0920w.f2882r.setValue(new C2683b(j6));
            c0920w.f2880p = 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000A.InterfaceC0092v0
    /* JADX INFO: renamed from: b */
    public final void mo129b() {
        m1925f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    @Override // p000A.InterfaceC0092v0
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo132e(long j5) {
        C0036S0 c0036s0M123d;
        long jM1928c;
        C0920W c0920w = this.f2859d;
        if (!c0920w.m1936k() || c0920w.m1939n().f5650a.f4563e.length() == 0) {
            return;
        }
        c0920w.f2880p = C2683b.m4647e(c0920w.f2880p, j5);
        C0078o0 c0078o0 = c0920w.f2868d;
        if (c0078o0 != null && (c0036s0M123d = c0078o0.m123d()) != null) {
            c0920w.f2882r.setValue(new C2683b(C2683b.m4647e(c0920w.f2878n, c0920w.f2880p)));
            if (c0920w.f2879o == null) {
                C2683b c2683bM1934i = c0920w.m1934i();
                AbstractC1665j.m2982b(c2683bM1934i);
                if (c0036s0M123d.m22c(c2683bM1934i.f8556a)) {
                    C1259L c1259l = c0920w.f2879o;
                    int iM21b = c1259l != null ? (int) (c1259l.f4538a >> 32) : c0036s0M123d.m21b(c0920w.f2878n, false);
                    C2683b c2683bM1934i2 = c0920w.m1934i();
                    AbstractC1665j.m2982b(c2683bM1934i2);
                    int iM21b2 = c0036s0M123d.m21b(c2683bM1934i2.f8556a, false);
                    if (c0920w.f2879o == null && iM21b == iM21b2) {
                        return;
                    }
                    C1646u c1646uM1939n = c0920w.m1939n();
                    C2683b c2683bM1934i3 = c0920w.m1934i();
                    AbstractC1665j.m2982b(c2683bM1934i3);
                    jM1928c = C0920W.m1928c(c0920w, c1646uM1939n, c2683bM1934i3.f8556a, false, false, this.f2858c, true);
                } else {
                    C0042V0 c0042v0 = c0920w.f2866b;
                    int iM21b3 = c0036s0M123d.m21b(c0920w.f2878n, true);
                    c0042v0.m58b(iM21b3);
                    C0042V0 c0042v02 = c0920w.f2866b;
                    C2683b c2683bM1934i4 = c0920w.m1934i();
                    AbstractC1665j.m2982b(c2683bM1934i4);
                    int iM21b4 = c0036s0M123d.m21b(c2683bM1934i4.f8556a, true);
                    c0042v02.m58b(iM21b4);
                    C0363A c0363a = iM21b3 == iM21b4 ? C0950v.f2989d : C0950v.f2990e;
                    C1646u c1646uM1939n2 = c0920w.m1939n();
                    C2683b c2683bM1934i5 = c0920w.m1934i();
                    AbstractC1665j.m2982b(c2683bM1934i5);
                    jM1928c = C0920W.m1928c(c0920w, c1646uM1939n2, c2683bM1934i5.f8556a, false, false, c0363a, true);
                }
                this.f2857b = new C1259L(jM1928c);
                if (!C1259L.m2333a(jM1928c, c0920w.f2879o)) {
                    this.f2856a = false;
                }
            }
        }
        c0920w.m1945t(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m1925f() {
        C0920W c0920w = this.f2859d;
        c0920w.f2881q.setValue(null);
        c0920w.f2882r.setValue(null);
        this.f2858c = C0950v.f2989d;
        c0920w.m1945t(true);
        C1259L c1259l = this.f2857b;
        boolean zM2335c = C1259L.m2335c(c1259l != null ? c1259l.f4538a : c0920w.m1939n().f5651b);
        c0920w.m1942q(zM2335c ? EnumC0052b0.f213f : EnumC0052b0.f212e);
        C0078o0 c0078o0 = c0920w.f2868d;
        if (c0078o0 != null) {
            c0078o0.f349m.setValue(Boolean.valueOf(!zM2335c && AbstractC1923e.m3450J(c0920w, true)));
        }
        C0078o0 c0078o02 = c0920w.f2868d;
        if (c0078o02 != null) {
            c0078o02.f350n.setValue(Boolean.valueOf(!zM2335c && AbstractC1923e.m3450J(c0920w, false)));
        }
        C0078o0 c0078o03 = c0920w.f2868d;
        if (c0078o03 != null) {
            c0078o03.f351o.setValue(Boolean.valueOf(zM2335c && AbstractC1923e.m3450J(c0920w, true)));
        }
        if (this.f2856a) {
            C0920W.m1927b(c0920w, c0920w.f2879o);
        }
        c0920w.f2879o = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000A.InterfaceC0092v0
    public final void onCancel() {
        m1925f();
    }

    @Override // p000A.InterfaceC0092v0
    /* JADX INFO: renamed from: c */
    public final void mo130c() {
    }

    @Override // p000A.InterfaceC0092v0
    /* JADX INFO: renamed from: d */
    public final void mo131d() {
    }
}
