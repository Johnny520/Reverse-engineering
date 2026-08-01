package p058L;

import p000A.C0036S0;
import p000A.C0042V0;
import p000A.C0078o0;
import p000A.EnumC0050a0;
import p000A.InterfaceC0092v0;
import p029F0.C0363A;
import p092S0.AbstractC1251D;
import p092S0.C1259L;
import p117X2.AbstractC1665j;
import p204n0.C2683b;
import p256w0.InterfaceC3388a;

/* JADX INFO: renamed from: L.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C0915Q implements InterfaceC0092v0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0920W f2845a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0915Q(C0920W c0920w) {
        this.f2845a = c0920w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000A.InterfaceC0092v0
    /* JADX INFO: renamed from: a */
    public final void mo128a(long j5, C0363A c0363a) {
        C0036S0 c0036s0M123d;
        C0920W c0920w = this.f2845a;
        long jM1906a = AbstractC0903E.m1906a(c0920w.m1937l(true));
        C0078o0 c0078o0 = c0920w.f2868d;
        if (c0078o0 == null || (c0036s0M123d = c0078o0.m123d()) == null) {
            return;
        }
        long jM24e = c0036s0M123d.m24e(jM1906a);
        c0920w.f2878n = jM24e;
        c0920w.f2882r.setValue(new C2683b(jM24e));
        c0920w.f2880p = 0L;
        c0920w.f2881q.setValue(EnumC0050a0.f204d);
        c0920w.m1945t(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000A.InterfaceC0092v0
    /* JADX INFO: renamed from: b */
    public final void mo129b() {
        C0920W c0920w = this.f2845a;
        c0920w.f2881q.setValue(null);
        c0920w.f2882r.setValue(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000A.InterfaceC0092v0
    /* JADX INFO: renamed from: c */
    public final void mo130c() {
        C0920W c0920w = this.f2845a;
        c0920w.f2881q.setValue(null);
        c0920w.f2882r.setValue(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000A.InterfaceC0092v0
    /* JADX INFO: renamed from: e */
    public final void mo132e(long j5) {
        C0036S0 c0036s0M123d;
        InterfaceC3388a interfaceC3388a;
        C0920W c0920w = this.f2845a;
        c0920w.f2880p = C2683b.m4647e(c0920w.f2880p, j5);
        C0078o0 c0078o0 = c0920w.f2868d;
        if (c0078o0 == null || (c0036s0M123d = c0078o0.m123d()) == null) {
            return;
        }
        c0920w.f2882r.setValue(new C2683b(C2683b.m4647e(c0920w.f2878n, c0920w.f2880p)));
        C0042V0 c0042v0 = c0920w.f2866b;
        C2683b c2683bM1934i = c0920w.m1934i();
        AbstractC1665j.m2982b(c2683bM1934i);
        int iM21b = c0036s0M123d.m21b(c2683bM1934i.f8556a, true);
        c0042v0.m58b(iM21b);
        long jM2313b = AbstractC1251D.m2313b(iM21b, iM21b);
        if (C1259L.m2334b(jM2313b, c0920w.m1939n().f5651b)) {
            return;
        }
        C0078o0 c0078o02 = c0920w.f2868d;
        if ((c0078o02 == null || ((Boolean) c0078o02.f353q.getValue()).booleanValue()) && (interfaceC3388a = c0920w.f2874j) != null) {
            interfaceC3388a.mo1172a(9);
        }
        c0920w.f2867c.mo1h(C0920W.m1929e(c0920w.m1939n().f5650a, jM2313b));
        c0920w.f2886v = new C1259L(jM2313b);
    }

    @Override // p000A.InterfaceC0092v0
    /* JADX INFO: renamed from: d */
    public final void mo131d() {
    }

    @Override // p000A.InterfaceC0092v0
    public final void onCancel() {
    }
}
