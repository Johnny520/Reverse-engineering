package p037U;

/* JADX INFO: renamed from: U.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0366b {

    /* JADX INFO: renamed from: a */
    public long f775a;

    /* JADX INFO: renamed from: b */
    public C0366b f776b;

    public C0366b() {
        this.f775a = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m937a(int r5) {
        if (r5 < 64) goto L7;
        C0366b r1 = this.f776b;
        if (r1 == null) goto L9;
        r1.m937a(r5 - 64);
        return;
    L9:
        return;
    L7:
        this.f775a &= ~(1 << r5);
    }

    /* JADX INFO: renamed from: b */
    public final int m938b(int r7) {
        C0366b r02 = this.f776b;
        if (r02 != null) goto L9;
        if (r7 < 64) goto L8;
        return Long.bitCount(this.f775a);
    L8:
        return Long.bitCount(this.f775a & ((1 << r7) - 1));
    L9:
        if (r7 < 64) goto L11;
        int r72 = r02.m938b(r7 - 64);
        return Long.bitCount(this.f775a) + r72;
    L11:
        return Long.bitCount(this.f775a & ((1 << r7) - 1));
    }

    /* JADX INFO: renamed from: c */
    public final void m939c() {
        if (this.f776b != null) goto L6;
        this.f776b = new C0366b();
        return;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m940d(int r5) {
        if (r5 < 64) goto L7;
        m939c();
        return this.f776b.m940d(r5 - 64);
    L7:
        if ((this.f775a & (1 << r5)) == 0) goto L9;
        return true;
    L9:
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m941e(int r10, boolean r11) {
        if (r10 < 64) goto L5;
        m939c();
        this.f776b.m941e(r10 - 64, r11);
        return;
    L5:
        long r02 = this.f775a;
        if ((Long.MIN_VALUE & r02) == 0) goto L8;
        boolean r2 = true;
    L9:
        long r7 = (1 << r10) - 1;
        this.f775a = ((r02 & (~r7)) << 1) | (r02 & r7);
        if (r11 == false) goto L12;
        m944h(r10);
    L13:
        if (r2 == false) goto L15;
    L16:
        m939c();
        this.f776b.m941e(0, r2);
        return;
    L15:
        if (this.f776b != null) goto L16;
        return;
    L12:
        m937a(r10);
        goto L13
    L8:
        r2 = false;
        goto L9
    }

    /* JADX INFO: renamed from: f */
    public final boolean m942f(int r11) {
        if (r11 < 64) goto L6;
        m939c();
        return this.f776b.m942f(r11 - 64);
    L6:
        long r2 = 1 << r11;
        long r4 = this.f775a;
        if ((r4 & r2) == 0) goto L9;
        boolean r112 = true;
    L10:
        long r42 = r4 & (~r2);
        this.f775a = r42;
        long r22 = r2 - 1;
        this.f775a = (r42 & r22) | Long.rotateRight((~r22) & r42, 1);
        C0366b r02 = this.f776b;
        if (r02 != null) goto L13;
    L16:
        return r112;
    L13:
        if (r02.m940d(0) == false) goto L15;
        m944h(63);
    L15:
        this.f776b.m942f(0);
        goto L16
    L9:
        r112 = false;
        goto L10
    }

    /* JADX INFO: renamed from: g */
    public final void m943g() {
        this.f775a = 0;
        C0366b r02 = this.f776b;
        if (r02 == null) goto L6;
        r02.m943g();
        return;
    }

    /* JADX INFO: renamed from: h */
    public final void m944h(int r5) {
        if (r5 < 64) goto L5;
        m939c();
        this.f776b.m944h(r5 - 64);
        return;
    L5:
        this.f775a |= 1 << r5;
    }

    public final String toString() {
        if (this.f776b != null) goto L6;
        return Long.toBinaryString(this.f775a);
    L6:
        return this.f776b.toString() + "xx" + Long.toBinaryString(this.f775a);
    }
}
