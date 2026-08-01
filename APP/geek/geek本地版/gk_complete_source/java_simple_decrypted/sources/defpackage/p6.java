package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class p6 {
    public a40 a;
    public float b;
    public ArrayList c;
    public o6 d;
    public boolean e;

    public p6(a8 r2) {
        this.a = null;
        this.b = 0.0f;
        this.c = new ArrayList();
        this.e = false;
        this.d = new l6(this, r2);
    }

    public final void a(ar r4, int r5) {
        this.d.i(r4.i(r5), 1.0f);
        this.d.i(r4.i(r5), -1.0f);
    }

    public final void b(a40 r3, a40 r4, a40 r5, int r6) {
        boolean r0 = false;
        if (r6 == 0) goto L8;
        if (r6 >= 0) goto L6;
        r6 = r6 * (-1);
        r0 = true;
    L6:
        this.b = r6;
    L8:
        if (r0 == true) goto L11;
        this.d.i(r3, -1.0f);
        this.d.i(r4, 1.0f);
        this.d.i(r5, 1.0f);
        return;
    L11:
        this.d.i(r3, 1.0f);
        this.d.i(r4, -1.0f);
        this.d.i(r5, -1.0f);
    }

    public final void c(a40 r3, a40 r4, a40 r5, int r6) {
        boolean r0 = false;
        if (r6 == 0) goto L8;
        if (r6 >= 0) goto L6;
        r6 = r6 * (-1);
        r0 = true;
    L6:
        this.b = r6;
    L8:
        if (r0 == true) goto L11;
        this.d.i(r3, -1.0f);
        this.d.i(r4, 1.0f);
        this.d.i(r5, -1.0f);
        return;
    L11:
        this.d.i(r3, 1.0f);
        this.d.i(r4, -1.0f);
        this.d.i(r5, 1.0f);
    }

    public a40 d(boolean[] r2) {
        return e(r2, null);
    }

    public final a40 e(boolean[] r10, a40 r11) {
        int r0 = this.d.k();
        a40 r2 = null;
        int r3 = 0;
        float r4 = 0.0f;
    L3:
        if (r3 >= r0) goto L19;
        float r5 = this.d.a(r3);
        if (r5 >= 0.0f) goto L18;
        a40 r6 = this.d.e(r3);
        if (r10 != null) goto L9;
    L10:
        if (r6 == r11) goto L18;
        int r7 = r6.l;
        if (r7 == 3) goto L16;
        if (r7 != 4) goto L18;
    L16:
        if (r5 >= r4) goto L18;
        r4 = r5;
        r2 = r6;
        goto L18
    L9:
        if (r10[r6.b] == false) goto L10;
    L18:
        r3 = r3 + 1;
        goto L3
    L19:
        return r2;
    }

    public final void f(a40 r4) {
        a40 r0 = this.a;
        if (r0 == null) goto L5;
        this.d.i(r0, -1.0f);
        this.a = null;
    L5:
        float r02 = this.d.d(r4, true) * (-1.0f);
        this.a = r4;
        if (r02 != 1.0f) goto L8;
        return;
    L8:
        this.b /= r02;
        this.d.h(r02);
    }

    public final void g(a40 r4, boolean r5) {
        if (r4.f == false) goto L10;
        float r0 = this.d.b(r4);
        float r1 = this.b;
        this.b = (r4.e * r0) + r1;
        this.d.d(r4, r5);
        if (r5 == false) goto L9;
        r4.b(this);
        return;
    L9:
        return;
    }

    public void h(p6 r4, boolean r5) {
        float r0 = this.d.g(r4, r5);
        float r1 = this.b;
        this.b = (r4.b * r0) + r1;
        if (r5 == false) goto L6;
        r4.a.b(this);
        return;
    }

    public String toString() {
        if (this.a != null) goto L5;
        String r0 = "0";
    L6:
        String r02 = z30.i(r0, " = ");
        int r3 = 0;
        if (this.b == 0.0f) goto L9;
        r02 = r02 + this.b;
        boolean r1 = true;
    L10:
        int r5 = this.d.k();
    L11:
        if (r3 >= r5) goto L33;
        a40 r6 = this.d.e(r3);
        if (r6 == null) goto L32;
        float r7 = this.d.a(r3);
        if (r7 == 0.0f) goto L32;
        String r62 = r6.toString();
        if (r1 == false) goto L21;
        if (r7 <= 0.0f) goto L26;
        r02 = z30.i(r02, " + ");
    L28:
        if (r7 != 1.0f) goto L30;
        r02 = z30.i(r02, r62);
    L31:
        r1 = true;
        goto L32
    L30:
        r02 = r02 + r7 + " " + r62;
        goto L31
    L26:
        r02 = z30.i(r02, " - ");
    L23:
        r7 = r7 * (-1.0f);
        goto L28
    L21:
        if (r7 >= 0.0f) goto L28;
        r02 = z30.i(r02, "- ");
    L32:
        r3 = r3 + 1;
        goto L11
    L33:
        if (r1 == false) goto L35;
        return r02;
    L35:
        return z30.i(r02, "0.0");
    L9:
        r1 = false;
        goto L10
    L5:
        r0 = "" + this.a;
        goto L6
    }
}
