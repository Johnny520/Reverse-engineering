package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: TD */
/* JADX INFO: loaded from: classes.dex */
public final class C0830TD extends AbstractC1449gF {

    /* JADX INFO: renamed from: k */
    public C2628vd f2621k;

    /* JADX INFO: renamed from: l */
    public C0135D5 f2622l;

    @Override // p000.InterfaceC2542td
    /* JADX INFO: renamed from: a */
    public final void mo1546a(InterfaceC2542td interfaceC2542td) {
        float f;
        float f2;
        float f3;
        int i;
        if (AbstractC0213Ey.m424v(this.f5066j) == 3) {
            C2454rb c2454rb = this.f5058b;
            m2780l(c2454rb.f8589J, c2454rb.f8591L, 1);
            return;
        }
        C0750Rd c0750Rd = this.f5061e;
        if (c0750Rd.f9112c && !c0750Rd.f9119j && this.f5060d == 3) {
            C2454rb c2454rb2 = this.f5058b;
            int i2 = c2454rb2.f8640s;
            if (i2 == 2) {
                C2454rb c2454rb3 = c2454rb2.f8599T;
                if (c2454rb3 != null) {
                    if (c2454rb3.f8614e.f5061e.f9119j) {
                        c0750Rd.mo1539d((int) ((r5.f9116g * c2454rb2.f8647z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C0750Rd c0750Rd2 = c2454rb2.f8612d.f5061e;
                if (c0750Rd2.f9119j) {
                    int i3 = c2454rb2.f8603X;
                    if (i3 == -1) {
                        f = c0750Rd2.f9116g;
                        f2 = c2454rb2.f8602W;
                    } else if (i3 == 0) {
                        f3 = c0750Rd2.f9116g * c2454rb2.f8602W;
                        i = (int) (f3 + 0.5f);
                        c0750Rd.mo1539d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c0750Rd.mo1539d(i);
                    } else {
                        f = c0750Rd2.f9116g;
                        f2 = c2454rb2.f8602W;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    c0750Rd.mo1539d(i);
                }
            }
        }
        C2628vd c2628vd = this.f5064h;
        boolean z = c2628vd.f9112c;
        ArrayList arrayList = c2628vd.f9121l;
        if (z) {
            C2628vd c2628vd2 = this.f5065i;
            boolean z2 = c2628vd2.f9112c;
            ArrayList arrayList2 = c2628vd2.f9121l;
            if (z2) {
                if (c2628vd.f9119j && c2628vd2.f9119j && c0750Rd.f9119j) {
                    return;
                }
                if (!c0750Rd.f9119j && this.f5060d == 3) {
                    C2454rb c2454rb4 = this.f5058b;
                    if (c2454rb4.f8639r == 0 && !c2454rb4.m4945y()) {
                        C2628vd c2628vd3 = (C2628vd) arrayList.get(0);
                        C2628vd c2628vd4 = (C2628vd) arrayList2.get(0);
                        int i4 = c2628vd3.f9116g + c2628vd.f9115f;
                        int i5 = c2628vd4.f9116g + c2628vd2.f9115f;
                        c2628vd.mo1539d(i4);
                        c2628vd2.mo1539d(i5);
                        c0750Rd.mo1539d(i5 - i4);
                        return;
                    }
                }
                if (!c0750Rd.f9119j && this.f5060d == 3 && this.f5057a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C2628vd c2628vd5 = (C2628vd) arrayList.get(0);
                    int i6 = (((C2628vd) arrayList2.get(0)).f9116g + c2628vd2.f9115f) - (c2628vd5.f9116g + c2628vd.f9115f);
                    int i7 = c0750Rd.f2386m;
                    if (i6 < i7) {
                        c0750Rd.mo1539d(i6);
                    } else {
                        c0750Rd.mo1539d(i7);
                    }
                }
                if (c0750Rd.f9119j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C2628vd c2628vd6 = (C2628vd) arrayList.get(0);
                    C2628vd c2628vd7 = (C2628vd) arrayList2.get(0);
                    int i8 = c2628vd6.f9116g;
                    int i9 = c2628vd.f9115f + i8;
                    int i10 = c2628vd7.f9116g;
                    int i11 = c2628vd2.f9115f + i10;
                    float f4 = this.f5058b.f8615e0;
                    if (c2628vd6 == c2628vd7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c2628vd.mo1539d((int) ((((i10 - i8) - c0750Rd.f9116g) * f4) + i8 + 0.5f));
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
        C2454rb c2454rb3;
        C2454rb c2454rb4;
        C2628vd c2628vd = this.f2621k;
        C2454rb c2454rb5 = this.f5058b;
        boolean z = c2454rb5.f8606a;
        C0750Rd c0750Rd = this.f5061e;
        if (z) {
            c0750Rd.mo1539d(c2454rb5.m4933k());
        }
        boolean z2 = c0750Rd.f9119j;
        ArrayList arrayList = c0750Rd.f9120k;
        ArrayList arrayList2 = c0750Rd.f9121l;
        C2628vd c2628vd2 = this.f5065i;
        C2628vd c2628vd3 = this.f5064h;
        if (!z2) {
            C2454rb c2454rb6 = this.f5058b;
            this.f5060d = c2454rb6.f8637p0[1];
            if (c2454rb6.f8584E) {
                this.f2622l = new C0135D5(this);
            }
            int i = this.f5060d;
            if (i != 3) {
                if (i == 4 && (c2454rb4 = this.f5058b.f8599T) != null && c2454rb4.f8637p0[1] == 1) {
                    int iM4933k = (c2454rb4.m4933k() - this.f5058b.f8589J.m2384e()) - this.f5058b.f8591L.m2384e();
                    AbstractC1449gF.m2774b(c2628vd3, c2454rb4.f8614e.f5064h, this.f5058b.f8589J.m2384e());
                    AbstractC1449gF.m2774b(c2628vd2, c2454rb4.f8614e.f5065i, -this.f5058b.f8591L.m2384e());
                    c0750Rd.mo1539d(iM4933k);
                    return;
                }
                if (i == 1) {
                    c0750Rd.mo1539d(this.f5058b.m4933k());
                }
            }
        } else if (this.f5060d == 4 && (c2454rb2 = (c2454rb = this.f5058b).f8599T) != null && c2454rb2.f8637p0[1] == 1) {
            AbstractC1449gF.m2774b(c2628vd3, c2454rb2.f8614e.f5064h, c2454rb.f8589J.m2384e());
            AbstractC1449gF.m2774b(c2628vd2, c2454rb2.f8614e.f5065i, -this.f5058b.f8591L.m2384e());
            return;
        }
        boolean z3 = c0750Rd.f9119j;
        if (z3) {
            C2454rb c2454rb7 = this.f5058b;
            if (c2454rb7.f8606a) {
                C1259cb[] c1259cbArr = c2454rb7.f8596Q;
                C1259cb c1259cb = c1259cbArr[2];
                C1259cb c1259cb2 = c1259cb.f4270f;
                if (c1259cb2 != null && c1259cbArr[3].f4270f != null) {
                    if (c2454rb7.m4945y()) {
                        c2628vd3.f9115f = this.f5058b.f8596Q[2].m2384e();
                        c2628vd2.f9115f = -this.f5058b.f8596Q[3].m2384e();
                    } else {
                        C2628vd c2628vdM2775h = AbstractC1449gF.m2775h(this.f5058b.f8596Q[2]);
                        if (c2628vdM2775h != null) {
                            AbstractC1449gF.m2774b(c2628vd3, c2628vdM2775h, this.f5058b.f8596Q[2].m2384e());
                        }
                        C2628vd c2628vdM2775h2 = AbstractC1449gF.m2775h(this.f5058b.f8596Q[3]);
                        if (c2628vdM2775h2 != null) {
                            AbstractC1449gF.m2774b(c2628vd2, c2628vdM2775h2, -this.f5058b.f8596Q[3].m2384e());
                        }
                        c2628vd3.f9111b = true;
                        c2628vd2.f9111b = true;
                    }
                    C2454rb c2454rb8 = this.f5058b;
                    if (c2454rb8.f8584E) {
                        AbstractC1449gF.m2774b(c2628vd, c2628vd3, c2454rb8.f8607a0);
                        return;
                    }
                    return;
                }
                if (c1259cb2 != null) {
                    C2628vd c2628vdM2775h3 = AbstractC1449gF.m2775h(c1259cb);
                    if (c2628vdM2775h3 != null) {
                        AbstractC1449gF.m2774b(c2628vd3, c2628vdM2775h3, this.f5058b.f8596Q[2].m2384e());
                        AbstractC1449gF.m2774b(c2628vd2, c2628vd3, c0750Rd.f9116g);
                        C2454rb c2454rb9 = this.f5058b;
                        if (c2454rb9.f8584E) {
                            AbstractC1449gF.m2774b(c2628vd, c2628vd3, c2454rb9.f8607a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C1259cb c1259cb3 = c1259cbArr[3];
                if (c1259cb3.f4270f != null) {
                    C2628vd c2628vdM2775h4 = AbstractC1449gF.m2775h(c1259cb3);
                    if (c2628vdM2775h4 != null) {
                        AbstractC1449gF.m2774b(c2628vd2, c2628vdM2775h4, -this.f5058b.f8596Q[3].m2384e());
                        AbstractC1449gF.m2774b(c2628vd3, c2628vd2, -c0750Rd.f9116g);
                    }
                    C2454rb c2454rb10 = this.f5058b;
                    if (c2454rb10.f8584E) {
                        AbstractC1449gF.m2774b(c2628vd, c2628vd3, c2454rb10.f8607a0);
                        return;
                    }
                    return;
                }
                C1259cb c1259cb4 = c1259cbArr[4];
                if (c1259cb4.f4270f != null) {
                    C2628vd c2628vdM2775h5 = AbstractC1449gF.m2775h(c1259cb4);
                    if (c2628vdM2775h5 != null) {
                        AbstractC1449gF.m2774b(c2628vd, c2628vdM2775h5, 0);
                        AbstractC1449gF.m2774b(c2628vd3, c2628vd, -this.f5058b.f8607a0);
                        AbstractC1449gF.m2774b(c2628vd2, c2628vd3, c0750Rd.f9116g);
                        return;
                    }
                    return;
                }
                if ((c2454rb7 instanceof AbstractC2592uk) || c2454rb7.f8599T == null || c2454rb7.mo4340i(7).f4270f != null) {
                    return;
                }
                C2454rb c2454rb11 = this.f5058b;
                AbstractC1449gF.m2774b(c2628vd3, c2454rb11.f8599T.f8614e.f5064h, c2454rb11.m4939s());
                AbstractC1449gF.m2774b(c2628vd2, c2628vd3, c0750Rd.f9116g);
                C2454rb c2454rb12 = this.f5058b;
                if (c2454rb12.f8584E) {
                    AbstractC1449gF.m2774b(c2628vd, c2628vd3, c2454rb12.f8607a0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.f5060d != 3) {
            c0750Rd.m5143b(this);
        } else {
            C2454rb c2454rb13 = this.f5058b;
            int i2 = c2454rb13.f8640s;
            if (i2 == 2) {
                C2454rb c2454rb14 = c2454rb13.f8599T;
                if (c2454rb14 != null) {
                    C0750Rd c0750Rd2 = c2454rb14.f8614e.f5061e;
                    arrayList2.add(c0750Rd2);
                    c0750Rd2.f9120k.add(c0750Rd);
                    c0750Rd.f9111b = true;
                    arrayList.add(c2628vd3);
                    arrayList.add(c2628vd2);
                }
            } else if (i2 == 3 && !c2454rb13.m4945y()) {
                C2454rb c2454rb15 = this.f5058b;
                if (c2454rb15.f8639r != 3) {
                    C0750Rd c0750Rd3 = c2454rb15.f8612d.f5061e;
                    arrayList2.add(c0750Rd3);
                    c0750Rd3.f9120k.add(c0750Rd);
                    c0750Rd.f9111b = true;
                    arrayList.add(c2628vd3);
                    arrayList.add(c2628vd2);
                }
            }
        }
        C2454rb c2454rb16 = this.f5058b;
        C1259cb[] c1259cbArr2 = c2454rb16.f8596Q;
        C1259cb c1259cb5 = c1259cbArr2[2];
        C1259cb c1259cb6 = c1259cb5.f4270f;
        if (c1259cb6 != null && c1259cbArr2[3].f4270f != null) {
            if (c2454rb16.m4945y()) {
                c2628vd3.f9115f = this.f5058b.f8596Q[2].m2384e();
                c2628vd2.f9115f = -this.f5058b.f8596Q[3].m2384e();
            } else {
                C2628vd c2628vdM2775h6 = AbstractC1449gF.m2775h(this.f5058b.f8596Q[2]);
                C2628vd c2628vdM2775h7 = AbstractC1449gF.m2775h(this.f5058b.f8596Q[3]);
                if (c2628vdM2775h6 != null) {
                    c2628vdM2775h6.m5143b(this);
                }
                if (c2628vdM2775h7 != null) {
                    c2628vdM2775h7.m5143b(this);
                }
                this.f5066j = 4;
            }
            if (this.f5058b.f8584E) {
                m2777c(c2628vd, c2628vd3, 1, this.f2622l);
            }
        } else if (c1259cb6 != null) {
            C2628vd c2628vdM2775h8 = AbstractC1449gF.m2775h(c1259cb5);
            if (c2628vdM2775h8 != null) {
                AbstractC1449gF.m2774b(c2628vd3, c2628vdM2775h8, this.f5058b.f8596Q[2].m2384e());
                m2777c(c2628vd2, c2628vd3, 1, c0750Rd);
                if (this.f5058b.f8584E) {
                    m2777c(c2628vd, c2628vd3, 1, this.f2622l);
                }
                if (this.f5060d == 3) {
                    C2454rb c2454rb17 = this.f5058b;
                    if (c2454rb17.f8602W > 0.0f) {
                        C0757Rk c0757Rk = c2454rb17.f8612d;
                        if (c0757Rk.f5060d == 3) {
                            c0757Rk.f5061e.f9120k.add(c0750Rd);
                            arrayList2.add(this.f5058b.f8612d.f5061e);
                            c0750Rd.f9110a = this;
                        }
                    }
                }
            }
        } else {
            C1259cb c1259cb7 = c1259cbArr2[3];
            if (c1259cb7.f4270f != null) {
                C2628vd c2628vdM2775h9 = AbstractC1449gF.m2775h(c1259cb7);
                if (c2628vdM2775h9 != null) {
                    AbstractC1449gF.m2774b(c2628vd2, c2628vdM2775h9, -this.f5058b.f8596Q[3].m2384e());
                    m2777c(c2628vd3, c2628vd2, -1, c0750Rd);
                    if (this.f5058b.f8584E) {
                        m2777c(c2628vd, c2628vd3, 1, this.f2622l);
                    }
                }
            } else {
                C1259cb c1259cb8 = c1259cbArr2[4];
                if (c1259cb8.f4270f != null) {
                    C2628vd c2628vdM2775h10 = AbstractC1449gF.m2775h(c1259cb8);
                    if (c2628vdM2775h10 != null) {
                        AbstractC1449gF.m2774b(c2628vd, c2628vdM2775h10, 0);
                        m2777c(c2628vd3, c2628vd, -1, this.f2622l);
                        m2777c(c2628vd2, c2628vd3, 1, c0750Rd);
                    }
                } else if (!(c2454rb16 instanceof AbstractC2592uk) && (c2454rb3 = c2454rb16.f8599T) != null) {
                    AbstractC1449gF.m2774b(c2628vd3, c2454rb3.f8614e.f5064h, c2454rb16.m4939s());
                    m2777c(c2628vd2, c2628vd3, 1, c0750Rd);
                    if (this.f5058b.f8584E) {
                        m2777c(c2628vd, c2628vd3, 1, this.f2622l);
                    }
                    if (this.f5060d == 3) {
                        C2454rb c2454rb18 = this.f5058b;
                        if (c2454rb18.f8602W > 0.0f) {
                            C0757Rk c0757Rk2 = c2454rb18.f8612d;
                            if (c0757Rk2.f5060d == 3) {
                                c0757Rk2.f5061e.f9120k.add(c0750Rd);
                                arrayList2.add(this.f5058b.f8612d.f5061e);
                                c0750Rd.f9110a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            c0750Rd.f9112c = true;
        }
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: e */
    public final void mo1548e() {
        C2628vd c2628vd = this.f5064h;
        if (c2628vd.f9119j) {
            this.f5058b.f8605Z = c2628vd.f9116g;
        }
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: f */
    public final void mo1549f() {
        this.f5059c = null;
        this.f5064h.m5144c();
        this.f5065i.m5144c();
        this.f2621k.m5144c();
        this.f5061e.m5144c();
        this.f5063g = false;
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: k */
    public final boolean mo1550k() {
        return this.f5060d != 3 || this.f5058b.f8640s == 0;
    }

    /* JADX INFO: renamed from: m */
    public final void m1655m() {
        this.f5063g = false;
        C2628vd c2628vd = this.f5064h;
        c2628vd.m5144c();
        c2628vd.f9119j = false;
        C2628vd c2628vd2 = this.f5065i;
        c2628vd2.m5144c();
        c2628vd2.f9119j = false;
        C2628vd c2628vd3 = this.f2621k;
        c2628vd3.m5144c();
        c2628vd3.f9119j = false;
        this.f5061e.f9119j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f5058b.f8621h0;
    }
}
