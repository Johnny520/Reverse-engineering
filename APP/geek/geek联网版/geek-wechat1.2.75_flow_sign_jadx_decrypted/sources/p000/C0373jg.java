package p000;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: jg */
/* JADX INFO: loaded from: classes.dex */
public final class C0373jg {

    /* JADX INFO: renamed from: a */
    public C0962zc f2714a;

    /* JADX INFO: renamed from: b */
    public boolean f2715b;

    /* JADX INFO: renamed from: c */
    public boolean f2716c;

    /* JADX INFO: renamed from: d */
    public C0962zc f2717d;

    /* JADX INFO: renamed from: e */
    public ArrayList f2718e;

    /* JADX INFO: renamed from: f */
    public C0628qc f2719f;

    /* JADX INFO: renamed from: g */
    public C0771u7 f2720g;

    /* JADX INFO: renamed from: h */
    public ArrayList f2721h;

    /* JADX INFO: renamed from: a */
    public final void m1604a(C0410kg c0410kg, int i, ArrayList arrayList, q10 q10Var) {
        vb0 vb0Var = c0410kg.f2830d;
        q10 q10Var2 = vb0Var.f4928c;
        C0410kg c0410kg2 = vb0Var.f4934i;
        C0410kg c0410kg3 = vb0Var.f4933h;
        if (q10Var2 == null) {
            C0962zc c0962zc = this.f2714a;
            if (vb0Var == c0962zc.f5403d || vb0Var == c0962zc.f5404e) {
                return;
            }
            if (q10Var == null) {
                q10Var = new q10();
                q10Var.f3768a = null;
                q10Var.f3769b = new ArrayList();
                q10Var.f3768a = vb0Var;
                arrayList.add(q10Var);
            }
            vb0Var.f4928c = q10Var;
            q10Var.f3769b.add(vb0Var);
            ArrayList arrayList2 = c0410kg3.f2837k;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                InterfaceC0333ig interfaceC0333ig = (InterfaceC0333ig) obj;
                if (interfaceC0333ig instanceof C0410kg) {
                    m1604a((C0410kg) interfaceC0333ig, i, arrayList, q10Var);
                }
            }
            ArrayList arrayList3 = c0410kg2.f2837k;
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                InterfaceC0333ig interfaceC0333ig2 = (InterfaceC0333ig) obj2;
                if (interfaceC0333ig2 instanceof C0410kg) {
                    m1604a((C0410kg) interfaceC0333ig2, i, arrayList, q10Var);
                }
            }
            if (i == 1 && (vb0Var instanceof r90)) {
                ArrayList arrayList4 = ((r90) vb0Var).f4087k.f2837k;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = arrayList4.get(i5);
                    i5++;
                    InterfaceC0333ig interfaceC0333ig3 = (InterfaceC0333ig) obj3;
                    if (interfaceC0333ig3 instanceof C0410kg) {
                        m1604a((C0410kg) interfaceC0333ig3, i, arrayList, q10Var);
                    }
                }
            }
            ArrayList arrayList5 = c0410kg3.f2838l;
            int size4 = arrayList5.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                m1604a((C0410kg) obj4, i, arrayList, q10Var);
            }
            ArrayList arrayList6 = c0410kg2.f2838l;
            int size5 = arrayList6.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList6.get(i7);
                i7++;
                m1604a((C0410kg) obj5, i, arrayList, q10Var);
            }
            if (i == 1 && (vb0Var instanceof r90)) {
                ArrayList arrayList7 = ((r90) vb0Var).f4087k.f2838l;
                int size6 = arrayList7.size();
                while (i2 < size6) {
                    Object obj6 = arrayList7.get(i2);
                    i2++;
                    m1604a((C0410kg) obj6, i, arrayList, q10Var);
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
    public final void m1605b(p000.C0962zc r27) {
        /*
            Method dump skipped, instruction units count: 785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0373jg.m1605b(zc):void");
    }

    /* JADX INFO: renamed from: c */
    public final void m1606c() {
        C0962zc c0962zc = this.f2714a;
        ArrayList arrayList = this.f2721h;
        ArrayList arrayList2 = this.f2718e;
        arrayList2.clear();
        C0962zc c0962zc2 = this.f2717d;
        c0962zc2.f5403d.mo1215f();
        r90 r90Var = c0962zc2.f5404e;
        r90Var.mo1215f();
        arrayList2.add(c0962zc2.f5403d);
        arrayList2.add(r90Var);
        ArrayList arrayList3 = c0962zc2.f5565d0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            C0925yc c0925yc = (C0925yc) obj;
            if (c0925yc instanceof C0418ko) {
                C0455lo c0455lo = new C0455lo(c0925yc);
                c0925yc.f5403d.mo1215f();
                c0925yc.f5404e.mo1215f();
                c0455lo.f4931f = ((C0418ko) c0925yc).f2865h0;
                arrayList2.add(c0455lo);
            } else {
                if (c0925yc.m2754q()) {
                    if (c0925yc.f5399b == null) {
                        c0925yc.f5399b = new C0253g9(c0925yc, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0925yc.f5399b);
                } else {
                    arrayList2.add(c0925yc.f5403d);
                }
                if (c0925yc.m2755r()) {
                    if (c0925yc.f5401c == null) {
                        c0925yc.f5401c = new C0253g9(c0925yc, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0925yc.f5401c);
                } else {
                    arrayList2.add(c0925yc.f5404e);
                }
                if (c0925yc instanceof AbstractC0714so) {
                    arrayList2.add(new C0677ro(c0925yc));
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
            ((vb0) obj2).mo1215f();
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            vb0 vb0Var = (vb0) obj3;
            if (vb0Var.f4927b != c0962zc2) {
                vb0Var.mo1213d();
            }
        }
        arrayList.clear();
        m1608e(c0962zc.f5403d, 0, arrayList);
        m1608e(c0962zc.f5404e, 1, arrayList);
        this.f2715b = false;
    }

    /* JADX INFO: renamed from: d */
    public final int m1607d(C0962zc c0962zc, int i) {
        ArrayList arrayList;
        int i2;
        long jMax;
        float f;
        C0962zc c0962zc2 = c0962zc;
        ArrayList arrayList2 = this.f2721h;
        int size = arrayList2.size();
        long j = 0;
        int i3 = 0;
        long jMax2 = 0;
        while (i3 < size) {
            vb0 vb0Var = ((q10) arrayList2.get(i3)).f3768a;
            if (!(vb0Var instanceof C0253g9) ? !(i != 0 ? (vb0Var instanceof r90) : (vb0Var instanceof C0751to)) : ((C0253g9) vb0Var).f4931f != i) {
                C0410kg c0410kg = (i == 0 ? c0962zc2.f5403d : c0962zc2.f5404e).f4933h;
                C0410kg c0410kg2 = (i == 0 ? c0962zc2.f5403d : c0962zc2.f5404e).f4934i;
                C0410kg c0410kg3 = vb0Var.f4933h;
                C0410kg c0410kg4 = vb0Var.f4934i;
                boolean zContains = c0410kg3.f2838l.contains(c0410kg);
                boolean zContains2 = c0410kg4.f2838l.contains(c0410kg2);
                long jMo1216j = vb0Var.mo1216j();
                if (zContains && zContains2) {
                    long jM2107b = q10.m2107b(c0410kg3, j);
                    long jM2106a = q10.m2106a(c0410kg4, j);
                    long j2 = jM2107b - jMo1216j;
                    int i4 = c0410kg4.f2832f;
                    arrayList = arrayList2;
                    i2 = size;
                    if (j2 >= (-i4)) {
                        j2 += (long) i4;
                    }
                    long j3 = c0410kg3.f2832f;
                    long j4 = ((-jM2106a) - jMo1216j) - j3;
                    if (j4 >= j3) {
                        j4 -= j3;
                    }
                    C0925yc c0925yc = vb0Var.f4927b;
                    if (i == 0) {
                        f = c0925yc.f5389S;
                    } else if (i == 1) {
                        f = c0925yc.f5390T;
                    } else {
                        c0925yc.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j2 / (1.0f - f)) + (j4 / f)) : 0L;
                    jMax = (((long) c0410kg3.f2832f) + ((((long) ((f2 * f) + 0.5f)) + jMo1216j) + ((long) (((1.0f - f) * f2) + 0.5f)))) - ((long) c0410kg4.f2832f);
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    jMax = zContains ? Math.max(q10.m2107b(c0410kg3, c0410kg3.f2832f), ((long) c0410kg3.f2832f) + jMo1216j) : zContains2 ? Math.max(-q10.m2106a(c0410kg4, c0410kg4.f2832f), ((long) (-c0410kg4.f2832f)) + jMo1216j) : (vb0Var.mo1216j() + ((long) c0410kg3.f2832f)) - ((long) c0410kg4.f2832f);
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                jMax = j;
            }
            jMax2 = Math.max(jMax2, jMax);
            i3++;
            c0962zc2 = c0962zc;
            arrayList2 = arrayList;
            size = i2;
            j = 0;
        }
        return (int) jMax2;
    }

    /* JADX INFO: renamed from: e */
    public final void m1608e(vb0 vb0Var, int i, ArrayList arrayList) {
        C0410kg c0410kg = vb0Var.f4933h;
        C0410kg c0410kg2 = vb0Var.f4934i;
        ArrayList arrayList2 = c0410kg.f2837k;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            InterfaceC0333ig interfaceC0333ig = (InterfaceC0333ig) obj;
            if (interfaceC0333ig instanceof C0410kg) {
                m1604a((C0410kg) interfaceC0333ig, i, arrayList, null);
            } else if (interfaceC0333ig instanceof vb0) {
                m1604a(((vb0) interfaceC0333ig).f4933h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = c0410kg2.f2837k;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            InterfaceC0333ig interfaceC0333ig2 = (InterfaceC0333ig) obj2;
            if (interfaceC0333ig2 instanceof C0410kg) {
                m1604a((C0410kg) interfaceC0333ig2, i, arrayList, null);
            } else if (interfaceC0333ig2 instanceof vb0) {
                m1604a(((vb0) interfaceC0333ig2).f4934i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((r90) vb0Var).f4087k.f2837k;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                InterfaceC0333ig interfaceC0333ig3 = (InterfaceC0333ig) obj3;
                if (interfaceC0333ig3 instanceof C0410kg) {
                    m1604a((C0410kg) interfaceC0333ig3, i, arrayList, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1609f(int i, int i2, int i3, int i4, C0925yc c0925yc) {
        C0771u7 c0771u7 = this.f2720g;
        c0771u7.f4651a = i;
        c0771u7.f4652b = i3;
        c0771u7.f4653c = i2;
        c0771u7.f4654d = i4;
        this.f2719f.m2145a(c0925yc, c0771u7);
        c0925yc.m2762y(c0771u7.f4655e);
        c0925yc.m2759v(c0771u7.f4656f);
        c0925yc.f5422w = c0771u7.f4658h;
        int i5 = c0771u7.f4657g;
        c0925yc.f5386P = i5;
        c0925yc.f5422w = i5 > 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m1610g() {
        C0734t7 c0734t7;
        C0373jg c0373jg = this;
        ArrayList arrayList = c0373jg.f2714a.f5565d0;
        int size = arrayList.size();
        char c = 0;
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            C0925yc c0925yc = (C0925yc) arrayList.get(i);
            boolean z = c0925yc.f5397a;
            C0751to c0751to = c0925yc.f5403d;
            r90 r90Var = c0925yc.f5404e;
            if (!z) {
                int[] iArr = c0925yc.f5402c0;
                int i3 = iArr[c];
                int i4 = iArr[1];
                int i5 = c0925yc.f5409j;
                int i6 = c0925yc.f5410k;
                char c2 = (i3 == 2 || (i3 == 3 && i5 == 1)) ? (char) 1 : c;
                char c3 = (i4 == 2 || (i4 == 3 && i6 == 1)) ? (char) 1 : c;
                C0780ug c0780ug = c0751to.f4930e;
                C0780ug c0780ug2 = c0751to.f4930e;
                boolean z2 = c0780ug.f2836j;
                C0780ug c0780ug3 = r90Var.f4930e;
                C0780ug c0780ug4 = r90Var.f4930e;
                boolean z3 = c0780ug3.f2836j;
                char c4 = c2;
                if (z2 && z3) {
                    c0373jg.m1609f(1, c0780ug.f2833g, 1, c0780ug3.f2833g, c0925yc);
                    c0925yc.f5397a = true;
                } else if (z2 && c3 != 0) {
                    m1609f(1, c0780ug.f2833g, 2, c0780ug3.f2833g, c0925yc);
                    if (i4 == 3) {
                        c0780ug4.f4826m = c0925yc.m2746i();
                    } else {
                        c0780ug4.mo1684d(c0925yc.m2746i());
                        c0925yc.f5397a = true;
                    }
                } else if (z3 && c4 != 0) {
                    m1609f(2, c0780ug.f2833g, 1, c0780ug3.f2833g, c0925yc);
                    if (i3 == 3) {
                        c0780ug2.f4826m = c0925yc.m2749l();
                    } else {
                        c0780ug2.mo1684d(c0925yc.m2749l());
                        c0925yc.f5397a = true;
                    }
                }
                if (c0925yc.f5397a && (c0734t7 = r90Var.f4088l) != null) {
                    c0734t7.mo1684d(c0925yc.f5386P);
                }
                c = 0;
                c0373jg = this;
            }
            i = i2;
        }
    }
}
