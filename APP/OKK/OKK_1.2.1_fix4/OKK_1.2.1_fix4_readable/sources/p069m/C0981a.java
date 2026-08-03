package p069m;

import java.util.Arrays;
import p034S.AbstractC0324d;
import p043Y.C0463v;

/* JADX INFO: renamed from: m.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0981a implements InterfaceC0982b {

    /* JADX INFO: renamed from: b */
    public final C0983c f3470b;

    /* JADX INFO: renamed from: c */
    public final C0463v f3471c;

    /* JADX INFO: renamed from: a */
    public int f3469a = 0;

    /* JADX INFO: renamed from: d */
    public int f3472d = 8;

    /* JADX INFO: renamed from: e */
    public int[] f3473e = new int[8];

    /* JADX INFO: renamed from: f */
    public int[] f3474f = new int[8];

    /* JADX INFO: renamed from: g */
    public float[] f3475g = new float[8];

    /* JADX INFO: renamed from: h */
    public int f3476h = -1;

    /* JADX INFO: renamed from: i */
    public int f3477i = -1;

    /* JADX INFO: renamed from: j */
    public boolean f3478j = false;

    public C0981a(C0983c c0983c, C0463v c0463v) {
        this.f3470b = c0983c;
        this.f3471c = c0463v;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: a */
    public final float mo2333a(int i2) {
        int i3 = this.f3476h;
        for (int i4 = 0; i3 != -1 && i4 < this.f3469a; i4++) {
            if (i4 == i2) {
                return this.f3475g[i3];
            }
            i3 = this.f3474f[i3];
        }
        return 0.0f;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: b */
    public final boolean mo2334b(C0989i c0989i) {
        int i2 = this.f3476h;
        if (i2 == -1) {
            return false;
        }
        for (int i3 = 0; i2 != -1 && i3 < this.f3469a; i3++) {
            if (this.f3473e[i2] == c0989i.f3507b) {
                return true;
            }
            i2 = this.f3474f[i2];
        }
        return false;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: c */
    public final void mo2335c(C0989i c0989i, float f2) {
        if (f2 == 0.0f) {
            mo2341i(c0989i, true);
            return;
        }
        int i2 = this.f3476h;
        C0983c c0983c = this.f3470b;
        if (i2 == -1) {
            this.f3476h = 0;
            this.f3475g[0] = f2;
            this.f3473e[0] = c0989i.f3507b;
            this.f3474f[0] = -1;
            c0989i.f3516k++;
            c0989i.m2373a(c0983c);
            this.f3469a++;
            if (this.f3478j) {
                return;
            }
            int i3 = this.f3477i + 1;
            this.f3477i = i3;
            int[] iArr = this.f3473e;
            if (i3 >= iArr.length) {
                this.f3478j = true;
                this.f3477i = iArr.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.f3469a; i5++) {
            int i6 = this.f3473e[i2];
            int i7 = c0989i.f3507b;
            if (i6 == i7) {
                this.f3475g[i2] = f2;
                return;
            }
            if (i6 < i7) {
                i4 = i2;
            }
            i2 = this.f3474f[i2];
        }
        int length = this.f3477i;
        int i8 = length + 1;
        if (this.f3478j) {
            int[] iArr2 = this.f3473e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i8;
        }
        int[] iArr3 = this.f3473e;
        if (length >= iArr3.length && this.f3469a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f3473e;
                if (i9 >= iArr4.length) {
                    break;
                }
                if (iArr4[i9] == -1) {
                    length = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr5 = this.f3473e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i10 = this.f3472d * 2;
            this.f3472d = i10;
            this.f3478j = false;
            this.f3477i = length - 1;
            this.f3475g = Arrays.copyOf(this.f3475g, i10);
            this.f3473e = Arrays.copyOf(this.f3473e, this.f3472d);
            this.f3474f = Arrays.copyOf(this.f3474f, this.f3472d);
        }
        this.f3473e[length] = c0989i.f3507b;
        this.f3475g[length] = f2;
        if (i4 != -1) {
            int[] iArr6 = this.f3474f;
            iArr6[length] = iArr6[i4];
            iArr6[i4] = length;
        } else {
            this.f3474f[length] = this.f3476h;
            this.f3476h = length;
        }
        c0989i.f3516k++;
        c0989i.m2373a(c0983c);
        int i11 = this.f3469a + 1;
        this.f3469a = i11;
        if (!this.f3478j) {
            this.f3477i++;
        }
        int[] iArr7 = this.f3473e;
        if (i11 >= iArr7.length) {
            this.f3478j = true;
        }
        if (this.f3477i >= iArr7.length) {
            this.f3478j = true;
            this.f3477i = iArr7.length - 1;
        }
    }

    @Override // p069m.InterfaceC0982b
    public final void clear() {
        int i2 = this.f3476h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3469a; i3++) {
            C0989i c0989i = ((C0989i[]) this.f3471c.f1047d)[this.f3473e[i2]];
            if (c0989i != null) {
                c0989i.m2374b(this.f3470b);
            }
            i2 = this.f3474f[i2];
        }
        this.f3476h = -1;
        this.f3477i = -1;
        this.f3478j = false;
        this.f3469a = 0;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: d */
    public final C0989i mo2336d(int i2) {
        int i3 = this.f3476h;
        for (int i4 = 0; i3 != -1 && i4 < this.f3469a; i4++) {
            if (i4 == i2) {
                return ((C0989i[]) this.f3471c.f1047d)[this.f3473e[i3]];
            }
            i3 = this.f3474f[i3];
        }
        return null;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: e */
    public final void mo2337e(float f2) {
        int i2 = this.f3476h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3469a; i3++) {
            float[] fArr = this.f3475g;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f3474f[i2];
        }
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: f */
    public final void mo2338f(C0989i c0989i, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i2 = this.f3476h;
            C0983c c0983c = this.f3470b;
            if (i2 == -1) {
                this.f3476h = 0;
                this.f3475g[0] = f2;
                this.f3473e[0] = c0989i.f3507b;
                this.f3474f[0] = -1;
                c0989i.f3516k++;
                c0989i.m2373a(c0983c);
                this.f3469a++;
                if (this.f3478j) {
                    return;
                }
                int i3 = this.f3477i + 1;
                this.f3477i = i3;
                int[] iArr = this.f3473e;
                if (i3 >= iArr.length) {
                    this.f3478j = true;
                    this.f3477i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i4 = -1;
            for (int i5 = 0; i2 != -1 && i5 < this.f3469a; i5++) {
                int i6 = this.f3473e[i2];
                int i7 = c0989i.f3507b;
                if (i6 == i7) {
                    float[] fArr = this.f3475g;
                    float f3 = fArr[i2] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i2] = f3;
                    if (f3 == 0.0f) {
                        if (i2 == this.f3476h) {
                            this.f3476h = this.f3474f[i2];
                        } else {
                            int[] iArr2 = this.f3474f;
                            iArr2[i4] = iArr2[i2];
                        }
                        if (z2) {
                            c0989i.m2374b(c0983c);
                        }
                        if (this.f3478j) {
                            this.f3477i = i2;
                        }
                        c0989i.f3516k--;
                        this.f3469a--;
                        return;
                    }
                    return;
                }
                if (i6 < i7) {
                    i4 = i2;
                }
                i2 = this.f3474f[i2];
            }
            int length = this.f3477i;
            int i8 = length + 1;
            if (this.f3478j) {
                int[] iArr3 = this.f3473e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i8;
            }
            int[] iArr4 = this.f3473e;
            if (length >= iArr4.length && this.f3469a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f3473e;
                    if (i9 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i9] == -1) {
                        length = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr6 = this.f3473e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i10 = this.f3472d * 2;
                this.f3472d = i10;
                this.f3478j = false;
                this.f3477i = length - 1;
                this.f3475g = Arrays.copyOf(this.f3475g, i10);
                this.f3473e = Arrays.copyOf(this.f3473e, this.f3472d);
                this.f3474f = Arrays.copyOf(this.f3474f, this.f3472d);
            }
            this.f3473e[length] = c0989i.f3507b;
            this.f3475g[length] = f2;
            if (i4 != -1) {
                int[] iArr7 = this.f3474f;
                iArr7[length] = iArr7[i4];
                iArr7[i4] = length;
            } else {
                this.f3474f[length] = this.f3476h;
                this.f3476h = length;
            }
            c0989i.f3516k++;
            c0989i.m2373a(c0983c);
            this.f3469a++;
            if (!this.f3478j) {
                this.f3477i++;
            }
            int i11 = this.f3477i;
            int[] iArr8 = this.f3473e;
            if (i11 >= iArr8.length) {
                this.f3478j = true;
                this.f3477i = iArr8.length - 1;
            }
        }
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: g */
    public final float mo2339g(C0989i c0989i) {
        int i2 = this.f3476h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3469a; i3++) {
            if (this.f3473e[i2] == c0989i.f3507b) {
                return this.f3475g[i2];
            }
            i2 = this.f3474f[i2];
        }
        return 0.0f;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: h */
    public final float mo2340h(C0983c c0983c, boolean z2) {
        float fMo2339g = mo2339g(c0983c.f3479a);
        mo2341i(c0983c.f3479a, z2);
        InterfaceC0982b interfaceC0982b = c0983c.f3482d;
        int iMo2343k = interfaceC0982b.mo2343k();
        for (int i2 = 0; i2 < iMo2343k; i2++) {
            C0989i c0989iMo2336d = interfaceC0982b.mo2336d(i2);
            mo2338f(c0989iMo2336d, interfaceC0982b.mo2339g(c0989iMo2336d) * fMo2339g, z2);
        }
        return fMo2339g;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: i */
    public final float mo2341i(C0989i c0989i, boolean z2) {
        int i2 = this.f3476h;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f3469a) {
            if (this.f3473e[i2] == c0989i.f3507b) {
                if (i2 == this.f3476h) {
                    this.f3476h = this.f3474f[i2];
                } else {
                    int[] iArr = this.f3474f;
                    iArr[i4] = iArr[i2];
                }
                if (z2) {
                    c0989i.m2374b(this.f3470b);
                }
                c0989i.f3516k--;
                this.f3469a--;
                this.f3473e[i2] = -1;
                if (this.f3478j) {
                    this.f3477i = i2;
                }
                return this.f3475g[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f3474f[i2];
        }
        return 0.0f;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: j */
    public final void mo2342j() {
        int i2 = this.f3476h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3469a; i3++) {
            float[] fArr = this.f3475g;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f3474f[i2];
        }
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: k */
    public final int mo2343k() {
        return this.f3469a;
    }

    public final String toString() {
        int i2 = this.f3476h;
        String str = "";
        for (int i3 = 0; i2 != -1 && i3 < this.f3469a; i3++) {
            str = (AbstractC0324d.m722e(str, " -> ") + this.f3475g[i2] + " : ") + ((C0989i[]) this.f3471c.f1047d)[this.f3473e[i2]];
            i2 = this.f3474f[i2];
        }
        return str;
    }
}
