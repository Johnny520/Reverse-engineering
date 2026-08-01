package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: l6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0437l6 implements InterfaceC0548o6 {

    /* JADX INFO: renamed from: b */
    public final C0585p6 f2938b;

    /* JADX INFO: renamed from: c */
    public final C0402k8 f2939c;

    /* JADX INFO: renamed from: a */
    public int f2937a = 0;

    /* JADX INFO: renamed from: d */
    public int f2940d = 8;

    /* JADX INFO: renamed from: e */
    public int[] f2941e = new int[8];

    /* JADX INFO: renamed from: f */
    public int[] f2942f = new int[8];

    /* JADX INFO: renamed from: g */
    public float[] f2943g = new float[8];

    /* JADX INFO: renamed from: h */
    public int f2944h = -1;

    /* JADX INFO: renamed from: i */
    public int f2945i = -1;

    /* JADX INFO: renamed from: j */
    public boolean f2946j = false;

    public C0437l6(C0585p6 c0585p6, C0402k8 c0402k8) {
        this.f2938b = c0585p6;
        this.f2939c = c0402k8;
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: a */
    public final float mo1443a(int i) {
        int i2 = this.f2944h;
        for (int i3 = 0; i2 != -1 && i3 < this.f2937a; i3++) {
            if (i3 == i) {
                return this.f2943g[i2];
            }
            i2 = this.f2942f[i2];
        }
        return 0.0f;
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: b */
    public final float mo1444b(h40 h40Var) {
        int i = this.f2944h;
        for (int i2 = 0; i != -1 && i2 < this.f2937a; i2++) {
            if (this.f2941e[i] == h40Var.f2101b) {
                return this.f2943g[i];
            }
            i = this.f2942f[i];
        }
        return 0.0f;
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: c */
    public final boolean mo1445c(h40 h40Var) {
        int i = this.f2944h;
        if (i != -1) {
            for (int i2 = 0; i != -1 && i2 < this.f2937a; i2++) {
                if (this.f2941e[i] == h40Var.f2101b) {
                    return true;
                }
                i = this.f2942f[i];
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0548o6
    public final void clear() {
        int i = this.f2944h;
        for (int i2 = 0; i != -1 && i2 < this.f2937a; i2++) {
            h40 h40Var = ((h40[]) this.f2939c.f2797d)[this.f2941e[i]];
            if (h40Var != null) {
                h40Var.m1352b(this.f2938b);
            }
            i = this.f2942f[i];
        }
        this.f2944h = -1;
        this.f2945i = -1;
        this.f2946j = false;
        this.f2937a = 0;
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: d */
    public final float mo1446d(h40 h40Var, boolean z) {
        int i = this.f2944h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f2937a) {
            if (this.f2941e[i] == h40Var.f2101b) {
                if (i == this.f2944h) {
                    this.f2944h = this.f2942f[i];
                } else {
                    int[] iArr = this.f2942f;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    h40Var.m1352b(this.f2938b);
                }
                h40Var.f2110k--;
                this.f2937a--;
                this.f2941e[i] = -1;
                if (this.f2946j) {
                    this.f2945i = i;
                }
                return this.f2943g[i];
            }
            i2++;
            i3 = i;
            i = this.f2942f[i];
        }
        return 0.0f;
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: e */
    public final h40 mo1447e(int i) {
        int i2 = this.f2944h;
        for (int i3 = 0; i2 != -1 && i3 < this.f2937a; i3++) {
            if (i3 == i) {
                return ((h40[]) this.f2939c.f2797d)[this.f2941e[i2]];
            }
            i2 = this.f2942f[i2];
        }
        return null;
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: f */
    public final void mo1448f(h40 h40Var, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f2944h;
            C0585p6 c0585p6 = this.f2938b;
            if (i == -1) {
                this.f2944h = 0;
                this.f2943g[0] = f;
                this.f2941e[0] = h40Var.f2101b;
                this.f2942f[0] = -1;
                h40Var.f2110k++;
                h40Var.m1351a(c0585p6);
                this.f2937a++;
                if (this.f2946j) {
                    return;
                }
                int i2 = this.f2945i + 1;
                this.f2945i = i2;
                int[] iArr = this.f2941e;
                if (i2 >= iArr.length) {
                    this.f2946j = true;
                    this.f2945i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f2937a; i4++) {
                int i5 = this.f2941e[i];
                int i6 = h40Var.f2101b;
                if (i5 == i6) {
                    float[] fArr = this.f2943g;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f2944h) {
                            this.f2944h = this.f2942f[i];
                        } else {
                            int[] iArr2 = this.f2942f;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            h40Var.m1352b(c0585p6);
                        }
                        if (this.f2946j) {
                            this.f2945i = i;
                        }
                        h40Var.f2110k--;
                        this.f2937a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f2942f[i];
            }
            int length = this.f2945i;
            int i7 = length + 1;
            if (this.f2946j) {
                int[] iArr3 = this.f2941e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i7;
            }
            int[] iArr4 = this.f2941e;
            if (length >= iArr4.length && this.f2937a < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f2941e;
                    if (i8 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int[] iArr6 = this.f2941e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i9 = this.f2940d * 2;
                this.f2940d = i9;
                this.f2946j = false;
                this.f2945i = length - 1;
                this.f2943g = Arrays.copyOf(this.f2943g, i9);
                this.f2941e = Arrays.copyOf(this.f2941e, this.f2940d);
                this.f2942f = Arrays.copyOf(this.f2942f, this.f2940d);
            }
            this.f2941e[length] = h40Var.f2101b;
            this.f2943g[length] = f;
            if (i3 != -1) {
                int[] iArr7 = this.f2942f;
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                this.f2942f[length] = this.f2944h;
                this.f2944h = length;
            }
            h40Var.f2110k++;
            h40Var.m1351a(c0585p6);
            this.f2937a++;
            if (!this.f2946j) {
                this.f2945i++;
            }
            int i10 = this.f2945i;
            int[] iArr8 = this.f2941e;
            if (i10 >= iArr8.length) {
                this.f2946j = true;
                this.f2945i = iArr8.length - 1;
            }
        }
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: g */
    public final float mo1449g(C0585p6 c0585p6, boolean z) {
        float fMo1444b = mo1444b(c0585p6.f3600a);
        mo1446d(c0585p6.f3600a, z);
        InterfaceC0548o6 interfaceC0548o6 = c0585p6.f3603d;
        int iMo1453k = interfaceC0548o6.mo1453k();
        for (int i = 0; i < iMo1453k; i++) {
            h40 h40VarMo1447e = interfaceC0548o6.mo1447e(i);
            mo1448f(h40VarMo1447e, interfaceC0548o6.mo1444b(h40VarMo1447e) * fMo1444b, z);
        }
        return fMo1444b;
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: h */
    public final void mo1450h(float f) {
        int i = this.f2944h;
        for (int i2 = 0; i != -1 && i2 < this.f2937a; i2++) {
            float[] fArr = this.f2943g;
            fArr[i] = fArr[i] / f;
            i = this.f2942f[i];
        }
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: i */
    public final void mo1451i(h40 h40Var, float f) {
        if (f == 0.0f) {
            mo1446d(h40Var, true);
            return;
        }
        int i = this.f2944h;
        C0585p6 c0585p6 = this.f2938b;
        if (i == -1) {
            this.f2944h = 0;
            this.f2943g[0] = f;
            this.f2941e[0] = h40Var.f2101b;
            this.f2942f[0] = -1;
            h40Var.f2110k++;
            h40Var.m1351a(c0585p6);
            this.f2937a++;
            if (this.f2946j) {
                return;
            }
            int i2 = this.f2945i + 1;
            this.f2945i = i2;
            int[] iArr = this.f2941e;
            if (i2 >= iArr.length) {
                this.f2946j = true;
                this.f2945i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f2937a; i4++) {
            int i5 = this.f2941e[i];
            int i6 = h40Var.f2101b;
            if (i5 == i6) {
                this.f2943g[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f2942f[i];
        }
        int length = this.f2945i;
        int i7 = length + 1;
        if (this.f2946j) {
            int[] iArr2 = this.f2941e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f2941e;
        if (length >= iArr3.length && this.f2937a < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f2941e;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.f2941e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f2940d * 2;
            this.f2940d = i9;
            this.f2946j = false;
            this.f2945i = length - 1;
            this.f2943g = Arrays.copyOf(this.f2943g, i9);
            this.f2941e = Arrays.copyOf(this.f2941e, this.f2940d);
            this.f2942f = Arrays.copyOf(this.f2942f, this.f2940d);
        }
        this.f2941e[length] = h40Var.f2101b;
        this.f2943g[length] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f2942f;
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            this.f2942f[length] = this.f2944h;
            this.f2944h = length;
        }
        h40Var.f2110k++;
        h40Var.m1351a(c0585p6);
        int i10 = this.f2937a + 1;
        this.f2937a = i10;
        if (!this.f2946j) {
            this.f2945i++;
        }
        int[] iArr7 = this.f2941e;
        if (i10 >= iArr7.length) {
            this.f2946j = true;
        }
        if (this.f2945i >= iArr7.length) {
            this.f2946j = true;
            this.f2945i = iArr7.length - 1;
        }
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: j */
    public final void mo1452j() {
        int i = this.f2944h;
        for (int i2 = 0; i != -1 && i2 < this.f2937a; i2++) {
            float[] fArr = this.f2943g;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f2942f[i];
        }
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: k */
    public final int mo1453k() {
        return this.f2937a;
    }

    public final String toString() {
        int i = this.f2944h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f2937a; i2++) {
            str = (g40.m1146i(str, " -> ") + this.f2943g[i] + " : ") + ((h40[]) this.f2939c.f2797d)[this.f2941e[i]];
            i = this.f2942f[i];
        }
        return str;
    }
}
