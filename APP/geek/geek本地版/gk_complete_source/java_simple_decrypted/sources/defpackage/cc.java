package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class cc {
    public HashSet a;
    public final pc b;
    public final int c;
    public cc d;
    public int e;
    public int f;
    public a40 g;

    public cc(pc r2, int r3) {
        this.a = null;
        this.e = 0;
        this.f = -1;
        this.b = r2;
        this.c = r3;
    }

    public final void a(cc r3, int r4) {
        b(r3, r4, -1, false);
    }

    public final boolean b(cc r3, int r4, int r5, boolean r6) {
        if (r3 != null) goto L7;
        h();
        return true;
    L7:
        if (r6 == false) goto L9;
    L11:
        this.d = r3;
        if (r3.a != null) goto L14;
        r3.a = new HashSet();
    L14:
        this.d.a.add(this);
        if (r4 <= 0) goto L17;
        this.e = r4;
    L18:
        this.f = r5;
        return true;
    L17:
        this.e = 0;
        goto L18
    L9:
        if (g(r3) == true) goto L11;
        return false;
    }

    public final int c() {
        if (this.b.V != 8) goto L6;
        return 0;
    L6:
        int r0 = this.f;
        if (r0 <= (-1)) goto L14;
        cc r2 = this.d;
        if (r2 == null) goto L14;
        if (r2.b.V != 8) goto L14;
        return r0;
    L14:
        return this.e;
    }

    public final cc d() {
        int r0 = this.c;
        int r1 = z30.t(r0);
        pc r2 = this.b;
        switch(r1) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L11;
            case 3: goto L9;
            case 4: goto L7;
            case 5: goto L14;
            case 6: goto L14;
            case 7: goto L14;
            case 8: goto L14;
            default: goto L5;
        };
    L14:
        return null;
    L5:
        throw new AssertionError(z30.s(r0));
    L7:
        return r2.y;
    L9:
        return r2.x;
    L11:
        return r2.A;
    L13:
        return r2.z;
    }

    public final boolean e() {
        HashSet r0 = this.a;
        if (r0 != null) goto L5;
        return false;
    L5:
        Iterator r02 = r0.iterator();
    L7:
        if (r02.hasNext() == false) goto L12;
        if (((cc) r02.next()).d().f() == false) goto L7;
        return true;
    L12:
        return false;
    }

    public final boolean f() {
        if (this.d == null) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean g(cc r9) {
        if (r9 == null) goto L47;
        pc r1 = r9.b;
        int r92 = r9.c;
        int r3 = this.c;
        if (r92 != r3) goto L14;
        if (r3 == 6) goto L9;
    L45:
        return true;
    L9:
        if (r1.w == false) goto L47;
        if (this.b.w == true) goto L45;
    L14:
        switch(z30.t(r3)) {
            case 0: goto L47;
            case 1: goto L35;
            case 2: goto L22;
            case 3: goto L35;
            case 4: goto L22;
            case 5: goto L47;
            case 6: goto L17;
            case 7: goto L47;
            case 8: goto L47;
            default: goto L16;
        };
    L17:
        if (r92 == 6) goto L47;
        if (r92 == 8) goto L47;
        if (r92 == 9) goto L47;
    L16:
        throw new AssertionError(z30.s(r3));
    L22:
        if (r92 != 3) goto L24;
    L27:
        boolean r2 = true;
    L29:
        if ((r1 instanceof go) == false) goto L33;
        if (r2 == true) goto L45;
        if (r92 != 9) goto L47;
    L33:
        return r2;
    L24:
        if (r92 == 5) goto L27;
        r2 = false;
        goto L29
    L35:
        if (r92 != 2) goto L37;
    L40:
        boolean r22 = true;
    L42:
        if ((r1 instanceof go) == false) goto L46;
        if (r22 == true) goto L45;
        if (r92 != 8) goto L47;
    L46:
        return r22;
    L37:
        if (r92 == 4) goto L40;
        r22 = false;
    L47:
        return false;
    }

    public final void h() {
        cc r0 = this.d;
        if (r0 == null) goto L7;
        HashSet r02 = r0.a;
        if (r02 == null) goto L7;
        r02.remove(this);
    L7:
        this.d = null;
        this.e = 0;
        this.f = -1;
    }

    public final void i() {
        a40 r0 = this.g;
        if (r0 != null) goto L6;
        this.g = new a40(1);
        return;
    L6:
        r0.c();
    }

    public final String toString() {
        return this.b.W + ":" + z30.s(this.c);
    }
}
