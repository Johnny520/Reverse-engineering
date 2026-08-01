package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a40 {

    /* JADX INFO: renamed from: a */
    public boolean f28a;

    /* JADX INFO: renamed from: e */
    public float f32e;

    /* JADX INFO: renamed from: l */
    public int f39l;

    /* JADX INFO: renamed from: b */
    public int f29b = -1;

    /* JADX INFO: renamed from: c */
    public int f30c = -1;

    /* JADX INFO: renamed from: d */
    public int f31d = 0;

    /* JADX INFO: renamed from: f */
    public boolean f33f = false;

    /* JADX INFO: renamed from: g */
    public final float[] f34g = new float[9];

    /* JADX INFO: renamed from: h */
    public final float[] f35h = new float[9];

    /* JADX INFO: renamed from: i */
    public C0586p6[] f36i = new C0586p6[16];

    /* JADX INFO: renamed from: j */
    public int f37j = 0;

    /* JADX INFO: renamed from: k */
    public int f38k = 0;

    public a40(int i) {
        this.f39l = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m11a(C0586p6 c0586p6) {
        int i = 0;
        while (true) {
            int i2 = this.f37j;
            if (i >= i2) {
                C0586p6[] c0586p6Arr = this.f36i;
                if (i2 >= c0586p6Arr.length) {
                    this.f36i = (C0586p6[]) Arrays.copyOf(c0586p6Arr, c0586p6Arr.length * 2);
                }
                C0586p6[] c0586p6Arr2 = this.f36i;
                int i3 = this.f37j;
                c0586p6Arr2[i3] = c0586p6;
                this.f37j = i3 + 1;
                return;
            }
            if (this.f36i[i] == c0586p6) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12b(C0586p6 c0586p6) {
        int i = this.f37j;
        int i2 = 0;
        while (i2 < i) {
            if (this.f36i[i2] == c0586p6) {
                while (i2 < i - 1) {
                    C0586p6[] c0586p6Arr = this.f36i;
                    int i3 = i2 + 1;
                    c0586p6Arr[i2] = c0586p6Arr[i3];
                    i2 = i3;
                }
                this.f37j--;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m13c() {
        this.f39l = 5;
        this.f31d = 0;
        this.f29b = -1;
        this.f30c = -1;
        this.f32e = 0.0f;
        this.f33f = false;
        int i = this.f37j;
        for (int i2 = 0; i2 < i; i2++) {
            this.f36i[i2] = null;
        }
        this.f37j = 0;
        this.f38k = 0;
        this.f28a = false;
        Arrays.fill(this.f35h, 0.0f);
    }

    /* JADX INFO: renamed from: d */
    public final void m14d(C0586p6 c0586p6) {
        int i = this.f37j;
        for (int i2 = 0; i2 < i; i2++) {
            this.f36i[i2].mo2044h(c0586p6, false);
        }
        this.f37j = 0;
    }

    public final String toString() {
        return "" + this.f29b;
    }
}
