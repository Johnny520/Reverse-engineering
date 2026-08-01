package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e7 extends oo {
    public int f0;
    public boolean g0;
    public int h0;

    @Override // defpackage.pc
    public final void a(ar r17) {
        cc[] r2 = this.F;
        cc r4 = this.x;
        r2[0] = r4;
        int r5 = 2;
        cc r6 = this.y;
        r2[2] = r6;
        cc r8 = this.z;
        r2[1] = r8;
        cc r10 = this.A;
        r2[3] = r10;
        int r11 = 0;
    L4:
        if (r11 >= r2.length) goto L6;
        cc r12 = r2[r11];
        r12.g = r17.j(r12);
        r11 = r11 + 1;
        goto L4
    L6:
        int r112 = this.f0;
        if (r112 >= 0) goto L9;
        return;
    L9:
        if (r112 >= 4) goto L118;
        cc r22 = r2[r112];
        int r113 = 0;
    L12:
        if (r113 >= this.e0) goto L38;
        pc r13 = this.d0[r113];
        if (this.g0 == false) goto L16;
    L18:
        int r14 = this.f0;
        if (r14 == 0) goto L22;
        if (r14 == 1) goto L22;
    L28:
        if (r14 == 2) goto L31;
        if (r14 == 3) goto L31;
    L37:
        r113 = r113 + 1;
    L31:
        if (r13.c0[1] != 3) goto L37;
        if (r13.y.d == null) goto L37;
        if (r13.A.d == null) goto L37;
    L27:
        boolean r114 = true;
    L40:
        if (r4.e() == false) goto L42;
    L45:
        boolean r132 = true;
    L47:
        if (r6.e() == false) goto L49;
    L52:
        boolean r142 = true;
    L53:
        if (r114 == true) goto L64;
        int r115 = this.f0;
        if (r115 != 0) goto L57;
        if (r132 == false) goto L57;
    L63:
        boolean r116 = true;
    L65:
        if (r116 == true) goto L67;
        int r117 = 4;
    L68:
        int r133 = 0;
    L70:
        if (r133 >= this.e0) goto L89;
        pc r143 = this.d0[r133];
        if (this.g0 == false) goto L74;
    L76:
        a40 r9 = r17.j(r143.F[this.f0]);
        cc[] r144 = r143.F;
        int r15 = this.f0;
        cc r145 = r144[r15];
        r145.g = r9;
        cc r7 = r145.d;
        if (r7 != null) goto L79;
    L81:
        int r72 = 0;
    L82:
        if (r15 == 0) goto L86;
        if (r15 == r5) goto L86;
        a40 r146 = r22.g;
        int r152 = this.h0 + r72;
        p6 r52 = r17.k();
        a40 r122 = r17.l();
        r122.d = 0;
        r52.b(r146, r9, r122, r152);
        r17.c(r52);
    L87:
        r17.e(r22.g, r9, this.h0 + r72, r117);
    L88:
        r133 = r133 + 1;
        r5 = 2;
    L86:
        a40 r53 = r22.g;
        int r123 = this.h0 - r72;
        p6 r147 = r17.k();
        a40 r153 = r17.l();
        r153.d = 0;
        r147.c(r53, r9, r153, r123);
        r17.c(r147);
        goto L87
    L79:
        if (r7.b != this) goto L81;
        r72 = r145.e;
        goto L82
    L74:
        if (r143.b() == true) goto L76;
    L89:
        int r23 = this.f0;
        if (r23 != 0) goto L94;
        r17.e(r8.g, r4.g, 0, 8);
        r17.e(r4.g, this.I.z.g, 0, 4);
        r17.e(r4.g, this.I.x.g, 0, 0);
        return;
    L94:
        if (r23 != 1) goto L98;
        r17.e(r4.g, r8.g, 0, 8);
        r17.e(r4.g, this.I.x.g, 0, 4);
        r17.e(r4.g, this.I.z.g, 0, 0);
        return;
    L98:
        if (r23 != 2) goto L102;
        r17.e(r10.g, r6.g, 0, 8);
        r17.e(r6.g, this.I.A.g, 0, 4);
        r17.e(r6.g, this.I.y.g, 0, 0);
        return;
    L102:
        if (r23 != 3) goto L119;
        r17.e(r6.g, r10.g, 0, 8);
        r17.e(r6.g, this.I.y.g, 0, 4);
        r17.e(r6.g, this.I.A.g, 0, 0);
        return;
    L119:
        return;
    L67:
        r117 = 5;
    L57:
        if (r115 != 2) goto L59;
        if (r142 == true) goto L63;
    L59:
        if (r115 != 1) goto L61;
        if (r132 == true) goto L63;
    L61:
        if (r115 != 3) goto L64;
        if (r142 == true) goto L63;
    L64:
        r116 = false;
        goto L65
    L49:
        if (r10.e() == true) goto L52;
        r142 = false;
        goto L53
    L42:
        if (r8.e() == true) goto L45;
        r132 = false;
    L22:
        if (r13.c0[0] != 3) goto L28;
        if (r13.x.d == null) goto L28;
        if (r13.z.d == null) goto L28;
    L16:
        if (r13.b() == true) goto L18;
    L38:
        r114 = false;
        goto L40
    }

    @Override // defpackage.pc
    public final boolean b() {
        return true;
    }

    @Override // defpackage.pc
    public final String toString() {
        String r0 = z30.l(new StringBuilder("[Barrier] "), this.W, " {");
        int r1 = 0;
    L4:
        if (r1 >= this.e0) goto L10;
        pc r2 = this.d0[r1];
        if (r1 <= 0) goto L8;
        r0 = z30.i(r0, ", ");
    L8:
        r0 = r0 + r2.W;
        r1 = r1 + 1;
        goto L4
    L10:
        return z30.i(r0, "}");
    }
}
