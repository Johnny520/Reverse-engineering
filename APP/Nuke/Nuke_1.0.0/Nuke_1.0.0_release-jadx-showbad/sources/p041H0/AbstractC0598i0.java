package p041H0;

import p000A.C0038T0;
import p007B0.C0174G;
import p023E0.AbstractC0277a;
import p029F0.C0385X;
import p029F0.InterfaceC0433x;
import p035G0.InterfaceC0471c;
import p047I0.C0749n;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p063M0.InterfaceC0993a;
import p077P0.C1115b;
import p105V.C1483e;
import p169h0.AbstractC2206o;
import p169h0.InterfaceC2205n;
import p186k.AbstractC2412I;
import p186k.C2444z;
import p193l0.InterfaceC2484g;
import p197m.C2554n;
import p198m0.C2567A;
import p198m0.C2578i;
import p198m0.C2584o;
import p198m0.InterfaceC2576g;
import p198m0.InterfaceC2589t;
import p260x.C3432o;
import p267y0.InterfaceC3481c;
import p273z0.InterfaceC3512e;

/* JADX INFO: renamed from: H0.i0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0598i0 {

    /* JADX INFO: renamed from: a */
    public static final C2444z f1941a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C2444z c2444z = AbstractC2412I.f7812a;
        f1941a = new C2444z();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m1008a(AbstractC2206o abstractC2206o, int i5, int i6) {
        if (!(abstractC2206o instanceof AbstractC0599j)) {
            m1009b(abstractC2206o, i5 & abstractC2206o.f7188f, i6);
            return;
        }
        AbstractC0599j abstractC0599j = (AbstractC0599j) abstractC2206o;
        int i7 = abstractC0599j.f1942r;
        m1009b(abstractC2206o, i7 & i5, i6);
        int i8 = (~i7) & i5;
        for (AbstractC2206o abstractC2206o2 = abstractC0599j.f1943s; abstractC2206o2 != null; abstractC2206o2 = abstractC2206o2.f7191i) {
            m1008a(abstractC2206o2, i8, i6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v8, resolved type: m0.t */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: h0.o */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m1009b(AbstractC2206o abstractC2206o, int i5, int i6) {
        if (i6 != 0 || abstractC2206o.mo656y0()) {
            if ((i5 & 2) != 0 && (abstractC2206o instanceof InterfaceC0627x)) {
                AbstractC0601k.m1035k((InterfaceC0627x) abstractC2206o);
                if (i6 == 2) {
                    AbstractC0601k.m1042r(abstractC2206o, 2).m993d1();
                }
            }
            if ((i5 & 128) != 0 && i6 != 2) {
                AbstractC0601k.m1044t(abstractC2206o).m796D();
            }
            if ((4194304 & i5) != 0 && i6 != 2) {
                AbstractC0601k.m1044t(abstractC2206o).m812U(false);
            }
            if ((i5 & 256) != 0 && (abstractC2206o instanceof InterfaceC0607n)) {
                if (i6 == 1) {
                    C0564I c0564iM1044t = AbstractC0601k.m1044t(abstractC2206o);
                    c0564iM1044t.m817a0(c0564iM1044t.f1709T + 1);
                } else if (i6 == 2) {
                    AbstractC0601k.m1044t(abstractC2206o).m817a0(r0.f1709T - 1);
                }
                if (i6 != 2) {
                    C0564I c0564iM1044t2 = AbstractC0601k.m1044t(abstractC2206o);
                    if (c0564iM1044t2.f1709T != 0 && !c0564iM1044t2.m834p() && !c0564iM1044t2.m835q() && !c0564iM1044t2.f1708S) {
                        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = (ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(c0564iM1044t2);
                        C0038T0 c0038t0 = viewTreeObserverOnGlobalLayoutListenerC0772y.f2462a0.f1826e;
                        c0038t0.getClass();
                        if (c0564iM1044t2.f1709T > 0) {
                            ((C1483e) c0038t0.f169e).m2753b(c0564iM1044t2);
                            c0564iM1044t2.f1708S = true;
                        }
                        viewTreeObserverOnGlobalLayoutListenerC0772y.m1299G(null);
                    }
                }
            }
            if ((i5 & 4) != 0 && (abstractC2206o instanceof InterfaceC0605m)) {
                AbstractC0601k.m1034j((InterfaceC0605m) abstractC2206o);
            }
            if ((i5 & 8) != 0 && (abstractC2206o instanceof InterfaceC0632z0)) {
                AbstractC0601k.m1044t(abstractC2206o).f1729v = true;
            }
            if ((i5 & 64) != 0 && (abstractC2206o instanceof InterfaceC0620t0)) {
                C0568M c0568m = AbstractC0601k.m1044t((InterfaceC0620t0) abstractC2206o).f1700K;
                c0568m.f1760p.f1856s = true;
                C0576V c0576v = c0568m.f1761q;
                if (c0576v != null) {
                    c0576v.f1817y = true;
                }
            }
            if ((i5 & 2048) != 0 && (abstractC2206o instanceof InterfaceC2589t)) {
                InterfaceC2589t interfaceC2589t = (InterfaceC2589t) abstractC2206o;
                C0585c.f1866b = null;
                interfaceC2589t.mo947e(C0585c.f1865a);
                if (C0585c.f1866b != null) {
                    AbstractC2206o abstractC2206o2 = (AbstractC2206o) interfaceC2589t;
                    if (!abstractC2206o2.f7186d.f7199q) {
                        AbstractC0277a.m483b("visitChildren called on an unattached node");
                    }
                    C1483e c1483e = new C1483e(new AbstractC2206o[16]);
                    AbstractC2206o abstractC2206o3 = abstractC2206o2.f7186d;
                    AbstractC2206o abstractC2206o4 = abstractC2206o3.f7191i;
                    if (abstractC2206o4 == null) {
                        AbstractC0601k.m1026b(c1483e, abstractC2206o3);
                    } else {
                        c1483e.m2753b(abstractC2206o4);
                    }
                    while (true) {
                        int i7 = c1483e.f5183f;
                        if (i7 == 0) {
                            break;
                        }
                        AbstractC2206o abstractC2206oM1029e = (AbstractC2206o) c1483e.m2762k(i7 - 1);
                        if ((abstractC2206oM1029e.f7189g & 1024) == 0) {
                            AbstractC0601k.m1026b(c1483e, abstractC2206oM1029e);
                        } else {
                            while (true) {
                                if (abstractC2206oM1029e == null) {
                                    break;
                                }
                                if ((abstractC2206oM1029e.f7188f & 1024) != 0) {
                                    C1483e c1483e2 = null;
                                    while (abstractC2206oM1029e != null) {
                                        if (abstractC2206oM1029e instanceof C2567A) {
                                            C2567A c2567a = (C2567A) abstractC2206oM1029e;
                                            C2578i c2578i = ((C2584o) ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(c2567a)).getFocusOwner()).f8225d;
                                            if (c2578i.f8215c.m4279a(c2567a)) {
                                                c2578i.m4525a();
                                            }
                                        } else if ((abstractC2206oM1029e.f7188f & 1024) != 0 && (abstractC2206oM1029e instanceof AbstractC0599j)) {
                                            int i8 = 0;
                                            for (AbstractC2206o abstractC2206o5 = ((AbstractC0599j) abstractC2206oM1029e).f1943s; abstractC2206o5 != null; abstractC2206o5 = abstractC2206o5.f7191i) {
                                                if ((abstractC2206o5.f7188f & 1024) != 0) {
                                                    i8++;
                                                    if (i8 == 1) {
                                                        abstractC2206oM1029e = abstractC2206o5;
                                                    } else {
                                                        if (c1483e2 == null) {
                                                            c1483e2 = new C1483e(new AbstractC2206o[16]);
                                                        }
                                                        if (abstractC2206oM1029e != null) {
                                                            c1483e2.m2753b(abstractC2206oM1029e);
                                                            abstractC2206oM1029e = null;
                                                        }
                                                        c1483e2.m2753b(abstractC2206o5);
                                                    }
                                                }
                                            }
                                            if (i8 == 1) {
                                            }
                                        }
                                        abstractC2206oM1029e = AbstractC0601k.m1029e(c1483e2);
                                    }
                                } else {
                                    abstractC2206oM1029e = abstractC2206oM1029e.f7191i;
                                }
                            }
                        }
                    }
                }
            }
            if ((i5 & 4096) == 0 || !(abstractC2206o instanceof InterfaceC2576g)) {
                return;
            }
            InterfaceC2576g interfaceC2576g = (InterfaceC2576g) abstractC2206o;
            C2578i c2578i2 = ((C2584o) ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(interfaceC2576g)).getFocusOwner()).f8225d;
            if (c2578i2.f8216d.m4279a(interfaceC2576g)) {
                c2578i2.m4525a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m1010c(AbstractC2206o abstractC2206o) {
        if (!abstractC2206o.f7199q) {
            AbstractC0277a.m483b("autoInvalidateUpdatedNode called on unattached node");
        }
        m1008a(abstractC2206o, -1, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final int m1011d(InterfaceC2205n interfaceC2205n) {
        int i5 = interfaceC2205n instanceof InterfaceC0433x ? 3 : 1;
        if (interfaceC2205n instanceof InterfaceC2484g) {
            i5 |= 4;
        }
        if (interfaceC2205n instanceof C1115b) {
            i5 |= 8;
        }
        if (interfaceC2205n instanceof C0174G) {
            i5 |= 16;
        }
        if (interfaceC2205n instanceof C2554n) {
            i5 |= 64;
        }
        return interfaceC2205n instanceof InterfaceC0993a ? 524288 | i5 : i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final int m1012e(AbstractC2206o abstractC2206o) {
        int i5 = abstractC2206o.f7188f;
        if (i5 != 0) {
            return i5;
        }
        Class<?> cls = abstractC2206o.getClass();
        C2444z c2444z = f1941a;
        int iM4364d = c2444z.m4364d(cls);
        if (iM4364d >= 0) {
            return c2444z.f7900c[iM4364d];
        }
        int i6 = abstractC2206o instanceof InterfaceC0627x ? 3 : 1;
        if (abstractC2206o instanceof InterfaceC0605m) {
            i6 |= 4;
        }
        if (abstractC2206o instanceof InterfaceC0632z0) {
            i6 |= 8;
        }
        if (abstractC2206o instanceof InterfaceC0624v0) {
            i6 |= 16;
        }
        if (abstractC2206o instanceof InterfaceC0471c) {
            i6 |= 32;
        }
        if (abstractC2206o instanceof InterfaceC0620t0) {
            i6 |= 64;
        }
        if (abstractC2206o instanceof C0385X) {
            i6 |= 128;
        } else if (abstractC2206o instanceof InterfaceC0625w) {
            i6 |= 4194432;
        }
        if (abstractC2206o instanceof InterfaceC0607n) {
            i6 |= 256;
        }
        if (abstractC2206o instanceof C2567A) {
            i6 |= 1024;
        }
        if (abstractC2206o instanceof InterfaceC2589t) {
            i6 |= 2048;
        }
        if (abstractC2206o instanceof InterfaceC2576g) {
            i6 |= 4096;
        }
        if (abstractC2206o instanceof InterfaceC3512e) {
            i6 |= 8192;
        }
        if (abstractC2206o instanceof C0749n) {
            i6 |= 16384;
        }
        if (abstractC2206o instanceof InterfaceC0595h) {
            i6 |= 32768;
        }
        if (abstractC2206o instanceof InterfaceC0558E0) {
            i6 |= 262144;
        }
        if (abstractC2206o instanceof InterfaceC0993a) {
            i6 |= 524288;
        }
        if (abstractC2206o instanceof InterfaceC3481c) {
            i6 |= 2097152;
        }
        if (abstractC2206o instanceof C3432o) {
            i6 |= 8388608;
        }
        c2444z.m4367g(i6, cls);
        return i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final int m1013f(AbstractC2206o abstractC2206o) {
        if (!(abstractC2206o instanceof AbstractC0599j)) {
            return m1012e(abstractC2206o);
        }
        AbstractC0599j abstractC0599j = (AbstractC0599j) abstractC2206o;
        int iM1013f = abstractC0599j.f1942r;
        for (AbstractC2206o abstractC2206o2 = abstractC0599j.f1943s; abstractC2206o2 != null; abstractC2206o2 = abstractC2206o2.f7191i) {
            iM1013f |= m1013f(abstractC2206o2);
        }
        return iM1013f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final boolean m1014g(int i5) {
        return ((i5 & 128) != 0) | ((i5 & 4194304) != 0);
    }
}
