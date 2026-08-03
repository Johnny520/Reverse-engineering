package p000a;

import java.util.Arrays;
import p000a.C0029B9;
import p000a.C0184K1;

/* JADX INFO: renamed from: a.me */
/* JADX INFO: loaded from: classes.dex */
public final class C0712me implements C0184K1.a {

    /* JADX INFO: renamed from: a */
    public int f2682a = 16;

    /* JADX INFO: renamed from: b */
    public final int[] f2683b = new int[16];

    /* JADX INFO: renamed from: c */
    public int[] f2684c = new int[16];

    /* JADX INFO: renamed from: d */
    public int[] f2685d = new int[16];

    /* JADX INFO: renamed from: e */
    public float[] f2686e = new float[16];

    /* JADX INFO: renamed from: f */
    public int[] f2687f = new int[16];

    /* JADX INFO: renamed from: g */
    public int[] f2688g = new int[16];

    /* JADX INFO: renamed from: h */
    public int f2689h = 0;

    /* JADX INFO: renamed from: i */
    public int f2690i = -1;

    /* JADX INFO: renamed from: j */
    public final C0029B9.b f2691j;

    /* JADX INFO: renamed from: k */
    public final C0003A2 f2692k;

    public C0712me(C0029B9.b bVar, C0003A2 c0003a2) {
        this.f2691j = bVar;
        this.f2692k = c0003a2;
        clear();
    }

    @Override // p000a.C0184K1.a
    /* JADX INFO: renamed from: a */
    public final float mo341a(int i) {
        int i2 = this.f2689h;
        int i3 = this.f2690i;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f2686e[i3];
            }
            i3 = this.f2688g[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // p000a.C0184K1.a
    /* JADX INFO: renamed from: b */
    public final float mo342b(C0184K1 c0184k1, boolean z) {
        float fMo349i = mo349i(c0184k1.f633a);
        mo348h(c0184k1.f633a, z);
        C0712me c0712me = (C0712me) c0184k1.f636d;
        int i = c0712me.f2689h;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = c0712me.f2685d[i3];
            if (i4 != -1) {
                mo345e(((C0693le[]) this.f2692k.f26d)[i4], c0712me.f2686e[i3] * fMo349i, z);
                i2++;
            }
            i3++;
        }
        return fMo349i;
    }

