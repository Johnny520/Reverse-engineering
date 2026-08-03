package p000a;

import p000a.AbstractC0639ih;
import p000a.C0222M3;
import p000a.C0240N3;

/* JADX INFO: renamed from: a.og */
/* JADX INFO: loaded from: classes.dex */
public final class C0752og extends AbstractC0639ih {

    /* JADX INFO: renamed from: k */
    public C0384V4 f2962k;

    /* JADX INFO: renamed from: l */
    public C0529d2 f2963l;

    @Override // p000a.AbstractC0639ih, p000a.InterfaceC0348T4
    /* JADX INFO: renamed from: a */
    public final void mo521a(InterfaceC0348T4 interfaceC0348T4) {
        float f;
        float f2;
        float f3;
        int i;
        if (this.f2351j.ordinal() == 3) {
            C0240N3 c0240n3 = this.f2343b;
            m1505l(c0240n3.f838z, c0240n3.f784B, 1);
            return;
        }
        C0684l5 c0684l5 = this.f2346e;
        boolean z = c0684l5.f1445c;
        C0240N3.a aVar = C0240N3.a.f841c;
        if (z && !c0684l5.f1452j && this.f2345d == aVar) {
            C0240N3 c0240n32 = this.f2343b;
            int i2 = c0240n32.f823k;
            if (i2 == 2) {
                C0240N3 c0240n33 = c0240n32.f793K;
                if (c0240n33 != null) {
                    if (c0240n33.f817e.f2346e.f1452j) {
                        c0684l5.mo1014d((int) ((r1.f1449g * c0240n32.f830r) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C0684l5 c0684l52 = c0240n32.f815d.f2346e;
                if (c0684l52.f1452j) {
                    int i3 = c0240n32.f797O;
                    if (i3 == -1) {
                        f = c0684l52.f1449g;
                        f2 = c0240n32.f796N;
                    } else if (i3 == 0) {
                        f3 = c0684l52.f1449g * c0240n32.f796N;
                        i = (int) (f3 + 0.5f);
                        c0684l5.mo1014d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c0684l5.mo1014d(i);
                    } else {
                        f = c0684l52.f1449g;
                        f2 = c0240n32.f796N;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    c0684l5.mo1014d(i);
                }
            }
        }
        C0384V4 c0384v4 = this.f2349h;
        if (c0384v4.f1445c) {
            C0384V4 c0384v42 = this.f2350i;
            if (c0384v42.f1445c) {
                if (c0384v4.f1452j && c0384v42.f1452j && c0684l5.f1452j) {
                    return;
                }
                if (!c0684l5.f1452j && this.f2345d == aVar) {
                    C0240N3 c0240n34 = this.f2343b;
                    if (c0240n34.f822j == 0 && !c0240n34.m654r()) {
                        C0384V4 c0384v43 = (C0384V4) c0384v4.f1454l.get(0);
                        C0384V4 c0384v44 = (C0384V4) c0384v42.f1454l.get(0);
                        int i4 = c0384v43.f1449g + c0384v4.f1448f;
                        int i5 = c0384v44.f1449g + c0384v42.f1448f;
                        c0384v4.mo1014d(i4);
                        c0384v42.mo1014d(i5);
                        c0684l5.mo1014d(i5 - i4);
                        return;
                    }
                }
                if (!c0684l5.f1452j && this.f2345d == aVar && this.f2342a == 1 && c0384v4.f1454l.size() > 0 && c0384v42.f1454l.size() > 0) {
                    C0384V4 c0384v45 = (C0384V4) c0384v4.f1454l.get(0);
                    int i6 = (((C0384V4) c0384v42.f1454l.get(0)).f1449g + c0384v42.f1448f) - (c0384v45.f1449g + c0384v4.f1448f);
                    int i7 = c0684l5.f2547m;
                    if (i6 < i7) {
                        c0684l5.mo1014d(i6);
                    } else {
                        c0684l5.mo1014d(i7);
                    }
                }
                if (c0684l5.f1452j && c0384v4.f1454l.size() > 0 && c0384v42.f1454l.size() > 0) {
                    C0384V4 c0384v46 = (C0384V4) c0384v4.f1454l.get(0);
                    C0384V4 c0384v47 = (C0384V4) c0384v42.f1454l.get(0);
                    int i8 = c0384v46.f1449g;
                    int i9 = c0384v4.f1448f + i8;
                    int i10 = c0384v47.f1449g;
                    int i11 = c0384v42.f1448f + i10;
                    float f4 = this.f2343b.f804V;
                    if (c0384v46 == c0384v47) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c0384v4.mo1014d((int) ((((i10 - i8) - c0684l5.f1449g) * f4) + i8 + 0.5f));
                    c0384v42.mo1014d(c0384v4.f1449g + c0684l5.f1449g);
                }
            }
        }
    }

    @Override // p000a.AbstractC0639ih
    /* JADX INFO: renamed from: d */
    public final void mo522d() {
        C0240N3 c0240n3;
        C0240N3 c0240n32;
        C0240N3 c0240n33;
        C0240N3 c0240n34;
        C0240N3 c0240n35 = this.f2343b;
        boolean z = c0240n35.f809a;
        C0684l5 c0684l5 = this.f2346e;
        if (z) {
            c0684l5.mo1014d(c0240n35.m645i());
        }
        boolean z2 = c0684l5.f1452j;
        C0240N3.a aVar = C0240N3.a.f842d;
        C0240N3.a aVar2 = C0240N3.a.f839a;
        C0240N3.a aVar3 = C0240N3.a.f841c;
        C0384V4 c0384v4 = this.f2350i;
        C0384V4 c0384v42 = this.f2349h;
        if (!z2) {
            C0240N3 c0240n36 = this.f2343b;
            this.f2345d = c0240n36.f792J[1];
            if (c0240n36.f835w) {
                this.f2963l = new C0529d2(this);
            }
            C0240N3.a aVar4 = this.f2345d;
            if (aVar4 != aVar3) {
                if (aVar4 == aVar && (c0240n34 = this.f2343b.f793K) != null && c0240n34.f792J[1] == aVar2) {
                    int iM645i = (c0240n34.m645i() - this.f2343b.f838z.m600c()) - this.f2343b.f784B.m600c();
                    C0752og c0752og = c0240n34.f817e;
                    AbstractC0639ih.m1500b(c0384v42, c0752og.f2349h, this.f2343b.f838z.m600c());
                    AbstractC0639ih.m1500b(c0384v4, c0752og.f2350i, -this.f2343b.f784B.m600c());
                    c0684l5.mo1014d(iM645i);
                    return;
                }
                if (aVar4 == aVar2) {
                    c0684l5.mo1014d(this.f2343b.m645i());
                }
            }
        } else if (this.f2345d == aVar && (c0240n32 = (c0240n3 = this.f2343b).f793K) != null && c0240n32.f792J[1] == aVar2) {
            C0752og c0752og2 = c0240n32.f817e;
            AbstractC0639ih.m1500b(c0384v42, c0752og2.f2349h, c0240n3.f838z.m600c());
            AbstractC0639ih.m1500b(c0384v4, c0752og2.f2350i, -this.f2343b.f784B.m600c());
            return;
        }
        boolean z3 = c0684l5.f1452j;
        C0384V4 c0384v43 = this.f2962k;
        if (z3) {
            C0240N3 c0240n37 = this.f2343b;
            if (c0240n37.f809a) {
                C0222M3[] c0222m3Arr = c0240n37.f789G;
                C0222M3 c0222m3 = c0222m3Arr[2];
                C0222M3 c0222m32 = c0222m3.f747d;
                if (c0222m32 != null && c0222m3Arr[3].f747d != null) {
                    if (c0240n37.m654r()) {
                        c0384v42.f1448f = this.f2343b.f789G[2].m600c();
                        c0384v4.f1448f = -this.f2343b.f789G[3].m600c();
                    } else {
                        C0384V4 c0384v4M1501h = AbstractC0639ih.m1501h(this.f2343b.f789G[2]);
                        if (c0384v4M1501h != null) {
                            AbstractC0639ih.m1500b(c0384v42, c0384v4M1501h, this.f2343b.f789G[2].m600c());
                        }
                        C0384V4 c0384v4M1501h2 = AbstractC0639ih.m1501h(this.f2343b.f789G[3]);
                        if (c0384v4M1501h2 != null) {
                            AbstractC0639ih.m1500b(c0384v4, c0384v4M1501h2, -this.f2343b.f789G[3].m600c());
                        }
                        c0384v42.f1444b = true;
                        c0384v4.f1444b = true;
                    }
                    C0240N3 c0240n38 = this.f2343b;
                    if (c0240n38.f835w) {
                        AbstractC0639ih.m1500b(c0384v43, c0384v42, c0240n38.f800R);
                        return;
                    }
                    return;
                }
                if (c0222m32 != null) {
                    C0384V4 c0384v4M1501h3 = AbstractC0639ih.m1501h(c0222m3);
                    if (c0384v4M1501h3 != null) {
                        AbstractC0639ih.m1500b(c0384v42, c0384v4M1501h3, this.f2343b.f789G[2].m600c());
                        AbstractC0639ih.m1500b(c0384v4, c0384v42, c0684l5.f1449g);
                        C0240N3 c0240n39 = this.f2343b;
                        if (c0240n39.f835w) {
                            AbstractC0639ih.m1500b(c0384v43, c0384v42, c0240n39.f800R);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0222M3 c0222m33 = c0222m3Arr[3];
                if (c0222m33.f747d != null) {
                    C0384V4 c0384v4M1501h4 = AbstractC0639ih.m1501h(c0222m33);
                    if (c0384v4M1501h4 != null) {
                        AbstractC0639ih.m1500b(c0384v4, c0384v4M1501h4, -this.f2343b.f789G[3].m600c());
                        AbstractC0639ih.m1500b(c0384v42, c0384v4, -c0684l5.f1449g);
                    }
                    C0240N3 c0240n310 = this.f2343b;
                    if (c0240n310.f835w) {
                        AbstractC0639ih.m1500b(c0384v43, c0384v42, c0240n310.f800R);
                        return;
                    }
                    return;
                }
                C0222M3 c0222m34 = c0222m3Arr[4];
                if (c0222m34.f747d != null) {
                    C0384V4 c0384v4M1501h5 = AbstractC0639ih.m1501h(c0222m34);
                    if (c0384v4M1501h5 != null) {
                        AbstractC0639ih.m1500b(c0384v43, c0384v4M1501h5, 0);
                        AbstractC0639ih.m1500b(c0384v42, c0384v43, -this.f2343b.f800R);
                        AbstractC0639ih.m1500b(c0384v4, c0384v42, c0684l5.f1449g);
                        return;
                    }
                    return;
                }
                if ((c0240n37 instanceof C0573f8) || c0240n37.f793K == null || c0240n37.mo643g(C0222M3.a.f756f).f747d != null) {
                    return;
                }
                C0240N3 c0240n311 = this.f2343b;
                AbstractC0639ih.m1500b(c0384v42, c0240n311.f793K.f817e.f2349h, c0240n311.m650n());
                AbstractC0639ih.m1500b(c0384v4, c0384v42, c0684l5.f1449g);
                C0240N3 c0240n312 = this.f2343b;
                if (c0240n312.f835w) {
                    AbstractC0639ih.m1500b(c0384v43, c0384v42, c0240n312.f800R);
                    return;
                }
                return;
            }
        }
        if (z3 || this.f2345d != aVar3) {
            c0684l5.m1012b(this);
        } else {
            C0240N3 c0240n313 = this.f2343b;
            int i = c0240n313.f823k;
            if (i == 2) {
                C0240N3 c0240n314 = c0240n313.f793K;
                if (c0240n314 != null) {
                    C0684l5 c0684l52 = c0240n314.f817e.f2346e;
                    c0684l5.f1454l.add(c0684l52);
                    c0684l52.f1453k.add(c0684l5);
                    c0684l5.f1444b = true;
                    c0684l5.f1453k.add(c0384v42);
                    c0684l5.f1453k.add(c0384v4);
                }
            } else if (i == 3 && !c0240n313.m654r()) {
                C0240N3 c0240n315 = this.f2343b;
                if (c0240n315.f822j != 3) {
                    C0684l5 c0684l53 = c0240n315.f815d.f2346e;
                    c0684l5.f1454l.add(c0684l53);
                    c0684l53.f1453k.add(c0684l5);
                    c0684l5.f1444b = true;
                    c0684l5.f1453k.add(c0384v42);
                    c0684l5.f1453k.add(c0384v4);
                }
            }
        }
        C0240N3 c0240n316 = this.f2343b;
        C0222M3[] c0222m3Arr2 = c0240n316.f789G;
        C0222M3 c0222m35 = c0222m3Arr2[2];
        C0222M3 c0222m36 = c0222m35.f747d;
        if (c0222m36 != null && c0222m3Arr2[3].f747d != null) {
            if (c0240n316.m654r()) {
                c0384v42.f1448f = this.f2343b.f789G[2].m600c();
                c0384v4.f1448f = -this.f2343b.f789G[3].m600c();
            } else {
                C0384V4 c0384v4M1501h6 = AbstractC0639ih.m1501h(this.f2343b.f789G[2]);
                C0384V4 c0384v4M1501h7 = AbstractC0639ih.m1501h(this.f2343b.f789G[3]);
                c0384v4M1501h6.m1012b(this);
                c0384v4M1501h7.m1012b(this);
                this.f2351j = AbstractC0639ih.a.f2353b;
            }
            if (this.f2343b.f835w) {
                m1503c(c0384v43, c0384v42, 1, this.f2963l);
            }
        } else if (c0222m36 != null) {
            C0384V4 c0384v4M1501h8 = AbstractC0639ih.m1501h(c0222m35);
            if (c0384v4M1501h8 != null) {
                AbstractC0639ih.m1500b(c0384v42, c0384v4M1501h8, this.f2343b.f789G[2].m600c());
                m1503c(c0384v4, c0384v42, 1, c0684l5);
                if (this.f2343b.f835w) {
                    m1503c(c0384v43, c0384v42, 1, this.f2963l);
                }
                if (this.f2345d == aVar3) {
                    C0240N3 c0240n317 = this.f2343b;
                    if (c0240n317.f796N > 0.0f) {
                        C0191K8 c0191k8 = c0240n317.f815d;
                        if (c0191k8.f2345d == aVar3) {
                            c0191k8.f2346e.f1453k.add(c0684l5);
                            c0684l5.f1454l.add(this.f2343b.f815d.f2346e);
                            c0684l5.f1443a = this;
                        }
                    }
                }
            }
        } else {
            C0222M3 c0222m37 = c0222m3Arr2[3];
            if (c0222m37.f747d != null) {
                C0384V4 c0384v4M1501h9 = AbstractC0639ih.m1501h(c0222m37);
                if (c0384v4M1501h9 != null) {
                    AbstractC0639ih.m1500b(c0384v4, c0384v4M1501h9, -this.f2343b.f789G[3].m600c());
                    m1503c(c0384v42, c0384v4, -1, c0684l5);
                    if (this.f2343b.f835w) {
                        m1503c(c0384v43, c0384v42, 1, this.f2963l);
                    }
                }
            } else {
                C0222M3 c0222m38 = c0222m3Arr2[4];
                if (c0222m38.f747d != null) {
                    C0384V4 c0384v4M1501h10 = AbstractC0639ih.m1501h(c0222m38);
                    if (c0384v4M1501h10 != null) {
                        AbstractC0639ih.m1500b(c0384v43, c0384v4M1501h10, 0);
                        m1503c(c0384v42, c0384v43, -1, this.f2963l);
                        m1503c(c0384v4, c0384v42, 1, c0684l5);
                    }
                } else if (!(c0240n316 instanceof C0573f8) && (c0240n33 = c0240n316.f793K) != null) {
                    AbstractC0639ih.m1500b(c0384v42, c0240n33.f817e.f2349h, c0240n316.m650n());
                    m1503c(c0384v4, c0384v42, 1, c0684l5);
                    if (this.f2343b.f835w) {
                        m1503c(c0384v43, c0384v42, 1, this.f2963l);
                    }
                    if (this.f2345d == aVar3) {
                        C0240N3 c0240n318 = this.f2343b;
                        if (c0240n318.f796N > 0.0f) {
                            C0191K8 c0191k82 = c0240n318.f815d;
                            if (c0191k82.f2345d == aVar3) {
                                c0191k82.f2346e.f1453k.add(c0684l5);
                                c0684l5.f1454l.add(this.f2343b.f815d.f2346e);
                                c0684l5.f1443a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c0684l5.f1454l.size() == 0) {
            c0684l5.f1445c = true;
        }
    }

    @Override // p000a.AbstractC0639ih
    /* JADX INFO: renamed from: e */
    public final void mo523e() {
        C0384V4 c0384v4 = this.f2349h;
        if (c0384v4.f1452j) {
            this.f2343b.f799Q = c0384v4.f1449g;
        }
    }

    @Override // p000a.AbstractC0639ih
    /* JADX INFO: renamed from: f */
    public final void mo524f() {
        this.f2344c = null;
        this.f2349h.m1013c();
        this.f2350i.m1013c();
        this.f2962k.m1013c();
        this.f2346e.m1013c();
        this.f2348g = false;
    }

    @Override // p000a.AbstractC0639ih
    /* JADX INFO: renamed from: k */
    public final boolean mo525k() {
        return this.f2345d != C0240N3.a.f841c || this.f2343b.f823k == 0;
    }

    /* JADX INFO: renamed from: m */
    public final void m1774m() {
        this.f2348g = false;
        C0384V4 c0384v4 = this.f2349h;
        c0384v4.m1013c();
        c0384v4.f1452j = false;
        C0384V4 c0384v42 = this.f2350i;
        c0384v42.m1013c();
        c0384v42.f1452j = false;
        C0384V4 c0384v43 = this.f2962k;
        c0384v43.m1013c();
        c0384v43.f1452j = false;
        this.f2346e.f1452j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f2343b.f807Y;
    }
}
