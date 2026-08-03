package p069m;

import java.util.Arrays;

/* JADX INFO: renamed from: m.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0989i {

    /* JADX INFO: renamed from: a */
    public boolean f3506a;

    /* JADX INFO: renamed from: e */
    public float f3510e;

    /* JADX INFO: renamed from: l */
    public int f3517l;

    /* JADX INFO: renamed from: b */
    public int f3507b = -1;

    /* JADX INFO: renamed from: c */
    public int f3508c = -1;

    /* JADX INFO: renamed from: d */
    public int f3509d = 0;

    /* JADX INFO: renamed from: f */
    public boolean f3511f = false;

    /* JADX INFO: renamed from: g */
    public final float[] f3512g = new float[9];

    /* JADX INFO: renamed from: h */
    public final float[] f3513h = new float[9];

    /* JADX INFO: renamed from: i */
    public C0983c[] f3514i = new C0983c[16];

    /* JADX INFO: renamed from: j */
    public int f3515j = 0;

    /* JADX INFO: renamed from: k */
    public int f3516k = 0;

    public C0989i(int i2) {
        this.f3517l = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m2373a(C0983c c0983c) {
        int i2 = 0;
        while (true) {
            int i3 = this.f3515j;
            if (i2 >= i3) {
                C0983c[] c0983cArr = this.f3514i;
                if (i3 >= c0983cArr.length) {
                    this.f3514i = (C0983c[]) Arrays.copyOf(c0983cArr, c0983cArr.length * 2);
                }
                C0983c[] c0983cArr2 = this.f3514i;
                int i4 = this.f3515j;
                c0983cArr2[i4] = c0983c;
                this.f3515j = i4 + 1;
                return;
            }
            if (this.f3514i[i2] == c0983c) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2374b(C0983c c0983c) {
        int i2 = this.f3515j;
        int i3 = 0;
        while (i3 < i2) {
            if (this.f3514i[i3] == c0983c) {
                while (i3 < i2 - 1) {
                    C0983c[] c0983cArr = this.f3514i;
                    int i4 = i3 + 1;
                    c0983cArr[i3] = c0983cArr[i4];
                    i3 = i4;
                }
                this.f3515j--;
                return;
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2375c() {
        this.f3517l = 5;
        this.f3509d = 0;
        this.f3507b = -1;
        this.f3508c = -1;
        this.f3510e = 0.0f;
        this.f3511f = false;
        int i2 = this.f3515j;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f3514i[i3] = null;
        }
        this.f3515j = 0;
        this.f3516k = 0;
        this.f3506a = false;
        Arrays.fill(this.f3513h, 0.0f);
    }

    /* JADX INFO: renamed from: d */
    public final void m2376d(C0983c c0983c) {
        int i2 = this.f3515j;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f3514i[i3].mo2351h(c0983c, false);
        }
        this.f3515j = 0;
    }

    public final String toString() {
        return "" + this.f3507b;
    }
}
