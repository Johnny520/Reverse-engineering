package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: l6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0437l6 implements InterfaceC0548o6 {

    /* JADX INFO: renamed from: b */
    public final C0586p6 f3014b;

    /* JADX INFO: renamed from: c */
    public final C0009a8 f3015c;

    /* JADX INFO: renamed from: a */
    public int f3013a = 0;

    /* JADX INFO: renamed from: d */
    public int f3016d = 8;

    /* JADX INFO: renamed from: e */
    public int[] f3017e = new int[8];

    /* JADX INFO: renamed from: f */
    public int[] f3018f = new int[8];

    /* JADX INFO: renamed from: g */
    public float[] f3019g = new float[8];

    /* JADX INFO: renamed from: h */
    public int f3020h = -1;

    /* JADX INFO: renamed from: i */
    public int f3021i = -1;

    /* JADX INFO: renamed from: j */
    public boolean f3022j = false;

    public C0437l6(C0586p6 c0586p6, C0009a8 c0009a8) {
        this.f3014b = c0586p6;
        this.f3015c = c0009a8;
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: a */
    public final float mo498a(int i) {
        int i2 = this.f3020h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3013a; i3++) {
            if (i3 == i) {
                return this.f3019g[i2];
            }
            i2 = this.f3018f[i2];
        }
        return 0.0f;
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: b */
    public final float mo499b(a40 a40Var) {
        int i = this.f3020h;
        for (int i2 = 0; i != -1 && i2 < this.f3013a; i2++) {
            if (this.f3017e[i] == a40Var.f29b) {
                return this.f3019g[i];
            }
            i = this.f3018f[i];
        }
        return 0.0f;
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: c */
    public final boolean mo500c(a40 a40Var) {
        int i = this.f3020h;
        if (i != -1) {
            for (int i2 = 0; i != -1 && i2 < this.f3013a; i2++) {
                if (this.f3017e[i] == a40Var.f29b) {
                    return true;
                }
                i = this.f3018f[i];
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0548o6
    public final void clear() {
        int i = this.f3020h;
        for (int i2 = 0; i != -1 && i2 < this.f3013a; i2++) {
            a40 a40Var = ((a40[]) this.f3015c.f67d)[this.f3017e[i]];
            if (a40Var != null) {
                a40Var.m12b(this.f3014b);
            }
            i = this.f3018f[i];
        }
        this.f3020h = -1;
        this.f3021i = -1;
        this.f3022j = false;
        this.f3013a = 0;
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: d */
    public final float mo501d(a40 a40Var, boolean z) {
        int i = this.f3020h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f3013a) {
            if (this.f3017e[i] == a40Var.f29b) {
                if (i == this.f3020h) {
                    this.f3020h = this.f3018f[i];
                } else {
                    int[] iArr = this.f3018f;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    a40Var.m12b(this.f3014b);
                }
                a40Var.f38k--;
                this.f3013a--;
                this.f3017e[i] = -1;
                if (this.f3022j) {
                    this.f3021i = i;
                }
                return this.f3019g[i];
            }
            i2++;
            i3 = i;
            i = this.f3018f[i];
        }
        return 0.0f;
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: e */
    public final a40 mo502e(int i) {
        int i2 = this.f3020h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3013a; i3++) {
            if (i3 == i) {
                return ((a40[]) this.f3015c.f67d)[this.f3017e[i2]];
            }
            i2 = this.f3018f[i2];
        }
        return null;
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: f */
    public final void mo503f(a40 a40Var, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f3020h;
            C0586p6 c0586p6 = this.f3014b;
            if (i == -1) {
                this.f3020h = 0;
                this.f3019g[0] = f;
                this.f3017e[0] = a40Var.f29b;
                this.f3018f[0] = -1;
                a40Var.f38k++;
                a40Var.m11a(c0586p6);
                this.f3013a++;
                if (this.f3022j) {
                    return;
                }
                int i2 = this.f3021i + 1;
                this.f3021i = i2;
                int[] iArr = this.f3017e;
                if (i2 >= iArr.length) {
                    this.f3022j = true;
                    this.f3021i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f3013a; i4++) {
                int i5 = this.f3017e[i];
                int i6 = a40Var.f29b;
                if (i5 == i6) {
                    float[] fArr = this.f3019g;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f3020h) {
                            this.f3020h = this.f3018f[i];
                        } else {
                            int[] iArr2 = this.f3018f;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            a40Var.m12b(c0586p6);
                        }
                        if (this.f3022j) {
                            this.f3021i = i;
                        }
                        a40Var.f38k--;
                        this.f3013a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f3018f[i];
            }
            int length = this.f3021i;
            int i7 = length + 1;
            if (this.f3022j) {
                int[] iArr3 = this.f3017e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i7;
            }
            int[] iArr4 = this.f3017e;
            if (length >= iArr4.length && this.f3013a < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f3017e;
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
            int[] iArr6 = this.f3017e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i9 = this.f3016d * 2;
                this.f3016d = i9;
                this.f3022j = false;
                this.f3021i = length - 1;
                this.f3019g = Arrays.copyOf(this.f3019g, i9);
                this.f3017e = Arrays.copyOf(this.f3017e, this.f3016d);
                this.f3018f = Arrays.copyOf(this.f3018f, this.f3016d);
            }
            this.f3017e[length] = a40Var.f29b;
            this.f3019g[length] = f;
            if (i3 != -1) {
                int[] iArr7 = this.f3018f;
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                this.f3018f[length] = this.f3020h;
                this.f3020h = length;
            }
            a40Var.f38k++;
            a40Var.m11a(c0586p6);
            this.f3013a++;
            if (!this.f3022j) {
                this.f3021i++;
            }
            int i10 = this.f3021i;
            int[] iArr8 = this.f3017e;
            if (i10 >= iArr8.length) {
                this.f3022j = true;
                this.f3021i = iArr8.length - 1;
            }
        }
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: g */
    public final float mo504g(C0586p6 c0586p6, boolean z) {
        float fMo499b = mo499b(c0586p6.f3670a);
        mo501d(c0586p6.f3670a, z);
        InterfaceC0548o6 interfaceC0548o6 = c0586p6.f3673d;
        int iMo508k = interfaceC0548o6.mo508k();
        for (int i = 0; i < iMo508k; i++) {
            a40 a40VarMo502e = interfaceC0548o6.mo502e(i);
            mo503f(a40VarMo502e, interfaceC0548o6.mo499b(a40VarMo502e) * fMo499b, z);
        }
        return fMo499b;
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: h */
    public final void mo505h(float f) {
        int i = this.f3020h;
        for (int i2 = 0; i != -1 && i2 < this.f3013a; i2++) {
            float[] fArr = this.f3019g;
            fArr[i] = fArr[i] / f;
            i = this.f3018f[i];
        }
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: i */
    public final void mo506i(a40 a40Var, float f) {
        if (f == 0.0f) {
            mo501d(a40Var, true);
            return;
        }
        int i = this.f3020h;
        C0586p6 c0586p6 = this.f3014b;
        if (i == -1) {
            this.f3020h = 0;
            this.f3019g[0] = f;
            this.f3017e[0] = a40Var.f29b;
            this.f3018f[0] = -1;
            a40Var.f38k++;
            a40Var.m11a(c0586p6);
            this.f3013a++;
            if (this.f3022j) {
                return;
            }
            int i2 = this.f3021i + 1;
            this.f3021i = i2;
            int[] iArr = this.f3017e;
            if (i2 >= iArr.length) {
                this.f3022j = true;
                this.f3021i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f3013a; i4++) {
            int i5 = this.f3017e[i];
            int i6 = a40Var.f29b;
            if (i5 == i6) {
                this.f3019g[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f3018f[i];
        }
        int length = this.f3021i;
        int i7 = length + 1;
        if (this.f3022j) {
            int[] iArr2 = this.f3017e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f3017e;
        if (length >= iArr3.length && this.f3013a < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f3017e;
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
        int[] iArr5 = this.f3017e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f3016d * 2;
            this.f3016d = i9;
            this.f3022j = false;
            this.f3021i = length - 1;
            this.f3019g = Arrays.copyOf(this.f3019g, i9);
            this.f3017e = Arrays.copyOf(this.f3017e, this.f3016d);
            this.f3018f = Arrays.copyOf(this.f3018f, this.f3016d);
        }
        this.f3017e[length] = a40Var.f29b;
        this.f3019g[length] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f3018f;
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            this.f3018f[length] = this.f3020h;
            this.f3020h = length;
        }
        a40Var.f38k++;
        a40Var.m11a(c0586p6);
        int i10 = this.f3013a + 1;
        this.f3013a = i10;
        if (!this.f3022j) {
            this.f3021i++;
        }
        int[] iArr7 = this.f3017e;
        if (i10 >= iArr7.length) {
            this.f3022j = true;
        }
        if (this.f3021i >= iArr7.length) {
            this.f3022j = true;
            this.f3021i = iArr7.length - 1;
        }
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: j */
    public final void mo507j() {
        int i = this.f3020h;
        for (int i2 = 0; i != -1 && i2 < this.f3013a; i2++) {
            float[] fArr = this.f3019g;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f3018f[i];
        }
    }

    @Override // p000.InterfaceC0548o6
    /* JADX INFO: renamed from: k */
    public final int mo508k() {
        return this.f3013a;
    }

    public final String toString() {
        int i = this.f3020h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f3013a; i2++) {
            str = (z30.m2764i(str, " -> ") + this.f3019g[i] + " : ") + ((a40[]) this.f3015c.f67d)[this.f3017e[i]];
            i = this.f3018f[i];
        }
        return str;
    }
}
