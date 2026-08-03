package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: Fy */
/* JADX INFO: loaded from: classes.dex */
public final class C0256Fy implements Comparable {

    /* JADX INFO: renamed from: a */
    public boolean f829a;

    /* JADX INFO: renamed from: e */
    public float f833e;

    /* JADX INFO: renamed from: l */
    public int f840l;

    /* JADX INFO: renamed from: b */
    public int f830b = -1;

    /* JADX INFO: renamed from: c */
    public int f831c = -1;

    /* JADX INFO: renamed from: d */
    public int f832d = 0;

    /* JADX INFO: renamed from: f */
    public boolean f834f = false;

    /* JADX INFO: renamed from: g */
    public final float[] f835g = new float[9];

    /* JADX INFO: renamed from: h */
    public final float[] f836h = new float[9];

    /* JADX INFO: renamed from: i */
    public C0564N4[] f837i = new C0564N4[16];

    /* JADX INFO: renamed from: j */
    public int f838j = 0;

    /* JADX INFO: renamed from: k */
    public int f839k = 0;

    public C0256Fy(int i) {
        this.f840l = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m533a(C0564N4 c0564n4) {
        int i = 0;
        while (true) {
            int i2 = this.f838j;
            if (i >= i2) {
                C0564N4[] c0564n4Arr = this.f837i;
                if (i2 >= c0564n4Arr.length) {
                    this.f837i = (C0564N4[]) Arrays.copyOf(c0564n4Arr, c0564n4Arr.length * 2);
                }
                C0564N4[] c0564n4Arr2 = this.f837i;
                int i3 = this.f838j;
                c0564n4Arr2[i3] = c0564n4;
                this.f838j = i3 + 1;
                return;
            }
            if (this.f837i[i] == c0564n4) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m534b(C0564N4 c0564n4) {
        int i = this.f838j;
        int i2 = 0;
        while (i2 < i) {
            if (this.f837i[i2] == c0564n4) {
                while (i2 < i - 1) {
                    C0564N4[] c0564n4Arr = this.f837i;
                    int i3 = i2 + 1;
                    c0564n4Arr[i2] = c0564n4Arr[i3];
                    i2 = i3;
                }
                this.f838j--;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m535c() {
        this.f840l = 5;
        this.f832d = 0;
        this.f830b = -1;
        this.f831c = -1;
        this.f833e = 0.0f;
        this.f834f = false;
        int i = this.f838j;
        for (int i2 = 0; i2 < i; i2++) {
            this.f837i[i2] = null;
        }
        this.f838j = 0;
        this.f839k = 0;
        this.f829a = false;
        Arrays.fill(this.f836h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f830b - ((C0256Fy) obj).f830b;
    }

    /* JADX INFO: renamed from: d */
    public final void m536d(C2244mo c2244mo, float f) {
        this.f833e = f;
        this.f834f = true;
        int i = this.f838j;
        this.f831c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f837i[i2].m1110h(c2244mo, this, false);
        }
        this.f838j = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m537e(C2244mo c2244mo, C0564N4 c0564n4) {
        int i = this.f838j;
        for (int i2 = 0; i2 < i; i2++) {
            this.f837i[i2].mo1111i(c2244mo, c0564n4, false);
        }
        this.f838j = 0;
    }

    public final String toString() {
        return "" + this.f830b;
    }
}
