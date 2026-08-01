package p197m;

import p029F0.AbstractC0391b0;
import p029F0.C0397e0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p061L2.C0982v;
import p112W2.InterfaceC1599a;
import p153e1.AbstractC2006b;
import p153e1.C2014j;
import p153e1.C2016l;
import p153e1.EnumC2017m;
import p169h0.C2194c;
import p169h0.InterfaceC2195d;
import p170h1.C2214e;
import p203n.C2635S;
import p203n.C2636T;
import p203n.C2642Z;
import p211o0.C2741P;

/* JADX INFO: renamed from: m.L */
/* JADX INFO: loaded from: classes.dex */
public final class C2527L extends AbstractC2534T {

    /* JADX INFO: renamed from: A */
    public InterfaceC2195d f8076A;

    /* JADX INFO: renamed from: B */
    public final C2526K f8077B;

    /* JADX INFO: renamed from: C */
    public final C2526K f8078C;

    /* JADX INFO: renamed from: r */
    public C2642Z f8079r;

    /* JADX INFO: renamed from: s */
    public C2636T f8080s;

    /* JADX INFO: renamed from: t */
    public C2636T f8081t;

    /* JADX INFO: renamed from: u */
    public C2636T f8082u;

    /* JADX INFO: renamed from: v */
    public C2528M f8083v;

    /* JADX INFO: renamed from: w */
    public C2529N f8084w;

    /* JADX INFO: renamed from: x */
    public InterfaceC1599a f8085x;

    /* JADX INFO: renamed from: y */
    public C2519D f8086y;

