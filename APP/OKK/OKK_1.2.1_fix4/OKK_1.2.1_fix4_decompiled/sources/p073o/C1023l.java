package p073o;

import p069m.AbstractC0988h;
import p071n.AbstractC1004i;
import p071n.C0998c;
import p071n.C0999d;

/* JADX INFO: renamed from: o.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1023l extends AbstractC1024m {

    /* JADX INFO: renamed from: k */
    public C1017f f3760k;

    /* JADX INFO: renamed from: l */
    public C1012a f3761l;

    @Override // p073o.InterfaceC1015d
    /* JADX INFO: renamed from: a */
    public final void mo2445a(InterfaceC1015d interfaceC1015d) {
        float f2;
        float f3;
        float f4;
        int i2;
        if (AbstractC0988h.m2372a(this.f3771j) == 3) {
            C0999d c0999d = this.f3763b;
            m2475l(c0999d.f3637y, c0999d.f3584A, 1);
            return;
        }
        C1018g c1018g = this.f3766e;
        if (c1018g.f3746c && !c1018g.f3753j && this.f3765d == 3) {
            C0999d c0999d2 = this.f3763b;
            int i3 = c0999d2.f3623k;
            if (i3 == 2) {
                C0999d c0999d3 = c0999d2.f3592I;
                if (c0999d3 != null) {
                    if (c0999d3.f3617e.f3766e.f3753j) {
                        c1018g.mo2462d((int) ((r5.f3750g * c0999d2.f3630r) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                C1018g c1018g2 = c0999d2.f3616d.f3766e;
                if (c1018g2.f3753j) {
                    int i4 = c0999d2.f3596M;
                    if (i4 == -1) {
                        f2 = c1018g2.f3750g;
                        f3 = c0999d2.f3595L;
                    } else if (i4 == 0) {
                        f4 = c1018g2.f3750g * c0999d2.f3595L;
                        i2 = (int) (f4 + 0.5f);
                        c1018g.mo2462d(i2);
                    } else if (i4 != 1) {
                        i2 = 0;
                        c1018g.mo2462d(i2);
                    } else {
                        f2 = c1018g2.f3750g;
                        f3 = c0999d2.f3595L;
                    }
                    f4 = f2 / f3;
                    i2 = (int) (f4 + 0.5f);
                    c1018g.mo2462d(i2);
                }
            }
        }
        C1017f c1017f = this.f3769h;
        if (c1017f.f3746c) {
            C1017f c1017f2 = this.f3770i;
            if (c1017f2.f3746c) {
                if (c1017f.f3753j && c1017f2.f3753j && c1018g.f3753j) {
                    return;
                }
                if (!c1018g.f3753j && this.f3765d == 3) {
                    C0999d c0999d4 = this.f3763b;
                    if (c0999d4.f3622j == 0 && !c0999d4.m2413r()) {
                        C1017f c1017f3 = (C1017f) c1017f.f3755l.get(0);
                        C1017f c1017f4 = (C1017f) c1017f2.f3755l.get(0);
                        int i5 = c1017f3.f3750g + c1017f.f3749f;
                        int i6 = c1017f4.f3750g + c1017f2.f3749f;
                        c1017f.mo2462d(i5);
                        c1017f2.mo2462d(i6);
                        c1018g.mo2462d(i6 - i5);
                        return;
                    }
                }
                if (!c1018g.f3753j && this.f3765d == 3 && this.f3762a == 1 && c1017f.f3755l.size() > 0 && c1017f2.f3755l.size() > 0) {
                    C1017f c1017f5 = (C1017f) c1017f.f3755l.get(0);
                    int i7 = (((C1017f) c1017f2.f3755l.get(0)).f3750g + c1017f2.f3749f) - (c1017f5.f3750g + c1017f.f3749f);
                    int i8 = c1018g.f3756m;
                    if (i7 < i8) {
                        c1018g.mo2462d(i7);
                    } else {
                        c1018g.mo2462d(i8);
                    }
                }
                if (c1018g.f3753j && c1017f.f3755l.size() > 0 && c1017f2.f3755l.size() > 0) {
                    C1017f c1017f6 = (C1017f) c1017f.f3755l.get(0);
                    C1017f c1017f7 = (C1017f) c1017f2.f3755l.get(0);
                    int i9 = c1017f6.f3750g;
                    int i10 = c1017f.f3749f + i9;
                    int i11 = c1017f7.f3750g;
                    int i12 = c1017f2.f3749f + i11;
                    float f5 = this.f3763b.f3603T;
                    if (c1017f6 == c1017f7) {
                        f5 = 0.5f;
                    } else {
                        i9 = i10;
                        i11 = i12;
                    }
                    c1017f.mo2462d((int) ((((i11 - i9) - c1018g.f3750g) * f5) + i9 + 0.5f));
                    c1017f2.mo2462d(c1017f.f3750g + c1018g.f3750g);
                }
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
            c1018g.mo2462d(c0999d5.m2404i());
        }
        boolean z3 = c1018g.f3753j;
        C1017f c1017f = this.f3770i;
        C1017f c1017f2 = this.f3769h;
        if (!z3) {
            C0999d c0999d6 = this.f3763b;
            this.f3765d = c0999d6.f3615c0[1];
            if (c0999d6.f3635w) {
                this.f3761l = new C1012a(this);
            }
            int i2 = this.f3765d;
            if (i2 != 3) {
                if (i2 == 4 && (c0999d4 = this.f3763b.f3592I) != null && c0999d4.f3615c0[1] == 1) {
                    int iM2404i = (c0999d4.m2404i() - this.f3763b.f3637y.m2390c()) - this.f3763b.f3584A.m2390c();
                    C1023l c1023l = c0999d4.f3617e;
                    AbstractC1024m.m2470b(c1017f2, c1023l.f3769h, this.f3763b.f3637y.m2390c());
                    AbstractC1024m.m2470b(c1017f, c1023l.f3770i, -this.f3763b.f3584A.m2390c());
                    c1018g.mo2462d(iM2404i);
                    return;
                }
                if (i2 == 1) {
                    c1018g.mo2462d(this.f3763b.m2404i());
                }
            }
        } else if (this.f3765d == 4 && (c0999d2 = (c0999d = this.f3763b).f3592I) != null && c0999d2.f3615c0[1] == 1) {
            C1023l c1023l2 = c0999d2.f3617e;
            AbstractC1024m.m2470b(c1017f2, c1023l2.f3769h, c0999d.f3637y.m2390c());
            AbstractC1024m.m2470b(c1017f, c1023l2.f3770i, -this.f3763b.f3584A.m2390c());
            return;
        }
        boolean z4 = c1018g.f3753j;
        C1017f c1017f3 = this.f3760k;
        if (z4) {
            C0999d c0999d7 = this.f3763b;
            if (c0999d7.f3610a) {
                C0998c[] c0998cArr = c0999d7.f3589F;
                C0998c c0998c = c0998cArr[2];
                C0998c c0998c2 = c0998c.f3580d;
                if (c0998c2 != null && c0998cArr[3].f3580d != null) {
                    if (c0999d7.m2413r()) {
                        c1017f2.f3749f = this.f3763b.f3589F[2].m2390c();
                        c1017f.f3749f = -this.f3763b.f3589F[3].m2390c();
                    } else {
                        C1017f c1017fM2471h = AbstractC1024m.m2471h(this.f3763b.f3589F[2]);
                        if (c1017fM2471h != null) {
                            AbstractC1024m.m2470b(c1017f2, c1017fM2471h, this.f3763b.f3589F[2].m2390c());
                        }
                        C1017f c1017fM2471h2 = AbstractC1024m.m2471h(this.f3763b.f3589F[3]);
                        if (c1017fM2471h2 != null) {
                            AbstractC1024m.m2470b(c1017f, c1017fM2471h2, -this.f3763b.f3589F[3].m2390c());
                        }
                        c1017f2.f3745b = true;
                        c1017f.f3745b = true;
                    }
                    C0999d c0999d8 = this.f3763b;
                    if (c0999d8.f3635w) {
                        AbstractC1024m.m2470b(c1017f3, c1017f2, c0999d8.f3599P);
                        return;
                    }
                    return;
                }
                if (c0998c2 != null) {
                    C1017f c1017fM2471h3 = AbstractC1024m.m2471h(c0998c);
                    if (c1017fM2471h3 != null) {
                        AbstractC1024m.m2470b(c1017f2, c1017fM2471h3, this.f3763b.f3589F[2].m2390c());
                        AbstractC1024m.m2470b(c1017f, c1017f2, c1018g.f3750g);
                        C0999d c0999d9 = this.f3763b;
                        if (c0999d9.f3635w) {
                            AbstractC1024m.m2470b(c1017f3, c1017f2, c0999d9.f3599P);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0998c c0998c3 = c0998cArr[3];
                if (c0998c3.f3580d != null) {
                    C1017f c1017fM2471h4 = AbstractC1024m.m2471h(c0998c3);
                    if (c1017fM2471h4 != null) {
                        AbstractC1024m.m2470b(c1017f, c1017fM2471h4, -this.f3763b.f3589F[3].m2390c());
                        AbstractC1024m.m2470b(c1017f2, c1017f, -c1018g.f3750g);
                    }
                    C0999d c0999d10 = this.f3763b;
                    if (c0999d10.f3635w) {
                        AbstractC1024m.m2470b(c1017f3, c1017f2, c0999d10.f3599P);
                        return;
                    }
                    return;
                }
                C0998c c0998c4 = c0998cArr[4];
                if (c0998c4.f3580d != null) {
                    C1017f c1017fM2471h5 = AbstractC1024m.m2471h(c0998c4);
                    if (c1017fM2471h5 != null) {
                        AbstractC1024m.m2470b(c1017f3, c1017fM2471h5, 0);
                        AbstractC1024m.m2470b(c1017f2, c1017f3, -this.f3763b.f3599P);
                        AbstractC1024m.m2470b(c1017f, c1017f2, c1018g.f3750g);
                        return;
                    }
                    return;
                }
                if ((c0999d7 instanceof AbstractC1004i) || c0999d7.f3592I == null || c0999d7.mo2402g(7).f3580d != null) {
                    return;
                }
                C0999d c0999d11 = this.f3763b;
                AbstractC1024m.m2470b(c1017f2, c0999d11.f3592I.f3617e.f3769h, c0999d11.m2409n());
                AbstractC1024m.m2470b(c1017f, c1017f2, c1018g.f3750g);
                C0999d c0999d12 = this.f3763b;
                if (c0999d12.f3635w) {
                    AbstractC1024m.m2470b(c1017f3, c1017f2, c0999d12.f3599P);
                    return;
                }
                return;
            }
        }
        if (z4 || this.f3765d != 3) {
            c1018g.m2460b(this);
        } else {
            C0999d c0999d13 = this.f3763b;
            int i3 = c0999d13.f3623k;
            if (i3 == 2) {
                C0999d c0999d14 = c0999d13.f3592I;
                if (c0999d14 != null) {
                    C1018g c1018g2 = c0999d14.f3617e.f3766e;
                    c1018g.f3755l.add(c1018g2);
                    c1018g2.f3754k.add(c1018g);
                    c1018g.f3745b = true;
                    c1018g.f3754k.add(c1017f2);
                    c1018g.f3754k.add(c1017f);
                }
            } else if (i3 == 3 && !c0999d13.m2413r()) {
                C0999d c0999d15 = this.f3763b;
                if (c0999d15.f3622j != 3) {
                    C1018g c1018g3 = c0999d15.f3616d.f3766e;
                    c1018g.f3755l.add(c1018g3);
                    c1018g3.f3754k.add(c1018g);
                    c1018g.f3745b = true;
                    c1018g.f3754k.add(c1017f2);
                    c1018g.f3754k.add(c1017f);
                }
            }
        }
        C0999d c0999d16 = this.f3763b;
        C0998c[] c0998cArr2 = c0999d16.f3589F;
        C0998c c0998c5 = c0998cArr2[2];
        C0998c c0998c6 = c0998c5.f3580d;
        if (c0998c6 != null && c0998cArr2[3].f3580d != null) {
            if (c0999d16.m2413r()) {
                c1017f2.f3749f = this.f3763b.f3589F[2].m2390c();
                c1017f.f3749f = -this.f3763b.f3589F[3].m2390c();
            } else {
                C1017f c1017fM2471h6 = AbstractC1024m.m2471h(this.f3763b.f3589F[2]);
                C1017f c1017fM2471h7 = AbstractC1024m.m2471h(this.f3763b.f3589F[3]);
                c1017fM2471h6.m2460b(this);
                c1017fM2471h7.m2460b(this);
                this.f3771j = 4;
            }
            if (this.f3763b.f3635w) {
                m2473c(c1017f3, c1017f2, 1, this.f3761l);
            }
        } else if (c0998c6 != null) {
            C1017f c1017fM2471h8 = AbstractC1024m.m2471h(c0998c5);
            if (c1017fM2471h8 != null) {
                AbstractC1024m.m2470b(c1017f2, c1017fM2471h8, this.f3763b.f3589F[2].m2390c());
                m2473c(c1017f, c1017f2, 1, c1018g);
                if (this.f3763b.f3635w) {
                    m2473c(c1017f3, c1017f2, 1, this.f3761l);
                }
                if (this.f3765d == 3) {
                    C0999d c0999d17 = this.f3763b;
                    if (c0999d17.f3595L > 0.0f) {
                        C1021j c1021j = c0999d17.f3616d;
                        if (c1021j.f3765d == 3) {
                            c1021j.f3766e.f3754k.add(c1018g);
                            c1018g.f3755l.add(this.f3763b.f3616d.f3766e);
                            c1018g.f3744a = this;
                        }
                    }
                }
            }
        } else {
            C0998c c0998c7 = c0998cArr2[3];
            if (c0998c7.f3580d != null) {
                C1017f c1017fM2471h9 = AbstractC1024m.m2471h(c0998c7);
                if (c1017fM2471h9 != null) {
                    AbstractC1024m.m2470b(c1017f, c1017fM2471h9, -this.f3763b.f3589F[3].m2390c());
                    m2473c(c1017f2, c1017f, -1, c1018g);
                    if (this.f3763b.f3635w) {
                        m2473c(c1017f3, c1017f2, 1, this.f3761l);
                    }
                }
            } else {
                C0998c c0998c8 = c0998cArr2[4];
                if (c0998c8.f3580d != null) {
                    C1017f c1017fM2471h10 = AbstractC1024m.m2471h(c0998c8);
                    if (c1017fM2471h10 != null) {
                        AbstractC1024m.m2470b(c1017f3, c1017fM2471h10, 0);
                        m2473c(c1017f2, c1017f3, -1, this.f3761l);
                        m2473c(c1017f, c1017f2, 1, c1018g);
                    }
                } else if (!(c0999d16 instanceof AbstractC1004i) && (c0999d3 = c0999d16.f3592I) != null) {
                    AbstractC1024m.m2470b(c1017f2, c0999d3.f3617e.f3769h, c0999d16.m2409n());
                    m2473c(c1017f, c1017f2, 1, c1018g);
                    if (this.f3763b.f3635w) {
                        m2473c(c1017f3, c1017f2, 1, this.f3761l);
                    }
                    if (this.f3765d == 3) {
                        C0999d c0999d18 = this.f3763b;
                        if (c0999d18.f3595L > 0.0f) {
                            C1021j c1021j2 = c0999d18.f3616d;
                            if (c1021j2.f3765d == 3) {
                                c1021j2.f3766e.f3754k.add(c1018g);
                                c1018g.f3755l.add(this.f3763b.f3616d.f3766e);
                                c1018g.f3744a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c1018g.f3755l.size() == 0) {
            c1018g.f3746c = true;
        }
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: e */
    public final void mo2447e() {
        C1017f c1017f = this.f3769h;
        if (c1017f.f3753j) {
            this.f3763b.f3598O = c1017f.f3750g;
        }
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: f */
    public final void mo2448f() {
        this.f3764c = null;
        this.f3769h.m2461c();
        this.f3770i.m2461c();
        this.f3760k.m2461c();
        this.f3766e.m2461c();
        this.f3768g = false;
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: k */
    public final boolean mo2450k() {
        return this.f3765d != 3 || this.f3763b.f3623k == 0;
    }

    /* JADX INFO: renamed from: m */
    public final void m2469m() {
        this.f3768g = false;
        C1017f c1017f = this.f3769h;
        c1017f.m2461c();
        c1017f.f3753j = false;
        C1017f c1017f2 = this.f3770i;
        c1017f2.m2461c();
        c1017f2.f3753j = false;
        C1017f c1017f3 = this.f3760k;
        c1017f3.m2461c();
        c1017f3.f3753j = false;
        this.f3766e.f3753j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f3763b.f3606W;
    }
}
