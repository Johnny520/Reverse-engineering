package p000;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: ig */
/* JADX INFO: loaded from: classes.dex */
public final class C0333ig {

    /* JADX INFO: renamed from: a */
    public C0629qc f2423a;

    /* JADX INFO: renamed from: b */
    public boolean f2424b;

    /* JADX INFO: renamed from: c */
    public boolean f2425c;

    /* JADX INFO: renamed from: d */
    public C0629qc f2426d;

    /* JADX INFO: renamed from: e */
    public ArrayList f2427e;

    /* JADX INFO: renamed from: f */
    public C0293hc f2428f;

    /* JADX INFO: renamed from: g */
    public C0401k7 f2429g;

    /* JADX INFO: renamed from: h */
    public ArrayList f2430h;

    /* JADX INFO: renamed from: a */
    public final void m1436a(C0373jg c0373jg, int i, ArrayList arrayList, j10 j10Var) {
        qb0 qb0Var = c0373jg.f2624d;
        j10 j10Var2 = qb0Var.f4054c;
        C0373jg c0373jg2 = qb0Var.f4060i;
        C0373jg c0373jg3 = qb0Var.f4059h;
        if (j10Var2 == null) {
            C0629qc c0629qc = this.f2423a;
            if (qb0Var == c0629qc.f3856d || qb0Var == c0629qc.f3857e) {
                return;
            }
            if (j10Var == null) {
                j10Var = new j10();
                j10Var.f2539a = null;
                j10Var.f2540b = new ArrayList();
                j10Var.f2539a = qb0Var;
                arrayList.add(j10Var);
            }
            qb0Var.f4054c = j10Var;
            j10Var.f2540b.add(qb0Var);
            ArrayList arrayList2 = c0373jg3.f2631k;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                InterfaceC0297hg interfaceC0297hg = (InterfaceC0297hg) obj;
                if (interfaceC0297hg instanceof C0373jg) {
                    m1436a((C0373jg) interfaceC0297hg, i, arrayList, j10Var);
                }
            }
            ArrayList arrayList3 = c0373jg2.f2631k;
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                InterfaceC0297hg interfaceC0297hg2 = (InterfaceC0297hg) obj2;
                if (interfaceC0297hg2 instanceof C0373jg) {
                    m1436a((C0373jg) interfaceC0297hg2, i, arrayList, j10Var);
                }
            }
            if (i == 1 && (qb0Var instanceof m90)) {
                ArrayList arrayList4 = ((m90) qb0Var).f3159k.f2631k;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = arrayList4.get(i5);
                    i5++;
                    InterfaceC0297hg interfaceC0297hg3 = (InterfaceC0297hg) obj3;
                    if (interfaceC0297hg3 instanceof C0373jg) {
                        m1436a((C0373jg) interfaceC0297hg3, i, arrayList, j10Var);
                    }
                }
            }
            ArrayList arrayList5 = c0373jg3.f2632l;
            int size4 = arrayList5.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                m1436a((C0373jg) obj4, i, arrayList, j10Var);
            }
            ArrayList arrayList6 = c0373jg2.f2632l;
            int size5 = arrayList6.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList6.get(i7);
                i7++;
                m1436a((C0373jg) obj5, i, arrayList, j10Var);
            }
            if (i == 1 && (qb0Var instanceof m90)) {
                ArrayList arrayList7 = ((m90) qb0Var).f3159k.f2632l;
                int size6 = arrayList7.size();
                while (i2 < size6) {
                    Object obj6 = arrayList7.get(i2);
                    i2++;
                    m1436a((C0373jg) obj6, i, arrayList, j10Var);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d4, code lost:
    
        if (r6 == 2) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x026a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cd  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1437b(p000.C0629qc r27) {
        /*
            Method dump skipped, instruction units count: 785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0333ig.m1437b(qc):void");
    }

    /* JADX INFO: renamed from: c */
    public final void m1438c() {
        C0629qc c0629qc = this.f2423a;
        ArrayList arrayList = this.f2430h;
        ArrayList arrayList2 = this.f2427e;
        arrayList2.clear();
        C0629qc c0629qc2 = this.f2426d;
        c0629qc2.f3856d.mo1365f();
        m90 m90Var = c0629qc2.f3857e;
        m90Var.mo1365f();
        arrayList2.add(c0629qc2.f3856d);
        arrayList2.add(m90Var);
        ArrayList arrayList3 = c0629qc2.f4062d0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            C0592pc c0592pc = (C0592pc) obj;
            if (c0592pc instanceof C0268go) {
                C0305ho c0305ho = new C0305ho(c0592pc);
                c0592pc.f3856d.mo1365f();
                c0592pc.f3857e.mo1365f();
                c0305ho.f4057f = ((C0268go) c0592pc).f2161h0;
                arrayList2.add(c0305ho);
            } else {
                if (c0592pc.m2105q()) {
                    if (c0592pc.f3852b == null) {
                        c0592pc.f3852b = new C0810v8(c0592pc, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0592pc.f3852b);
                } else {
                    arrayList2.add(c0592pc.f3856d);
                }
                if (c0592pc.m2106r()) {
                    if (c0592pc.f3854c == null) {
                        c0592pc.f3854c = new C0810v8(c0592pc, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0592pc.f3854c);
                } else {
                    arrayList2.add(c0592pc.f3857e);
                }
                if (c0592pc instanceof AbstractC0566oo) {
                    arrayList2.add(new C0529no(c0592pc));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            ((qb0) obj2).mo1365f();
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            qb0 qb0Var = (qb0) obj3;
            if (qb0Var.f4053b != c0629qc2) {
                qb0Var.mo1363d();
            }
        }
        arrayList.clear();
        m1440e(c0629qc.f3856d, 0, arrayList);
        m1440e(c0629qc.f3857e, 1, arrayList);
        this.f2424b = false;
    }

    /* JADX INFO: renamed from: d */
    public final int m1439d(C0629qc c0629qc, int i) {
        ArrayList arrayList;
        int i2;
        long jMax;
        float f;
        C0629qc c0629qc2 = c0629qc;
        ArrayList arrayList2 = this.f2430h;
        int size = arrayList2.size();
        long j = 0;
        int i3 = 0;
        long jMax2 = 0;
        while (i3 < size) {
            qb0 qb0Var = ((j10) arrayList2.get(i3)).f2539a;
            if (!(qb0Var instanceof C0810v8) ? !(i != 0 ? (qb0Var instanceof m90) : (qb0Var instanceof C0604po)) : ((C0810v8) qb0Var).f4057f != i) {
                C0373jg c0373jg = (i == 0 ? c0629qc2.f3856d : c0629qc2.f3857e).f4059h;
                C0373jg c0373jg2 = (i == 0 ? c0629qc2.f3856d : c0629qc2.f3857e).f4060i;
                C0373jg c0373jg3 = qb0Var.f4059h;
                C0373jg c0373jg4 = qb0Var.f4060i;
                boolean zContains = c0373jg3.f2632l.contains(c0373jg);
                boolean zContains2 = c0373jg4.f2632l.contains(c0373jg2);
                long jMo2163j = qb0Var.mo2163j();
                if (zContains && zContains2) {
                    long jM1544b = j10.m1544b(c0373jg3, j);
                    long jM1543a = j10.m1543a(c0373jg4, j);
                    long j2 = jM1544b - jMo2163j;
                    int i4 = c0373jg4.f2626f;
                    arrayList = arrayList2;
                    i2 = size;
                    if (j2 >= (-i4)) {
                        j2 += (long) i4;
                    }
                    long j3 = c0373jg3.f2626f;
                    long j4 = ((-jM1543a) - jMo2163j) - j3;
                    if (j4 >= j3) {
                        j4 -= j3;
                    }
                    C0592pc c0592pc = qb0Var.f4053b;
                    if (i == 0) {
                        f = c0592pc.f3842S;
                    } else if (i == 1) {
                        f = c0592pc.f3843T;
                    } else {
                        c0592pc.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j2 / (1.0f - f)) + (j4 / f)) : 0L;
                    jMax = (((long) c0373jg3.f2626f) + ((((long) ((f2 * f) + 0.5f)) + jMo2163j) + ((long) (((1.0f - f) * f2) + 0.5f)))) - ((long) c0373jg4.f2626f);
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    jMax = zContains ? Math.max(j10.m1544b(c0373jg3, c0373jg3.f2626f), ((long) c0373jg3.f2626f) + jMo2163j) : zContains2 ? Math.max(-j10.m1543a(c0373jg4, c0373jg4.f2626f), ((long) (-c0373jg4.f2626f)) + jMo2163j) : (qb0Var.mo2163j() + ((long) c0373jg3.f2626f)) - ((long) c0373jg4.f2626f);
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                jMax = j;
            }
            jMax2 = Math.max(jMax2, jMax);
            i3++;
            c0629qc2 = c0629qc;
            arrayList2 = arrayList;
            size = i2;
            j = 0;
        }
        return (int) jMax2;
    }

    /* JADX INFO: renamed from: e */
    public final void m1440e(qb0 qb0Var, int i, ArrayList arrayList) {
        C0373jg c0373jg = qb0Var.f4059h;
        C0373jg c0373jg2 = qb0Var.f4060i;
        ArrayList arrayList2 = c0373jg.f2631k;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            InterfaceC0297hg interfaceC0297hg = (InterfaceC0297hg) obj;
            if (interfaceC0297hg instanceof C0373jg) {
                m1436a((C0373jg) interfaceC0297hg, i, arrayList, null);
            } else if (interfaceC0297hg instanceof qb0) {
                m1436a(((qb0) interfaceC0297hg).f4059h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = c0373jg2.f2631k;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            InterfaceC0297hg interfaceC0297hg2 = (InterfaceC0297hg) obj2;
            if (interfaceC0297hg2 instanceof C0373jg) {
                m1436a((C0373jg) interfaceC0297hg2, i, arrayList, null);
            } else if (interfaceC0297hg2 instanceof qb0) {
                m1436a(((qb0) interfaceC0297hg2).f4060i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((m90) qb0Var).f3159k.f2631k;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                InterfaceC0297hg interfaceC0297hg3 = (InterfaceC0297hg) obj3;
                if (interfaceC0297hg3 instanceof C0373jg) {
                    m1436a((C0373jg) interfaceC0297hg3, i, arrayList, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1441f(int i, int i2, int i3, int i4, C0592pc c0592pc) {
        C0401k7 c0401k7 = this.f2429g;
        c0401k7.f2707a = i;
        c0401k7.f2708b = i3;
        c0401k7.f2709c = i2;
        c0401k7.f2710d = i4;
        this.f2428f.m1353a(c0592pc, c0401k7);
        c0592pc.m2113y(c0401k7.f2711e);
        c0592pc.m2110v(c0401k7.f2712f);
        c0592pc.f3875w = c0401k7.f2714h;
        int i5 = c0401k7.f2713g;
        c0592pc.f3839P = i5;
        c0592pc.f3875w = i5 > 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m1442g() {
        C0364j7 c0364j7;
        C0333ig c0333ig = this;
        ArrayList arrayList = c0333ig.f2423a.f4062d0;
        int size = arrayList.size();
        char c = 0;
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            C0592pc c0592pc = (C0592pc) arrayList.get(i);
            boolean z = c0592pc.f3850a;
            C0604po c0604po = c0592pc.f3856d;
            m90 m90Var = c0592pc.f3857e;
            if (!z) {
                int[] iArr = c0592pc.f3855c0;
                int i3 = iArr[c];
                int i4 = iArr[1];
                int i5 = c0592pc.f3862j;
                int i6 = c0592pc.f3863k;
                char c2 = (i3 == 2 || (i3 == 3 && i5 == 1)) ? (char) 1 : c;
                char c3 = (i4 == 2 || (i4 == 3 && i6 == 1)) ? (char) 1 : c;
                C0707sg c0707sg = c0604po.f4056e;
                C0707sg c0707sg2 = c0604po.f4056e;
                boolean z2 = c0707sg.f2630j;
                C0707sg c0707sg3 = m90Var.f4056e;
                C0707sg c0707sg4 = m90Var.f4056e;
                boolean z3 = c0707sg3.f2630j;
                char c4 = c2;
                if (z2 && z3) {
                    c0333ig.m1441f(1, c0707sg.f2627g, 1, c0707sg3.f2627g, c0592pc);
                    c0592pc.f3850a = true;
                } else if (z2 && c3 != 0) {
                    m1441f(1, c0707sg.f2627g, 2, c0707sg3.f2627g, c0592pc);
                    if (i4 == 3) {
                        c0707sg4.f4436m = c0592pc.m2097i();
                    } else {
                        c0707sg4.mo1597d(c0592pc.m2097i());
                        c0592pc.f3850a = true;
                    }
                } else if (z3 && c4 != 0) {
                    m1441f(2, c0707sg.f2627g, 1, c0707sg3.f2627g, c0592pc);
                    if (i3 == 3) {
                        c0707sg2.f4436m = c0592pc.m2100l();
                    } else {
                        c0707sg2.mo1597d(c0592pc.m2100l());
                        c0592pc.f3850a = true;
                    }
                }
                if (c0592pc.f3850a && (c0364j7 = m90Var.f3160l) != null) {
                    c0364j7.mo1597d(c0592pc.f3839P);
                }
                c = 0;
                c0333ig = this;
            }
            i = i2;
        }
    }
}
