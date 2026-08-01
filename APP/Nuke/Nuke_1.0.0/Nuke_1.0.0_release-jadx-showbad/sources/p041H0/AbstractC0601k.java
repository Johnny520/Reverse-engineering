package p041H0;

import android.view.View;
import p011B4.AbstractC0231b;
import p023E0.AbstractC0277a;
import p029F0.AbstractC0388a;
import p029F0.C0410l;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p095T.AbstractC1384r0;
import p095T.AbstractC1385s;
import p105V.C1483e;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p136b0.C1847i;
import p169h0.AbstractC2206o;
import p175i0.C2267b;
import p175i0.C2268c;

/* JADX INFO: renamed from: H0.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0601k {

    /* JADX INFO: renamed from: a */
    public static final C0608n0 f1947a = new C0608n0(1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final long m1025a(float f2, boolean z5, boolean z6) {
        return (((z5 ? 1L : 0L) | (z6 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m1026b(C1483e c1483e, AbstractC2206o abstractC2206o) {
        C1483e c1483eM843y = m1044t(abstractC2206o).m843y();
        int i5 = c1483eM843y.f5183f - 1;
        Object[] objArr = c1483eM843y.f5181d;
        if (i5 < objArr.length) {
            while (i5 >= 0) {
                c1483e.m2753b(((C0564I) objArr[i5]).f1699J.f1896f);
                i5--;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final int m1027c(AbstractC0572Q abstractC0572Q, AbstractC0388a abstractC0388a) {
        AbstractC0572Q abstractC0572QMo889t0 = abstractC0572Q.mo889t0();
        if (abstractC0572QMo889t0 == null) {
            AbstractC0277a.m483b("Child of " + abstractC0572Q + " cannot be null when calculating alignment line");
        }
        if (abstractC0572Q.mo894z0().mo607a().containsKey(abstractC0388a)) {
            Integer num = (Integer) abstractC0572Q.mo894z0().mo607a().get(abstractC0388a);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iM888s0 = abstractC0572QMo889t0.m888s0(abstractC0388a);
            if (iM888s0 != Integer.MIN_VALUE) {
                abstractC0572QMo889t0.f1780m = true;
                abstractC0572Q.f1781n = true;
                abstractC0572Q.mo883F0();
                abstractC0572QMo889t0.f1780m = false;
                abstractC0572Q.f1781n = false;
                return iM888s0 + ((int) (abstractC0388a instanceof C0410l ? abstractC0572QMo889t0.mo880B0() & 4294967295L : abstractC0572QMo889t0.mo880B0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final AbstractC2206o m1028d(InterfaceC0597i interfaceC0597i, int i5) {
        AbstractC2206o abstractC2206o = ((AbstractC2206o) interfaceC0597i).f7186d.f7191i;
        if (abstractC2206o == null || (abstractC2206o.f7189g & i5) == 0) {
            return null;
        }
        while (abstractC2206o != null) {
            int i6 = abstractC2206o.f7188f;
            if ((i6 & 2) != 0) {
                return null;
            }
            if ((i6 & i5) != 0) {
                return abstractC2206o;
            }
            abstractC2206o = abstractC2206o.f7191i;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final AbstractC2206o m1029e(C1483e c1483e) {
        int i5;
        if (c1483e == null || (i5 = c1483e.f5183f) == 0) {
            return null;
        }
        return (AbstractC2206o) c1483e.m2762k(i5 - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:0x0016 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x0016 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h0.o */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: h0.o */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: h0.o */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: h0.o */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: h0.o */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: h0.o */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final InterfaceC0627x m1030f(AbstractC2206o abstractC2206o) {
        if ((abstractC2206o.f7188f & 2) != 0) {
            if (abstractC2206o instanceof InterfaceC0627x) {
                return (InterfaceC0627x) abstractC2206o;
            }
            if (abstractC2206o instanceof AbstractC0599j) {
                AbstractC2206o abstractC2206o2 = ((AbstractC0599j) abstractC2206o).f1943s;
                while (abstractC2206o2 != 0) {
                    if (abstractC2206o2 instanceof InterfaceC0627x) {
                        return (InterfaceC0627x) abstractC2206o2;
                    }
                    abstractC2206o2 = (!(abstractC2206o2 instanceof AbstractC0599j) || (abstractC2206o2.f7188f & 2) == 0) ? abstractC2206o2.f7191i : ((AbstractC0599j) abstractC2206o2).f1943s;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final int m1031g(long j5, long j6) {
        boolean zM1038n = m1038n(j5);
        if (zM1038n != m1038n(j6)) {
            return zM1038n ? -1 : 1;
        }
        return (Math.min(m1033i(j5), m1033i(j6)) >= 0.0f && m1037m(j5) != m1037m(j6)) ? m1037m(j5) ? -1 : 1 : (int) Math.signum(m1033i(j5) - m1033i(j6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: H0.h */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static final Object m1032h(InterfaceC0595h interfaceC0595h, AbstractC1384r0 abstractC1384r0) {
        if (!((AbstractC2206o) interfaceC0595h).f7186d.f7199q) {
            AbstractC0277a.m483b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        C1847i c1847i = (C1847i) m1044t(interfaceC0595h).f1695F;
        c1847i.getClass();
        return AbstractC1385s.m2630t(c1847i, abstractC1384r0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final float m1033i(long j5) {
        return Float.intBitsToFloat((int) (j5 >> 32));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: H0.m */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static final void m1034j(InterfaceC0605m interfaceC0605m) {
        if (((AbstractC2206o) interfaceC0605m).f7186d.f7199q) {
            m1042r(interfaceC0605m, 1).m988Y0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final void m1035k(InterfaceC0627x interfaceC0627x) {
        m1044t(interfaceC0627x).m796D();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final void m1036l(InterfaceC0632z0 interfaceC0632z0) {
        m1044t(interfaceC0632z0).m797E();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final boolean m1037m(long j5) {
        return (j5 & 2) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final boolean m1038n(long j5) {
        return (j5 & 1) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final boolean m1039o(C0564I c0564i) {
        if (c0564i.f1719l == null) {
            return false;
        }
        C0564I c0564iM839u = c0564i.m839u();
        return (c0564iM839u != null ? c0564iM839u.f1719l : null) == null || c0564i.f1700K.f1746b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h0.o */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static final void m1040p(AbstractC2206o abstractC2206o, InterfaceC1599a interfaceC1599a) {
        C0606m0 c0606m0 = abstractC2206o.f7192j;
        if (c0606m0 == null) {
            c0606m0 = new C0606m0((InterfaceC0604l0) abstractC2206o);
            abstractC2206o.f7192j = c0606m0;
        }
        C0618s0 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) m1045u(abstractC2206o)).getSnapshotObserver();
        snapshotObserver.f1972a.m3867c(c0606m0, C0587d.f1877j, interfaceC1599a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final void m1041q(InterfaceC0597i interfaceC0597i) {
        C2268c c2268c;
        C0564I c0564iM1044t = m1044t(interfaceC0597i);
        if (c0564iM1044t.f1731x || (c2268c = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(c0564iM1044t)).f2453O) == null) {
            return;
        }
        c2268c.f7416g.f3820a.m1356v(c0564iM1044t.f1712e, new C2267b(c2268c, c0564iM1044t));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final AbstractC0596h0 m1042r(InterfaceC0597i interfaceC0597i, int i5) {
        AbstractC0596h0 abstractC0596h0 = ((AbstractC2206o) interfaceC0597i).f7186d.f7193k;
        AbstractC1665j.m2982b(abstractC0596h0);
        if (abstractC0596h0.mo981R0() != interfaceC0597i || !AbstractC0598i0.m1014g(i5)) {
            return abstractC0596h0;
        }
        AbstractC0596h0 abstractC0596h02 = abstractC0596h0.f1933s;
        AbstractC1665j.m2982b(abstractC0596h02);
        return abstractC0596h02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final AbstractC0596h0 m1043s(InterfaceC0597i interfaceC0597i) {
        if (!((AbstractC2206o) interfaceC0597i).f7186d.f7199q) {
            AbstractC0277a.m483b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        AbstractC0596h0 abstractC0596h0M1042r = m1042r(interfaceC0597i, 2);
        if (!abstractC0596h0M1042r.mo981R0().f7199q) {
            AbstractC0277a.m483b("LayoutCoordinates is not attached.");
        }
        return abstractC0596h0M1042r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final C0564I m1044t(InterfaceC0597i interfaceC0597i) {
        AbstractC0596h0 abstractC0596h0 = ((AbstractC2206o) interfaceC0597i).f7186d.f7193k;
        if (abstractC0596h0 != null) {
            return abstractC0596h0.f1932r;
        }
        throw AbstractC0231b.m396g("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final InterfaceC0614q0 m1045u(InterfaceC0597i interfaceC0597i) {
        InterfaceC0614q0 interfaceC0614q0 = m1044t(interfaceC0597i).f1725r;
        if (interfaceC0614q0 != null) {
            return interfaceC0614q0;
        }
        throw AbstractC0231b.m396g("This node does not have an owner.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static final View m1046v(InterfaceC0597i interfaceC0597i) {
        if (!((AbstractC2206o) interfaceC0597i).f7186d.f7199q) {
            AbstractC0277a.m483b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) AbstractC0567L.m866a(m1044t(interfaceC0597i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:19:0x004a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:40:0x0080 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:70:0x002d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x002d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:75:0x0089 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [W2.c] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [V.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX INFO: renamed from: w */
    public static final void m1047w(InterfaceC0597i interfaceC0597i, Object obj, InterfaceC1601c interfaceC1601c) {
        C0590e0 c0590e0;
        AbstractC2206o abstractC2206o = (AbstractC2206o) interfaceC0597i;
        if (!abstractC2206o.f7186d.f7199q) {
            AbstractC0277a.m483b("visitAncestors called on an unattached node");
        }
        AbstractC2206o abstractC2206o2 = abstractC2206o.f7186d.f7190h;
        C0564I c0564iM1044t = m1044t(interfaceC0597i);
        while (c0564iM1044t != null) {
            if ((c0564iM1044t.f1699J.f1896f.f7189g & 262144) != 0) {
                while (abstractC2206o2 != null) {
                    if ((abstractC2206o2.f7188f & 262144) != 0) {
                        ?? M1029e = abstractC2206o2;
                        ?? c1483e = 0;
                        while (M1029e != 0) {
                            if (M1029e instanceof InterfaceC0558E0) {
                                InterfaceC0558E0 interfaceC0558E0 = (InterfaceC0558E0) M1029e;
                                if (!(obj.equals(interfaceC0558E0.mo146s()) ? ((Boolean) interfaceC1601c.mo1h(interfaceC0558E0)).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((M1029e.f7188f & 262144) != 0) && (M1029e instanceof AbstractC0599j)) {
                                    AbstractC2206o abstractC2206o3 = ((AbstractC0599j) M1029e).f1943s;
                                    int i5 = 0;
                                    M1029e = M1029e;
                                    c1483e = c1483e;
                                    while (abstractC2206o3 != null) {
                                        if ((abstractC2206o3.f7188f & 262144) != 0) {
                                            i5++;
                                            c1483e = c1483e;
                                            if (i5 == 1) {
                                                M1029e = abstractC2206o3;
                                            } else {
                                                if (c1483e == 0) {
                                                    c1483e = new C1483e(new AbstractC2206o[16]);
                                                }
                                                if (M1029e != 0) {
                                                    c1483e.m2753b(M1029e);
                                                    M1029e = 0;
                                                }
                                                c1483e.m2753b(abstractC2206o3);
                                            }
                                        }
                                        abstractC2206o3 = abstractC2206o3.f7191i;
                                        M1029e = M1029e;
                                        c1483e = c1483e;
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                            }
                            M1029e = m1029e(c1483e);
                        }
                    }
                    abstractC2206o2 = abstractC2206o2.f7190h;
                }
            }
            c0564iM1044t = c0564iM1044t.m839u();
            abstractC2206o2 = (c0564iM1044t == null || (c0590e0 = c0564iM1044t.f1699J) == null) ? null : c0590e0.f1895e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x0058 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:42:0x008e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x002d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x002d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:77:0x0097 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [H0.E0, H0.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [W2.c] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [V.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX INFO: renamed from: x */
    public static final void m1048x(InterfaceC0558E0 interfaceC0558E0, InterfaceC1601c interfaceC1601c) {
        C0590e0 c0590e0;
        AbstractC2206o abstractC2206o = (AbstractC2206o) interfaceC0558E0;
        if (!abstractC2206o.f7186d.f7199q) {
            AbstractC0277a.m483b("visitAncestors called on an unattached node");
        }
        AbstractC2206o abstractC2206o2 = abstractC2206o.f7186d.f7190h;
        C0564I c0564iM1044t = m1044t(interfaceC0558E0);
        while (c0564iM1044t != null) {
            if ((c0564iM1044t.f1699J.f1896f.f7189g & 262144) != 0) {
                while (abstractC2206o2 != null) {
                    if ((abstractC2206o2.f7188f & 262144) != 0) {
                        ?? M1029e = abstractC2206o2;
                        ?? c1483e = 0;
                        while (M1029e != 0) {
                            boolean zBooleanValue = true;
                            if (M1029e instanceof InterfaceC0558E0) {
                                InterfaceC0558E0 interfaceC0558E02 = (InterfaceC0558E0) M1029e;
                                if (AbstractC1665j.m2981a(interfaceC0558E0.mo146s(), interfaceC0558E02.mo146s()) && interfaceC0558E0.getClass() == interfaceC0558E02.getClass()) {
                                    zBooleanValue = ((Boolean) interfaceC1601c.mo1h(interfaceC0558E02)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((M1029e.f7188f & 262144) != 0) && (M1029e instanceof AbstractC0599j)) {
                                    AbstractC2206o abstractC2206o3 = ((AbstractC0599j) M1029e).f1943s;
                                    int i5 = 0;
                                    M1029e = M1029e;
                                    c1483e = c1483e;
                                    while (abstractC2206o3 != null) {
                                        if ((abstractC2206o3.f7188f & 262144) != 0) {
                                            i5++;
                                            c1483e = c1483e;
                                            if (i5 == 1) {
                                                M1029e = abstractC2206o3;
                                            } else {
                                                if (c1483e == 0) {
                                                    c1483e = new C1483e(new AbstractC2206o[16]);
                                                }
                                                if (M1029e != 0) {
                                                    c1483e.m2753b(M1029e);
                                                    M1029e = 0;
                                                }
                                                c1483e.m2753b(abstractC2206o3);
                                            }
                                        }
                                        abstractC2206o3 = abstractC2206o3.f7191i;
                                        M1029e = M1029e;
                                        c1483e = c1483e;
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                            }
                            M1029e = m1029e(c1483e);
                        }
                    }
                    abstractC2206o2 = abstractC2206o2.f7190h;
                }
            }
            c0564iM1044t = c0564iM1044t.m839u();
            abstractC2206o2 = (c0564iM1044t == null || (c0590e0 = c0564iM1044t.f1699J) == null) ? null : c0590e0.f1895e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:47:0x0090 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:68:0x009f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x0045 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x0045 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:77:0x0099 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [W2.c] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [V.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX INFO: renamed from: y */
    public static final void m1049y(InterfaceC0597i interfaceC0597i, String str, InterfaceC1601c interfaceC1601c) {
        AbstractC2206o abstractC2206o = (AbstractC2206o) interfaceC0597i;
        if (!abstractC2206o.f7186d.f7199q) {
            AbstractC0277a.m483b("visitSubtreeIf called on an unattached node");
        }
        C1483e c1483e = new C1483e(new AbstractC2206o[16]);
        AbstractC2206o abstractC2206o2 = abstractC2206o.f7186d;
        AbstractC2206o abstractC2206o3 = abstractC2206o2.f7191i;
        if (abstractC2206o3 == null) {
            m1026b(c1483e, abstractC2206o2);
        } else {
            c1483e.m2753b(abstractC2206o3);
        }
        while (true) {
            int i5 = c1483e.f5183f;
            if (i5 == 0) {
                return;
            }
            AbstractC2206o abstractC2206o4 = (AbstractC2206o) c1483e.m2762k(i5 - 1);
            if ((abstractC2206o4.f7189g & 262144) != 0) {
                for (AbstractC2206o abstractC2206o5 = abstractC2206o4; abstractC2206o5 != null && abstractC2206o5.f7199q; abstractC2206o5 = abstractC2206o5.f7191i) {
                    if ((abstractC2206o5.f7188f & 262144) != 0) {
                        ?? M1029e = abstractC2206o5;
                        ?? c1483e2 = 0;
                        while (M1029e != 0) {
                            if (M1029e instanceof InterfaceC0558E0) {
                                InterfaceC0558E0 interfaceC0558E0 = (InterfaceC0558E0) M1029e;
                                EnumC0556D0 enumC0556D0 = str.equals(interfaceC0558E0.mo146s()) ? (EnumC0556D0) interfaceC1601c.mo1h(interfaceC0558E0) : EnumC0556D0.f1668d;
                                if (enumC0556D0 == EnumC0556D0.f1670f) {
                                    return;
                                }
                                if (enumC0556D0 == EnumC0556D0.f1669e) {
                                    break;
                                }
                            } else if ((M1029e.f7188f & 262144) != 0 && (M1029e instanceof AbstractC0599j)) {
                                AbstractC2206o abstractC2206o6 = ((AbstractC0599j) M1029e).f1943s;
                                int i6 = 0;
                                M1029e = M1029e;
                                c1483e2 = c1483e2;
                                while (abstractC2206o6 != null) {
                                    if ((abstractC2206o6.f7188f & 262144) != 0) {
                                        i6++;
                                        c1483e2 = c1483e2;
                                        if (i6 == 1) {
                                            M1029e = abstractC2206o6;
                                        } else {
                                            if (c1483e2 == 0) {
                                                c1483e2 = new C1483e(new AbstractC2206o[16]);
                                            }
                                            if (M1029e != 0) {
                                                c1483e2.m2753b(M1029e);
                                                M1029e = 0;
                                            }
                                            c1483e2.m2753b(abstractC2206o6);
                                        }
                                    }
                                    abstractC2206o6 = abstractC2206o6.f7191i;
                                    M1029e = M1029e;
                                    c1483e2 = c1483e2;
                                }
                                if (i6 == 1) {
                                }
                            }
                            M1029e = m1029e(c1483e2);
                        }
                    }
                }
            }
            m1026b(c1483e, abstractC2206o4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x009f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:70:0x00ae */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x0046 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:76:0x0046 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:79:0x00a8 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [H0.E0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [W2.c] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [V.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: z */
    public static final void m1050z(InterfaceC0558E0 interfaceC0558E0, InterfaceC1601c interfaceC1601c) {
        AbstractC2206o abstractC2206o = (AbstractC2206o) interfaceC0558E0;
        if (!abstractC2206o.f7186d.f7199q) {
            AbstractC0277a.m483b("visitSubtreeIf called on an unattached node");
        }
        C1483e c1483e = new C1483e(new AbstractC2206o[16]);
        AbstractC2206o abstractC2206o2 = abstractC2206o.f7186d;
        AbstractC2206o abstractC2206o3 = abstractC2206o2.f7191i;
        if (abstractC2206o3 == null) {
            m1026b(c1483e, abstractC2206o2);
        } else {
            c1483e.m2753b(abstractC2206o3);
        }
        while (true) {
            int i5 = c1483e.f5183f;
            if (i5 == 0) {
                return;
            }
            AbstractC2206o abstractC2206o4 = (AbstractC2206o) c1483e.m2762k(i5 - 1);
            if ((abstractC2206o4.f7189g & 262144) != 0) {
                for (AbstractC2206o abstractC2206o5 = abstractC2206o4; abstractC2206o5 != null && abstractC2206o5.f7199q; abstractC2206o5 = abstractC2206o5.f7191i) {
                    if ((abstractC2206o5.f7188f & 262144) != 0) {
                        ?? M1029e = abstractC2206o5;
                        ?? c1483e2 = 0;
                        while (M1029e != 0) {
                            if (M1029e instanceof InterfaceC0558E0) {
                                InterfaceC0558E0 interfaceC0558E02 = (InterfaceC0558E0) M1029e;
                                EnumC0556D0 enumC0556D0 = (AbstractC1665j.m2981a(interfaceC0558E0.mo146s(), interfaceC0558E02.mo146s()) && interfaceC0558E0.getClass() == interfaceC0558E02.getClass()) ? (EnumC0556D0) interfaceC1601c.mo1h(interfaceC0558E02) : EnumC0556D0.f1668d;
                                if (enumC0556D0 == EnumC0556D0.f1670f) {
                                    return;
                                }
                                if (enumC0556D0 == EnumC0556D0.f1669e) {
                                    break;
                                }
                            } else if ((M1029e.f7188f & 262144) != 0 && (M1029e instanceof AbstractC0599j)) {
                                AbstractC2206o abstractC2206o6 = ((AbstractC0599j) M1029e).f1943s;
                                int i6 = 0;
                                M1029e = M1029e;
                                c1483e2 = c1483e2;
                                while (abstractC2206o6 != null) {
                                    if ((abstractC2206o6.f7188f & 262144) != 0) {
                                        i6++;
                                        c1483e2 = c1483e2;
                                        if (i6 == 1) {
                                            M1029e = abstractC2206o6;
                                        } else {
                                            if (c1483e2 == 0) {
                                                c1483e2 = new C1483e(new AbstractC2206o[16]);
                                            }
                                            if (M1029e != 0) {
                                                c1483e2.m2753b(M1029e);
                                                M1029e = 0;
                                            }
                                            c1483e2.m2753b(abstractC2206o6);
                                        }
                                    }
                                    abstractC2206o6 = abstractC2206o6.f7191i;
                                    M1029e = M1029e;
                                    c1483e2 = c1483e2;
                                }
                                if (i6 == 1) {
                                }
                            }
                            M1029e = m1029e(c1483e2);
                        }
                    }
                }
            }
            m1026b(c1483e, abstractC2206o4);
        }
    }
}
