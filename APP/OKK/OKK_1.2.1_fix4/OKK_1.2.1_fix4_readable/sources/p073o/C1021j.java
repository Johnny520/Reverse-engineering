package p073o;

import java.util.ArrayList;
import p069m.AbstractC0988h;
import p071n.AbstractC1004i;
import p071n.C0998c;
import p071n.C0999d;

/* JADX INFO: renamed from: o.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1021j extends AbstractC1024m {

    /* JADX INFO: renamed from: k */
    public static final int[] f3757k = new int[2];

    /* JADX INFO: renamed from: m */
    public static void m2465m(int[] iArr, int i2, int i3, int i4, int i5, float f2, int i6) {
        int i7 = i3 - i2;
        int i8 = i5 - i4;
        if (i6 != -1) {
            if (i6 == 0) {
                iArr[0] = (int) ((i8 * f2) + 0.5f);
                iArr[1] = i8;
                return;
            } else {
                if (i6 != 1) {
                    return;
                }
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f2) + 0.5f);
                return;
            }
        }
        int i9 = (int) ((i8 * f2) + 0.5f);
        int i10 = (int) ((i7 / f2) + 0.5f);
        if (i9 <= i7) {
            iArr[0] = i9;
            iArr[1] = i8;
        } else if (i10 <= i8) {
            iArr[0] = i7;
            iArr[1] = i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0267  */
    @Override // p073o.InterfaceC1015d
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2445a(InterfaceC1015d interfaceC1015d) {
        float f2;
        float f3;
        float f4;
        int i2;
        if (AbstractC0988h.m2372a(this.f3771j) == 3) {
            C0999d c0999d = this.f3763b;
            m2475l(c0999d.f3636x, c0999d.f3638z, 0);
            return;
        }
        C1018g c1018g = this.f3766e;
        boolean z2 = c1018g.f3753j;
        C1017f c1017f = this.f3769h;
        C1017f c1017f2 = this.f3770i;
        if (!z2 && this.f3765d == 3) {
            C0999d c0999d2 = this.f3763b;
            int i3 = c0999d2.f3622j;
            if (i3 == 2) {
                C0999d c0999d3 = c0999d2.f3592I;
                if (c0999d3 != null) {
                    if (c0999d3.f3616d.f3766e.f3753j) {
                        c1018g.mo2462d((int) ((r3.f3750g * c0999d2.f3627o) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = c0999d2.f3623k;
                if (i4 == 0 || i4 == 3) {
                    C1023l c1023l = c0999d2.f3617e;
                    C1017f c1017f3 = c1023l.f3769h;
                    C1017f c1017f4 = c1023l.f3770i;
                    boolean z3 = c0999d2.f3636x.f3580d != null;
                    boolean z4 = c0999d2.f3637y.f3580d != null;
                    boolean z5 = c0999d2.f3638z.f3580d != null;
                    boolean z6 = c0999d2.f3584A.f3580d != null;
                    int i5 = c0999d2.f3596M;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = c0999d2.f3595L;
                        boolean z7 = c1017f3.f3753j;
                        int[] iArr = f3757k;
                        if (z7 && c1017f4.f3753j) {
                            if (c1017f.f3746c && c1017f2.f3746c) {
                                m2465m(iArr, ((C1017f) c1017f.f3755l.get(0)).f3750g + c1017f.f3749f, ((C1017f) c1017f2.f3755l.get(0)).f3750g - c1017f2.f3749f, c1017f3.f3750g + c1017f3.f3749f, c1017f4.f3750g - c1017f4.f3749f, f5, i5);
                                c1018g.mo2462d(iArr[0]);
                                this.f3763b.f3617e.f3766e.mo2462d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z8 = c1017f.f3753j;
                        ArrayList arrayList = c1017f3.f3755l;
                        if (z8 && c1017f2.f3753j) {
                            if (!c1017f3.f3746c || !c1017f4.f3746c) {
                                return;
                            }
                            m2465m(iArr, c1017f.f3750g + c1017f.f3749f, c1017f2.f3750g - c1017f2.f3749f, ((C1017f) arrayList.get(0)).f3750g + c1017f3.f3749f, ((C1017f) c1017f4.f3755l.get(0)).f3750g - c1017f4.f3749f, f5, i5);
                            c1018g.mo2462d(iArr[0]);
                            this.f3763b.f3617e.f3766e.mo2462d(iArr[1]);
                        }
                        if (!c1017f.f3746c || !c1017f2.f3746c || !c1017f3.f3746c || !c1017f4.f3746c) {
                            return;
                        }
                        m2465m(iArr, ((C1017f) c1017f.f3755l.get(0)).f3750g + c1017f.f3749f, ((C1017f) c1017f2.f3755l.get(0)).f3750g - c1017f2.f3749f, ((C1017f) arrayList.get(0)).f3750g + c1017f3.f3749f, ((C1017f) c1017f4.f3755l.get(0)).f3750g - c1017f4.f3749f, f5, i5);
                        c1018g.mo2462d(iArr[0]);
                        this.f3763b.f3617e.f3766e.mo2462d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!c1017f.f3746c || !c1017f2.f3746c) {
                            return;
                        }
                        float f6 = c0999d2.f3595L;
                        int i6 = ((C1017f) c1017f.f3755l.get(0)).f3750g + c1017f.f3749f;
                        int i7 = ((C1017f) c1017f2.f3755l.get(0)).f3750g - c1017f2.f3749f;
                        if (i5 == -1 || i5 == 0) {
                            int iM2474g = m2474g(i7 - i6, 0);
                            int i8 = (int) ((iM2474g * f6) + 0.5f);
                            int iM2474g2 = m2474g(i8, 1);
                            if (i8 != iM2474g2) {
                                iM2474g = (int) ((iM2474g2 / f6) + 0.5f);
                            }
                            c1018g.mo2462d(iM2474g);
                            this.f3763b.f3617e.f3766e.mo2462d(iM2474g2);
                        } else if (i5 == 1) {
                            int iM2474g3 = m2474g(i7 - i6, 0);
                            int i9 = (int) ((iM2474g3 / f6) + 0.5f);
                            int iM2474g4 = m2474g(i9, 1);
                            if (i9 != iM2474g4) {
                                iM2474g3 = (int) ((iM2474g4 * f6) + 0.5f);
                            }
                            c1018g.mo2462d(iM2474g3);
                            this.f3763b.f3617e.f3766e.mo2462d(iM2474g4);
                        }
                    } else if (z4 && z6) {
                        if (!c1017f3.f3746c || !c1017f4.f3746c) {
                            return;
                        }
                        float f7 = c0999d2.f3595L;
                        int i10 = ((C1017f) c1017f3.f3755l.get(0)).f3750g + c1017f3.f3749f;
                        int i11 = ((C1017f) c1017f4.f3755l.get(0)).f3750g - c1017f4.f3749f;
                        if (i5 == -1) {
                            int iM2474g5 = m2474g(i11 - i10, 1);
                            int i12 = (int) ((iM2474g5 / f7) + 0.5f);
                            int iM2474g6 = m2474g(i12, 0);
                            if (i12 != iM2474g6) {
                                iM2474g5 = (int) ((iM2474g6 * f7) + 0.5f);
                            }
                            c1018g.mo2462d(iM2474g6);
                            this.f3763b.f3617e.f3766e.mo2462d(iM2474g5);
                        } else if (i5 == 0) {
                            int iM2474g7 = m2474g(i11 - i10, 1);
                            int i13 = (int) ((iM2474g7 * f7) + 0.5f);
                            int iM2474g8 = m2474g(i13, 0);
                            if (i13 != iM2474g8) {
                                iM2474g7 = (int) ((iM2474g8 / f7) + 0.5f);
                            }
                            c1018g.mo2462d(iM2474g8);
                            this.f3763b.f3617e.f3766e.mo2462d(iM2474g7);
                        } else if (i5 == 1) {
                        }
                    }
                } else {
                    int i14 = c0999d2.f3596M;
                    if (i14 == -1) {
                        f2 = c0999d2.f3617e.f3766e.f3750g;
                        f3 = c0999d2.f3595L;
                    } else if (i14 == 0) {
                        f4 = c0999d2.f3617e.f3766e.f3750g / c0999d2.f3595L;
                        i2 = (int) (f4 + 0.5f);
                        c1018g.mo2462d(i2);
                    } else if (i14 != 1) {
                        i2 = 0;
                        c1018g.mo2462d(i2);
                    } else {
                        f2 = c0999d2.f3617e.f3766e.f3750g;
                        f3 = c0999d2.f3595L;
                    }
                    f4 = f2 * f3;
                    i2 = (int) (f4 + 0.5f);
                    c1018g.mo2462d(i2);
                }
            }
        }
        if (c1017f.f3746c && c1017f2.f3746c) {
            if (c1017f.f3753j && c1017f2.f3753j && c1018g.f3753j) {
                return;
            }
            if (!c1018g.f3753j && this.f3765d == 3) {
                C0999d c0999d4 = this.f3763b;
                if (c0999d4.f3622j == 0 && !c0999d4.m2412q()) {
                    C1017f c1017f5 = (C1017f) c1017f.f3755l.get(0);
                    C1017f c1017f6 = (C1017f) c1017f2.f3755l.get(0);
                    int i15 = c1017f5.f3750g + c1017f.f3749f;
                    int i16 = c1017f6.f3750g + c1017f2.f3749f;
                    c1017f.mo2462d(i15);
                    c1017f2.mo2462d(i16);
                    c1018g.mo2462d(i16 - i15);
                    return;
                }
            }
            if (!c1018g.f3753j && this.f3765d == 3 && this.f3762a == 1 && c1017f.f3755l.size() > 0 && c1017f2.f3755l.size() > 0) {
                int iMin = Math.min((((C1017f) c1017f2.f3755l.get(0)).f3750g + c1017f2.f3749f) - (((C1017f) c1017f.f3755l.get(0)).f3750g + c1017f.f3749f), c1018g.f3756m);
                C0999d c0999d5 = this.f3763b;
                int i17 = c0999d5.f3626n;
                int iMax = Math.max(c0999d5.f3625m, iMin);
                if (i17 > 0) {
                    iMax = Math.min(i17, iMax);
                }
                c1018g.mo2462d(iMax);
            }
            if (c1018g.f3753j) {
                C1017f c1017f7 = (C1017f) c1017f.f3755l.get(0);
                C1017f c1017f8 = (C1017f) c1017f2.f3755l.get(0);
                int i18 = c1017f7.f3750g;
                int i19 = c1017f.f3749f + i18;
                int i20 = c1017f8.f3750g;
                int i21 = c1017f2.f3749f + i20;
                float f8 = this.f3763b.f3602S;
                if (c1017f7 == c1017f8) {
                    f8 = 0.5f;
                } else {
                    i18 = i19;
                    i20 = i21;
                }
                c1017f.mo2462d((int) ((((i20 - i18) - c1018g.f3750g) * f8) + i18 + 0.5f));
                c1017f2.mo2462d(c1017f.f3750g + c1018g.f3750g);
            }
        }
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: d */
    public final void mo2446d() {
        C0999d c0999d;
        C0999d c0999d2;
        C0999d c0999d3;
        C0999d c0999d4;
        C0999d c0999d5 = this.f3763b;
        boolean z2 = c0999d5.f3610a;
        C1018g c1018g = this.f3766e;
        if (z2) {
            c1018g.mo2462d(c0999d5.m2407l());
        }
        boolean z3 = c1018g.f3753j;
        C1017f c1017f = this.f3770i;
        C1017f c1017f2 = this.f3769h;
        if (!z3) {
            C0999d c0999d6 = this.f3763b;
            int i2 = c0999d6.f3615c0[0];
            this.f3765d = i2;
            if (i2 != 3) {
                if (i2 == 4 && (((c0999d4 = c0999d6.f3592I) != null && c0999d4.f3615c0[0] == 1) || c0999d4.f3615c0[0] == 4)) {
                    int iM2407l = (c0999d4.m2407l() - this.f3763b.f3636x.m2390c()) - this.f3763b.f3638z.m2390c();
                    C1021j c1021j = c0999d4.f3616d;
                    AbstractC1024m.m2470b(c1017f2, c1021j.f3769h, this.f3763b.f3636x.m2390c());
                    AbstractC1024m.m2470b(c1017f, c1021j.f3770i, -this.f3763b.f3638z.m2390c());
                    c1018g.mo2462d(iM2407l);
                    return;
                }
                if (i2 == 1) {
                    c1018g.mo2462d(c0999d6.m2407l());
                }
            }
        } else if (this.f3765d == 4 && (((c0999d2 = (c0999d = this.f3763b).f3592I) != null && c0999d2.f3615c0[0] == 1) || c0999d2.f3615c0[0] == 4)) {
            AbstractC1024m.m2470b(c1017f2, c0999d2.f3616d.f3769h, c0999d.f3636x.m2390c());
            AbstractC1024m.m2470b(c1017f, c0999d2.f3616d.f3770i, -this.f3763b.f3638z.m2390c());
            return;
        }
        if (c1018g.f3753j) {
            C0999d c0999d7 = this.f3763b;
            if (c0999d7.f3610a) {
                C0998c[] c0998cArr = c0999d7.f3589F;
                C0998c c0998c = c0998cArr[0];
                C0998c c0998c2 = c0998c.f3580d;
                if (c0998c2 != null && c0998cArr[1].f3580d != null) {
                    if (c0999d7.m2412q()) {
                        c1017f2.f3749f = this.f3763b.f3589F[0].m2390c();
                        c1017f.f3749f = -this.f3763b.f3589F[1].m2390c();
                        return;
                    }
                    C1017f c1017fM2471h = AbstractC1024m.m2471h(this.f3763b.f3589F[0]);
                    if (c1017fM2471h != null) {
                        AbstractC1024m.m2470b(c1017f2, c1017fM2471h, this.f3763b.f3589F[0].m2390c());
                    }
                    C1017f c1017fM2471h2 = AbstractC1024m.m2471h(this.f3763b.f3589F[1]);
                    if (c1017fM2471h2 != null) {
                        AbstractC1024m.m2470b(c1017f, c1017fM2471h2, -this.f3763b.f3589F[1].m2390c());
                    }
                    c1017f2.f3745b = true;
                    c1017f.f3745b = true;
                    return;
                }
                if (c0998c2 != null) {
                    C1017f c1017fM2471h3 = AbstractC1024m.m2471h(c0998c);
                    if (c1017fM2471h3 != null) {
                        AbstractC1024m.m2470b(c1017f2, c1017fM2471h3, this.f3763b.f3589F[0].m2390c());
                        AbstractC1024m.m2470b(c1017f, c1017f2, c1018g.f3750g);
                        return;
                    }
                    return;
                }
                C0998c c0998c3 = c0998cArr[1];
                if (c0998c3.f3580d != null) {
                    C1017f c1017fM2471h4 = AbstractC1024m.m2471h(c0998c3);
                    if (c1017fM2471h4 != null) {
                        AbstractC1024m.m2470b(c1017f, c1017fM2471h4, -this.f3763b.f3589F[1].m2390c());
                        AbstractC1024m.m2470b(c1017f2, c1017f, -c1018g.f3750g);
                        return;
                    }
                    return;
                }
                if ((c0999d7 instanceof AbstractC1004i) || c0999d7.f3592I == null || c0999d7.mo2402g(7).f3580d != null) {
                    return;
                }
                C0999d c0999d8 = this.f3763b;
                AbstractC1024m.m2470b(c1017f2, c0999d8.f3592I.f3616d.f3769h, c0999d8.m2408m());
                AbstractC1024m.m2470b(c1017f, c1017f2, c1018g.f3750g);
                return;
            }
        }
        if (this.f3765d == 3) {
            C0999d c0999d9 = this.f3763b;
            int i3 = c0999d9.f3622j;
            if (i3 == 2) {
                C0999d c0999d10 = c0999d9.f3592I;
                if (c0999d10 != null) {
                    C1018g c1018g2 = c0999d10.f3617e.f3766e;
                    c1018g.f3755l.add(c1018g2);
                    c1018g2.f3754k.add(c1018g);
                    c1018g.f3745b = true;
                    c1018g.f3754k.add(c1017f2);
                    c1018g.f3754k.add(c1017f);
                }
            } else if (i3 == 3) {
                if (c0999d9.f3623k == 3) {
                    c1017f2.f3744a = this;
                    c1017f.f3744a = this;
                    C1023l c1023l = c0999d9.f3617e;
                    c1023l.f3769h.f3744a = this;
                    c1023l.f3770i.f3744a = this;
                    c1018g.f3744a = this;
                    if (c0999d9.m2413r()) {
                        c1018g.f3755l.add(this.f3763b.f3617e.f3766e);
                        this.f3763b.f3617e.f3766e.f3754k.add(c1018g);
                        C1023l c1023l2 = this.f3763b.f3617e;
                        c1023l2.f3766e.f3744a = this;
                        c1018g.f3755l.add(c1023l2.f3769h);
                        c1018g.f3755l.add(this.f3763b.f3617e.f3770i);
                        this.f3763b.f3617e.f3769h.f3754k.add(c1018g);
                        this.f3763b.f3617e.f3770i.f3754k.add(c1018g);
                    } else if (this.f3763b.m2412q()) {
                        this.f3763b.f3617e.f3766e.f3755l.add(c1018g);
                        c1018g.f3754k.add(this.f3763b.f3617e.f3766e);
                    } else {
                        this.f3763b.f3617e.f3766e.f3755l.add(c1018g);
                    }
                } else {
                    C1018g c1018g3 = c0999d9.f3617e.f3766e;
                    c1018g.f3755l.add(c1018g3);
                    c1018g3.f3754k.add(c1018g);
                    this.f3763b.f3617e.f3769h.f3754k.add(c1018g);
                    this.f3763b.f3617e.f3770i.f3754k.add(c1018g);
                    c1018g.f3745b = true;
                    c1018g.f3754k.add(c1017f2);
                    c1018g.f3754k.add(c1017f);
                    c1017f2.f3755l.add(c1018g);
                    c1017f.f3755l.add(c1018g);
                }
            }
        }
        C0999d c0999d11 = this.f3763b;
        C0998c[] c0998cArr2 = c0999d11.f3589F;
        C0998c c0998c4 = c0998cArr2[0];
        C0998c c0998c5 = c0998c4.f3580d;
        if (c0998c5 != null && c0998cArr2[1].f3580d != null) {
            if (c0999d11.m2412q()) {
                c1017f2.f3749f = this.f3763b.f3589F[0].m2390c();
                c1017f.f3749f = -this.f3763b.f3589F[1].m2390c();
                return;
            }
            C1017f c1017fM2471h5 = AbstractC1024m.m2471h(this.f3763b.f3589F[0]);
            C1017f c1017fM2471h6 = AbstractC1024m.m2471h(this.f3763b.f3589F[1]);
            c1017fM2471h5.m2460b(this);
            c1017fM2471h6.m2460b(this);
            this.f3771j = 4;
            return;
        }
        if (c0998c5 != null) {
            C1017f c1017fM2471h7 = AbstractC1024m.m2471h(c0998c4);
            if (c1017fM2471h7 != null) {
                AbstractC1024m.m2470b(c1017f2, c1017fM2471h7, this.f3763b.f3589F[0].m2390c());
                m2473c(c1017f, c1017f2, 1, c1018g);
                return;
            }
            return;
        }
        C0998c c0998c6 = c0998cArr2[1];
        if (c0998c6.f3580d != null) {
            C1017f c1017fM2471h8 = AbstractC1024m.m2471h(c0998c6);
            if (c1017fM2471h8 != null) {
                AbstractC1024m.m2470b(c1017f, c1017fM2471h8, -this.f3763b.f3589F[1].m2390c());
                m2473c(c1017f2, c1017f, -1, c1018g);
                return;
            }
            return;
        }
        if ((c0999d11 instanceof AbstractC1004i) || (c0999d3 = c0999d11.f3592I) == null) {
            return;
        }
        AbstractC1024m.m2470b(c1017f2, c0999d3.f3616d.f3769h, c0999d11.m2408m());
        m2473c(c1017f, c1017f2, 1, c1018g);
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: e */
    public final void mo2447e() {
        C1017f c1017f = this.f3769h;
        if (c1017f.f3753j) {
            this.f3763b.f3597N = c1017f.f3750g;
        }
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: f */
    public final void mo2448f() {
        this.f3764c = null;
        this.f3769h.m2461c();
        this.f3770i.m2461c();
        this.f3766e.m2461c();
        this.f3768g = false;
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: k */
    public final boolean mo2450k() {
        return this.f3765d != 3 || this.f3763b.f3622j == 0;
    }

    /* JADX INFO: renamed from: n */
    public final void m2466n() {
        this.f3768g = false;
        C1017f c1017f = this.f3769h;
        c1017f.m2461c();
        c1017f.f3753j = false;
        C1017f c1017f2 = this.f3770i;
        c1017f2.m2461c();
        c1017f2.f3753j = false;
        this.f3766e.f3753j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f3763b.f3606W;
    }
}
