package p000;

/* JADX INFO: renamed from: na */
/* JADX INFO: loaded from: classes.dex */
public final class C0515na {

    /* JADX INFO: renamed from: a */
    public long f3253a = 0;

    /* JADX INFO: renamed from: b */
    public C0515na f3254b;

    /* JADX INFO: renamed from: a */
    public final void m1929a(int i) {
        if (i < 64) {
            this.f3253a &= ~(1 << i);
            return;
        }
        C0515na c0515na = this.f3254b;
        if (c0515na != null) {
            c0515na.m1929a(i - 64);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m1930b(int i) {
        C0515na c0515na = this.f3254b;
        if (c0515na == null) {
            return i >= 64 ? Long.bitCount(this.f3253a) : Long.bitCount(this.f3253a & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f3253a & ((1 << i) - 1));
        }
        return Long.bitCount(this.f3253a) + c0515na.m1930b(i - 64);
    }

    /* JADX INFO: renamed from: c */
    public final void m1931c() {
        if (this.f3254b == null) {
            this.f3254b = new C0515na();
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1932d(int i) {
        if (i < 64) {
            return (this.f3253a & (1 << i)) != 0;
        }
        m1931c();
        return this.f3254b.m1932d(i - 64);
    }

    /* JADX INFO: renamed from: e */
    public final void m1933e(int i, boolean z) {
        if (i >= 64) {
            m1931c();
            this.f3254b.m1933e(i - 64, z);
            return;
        }
        long j = this.f3253a;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f3253a = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            m1936h(i);
        } else {
            m1929a(i);
        }
        if (z2 || this.f3254b != null) {
            m1931c();
            this.f3254b.m1933e(0, z2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1934f(int i) {
        if (i >= 64) {
            m1931c();
            return this.f3254b.m1934f(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f3253a;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.f3253a = j3;
        long j4 = j - 1;
        this.f3253a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        C0515na c0515na = this.f3254b;
        if (c0515na != null) {
            if (c0515na.m1932d(0)) {
                m1936h(63);
            }
            this.f3254b.m1934f(0);
        }
        return z;
    }

    /* JADX INFO: renamed from: g */
    public final void m1935g() {
        this.f3253a = 0L;
        C0515na c0515na = this.f3254b;
        if (c0515na != null) {
            c0515na.m1935g();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m1936h(int i) {
        if (i < 64) {
            this.f3253a |= 1 << i;
        } else {
            m1931c();
            this.f3254b.m1936h(i - 64);
        }
    }

    public final String toString() {
        if (this.f3254b == null) {
            return Long.toBinaryString(this.f3253a);
        }
        return this.f3254b.toString() + "xx" + Long.toBinaryString(this.f3253a);
    }
}
