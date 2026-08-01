package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b40 implements InterfaceC0548o6 {

    /* JADX INFO: renamed from: a */
    public int f738a = 16;

    /* JADX INFO: renamed from: b */
    public final int[] f739b = new int[16];

    /* JADX INFO: renamed from: c */
    public int[] f740c = new int[16];

    /* JADX INFO: renamed from: d */
    public int[] f741d = new int[16];

    /* JADX INFO: renamed from: e */
    public float[] f742e = new float[16];

    /* JADX INFO: renamed from: f */
    public int[] f743f = new int[16];

    /* JADX INFO: renamed from: g */
    public int[] f744g = new int[16];

    /* JADX INFO: renamed from: h */
    public int f745h = 0;

    /* JADX INFO: renamed from: i */
    public int f746i = -1;

    /* JADX INFO: renamed from: j */
    public final C0976zq f747j;

    /* JADX INFO: renamed from: k */
    public final C0009a8 f748k;

    public b40(C0976zq c0976zq, C0009a8 c0009a8) {
        this.f747j = c0976zq;
        this.f748k = c0009a8;
        clear();
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: a */
    public final float mo498a(int i) {
        int i2 = this.f745h;
        int i3 = this.f746i;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f742e[i3];
            }
            i3 = this.f744g[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: b */
    public final float mo499b(a40 a40Var) {
        int iM511n = m511n(a40Var);
        if (iM511n != -1) {
            return this.f742e[iM511n];
        }
        return 0.0f;
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: c */
    public final boolean mo500c(a40 a40Var) {
        return m511n(a40Var) != -1;
    }

    @Override // p000.InterfaceC0548o6
    public final void clear() {
        int i = this.f745h;
        for (int i2 = 0; i2 < i; i2++) {
            a40 a40VarMo502e = mo502e(i2);
            if (a40VarMo502e != null) {
                a40VarMo502e.m12b(this.f747j);
            }
        }
        for (int i3 = 0; i3 < this.f738a; i3++) {
            this.f741d[i3] = -1;
            this.f740c[i3] = -1;
        }
        for (int i4 = 0; i4 < 16; i4++) {
            this.f739b[i4] = -1;
        }
        this.f745h = 0;
        this.f746i = -1;
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: d */
    public final float mo501d(a40 a40Var, boolean z) {
        int[] iArr;
        int i;
        int iM511n = m511n(a40Var);
        if (iM511n == -1) {
            return 0.0f;
        }
        int i2 = a40Var.f29b;
        int i3 = i2 % 16;
        int[] iArr2 = this.f739b;
        int i4 = iArr2[i3];
        if (i4 != -1) {
            if (this.f741d[i4] == i2) {
                int[] iArr3 = this.f740c;
                iArr2[i3] = iArr3[i4];
                iArr3[i4] = -1;
            } else {
                while (true) {
                    iArr = this.f740c;
                    i = iArr[i4];
                    if (i == -1 || this.f741d[i] == i2) {
                        break;
                    }
                    i4 = i;
                }
                if (i != -1 && this.f741d[i] == i2) {
                    iArr[i4] = iArr[i];
                    iArr[i] = -1;
                }
            }
        }
        float f = this.f742e[iM511n];
        if (this.f746i == iM511n) {
            this.f746i = this.f744g[iM511n];
        }
        this.f741d[iM511n] = -1;
        int[] iArr4 = this.f743f;
        int i5 = iArr4[iM511n];
        if (i5 != -1) {
            int[] iArr5 = this.f744g;
            iArr5[i5] = iArr5[iM511n];
        }
        int i6 = this.f744g[iM511n];
        if (i6 != -1) {
            iArr4[i6] = iArr4[iM511n];
        }
        this.f745h--;
        a40Var.f38k--;
        if (z) {
            a40Var.m12b(this.f747j);
        }
        return f;
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: e */
    public final a40 mo502e(int i) {
        int i2 = this.f745h;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f746i;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return ((a40[]) this.f748k.f67d)[this.f741d[i3]];
            }
            i3 = this.f744g[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: f */
    public final void mo503f(a40 a40Var, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int iM511n = m511n(a40Var);
            if (iM511n == -1) {
                mo506i(a40Var, f);
                return;
            }
            float[] fArr = this.f742e;
            float f2 = fArr[iM511n] + f;
            fArr[iM511n] = f2;
            if (f2 <= -0.001f || f2 >= 0.001f) {
                return;
            }
            fArr[iM511n] = 0.0f;
            mo501d(a40Var, z);
        }
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: g */
    public final float mo504g(C0586p6 c0586p6, boolean z) {
        float fMo499b = mo499b(c0586p6.f3670a);
        mo501d(c0586p6.f3670a, z);
        b40 b40Var = (b40) c0586p6.f3673d;
        int i = b40Var.f745h;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = b40Var.f741d[i3];
            if (i4 != -1) {
                mo503f(((a40[]) this.f748k.f67d)[i4], b40Var.f742e[i3] * fMo499b, z);
                i2++;
            }
            i3++;
        }
        return fMo499b;
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: h */
    public final void mo505h(float f) {
        int i = this.f745h;
        int i2 = this.f746i;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f742e;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f744g[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: i */
    public final void mo506i(a40 a40Var, float f) {
        if (f > -0.001f && f < 0.001f) {
            mo501d(a40Var, true);
            return;
        }
        int i = 0;
        if (this.f745h == 0) {
            m510m(0, a40Var, f);
            m509l(a40Var, 0);
            this.f746i = 0;
            return;
        }
        int iM511n = m511n(a40Var);
        if (iM511n != -1) {
            this.f742e[iM511n] = f;
            return;
        }
        int i2 = this.f745h + 1;
        int i3 = this.f738a;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            this.f741d = Arrays.copyOf(this.f741d, i4);
            this.f742e = Arrays.copyOf(this.f742e, i4);
            this.f743f = Arrays.copyOf(this.f743f, i4);
            this.f744g = Arrays.copyOf(this.f744g, i4);
            this.f740c = Arrays.copyOf(this.f740c, i4);
            for (int i5 = this.f738a; i5 < i4; i5++) {
                this.f741d[i5] = -1;
                this.f740c[i5] = -1;
            }
            this.f738a = i4;
        }
        int i6 = this.f745h;
        int i7 = this.f746i;
        int i8 = -1;
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = this.f741d[i7];
            int i11 = a40Var.f29b;
            if (i10 == i11) {
                this.f742e[i7] = f;
                return;
            }
            if (i10 < i11) {
                i8 = i7;
            }
            i7 = this.f744g[i7];
            if (i7 == -1) {
                break;
            }
        }
        while (true) {
            if (i >= this.f738a) {
                i = -1;
                break;
            } else if (this.f741d[i] == -1) {
                break;
            } else {
                i++;
            }
        }
        m510m(i, a40Var, f);
        if (i8 != -1) {
            this.f743f[i] = i8;
            int[] iArr = this.f744g;
            iArr[i] = iArr[i8];
            iArr[i8] = i;
        } else {
            this.f743f[i] = -1;
            if (this.f745h > 0) {
                this.f744g[i] = this.f746i;
                this.f746i = i;
            } else {
                this.f744g[i] = -1;
            }
        }
        int i12 = this.f744g[i];
        if (i12 != -1) {
            this.f743f[i12] = i;
        }
        m509l(a40Var, i);
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: j */
    public final void mo507j() {
        int i = this.f745h;
        int i2 = this.f746i;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f742e;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f744g[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: k */
    public final int mo508k() {
        return this.f745h;
    }

    /* JADX INFO: renamed from: l */
    public final void m509l(a40 a40Var, int i) {
        int[] iArr;
        int i2 = a40Var.f29b % 16;
        int[] iArr2 = this.f739b;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f740c;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                } else {
                    i3 = i4;
                }
            }
            iArr[i3] = i;
        }
        this.f740c[i] = -1;
    }

    /* JADX INFO: renamed from: m */
    public final void m510m(int i, a40 a40Var, float f) {
        this.f741d[i] = a40Var.f29b;
        this.f742e[i] = f;
        this.f743f[i] = -1;
        this.f744g[i] = -1;
        a40Var.m11a(this.f747j);
        a40Var.f38k++;
        this.f745h++;
    }

    /* JADX INFO: renamed from: n */
    public final int m511n(a40 a40Var) {
        if (this.f745h == 0) {
            return -1;
        }
        int i = a40Var.f29b;
        int i2 = this.f739b[i % 16];
        if (i2 == -1) {
            return -1;
        }
        if (this.f741d[i2] == i) {
            return i2;
        }
        do {
            i2 = this.f740c[i2];
            if (i2 == -1) {
                break;
            }
        } while (this.f741d[i2] != i);
        if (i2 != -1 && this.f741d[i2] == i) {
            return i2;
        }
        return -1;
    }

    public final String toString() {
        String strM2764i = hashCode() + " { ";
        int i = this.f745h;
        for (int i2 = 0; i2 < i; i2++) {
            a40 a40VarMo502e = mo502e(i2);
            if (a40VarMo502e != null) {
                String str = strM2764i + a40VarMo502e + " = " + mo498a(i2) + " ";
                int iM511n = m511n(a40VarMo502e);
                String strM2764i2 = z30.m2764i(str, "[p: ");
                int i3 = this.f743f[iM511n];
                C0009a8 c0009a8 = this.f748k;
                String strM2764i3 = z30.m2764i(i3 != -1 ? strM2764i2 + ((a40[]) c0009a8.f67d)[this.f741d[this.f743f[iM511n]]] : z30.m2764i(strM2764i2, "none"), ", n: ");
                strM2764i = z30.m2764i(this.f744g[iM511n] != -1 ? strM2764i3 + ((a40[]) c0009a8.f67d)[this.f741d[this.f744g[iM511n]]] : z30.m2764i(strM2764i3, "none"), "]");
            }
        }
        return z30.m2764i(strM2764i, " }");
    }
}
