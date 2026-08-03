package p069m;

import java.util.Arrays;
import p034S.AbstractC0324d;
import p043Y.C0463v;

/* JADX INFO: renamed from: m.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0990j implements InterfaceC0982b {

    /* JADX INFO: renamed from: a */
    public int f3518a = 16;

    /* JADX INFO: renamed from: b */
    public final int[] f3519b = new int[16];

    /* JADX INFO: renamed from: c */
    public int[] f3520c = new int[16];

    /* JADX INFO: renamed from: d */
    public int[] f3521d = new int[16];

    /* JADX INFO: renamed from: e */
    public float[] f3522e = new float[16];

    /* JADX INFO: renamed from: f */
    public int[] f3523f = new int[16];

    /* JADX INFO: renamed from: g */
    public int[] f3524g = new int[16];

    /* JADX INFO: renamed from: h */
    public int f3525h = 0;

    /* JADX INFO: renamed from: i */
    public int f3526i = -1;

    /* JADX INFO: renamed from: j */
    public final C0983c f3527j;

    /* JADX INFO: renamed from: k */
    public final C0463v f3528k;

    public C0990j(C0983c c0983c, C0463v c0463v) {
        this.f3527j = c0983c;
        this.f3528k = c0463v;
        clear();
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: a */
    public final float mo2333a(int i2) {
        int i3 = this.f3525h;
        int i4 = this.f3526i;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2) {
                return this.f3522e[i4];
            }
            i4 = this.f3524g[i4];
            if (i4 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: b */
    public final boolean mo2334b(C0989i c0989i) {
        return m2379n(c0989i) != -1;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: c */
    public final void mo2335c(C0989i c0989i, float f2) {
        if (f2 > -0.001f && f2 < 0.001f) {
            mo2341i(c0989i, true);
            return;
        }
        int i2 = 0;
        if (this.f3525h == 0) {
            m2378m(0, c0989i, f2);
            m2377l(c0989i, 0);
            this.f3526i = 0;
            return;
        }
        int iM2379n = m2379n(c0989i);
        if (iM2379n != -1) {
            this.f3522e[iM2379n] = f2;
            return;
        }
        int i3 = this.f3525h + 1;
        int i4 = this.f3518a;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            this.f3521d = Arrays.copyOf(this.f3521d, i5);
            this.f3522e = Arrays.copyOf(this.f3522e, i5);
            this.f3523f = Arrays.copyOf(this.f3523f, i5);
            this.f3524g = Arrays.copyOf(this.f3524g, i5);
            this.f3520c = Arrays.copyOf(this.f3520c, i5);
            for (int i6 = this.f3518a; i6 < i5; i6++) {
                this.f3521d[i6] = -1;
                this.f3520c[i6] = -1;
            }
            this.f3518a = i5;
        }
        int i7 = this.f3525h;
        int i8 = this.f3526i;
        int i9 = -1;
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = this.f3521d[i8];
            int i12 = c0989i.f3507b;
            if (i11 == i12) {
                this.f3522e[i8] = f2;
                return;
            }
            if (i11 < i12) {
                i9 = i8;
            }
            i8 = this.f3524g[i8];
            if (i8 == -1) {
                break;
            }
        }
        while (true) {
            if (i2 >= this.f3518a) {
                i2 = -1;
                break;
            } else if (this.f3521d[i2] == -1) {
                break;
            } else {
                i2++;
            }
        }
        m2378m(i2, c0989i, f2);
        if (i9 != -1) {
            this.f3523f[i2] = i9;
            int[] iArr = this.f3524g;
            iArr[i2] = iArr[i9];
            iArr[i9] = i2;
        } else {
            this.f3523f[i2] = -1;
            if (this.f3525h > 0) {
                this.f3524g[i2] = this.f3526i;
                this.f3526i = i2;
            } else {
                this.f3524g[i2] = -1;
            }
        }
        int i13 = this.f3524g[i2];
        if (i13 != -1) {
            this.f3523f[i13] = i2;
        }
        m2377l(c0989i, i2);
    }

    @Override // p069m.InterfaceC0982b
    public final void clear() {
        int i2 = this.f3525h;
        for (int i3 = 0; i3 < i2; i3++) {
            C0989i c0989iMo2336d = mo2336d(i3);
            if (c0989iMo2336d != null) {
                c0989iMo2336d.m2374b(this.f3527j);
            }
        }
        for (int i4 = 0; i4 < this.f3518a; i4++) {
            this.f3521d[i4] = -1;
            this.f3520c[i4] = -1;
        }
        for (int i5 = 0; i5 < 16; i5++) {
            this.f3519b[i5] = -1;
        }
        this.f3525h = 0;
        this.f3526i = -1;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: d */
    public final C0989i mo2336d(int i2) {
        int i3 = this.f3525h;
        if (i3 == 0) {
            return null;
        }
        int i4 = this.f3526i;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2 && i4 != -1) {
                return ((C0989i[]) this.f3528k.f1047d)[this.f3521d[i4]];
            }
            i4 = this.f3524g[i4];
            if (i4 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: e */
    public final void mo2337e(float f2) {
        int i2 = this.f3525h;
        int i3 = this.f3526i;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f3522e;
            fArr[i3] = fArr[i3] / f2;
            i3 = this.f3524g[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: f */
    public final void mo2338f(C0989i c0989i, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int iM2379n = m2379n(c0989i);
            if (iM2379n == -1) {
                mo2335c(c0989i, f2);
                return;
            }
            float[] fArr = this.f3522e;
            float f3 = fArr[iM2379n] + f2;
            fArr[iM2379n] = f3;
            if (f3 <= -0.001f || f3 >= 0.001f) {
                return;
            }
            fArr[iM2379n] = 0.0f;
            mo2341i(c0989i, z2);
        }
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: g */
    public final float mo2339g(C0989i c0989i) {
        int iM2379n = m2379n(c0989i);
        if (iM2379n != -1) {
            return this.f3522e[iM2379n];
        }
        return 0.0f;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: h */
    public final float mo2340h(C0983c c0983c, boolean z2) {
        float fMo2339g = mo2339g(c0983c.f3479a);
        mo2341i(c0983c.f3479a, z2);
        C0990j c0990j = (C0990j) c0983c.f3482d;
        int i2 = c0990j.f3525h;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = c0990j.f3521d[i4];
            if (i5 != -1) {
                mo2338f(((C0989i[]) this.f3528k.f1047d)[i5], c0990j.f3522e[i4] * fMo2339g, z2);
                i3++;
            }
            i4++;
        }
        return fMo2339g;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: i */
    public final float mo2341i(C0989i c0989i, boolean z2) {
        int[] iArr;
        int i2;
        int iM2379n = m2379n(c0989i);
        if (iM2379n == -1) {
            return 0.0f;
        }
        int i3 = c0989i.f3507b;
        int i4 = i3 % 16;
        int[] iArr2 = this.f3519b;
        int i5 = iArr2[i4];
        if (i5 != -1) {
            if (this.f3521d[i5] == i3) {
                int[] iArr3 = this.f3520c;
                iArr2[i4] = iArr3[i5];
                iArr3[i5] = -1;
            } else {
                while (true) {
                    iArr = this.f3520c;
                    i2 = iArr[i5];
                    if (i2 == -1 || this.f3521d[i2] == i3) {
                        break;
                    }
                    i5 = i2;
                }
                if (i2 != -1 && this.f3521d[i2] == i3) {
                    iArr[i5] = iArr[i2];
                    iArr[i2] = -1;
                }
            }
        }
        float f2 = this.f3522e[iM2379n];
        if (this.f3526i == iM2379n) {
            this.f3526i = this.f3524g[iM2379n];
        }
        this.f3521d[iM2379n] = -1;
        int[] iArr4 = this.f3523f;
        int i6 = iArr4[iM2379n];
        if (i6 != -1) {
            int[] iArr5 = this.f3524g;
            iArr5[i6] = iArr5[iM2379n];
        }
        int i7 = this.f3524g[iM2379n];
        if (i7 != -1) {
            iArr4[i7] = iArr4[iM2379n];
        }
        this.f3525h--;
        c0989i.f3516k--;
        if (z2) {
            c0989i.m2374b(this.f3527j);
        }
        return f2;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: j */
    public final void mo2342j() {
        int i2 = this.f3525h;
        int i3 = this.f3526i;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f3522e;
            fArr[i3] = fArr[i3] * (-1.0f);
            i3 = this.f3524g[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: k */
    public final int mo2343k() {
        return this.f3525h;
    }

    /* JADX INFO: renamed from: l */
    public final void m2377l(C0989i c0989i, int i2) {
        int[] iArr;
        int i3 = c0989i.f3507b % 16;
        int[] iArr2 = this.f3519b;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            iArr2[i3] = i2;
        } else {
            while (true) {
                iArr = this.f3520c;
                int i5 = iArr[i4];
                if (i5 == -1) {
                    break;
                } else {
                    i4 = i5;
                }
            }
            iArr[i4] = i2;
        }
        this.f3520c[i2] = -1;
    }

    /* JADX INFO: renamed from: m */
    public final void m2378m(int i2, C0989i c0989i, float f2) {
        this.f3521d[i2] = c0989i.f3507b;
        this.f3522e[i2] = f2;
        this.f3523f[i2] = -1;
        this.f3524g[i2] = -1;
        c0989i.m2373a(this.f3527j);
        c0989i.f3516k++;
        this.f3525h++;
    }

    /* JADX INFO: renamed from: n */
    public final int m2379n(C0989i c0989i) {
        if (this.f3525h == 0) {
            return -1;
        }
        int i2 = c0989i.f3507b;
        int i3 = this.f3519b[i2 % 16];
        if (i3 == -1) {
            return -1;
        }
        if (this.f3521d[i3] == i2) {
            return i3;
        }
        do {
            i3 = this.f3520c[i3];
            if (i3 == -1) {
                break;
            }
        } while (this.f3521d[i3] != i2);
        if (i3 != -1 && this.f3521d[i3] == i2) {
            return i3;
        }
        return -1;
    }

    public final String toString() {
        String strM722e = hashCode() + " { ";
        int i2 = this.f3525h;
        for (int i3 = 0; i3 < i2; i3++) {
            C0989i c0989iMo2336d = mo2336d(i3);
            if (c0989iMo2336d != null) {
                String str = strM722e + c0989iMo2336d + " = " + mo2333a(i3) + " ";
                int iM2379n = m2379n(c0989iMo2336d);
                String strM722e2 = AbstractC0324d.m722e(str, "[p: ");
                int i4 = this.f3523f[iM2379n];
                C0463v c0463v = this.f3528k;
                String strM722e3 = AbstractC0324d.m722e(i4 != -1 ? strM722e2 + ((C0989i[]) c0463v.f1047d)[this.f3521d[this.f3523f[iM2379n]]] : AbstractC0324d.m722e(strM722e2, "none"), ", n: ");
                strM722e = AbstractC0324d.m722e(this.f3524g[iM2379n] != -1 ? strM722e3 + ((C0989i[]) c0463v.f1047d)[this.f3521d[this.f3524g[iM2379n]]] : AbstractC0324d.m722e(strM722e3, "none"), "]");
            }
        }
        return AbstractC0324d.m722e(strM722e, " }");
    }
}
