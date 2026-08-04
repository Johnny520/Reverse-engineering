package yyds;

import java.util.Arrays;

/* JADX INFO: renamed from: yyds.ᲀᛶᛶᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2020 extends C1486 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f10087;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public C0119 f10088;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public C0972[] f10089;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public C0972[] f10090;

    @Override // yyds.C1486
    public final String toString() {
        C0119 c0119 = this.f10088;
        String str = " goal -> (" + this.f7027 + ") : ";
        for (int i = 0; i < this.f10087; i++) {
            c0119.f812 = this.f10090[i];
            str = str + c0119 + " ";
        }
        return str;
    }

    @Override // yyds.C1486
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final void mo2981(C2296 c2296, C1486 c1486, boolean z) {
        C0972 c0972 = c1486.f7026;
        if (c0972 == null) {
            return;
        }
        float[] fArr = c0972.f4461;
        C2244 c2244 = c1486.f7029;
        int iM4248 = c2244.m4248();
        for (int i = 0; i < iM4248; i++) {
            C0972 c0972M4242 = c2244.m4242(i);
            float fM4247 = c2244.m4247(i);
            C0119 c0119 = this.f10088;
            c0119.f812 = c0972M4242;
            if (c0972M4242.f4462) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((C0972) c0119.f812).f4461;
                    float f = (fArr[i2] * fM4247) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((C0972) c0119.f812).f4461[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((C2020) c0119.f810).m3896((C0972) c0119.f812);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fM4247;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((C0972) c0119.f812).f4461[i3] = f3;
                    } else {
                        ((C0972) c0119.f812).f4461[i3] = 0.0f;
                    }
                }
                m3897(c0972M4242);
            }
            this.f7027 = (c1486.f7027 * fM4247) + this.f7027;
        }
        m3896(c0972);
    }

    @Override // yyds.C1486
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final boolean mo2982() {
        return this.f10087 == 0;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final void m3896(C0972 c0972) {
        int i = 0;
        while (i < this.f10087) {
            if (this.f10090[i] == c0972) {
                while (true) {
                    int i2 = this.f10087;
                    if (i >= i2 - 1) {
                        this.f10087 = i2 - 1;
                        c0972.f4462 = false;
                        return;
                    } else {
                        C0972[] c0972Arr = this.f10090;
                        int i3 = i + 1;
                        c0972Arr[i] = c0972Arr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void m3897(C0972 c0972) {
        int i;
        C0972[] c0972Arr;
        int i2 = this.f10087 + 1;
        C0972[] c0972Arr2 = this.f10090;
        if (i2 > c0972Arr2.length) {
            C0972[] c0972Arr3 = (C0972[]) Arrays.copyOf(c0972Arr2, c0972Arr2.length * 2);
            this.f10090 = c0972Arr3;
            this.f10089 = (C0972[]) Arrays.copyOf(c0972Arr3, c0972Arr3.length * 2);
        }
        C0972[] c0972Arr4 = this.f10090;
        int i3 = this.f10087;
        c0972Arr4[i3] = c0972;
        int i4 = i3 + 1;
        this.f10087 = i4;
        if (i4 > 1 && c0972Arr4[i3].f4464 > c0972.f4464) {
            int i5 = 0;
            while (true) {
                i = this.f10087;
                c0972Arr = this.f10089;
                if (i5 >= i) {
                    break;
                }
                c0972Arr[i5] = this.f10090[i5];
                i5++;
            }
            Arrays.sort(c0972Arr, 0, i, new C1300(17));
            for (int i6 = 0; i6 < this.f10087; i6++) {
                this.f10090[i6] = this.f10089[i6];
            }
        }
        c0972.f4462 = true;
        c0972.m2111(this);
    }

    @Override // yyds.C1486
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final C0972 mo2988(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f10087; i2++) {
            C0972[] c0972Arr = this.f10090;
            C0972 c0972 = c0972Arr[i2];
            if (!zArr[c0972.f4464]) {
                C0119 c0119 = this.f10088;
                c0119.f812 = c0972;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((C0972) c0119.f812).f4461[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    C0972 c09722 = c0972Arr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = c09722.f4461[i3];
                            float f3 = ((C0972) c0119.f812).f4461[i3];
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
        return this.f10090[i];
    }
}
