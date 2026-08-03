package p000;

/* JADX INFO: renamed from: j9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2088j9 {

    /* JADX INFO: renamed from: a */
    public long f7355a;

    /* JADX INFO: renamed from: b */
    public C2088j9 f7356b;

    public C2088j9() {
        this.f7355a = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m4253a(int r5) {
        if (r5 < 64) goto L8;
        C2088j9 r1 = this.f7356b;
        if (r1 == null) goto L10;
        r1.m4253a(r5 - 64);
        return;
    L10:
        return;
    L8:
        this.f7355a &= ~(1 << r5);
    }

    /* JADX INFO: renamed from: b */
    public final int m4254b(int r7) {
        C2088j9 r0 = this.f7356b;
        if (r0 != null) goto L9;
        if (r7 < 64) goto L8;
        return Long.bitCount(this.f7355a);
    L8:
        return Long.bitCount(this.f7355a & ((1 << r7) - 1));
    L9:
        if (r7 < 64) goto L11;
        int r72 = r0.m4254b(r7 - 64);
        return Long.bitCount(this.f7355a) + r72;
    L11:
        return Long.bitCount(this.f7355a & ((1 << r7) - 1));
    }

    /* JADX INFO: renamed from: c */
    public final void m4255c() {
        if (this.f7356b != null) goto L6;
        this.f7356b = new C2088j9();
        return;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4256d(int r5) {
        if (r5 < 64) goto L7;
        m4255c();
        return this.f7356b.m4256d(r5 - 64);
    L7:
        if ((this.f7355a & (1 << r5)) == 0) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m4257e(int r10, boolean r11) {
        if (r10 < 64) goto L6;
        m4255c();
        this.f7356b.m4257e(r10 - 64, r11);
        return;
    L6:
        long r0 = this.f7355a;
        if ((Long.MIN_VALUE & r0) == 0) goto L9;
        boolean r2 = true;
    L10:
        long r7 = (1 << r10) - 1;
        this.f7355a = ((r0 & (~r7)) << 1) | (r0 & r7);
        if (r11 == false) goto L13;
        m4260h(r10);
    L14:
        if (r2 == false) goto L16;
    L19:
        m4255c();
        this.f7356b.m4257e(0, r2);
        return;
    L16:
        if (this.f7356b != null) goto L19;
        return;
    L13:
        m4253a(r10);
        goto L14
    L9:
        r2 = false;
        goto L10
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4258f(int r11) {
        if (r11 < 64) goto L6;
        m4255c();
        return this.f7356b.m4258f(r11 - 64);
    L6:
        long r2 = 1 << r11;
        long r4 = this.f7355a;
        if ((r4 & r2) == 0) goto L9;
        boolean r112 = true;
    L10:
        long r42 = r4 & (~r2);
        this.f7355a = r42;
        long r22 = r2 - 1;
        this.f7355a = (r42 & r22) | Long.rotateRight((~r22) & r42, 1);
        C2088j9 r0 = this.f7356b;
        if (r0 != null) goto L13;
    L16:
        return r112;
    L13:
        if (r0.m4256d(0) == false) goto L15;
        m4260h(63);
    L15:
        this.f7356b.m4258f(0);
        goto L16
    L9:
        r112 = false;
        goto L10
    }

    /* JADX INFO: renamed from: g */
    public final void m4259g() {
        this.f7355a = 0;
        C2088j9 r0 = this.f7356b;
        if (r0 == null) goto L6;
        r0.m4259g();
        return;
    }

    /* JADX INFO: renamed from: h */
    public final void m4260h(int r5) {
        if (r5 < 64) goto L6;
        m4255c();
        this.f7356b.m4260h(r5 - 64);
        return;
    L6:
        this.f7355a |= 1 << r5;
    }

    public final String toString() {
        if (this.f7356b != null) goto L7;
        return Long.toBinaryString(this.f7355a);
    L7:
        return this.f7356b.toString() + "xx" + Long.toBinaryString(this.f7355a);
    }
}
