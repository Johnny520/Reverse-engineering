package p197m;

import java.util.ListIterator;
import p041H0.C0551B;
import p041H0.C0591f;
import p041H0.C0609o;
import p041H0.InterfaceC0593g;
import p061L2.AbstractC0972l;
import p095T.AbstractC1385s;
import p095T.C1357e;
import p095T.C1366i0;
import p095T.C1371l;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1347Y;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p136b0.AbstractC1848j;
import p136b0.C1843e;
import p158f0.C2085q;
import p169h0.AbstractC2192a;
import p169h0.C2194c;
import p169h0.C2199h;
import p169h0.C2204m;
import p169h0.InterfaceC2195d;
import p169h0.InterfaceC2207p;
import p186k.AbstractC2415L;
import p186k.C2408E;
import p193l0.AbstractC2485h;
import p203n.AbstractC2648c0;
import p203n.AbstractC2649d;
import p203n.C2620C;
import p203n.C2636T;
import p203n.C2642Z;
import p203n.C2644a0;

/* JADX INFO: renamed from: m.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2550j {

    /* JADX INFO: renamed from: a */
    public static final long f8152a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f8153b = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        long j5 = Integer.MIN_VALUE;
        f8152a = (j5 & 4294967295L) | (j5 << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m4474a(Boolean bool, InterfaceC2207p interfaceC2207p, InterfaceC1601c interfaceC1601c, InterfaceC2195d interfaceC2195d, String str, InterfaceC1601c interfaceC1601c2, C1843e c1843e, InterfaceC1373m interfaceC1373m, int i5) {
        String str2;
        InterfaceC2207p interfaceC2207p2;
        InterfaceC2195d interfaceC2195d2;
        InterfaceC1601c interfaceC1601c3;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(1501828832);
        int i6 = i5 | (c1383r.m2582f(bool) ? 4 : 2) | 199728;
        if (c1383r.m2560O(i6 & 1, (599187 & i6) != 599186)) {
            C2199h c2199h = C2194c.f7160d;
            Object objM2558L = c1383r.m2558L();
            C1357e c1357e = C1371l.f4833a;
            if (objM2558L == c1357e) {
                objM2558L = C2543c.f8115f;
                c1383r.m2585g0(objM2558L);
            }
            InterfaceC1601c interfaceC1601c4 = (InterfaceC1601c) objM2558L;
            int i7 = (i6 & 14) | 48;
            int i8 = AbstractC2648c0.f8436a;
            Object objM2558L2 = c1383r.m2558L();
            if (objM2558L2 == c1357e) {
                str2 = str;
                objM2558L2 = new C2642Z(new C2620C(bool), null, str2);
                c1383r.m2585g0(objM2558L2);
            } else {
                str2 = str;
            }
            C2642Z c2642z = (C2642Z) objM2558L2;
            c2642z.m4591a(bool, c1383r, (i7 & 14) | 48);
            Object objM2558L3 = c1383r.m2558L();
            if (objM2558L3 == c1357e) {
                objM2558L3 = new C2644a0(c2642z, 1);
                c1383r.m2585g0(objM2558L3);
            }
            AbstractC1385s.m2613c(c2642z, (InterfaceC1601c) objM2558L3, c1383r);
            C2204m c2204m = C2204m.f7185a;
            m4475b(c2642z, c2204m, interfaceC1601c, interfaceC1601c4, c1843e, c1383r, 224688);
            interfaceC2207p2 = c2204m;
            interfaceC1601c3 = interfaceC1601c4;
            interfaceC2195d2 = c2199h;
        } else {
            str2 = str;
            c1383r.m2563R();
            interfaceC2207p2 = interfaceC2207p;
            interfaceC2195d2 = interfaceC2195d;
            interfaceC1601c3 = interfaceC1601c2;
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C2544d(bool, interfaceC2207p2, interfaceC1601c, interfaceC2195d2, str2, interfaceC1601c3, c1843e, i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m4475b(C2642Z c2642z, InterfaceC2207p interfaceC2207p, InterfaceC1601c interfaceC1601c, InterfaceC1601c interfaceC1601c2, C1843e c1843e, InterfaceC1373m interfaceC1373m, int i5) {
        C1383r c1383r;
        InterfaceC1601c interfaceC1601c3;
        C2085q c2085q;
        C2559s c2559s;
        C2085q c2085q2;
        Object obj;
        C2636T c2636tM4607a;
        C1383r c1383r2;
        C2642Z c2642z2 = c2642z;
        InterfaceC1601c interfaceC1601c4 = interfaceC1601c;
        C2199h c2199h = C2194c.f7160d;
        C1383r c1383r3 = (C1383r) interfaceC1373m;
        c1383r3.m2569X(511725103);
        int i6 = (c1383r3.m2582f(c2642z2) ? 4 : 2) | i5;
        if ((i5 & 48) == 0) {
            i6 |= c1383r3.m2582f(interfaceC2207p) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= c1383r3.m2586h(interfaceC1601c4) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i6 |= c1383r3.m2582f(c2199h) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i6 |= c1383r3.m2586h(interfaceC1601c2) ? 16384 : 8192;
        }
        C1843e c1843e2 = c1843e;
        if ((196608 & i5) == 0) {
            i6 |= c1383r3.m2586h(c1843e2) ? 131072 : 65536;
        }
        if (c1383r3.m2560O(i6 & 1, (74899 & i6) != 74898)) {
            int i7 = i6 & 14;
            boolean z5 = i7 == 4;
            Object objM2558L = c1383r3.m2558L();
            C1357e c1357e = C1371l.f4833a;
            if (z5 || objM2558L == c1357e) {
                objM2558L = new C2559s(c2642z2);
                c1383r3.m2585g0(objM2558L);
            }
            C2559s c2559s2 = (C2559s) objM2558L;
            boolean z6 = i7 == 4;
            Object objM2558L2 = c1383r3.m2558L();
            Object obj2 = objM2558L2;
            if (z6 || objM2558L2 == c1357e) {
                Object[] objArr = {c2642z2.m4593c()};
                C2085q c2085q3 = new C2085q();
                c2085q3.addAll(AbstractC0972l.m2007e0(objArr));
                c1383r3.m2585g0(c2085q3);
                obj2 = c2085q3;
            }
            C2085q c2085q4 = (C2085q) obj2;
            boolean z7 = i7 == 4;
            Object objM2558L3 = c1383r3.m2558L();
            if (z7 || objM2558L3 == c1357e) {
                long[] jArr = AbstractC2415L.f7816a;
                objM2558L3 = new C2408E();
                c1383r3.m2585g0(objM2558L3);
            }
            C2408E c2408e = (C2408E) objM2558L3;
            Object objM4593c = c2642z2.m4593c();
            C1366i0 c1366i0 = c2642z2.f8404d;
            if (!c2085q4.contains(objM4593c)) {
                c2085q4.clear();
                c2085q4.add(c2642z2.m4593c());
            }
            if (AbstractC1665j.m2981a(c2642z2.m4593c(), c1366i0.getValue())) {
                if (c2085q4.size() != 1 || !AbstractC1665j.m2981a(c2085q4.get(0), c2642z2.m4593c())) {
                    c2085q4.clear();
                    c2085q4.add(c2642z2.m4593c());
                }
                if (c2408e.f7791e != 1 || c2408e.m4268c(c2642z2.m4593c())) {
                    c2408e.m4266a();
                }
                c2559s2.getClass();
            }
            if (!AbstractC1665j.m2981a(c2642z2.m4593c(), c1366i0.getValue()) && !c2085q4.contains(c1366i0.getValue())) {
                ListIterator listIterator = c2085q4.listIterator();
                int i8 = 0;
                while (true) {
                    C0609o c0609o = (C0609o) listIterator;
                    if (!c0609o.hasNext()) {
                        i8 = -1;
                        break;
                    } else if (AbstractC1665j.m2981a(interfaceC1601c2.mo1h(c0609o.next()), interfaceC1601c2.mo1h(c1366i0.getValue()))) {
                        break;
                    } else {
                        i8++;
                    }
                }
                if (i8 == -1) {
                    c2085q4.add(c1366i0.getValue());
                } else {
                    c2085q4.set(i8, c1366i0.getValue());
                }
            }
            if (c2408e.m4268c(c1366i0.getValue()) && c2408e.m4268c(c2642z2.m4593c())) {
                c1383r3.m2568W(1925931827);
                c1383r3.m2597p(false);
                interfaceC1601c3 = interfaceC1601c4;
                c2085q = c2085q4;
                c2559s = c2559s2;
            } else {
                c1383r3.m2568W(1966410449);
                c2408e.m4266a();
                int size = c2085q4.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj3 = c2085q4.get(i9);
                    C2559s c2559s3 = c2559s2;
                    C1843e c1843e3 = c1843e2;
                    C2085q c2085q5 = c2085q4;
                    c2408e.m4278m(obj3, AbstractC1848j.m3314c(-23915175, new C2547g(c2642z2, obj3, interfaceC1601c4, c2559s3, c2085q5, c1843e3), c1383r3));
                    i9++;
                    c2642z2 = c2642z;
                    interfaceC1601c4 = interfaceC1601c4;
                    c2559s2 = c2559s3;
                    c2085q4 = c2085q5;
                    c1843e2 = c1843e;
                }
                interfaceC1601c3 = interfaceC1601c4;
                c2085q = c2085q4;
                c2559s = c2559s2;
                c1383r3.m2597p(false);
            }
            boolean zM2582f = c1383r3.m2582f(c2642z.m4596f()) | c1383r3.m2582f(c2559s);
            Object objM2558L4 = c1383r3.m2558L();
            if (zM2582f || objM2558L4 == c1357e) {
                objM2558L4 = (C2516A) interfaceC1601c3.mo1h(c2559s);
                c1383r3.m2585g0(objM2558L4);
            }
            C2516A c2516a = (C2516A) objM2558L4;
            C2642Z c2642z3 = c2559s.f8172a;
            boolean zM2582f2 = c1383r3.m2582f(c2559s);
            Object objM2558L5 = c1383r3.m2558L();
            if (zM2582f2 || objM2558L5 == c1357e) {
                objM2558L5 = AbstractC1385s.m2629s(Boolean.FALSE);
                c1383r3.m2585g0(objM2558L5);
            }
            InterfaceC1347Y interfaceC1347Y = (InterfaceC1347Y) objM2558L5;
            InterfaceC1347Y interfaceC1347YM2633w = AbstractC1385s.m2633w(c2516a.f8038d, c1383r3);
            if (AbstractC1665j.m2981a(c2642z3.m4593c(), c2642z3.f8404d.getValue())) {
                interfaceC1347Y.setValue(Boolean.FALSE);
            } else if (interfaceC1347YM2633w.getValue() != null) {
                interfaceC1347Y.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) interfaceC1347Y.getValue()).booleanValue();
            InterfaceC2207p interfaceC2207p2 = C2204m.f7185a;
            if (zBooleanValue) {
                c1383r3.m2568W(1353077497);
                c2085q2 = c2085q;
                C1383r c1383r4 = c1383r3;
                obj = null;
                c2636tM4607a = AbstractC2648c0.m4607a(c2559s.f8172a, AbstractC2649d.f8453q, null, c1383r4, 0, 2);
                boolean zM2582f3 = c1383r4.m2582f(c2636tM4607a);
                Object objM2558L6 = c1383r4.m2558L();
                if (zM2582f3 || objM2558L6 == c1357e) {
                    objM2558L6 = AbstractC2485h.m4428b(interfaceC2207p2);
                    c1383r4.m2585g0(objM2558L6);
                }
                interfaceC2207p2 = (InterfaceC2207p) objM2558L6;
                c1383r4.m2597p(false);
                c1383r2 = c1383r4;
            } else {
                c2085q2 = c2085q;
                C1383r c1383r5 = c1383r3;
                obj = null;
                c1383r5.m2568W(1353343539);
                c1383r5.m2597p(false);
                c2636tM4607a = null;
                c1383r2 = c1383r5;
            }
            InterfaceC2207p interfaceC2207pMo4021c = interfaceC2207p.mo4021c(interfaceC2207p2.mo4021c(new C2555o(c2636tM4607a, interfaceC1347YM2633w, c2559s)));
            Object objM2558L7 = c1383r2.m2558L();
            if (objM2558L7 == c1357e) {
                objM2558L7 = new C2552l(c2559s);
                c1383r2.m2585g0(objM2558L7);
            }
            C2552l c2552l = (C2552l) objM2558L7;
            int iHashCode = Long.hashCode(c1383r2.f4882T);
            InterfaceC1378o0 interfaceC1378o0M2593l = c1383r2.m2593l();
            InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(c1383r2, interfaceC2207pMo4021c);
            InterfaceC0593g.f1909a.getClass();
            C0551B c0551b = C0591f.f1902b;
            c1383r2.m2571Z();
            if (c1383r2.f4881S) {
                c1383r2.m2592k(c0551b);
            } else {
                c1383r2.m2591j0();
            }
            AbstractC1385s.m2635y(c1383r2, C0591f.f1905e, c2552l);
            AbstractC1385s.m2635y(c1383r2, C0591f.f1904d, interfaceC1378o0M2593l);
            AbstractC1385s.m2627q(c1383r2, Integer.valueOf(iHashCode), C0591f.f1906f);
            AbstractC1385s.m2631u(c1383r2, C0591f.f1907g);
            AbstractC1385s.m2635y(c1383r2, C0591f.f1903c, interfaceC2207pM4016c);
            c1383r2.m2568W(-860173498);
            int size2 = c2085q2.size();
            int i10 = 0;
            while (i10 < size2) {
                C2085q c2085q6 = c2085q2;
                Object obj4 = c2085q6.get(i10);
                c1383r2.m2564S(-2026002954, 0, interfaceC1601c2.mo1h(obj4), obj);
                InterfaceC1603e interfaceC1603e = (InterfaceC1603e) c2408e.m4272g(obj4);
                if (interfaceC1603e == null) {
                    c1383r2.m2568W(1618454323);
                } else {
                    c1383r2.m2568W(-2026001778);
                    interfaceC1603e.mo0g(c1383r2, 0);
                }
                c1383r2.m2597p(false);
                c1383r2.m2597p(false);
                i10++;
                c2085q2 = c2085q6;
            }
            c1383r2.m2597p(false);
            c1383r2.m2597p(true);
            c1383r = c1383r2;
        } else {
            C1383r c1383r6 = c1383r3;
            c1383r6.m2563R();
            c1383r = c1383r6;
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C2548h(c2642z, interfaceC2207p, interfaceC1601c, interfaceC1601c2, c1843e, i5);
        }
    }
}
