package p073o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p071n.AbstractC1004i;
import p071n.C0998c;
import p071n.C0999d;
import p071n.C1000e;
import p071n.C1003h;
import p075p.C1040f;

/* JADX INFO: renamed from: o.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1016e {

    /* JADX INFO: renamed from: a */
    public C1000e f3736a;

    /* JADX INFO: renamed from: b */
    public boolean f3737b;

    /* JADX INFO: renamed from: c */
    public boolean f3738c;

    /* JADX INFO: renamed from: d */
    public C1000e f3739d;

    /* JADX INFO: renamed from: e */
    public ArrayList f3740e;

    /* JADX INFO: renamed from: f */
    public C1040f f3741f;

    /* JADX INFO: renamed from: g */
    public C1013b f3742g;

    /* JADX INFO: renamed from: h */
    public ArrayList f3743h;

    /* JADX INFO: renamed from: a */
    public final void m2453a(C1017f c1017f, int i2, ArrayList arrayList, C1022k c1022k) {
        AbstractC1024m abstractC1024m = c1017f.f3747d;
        if (abstractC1024m.f3764c == null) {
            C1000e c1000e = this.f3736a;
            if (abstractC1024m == c1000e.f3616d || abstractC1024m == c1000e.f3617e) {
                return;
            }
            if (c1022k == null) {
                c1022k = new C1022k();
                c1022k.f3758a = null;
                c1022k.f3759b = new ArrayList();
                c1022k.f3758a = abstractC1024m;
                arrayList.add(c1022k);
            }
            abstractC1024m.f3764c = c1022k;
            c1022k.f3759b.add(abstractC1024m);
            C1017f c1017f2 = abstractC1024m.f3769h;
            for (InterfaceC1015d interfaceC1015d : c1017f2.f3754k) {
                if (interfaceC1015d instanceof C1017f) {
                    m2453a((C1017f) interfaceC1015d, i2, arrayList, c1022k);
                }
            }
            C1017f c1017f3 = abstractC1024m.f3770i;
            for (InterfaceC1015d interfaceC1015d2 : c1017f3.f3754k) {
                if (interfaceC1015d2 instanceof C1017f) {
                    m2453a((C1017f) interfaceC1015d2, i2, arrayList, c1022k);
                }
            }
            if (i2 == 1 && (abstractC1024m instanceof C1023l)) {
                for (InterfaceC1015d interfaceC1015d3 : ((C1023l) abstractC1024m).f3760k.f3754k) {
                    if (interfaceC1015d3 instanceof C1017f) {
                        m2453a((C1017f) interfaceC1015d3, i2, arrayList, c1022k);
                    }
                }
            }
            Iterator it = c1017f2.f3755l.iterator();
            while (it.hasNext()) {
                m2453a((C1017f) it.next(), i2, arrayList, c1022k);
            }
            Iterator it2 = c1017f3.f3755l.iterator();
            while (it2.hasNext()) {
                m2453a((C1017f) it2.next(), i2, arrayList, c1022k);
            }
            if (i2 == 1 && (abstractC1024m instanceof C1023l)) {
                Iterator it3 = ((C1023l) abstractC1024m).f3760k.f3755l.iterator();
                while (it3.hasNext()) {
                    m2453a((C1017f) it3.next(), i2, arrayList, c1022k);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0268 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0195  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2454b(C1000e c1000e) {
        C0998c c0998c;
        int i2;
        C1021j c1021j;
        C1023l c1023l;
        int i3;
        int i4;
        int i5;
        int i6;
        C1021j c1021j2;
        C1023l c1023l2;
        int iM2407l;
        int iM2404i;
        for (C0999d c0999d : c1000e.f3639d0) {
            int[] iArr = c0999d.f3615c0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            if (c0999d.f3605V == 8) {
                c0999d.f3610a = true;
            } else {
                float f2 = c0999d.f3627o;
                if (f2 < 1.0f && i7 == 3) {
                    c0999d.f3622j = 2;
                }
                float f3 = c0999d.f3630r;
                if (f3 < 1.0f && i8 == 3) {
                    c0999d.f3623k = 2;
                }
                int i9 = 1;
                if (c0999d.f3595L > 0.0f) {
                    if (i7 == 3 && (i8 == 2 || i8 == 1)) {
                        c0999d.f3622j = 3;
                    } else if (i8 == 3 && (i7 == 2 || i7 == 1)) {
                        c0999d.f3623k = 3;
                    } else if (i7 == 3 && i8 == 3) {
                        if (c0999d.f3622j == 0) {
                            c0999d.f3622j = 3;
                        }
                        if (c0999d.f3623k == 0) {
                            c0999d.f3623k = 3;
                        }
                    }
                }
                C0998c c0998c2 = c0999d.f3638z;
                C0998c c0998c3 = c0999d.f3636x;
                if (i7 == 3 && c0999d.f3622j == 1 && (c0998c3.f3580d == null || c0998c2.f3580d == null)) {
                    i7 = 2;
                }
                C0998c c0998c4 = c0999d.f3584A;
                C0998c c0998c5 = c0999d.f3637y;
                int i10 = (i8 == 3 && c0999d.f3623k == 1 && (c0998c5.f3580d == null || c0998c4.f3580d == null)) ? 2 : i8;
                C1021j c1021j3 = c0999d.f3616d;
                c1021j3.f3765d = i7;
                int i11 = c0999d.f3622j;
                c1021j3.f3762a = i11;
                C1023l c1023l3 = c0999d.f3617e;
                c1023l3.f3765d = i10;
                int i12 = c0999d.f3623k;
                c1023l3.f3762a = i12;
                if (i7 == 4 || i7 == 1) {
                    c0998c = c0998c5;
                    i2 = 2;
                } else {
                    c0998c = c0998c5;
                    i2 = 2;
                    if (i7 == 2) {
                    }
                    int[] iArr2 = c1000e.f3615c0;
                    C0998c[] c0998cArr = c0999d.f3589F;
                    if (i7 == 3) {
                        c1021j = c1021j3;
                    } else if (i10 != i2 && i10 != 1) {
                        c1023l = c1023l3;
                        c1021j = c1021j3;
                        i3 = 3;
                        if (i10 == i3) {
                        }
                        i4 = 1;
                        i5 = 3;
                        if (i7 != i5) {
                        }
                    } else if (i11 == 3) {
                        if (i10 == i2) {
                            c1021j2 = c1021j3;
                            c1023l2 = c1023l3;
                            m2458f(i2, 0, i2, 0, c0999d);
                        } else {
                            c1021j2 = c1021j3;
                            c1023l2 = c1023l3;
                        }
                        int iM2404i2 = c0999d.m2404i();
                        m2458f(1, (int) ((iM2404i2 * c0999d.f3595L) + 0.5f), 1, iM2404i2, c0999d);
                        c1021j2.f3766e.mo2462d(c0999d.m2407l());
                        c1023l2.f3766e.mo2462d(c0999d.m2404i());
                        c0999d.f3610a = true;
                    } else {
                        c1021j = c1021j3;
                        if (i11 == 1) {
                            m2458f(2, 0, i10, 0, c0999d);
                            c1021j.f3766e.f3756m = c0999d.m2407l();
                        } else {
                            if (i11 == 2) {
                                int i13 = iArr2[0];
                                if (i13 == 1 || i13 == 4) {
                                    m2458f(1, (int) ((f2 * c1000e.m2407l()) + 0.5f), i10, c0999d.m2404i(), c0999d);
                                    c1021j.f3766e.mo2462d(c0999d.m2407l());
                                    c1023l3.f3766e.mo2462d(c0999d.m2404i());
                                    c0999d.f3610a = true;
                                }
                            } else if (c0998cArr[0].f3580d == null || c0998cArr[1].f3580d == null) {
                                m2458f(2, 0, i10, 0, c0999d);
                                c1021j.f3766e.mo2462d(c0999d.m2407l());
                                c1023l3.f3766e.mo2462d(c0999d.m2404i());
                                c0999d.f3610a = true;
                            }
                            if (i10 == i3) {
                                if (i7 != 2 && i7 != 1) {
                                    i5 = i3;
                                    i4 = 1;
                                    if (i7 != i5) {
                                    }
                                } else if (i12 == i3) {
                                    if (i7 == 2) {
                                        m2458f(2, 0, 2, 0, c0999d);
                                    }
                                    int iM2407l2 = c0999d.m2407l();
                                    float f4 = c0999d.f3595L;
                                    if (c0999d.f3596M == -1) {
                                        f4 = 1.0f / f4;
                                    }
                                    m2458f(1, iM2407l2, 1, (int) ((iM2407l2 * f4) + 0.5f), c0999d);
                                    c1021j.f3766e.mo2462d(c0999d.m2407l());
                                    c1023l.f3766e.mo2462d(c0999d.m2404i());
                                    c0999d.f3610a = true;
                                } else if (i12 == 1) {
                                    m2458f(i7, 0, 2, 0, c0999d);
                                    c1023l.f3766e.f3756m = c0999d.m2404i();
                                } else {
                                    if (i12 == 2) {
                                        int i14 = iArr2[1];
                                        if (i14 == 1 || i14 == 4) {
                                            m2458f(i7, c0999d.m2407l(), 1, (int) ((f3 * c1000e.m2404i()) + 0.5f), c0999d);
                                            c1021j.f3766e.mo2462d(c0999d.m2407l());
                                            c1023l.f3766e.mo2462d(c0999d.m2404i());
                                            c0999d.f3610a = true;
                                        }
                                    } else if (c0998cArr[2].f3580d == null || c0998cArr[3].f3580d == null) {
                                        m2458f(2, 0, i10, 0, c0999d);
                                        c1021j.f3766e.mo2462d(c0999d.m2407l());
                                        c1023l.f3766e.mo2462d(c0999d.m2404i());
                                        c0999d.f3610a = true;
                                    }
                                    if (i7 != i5 && i10 == i5) {
                                        if (i11 == i4 || i12 == i4) {
                                            m2458f(2, 0, 2, 0, c0999d);
                                            c1021j.f3766e.f3756m = c0999d.m2407l();
                                            c1023l.f3766e.f3756m = c0999d.m2404i();
                                        } else if (i12 == 2 && i11 == 2 && ((i6 = iArr2[0]) == 1 || i6 == 1)) {
                                            int i15 = iArr2[i4];
                                            if (i15 == 1 || i15 == 1) {
                                                m2458f(1, (int) ((f2 * c1000e.m2407l()) + 0.5f), 1, (int) ((f3 * c1000e.m2404i()) + 0.5f), c0999d);
                                                c1021j.f3766e.mo2462d(c0999d.m2407l());
                                                c1023l.f3766e.mo2462d(c0999d.m2404i());
                                                c0999d.f3610a = true;
                                            }
                                        }
                                    }
                                }
                            }
                            i4 = 1;
                            i5 = 3;
                            if (i7 != i5) {
                            }
                        }
                    }
                    c1023l = c1023l3;
                    i3 = 3;
                    if (i10 == i3) {
                    }
                    i4 = 1;
                    i5 = 3;
                    if (i7 != i5) {
                    }
                }
                if (i10 == 4 || i10 == 1 || i10 == i2) {
                    int iM2407l3 = c0999d.m2407l();
                    if (i7 == 4) {
                        iM2407l = (c1000e.m2407l() - c0998c3.f3581e) - c0998c2.f3581e;
                        i7 = 1;
                    } else {
                        iM2407l = iM2407l3;
                    }
                    int iM2404i3 = c0999d.m2404i();
                    if (i10 == 4) {
                        iM2404i = (c1000e.m2404i() - c0998c.f3581e) - c0998c4.f3581e;
                    } else {
                        iM2404i = iM2404i3;
                        i9 = i10;
                    }
                    m2458f(i7, iM2407l, i9, iM2404i, c0999d);
                    c1021j3.f3766e.mo2462d(c0999d.m2407l());
                    c1023l3.f3766e.mo2462d(c0999d.m2404i());
                    c0999d.f3610a = true;
                } else {
                    int[] iArr22 = c1000e.f3615c0;
                    C0998c[] c0998cArr2 = c0999d.f3589F;
                    if (i7 == 3) {
                    }
                    c1023l = c1023l3;
                    i3 = 3;
                    if (i10 == i3) {
                    }
                    i4 = 1;
                    i5 = 3;
                    if (i7 != i5) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2455c() {
        ArrayList<AbstractC1024m> arrayList = this.f3740e;
        arrayList.clear();
        C1000e c1000e = this.f3739d;
        c1000e.f3616d.mo2448f();
        C1023l c1023l = c1000e.f3617e;
        c1023l.mo2448f();
        arrayList.add(c1000e.f3616d);
        arrayList.add(c1023l);
        HashSet hashSet = null;
        for (C0999d c0999d : c1000e.f3639d0) {
            if (c0999d instanceof C1003h) {
                C1019h c1019h = new C1019h(c0999d);
                c0999d.f3616d.mo2448f();
                c0999d.f3617e.mo2448f();
                c1019h.f3767f = ((C1003h) c0999d).f3712h0;
                arrayList.add(c1019h);
            } else {
                if (c0999d.m2412q()) {
                    if (c0999d.f3612b == null) {
                        c0999d.f3612b = new C1014c(c0999d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0999d.f3612b);
                } else {
                    arrayList.add(c0999d.f3616d);
                }
                if (c0999d.m2413r()) {
                    if (c0999d.f3614c == null) {
                        c0999d.f3614c = new C1014c(c0999d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0999d.f3614c);
                } else {
                    arrayList.add(c0999d.f3617e);
                }
                if (c0999d instanceof AbstractC1004i) {
                    arrayList.add(new C1020i(c0999d));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC1024m) it.next()).mo2448f();
        }
        for (AbstractC1024m abstractC1024m : arrayList) {
            if (abstractC1024m.f3763b != c1000e) {
                abstractC1024m.mo2446d();
            }
        }
        ArrayList arrayList2 = this.f3743h;
        arrayList2.clear();
        C1000e c1000e2 = this.f3736a;
        m2457e(c1000e2.f3616d, 0, arrayList2);
        m2457e(c1000e2.f3617e, 1, arrayList2);
        this.f3737b = false;
    }

    /* JADX INFO: renamed from: d */
    public final int m2456d(C1000e c1000e, int i2) {
        ArrayList arrayList;
        int i3;
        int i4;
        long jMax;
        float f2;
        C1000e c1000e2 = c1000e;
        ArrayList arrayList2 = this.f3743h;
        int size = arrayList2.size();
        int i5 = 0;
        long jMax2 = 0;
        while (i5 < size) {
            AbstractC1024m abstractC1024m = ((C1022k) arrayList2.get(i5)).f3758a;
            if (!(abstractC1024m instanceof C1014c) ? !(i2 != 0 ? (abstractC1024m instanceof C1023l) : (abstractC1024m instanceof C1021j)) : ((C1014c) abstractC1024m).f3767f != i2) {
                C1017f c1017f = (i2 == 0 ? c1000e2.f3616d : c1000e2.f3617e).f3769h;
                C1017f c1017f2 = (i2 == 0 ? c1000e2.f3616d : c1000e2.f3617e).f3770i;
                boolean zContains = abstractC1024m.f3769h.f3755l.contains(c1017f);
                C1017f c1017f3 = abstractC1024m.f3770i;
                boolean zContains2 = c1017f3.f3755l.contains(c1017f2);
                long jMo2449j = abstractC1024m.mo2449j();
                C1017f c1017f4 = abstractC1024m.f3769h;
                if (zContains && zContains2) {
                    long jM2468b = C1022k.m2468b(c1017f4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i3 = size;
                    long jM2467a = C1022k.m2467a(c1017f3, 0L);
                    long j2 = jM2468b - jMo2449j;
                    int i6 = c1017f3.f3749f;
                    arrayList = arrayList3;
                    i4 = i5;
                    if (j2 >= (-i6)) {
                        j2 += (long) i6;
                    }
                    long j3 = (-jM2467a) - jMo2449j;
                    long j4 = c1017f4.f3749f;
                    long j5 = j3 - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    C0999d c0999d = abstractC1024m.f3763b;
                    if (i2 == 0) {
                        f2 = c0999d.f3602S;
                    } else if (i2 == 1) {
                        f2 = c0999d.f3603T;
                    } else {
                        c0999d.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = f2 > 0.0f ? (long) ((j2 / (1.0f - f2)) + (j5 / f2)) : 0L;
                    jMax = (((long) c1017f4.f3749f) + ((((long) ((f3 * f2) + 0.5f)) + jMo2449j) + ((long) (((1.0f - f2) * f3) + 0.5f)))) - ((long) c1017f3.f3749f);
                } else {
                    arrayList = arrayList2;
                    i3 = size;
                    i4 = i5;
                    jMax = zContains ? Math.max(C1022k.m2468b(c1017f4, c1017f4.f3749f), ((long) c1017f4.f3749f) + jMo2449j) : zContains2 ? Math.max(-C1022k.m2467a(c1017f3, c1017f3.f3749f), ((long) (-c1017f3.f3749f)) + jMo2449j) : (abstractC1024m.mo2449j() + ((long) c1017f4.f3749f)) - ((long) c1017f3.f3749f);
                }
            } else {
                arrayList = arrayList2;
                i3 = size;
                i4 = i5;
                jMax = 0;
            }
            jMax2 = Math.max(jMax2, jMax);
            i5 = i4 + 1;
            c1000e2 = c1000e;
            size = i3;
            arrayList2 = arrayList;
        }
        return (int) jMax2;
    }

    /* JADX INFO: renamed from: e */
    public final void m2457e(AbstractC1024m abstractC1024m, int i2, ArrayList arrayList) {
        C1017f c1017f;
        Iterator it = abstractC1024m.f3769h.f3754k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c1017f = abstractC1024m.f3770i;
            if (!zHasNext) {
                break;
            }
            InterfaceC1015d interfaceC1015d = (InterfaceC1015d) it.next();
            if (interfaceC1015d instanceof C1017f) {
                m2453a((C1017f) interfaceC1015d, i2, arrayList, null);
            } else if (interfaceC1015d instanceof AbstractC1024m) {
                m2453a(((AbstractC1024m) interfaceC1015d).f3769h, i2, arrayList, null);
            }
        }
        for (InterfaceC1015d interfaceC1015d2 : c1017f.f3754k) {
            if (interfaceC1015d2 instanceof C1017f) {
                m2453a((C1017f) interfaceC1015d2, i2, arrayList, null);
            } else if (interfaceC1015d2 instanceof AbstractC1024m) {
                m2453a(((AbstractC1024m) interfaceC1015d2).f3770i, i2, arrayList, null);
            }
        }
        if (i2 == 1) {
            for (InterfaceC1015d interfaceC1015d3 : ((C1023l) abstractC1024m).f3760k.f3754k) {
                if (interfaceC1015d3 instanceof C1017f) {
                    m2453a((C1017f) interfaceC1015d3, i2, arrayList, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2458f(int i2, int i3, int i4, int i5, C0999d c0999d) {
        C1013b c1013b = this.f3742g;
        c1013b.f3724a = i2;
        c1013b.f3725b = i4;
        c1013b.f3726c = i3;
        c1013b.f3727d = i5;
        this.f3741f.m2519a(c0999d, c1013b);
        c0999d.m2420y(c1013b.f3728e);
        c0999d.m2417v(c1013b.f3729f);
        c0999d.f3635w = c1013b.f3731h;
        int i6 = c1013b.f3730g;
        c0999d.f3599P = i6;
        c0999d.f3635w = i6 > 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m2459g() {
        C1012a c1012a;
        for (C0999d c0999d : this.f3736a.f3639d0) {
            if (!c0999d.f3610a) {
                int[] iArr = c0999d.f3615c0;
                boolean z2 = false;
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = c0999d.f3622j;
                int i5 = c0999d.f3623k;
                boolean z3 = i2 == 2 || (i2 == 3 && i4 == 1);
                if (i3 == 2 || (i3 == 3 && i5 == 1)) {
                    z2 = true;
                }
                C1021j c1021j = c0999d.f3616d;
                C1018g c1018g = c1021j.f3766e;
                boolean z4 = c1018g.f3753j;
                C1023l c1023l = c0999d.f3617e;
                C1018g c1018g2 = c1023l.f3766e;
                boolean z5 = c1018g2.f3753j;
                if (z4 && z5) {
                    m2458f(1, c1018g.f3750g, 1, c1018g2.f3750g, c0999d);
                    c0999d.f3610a = true;
                } else if (z4 && z2) {
                    m2458f(1, c1018g.f3750g, 2, c1018g2.f3750g, c0999d);
                    if (i3 == 3) {
                        c1023l.f3766e.f3756m = c0999d.m2404i();
                    } else {
                        c1023l.f3766e.mo2462d(c0999d.m2404i());
                        c0999d.f3610a = true;
                    }
                } else if (z5 && z3) {
                    m2458f(2, c1018g.f3750g, 1, c1018g2.f3750g, c0999d);
                    if (i2 == 3) {
                        c1021j.f3766e.f3756m = c0999d.m2407l();
                    } else {
                        c1021j.f3766e.mo2462d(c0999d.m2407l());
                        c0999d.f3610a = true;
                    }
                }
                if (c0999d.f3610a && (c1012a = c1023l.f3761l) != null) {
                    c1012a.mo2462d(c0999d.f3599P);
                }
            }
        }
    }
}
