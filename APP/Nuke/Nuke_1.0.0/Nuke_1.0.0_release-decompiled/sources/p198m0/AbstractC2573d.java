package p198m0;

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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m4492B(p198m0.C2567A r12, p198m0.C2567A r13, int r14, p170h1.C2214e r15) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p198m0.AbstractC2573d.m4492B(m0.A, m0.A, int, h1.e):boolean");
    }

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

    /* JADX WARN: Removed duplicated region for block: B:38:0x007c A[RETURN] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m4494a(p198m0.C2567A r7, p170h1.C2214e r8) {
        /*
            m0.y r0 = r7.m4488O0()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L89
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L37
            if (r0 == r3) goto L89
            if (r0 != r1) goto L31
            boolean r0 = m4517x(r7, r8)
            if (r0 != 0) goto L7d
            m0.s r0 = r7.m4485L0()
            boolean r0 = r0.f8234a
            if (r0 == 0) goto L2d
            java.lang.Object r7 = r8.mo1h(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L2e
        L2d:
            r7 = r2
        L2e:
            if (r7 == 0) goto L7c
            goto L7d
        L31:
            E4.q r7 = new E4.q
            r7.<init>()
            throw r7
        L37:
            m0.A r0 = m4507n(r7)
            java.lang.String r5 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L83
            m0.y r6 = r0.m4488O0()
            int r6 = r6.ordinal()
            if (r6 == 0) goto L7e
            if (r6 == r4) goto L5b
            if (r6 == r3) goto L7e
            if (r6 == r1) goto L55
            E4.q r7 = new E4.q
            r7.<init>()
            throw r7
        L55:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
            throw r7
        L5b:
            boolean r1 = m4494a(r0, r8)
            if (r1 != 0) goto L7d
            boolean r7 = m4506m(r7, r0, r3, r8)
            if (r7 != 0) goto L7d
            m0.s r7 = r0.m4485L0()
            boolean r7 = r7.f8234a
            if (r7 == 0) goto L7c
            java.lang.Object r7 = r8.mo1h(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L7c
            goto L7d
        L7c:
            return r2
        L7d:
            return r4
        L7e:
            boolean r7 = m4506m(r7, r0, r3, r8)
            return r7
        L83:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
            throw r7
        L89:
            boolean r7 = m4517x(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p198m0.AbstractC2573d.m4494a(m0.A, h1.e):boolean");
    }

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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m4495b(p204n0.C2684c r18, p204n0.C2684c r19, p204n0.C2684c r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = m4496c(r3, r2, r0)
            float r5 = r2.f8559b
            float r6 = r2.f8561d
            float r7 = r2.f8558a
            float r2 = r2.f8560c
            float r8 = r0.f8561d
            float r9 = r0.f8559b
            float r10 = r0.f8560c
            float r11 = r0.f8558a
            r12 = 0
            if (r4 != 0) goto La3
            boolean r0 = m4496c(r3, r1, r0)
            if (r0 != 0) goto L27
            goto La3
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L9c
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L9c
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L9c
            goto L4a
        L44:
            if (r3 != r13) goto L9d
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L9c
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.f8560c
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.f8558a
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.f8561d
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L96
            float r1 = r1.f8559b
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L96:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L9c:
            return r18
        L9d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        La3:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p198m0.AbstractC2573d.m4495b(n0.c, n0.c, n0.c, int):boolean");
    }

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

    /* JADX INFO: renamed from: f */
    public static final C2567A m4499f(C2567A c2567a) {
        C2567A c2567aM4531f = ((C2584o) ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(c2567a)).getFocusOwner()).m4531f();
        if (c2567aM4531f == null || !c2567aM4531f.f7199q) {
            return null;
        }
        return c2567aM4531f;
    }

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

    /* JADX INFO: renamed from: j */
    public static final InterfaceC2207p m4503j(C2590u c2590u) {
        return new C2591v(c2590u);
    }

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

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0026, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p198m0.C2567A m4507n(p198m0.C2567A r8) {
        /*
            h0.o r0 = r8.f7186d
            boolean r0 = r0.f7199q
            r1 = 0
            if (r0 != 0) goto L9
            goto Lac
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitChildren called on an unattached node"
            p023E0.AbstractC0277a.m483b(r0)
        L10:
            V.e r0 = new V.e
            r2 = 16
            h0.o[] r3 = new p169h0.AbstractC2206o[r2]
            r0.<init>(r3)
            h0.o r8 = r8.f7186d
            h0.o r3 = r8.f7191i
            if (r3 != 0) goto L23
            p041H0.AbstractC0601k.m1026b(r0, r8)
            goto L26
        L23:
            r0.m2753b(r3)
        L26:
            int r8 = r0.f5183f
            if (r8 == 0) goto Lac
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.m2762k(r8)
            h0.o r8 = (p169h0.AbstractC2206o) r8
            int r3 = r8.f7189g
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3c
            p041H0.AbstractC0601k.m1026b(r0, r8)
            goto L26
        L3c:
            if (r8 == 0) goto L26
            int r3 = r8.f7188f
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto La9
            r3 = r1
        L45:
            if (r8 == 0) goto L26
            boolean r4 = r8 instanceof p198m0.C2567A
            r5 = 1
            if (r4 == 0) goto L6e
            m0.A r8 = (p198m0.C2567A) r8
            h0.o r4 = r8.f7186d
            boolean r4 = r4.f7199q
            if (r4 == 0) goto La4
            m0.y r4 = r8.m4488O0()
            int r4 = r4.ordinal()
            if (r4 == 0) goto L6d
            if (r4 == r5) goto L6d
            r5 = 2
            if (r4 == r5) goto L6d
            r8 = 3
            if (r4 != r8) goto L67
            goto La4
        L67:
            E4.q r8 = new E4.q
            r8.<init>()
            throw r8
        L6d:
            return r8
        L6e:
            int r4 = r8.f7188f
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La4
            boolean r4 = r8 instanceof p041H0.AbstractC0599j
            if (r4 == 0) goto La4
            r4 = r8
            H0.j r4 = (p041H0.AbstractC0599j) r4
            h0.o r4 = r4.f1943s
            r6 = 0
        L7e:
            if (r4 == 0) goto La1
            int r7 = r4.f7188f
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L9e
            int r6 = r6 + 1
            if (r6 != r5) goto L8c
            r8 = r4
            goto L9e
        L8c:
            if (r3 != 0) goto L95
            V.e r3 = new V.e
            h0.o[] r7 = new p169h0.AbstractC2206o[r2]
            r3.<init>(r7)
        L95:
            if (r8 == 0) goto L9b
            r3.m2753b(r8)
            r8 = r1
        L9b:
            r3.m2753b(r4)
        L9e:
            h0.o r4 = r4.f7191i
            goto L7e
        La1:
            if (r6 != r5) goto La4
            goto L45
        La4:
            h0.o r8 = p041H0.AbstractC0601k.m1029e(r3)
            goto L45
        La9:
            h0.o r8 = r8.f7191i
            goto L3c
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p198m0.AbstractC2573d.m4507n(m0.A):m0.A");
    }

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

    /* JADX INFO: renamed from: r */
    public static final boolean m4511r(C2567A c2567a) {
        C0564I c0564i;
        AbstractC0596h0 abstractC0596h0;
        C0564I c0564i2;
        AbstractC0596h0 abstractC0596h02 = c2567a.f7193k;
        return (abstractC0596h02 == null || (c0564i = abstractC0596h02.f1932r) == null || !c0564i.m801I() || (abstractC0596h0 = c2567a.f7193k) == null || (c0564i2 = abstractC0596h0.f1932r) == null || !c0564i2.m799G()) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public static final InterfaceC2207p m4512s(InterfaceC2207p interfaceC2207p, InterfaceC1601c interfaceC1601c) {
        return interfaceC2207p.mo4021c(new C2572c(interfaceC1601c));
    }

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

    /* JADX WARN: Removed duplicated region for block: B:151:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0210 A[ADDED_TO_REGION, LOOP:9: B:153:0x0210->B:160:0x0222, LOOP_START, PHI: r12
  0x0210: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:152:0x020e, B:160:0x0222] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0230  */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m4516w(p198m0.C2567A r18) {
        /*
            Method dump skipped, instruction units count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p198m0.AbstractC2573d.m4516w(m0.A):boolean");
    }

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
