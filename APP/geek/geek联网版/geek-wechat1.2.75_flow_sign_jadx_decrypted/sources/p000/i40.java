package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i40 implements InterfaceC0548o6 {

    /* JADX INFO: renamed from: a */
    public int f2326a = 16;

    /* JADX INFO: renamed from: b */
    public final int[] f2327b = new int[16];

    /* JADX INFO: renamed from: c */
    public int[] f2328c = new int[16];

    /* JADX INFO: renamed from: d */
    public int[] f2329d = new int[16];

    /* JADX INFO: renamed from: e */
    public float[] f2330e = new float[16];

    /* JADX INFO: renamed from: f */
    public int[] f2331f = new int[16];

    /* JADX INFO: renamed from: g */
    public int[] f2332g = new int[16];

    /* JADX INFO: renamed from: h */
    public int f2333h = 0;

    /* JADX INFO: renamed from: i */
    public int f2334i = -1;

    /* JADX INFO: renamed from: j */
    public final C0160dr f2335j;

    /* JADX INFO: renamed from: k */
    public final C0402k8 f2336k;

    public i40(C0160dr c0160dr, C0402k8 c0402k8) {
        this.f2335j = c0160dr;
        this.f2336k = c0402k8;
        clear();
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: a */
    public final float mo1443a(int i) {
        int i2 = this.f2333h;
        int i3 = this.f2334i;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f2330e[i3];
            }
            i3 = this.f2332g[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: b */
    public final float mo1444b(h40 h40Var) {
        int iM1456n = m1456n(h40Var);
        if (iM1456n != -1) {
            return this.f2330e[iM1456n];
        }
        return 0.0f;
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: c */
    public final boolean mo1445c(h40 h40Var) {
        return m1456n(h40Var) != -1;
    }

    @Override // p000.InterfaceC0548o6
    public final void clear() {
        int i = this.f2333h;
        for (int i2 = 0; i2 < i; i2++) {
            h40 h40VarMo1447e = mo1447e(i2);
            if (h40VarMo1447e != null) {
                h40VarMo1447e.m1352b(this.f2335j);
            }
        }
        for (int i3 = 0; i3 < this.f2326a; i3++) {
            this.f2329d[i3] = -1;
            this.f2328c[i3] = -1;
        }
        for (int i4 = 0; i4 < 16; i4++) {
            this.f2327b[i4] = -1;
        }
        this.f2333h = 0;
        this.f2334i = -1;
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: d */
    public final float mo1446d(h40 h40Var, boolean z) {
        int[] iArr;
        int i;
        int iM1456n = m1456n(h40Var);
        if (iM1456n == -1) {
            return 0.0f;
        }
        int i2 = h40Var.f2101b;
        int i3 = i2 % 16;
        int[] iArr2 = this.f2327b;
        int i4 = iArr2[i3];
        if (i4 != -1) {
            if (this.f2329d[i4] == i2) {
                int[] iArr3 = this.f2328c;
                iArr2[i3] = iArr3[i4];
                iArr3[i4] = -1;
            } else {
                while (true) {
                    iArr = this.f2328c;
                    i = iArr[i4];
                    if (i == -1 || this.f2329d[i] == i2) {
                        break;
                    }
                    i4 = i;
                }
                if (i != -1 && this.f2329d[i] == i2) {
                    iArr[i4] = iArr[i];
                    iArr[i] = -1;
                }
            }
        }
        float f = this.f2330e[iM1456n];
        if (this.f2334i == iM1456n) {
            this.f2334i = this.f2332g[iM1456n];
        }
        this.f2329d[iM1456n] = -1;
        int[] iArr4 = this.f2331f;
        int i5 = iArr4[iM1456n];
        if (i5 != -1) {
            int[] iArr5 = this.f2332g;
            iArr5[i5] = iArr5[iM1456n];
        }
        int i6 = this.f2332g[iM1456n];
        if (i6 != -1) {
            iArr4[i6] = iArr4[iM1456n];
        }
        this.f2333h--;
        h40Var.f2110k--;
        if (z) {
            h40Var.m1352b(this.f2335j);
        }
        return f;
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: e */
    public final h40 mo1447e(int i) {
        int i2 = this.f2333h;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f2334i;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return ((h40[]) this.f2336k.f2797d)[this.f2329d[i3]];
            }
            i3 = this.f2332g[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: f */
    public final void mo1448f(h40 h40Var, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int iM1456n = m1456n(h40Var);
            if (iM1456n == -1) {
                mo1451i(h40Var, f);
                return;
            }
            float[] fArr = this.f2330e;
            float f2 = fArr[iM1456n] + f;
            fArr[iM1456n] = f2;
            if (f2 <= -0.001f || f2 >= 0.001f) {
                return;
            }
            fArr[iM1456n] = 0.0f;
            mo1446d(h40Var, z);
        }
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: g */
    public final float mo1449g(C0585p6 c0585p6, boolean z) {
        float fMo1444b = mo1444b(c0585p6.f3600a);
        mo1446d(c0585p6.f3600a, z);
        i40 i40Var = (i40) c0585p6.f3603d;
        int i = i40Var.f2333h;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = i40Var.f2329d[i3];
            if (i4 != -1) {
                mo1448f(((h40[]) this.f2336k.f2797d)[i4], i40Var.f2330e[i3] * fMo1444b, z);
                i2++;
            }
            i3++;
        }
        return fMo1444b;
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: h */
    public final void mo1450h(float f) {
        int i = this.f2333h;
        int i2 = this.f2334i;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f2330e;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f2332g[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: i */
    public final void mo1451i(h40 h40Var, float f) {
        if (f > -0.001f && f < 0.001f) {
            mo1446d(h40Var, true);
            return;
        }
        int i = 0;
        if (this.f2333h == 0) {
            m1455m(0, h40Var, f);
            m1454l(h40Var, 0);
            this.f2334i = 0;
            return;
        }
        int iM1456n = m1456n(h40Var);
        if (iM1456n != -1) {
            this.f2330e[iM1456n] = f;
            return;
        }
        int i2 = this.f2333h + 1;
        int i3 = this.f2326a;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            this.f2329d = Arrays.copyOf(this.f2329d, i4);
            this.f2330e = Arrays.copyOf(this.f2330e, i4);
            this.f2331f = Arrays.copyOf(this.f2331f, i4);
            this.f2332g = Arrays.copyOf(this.f2332g, i4);
            this.f2328c = Arrays.copyOf(this.f2328c, i4);
            for (int i5 = this.f2326a; i5 < i4; i5++) {
                this.f2329d[i5] = -1;
                this.f2328c[i5] = -1;
            }
            this.f2326a = i4;
        }
        int i6 = this.f2333h;
        int i7 = this.f2334i;
        int i8 = -1;
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = this.f2329d[i7];
            int i11 = h40Var.f2101b;
            if (i10 == i11) {
                this.f2330e[i7] = f;
                return;
            }
            if (i10 < i11) {
                i8 = i7;
            }
            i7 = this.f2332g[i7];
            if (i7 == -1) {
                break;
            }
        }
        while (true) {
            if (i >= this.f2326a) {
                i = -1;
                break;
            } else if (this.f2329d[i] == -1) {
                break;
            } else {
                i++;
            }
        }
        m1455m(i, h40Var, f);
        if (i8 != -1) {
            this.f2331f[i] = i8;
            int[] iArr = this.f2332g;
            iArr[i] = iArr[i8];
            iArr[i8] = i;
        } else {
            this.f2331f[i] = -1;
            if (this.f2333h > 0) {
                this.f2332g[i] = this.f2334i;
                this.f2334i = i;
            } else {
                this.f2332g[i] = -1;
            }
        }
        int i12 = this.f2332g[i];
        if (i12 != -1) {
            this.f2331f[i12] = i;
        }
        m1454l(h40Var, i);
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: j */
    public final void mo1452j() {
        int i = this.f2333h;
        int i2 = this.f2334i;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f2330e;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f2332g[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: k */
    public final int mo1453k() {
        return this.f2333h;
    }

    /* JADX INFO: renamed from: l */
    public final void m1454l(h40 h40Var, int i) {
        int[] iArr;
        int i2 = h40Var.f2101b % 16;
        int[] iArr2 = this.f2327b;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f2328c;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                } else {
                    i3 = i4;
                }
            }
            iArr[i3] = i;
        }
        this.f2328c[i] = -1;
    }

    /* JADX INFO: renamed from: m */
    public final void m1455m(int i, h40 h40Var, float f) {
        this.f2329d[i] = h40Var.f2101b;
        this.f2330e[i] = f;
        this.f2331f[i] = -1;
        this.f2332g[i] = -1;
        h40Var.m1351a(this.f2335j);
        h40Var.f2110k++;
        this.f2333h++;
    }

    /* JADX INFO: renamed from: n */
    public final int m1456n(h40 h40Var) {
        if (this.f2333h == 0) {
            return -1;
        }
        int i = h40Var.f2101b;
        int i2 = this.f2327b[i % 16];
        if (i2 == -1) {
            return -1;
        }
        if (this.f2329d[i2] == i) {
            return i2;
        }
        do {
            i2 = this.f2328c[i2];
            if (i2 == -1) {
                break;
            }
        } while (this.f2329d[i2] != i);
        if (i2 != -1 && this.f2329d[i2] == i) {
            return i2;
        }
        return -1;
    }

    public final String toString() {
        String strM1146i = hashCode() + " { ";
        int i = this.f2333h;
        for (int i2 = 0; i2 < i; i2++) {
            h40 h40VarMo1447e = mo1447e(i2);
            if (h40VarMo1447e != null) {
                String str = strM1146i + h40VarMo1447e + " = " + mo1443a(i2) + " ";
                int iM1456n = m1456n(h40VarMo1447e);
                String strM1146i2 = g40.m1146i(str, "[p: ");
                int i3 = this.f2331f[iM1456n];
                C0402k8 c0402k8 = this.f2336k;
                String strM1146i3 = g40.m1146i(i3 != -1 ? strM1146i2 + ((h40[]) c0402k8.f2797d)[this.f2329d[this.f2331f[iM1456n]]] : g40.m1146i(strM1146i2, "none"), ", n: ");
                strM1146i = g40.m1146i(this.f2332g[iM1456n] != -1 ? strM1146i3 + ((h40[]) c0402k8.f2797d)[this.f2329d[this.f2332g[iM1456n]]] : g40.m1146i(strM1146i3, "none"), "]");
            }
        }
        return g40.m1146i(strM1146i, " }");
    }
}
