package p041d1;

import ac.AbstractC0063p;
import gg.AbstractC1416l;
import gg.C1425u;
import java.util.Arrays;
import okio.C3193a;
import p016b1.C0167g;
import p057e1.C0808c;
import p085fg.InterfaceC1231l;
import p131j0.C2046b;
import p136j8.C2104o;
import p172lg.C2564d;
import p174m.C2581c;
import p174m.EnumC2640p1;
import p251r.C3622g;
import p251r.C3631p;
import p251r.C3632q;
import p251r.C3641z;
import p259r9.AbstractC3754e0;
import p265s.C3843m;
import p265s.C3851q;
import p265s.C3853r;
import p292u1.AbstractC4229a;
import p308v1.AbstractC4434w;
import p308v1.InterfaceC4428t;
import p339x1.AbstractC5614i1;
import p339x1.AbstractC5615j;
import p339x1.AbstractC5618k;
import p339x1.C5587b1;
import p339x1.C5602f0;
import p356y0.AbstractC5852n;
import p356y0.InterfaceC5853o;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: d1.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0656d {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static final boolean m1806A(int i9, C0167g c0167g, C0653b0 c0653b0, C0808c c0808c) {
        C0653b0 c0653b0M1815g;
        C2046b c2046b = new C2046b(new C0653b0[16]);
        if (!c0653b0.f23788g.f23801t) {
            AbstractC4229a.m8494b("visitChildren called on an unattached node");
        }
        C2046b c2046b2 = new C2046b(new AbstractC5852n[16]);
        AbstractC5852n abstractC5852n = c0653b0.f23788g;
        AbstractC5852n abstractC5852n2 = abstractC5852n.f23793l;
        if (abstractC5852n2 == null) {
            AbstractC5618k.m10146b(c2046b2, abstractC5852n);
        } else {
            c2046b2.m5056b(abstractC5852n2);
        }
        while (true) {
            int i10 = c2046b2.f6893i;
            if (i10 == 0) {
                break;
            }
            AbstractC5852n abstractC5852nM10149e = (AbstractC5852n) c2046b2.m5065k(i10 - 1);
            if ((abstractC5852nM10149e.f23791j & 1024) == 0) {
                AbstractC5618k.m10146b(c2046b2, abstractC5852nM10149e);
            } else {
                while (true) {
                    if (abstractC5852nM10149e == null) {
                        break;
                    }
                    if ((abstractC5852nM10149e.f23790i & 1024) != 0) {
                        C2046b c2046b3 = null;
                        while (abstractC5852nM10149e != null) {
                            if (abstractC5852nM10149e instanceof C0653b0) {
                                C0653b0 c0653b02 = (C0653b0) abstractC5852nM10149e;
                                if (c0653b02.f23801t) {
                                    c2046b.m5056b(c0653b02);
                                }
                            } else if ((abstractC5852nM10149e.f23790i & 1024) != 0 && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                                int i11 = 0;
                                for (AbstractC5852n abstractC5852n3 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n3 != null; abstractC5852n3 = abstractC5852n3.f23793l) {
                                    if ((abstractC5852n3.f23790i & 1024) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            abstractC5852nM10149e = abstractC5852n3;
                                        } else {
                                            if (c2046b3 == null) {
                                                c2046b3 = new C2046b(new AbstractC5852n[16]);
                                            }
                                            if (abstractC5852nM10149e != null) {
                                                c2046b3.m5056b(abstractC5852nM10149e);
                                                abstractC5852nM10149e = null;
                                            }
                                            c2046b3.m5056b(abstractC5852n3);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b3);
                        }
                    } else {
                        abstractC5852nM10149e = abstractC5852nM10149e.f23793l;
                    }
                }
            }
        }
        while (c2046b.f6893i != 0 && (c0653b0M1815g = m1815g(c2046b, c0808c, i9)) != null) {
            if (c0653b0M1815g.m1799m1().f2066a) {
                return ((Boolean) c0167g.invoke(c0653b0M1815g)).booleanValue();
            }
            if (m1820l(i9, c0167g, c0653b0M1815g, c0808c)) {
                return true;
            }
            c2046b.m5064j(c0653b0M1815g);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fe, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0197 A[EDGE_INSN: B:157:0x0197->B:127:0x0197 BREAK  A[LOOP:5: B:89:0x012c->B:162:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012e  */
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m1807B(C0653b0 c0653b0, C0653b0 c0653b02, int i9, C0167g c0167g) {
        AbstractC5852n abstractC5852n;
        C5602f0 c5602f0M10167w;
        C5587b1 c5587b1;
        if (c0653b0.m1803p1() != EnumC0680z.f2085h) {
            C2104o.m5276A("This function should only be used within a parent that has focus.");
            return false;
        }
        Object[] objArr = new C0653b0[16];
        if (!c0653b0.f23788g.f23801t) {
            AbstractC4229a.m8494b("visitChildren called on an unattached node");
        }
        C2046b c2046b = new C2046b(new AbstractC5852n[16]);
        AbstractC5852n abstractC5852n2 = c0653b0.f23788g;
        AbstractC5852n abstractC5852n3 = abstractC5852n2.f23793l;
        if (abstractC5852n3 == null) {
            AbstractC5618k.m10146b(c2046b, abstractC5852n2);
        } else {
            c2046b.m5056b(abstractC5852n3);
        }
        int i10 = 0;
        while (true) {
            int i11 = c2046b.f6893i;
            abstractC5852n = null;
            if (i11 == 0) {
                break;
            }
            AbstractC5852n abstractC5852nM10149e = (AbstractC5852n) c2046b.m5065k(i11 - 1);
            if ((abstractC5852nM10149e.f23791j & 1024) == 0) {
                AbstractC5618k.m10146b(c2046b, abstractC5852nM10149e);
            } else {
                while (true) {
                    if (abstractC5852nM10149e == null) {
                        break;
                    }
                    if ((abstractC5852nM10149e.f23790i & 1024) != 0) {
                        C2046b c2046b2 = null;
                        while (abstractC5852nM10149e != null) {
                            if (abstractC5852nM10149e instanceof C0653b0) {
                                C0653b0 c0653b03 = (C0653b0) abstractC5852nM10149e;
                                int i12 = i10 + 1;
                                if (objArr.length < i12) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i12, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i10] = c0653b03;
                                i10 = i12;
                            } else if ((abstractC5852nM10149e.f23790i & 1024) != 0 && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                                int i13 = 0;
                                for (AbstractC5852n abstractC5852n4 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n4 != null; abstractC5852n4 = abstractC5852n4.f23793l) {
                                    if ((abstractC5852n4.f23790i & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            abstractC5852nM10149e = abstractC5852n4;
                                        } else {
                                            if (c2046b2 == null) {
                                                c2046b2 = new C2046b(new AbstractC5852n[16]);
                                            }
                                            if (abstractC5852nM10149e != null) {
                                                c2046b2.m5056b(abstractC5852nM10149e);
                                                abstractC5852nM10149e = null;
                                            }
                                            c2046b2.m5056b(abstractC5852n4);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b2);
                        }
                    } else {
                        abstractC5852nM10149e = abstractC5852nM10149e.f23793l;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i10, C0657d0.f2031g);
        if (i9 != 1) {
            if (i9 != 2) {
                C2104o.m5276A("This function should only be used for 1-D focus search");
                return false;
            }
            C2564d c2564dM7910r0 = AbstractC3754e0.m7910r0(0, i10);
            int i14 = c2564dM7910r0.f8312g;
            int i15 = c2564dM7910r0.f8313h;
            if (i14 <= i15) {
                boolean z9 = false;
                while (true) {
                    if (z9) {
                        C0653b0 c0653b04 = (C0653b0) objArr[i15];
                        if (m1826r(c0653b04) && m1809a(c0653b04, c0167g)) {
                            break;
                        }
                    }
                    if (AbstractC1416l.m3825a(objArr[i15], c0653b02)) {
                        z9 = true;
                    }
                    if (i15 == i14) {
                        break;
                    }
                    i15--;
                }
            }
            if (i9 != 1) {
                if (!c0653b0.f23788g.f23801t) {
                }
                AbstractC5852n abstractC5852n5 = c0653b0.f23788g.f23792k;
                c5602f0M10167w = AbstractC5618k.m10167w(c0653b0);
                loop5: while (true) {
                    if (c5602f0M10167w == null) {
                    }
                }
                if (abstractC5852n != null) {
                }
            }
            return false;
        }
        C2564d c2564dM7910r02 = AbstractC3754e0.m7910r0(0, i10);
        int i16 = c2564dM7910r02.f8312g;
        int i17 = c2564dM7910r02.f8313h;
        if (i16 <= i17) {
            boolean z10 = false;
            while (true) {
                if (z10) {
                    C0653b0 c0653b05 = (C0653b0) objArr[i16];
                    if (m1826r(c0653b05) && m1819k(c0653b05, c0167g)) {
                        break;
                    }
                }
                if (AbstractC1416l.m3825a(objArr[i16], c0653b02)) {
                    z10 = true;
                }
                if (i16 == i17) {
                    break;
                }
                i16++;
            }
        }
        if (i9 != 1 && c0653b0.m1799m1().f2066a) {
            if (!c0653b0.f23788g.f23801t) {
                AbstractC4229a.m8494b("visitAncestors called on an unattached node");
            }
            AbstractC5852n abstractC5852n52 = c0653b0.f23788g.f23792k;
            c5602f0M10167w = AbstractC5618k.m10167w(c0653b0);
            loop5: while (true) {
                if (c5602f0M10167w == null) {
                    break;
                }
                if ((c5602f0M10167w.f22778L.f22719f.f23791j & 1024) != 0) {
                    while (abstractC5852n52 != null) {
                        if ((abstractC5852n52.f23790i & 1024) != 0) {
                            AbstractC5852n abstractC5852nM10149e2 = abstractC5852n52;
                            C2046b c2046b3 = null;
                            while (abstractC5852nM10149e2 != null) {
                                if (abstractC5852nM10149e2 instanceof C0653b0) {
                                    abstractC5852n = abstractC5852nM10149e2;
                                    break loop5;
                                }
                                if ((abstractC5852nM10149e2.f23790i & 1024) != 0 && (abstractC5852nM10149e2 instanceof AbstractC5615j)) {
                                    int i18 = 0;
                                    for (AbstractC5852n abstractC5852n6 = ((AbstractC5615j) abstractC5852nM10149e2).f22875v; abstractC5852n6 != null; abstractC5852n6 = abstractC5852n6.f23793l) {
                                        if ((abstractC5852n6.f23790i & 1024) != 0) {
                                            i18++;
                                            if (i18 == 1) {
                                                abstractC5852nM10149e2 = abstractC5852n6;
                                            } else {
                                                if (c2046b3 == null) {
                                                    c2046b3 = new C2046b(new AbstractC5852n[16]);
                                                }
                                                if (abstractC5852nM10149e2 != null) {
                                                    c2046b3.m5056b(abstractC5852nM10149e2);
                                                    abstractC5852nM10149e2 = null;
                                                }
                                                c2046b3.m5056b(abstractC5852n6);
                                            }
                                        }
                                    }
                                    if (i18 == 1) {
                                    }
                                }
                                abstractC5852nM10149e2 = AbstractC5618k.m10149e(c2046b3);
                            }
                        }
                        abstractC5852n52 = abstractC5852n52.f23792k;
                    }
                }
                c5602f0M10167w = c5602f0M10167w.m10049u();
                abstractC5852n52 = (c5602f0M10167w == null || (c5587b1 = c5602f0M10167w.f22778L) == null) ? null : c5587b1.f22718e;
            }
            if (abstractC5852n != null) {
                return ((Boolean) c0167g.invoke(c0653b0)).booleanValue();
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static final Boolean m1808C(int i9, C0167g c0167g, C0653b0 c0653b0, C0808c c0808c) {
        int iOrdinal = c0653b0.m1803p1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C0653b0 c0653b0M1822n = m1822n(c0653b0);
                if (c0653b0M1822n == null) {
                    C2104o.m5276A("ActiveParent must have a focusedChild");
                    return null;
                }
                int iOrdinal2 = c0653b0M1822n.m1803p1().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolM1808C = m1808C(i9, c0167g, c0653b0M1822n, c0808c);
                        if (!AbstractC1416l.m3825a(boolM1808C, Boolean.FALSE)) {
                            return boolM1808C;
                        }
                        if (c0808c == null) {
                            if (c0653b0M1822n.m1803p1() != EnumC0680z.f2085h) {
                                C2104o.m5276A("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            C0653b0 c0653b0M1814f = m1814f(c0653b0M1822n);
                            if (c0653b0M1814f == null) {
                                C2104o.m5276A("ActiveParent must have a focusedChild");
                                return null;
                            }
                            c0808c = m1817i(c0653b0M1814f);
                        }
                        return Boolean.valueOf(m1820l(i9, c0167g, c0653b0, c0808c));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            C3193a.m6822k();
                            return null;
                        }
                        C2104o.m5276A("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (c0808c == null) {
                    c0808c = m1817i(c0653b0M1822n);
                }
                return Boolean.valueOf(m1820l(i9, c0167g, c0653b0, c0808c));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return c0653b0.m1799m1().f2066a ? (Boolean) c0167g.invoke(c0653b0) : c0808c == null ? Boolean.valueOf(m1816h(c0653b0, i9, c0167g)) : Boolean.valueOf(m1806A(i9, c0167g, c0653b0, c0808c));
                }
                C3193a.m6822k();
                return null;
            }
        }
        return Boolean.valueOf(m1816h(c0653b0, i9, c0167g));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077 A[RETURN] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m1809a(C0653b0 c0653b0, C0167g c0167g) {
        int iOrdinal = c0653b0.m1803p1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C0653b0 c0653b0M1822n = m1822n(c0653b0);
                if (c0653b0M1822n == null) {
                    C2104o.m5276A("ActiveParent must have a focusedChild");
                    return false;
                }
                int iOrdinal2 = c0653b0M1822n.m1803p1().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            if (iOrdinal2 != 3) {
                                C3193a.m6822k();
                                return false;
                            }
                            C2104o.m5276A("ActiveParent must have a focusedChild");
                            return false;
                        }
                    } else if (m1809a(c0653b0M1822n, c0167g) || m1821m(c0653b0, c0653b0M1822n, 2, c0167g) || (c0653b0M1822n.m1799m1().f2066a && ((Boolean) c0167g.invoke(c0653b0M1822n)).booleanValue())) {
                        return true;
                    }
                }
                return m1821m(c0653b0, c0653b0M1822n, 2, c0167g);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C3193a.m6822k();
                    return false;
                }
                if (!m1832x(c0653b0, c0167g)) {
                    if (!(c0653b0.m1799m1().f2066a ? ((Boolean) c0167g.invoke(c0653b0)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return m1832x(c0653b0, c0167g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r1 = r11 - r19.f2418c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.f2416a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.f2419d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.f2417b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        p136j8.C2104o.m5276A("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0095, code lost:
    
        p136j8.C2104o.m5276A("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0099, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m1810b(C0808c c0808c, C0808c c0808c2, C0808c c0808c3, int i9) {
        boolean zM1811c = m1811c(i9, c0808c3, c0808c);
        float f3 = c0808c3.f2417b;
        float f10 = c0808c3.f2419d;
        float f11 = c0808c3.f2416a;
        float f12 = c0808c3.f2418c;
        float f13 = c0808c.f2419d;
        float f14 = c0808c.f2417b;
        float f15 = c0808c.f2418c;
        float f16 = c0808c.f2416a;
        if (zM1811c || !m1811c(i9, c0808c2, c0808c)) {
            return false;
        }
        if (i9 != 3) {
            if (i9 != 4) {
                if (i9 != 5) {
                    if (i9 != 6) {
                        C2104o.m5276A("This function should only be used for 2-D focus search");
                        return false;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final boolean m1811c(int i9, C0808c c0808c, C0808c c0808c2) {
        if (i9 == 3 || i9 == 4) {
            return c0808c.f2419d > c0808c2.f2417b && c0808c.f2417b < c0808c2.f2419d;
        }
        if (i9 == 5 || i9 == 6) {
            return c0808c.f2418c > c0808c2.f2416a && c0808c.f2416a < c0808c2.f2418c;
        }
        C2104o.m5276A("This function should only be used for 2-D focus search");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final boolean m1812d(C0653b0 c0653b0, boolean z9) {
        int iOrdinal = c0653b0.m1803p1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C0653b0 c0653b0M1822n = m1822n(c0653b0);
                if (!(c0653b0M1822n != null ? m1812d(c0653b0M1822n, z9) : true)) {
                    return false;
                }
                c0653b0.m1798l1(EnumC0680z.f2085h, EnumC0680z.f2086i);
                return true;
            }
            if (iOrdinal == 2) {
                return z9;
            }
            if (iOrdinal != 3) {
                C3193a.m6822k();
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final void m1813e(C0653b0 c0653b0, C2046b c2046b) {
        if (!c0653b0.f23788g.f23801t) {
            AbstractC4229a.m8494b("visitChildren called on an unattached node");
        }
        C2046b c2046b2 = new C2046b(new AbstractC5852n[16]);
        AbstractC5852n abstractC5852n = c0653b0.f23788g;
        AbstractC5852n abstractC5852n2 = abstractC5852n.f23793l;
        if (abstractC5852n2 == null) {
            AbstractC5618k.m10146b(c2046b2, abstractC5852n);
        } else {
            c2046b2.m5056b(abstractC5852n2);
        }
        while (true) {
            int i9 = c2046b2.f6893i;
            if (i9 == 0) {
                return;
            }
            AbstractC5852n abstractC5852nM10149e = (AbstractC5852n) c2046b2.m5065k(i9 - 1);
            if ((abstractC5852nM10149e.f23791j & 1024) == 0) {
                AbstractC5618k.m10146b(c2046b2, abstractC5852nM10149e);
            } else {
                while (true) {
                    if (abstractC5852nM10149e == null) {
                        break;
                    }
                    if ((abstractC5852nM10149e.f23790i & 1024) != 0) {
                        C2046b c2046b3 = null;
                        while (abstractC5852nM10149e != null) {
                            if (abstractC5852nM10149e instanceof C0653b0) {
                                C0653b0 c0653b02 = (C0653b0) abstractC5852nM10149e;
                                if (c0653b02.f23801t && !AbstractC5618k.m10167w(c0653b02).f22789W) {
                                    if (c0653b02.m1799m1().f2066a) {
                                        c2046b.m5056b(c0653b02);
                                    } else {
                                        m1813e(c0653b02, c2046b);
                                    }
                                }
                            } else if ((abstractC5852nM10149e.f23790i & 1024) != 0 && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                                int i10 = 0;
                                for (AbstractC5852n abstractC5852n3 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n3 != null; abstractC5852n3 = abstractC5852n3.f23793l) {
                                    if ((abstractC5852n3.f23790i & 1024) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            abstractC5852nM10149e = abstractC5852n3;
                                        } else {
                                            if (c2046b3 == null) {
                                                c2046b3 = new C2046b(new AbstractC5852n[16]);
                                            }
                                            if (abstractC5852nM10149e != null) {
                                                c2046b3.m5056b(abstractC5852nM10149e);
                                                abstractC5852nM10149e = null;
                                            }
                                            c2046b3.m5056b(abstractC5852n3);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b3);
                        }
                    } else {
                        abstractC5852nM10149e = abstractC5852nM10149e.f23793l;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final C0653b0 m1814f(C0653b0 c0653b0) {
        C0653b0 c0653b0M1848f = ((C0670p) ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x(c0653b0)).getFocusOwner()).m1848f();
        if (c0653b0M1848f == null || !c0653b0M1848f.f23801t) {
            return null;
        }
        return c0653b0M1848f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final C0653b0 m1815g(C2046b c2046b, C0808c c0808c, int i9) {
        C0808c c0808cM2052h;
        if (i9 == 3) {
            c0808cM2052h = c0808c.m2052h((c0808c.f2418c - c0808c.f2416a) + 1, 0.0f);
        } else if (i9 == 4) {
            c0808cM2052h = c0808c.m2052h(-((c0808c.f2418c - c0808c.f2416a) + 1), 0.0f);
        } else if (i9 == 5) {
            c0808cM2052h = c0808c.m2052h(0.0f, (c0808c.f2419d - c0808c.f2417b) + 1);
        } else {
            if (i9 != 6) {
                C2104o.m5276A("This function should only be used for 2-D focus search");
                return null;
            }
            c0808cM2052h = c0808c.m2052h(0.0f, -((c0808c.f2419d - c0808c.f2417b) + 1));
        }
        Object[] objArr = c2046b.f6891g;
        int i10 = c2046b.f6893i;
        C0653b0 c0653b0 = null;
        for (int i11 = 0; i11 < i10; i11++) {
            C0653b0 c0653b02 = (C0653b0) objArr[i11];
            if (m1826r(c0653b02)) {
                C0808c c0808cM1817i = m1817i(c0653b02);
                if (m1823o(c0808cM1817i, c0808cM2052h, c0808c, i9)) {
                    c0653b0 = c0653b02;
                    c0808cM2052h = c0808cM1817i;
                }
            }
        }
        return c0653b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final boolean m1816h(C0653b0 c0653b0, int i9, InterfaceC1231l interfaceC1231l) {
        C0808c c0808c;
        C2046b c2046b = new C2046b(new C0653b0[16]);
        m1813e(c0653b0, c2046b);
        int i10 = c2046b.f6893i;
        if (i10 <= 1) {
            C0653b0 c0653b02 = (C0653b0) (i10 == 0 ? null : c2046b.f6891g[0]);
            if (c0653b02 != null) {
                return ((Boolean) interfaceC1231l.invoke(c0653b02)).booleanValue();
            }
        } else {
            if (i9 == 7) {
                i9 = 4;
            }
            if (i9 == 4 || i9 == 6) {
                C0808c c0808cM1817i = m1817i(c0653b0);
                float f3 = c0808cM1817i.f2416a;
                float f10 = c0808cM1817i.f2417b;
                c0808c = new C0808c(f3, f10, f3, f10);
            } else {
                if (i9 != 3 && i9 != 5) {
                    C2104o.m5276A("This function should only be used for 2-D focus search");
                    return false;
                }
                C0808c c0808cM1817i2 = m1817i(c0653b0);
                float f11 = c0808cM1817i2.f2418c;
                float f12 = c0808cM1817i2.f2419d;
                c0808c = new C0808c(f11, f12, f11, f12);
            }
            C0653b0 c0653b0M1815g = m1815g(c2046b, c0808c, i9);
            if (c0653b0M1815g != null) {
                return ((Boolean) interfaceC1231l.invoke(c0653b0M1815g)).booleanValue();
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final C0808c m1817i(C0653b0 c0653b0) {
        AbstractC5614i1 abstractC5614i1;
        if (c0653b0.f23801t && (abstractC5614i1 = c0653b0.f23795n) != null) {
            InterfaceC4428t interfaceC4428tM8884h = AbstractC4434w.m8884h(abstractC5614i1);
            if (!interfaceC4428tM8884h.mo8856C()) {
                interfaceC4428tM8884h = null;
            }
            if (interfaceC4428tM8884h != null) {
                return c0653b0.m1800n1(interfaceC4428tM8884h);
            }
        }
        return C0808c.f2415e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final InterfaceC5853o m1818j(InterfaceC5853o interfaceC5853o, C0676v c0676v) {
        return interfaceC5853o.mo10549d(new C0677w(c0676v));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final boolean m1819k(C0653b0 c0653b0, C0167g c0167g) {
        int iOrdinal = c0653b0.m1803p1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C0653b0 c0653b0M1822n = m1822n(c0653b0);
                if (c0653b0M1822n != null) {
                    return m1819k(c0653b0M1822n, c0167g) || m1821m(c0653b0, c0653b0M1822n, 1, c0167g);
                }
                C2104o.m5276A("ActiveParent must have a focusedChild");
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return c0653b0.m1799m1().f2066a ? ((Boolean) c0167g.invoke(c0653b0)).booleanValue() : m1833y(c0653b0, c0167g);
                }
                C3193a.m6822k();
                return false;
            }
        }
        return m1833y(c0653b0, c0167g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final boolean m1820l(int i9, C0167g c0167g, C0653b0 c0653b0, C0808c c0808c) {
        if (m1806A(i9, c0167g, c0653b0, c0808c)) {
            return true;
        }
        Boolean bool = (Boolean) m1834z(c0653b0, i9, new C0659e0(((C0670p) ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x(c0653b0)).getFocusOwner()).m1848f(), c0653b0, c0808c, i9, c0167g, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final boolean m1821m(C0653b0 c0653b0, C0653b0 c0653b02, int i9, C0167g c0167g) {
        if (m1807B(c0653b0, c0653b02, i9, c0167g)) {
            return true;
        }
        Boolean bool = (Boolean) m1834z(c0653b0, i9, new C0659e0(((C0670p) ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x(c0653b0)).getFocusOwner()).m1848f(), c0653b0, c0653b02, i9, c0167g, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0026, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C0653b0 m1822n(C0653b0 c0653b0) {
        boolean z9 = c0653b0.f23788g.f23801t;
        if (z9) {
            if (!z9) {
                AbstractC4229a.m8494b("visitChildren called on an unattached node");
            }
            C2046b c2046b = new C2046b(new AbstractC5852n[16]);
            AbstractC5852n abstractC5852n = c0653b0.f23788g;
            AbstractC5852n abstractC5852n2 = abstractC5852n.f23793l;
            if (abstractC5852n2 == null) {
                AbstractC5618k.m10146b(c2046b, abstractC5852n);
            } else {
                c2046b.m5056b(abstractC5852n2);
            }
            while (true) {
                int i9 = c2046b.f6893i;
                if (i9 == 0) {
                    break;
                }
                AbstractC5852n abstractC5852nM10149e = (AbstractC5852n) c2046b.m5065k(i9 - 1);
                if ((abstractC5852nM10149e.f23791j & 1024) == 0) {
                    AbstractC5618k.m10146b(c2046b, abstractC5852nM10149e);
                } else {
                    while (true) {
                        if (abstractC5852nM10149e == null) {
                            break;
                        }
                        if ((abstractC5852nM10149e.f23790i & 1024) != 0) {
                            C2046b c2046b2 = null;
                            while (abstractC5852nM10149e != null) {
                                if (abstractC5852nM10149e instanceof C0653b0) {
                                    C0653b0 c0653b02 = (C0653b0) abstractC5852nM10149e;
                                    if (c0653b02.f23788g.f23801t) {
                                        int iOrdinal = c0653b02.m1803p1().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            return c0653b02;
                                        }
                                        if (iOrdinal != 3) {
                                            C3193a.m6822k();
                                            return null;
                                        }
                                    }
                                } else if ((abstractC5852nM10149e.f23790i & 1024) != 0 && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                                    int i10 = 0;
                                    for (AbstractC5852n abstractC5852n3 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n3 != null; abstractC5852n3 = abstractC5852n3.f23793l) {
                                        if ((abstractC5852n3.f23790i & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                abstractC5852nM10149e = abstractC5852n3;
                                            } else {
                                                if (c2046b2 == null) {
                                                    c2046b2 = new C2046b(new AbstractC5852n[16]);
                                                }
                                                if (abstractC5852nM10149e != null) {
                                                    c2046b2.m5056b(abstractC5852nM10149e);
                                                    abstractC5852nM10149e = null;
                                                }
                                                c2046b2.m5056b(abstractC5852n3);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b2);
                            }
                        } else {
                            abstractC5852nM10149e = abstractC5852nM10149e.f23793l;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final boolean m1823o(C0808c c0808c, C0808c c0808c2, C0808c c0808c3, int i9) {
        if (!m1824p(i9, c0808c, c0808c3)) {
            return false;
        }
        if (m1824p(i9, c0808c2, c0808c3) && !m1810b(c0808c3, c0808c, c0808c2, i9)) {
            return !m1810b(c0808c3, c0808c2, c0808c, i9) && m1825q(i9, c0808c3, c0808c) < m1825q(i9, c0808c3, c0808c2);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final boolean m1824p(int i9, C0808c c0808c, C0808c c0808c2) {
        if (i9 == 3) {
            float f3 = c0808c2.f2418c;
            float f10 = c0808c2.f2416a;
            float f11 = c0808c.f2418c;
            return (f3 > f11 || f10 >= f11) && f10 > c0808c.f2416a;
        }
        if (i9 == 4) {
            float f12 = c0808c2.f2416a;
            float f13 = c0808c2.f2418c;
            float f14 = c0808c.f2416a;
            return (f12 < f14 || f13 <= f14) && f13 < c0808c.f2418c;
        }
        if (i9 == 5) {
            float f15 = c0808c2.f2419d;
            float f16 = c0808c2.f2417b;
            float f17 = c0808c.f2419d;
            return (f15 > f17 || f16 >= f17) && f16 > c0808c.f2417b;
        }
        if (i9 != 6) {
            C2104o.m5276A("This function should only be used for 2-D focus search");
            return false;
        }
        float f18 = c0808c2.f2417b;
        float f19 = c0808c2.f2419d;
        float f20 = c0808c.f2417b;
        return (f18 < f20 || f19 <= f20) && f19 < c0808c.f2419d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final long m1825q(int i9, C0808c c0808c, C0808c c0808c2) {
        float f3;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        if (i9 == 3) {
            f3 = c0808c.f2416a;
            f10 = c0808c2.f2418c;
        } else if (i9 == 4) {
            f3 = c0808c2.f2416a;
            f10 = c0808c.f2418c;
        } else if (i9 == 5) {
            f3 = c0808c.f2417b;
            f10 = c0808c2.f2419d;
        } else {
            if (i9 != 6) {
                C2104o.m5276A("This function should only be used for 2-D focus search");
                return 0L;
            }
            f3 = c0808c2.f2417b;
            f10 = c0808c.f2419d;
        }
        float f15 = f3 - f10;
        if (f15 < 0.0f) {
            f15 = 0.0f;
        }
        long j3 = (long) f15;
        if (i9 == 3 || i9 == 4) {
            float f16 = c0808c.f2417b;
            f11 = 2;
            f12 = ((c0808c.f2419d - f16) / f11) + f16;
            f13 = c0808c2.f2417b;
            f14 = c0808c2.f2419d;
        } else {
            if (i9 != 5 && i9 != 6) {
                C2104o.m5276A("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f17 = c0808c.f2416a;
            f11 = 2;
            f12 = ((c0808c.f2418c - f17) / f11) + f17;
            f13 = c0808c2.f2416a;
            f14 = c0808c2.f2418c;
        }
        long j4 = (long) (f12 - (((f14 - f13) / f11) + f13));
        return (j4 * j4) + (((long) 13) * j3 * j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final boolean m1826r(C0653b0 c0653b0) {
        C5602f0 c5602f0;
        AbstractC5614i1 abstractC5614i1;
        C5602f0 c5602f02;
        AbstractC5614i1 abstractC5614i12 = c0653b0.f23795n;
        return (abstractC5614i12 == null || (c5602f0 = abstractC5614i12.f22868u) == null || !c5602f0.m10011H() || (abstractC5614i1 = c0653b0.f23795n) == null || (c5602f02 = abstractC5614i1.f22868u) == null || !c5602f02.m10010G()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final InterfaceC5853o m1827s(InterfaceC5853o interfaceC5853o, InterfaceC1231l interfaceC1231l) {
        return interfaceC5853o.mo10549d(new C0654c(interfaceC1231l));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [fg.l, gg.m] */
    /* JADX INFO: renamed from: t */
    public static final EnumC0652b m1828t(C0653b0 c0653b0, int i9) {
        int iOrdinal = c0653b0.m1803p1().ordinal();
        EnumC0652b enumC0652b = EnumC0652b.f2019g;
        if (iOrdinal != 0) {
            EnumC0652b enumC0652b2 = EnumC0652b.f2020h;
            if (iOrdinal == 1) {
                C0653b0 c0653b0M1822n = m1822n(c0653b0);
                if (c0653b0M1822n == null) {
                    C2104o.m5294t("ActiveParent with no focused child");
                    return null;
                }
                EnumC0652b enumC0652bM1828t = m1828t(c0653b0M1822n, i9);
                EnumC0652b enumC0652b3 = enumC0652bM1828t != enumC0652b ? enumC0652bM1828t : null;
                if (enumC0652b3 != null) {
                    return enumC0652b3;
                }
                if (c0653b0.f2025w) {
                    return enumC0652b;
                }
                c0653b0.f2025w = true;
                try {
                    C0674t c0674tM1799m1 = c0653b0.m1799m1();
                    C0650a c0650a = new C0650a(i9);
                    C0670p c0670p = (C0670p) ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x(c0653b0)).getFocusOwner();
                    C0653b0 c0653b0M1848f = c0670p.m1848f();
                    c0674tM1799m1.f2076k.invoke(c0650a);
                    C0653b0 c0653b0M1848f2 = c0670p.m1848f();
                    if (!c0650a.f2017b) {
                        return (c0653b0M1848f == c0653b0M1848f2 || c0653b0M1848f2 == null) ? enumC0652b : C0676v.f2080d == C0676v.f2079c ? enumC0652b2 : EnumC0652b.f2021i;
                    }
                    C0676v c0676v = C0676v.f2078b;
                    return enumC0652b2;
                } finally {
                    c0653b0.f2025w = false;
                }
            }
            if (iOrdinal == 2) {
                return enumC0652b2;
            }
            if (iOrdinal != 3) {
                C3193a.m6822k();
                return null;
            }
        }
        return enumC0652b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v1, types: [fg.l, gg.m] */
    /* JADX INFO: renamed from: u */
    public static final EnumC0652b m1829u(C0653b0 c0653b0, int i9) {
        if (!c0653b0.f2026x) {
            c0653b0.f2026x = true;
            try {
                C0674t c0674tM1799m1 = c0653b0.m1799m1();
                C0650a c0650a = new C0650a(i9);
                C0670p c0670p = (C0670p) ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x(c0653b0)).getFocusOwner();
                C0653b0 c0653b0M1848f = c0670p.m1848f();
                c0674tM1799m1.f2075j.invoke(c0650a);
                C0653b0 c0653b0M1848f2 = c0670p.m1848f();
                boolean z9 = c0650a.f2017b;
                EnumC0652b enumC0652b = EnumC0652b.f2020h;
                if (z9) {
                    C0676v c0676v = C0676v.f2078b;
                    return enumC0652b;
                }
                if (c0653b0M1848f != c0653b0M1848f2 && c0653b0M1848f2 != null) {
                    return C0676v.f2080d == C0676v.f2079c ? enumC0652b : EnumC0652b.f2021i;
                }
            } finally {
                c0653b0.f2026x = false;
            }
        }
        return EnumC0652b.f2019g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static final EnumC0652b m1830v(C0653b0 c0653b0, int i9) {
        AbstractC5852n abstractC5852nM10149e;
        C5587b1 c5587b1;
        int iOrdinal = c0653b0.m1803p1().ordinal();
        EnumC0652b enumC0652b = EnumC0652b.f2019g;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C0653b0 c0653b0M1822n = m1822n(c0653b0);
                if (c0653b0M1822n != null) {
                    return m1828t(c0653b0M1822n, i9);
                }
                C2104o.m5294t("ActiveParent with no focused child");
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C3193a.m6822k();
                    return null;
                }
                if (!c0653b0.f23788g.f23801t) {
                    AbstractC4229a.m8494b("visitAncestors called on an unattached node");
                }
                AbstractC5852n abstractC5852n = c0653b0.f23788g.f23792k;
                C5602f0 c5602f0M10167w = AbstractC5618k.m10167w(c0653b0);
                loop0: while (true) {
                    if (c5602f0M10167w == null) {
                        abstractC5852nM10149e = null;
                        break;
                    }
                    if ((c5602f0M10167w.f22778L.f22719f.f23791j & 1024) != 0) {
                        while (abstractC5852n != null) {
                            if ((abstractC5852n.f23790i & 1024) != 0) {
                                abstractC5852nM10149e = abstractC5852n;
                                C2046b c2046b = null;
                                while (abstractC5852nM10149e != null) {
                                    if (abstractC5852nM10149e instanceof C0653b0) {
                                        break loop0;
                                    }
                                    if ((abstractC5852nM10149e.f23790i & 1024) != 0 && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                                        int i10 = 0;
                                        for (AbstractC5852n abstractC5852n2 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n2 != null; abstractC5852n2 = abstractC5852n2.f23793l) {
                                            if ((abstractC5852n2.f23790i & 1024) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    abstractC5852nM10149e = abstractC5852n2;
                                                } else {
                                                    if (c2046b == null) {
                                                        c2046b = new C2046b(new AbstractC5852n[16]);
                                                    }
                                                    if (abstractC5852nM10149e != null) {
                                                        c2046b.m5056b(abstractC5852nM10149e);
                                                        abstractC5852nM10149e = null;
                                                    }
                                                    c2046b.m5056b(abstractC5852n2);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b);
                                }
                            }
                            abstractC5852n = abstractC5852n.f23792k;
                        }
                    }
                    c5602f0M10167w = c5602f0M10167w.m10049u();
                    abstractC5852n = (c5602f0M10167w == null || (c5587b1 = c5602f0M10167w.f22778L) == null) ? null : c5587b1.f22718e;
                }
                C0653b0 c0653b02 = (C0653b0) abstractC5852nM10149e;
                if (c0653b02 == null) {
                    return enumC0652b;
                }
                int iOrdinal2 = c0653b02.m1803p1().ordinal();
                if (iOrdinal2 == 0) {
                    return m1829u(c0653b02, i9);
                }
                if (iOrdinal2 == 1) {
                    return m1830v(c0653b02, i9);
                }
                if (iOrdinal2 == 2) {
                    return EnumC0652b.f2020h;
                }
                if (iOrdinal2 != 3) {
                    C3193a.m6822k();
                    return null;
                }
                EnumC0652b enumC0652bM1830v = m1830v(c0653b02, i9);
                EnumC0652b enumC0652b2 = enumC0652bM1830v != enumC0652b ? enumC0652bM1830v : null;
                return enumC0652b2 == null ? m1829u(c0653b02, i9) : enumC0652b2;
            }
        }
        return enumC0652b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static final boolean m1831w(C0653b0 c0653b0) {
        C2046b c2046b;
        C5587b1 c5587b1;
        C0670p c0670p;
        boolean z9;
        int i9;
        C2046b c2046b2;
        int i10;
        int i11;
        C5587b1 c5587b12;
        C0670p c0670p2 = (C0670p) ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x(c0653b0)).getFocusOwner();
        C0653b0 c0653b0M1848f = c0670p2.m1848f();
        EnumC0680z enumC0680zM1803p1 = c0653b0.m1803p1();
        if (c0653b0M1848f == c0653b0) {
            c0653b0.m1798l1(enumC0680zM1803p1, enumC0680zM1803p1);
            return true;
        }
        if ((c0653b0M1848f == null || c0653b0M1848f.f2023u) && !c0653b0.f2023u && !((C0670p) ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x(c0653b0)).getFocusOwner()).f2054a.m10649H()) {
            return false;
        }
        if (c0653b0M1848f != null) {
            c2046b = new C2046b(new C0653b0[16]);
            if (!c0653b0M1848f.f23788g.f23801t) {
                AbstractC4229a.m8494b("visitAncestors called on an unattached node");
            }
            AbstractC5852n abstractC5852n = c0653b0M1848f.f23788g.f23792k;
            C5602f0 c5602f0M10167w = AbstractC5618k.m10167w(c0653b0M1848f);
            while (c5602f0M10167w != null) {
                if ((c5602f0M10167w.f22778L.f22719f.f23791j & 1024) != 0) {
                    while (abstractC5852n != null) {
                        if ((abstractC5852n.f23790i & 1024) != 0) {
                            AbstractC5852n abstractC5852nM10149e = abstractC5852n;
                            C2046b c2046b3 = null;
                            while (abstractC5852nM10149e != null) {
                                if (abstractC5852nM10149e instanceof C0653b0) {
                                    c2046b.m5056b((C0653b0) abstractC5852nM10149e);
                                } else if ((abstractC5852nM10149e.f23790i & 1024) != 0 && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                                    int i12 = 0;
                                    for (AbstractC5852n abstractC5852n2 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n2 != null; abstractC5852n2 = abstractC5852n2.f23793l) {
                                        if ((abstractC5852n2.f23790i & 1024) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                abstractC5852nM10149e = abstractC5852n2;
                                            } else {
                                                if (c2046b3 == null) {
                                                    c2046b3 = new C2046b(new AbstractC5852n[16]);
                                                }
                                                if (abstractC5852nM10149e != null) {
                                                    c2046b3.m5056b(abstractC5852nM10149e);
                                                    abstractC5852nM10149e = null;
                                                }
                                                c2046b3.m5056b(abstractC5852n2);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b3);
                            }
                        }
                        abstractC5852n = abstractC5852n.f23792k;
                    }
                }
                c5602f0M10167w = c5602f0M10167w.m10049u();
                abstractC5852n = (c5602f0M10167w == null || (c5587b12 = c5602f0M10167w.f22778L) == null) ? null : c5587b12.f22718e;
            }
        } else {
            c2046b = null;
        }
        Object[] objArr = new C0653b0[16];
        Object[] objArr2 = new C0653b0[16];
        if (!c0653b0.f23788g.f23801t) {
            AbstractC4229a.m8494b("visitAncestors called on an unattached node");
        }
        AbstractC5852n abstractC5852n3 = c0653b0.f23788g.f23792k;
        C5602f0 c5602f0M10167w2 = AbstractC5618k.m10167w(c0653b0);
        boolean z10 = true;
        int i13 = 0;
        int i14 = 0;
        while (c5602f0M10167w2 != null) {
            if ((c5602f0M10167w2.f22778L.f22719f.f23791j & 1024) != 0) {
                while (abstractC5852n3 != null) {
                    if ((abstractC5852n3.f23790i & 1024) != 0) {
                        AbstractC5852n abstractC5852nM10149e2 = abstractC5852n3;
                        C2046b c2046b4 = null;
                        while (abstractC5852nM10149e2 != null) {
                            if (abstractC5852nM10149e2 instanceof C0653b0) {
                                C0653b0 c0653b02 = (C0653b0) abstractC5852nM10149e2;
                                if (AbstractC1416l.m3825a(c2046b != null ? Boolean.valueOf(c2046b.m5064j(c0653b02)) : null, Boolean.TRUE)) {
                                    int i15 = i13 + 1;
                                    if (objArr.length < i15) {
                                        int length = objArr.length;
                                        c0670p = c0670p2;
                                        Object[] objArr3 = new Object[Math.max(i15, length * 2)];
                                        i11 = i15;
                                        System.arraycopy(objArr, 0, objArr3, 0, length);
                                        objArr = objArr3;
                                    } else {
                                        c0670p = c0670p2;
                                        i11 = i15;
                                    }
                                    objArr[i13] = c0653b02;
                                    i13 = i11;
                                } else {
                                    c0670p = c0670p2;
                                    int i16 = i14 + 1;
                                    if (objArr2.length < i16) {
                                        int length2 = objArr2.length;
                                        Object[] objArr4 = new Object[Math.max(i16, length2 * 2)];
                                        i10 = i16;
                                        System.arraycopy(objArr2, 0, objArr4, 0, length2);
                                        objArr2 = objArr4;
                                    } else {
                                        i10 = i16;
                                    }
                                    objArr2[i14] = c0653b02;
                                    i14 = i10;
                                }
                                if (c0653b02 == c0653b0M1848f) {
                                    z10 = false;
                                }
                                z9 = false;
                            } else {
                                c0670p = c0670p2;
                                z9 = true;
                            }
                            if (z9 && (abstractC5852nM10149e2.f23790i & 1024) != 0 && (abstractC5852nM10149e2 instanceof AbstractC5615j)) {
                                int i17 = 0;
                                for (AbstractC5852n abstractC5852n4 = ((AbstractC5615j) abstractC5852nM10149e2).f22875v; abstractC5852n4 != null; abstractC5852n4 = abstractC5852n4.f23793l) {
                                    if ((abstractC5852n4.f23790i & 1024) != 0) {
                                        int i18 = i17 + 1;
                                        if (i18 == 1) {
                                            abstractC5852nM10149e2 = abstractC5852n4;
                                            i9 = i18;
                                        } else {
                                            if (c2046b4 == null) {
                                                i9 = i18;
                                                c2046b2 = new C2046b(new AbstractC5852n[16]);
                                            } else {
                                                i9 = i18;
                                                c2046b2 = c2046b4;
                                            }
                                            if (abstractC5852nM10149e2 != null) {
                                                c2046b2.m5056b(abstractC5852nM10149e2);
                                                abstractC5852nM10149e2 = null;
                                            }
                                            c2046b2.m5056b(abstractC5852n4);
                                            c2046b4 = c2046b2;
                                        }
                                        i17 = i9;
                                    }
                                }
                                if (i17 == 1) {
                                    c0670p2 = c0670p;
                                } else {
                                    abstractC5852nM10149e2 = AbstractC5618k.m10149e(c2046b4);
                                    c0670p2 = c0670p;
                                }
                            } else {
                                abstractC5852nM10149e2 = AbstractC5618k.m10149e(c2046b4);
                                c0670p2 = c0670p;
                            }
                        }
                    }
                    abstractC5852n3 = abstractC5852n3.f23792k;
                    c0670p2 = c0670p2;
                }
            }
            C0670p c0670p3 = c0670p2;
            c5602f0M10167w2 = c5602f0M10167w2.m10049u();
            abstractC5852n3 = (c5602f0M10167w2 == null || (c5587b1 = c5602f0M10167w2.f22778L) == null) ? null : c5587b1.f22718e;
            c0670p2 = c0670p3;
        }
        C0670p c0670p4 = c0670p2;
        if (z10 && c0653b0M1848f != null && !m1812d(c0653b0M1848f, false)) {
            return false;
        }
        AbstractC5618k.m10162r(c0653b0, new C0655c0(c0653b0, 0));
        int iOrdinal = c0653b0.m1803p1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ((C0670p) ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x(c0653b0)).getFocusOwner()).m1851i(c0653b0);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C3193a.m6822k();
                    return false;
                }
                ((C0670p) ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x(c0653b0)).getFocusOwner()).m1851i(c0653b0);
            }
        }
        EnumC0680z enumC0680z = EnumC0680z.f2086i;
        EnumC0680z enumC0680z2 = EnumC0680z.f2084g;
        if (z10 && c0653b0M1848f != null) {
            c0653b0M1848f.m1798l1(enumC0680z2, enumC0680z);
        }
        EnumC0680z enumC0680z3 = EnumC0680z.f2085h;
        if (c2046b != null) {
            int i19 = c2046b.f6893i - 1;
            Object[] objArr5 = c2046b.f6891g;
            if (i19 < objArr5.length) {
                while (i19 >= 0) {
                    C0653b0 c0653b03 = (C0653b0) objArr5[i19];
                    if (c0670p4.m1848f() != c0653b0) {
                        return false;
                    }
                    c0653b03.m1798l1(enumC0680z3, enumC0680z);
                    i19--;
                }
            }
        }
        int i20 = i14 - 1;
        if (i20 < objArr2.length) {
            while (i20 >= 0) {
                C0653b0 c0653b04 = (C0653b0) objArr2[i20];
                if (c0670p4.m1848f() != c0653b0) {
                    return false;
                }
                c0653b04.m1798l1(c0653b04 == c0653b0M1848f ? enumC0680z2 : enumC0680z, enumC0680z3);
                i20--;
            }
        }
        if (c0670p4.m1848f() != c0653b0) {
            return false;
        }
        c0653b0.m1798l1(enumC0680zM1803p1, enumC0680z2);
        return c0670p4.m1848f() == c0653b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static final boolean m1832x(C0653b0 c0653b0, C0167g c0167g) {
        Object[] objArr = new C0653b0[16];
        if (!c0653b0.f23788g.f23801t) {
            AbstractC4229a.m8494b("visitChildren called on an unattached node");
        }
        C2046b c2046b = new C2046b(new AbstractC5852n[16]);
        AbstractC5852n abstractC5852n = c0653b0.f23788g;
        AbstractC5852n abstractC5852n2 = abstractC5852n.f23793l;
        if (abstractC5852n2 == null) {
            AbstractC5618k.m10146b(c2046b, abstractC5852n);
        } else {
            c2046b.m5056b(abstractC5852n2);
        }
        int i9 = 0;
        while (true) {
            int i10 = c2046b.f6893i;
            if (i10 == 0) {
                break;
            }
            AbstractC5852n abstractC5852nM10149e = (AbstractC5852n) c2046b.m5065k(i10 - 1);
            if ((abstractC5852nM10149e.f23791j & 1024) == 0) {
                AbstractC5618k.m10146b(c2046b, abstractC5852nM10149e);
            } else {
                while (true) {
                    if (abstractC5852nM10149e == null) {
                        break;
                    }
                    if ((abstractC5852nM10149e.f23790i & 1024) != 0) {
                        C2046b c2046b2 = null;
                        while (abstractC5852nM10149e != null) {
                            if (abstractC5852nM10149e instanceof C0653b0) {
                                C0653b0 c0653b02 = (C0653b0) abstractC5852nM10149e;
                                int i11 = i9 + 1;
                                if (objArr.length < i11) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i11, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i9] = c0653b02;
                                i9 = i11;
                            } else if ((abstractC5852nM10149e.f23790i & 1024) != 0 && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                                int i12 = 0;
                                for (AbstractC5852n abstractC5852n3 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n3 != null; abstractC5852n3 = abstractC5852n3.f23793l) {
                                    if ((abstractC5852n3.f23790i & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            abstractC5852nM10149e = abstractC5852n3;
                                        } else {
                                            if (c2046b2 == null) {
                                                c2046b2 = new C2046b(new AbstractC5852n[16]);
                                            }
                                            if (abstractC5852nM10149e != null) {
                                                c2046b2.m5056b(abstractC5852nM10149e);
                                                abstractC5852nM10149e = null;
                                            }
                                            c2046b2.m5056b(abstractC5852n3);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b2);
                        }
                    } else {
                        abstractC5852nM10149e = abstractC5852nM10149e.f23793l;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i9, C0657d0.f2031g);
        int i13 = i9 - 1;
        if (i13 < objArr.length) {
            while (i13 >= 0) {
                C0653b0 c0653b03 = (C0653b0) objArr[i13];
                if (m1826r(c0653b03) && m1809a(c0653b03, c0167g)) {
                    return true;
                }
                i13--;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static final boolean m1833y(C0653b0 c0653b0, C0167g c0167g) {
        Object[] objArr = new C0653b0[16];
        if (!c0653b0.f23788g.f23801t) {
            AbstractC4229a.m8494b("visitChildren called on an unattached node");
        }
        C2046b c2046b = new C2046b(new AbstractC5852n[16]);
        AbstractC5852n abstractC5852n = c0653b0.f23788g;
        AbstractC5852n abstractC5852n2 = abstractC5852n.f23793l;
        if (abstractC5852n2 == null) {
            AbstractC5618k.m10146b(c2046b, abstractC5852n);
        } else {
            c2046b.m5056b(abstractC5852n2);
        }
        int i9 = 0;
        while (true) {
            int i10 = c2046b.f6893i;
            if (i10 == 0) {
                break;
            }
            AbstractC5852n abstractC5852nM10149e = (AbstractC5852n) c2046b.m5065k(i10 - 1);
            if ((abstractC5852nM10149e.f23791j & 1024) == 0) {
                AbstractC5618k.m10146b(c2046b, abstractC5852nM10149e);
            } else {
                while (true) {
                    if (abstractC5852nM10149e == null) {
                        break;
                    }
                    if ((abstractC5852nM10149e.f23790i & 1024) != 0) {
                        C2046b c2046b2 = null;
                        while (abstractC5852nM10149e != null) {
                            if (abstractC5852nM10149e instanceof C0653b0) {
                                C0653b0 c0653b02 = (C0653b0) abstractC5852nM10149e;
                                int i11 = i9 + 1;
                                if (objArr.length < i11) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i11, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i9] = c0653b02;
                                i9 = i11;
                            } else if ((abstractC5852nM10149e.f23790i & 1024) != 0 && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                                int i12 = 0;
                                for (AbstractC5852n abstractC5852n3 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n3 != null; abstractC5852n3 = abstractC5852n3.f23793l) {
                                    if ((abstractC5852n3.f23790i & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            abstractC5852nM10149e = abstractC5852n3;
                                        } else {
                                            if (c2046b2 == null) {
                                                c2046b2 = new C2046b(new AbstractC5852n[16]);
                                            }
                                            if (abstractC5852nM10149e != null) {
                                                c2046b2.m5056b(abstractC5852nM10149e);
                                                abstractC5852nM10149e = null;
                                            }
                                            c2046b2.m5056b(abstractC5852n3);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b2);
                        }
                    } else {
                        abstractC5852nM10149e = abstractC5852nM10149e.f23793l;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i9, C0657d0.f2031g);
        for (int i13 = 0; i13 < i9; i13++) {
            C0653b0 c0653b03 = (C0653b0) objArr[i13];
            if (m1826r(c0653b03) && m1819k(c0653b03, c0167g)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: z */
    public static final Object m1834z(C0653b0 c0653b0, int i9, InterfaceC1231l interfaceC1231l) {
        int i10;
        int i11;
        Object objInvoke;
        AbstractC5852n abstractC5852nM10149e;
        C3853r c3853rM1801o1;
        int i12;
        C5587b1 c5587b1;
        if (!c0653b0.f23788g.f23801t) {
            AbstractC4229a.m8494b("visitAncestors called on an unattached node");
        }
        AbstractC5852n abstractC5852n = c0653b0.f23788g.f23792k;
        C5602f0 c5602f0M10167w = AbstractC5618k.m10167w(c0653b0);
        loop0: while (true) {
            i10 = 0;
            i11 = 1;
            objInvoke = null;
            if (c5602f0M10167w == null) {
                abstractC5852nM10149e = null;
                break;
            }
            if ((c5602f0M10167w.f22778L.f22719f.f23791j & 1024) != 0) {
                while (abstractC5852n != null) {
                    if ((abstractC5852n.f23790i & 1024) != 0) {
                        abstractC5852nM10149e = abstractC5852n;
                        C2046b c2046b = null;
                        while (abstractC5852nM10149e != null) {
                            if (abstractC5852nM10149e instanceof C0653b0) {
                                break loop0;
                            }
                            if ((abstractC5852nM10149e.f23790i & 1024) != 0 && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                                int i13 = 0;
                                for (AbstractC5852n abstractC5852n2 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n2 != null; abstractC5852n2 = abstractC5852n2.f23793l) {
                                    if ((abstractC5852n2.f23790i & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            abstractC5852nM10149e = abstractC5852n2;
                                        } else {
                                            if (c2046b == null) {
                                                c2046b = new C2046b(new AbstractC5852n[16]);
                                            }
                                            if (abstractC5852nM10149e != null) {
                                                c2046b.m5056b(abstractC5852nM10149e);
                                                abstractC5852nM10149e = null;
                                            }
                                            c2046b.m5056b(abstractC5852n2);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b);
                        }
                    }
                    abstractC5852n = abstractC5852n.f23792k;
                }
            }
            c5602f0M10167w = c5602f0M10167w.m10049u();
            abstractC5852n = (c5602f0M10167w == null || (c5587b1 = c5602f0M10167w.f22778L) == null) ? null : c5587b1.f22718e;
        }
        C0653b0 c0653b02 = (C0653b0) abstractC5852nM10149e;
        if ((c0653b02 != null && AbstractC1416l.m3825a(c0653b02.m1801o1(), c0653b0.m1801o1())) || (c3853rM1801o1 = c0653b0.m1801o1()) == null) {
            return null;
        }
        int i14 = 5;
        if (i9 != 5) {
            i14 = 6;
            if (i9 != 6) {
                i14 = 3;
                if (i9 != 3) {
                    i14 = 4;
                    if (i9 != 4) {
                        if (i9 == 1) {
                            i14 = 2;
                        } else {
                            if (i9 != 2) {
                                C2104o.m5276A("Unsupported direction for beyond bounds layout");
                                return null;
                            }
                            i14 = 1;
                        }
                    }
                }
            }
        }
        if (c3853rM1801o1.f12617u.f11682a.m7623j().f11749n <= 0 || c3853rM1801o1.f12617u.f11682a.m7623j().f11746k.isEmpty() || !c3853rM1801o1.f23801t) {
            return interfaceC1231l.invoke(C3853r.f12616x);
        }
        boolean zM8024l1 = c3853rM1801o1.m8024l1(i14);
        C3622g c3622g = c3853rM1801o1.f12617u;
        int iMin = zM8024l1 ? Math.min(c3622g.f11682a.m7623j().f11749n - 1, ((C3632q) AbstractC4166m.m8393B1(c3622g.f11682a.m7623j().f11746k)).f11753a) : Math.max(0, c3622g.f11682a.m7621h());
        C1425u c1425u = new C1425u();
        C2581c c2581c = c3853rM1801o1.f12618v;
        c2581c.getClass();
        C3843m c3843m = new C3843m(iMin, iMin);
        c2581c.f8371a.m5056b(c3843m);
        c1425u.f4738g = c3843m;
        C3641z c3641z = c3853rM1801o1.f12617u.f11682a;
        if (c3641z.m7623j().f11746k.isEmpty()) {
            i11 = 0;
        } else {
            C3631p c3631pM7623j = c3641z.m7623j();
            int iM7611b = (int) (c3631pM7623j.f11750o == EnumC2640p1.f8622g ? c3631pM7623j.m7611b() & 4294967295L : c3631pM7623j.m7611b() >> 32);
            int iM406P = AbstractC0063p.m406P(c3641z.m7623j());
            if (iM406P != 0 && (i12 = iM7611b / iM406P) >= 1) {
                i11 = i12;
            }
        }
        int i15 = i11 * 2;
        int i16 = c3853rM1801o1.f12617u.f11682a.m7623j().f11749n;
        if (i15 > i16) {
            i15 = i16;
        }
        while (objInvoke == null && c3853rM1801o1.m8023k1((C3843m) c1425u.f4738g, i14) && i10 < i15) {
            C3843m c3843m2 = (C3843m) c1425u.f4738g;
            int i17 = c3843m2.f12576a;
            int i18 = c3843m2.f12577b;
            if (c3853rM1801o1.m8024l1(i14)) {
                i18++;
            } else {
                i17--;
            }
            C2581c c2581c2 = c3853rM1801o1.f12618v;
            c2581c2.getClass();
            C3843m c3843m3 = new C3843m(i17, i18);
            c2581c2.f8371a.m5056b(c3843m3);
            c3853rM1801o1.f12618v.f8371a.m5064j((C3843m) c1425u.f4738g);
            c1425u.f4738g = c3843m3;
            i10++;
            AbstractC5618k.m10167w(c3853rM1801o1).m10039k();
            objInvoke = interfaceC1231l.invoke(new C3851q(c3853rM1801o1, c1425u, i14));
        }
        c3853rM1801o1.f12618v.f8371a.m5064j((C3843m) c1425u.f4738g);
        AbstractC5618k.m10167w(c3853rM1801o1).m10039k();
        return objInvoke;
    }
}
