package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: ud */
/* JADX INFO: loaded from: classes.dex */
public final class C2585ud {

    /* JADX INFO: renamed from: a */
    public C2497sb f8947a;

    /* JADX INFO: renamed from: b */
    public boolean f8948b;

    /* JADX INFO: renamed from: c */
    public boolean f8949c;

    /* JADX INFO: renamed from: d */
    public C2497sb f8950d;

    /* JADX INFO: renamed from: e */
    public ArrayList f8951e;

    /* JADX INFO: renamed from: f */
    public C1496hb f8952f;

    /* JADX INFO: renamed from: g */
    public C0178E5 f8953g;

    /* JADX INFO: renamed from: h */
    public ArrayList f8954h;

    /* JADX INFO: renamed from: a */
    public final void m5087a(C2628vd c2628vd, int i, ArrayList arrayList, C0769Rw c0769Rw) {
        AbstractC1449gF abstractC1449gF = c2628vd.f9113d;
        C0769Rw c0769Rw2 = abstractC1449gF.f5059c;
        C2628vd c2628vd2 = abstractC1449gF.f5065i;
        C2628vd c2628vd3 = abstractC1449gF.f5064h;
        if (c0769Rw2 == null) {
            C2497sb c2497sb = this.f8947a;
            if (abstractC1449gF == c2497sb.f8612d || abstractC1449gF == c2497sb.f8614e) {
                return;
            }
            if (c0769Rw == null) {
                c0769Rw = new C0769Rw();
                c0769Rw.f2441a = null;
                c0769Rw.f2442b = new ArrayList();
                c0769Rw.f2441a = abstractC1449gF;
                arrayList.add(c0769Rw);
            }
            abstractC1449gF.f5059c = c0769Rw;
            c0769Rw.f2442b.add(abstractC1449gF);
            for (InterfaceC2542td interfaceC2542td : c2628vd3.f9120k) {
                if (interfaceC2542td instanceof C2628vd) {
                    m5087a((C2628vd) interfaceC2542td, i, arrayList, c0769Rw);
                }
            }
            for (InterfaceC2542td interfaceC2542td2 : c2628vd2.f9120k) {
                if (interfaceC2542td2 instanceof C2628vd) {
                    m5087a((C2628vd) interfaceC2542td2, i, arrayList, c0769Rw);
                }
            }
            if (i == 1 && (abstractC1449gF instanceof C0830TD)) {
                for (InterfaceC2542td interfaceC2542td3 : ((C0830TD) abstractC1449gF).f2621k.f9120k) {
                    if (interfaceC2542td3 instanceof C2628vd) {
                        m5087a((C2628vd) interfaceC2542td3, i, arrayList, c0769Rw);
                    }
                }
            }
            Iterator it = c2628vd3.f9121l.iterator();
            while (it.hasNext()) {
                m5087a((C2628vd) it.next(), i, arrayList, c0769Rw);
            }
            Iterator it2 = c2628vd2.f9121l.iterator();
            while (it2.hasNext()) {
                m5087a((C2628vd) it2.next(), i, arrayList, c0769Rw);
            }
            if (i == 1 && (abstractC1449gF instanceof C0830TD)) {
                Iterator it3 = ((C0830TD) abstractC1449gF).f2621k.f9121l.iterator();
                while (it3.hasNext()) {
                    m5087a((C2628vd) it3.next(), i, arrayList, c0769Rw);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x028c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x019d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x000a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a2  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5088b(C2497sb c2497sb) {
        int i;
        int i2;
        int i3;
        int iM4933k;
        int i4;
        int i5;
        int i6;
        C2585ud c2585ud;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        ArrayList<C2454rb> arrayList = c2497sb.f8774q0;
        int[] iArr = c2497sb.f8637p0;
        for (C2454rb c2454rb : arrayList) {
            int[] iArr2 = c2454rb.f8637p0;
            C1259cb[] c1259cbArr = c2454rb.f8596Q;
            C1259cb c1259cb = c2454rb.f8591L;
            C1259cb c1259cb2 = c2454rb.f8589J;
            C1259cb c1259cb3 = c2454rb.f8590K;
            C1259cb c1259cb4 = c2454rb.f8588I;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            if (c2454rb.f8619g0 == 8) {
                c2454rb.f8606a = true;
            } else {
                float f = c2454rb.f8644w;
                if (f < 1.0f && i17 == 3) {
                    c2454rb.f8639r = 2;
                }
                float f2 = c2454rb.f8647z;
                if (f2 < 1.0f && i18 == 3) {
                    c2454rb.f8640s = 2;
                }
                if (c2454rb.f8602W > 0.0f) {
                    if (i17 == 3 && (i18 == 2 || i18 == 1)) {
                        c2454rb.f8639r = 3;
                    } else if (i18 == 3 && (i17 == 2 || i17 == 1)) {
                        c2454rb.f8640s = 3;
                    } else if (i17 == 3 && i18 == 3) {
                        if (c2454rb.f8639r == 0) {
                            c2454rb.f8639r = 3;
                        }
                        if (c2454rb.f8640s == 0) {
                            c2454rb.f8640s = 3;
                        }
                    }
                }
                if (i17 == 3 && c2454rb.f8639r == 1 && (c1259cb4.f4270f == null || c1259cb3.f4270f == null)) {
                    i17 = 2;
                }
                if (i18 == 3 && c2454rb.f8640s == 1 && (c1259cb2.f4270f == null || c1259cb.f4270f == null)) {
                    i18 = 2;
                }
                C0757Rk c0757Rk = c2454rb.f8612d;
                c0757Rk.f5060d = i17;
                int i19 = c2454rb.f8639r;
                c0757Rk.f5057a = i19;
                C0830TD c0830td = c2454rb.f8614e;
                c0830td.f5060d = i18;
                int i20 = c2454rb.f8640s;
                c0830td.f5057a = i20;
                if (i17 == 4 || i17 == 1) {
                    if (i18 != 4) {
                        if (i18 != 1) {
                            i7 = 2;
                            if (i18 != 2) {
                                if (i17 == 3) {
                                    i8 = i18;
                                    i9 = 1;
                                } else if (i18 != i7 && i18 != 1) {
                                    i8 = i18;
                                    i10 = 3;
                                    i9 = 1;
                                    if (i8 == i10) {
                                    }
                                    i15 = 3;
                                    if (i14 == i15) {
                                    }
                                } else if (i19 == 3) {
                                    if (i18 == i7) {
                                        m5092f(i7, 0, i7, 0, c2454rb);
                                    }
                                    int iM4933k2 = c2454rb.m4933k();
                                    m5092f(1, (int) ((iM4933k2 * c2454rb.f8602W) + 0.5f), 1, iM4933k2, c2454rb);
                                    c2454rb.f8612d.f5061e.mo1539d(c2454rb.m4937q());
                                    c2454rb.f8614e.f5061e.mo1539d(c2454rb.m4933k());
                                    c2454rb.f8606a = true;
                                } else {
                                    int i21 = i7;
                                    if (i19 == 1) {
                                        m5092f(i21, 0, i18, 0, c2454rb);
                                        c2454rb.f8612d.f5061e.f2386m = c2454rb.m4937q();
                                    } else {
                                        i7 = i21;
                                        if (i19 == 2) {
                                            int i22 = iArr[0];
                                            if (i22 == 1 || i22 == 4) {
                                                m5092f(1, (int) ((f * c2497sb.m4937q()) + 0.5f), i18, c2454rb.m4933k(), c2454rb);
                                                c2454rb.f8612d.f5061e.mo1539d(c2454rb.m4937q());
                                                c2454rb.f8614e.f5061e.mo1539d(c2454rb.m4933k());
                                                c2454rb.f8606a = true;
                                            } else {
                                                i9 = 1;
                                                i8 = i18;
                                            }
                                        } else {
                                            i9 = 1;
                                            i8 = i18;
                                            if (c1259cbArr[0].f4270f == null || c1259cbArr[1].f4270f == null) {
                                                m5092f(i7, 0, i8, 0, c2454rb);
                                                c2454rb.f8612d.f5061e.mo1539d(c2454rb.m4937q());
                                                c2454rb.f8614e.f5061e.mo1539d(c2454rb.m4933k());
                                                c2454rb.f8606a = true;
                                            }
                                        }
                                        if (i8 == i10) {
                                            i11 = i8;
                                            i12 = i7;
                                            i13 = 1;
                                            i14 = i17;
                                        } else if (i17 != i7 && i17 != i9) {
                                            i15 = i10;
                                            i11 = i8;
                                            i12 = i7;
                                            i13 = 1;
                                            i14 = i17;
                                            if (i14 == i15 && i11 == i15) {
                                                if (i19 == i13 || i20 == i13) {
                                                    m5092f(i12, 0, i12, 0, c2454rb);
                                                    c2454rb.f8612d.f5061e.f2386m = c2454rb.m4937q();
                                                    c2454rb.f8614e.f5061e.f2386m = c2454rb.m4933k();
                                                } else if (i20 == 2 && i19 == 2 && iArr[0] == i9 && iArr[i13] == i9) {
                                                    m5092f(i9, (int) ((f * c2497sb.m4937q()) + 0.5f), i9, (int) ((f2 * c2497sb.m4933k()) + 0.5f), c2454rb);
                                                    c2454rb.f8612d.f5061e.mo1539d(c2454rb.m4937q());
                                                    c2454rb.f8614e.f5061e.mo1539d(c2454rb.m4933k());
                                                    c2454rb.f8606a = true;
                                                }
                                            }
                                        } else if (i20 == i10) {
                                            if (i17 == i7) {
                                                i16 = i9;
                                                m5092f(i7, 0, i7, 0, c2454rb);
                                            } else {
                                                i16 = i9;
                                            }
                                            int iM4937q = c2454rb.m4937q();
                                            float f3 = c2454rb.f8602W;
                                            if (c2454rb.f8603X == -1) {
                                                f3 = 1.0f / f3;
                                            }
                                            m5092f(i16, iM4937q, i16, (int) ((iM4937q * f3) + 0.5f), c2454rb);
                                            c2454rb.f8612d.f5061e.mo1539d(c2454rb.m4937q());
                                            c2454rb.f8614e.f5061e.mo1539d(c2454rb.m4933k());
                                            c2454rb.f8606a = true;
                                        } else {
                                            int i23 = i8;
                                            int i24 = i9;
                                            int i25 = i7;
                                            if (i20 == 1) {
                                                m5092f(i17, 0, i25, 0, c2454rb);
                                                c2454rb.f8614e.f5061e.f2386m = c2454rb.m4933k();
                                            } else {
                                                int i26 = i17;
                                                if (i20 == 2) {
                                                    int i27 = iArr[1];
                                                    if (i27 == i24 || i27 == 4) {
                                                        m5092f(i26, c2454rb.m4937q(), i24, (int) ((f2 * c2497sb.m4933k()) + 0.5f), c2454rb);
                                                        c2454rb.f8612d.f5061e.mo1539d(c2454rb.m4937q());
                                                        c2454rb.f8614e.f5061e.mo1539d(c2454rb.m4933k());
                                                        c2454rb.f8606a = true;
                                                    } else {
                                                        i11 = i23;
                                                        i14 = i26;
                                                        i9 = i24;
                                                        i12 = i25;
                                                        i13 = 1;
                                                    }
                                                } else {
                                                    i14 = i26;
                                                    i9 = i24;
                                                    if (c1259cbArr[2].f4270f == null || c1259cbArr[3].f4270f == null) {
                                                        m5092f(i25, 0, i23, 0, c2454rb);
                                                        c2454rb.f8612d.f5061e.mo1539d(c2454rb.m4937q());
                                                        c2454rb.f8614e.f5061e.mo1539d(c2454rb.m4933k());
                                                        c2454rb.f8606a = true;
                                                    } else {
                                                        i11 = i23;
                                                        i12 = i25;
                                                        i13 = 1;
                                                    }
                                                }
                                            }
                                        }
                                        i15 = 3;
                                        if (i14 == i15) {
                                        }
                                    }
                                }
                                i10 = 3;
                                if (i8 == i10) {
                                }
                                i15 = 3;
                                if (i14 == i15) {
                                }
                            }
                        } else {
                            i3 = i18;
                            i = 1;
                            i2 = i17;
                            int iM4937q2 = c2454rb.m4937q();
                            if (i2 == 4) {
                                iM4937q2 = (c2497sb.m4937q() - c1259cb4.f4271g) - c1259cb3.f4271g;
                                i2 = i;
                            }
                            int iM4933k3 = c2454rb.m4933k();
                            if (i3 != 4) {
                                iM4933k = (c2497sb.m4933k() - c1259cb2.f4271g) - c1259cb.f4271g;
                                i4 = i;
                                c2585ud = this;
                                i5 = iM4937q2;
                                i6 = i2;
                            } else {
                                iM4933k = iM4933k3;
                                i4 = i3;
                                i5 = iM4937q2;
                                i6 = i2;
                                c2585ud = this;
                            }
                            c2585ud.m5092f(i6, i5, i4, iM4933k, c2454rb);
                            c2454rb.f8612d.f5061e.mo1539d(c2454rb.m4937q());
                            c2454rb.f8614e.f5061e.mo1539d(c2454rb.m4933k());
                            c2454rb.f8606a = true;
                        }
                    }
                    i3 = i18;
                    i2 = i17;
                    i = 1;
                    int iM4937q22 = c2454rb.m4937q();
                    if (i2 == 4) {
                    }
                    int iM4933k32 = c2454rb.m4933k();
                    if (i3 != 4) {
                    }
                    c2585ud.m5092f(i6, i5, i4, iM4933k, c2454rb);
                    c2454rb.f8612d.f5061e.mo1539d(c2454rb.m4937q());
                    c2454rb.f8614e.f5061e.mo1539d(c2454rb.m4933k());
                    c2454rb.f8606a = true;
                } else {
                    i7 = 2;
                    if (i17 == 2) {
                    }
                    if (i17 == 3) {
                    }
                    i10 = 3;
                    if (i8 == i10) {
                    }
                    i15 = 3;
                    if (i14 == i15) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5089c() {
        C2497sb c2497sb = this.f8947a;
        ArrayList arrayList = this.f8954h;
        ArrayList<AbstractC1449gF> arrayList2 = this.f8951e;
        arrayList2.clear();
        C2497sb c2497sb2 = this.f8950d;
        c2497sb2.f8612d.mo1549f();
        c2497sb2.f8614e.mo1549f();
        arrayList2.add(c2497sb2.f8612d);
        arrayList2.add(c2497sb2.f8614e);
        HashSet hashSet = null;
        for (C2454rb c2454rb : c2497sb2.f8774q0) {
            if (c2454rb instanceof C2150kk) {
                C2197lk c2197lk = new C2197lk(c2454rb);
                c2454rb.f8612d.mo1549f();
                c2454rb.f8614e.mo1549f();
                c2197lk.f5062f = ((C2150kk) c2454rb).f7522u0;
                arrayList2.add(c2197lk);
            } else {
                if (c2454rb.m4944x()) {
                    if (c2454rb.f8608b == null) {
                        c2454rb.f8608b = new C2221m7(c2454rb, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c2454rb.f8608b);
                } else {
                    arrayList2.add(c2454rb.f8612d);
                }
                if (c2454rb.m4945y()) {
                    if (c2454rb.f8610c == null) {
                        c2454rb.f8610c = new C2221m7(c2454rb, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c2454rb.f8610c);
                } else {
                    arrayList2.add(c2454rb.f8614e);
                }
                if (c2454rb instanceof AbstractC2592uk) {
                    arrayList2.add(new C2549tk(c2454rb));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((AbstractC1449gF) it.next()).mo1549f();
        }
        for (AbstractC1449gF abstractC1449gF : arrayList2) {
            if (abstractC1449gF.f5058b != c2497sb2) {
                abstractC1449gF.mo1547d();
            }
        }
        arrayList.clear();
        m5091e(c2497sb.f8612d, 0, arrayList);
        m5091e(c2497sb.f8614e, 1, arrayList);
        this.f8948b = false;
    }

    /* JADX INFO: renamed from: d */
    public final int m5090d(C2497sb c2497sb, int i) {
        ArrayList arrayList;
        int i2;
        long jMax;
        float f;
        C2497sb c2497sb2 = c2497sb;
        ArrayList arrayList2 = this.f8954h;
        int size = arrayList2.size();
        long j = 0;
        int i3 = 0;
        long jMax2 = 0;
        while (i3 < size) {
            AbstractC1449gF abstractC1449gF = ((C0769Rw) arrayList2.get(i3)).f2441a;
            if (!(abstractC1449gF instanceof C2221m7) ? !(i != 0 ? (abstractC1449gF instanceof C0830TD) : (abstractC1449gF instanceof C0757Rk)) : ((C2221m7) abstractC1449gF).f5062f != i) {
                C2628vd c2628vd = (i == 0 ? c2497sb2.f8612d : c2497sb2.f8614e).f5064h;
                C2628vd c2628vd2 = (i == 0 ? c2497sb2.f8612d : c2497sb2.f8614e).f5065i;
                C2628vd c2628vd3 = abstractC1449gF.f5064h;
                C2628vd c2628vd4 = abstractC1449gF.f5065i;
                boolean zContains = c2628vd3.f9121l.contains(c2628vd);
                boolean zContains2 = c2628vd4.f9121l.contains(c2628vd2);
                long jMo2779j = abstractC1449gF.mo2779j();
                if (zContains && zContains2) {
                    long jM1565b = C0769Rw.m1565b(c2628vd3, j);
                    long jM1564a = C0769Rw.m1564a(c2628vd4, j);
                    long j2 = jM1565b - jMo2779j;
                    int i4 = c2628vd4.f9115f;
                    arrayList = arrayList2;
                    i2 = size;
                    if (j2 >= (-i4)) {
                        j2 += (long) i4;
                    }
                    long j3 = c2628vd3.f9115f;
                    long j4 = ((-jM1564a) - jMo2779j) - j3;
                    if (j4 >= j3) {
                        j4 -= j3;
                    }
                    C2454rb c2454rb = abstractC1449gF.f5058b;
                    if (i == 0) {
                        f = c2454rb.f8613d0;
                    } else if (i == 1) {
                        f = c2454rb.f8615e0;
                    } else {
                        c2454rb.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j2 / (1.0f - f)) + (j4 / f)) : 0L;
                    jMax = (((long) c2628vd3.f9115f) + ((((long) ((f2 * f) + 0.5f)) + jMo2779j) + ((long) (((1.0f - f) * f2) + 0.5f)))) - ((long) c2628vd4.f9115f);
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    jMax = zContains ? Math.max(C0769Rw.m1565b(c2628vd3, c2628vd3.f9115f), ((long) c2628vd3.f9115f) + jMo2779j) : zContains2 ? Math.max(-C0769Rw.m1564a(c2628vd4, c2628vd4.f9115f), ((long) (-c2628vd4.f9115f)) + jMo2779j) : (abstractC1449gF.mo2779j() + ((long) c2628vd3.f9115f)) - ((long) c2628vd4.f9115f);
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                jMax = j;
            }
            jMax2 = Math.max(jMax2, jMax);
            i3++;
            c2497sb2 = c2497sb;
            arrayList2 = arrayList;
            size = i2;
            j = 0;
        }
        return (int) jMax2;
    }

    /* JADX INFO: renamed from: e */
    public final void m5091e(AbstractC1449gF abstractC1449gF, int i, ArrayList arrayList) {
        C2628vd c2628vd = abstractC1449gF.f5064h;
        C2628vd c2628vd2 = abstractC1449gF.f5065i;
        for (InterfaceC2542td interfaceC2542td : c2628vd.f9120k) {
            if (interfaceC2542td instanceof C2628vd) {
                m5087a((C2628vd) interfaceC2542td, i, arrayList, null);
            } else if (interfaceC2542td instanceof AbstractC1449gF) {
                m5087a(((AbstractC1449gF) interfaceC2542td).f5064h, i, arrayList, null);
            }
        }
        for (InterfaceC2542td interfaceC2542td2 : c2628vd2.f9120k) {
            if (interfaceC2542td2 instanceof C2628vd) {
                m5087a((C2628vd) interfaceC2542td2, i, arrayList, null);
            } else if (interfaceC2542td2 instanceof AbstractC1449gF) {
                m5087a(((AbstractC1449gF) interfaceC2542td2).f5065i, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC2542td interfaceC2542td3 : ((C0830TD) abstractC1449gF).f2621k.f9120k) {
                if (interfaceC2542td3 instanceof C2628vd) {
                    m5087a((C2628vd) interfaceC2542td3, i, arrayList, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m5092f(int i, int i2, int i3, int i4, C2454rb c2454rb) {
        C0178E5 c0178e5 = this.f8953g;
        c0178e5.f520a = i;
        c0178e5.f521b = i3;
        c0178e5.f522c = i2;
        c0178e5.f523d = i4;
        this.f8952f.m2865b(c2454rb, c0178e5);
        c2454rb.m4924O(c0178e5.f524e);
        c2454rb.m4921L(c0178e5.f525f);
        c2454rb.f8584E = c0178e5.f527h;
        c2454rb.m4918I(c0178e5.f526g);
    }

    /* JADX INFO: renamed from: g */
    public final void m5093g() {
        C0135D5 c0135d5;
        for (C2454rb c2454rb : this.f8947a.f8774q0) {
            if (!c2454rb.f8606a) {
                int[] iArr = c2454rb.f8637p0;
                boolean z = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = c2454rb.f8639r;
                int i4 = c2454rb.f8640s;
                boolean z2 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z = true;
                }
                C0750Rd c0750Rd = c2454rb.f8612d.f5061e;
                boolean z3 = c0750Rd.f9119j;
                C0750Rd c0750Rd2 = c2454rb.f8614e.f5061e;
                boolean z4 = c0750Rd2.f9119j;
                boolean z5 = z2;
                if (z3 && z4) {
                    m5092f(1, c0750Rd.f9116g, 1, c0750Rd2.f9116g, c2454rb);
                    c2454rb.f8606a = true;
                } else if (z3 && z) {
                    m5092f(1, c0750Rd.f9116g, 2, c0750Rd2.f9116g, c2454rb);
                    if (i2 == 3) {
                        c2454rb.f8614e.f5061e.f2386m = c2454rb.m4933k();
                    } else {
                        c2454rb.f8614e.f5061e.mo1539d(c2454rb.m4933k());
                        c2454rb.f8606a = true;
                    }
                } else if (z4 && z5) {
                    m5092f(2, c0750Rd.f9116g, 1, c0750Rd2.f9116g, c2454rb);
                    if (i == 3) {
                        c2454rb.f8612d.f5061e.f2386m = c2454rb.m4937q();
                    } else {
                        c2454rb.f8612d.f5061e.mo1539d(c2454rb.m4937q());
                        c2454rb.f8606a = true;
                    }
                }
                if (c2454rb.f8606a && (c0135d5 = c2454rb.f8614e.f2622l) != null) {
                    c0135d5.mo1539d(c2454rb.f8607a0);
                }
            }
        }
    }
}
