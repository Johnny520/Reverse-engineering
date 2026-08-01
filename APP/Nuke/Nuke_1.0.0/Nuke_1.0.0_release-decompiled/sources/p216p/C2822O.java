package p216p;

import android.view.View;
import com.bumptech.glide.AbstractC1925g;
import p000A.C0098y0;
import p041H0.AbstractC0596h0;
import p041H0.AbstractC0601k;
import p041H0.C0566K;
import p041H0.InterfaceC0604l0;
import p041H0.InterfaceC0605m;
import p041H0.InterfaceC0607n;
import p041H0.InterfaceC0632z0;
import p056K2.C0891q;
import p058L.C0923Z;
import p058L.C0927b0;
import p074O2.InterfaceC1046d;
import p077P0.InterfaceC1136w;
import p095T.AbstractC1385s;
import p095T.C1311F;
import p095T.C1357e;
import p095T.C1366i0;
import p153e1.C2012h;
import p153e1.C2016l;
import p153e1.InterfaceC2007c;
import p160f3.AbstractC2162v;
import p169h0.AbstractC2206o;
import p172h3.AbstractC2250j;
import p172h3.C2243c;
import p204n0.C2683b;

/* JADX INFO: renamed from: p.O */
/* JADX INFO: loaded from: classes.dex */
public final class C2822O extends AbstractC2206o implements InterfaceC0607n, InterfaceC0605m, InterfaceC0632z0, InterfaceC0604l0 {

    /* JADX INFO: renamed from: A */
    public C2016l f8878A;

    /* JADX INFO: renamed from: B */
    public C2243c f8879B;

    /* JADX INFO: renamed from: r */
    public C0927b0 f8880r;

    /* JADX INFO: renamed from: s */
    public C0923Z f8881s;

    /* JADX INFO: renamed from: t */
    public InterfaceC2834a0 f8882t;

    /* JADX INFO: renamed from: u */
    public View f8883u;

    /* JADX INFO: renamed from: v */
    public InterfaceC2007c f8884v;

    /* JADX INFO: renamed from: w */
    public InterfaceC2832Z f8885w;

    /* JADX INFO: renamed from: y */
    public C1311F f8887y;

    /* JADX INFO: renamed from: x */
    public final C1366i0 f8886x = new C1366i0(null, C1357e.f4795g);

    /* JADX INFO: renamed from: z */
    public long f8888z = 9205357640488583168L;

    public C2822O(C0927b0 c0927b0, C0923Z c0923z, InterfaceC2834a0 interfaceC2834a0) {
        this.f8880r = c0927b0;
        this.f8881s = c0923z;
        this.f8882t = interfaceC2834a0;
    }

    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: B0 */
    public final void mo143B0() {
        mo1051O();
        this.f8879B = AbstractC2250j.m4101a(0, 7, null);
        AbstractC2162v.m3994p(m4023x0(), null, new C0098y0(this, (InterfaceC1046d) null, 5), 1);
    }

    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: C0 */
    public final void mo144C0() {
        InterfaceC2832Z interfaceC2832Z = this.f8885w;
        if (interfaceC2832Z != null) {
            ((C2836b0) interfaceC2832Z).m5029b();
        }
        this.f8885w = null;
    }

    /* JADX INFO: renamed from: J0 */
    public final long m5020J0() {
        if (this.f8887y == null) {
            this.f8887y = AbstractC1385s.m2624n(new C2821N(this, 2));
        }
        C1311F c1311f = this.f8887y;
        if (c1311f != null) {
            return ((C2683b) c1311f.getValue()).f8556a;
        }
        return 9205357640488583168L;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m5021K0() {
        InterfaceC2832Z interfaceC2832Z = this.f8885w;
        if (interfaceC2832Z != null) {
            ((C2836b0) interfaceC2832Z).m5029b();
        }
        View viewM1046v = this.f8883u;
        if (viewM1046v == null) {
            viewM1046v = AbstractC0601k.m1046v(this);
        }
        this.f8883u = viewM1046v;
        InterfaceC2007c interfaceC2007c = this.f8884v;
        if (interfaceC2007c == null) {
            interfaceC2007c = AbstractC0601k.m1044t(this).f1692C;
        }
        this.f8884v = interfaceC2007c;
        this.f8885w = this.f8882t.mo5028b(viewM1046v, interfaceC2007c);
        m5023M0();
    }

    /* JADX INFO: renamed from: L0 */
    public final void m5022L0() {
        InterfaceC2007c interfaceC2007c = this.f8884v;
        if (interfaceC2007c == null) {
            interfaceC2007c = AbstractC0601k.m1044t(this).f1692C;
            this.f8884v = interfaceC2007c;
        }
        long j5 = ((C2683b) this.f8880r.mo1h(interfaceC2007c)).f8556a;
        if ((j5 & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & m5020J0()) == 9205357640488583168L) {
            this.f8888z = 9205357640488583168L;
            InterfaceC2832Z interfaceC2832Z = this.f8885w;
            if (interfaceC2832Z != null) {
                ((C2836b0) interfaceC2832Z).m5029b();
                return;
            }
            return;
        }
        this.f8888z = C2683b.m4647e(m5020J0(), j5);
        if (this.f8885w == null) {
            m5021K0();
        }
        InterfaceC2832Z interfaceC2832Z2 = this.f8885w;
        if (interfaceC2832Z2 != null) {
            interfaceC2832Z2.mo5026a(this.f8888z, 9205357640488583168L);
        }
        m5023M0();
    }

    /* JADX INFO: renamed from: M0 */
    public final void m5023M0() {
        InterfaceC2007c interfaceC2007c;
        InterfaceC2832Z interfaceC2832Z = this.f8885w;
        if (interfaceC2832Z == null || (interfaceC2007c = this.f8884v) == null) {
            return;
        }
        C2836b0 c2836b0 = (C2836b0) interfaceC2832Z;
        long jM5030c = c2836b0.m5030c();
        C2016l c2016l = this.f8878A;
        if (c2016l != null && jM5030c == c2016l.f6741a) {
            return;
        }
        this.f8881s.mo1h(new C2012h(interfaceC2007c.mo267E(AbstractC1925g.m3523F(c2836b0.m5030c()))));
        this.f8878A = new C2016l(c2836b0.m5030c());
    }

    @Override // p041H0.InterfaceC0604l0
    /* JADX INFO: renamed from: O */
    public final void mo1051O() {
        AbstractC0601k.m1040p(this, new C2821N(this, 0));
    }

    @Override // p041H0.InterfaceC0607n
    /* JADX INFO: renamed from: P */
    public final void mo654P(AbstractC0596h0 abstractC0596h0) {
        this.f8886x.setValue(abstractC0596h0);
    }

    @Override // p041H0.InterfaceC0605m
    /* JADX INFO: renamed from: R */
    public final void mo940R(C0566K c0566k) {
        c0566k.m857a();
        C2243c c2243c = this.f8879B;
        if (c2243c != null) {
            c2243c.mo4090o(C0891q.f2780a);
        }
    }

    @Override // p041H0.InterfaceC0632z0
    /* JADX INFO: renamed from: X */
    public final void mo943X(InterfaceC1136w interfaceC1136w) {
        interfaceC1136w.mo1128a(AbstractC2823P.f8889a, new C2821N(this, 1));
    }
}
