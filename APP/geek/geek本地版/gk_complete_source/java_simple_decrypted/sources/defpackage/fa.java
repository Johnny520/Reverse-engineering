package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fa {
    public long a;
    public fa b;

    public fa() {
        this.a = 0;
    }

    public final void a(int r5) {
        if (r5 < 64) goto L8;
        fa r1 = this.b;
        if (r1 == null) goto L10;
        r1.a(r5 - 64);
        return;
    L10:
        return;
    L8:
        this.a &= ~(1 << r5);
    }

    public final int b(int r7) {
        fa r0 = this.b;
        if (r0 != null) goto L9;
        if (r7 < 64) goto L8;
        return Long.bitCount(this.a);
    L8:
        return Long.bitCount(this.a & ((1 << r7) - 1));
    L9:
        if (r7 < 64) goto L11;
        int r72 = r0.b(r7 - 64);
        return Long.bitCount(this.a) + r72;
    L11:
        return Long.bitCount(this.a & ((1 << r7) - 1));
    }

    public final void c() {
        if (this.b != null) goto L6;
        this.b = new fa();
        return;
    }

    public final boolean d(int r5) {
        if (r5 < 64) goto L7;
        c();
        return this.b.d(r5 - 64);
    L7:
        if ((this.a & (1 << r5)) == 0) goto L10;
        return true;
    L10:
        return false;
    }

    public final void e(int r10, boolean r11) {
        if (r10 < 64) goto L6;
        c();
        this.b.e(r10 - 64, r11);
        return;
    L6:
        long r0 = this.a;
        if ((Long.MIN_VALUE & r0) == 0) goto L9;
        boolean r2 = true;
    L10:
        long r7 = (1 << r10) - 1;
        this.a = ((r0 & (~r7)) << 1) | (r0 & r7);
        if (r11 == false) goto L13;
        h(r10);
    L14:
        if (r2 == false) goto L16;
    L19:
        c();
        this.b.e(0, r2);
        return;
    L16:
        if (this.b != null) goto L19;
        return;
    L13:
        a(r10);
        goto L14
    L9:
        r2 = false;
        goto L10
    }

    public final boolean f(int r11) {
        if (r11 < 64) goto L6;
        c();
        return this.b.f(r11 - 64);
    L6:
        long r2 = 1 << r11;
        long r4 = this.a;
        if ((r4 & r2) == 0) goto L9;
        boolean r112 = true;
    L10:
        long r42 = r4 & (~r2);
        this.a = r42;
        long r22 = r2 - 1;
        this.a = (r42 & r22) | Long.rotateRight((~r22) & r42, 1);
        fa r0 = this.b;
        if (r0 != null) goto L13;
    L16:
        return r112;
    L13:
        if (r0.d(0) == false) goto L15;
        h(63);
    L15:
        this.b.f(0);
        goto L16
    L9:
        r112 = false;
        goto L10
    }

    public final void g() {
        this.a = 0;
        fa r0 = this.b;
        if (r0 == null) goto L6;
        r0.g();
        return;
    }

    public final void h(int r5) {
        if (r5 < 64) goto L6;
        c();
        this.b.h(r5 - 64);
        return;
    L6:
        this.a |= 1 << r5;
    }

    public final String toString() {
        if (this.b != null) goto L7;
        return Long.toBinaryString(this.a);
    L7:
        return this.b.toString() + "xx" + Long.toBinaryString(this.a);
    }
}
