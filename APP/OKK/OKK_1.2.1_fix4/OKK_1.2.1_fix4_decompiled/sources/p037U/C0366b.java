package p037U;

/* JADX INFO: renamed from: U.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0366b {

    /* JADX INFO: renamed from: a */
    public long f775a = 0;

    /* JADX INFO: renamed from: b */
    public C0366b f776b;

    /* JADX INFO: renamed from: a */
    public final void m937a(int i2) {
        if (i2 < 64) {
            this.f775a &= ~(1 << i2);
            return;
        }
        C0366b c0366b = this.f776b;
        if (c0366b != null) {
            c0366b.m937a(i2 - 64);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m938b(int i2) {
        C0366b c0366b = this.f776b;
        if (c0366b == null) {
            return i2 >= 64 ? Long.bitCount(this.f775a) : Long.bitCount(this.f775a & ((1 << i2) - 1));
        }
        if (i2 < 64) {
            return Long.bitCount(this.f775a & ((1 << i2) - 1));
        }
        return Long.bitCount(this.f775a) + c0366b.m938b(i2 - 64);
    }

    /* JADX INFO: renamed from: c */
    public final void m939c() {
        if (this.f776b == null) {
            this.f776b = new C0366b();
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m940d(int i2) {
        if (i2 < 64) {
            return (this.f775a & (1 << i2)) != 0;
        }
        m939c();
        return this.f776b.m940d(i2 - 64);
    }

    /* JADX INFO: renamed from: e */
    public final void m941e(int i2, boolean z2) {
        if (i2 >= 64) {
            m939c();
            this.f776b.m941e(i2 - 64, z2);
            return;
        }
        long j2 = this.f775a;
        boolean z3 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i2) - 1;
        this.f775a = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            m944h(i2);
        } else {
            m937a(i2);
        }
        if (z3 || this.f776b != null) {
            m939c();
            this.f776b.m941e(0, z3);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m942f(int i2) {
        if (i2 >= 64) {
            m939c();
            return this.f776b.m942f(i2 - 64);
        }
        long j2 = 1 << i2;
        long j3 = this.f775a;
        boolean z2 = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.f775a = j4;
        long j5 = j2 - 1;
        this.f775a = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        C0366b c0366b = this.f776b;
        if (c0366b != null) {
            if (c0366b.m940d(0)) {
                m944h(63);
            }
            this.f776b.m942f(0);
        }
        return z2;
    }

    /* JADX INFO: renamed from: g */
    public final void m943g() {
        this.f775a = 0L;
        C0366b c0366b = this.f776b;
        if (c0366b != null) {
            c0366b.m943g();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m944h(int i2) {
        if (i2 < 64) {
            this.f775a |= 1 << i2;
        } else {
            m939c();
            this.f776b.m944h(i2 - 64);
        }
    }

    public final String toString() {
        if (this.f776b == null) {
            return Long.toBinaryString(this.f775a);
        }
        return this.f776b.toString() + "xx" + Long.toBinaryString(this.f775a);
    }
}
