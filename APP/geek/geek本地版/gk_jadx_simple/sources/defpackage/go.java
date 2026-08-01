package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class go extends pc {
    public float d0;
    public int e0;
    public int f0;
    public cc g0;
    public int h0;

    public go() {
        this.d0 = -1.0f;
        this.e0 = -1;
        this.f0 = -1;
        this.g0 = this.y;
        int r0 = 0;
        this.h0 = 0;
        this.G.clear();
        this.G.add(this.g0);
        int r1 = this.F.length;
    L3:
        if (r0 >= r1) goto L5;
        this.F[r0] = this.g0;
        r0 = r0 + 1;
        goto L3
    }

    @Override // defpackage.pc
    public final void A(ar r4) {
        if (this.I != null) goto L5;
        return;
    L5:
        cc r0 = this.g0;
        r4.getClass();
        int r42 = ar.m(r0);
        if (this.h0 != 1) goto L9;
        this.N = r42;
        this.O = 0;
        v(this.I.i());
        y(0);
        return;
    L9:
        this.N = 0;
        this.O = r42;
        y(this.I.l());
        v(0);
    }

    public final void B(int r4) {
        if (this.h0 == r4) goto L12;
        this.h0 = r4;
        ArrayList r42 = this.G;
        r42.clear();
        if (this.h0 != 1) goto L8;
        this.g0 = this.x;
    L9:
        r42.add(this.g0);
        cc[] r43 = this.F;
        int r0 = r43.length;
        int r1 = 0;
    L10:
        if (r1 >= r0) goto L14;
        r43[r1] = this.g0;
        r1 = r1 + 1;
        goto L10
    L14:
        return;
    L8:
        this.g0 = this.y;
        goto L9
    }

    @Override // defpackage.pc
    public final void a(ar r10) {
        qc r0 = (qc) this.I;
        if (r0 == null) goto L39;
        cc r2 = r0.g(2);
        cc r3 = r0.g(4);
        pc r4 = this.I;
        boolean r5 = true;
        if (r4 != null) goto L8;
    L10:
        boolean r42 = false;
    L12:
        if (this.h0 != 0) goto L21;
        r2 = r0.g(3);
        r3 = r0.g(5);
        pc r02 = this.I;
        if (r02 != null) goto L16;
    L18:
        r5 = false;
    L19:
        r42 = r5;
        goto L21
    L16:
        if (r02.c0[1] != 2) goto L18;
    L21:
        if (this.e0 == (-1)) goto L27;
        a40 r03 = r10.j(this.g0);
        r10.e(r03, r10.j(r2), this.e0, 8);
        if (r42 == false) goto L36;
        r10.f(r10.j(r3), r03, 0, 5);
        return;
    L36:
        return;
    L27:
        if (this.f0 == (-1)) goto L33;
        a40 r04 = r10.j(this.g0);
        a40 r32 = r10.j(r3);
        r10.e(r04, r32, -this.f0, 8);
        if (r42 == false) goto L37;
        r10.f(r04, r10.j(r2), 0, 5);
        r10.f(r32, r04, 0, 5);
        return;
    L37:
        return;
    L33:
        if (this.d0 == (-1.0f)) goto L38;
        a40 r05 = r10.j(this.g0);
        a40 r22 = r10.j(r3);
        float r33 = this.d0;
        p6 r43 = r10.k();
        r43.d.i(r05, -1.0f);
        r43.d.i(r22, r33);
        r10.c(r43);
        return;
    L38:
        return;
    L8:
        if (r4.c0[0] != 2) goto L10;
        r42 = true;
        goto L12
    }

    @Override // defpackage.pc
    public final boolean b() {
        return true;
    }

    @Override // defpackage.pc
    public final cc g(int r3) {
        switch(z30.t(r3)) {
            case 0: goto L15;
            case 1: goto L10;
            case 2: goto L6;
            case 3: goto L10;
            case 4: goto L6;
            case 5: goto L15;
            case 6: goto L15;
            case 7: goto L15;
            case 8: goto L15;
            default: goto L14;
        };
    L15:
        return null;
    L6:
        if (this.h0 != 0) goto L14;
        return this.g0;
    L10:
        if (this.h0 != 1) goto L14;
        return this.g0;
    L14:
        throw new AssertionError(z30.s(r3));
    }
}
