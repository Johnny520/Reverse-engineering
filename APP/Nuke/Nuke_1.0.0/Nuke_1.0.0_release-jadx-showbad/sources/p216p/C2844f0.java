package p216p;

import p000A.C0044W0;
import p029F0.AbstractC0391b0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p041H0.AbstractC0572Q;
import p041H0.InterfaceC0627x;
import p041H0.InterfaceC0632z0;
import p061L2.C0982v;
import p077P0.AbstractC1132s;
import p077P0.AbstractC1134u;
import p077P0.C1122i;
import p077P0.C1135v;
import p077P0.InterfaceC1136w;
import p095T.C1360f0;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p137b3.InterfaceC1855c;
import p153e1.C2005a;
import p158f0.AbstractC2074f;
import p158f0.AbstractC2086r;
import p169h0.AbstractC2206o;
import p227r.EnumC2983d0;

/* JADX INFO: renamed from: p.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2844f0 extends AbstractC2206o implements InterfaceC0627x, InterfaceC0632z0 {

    /* JADX INFO: renamed from: r */
    public C2848h0 f8934r;

    /* JADX INFO: renamed from: s */
    public boolean f8935s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: T */
    public final int mo941T(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        if (!this.f8935s) {
            i5 = Integer.MAX_VALUE;
        }
        return interfaceC0376N.mo649f(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0632z0
    /* JADX INFO: renamed from: X */
    public final void mo943X(InterfaceC1136w interfaceC1136w) {
        InterfaceC1855c[] interfaceC1855cArr = AbstractC1134u.f3766a;
        C1135v c1135v = AbstractC1132s.f3750m;
        InterfaceC1855c[] interfaceC1855cArr2 = AbstractC1134u.f3766a;
        InterfaceC1855c interfaceC1855c = interfaceC1855cArr2[6];
        interfaceC1136w.mo1128a(c1135v, Boolean.TRUE);
        final int i5 = 0;
        final int i6 = 1;
        C1122i c1122i = new C1122i(new InterfaceC1599a(this) { // from class: p.e0

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ C2844f0 f8931e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f8931e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p112W2.InterfaceC1599a
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                int iM2509g;
                switch (i5) {
                    case 0:
                        iM2509g = this.f8931e.f8934r.f8952a.m2509g();
                        break;
                    default:
                        iM2509g = this.f8931e.f8934r.f8956e.m2509g();
                        break;
                }
                return Float.valueOf(iM2509g);
            }
        }, new InterfaceC1599a(this) { // from class: p.e0

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ C2844f0 f8931e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f8931e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p112W2.InterfaceC1599a
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                int iM2509g;
                switch (i6) {
                    case 0:
                        iM2509g = this.f8931e.f8934r.f8952a.m2509g();
                        break;
                    default:
                        iM2509g = this.f8931e.f8934r.f8956e.m2509g();
                        break;
                }
                return Float.valueOf(iM2509g);
            }
        });
        if (this.f8935s) {
            C1135v c1135v2 = AbstractC1132s.f3759v;
            InterfaceC1855c interfaceC1855c2 = interfaceC1855cArr2[13];
            interfaceC1136w.mo1128a(c1135v2, c1122i);
        } else {
            C1135v c1135v3 = AbstractC1132s.f3758u;
            InterfaceC1855c interfaceC1855c3 = interfaceC1855cArr2[12];
            interfaceC1136w.mo1128a(c1135v3, c1122i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: d */
    public final InterfaceC0378P mo687d(InterfaceC0379Q interfaceC0379Q, InterfaceC0376N interfaceC0376N, long j5) {
        AbstractC2856m.m5051e(j5, this.f8935s ? EnumC2983d0.f9447d : EnumC2983d0.f9448e);
        AbstractC0391b0 abstractC0391b0Mo648e = interfaceC0376N.mo648e(C2005a.m3673a(j5, 0, this.f8935s ? C2005a.m3680h(j5) : Integer.MAX_VALUE, 0, this.f8935s ? Integer.MAX_VALUE : C2005a.m3679g(j5), 5));
        int i5 = abstractC0391b0Mo648e.f1206d;
        int iM3680h = C2005a.m3680h(j5);
        if (i5 > iM3680h) {
            i5 = iM3680h;
        }
        int i6 = abstractC0391b0Mo648e.f1207e;
        int iM3679g = C2005a.m3679g(j5);
        if (i6 > iM3679g) {
            i6 = iM3679g;
        }
        int i7 = abstractC0391b0Mo648e.f1207e - i6;
        int i8 = abstractC0391b0Mo648e.f1206d - i5;
        if (!this.f8935s) {
            i7 = i8;
        }
        C2848h0 c2848h0 = this.f8934r;
        C1360f0 c1360f0 = c2848h0.f8956e;
        C1360f0 c1360f02 = c2848h0.f8952a;
        c1360f0.m2510h(i7);
        AbstractC2074f abstractC2074fM3853e = AbstractC2086r.m3853e();
        InterfaceC1601c interfaceC1601cMo3789e = abstractC2074fM3853e != null ? abstractC2074fM3853e.mo3789e() : null;
        AbstractC2074f abstractC2074fM3856h = AbstractC2086r.m3856h(abstractC2074fM3853e);
        try {
            if (c1360f02.m2509g() > i7) {
                c1360f02.m2510h(i7);
            }
            AbstractC2086r.m3859k(abstractC2074fM3853e, abstractC2074fM3856h, interfaceC1601cMo3789e);
            this.f8934r.f8953b.m2510h(this.f8935s ? i6 : i5);
            this.f8934r.f8954c.m2510h(this.f8935s ? abstractC0391b0Mo648e.f1207e : abstractC0391b0Mo648e.f1206d);
            return interfaceC0379Q.mo604f0(i5, i6, C0982v.f3048d, new C0044W0(i7, 2, this, abstractC0391b0Mo648e));
        } catch (Throwable th) {
            AbstractC2086r.m3859k(abstractC2074fM3853e, abstractC2074fM3856h, interfaceC1601cMo3789e);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: j */
    public final int mo948j(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        if (this.f8935s) {
            i5 = Integer.MAX_VALUE;
        }
        return interfaceC0376N.mo645T(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: l0 */
    public final int mo949l0(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        if (!this.f8935s) {
            i5 = Integer.MAX_VALUE;
        }
        return interfaceC0376N.mo647Z(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: w0 */
    public final int mo954w0(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        if (this.f8935s) {
            i5 = Integer.MAX_VALUE;
        }
        return interfaceC0376N.mo646X(i5);
    }
}
