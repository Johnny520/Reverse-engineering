package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: E4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0177E4 {

    /* JADX INFO: renamed from: b */
    public final C0564N4 f511b;

    /* JADX INFO: renamed from: c */
    public final C2656w4 f512c;

    /* JADX INFO: renamed from: a */
    public int f510a = 0;

    /* JADX INFO: renamed from: d */
    public int f513d = 8;

    /* JADX INFO: renamed from: e */
    public int[] f514e = new int[8];

    /* JADX INFO: renamed from: f */
    public int[] f515f = new int[8];

    /* JADX INFO: renamed from: g */
    public float[] f516g = new float[8];

    /* JADX INFO: renamed from: h */
    public int f517h = -1;

    /* JADX INFO: renamed from: i */
    public int f518i = -1;

    /* JADX INFO: renamed from: j */
    public boolean f519j = false;

    public C0177E4(C0564N4 c0564n4, C2656w4 c2656w4) {
        this.f511b = c0564n4;
        this.f512c = c2656w4;
    }

    /* JADX INFO: renamed from: a */
    public final void m361a(C0256Fy c0256Fy, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f517h;
            C0564N4 c0564n4 = this.f511b;
            if (i == -1) {
                this.f517h = 0;
                this.f516g[0] = f;
                this.f514e[0] = c0256Fy.f830b;
                this.f515f[0] = -1;
                c0256Fy.f839k++;
                c0256Fy.m533a(c0564n4);
                this.f510a++;
                if (this.f519j) {
                    return;
                }
                int i2 = this.f518i + 1;
                this.f518i = i2;
                int[] iArr = this.f514e;
                if (i2 >= iArr.length) {
                    this.f519j = true;
                    this.f518i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f510a; i4++) {
                int i5 = this.f514e[i];
                int i6 = c0256Fy.f830b;
                if (i5 == i6) {
                    float[] fArr = this.f516g;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f517h) {
                            this.f517h = this.f515f[i];
                        } else {
                            int[] iArr2 = this.f515f;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            c0256Fy.m534b(c0564n4);
                        }
                        if (this.f519j) {
                            this.f518i = i;
                        }
                        c0256Fy.f839k--;
                        this.f510a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f515f[i];
            }
            int length = this.f518i;
            int i7 = length + 1;
            if (this.f519j) {
                int[] iArr3 = this.f514e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i7;
            }
            int[] iArr4 = this.f514e;
            if (length >= iArr4.length && this.f510a < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f514e;
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
            int[] iArr6 = this.f514e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i9 = this.f513d * 2;
                this.f513d = i9;
                this.f519j = false;
                this.f518i = length - 1;
                this.f516g = Arrays.copyOf(this.f516g, i9);
                this.f514e = Arrays.copyOf(this.f514e, this.f513d);
                this.f515f = Arrays.copyOf(this.f515f, this.f513d);
            }
            this.f514e[length] = c0256Fy.f830b;
            this.f516g[length] = f;
            if (i3 != -1) {
                int[] iArr7 = this.f515f;
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                this.f515f[length] = this.f517h;
                this.f517h = length;
            }
            c0256Fy.f839k++;
            c0256Fy.m533a(c0564n4);
            this.f510a++;
            if (!this.f519j) {
                this.f518i++;
            }
            int i10 = this.f518i;
            int[] iArr8 = this.f514e;
            if (i10 >= iArr8.length) {
                this.f519j = true;
                this.f518i = iArr8.length - 1;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m362b() {
        int i = this.f517h;
        for (int i2 = 0; i != -1 && i2 < this.f510a; i2++) {
            C0256Fy c0256Fy = ((C0256Fy[]) this.f512c.f9198d)[this.f514e[i]];
            if (c0256Fy != null) {
                c0256Fy.m534b(this.f511b);
            }
            i = this.f515f[i];
        }
        this.f517h = -1;
        this.f518i = -1;
        this.f519j = false;
        this.f510a = 0;
    }

    /* JADX INFO: renamed from: c */
    public final float m363c(C0256Fy c0256Fy) {
        int i = this.f517h;
        for (int i2 = 0; i != -1 && i2 < this.f510a; i2++) {
            if (this.f514e[i] == c0256Fy.f830b) {
                return this.f516g[i];
            }
            i = this.f515f[i];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public final int m364d() {
        return this.f510a;
    }

    /* JADX INFO: renamed from: e */
    public final C0256Fy m365e(int i) {
        int i2 = this.f517h;
        for (int i3 = 0; i2 != -1 && i3 < this.f510a; i3++) {
            if (i3 == i) {
                return ((C0256Fy[]) this.f512c.f9198d)[this.f514e[i2]];
            }
            i2 = this.f515f[i2];
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final float m366f(int i) {
        int i2 = this.f517h;
        for (int i3 = 0; i2 != -1 && i3 < this.f510a; i3++) {
            if (i3 == i) {
                return this.f516g[i2];
            }
            i2 = this.f515f[i2];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: g */
    public final void m367g(C0256Fy c0256Fy, float f) {
        if (f == 0.0f) {
            m368h(c0256Fy, true);
            return;
        }
        int i = this.f517h;
        C0564N4 c0564n4 = this.f511b;
        if (i == -1) {
            this.f517h = 0;
            this.f516g[0] = f;
            this.f514e[0] = c0256Fy.f830b;
            this.f515f[0] = -1;
            c0256Fy.f839k++;
            c0256Fy.m533a(c0564n4);
            this.f510a++;
            if (this.f519j) {
                return;
            }
            int i2 = this.f518i + 1;
            this.f518i = i2;
            int[] iArr = this.f514e;
            if (i2 >= iArr.length) {
                this.f519j = true;
                this.f518i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f510a; i4++) {
            int i5 = this.f514e[i];
            int i6 = c0256Fy.f830b;
            if (i5 == i6) {
                this.f516g[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f515f[i];
        }
        int length = this.f518i;
        int i7 = length + 1;
        if (this.f519j) {
            int[] iArr2 = this.f514e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f514e;
        if (length >= iArr3.length && this.f510a < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f514e;
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
        int[] iArr5 = this.f514e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f513d * 2;
            this.f513d = i9;
            this.f519j = false;
            this.f518i = length - 1;
            this.f516g = Arrays.copyOf(this.f516g, i9);
            this.f514e = Arrays.copyOf(this.f514e, this.f513d);
            this.f515f = Arrays.copyOf(this.f515f, this.f513d);
        }
        this.f514e[length] = c0256Fy.f830b;
        this.f516g[length] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f515f;
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            this.f515f[length] = this.f517h;
            this.f517h = length;
        }
        c0256Fy.f839k++;
        c0256Fy.m533a(c0564n4);
        int i10 = this.f510a + 1;
        this.f510a = i10;
        if (!this.f519j) {
            this.f518i++;
        }
        int[] iArr7 = this.f514e;
        if (i10 >= iArr7.length) {
            this.f519j = true;
        }
        if (this.f518i >= iArr7.length) {
            this.f519j = true;
            this.f518i = iArr7.length - 1;
        }
    }

    /* JADX INFO: renamed from: h */
    public final float m368h(C0256Fy c0256Fy, boolean z) {
        int i = this.f517h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f510a) {
            if (this.f514e[i] == c0256Fy.f830b) {
                if (i == this.f517h) {
                    this.f517h = this.f515f[i];
                } else {
                    int[] iArr = this.f515f;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c0256Fy.m534b(this.f511b);
                }
                c0256Fy.f839k--;
                this.f510a--;
                this.f514e[i] = -1;
                if (this.f519j) {
                    this.f518i = i;
                }
                return this.f516g[i];
            }
            i2++;
            i3 = i;
            i = this.f515f[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.f517h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f510a; i2++) {
            str = (AbstractC0213Ey.m407e(str, " -> ") + this.f516g[i] + " : ") + ((C0256Fy[]) this.f512c.f9198d)[this.f514e[i]];
            i = this.f515f[i];
        }
        return str;
    }
}
