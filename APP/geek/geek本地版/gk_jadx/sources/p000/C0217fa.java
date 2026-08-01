package p000;

/* JADX INFO: renamed from: fa */
/* JADX INFO: loaded from: classes.dex */
public final class C0217fa {

    /* JADX INFO: renamed from: a */
    public long f1915a = 0;

    /* JADX INFO: renamed from: b */
    public C0217fa f1916b;

    /* JADX INFO: renamed from: a */
    public final void m1144a(int i) {
        if (i < 64) {
            this.f1915a &= ~(1 << i);
            return;
        }
        C0217fa c0217fa = this.f1916b;
        if (c0217fa != null) {
            c0217fa.m1144a(i - 64);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m1145b(int i) {
        C0217fa c0217fa = this.f1916b;
        if (c0217fa == null) {
            return i >= 64 ? Long.bitCount(this.f1915a) : Long.bitCount(this.f1915a & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f1915a & ((1 << i) - 1));
        }
        return Long.bitCount(this.f1915a) + c0217fa.m1145b(i - 64);
    }

    /* JADX INFO: renamed from: c */
    public final void m1146c() {
        if (this.f1916b == null) {
            this.f1916b = new C0217fa();
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1147d(int i) {
        if (i < 64) {
            return (this.f1915a & (1 << i)) != 0;
        }
        m1146c();
        return this.f1916b.m1147d(i - 64);
    }

    /* JADX INFO: renamed from: e */
    public final void m1148e(int i, boolean z) {
        if (i >= 64) {
            m1146c();
            this.f1916b.m1148e(i - 64, z);
            return;
        }
        long j = this.f1915a;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f1915a = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            m1151h(i);
        } else {
            m1144a(i);
        }
        if (z2 || this.f1916b != null) {
            m1146c();
            this.f1916b.m1148e(0, z2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1149f(int i) {
        if (i >= 64) {
            m1146c();
            return this.f1916b.m1149f(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f1915a;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.f1915a = j3;
        long j4 = j - 1;
        this.f1915a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        C0217fa c0217fa = this.f1916b;
        if (c0217fa != null) {
            if (c0217fa.m1147d(0)) {
                m1151h(63);
            }
            this.f1916b.m1149f(0);
        }
        return z;
    }

    /* JADX INFO: renamed from: g */
    public final void m1150g() {
        this.f1915a = 0L;
        C0217fa c0217fa = this.f1916b;
        if (c0217fa != null) {
            c0217fa.m1150g();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m1151h(int i) {
        if (i < 64) {
            this.f1915a |= 1 << i;
        } else {
            m1146c();
            this.f1916b.m1151h(i - 64);
        }
    }

    public final String toString() {
        if (this.f1916b == null) {
            return Long.toBinaryString(this.f1915a);
        }
        return this.f1916b.toString() + "xx" + Long.toBinaryString(this.f1915a);
    }
}
