package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: zx */
/* JADX INFO: loaded from: classes.dex */
public final class C0983zx extends C0586p6 {

    /* JADX INFO: renamed from: f */
    public a40[] f5626f;

    /* JADX INFO: renamed from: g */
    public a40[] f5627g;

    /* JADX INFO: renamed from: h */
    public int f5628h;

    /* JADX INFO: renamed from: i */
    public C0946yx f5629i;

    @Override // p000.C0586p6
    /* JADX INFO: renamed from: d */
    public final a40 mo2040d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f5628h; i2++) {
            a40[] a40VarArr = this.f5626f;
            a40 a40Var = a40VarArr[i2];
            if (!zArr[a40Var.f29b]) {
                C0946yx c0946yx = this.f5629i;
                c0946yx.f5410a = a40Var;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = c0946yx.f5410a.f35h[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    a40 a40Var2 = a40VarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = a40Var2.f35h[i3];
                            float f3 = c0946yx.f5410a.f35h[i3];
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
        return this.f5626f[i];
    }

    @Override // p000.C0586p6
    /* JADX INFO: renamed from: h */
    public final void mo2044h(C0586p6 c0586p6, boolean z) {
        a40 a40Var = c0586p6.f3670a;
        if (a40Var == null) {
            return;
        }
        float[] fArr = a40Var.f35h;
        InterfaceC0548o6 interfaceC0548o6 = c0586p6.f3673d;
        int iMo508k = interfaceC0548o6.mo508k();
        for (int i = 0; i < iMo508k; i++) {
            a40 a40VarMo502e = interfaceC0548o6.mo502e(i);
            float fMo498a = interfaceC0548o6.mo498a(i);
            C0946yx c0946yx = this.f5629i;
            c0946yx.f5410a = a40VarMo502e;
            if (a40VarMo502e.f28a) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = c0946yx.f5410a.f35h;
                    float f = (fArr[i2] * fMo498a) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        c0946yx.f5410a.f35h[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    c0946yx.f5411b.m2845j(c0946yx.f5410a);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fMo498a;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        c0946yx.f5410a.f35h[i3] = f3;
                    } else {
                        c0946yx.f5410a.f35h[i3] = 0.0f;
                    }
                }
                m2844i(a40VarMo502e);
            }
            this.f3671b = (c0586p6.f3671b * fMo498a) + this.f3671b;
        }
        m2845j(a40Var);
    }

    /* JADX INFO: renamed from: i */
    public final void m2844i(a40 a40Var) {
        int i;
        int i2 = this.f5628h + 1;
        a40[] a40VarArr = this.f5626f;
        if (i2 > a40VarArr.length) {
            a40[] a40VarArr2 = (a40[]) Arrays.copyOf(a40VarArr, a40VarArr.length * 2);
            this.f5626f = a40VarArr2;
            this.f5627g = (a40[]) Arrays.copyOf(a40VarArr2, a40VarArr2.length * 2);
        }
        a40[] a40VarArr3 = this.f5626f;
        int i3 = this.f5628h;
        a40VarArr3[i3] = a40Var;
        int i4 = i3 + 1;
        this.f5628h = i4;
        if (i4 > 1 && a40VarArr3[i3].f29b > a40Var.f29b) {
            int i5 = 0;
            while (true) {
                i = this.f5628h;
                if (i5 >= i) {
                    break;
                }
                this.f5627g[i5] = this.f5626f[i5];
                i5++;
            }
            Arrays.sort(this.f5627g, 0, i, new C0101ce(2));
            for (int i6 = 0; i6 < this.f5628h; i6++) {
                this.f5626f[i6] = this.f5627g[i6];
            }
        }
        a40Var.f28a = true;
        a40Var.m11a(this);
    }

    /* JADX INFO: renamed from: j */
    public final void m2845j(a40 a40Var) {
        int i = 0;
        while (i < this.f5628h) {
            if (this.f5626f[i] == a40Var) {
                while (true) {
                    int i2 = this.f5628h;
                    if (i >= i2 - 1) {
                        this.f5628h = i2 - 1;
                        a40Var.f28a = false;
                        return;
                    } else {
                        a40[] a40VarArr = this.f5626f;
                        int i3 = i + 1;
                        a40VarArr[i] = a40VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // p000.C0586p6
    public final String toString() {
        C0946yx c0946yx = this.f5629i;
        String str = " goal -> (" + this.f3671b + ") : ";
        for (int i = 0; i < this.f5628h; i++) {
            c0946yx.f5410a = this.f5626f[i];
            str = str + c0946yx + " ";
        }
        return str;
    }
}
