package p058L;

import p000A.C0036S0;
import p000A.C0078o0;
import p000A.EnumC0050a0;
import p000A.InterfaceC0092v0;
import p029F0.C0363A;
import p115X0.C1646u;
import p117X2.AbstractC1665j;
import p204n0.C2683b;

/* JADX INFO: renamed from: L.S */
/* JADX INFO: loaded from: classes.dex */
public final class C0916S implements InterfaceC0092v0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0920W f2846a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f2847b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0916S(C0920W c0920w, boolean z5) {
        this.f2846a = c0920w;
        this.f2847b = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000A.InterfaceC0092v0
    /* JADX INFO: renamed from: b */
    public final void mo129b() {
        C0920W c0920w = this.f2846a;
        c0920w.f2881q.setValue(null);
        c0920w.f2882r.setValue(null);
        c0920w.m1945t(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000A.InterfaceC0092v0
    /* JADX INFO: renamed from: c */
    public final void mo130c() {
        C0920W c0920w = this.f2846a;
        c0920w.f2881q.setValue(null);
        c0920w.f2882r.setValue(null);
        c0920w.m1945t(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000A.InterfaceC0092v0
    /* JADX INFO: renamed from: d */
    public final void mo131d() {
        C0036S0 c0036s0M123d;
        boolean z5 = this.f2847b;
        EnumC0050a0 enumC0050a0 = z5 ? EnumC0050a0.f205e : EnumC0050a0.f206f;
        C0920W c0920w = this.f2846a;
        c0920w.f2881q.setValue(enumC0050a0);
        long jM1906a = AbstractC0903E.m1906a(c0920w.m1937l(z5));
        C0078o0 c0078o0 = c0920w.f2868d;
        if (c0078o0 == null || (c0036s0M123d = c0078o0.m123d()) == null) {
            return;
        }
        long jM24e = c0036s0M123d.m24e(jM1906a);
        c0920w.f2878n = jM24e;
        c0920w.f2882r.setValue(new C2683b(jM24e));
        c0920w.f2880p = 0L;
        c0920w.f2883s = -1;
        C0078o0 c0078o02 = c0920w.f2868d;
        if (c0078o02 != null) {
            c0078o02.f353q.setValue(Boolean.TRUE);
        }
        c0920w.m1945t(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000A.InterfaceC0092v0
    /* JADX INFO: renamed from: e */
    public final void mo132e(long j5) {
        C0920W c0920w = this.f2846a;
        long jM4647e = C2683b.m4647e(c0920w.f2880p, j5);
        c0920w.f2880p = jM4647e;
        c0920w.f2882r.setValue(new C2683b(C2683b.m4647e(c0920w.f2878n, jM4647e)));
        C1646u c1646uM1939n = c0920w.m1939n();
        C2683b c2683bM1934i = c0920w.m1934i();
        AbstractC1665j.m2982b(c2683bM1934i);
        C0920W.m1928c(c0920w, c1646uM1939n, c2683bM1934i.f8556a, false, this.f2847b, C0950v.f2992g, true);
        c0920w.m1945t(false);
    }

    @Override // p000A.InterfaceC0092v0
    public final void onCancel() {
    }

    @Override // p000A.InterfaceC0092v0
    /* JADX INFO: renamed from: a */
    public final void mo128a(long j5, C0363A c0363a) {
    }
}
