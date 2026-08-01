package p051J;

import android.view.autofill.AutofillValue;
import p000A.C0012G;
import p000A.C0033Q0;
import p000A.C0042V0;
import p000A.C0078o0;
import p041H0.AbstractC0599j;
import p041H0.InterfaceC0632z0;
import p056K2.C0891q;
import p058L.C0920W;
import p061L2.AbstractC0972l;
import p077P0.AbstractC1124k;
import p077P0.AbstractC1132s;
import p077P0.AbstractC1134u;
import p077P0.C1114a;
import p077P0.C1135v;
import p077P0.InterfaceC1136w;
import p092S0.AbstractC1251D;
import p092S0.C1259L;
import p092S0.C1269g;
import p115X0.C1623A;
import p115X0.C1624B;
import p115X0.C1626a;
import p115X0.C1629d;
import p115X0.C1635j;
import p115X0.C1636k;
import p115X0.C1646u;
import p115X0.InterfaceC1632g;
import p137b3.InterfaceC1855c;
import p175i0.C2270e;
import p175i0.C2271f;
import p175i0.C2276k;
import p175i0.C2277l;
import p175i0.InterfaceC2278m;
import p198m0.C2590u;

/* JADX INFO: renamed from: J.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0816h extends AbstractC0599j implements InterfaceC0632z0 {

    /* JADX INFO: renamed from: A */
    public C2590u f2624A;

    /* JADX INFO: renamed from: t */
    public C1624B f2625t;

    /* JADX INFO: renamed from: u */
    public C1646u f2626u;

    /* JADX INFO: renamed from: v */
    public C0078o0 f2627v;

    /* JADX INFO: renamed from: w */
    public boolean f2628w;

    /* JADX INFO: renamed from: x */
    public C0042V0 f2629x;

    /* JADX INFO: renamed from: y */
    public C0920W f2630y;

    /* JADX INFO: renamed from: z */
    public C1636k f2631z;

    /* JADX INFO: renamed from: M0 */
    public static void m1422M0(C0078o0 c0078o0, String str, boolean z5) {
        if (z5) {
            C1623A c1623a = c0078o0.f341e;
            C0012G c0012g = c0078o0.f358v;
            if (c1623a == null) {
                int length = str.length();
                c0012g.mo1h(new C1646u(str, AbstractC1251D.m2313b(length, length), 4));
            } else {
                C1646u c1646uM51t = c0078o0.f340d.m51t(AbstractC0972l.m1987K(new InterfaceC1632g[]{new C1629d(), new C1626a(str, 1)}));
                c1623a.m2927a(null, c1646uM51t);
                c0012g.mo1h(c1646uM51t);
            }
        }
    }

    @Override // p041H0.InterfaceC0632z0
    /* JADX INFO: renamed from: X */
    public final void mo943X(InterfaceC1136w interfaceC1136w) {
        C1269g c1269g = this.f2626u.f5650a;
        InterfaceC1855c[] interfaceC1855cArr = AbstractC1134u.f3766a;
        C1135v c1135v = AbstractC1132s.f3726E;
        InterfaceC1855c[] interfaceC1855cArr2 = AbstractC1134u.f3766a;
        InterfaceC1855c interfaceC1855c = interfaceC1855cArr2[18];
        interfaceC1136w.mo1128a(c1135v, c1269g);
        C1269g c1269g2 = this.f2625t.f5585a;
        C1135v c1135v2 = AbstractC1132s.f3727F;
        InterfaceC1855c interfaceC1855c2 = interfaceC1855cArr2[19];
        interfaceC1136w.mo1128a(c1135v2, c1269g2);
        long j5 = this.f2626u.f5651b;
        C1135v c1135v3 = AbstractC1132s.f3728G;
        InterfaceC1855c interfaceC1855c3 = interfaceC1855cArr2[20];
        interfaceC1136w.mo1128a(c1135v3, new C1259L(j5));
        C1135v c1135v4 = AbstractC1132s.f3755r;
        InterfaceC1855c interfaceC1855c4 = interfaceC1855cArr2[9];
        interfaceC1136w.mo1128a(c1135v4, C2276k.f7427a);
        C2271f c2271f = new C2271f(AutofillValue.forText(this.f2626u.f5650a));
        C1135v c1135v5 = AbstractC1132s.f3756s;
        InterfaceC1855c interfaceC1855c5 = interfaceC1855cArr2[10];
        interfaceC1136w.mo1128a(c1135v5, c2271f);
        interfaceC1136w.mo1128a(AbstractC1124k.f3683h, new C1114a(null, new C0815g(this, 0)));
        int i5 = this.f2631z.f5629d;
        int i6 = 4;
        if (i5 == 6) {
            InterfaceC2278m.f7433a.getClass();
            C2270e c2270e = C2277l.f7431c;
            C1135v c1135v6 = AbstractC1132s.f3754q;
            InterfaceC1855c interfaceC1855c6 = interfaceC1855cArr2[8];
            interfaceC1136w.mo1128a(c1135v6, c2270e);
        } else if (i5 == 7 || i5 == 8) {
            InterfaceC2278m.f7433a.getClass();
            C2270e c2270e2 = C2277l.f7430b;
            C1135v c1135v7 = AbstractC1132s.f3754q;
            InterfaceC1855c interfaceC1855c7 = interfaceC1855cArr2[8];
            interfaceC1136w.mo1128a(c1135v7, c2270e2);
        } else if (i5 == 4) {
            InterfaceC2278m.f7433a.getClass();
            C2270e c2270e3 = C2277l.f7432d;
            C1135v c1135v8 = AbstractC1132s.f3754q;
            InterfaceC1855c interfaceC1855c8 = interfaceC1855cArr2[8];
            interfaceC1136w.mo1128a(c1135v8, c2270e3);
        }
        if (!this.f2628w) {
            interfaceC1136w.mo1128a(AbstractC1132s.f3746i, C0891q.f2780a);
        }
        boolean z5 = this.f2628w;
        C1135v c1135v9 = AbstractC1132s.f3735N;
        InterfaceC1855c interfaceC1855c9 = interfaceC1855cArr2[26];
        interfaceC1136w.mo1128a(c1135v9, Boolean.valueOf(z5));
        AbstractC1134u.m2188a(interfaceC1136w, new C0815g(this, 1));
        if (z5) {
            interfaceC1136w.mo1128a(AbstractC1124k.f3686k, new C1114a(null, new C0815g(this, 2)));
            interfaceC1136w.mo1128a(AbstractC1124k.f3690o, new C1114a(null, new C0815g(this, interfaceC1136w)));
        }
        interfaceC1136w.mo1128a(AbstractC1124k.f3685j, new C1114a(null, new C0033Q0(i6, this)));
        int i7 = this.f2631z.f5630e;
        C0814f c0814f = new C0814f(this, 6);
        interfaceC1136w.mo1128a(AbstractC1132s.f3729H, new C1635j(i7));
        interfaceC1136w.mo1128a(AbstractC1124k.f3691p, new C1114a(null, c0814f));
        interfaceC1136w.mo1128a(AbstractC1124k.f3677b, new C1114a(null, new C0814f(this, 7)));
        interfaceC1136w.mo1128a(AbstractC1124k.f3678c, new C1114a(null, new C0814f(this, 1)));
        if (!C1259L.m2335c(this.f2626u.f5651b)) {
            interfaceC1136w.mo1128a(AbstractC1124k.f3692q, new C1114a(null, new C0814f(this, 2)));
            if (this.f2628w) {
                interfaceC1136w.mo1128a(AbstractC1124k.f3693r, new C1114a(null, new C0814f(this, 3)));
            }
        }
        if (this.f2628w) {
            interfaceC1136w.mo1128a(AbstractC1124k.f3694s, new C1114a(null, new C0814f(this, 5)));
        }
    }

    @Override // p041H0.InterfaceC0632z0
    /* JADX INFO: renamed from: j0 */
    public final boolean mo1085j0() {
        return true;
    }
}
