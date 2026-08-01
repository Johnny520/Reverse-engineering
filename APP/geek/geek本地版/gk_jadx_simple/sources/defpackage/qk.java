package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qk {
    public int a;
    public pc b;
    public int c;
    public cc d;
    public cc e;
    public cc f;
    public cc g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public final /* synthetic */ rk r;

    public qk(rk r2, int r3, cc r4, cc r5, cc r6, cc r7, int r8) {
        this.r = r2;
        this.b = null;
        this.c = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.a = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        this.h = r2.j0;
        this.i = r2.f0;
        this.j = r2.k0;
        this.k = r2.g0;
        this.q = r8;
    }

    public final void a(pc r9) {
        int r0 = this.a;
        int r4 = 0;
        rk r5 = this.r;
        if (r0 != 0) goto L16;
        int r02 = r5.D(r9, this.q);
        if (r9.c0[0] != 3) goto L7;
        this.p++;
        r02 = 0;
    L7:
        int r2 = r5.C0;
        if (r9.V == 8) goto L11;
        r4 = r2;
    L11:
        this.l = (r02 + r4) + this.l;
        int r03 = r5.C(r9, this.q);
        if (this.b != null) goto L14;
    L15:
        this.b = r9;
        this.c = r03;
        this.m = r03;
    L28:
        this.o++;
        return;
    L14:
        if (this.c >= r03) goto L28;
    L16:
        int r04 = r5.D(r9, this.q);
        int r6 = r5.C(r9, this.q);
        if (r9.c0[1] != 3) goto L19;
        this.p++;
        r6 = 0;
    L19:
        int r22 = r5.D0;
        if (r9.V == 8) goto L23;
        r4 = r22;
    L23:
        this.m = (r6 + r4) + this.m;
        if (this.b != null) goto L26;
    L27:
        this.b = r9;
        this.c = r04;
        this.l = r04;
        goto L28
    L26:
        if (this.c >= r04) goto L28;
        goto L27
    }

    public final void b(int r19, boolean r20, boolean r21) {
        int r1 = this.o;
        int r3 = 0;
    L3:
        rk r4 = this.r;
        if (r3 >= r1) goto L12;
        int r5 = this.n + r3;
        if (r5 >= r4.O0) goto L12;
        pc r42 = r4.N0[r5];
        if (r42 == null) goto L11;
        r42.t();
    L11:
        r3 = r3 + 1;
    L12:
        if (r1 != 0) goto L14;
        return;
    L14:
        if (this.b == null) goto L220;
        if (r21 == false) goto L19;
        if (r19 != 0) goto L19;
        boolean r52 = true;
    L20:
        int r7 = 0;
        int r8 = -1;
        int r9 = -1;
    L21:
        if (r7 >= r1) goto L35;
        if (r20 == false) goto L24;
        int r10 = (r1 - 1) - r7;
    L25:
        int r11 = this.n + r10;
        if (r11 >= r4.O0) goto L35;
        if (r4.N0[r11].V != 0) goto L33;
        if (r8 != (-1)) goto L32;
        r8 = r7;
    L32:
        r9 = r7;
    L33:
        r7 = r7 + 1;
        goto L21
    L24:
        r10 = r7;
    L35:
        if (this.a != 0) goto L120;
        pc r72 = this.b;
        r72.Y = r4.r0;
        cc r112 = r72.A;
        cc r12 = r72.y;
        int r13 = this.i;
        if (r19 <= 0) goto L39;
        r13 = r13 + r4.D0;
    L39:
        r12.a(this.e, r13);
        if (r21 == false) goto L42;
        r112.a(this.g, this.k);
    L42:
        if (r19 <= 0) goto L45;
        this.e.b.A.a(r12, 0);
    L45:
        if (r4.F0 == 3) goto L47;
    L60:
        pc r102 = r72;
    L61:
        int r15 = 0;
        pc r132 = null;
    L62:
        if (r15 >= r1) goto L221;
        if (r20 == false) goto L66;
        int r16 = (r1 - 1) - r15;
    L67:
        int r32 = this.n + r16;
        if (r32 >= r4.O0) goto L222;
        pc r33 = r4.N0[r32];
        if (r15 != 0) goto L73;
        r33.e(r33.x, this.d, this.h);
    L73:
        if (r16 != 0) goto L88;
        int r2 = r4.q0;
        float r6 = r4.w0;
        if (this.n != 0) goto L80;
        int r14 = r4.s0;
        int r162 = r2;
        int r22 = -1;
        if (r14 == (-1)) goto L81;
        r6 = r4.y0;
    L79:
        int r23 = r14;
    L86:
        r33.X = r23;
        r33.S = r6;
    L81:
        if (r21 == false) goto L85;
        r14 = r4.u0;
        if (r14 == r22) goto L85;
        r6 = r4.A0;
    L85:
        r23 = r162;
        goto L86
    L80:
        r162 = r2;
        r22 = -1;
    L88:
        if (r15 != (r1 - 1)) goto L90;
        r33.e(r33.z, this.f, this.j);
    L90:
        if (r132 == null) goto L101;
        cc r24 = r132.z;
        cc r62 = r33.x;
        r62.a(r24, r4.C0);
        if (r15 != r8) goto L96;
        int r133 = this.h;
        if (r62.f() == false) goto L96;
        r62.f = r133;
    L96:
        r24.a(r62, 0);
        if (r15 != (r9 + 1)) goto L101;
        int r63 = this.j;
        if (r24.f() == false) goto L101;
        r24.f = r63;
    L101:
        if (r33 == r72) goto L118;
        int r25 = r4.F0;
        char r64 = 3;
        if (r25 == 3) goto L105;
    L110:
        if (r25 != 0) goto L112;
        r33.y.a(r12, 0);
    L119:
        r15 = r15 + 1;
        r132 = r33;
        goto L62
    L112:
        if (r25 == 1) goto L116;
        if (r52 == false) goto L115;
        r33.y.a(this.e, this.i);
        r33.A.a(this.g, this.k);
        goto L119
    L115:
        r33.y.a(r12, 0);
        r33.A.a(r112, 0);
        goto L119
    L116:
        r33.A.a(r112, 0);
        goto L119
    L105:
        if (r102.w == false) goto L110;
        if (r33 == r102) goto L110;
        if (r33.w == false) goto L110;
        r33.B.a(r102.B, 0);
        goto L119
    L118:
        r64 = 3;
        goto L119
    L222:
        return;
    L66:
        r16 = r15;
        goto L67
    L221:
        return;
    L47:
        if (r72.w == true) goto L60;
        int r134 = 0;
    L49:
        if (r134 >= r1) goto L60;
        if (r20 == false) goto L52;
        int r152 = (r1 - 1) - r134;
    L53:
        int r103 = this.n + r152;
        if (r103 >= r4.O0) goto L60;
        r102 = r4.N0[r103];
        if (r102.w == true) goto L61;
        r134 = r134 + 1;
        goto L49
    L52:
        r152 = r134;
        goto L53
    L120:
        pc r26 = this.b;
        r26.X = r4.q0;
        cc r34 = r26.x;
        cc r65 = r26.z;
        int r73 = this.h;
        if (r19 <= 0) goto L123;
        r73 = r73 + r4.C0;
    L123:
        if (r20 == false) goto L129;
        r65.a(this.f, r73);
        if (r21 == false) goto L127;
        r34.a(this.d, this.j);
    L127:
        if (r19 <= 0) goto L134;
        this.f.b.x.a(r65, 0);
    L134:
        pc r104 = null;
        int r135 = 0;
    L135:
        if (r135 >= r1) goto L223;
        int r74 = this.n + r135;
        if (r74 >= r4.O0) goto L224;
        pc r75 = r4.N0[r74];
        if (r135 != 0) goto L155;
        r75.e(r75.y, this.e, this.i);
        int r113 = r4.r0;
        float r122 = r4.x0;
        if (this.n != 0) goto L147;
        int r142 = r4.t0;
        int r153 = -1;
        if (r142 == (-1)) goto L148;
        r122 = r4.z0;
    L146:
        r113 = r142;
    L152:
        r75.Y = r113;
        r75.T = r122;
    L148:
        if (r21 == false) goto L152;
        r142 = r4.v0;
        if (r142 == r153) goto L152;
        r122 = r4.B0;
        goto L146
    L147:
        r153 = -1;
    L155:
        if (r135 != (r1 - 1)) goto L157;
        r75.e(r75.A, this.g, this.k);
    L157:
        if (r104 == null) goto L168;
        cc r105 = r104.A;
        cc r114 = r75.y;
        r114.a(r105, r4.D0);
        if (r135 != r8) goto L163;
        int r123 = this.i;
        if (r114.f() == false) goto L163;
        r114.f = r123;
    L163:
        r105.a(r114, 0);
        if (r135 != (r9 + 1)) goto L168;
        int r115 = this.k;
        if (r105.f() == false) goto L168;
        r105.f = r115;
    L168:
        if (r75 == r26) goto L193;
        if (r20 == false) goto L182;
        int r116 = r4.E0;
        if (r116 != 0) goto L174;
        r75.z.a(r65, 0);
        goto L193
    L174:
        if (r116 == 1) goto L178;
        if (r116 != 2) goto L193;
        r75.x.a(r34, 0);
        r75.z.a(r65, 0);
        goto L193
    L178:
        r75.x.a(r34, 0);
        goto L193
    L182:
        int r117 = r4.E0;
        if (r117 != 0) goto L185;
        r75.x.a(r34, 0);
        goto L193
    L185:
        if (r117 == 1) goto L191;
        if (r117 != 2) goto L193;
        if (r52 == false) goto L190;
        r75.x.a(this.d, this.h);
        r75.z.a(this.f, this.j);
        goto L193
    L190:
        r75.x.a(r34, 0);
        r75.z.a(r65, 0);
        goto L193
    L191:
        r75.z.a(r65, 0);
    L193:
        r135 = r135 + 1;
        r104 = r75;
        goto L135
    L224:
        return;
    L223:
        return;
    L129:
        r34.a(this.d, r73);
        if (r21 == false) goto L132;
        r65.a(this.f, this.j);
    L132:
        if (r19 <= 0) goto L134;
        this.d.b.z.a(r34, 0);
    L19:
        r52 = false;
        goto L20
    }

    public final int c() {
        if (this.a != 1) goto L7;
        return this.m - this.r.D0;
    L7:
        return this.m;
    }

    public final int d() {
        if (this.a != 0) goto L7;
        return this.l - this.r.C0;
    L7:
        return this.l;
    }

    public final void e(int r12) {
        int r0 = this.p;
        if (r0 == 0) goto L51;
        int r1 = this.o;
        int r4 = r12 / r0;
        int r02 = 0;
    L6:
        rk r2 = this.r;
        if (r02 >= r1) goto L27;
        int r3 = this.n + r02;
        if (r3 >= r2.O0) goto L27;
        pc r7 = r2.N0[r3];
        if (this.a != 0) goto L20;
        if (r7 == null) goto L26;
        int[] r32 = r7.c0;
        if (r32[0] != 3) goto L26;
        if (r7.j != 0) goto L26;
        r2.E(1, r4, r32[1], r7.i(), r7);
    L26:
        r02 = r02 + 1;
        goto L6
    L20:
        if (r7 == null) goto L26;
        int[] r5 = r7.c0;
        if (r5[1] != 3) goto L26;
        if (r7.k != 0) goto L26;
        int r6 = r4;
        r2.E(r5[0], r7.l(), 1, r6, r7);
        r4 = r6;
    L27:
        this.l = 0;
        this.m = 0;
        this.b = null;
        this.c = 0;
        int r03 = this.o;
        int r13 = 0;
    L28:
        if (r13 >= r03) goto L68;
        int r33 = this.n + r13;
        if (r33 >= r2.O0) goto L69;
        pc r34 = r2.N0[r33];
        if (this.a != 0) goto L42;
        int r42 = r34.l();
        int r62 = r2.C0;
        if (r34.V != 8) goto L37;
        r62 = 0;
    L37:
        this.l = (r42 + r62) + this.l;
        int r43 = r2.C(r34, this.q);
        if (this.b != null) goto L40;
    L41:
        this.b = r34;
        this.c = r43;
        this.m = r43;
    L50:
        r13 = r13 + 1;
        goto L28
    L40:
        if (this.c >= r43) goto L50;
    L42:
        int r44 = r2.D(r34, this.q);
        int r63 = r2.C(r34, this.q);
        int r72 = r2.D0;
        if (r34.V != 8) goto L45;
        r72 = 0;
    L45:
        this.m = (r63 + r72) + this.m;
        if (this.b != null) goto L48;
    L49:
        this.b = r34;
        this.c = r44;
        this.l = r44;
        goto L50
    L48:
        if (this.c >= r44) goto L50;
    L69:
        return;
    L68:
        return;
    }

    public final void f(int r1, cc r2, cc r3, cc r4, cc r5, int r6, int r7, int r8, int r9, int r10) {
        this.a = r1;
        this.d = r2;
        this.e = r3;
        this.f = r4;
        this.g = r5;
        this.h = r6;
        this.i = r7;
        this.j = r8;
        this.k = r9;
        this.q = r10;
    }
}