    /* JADX INFO: renamed from: z */
    public long f8087z = AbstractC2566z.f8188a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2527L(C2642Z c2642z, C2636T c2636t, C2636T c2636t2, C2636T c2636t3, C2528M c2528m, C2529N c2529n, InterfaceC1599a interfaceC1599a, C2519D c2519d) {
        this.f8079r = c2642z;
        this.f8080s = c2636t;
        this.f8081t = c2636t2;
        this.f8082u = c2636t3;
        this.f8083v = c2528m;
        this.f8084w = c2529n;
        this.f8085x = interfaceC1599a;
        this.f8086y = c2519d;
        AbstractC2006b.m3685b(0, 0, 15);
        this.f8077B = new C2526K(this, 0);
        this.f8078C = new C2526K(this, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: B0 */
    public final void mo143B0() {
        this.f8087z = AbstractC2566z.f8188a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    public final InterfaceC2195d m4467J0() {
        if (this.f8079r.m4596f().m4585b(EnumC2517B.f8039d, EnumC2517B.f8040e)) {
            C2540Z c2540z = this.f8084w.f8092a;
            return null;
        }
        C2540Z c2540z2 = this.f8084w.f8092a;
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0378P mo687d(InterfaceC0379Q interfaceC0379Q, InterfaceC0376N interfaceC0376N, long j5) {
        C2741P c2741p;
        long j6;
        long j7;
        if (this.f8079r.m4593c() == this.f8079r.f8404d.getValue()) {
            this.f8076A = null;
        } else if (this.f8076A == null) {
            InterfaceC2195d interfaceC2195dM4467J0 = m4467J0();
            if (interfaceC2195dM4467J0 == null) {
                interfaceC2195dM4467J0 = C2194c.f7160d;
            }
            this.f8076A = interfaceC2195dM4467J0;
        }
        boolean zMo606z = interfaceC0379Q.mo606z();
        C0982v c0982v = C0982v.f3048d;
        if (zMo606z) {
            AbstractC0391b0 abstractC0391b0Mo648e = interfaceC0376N.mo648e(j5);
            long j8 = (((long) abstractC0391b0Mo648e.f1206d) << 32) | (((long) abstractC0391b0Mo648e.f1207e) & 4294967295L);
            this.f8087z = j8;
            return interfaceC0379Q.mo604f0((int) (j8 >> 32), (int) (4294967295L & j8), c0982v, new C0397e0(abstractC0391b0Mo648e, 5));
        }
        if (!((Boolean) this.f8085x.mo6a()).booleanValue()) {
            AbstractC0391b0 abstractC0391b0Mo648e2 = interfaceC0376N.mo648e(j5);
            return interfaceC0379Q.mo604f0(abstractC0391b0Mo648e2.f1206d, abstractC0391b0Mo648e2.f1207e, c0982v, new C0397e0(abstractC0391b0Mo648e2, 6));
        }
        C2519D c2519d = this.f8086y;
        C2636T c2636t = c2519d.f8051a;
        C2636T c2636t2 = c2519d.f8052b;
        C2642Z c2642z = c2519d.f8053c;
        C2528M c2528m = c2519d.f8054d;
        C2540Z c2540z = c2528m.f8089a;
        C2529N c2529n = c2519d.f8055e;
        C2636T c2636t3 = c2519d.f8056f;
        C2635S c2635sM4584a = c2636t != null ? c2636t.m4584a(new C2520E(c2528m, c2529n, 0), new C2520E(c2528m, c2529n, 1)) : null;
        C2635S c2635sM4584a2 = c2636t2 != null ? c2636t2.m4584a(new C2520E(c2528m, c2529n, 2), new C2520E(c2528m, c2529n, 3)) : null;
        if (c2642z.m4593c() == EnumC2517B.f8039d) {
            C2535U c2535u = c2540z.f8109c;
            if (c2535u != null) {
                c2741p = new C2741P(c2535u.f8101b);
            } else {
                C2535U c2535u2 = c2529n.f8092a.f8109c;
                c2741p = c2535u2 != null ? new C2741P(c2535u2.f8101b) : null;
            }
        } else {
            C2535U c2535u3 = c2529n.f8092a.f8109c;
            if (c2535u3 != null) {
                c2741p = new C2741P(c2535u3.f8101b);
            } else {
                C2535U c2535u4 = c2540z.f8109c;
                if (c2535u4 != null) {
                    c2741p = new C2741P(c2535u4.f8101b);
                }
            }
        }
        C2214e c2214e = new C2214e(c2635sM4584a, c2635sM4584a2, c2636t3 != null ? c2636t3.m4584a(C2543c.f8120k, new C2214e(c2741p, c2528m, c2529n, 4)) : null, 3);
        AbstractC0391b0 abstractC0391b0Mo648e3 = interfaceC0376N.mo648e(j5);
        long j9 = (((long) abstractC0391b0Mo648e3.f1206d) << 32) | (((long) abstractC0391b0Mo648e3.f1207e) & 4294967295L);
        long j10 = !C2016l.m3704a(this.f8087z, AbstractC2566z.f8188a) ? this.f8087z : j9;
        C2636T c2636t4 = this.f8080s;
        C2635S c2635sM4584a3 = c2636t4 != null ? c2636t4.m4584a(this.f8077B, new C2525J(this, j10, 0)) : null;
        if (c2635sM4584a3 != null) {
            j9 = ((C2016l) c2635sM4584a3.getValue()).f6741a;
        }
        long jM3687d = AbstractC2006b.m3687d(j5, j9);
        C2636T c2636t5 = this.f8081t;
        long j11 = c2636t5 != null ? ((C2014j) c2636t5.m4584a(C2543c.f8121l, new C2525J(this, j10, 1)).getValue()).f6735a : 0L;
        C2636T c2636t6 = this.f8082u;
        if (c2636t6 != null) {
            j6 = 4294967295L;
            j7 = ((C2014j) c2636t6.m4584a(this.f8078C, new C2525J(this, j10, 2)).getValue()).f6735a;
        } else {
            j6 = 4294967295L;
            j7 = 0;
        }
        InterfaceC2195d interfaceC2195d = this.f8076A;
        return interfaceC0379Q.mo604f0((int) (jM3687d >> 32), (int) (jM3687d & j6), c0982v, new C2524I(abstractC0391b0Mo648e3, C2014j.m3702c(interfaceC2195d != null ? interfaceC2195d.mo4017a(j10, jM3687d, EnumC2017m.f6742d) : 0L, j7), j11, c2214e));
    }
}
