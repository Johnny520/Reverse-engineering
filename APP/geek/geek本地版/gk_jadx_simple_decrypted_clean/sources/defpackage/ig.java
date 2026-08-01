package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ig {
    public qc a;
    public boolean b;
    public boolean c;
    public qc d;
    public ArrayList e;
    public hc f;
    public k7 g;
    public ArrayList h;

    public final void a(jg r10, int r11, ArrayList r12, j10 r13) {
        qb0 r102 = r10.d;
        j10 r0 = r102.c;
        jg r1 = r102.i;
        jg r2 = r102.h;
        if (r0 != null) goto L42;
        qc r02 = this.a;
        if (r102 != r02.d) goto L7;
        return;
    L7:
        if (r102 == r02.e) goto L64;
        if (r13 != null) goto L11;
        r13 = new j10();
        r13.a = null;
        r13.b = new ArrayList();
        r13.a = r102;
        r12.add(r13);
    L11:
        r102.c = r13;
        r13.b.add(r102);
        ArrayList r03 = r2.k;
        int r3 = r03.size();
        int r4 = 0;
        int r5 = 0;
    L12:
        if (r5 >= r3) goto L16;
        Object r6 = r03.get(r5);
        r5 = r5 + 1;
        hg r62 = (hg) r6;
        if ((r62 instanceof jg) == false) goto L12;
        a((jg) r62, r11, r12, r13);
        goto L12
    L16:
        ArrayList r04 = r1.k;
        int r32 = r04.size();
        int r52 = 0;
    L17:
        if (r52 >= r32) goto L22;
        Object r63 = r04.get(r52);
        r52 = r52 + 1;
        hg r64 = (hg) r63;
        if ((r64 instanceof jg) == false) goto L17;
        a((jg) r64, r11, r12, r13);
        goto L17
    L22:
        if (r11 == 1) goto L24;
    L30:
        ArrayList r22 = r2.l;
        int r33 = r22.size();
        int r53 = 0;
    L31:
        if (r53 >= r33) goto L33;
        Object r65 = r22.get(r53);
        r53 = r53 + 1;
        a((jg) r65, r11, r12, r13);
        goto L31
    L33:
        ArrayList r14 = r1.l;
        int r23 = r14.size();
        int r34 = 0;
    L34:
        if (r34 >= r23) goto L36;
        Object r54 = r14.get(r34);
        r34 = r34 + 1;
        a((jg) r54, r11, r12, r13);
        goto L34
    L36:
        if (r11 == 1) goto L38;
        return;
    L38:
        if ((r102 instanceof m90) == false) goto L63;
        ArrayList r103 = ((m90) r102).k.l;
        int r05 = r103.size();
    L40:
        if (r4 >= r05) goto L65;
        Object r15 = r103.get(r4);
        r4 = r4 + 1;
        a((jg) r15, r11, r12, r13);
        goto L40
    L65:
        return;
    L63:
        return;
    L24:
        if ((r102 instanceof m90) == false) goto L30;
        ArrayList r35 = ((m90) r102).k.k;
        int r55 = r35.size();
        int r66 = 0;
    L26:
        if (r66 >= r55) goto L30;
        Object r7 = r35.get(r66);
        r66 = r66 + 1;
        hg r72 = (hg) r7;
        if ((r72 instanceof jg) == false) goto L26;
        a((jg) r72, r11, r12, r13);
        goto L26
    L64:
        return;
    }

    public final void b(qc r27) {
        ArrayList r1 = r27.d0;
        int[] r2 = r27.c0;
        int r3 = r1.size();
        char r4 = 0;
        int r5 = 0;
    L3:
        if (r5 >= r3) goto L159;
        Object r6 = r1.get(r5);
        r5 = r5 + 1;
        pc r12 = (pc) r6;
        int[] r62 = r12.c0;
        cc[] r7 = r12.F;
        cc r8 = r12.A;
        cc r9 = r12.y;
        cc r10 = r12.z;
        cc r11 = r12.x;
        m90 r13 = r12.e;
        po r14 = r12.d;
        int r15 = r62[r4];
        char r16 = r4;
        int r63 = r62[1];
        if (r12.V == 8) goto L6;
        float r0 = r12.o;
        if (r0 >= 1.0f) goto L11;
        if (r15 != 3) goto L11;
        r12.j = 2;
    L11:
        float r02 = r12.r;
        if (r02 >= 1.0f) goto L16;
        if (r63 != 3) goto L16;
        r12.k = 2;
    L16:
        if (r12.L > 0.0f) goto L18;
        int r03 = 3;
    L40:
        if (r15 != r03) goto L49;
        if (r12.j != 1) goto L49;
        if (r11.d != null) goto L46;
    L47:
        r15 = 2;
        goto L49
    L46:
        if (r10.d == null) goto L47;
    L49:
        if (r63 == 3) goto L51;
    L57:
        r14.d = r15;
        sg r04 = r14.e;
        int r42 = r12.j;
        r14.a = r42;
        r13.d = r63;
        sg r142 = r13.e;
        ArrayList r25 = r1;
        int r17 = r12.k;
        r13.a = r17;
        if (r15 == 4) goto L64;
        if (r15 == 1) goto L64;
        int r132 = 2;
        if (r15 == 2) goto L64;
    L71:
        if (r15 != 3) goto L101;
        if (r63 != r132) goto L74;
    L77:
        if (r42 != 3) goto L83;
        if (r63 != r132) goto L80;
        f(r132, 0, r132, 0, r12);
    L80:
        int r112 = r12.i();
        f(1, (int) ((r112 * r12.L) + 0.5f), 1, r112, r12);
        r04.d(r12.l());
        r142.d(r12.i());
        r12.a = true;
    L81:
        r4 = r16;
        r1 = r25;
        goto L3
    L83:
        if (r42 != 1) goto L86;
        f(r132, 0, r63, 0, r12);
        r04.m = r12.l();
        goto L81
    L86:
        if (r42 != 2) goto L96;
        int r82 = r2[r16];
        if (r82 != 1) goto L90;
    L95:
        f(1, (int) ((r27.l() * r0) + 0.5f), r63, r12.i(), r12);
        r04.d(r12.l());
        r142.d(r12.i());
        r12.a = true;
        goto L81
    L90:
        if (r82 == 4) goto L95;
        int r102 = r63;
        int r64 = 1;
    L93:
        int r83 = r132;
    L94:
        int r92 = 3;
    L102:
        if (r102 != r92) goto L106;
        if (r15 == r83) goto L108;
        if (r15 != r64) goto L106;
    L108:
        if (r17 != r92) goto L115;
        if (r15 != r83) goto L111;
        f(r83, 0, r83, 0, r12);
    L111:
        int r93 = r12.l();
        float r18 = r12.L;
        if (r12.M != (-1)) goto L114;
        r18 = 1.0f / r18;
    L114:
        int r84 = r64;
        f(r84, r93, r64, (int) ((r93 * r18) + 0.5f), r12);
        r04.d(r12.l());
        r142.d(r12.i());
        r12.a = true;
        goto L81
    L115:
        int r133 = r83;
        if (r17 != 1) goto L118;
        f(r15, 0, r133, 0, r12);
        r142.m = r12.i();
        goto L81
    L118:
        int r85 = r15;
        if (r17 != 2) goto L127;
        int r72 = r2[1];
        if (r72 != r64) goto L123;
    L126:
        f(r85, r12.l(), r64, (int) ((r27.i() * r02) + 0.5f), r12);
        r04.d(r12.l());
        r142.d(r12.i());
        r12.a = true;
        goto L81
    L123:
        if (r72 == 4) goto L126;
        r15 = r85;
        int r73 = r102;
        r92 = 3;
    L107:
        int r86 = r64;
        int r65 = 1;
    L134:
        if (r15 != r92) goto L81;
        if (r73 != r92) goto L81;
        if (r42 == r65) goto L149;
        if (r17 == r65) goto L149;
        if (r17 != 2) goto L81;
        if (r42 != 2) goto L81;
        int r19 = r2[r16];
        if (r19 == r86) goto L145;
        if (r19 != r86) goto L81;
    L145:
        int r110 = r2[r65];
        if (r110 == r86) goto L148;
        if (r110 != r86) goto L81;
    L148:
        f(r86, (int) ((r27.l() * r0) + 0.5f), r86, (int) ((r27.i() * r02) + 0.5f), r12);
        r04.d(r12.l());
        r142.d(r12.i());
        r12.a = true;
    L149:
        f(r133, 0, r133, 0, r12);
        r04.m = r12.l();
        r142.m = r12.i();
        goto L81
    L127:
        r15 = r85;
        r86 = r64;
        if (r7[2].d != null) goto L130;
    L133:
        f(r133, 0, r102, 0, r12);
        r04.d(r12.l());
        r142.d(r12.i());
        r12.a = true;
        goto L81
    L130:
        if (r7[3].d == null) goto L133;
        r73 = r102;
        r65 = 1;
        r92 = 3;
    L106:
        r133 = r83;
        r73 = r102;
        goto L107
    L96:
        r102 = r63;
        r64 = 1;
        if (r7[r16].d != null) goto L99;
    L100:
        f(r132, 0, r102, 0, r12);
        r04.d(r12.l());
        r142.d(r12.i());
        r12.a = true;
        goto L81
    L99:
        if (r7[1].d != null) goto L93;
    L74:
        if (r63 == 1) goto L77;
        r102 = r63;
        r64 = 1;
        r92 = 3;
        r83 = r132;
        goto L102
    L101:
        r102 = r63;
        r83 = r132;
        r64 = 1;
    L64:
        if (r63 != 4) goto L66;
    L69:
        int r74 = r63;
        int r24 = 1;
    L151:
        int r111 = r12.l();
        if (r15 != 4) goto L154;
        r111 = (r27.l() - r11.e) - r10.e;
        r15 = r24;
    L154:
        int r43 = r12.i();
        if (r74 != 4) goto L157;
        int r44 = (r27.i() - r9.e) - r8.e;
        int r103 = r24;
        ig r75 = this;
        int r94 = r111;
        int r113 = r44;
        int r87 = r15;
    L158:
        r75.f(r87, r94, r103, r113, r12);
        r04.d(r12.l());
        r142.d(r12.i());
        r12.a = true;
        goto L81
    L157:
        r103 = r74;
        r94 = r111;
        r113 = r43;
        r87 = r15;
        r75 = this;
        goto L158
    L66:
        if (r63 == 1) goto L150;
        r132 = 2;
        if (r63 != 2) goto L71;
    L150:
        r74 = r63;
        r24 = 1;
        goto L151
    L51:
        if (r12.k != 1) goto L57;
        if (r9.d != null) goto L55;
    L56:
        r63 = 2;
        goto L57
    L55:
        if (r8.d != null) goto L57;
    L18:
        if (r15 != 3) goto L25;
        int r45 = 2;
        if (r63 == 2) goto L22;
        if (r63 == 1) goto L22;
        r03 = 3;
    L26:
        if (r63 != r03) goto L31;
        if (r15 != r45) goto L29;
    L30:
        r12.k = r03;
        goto L40
    L29:
        if (r15 == 1) goto L30;
    L31:
        if (r15 != r03) goto L40;
        if (r63 != r03) goto L40;
        if (r12.j != 0) goto L37;
        r12.j = r03;
    L37:
        if (r12.k != 0) goto L40;
        r12.k = r03;
    L22:
        r03 = 3;
        r12.j = 3;
        goto L40
    L25:
        r03 = 3;
        r45 = 2;
        goto L26
    L6:
        r12.a = true;
        r4 = r16;
        goto L3
    }

    public final void c() {
        qc r0 = this.a;
        ArrayList r1 = this.h;
        ArrayList r2 = this.e;
        r2.clear();
        qc r3 = this.d;
        r3.d.f();
        m90 r4 = r3.e;
        r4.f();
        r2.add(r3.d);
        r2.add(r4);
        ArrayList r42 = r3.d0;
        int r5 = r42.size();
        HashSet r6 = null;
        int r8 = 0;
    L4:
        if (r8 >= r5) goto L29;
        Object r10 = r42.get(r8);
        r8 = r8 + 1;
        pc r102 = (pc) r10;
        if ((r102 instanceof go) == true) goto L7;
        if (r102.q() == true) goto L11;
        r2.add(r102.d);
    L18:
        if (r102.r() == true) goto L20;
        r2.add(r102.e);
    L27:
        if ((r102 instanceof oo) == false) goto L4;
        r2.add(new no(r102));
        goto L4
    L20:
        if (r102.c != null) goto L22;
        r102.c = new v8(r102, 1);
    L22:
        if (r6 != null) goto L24;
        r6 = new HashSet();
    L24:
        r6.add(r102.c);
        goto L27
    L11:
        if (r102.b != null) goto L13;
        r102.b = new v8(r102, 0);
    L13:
        if (r6 != null) goto L15;
        r6 = new HashSet();
    L15:
        r6.add(r102.b);
        goto L18
    L7:
        ho r9 = new ho(r102);
        r102.d.f();
        r102.e.f();
        r9.f = ((go) r102).h0;
        r2.add(r9);
        goto L4
    L29:
        if (r6 == null) goto L31;
        r2.addAll(r6);
    L31:
        int r43 = r2.size();
        int r52 = 0;
    L32:
        if (r52 >= r43) goto L34;
        Object r62 = r2.get(r52);
        r52 = r52 + 1;
        ((qb0) r62).f();
        goto L32
    L34:
        int r44 = r2.size();
        int r53 = 0;
    L35:
        if (r53 >= r44) goto L40;
        Object r63 = r2.get(r53);
        r53 = r53 + 1;
        qb0 r64 = (qb0) r63;
        if (r64.b == r3) goto L35;
        r64.d();
        goto L35
    L40:
        r1.clear();
        e(r0.d, 0, r1);
        e(r0.e, 1, r1);
        this.b = false;
    }

    public final int d(qc r20, int r21) {
        qc r0 = r20;
        ArrayList r3 = this.h;
        int r4 = r3.size();
        long r5 = 0;
        int r7 = 0;
        long r8 = 0;
    L3:
        if (r7 >= r4) goto L53;
        qb0 r10 = ((j10) r3.get(r7)).a;
        if ((r10 instanceof v8) == true) goto L7;
        if (r21 != 0) goto L14;
        if ((r10 instanceof po) == false) goto L8;
    L16:
        if (r21 != 0) goto L19;
        qb0 r11 = r0.d;
    L18:
        jg r112 = r11.h;
        if (r21 != 0) goto L23;
        qb0 r12 = r0.d;
    L22:
        jg r122 = r12.i;
        jg r13 = r10.h;
        jg r14 = r10.i;
        boolean r113 = r13.l.contains(r112);
        boolean r123 = r14.l.contains(r122);
        long r15 = r10.j();
        if (r113 == false) goto L45;
        if (r123 == false) goto L45;
        long r114 = j10.b(r13, r5);
        long r02 = j10.a(r14, r5);
        long r115 = r114 - r15;
        int r52 = r14.f;
        ArrayList r17 = r3;
        int r18 = r4;
        if (r115 < (-r52)) goto L30;
        r115 = r115 + ((long) r52);
    L30:
        long r32 = r13.f;
        long r03 = ((-r02) - r15) - r32;
        if (r03 < r32) goto L33;
        r03 = r03 - r32;
    L33:
        pc r33 = r10.b;
        if (r21 != 0) goto L37;
        float r34 = r33.S;
    L41:
        if (r34 <= 0.0f) goto L43;
        long r04 = (long) ((r115 / (1.0f - r34)) + (r03 / r34));
    L44:
        float r05 = r04;
        long r06 = (((long) r13.f) + ((((long) ((r05 * r34) + 0.5f)) + r15) + ((long) (((1.0f - r34) * r05) + 0.5f)))) - ((long) r14.f);
    L51:
        r8 = Math.max(r8, r06);
        r7 = r7 + 1;
        r0 = r20;
        r3 = r17;
        r4 = r18;
        r5 = 0;
        goto L3
    L43:
        r04 = 0;
        goto L44
    L37:
        if (r21 != 1) goto L39;
        r34 = r33.T;
        goto L41
    L39:
        r33.getClass();
        r34 = -1.0f;
    L45:
        r17 = r3;
        r18 = r4;
        if (r113 == false) goto L48;
        r06 = Math.max(j10.b(r13, r13.f), ((long) r13.f) + r15);
        goto L51
    L48:
        if (r123 == false) goto L50;
        r06 = Math.max(-j10.a(r14, r14.f), ((long) (-r14.f)) + r15);
        goto L51
    L50:
        r06 = (r10.j() + r13.f) - ((long) r14.f);
        goto L51
    L23:
        r12 = r0.e;
        goto L22
    L19:
        r11 = r0.e;
    L8:
        r17 = r3;
        r18 = r4;
        r06 = r5;
        goto L51
    L14:
        if ((r10 instanceof m90) == true) goto L16;
    L7:
        if (((v8) r10).f == r21) goto L16;
    L53:
        return (int) r8;
    }

    public final void e(qb0 r9, int r10, ArrayList r11) {
        jg r0 = r9.h;
        jg r1 = r9.i;
        ArrayList r02 = r0.k;
        int r2 = r02.size();
        int r3 = 0;
        int r4 = 0;
    L4:
        if (r4 >= r2) goto L11;
        Object r6 = r02.get(r4);
        r4 = r4 + 1;
        hg r62 = (hg) r6;
        if ((r62 instanceof jg) == true) goto L7;
        if ((r62 instanceof qb0) == false) goto L4;
        a(((qb0) r62).h, r10, r11, null);
        goto L4
    L7:
        a((jg) r62, r10, r11, null);
        goto L4
    L11:
        ArrayList r03 = r1.k;
        int r12 = r03.size();
        int r22 = 0;
    L12:
        if (r22 >= r12) goto L20;
        Object r42 = r03.get(r22);
        r22 = r22 + 1;
        hg r43 = (hg) r42;
        if ((r43 instanceof jg) == true) goto L15;
        if ((r43 instanceof qb0) == false) goto L12;
        a(((qb0) r43).i, r10, r11, null);
        goto L12
    L15:
        a((jg) r43, r10, r11, null);
        goto L12
    L20:
        if (r10 != 1) goto L26;
        ArrayList r92 = ((m90) r9).k.k;
        int r04 = r92.size();
    L22:
        if (r3 >= r04) goto L48;
        Object r13 = r92.get(r3);
        r3 = r3 + 1;
        hg r14 = (hg) r13;
        if ((r14 instanceof jg) == false) goto L22;
        a((jg) r14, r10, r11, null);
        goto L22
    L48:
        return;
    }

    public final void f(int r2, int r3, int r4, int r5, pc r6) {
        k7 r0 = this.g;
        r0.a = r2;
        r0.b = r4;
        r0.c = r3;
        r0.d = r5;
        this.f.a(r6, r0);
        r6.y(r0.e);
        r6.v(r0.f);
        r6.w = r0.h;
        int r22 = r0.g;
        r6.P = r22;
        if (r22 <= 0) goto L5;
        boolean r23 = true;
    L6:
        r6.w = r23;
        return;
    L5:
        r23 = false;
        goto L6
    }

    public final void g() {
        ig r0 = this;
        ArrayList r6 = r0.a.d0;
        int r7 = r6.size();
        char r8 = 0;
        int r1 = 0;
    L3:
        if (r1 >= r7) goto L43;
        int r9 = r1 + 1;
        pc r5 = (pc) r6.get(r1);
        boolean r12 = r5.a;
        po r2 = r5.d;
        m90 r10 = r5.e;
        if (r12 == true) goto L6;
        int[] r13 = r5.c0;
        int r11 = r13[r8];
        int r132 = r13[1];
        int r14 = r5.j;
        int r3 = r5.k;
        if (r11 == 2) goto L13;
        if (r11 != 3) goto L12;
        if (r14 == 1) goto L13;
    L12:
        char r15 = r8;
    L14:
        if (r132 == 2) goto L19;
        if (r132 != 3) goto L18;
        if (r3 == 1) goto L19;
    L18:
        char r32 = r8;
    L20:
        sg r152 = r2.e;
        sg r22 = r2.e;
        boolean r4 = r152.j;
        sg r82 = r10.e;
        sg r142 = r10.e;
        boolean r122 = r82.j;
        char r17 = r15;
        if (r4 == false) goto L24;
        if (r122 == false) goto L24;
        r0.f(1, r152.g, 1, r82.g, r5);
        r5.a = true;
    L38:
        if (r5.a == false) goto L42;
        j7 r02 = r10.l;
        if (r02 == null) goto L42;
        r02.d(r5.P);
    L42:
        r8 = 0;
        r0 = this;
    L24:
        if (r4 == false) goto L31;
        if (r32 == 0) goto L31;
        f(1, r152.g, 2, r82.g, r5);
        if (r132 != 3) goto L29;
        r142.m = r5.i();
        goto L38
    L29:
        r142.d(r5.i());
        r5.a = true;
    L31:
        if (r122 == false) goto L38;
        if (r17 == 0) goto L38;
        f(2, r152.g, 1, r82.g, r5);
        if (r11 != 3) goto L36;
        r22.m = r5.l();
        goto L38
    L36:
        r22.d(r5.l());
        r5.a = true;
    L19:
        r32 = 1;
    L13:
        r15 = 1;
    L6:
        r1 = r9;
        goto L3
    }
}
