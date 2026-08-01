package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class uq {
    public ai a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public uq() {
        d();
    }

    public final void a() {
        if (this.d == false) goto L5;
        int r0 = this.a.g();
    L6:
        this.c = r0;
        return;
    L5:
        r0 = this.a.k();
        goto L6
    }

    public final void b(View r4, int r5) {
        if (this.d == false) goto L9;
        int r42 = this.a.b(r4);
        ai r0 = this.a;
        if (Integer.MIN_VALUE != r0.a) goto L7;
        int r02 = 0;
    L8:
        this.c = r02 + r42;
    L10:
        this.b = r5;
        return;
    L7:
        r02 = r0.l() - r0.a;
        goto L8
    L9:
        this.c = this.a.e(r4);
        goto L10
    }

    public final void c(View r5, int r6) {
        ai r0 = this.a;
        if (Integer.MIN_VALUE != r0.a) goto L5;
        int r1 = 0;
    L6:
        if (r1 < 0) goto L9;
        b(r5, r6);
        return;
    L9:
        this.b = r6;
        if (this.d == false) goto L17;
        int r62 = (this.a.g() - r1) - this.a.b(r5);
        this.c = this.a.g() - r62;
        if (r62 <= 0) goto L23;
        int r12 = this.c - this.a.c(r5);
        int r02 = this.a.k();
        int r13 = r12 - (Math.min(this.a.e(r5) - r02, 0) + r02);
        if (r13 >= 0) goto L24;
        this.c = Math.min(r62, -r13) + this.c;
        return;
    L24:
        return;
    L23:
        return;
    L17:
        int r63 = this.a.e(r5);
        int r03 = r63 - this.a.k();
        this.c = r63;
        if (r03 <= 0) goto L25;
        int r52 = (this.a.g() - Math.min(0, (this.a.g() - r1) - this.a.b(r5))) - (this.a.c(r5) + r63);
        if (r52 >= 0) goto L26;
        this.c -= Math.min(r03, -r52);
        return;
    L26:
        return;
    L25:
        return;
    L5:
        r1 = r0.l() - r0.a;
        goto L6
    }

    public final void d() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
    }
}
