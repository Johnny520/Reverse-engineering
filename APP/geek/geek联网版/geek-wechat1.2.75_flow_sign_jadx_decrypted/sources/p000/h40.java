package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h40 {

    /* JADX INFO: renamed from: a */
    public boolean f2100a;

    /* JADX INFO: renamed from: e */
    public float f2104e;

    /* JADX INFO: renamed from: l */
    public int f2111l;

    /* JADX INFO: renamed from: b */
    public int f2101b = -1;

    /* JADX INFO: renamed from: c */
    public int f2102c = -1;

    /* JADX INFO: renamed from: d */
    public int f2103d = 0;

    /* JADX INFO: renamed from: f */
    public boolean f2105f = false;

    /* JADX INFO: renamed from: g */
    public final float[] f2106g = new float[9];

    /* JADX INFO: renamed from: h */
    public final float[] f2107h = new float[9];

    /* JADX INFO: renamed from: i */
    public C0585p6[] f2108i = new C0585p6[16];

    /* JADX INFO: renamed from: j */
    public int f2109j = 0;

    /* JADX INFO: renamed from: k */
    public int f2110k = 0;

    public h40(int i) {
        this.f2111l = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m1351a(C0585p6 c0585p6) {
        int i = 0;
        while (true) {
            int i2 = this.f2109j;
            if (i >= i2) {
                C0585p6[] c0585p6Arr = this.f2108i;
                if (i2 >= c0585p6Arr.length) {
                    this.f2108i = (C0585p6[]) Arrays.copyOf(c0585p6Arr, c0585p6Arr.length * 2);
                }
                C0585p6[] c0585p6Arr2 = this.f2108i;
                int i3 = this.f2109j;
                c0585p6Arr2[i3] = c0585p6;
                this.f2109j = i3 + 1;
                return;
            }
            if (this.f2108i[i] == c0585p6) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1352b(C0585p6 c0585p6) {
        int i = this.f2109j;
        int i2 = 0;
        while (i2 < i) {
            if (this.f2108i[i2] == c0585p6) {
                while (i2 < i - 1) {
                    C0585p6[] c0585p6Arr = this.f2108i;
                    int i3 = i2 + 1;
                    c0585p6Arr[i2] = c0585p6Arr[i3];
                    i2 = i3;
                }
                this.f2109j--;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1353c() {
        this.f2111l = 5;
        this.f2103d = 0;
        this.f2101b = -1;
        this.f2102c = -1;
        this.f2104e = 0.0f;
        this.f2105f = false;
        int i = this.f2109j;
        for (int i2 = 0; i2 < i; i2++) {
            this.f2108i[i2] = null;
        }
        this.f2109j = 0;
        this.f2110k = 0;
        this.f2100a = false;
        Arrays.fill(this.f2107h, 0.0f);
    }

    /* JADX INFO: renamed from: d */
    public final void m1354d(C0585p6 c0585p6) {
        int i = this.f2109j;
        for (int i2 = 0; i2 < i; i2++) {
            this.f2108i[i2].mo1544h(c0585p6, false);
        }
        this.f2109j = 0;
    }

    public final String toString() {
        return "" + this.f2101b;
    }
}
