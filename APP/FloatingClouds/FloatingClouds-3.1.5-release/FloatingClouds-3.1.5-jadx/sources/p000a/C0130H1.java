package p000a;

import java.util.Arrays;
import p000a.C0184K1;

/* JADX INFO: renamed from: a.H1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0130H1 implements C0184K1.a {

    /* JADX INFO: renamed from: b */
    public final C0184K1 f430b;

    /* JADX INFO: renamed from: c */
    public final C0003A2 f431c;

    /* JADX INFO: renamed from: a */
    public int f429a = 0;

    /* JADX INFO: renamed from: d */
    public int f432d = 8;

    /* JADX INFO: renamed from: e */
    public int[] f433e = new int[8];

    /* JADX INFO: renamed from: f */
    public int[] f434f = new int[8];

    /* JADX INFO: renamed from: g */
    public float[] f435g = new float[8];

    /* JADX INFO: renamed from: h */
    public int f436h = -1;

    /* JADX INFO: renamed from: i */
    public int f437i = -1;

    /* JADX INFO: renamed from: j */
    public boolean f438j = false;

    public C0130H1(C0184K1 c0184k1, C0003A2 c0003a2) {
        this.f430b = c0184k1;
        this.f431c = c0003a2;
    }

    @Override // p000a.C0184K1.a
    /* JADX INFO: renamed from: a */
    public final float mo341a(int i) {
        int i2 = this.f436h;
        for (int i3 = 0; i2 != -1 && i3 < this.f429a; i3++) {
            if (i3 == i) {
                return this.f435g[i2];
            }
            i2 = this.f434f[i2];
        }
        return 0.0f;
    }

    @Override // p000a.C0184K1.a
    /* JADX INFO: renamed from: b */
    public final float mo342b(C0184K1 c0184k1, boolean z) {
        float fMo349i = mo349i(c0184k1.f633a);
        mo348h(c0184k1.f633a, z);
        C0184K1.a aVar = c0184k1.f636d;
        int iMo351k = aVar.mo351k();
        for (int i = 0; i < iMo351k; i++) {
            C0693le c0693leMo346f = aVar.mo346f(i);
            mo345e(c0693leMo346f, aVar.mo349i(c0693leMo346f) * fMo349i, z);
        }
        return fMo349i;
    }

    @Override // p000a.C0184K1.a
    /* JADX INFO: renamed from: c */
    public final void mo343c(C0693le c0693le, float f) {
        if (f == 0.0f) {
            mo348h(c0693le, true);
            return;
        }
        int i = this.f436h;
        C0184K1 c0184k1 = this.f430b;
        if (i == -1) {
            this.f436h = 0;
            this.f435g[0] = f;
            this.f433e[0] = c0693le.f2581b;
            this.f434f[0] = -1;
            c0693le.f2591l++;
            c0693le.m1559a(c0184k1);
            this.f429a++;
            if (this.f438j) {
                return;
            }
            int i2 = this.f437i + 1;
            this.f437i = i2;
            int[] iArr = this.f433e;
            if (i2 >= iArr.length) {
                this.f438j = true;
                this.f437i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f429a; i4++) {
            int i5 = this.f433e[i];
            int i6 = c0693le.f2581b;
            if (i5 == i6) {
                this.f435g[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f434f[i];
        }
        int length = this.f437i;
        int i7 = length + 1;
        if (this.f438j) {
            int[] iArr2 = this.f433e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f433e;
        if (length >= iArr3.length && this.f429a < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f433e;
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
        int[] iArr5 = this.f433e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f432d * 2;
            this.f432d = i9;
            this.f438j = false;
            this.f437i = length - 1;
            this.f435g = Arrays.copyOf(this.f435g, i9);
            this.f433e = Arrays.copyOf(this.f433e, this.f432d);
            this.f434f = Arrays.copyOf(this.f434f, this.f432d);
        }
        this.f433e[length] = c0693le.f2581b;
        this.f435g[length] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f434f;
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            this.f434f[length] = this.f436h;
            this.f436h = length;
        }
        c0693le.f2591l++;
        c0693le.m1559a(c0184k1);
        int i10 = this.f429a + 1;
        this.f429a = i10;
        if (!this.f438j) {
            this.f437i++;
        }
        int[] iArr7 = this.f433e;
        if (i10 >= iArr7.length) {
            this.f438j = true;
        }
        if (this.f437i >= iArr7.length) {
            this.f438j = true;
            this.f437i = iArr7.length - 1;
        }
    }

    @Override // p000a.C0184K1.a
    public final void clear() {
        int i = this.f436h;
        for (int i2 = 0; i != -1 && i2 < this.f429a; i2++) {
            C0693le c0693le = ((C0693le[]) this.f431c.f26d)[this.f433e[i]];
            if (c0693le != null) {
                c0693le.m1560b(this.f430b);
            }
            i = this.f434f[i];
        }
        this.f436h = -1;
        this.f437i = -1;
        this.f438j = false;
        this.f429a = 0;
    }

    @Override // p000a.C0184K1.a
    /* JADX INFO: renamed from: d */
    public final boolean mo344d(C0693le c0693le) {
        int i = this.f436h;
        if (i != -1) {
            for (int i2 = 0; i != -1 && i2 < this.f429a; i2++) {
                if (this.f433e[i] == c0693le.f2581b) {
                    return true;
                }
                i = this.f434f[i];
            }
        }
        return false;
    }

    @Override // p000a.C0184K1.a
    /* JADX INFO: renamed from: e */
    public final void mo345e(C0693le c0693le, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f436h;
            C0184K1 c0184k1 = this.f430b;
            if (i == -1) {
                this.f436h = 0;
                this.f435g[0] = f;
                this.f433e[0] = c0693le.f2581b;
                this.f434f[0] = -1;
                c0693le.f2591l++;
                c0693le.m1559a(c0184k1);
                this.f429a++;
                if (this.f438j) {
                    return;
                }
                int i2 = this.f437i + 1;
                this.f437i = i2;
                int[] iArr = this.f433e;
                if (i2 >= iArr.length) {
                    this.f438j = true;
                    this.f437i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f429a; i4++) {
                int i5 = this.f433e[i];
                int i6 = c0693le.f2581b;
                if (i5 == i6) {
                    float[] fArr = this.f435g;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f436h) {
                            this.f436h = this.f434f[i];
                        } else {
                            int[] iArr2 = this.f434f;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            c0693le.m1560b(c0184k1);
                        }
                        if (this.f438j) {
                            this.f437i = i;
                        }
                        c0693le.f2591l--;
                        this.f429a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f434f[i];
            }
            int length = this.f437i;
            int i7 = length + 1;
            if (this.f438j) {
                int[] iArr3 = this.f433e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i7;
            }
            int[] iArr4 = this.f433e;
            if (length >= iArr4.length && this.f429a < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f433e;
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
            int[] iArr6 = this.f433e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i9 = this.f432d * 2;
                this.f432d = i9;
                this.f438j = false;
                this.f437i = length - 1;
                this.f435g = Arrays.copyOf(this.f435g, i9);
                this.f433e = Arrays.copyOf(this.f433e, this.f432d);
                this.f434f = Arrays.copyOf(this.f434f, this.f432d);
            }
            this.f433e[length] = c0693le.f2581b;
            this.f435g[length] = f;
            if (i3 != -1) {
                int[] iArr7 = this.f434f;
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                this.f434f[length] = this.f436h;
                this.f436h = length;
            }
            c0693le.f2591l++;
            c0693le.m1559a(c0184k1);
            this.f429a++;
            if (!this.f438j) {
                this.f437i++;
            }
            int i10 = this.f437i;
            int[] iArr8 = this.f433e;
            if (i10 >= iArr8.length) {
                this.f438j = true;
                this.f437i = iArr8.length - 1;
            }
        }
    }

    @Override // p000a.C0184K1.a
    /* JADX INFO: renamed from: f */
    public final C0693le mo346f(int i) {
        int i2 = this.f436h;
        for (int i3 = 0; i2 != -1 && i3 < this.f429a; i3++) {
            if (i3 == i) {
                return ((C0693le[]) this.f431c.f26d)[this.f433e[i2]];
            }
            i2 = this.f434f[i2];
        }
        return null;
    }

    @Override // p000a.C0184K1.a
    /* JADX INFO: renamed from: g */
    public final void mo347g(float f) {
        int i = this.f436h;
        for (int i2 = 0; i != -1 && i2 < this.f429a; i2++) {
            float[] fArr = this.f435g;
            fArr[i] = fArr[i] / f;
            i = this.f434f[i];
        }
    }

    @Override // p000a.C0184K1.a
    /* JADX INFO: renamed from: h */
    public final float mo348h(C0693le c0693le, boolean z) {
        int i = this.f436h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f429a) {
            if (this.f433e[i] == c0693le.f2581b) {
                if (i == this.f436h) {
                    this.f436h = this.f434f[i];
                } else {
                    int[] iArr = this.f434f;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c0693le.m1560b(this.f430b);
                }
                c0693le.f2591l--;
                this.f429a--;
                this.f433e[i] = -1;
                if (this.f438j) {
                    this.f437i = i;
                }
                return this.f435g[i];
            }
            i2++;
            i3 = i;
            i = this.f434f[i];
        }
        return 0.0f;
    }

    @Override // p000a.C0184K1.a
    /* JADX INFO: renamed from: i */
    public final float mo349i(C0693le c0693le) {
        int i = this.f436h;
        for (int i2 = 0; i != -1 && i2 < this.f429a; i2++) {
            if (this.f433e[i] == c0693le.f2581b) {
                return this.f435g[i];
            }
            i = this.f434f[i];
        }
        return 0.0f;
    }

    @Override // p000a.C0184K1.a
    /* JADX INFO: renamed from: j */
    public final void mo350j() {
        int i = this.f436h;
        for (int i2 = 0; i != -1 && i2 < this.f429a; i2++) {
            float[] fArr = this.f435g;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f434f[i];
        }
    }

    @Override // p000a.C0184K1.a
    /* JADX INFO: renamed from: k */
    public final int mo351k() {
        return this.f429a;
    }

    public final String toString() {
        int i = this.f436h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f429a; i2++) {
            str = (C0944z.m2226f(str, " -> ") + this.f435g[i] + " : ") + ((C0693le[]) this.f431c.f26d)[this.f433e[i]];
            i = this.f434f[i];
        }
        return str;
    }
}
