package yyds;

import java.util.Arrays;

/* JADX INFO: renamed from: yyds.ᛴᲇᛲᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0972 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public int f4453;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public float f4458;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public boolean f4462;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f4464 = -1;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f4457 = -1;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f4463 = 0;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public boolean f4454 = false;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final float[] f4456 = new float[9];

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final float[] f4461 = new float[9];

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public C1486[] f4459 = new C1486[16];

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public int f4460 = 0;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public int f4455 = 0;

    public C0972(int i) {
        this.f4453 = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f4464 - ((C0972) obj).f4464;
    }

    public final String toString() {
        return "" + this.f4464;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m2110(C2296 c2296, C1486 c1486) {
        int i = this.f4460;
        for (int i2 = 0; i2 < i; i2++) {
            this.f4459[i2].mo2981(c2296, c1486, false);
        }
        this.f4460 = 0;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m2111(C1486 c1486) {
        int i = 0;
        while (true) {
            int i2 = this.f4460;
            C1486[] c1486Arr = this.f4459;
            if (i >= i2) {
                if (i2 >= c1486Arr.length) {
                    c1486Arr = (C1486[]) Arrays.copyOf(c1486Arr, c1486Arr.length * 2);
                    this.f4459 = c1486Arr;
                }
                int i3 = this.f4460;
                c1486Arr[i3] = c1486;
                this.f4460 = i3 + 1;
                return;
            }
            if (c1486Arr[i] == c1486) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m2112(C1486 c1486) {
        int i = this.f4460;
        int i2 = 0;
        while (i2 < i) {
            if (this.f4459[i2] == c1486) {
                while (i2 < i - 1) {
                    C1486[] c1486Arr = this.f4459;
                    int i3 = i2 + 1;
                    c1486Arr[i2] = c1486Arr[i3];
                    i2 = i3;
                }
                this.f4460--;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m2113() {
        this.f4453 = 5;
        this.f4463 = 0;
        this.f4464 = -1;
        this.f4457 = -1;
        this.f4458 = 0.0f;
        this.f4454 = false;
        int i = this.f4460;
        for (int i2 = 0; i2 < i; i2++) {
            this.f4459[i2] = null;
        }
        this.f4460 = 0;
        this.f4455 = 0;
        this.f4462 = false;
        Arrays.fill(this.f4461, 0.0f);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m2114(C2296 c2296, float f) {
        this.f4458 = f;
        this.f4454 = true;
        int i = this.f4460;
        this.f4457 = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f4459[i2].m2980(c2296, this, false);
        }
        this.f4460 = 0;
    }
}