    @Override // p000a.C0184K1.a
    /* JADX INFO: renamed from: c */
    public final void mo343c(C0693le c0693le, float f) {
        if (f > -0.001f && f < 0.001f) {
            mo348h(c0693le, true);
            return;
        }
        int i = 0;
        if (this.f2689h == 0) {
            m1626m(0, c0693le, f);
            m1625l(c0693le, 0);
            this.f2690i = 0;
            return;
        }
        int iM1627n = m1627n(c0693le);
        if (iM1627n != -1) {
            this.f2686e[iM1627n] = f;
            return;
        }
        int i2 = this.f2689h + 1;
        int i3 = this.f2682a;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            this.f2685d = Arrays.copyOf(this.f2685d, i4);
            this.f2686e = Arrays.copyOf(this.f2686e, i4);
            this.f2687f = Arrays.copyOf(this.f2687f, i4);
            this.f2688g = Arrays.copyOf(this.f2688g, i4);
            this.f2684c = Arrays.copyOf(this.f2684c, i4);
            for (int i5 = this.f2682a; i5 < i4; i5++) {
                this.f2685d[i5] = -1;
                this.f2684c[i5] = -1;
            }
            this.f2682a = i4;
        }
        int i6 = this.f2689h;
        int i7 = this.f2690i;
        int i8 = -1;
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = this.f2685d[i7];
            int i11 = c0693le.f2581b;
            if (i10 == i11) {
                this.f2686e[i7] = f;
                return;
            }
            if (i10 < i11) {
                i8 = i7;
            }
            i7 = this.f2688g[i7];
            if (i7 == -1) {
                break;
            }
        }
        while (true) {
            if (i >= this.f2682a) {
                i = -1;
                break;
            } else if (this.f2685d[i] == -1) {
                break;
            } else {
                i++;
            }
        }
        m1626m(i, c0693le, f);
        if (i8 != -1) {
            this.f2687f[i] = i8;
            int[] iArr = this.f2688g;
            iArr[i] = iArr[i8];
            iArr[i8] = i;
        } else {
            this.f2687f[i] = -1;
            if (this.f2689h > 0) {
                this.f2688g[i] = this.f2690i;
                this.f2690i = i;
            } else {
                this.f2688g[i] = -1;
            }
        }
        int i12 = this.f2688g[i];
        if (i12 != -1) {
            this.f2687f[i12] = i;
        }
        m1625l(c0693le, i);
    }

    @Override // p000a.C0184K1.a
    public final void clear() {
        int i = this.f2689h;
        for (int i2 = 0; i2 < i; i2++) {
            C0693le c0693leMo346f = mo346f(i2);
            if (c0693leMo346f != null) {
                c0693leMo346f.m1560b(this.f2691j);
            }
        }
        for (int i3 = 0; i3 < this.f2682a; i3++) {
            this.f2685d[i3] = -1;
            this.f2684c[i3] = -1;
        }
        for (int i4 = 0; i4 < 16; i4++) {
            this.f2683b[i4] = -1;
        }
        this.f2689h = 0;
        this.f2690i = -1;
    }

    @Override // p000a.C0184K1.a
    /* JADX INFO: renamed from: d */
    public final boolean mo344d(C0693le c0693le) {
        return m1627n(c0693le) != -1;
    }

    @Override // p000a.C0184K1.a
    /* JADX INFO: renamed from: e */
    public final void mo345e(C0693le c0693le, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int iM1627n = m1627n(c0693le);
            if (iM1627n == -1) {
                mo343c(c0693le, f);
                return;
            }
            float[] fArr = this.f2686e;
            float f2 = fArr[iM1627n] + f;
            fArr[iM1627n] = f2;
            if (f2 <= -0.001f || f2 >= 0.001f) {
                return;
            }
            fArr[iM1627n] = 0.0f;
            mo348h(c0693le, z);
        }
    }

    @Override // p000a.C0184K1.a
    /* JADX INFO: renamed from: f */
    public final C0693le mo346f(int i) {
        int i2 = this.f2689h;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f2690i;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return ((C0693le[]) this.f2692k.f26d)[this.f2685d[i3]];
            }
            i3 = this.f2688g[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // p000a.C0184K1.a
    /* JADX INFO: renamed from: g */
    public final void mo347g(float f) {
        int i = this.f2689h;
        int i2 = this.f2690i;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f2686e;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f2688g[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // p000a.C0184K1.a
    /* JADX INFO: renamed from: h */
    public final float mo348h(C0693le c0693le, boolean z) {
        int[] iArr;
        int i;
        int iM1627n = m1627n(c0693le);
        if (iM1627n == -1) {
            return 0.0f;
        }
        int i2 = c0693le.f2581b;
        int i3 = i2 % 16;
        int[] iArr2 = this.f2683b;
        int i4 = iArr2[i3];
        if (i4 != -1) {
            if (this.f2685d[i4] == i2) {
                int[] iArr3 = this.f2684c;
                iArr2[i3] = iArr3[i4];
                iArr3[i4] = -1;
            } else {
                while (true) {
                    iArr = this.f2684c;
                    i = iArr[i4];
                    if (i == -1 || this.f2685d[i] == i2) {
                        break;
                    }
                    i4 = i;
                }
                if (i != -1 && this.f2685d[i] == i2) {
                    iArr[i4] = iArr[i];
                    iArr[i] = -1;
                }
            }
        }
        float f = this.f2686e[iM1627n];
        if (this.f2690i == iM1627n) {
            this.f2690i = this.f2688g[iM1627n];
        }
        this.f2685d[iM1627n] = -1;
        int[] iArr4 = this.f2687f;
        int i5 = iArr4[iM1627n];
        if (i5 != -1) {
            int[] iArr5 = this.f2688g;
            iArr5[i5] = iArr5[iM1627n];
        }
        int i6 = this.f2688g[iM1627n];
        if (i6 != -1) {
            iArr4[i6] = iArr4[iM1627n];
        }
        this.f2689h--;
        c0693le.f2591l--;
        if (z) {
            c0693le.m1560b(this.f2691j);
        }
        return f;
    }

    @Override // p000a.C0184K1.a
    /* JADX INFO: renamed from: i */
    public final float mo349i(C0693le c0693le) {
        int iM1627n = m1627n(c0693le);
        if (iM1627n != -1) {
            return this.f2686e[iM1627n];
        }
        return 0.0f;
    }

    @Override // p000a.C0184K1.a
    /* JADX INFO: renamed from: j */
    public final void mo350j() {
        int i = this.f2689h;
        int i2 = this.f2690i;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f2686e;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f2688g[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // p000a.C0184K1.a
    /* JADX INFO: renamed from: k */
    public final int mo351k() {
        return this.f2689h;
    }

    /* JADX INFO: renamed from: l */
    public final void m1625l(C0693le c0693le, int i) {
        int[] iArr;
        int i2 = c0693le.f2581b % 16;
        int[] iArr2 = this.f2683b;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f2684c;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                } else {
                    i3 = i4;
                }
            }
            iArr[i3] = i;
        }
        this.f2684c[i] = -1;
    }

    /* JADX INFO: renamed from: m */
    public final void m1626m(int i, C0693le c0693le, float f) {
        this.f2685d[i] = c0693le.f2581b;
        this.f2686e[i] = f;
        this.f2687f[i] = -1;
        this.f2688g[i] = -1;
        c0693le.m1559a(this.f2691j);
        c0693le.f2591l++;
        this.f2689h++;
    }

    /* JADX INFO: renamed from: n */
    public final int m1627n(C0693le c0693le) {
        if (this.f2689h == 0) {
            return -1;
        }
        int i = c0693le.f2581b;
        int i2 = this.f2683b[i % 16];
        if (i2 == -1) {
            return -1;
        }
        if (this.f2685d[i2] == i) {
            return i2;
        }
        do {
            i2 = this.f2684c[i2];
            if (i2 == -1) {
                break;
            }
        } while (this.f2685d[i2] != i);
        if (i2 != -1 && this.f2685d[i2] == i) {
            return i2;
        }
        return -1;
    }

    public final String toString() {
        String strM2226f = hashCode() + " { ";
        int i = this.f2689h;
        for (int i2 = 0; i2 < i; i2++) {
            C0693le c0693leMo346f = mo346f(i2);
            if (c0693leMo346f != null) {
                String str = strM2226f + c0693leMo346f + " = " + mo341a(i2) + " ";
                int iM1627n = m1627n(c0693leMo346f);
                String strM2226f2 = C0944z.m2226f(str, "[p: ");
                int i3 = this.f2687f[iM1627n];
                C0003A2 c0003a2 = this.f2692k;
                String strM2226f3 = C0944z.m2226f(i3 != -1 ? strM2226f2 + ((C0693le[]) c0003a2.f26d)[this.f2685d[this.f2687f[iM1627n]]] : C0944z.m2226f(strM2226f2, "none"), ", n: ");
                strM2226f = C0944z.m2226f(this.f2688g[iM1627n] != -1 ? strM2226f3 + ((C0693le[]) c0003a2.f26d)[this.f2685d[this.f2688g[iM1627n]]] : C0944z.m2226f(strM2226f3, "none"), "]");
            }
        }
        return C0944z.m2226f(strM2226f, " }");
    }
}
