package p077P0;

import java.util.ArrayList;
import java.util.List;
import p007B0.C0172E;
import p029F0.AbstractC0435z;
import p041H0.AbstractC0596h0;
import p041H0.AbstractC0599j;
import p041H0.AbstractC0601k;
import p041H0.C0564I;
import p041H0.InterfaceC0632z0;
import p061L2.AbstractC0973m;
import p061L2.C0981u;
import p105V.C1483e;
import p112W2.InterfaceC1601c;
import p169h0.AbstractC2206o;
import p186k.C2408E;
import p204n0.C2684c;

/* JADX INFO: renamed from: P0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1128o {

    /* JADX INFO: renamed from: a */
    public final AbstractC2206o f3708a;

    /* JADX INFO: renamed from: b */
    public final boolean f3709b;

    /* JADX INFO: renamed from: c */
    public final C0564I f3710c;

    /* JADX INFO: renamed from: d */
    public final C1125l f3711d;

    /* JADX INFO: renamed from: e */
    public boolean f3712e;

    /* JADX INFO: renamed from: f */
    public C1128o f3713f;

    /* JADX INFO: renamed from: g */
    public final int f3714g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1128o(AbstractC2206o abstractC2206o, boolean z5, C0564I c0564i, C1125l c1125l) {
        this.f3708a = abstractC2206o;
        this.f3709b = z5;
        this.f3710c = c0564i;
        this.f3711d = c1125l;
        this.f3714g = c0564i.f1712e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ List m2163j(int i5, C1128o c1128o) {
        return c1128o.m2172i((i5 & 1) != 0 ? !c1128o.f3709b : false, (i5 & 2) == 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:31:0x0058 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x0075 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:56:0x0067 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:58:0x0021 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:60:0x0021 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:63:0x0061 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
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
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX INFO: renamed from: a */
    public final C2684c m2164a(AbstractC0596h0 abstractC0596h0) {
        ?? M1029e;
        C1128o c1128oM2174l = m2174l();
        if (c1128oM2174l == null) {
            return C2684c.f8557e;
        }
        AbstractC2206o abstractC2206o = c1128oM2174l.f3710c.f1699J.f1896f;
        if ((abstractC2206o.f7189g & 8) != 0) {
            loop0: while (abstractC2206o != null) {
                if ((abstractC2206o.f7188f & 8) != 0) {
                    M1029e = abstractC2206o;
                    ?? c1483e = 0;
                    while (M1029e != 0) {
                        if (M1029e instanceof InterfaceC0632z0) {
                            if (((InterfaceC0632z0) M1029e).mo1083f()) {
                                break loop0;
                            }
                        } else if ((M1029e.f7188f & 8) != 0 && (M1029e instanceof AbstractC0599j)) {
                            AbstractC2206o abstractC2206o2 = ((AbstractC0599j) M1029e).f1943s;
                            int i5 = 0;
                            M1029e = M1029e;
                            c1483e = c1483e;
                            while (abstractC2206o2 != null) {
                                if ((abstractC2206o2.f7188f & 8) != 0) {
                                    i5++;
                                    c1483e = c1483e;
                                    if (i5 == 1) {
                                        M1029e = abstractC2206o2;
                                    } else {
                                        if (c1483e == 0) {
                                            c1483e = new C1483e(new AbstractC2206o[16]);
                                        }
                                        if (M1029e != 0) {
                                            c1483e.m2753b(M1029e);
                                            M1029e = 0;
                                        }
                                        c1483e.m2753b(abstractC2206o2);
                                    }
                                }
                                abstractC2206o2 = abstractC2206o2.f7191i;
                                M1029e = M1029e;
                                c1483e = c1483e;
                            }
                            if (i5 == 1) {
                            }
                        }
                        M1029e = AbstractC0601k.m1029e(c1483e);
                    }
                }
                if ((abstractC2206o.f7189g & 8) == 0) {
                    break;
                }
                abstractC2206o = abstractC2206o.f7191i;
            }
            M1029e = 0;
        } else {
            M1029e = 0;
        }
        InterfaceC0632z0 interfaceC0632z0 = (InterfaceC0632z0) M1029e;
        AbstractC0596h0 abstractC0596h0M1042r = interfaceC0632z0 != null ? AbstractC0601k.m1042r(interfaceC0632z0, 8) : null;
        return abstractC0596h0M1042r == null ? c1128oM2174l.m2164a(abstractC0596h0) : abstractC0596h0M1042r.mo634K(abstractC0596h0, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C1128o m2165b(C1121h c1121h, InterfaceC1601c interfaceC1601c) {
        C1125l c1125l = new C1125l();
        c1125l.f3704f = false;
        c1125l.f3705g = false;
        interfaceC1601c.mo1h(c1125l);
        C1128o c1128o = new C1128o(new C1127n(interfaceC1601c), false, new C0564I(this.f3714g + (c1121h != null ? 1000000000 : 2000000000), true), c1125l);
        c1128o.f3712e = true;
        c1128o.f3713f = this;
        return c1128o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m2166c(C0564I c0564i, ArrayList arrayList) {
        C1483e c1483eM842x = c0564i.m842x();
        Object[] objArr = c1483eM842x.f5181d;
        int i5 = c1483eM842x.f5183f;
        for (int i6 = 0; i6 < i5; i6++) {
            C0564I c0564i2 = (C0564I) objArr[i6];
            if (c0564i2.m799G() && !c0564i2.f1710U) {
                if (c0564i2.f1699J.m962d(8)) {
                    arrayList.add(AbstractC1131r.m2182a(c0564i2, this.f3709b));
                } else {
                    m2166c(c0564i2, arrayList);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final AbstractC0596h0 m2167d() {
        if (!this.f3712e) {
            InterfaceC0632z0 interfaceC0632z0M2169f = m2169f();
            return interfaceC0632z0M2169f != null ? AbstractC0601k.m1042r(interfaceC0632z0M2169f, 8) : this.f3710c.f1699J.f1893c;
        }
        C1128o c1128oM2174l = m2174l();
        if (c1128oM2174l != null) {
            return c1128oM2174l.m2167d();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m2168e(ArrayList arrayList, ArrayList arrayList2) {
        m2179q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            C1128o c1128o = (C1128o) arrayList.get(size2);
            if (c1128o.m2176n()) {
                arrayList2.add(c1128o);
            } else if (!c1128o.f3711d.f3705g) {
                c1128o.m2168e(arrayList, arrayList2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:103:0x00dc */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:105:0x0096 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:107:0x0096 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:110:0x00d6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:34:0x0062 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:70:0x00cd */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:85:0x0076 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:88:0x0071 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:90:0x0022 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:92:0x0022 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:95:0x006b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:98:0x00ea */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:99:0x007f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3, types: [V.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [V.e] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [V.e] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX INFO: renamed from: f */
    public final InterfaceC0632z0 m2169f() {
        ?? M1029e;
        boolean z5 = this.f3711d.f3704f;
        C0564I c0564i = this.f3710c;
        ?? r5 = 0;
        r5 = 0;
        r5 = 0;
        r5 = 0;
        if (z5) {
            AbstractC2206o abstractC2206o = c0564i.f1699J.f1896f;
            if ((abstractC2206o.f7189g & 8) != 0) {
                M1029e = 0;
                while (abstractC2206o != null) {
                    if ((abstractC2206o.f7188f & 8) != 0) {
                        ?? M1029e2 = abstractC2206o;
                        ?? c1483e = 0;
                        while (M1029e2 != 0) {
                            if (M1029e2 instanceof InterfaceC0632z0) {
                                InterfaceC0632z0 interfaceC0632z0 = (InterfaceC0632z0) M1029e2;
                                if (interfaceC0632z0.mo1083f()) {
                                    if (interfaceC0632z0.mo1085j0()) {
                                        return interfaceC0632z0;
                                    }
                                    if (M1029e == 0) {
                                        M1029e = interfaceC0632z0;
                                    }
                                }
                            } else if ((M1029e2.f7188f & 8) != 0 && (M1029e2 instanceof AbstractC0599j)) {
                                AbstractC2206o abstractC2206o2 = ((AbstractC0599j) M1029e2).f1943s;
                                int i5 = 0;
                                M1029e2 = M1029e2;
                                c1483e = c1483e;
                                while (abstractC2206o2 != null) {
                                    if ((abstractC2206o2.f7188f & 8) != 0) {
                                        i5++;
                                        c1483e = c1483e;
                                        if (i5 == 1) {
                                            M1029e2 = abstractC2206o2;
                                        } else {
                                            if (c1483e == 0) {
                                                c1483e = new C1483e(new AbstractC2206o[16]);
                                            }
                                            if (M1029e2 != 0) {
                                                c1483e.m2753b(M1029e2);
                                                M1029e2 = 0;
                                            }
                                            c1483e.m2753b(abstractC2206o2);
                                        }
                                    }
                                    abstractC2206o2 = abstractC2206o2.f7191i;
                                    M1029e2 = M1029e2;
                                    c1483e = c1483e;
                                }
                                if (i5 == 1) {
                                }
                            }
                            M1029e2 = AbstractC0601k.m1029e(c1483e);
                        }
                    }
                    if ((abstractC2206o.f7189g & 8) == 0) {
                        break;
                    }
                    abstractC2206o = abstractC2206o.f7191i;
                    M1029e = M1029e;
                }
                r5 = M1029e;
            }
        } else {
            AbstractC2206o abstractC2206o3 = c0564i.f1699J.f1896f;
            if ((abstractC2206o3.f7189g & 8) != 0) {
                loop3: while (abstractC2206o3 != null) {
                    if ((abstractC2206o3.f7188f & 8) != 0) {
                        M1029e = abstractC2206o3;
                        ?? c1483e2 = 0;
                        while (M1029e != 0) {
                            if (M1029e instanceof InterfaceC0632z0) {
                                if (((InterfaceC0632z0) M1029e).mo1083f()) {
                                    r5 = M1029e;
                                }
                            } else if ((M1029e.f7188f & 8) != 0 && (M1029e instanceof AbstractC0599j)) {
                                AbstractC2206o abstractC2206o4 = ((AbstractC0599j) M1029e).f1943s;
                                int i6 = 0;
                                M1029e = M1029e;
                                c1483e2 = c1483e2;
                                while (abstractC2206o4 != null) {
                                    if ((abstractC2206o4.f7188f & 8) != 0) {
                                        i6++;
                                        c1483e2 = c1483e2;
                                        if (i6 == 1) {
                                            M1029e = abstractC2206o4;
                                        } else {
                                            if (c1483e2 == 0) {
                                                c1483e2 = new C1483e(new AbstractC2206o[16]);
                                            }
                                            if (M1029e != 0) {
                                                c1483e2.m2753b(M1029e);
                                                M1029e = 0;
                                            }
                                            c1483e2.m2753b(abstractC2206o4);
                                        }
                                    }
                                    abstractC2206o4 = abstractC2206o4.f7191i;
                                    M1029e = M1029e;
                                    c1483e2 = c1483e2;
                                }
                                if (i6 == 1) {
                                }
                            }
                            M1029e = AbstractC0601k.m1029e(c1483e2);
                        }
                    }
                    if ((abstractC2206o3.f7189g & 8) == 0) {
                        break;
                    }
                    abstractC2206o3 = abstractC2206o3.f7191i;
                }
            }
        }
        return (InterfaceC0632z0) r5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final C2684c m2170g() {
        AbstractC0596h0 abstractC0596h0M2167d = m2167d();
        if (abstractC0596h0M2167d != null) {
            if (!abstractC0596h0M2167d.mo981R0().f7199q) {
                abstractC0596h0M2167d = null;
            }
            if (abstractC0596h0M2167d != null) {
                return AbstractC0435z.m693f(abstractC0596h0M2167d).mo634K(abstractC0596h0M2167d, true);
            }
        }
        return C2684c.f8557e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final C2684c m2171h() {
        AbstractC0596h0 abstractC0596h0M2167d = m2167d();
        if (abstractC0596h0M2167d != null) {
            if (!abstractC0596h0M2167d.mo981R0().f7199q) {
                abstractC0596h0M2167d = null;
            }
            if (abstractC0596h0M2167d != null) {
                return AbstractC0435z.m691d(abstractC0596h0M2167d, true);
            }
        }
        return C2684c.f8557e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final List m2172i(boolean z5, boolean z6) {
        if (!z5 && this.f3711d.f3705g) {
            return C0981u.f3047d;
        }
        ArrayList arrayList = new ArrayList();
        if (!m2176n()) {
            return m2179q(arrayList, z6);
        }
        ArrayList arrayList2 = new ArrayList();
        m2168e(arrayList, arrayList2);
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final C1125l m2173k() {
        boolean zM2176n = m2176n();
        C1125l c1125l = this.f3711d;
        if (!zM2176n) {
            return c1125l;
        }
        C1125l c1125lM2159b = c1125l.m2159b();
        m2178p(new ArrayList(), c1125lM2159b);
        return c1125lM2159b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final C1128o m2174l() {
        C0564I c0564iM839u;
        C1128o c1128o = this.f3713f;
        if (c1128o != null) {
            return c1128o;
        }
        C0564I c0564i = this.f3710c;
        boolean z5 = this.f3709b;
        if (z5) {
            c0564iM839u = c0564i.m839u();
            while (c0564iM839u != null) {
                C1125l c1125lM841w = c0564iM839u.m841w();
                if (c1125lM841w != null && c1125lM841w.f3704f) {
                    break;
                }
                c0564iM839u = c0564iM839u.m839u();
            }
            c0564iM839u = null;
        } else {
            c0564iM839u = null;
        }
        if (c0564iM839u == null) {
            C0564I c0564iM839u2 = c0564i.m839u();
            while (true) {
                if (c0564iM839u2 == null) {
                    c0564iM839u = null;
                    break;
                }
                if (c0564iM839u2.f1699J.m962d(8)) {
                    c0564iM839u = c0564iM839u2;
                    break;
                }
                c0564iM839u2 = c0564iM839u2.m839u();
            }
        }
        if (c0564iM839u == null) {
            return null;
        }
        return AbstractC1131r.m2182a(c0564iM839u, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final C1125l m2175m() {
        return this.f3711d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final boolean m2176n() {
        return this.f3709b && this.f3711d.f3704f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final boolean m2177o() {
        if (this.f3712e || !m2163j(4, this).isEmpty()) {
            return false;
        }
        C0564I c0564iM839u = this.f3710c.m839u();
        while (true) {
            if (c0564iM839u == null) {
                c0564iM839u = null;
                break;
            }
            C1125l c1125lM841w = c0564iM839u.m841w();
            if (c1125lM841w != null && c1125lM841w.f3704f) {
                break;
            }
            c0564iM839u = c0564iM839u.m839u();
        }
        return c0564iM839u == null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m2178p(ArrayList arrayList, C1125l c1125l) {
        if (this.f3711d.f3705g) {
            return;
        }
        m2179q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            C1128o c1128o = (C1128o) arrayList.get(size2);
            if (!c1128o.m2176n()) {
                c1125l.m2161d(c1128o.f3711d);
                c1128o.m2178p(arrayList, c1125l);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final List m2179q(ArrayList arrayList, boolean z5) {
        if (this.f3712e) {
            return C0981u.f3047d;
        }
        m2166c(this.f3710c, arrayList);
        if (z5) {
            C1125l c1125l = this.f3711d;
            C2408E c2408e = c1125l.f3702d;
            Object objM4272g = c2408e.m4272g(AbstractC1132s.f3762y);
            if (objM4272g == null) {
                objM4272g = null;
            }
            C1121h c1121h = (C1121h) objM4272g;
            if (c1121h != null && c1125l.f3704f && !arrayList.isEmpty()) {
                arrayList.add(m2165b(c1121h, new C0172E(13, c1121h)));
            }
            C1135v c1135v = AbstractC1132s.f3738a;
            if (c2408e.m4268c(c1135v) && !arrayList.isEmpty() && c1125l.f3704f) {
                Object objM4272g2 = c2408e.m4272g(c1135v);
                if (objM4272g2 == null) {
                    objM4272g2 = null;
                }
                List list = (List) objM4272g2;
                String str = list != null ? (String) AbstractC0973m.m2013T(list) : null;
                if (str != null) {
                    arrayList.add(0, m2165b(null, new C0172E(14, str)));
                }
            }
        }
        return arrayList;
    }
}
