package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: xu */
/* JADX INFO: loaded from: classes.dex */
public final class C2731xu extends C0564N4 {

    /* JADX INFO: renamed from: f */
    public C0256Fy[] f9331f;

    /* JADX INFO: renamed from: g */
    public C0256Fy[] f9332g;

    /* JADX INFO: renamed from: h */
    public int f9333h;

    /* JADX INFO: renamed from: i */
    public C0649P3 f9334i;

    @Override // p000.C0564N4
    /* JADX INFO: renamed from: d */
    public final C0256Fy mo1106d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f9333h; i2++) {
            C0256Fy[] c0256FyArr = this.f9331f;
            C0256Fy c0256Fy = c0256FyArr[i2];
            if (!zArr[c0256Fy.f830b]) {
                C0649P3 c0649p3 = this.f9334i;
                c0649p3.f2089b = c0256Fy;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((C0256Fy) c0649p3.f2089b).f836h[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    C0256Fy c0256Fy2 = c0256FyArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = c0256Fy2.f836h[i3];
                            float f3 = ((C0256Fy) c0649p3.f2089b).f836h[i3];
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
        return this.f9331f[i];
    }

    @Override // p000.C0564N4
    /* JADX INFO: renamed from: e */
    public final boolean mo1107e() {
        return this.f9333h == 0;
    }

    @Override // p000.C0564N4
    /* JADX INFO: renamed from: i */
    public final void mo1111i(C2244mo c2244mo, C0564N4 c0564n4, boolean z) {
        C0256Fy c0256Fy = c0564n4.f1842a;
        if (c0256Fy == null) {
            return;
        }
        float[] fArr = c0256Fy.f836h;
        C0177E4 c0177e4 = c0564n4.f1845d;
        int iM364d = c0177e4.m364d();
        for (int i = 0; i < iM364d; i++) {
            C0256Fy c0256FyM365e = c0177e4.m365e(i);
            float fM366f = c0177e4.m366f(i);
            C0649P3 c0649p3 = this.f9334i;
            c0649p3.f2089b = c0256FyM365e;
            if (c0256FyM365e.f829a) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((C0256Fy) c0649p3.f2089b).f836h;
                    float f = (fArr[i2] * fM366f) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((C0256Fy) c0649p3.f2089b).f836h[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((C2731xu) c0649p3.f2090c).m5298k((C0256Fy) c0649p3.f2089b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fM366f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((C0256Fy) c0649p3.f2089b).f836h[i3] = f3;
                    } else {
                        ((C0256Fy) c0649p3.f2089b).f836h[i3] = 0.0f;
                    }
                }
                m5297j(c0256FyM365e);
            }
            this.f1843b = (c0564n4.f1843b * fM366f) + this.f1843b;
        }
        m5298k(c0256Fy);
    }

    /* JADX INFO: renamed from: j */
    public final void m5297j(C0256Fy c0256Fy) {
        int i;
        int i2 = this.f9333h + 1;
        C0256Fy[] c0256FyArr = this.f9331f;
        if (i2 > c0256FyArr.length) {
            C0256Fy[] c0256FyArr2 = (C0256Fy[]) Arrays.copyOf(c0256FyArr, c0256FyArr.length * 2);
            this.f9331f = c0256FyArr2;
            this.f9332g = (C0256Fy[]) Arrays.copyOf(c0256FyArr2, c0256FyArr2.length * 2);
        }
        C0256Fy[] c0256FyArr3 = this.f9331f;
        int i3 = this.f9333h;
        c0256FyArr3[i3] = c0256Fy;
        int i4 = i3 + 1;
        this.f9333h = i4;
        if (i4 > 1 && c0256FyArr3[i3].f830b > c0256Fy.f830b) {
            int i5 = 0;
            while (true) {
                i = this.f9333h;
                if (i5 >= i) {
                    break;
                }
                this.f9332g[i5] = this.f9331f[i5];
                i5++;
            }
            Arrays.sort(this.f9332g, 0, i, new C0963Wb(6));
            for (int i6 = 0; i6 < this.f9333h; i6++) {
                this.f9331f[i6] = this.f9332g[i6];
            }
        }
        c0256Fy.f829a = true;
        c0256Fy.m533a(this);
    }

    /* JADX INFO: renamed from: k */
    public final void m5298k(C0256Fy c0256Fy) {
        int i = 0;
        while (i < this.f9333h) {
            if (this.f9331f[i] == c0256Fy) {
                while (true) {
                    int i2 = this.f9333h;
                    if (i >= i2 - 1) {
                        this.f9333h = i2 - 1;
                        c0256Fy.f829a = false;
                        return;
                    } else {
                        C0256Fy[] c0256FyArr = this.f9331f;
                        int i3 = i + 1;
                        c0256FyArr[i] = c0256FyArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // p000.C0564N4
    public final String toString() {
        C0649P3 c0649p3 = this.f9334i;
        String str = " goal -> (" + this.f1843b + ") : ";
        for (int i = 0; i < this.f9333h; i++) {
            c0649p3.f2089b = this.f9331f[i];
            str = str + c0649p3 + " ";
        }
        return str;
    }
}
