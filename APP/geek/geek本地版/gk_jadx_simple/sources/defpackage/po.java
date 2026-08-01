package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class po extends qb0 {
    public static final int[] k = null;

    static {
        k = new int[2];
    }

    public static void m(int[] r2, int r3, int r4, int r5, int r6, float r7, int r8) {
        int r42 = r4 - r3;
        int r62 = r6 - r5;
        if (r8 == (-1)) goto L11;
        if (r8 == 0) goto L9;
        if (r8 != 1) goto L19;
        r2[0] = r42;
        r2[1] = (int) ((r42 * r7) + 0.5f);
        return;
    L19:
        return;
    L9:
        r2[0] = (int) ((r62 * r7) + 0.5f);
        r2[1] = r62;
        return;
    L11:
        int r32 = (int) ((r62 * r7) + 0.5f);
        int r72 = (int) ((r42 / r7) + 0.5f);
        if (r32 > r42) goto L15;
        r2[0] = r32;
        r2[1] = r62;
        return;
    L15:
        if (r72 > r62) goto L18;
        r2[0] = r42;
        r2[1] = r72;
        return;
    }

    @Override // defpackage.hg
    public final void a(hg r24) {
        if (z30.t(this.j) == 3) goto L170;
        sg r1 = this.e;
        boolean r4 = r1.j;
        jg r7 = this.h;
        jg r8 = this.i;
        if (r4 == false) goto L7;
    L11:
        float r242 = 0.5f;
    L125:
        boolean r42 = r7.c;
        ArrayList r5 = r7.l;
        if (r42 == false) goto L179;
        boolean r43 = r8.c;
        ArrayList r9 = r8.l;
        if (r43 == true) goto L131;
        return;
    L131:
        if (r7.j == false) goto L138;
        if (r8.j == false) goto L138;
        if (r1.j == false) goto L138;
        return;
    L138:
        if (r1.j == true) goto L148;
        if (this.d != 3) goto L148;
        pc r44 = this.b;
        if (r44.j != 0) goto L148;
        if (r44.q() == true) goto L148;
        jg r2 = (jg) r5.get(0);
        jg r3 = (jg) r9.get(0);
        int r22 = r2.g + r7.f;
        int r32 = r3.g + r8.f;
        r7.d(r22);
        r8.d(r32);
        r1.d(r32 - r22);
        return;
    L148:
        if (r1.j == true) goto L162;
        if (this.d != 3) goto L162;
        if (this.a != 1) goto L162;
        if (r5.size() <= 0) goto L162;
        if (r9.size() <= 0) goto L162;
        jg r23 = (jg) r5.get(0);
        jg r45 = (jg) r9.get(0);
        int r25 = Math.min((r45.g + r8.f) - (r23.g + r7.f), r1.m);
        pc r46 = this.b;
        int r6 = r46.n;
        int r26 = Math.max(r46.m, r25);
        if (r6 <= 0) goto L160;
        r26 = Math.min(r6, r26);
    L160:
        r1.d(r26);
    L162:
        if (r1.j == false) goto L187;
        jg r27 = (jg) r5.get(0);
        jg r33 = (jg) r9.get(0);
        int r47 = r27.g;
        int r52 = r7.f + r47;
        int r62 = r33.g;
        int r92 = r8.f + r62;
        float r10 = this.b.S;
        if (r27 != r33) goto L167;
        r10 = r242;
    L168:
        r7.d((int) ((((r62 - r47) - r1.g) * r10) + (r47 + r242)));
        r8.d(r7.g + r1.g);
        return;
    L167:
        r47 = r52;
        r62 = r92;
        goto L168
    L187:
        return;
    L179:
        return;
    L7:
        if (this.d != 3) goto L11;
        pc r48 = this.b;
        int r93 = r48.j;
        m90 r102 = r48.e;
        if (r93 == 2) goto L120;
        if (r93 != 3) goto L11;
        int r94 = r48.k;
        if (r94 == 0) goto L27;
        if (r94 == 3) goto L27;
        int r95 = r48.M;
        if (r95 == (-1)) goto L25;
        if (r95 == 0) goto L24;
        if (r95 == 1) goto L21;
        int r49 = 0;
    L26:
        r1.d(r49);
        goto L11
    L21:
        float r96 = r102.e.g;
        float r410 = r48.L;
    L22:
        float r97 = r96 * r410;
    L23:
        r49 = (int) (r97 + 0.5f);
        goto L26
    L24:
        r97 = r102.e.g / r48.L;
        goto L23
    L25:
        r96 = r102.e.g;
        r410 = r48.L;
    L27:
        jg r98 = r102.h;
        jg r103 = r102.i;
        if (r48.x.d == null) goto L30;
        boolean r12 = true;
    L32:
        if (r48.y.d == null) goto L34;
        boolean r13 = true;
    L36:
        if (r48.z.d == null) goto L38;
        boolean r14 = true;
    L40:
        if (r48.A.d == null) goto L43;
        boolean r15 = true;
    L42:
        r242 = 0.5f;
        int r53 = r48.M;
        if (r12 == false) goto L80;
        if (r13 == false) goto L80;
        if (r14 == false) goto L80;
        if (r15 == false) goto L80;
        float r411 = r48.L;
        boolean r11 = r98.j;
        ArrayList r122 = r98.l;
        int[] r16 = k;
        if (r11 == false) goto L61;
        if (r103.j == false) goto L61;
        if (r7.c == true) goto L56;
        return;
    L56:
        if (r8.c == false) goto L180;
        m(r16, ((jg) r7.l.get(0)).g + r7.f, ((jg) r8.l.get(0)).g - r8.f, r98.g + r98.f, r103.g - r103.f, r411, r53);
        r1.d(r16[0]);
        this.b.e.e.d(r16[1]);
        return;
    L180:
        return;
    L61:
        if (r7.j == false) goto L71;
        if (r8.j == false) goto L71;
        if (r98.c == true) goto L67;
        return;
    L67:
        if (r103.c == false) goto L181;
        m(r16, r7.g + r7.f, r8.g - r8.f, ((jg) r122.get(0)).g + r98.f, ((jg) r103.l.get(0)).g - r103.f, r411, r53);
        r1.d(r16[0]);
        this.b.e.e.d(r16[1]);
        goto L71
    L181:
        return;
    L71:
        if (r7.c == true) goto L73;
        return;
    L73:
        if (r8.c == true) goto L75;
        return;
    L75:
        if (r98.c == true) goto L77;
        return;
    L77:
        if (r103.c == false) goto L182;
        m(r16, ((jg) r7.l.get(0)).g + r7.f, ((jg) r8.l.get(0)).g - r8.f, ((jg) r122.get(0)).g + r98.f, ((jg) r103.l.get(0)).g - r103.f, r411, r53);
        r1.d(r16[0]);
        this.b.e.e.d(r16[1]);
        goto L125
    L182:
        return;
    L80:
        if (r12 == false) goto L100;
        if (r14 == false) goto L100;
        if (r7.c == true) goto L85;
        return;
    L85:
        if (r8.c == false) goto L183;
        float r412 = r48.L;
        int r99 = ((jg) r7.l.get(0)).g + r7.f;
        int r104 = ((jg) r8.l.get(0)).g - r8.f;
        if (r53 == (-1)) goto L96;
        if (r53 == 0) goto L96;
        if (r53 != 1) goto L125;
        int r54 = g(r104 - r99, 0);
        int r910 = (int) ((r54 / r412) + 0.5f);
        int r105 = g(r910, 1);
        if (r910 == r105) goto L95;
        r54 = (int) ((r105 * r412) + 0.5f);
    L95:
        r1.d(r54);
        this.b.e.e.d(r105);
    L96:
        int r55 = g(r104 - r99, 0);
        int r911 = (int) ((r55 * r412) + 0.5f);
        int r106 = g(r911, 1);
        if (r911 == r106) goto L99;
        r55 = (int) ((r106 / r412) + 0.5f);
    L99:
        r1.d(r55);
        this.b.e.e.d(r106);
        goto L125
    L183:
        return;
    L100:
        if (r13 == false) goto L125;
        if (r15 == false) goto L125;
        if (r98.c == true) goto L105;
        return;
    L105:
        if (r103.c == false) goto L184;
        float r413 = r48.L;
        int r123 = ((jg) r98.l.get(0)).g + r98.f;
        int r912 = ((jg) r103.l.get(0)).g - r103.f;
        if (r53 == (-1)) goto L116;
        if (r53 == 0) goto L112;
        if (r53 == 1) goto L116;
    L112:
        int r56 = g(r912 - r123, 1);
        int r913 = (int) ((r56 * r413) + 0.5f);
        int r107 = g(r913, 0);
        if (r913 == r107) goto L115;
        r56 = (int) ((r107 / r413) + 0.5f);
    L115:
        r1.d(r107);
        this.b.e.e.d(r56);
    L116:
        int r57 = g(r912 - r123, 1);
        int r914 = (int) ((r57 / r413) + 0.5f);
        int r108 = g(r914, 0);
        if (r914 == r108) goto L119;
        r57 = (int) ((r108 * r413) + 0.5f);
    L119:
        r1.d(r108);
        this.b.e.e.d(r57);
        goto L125
    L184:
        return;
    L43:
        r15 = false;
        goto L42
    L38:
        r14 = false;
        goto L40
    L34:
        r13 = false;
        goto L36
    L30:
        r12 = false;
        goto L32
    L120:
        r242 = 0.5f;
        pc r58 = r48.I;
        if (r58 == null) goto L125;
        if (r58.d.e.j == false) goto L125;
        r1.d((int) ((r5.g * r48.o) + 0.5f));
        goto L125
    L170:
        pc r17 = this.b;
        l(r17.x, r17.z, 0);
    }

    @Override // defpackage.qb0
    public final void d() {
        pc r0 = this.b;
        boolean r1 = r0.a;
        sg r2 = this.e;
        if (r1 == false) goto L5;
        r2.d(r0.l());
    L5:
        boolean r02 = r2.j;
        ArrayList r12 = r2.k;
        ArrayList r3 = r2.l;
        jg r8 = this.i;
        jg r9 = this.h;
        if (r02 == true) goto L21;
        pc r03 = this.b;
        int r10 = r03.c0[0];
        this.d = r10;
        if (r10 == 3) goto L31;
        if (r10 != 4) goto L18;
        pc r11 = r03.I;
        if (r11 == null) goto L15;
        if (r11.c0[0] != 1) goto L15;
    L16:
        int r04 = r11.l();
        po r13 = r11.d;
        int r05 = (r04 - this.b.x.c()) - this.b.z.c();
        qb0.b(r9, r13.h, this.b.x.c());
        qb0.b(r8, r13.i, -this.b.z.c());
        r2.d(r05);
        return;
    L15:
        if (r11.c0[0] == 4) goto L16;
    L18:
        if (r10 != 1) goto L31;
        r2.d(r03.l());
    L31:
        if (r2.j == false) goto L70;
        pc r06 = this.b;
        if (r06.a == false) goto L70;
        cc[] r14 = r06.F;
        cc r32 = r14[0];
        cc r4 = r32.d;
        if (r4 != null) goto L37;
    L50:
        if (r4 == null) goto L55;
        jg r07 = qb0.h(r32);
        if (r07 == null) goto L116;
        qb0.b(r9, r07, this.b.F[0].c());
        qb0.b(r8, r9, r2.g);
        return;
    L116:
        return;
    L55:
        cc r15 = r14[1];
        if (r15.d == null) goto L62;
        jg r08 = qb0.h(r15);
        if (r08 == null) goto L117;
        qb0.b(r8, r08, -this.b.F[1].c());
        qb0.b(r9, r8, -r2.g);
        return;
    L117:
        return;
    L62:
        if ((r06 instanceof oo) == false) goto L64;
        return;
    L64:
        if (r06.I != null) goto L66;
        return;
    L66:
        if (r06.g(7).d != null) goto L120;
        pc r09 = this.b;
        qb0.b(r9, r09.I.d.h, r09.m());
        qb0.b(r8, r9, r2.g);
        return;
    L120:
        return;
    L37:
        if (r14[1].d == null) goto L50;
        if (r06.q() == false) goto L42;
        r9.f = this.b.F[0].c();
        r8.f = -this.b.F[1].c();
        return;
    L42:
        jg r010 = qb0.h(this.b.F[0]);
        if (r010 == null) goto L45;
        qb0.b(r9, r010, this.b.F[0].c());
    L45:
        jg r011 = qb0.h(this.b.F[1]);
        if (r011 == null) goto L48;
        qb0.b(r8, r011, -this.b.F[1].c());
    L48:
        r9.b = true;
        r8.b = true;
        return;
    L70:
        if (this.d != 3) goto L89;
        pc r012 = this.b;
        int r102 = r012.j;
        m90 r112 = r012.e;
        if (r102 == 2) goto L85;
        if (r102 != 3) goto L89;
        if (r012.k != 3) goto L84;
        r9.a = this;
        r8.a = this;
        r112.h.a = this;
        r112.i.a = this;
        r2.a = this;
        if (r012.r() == false) goto L81;
        r3.add(this.b.e.e);
        this.b.e.e.k.add(r2);
        m90 r013 = this.b.e;
        r013.e.a = this;
        r3.add(r013.h);
        r3.add(this.b.e.i);
        this.b.e.h.k.add(r2);
        this.b.e.i.k.add(r2);
        goto L89
    L81:
        if (this.b.q() == false) goto L83;
        this.b.e.e.l.add(r2);
        r12.add(this.b.e.e);
        goto L89
    L83:
        this.b.e.e.l.add(r2);
        goto L89
    L84:
        sg r014 = r112.e;
        r3.add(r014);
        r014.k.add(r2);
        this.b.e.h.k.add(r2);
        this.b.e.i.k.add(r2);
        r2.b = true;
        r12.add(r9);
        r12.add(r8);
        r9.l.add(r2);
        r8.l.add(r2);
        goto L89
    L85:
        pc r015 = r012.I;
        if (r015 == null) goto L89;
        sg r016 = r015.e.e;
        r3.add(r016);
        r016.k.add(r2);
        r2.b = true;
        r12.add(r9);
        r12.add(r8);
    L89:
        pc r017 = this.b;
        cc[] r16 = r017.F;
        cc r33 = r16[0];
        cc r42 = r33.d;
        if (r42 != null) goto L92;
    L99:
        if (r42 == null) goto L104;
        jg r018 = qb0.h(r33);
        if (r018 == null) goto L121;
        qb0.b(r9, r018, this.b.F[0].c());
        c(r8, r9, 1, r2);
        return;
    L121:
        return;
    L104:
        cc r17 = r16[1];
        if (r17.d == null) goto L111;
        jg r019 = qb0.h(r17);
        if (r019 == null) goto L122;
        qb0.b(r8, r019, -this.b.F[1].c());
        c(r9, r8, -1, r2);
        return;
    L122:
        return;
    L111:
        if ((r017 instanceof oo) == true) goto L123;
        pc r18 = r017.I;
        if (r18 == null) goto L124;
        qb0.b(r9, r18.d.h, r017.m());
        c(r8, r9, 1, r2);
        return;
    L124:
        return;
    L123:
        return;
    L92:
        if (r16[1].d == null) goto L99;
        if (r017.q() == false) goto L97;
        r9.f = this.b.F[0].c();
        r8.f = -this.b.F[1].c();
        return;
    L97:
        jg r020 = qb0.h(this.b.F[0]);
        jg r19 = qb0.h(this.b.F[1]);
        r020.b(this);
        r19.b(this);
        this.j = 4;
        return;
    L21:
        if (this.d != 4) goto L31;
        pc r021 = this.b;
        pc r103 = r021.I;
        if (r103 == null) goto L27;
        if (r103.c0[0] != 1) goto L27;
    L28:
        qb0.b(r9, r103.d.h, r021.x.c());
        qb0.b(r8, r103.d.i, -this.b.z.c());
        return;
    L27:
        if (r103.c0[0] != 4) goto L31;
        goto L28
    }

    @Override // defpackage.qb0
    public final void e() {
        jg r0 = this.h;
        if (r0.j == false) goto L6;
        pc r1 = this.b;
        r1.N = r0.g;
        return;
    }

    @Override // defpackage.qb0
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.qb0
    public final boolean k() {
        if (this.d == 3) goto L5;
        return true;
    L5:
        if (this.b.j == 0) goto L11;
        return false;
    L11:
        return true;
    }

    public final void n() {
        this.g = false;
        jg r1 = this.h;
        r1.c();
        r1.j = false;
        jg r12 = this.i;
        r12.c();
        r12.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.W;
    }
}
