package p260x;

import android.view.View;
import java.util.Arrays;
import me.dartcv.nuke.R;
import p000A.C0010F;
import p000A.C0020K;
import p000A.C0028O;
import p000A.C0038T0;
import p000A.C0049a;
import p000A.C0073m;
import p008B1.C0214b;
import p028F.C0352m;
import p029F0.AbstractC0387Z;
import p029F0.AbstractC0435z;
import p029F0.C0413m0;
import p037G2.C0477E;
import p041H0.C0549A;
import p045H4.C0651c;
import p047I0.AbstractC0691Q;
import p056K2.C0891q;
import p068N1.C1013c;
import p076P.C1073T;
import p092S0.C1287y;
import p095T.AbstractC1385s;
import p095T.C1305C;
import p095T.C1313G;
import p095T.C1341U0;
import p095T.C1357e;
import p095T.C1366i0;
import p095T.C1371l;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1347Y;
import p095T.InterfaceC1373m;
import p105V.C1483e;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p112W2.InterfaceC1604f;
import p136b0.AbstractC1848j;
import p136b0.C1843e;
import p152e0.AbstractC2001h;
import p152e0.AbstractC2004k;
import p152e0.C1997d;
import p152e0.InterfaceC1996c;
import p152e0.InterfaceC1999f;
import p154e2.C2023b;
import p158f0.AbstractC2074f;
import p158f0.AbstractC2086r;
import p169h0.InterfaceC2207p;
import p190k3.C2461i;
import p227r.C2976a;
import p227r.EnumC2983d0;
import p255w.C3373d;
import p255w.C3374e;
import p255w.C3376g;
import p255w.C3377h;
import p255w.C3379j;

