package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m90 extends qb0 {
    public jg k;
    public j7 l;

    @Override // defpackage.hg
    public final void a(hg r11) {
        if (z30.t(this.j) == 3) goto L81;
        sg r112 = this.e;
        if (r112.c == true) goto L7;
    L32:
        jg r2 = this.h;
        boolean r5 = r2.c;
        ArrayList r6 = r2.l;
        if (r5 == false) goto L83;
        jg r52 = this.i;
        boolean r7 = r52.c;
        ArrayList r8 = r52.l;
        if (r7 == true) goto L38;
        return;
    L38:
        if (r2.j == false) goto L45;
        if (r52.j == false) goto L45;
        if (r112.j == false) goto L45;
        return;
    L45:
        if (r112.j == true) goto L55;
        if (this.d != 3) goto L55;
        pc r72 = this.b;
        if (r72.j != 0) goto L55;
        if (r72.r() == true) goto L55;
        jg r0 = (jg) r6.get(0);
        jg r1 = (jg) r8.get(0);
        int r02 = r0.g + r2.f;
        int r12 = r1.g + r52.f;
        r2.d(r02);
        r52.d(r12);
        r112.d(r12 - r02);
        return;
    L55:
        if (r112.j == true) goto L69;
        if (this.d != 3) goto L69;
        if (this.a != 1) goto L69;
        if (r6.size() <= 0) goto L69;
        if (r8.size() <= 0) goto L69;
        jg r03 = (jg) r6.get(0);
        jg r13 = (jg) r8.get(0);
        int r14 = (r13.g + r52.f) - (r03.g + r2.f);
        int r04 = r112.m;
        if (r14 >= r04) goto L67;
        r112.d(r14);
        goto L69
    L67:
        r112.d(r04);
    L69:
        if (r112.j == true) goto L72;
        return;
    L72:
        if (r6.size() > 0) goto L74;
        return;
    L74:
        if (r8.size() <= 0) goto L85;
        jg r05 = (jg) r6.get(0);
        jg r15 = (jg) r8.get(0);
        int r4 = r05.g;
        int r62 = r2.f + r4;
        int r73 = r15.g;
        int r82 = r52.f + r73;
        float r9 = this.b.T;
        if (r05 != r15) goto L78;
        r9 = 0.5f;
    L79:
        r2.d((int) ((((r73 - r4) - r112.g) * r9) + (r4 + 0.5f)));
        r52.d(r2.g + r112.g);
        return;
    L78:
        r4 = r62;
        r73 = r82;
        goto L79
    L85:
        return;
    L83:
        return;
    L7:
        if (r112.j == true) goto L32;
        if (this.d != 3) goto L32;
        pc r22 = this.b;
        int r53 = r22.k;
        if (r53 == 2) goto L27;
        if (r53 != 3) goto L32;
        sg r54 = r22.d.e;
        if (r54.j == false) goto L32;
        int r63 = r22.M;
        if (r63 == (-1)) goto L25;
        if (r63 == 0) goto L24;
        if (r63 == 1) goto L21;
        int r23 = 0;
    L26:
        r112.d(r23);
        goto L32
    L21:
        float r55 = r54.g;
        float r24 = r22.L;
    L22:
        float r56 = r55 / r24;
    L23:
        r23 = (int) (r56 + 0.5f);
        goto L26
    L24:
        r56 = r54.g * r22.L;
        goto L23
    L25:
        r55 = r54.g;
        r24 = r22.L;
        goto L22
    L27:
        pc r57 = r22.I;
        if (r57 == null) goto L32;
        if (r57.e.e.j == false) goto L32;
        r112.d((int) ((r5.g * r22.r) + 0.5f));
        goto L32
    L81:
        pc r113 = this.b;
        l(r113.y, r113.A, 1);
    }

    @Override // defpackage.qb0
    public final void d() {
        jg r0 = this.k;
        pc r1 = this.b;
        boolean r2 = r1.a;
        sg r3 = this.e;
        if (r2 == false) goto L5;
        r3.d(r1.i());
    L5:
        boolean r12 = r3.j;
        ArrayList r22 = r3.k;
        ArrayList r4 = r3.l;
        jg r8 = this.i;
        jg r9 = this.h;
        if (r12 == true) goto L22;
        pc r13 = this.b;
        this.d = r13.c0[1];
        if (r13.w == false) goto L10;
        this.l = new j7(this);
    L10:
        int r14 = this.d;
        if (r14 == 3) goto L29;
        if (r14 != 4) goto L19;
        pc r10 = this.b.I;
        if (r10 == null) goto L19;
        m90 r11 = r10.e;
        if (r10.c0[1] != 1) goto L19;
        int r02 = (r10.i() - this.b.y.c()) - this.b.A.c();
        qb0.b(r9, r11.h, this.b.y.c());
        qb0.b(r8, r11.i, -this.b.A.c());
        r3.d(r02);
        return;
    L19:
        if (r14 != 1) goto L29;
        r3.d(this.b.i());
    L29:
        boolean r15 = r3.j;
        if (r15 == false) goto L83;
        pc r122 = this.b;
        if (r122.a == false) goto L83;
        cc[] r16 = r122.F;
        cc r23 = r16[2];
        cc r42 = r23.d;
        if (r42 != null) goto L36;
    L51:
        if (r42 == null) goto L58;
        jg r17 = qb0.h(r23);
        if (r17 == null) goto L157;
        qb0.b(r9, r17, this.b.F[2].c());
        qb0.b(r8, r9, r3.g);
        pc r18 = this.b;
        if (r18.w == false) goto L158;
        qb0.b(r0, r9, r18.P);
        return;
    L158:
        return;
    L157:
        return;
    L58:
        cc r24 = r16[3];
        if (r24.d == null) goto L67;
        jg r19 = qb0.h(r24);
        if (r19 == null) goto L63;
        qb0.b(r8, r19, -this.b.F[3].c());
        qb0.b(r9, r8, -r3.g);
    L63:
        pc r110 = this.b;
        if (r110.w == false) goto L159;
        qb0.b(r0, r9, r110.P);
        return;
    L159:
        return;
    L67:
        cc r111 = r16[4];
        if (r111.d == null) goto L74;
        jg r112 = qb0.h(r111);
        if (r112 == null) goto L160;
        qb0.b(r0, r112, 0);
        qb0.b(r9, r0, -this.b.P);
        qb0.b(r8, r9, r3.g);
        return;
    L160:
        return;
    L74:
        if ((r122 instanceof oo) == false) goto L76;
        return;
    L76:
        if (r122.I != null) goto L78;
        return;
    L78:
        if (r122.g(7).d != null) goto L163;
        pc r113 = this.b;
        qb0.b(r9, r113.I.e.h, r113.n());
        qb0.b(r8, r9, r3.g);
        pc r114 = this.b;
        if (r114.w == false) goto L164;
        qb0.b(r0, r9, r114.P);
        return;
    L164:
        return;
    L163:
        return;
    L36:
        if (r16[3].d == null) goto L51;
        if (r122.r() == false) goto L40;
        r9.f = this.b.F[2].c();
        r8.f = -this.b.F[3].c();
    L47:
        pc r115 = this.b;
        if (r115.w == false) goto L156;
        qb0.b(r0, r9, r115.P);
        return;
    L156:
        return;
    L40:
        jg r116 = qb0.h(this.b.F[2]);
        if (r116 == null) goto L43;
        qb0.b(r9, r116, this.b.F[2].c());
    L43:
        jg r117 = qb0.h(this.b.F[3]);
        if (r117 == null) goto L46;
        qb0.b(r8, r117, -this.b.F[3].c());
    L46:
        r9.b = true;
        r8.b = true;
    L83:
        if (r15 == false) goto L85;
    L100:
        r3.b(this);
    L101:
        pc r118 = this.b;
        cc[] r25 = r118.F;
        cc r123 = r25[2];
        cc r132 = r123.d;
        if (r132 == null) goto L113;
        if (r25[3].d == null) goto L113;
        if (r118.r() == false) goto L108;
        r9.f = this.b.F[2].c();
        r8.f = -this.b.F[3].c();
    L110:
        if (this.b.w == false) goto L153;
        c(r0, r9, 1, this.l);
    L153:
        if (r4.size() != 0) goto L165;
        r3.c = true;
        return;
    L165:
        return;
    L108:
        jg r119 = qb0.h(this.b.F[2]);
        jg r26 = qb0.h(this.b.F[3]);
        r119.b(this);
        r26.b(this);
        this.j = 4;
    L113:
        if (r132 == null) goto L126;
        jg r120 = qb0.h(r123);
        if (r120 == null) goto L153;
        qb0.b(r9, r120, this.b.F[2].c());
        c(r8, r9, 1, r3);
        if (this.b.w == false) goto L120;
        c(r0, r9, 1, this.l);
    L120:
        if (this.d != 3) goto L153;
        pc r03 = this.b;
        if (r03.L <= 0.0f) goto L153;
        po r04 = r03.d;
        if (r04.d != 3) goto L153;
        r04.e.k.add(r3);
        r4.add(this.b.d.e);
        r3.a = this;
        goto L153
    L126:
        cc r1110 = r25[3];
        if (r1110.d == null) goto L133;
        jg r121 = qb0.h(r1110);
        if (r121 == null) goto L153;
        qb0.b(r8, r121, -this.b.F[3].c());
        c(r9, r8, -1, r3);
        if (this.b.w == false) goto L153;
        c(r0, r9, 1, this.l);
        goto L153
    L133:
        cc r27 = r25[4];
        if (r27.d == null) goto L139;
        jg r124 = qb0.h(r27);
        if (r124 == null) goto L153;
        qb0.b(r0, r124, 0);
        c(r9, r0, -1, this.l);
        c(r8, r9, 1, r3);
        goto L153
    L139:
        if ((r118 instanceof oo) == true) goto L153;
        pc r28 = r118.I;
        if (r28 == null) goto L153;
        qb0.b(r9, r28.e.h, r118.n());
        c(r8, r9, 1, r3);
        if (this.b.w == false) goto L146;
        c(r0, r9, 1, this.l);
    L146:
        if (this.d != 3) goto L153;
        pc r05 = this.b;
        if (r05.L <= 0.0f) goto L153;
        po r06 = r05.d;
        if (r06.d != 3) goto L153;
        r06.e.k.add(r3);
        r4.add(this.b.d.e);
        r3.a = this;
        goto L153
    L85:
        if (this.d != 3) goto L100;
        pc r125 = this.b;
        int r126 = r125.k;
        if (r126 == 2) goto L96;
        if (r126 != 3) goto L101;
        if (r125.r() == true) goto L101;
        pc r127 = this.b;
        if (r127.j == 3) goto L101;
        sg r128 = r127.d.e;
        r4.add(r128);
        r128.k.add(r3);
        r3.b = true;
        r22.add(r9);
        r22.add(r8);
        goto L101
    L96:
        pc r129 = r125.I;
        if (r129 == null) goto L101;
        sg r130 = r129.e.e;
        r4.add(r130);
        r130.k.add(r3);
        r3.b = true;
        r22.add(r9);
        r22.add(r8);
        goto L101
    L22:
        if (this.d != 4) goto L29;
        pc r131 = this.b;
        pc r102 = r131.I;
        if (r102 == null) goto L29;
        m90 r1111 = r102.e;
        if (r102.c0[1] != 1) goto L29;
        qb0.b(r9, r1111.h, r131.y.c());
        qb0.b(r8, r1111.i, -this.b.A.c());
    }

    @Override // defpackage.qb0
    public final void e() {
        jg r0 = this.h;
        if (r0.j == false) goto L6;
        pc r1 = this.b;
        r1.O = r0.g;
        return;
    }

    @Override // defpackage.qb0
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.qb0
    public final boolean k() {
        if (this.d == 3) goto L5;
        return true;
    L5:
        if (this.b.k == 0) goto L11;
        return false;
    L11:
        return true;
    }

    public final void m() {
        this.g = false;
        jg r1 = this.h;
        r1.c();
        r1.j = false;
        jg r12 = this.i;
        r12.c();
        r12.j = false;
        jg r13 = this.k;
        r13.c();
        r13.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.W;
    }
}
