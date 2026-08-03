package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: Rk */
/* JADX INFO: loaded from: classes.dex */
public final class C0757Rk extends AbstractC1449gF {

    /* JADX INFO: renamed from: k */
    public static final int[] f2406k = new int[2];

    /* JADX INFO: renamed from: m */
    public static void m1545m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // p000.InterfaceC2542td
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1546a(InterfaceC2542td interfaceC2542td) {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0213Ey.m424v(this.f5066j) == 3) {
            C2454rb c2454rb = this.f5058b;
            m2780l(c2454rb.f8588I, c2454rb.f8590K, 0);
            return;
        }
        C0750Rd c0750Rd = this.f5061e;
        boolean z = c0750Rd.f9119j;
        C2628vd c2628vd = this.f5064h;
        C2628vd c2628vd2 = this.f5065i;
        if (z || this.f5060d != 3) {
            f = 0.5f;
        } else {
            C2454rb c2454rb2 = this.f5058b;
            int i2 = c2454rb2.f8639r;
            if (i2 == 2) {
                f = 0.5f;
                C2454rb c2454rb3 = c2454rb2.f8599T;
                if (c2454rb3 != null) {
                    if (c2454rb3.f8612d.f5061e.f9119j) {
                        c0750Rd.mo1539d((int) ((r5.f9116g * c2454rb2.f8644w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = c2454rb2.f8640s;
                if (i3 == 0 || i3 == 3) {
                    C0830TD c0830td = c2454rb2.f8614e;
                    C2628vd c2628vd3 = c0830td.f5064h;
                    C2628vd c2628vd4 = c0830td.f5065i;
                    boolean z2 = c2454rb2.f8588I.f4270f != null;
                    boolean z3 = c2454rb2.f8589J.f4270f != null;
                    boolean z4 = c2454rb2.f8590K.f4270f != null;
                    boolean z5 = c2454rb2.f8591L.f4270f != null;
                    f = 0.5f;
                    int i4 = c2454rb2.f8603X;
                    if (z2 && z3 && z4 && z5) {
                        float f5 = c2454rb2.f8602W;
                        boolean z6 = c2628vd3.f9119j;
                        ArrayList arrayList = c2628vd3.f9121l;
                        int[] iArr = f2406k;
                        if (z6 && c2628vd4.f9119j) {
                            if (c2628vd.f9112c && c2628vd2.f9112c) {
                                m1545m(iArr, ((C2628vd) c2628vd.f9121l.get(0)).f9116g + c2628vd.f9115f, ((C2628vd) c2628vd2.f9121l.get(0)).f9116g - c2628vd2.f9115f, c2628vd3.f9116g + c2628vd3.f9115f, c2628vd4.f9116g - c2628vd4.f9115f, f5, i4);
                                c0750Rd.mo1539d(iArr[0]);
                                this.f5058b.f8614e.f5061e.mo1539d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (c2628vd.f9119j && c2628vd2.f9119j) {
                            if (!c2628vd3.f9112c || !c2628vd4.f9112c) {
                                return;
                            }
                            m1545m(iArr, c2628vd.f9116g + c2628vd.f9115f, c2628vd2.f9116g - c2628vd2.f9115f, ((C2628vd) arrayList.get(0)).f9116g + c2628vd3.f9115f, ((C2628vd) c2628vd4.f9121l.get(0)).f9116g - c2628vd4.f9115f, f5, i4);
                            c0750Rd.mo1539d(iArr[0]);
                            this.f5058b.f8614e.f5061e.mo1539d(iArr[1]);
                        }
                        if (!c2628vd.f9112c || !c2628vd2.f9112c || !c2628vd3.f9112c || !c2628vd4.f9112c) {
                            return;
                        }
                        m1545m(iArr, ((C2628vd) c2628vd.f9121l.get(0)).f9116g + c2628vd.f9115f, ((C2628vd) c2628vd2.f9121l.get(0)).f9116g - c2628vd2.f9115f, ((C2628vd) arrayList.get(0)).f9116g + c2628vd3.f9115f, ((C2628vd) c2628vd4.f9121l.get(0)).f9116g - c2628vd4.f9115f, f5, i4);
                        c0750Rd.mo1539d(iArr[0]);
                        this.f5058b.f8614e.f5061e.mo1539d(iArr[1]);
                    } else if (z2 && z4) {
                        if (!c2628vd.f9112c || !c2628vd2.f9112c) {
                            return;
                        }
                        float f6 = c2454rb2.f8602W;
                        int i5 = ((C2628vd) c2628vd.f9121l.get(0)).f9116g + c2628vd.f9115f;
                        int i6 = ((C2628vd) c2628vd2.f9121l.get(0)).f9116g - c2628vd2.f9115f;
                        if (i4 == -1 || i4 == 0) {
                            int iM2778g = m2778g(i6 - i5, 0);
                            int i7 = (int) ((iM2778g * f6) + 0.5f);
                            int iM2778g2 = m2778g(i7, 1);
                            if (i7 != iM2778g2) {
                                iM2778g = (int) ((iM2778g2 / f6) + 0.5f);
                            }
                            c0750Rd.mo1539d(iM2778g);
                            this.f5058b.f8614e.f5061e.mo1539d(iM2778g2);
                        } else if (i4 == 1) {
                            int iM2778g3 = m2778g(i6 - i5, 0);
                            int i8 = (int) ((iM2778g3 / f6) + 0.5f);
                            int iM2778g4 = m2778g(i8, 1);
                            if (i8 != iM2778g4) {
                                iM2778g3 = (int) ((iM2778g4 * f6) + 0.5f);
                            }
                            c0750Rd.mo1539d(iM2778g3);
                            this.f5058b.f8614e.f5061e.mo1539d(iM2778g4);
                        }
                    } else if (z3 && z5) {
                        if (!c2628vd3.f9112c || !c2628vd4.f9112c) {
                            return;
                        }
                        float f7 = c2454rb2.f8602W;
                        int i9 = ((C2628vd) c2628vd3.f9121l.get(0)).f9116g + c2628vd3.f9115f;
                        int i10 = ((C2628vd) c2628vd4.f9121l.get(0)).f9116g - c2628vd4.f9115f;
                        if (i4 == -1) {
                            int iM2778g5 = m2778g(i10 - i9, 1);
                            int i11 = (int) ((iM2778g5 / f7) + 0.5f);
                            int iM2778g6 = m2778g(i11, 0);
                            if (i11 != iM2778g6) {
                                iM2778g5 = (int) ((iM2778g6 * f7) + 0.5f);
                            }
                            c0750Rd.mo1539d(iM2778g6);
                            this.f5058b.f8614e.f5061e.mo1539d(iM2778g5);
                        } else if (i4 == 0) {
                            int iM2778g7 = m2778g(i10 - i9, 1);
                            int i12 = (int) ((iM2778g7 * f7) + 0.5f);
                            int iM2778g8 = m2778g(i12, 0);
                            if (i12 != iM2778g8) {
                                iM2778g7 = (int) ((iM2778g8 / f7) + 0.5f);
                            }
                            c0750Rd.mo1539d(iM2778g8);
                            this.f5058b.f8614e.f5061e.mo1539d(iM2778g7);
                        } else if (i4 == 1) {
                        }
                    }
                } else {
                    int i13 = c2454rb2.f8603X;
                    if (i13 == -1) {
                        f2 = c2454rb2.f8614e.f5061e.f9116g;
                        f3 = c2454rb2.f8602W;
                    } else if (i13 == 0) {
                        f4 = c2454rb2.f8614e.f5061e.f9116g / c2454rb2.f8602W;
                        i = (int) (f4 + 0.5f);
                        c0750Rd.mo1539d(i);
                        f = 0.5f;
                    } else if (i13 != 1) {
                        i = 0;
                        c0750Rd.mo1539d(i);
                        f = 0.5f;
                    } else {
                        f2 = c2454rb2.f8614e.f5061e.f9116g;
                        f3 = c2454rb2.f8602W;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    c0750Rd.mo1539d(i);
                    f = 0.5f;
                }
            }
        }
        boolean z7 = c2628vd.f9112c;
        ArrayList arrayList2 = c2628vd.f9121l;
        if (z7) {
            boolean z8 = c2628vd2.f9112c;
            ArrayList arrayList3 = c2628vd2.f9121l;
            if (z8) {
                if (c2628vd.f9119j && c2628vd2.f9119j && c0750Rd.f9119j) {
                    return;
                }
                if (!c0750Rd.f9119j && this.f5060d == 3) {
                    C2454rb c2454rb4 = this.f5058b;
                    if (c2454rb4.f8639r == 0 && !c2454rb4.m4944x()) {
                        C2628vd c2628vd5 = (C2628vd) arrayList2.get(0);
                        C2628vd c2628vd6 = (C2628vd) arrayList3.get(0);
                        int i14 = c2628vd5.f9116g + c2628vd.f9115f;
                        int i15 = c2628vd6.f9116g + c2628vd2.f9115f;
                        c2628vd.mo1539d(i14);
                        c2628vd2.mo1539d(i15);
                        c0750Rd.mo1539d(i15 - i14);
                        return;
                    }
                }
                if (!c0750Rd.f9119j && this.f5060d == 3 && this.f5057a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((C2628vd) arrayList3.get(0)).f9116g + c2628vd2.f9115f) - (((C2628vd) arrayList2.get(0)).f9116g + c2628vd.f9115f), c0750Rd.f2386m);
                    C2454rb c2454rb5 = this.f5058b;
                    int i16 = c2454rb5.f8643v;
                    int iMax = Math.max(c2454rb5.f8642u, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    c0750Rd.mo1539d(iMax);
                }
                if (c0750Rd.f9119j) {
                    C2628vd c2628vd7 = (C2628vd) arrayList2.get(0);
                    C2628vd c2628vd8 = (C2628vd) arrayList3.get(0);
                    int i17 = c2628vd7.f9116g;
                    int i18 = c2628vd.f9115f + i17;
                    int i19 = c2628vd8.f9116g;
                    int i20 = c2628vd2.f9115f + i19;
                    float f8 = this.f5058b.f8613d0;
                    if (c2628vd7 == c2628vd8) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    c2628vd.mo1539d((int) ((((i19 - i17) - c0750Rd.f9116g) * f8) + i17 + f));
                    c2628vd2.mo1539d(c2628vd.f9116g + c0750Rd.f9116g);
                }
            }
        }
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: d */
    public final void mo1547d() {
        C2454rb c2454rb;
        C2454rb c2454rb2;
        int i;
        C2454rb c2454rb3;
        C2454rb c2454rb4;
        int i2;
        C2454rb c2454rb5 = this.f5058b;
        boolean z = c2454rb5.f8606a;
        C0750Rd c0750Rd = this.f5061e;
        if (z) {
            c0750Rd.mo1539d(c2454rb5.m4937q());
        }
        boolean z2 = c0750Rd.f9119j;
        ArrayList arrayList = c0750Rd.f9120k;
        ArrayList arrayList2 = c0750Rd.f9121l;
        C2628vd c2628vd = this.f5065i;
        C2628vd c2628vd2 = this.f5064h;
        if (!z2) {
            C2454rb c2454rb6 = this.f5058b;
            int i3 = c2454rb6.f8637p0[0];
            this.f5060d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c2454rb4 = c2454rb6.f8599T) != null && ((i2 = c2454rb4.f8637p0[0]) == 1 || i2 == 4)) {
                    int iM4937q = (c2454rb4.m4937q() - this.f5058b.f8588I.m2384e()) - this.f5058b.f8590K.m2384e();
                    AbstractC1449gF.m2774b(c2628vd2, c2454rb4.f8612d.f5064h, this.f5058b.f8588I.m2384e());
                    AbstractC1449gF.m2774b(c2628vd, c2454rb4.f8612d.f5065i, -this.f5058b.f8590K.m2384e());
                    c0750Rd.mo1539d(iM4937q);
                    return;
                }
                if (i3 == 1) {
                    c0750Rd.mo1539d(c2454rb6.m4937q());
                }
            }
        } else if (this.f5060d == 4 && (c2454rb2 = (c2454rb = this.f5058b).f8599T) != null && ((i = c2454rb2.f8637p0[0]) == 1 || i == 4)) {
            AbstractC1449gF.m2774b(c2628vd2, c2454rb2.f8612d.f5064h, c2454rb.f8588I.m2384e());
            AbstractC1449gF.m2774b(c2628vd, c2454rb2.f8612d.f5065i, -this.f5058b.f8590K.m2384e());
            return;
        }
        if (c0750Rd.f9119j) {
            C2454rb c2454rb7 = this.f5058b;
            if (c2454rb7.f8606a) {
                C1259cb[] c1259cbArr = c2454rb7.f8596Q;
                C1259cb c1259cb = c1259cbArr[0];
                C1259cb c1259cb2 = c1259cb.f4270f;
                if (c1259cb2 != null && c1259cbArr[1].f4270f != null) {
                    if (c2454rb7.m4944x()) {
                        c2628vd2.f9115f = this.f5058b.f8596Q[0].m2384e();
                        c2628vd.f9115f = -this.f5058b.f8596Q[1].m2384e();
                        return;
                    }
                    C2628vd c2628vdM2775h = AbstractC1449gF.m2775h(this.f5058b.f8596Q[0]);
                    if (c2628vdM2775h != null) {
                        AbstractC1449gF.m2774b(c2628vd2, c2628vdM2775h, this.f5058b.f8596Q[0].m2384e());
                    }
                    C2628vd c2628vdM2775h2 = AbstractC1449gF.m2775h(this.f5058b.f8596Q[1]);
                    if (c2628vdM2775h2 != null) {
                        AbstractC1449gF.m2774b(c2628vd, c2628vdM2775h2, -this.f5058b.f8596Q[1].m2384e());
                    }
                    c2628vd2.f9111b = true;
                    c2628vd.f9111b = true;
                    return;
                }
                if (c1259cb2 != null) {
                    C2628vd c2628vdM2775h3 = AbstractC1449gF.m2775h(c1259cb);
                    if (c2628vdM2775h3 != null) {
                        AbstractC1449gF.m2774b(c2628vd2, c2628vdM2775h3, this.f5058b.f8596Q[0].m2384e());
                        AbstractC1449gF.m2774b(c2628vd, c2628vd2, c0750Rd.f9116g);
                        return;
                    }
                    return;
                }
                C1259cb c1259cb3 = c1259cbArr[1];
                if (c1259cb3.f4270f != null) {
                    C2628vd c2628vdM2775h4 = AbstractC1449gF.m2775h(c1259cb3);
                    if (c2628vdM2775h4 != null) {
                        AbstractC1449gF.m2774b(c2628vd, c2628vdM2775h4, -this.f5058b.f8596Q[1].m2384e());
                        AbstractC1449gF.m2774b(c2628vd2, c2628vd, -c0750Rd.f9116g);
                        return;
                    }
                    return;
                }
                if ((c2454rb7 instanceof AbstractC2592uk) || c2454rb7.f8599T == null || c2454rb7.mo4340i(7).f4270f != null) {
                    return;
                }
                C2454rb c2454rb8 = this.f5058b;
                AbstractC1449gF.m2774b(c2628vd2, c2454rb8.f8599T.f8612d.f5064h, c2454rb8.m4938r());
                AbstractC1449gF.m2774b(c2628vd, c2628vd2, c0750Rd.f9116g);
                return;
            }
        }
        if (this.f5060d == 3) {
            C2454rb c2454rb9 = this.f5058b;
            int i4 = c2454rb9.f8639r;
            if (i4 == 2) {
                C2454rb c2454rb10 = c2454rb9.f8599T;
                if (c2454rb10 != null) {
                    C0750Rd c0750Rd2 = c2454rb10.f8614e.f5061e;
                    arrayList2.add(c0750Rd2);
                    c0750Rd2.f9120k.add(c0750Rd);
                    c0750Rd.f9111b = true;
                    arrayList.add(c2628vd2);
                    arrayList.add(c2628vd);
                }
            } else if (i4 == 3) {
                if (c2454rb9.f8640s == 3) {
                    c2628vd2.f9110a = this;
                    c2628vd.f9110a = this;
                    C0830TD c0830td = c2454rb9.f8614e;
                    c0830td.f5064h.f9110a = this;
                    c0830td.f5065i.f9110a = this;
                    c0750Rd.f9110a = this;
                    if (c2454rb9.m4945y()) {
                        arrayList2.add(this.f5058b.f8614e.f5061e);
                        this.f5058b.f8614e.f5061e.f9120k.add(c0750Rd);
                        C0830TD c0830td2 = this.f5058b.f8614e;
                        c0830td2.f5061e.f9110a = this;
                        arrayList2.add(c0830td2.f5064h);
                        arrayList2.add(this.f5058b.f8614e.f5065i);
                        this.f5058b.f8614e.f5064h.f9120k.add(c0750Rd);
                        this.f5058b.f8614e.f5065i.f9120k.add(c0750Rd);
                    } else if (this.f5058b.m4944x()) {
                        this.f5058b.f8614e.f5061e.f9121l.add(c0750Rd);
                        arrayList.add(this.f5058b.f8614e.f5061e);
                    } else {
                        this.f5058b.f8614e.f5061e.f9121l.add(c0750Rd);
                    }
                } else {
                    C0750Rd c0750Rd3 = c2454rb9.f8614e.f5061e;
                    arrayList2.add(c0750Rd3);
                    c0750Rd3.f9120k.add(c0750Rd);
                    this.f5058b.f8614e.f5064h.f9120k.add(c0750Rd);
                    this.f5058b.f8614e.f5065i.f9120k.add(c0750Rd);
                    c0750Rd.f9111b = true;
                    arrayList.add(c2628vd2);
                    arrayList.add(c2628vd);
                    c2628vd2.f9121l.add(c0750Rd);
                    c2628vd.f9121l.add(c0750Rd);
                }
            }
        }
        C2454rb c2454rb11 = this.f5058b;
        C1259cb[] c1259cbArr2 = c2454rb11.f8596Q;
        C1259cb c1259cb4 = c1259cbArr2[0];
        C1259cb c1259cb5 = c1259cb4.f4270f;
        if (c1259cb5 != null && c1259cbArr2[1].f4270f != null) {
            if (c2454rb11.m4944x()) {
                c2628vd2.f9115f = this.f5058b.f8596Q[0].m2384e();
                c2628vd.f9115f = -this.f5058b.f8596Q[1].m2384e();
                return;
            }
            C2628vd c2628vdM2775h5 = AbstractC1449gF.m2775h(this.f5058b.f8596Q[0]);
            C2628vd c2628vdM2775h6 = AbstractC1449gF.m2775h(this.f5058b.f8596Q[1]);
            if (c2628vdM2775h5 != null) {
                c2628vdM2775h5.m5143b(this);
            }
            if (c2628vdM2775h6 != null) {
                c2628vdM2775h6.m5143b(this);
            }
            this.f5066j = 4;
            return;
        }
        if (c1259cb5 != null) {
            C2628vd c2628vdM2775h7 = AbstractC1449gF.m2775h(c1259cb4);
            if (c2628vdM2775h7 != null) {
                AbstractC1449gF.m2774b(c2628vd2, c2628vdM2775h7, this.f5058b.f8596Q[0].m2384e());
                m2777c(c2628vd, c2628vd2, 1, c0750Rd);
                return;
            }
            return;
        }
        C1259cb c1259cb6 = c1259cbArr2[1];
        if (c1259cb6.f4270f != null) {
            C2628vd c2628vdM2775h8 = AbstractC1449gF.m2775h(c1259cb6);
            if (c2628vdM2775h8 != null) {
                AbstractC1449gF.m2774b(c2628vd, c2628vdM2775h8, -this.f5058b.f8596Q[1].m2384e());
                m2777c(c2628vd2, c2628vd, -1, c0750Rd);
                return;
            }
            return;
        }
        if ((c2454rb11 instanceof AbstractC2592uk) || (c2454rb3 = c2454rb11.f8599T) == null) {
            return;
        }
        AbstractC1449gF.m2774b(c2628vd2, c2454rb3.f8612d.f5064h, c2454rb11.m4938r());
        m2777c(c2628vd, c2628vd2, 1, c0750Rd);
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: e */
    public final void mo1548e() {
        C2628vd c2628vd = this.f5064h;
        if (c2628vd.f9119j) {
            this.f5058b.f8604Y = c2628vd.f9116g;
        }
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: f */
    public final void mo1549f() {
        this.f5059c = null;
        this.f5064h.m5144c();
        this.f5065i.m5144c();
        this.f5061e.m5144c();
        this.f5063g = false;
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: k */
    public final boolean mo1550k() {
        return this.f5060d != 3 || this.f5058b.f8639r == 0;
    }

    /* JADX INFO: renamed from: n */
    public final void m1551n() {
        this.f5063g = false;
        C2628vd c2628vd = this.f5064h;
        c2628vd.m5144c();
        c2628vd.f9119j = false;
        C2628vd c2628vd2 = this.f5065i;
        c2628vd2.m5144c();
        c2628vd2.f9119j = false;
        this.f5061e.f9119j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f5058b.f8621h0;
    }
}
