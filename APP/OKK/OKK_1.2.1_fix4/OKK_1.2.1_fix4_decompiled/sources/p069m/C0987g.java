package p069m;

import java.util.Arrays;
import p037U.C0375k;

/* JADX INFO: renamed from: m.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0987g extends C0983c {

    /* JADX INFO: renamed from: f */
    public C0989i[] f3502f;

    /* JADX INFO: renamed from: g */
    public C0989i[] f3503g;

    /* JADX INFO: renamed from: h */
    public int f3504h;

    /* JADX INFO: renamed from: i */
    public C0986f f3505i;

    @Override // p069m.C0983c
    /* JADX INFO: renamed from: d */
    public final C0989i mo2347d(boolean[] zArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.f3504h; i3++) {
            C0989i[] c0989iArr = this.f3502f;
            C0989i c0989i = c0989iArr[i3];
            if (!zArr[c0989i.f3507b]) {
                C0986f c0986f = this.f3505i;
                c0986f.f3500a = c0989i;
                int i4 = 8;
                if (i2 == -1) {
                    while (i4 >= 0) {
                        float f2 = c0986f.f3500a.f3513h[i4];
                        if (f2 <= 0.0f) {
                            if (f2 < 0.0f) {
                                i2 = i3;
                                break;
                            }
                            i4--;
                        }
                    }
                } else {
                    C0989i c0989i2 = c0989iArr[i2];
                    while (true) {
                        if (i4 >= 0) {
                            float f3 = c0989i2.f3513h[i4];
                            float f4 = c0986f.f3500a.f3513h[i4];
                            if (f4 == f3) {
                                i4--;
                            } else if (f4 < f3) {
                            }
                        }
                    }
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        return this.f3502f[i2];
    }

    @Override // p069m.C0983c
    /* JADX INFO: renamed from: h */
    public final void mo2351h(C0983c c0983c, boolean z2) {
        C0989i c0989i = c0983c.f3479a;
        if (c0989i == null) {
            return;
        }
        InterfaceC0982b interfaceC0982b = c0983c.f3482d;
        int iMo2343k = interfaceC0982b.mo2343k();
        for (int i2 = 0; i2 < iMo2343k; i2++) {
            C0989i c0989iMo2336d = interfaceC0982b.mo2336d(i2);
            float fMo2333a = interfaceC0982b.mo2333a(i2);
            C0986f c0986f = this.f3505i;
            c0986f.f3500a = c0989iMo2336d;
            boolean z3 = c0989iMo2336d.f3506a;
            float[] fArr = c0989i.f3513h;
            if (z3) {
                boolean z4 = true;
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr2 = c0986f.f3500a.f3513h;
                    float f2 = (fArr[i3] * fMo2333a) + fArr2[i3];
                    fArr2[i3] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        c0986f.f3500a.f3513h[i3] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    c0986f.f3501b.m2371j(c0986f.f3500a);
                }
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f3 = fArr[i4];
                    if (f3 != 0.0f) {
                        float f4 = f3 * fMo2333a;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        c0986f.f3500a.f3513h[i4] = f4;
                    } else {
                        c0986f.f3500a.f3513h[i4] = 0.0f;
                    }
                }
                m2370i(c0989iMo2336d);
            }
            this.f3480b = (c0983c.f3480b * fMo2333a) + this.f3480b;
        }
        m2371j(c0989i);
    }

    /* JADX INFO: renamed from: i */
    public final void m2370i(C0989i c0989i) {
        int i2;
        int i3 = this.f3504h + 1;
        C0989i[] c0989iArr = this.f3502f;
        if (i3 > c0989iArr.length) {
            C0989i[] c0989iArr2 = (C0989i[]) Arrays.copyOf(c0989iArr, c0989iArr.length * 2);
            this.f3502f = c0989iArr2;
            this.f3503g = (C0989i[]) Arrays.copyOf(c0989iArr2, c0989iArr2.length * 2);
        }
        C0989i[] c0989iArr3 = this.f3502f;
        int i4 = this.f3504h;
        c0989iArr3[i4] = c0989i;
        int i5 = i4 + 1;
        this.f3504h = i5;
        if (i5 > 1 && c0989iArr3[i4].f3507b > c0989i.f3507b) {
            int i6 = 0;
            while (true) {
                i2 = this.f3504h;
                if (i6 >= i2) {
                    break;
                }
                this.f3503g[i6] = this.f3502f[i6];
                i6++;
            }
            Arrays.sort(this.f3503g, 0, i2, new C0375k(2));
            for (int i7 = 0; i7 < this.f3504h; i7++) {
                this.f3502f[i7] = this.f3503g[i7];
            }
        }
        c0989i.f3506a = true;
        c0989i.m2373a(this);
    }

    /* JADX INFO: renamed from: j */
    public final void m2371j(C0989i c0989i) {
        int i2 = 0;
        while (i2 < this.f3504h) {
            if (this.f3502f[i2] == c0989i) {
                while (true) {
                    int i3 = this.f3504h;
                    if (i2 >= i3 - 1) {
                        this.f3504h = i3 - 1;
                        c0989i.f3506a = false;
                        return;
                    } else {
                        C0989i[] c0989iArr = this.f3502f;
                        int i4 = i2 + 1;
                        c0989iArr[i2] = c0989iArr[i4];
                        i2 = i4;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    @Override // p069m.C0983c
    public final String toString() {
        String str = " goal -> (" + this.f3480b + ") : ";
        for (int i2 = 0; i2 < this.f3504h; i2++) {
            C0989i c0989i = this.f3502f[i2];
            C0986f c0986f = this.f3505i;
            c0986f.f3500a = c0989i;
            str = str + c0986f + " ";
        }
        return str;
    }
}