/* JADX INFO: renamed from: x.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3429l {

    /* JADX INFO: renamed from: a */
    public static final C0549A f10714a = new C0549A(4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m5688a(final InterfaceC1599a interfaceC1599a, final InterfaceC2207p interfaceC2207p, final C3399E c3399e, final C3379j c3379j, InterfaceC1373m interfaceC1373m, final int i5) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(1055276397);
        int i6 = (c1383r.m2586h(interfaceC1599a) ? 4 : 2) | i5 | (c1383r.m2582f(interfaceC2207p) ? 32 : 16) | (c1383r.m2582f(c3399e) ? 256 : 128) | (c1383r.m2582f(c3379j) ? 2048 : 1024);
        if (c1383r.m2560O(i6 & 1, (i6 & 1171) != 1170)) {
            final InterfaceC1347Y interfaceC1347YM2633w = AbstractC1385s.m2633w(interfaceC1599a, c1383r);
            m5690c(AbstractC1848j.m3314c(-933153643, new InterfaceC1604f() { // from class: x.v
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p112W2.InterfaceC1604f
                /* JADX INFO: renamed from: f */
                public final Object mo5f(Object obj, Object obj2, Object obj3) {
                    InterfaceC2207p interfaceC2207pMo4021c;
                    InterfaceC1996c interfaceC1996c = (InterfaceC1996c) obj;
                    ((Integer) obj3).getClass();
                    C1383r c1383r2 = (C1383r) ((InterfaceC1373m) obj2);
                    Object objM2558L = c1383r2.m2558L();
                    C1357e c1357e = C1371l.f4833a;
                    if (objM2558L == c1357e) {
                        objM2558L = new C3438u(interfaceC1996c, new C0020K(interfaceC1347YM2633w, 15));
                        c1383r2.m2585g0(objM2558L);
                    }
                    final C3438u c3438u = (C3438u) objM2558L;
                    Object objM2558L2 = c1383r2.m2558L();
                    if (objM2558L2 == c1357e) {
                        objM2558L2 = new C0413m0(new C2023b(c3438u));
                        c1383r2.m2585g0(objM2558L2);
                    }
                    final C0413m0 c0413m0 = (C0413m0) objM2558L2;
                    final C3399E c3399e2 = c3399e;
                    if (c3399e2 != null) {
                        c1383r2.m2568W(1743490539);
                        c1383r2.m2568W(887527095);
                        final InterfaceC3411Q interfaceC3411Q = AbstractC3413T.f10680a;
                        if (interfaceC3411Q != null) {
                            c1383r2.m2568W(1345554384);
                            c1383r2.m2597p(false);
                        } else {
                            c1383r2.m2568W(1345603457);
                            View view = (View) c1383r2.m2590j(AbstractC0691Q.f2215f);
                            boolean zM2582f = c1383r2.m2582f(view);
                            Object objM2558L3 = c1383r2.m2558L();
                            if (zM2582f || objM2558L3 == c1357e) {
                                Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                                objM2558L3 = tag instanceof InterfaceC3411Q ? (InterfaceC3411Q) tag : null;
                                if (objM2558L3 == null) {
                                    objM2558L3 = new ViewOnAttachStateChangeListenerC3419b(view);
                                    view.setTag(R.id.compose_prefetch_scheduler, objM2558L3);
                                }
                                c1383r2.m2585g0(objM2558L3);
                            }
                            interfaceC3411Q = (InterfaceC3411Q) objM2558L3;
                            c1383r2.m2597p(false);
                        }
                        c1383r2.m2597p(false);
                        Object[] objArr = {c3399e2, c3438u, c0413m0, interfaceC3411Q};
                        boolean zM2582f2 = c1383r2.m2582f(c3399e2) | c1383r2.m2586h(c3438u) | c1383r2.m2586h(c0413m0) | c1383r2.m2586h(interfaceC3411Q);
                        Object objM2558L4 = c1383r2.m2558L();
                        if (zM2582f2 || objM2558L4 == c1357e) {
                            objM2558L4 = new InterfaceC1601c() { // from class: x.x
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // p112W2.InterfaceC1601c
                                /* JADX INFO: renamed from: h */
                                public final Object mo1h(Object obj4) {
                                    C1013c c1013c = new C1013c(c3438u, c0413m0, interfaceC3411Q);
                                    C3399E c3399e3 = c3399e2;
                                    c3399e3.f10629c = c1013c;
                                    return new C0028O(8, c3399e3);
                                }
                            };
                            c1383r2.m2585g0(objM2558L4);
                        }
                        InterfaceC1601c interfaceC1601c = (InterfaceC1601c) objM2558L4;
                        boolean zM2582f3 = false;
                        for (Object obj4 : Arrays.copyOf(objArr, 4)) {
                            zM2582f3 |= c1383r2.m2582f(obj4);
                        }
                        Object objM2558L5 = c1383r2.m2558L();
                        if (zM2582f3 || objM2558L5 == c1357e) {
                            c1383r2.m2585g0(new C1313G(interfaceC1601c));
                        }
                    } else {
                        c1383r2.m2568W(1737291469);
                    }
                    c1383r2.m2597p(false);
                    int i7 = AbstractC3400F.f10633a;
                    InterfaceC2207p interfaceC2207p2 = interfaceC2207p;
                    if (c3399e2 != null && (interfaceC2207pMo4021c = interfaceC2207p2.mo4021c(new C3416W(c3399e2))) != null) {
                        interfaceC2207p2 = interfaceC2207pMo4021c;
                    }
                    boolean zM2582f4 = c1383r2.m2582f(c3438u);
                    C3379j c3379j2 = c3379j;
                    boolean zM2582f5 = zM2582f4 | c1383r2.m2582f(c3379j2);
                    Object objM2558L6 = c1383r2.m2558L();
                    if (zM2582f5 || objM2558L6 == c1357e) {
                        objM2558L6 = new C0352m(14, c3438u, c3379j2);
                        c1383r2.m2585g0(objM2558L6);
                    }
                    AbstractC0435z.m688a(c0413m0, interfaceC2207p2, (InterfaceC1603e) objM2558L6, c1383r2, 8);
                    return C0891q.f2780a;
                }
            }, c1383r), c1383r, 6);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new InterfaceC1603e(interfaceC2207p, c3399e, c3379j, i5) { // from class: x.w

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ InterfaceC2207p f10748e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ C3399E f10749f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ C3379j f10750g;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p112W2.InterfaceC1603e
                /* JADX INFO: renamed from: g */
                public final Object mo0g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM2609A = AbstractC1385s.m2609A(1);
                    AbstractC3429l.m5688a(this.f10747d, this.f10748e, this.f10749f, this.f10750g, (InterfaceC1373m) obj, iM2609A);
                    return C0891q.f2780a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m5689b(Object obj, int i5, C3396B c3396b, C1843e c1843e, InterfaceC1373m interfaceC1373m, int i6) {
        int i7;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(872548579);
        if ((i6 & 6) == 0) {
            i7 = (c1383r.m2586h(obj) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c1383r.m2578d(i5) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c1383r.m2586h(c3396b) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c1383r.m2586h(c1843e) ? 2048 : 1024;
        }
        if (c1383r.m2560O(i7 & 1, (i7 & 1171) != 1170)) {
            boolean zM2582f = c1383r.m2582f(obj) | c1383r.m2582f(c3396b);
            Object objM2558L = c1383r.m2558L();
            C1357e c1357e = C1371l.f4833a;
            if (zM2582f || objM2558L == c1357e) {
                objM2558L = new C3395A(obj, c3396b);
                c1383r.m2585g0(objM2558L);
            }
            C3395A c3395a = (C3395A) objM2558L;
            c3395a.f10621c = i5;
            C1366i0 c1366i0 = c3395a.f10625g;
            C1305C c1305c = AbstractC0387Z.f1202a;
            C3395A c3395a2 = (C3395A) c1383r.m2590j(c1305c);
            AbstractC2074f abstractC2074fM3853e = AbstractC2086r.m3853e();
            InterfaceC1601c interfaceC1601cMo3789e = abstractC2074fM3853e != null ? abstractC2074fM3853e.mo3789e() : null;
            AbstractC2074f abstractC2074fM3856h = AbstractC2086r.m3856h(abstractC2074fM3853e);
            try {
                if (c3395a2 != ((C3395A) c1366i0.getValue())) {
                    c1366i0.setValue(c3395a2);
                    if (c3395a.f10622d > 0) {
                        C3395A c3395a3 = c3395a.f10623e;
                        if (c3395a3 != null) {
                            c3395a3.m5672b();
                        }
                        if (c3395a2 != null) {
                            c3395a2.m5671a();
                        } else {
                            c3395a2 = null;
                        }
                        c3395a.f10623e = c3395a2;
                    }
                }
                AbstractC2086r.m3859k(abstractC2074fM3853e, abstractC2074fM3856h, interfaceC1601cMo3789e);
                boolean zM2582f2 = c1383r.m2582f(c3395a);
                Object objM2558L2 = c1383r.m2558L();
                if (zM2582f2 || objM2558L2 == c1357e) {
                    objM2558L2 = new C0049a(29, c3395a);
                    c1383r.m2585g0(objM2558L2);
                }
                AbstractC1385s.m2613c(c3395a, (InterfaceC1601c) objM2558L2, c1383r);
                AbstractC1385s.m2611a(c1305c.mo2399a(c3395a), c1843e, c1383r, ((i7 >> 6) & 112) | 8);
            } catch (Throwable th) {
                AbstractC2086r.m3859k(abstractC2074fM3853e, abstractC2074fM3856h, interfaceC1601cMo3789e);
                throw th;
            }
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0477E(obj, i5, c3396b, c1843e, i6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m5690c(C1843e c1843e, InterfaceC1373m interfaceC1373m, int i5) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-709502251);
        if (c1383r.m2560O(i5 & 1, (i5 & 3) != 2)) {
            C1341U0 c1341u0 = AbstractC2001h.f6721a;
            InterfaceC1999f interfaceC1999f = (InterfaceC1999f) c1383r.m2590j(c1341u0);
            c1383r.m2568W(1967007413);
            Object[] objArr = new Object[0];
            Object objM2558L = c1383r.m2558L();
            C1357e c1357e = C1371l.f4833a;
            if (objM2558L == c1357e) {
                objM2558L = new C1073T(15);
                c1383r.m2585g0(objM2558L);
            }
            C1997d c1997d = (C1997d) AbstractC2004k.m3672d(objArr, C1997d.f6713h, (InterfaceC1599a) objM2558L, c1383r, 384);
            c1997d.f6716f = (InterfaceC1999f) c1383r.m2590j(c1341u0);
            c1383r.m2597p(false);
            Object[] objArr2 = {interfaceC1999f};
            C0038T0 c0038t0 = new C0038T0(29, new C1287y((byte) 0, 28), new C0010F(26, interfaceC1999f, c1997d));
            boolean zM2586h = c1383r.m2586h(interfaceC1999f) | c1383r.m2586h(c1997d);
            Object objM2558L2 = c1383r.m2558L();
            if (zM2586h || objM2558L2 == c1357e) {
                objM2558L2 = new C0073m(28, interfaceC1999f, c1997d);
                c1383r.m2585g0(objM2558L2);
            }
            C3408N c3408n = (C3408N) AbstractC2004k.m3672d(objArr2, c0038t0, (InterfaceC1599a) objM2558L2, c1383r, 0);
            AbstractC1385s.m2611a(c1341u0.mo2399a(c3408n), AbstractC1848j.m3314c(-412824043, new C0352m(15, c1843e, c3408n), c1383r), c1383r, 56);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0651c(c1843e, i5, 4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m5691d(C3377h c3377h, Object obj, int i5, Object obj2, InterfaceC1373m interfaceC1373m, int i6) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(1439843069);
        int i7 = (c1383r.m2582f(c3377h) ? 4 : 2) | i6 | (c1383r.m2582f(obj) ? 32 : 16) | (c1383r.m2578d(i5) ? 256 : 128) | (c1383r.m2582f(obj2) ? 2048 : 1024);
        if (c1383r.m2560O(i7 & 1, (i7 & 1171) != 1170)) {
            ((InterfaceC1996c) obj).mo3667e(obj2, AbstractC1848j.m3314c(980966366, new C3376g(i5, obj2, c3377h), c1383r), c1383r, 48);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0214b(c3377h, obj, i5, obj2, i6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final int m5692e(int i5, C1483e c1483e) {
        int i6 = c1483e.f5183f - 1;
        int i7 = 0;
        while (i7 < i6) {
            int i8 = ((i6 - i7) / 2) + i7;
            Object[] objArr = c1483e.f5181d;
            int i9 = ((C3426i) objArr[i8]).f10706a;
            if (i9 != i5) {
                if (i9 < i5) {
                    i7 = i8 + 1;
                    if (i5 < ((C3426i) objArr[i7]).f10706a) {
                    }
                } else {
                    i6 = i8 - 1;
                }
            }
            return i8;
        }
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final int m5693f(int i5, Object obj, C3377h c3377h) {
        int iM1343g;
        return (obj == null || c3377h.m5611c() == 0 || (i5 < c3377h.m5611c() && obj.equals(c3377h.m5612d(i5))) || (iM1343g = c3377h.f10498d.m1343g(obj)) == -1) ? i5 : iM1343g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final InterfaceC2207p m5694g(C3374e c3374e, C2976a c2976a, EnumC2983d0 enumC2983d0) {
        return new C3428k(c3374e, c2976a, enumC2983d0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final InterfaceC2207p m5695h(InterfaceC2207p interfaceC2207p, C2461i c2461i, C3373d c3373d, EnumC2983d0 enumC2983d0, boolean z5) {
        return interfaceC2207p.mo4021c(new C3402H(c2461i, c3373d, enumC2983d0, z5));
    }
}
