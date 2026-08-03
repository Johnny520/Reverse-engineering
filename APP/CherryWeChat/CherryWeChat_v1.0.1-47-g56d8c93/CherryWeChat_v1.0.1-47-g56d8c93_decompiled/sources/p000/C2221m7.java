package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: m7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2221m7 extends AbstractC1449gF {

    /* JADX INFO: renamed from: k */
    public final ArrayList f7717k;

    /* JADX INFO: renamed from: l */
    public int f7718l;

    public C2221m7(C2454rb c2454rb, int i) {
        C2454rb c2454rb2;
        super(c2454rb);
        ArrayList<AbstractC1449gF> arrayList = new ArrayList();
        this.f7717k = arrayList;
        this.f5062f = i;
        C2454rb c2454rb3 = this.f5058b;
        C2454rb c2454rbM4935m = c2454rb3.m4935m(i);
        while (true) {
            c2454rb2 = c2454rb3;
            c2454rb3 = c2454rbM4935m;
            if (c2454rb3 == null) {
                break;
            } else {
                c2454rbM4935m = c2454rb3.m4935m(this.f5062f);
            }
        }
        this.f5058b = c2454rb2;
        int i2 = this.f5062f;
        arrayList.add(i2 == 0 ? c2454rb2.f8612d : i2 == 1 ? c2454rb2.f8614e : null);
        C2454rb c2454rbM4934l = c2454rb2.m4934l(this.f5062f);
        while (c2454rbM4934l != null) {
            int i3 = this.f5062f;
            arrayList.add(i3 == 0 ? c2454rbM4934l.f8612d : i3 == 1 ? c2454rbM4934l.f8614e : null);
            c2454rbM4934l = c2454rbM4934l.m4934l(this.f5062f);
        }
        for (AbstractC1449gF abstractC1449gF : arrayList) {
            int i4 = this.f5062f;
            if (i4 == 0) {
                abstractC1449gF.f5058b.f8608b = this;
            } else if (i4 == 1) {
                abstractC1449gF.f5058b.f8610c = this;
            }
        }
        if (this.f5062f == 0 && ((C2497sb) this.f5058b.f8599T).f8779v0 && arrayList.size() > 1) {
            this.f5058b = ((AbstractC1449gF) arrayList.get(arrayList.size() - 1)).f5058b;
        }
        this.f7718l = this.f5062f == 0 ? this.f5058b.f8623i0 : this.f5058b.f8625j0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // p000.InterfaceC2542td
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1546a(InterfaceC2542td interfaceC2542td) {
        int i;
        int i2;
        boolean z;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        int i13;
        C2628vd c2628vd = this.f5064h;
        if (c2628vd.f9119j) {
            C2628vd c2628vd2 = this.f5065i;
            if (c2628vd2.f9119j) {
                C2454rb c2454rb = this.f5058b.f8599T;
                boolean z3 = c2454rb instanceof C2497sb ? ((C2497sb) c2454rb).f8779v0 : false;
                int i14 = c2628vd2.f9116g - c2628vd.f9116g;
                ArrayList arrayList = this.f7717k;
                int size = arrayList.size();
                int i15 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i15 >= size) {
                        i15 = -1;
                        break;
                    } else if (((AbstractC1449gF) arrayList.get(i15)).f5058b.f8619g0 != 8) {
                        break;
                    } else {
                        i15++;
                    }
                }
                int i16 = size - 1;
                int i17 = i16;
                while (true) {
                    if (i17 < 0) {
                        break;
                    }
                    if (((AbstractC1449gF) arrayList.get(i17)).f5058b.f8619g0 != 8) {
                        i = i17;
                        break;
                    }
                    i17--;
                }
                int i18 = 0;
                while (i18 < 2) {
                    f = 0.0f;
                    int i19 = 0;
                    i5 = 0;
                    int i20 = 0;
                    int i21 = 0;
                    while (i19 < size) {
                        AbstractC1449gF abstractC1449gF = (AbstractC1449gF) arrayList.get(i19);
                        C2454rb c2454rb2 = abstractC1449gF.f5058b;
                        boolean z4 = z3;
                        if (c2454rb2.f8619g0 == i2) {
                            i12 = i18;
                        } else {
                            i21++;
                            if (i19 > 0 && i19 >= i15) {
                                i5 += abstractC1449gF.f5064h.f9115f;
                            }
                            C0750Rd c0750Rd = abstractC1449gF.f5061e;
                            int i22 = c0750Rd.f9116g;
                            i12 = i18;
                            boolean z5 = abstractC1449gF.f5060d != 3;
                            if (z5) {
                                int i23 = this.f5062f;
                                if (i23 == 0 && !c2454rb2.f8612d.f5061e.f9119j) {
                                    return;
                                }
                                if (i23 == 1 && !c2454rb2.f8614e.f5061e.f9119j) {
                                    return;
                                } else {
                                    z2 = z5;
                                }
                            } else {
                                z2 = z5;
                                if (abstractC1449gF.f5057a == 1 && i12 == 0) {
                                    i13 = c0750Rd.f2386m;
                                    i20++;
                                } else if (c0750Rd.f9119j) {
                                    i13 = i22;
                                }
                                z2 = true;
                                if (z2) {
                                    i20++;
                                    float f3 = c2454rb2.f8627k0[this.f5062f];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                } else {
                                    i5 += i13;
                                }
                                if (i19 >= i16 && i19 < i) {
                                    i5 += -abstractC1449gF.f5065i.f9115f;
                                }
                            }
                            i13 = i22;
                            if (z2) {
                            }
                            if (i19 >= i16) {
                            }
                        }
                        i19++;
                        z3 = z4;
                        i18 = i12;
                        i2 = 8;
                    }
                    z = z3;
                    int i24 = i18;
                    if (i5 < i14 || i20 == 0) {
                        i3 = i20;
                        i4 = i21;
                        break;
                    } else {
                        i18 = i24 + 1;
                        z3 = z;
                        i2 = 8;
                    }
                }
                z = z3;
                f = 0.0f;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                int i25 = c2628vd.f9116g;
                if (z) {
                    i25 = c2628vd2.f9116g;
                }
                float f4 = 0.5f;
                if (i5 > i14) {
                    i25 = z ? i25 + ((int) (((i5 - i14) / 2.0f) + 0.5f)) : i25 - ((int) (((i5 - i14) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f5 = i14 - i5;
                    int i26 = (int) ((f5 / i3) + 0.5f);
                    int i27 = 0;
                    int i28 = 0;
                    while (i27 < size) {
                        float f6 = f4;
                        AbstractC1449gF abstractC1449gF2 = (AbstractC1449gF) arrayList.get(i27);
                        int i29 = i25;
                        C2454rb c2454rb3 = abstractC1449gF2.f5058b;
                        int i30 = i3;
                        C0750Rd c0750Rd2 = abstractC1449gF2.f5061e;
                        float f7 = f5;
                        int i31 = i26;
                        if (c2454rb3.f8619g0 == 8 || abstractC1449gF2.f5060d != 3 || c0750Rd2.f9119j) {
                            i11 = i27;
                        } else {
                            int i32 = f > 0.0f ? (int) (((c2454rb3.f8627k0[this.f5062f] * f7) / f) + f6) : i31;
                            if (this.f5062f == 0) {
                                i9 = c2454rb3.f8643v;
                                i10 = c2454rb3.f8642u;
                            } else {
                                i9 = c2454rb3.f8646y;
                                i10 = c2454rb3.f8645x;
                            }
                            i11 = i27;
                            int iMax = Math.max(i10, abstractC1449gF2.f5057a == 1 ? Math.min(i32, c0750Rd2.f2386m) : i32);
                            if (i9 > 0) {
                                iMax = Math.min(i9, iMax);
                            }
                            if (iMax != i32) {
                                i28++;
                                i32 = iMax;
                            }
                            c0750Rd2.mo1539d(i32);
                        }
                        i27 = i11 + 1;
                        i25 = i29;
                        f4 = f6;
                        i3 = i30;
                        f5 = f7;
                        i26 = i31;
                    }
                    i6 = i25;
                    f2 = f4;
                    int i33 = i3;
                    if (i28 > 0) {
                        i3 = i33 - i28;
                        i5 = 0;
                        for (int i34 = 0; i34 < size; i34++) {
                            AbstractC1449gF abstractC1449gF3 = (AbstractC1449gF) arrayList.get(i34);
                            if (abstractC1449gF3.f5058b.f8619g0 != 8) {
                                if (i34 > 0 && i34 >= i15) {
                                    i5 += abstractC1449gF3.f5064h.f9115f;
                                }
                                i5 += abstractC1449gF3.f5061e.f9116g;
                                if (i34 < i16 && i34 < i) {
                                    i5 += -abstractC1449gF3.f5065i.f9115f;
                                }
                            }
                        }
                    } else {
                        i3 = i33;
                    }
                    i8 = 2;
                    if (this.f7718l == 2 && i28 == 0) {
                        i7 = 0;
                        this.f7718l = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i25;
                    f2 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i5 > i14) {
                    this.f7718l = i8;
                }
                if (i4 > 0 && i3 == 0 && i15 == i) {
                    this.f7718l = i8;
                }
                int i35 = this.f7718l;
                if (i35 == 1) {
                    int i36 = i4 > 1 ? (i14 - i5) / (i4 - 1) : i4 == 1 ? (i14 - i5) / 2 : i7;
                    if (i3 > 0) {
                        i36 = i7;
                    }
                    int i37 = i6;
                    for (int i38 = i7; i38 < size; i38++) {
                        AbstractC1449gF abstractC1449gF4 = (AbstractC1449gF) arrayList.get(z ? size - (i38 + 1) : i38);
                        C2454rb c2454rb4 = abstractC1449gF4.f5058b;
                        C2628vd c2628vd3 = abstractC1449gF4.f5065i;
                        C2628vd c2628vd4 = abstractC1449gF4.f5064h;
                        if (c2454rb4.f8619g0 == 8) {
                            c2628vd4.mo1539d(i37);
                            c2628vd3.mo1539d(i37);
                        } else {
                            if (i38 > 0) {
                                i37 = z ? i37 - i36 : i37 + i36;
                            }
                            if (i38 > 0 && i38 >= i15) {
                                i37 = z ? i37 - c2628vd4.f9115f : i37 + c2628vd4.f9115f;
                            }
                            if (z) {
                                c2628vd3.mo1539d(i37);
                            } else {
                                c2628vd4.mo1539d(i37);
                            }
                            C0750Rd c0750Rd3 = abstractC1449gF4.f5061e;
                            int i39 = c0750Rd3.f9116g;
                            if (abstractC1449gF4.f5060d == 3 && abstractC1449gF4.f5057a == 1) {
                                i39 = c0750Rd3.f2386m;
                            }
                            i37 = z ? i37 - i39 : i37 + i39;
                            if (z) {
                                c2628vd4.mo1539d(i37);
                            } else {
                                c2628vd3.mo1539d(i37);
                            }
                            abstractC1449gF4.f5063g = true;
                            if (i38 < i16 && i38 < i) {
                                i37 = z ? i37 - (-c2628vd3.f9115f) : i37 + (-c2628vd3.f9115f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 0) {
                    int i40 = (i14 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i40 = i7;
                    }
                    int i41 = i6;
                    for (int i42 = i7; i42 < size; i42++) {
                        AbstractC1449gF abstractC1449gF5 = (AbstractC1449gF) arrayList.get(z ? size - (i42 + 1) : i42);
                        C2454rb c2454rb5 = abstractC1449gF5.f5058b;
                        C2628vd c2628vd5 = abstractC1449gF5.f5065i;
                        C2628vd c2628vd6 = abstractC1449gF5.f5064h;
                        if (c2454rb5.f8619g0 == 8) {
                            c2628vd6.mo1539d(i41);
                            c2628vd5.mo1539d(i41);
                        } else {
                            int i43 = z ? i41 - i40 : i41 + i40;
                            if (i42 > 0 && i42 >= i15) {
                                i43 = z ? i43 - c2628vd6.f9115f : i43 + c2628vd6.f9115f;
                            }
                            if (z) {
                                c2628vd5.mo1539d(i43);
                            } else {
                                c2628vd6.mo1539d(i43);
                            }
                            C0750Rd c0750Rd4 = abstractC1449gF5.f5061e;
                            int iMin = c0750Rd4.f9116g;
                            if (abstractC1449gF5.f5060d == 3 && abstractC1449gF5.f5057a == 1) {
                                iMin = Math.min(iMin, c0750Rd4.f2386m);
                            }
                            i41 = z ? i43 - iMin : i43 + iMin;
                            if (z) {
                                c2628vd6.mo1539d(i41);
                            } else {
                                c2628vd5.mo1539d(i41);
                            }
                            if (i42 < i16 && i42 < i) {
                                i41 = z ? i41 - (-c2628vd5.f9115f) : i41 + (-c2628vd5.f9115f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 2) {
                    float f8 = this.f5062f == 0 ? this.f5058b.f8613d0 : this.f5058b.f8615e0;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i44 = (int) (((i14 - i5) * f8) + f2);
                    if (i44 < 0 || i3 > 0) {
                        i44 = i7;
                    }
                    int i45 = z ? i6 - i44 : i6 + i44;
                    for (int i46 = i7; i46 < size; i46++) {
                        AbstractC1449gF abstractC1449gF6 = (AbstractC1449gF) arrayList.get(z ? size - (i46 + 1) : i46);
                        C2454rb c2454rb6 = abstractC1449gF6.f5058b;
                        C2628vd c2628vd7 = abstractC1449gF6.f5065i;
                        C2628vd c2628vd8 = abstractC1449gF6.f5064h;
                        if (c2454rb6.f8619g0 == 8) {
                            c2628vd8.mo1539d(i45);
                            c2628vd7.mo1539d(i45);
                        } else {
                            if (i46 > 0 && i46 >= i15) {
                                i45 = z ? i45 - c2628vd8.f9115f : i45 + c2628vd8.f9115f;
                            }
                            if (z) {
                                c2628vd7.mo1539d(i45);
                            } else {
                                c2628vd8.mo1539d(i45);
                            }
                            C0750Rd c0750Rd5 = abstractC1449gF6.f5061e;
                            int i47 = c0750Rd5.f9116g;
                            if (abstractC1449gF6.f5060d == 3 && abstractC1449gF6.f5057a == 1) {
                                i47 = c0750Rd5.f2386m;
                            }
                            i45 = z ? i45 - i47 : i45 + i47;
                            if (z) {
                                c2628vd8.mo1539d(i45);
                            } else {
                                c2628vd7.mo1539d(i45);
                            }
                            if (i46 < i16 && i46 < i) {
                                i45 = z ? i45 - (-c2628vd7.f9115f) : i45 + (-c2628vd7.f9115f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: d */
    public final void mo1547d() {
        ArrayList arrayList = this.f7717k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC1449gF) it.next()).mo1547d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C2454rb c2454rb = ((AbstractC1449gF) arrayList.get(0)).f5058b;
        C2454rb c2454rb2 = ((AbstractC1449gF) arrayList.get(size - 1)).f5058b;
        int i = this.f5062f;
        C2628vd c2628vd = this.f5065i;
        C2628vd c2628vd2 = this.f5064h;
        if (i == 0) {
            C1259cb c1259cb = c2454rb.f8588I;
            C1259cb c1259cb2 = c2454rb2.f8590K;
            C2628vd c2628vdM2776i = AbstractC1449gF.m2776i(c1259cb, 0);
            int iM2384e = c1259cb.m2384e();
            C2454rb c2454rbM4472m = m4472m();
            if (c2454rbM4472m != null) {
                iM2384e = c2454rbM4472m.f8588I.m2384e();
            }
            if (c2628vdM2776i != null) {
                AbstractC1449gF.m2774b(c2628vd2, c2628vdM2776i, iM2384e);
            }
            C2628vd c2628vdM2776i2 = AbstractC1449gF.m2776i(c1259cb2, 0);
            int iM2384e2 = c1259cb2.m2384e();
            C2454rb c2454rbM4473n = m4473n();
            if (c2454rbM4473n != null) {
                iM2384e2 = c2454rbM4473n.f8590K.m2384e();
            }
            if (c2628vdM2776i2 != null) {
                AbstractC1449gF.m2774b(c2628vd, c2628vdM2776i2, -iM2384e2);
            }
        } else {
            C1259cb c1259cb3 = c2454rb.f8589J;
            C1259cb c1259cb4 = c2454rb2.f8591L;
            C2628vd c2628vdM2776i3 = AbstractC1449gF.m2776i(c1259cb3, 1);
            int iM2384e3 = c1259cb3.m2384e();
            C2454rb c2454rbM4472m2 = m4472m();
            if (c2454rbM4472m2 != null) {
                iM2384e3 = c2454rbM4472m2.f8589J.m2384e();
            }
            if (c2628vdM2776i3 != null) {
                AbstractC1449gF.m2774b(c2628vd2, c2628vdM2776i3, iM2384e3);
            }
            C2628vd c2628vdM2776i4 = AbstractC1449gF.m2776i(c1259cb4, 1);
            int iM2384e4 = c1259cb4.m2384e();
            C2454rb c2454rbM4473n2 = m4473n();
            if (c2454rbM4473n2 != null) {
                iM2384e4 = c2454rbM4473n2.f8591L.m2384e();
            }
            if (c2628vdM2776i4 != null) {
                AbstractC1449gF.m2774b(c2628vd, c2628vdM2776i4, -iM2384e4);
            }
        }
        c2628vd2.f9110a = this;
        c2628vd.f9110a = this;
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: e */
    public final void mo1548e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f7717k;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC1449gF) arrayList.get(i)).mo1548e();
            i++;
        }
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: f */
    public final void mo1549f() {
        this.f5059c = null;
        Iterator it = this.f7717k.iterator();
        while (it.hasNext()) {
            ((AbstractC1449gF) it.next()).mo1549f();
        }
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: j */
    public final long mo2779j() {
        ArrayList arrayList = this.f7717k;
        int size = arrayList.size();
        long jMo2779j = 0;
        for (int i = 0; i < size; i++) {
            AbstractC1449gF abstractC1449gF = (AbstractC1449gF) arrayList.get(i);
            jMo2779j = ((long) abstractC1449gF.f5065i.f9115f) + abstractC1449gF.mo2779j() + jMo2779j + ((long) abstractC1449gF.f5064h.f9115f);
        }
        return jMo2779j;
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: k */
    public final boolean mo1550k() {
        ArrayList arrayList = this.f7717k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC1449gF) arrayList.get(i)).mo1550k()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final C2454rb m4472m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f7717k;
            if (i >= arrayList.size()) {
                return null;
            }
            C2454rb c2454rb = ((AbstractC1449gF) arrayList.get(i)).f5058b;
            if (c2454rb.f8619g0 != 8) {
                return c2454rb;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: n */
    public final C2454rb m4473n() {
        ArrayList arrayList = this.f7717k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C2454rb c2454rb = ((AbstractC1449gF) arrayList.get(size)).f5058b;
            if (c2454rb.f8619g0 != 8) {
                return c2454rb;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f5062f == 0 ? "horizontal : " : "vertical : ");
        for (AbstractC1449gF abstractC1449gF : this.f7717k) {
            sb.append("<");
            sb.append(abstractC1449gF);
            sb.append("> ");
        }
        return sb.toString();
    }
}
