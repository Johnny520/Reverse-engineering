package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: iy */
/* JADX INFO: loaded from: classes.dex */
public final class C0354iy extends C0585p6 {

    /* JADX INFO: renamed from: f */
    public h40[] f2613f;

    /* JADX INFO: renamed from: g */
    public h40[] f2614g;

    /* JADX INFO: renamed from: h */
    public int f2615h;

    /* JADX INFO: renamed from: i */
    public C0315hy f2616i;

    @Override // p000.C0585p6
    /* JADX INFO: renamed from: d */
    public final h40 mo1543d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f2615h; i2++) {
            h40[] h40VarArr = this.f2613f;
            h40 h40Var = h40VarArr[i2];
            if (!zArr[h40Var.f2101b]) {
                C0315hy c0315hy = this.f2616i;
                c0315hy.f2287a = h40Var;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = c0315hy.f2287a.f2107h[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    h40 h40Var2 = h40VarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = h40Var2.f2107h[i3];
                            float f3 = c0315hy.f2287a.f2107h[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 < f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f2613f[i];
    }

    @Override // p000.C0585p6
    /* JADX INFO: renamed from: h */
    public final void mo1544h(C0585p6 c0585p6, boolean z) {
        h40 h40Var = c0585p6.f3600a;
        if (h40Var == null) {
            return;
        }
        float[] fArr = h40Var.f2107h;
        InterfaceC0548o6 interfaceC0548o6 = c0585p6.f3603d;
        int iMo1453k = interfaceC0548o6.mo1453k();
        for (int i = 0; i < iMo1453k; i++) {
            h40 h40VarMo1447e = interfaceC0548o6.mo1447e(i);
            float fMo1443a = interfaceC0548o6.mo1443a(i);
            C0315hy c0315hy = this.f2616i;
            c0315hy.f2287a = h40VarMo1447e;
            if (h40VarMo1447e.f2100a) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = c0315hy.f2287a.f2107h;
                    float f = (fArr[i2] * fMo1443a) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        c0315hy.f2287a.f2107h[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    c0315hy.f2288b.m1546j(c0315hy.f2287a);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fMo1443a;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        c0315hy.f2287a.f2107h[i3] = f3;
                    } else {
                        c0315hy.f2287a.f2107h[i3] = 0.0f;
                    }
                }
                m1545i(h40VarMo1447e);
            }
            this.f3601b = (c0585p6.f3601b * fMo1443a) + this.f3601b;
        }
        m1546j(h40Var);
    }

    /* JADX INFO: renamed from: i */
    public final void m1545i(h40 h40Var) {
        int i;
        int i2 = this.f2615h + 1;
        h40[] h40VarArr = this.f2613f;
        if (i2 > h40VarArr.length) {
            h40[] h40VarArr2 = (h40[]) Arrays.copyOf(h40VarArr, h40VarArr.length * 2);
            this.f2613f = h40VarArr2;
            this.f2614g = (h40[]) Arrays.copyOf(h40VarArr2, h40VarArr2.length * 2);
        }
        h40[] h40VarArr3 = this.f2613f;
        int i3 = this.f2615h;
        h40VarArr3[i3] = h40Var;
        int i4 = i3 + 1;
        this.f2615h = i4;
        if (i4 > 1 && h40VarArr3[i3].f2101b > h40Var.f2101b) {
            int i5 = 0;
            while (true) {
                i = this.f2615h;
                if (i5 >= i) {
                    break;
                }
                this.f2614g[i5] = this.f2613f[i5];
                i5++;
            }
            Arrays.sort(this.f2614g, 0, i, new C0148de(2));
            for (int i6 = 0; i6 < this.f2615h; i6++) {
                this.f2613f[i6] = this.f2614g[i6];
            }
        }
        h40Var.f2100a = true;
        h40Var.m1351a(this);
    }

    /* JADX INFO: renamed from: j */
    public final void m1546j(h40 h40Var) {
        int i = 0;
        while (i < this.f2615h) {
            if (this.f2613f[i] == h40Var) {
                while (true) {
                    int i2 = this.f2615h;
                    if (i >= i2 - 1) {
                        this.f2615h = i2 - 1;
                        h40Var.f2100a = false;
                        return;
                    } else {
                        h40[] h40VarArr = this.f2613f;
                        int i3 = i + 1;
                        h40VarArr[i] = h40VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // p000.C0585p6
    public final String toString() {
        C0315hy c0315hy = this.f2616i;
        String str = " goal -> (" + this.f3601b + ") : ";
        for (int i = 0; i < this.f2615h; i++) {
            c0315hy.f2287a = this.f2613f[i];
            str = str + c0315hy + " ";
        }
        return str;
    }
}
