package p000a;

import java.util.ArrayList;
import java.util.Iterator;
import p000a.C0240N3;

/* JADX INFO: renamed from: a.U2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0364U2 extends AbstractC0639ih {

    /* JADX INFO: renamed from: k */
    public final ArrayList<AbstractC0639ih> f1364k;

    /* JADX INFO: renamed from: l */
    public int f1365l;

    public C0364U2(C0240N3 c0240n3, int i) {
        C0240N3 c0240n32;
        super(c0240n3);
        this.f1364k = new ArrayList<>();
        this.f2347f = i;
        C0240N3 c0240n33 = this.f2343b;
        C0240N3 c0240n3M647k = c0240n33.m647k(i);
        while (true) {
            C0240N3 c0240n34 = c0240n3M647k;
            c0240n32 = c0240n33;
            c0240n33 = c0240n34;
            if (c0240n33 == null) {
                break;
            } else {
                c0240n3M647k = c0240n33.m647k(this.f2347f);
            }
        }
        this.f2343b = c0240n32;
        int i2 = this.f2347f;
        AbstractC0639ih abstractC0639ih = i2 == 0 ? c0240n32.f815d : i2 == 1 ? c0240n32.f817e : null;
        ArrayList<AbstractC0639ih> arrayList = this.f1364k;
        arrayList.add(abstractC0639ih);
        C0240N3 c0240n3M646j = c0240n32.m646j(this.f2347f);
        while (c0240n3M646j != null) {
            int i3 = this.f2347f;
            arrayList.add(i3 == 0 ? c0240n3M646j.f815d : i3 == 1 ? c0240n3M646j.f817e : null);
            c0240n3M646j = c0240n3M646j.m646j(this.f2347f);
        }
        for (AbstractC0639ih abstractC0639ih2 : arrayList) {
            int i4 = this.f2347f;
            if (i4 == 0) {
                abstractC0639ih2.f2343b.f811b = this;
            } else if (i4 == 1) {
                abstractC0639ih2.f2343b.f813c = this;
            }
        }
        if (this.f2347f == 0 && ((C0258O3) this.f2343b.f793K).f930i0 && arrayList.size() > 1) {
            this.f2343b = arrayList.get(arrayList.size() - 1).f2343b;
        }
        this.f1365l = this.f2347f == 0 ? this.f2343b.f808Z : this.f2343b.f810a0;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01c9 A[PHI: r1 r28
  0x01c9: PHI (r1v58 int) = (r1v56 int), (r1v61 int) binds: [B:121:0x01c7, B:112:0x01a7] A[DONT_GENERATE, DONT_INLINE]
  0x01c9: PHI (r28v1 int) = (r28v0 int), (r28v3 int) binds: [B:121:0x01c7, B:112:0x01a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015d  */
    @Override // p000a.AbstractC0639ih, p000a.InterfaceC0348T4
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo521a(InterfaceC0348T4 interfaceC0348T4) {
        int i;
        C0240N3.a aVar;
        boolean z;
        float f;
        int i2;
        int i3;
        int i4;
        int i5;
        float f2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iMax;
        int i12;
        int i13;
        boolean z2;
        int i14;
        int i15;
        C0384V4 c0384v4 = this.f2349h;
        if (c0384v4.f1452j) {
            C0384V4 c0384v42 = this.f2350i;
            if (c0384v42.f1452j) {
                C0240N3 c0240n3 = this.f2343b.f793K;
                boolean z3 = (c0240n3 == null || !(c0240n3 instanceof C0258O3)) ? false : ((C0258O3) c0240n3).f930i0;
                int i16 = c0384v42.f1449g - c0384v4.f1449g;
                ArrayList<AbstractC0639ih> arrayList = this.f1364k;
                int size = arrayList.size();
                int i17 = 0;
                while (true) {
                    i = -1;
                    if (i17 >= size) {
                        i17 = -1;
                        break;
                    } else if (arrayList.get(i17).f2343b.f806X != 8) {
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
                    if (arrayList.get(i19).f2343b.f806X != 8) {
                        i = i19;
                        break;
                    }
                    i19--;
                }
                int i20 = 0;
                while (true) {
                    aVar = C0240N3.a.f841c;
                    if (i20 >= 2) {
                        z = z3;
                        f = 0.0f;
                        i2 = 0;
                        i3 = 0;
                        i4 = 0;
                        break;
                    }
                    f = 0.0f;
                    int i21 = 0;
                    i4 = 0;
                    i12 = 0;
                    i13 = 0;
                    while (i21 < size) {
                        AbstractC0639ih abstractC0639ih = arrayList.get(i21);
                        C0240N3 c0240n32 = abstractC0639ih.f2343b;
                        boolean z4 = z3;
                        int i22 = i20;
                        if (c0240n32.f806X != 8) {
                            i13++;
                            if (i21 > 0 && i21 >= i17) {
                                i4 += abstractC0639ih.f2349h.f1448f;
                            }
                            C0684l5 c0684l5 = abstractC0639ih.f2346e;
                            int i23 = c0684l5.f1449g;
                            boolean z5 = abstractC0639ih.f2345d != aVar;
                            if (z5) {
                                int i24 = this.f2347f;
                                z2 = z5;
                                if (i24 == 0 && !c0240n32.f815d.f2346e.f1452j) {
                                    return;
                                }
                                if (i24 == 1 && !c0240n32.f817e.f2346e.f1452j) {
                                    return;
                                } else {
                                    i14 = i4;
                                }
                            } else {
                                z2 = z5;
                                i14 = i4;
                                if (abstractC0639ih.f2342a == 1 && i22 == 0) {
                                    i15 = c0684l5.f2547m;
                                    i12++;
                                } else if (c0684l5.f1452j) {
                                    i15 = i23;
                                }
                                z2 = true;
                                if (z2) {
                                    i12++;
                                    float f3 = c0240n32.f812b0[this.f2347f];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                    i4 = i14;
                                } else {
                                    i4 = i14 + i15;
                                }
                                if (i21 >= i18 && i21 < i) {
                                    i4 += -abstractC0639ih.f2350i.f1448f;
                                }
                            }
                            i15 = i23;
                            if (z2) {
                            }
                            if (i21 >= i18) {
                            }
                        }
                        i21++;
                        z3 = z4;
                        i20 = i22;
                    }
                    z = z3;
                    int i25 = i20;
                    if (i4 < i16 || i12 == 0) {
                        break;
                    }
                    i20 = i25 + 1;
                    z3 = z;
                }
                i2 = i12;
                i3 = i13;
                int i26 = c0384v4.f1449g;
                if (z) {
                    i26 = c0384v42.f1449g;
                }
                float f4 = 0.5f;
                if (i4 > i16) {
                    i26 = z ? i26 + ((int) (((i4 - i16) / 2.0f) + 0.5f)) : i26 - ((int) (((i4 - i16) / 2.0f) + 0.5f));
                }
                if (i2 > 0) {
                    float f5 = i16 - i4;
                    int i27 = (int) ((f5 / i2) + 0.5f);
                    int i28 = 0;
                    int i29 = 0;
                    while (i28 < size) {
                        float f6 = f4;
                        AbstractC0639ih abstractC0639ih2 = arrayList.get(i28);
                        int i30 = i26;
                        C0240N3 c0240n33 = abstractC0639ih2.f2343b;
                        int i31 = i2;
                        float f7 = f5;
                        if (c0240n33.f806X != 8 && abstractC0639ih2.f2345d == aVar) {
                            C0684l5 c0684l52 = abstractC0639ih2.f2346e;
                            if (c0684l52.f1452j) {
                                i10 = i27;
                                i11 = i28;
                            } else {
                                if (f > 0.0f) {
                                    i9 = (int) (((c0240n33.f812b0[this.f2347f] * f7) / f) + f6);
                                    i10 = i27;
                                } else {
                                    i9 = i27;
                                    i10 = i9;
                                }
                                if (this.f2347f == 0) {
                                    int i32 = c0240n33.f826n;
                                    i11 = i28;
                                    iMax = Math.max(c0240n33.f825m, abstractC0639ih2.f2342a == 1 ? Math.min(i9, c0684l52.f2547m) : i9);
                                    if (i32 > 0) {
                                        iMax = Math.min(i32, iMax);
                                    }
                                    if (iMax != i9) {
                                        i29++;
                                        i9 = iMax;
                                    }
                                    c0684l52.mo1014d(i9);
                                } else {
                                    i11 = i28;
                                    int i33 = c0240n33.f829q;
                                    iMax = Math.max(c0240n33.f828p, abstractC0639ih2.f2342a == 1 ? Math.min(i9, c0684l52.f2547m) : i9);
                                    if (i33 > 0) {
                                        iMax = Math.min(i33, iMax);
                                    }
                                    if (iMax != i9) {
                                    }
                                    c0684l52.mo1014d(i9);
                                }
                            }
                        }
                        i28 = i11 + 1;
                        i26 = i30;
                        f4 = f6;
                        i2 = i31;
                        f5 = f7;
                        i27 = i10;
                    }
                    i5 = i26;
                    f2 = f4;
                    int i34 = i2;
                    if (i29 > 0) {
                        i2 = i34 - i29;
                        i4 = 0;
                        for (int i35 = 0; i35 < size; i35++) {
                            AbstractC0639ih abstractC0639ih3 = arrayList.get(i35);
                            if (abstractC0639ih3.f2343b.f806X != 8) {
                                if (i35 > 0 && i35 >= i17) {
                                    i4 += abstractC0639ih3.f2349h.f1448f;
                                }
                                i4 += abstractC0639ih3.f2346e.f1449g;
                                if (i35 < i18 && i35 < i) {
                                    i4 += -abstractC0639ih3.f2350i.f1448f;
                                }
                            }
                        }
                    } else {
                        i2 = i34;
                    }
                    i7 = 2;
                    if (this.f1365l == 2 && i29 == 0) {
                        i6 = 0;
                        this.f1365l = 0;
                    } else {
                        i6 = 0;
                    }
                } else {
                    i5 = i26;
                    f2 = 0.5f;
                    i6 = 0;
                    i7 = 2;
                }
                if (i4 > i16) {
                    this.f1365l = i7;
                }
                if (i3 > 0 && i2 == 0 && i17 == i) {
                    this.f1365l = i7;
                }
                int i36 = this.f1365l;
                if (i36 == 1) {
                    int i37 = i3 > 1 ? (i16 - i4) / (i3 - 1) : i3 == 1 ? (i16 - i4) / 2 : i6;
                    if (i2 > 0) {
                        i37 = i6;
                    }
                    int i38 = i5;
                    for (int i39 = i6; i39 < size; i39++) {
                        AbstractC0639ih abstractC0639ih4 = arrayList.get(z ? size - (i39 + 1) : i39);
                        int i40 = abstractC0639ih4.f2343b.f806X;
                        C0384V4 c0384v43 = abstractC0639ih4.f2350i;
                        C0384V4 c0384v44 = abstractC0639ih4.f2349h;
                        if (i40 == 8) {
                            c0384v44.mo1014d(i38);
                            c0384v43.mo1014d(i38);
                        } else {
                            if (i39 > 0) {
                                i38 = z ? i38 - i37 : i38 + i37;
                            }
                            if (i39 > 0 && i39 >= i17) {
                                i38 = z ? i38 - c0384v44.f1448f : i38 + c0384v44.f1448f;
                            }
                            if (z) {
                                c0384v43.mo1014d(i38);
                            } else {
                                c0384v44.mo1014d(i38);
                            }
                            C0684l5 c0684l53 = abstractC0639ih4.f2346e;
                            int i41 = c0684l53.f1449g;
                            if (abstractC0639ih4.f2345d == aVar) {
                                i8 = i38;
                                if (abstractC0639ih4.f2342a == 1) {
                                    i41 = c0684l53.f2547m;
                                }
                            } else {
                                i8 = i38;
                            }
                            i38 = z ? i8 - i41 : i8 + i41;
                            if (z) {
                                c0384v44.mo1014d(i38);
                            } else {
                                c0384v43.mo1014d(i38);
                            }
                            abstractC0639ih4.f2348g = true;
                            if (i39 < i18 && i39 < i) {
                                i38 = z ? i38 - (-c0384v43.f1448f) : i38 + (-c0384v43.f1448f);
                            }
                        }
                    }
                    return;
                }
                if (i36 == 0) {
                    int i42 = (i16 - i4) / (i3 + 1);
                    if (i2 > 0) {
                        i42 = i6;
                    }
                    int i43 = i5;
                    for (int i44 = i6; i44 < size; i44++) {
                        AbstractC0639ih abstractC0639ih5 = arrayList.get(z ? size - (i44 + 1) : i44);
                        int i45 = abstractC0639ih5.f2343b.f806X;
                        C0384V4 c0384v45 = abstractC0639ih5.f2350i;
                        C0384V4 c0384v46 = abstractC0639ih5.f2349h;
                        if (i45 == 8) {
                            c0384v46.mo1014d(i43);
                            c0384v45.mo1014d(i43);
                        } else {
                            int i46 = z ? i43 - i42 : i43 + i42;
                            if (i44 > 0 && i44 >= i17) {
                                i46 = z ? i46 - c0384v46.f1448f : i46 + c0384v46.f1448f;
                            }
                            if (z) {
                                c0384v45.mo1014d(i46);
                            } else {
                                c0384v46.mo1014d(i46);
                            }
                            C0684l5 c0684l54 = abstractC0639ih5.f2346e;
                            int iMin = c0684l54.f1449g;
                            if (abstractC0639ih5.f2345d == aVar && abstractC0639ih5.f2342a == 1) {
                                iMin = Math.min(iMin, c0684l54.f2547m);
                            }
                            i43 = z ? i46 - iMin : i46 + iMin;
                            if (z) {
                                c0384v46.mo1014d(i43);
                            } else {
                                c0384v45.mo1014d(i43);
                            }
                            if (i44 < i18 && i44 < i) {
                                i43 = z ? i43 - (-c0384v45.f1448f) : i43 + (-c0384v45.f1448f);
                            }
                        }
                    }
                    return;
                }
                if (i36 == 2) {
                    float f8 = this.f2347f == 0 ? this.f2343b.f803U : this.f2343b.f804V;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i47 = (int) (((i16 - i4) * f8) + f2);
                    if (i47 < 0 || i2 > 0) {
                        i47 = i6;
                    }
                    int i48 = z ? i5 - i47 : i5 + i47;
                    for (int i49 = i6; i49 < size; i49++) {
                        AbstractC0639ih abstractC0639ih6 = arrayList.get(z ? size - (i49 + 1) : i49);
                        int i50 = abstractC0639ih6.f2343b.f806X;
                        C0384V4 c0384v47 = abstractC0639ih6.f2350i;
                        C0384V4 c0384v48 = abstractC0639ih6.f2349h;
                        if (i50 == 8) {
                            c0384v48.mo1014d(i48);
                            c0384v47.mo1014d(i48);
                        } else {
                            if (i49 > 0 && i49 >= i17) {
                                i48 = z ? i48 - c0384v48.f1448f : i48 + c0384v48.f1448f;
                            }
                            if (z) {
                                c0384v47.mo1014d(i48);
                            } else {
                                c0384v48.mo1014d(i48);
                            }
                            C0684l5 c0684l55 = abstractC0639ih6.f2346e;
                            int i51 = c0684l55.f1449g;
                            if (abstractC0639ih6.f2345d == aVar && abstractC0639ih6.f2342a == 1) {
                                i51 = c0684l55.f2547m;
                            }
                            i48 = z ? i48 - i51 : i48 + i51;
                            if (z) {
                                c0384v48.mo1014d(i48);
                            } else {
                                c0384v47.mo1014d(i48);
                            }
                            if (i49 < i18 && i49 < i) {
                                i48 = z ? i48 - (-c0384v47.f1448f) : i48 + (-c0384v47.f1448f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p000a.AbstractC0639ih
    /* JADX INFO: renamed from: d */
    public final void mo522d() {
        ArrayList<AbstractC0639ih> arrayList = this.f1364k;
        Iterator<AbstractC0639ih> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().mo522d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C0240N3 c0240n3 = arrayList.get(0).f2343b;
        C0240N3 c0240n32 = arrayList.get(size - 1).f2343b;
        int i = this.f2347f;
        C0384V4 c0384v4 = this.f2350i;
        C0384V4 c0384v42 = this.f2349h;
        if (i == 0) {
            C0222M3 c0222m3 = c0240n3.f837y;
            C0222M3 c0222m32 = c0240n32.f783A;
            C0384V4 c0384v4M1502i = AbstractC0639ih.m1502i(c0222m3, 0);
            int iM600c = c0222m3.m600c();
            C0240N3 c0240n3M979m = m979m();
            if (c0240n3M979m != null) {
                iM600c = c0240n3M979m.f837y.m600c();
            }
            if (c0384v4M1502i != null) {
                AbstractC0639ih.m1500b(c0384v42, c0384v4M1502i, iM600c);
            }
            C0384V4 c0384v4M1502i2 = AbstractC0639ih.m1502i(c0222m32, 0);
            int iM600c2 = c0222m32.m600c();
            C0240N3 c0240n3M980n = m980n();
            if (c0240n3M980n != null) {
                iM600c2 = c0240n3M980n.f783A.m600c();
            }
            if (c0384v4M1502i2 != null) {
                AbstractC0639ih.m1500b(c0384v4, c0384v4M1502i2, -iM600c2);
            }
        } else {
            C0222M3 c0222m33 = c0240n3.f838z;
            C0222M3 c0222m34 = c0240n32.f784B;
            C0384V4 c0384v4M1502i3 = AbstractC0639ih.m1502i(c0222m33, 1);
            int iM600c3 = c0222m33.m600c();
            C0240N3 c0240n3M979m2 = m979m();
            if (c0240n3M979m2 != null) {
                iM600c3 = c0240n3M979m2.f838z.m600c();
            }
            if (c0384v4M1502i3 != null) {
                AbstractC0639ih.m1500b(c0384v42, c0384v4M1502i3, iM600c3);
            }
            C0384V4 c0384v4M1502i4 = AbstractC0639ih.m1502i(c0222m34, 1);
            int iM600c4 = c0222m34.m600c();
            C0240N3 c0240n3M980n2 = m980n();
            if (c0240n3M980n2 != null) {
                iM600c4 = c0240n3M980n2.f784B.m600c();
            }
            if (c0384v4M1502i4 != null) {
                AbstractC0639ih.m1500b(c0384v4, c0384v4M1502i4, -iM600c4);
            }
        }
        c0384v42.f1443a = this;
        c0384v4.f1443a = this;
    }

    @Override // p000a.AbstractC0639ih
    /* JADX INFO: renamed from: e */
    public final void mo523e() {
        int i = 0;
        while (true) {
            ArrayList<AbstractC0639ih> arrayList = this.f1364k;
            if (i >= arrayList.size()) {
                return;
            }
            arrayList.get(i).mo523e();
            i++;
        }
    }

    @Override // p000a.AbstractC0639ih
    /* JADX INFO: renamed from: f */
    public final void mo524f() {
        this.f2344c = null;
        Iterator<AbstractC0639ih> it = this.f1364k.iterator();
        while (it.hasNext()) {
            it.next().mo524f();
        }
    }

    @Override // p000a.AbstractC0639ih
    /* JADX INFO: renamed from: j */
    public final long mo978j() {
        ArrayList<AbstractC0639ih> arrayList = this.f1364k;
        int size = arrayList.size();
        long jMo978j = 0;
        for (int i = 0; i < size; i++) {
            AbstractC0639ih abstractC0639ih = arrayList.get(i);
            jMo978j = ((long) abstractC0639ih.f2350i.f1448f) + abstractC0639ih.mo978j() + jMo978j + ((long) abstractC0639ih.f2349h.f1448f);
        }
        return jMo978j;
    }

    @Override // p000a.AbstractC0639ih
    /* JADX INFO: renamed from: k */
    public final boolean mo525k() {
        ArrayList<AbstractC0639ih> arrayList = this.f1364k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!arrayList.get(i).mo525k()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final C0240N3 m979m() {
        int i = 0;
        while (true) {
            ArrayList<AbstractC0639ih> arrayList = this.f1364k;
            if (i >= arrayList.size()) {
                return null;
            }
            C0240N3 c0240n3 = arrayList.get(i).f2343b;
            if (c0240n3.f806X != 8) {
                return c0240n3;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: n */
    public final C0240N3 m980n() {
        ArrayList<AbstractC0639ih> arrayList = this.f1364k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0240N3 c0240n3 = arrayList.get(size).f2343b;
            if (c0240n3.f806X != 8) {
                return c0240n3;
            }
        }
        return null;
    }

    public final String toString() {
        String strConcat = "ChainRun ".concat(this.f2347f == 0 ? "horizontal : " : "vertical : ");
        for (AbstractC0639ih abstractC0639ih : this.f1364k) {
            strConcat = C0944z.m2226f(C0944z.m2226f(strConcat, "<") + abstractC0639ih, "> ");
        }
        return strConcat;
    }
}
