package p073o;

import java.util.ArrayList;
import java.util.Iterator;
import p034S.AbstractC0324d;
import p071n.C0998c;
import p071n.C0999d;
import p071n.C1000e;

/* JADX INFO: renamed from: o.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1014c extends AbstractC1024m {

    /* JADX INFO: renamed from: k */
    public final ArrayList f3734k;

    /* JADX INFO: renamed from: l */
    public int f3735l;

    public C1014c(C0999d c0999d, int i2) {
        C0999d c0999d2;
        super(c0999d);
        this.f3734k = new ArrayList();
        this.f3767f = i2;
        C0999d c0999d3 = this.f3763b;
        C0999d c0999dM2406k = c0999d3.m2406k(i2);
        while (true) {
            C0999d c0999d4 = c0999dM2406k;
            c0999d2 = c0999d3;
            c0999d3 = c0999d4;
            if (c0999d3 == null) {
                break;
            } else {
                c0999dM2406k = c0999d3.m2406k(this.f3767f);
            }
        }
        this.f3763b = c0999d2;
        int i3 = this.f3767f;
        InterfaceC1015d interfaceC1015d = i3 == 0 ? c0999d2.f3616d : i3 == 1 ? c0999d2.f3617e : null;
        ArrayList<AbstractC1024m> arrayList = this.f3734k;
        arrayList.add(interfaceC1015d);
        C0999d c0999dM2405j = c0999d2.m2405j(this.f3767f);
        while (c0999dM2405j != null) {
            int i4 = this.f3767f;
            arrayList.add(i4 == 0 ? c0999dM2405j.f3616d : i4 == 1 ? c0999dM2405j.f3617e : null);
            c0999dM2405j = c0999dM2405j.m2405j(this.f3767f);
        }
        for (AbstractC1024m abstractC1024m : arrayList) {
            int i5 = this.f3767f;
            if (i5 == 0) {
                abstractC1024m.f3763b.f3612b = this;
            } else if (i5 == 1) {
                abstractC1024m.f3763b.f3614c = this;
            }
        }
        if (this.f3767f == 0 && ((C1000e) this.f3763b.f3592I).f3643h0 && arrayList.size() > 1) {
            this.f3763b = ((AbstractC1024m) arrayList.get(arrayList.size() - 1)).f3763b;
        }
        this.f3735l = this.f3767f == 0 ? this.f3763b.f3607X : this.f3763b.f3608Y;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01c2 A[PHI: r2 r25
  0x01c2: PHI (r2v71 int) = (r2v67 int), (r2v76 int) binds: [B:120:0x01c0, B:111:0x01a0] A[DONT_GENERATE, DONT_INLINE]
  0x01c2: PHI (r25v1 float) = (r25v0 float), (r25v3 float) binds: [B:120:0x01c0, B:111:0x01a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0155  */
    @Override // p073o.InterfaceC1015d
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2445a(InterfaceC1015d interfaceC1015d) {
        int i2;
        int i3;
        ArrayList arrayList;
        int i4;
        int i5;
        int i6;
        int i7;
        float f2;
        int i8;
        boolean z2;
        ArrayList arrayList2;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z3;
        int i13;
        float f3;
        int iMax;
        int i14;
        boolean z4;
        int i15;
        C1017f c1017f = this.f3769h;
        if (c1017f.f3753j) {
            C1017f c1017f2 = this.f3770i;
            if (c1017f2.f3753j) {
                C0999d c0999d = this.f3763b.f3592I;
                boolean z5 = (c0999d == null || !(c0999d instanceof C1000e)) ? false : ((C1000e) c0999d).f3643h0;
                int i16 = c1017f2.f3750g - c1017f.f3750g;
                ArrayList arrayList3 = this.f3734k;
                int size = arrayList3.size();
                int i17 = 0;
                while (true) {
                    i2 = -1;
                    i3 = 8;
                    if (i17 >= size) {
                        i17 = -1;
                        break;
                    } else if (((AbstractC1024m) arrayList3.get(i17)).f3763b.f3605V != 8) {
                        break;
                    } else {
                        i17++;
                    }
                }
                int i18 = size - 1;
                int i19 = i18;
                while (true) {
                    if (i19 < 0) {
                        break;
                    }
                    if (((AbstractC1024m) arrayList3.get(i19)).f3763b.f3605V != 8) {
                        i2 = i19;
                        break;
                    }
                    i19--;
                }
                int i20 = 0;
                while (i20 < 2) {
                    int i21 = 0;
                    i7 = 0;
                    int i22 = 0;
                    int i23 = 0;
                    f2 = 0.0f;
                    while (i21 < size) {
                        AbstractC1024m abstractC1024m = (AbstractC1024m) arrayList3.get(i21);
                        C0999d c0999d2 = abstractC1024m.f3763b;
                        ArrayList arrayList4 = arrayList3;
                        if (c0999d2.f3605V == i3) {
                            i14 = i17;
                        } else {
                            i23++;
                            if (i21 > 0 && i21 >= i17) {
                                i7 += abstractC1024m.f3769h.f3749f;
                            }
                            C1018g c1018g = abstractC1024m.f3766e;
                            int i24 = c1018g.f3750g;
                            i14 = i17;
                            boolean z6 = abstractC1024m.f3765d != 3;
                            if (z6) {
                                int i25 = this.f3767f;
                                if (i25 == 0 && !c0999d2.f3616d.f3766e.f3753j) {
                                    return;
                                }
                                if (i25 == 1 && !c0999d2.f3617e.f3766e.f3753j) {
                                    return;
                                } else {
                                    z4 = z6;
                                }
                            } else {
                                z4 = z6;
                                if (abstractC1024m.f3762a == 1 && i20 == 0) {
                                    i15 = c1018g.f3756m;
                                    i22++;
                                } else if (c1018g.f3753j) {
                                    i15 = i24;
                                }
                                z4 = true;
                                if (z4) {
                                    i22++;
                                    float f4 = c0999d2.f3609Z[this.f3767f];
                                    if (f4 >= 0.0f) {
                                        f2 += f4;
                                    }
                                } else {
                                    i7 += i15;
                                }
                                if (i21 >= i18 && i21 < i2) {
                                    i7 += -abstractC1024m.f3770i.f3749f;
                                }
                            }
                            i15 = i24;
                            if (z4) {
                            }
                            if (i21 >= i18) {
                            }
                        }
                        i21++;
                        arrayList3 = arrayList4;
                        i17 = i14;
                        i3 = 8;
                    }
                    arrayList = arrayList3;
                    i4 = i17;
                    if (i7 < i16 || i22 == 0) {
                        i5 = i22;
                        i6 = i23;
                        break;
                    } else {
                        i20++;
                        arrayList3 = arrayList;
                        i17 = i4;
                        i3 = 8;
                    }
                }
                arrayList = arrayList3;
                i4 = i17;
                i5 = 0;
                i6 = 0;
                i7 = 0;
                f2 = 0.0f;
                int i26 = c1017f.f3750g;
                if (z5) {
                    i26 = c1017f2.f3750g;
                }
                if (i7 > i16) {
                    i26 = z5 ? i26 + ((int) (((i7 - i16) / 2.0f) + 0.5f)) : i26 - ((int) (((i7 - i16) / 2.0f) + 0.5f));
                }
                if (i5 > 0) {
                    float f5 = i16 - i7;
                    int i27 = (int) ((f5 / i5) + 0.5f);
                    int i28 = 0;
                    int i29 = 0;
                    while (i28 < size) {
                        ArrayList arrayList5 = arrayList;
                        AbstractC1024m abstractC1024m2 = (AbstractC1024m) arrayList5.get(i28);
                        int i30 = i27;
                        C0999d c0999d3 = abstractC1024m2.f3763b;
                        int i31 = i7;
                        int i32 = i26;
                        if (c0999d3.f3605V != 8 && abstractC1024m2.f3765d == 3) {
                            C1018g c1018g2 = abstractC1024m2.f3766e;
                            if (c1018g2.f3753j) {
                                z3 = z5;
                                f3 = f5;
                            } else {
                                if (f2 > 0.0f) {
                                    z3 = z5;
                                    i13 = (int) (((c0999d3.f3609Z[this.f3767f] * f5) / f2) + 0.5f);
                                } else {
                                    z3 = z5;
                                    i13 = i30;
                                }
                                if (this.f3767f == 0) {
                                    int i33 = c0999d3.f3626n;
                                    f3 = f5;
                                    iMax = Math.max(c0999d3.f3625m, abstractC1024m2.f3762a == 1 ? Math.min(i13, c1018g2.f3756m) : i13);
                                    if (i33 > 0) {
                                        iMax = Math.min(i33, iMax);
                                    }
                                    if (iMax != i13) {
                                        i29++;
                                        i13 = iMax;
                                    }
                                    c1018g2.mo2462d(i13);
                                } else {
                                    f3 = f5;
                                    int i34 = c0999d3.f3629q;
                                    iMax = Math.max(c0999d3.f3628p, abstractC1024m2.f3762a == 1 ? Math.min(i13, c1018g2.f3756m) : i13);
                                    if (i34 > 0) {
                                        iMax = Math.min(i34, iMax);
                                    }
                                    if (iMax != i13) {
                                    }
                                    c1018g2.mo2462d(i13);
                                }
                            }
                        }
                        i28++;
                        i27 = i30;
                        i7 = i31;
                        i26 = i32;
                        z5 = z3;
                        f5 = f3;
                        arrayList = arrayList5;
                    }
                    i8 = i26;
                    z2 = z5;
                    arrayList2 = arrayList;
                    int i35 = i7;
                    if (i29 > 0) {
                        i5 -= i29;
                        int i36 = 0;
                        i7 = 0;
                        while (i36 < size) {
                            AbstractC1024m abstractC1024m3 = (AbstractC1024m) arrayList2.get(i36);
                            if (abstractC1024m3.f3763b.f3605V == 8) {
                                i12 = i4;
                            } else {
                                i12 = i4;
                                if (i36 > 0 && i36 >= i12) {
                                    i7 += abstractC1024m3.f3769h.f3749f;
                                }
                                i7 += abstractC1024m3.f3766e.f3750g;
                                if (i36 < i18 && i36 < i2) {
                                    i7 += -abstractC1024m3.f3770i.f3749f;
                                }
                            }
                            i36++;
                            i4 = i12;
                        }
                        i9 = i4;
                    } else {
                        i9 = i4;
                        i7 = i35;
                    }
                    i11 = 2;
                    if (this.f3735l == 2 && i29 == 0) {
                        i10 = 0;
                        this.f3735l = 0;
                    } else {
                        i10 = 0;
                    }
                } else {
                    i8 = i26;
                    z2 = z5;
                    arrayList2 = arrayList;
                    i9 = i4;
                    i10 = 0;
                    i11 = 2;
                }
                if (i7 > i16) {
                    this.f3735l = i11;
                }
                if (i6 > 0 && i5 == 0 && i9 == i2) {
                    this.f3735l = i11;
                }
                int i37 = this.f3735l;
                if (i37 == 1) {
                    int i38 = i6 > 1 ? (i16 - i7) / (i6 - 1) : i6 == 1 ? (i16 - i7) / 2 : i10;
                    if (i5 > 0) {
                        i38 = i10;
                    }
                    int i39 = i8;
                    for (int i40 = i10; i40 < size; i40++) {
                        AbstractC1024m abstractC1024m4 = (AbstractC1024m) arrayList2.get(z2 ? size - (i40 + 1) : i40);
                        int i41 = abstractC1024m4.f3763b.f3605V;
                        C1017f c1017f3 = abstractC1024m4.f3770i;
                        C1017f c1017f4 = abstractC1024m4.f3769h;
                        if (i41 == 8) {
                            c1017f4.mo2462d(i39);
                            c1017f3.mo2462d(i39);
                        } else {
                            if (i40 > 0) {
                                i39 = z2 ? i39 - i38 : i39 + i38;
                            }
                            if (i40 > 0 && i40 >= i9) {
                                i39 = z2 ? i39 - c1017f4.f3749f : i39 + c1017f4.f3749f;
                            }
                            if (z2) {
                                c1017f3.mo2462d(i39);
                            } else {
                                c1017f4.mo2462d(i39);
                            }
                            C1018g c1018g3 = abstractC1024m4.f3766e;
                            int i42 = c1018g3.f3750g;
                            if (abstractC1024m4.f3765d == 3 && abstractC1024m4.f3762a == 1) {
                                i42 = c1018g3.f3756m;
                            }
                            i39 = z2 ? i39 - i42 : i39 + i42;
                            if (z2) {
                                c1017f4.mo2462d(i39);
                            } else {
                                c1017f3.mo2462d(i39);
                            }
                            abstractC1024m4.f3768g = true;
                            if (i40 < i18 && i40 < i2) {
                                i39 = z2 ? i39 - (-c1017f3.f3749f) : i39 + (-c1017f3.f3749f);
                            }
                        }
                    }
                    return;
                }
                if (i37 == 0) {
                    int i43 = (i16 - i7) / (i6 + 1);
                    if (i5 > 0) {
                        i43 = i10;
                    }
                    int i44 = i8;
                    for (int i45 = i10; i45 < size; i45++) {
                        AbstractC1024m abstractC1024m5 = (AbstractC1024m) arrayList2.get(z2 ? size - (i45 + 1) : i45);
                        int i46 = abstractC1024m5.f3763b.f3605V;
                        C1017f c1017f5 = abstractC1024m5.f3770i;
                        C1017f c1017f6 = abstractC1024m5.f3769h;
                        if (i46 == 8) {
                            c1017f6.mo2462d(i44);
                            c1017f5.mo2462d(i44);
                        } else {
                            int i47 = z2 ? i44 - i43 : i44 + i43;
                            if (i45 > 0 && i45 >= i9) {
                                i47 = z2 ? i47 - c1017f6.f3749f : i47 + c1017f6.f3749f;
                            }
                            if (z2) {
                                c1017f5.mo2462d(i47);
                            } else {
                                c1017f6.mo2462d(i47);
                            }
                            C1018g c1018g4 = abstractC1024m5.f3766e;
                            int iMin = c1018g4.f3750g;
                            if (abstractC1024m5.f3765d == 3 && abstractC1024m5.f3762a == 1) {
                                iMin = Math.min(iMin, c1018g4.f3756m);
                            }
                            i44 = z2 ? i47 - iMin : i47 + iMin;
                            if (z2) {
                                c1017f6.mo2462d(i44);
                            } else {
                                c1017f5.mo2462d(i44);
                            }
                            if (i45 < i18 && i45 < i2) {
                                i44 = z2 ? i44 - (-c1017f5.f3749f) : i44 + (-c1017f5.f3749f);
                            }
                        }
                    }
                    return;
                }
                if (i37 == 2) {
                    float f6 = this.f3767f == 0 ? this.f3763b.f3602S : this.f3763b.f3603T;
                    if (z2) {
                        f6 = 1.0f - f6;
                    }
                    int i48 = (int) (((i16 - i7) * f6) + 0.5f);
                    if (i48 < 0 || i5 > 0) {
                        i48 = i10;
                    }
                    int i49 = z2 ? i8 - i48 : i8 + i48;
                    for (int i50 = i10; i50 < size; i50++) {
                        AbstractC1024m abstractC1024m6 = (AbstractC1024m) arrayList2.get(z2 ? size - (i50 + 1) : i50);
                        int i51 = abstractC1024m6.f3763b.f3605V;
                        C1017f c1017f7 = abstractC1024m6.f3770i;
                        C1017f c1017f8 = abstractC1024m6.f3769h;
                        if (i51 == 8) {
                            c1017f8.mo2462d(i49);
                            c1017f7.mo2462d(i49);
                        } else {
                            if (i50 > 0 && i50 >= i9) {
                                i49 = z2 ? i49 - c1017f8.f3749f : i49 + c1017f8.f3749f;
                            }
                            if (z2) {
                                c1017f7.mo2462d(i49);
                            } else {
                                c1017f8.mo2462d(i49);
                            }
                            C1018g c1018g5 = abstractC1024m6.f3766e;
                            int i52 = c1018g5.f3750g;
                            if (abstractC1024m6.f3765d == 3 && abstractC1024m6.f3762a == 1) {
                                i52 = c1018g5.f3756m;
                            }
                            i49 = z2 ? i49 - i52 : i49 + i52;
                            if (z2) {
                                c1017f8.mo2462d(i49);
                            } else {
                                c1017f7.mo2462d(i49);
                            }
                            if (i50 < i18 && i50 < i2) {
                                i49 = z2 ? i49 - (-c1017f7.f3749f) : i49 + (-c1017f7.f3749f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: d */
    public final void mo2446d() {
        ArrayList arrayList = this.f3734k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC1024m) it.next()).mo2446d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C0999d c0999d = ((AbstractC1024m) arrayList.get(0)).f3763b;
        C0999d c0999d2 = ((AbstractC1024m) arrayList.get(size - 1)).f3763b;
        int i2 = this.f3767f;
        C1017f c1017f = this.f3770i;
        C1017f c1017f2 = this.f3769h;
        if (i2 == 0) {
            C0998c c0998c = c0999d.f3636x;
            C0998c c0998c2 = c0999d2.f3638z;
            C1017f c1017fM2472i = AbstractC1024m.m2472i(c0998c, 0);
            int iM2390c = c0998c.m2390c();
            C0999d c0999dM2451m = m2451m();
            if (c0999dM2451m != null) {
                iM2390c = c0999dM2451m.f3636x.m2390c();
            }
            if (c1017fM2472i != null) {
                AbstractC1024m.m2470b(c1017f2, c1017fM2472i, iM2390c);
            }
            C1017f c1017fM2472i2 = AbstractC1024m.m2472i(c0998c2, 0);
            int iM2390c2 = c0998c2.m2390c();
            C0999d c0999dM2452n = m2452n();
            if (c0999dM2452n != null) {
                iM2390c2 = c0999dM2452n.f3638z.m2390c();
            }
            if (c1017fM2472i2 != null) {
                AbstractC1024m.m2470b(c1017f, c1017fM2472i2, -iM2390c2);
            }
        } else {
            C0998c c0998c3 = c0999d.f3637y;
            C0998c c0998c4 = c0999d2.f3584A;
            C1017f c1017fM2472i3 = AbstractC1024m.m2472i(c0998c3, 1);
            int iM2390c3 = c0998c3.m2390c();
            C0999d c0999dM2451m2 = m2451m();
            if (c0999dM2451m2 != null) {
                iM2390c3 = c0999dM2451m2.f3637y.m2390c();
            }
            if (c1017fM2472i3 != null) {
                AbstractC1024m.m2470b(c1017f2, c1017fM2472i3, iM2390c3);
            }
            C1017f c1017fM2472i4 = AbstractC1024m.m2472i(c0998c4, 1);
            int iM2390c4 = c0998c4.m2390c();
            C0999d c0999dM2452n2 = m2452n();
            if (c0999dM2452n2 != null) {
                iM2390c4 = c0999dM2452n2.f3584A.m2390c();
            }
            if (c1017fM2472i4 != null) {
                AbstractC1024m.m2470b(c1017f, c1017fM2472i4, -iM2390c4);
            }
        }
        c1017f2.f3744a = this;
        c1017f.f3744a = this;
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: e */
    public final void mo2447e() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f3734k;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((AbstractC1024m) arrayList.get(i2)).mo2447e();
            i2++;
        }
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: f */
    public final void mo2448f() {
        this.f3764c = null;
        Iterator it = this.f3734k.iterator();
        while (it.hasNext()) {
            ((AbstractC1024m) it.next()).mo2448f();
        }
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: j */
    public final long mo2449j() {
        ArrayList arrayList = this.f3734k;
        int size = arrayList.size();
        long jMo2449j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC1024m abstractC1024m = (AbstractC1024m) arrayList.get(i2);
            jMo2449j = ((long) abstractC1024m.f3770i.f3749f) + abstractC1024m.mo2449j() + jMo2449j + ((long) abstractC1024m.f3769h.f3749f);
        }
        return jMo2449j;
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: k */
    public final boolean mo2450k() {
        ArrayList arrayList = this.f3734k;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!((AbstractC1024m) arrayList.get(i2)).mo2450k()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final C0999d m2451m() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f3734k;
            if (i2 >= arrayList.size()) {
                return null;
            }
            C0999d c0999d = ((AbstractC1024m) arrayList.get(i2)).f3763b;
            if (c0999d.f3605V != 8) {
                return c0999d;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: n */
    public final C0999d m2452n() {
        ArrayList arrayList = this.f3734k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0999d c0999d = ((AbstractC1024m) arrayList.get(size)).f3763b;
            if (c0999d.f3605V != 8) {
                return c0999d;
            }
        }
        return null;
    }

    public final String toString() {
        String strConcat = "ChainRun ".concat(this.f3767f == 0 ? "horizontal : " : "vertical : ");
        for (AbstractC1024m abstractC1024m : this.f3734k) {
            strConcat = AbstractC0324d.m722e(AbstractC0324d.m722e(strConcat, "<") + abstractC1024m, "> ");
        }
        return strConcat;
    }
}
