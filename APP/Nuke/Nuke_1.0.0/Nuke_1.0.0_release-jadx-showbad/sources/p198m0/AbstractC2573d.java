package p198m0;

import com.bumptech.glide.AbstractC1926h;
import p001A0.C0102b;
import p023E0.AbstractC0277a;
import p027E4.C0330q;
import p029F0.AbstractC0435z;
import p029F0.InterfaceC0430v;
import p041H0.AbstractC0596h0;
import p041H0.AbstractC0599j;
import p041H0.AbstractC0601k;
import p041H0.C0564I;
import p041H0.C0590e0;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p061L2.AbstractC0972l;
import p061L2.AbstractC0973m;
import p095T.C1360f0;
import p105V.C1483e;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p132a3.C1804d;
import p169h0.AbstractC2206o;
import p169h0.InterfaceC2207p;
import p170h1.C2214e;
import p204n0.C2684c;
import p227r.C2976a;
import p227r.EnumC2983d0;
import p255w.C3374e;
import p255w.C3380k;
import p255w.C3381l;
import p255w.C3385p;
import p260x.C3427j;
import p260x.C3431n;
import p260x.C3432o;

/* JADX INFO: renamed from: m0.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2573d {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static final boolean m4491A(int i5, C2214e c2214e, C2567A c2567a, C2684c c2684c) {
        C2567A c2567aM4500g;
        C1483e c1483e = new C1483e(new C2567A[16]);
        if (!c2567a.f7186d.f7199q) {
            AbstractC0277a.m483b("visitChildren called on an unattached node");
        }
        C1483e c1483e2 = new C1483e(new AbstractC2206o[16]);
        AbstractC2206o abstractC2206o = c2567a.f7186d;
        AbstractC2206o abstractC2206o2 = abstractC2206o.f7191i;
        if (abstractC2206o2 == null) {
            AbstractC0601k.m1026b(c1483e2, abstractC2206o);
        } else {
            c1483e2.m2753b(abstractC2206o2);
        }
        while (true) {
            int i6 = c1483e2.f5183f;
            if (i6 == 0) {
                break;
            }
            AbstractC2206o abstractC2206oM1029e = (AbstractC2206o) c1483e2.m2762k(i6 - 1);
            if ((abstractC2206oM1029e.f7189g & 1024) == 0) {
                AbstractC0601k.m1026b(c1483e2, abstractC2206oM1029e);
            } else {
                while (true) {
                    if (abstractC2206oM1029e == null) {
                        break;
                    }
                    if ((abstractC2206oM1029e.f7188f & 1024) != 0) {
                        C1483e c1483e3 = null;
                        while (abstractC2206oM1029e != null) {
                            if (abstractC2206oM1029e instanceof C2567A) {
                                C2567A c2567a2 = (C2567A) abstractC2206oM1029e;
                                if (c2567a2.f7199q) {
                                    c1483e.m2753b(c2567a2);
                                }
                            } else if ((abstractC2206oM1029e.f7188f & 1024) != 0 && (abstractC2206oM1029e instanceof AbstractC0599j)) {
                                int i7 = 0;
                                for (AbstractC2206o abstractC2206o3 = ((AbstractC0599j) abstractC2206oM1029e).f1943s; abstractC2206o3 != null; abstractC2206o3 = abstractC2206o3.f7191i) {
                                    if ((abstractC2206o3.f7188f & 1024) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            abstractC2206oM1029e = abstractC2206o3;
                                        } else {
                                            if (c1483e3 == null) {
                                                c1483e3 = new C1483e(new AbstractC2206o[16]);
                                            }
                                            if (abstractC2206oM1029e != null) {
                                                c1483e3.m2753b(abstractC2206oM1029e);
                                                abstractC2206oM1029e = null;
                                            }
                                            c1483e3.m2753b(abstractC2206o3);
                                        }
                                    }
                                }
                                if (i7 == 1) {
                                }
                            }
                            abstractC2206oM1029e = AbstractC0601k.m1029e(c1483e3);
                        }
                    } else {
                        abstractC2206oM1029e = abstractC2206oM1029e.f7191i;
                    }
                }
            }
        }
        while (c1483e.f5183f != 0 && (c2567aM4500g = m4500g(c1483e, c2684c, i5)) != null) {
            if (c2567aM4500g.m4485L0().f8234a) {
                return ((Boolean) c2214e.mo1h(c2567aM4500g)).booleanValue();
            }
            if (m4505l(i5, c2214e, c2567aM4500g, c2684c)) {
                return true;
            }
            c1483e.m2761j(c2567aM4500g);
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
    public static final boolean m4492B(C2567A c2567a, C2567A c2567a2, int i5, C2214e c2214e) {
        AbstractC2206o abstractC2206o;
        C0564I c0564iM1044t;
        C0590e0 c0590e0;
        if (c2567a.m4488O0() != EnumC2594y.f8253e) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        Object[] objArr = new C2567A[16];
        if (!c2567a.f7186d.f7199q) {
            AbstractC0277a.m483b("visitChildren called on an unattached node");
        }
        C1483e c1483e = new C1483e(new AbstractC2206o[16]);
        AbstractC2206o abstractC2206o2 = c2567a.f7186d;
        AbstractC2206o abstractC2206o3 = abstractC2206o2.f7191i;
        if (abstractC2206o3 == null) {
            AbstractC0601k.m1026b(c1483e, abstractC2206o2);
        } else {
            c1483e.m2753b(abstractC2206o3);
        }
        int i6 = 0;
        while (true) {
            int i7 = c1483e.f5183f;
            abstractC2206o = null;
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
                                C2567A c2567a3 = (C2567A) abstractC2206oM1029e;
                                int i8 = i6 + 1;
                                if (objArr.length < i8) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i8, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i6] = c2567a3;
                                i6 = i8;
                            } else if ((abstractC2206oM1029e.f7188f & 1024) != 0 && (abstractC2206oM1029e instanceof AbstractC0599j)) {
                                int i9 = 0;
                                for (AbstractC2206o abstractC2206o4 = ((AbstractC0599j) abstractC2206oM1029e).f1943s; abstractC2206o4 != null; abstractC2206o4 = abstractC2206o4.f7191i) {
                                    if ((abstractC2206o4.f7188f & 1024) != 0) {
                                        i9++;
                                        if (i9 == 1) {
                                            abstractC2206oM1029e = abstractC2206o4;
                                        } else {
                                            if (c1483e2 == null) {
                                                c1483e2 = new C1483e(new AbstractC2206o[16]);
                                            }
                                            if (abstractC2206oM1029e != null) {
                                                c1483e2.m2753b(abstractC2206oM1029e);
                                                abstractC2206oM1029e = null;
                                            }
                                            c1483e2.m2753b(abstractC2206o4);
                                        }
                                    }
                                }
                                if (i9 == 1) {
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
        AbstractC0972l.m2006d0(objArr, C2568B.f8194a, 0, i6);
        if (i5 != 1) {
            if (i5 != 2) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            C1804d c1804dM3557J = AbstractC1926h.m3557J(0, i6);
            int i10 = c1804dM3557J.f6140d;
            int i11 = c1804dM3557J.f6141e;
            if (i10 <= i11) {
                boolean z5 = false;
                while (true) {
                    if (z5) {
                        C2567A c2567a4 = (C2567A) objArr[i11];
                        if (m4511r(c2567a4) && m4494a(c2567a4, c2214e)) {
                            break;
                        }
                    }
                    if (AbstractC1665j.m2981a(objArr[i11], c2567a2)) {
                        z5 = true;
                    }
                    if (i11 == i10) {
                        break;
                    }
                    i11--;
                }
            }
            if (i5 != 1) {
                if (!c2567a.f7186d.f7199q) {
                }
                AbstractC2206o abstractC2206o5 = c2567a.f7186d.f7190h;
                c0564iM1044t = AbstractC0601k.m1044t(c2567a);
                loop5: while (true) {
                    if (c0564iM1044t == null) {
                    }
                }
                if (abstractC2206o != null) {
                }
            }
            return false;
        }
        C1804d c1804dM3557J2 = AbstractC1926h.m3557J(0, i6);
        int i12 = c1804dM3557J2.f6140d;
        int i13 = c1804dM3557J2.f6141e;
        if (i12 <= i13) {
            boolean z6 = false;
            while (true) {
                if (z6) {
                    C2567A c2567a5 = (C2567A) objArr[i12];
                    if (m4511r(c2567a5) && m4504k(c2567a5, c2214e)) {
                        break;
                    }
                }
                if (AbstractC1665j.m2981a(objArr[i12], c2567a2)) {
                    z6 = true;
                }
                if (i12 == i13) {
                    break;
                }
                i12++;
            }
        }
        if (i5 != 1 && c2567a.m4485L0().f8234a) {
            if (!c2567a.f7186d.f7199q) {
                AbstractC0277a.m483b("visitAncestors called on an unattached node");
            }
            AbstractC2206o abstractC2206o52 = c2567a.f7186d.f7190h;
            c0564iM1044t = AbstractC0601k.m1044t(c2567a);
            loop5: while (true) {
                if (c0564iM1044t == null) {
                    break;
                }
                if ((c0564iM1044t.f1699J.f1896f.f7189g & 1024) != 0) {
                    while (abstractC2206o52 != null) {
                        if ((abstractC2206o52.f7188f & 1024) != 0) {
                            AbstractC2206o abstractC2206oM1029e2 = abstractC2206o52;
                            C1483e c1483e3 = null;
                            while (abstractC2206oM1029e2 != null) {
                                if (abstractC2206oM1029e2 instanceof C2567A) {
                                    abstractC2206o = abstractC2206oM1029e2;
                                    break loop5;
                                }
                                if ((abstractC2206oM1029e2.f7188f & 1024) != 0 && (abstractC2206oM1029e2 instanceof AbstractC0599j)) {
                                    int i14 = 0;
                                    for (AbstractC2206o abstractC2206o6 = ((AbstractC0599j) abstractC2206oM1029e2).f1943s; abstractC2206o6 != null; abstractC2206o6 = abstractC2206o6.f7191i) {
                                        if ((abstractC2206o6.f7188f & 1024) != 0) {
                                            i14++;
                                            if (i14 == 1) {
                                                abstractC2206oM1029e2 = abstractC2206o6;
                                            } else {
                                                if (c1483e3 == null) {
                                                    c1483e3 = new C1483e(new AbstractC2206o[16]);
                                                }
                                                if (abstractC2206oM1029e2 != null) {
                                                    c1483e3.m2753b(abstractC2206oM1029e2);
                                                    abstractC2206oM1029e2 = null;
                                                }
                                                c1483e3.m2753b(abstractC2206o6);
                                            }
                                        }
                                    }
                                    if (i14 == 1) {
                                    }
                                }
                                abstractC2206oM1029e2 = AbstractC0601k.m1029e(c1483e3);
                            }
                        }
                        abstractC2206o52 = abstractC2206o52.f7190h;
                    }
                }
                c0564iM1044t = c0564iM1044t.m839u();
                abstractC2206o52 = (c0564iM1044t == null || (c0590e0 = c0564iM1044t.f1699J) == null) ? null : c0590e0.f1895e;
            }
            if (abstractC2206o != null) {
                return ((Boolean) c2214e.mo1h(c2567a)).booleanValue();
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static final Boolean m4493C(int i5, C2214e c2214e, C2567A c2567a, C2684c c2684c) {
        int iOrdinal = c2567a.m4488O0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C2567A c2567aM4507n = m4507n(c2567a);
                if (c2567aM4507n == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = c2567aM4507n.m4488O0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolM4493C = m4493C(i5, c2214e, c2567aM4507n, c2684c);
                        if (!AbstractC1665j.m2981a(boolM4493C, Boolean.FALSE)) {
                            return boolM4493C;
                        }
                        if (c2684c == null) {
                            if (c2567aM4507n.m4488O0() != EnumC2594y.f8253e) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            C2567A c2567aM4499f = m4499f(c2567aM4507n);
                            if (c2567aM4499f == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            c2684c = m4502i(c2567aM4499f);
                        }
                        return Boolean.valueOf(m4505l(i5, c2214e, c2567a, c2684c));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new C0330q();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (c2684c == null) {
                    c2684c = m4502i(c2567aM4507n);
                }
                return Boolean.valueOf(m4505l(i5, c2214e, c2567a, c2684c));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return c2567a.m4485L0().f8234a ? (Boolean) c2214e.mo1h(c2567a) : c2684c == null ? Boolean.valueOf(m4501h(c2567a, i5, c2214e)) : Boolean.valueOf(m4491A(i5, c2214e, c2567a, c2684c));
                }
                throw new C0330q();
            }
        }
        return Boolean.valueOf(m4501h(c2567a, i5, c2214e));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c A[RETURN] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m4494a(C2567A c2567a, C2214e c2214e) {
        int iOrdinal = c2567a.m4488O0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C2567A c2567aM4507n = m4507n(c2567a);
                if (c2567aM4507n == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = c2567aM4507n.m4488O0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            if (iOrdinal2 != 3) {
                                throw new C0330q();
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild");
                        }
                    } else if (m4494a(c2567aM4507n, c2214e) || m4506m(c2567a, c2567aM4507n, 2, c2214e) || (c2567aM4507n.m4485L0().f8234a && ((Boolean) c2214e.mo1h(c2567aM4507n)).booleanValue())) {
                        return true;
                    }
                }
                return m4506m(c2567a, c2567aM4507n, 2, c2214e);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new C0330q();
                }
                if (!m4517x(c2567a, c2214e)) {
                    if (!(c2567a.m4485L0().f8234a ? ((Boolean) c2214e.mo1h(c2567a)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return m4517x(c2567a, c2214e);
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
    
        r1 = r11 - r19.f8560c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.f8558a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.f8561d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.f8559b - r8;
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
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0095, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009b, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009c, code lost:
    
        return true;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m4495b(C2684c c2684c, C2684c c2684c2, C2684c c2684c3, int i5) {
        boolean zM4496c = m4496c(i5, c2684c3, c2684c);
        float f2 = c2684c3.f8559b;
        float f5 = c2684c3.f8561d;
        float f6 = c2684c3.f8558a;
        float f7 = c2684c3.f8560c;
        float f8 = c2684c.f8561d;
        float f9 = c2684c.f8559b;
        float f10 = c2684c.f8560c;
        float f11 = c2684c.f8558a;
        if (zM4496c || !m4496c(i5, c2684c2, c2684c)) {
            return false;
        }
        if (i5 != 3) {
            if (i5 != 4) {
                if (i5 != 5) {
                    if (i5 != 6) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search");
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final boolean m4496c(int i5, C2684c c2684c, C2684c c2684c2) {
        if (i5 == 3 || i5 == 4) {
            return c2684c.f8561d > c2684c2.f8559b && c2684c.f8559b < c2684c2.f8561d;
        }
        if (i5 == 5 || i5 == 6) {
            return c2684c.f8560c > c2684c2.f8558a && c2684c.f8558a < c2684c2.f8560c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final boolean m4497d(C2567A c2567a, boolean z5) {
        int iOrdinal = c2567a.m4488O0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C2567A c2567aM4507n = m4507n(c2567a);
                if (!(c2567aM4507n != null ? m4497d(c2567aM4507n, z5) : true)) {
                    return false;
                }
                c2567a.m4484K0(EnumC2594y.f8253e, EnumC2594y.f8254f);
                return true;
            }
            if (iOrdinal == 2) {
                return z5;
            }
            if (iOrdinal != 3) {
                throw new C0330q();
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final void m4498e(C2567A c2567a, C1483e c1483e) {
        if (!c2567a.f7186d.f7199q) {
            AbstractC0277a.m483b("visitChildren called on an unattached node");
        }
        C1483e c1483e2 = new C1483e(new AbstractC2206o[16]);
        AbstractC2206o abstractC2206o = c2567a.f7186d;
        AbstractC2206o abstractC2206o2 = abstractC2206o.f7191i;
        if (abstractC2206o2 == null) {
            AbstractC0601k.m1026b(c1483e2, abstractC2206o);
        } else {
            c1483e2.m2753b(abstractC2206o2);
        }
        while (true) {
            int i5 = c1483e2.f5183f;
            if (i5 == 0) {
                return;
            }
            AbstractC2206o abstractC2206oM1029e = (AbstractC2206o) c1483e2.m2762k(i5 - 1);
            if ((abstractC2206oM1029e.f7189g & 1024) == 0) {
                AbstractC0601k.m1026b(c1483e2, abstractC2206oM1029e);
            } else {
                while (true) {
                    if (abstractC2206oM1029e == null) {
                        break;
                    }
                    if ((abstractC2206oM1029e.f7188f & 1024) != 0) {
                        C1483e c1483e3 = null;
                        while (abstractC2206oM1029e != null) {
                            if (abstractC2206oM1029e instanceof C2567A) {
                                C2567A c2567a2 = (C2567A) abstractC2206oM1029e;
                                if (c2567a2.f7199q && !AbstractC0601k.m1044t(c2567a2).f1710U) {
                                    if (c2567a2.m4485L0().f8234a) {
                                        c1483e.m2753b(c2567a2);
                                    } else {
                                        m4498e(c2567a2, c1483e);
                                    }
                                }
                            } else if ((abstractC2206oM1029e.f7188f & 1024) != 0 && (abstractC2206oM1029e instanceof AbstractC0599j)) {
                                int i6 = 0;
                                for (AbstractC2206o abstractC2206o3 = ((AbstractC0599j) abstractC2206oM1029e).f1943s; abstractC2206o3 != null; abstractC2206o3 = abstractC2206o3.f7191i) {
                                    if ((abstractC2206o3.f7188f & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            abstractC2206oM1029e = abstractC2206o3;
                                        } else {
                                            if (c1483e3 == null) {
                                                c1483e3 = new C1483e(new AbstractC2206o[16]);
                                            }
                                            if (abstractC2206oM1029e != null) {
                                                c1483e3.m2753b(abstractC2206oM1029e);
                                                abstractC2206oM1029e = null;
                                            }
                                            c1483e3.m2753b(abstractC2206o3);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            abstractC2206oM1029e = AbstractC0601k.m1029e(c1483e3);
                        }
                    } else {
                        abstractC2206oM1029e = abstractC2206oM1029e.f7191i;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final C2567A m4499f(C2567A c2567a) {
        C2567A c2567aM4531f = ((C2584o) ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(c2567a)).getFocusOwner()).m4531f();
        if (c2567aM4531f == null || !c2567aM4531f.f7199q) {
            return null;
        }
        return c2567aM4531f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final C2567A m4500g(C1483e c1483e, C2684c c2684c, int i5) {
        C2684c c2684cM4657h;
        if (i5 == 3) {
            c2684cM4657h = c2684c.m4657h((c2684c.f8560c - c2684c.f8558a) + 1, 0.0f);
        } else if (i5 == 4) {
            c2684cM4657h = c2684c.m4657h(-((c2684c.f8560c - c2684c.f8558a) + 1), 0.0f);
        } else if (i5 == 5) {
            c2684cM4657h = c2684c.m4657h(0.0f, (c2684c.f8561d - c2684c.f8559b) + 1);
        } else {
            if (i5 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            c2684cM4657h = c2684c.m4657h(0.0f, -((c2684c.f8561d - c2684c.f8559b) + 1));
        }
        Object[] objArr = c1483e.f5181d;
        int i6 = c1483e.f5183f;
        C2567A c2567a = null;
        for (int i7 = 0; i7 < i6; i7++) {
            C2567A c2567a2 = (C2567A) objArr[i7];
            if (m4511r(c2567a2)) {
                C2684c c2684cM4502i = m4502i(c2567a2);
                if (m4508o(c2684cM4502i, c2684cM4657h, c2684c, i5)) {
                    c2567a = c2567a2;
                    c2684cM4657h = c2684cM4502i;
                }
            }
        }
        return c2567a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final boolean m4501h(C2567A c2567a, int i5, InterfaceC1601c interfaceC1601c) {
        C2684c c2684c;
        C1483e c1483e = new C1483e(new C2567A[16]);
        m4498e(c2567a, c1483e);
        int i6 = c1483e.f5183f;
        if (i6 <= 1) {
            C2567A c2567a2 = (C2567A) (i6 == 0 ? null : c1483e.f5181d[0]);
            if (c2567a2 != null) {
                return ((Boolean) interfaceC1601c.mo1h(c2567a2)).booleanValue();
            }
        } else {
            if (i5 == 7) {
                i5 = 4;
            }
            if (i5 == 4 || i5 == 6) {
                C2684c c2684cM4502i = m4502i(c2567a);
                float f2 = c2684cM4502i.f8558a;
                float f5 = c2684cM4502i.f8559b;
                c2684c = new C2684c(f2, f5, f2, f5);
            } else {
                if (i5 != 3 && i5 != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                C2684c c2684cM4502i2 = m4502i(c2567a);
                float f6 = c2684cM4502i2.f8560c;
                float f7 = c2684cM4502i2.f8561d;
                c2684c = new C2684c(f6, f7, f6, f7);
            }
            C2567A c2567aM4500g = m4500g(c1483e, c2684c, i5);
            if (c2567aM4500g != null) {
                return ((Boolean) interfaceC1601c.mo1h(c2567aM4500g)).booleanValue();
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final C2684c m4502i(C2567A c2567a) {
        AbstractC0596h0 abstractC0596h0;
        if (c2567a.f7199q && (abstractC0596h0 = c2567a.f7193k) != null) {
            InterfaceC0430v interfaceC0430vM693f = AbstractC0435z.m693f(abstractC0596h0);
            if (!interfaceC0430vM693f.mo632D()) {
                interfaceC0430vM693f = null;
            }
            if (interfaceC0430vM693f != null) {
                return c2567a.m4486M0(interfaceC0430vM693f);
            }
        }
        return C2684c.f8557e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final InterfaceC2207p m4503j(C2590u c2590u) {
        return new C2591v(c2590u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final boolean m4504k(C2567A c2567a, C2214e c2214e) {
        int iOrdinal = c2567a.m4488O0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C2567A c2567aM4507n = m4507n(c2567a);
                if (c2567aM4507n != null) {
                    return m4504k(c2567aM4507n, c2214e) || m4506m(c2567a, c2567aM4507n, 1, c2214e);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return c2567a.m4485L0().f8234a ? ((Boolean) c2214e.mo1h(c2567a)).booleanValue() : m4518y(c2567a, c2214e);
                }
                throw new C0330q();
            }
        }
        return m4518y(c2567a, c2214e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final boolean m4505l(int i5, C2214e c2214e, C2567A c2567a, C2684c c2684c) {
        if (m4491A(i5, c2214e, c2567a, c2684c)) {
            return true;
        }
        Boolean bool = (Boolean) m4519z(c2567a, i5, new C2569C(((C2584o) ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(c2567a)).getFocusOwner()).m4531f(), c2567a, c2684c, i5, c2214e, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final boolean m4506m(C2567A c2567a, C2567A c2567a2, int i5, C2214e c2214e) {
        if (m4492B(c2567a, c2567a2, i5, c2214e)) {
            return true;
        }
        Boolean bool = (Boolean) m4519z(c2567a, i5, new C2569C(((C2584o) ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(c2567a)).getFocusOwner()).m4531f(), c2567a, c2567a2, i5, c2214e, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0026, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C2567A m4507n(C2567A c2567a) {
        boolean z5 = c2567a.f7186d.f7199q;
        if (z5) {
            if (!z5) {
                AbstractC0277a.m483b("visitChildren called on an unattached node");
            }
            C1483e c1483e = new C1483e(new AbstractC2206o[16]);
            AbstractC2206o abstractC2206o = c2567a.f7186d;
            AbstractC2206o abstractC2206o2 = abstractC2206o.f7191i;
            if (abstractC2206o2 == null) {
                AbstractC0601k.m1026b(c1483e, abstractC2206o);
            } else {
                c1483e.m2753b(abstractC2206o2);
            }
            loop0: while (true) {
                int i5 = c1483e.f5183f;
                if (i5 == 0) {
                    break;
                }
                AbstractC2206o abstractC2206oM1029e = (AbstractC2206o) c1483e.m2762k(i5 - 1);
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
                                    C2567A c2567a2 = (C2567A) abstractC2206oM1029e;
                                    if (c2567a2.f7186d.f7199q) {
                                        int iOrdinal = c2567a2.m4488O0().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            break loop0;
                                        }
                                        if (iOrdinal != 3) {
                                            throw new C0330q();
                                        }
                                    }
                                } else if ((abstractC2206oM1029e.f7188f & 1024) != 0 && (abstractC2206oM1029e instanceof AbstractC0599j)) {
                                    int i6 = 0;
                                    for (AbstractC2206o abstractC2206o3 = ((AbstractC0599j) abstractC2206oM1029e).f1943s; abstractC2206o3 != null; abstractC2206o3 = abstractC2206o3.f7191i) {
                                        if ((abstractC2206o3.f7188f & 1024) != 0) {
                                            i6++;
                                            if (i6 == 1) {
                                                abstractC2206oM1029e = abstractC2206o3;
                                            } else {
                                                if (c1483e2 == null) {
                                                    c1483e2 = new C1483e(new AbstractC2206o[16]);
                                                }
                                                if (abstractC2206oM1029e != null) {
                                                    c1483e2.m2753b(abstractC2206oM1029e);
                                                    abstractC2206oM1029e = null;
                                                }
                                                c1483e2.m2753b(abstractC2206o3);
                                            }
                                        }
                                    }
                                    if (i6 == 1) {
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
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final boolean m4508o(C2684c c2684c, C2684c c2684c2, C2684c c2684c3, int i5) {
        if (!m4509p(i5, c2684c, c2684c3)) {
            return false;
        }
        if (m4509p(i5, c2684c2, c2684c3) && !m4495b(c2684c3, c2684c, c2684c2, i5)) {
            return !m4495b(c2684c3, c2684c2, c2684c, i5) && m4510q(i5, c2684c3, c2684c) < m4510q(i5, c2684c3, c2684c2);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final boolean m4509p(int i5, C2684c c2684c, C2684c c2684c2) {
        if (i5 == 3) {
            float f2 = c2684c2.f8560c;
            float f5 = c2684c2.f8558a;
            float f6 = c2684c.f8560c;
            return (f2 > f6 || f5 >= f6) && f5 > c2684c.f8558a;
        }
        if (i5 == 4) {
            float f7 = c2684c2.f8558a;
            float f8 = c2684c2.f8560c;
            float f9 = c2684c.f8558a;
            return (f7 < f9 || f8 <= f9) && f8 < c2684c.f8560c;
        }
        if (i5 == 5) {
            float f10 = c2684c2.f8561d;
            float f11 = c2684c2.f8559b;
            float f12 = c2684c.f8561d;
            return (f10 > f12 || f11 >= f12) && f11 > c2684c.f8559b;
        }
        if (i5 != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f13 = c2684c2.f8559b;
        float f14 = c2684c2.f8561d;
        float f15 = c2684c.f8559b;
        return (f13 < f15 || f14 <= f15) && f14 < c2684c.f8561d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final long m4510q(int i5, C2684c c2684c, C2684c c2684c2) {
        float f2;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        if (i5 == 3) {
            f2 = c2684c.f8558a;
            f5 = c2684c2.f8560c;
        } else if (i5 == 4) {
            f2 = c2684c2.f8558a;
            f5 = c2684c.f8560c;
        } else if (i5 == 5) {
            f2 = c2684c.f8559b;
            f5 = c2684c2.f8561d;
        } else {
            if (i5 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f2 = c2684c2.f8559b;
            f5 = c2684c.f8561d;
        }
        float f10 = f2 - f5;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        long j5 = (long) f10;
        if (i5 == 3 || i5 == 4) {
            float f11 = c2684c.f8559b;
            f6 = 2;
            f7 = ((c2684c.f8561d - f11) / f6) + f11;
            f8 = c2684c2.f8559b;
            f9 = c2684c2.f8561d;
        } else {
            if (i5 != 5 && i5 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f12 = c2684c.f8558a;
            f6 = 2;
            f7 = ((c2684c.f8560c - f12) / f6) + f12;
            f8 = c2684c2.f8558a;
            f9 = c2684c2.f8560c;
        }
        long j6 = (long) (f7 - (((f9 - f8) / f6) + f8));
        return (j6 * j6) + (((long) 13) * j5 * j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final boolean m4511r(C2567A c2567a) {
        C0564I c0564i;
        AbstractC0596h0 abstractC0596h0;
        C0564I c0564i2;
        AbstractC0596h0 abstractC0596h02 = c2567a.f7193k;
        return (abstractC0596h02 == null || (c0564i = abstractC0596h02.f1932r) == null || !c0564i.m801I() || (abstractC0596h0 = c2567a.f7193k) == null || (c0564i2 = abstractC0596h0.f1932r) == null || !c0564i2.m799G()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final InterfaceC2207p m4512s(InterfaceC2207p interfaceC2207p, InterfaceC1601c interfaceC1601c) {
        return interfaceC2207p.mo4021c(new C2572c(interfaceC1601c));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [W2.c, X2.k] */
    /* JADX INFO: renamed from: t */
    public static final EnumC2571b m4513t(C2567A c2567a, int i5) {
        int iOrdinal = c2567a.m4488O0().ordinal();
        EnumC2571b enumC2571b = EnumC2571b.f8203d;
        if (iOrdinal != 0) {
            EnumC2571b enumC2571b2 = EnumC2571b.f8204e;
            if (iOrdinal == 1) {
                C2567A c2567aM4507n = m4507n(c2567a);
                if (c2567aM4507n == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                EnumC2571b enumC2571bM4513t = m4513t(c2567aM4507n, i5);
                if (enumC2571bM4513t == enumC2571b) {
                    enumC2571bM4513t = null;
                }
                if (enumC2571bM4513t != null) {
                    return enumC2571bM4513t;
                }
                if (c2567a.f8191t) {
                    return enumC2571b;
                }
                c2567a.f8191t = true;
                try {
                    C2588s c2588sM4485L0 = c2567a.m4485L0();
                    C2570a c2570a = new C2570a(i5);
                    C2584o c2584o = (C2584o) ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(c2567a)).getFocusOwner();
                    C2567A c2567aM4531f = c2584o.m4531f();
                    c2588sM4485L0.f8244k.mo1h(c2570a);
                    C2567A c2567aM4531f2 = c2584o.m4531f();
                    if (!c2570a.f8202b) {
                        return (c2567aM4531f == c2567aM4531f2 || c2567aM4531f2 == null) ? enumC2571b : C2590u.f8248d == C2590u.f8247c ? enumC2571b2 : EnumC2571b.f8205f;
                    }
                    C2590u c2590u = C2590u.f8246b;
                    return enumC2571b2;
                } finally {
                    c2567a.f8191t = false;
                }
            }
            if (iOrdinal == 2) {
                return enumC2571b2;
            }
            if (iOrdinal != 3) {
                throw new C0330q();
            }
        }
        return enumC2571b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v1, types: [W2.c, X2.k] */
    /* JADX INFO: renamed from: u */
    public static final EnumC2571b m4514u(C2567A c2567a, int i5) {
        if (!c2567a.f8192u) {
            c2567a.f8192u = true;
            try {
                C2588s c2588sM4485L0 = c2567a.m4485L0();
                C2570a c2570a = new C2570a(i5);
                C2584o c2584o = (C2584o) ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(c2567a)).getFocusOwner();
                C2567A c2567aM4531f = c2584o.m4531f();
                c2588sM4485L0.f8243j.mo1h(c2570a);
                C2567A c2567aM4531f2 = c2584o.m4531f();
                boolean z5 = c2570a.f8202b;
                EnumC2571b enumC2571b = EnumC2571b.f8204e;
                if (z5) {
                    C2590u c2590u = C2590u.f8246b;
                    return enumC2571b;
                }
                if (c2567aM4531f != c2567aM4531f2 && c2567aM4531f2 != null) {
                    return C2590u.f8248d == C2590u.f8247c ? enumC2571b : EnumC2571b.f8205f;
                }
            } finally {
                c2567a.f8192u = false;
            }
        }
        return EnumC2571b.f8203d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static final EnumC2571b m4515v(C2567A c2567a, int i5) {
        AbstractC2206o abstractC2206oM1029e;
        C0590e0 c0590e0;
        int iOrdinal = c2567a.m4488O0().ordinal();
        EnumC2571b enumC2571b = EnumC2571b.f8203d;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C2567A c2567aM4507n = m4507n(c2567a);
                if (c2567aM4507n != null) {
                    return m4513t(c2567aM4507n, i5);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new C0330q();
                }
                if (!c2567a.f7186d.f7199q) {
                    AbstractC0277a.m483b("visitAncestors called on an unattached node");
                }
                AbstractC2206o abstractC2206o = c2567a.f7186d.f7190h;
                C0564I c0564iM1044t = AbstractC0601k.m1044t(c2567a);
                loop0: while (true) {
                    if (c0564iM1044t == null) {
                        abstractC2206oM1029e = null;
                        break;
                    }
                    if ((c0564iM1044t.f1699J.f1896f.f7189g & 1024) != 0) {
                        while (abstractC2206o != null) {
                            if ((abstractC2206o.f7188f & 1024) != 0) {
                                abstractC2206oM1029e = abstractC2206o;
                                C1483e c1483e = null;
                                while (abstractC2206oM1029e != null) {
                                    if (abstractC2206oM1029e instanceof C2567A) {
                                        break loop0;
                                    }
                                    if ((abstractC2206oM1029e.f7188f & 1024) != 0 && (abstractC2206oM1029e instanceof AbstractC0599j)) {
                                        int i6 = 0;
                                        for (AbstractC2206o abstractC2206o2 = ((AbstractC0599j) abstractC2206oM1029e).f1943s; abstractC2206o2 != null; abstractC2206o2 = abstractC2206o2.f7191i) {
                                            if ((abstractC2206o2.f7188f & 1024) != 0) {
                                                i6++;
                                                if (i6 == 1) {
                                                    abstractC2206oM1029e = abstractC2206o2;
                                                } else {
                                                    if (c1483e == null) {
                                                        c1483e = new C1483e(new AbstractC2206o[16]);
                                                    }
                                                    if (abstractC2206oM1029e != null) {
                                                        c1483e.m2753b(abstractC2206oM1029e);
                                                        abstractC2206oM1029e = null;
                                                    }
                                                    c1483e.m2753b(abstractC2206o2);
                                                }
                                            }
                                        }
                                        if (i6 == 1) {
                                        }
                                    }
                                    abstractC2206oM1029e = AbstractC0601k.m1029e(c1483e);
                                }
                            }
                            abstractC2206o = abstractC2206o.f7190h;
                        }
                    }
                    c0564iM1044t = c0564iM1044t.m839u();
                    abstractC2206o = (c0564iM1044t == null || (c0590e0 = c0564iM1044t.f1699J) == null) ? null : c0590e0.f1895e;
                }
                C2567A c2567a2 = (C2567A) abstractC2206oM1029e;
                if (c2567a2 == null) {
                    return enumC2571b;
                }
                int iOrdinal2 = c2567a2.m4488O0().ordinal();
                if (iOrdinal2 == 0) {
                    return m4514u(c2567a2, i5);
                }
                if (iOrdinal2 == 1) {
                    return m4515v(c2567a2, i5);
                }
                if (iOrdinal2 == 2) {
                    return EnumC2571b.f8204e;
                }
                if (iOrdinal2 != 3) {
                    throw new C0330q();
                }
                EnumC2571b enumC2571bM4515v = m4515v(c2567a2, i5);
                EnumC2571b enumC2571b2 = enumC2571bM4515v != enumC2571b ? enumC2571bM4515v : null;
                return enumC2571b2 == null ? m4514u(c2567a2, i5) : enumC2571b2;
            }
        }
        return enumC2571b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0210 A[ADDED_TO_REGION, LOOP:9: B:153:0x0210->B:160:0x0222, LOOP_START, PHI: r12
  0x0210: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:152:0x020e, B:160:0x0222] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0230  */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m4516w(C2567A c2567a) {
        C1483e c1483e;
        int i5;
        C0590e0 c0590e0;
        char c5;
        C0590e0 c0590e02;
        C2584o c2584o = (C2584o) ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(c2567a)).getFocusOwner();
        C2567A c2567aM4531f = c2584o.m4531f();
        EnumC2594y enumC2594yM4488O0 = c2567a.m4488O0();
        if (c2567aM4531f == c2567a) {
            c2567a.m4484K0(enumC2594yM4488O0, enumC2594yM4488O0);
            return true;
        }
        int i6 = 0;
        if ((c2567aM4531f == null || c2567aM4531f.f8189r) && !c2567a.f8189r && !((C2584o) ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(c2567a)).getFocusOwner()).f8222a.m1298F()) {
            return false;
        }
        char c6 = 16;
        if (c2567aM4531f != null) {
            c1483e = new C1483e(new C2567A[16]);
            if (!c2567aM4531f.f7186d.f7199q) {
                AbstractC0277a.m483b("visitAncestors called on an unattached node");
            }
            AbstractC2206o abstractC2206o = c2567aM4531f.f7186d.f7190h;
            C0564I c0564iM1044t = AbstractC0601k.m1044t(c2567aM4531f);
            while (c0564iM1044t != null) {
                if ((c0564iM1044t.f1699J.f1896f.f7189g & 1024) != 0) {
                    while (abstractC2206o != null) {
                        if ((abstractC2206o.f7188f & 1024) != 0) {
                            AbstractC2206o abstractC2206oM1029e = abstractC2206o;
                            C1483e c1483e2 = null;
                            while (abstractC2206oM1029e != null) {
                                if (abstractC2206oM1029e instanceof C2567A) {
                                    c1483e.m2753b((C2567A) abstractC2206oM1029e);
                                } else if ((abstractC2206oM1029e.f7188f & 1024) != 0 && (abstractC2206oM1029e instanceof AbstractC0599j)) {
                                    int i7 = 0;
                                    for (AbstractC2206o abstractC2206o2 = ((AbstractC0599j) abstractC2206oM1029e).f1943s; abstractC2206o2 != null; abstractC2206o2 = abstractC2206o2.f7191i) {
                                        if ((abstractC2206o2.f7188f & 1024) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                abstractC2206oM1029e = abstractC2206o2;
                                            } else {
                                                if (c1483e2 == null) {
                                                    c1483e2 = new C1483e(new AbstractC2206o[16]);
                                                }
                                                if (abstractC2206oM1029e != null) {
                                                    c1483e2.m2753b(abstractC2206oM1029e);
                                                    abstractC2206oM1029e = null;
                                                }
                                                c1483e2.m2753b(abstractC2206o2);
                                            }
                                        }
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                abstractC2206oM1029e = AbstractC0601k.m1029e(c1483e2);
                            }
                        }
                        abstractC2206o = abstractC2206o.f7190h;
                    }
                }
                c0564iM1044t = c0564iM1044t.m839u();
                abstractC2206o = (c0564iM1044t == null || (c0590e02 = c0564iM1044t.f1699J) == null) ? null : c0590e02.f1895e;
            }
        } else {
            c1483e = null;
        }
        Object[] objArr = new C2567A[16];
        if (!c2567a.f7186d.f7199q) {
            AbstractC0277a.m483b("visitAncestors called on an unattached node");
        }
        AbstractC2206o abstractC2206o3 = c2567a.f7186d.f7190h;
        C0564I c0564iM1044t2 = AbstractC0601k.m1044t(c2567a);
        int i8 = 1;
        int i9 = 0;
        while (c0564iM1044t2 != null) {
            if ((c0564iM1044t2.f1699J.f1896f.f7189g & 1024) != 0) {
                while (abstractC2206o3 != null) {
                    if ((abstractC2206o3.f7188f & 1024) != 0) {
                        AbstractC2206o abstractC2206oM1029e2 = abstractC2206o3;
                        C1483e c1483e3 = null;
                        while (abstractC2206oM1029e2 != null) {
                            if (abstractC2206oM1029e2 instanceof C2567A) {
                                C2567A c2567a2 = (C2567A) abstractC2206oM1029e2;
                                Boolean boolValueOf = c1483e != null ? Boolean.valueOf(c1483e.m2761j(c2567a2)) : null;
                                if (boolValueOf == null || !boolValueOf.booleanValue()) {
                                    int i10 = i9 + 1;
                                    if (objArr.length < i10) {
                                        int length = objArr.length;
                                        Object[] objArr2 = new Object[Math.max(i10, length * 2)];
                                        System.arraycopy(objArr, i6, objArr2, i6, length);
                                        objArr = objArr2;
                                    }
                                    objArr[i9] = c2567a2;
                                    i9 = i10;
                                }
                                if (c2567a2 == c2567aM4531f) {
                                    i8 = i6;
                                }
                            } else {
                                if ((abstractC2206oM1029e2.f7188f & 1024) != 0 && (abstractC2206oM1029e2 instanceof AbstractC0599j)) {
                                    int i11 = i6;
                                    for (AbstractC2206o abstractC2206o4 = ((AbstractC0599j) abstractC2206oM1029e2).f1943s; abstractC2206o4 != null; abstractC2206o4 = abstractC2206o4.f7191i) {
                                        if ((abstractC2206o4.f7188f & 1024) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                abstractC2206oM1029e2 = abstractC2206o4;
                                            } else {
                                                if (c1483e3 == null) {
                                                    c1483e3 = new C1483e(new AbstractC2206o[16]);
                                                }
                                                if (abstractC2206oM1029e2 != null) {
                                                    c1483e3.m2753b(abstractC2206oM1029e2);
                                                    abstractC2206oM1029e2 = null;
                                                }
                                                c1483e3.m2753b(abstractC2206o4);
                                            }
                                        }
                                    }
                                    c5 = 16;
                                    if (i11 == 1) {
                                        c6 = 16;
                                    }
                                    i6 = 0;
                                }
                                abstractC2206oM1029e2 = AbstractC0601k.m1029e(c1483e3);
                                c6 = c5;
                                i6 = 0;
                            }
                            c5 = 16;
                            abstractC2206oM1029e2 = AbstractC0601k.m1029e(c1483e3);
                            c6 = c5;
                            i6 = 0;
                        }
                    }
                    abstractC2206o3 = abstractC2206o3.f7190h;
                    c6 = c6;
                    i6 = 0;
                }
            }
            char c7 = c6;
            c0564iM1044t2 = c0564iM1044t2.m839u();
            abstractC2206o3 = (c0564iM1044t2 == null || (c0590e0 = c0564iM1044t2.f1699J) == null) ? null : c0590e0.f1895e;
            c6 = c7;
            i6 = 0;
        }
        if (i8 == 0 || c2567aM4531f == null || m4497d(c2567aM4531f, false)) {
            AbstractC0601k.m1040p(c2567a, new C0102b(14, c2567a));
            int iOrdinal = c2567a.m4488O0().ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    ((C2584o) ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(c2567a)).getFocusOwner()).m4534i(c2567a);
                } else if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        throw new C0330q();
                    }
                    ((C2584o) ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(c2567a)).getFocusOwner()).m4534i(c2567a);
                }
            }
            EnumC2594y enumC2594y = EnumC2594y.f8254f;
            EnumC2594y enumC2594y2 = EnumC2594y.f8252d;
            if (i8 != 0 && c2567aM4531f != null) {
                c2567aM4531f.m4484K0(enumC2594y2, enumC2594y);
            }
            EnumC2594y enumC2594y3 = EnumC2594y.f8253e;
            if (c1483e != null) {
                int i12 = c1483e.f5183f - 1;
                Object[] objArr3 = c1483e.f5181d;
                if (i12 < objArr3.length) {
                    while (i12 >= 0) {
                        C2567A c2567a3 = (C2567A) objArr3[i12];
                        if (c2584o.m4531f() != c2567a) {
                            break;
                        }
                        c2567a3.m4484K0(enumC2594y3, enumC2594y);
                        i12--;
                    }
                    i5 = i9 - 1;
                    if (i5 >= objArr.length) {
                        while (i5 >= 0) {
                            C2567A c2567a4 = (C2567A) objArr[i5];
                            if (c2584o.m4531f() != c2567a) {
                                break;
                            }
                            c2567a4.m4484K0(c2567a4 == c2567aM4531f ? enumC2594y2 : enumC2594y, enumC2594y3);
                            i5--;
                        }
                        if (c2584o.m4531f() == c2567a) {
                            c2567a.m4484K0(enumC2594yM4488O0, enumC2594y2);
                            if (c2584o.m4531f() != c2567a) {
                                break;
                            }
                            return true;
                        }
                    } else if (c2584o.m4531f() == c2567a) {
                    }
                } else {
                    i5 = i9 - 1;
                    if (i5 >= objArr.length) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static final boolean m4517x(C2567A c2567a, C2214e c2214e) {
        Object[] objArr = new C2567A[16];
        if (!c2567a.f7186d.f7199q) {
            AbstractC0277a.m483b("visitChildren called on an unattached node");
        }
        C1483e c1483e = new C1483e(new AbstractC2206o[16]);
        AbstractC2206o abstractC2206o = c2567a.f7186d;
        AbstractC2206o abstractC2206o2 = abstractC2206o.f7191i;
        if (abstractC2206o2 == null) {
            AbstractC0601k.m1026b(c1483e, abstractC2206o);
        } else {
            c1483e.m2753b(abstractC2206o2);
        }
        int i5 = 0;
        while (true) {
            int i6 = c1483e.f5183f;
            if (i6 == 0) {
                break;
            }
            AbstractC2206o abstractC2206oM1029e = (AbstractC2206o) c1483e.m2762k(i6 - 1);
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
                                C2567A c2567a2 = (C2567A) abstractC2206oM1029e;
                                int i7 = i5 + 1;
                                if (objArr.length < i7) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i7, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i5] = c2567a2;
                                i5 = i7;
                            } else if ((abstractC2206oM1029e.f7188f & 1024) != 0 && (abstractC2206oM1029e instanceof AbstractC0599j)) {
                                int i8 = 0;
                                for (AbstractC2206o abstractC2206o3 = ((AbstractC0599j) abstractC2206oM1029e).f1943s; abstractC2206o3 != null; abstractC2206o3 = abstractC2206o3.f7191i) {
                                    if ((abstractC2206o3.f7188f & 1024) != 0) {
                                        i8++;
                                        if (i8 == 1) {
                                            abstractC2206oM1029e = abstractC2206o3;
                                        } else {
                                            if (c1483e2 == null) {
                                                c1483e2 = new C1483e(new AbstractC2206o[16]);
                                            }
                                            if (abstractC2206oM1029e != null) {
                                                c1483e2.m2753b(abstractC2206oM1029e);
                                                abstractC2206oM1029e = null;
                                            }
                                            c1483e2.m2753b(abstractC2206o3);
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
        AbstractC0972l.m2006d0(objArr, C2568B.f8194a, 0, i5);
        int i9 = i5 - 1;
        if (i9 < objArr.length) {
            while (i9 >= 0) {
                C2567A c2567a3 = (C2567A) objArr[i9];
                if (m4511r(c2567a3) && m4494a(c2567a3, c2214e)) {
                    return true;
                }
                i9--;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static final boolean m4518y(C2567A c2567a, C2214e c2214e) {
        Object[] objArr = new C2567A[16];
        if (!c2567a.f7186d.f7199q) {
            AbstractC0277a.m483b("visitChildren called on an unattached node");
        }
        C1483e c1483e = new C1483e(new AbstractC2206o[16]);
        AbstractC2206o abstractC2206o = c2567a.f7186d;
        AbstractC2206o abstractC2206o2 = abstractC2206o.f7191i;
        if (abstractC2206o2 == null) {
            AbstractC0601k.m1026b(c1483e, abstractC2206o);
        } else {
            c1483e.m2753b(abstractC2206o2);
        }
        int i5 = 0;
        while (true) {
            int i6 = c1483e.f5183f;
            if (i6 == 0) {
                break;
            }
            AbstractC2206o abstractC2206oM1029e = (AbstractC2206o) c1483e.m2762k(i6 - 1);
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
                                C2567A c2567a2 = (C2567A) abstractC2206oM1029e;
                                int i7 = i5 + 1;
                                if (objArr.length < i7) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i7, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i5] = c2567a2;
                                i5 = i7;
                            } else if ((abstractC2206oM1029e.f7188f & 1024) != 0 && (abstractC2206oM1029e instanceof AbstractC0599j)) {
                                int i8 = 0;
                                for (AbstractC2206o abstractC2206o3 = ((AbstractC0599j) abstractC2206oM1029e).f1943s; abstractC2206o3 != null; abstractC2206o3 = abstractC2206o3.f7191i) {
                                    if ((abstractC2206o3.f7188f & 1024) != 0) {
                                        i8++;
                                        if (i8 == 1) {
                                            abstractC2206oM1029e = abstractC2206o3;
                                        } else {
                                            if (c1483e2 == null) {
                                                c1483e2 = new C1483e(new AbstractC2206o[16]);
                                            }
                                            if (abstractC2206oM1029e != null) {
                                                c1483e2.m2753b(abstractC2206oM1029e);
                                                abstractC2206oM1029e = null;
                                            }
                                            c1483e2.m2753b(abstractC2206o3);
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
        AbstractC0972l.m2006d0(objArr, C2568B.f8194a, 0, i5);
        for (int i9 = 0; i9 < i5; i9++) {
            C2567A c2567a3 = (C2567A) objArr[i9];
            if (m4511r(c2567a3) && m4504k(c2567a3, c2214e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r13v47, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: z */
    public static final Object m4519z(C2567A c2567a, int i5, InterfaceC1601c interfaceC1601c) {
        int i6;
        int i7;
        Object objMo1h;
        AbstractC2206o abstractC2206oM1029e;
        C3432o c3432oM4487N0;
        int iMax;
        int size;
        int i8;
        C0590e0 c0590e0;
        if (!c2567a.f7186d.f7199q) {
            AbstractC0277a.m483b("visitAncestors called on an unattached node");
        }
        AbstractC2206o abstractC2206o = c2567a.f7186d.f7190h;
        C0564I c0564iM1044t = AbstractC0601k.m1044t(c2567a);
        loop0: while (true) {
            i6 = 0;
            i7 = 1;
            objMo1h = null;
            if (c0564iM1044t == null) {
                abstractC2206oM1029e = null;
                break;
            }
            if ((c0564iM1044t.f1699J.f1896f.f7189g & 1024) != 0) {
                while (abstractC2206o != null) {
                    if ((abstractC2206o.f7188f & 1024) != 0) {
                        abstractC2206oM1029e = abstractC2206o;
                        C1483e c1483e = null;
                        while (abstractC2206oM1029e != null) {
                            if (abstractC2206oM1029e instanceof C2567A) {
                                break loop0;
                            }
                            if ((abstractC2206oM1029e.f7188f & 1024) != 0 && (abstractC2206oM1029e instanceof AbstractC0599j)) {
                                int i9 = 0;
                                for (AbstractC2206o abstractC2206o2 = ((AbstractC0599j) abstractC2206oM1029e).f1943s; abstractC2206o2 != null; abstractC2206o2 = abstractC2206o2.f7191i) {
                                    if ((abstractC2206o2.f7188f & 1024) != 0) {
                                        i9++;
                                        if (i9 == 1) {
                                            abstractC2206oM1029e = abstractC2206o2;
                                        } else {
                                            if (c1483e == null) {
                                                c1483e = new C1483e(new AbstractC2206o[16]);
                                            }
                                            if (abstractC2206oM1029e != null) {
                                                c1483e.m2753b(abstractC2206oM1029e);
                                                abstractC2206oM1029e = null;
                                            }
                                            c1483e.m2753b(abstractC2206o2);
                                        }
                                    }
                                }
                                if (i9 == 1) {
                                }
                            }
                            abstractC2206oM1029e = AbstractC0601k.m1029e(c1483e);
                        }
                    }
                    abstractC2206o = abstractC2206o.f7190h;
                }
            }
            c0564iM1044t = c0564iM1044t.m839u();
            abstractC2206o = (c0564iM1044t == null || (c0590e0 = c0564iM1044t.f1699J) == null) ? null : c0590e0.f1895e;
        }
        C2567A c2567a2 = (C2567A) abstractC2206oM1029e;
        if ((c2567a2 != null && AbstractC1665j.m2981a(c2567a2.m4487N0(), c2567a.m4487N0())) || (c3432oM4487N0 = c2567a.m4487N0()) == null) {
            return null;
        }
        int i10 = 5;
        if (i5 != 5) {
            i10 = 6;
            if (i5 != 6) {
                i10 = 3;
                if (i5 != 3) {
                    i10 = 4;
                    if (i5 != 4) {
                        if (i5 == 1) {
                            i10 = 2;
                        } else {
                            if (i5 != 2) {
                                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                            }
                            i10 = 1;
                        }
                    }
                }
            }
        }
        if (c3432oM4487N0.f10719r.f10489a.m5620g().f10531n <= 0 || c3432oM4487N0.f10719r.f10489a.m5620g().f10528k.isEmpty() || !c3432oM4487N0.f7199q) {
            return interfaceC1601c.mo1h(C3432o.f10718u);
        }
        if (c3432oM4487N0.m5697K0(i10)) {
            C3374e c3374e = c3432oM4487N0.f10719r;
            iMax = Math.min(c3374e.f10489a.m5620g().f10531n - 1, ((C3381l) AbstractC0973m.m2017X(c3374e.f10489a.m5620g().f10528k)).f10535a);
        } else {
            iMax = Math.max(0, ((C1360f0) c3432oM4487N0.f10719r.f10489a.f10563e.f741b).m2509g());
        }
        C1675t c1675t = new C1675t();
        C2976a c2976a = c3432oM4487N0.f10720s;
        c2976a.getClass();
        C3427j c3427j = new C3427j(iMax, iMax);
        c2976a.f9424a.m2753b(c3427j);
        c1675t.f5710e = c3427j;
        C3385p c3385p = c3432oM4487N0.f10719r.f10489a;
        if (c3385p.m5620g().f10528k.isEmpty()) {
            i7 = 0;
        } else {
            C3380k c3380kM5620g = c3385p.m5620g();
            int iM5615g = (int) (c3380kM5620g.f10532o == EnumC2983d0.f9447d ? c3380kM5620g.m5615g() & 4294967295L : c3380kM5620g.m5615g() >> 32);
            C3380k c3380kM5620g2 = c3385p.m5620g();
            ?? r7 = c3380kM5620g2.f10528k;
            if (r7.isEmpty()) {
                size = 0;
            } else {
                int size2 = r7.size();
                int i11 = 0;
                for (int i12 = 0; i12 < size2; i12++) {
                    i11 += ((C3381l) r7.get(i12)).f10545k;
                }
                size = (i11 / r7.size()) + c3380kM5620g2.f10534q;
            }
            if (size != 0 && (i8 = iM5615g / size) >= 1) {
                i7 = i8;
            }
        }
        int i13 = i7 * 2;
        int i14 = c3432oM4487N0.f10719r.f10489a.m5620g().f10531n;
        if (i13 > i14) {
            i13 = i14;
        }
        while (objMo1h == null && c3432oM4487N0.m5696J0((C3427j) c1675t.f5710e, i10) && i6 < i13) {
            C3427j c3427j2 = (C3427j) c1675t.f5710e;
            int i15 = c3427j2.f10709a;
            int i16 = c3427j2.f10710b;
            if (c3432oM4487N0.m5697K0(i10)) {
                i16++;
            } else {
                i15--;
            }
            C2976a c2976a2 = c3432oM4487N0.f10720s;
            c2976a2.getClass();
            C3427j c3427j3 = new C3427j(i15, i16);
            c2976a2.f9424a.m2753b(c3427j3);
            c3432oM4487N0.f10720s.f9424a.m2761j((C3427j) c1675t.f5710e);
            c1675t.f5710e = c3427j3;
            i6++;
            AbstractC0601k.m1044t(c3432oM4487N0).m829k();
            objMo1h = interfaceC1601c.mo1h(new C3431n(c3432oM4487N0, c1675t, i10));
        }
        c3432oM4487N0.f10720s.f9424a.m2761j((C3427j) c1675t.f5710e);
        AbstractC0601k.m1044t(c3432oM4487N0).m829k();
        return objMo1h;
    }
}
