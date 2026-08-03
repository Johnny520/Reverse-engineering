package p000;

/* JADX INFO: renamed from: j9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2088j9 {

    /* JADX INFO: renamed from: a */
    public long f7355a = 0;

    /* JADX INFO: renamed from: b */
    public C2088j9 f7356b;

    /* JADX INFO: renamed from: a */
    public final void m4253a(int i) {
        if (i < 64) {
            this.f7355a &= ~(1 << i);
            return;
        }
        C2088j9 c2088j9 = this.f7356b;
        if (c2088j9 != null) {
            c2088j9.m4253a(i - 64);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m4254b(int i) {
        C2088j9 c2088j9 = this.f7356b;
        if (c2088j9 == null) {
            return i >= 64 ? Long.bitCount(this.f7355a) : Long.bitCount(this.f7355a & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f7355a & ((1 << i) - 1));
        }
        return Long.bitCount(this.f7355a) + c2088j9.m4254b(i - 64);
    }

    /* JADX INFO: renamed from: c */
    public final void m4255c() {
        if (this.f7356b == null) {
            this.f7356b = new C2088j9();
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4256d(int i) {
        if (i < 64) {
            return (this.f7355a & (1 << i)) != 0;
        }
        m4255c();
        return this.f7356b.m4256d(i - 64);
    }

    /* JADX INFO: renamed from: e */
    public final void m4257e(int i, boolean z) {
        if (i >= 64) {
            m4255c();
            this.f7356b.m4257e(i - 64, z);
            return;
        }
        long j = this.f7355a;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f7355a = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            m4260h(i);
        } else {
            m4253a(i);
        }
        if (z2 || this.f7356b != null) {
            m4255c();
            this.f7356b.m4257e(0, z2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4258f(int i) {
        if (i >= 64) {
            m4255c();
            return this.f7356b.m4258f(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f7355a;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.f7355a = j3;
        long j4 = j - 1;
        this.f7355a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        C2088j9 c2088j9 = this.f7356b;
        if (c2088j9 != null) {
            if (c2088j9.m4256d(0)) {
                m4260h(63);
            }
            this.f7356b.m4258f(0);
        }
        return z;
    }

    /* JADX INFO: renamed from: g */
    public final void m4259g() {
        this.f7355a = 0L;
        C2088j9 c2088j9 = this.f7356b;
        if (c2088j9 != null) {
            c2088j9.m4259g();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m4260h(int i) {
        if (i < 64) {
            this.f7355a |= 1 << i;
        } else {
            m4255c();
            this.f7356b.m4260h(i - 64);
        }
    }

    public final String toString() {
        if (this.f7356b == null) {
            return Long.toBinaryString(this.f7355a);
        }
        return this.f7356b.toString() + "xx" + Long.toBinaryString(this.f7355a);
    }
}
