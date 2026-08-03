package p000a;

import java.util.ArrayList;
import p000a.AbstractC0639ih;
import p000a.C0222M3;
import p000a.C0240N3;

/* JADX INFO: renamed from: a.K8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0191K8 extends AbstractC0639ih {

    /* JADX INFO: renamed from: k */
    public static final int[] f657k = new int[2];

    /* JADX INFO: renamed from: m */
    public static void m520m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
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

    /* JADX WARN: Removed duplicated region for block: B:116:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    @Override // p000a.AbstractC0639ih, p000a.InterfaceC0348T4
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo521a(InterfaceC0348T4 interfaceC0348T4) {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        if (this.f2351j.ordinal() == 3) {
            C0240N3 c0240n3 = this.f2343b;
            m1505l(c0240n3.f837y, c0240n3.f783A, 0);
            return;
        }
        C0684l5 c0684l5 = this.f2346e;
        boolean z = c0684l5.f1452j;
        C0240N3.a aVar = C0240N3.a.f841c;
        C0384V4 c0384v4 = this.f2349h;
        C0384V4 c0384v42 = this.f2350i;
        if (z || this.f2345d != aVar) {
            f = 0.5f;
        } else {
            C0240N3 c0240n32 = this.f2343b;
            int i2 = c0240n32.f822j;
            if (i2 == 2) {
                f = 0.5f;
                C0240N3 c0240n33 = c0240n32.f793K;
                if (c0240n33 != null) {
                    if (c0240n33.f815d.f2346e.f1452j) {
                        c0684l5.mo1014d((int) ((r3.f1449g * c0240n32.f827o) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = c0240n32.f823k;
                if (i3 == 0 || i3 == 3) {
                    C0752og c0752og = c0240n32.f817e;
                    C0384V4 c0384v43 = c0752og.f2349h;
                    C0384V4 c0384v44 = c0752og.f2350i;
                    boolean z2 = c0240n32.f837y.f747d != null;
                    boolean z3 = c0240n32.f838z.f747d != null;
                    boolean z4 = c0240n32.f783A.f747d != null;
                    boolean z5 = c0240n32.f784B.f747d != null;
                    f = 0.5f;
                    int i4 = c0240n32.f797O;
                    if (z2 && z3 && z4 && z5) {
                        float f5 = c0240n32.f796N;
                        boolean z6 = c0384v43.f1452j;
                        int[] iArr = f657k;
                        if (z6 && c0384v44.f1452j) {
                            if (c0384v4.f1445c && c0384v42.f1445c) {
                                m520m(iArr, ((C0384V4) c0384v4.f1454l.get(0)).f1449g + c0384v4.f1448f, ((C0384V4) c0384v42.f1454l.get(0)).f1449g - c0384v42.f1448f, c0384v43.f1449g + c0384v43.f1448f, c0384v44.f1449g - c0384v44.f1448f, f5, i4);
                                c0684l5.mo1014d(iArr[0]);
                                this.f2343b.f817e.f2346e.mo1014d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z7 = c0384v4.f1452j;
                        ArrayList arrayList = c0384v43.f1454l;
                        if (z7 && c0384v42.f1452j) {
                            if (!c0384v43.f1445c || !c0384v44.f1445c) {
                                return;
                            }
                            m520m(iArr, c0384v4.f1449g + c0384v4.f1448f, c0384v42.f1449g - c0384v42.f1448f, ((C0384V4) arrayList.get(0)).f1449g + c0384v43.f1448f, ((C0384V4) c0384v44.f1454l.get(0)).f1449g - c0384v44.f1448f, f5, i4);
                            c0684l5.mo1014d(iArr[0]);
                            this.f2343b.f817e.f2346e.mo1014d(iArr[1]);
                        }
                        if (!c0384v4.f1445c || !c0384v42.f1445c || !c0384v43.f1445c || !c0384v44.f1445c) {
                            return;
                        }
                        m520m(iArr, ((C0384V4) c0384v4.f1454l.get(0)).f1449g + c0384v4.f1448f, ((C0384V4) c0384v42.f1454l.get(0)).f1449g - c0384v42.f1448f, ((C0384V4) arrayList.get(0)).f1449g + c0384v43.f1448f, ((C0384V4) c0384v44.f1454l.get(0)).f1449g - c0384v44.f1448f, f5, i4);
                        c0684l5.mo1014d(iArr[0]);
                        this.f2343b.f817e.f2346e.mo1014d(iArr[1]);
                    } else if (z2 && z4) {
                        if (!c0384v4.f1445c || !c0384v42.f1445c) {
                            return;
                        }
                        float f6 = c0240n32.f796N;
                        int i5 = ((C0384V4) c0384v4.f1454l.get(0)).f1449g + c0384v4.f1448f;
                        int i6 = ((C0384V4) c0384v42.f1454l.get(0)).f1449g - c0384v42.f1448f;
                        if (i4 == -1 || i4 == 0) {
                            int iM1504g = m1504g(i6 - i5, 0);
                            int i7 = (int) ((iM1504g * f6) + 0.5f);
                            int iM1504g2 = m1504g(i7, 1);
                            if (i7 != iM1504g2) {
                                iM1504g = (int) ((iM1504g2 / f6) + 0.5f);
                            }
                            c0684l5.mo1014d(iM1504g);
                            this.f2343b.f817e.f2346e.mo1014d(iM1504g2);
                        } else if (i4 == 1) {
                            int iM1504g3 = m1504g(i6 - i5, 0);
                            int i8 = (int) ((iM1504g3 / f6) + 0.5f);
                            int iM1504g4 = m1504g(i8, 1);
                            if (i8 != iM1504g4) {
                                iM1504g3 = (int) ((iM1504g4 * f6) + 0.5f);
                            }
                            c0684l5.mo1014d(iM1504g3);
                            this.f2343b.f817e.f2346e.mo1014d(iM1504g4);
                        }
                    } else if (z3 && z5) {
                        if (!c0384v43.f1445c || !c0384v44.f1445c) {
                            return;
                        }
                        float f7 = c0240n32.f796N;
                        int i9 = ((C0384V4) c0384v43.f1454l.get(0)).f1449g + c0384v43.f1448f;
                        int i10 = ((C0384V4) c0384v44.f1454l.get(0)).f1449g - c0384v44.f1448f;
                        if (i4 == -1) {
                            int iM1504g5 = m1504g(i10 - i9, 1);
                            int i11 = (int) ((iM1504g5 / f7) + 0.5f);
                            int iM1504g6 = m1504g(i11, 0);
                            if (i11 != iM1504g6) {
                                iM1504g5 = (int) ((iM1504g6 * f7) + 0.5f);
                            }
                            c0684l5.mo1014d(iM1504g6);
                            this.f2343b.f817e.f2346e.mo1014d(iM1504g5);
                        } else if (i4 == 0) {
                            int iM1504g7 = m1504g(i10 - i9, 1);
                            int i12 = (int) ((iM1504g7 * f7) + 0.5f);
                            int iM1504g8 = m1504g(i12, 0);
                            if (i12 != iM1504g8) {
                                iM1504g7 = (int) ((iM1504g8 / f7) + 0.5f);
                            }
                            c0684l5.mo1014d(iM1504g8);
                            this.f2343b.f817e.f2346e.mo1014d(iM1504g7);
                        } else if (i4 == 1) {
                        }
                    }
                } else {
                    int i13 = c0240n32.f797O;
                    if (i13 == -1) {
                        f2 = c0240n32.f817e.f2346e.f1449g;
                        f3 = c0240n32.f796N;
                    } else if (i13 == 0) {
                        f4 = c0240n32.f817e.f2346e.f1449g / c0240n32.f796N;
                        i = (int) (f4 + 0.5f);
                        c0684l5.mo1014d(i);
                        f = 0.5f;
                    } else if (i13 != 1) {
                        i = 0;
                        c0684l5.mo1014d(i);
                        f = 0.5f;
                    } else {
                        f2 = c0240n32.f817e.f2346e.f1449g;
                        f3 = c0240n32.f796N;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    c0684l5.mo1014d(i);
                    f = 0.5f;
                }
            }
        }
        if (c0384v4.f1445c && c0384v42.f1445c) {
            if (c0384v4.f1452j && c0384v42.f1452j && c0684l5.f1452j) {
                return;
            }
            if (!c0684l5.f1452j && this.f2345d == aVar) {
                C0240N3 c0240n34 = this.f2343b;
                if (c0240n34.f822j == 0 && !c0240n34.m653q()) {
                    C0384V4 c0384v45 = (C0384V4) c0384v4.f1454l.get(0);
                    C0384V4 c0384v46 = (C0384V4) c0384v42.f1454l.get(0);
                    int i14 = c0384v45.f1449g + c0384v4.f1448f;
                    int i15 = c0384v46.f1449g + c0384v42.f1448f;
                    c0384v4.mo1014d(i14);
                    c0384v42.mo1014d(i15);
                    c0684l5.mo1014d(i15 - i14);
                    return;
                }
            }
            if (!c0684l5.f1452j && this.f2345d == aVar && this.f2342a == 1 && c0384v4.f1454l.size() > 0 && c0384v42.f1454l.size() > 0) {
                int iMin = Math.min((((C0384V4) c0384v42.f1454l.get(0)).f1449g + c0384v42.f1448f) - (((C0384V4) c0384v4.f1454l.get(0)).f1449g + c0384v4.f1448f), c0684l5.f2547m);
                C0240N3 c0240n35 = this.f2343b;
                int i16 = c0240n35.f826n;
                int iMax = Math.max(c0240n35.f825m, iMin);
                if (i16 > 0) {
                    iMax = Math.min(i16, iMax);
                }
                c0684l5.mo1014d(iMax);
            }
            if (c0684l5.f1452j) {
                C0384V4 c0384v47 = (C0384V4) c0384v4.f1454l.get(0);
                C0384V4 c0384v48 = (C0384V4) c0384v42.f1454l.get(0);
                int i17 = c0384v47.f1449g;
                int i18 = c0384v4.f1448f + i17;
                int i19 = c0384v48.f1449g;
                int i20 = c0384v42.f1448f + i19;
                float f8 = this.f2343b.f803U;
                if (c0384v47 == c0384v48) {
                    f8 = f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                c0384v4.mo1014d((int) ((((i19 - i17) - c0684l5.f1449g) * f8) + i17 + f));
                c0384v42.mo1014d(c0384v4.f1449g + c0684l5.f1449g);
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
            c0684l5.mo1014d(c0240n35.m648l());
        }
        boolean z2 = c0684l5.f1452j;
        C0240N3.a aVar = C0240N3.a.f842d;
        C0240N3.a aVar2 = C0240N3.a.f841c;
        C0240N3.a aVar3 = C0240N3.a.f839a;
        C0384V4 c0384v4 = this.f2350i;
        C0384V4 c0384v42 = this.f2349h;
        if (!z2) {
            C0240N3 c0240n36 = this.f2343b;
            C0240N3.a aVar4 = c0240n36.f792J[0];
            this.f2345d = aVar4;
            if (aVar4 != aVar2) {
                if (aVar4 == aVar && (((c0240n34 = c0240n36.f793K) != null && c0240n34.f792J[0] == aVar3) || c0240n34.f792J[0] == aVar)) {
                    int iM648l = (c0240n34.m648l() - this.f2343b.f837y.m600c()) - this.f2343b.f783A.m600c();
                    C0191K8 c0191k8 = c0240n34.f815d;
                    AbstractC0639ih.m1500b(c0384v42, c0191k8.f2349h, this.f2343b.f837y.m600c());
                    AbstractC0639ih.m1500b(c0384v4, c0191k8.f2350i, -this.f2343b.f783A.m600c());
                    c0684l5.mo1014d(iM648l);
                    return;
                }
                if (aVar4 == aVar3) {
                    c0684l5.mo1014d(c0240n36.m648l());
                }
            }
        } else if (this.f2345d == aVar && (((c0240n32 = (c0240n3 = this.f2343b).f793K) != null && c0240n32.f792J[0] == aVar3) || c0240n32.f792J[0] == aVar)) {
            AbstractC0639ih.m1500b(c0384v42, c0240n32.f815d.f2349h, c0240n3.f837y.m600c());
            AbstractC0639ih.m1500b(c0384v4, c0240n32.f815d.f2350i, -this.f2343b.f783A.m600c());
            return;
        }
        if (c0684l5.f1452j) {
            C0240N3 c0240n37 = this.f2343b;
            if (c0240n37.f809a) {
                C0222M3[] c0222m3Arr = c0240n37.f789G;
                C0222M3 c0222m3 = c0222m3Arr[0];
                C0222M3 c0222m32 = c0222m3.f747d;
                if (c0222m32 != null && c0222m3Arr[1].f747d != null) {
                    if (c0240n37.m653q()) {
                        c0384v42.f1448f = this.f2343b.f789G[0].m600c();
                        c0384v4.f1448f = -this.f2343b.f789G[1].m600c();
                        return;
                    }
                    C0384V4 c0384v4M1501h = AbstractC0639ih.m1501h(this.f2343b.f789G[0]);
                    if (c0384v4M1501h != null) {
                        AbstractC0639ih.m1500b(c0384v42, c0384v4M1501h, this.f2343b.f789G[0].m600c());
                    }
                    C0384V4 c0384v4M1501h2 = AbstractC0639ih.m1501h(this.f2343b.f789G[1]);
                    if (c0384v4M1501h2 != null) {
                        AbstractC0639ih.m1500b(c0384v4, c0384v4M1501h2, -this.f2343b.f789G[1].m600c());
                    }
                    c0384v42.f1444b = true;
                    c0384v4.f1444b = true;
                    return;
                }
                if (c0222m32 != null) {
                    C0384V4 c0384v4M1501h3 = AbstractC0639ih.m1501h(c0222m3);
                    if (c0384v4M1501h3 != null) {
                        AbstractC0639ih.m1500b(c0384v42, c0384v4M1501h3, this.f2343b.f789G[0].m600c());
                        AbstractC0639ih.m1500b(c0384v4, c0384v42, c0684l5.f1449g);
                        return;
                    }
                    return;
                }
                C0222M3 c0222m33 = c0222m3Arr[1];
                if (c0222m33.f747d != null) {
                    C0384V4 c0384v4M1501h4 = AbstractC0639ih.m1501h(c0222m33);
                    if (c0384v4M1501h4 != null) {
                        AbstractC0639ih.m1500b(c0384v4, c0384v4M1501h4, -this.f2343b.f789G[1].m600c());
                        AbstractC0639ih.m1500b(c0384v42, c0384v4, -c0684l5.f1449g);
                        return;
                    }
                    return;
                }
                if ((c0240n37 instanceof C0573f8) || c0240n37.f793K == null || c0240n37.mo643g(C0222M3.a.f756f).f747d != null) {
                    return;
                }
                C0240N3 c0240n38 = this.f2343b;
                AbstractC0639ih.m1500b(c0384v42, c0240n38.f793K.f815d.f2349h, c0240n38.m649m());
                AbstractC0639ih.m1500b(c0384v4, c0384v42, c0684l5.f1449g);
                return;
            }
        }
        if (this.f2345d == aVar2) {
            C0240N3 c0240n39 = this.f2343b;
            int i = c0240n39.f822j;
            if (i == 2) {
                C0240N3 c0240n310 = c0240n39.f793K;
                if (c0240n310 != null) {
                    C0684l5 c0684l52 = c0240n310.f817e.f2346e;
                    c0684l5.f1454l.add(c0684l52);
                    c0684l52.f1453k.add(c0684l5);
                    c0684l5.f1444b = true;
                    c0684l5.f1453k.add(c0384v42);
                    c0684l5.f1453k.add(c0384v4);
                }
            } else if (i == 3) {
                if (c0240n39.f823k == 3) {
                    c0384v42.f1443a = this;
                    c0384v4.f1443a = this;
                    C0752og c0752og = c0240n39.f817e;
                    c0752og.f2349h.f1443a = this;
                    c0752og.f2350i.f1443a = this;
                    c0684l5.f1443a = this;
                    if (c0240n39.m654r()) {
                        c0684l5.f1454l.add(this.f2343b.f817e.f2346e);
                        this.f2343b.f817e.f2346e.f1453k.add(c0684l5);
                        C0752og c0752og2 = this.f2343b.f817e;
                        c0752og2.f2346e.f1443a = this;
                        c0684l5.f1454l.add(c0752og2.f2349h);
                        c0684l5.f1454l.add(this.f2343b.f817e.f2350i);
                        this.f2343b.f817e.f2349h.f1453k.add(c0684l5);
                        this.f2343b.f817e.f2350i.f1453k.add(c0684l5);
                    } else if (this.f2343b.m653q()) {
                        this.f2343b.f817e.f2346e.f1454l.add(c0684l5);
                        c0684l5.f1453k.add(this.f2343b.f817e.f2346e);
                    } else {
                        this.f2343b.f817e.f2346e.f1454l.add(c0684l5);
                    }
                } else {
                    C0684l5 c0684l53 = c0240n39.f817e.f2346e;
                    c0684l5.f1454l.add(c0684l53);
                    c0684l53.f1453k.add(c0684l5);
                    this.f2343b.f817e.f2349h.f1453k.add(c0684l5);
                    this.f2343b.f817e.f2350i.f1453k.add(c0684l5);
                    c0684l5.f1444b = true;
                    c0684l5.f1453k.add(c0384v42);
                    c0684l5.f1453k.add(c0384v4);
                    c0384v42.f1454l.add(c0684l5);
                    c0384v4.f1454l.add(c0684l5);
                }
            }
        }
        C0240N3 c0240n311 = this.f2343b;
        C0222M3[] c0222m3Arr2 = c0240n311.f789G;
        C0222M3 c0222m34 = c0222m3Arr2[0];
        C0222M3 c0222m35 = c0222m34.f747d;
        if (c0222m35 != null && c0222m3Arr2[1].f747d != null) {
            if (c0240n311.m653q()) {
                c0384v42.f1448f = this.f2343b.f789G[0].m600c();
                c0384v4.f1448f = -this.f2343b.f789G[1].m600c();
                return;
            }
            C0384V4 c0384v4M1501h5 = AbstractC0639ih.m1501h(this.f2343b.f789G[0]);
            C0384V4 c0384v4M1501h6 = AbstractC0639ih.m1501h(this.f2343b.f789G[1]);
            c0384v4M1501h5.m1012b(this);
            c0384v4M1501h6.m1012b(this);
            this.f2351j = AbstractC0639ih.a.f2353b;
            return;
        }
        if (c0222m35 != null) {
            C0384V4 c0384v4M1501h7 = AbstractC0639ih.m1501h(c0222m34);
            if (c0384v4M1501h7 != null) {
                AbstractC0639ih.m1500b(c0384v42, c0384v4M1501h7, this.f2343b.f789G[0].m600c());
                m1503c(c0384v4, c0384v42, 1, c0684l5);
                return;
            }
            return;
        }
        C0222M3 c0222m36 = c0222m3Arr2[1];
        if (c0222m36.f747d != null) {
            C0384V4 c0384v4M1501h8 = AbstractC0639ih.m1501h(c0222m36);
            if (c0384v4M1501h8 != null) {
                AbstractC0639ih.m1500b(c0384v4, c0384v4M1501h8, -this.f2343b.f789G[1].m600c());
                m1503c(c0384v42, c0384v4, -1, c0684l5);
                return;
            }
            return;
        }
        if ((c0240n311 instanceof C0573f8) || (c0240n33 = c0240n311.f793K) == null) {
            return;
        }
        AbstractC0639ih.m1500b(c0384v42, c0240n33.f815d.f2349h, c0240n311.m649m());
        m1503c(c0384v4, c0384v42, 1, c0684l5);
    }

    @Override // p000a.AbstractC0639ih
    /* JADX INFO: renamed from: e */
    public final void mo523e() {
        C0384V4 c0384v4 = this.f2349h;
        if (c0384v4.f1452j) {
            this.f2343b.f798P = c0384v4.f1449g;
        }
    }

    @Override // p000a.AbstractC0639ih
    /* JADX INFO: renamed from: f */
    public final void mo524f() {
        this.f2344c = null;
        this.f2349h.m1013c();
        this.f2350i.m1013c();
        this.f2346e.m1013c();
        this.f2348g = false;
    }

    @Override // p000a.AbstractC0639ih
    /* JADX INFO: renamed from: k */
    public final boolean mo525k() {
        return this.f2345d != C0240N3.a.f841c || this.f2343b.f822j == 0;
    }

    /* JADX INFO: renamed from: n */
    public final void m526n() {
        this.f2348g = false;
        C0384V4 c0384v4 = this.f2349h;
        c0384v4.m1013c();
        c0384v4.f1452j = false;
        C0384V4 c0384v42 = this.f2350i;
        c0384v42.m1013c();
        c0384v42.f1452j = false;
        this.f2346e.f1452j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f2343b.f807Y;
    }
}
