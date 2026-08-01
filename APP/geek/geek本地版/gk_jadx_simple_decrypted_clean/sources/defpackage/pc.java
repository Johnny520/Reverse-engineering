package defpackage;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class pc {
    public final cc A;
    public final cc B;
    public final cc C;
    public final cc D;
    public final cc E;
    public final cc[] F;
    public final ArrayList G;
    public final boolean[] H;
    public pc I;
    public int J;
    public int K;
    public float L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public float S;
    public float T;
    public View U;
    public int V;
    public String W;
    public int X;
    public int Y;
    public final float[] Z;
    public boolean a;
    public final pc[] a0;
    public v8 b;
    public final pc[] b0;
    public v8 c;
    public final int[] c0;
    public final po d;
    public final m90 e;
    public final boolean[] f;
    public final int[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public final int[] l;
    public int m;
    public int n;
    public float o;
    public int p;
    public int q;
    public float r;
    public int s;
    public float t;
    public final int[] u;
    public float v;
    public boolean w;
    public final cc x;
    public final cc y;
    public final cc z;

    public pc() {
        this.a = false;
        po r2 = new po(this);
        r2.h.e = 4;
        r2.i.e = 5;
        r2.f = 0;
        this.d = r2;
        m90 r22 = new m90(this);
        jg r3 = new jg(r22);
        r22.k = r3;
        r22.l = null;
        r22.h.e = 6;
        r22.i.e = 7;
        r3.e = 8;
        r22.f = 1;
        this.e = r22;
        this.f = new boolean[]{true, true};
        this.g = new int[]{0, 0, 0, 0};
        this.h = -1;
        this.i = -1;
        this.j = 0;
        this.k = 0;
        this.l = new int[2];
        this.m = 0;
        this.n = 0;
        this.o = 1.0f;
        this.p = 0;
        this.q = 0;
        this.r = 1.0f;
        this.s = -1;
        this.t = 1.0f;
        this.u = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.v = 0.0f;
        this.w = false;
        cc r12 = new cc(this, 2);
        this.x = r12;
        cc r14 = new cc(this, 3);
        this.y = r14;
        cc r13 = new cc(this, 4);
        this.z = r13;
        cc r15 = new cc(this, 5);
        this.A = r15;
        cc r4 = new cc(this, 6);
        this.B = r4;
        cc r5 = new cc(this, 8);
        this.C = r5;
        cc r7 = new cc(this, 9);
        this.D = r7;
        cc r8 = new cc(this, 7);
        this.E = r8;
        this.F = new cc[]{r12, r13, r14, r15, r4, r8};
        ArrayList r42 = new ArrayList();
        this.G = r42;
        this.H = new boolean[2];
        this.c0 = new int[]{1, 1};
        this.I = null;
        this.J = 0;
        this.K = 0;
        this.L = 0.0f;
        this.M = -1;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.S = 0.5f;
        this.T = 0.5f;
        this.V = 0;
        this.W = null;
        this.X = 0;
        this.Y = 0;
        this.Z = new float[]{-1.0f, -1.0f};
        this.a0 = new pc[]{null, null};
        this.b0 = new pc[]{null, null};
        r42.add(r12);
        r42.add(r14);
        r42.add(r13);
        r42.add(r15);
        r42.add(r5);
        r42.add(r7);
        r42.add(r8);
        r42.add(r4);
    }

    public void A(ar r7) {
        r7.getClass();
        int r72 = ar.m(this.x);
        int r0 = ar.m(this.y);
        int r1 = ar.m(this.z);
        int r2 = ar.m(this.A);
        po r3 = this.d;
        jg r4 = r3.h;
        if (r4.j == false) goto L7;
        jg r32 = r3.i;
        if (r32.j == false) goto L7;
        r72 = r4.g;
        r1 = r32.g;
    L7:
        m90 r33 = this.e;
        jg r42 = r33.h;
        if (r42.j == false) goto L12;
        jg r34 = r33.i;
        if (r34.j == false) goto L12;
        r0 = r42.g;
        r2 = r34.g;
    L12:
        int r43 = r2 - r0;
        if ((r1 - r72) < 0) goto L25;
        if (r43 < 0) goto L25;
        if (r72 == Integer.MIN_VALUE) goto L25;
        if (r72 == Integer.MAX_VALUE) goto L25;
        if (r0 == Integer.MIN_VALUE) goto L25;
        if (r0 == Integer.MAX_VALUE) goto L25;
        if (r1 == Integer.MIN_VALUE) goto L25;
        if (r1 == Integer.MAX_VALUE) goto L25;
        if (r2 == Integer.MIN_VALUE) goto L25;
        if (r2 == Integer.MAX_VALUE) goto L25;
    L26:
        int r12 = r1 - r72;
        int r22 = r2 - r0;
        this.N = r72;
        this.O = r0;
        if (this.V != 8) goto L30;
        this.J = 0;
        this.K = 0;
        return;
    L30:
        int[] r73 = this.c0;
        if (r73[0] != 1) goto L36;
        int r02 = this.J;
        if (r12 >= r02) goto L36;
        r12 = r02;
    L36:
        if (r73[1] != 1) goto L40;
        int r74 = this.K;
        if (r22 >= r74) goto L40;
        r22 = r74;
    L40:
        this.J = r12;
        this.K = r22;
        int r75 = this.R;
        if (r22 >= r75) goto L43;
        this.K = r75;
    L43:
        int r76 = this.Q;
        if (r12 >= r76) goto L47;
        this.J = r76;
        return;
    L47:
        return;
    L25:
        r72 = 0;
        r0 = 0;
        r1 = 0;
        r2 = 0;
        goto L26
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(ar r60) {
        ar r1 = r60;
        cc r2 = this.x;
        a40 r3 = r1.j(r2);
        cc r4 = this.z;
        a40 r5 = r1.j(r4);
        cc r6 = this.y;
        a40 r7 = r1.j(r6);
        cc r8 = this.A;
        a40 r9 = r1.j(r8);
        cc r10 = this.B;
        a40 r11 = r1.j(r10);
        po r12 = this.d;
        jg r13 = r12.h;
        jg r14 = r12.i;
        boolean r15 = r13.j;
        boolean[] r102 = this.f;
        m90 r103 = this.e;
        if (r15 == true) goto L5;
    L33:
        po r22 = r12;
    L34:
        pc r122 = this.I;
        if (r122 == null) goto L75;
        int[] r123 = r122.c0;
        if (r123[0] != 2) goto L39;
        boolean r152 = true;
    L41:
        if (r123[1] != 2) goto L44;
        boolean r124 = true;
    L46:
        if (p(0) == false) goto L48;
        a40 r23 = r7;
        ((qc) this.I).B(this, 0);
        boolean r72 = true;
        int r132 = 1;
    L50:
        if (p(r132) == false) goto L52;
        boolean r24 = r72;
        ((qc) this.I).B(this, r132);
        boolean r73 = true;
    L53:
        if (r24 == true) goto L63;
        if (r152 == false) goto L63;
        boolean r25 = r73;
        if (this.V != 8) goto L58;
    L62:
        cc r26 = r2;
    L64:
        if (r25 == true) goto L74;
        if (r124 == false) goto L74;
        if (this.V == 8) goto L74;
        if (r6.d != null) goto L74;
        if (r8.d != null) goto L74;
        if (r10 != null) goto L74;
        r1.f(r1.j(this.I.A), r9, 0, 1);
    L74:
        cc r74 = r4;
        boolean r42 = r124;
        boolean[] r27 = r102;
        boolean r18 = r24;
    L76:
        int r125 = this.J;
        int r133 = this.Q;
        if (r125 >= r133) goto L79;
    L78:
        boolean[] r242 = r27;
        int r28 = this.K;
        boolean r272 = r42;
        int r43 = this.R;
        if (r28 >= r43) goto L83;
        int r282 = r43;
    L84:
        int[] r44 = this.c0;
        int r45 = r44[0];
        if (r45 == 3) goto L88;
        boolean r31 = true;
    L87:
        cc r32 = r74;
        int r75 = r44[1];
        if (r75 == 3) goto L92;
        boolean r33 = true;
    L93:
        int r62 = this.M;
        this.s = r62;
        float r82 = this.L;
        this.t = r82;
        int r83 = this.j;
        int r84 = this.k;
        if (r82 <= 0.0f) goto L186;
        a40 r41 = r9;
        if (this.V == 8) goto L185;
        char r85 = 3;
        if (r45 != 3) goto L101;
        if (r83 != 0) goto L101;
        int r92 = 3;
    L102:
        if (r75 != 3) goto L105;
        if (r84 != 0) goto L105;
        m90 r422 = r103;
        int r104 = 3;
    L106:
        if (r45 != 3) goto L168;
        if (r75 != 3) goto L168;
        if (r92 != 3) goto L168;
        if (r104 != 3) goto L168;
        if (r62 != (-1)) goto L121;
        if (r31 == false) goto L115;
        if (r33 == true) goto L115;
        this.s = 0;
    L115:
        if (r31 == true) goto L121;
        if (r33 == false) goto L121;
        this.s = 1;
        if (r62 != (-1)) goto L121;
        this.t = 1.0f / r82;
    L121:
        if (this.s != 0) goto L130;
        if (r6.f() == false) goto L128;
        if (r8.f() == true) goto L130;
    L128:
        this.s = 1;
    L137:
        if (this.s != (-1)) goto L157;
        if (r6.f() == false) goto L147;
        if (r8.f() == false) goto L147;
        if (r26.f() == false) goto L147;
        if (r32.f() == true) goto L157;
    L147:
        if (r6.f() == false) goto L152;
        if (r8.f() == false) goto L152;
        this.s = 0;
    L152:
        if (r26.f() == false) goto L157;
        if (r32.f() == false) goto L157;
        this.t = 1.0f / this.t;
        this.s = 1;
    L157:
        if (this.s != (-1)) goto L167;
        int r29 = this.m;
        if (r29 > 0) goto L161;
    L163:
        if (r29 != 0) goto L167;
        if (this.p <= 0) goto L167;
        this.t = 1.0f / this.t;
        this.s = 1;
        goto L167
    L161:
        if (this.p != 0) goto L163;
        this.s = 0;
    L167:
        r85 = 3;
    L184:
        po r210 = r22;
    L174:
        boolean r30 = true;
    L173:
        int r222 = r104;
    L188:
        int[] r46 = this.l;
        r46[0] = r92;
        r46[1] = r222;
        if (r30 == false) goto L196;
        int r47 = this.s;
        if (r47 == 0) goto L193;
        if (r47 != (-1)) goto L196;
    L193:
        boolean r48 = true;
    L198:
        if (r44[0] == 2) goto L200;
    L203:
        int r21 = r92;
        boolean r93 = false;
    L204:
        if (r93 == false) goto L206;
        r133 = 0;
    L206:
        cc r105 = this.E;
        boolean r262 = !r105.f();
        boolean[] r126 = this.H;
        boolean r20 = r126[0];
        boolean r322 = r126[1];
        int r127 = this.h;
        po r332 = r210;
        int[] r211 = this.u;
        a40 r34 = null;
        if (r127 == 2) goto L232;
        jg r128 = r332.h;
        if (r128.j == false) goto L222;
        if (r14.j == false) goto L222;
        r1.d(r3, r128.g);
        r1.d(r5, r14.g);
        if (this.I == null) goto L221;
        if (r152 == false) goto L221;
        if (r242[0] == false) goto L221;
        if (q() == true) goto L221;
        r1.f(r1.j(this.I.z), r5, 0, 8);
    L221:
        int[] r462 = r211;
        a40 r49 = r3;
        a40 r50 = r5;
        cc r472 = r105;
        a40 r53 = r11;
        boolean r35 = r152;
        cc r56 = r10;
        a40 r51 = r23;
        boolean r19 = r25;
        boolean r410 = r272;
        Object r55 = r8;
        a40 r52 = r41;
        m90 r212 = r422;
        boolean[] r273 = r242;
    L233:
        jg r54 = r212.h;
        jg r63 = r212.i;
        if (r54.j == true) goto L236;
    L247:
        a40 r76 = r51;
        a40 r64 = r52;
        a40 r57 = r53;
        int r86 = 1;
        int r94 = 8;
        int r134 = 0;
        int r153 = 1;
    L249:
        if (this.i != 2) goto L252;
        r153 = r134;
    L252:
        if (r153 != 0) goto L254;
        a40 r58 = r64;
        a40 r572 = r76;
    L290:
        if (r30 == false) goto L296;
        if (this.s != 1) goto L294;
        float r213 = this.t;
        p6 r411 = r1.k();
        r411.d.i(r58, -1.0f);
        r411.d.i(r572, 1.0f);
        r411.d.i(r50, r213);
        r411.d.i(r49, -r213);
        r1.c(r411);
        goto L296
    L294:
        float r214 = this.t;
        p6 r412 = r1.k();
        r412.d.i(r50, -1.0f);
        r412.d.i(r49, 1.0f);
        r412.d.i(r58, r214);
        r412.d.i(r572, -r214);
        r1.c(r412);
    L296:
        if (r472.f() == false) goto L303;
        cc r215 = r472;
        pc r36 = r215.d.b;
        float r413 = (float) Math.toRadians(this.v + 90.0f);
        int r216 = r215.c();
        a40 r59 = r1.j(g(2));
        a40 r65 = r1.j(g(3));
        a40 r95 = r1.j(g(4));
        a40 r129 = r1.j(g(5));
        a40 r106 = r1.j(r36.g(2));
        a40 r87 = r1.j(r36.g(3));
        a40 r77 = r1.j(r36.g(4));
        a40 r37 = r1.j(r36.g(5));
        p6 r112 = r1.k();
        double r135 = r413;
        double r154 = Math.sin(r135);
        double r136 = r216;
        r112.d.i(r87, 0.5f);
        r112.d.i(r37, 0.5f);
        r112.d.i(r65, -0.5f);
        r112.d.i(r129, -0.5f);
        r112.b = -((float) (r154 * r136));
        r1.c(r112);
        p6 r217 = r1.k();
        float r38 = (float) (Math.cos(r135) * r136);
        r217.d.i(r106, 0.5f);
        r217.d.i(r77, 0.5f);
        r217.d.i(r59, -0.5f);
        r217.d.i(r95, -0.5f);
        r217.b = -r38;
        r1.c(r217);
        return;
    L303:
        return;
    L254:
        if (r44[r86] == 2) goto L256;
    L258:
        int r155 = r134;
    L259:
        if (r155 == 0) goto L261;
        r282 = r134;
    L261:
        if (r30 == false) goto L267;
        int r113 = this.s;
        if (r113 != r86) goto L265;
    L266:
        boolean r17 = r86;
    L268:
        pc r114 = this.I;
        if (r114 == null) goto L271;
        a40 r115 = r1.j(r114.A);
    L272:
        pc r1210 = this.I;
        if (r1210 == null) goto L275;
        r34 = r1.j(r1210.y);
    L275:
        int r1211 = this.P;
        if (r1211 > 0) goto L279;
        boolean r263 = r262;
        if (this.V == r94) goto L279;
    L288:
        a40 r512 = r76;
        a40 r78 = r115;
        boolean r202 = r410;
        boolean r414 = r35;
        r58 = r64;
        boolean r96 = r155;
        a40 r66 = r34;
        r572 = r512;
        r1 = r60;
        int r137 = r282;
        c(r1, false, r202, r414, r273[r86], r66, r78, r44[r86], r96, this.y, this.A, this.O, r137, this.R, r462[r86], this.T, r17, r19, r18, r322, r222, r21, this.p, this.q, this.r, r263);
    L279:
        r1.e(r57, r76, r1211, r94);
        Object r1212 = r56.d;
        if (r1212 == null) goto L285;
        r1.e(r57, r1.j(r1212), r134, r94);
        if (r410 == false) goto L284;
        r1.f(r115, r1.j(r55), r134, 5);
    L284:
        r263 = r134;
        goto L288
    L285:
        r263 = r262;
        if (this.V != r94) goto L288;
        r1.e(r57, r76, r134, r94);
        r263 = r262;
        goto L288
    L271:
        r115 = null;
        goto L272
    L265:
        if (r113 == (-1)) goto L266;
    L267:
        r17 = r134;
        goto L268
    L256:
        if ((this instanceof qc) == false) goto L258;
        r155 = r86;
        goto L259
    L236:
        if (r63.j == false) goto L247;
        r76 = r51;
        r1.d(r76, r54.g);
        int r510 = r63.g;
        r64 = r52;
        r1.d(r64, r510);
        r57 = r53;
        r1.d(r57, r212.k.g);
        pc r218 = this.I;
        if (r218 == null) goto L245;
        if (r19 == true) goto L245;
        if (r410 == false) goto L245;
        r86 = 1;
        if (r273[1] == false) goto L244;
        r94 = 8;
        r134 = 0;
        r1.f(r1.j(r218.A), r64, 0, 8);
    L246:
        r153 = r134;
    L244:
        r94 = 8;
        r134 = 0;
    L245:
        r86 = 1;
    L222:
        pc r67 = this.I;
        if (r67 == null) goto L225;
        a40 r68 = r1.j(r67.z);
    L226:
        pc r142 = this.I;
        if (r142 == null) goto L230;
        a40 r143 = r1.j(r142.x);
    L231:
        a40 r79 = r68;
        a40 r69 = r143;
        r35 = r152;
        r462 = r211;
        r472 = r105;
        boolean r172 = r48;
        r56 = r10;
        r51 = r23;
        r19 = r25;
        r410 = r272;
        r50 = r5;
        r55 = r8;
        r49 = r3;
        r52 = r41;
        r53 = r11;
        r273 = r242;
        r1 = r60;
        c(r1, true, r35, r410, r242[0], r69, r79, r44[0], r93, this.x, this.z, this.N, r133, this.Q, r211[0], this.S, r172, r18, r19, r20, r21, r222, this.m, this.n, this.o, r262);
        r212 = r422;
        goto L233
    L230:
        r143 = null;
        goto L231
    L225:
        r68 = null;
        goto L226
    L232:
        r462 = r211;
        r49 = r3;
        r50 = r5;
        r472 = r105;
        r53 = r11;
        r35 = r152;
        r56 = r10;
        r51 = r23;
        r19 = r25;
        r410 = r272;
        r55 = r8;
        r52 = r41;
        r273 = r242;
        r212 = r422;
        goto L233
    L200:
        if ((this instanceof qc) == false) goto L203;
        r21 = r92;
        r93 = true;
    L196:
        r48 = false;
    L130:
        if (this.s != 1) goto L137;
        if (r26.f() == true) goto L134;
    L135:
        this.s = 0;
        goto L137
    L134:
        if (r32.f() == true) goto L137;
    L168:
        if (r45 != 3) goto L175;
        if (r92 != 3) goto L175;
        this.s = 0;
        int r219 = (int) (r82 * r28);
        r85 = 3;
        r133 = r219;
        r210 = r22;
        if (r75 == 3) goto L174;
        r92 = 4;
        r30 = false;
    L175:
        if (r75 != 3) goto L184;
        if (r104 != 3) goto L184;
        this.s = 1;
        if (r62 != (-1)) goto L180;
        this.t = 1.0f / r82;
    L180:
        r282 = (int) (this.t * r125);
        r210 = r22;
        if (r45 == 3) goto L174;
        r222 = 4;
    L183:
        r30 = false;
    L105:
        r422 = r103;
        r104 = r84;
    L101:
        r92 = r83;
    L185:
        r422 = r103;
        r85 = 3;
        r210 = r22;
        r92 = r83;
        r222 = r84;
        goto L183
    L186:
        r41 = r9;
        goto L185
    L92:
        r33 = false;
        goto L93
    L88:
        r31 = false;
        goto L87
    L83:
        r282 = r28;
        goto L84
    L79:
        r133 = r125;
        goto L78
    L58:
        if (r2.d != null) goto L62;
        if (r4.d != null) goto L62;
        r26 = r2;
        r1.f(r1.j(this.I.z), r5, 0, 1);
    L63:
        r26 = r2;
        r25 = r73;
        goto L64
    L52:
        r24 = r72;
        r73 = r();
        goto L53
    L48:
        r23 = r7;
        r72 = q();
        r132 = 1;
        goto L50
    L44:
        r124 = false;
        goto L46
    L39:
        r152 = false;
        goto L41
    L75:
        r26 = r2;
        r23 = r7;
        r74 = r4;
        r27 = r102;
        r42 = false;
        r152 = false;
        r18 = false;
        r25 = false;
        goto L76
    L5:
        if (r14.j == false) goto L33;
        jg r156 = r103.h;
        r22 = r12;
        jg r1213 = r103.i;
        if (r156.j == false) goto L34;
        if (r1213.j == false) goto L34;
        r1.d(r3, r13.g);
        r1.d(r5, r14.g);
        r1.d(r7, r103.h.g);
        r1.d(r9, r1213.g);
        r1.d(r11, r103.k.g);
        pc r220 = this.I;
        if (r220 == null) goto L299;
        int[] r221 = r220.c0;
        if (r221[0] != 2) goto L15;
        boolean r39 = true;
    L17:
        if (r221[1] != 2) goto L19;
        boolean r223 = true;
    L20:
        if (r39 == true) goto L22;
    L26:
        if (r223 == true) goto L28;
        return;
    L28:
        if (r102[1] == true) goto L30;
        return;
    L30:
        if (r() == true) goto L302;
        r1.f(r1.j(this.I.A), r9, 0, 8);
        return;
    L302:
        return;
    L22:
        if (r102[0] == false) goto L26;
        if (q() == true) goto L26;
        r1.f(r1.j(this.I.z), r5, 0, 8);
        goto L26
    L19:
        r223 = false;
        goto L20
    L15:
        r39 = false;
        goto L17
    }

    public boolean b() {
        if (this.V == 8) goto L6;
        return true;
    L6:
        return false;
    }

    public final void c(ar r28, boolean r29, boolean r30, boolean r31, boolean r32, a40 r33, a40 r34, int r35, boolean r36, cc r37, cc r38, int r39, int r40, int r41, int r42, float r43, boolean r44, boolean r45, boolean r46, boolean r47, int r48, int r49, int r50, int r51, float r52, boolean r53) {
        ar r1 = r28;
        int r4 = r50;
        int r5 = r51;
        a40 r7 = r1.j(r37);
        a40 r8 = r1.j(r38);
        a40 r9 = r1.j(r37.d);
        a40 r15 = r1.j(r38.d);
        boolean r16 = r37.f();
        boolean r17 = r38.f();
        boolean r11 = this.E.f();
        if (r17 == false) goto L5;
        int r18 = (r16 ? 1 : 0) + 1;
    L6:
        if (r11 == false) goto L8;
        r18 = r18 + 1;
    L8:
        int r112 = r18;
        if (r44 == false) goto L11;
        int r3 = 3;
    L12:
        int r13 = z30.t(r35);
        if (r13 == 0) goto L17;
        if (r13 == 1) goto L17;
        if (r13 != 2) goto L17;
        if (r3 == 4) goto L17;
        boolean r10 = true;
    L23:
        if (this.V != 8) goto L25;
        int r102 = 0;
        boolean r132 = false;
    L26:
        if (r53 == false) goto L35;
        if (r16 == true) goto L32;
        if (r17 == true) goto L32;
        if (r11 == true) goto L32;
        r1.d(r7, r39);
    L31:
        boolean r402 = r132;
        int r133 = 8;
    L36:
        if (r402 == true) goto L47;
        if (r36 == false) goto L44;
        r1.e(r8, r7, 0, 3);
        if (r41 <= 0) goto L42;
        r1.f(r8, r7, r41, r133);
    L42:
        if (r42 >= Integer.MAX_VALUE) goto L45;
        r1.g(r8, r7, r42, r133);
    L45:
        boolean r103 = r32;
        boolean r152 = r402;
        int r134 = r4;
    L92:
        if (r53 == false) goto L255;
        if (r45 == false) goto L95;
        a40 r310 = r34;
        a40 r2 = r7;
        a40 r72 = r8;
        boolean r322 = r103;
        char r410 = 2;
        a40 r104 = r33;
    L256:
        if (r112 >= r410) goto L284;
        if (r30 == false) goto L285;
        if (r322 == false) goto L286;
        r1.f(r2, r104, 0, 8);
        cc r22 = this.B;
        if (r29 == false) goto L262;
    L265:
        boolean r153 = true;
    L266:
        if (r29 == true) goto L277;
        cc r23 = r22.d;
        if (r23 == null) goto L277;
        pc r24 = r23.b;
        if (r24.L == 0.0f) goto L276;
        int[] r25 = r24.c0;
        if (r25[0] != 3) goto L276;
        if (r25[1] != 3) goto L276;
        boolean r105 = true;
    L278:
        if (r105 == false) goto L287;
        r1.f(r310, r72, 0, 8);
        return;
    L287:
        return;
    L276:
        r105 = false;
    L277:
        r105 = r153;
        goto L278
    L262:
        if (r22.d == null) goto L265;
        r153 = false;
        goto L266
    L286:
        return;
    L285:
        return;
    L284:
        return;
    L95:
        if (r16 == true) goto L99;
        if (r17 == true) goto L99;
        if (r11 == true) goto L99;
    L98:
        a40 r73 = r8;
        boolean r323 = r103;
        a40 r6 = r15;
    L245:
        if (r30 == false) goto L281;
        if (r323 == true) goto L248;
        return;
    L248:
        if (r38.d == null) goto L251;
        int r154 = r38.c();
    L252:
        if (r6 == r34) goto L283;
        r1.f(r34, r73, r154, 5);
        return;
    L283:
        return;
    L251:
        r154 = 0;
        goto L252
    L281:
        return;
    L99:
        if (r16 == false) goto L102;
        if (r17 == false) goto L98;
    L102:
        if (r16 == true) goto L108;
        if (r17 == false) goto L108;
        r6 = r15;
        r1.e(r8, r6, -r38.c(), 8);
        if (r30 == false) goto L107;
        r1.f(r7, r33, 0, 5);
    L107:
        r73 = r8;
        r323 = r103;
    L108:
        r6 = r15;
        if (r16 == false) goto L107;
        if (r17 == false) goto L107;
        pc r26 = r37.d.b;
        pc r12 = r38.d.b;
        r323 = r103;
        pc r106 = this.I;
        int r162 = 6;
        if (r152 == false) goto L165;
        if (r3 != 0) goto L126;
        if (r5 != 0) goto L117;
        if (r134 != 0) goto L117;
        int r54 = 8;
        boolean r172 = false;
        boolean r19 = true;
        int r20 = 8;
    L119:
        if ((r26 instanceof e7) == false) goto L121;
    L124:
        boolean r55 = r172;
        int r242 = r20;
        boolean r411 = false;
        int r173 = r3;
        int r311 = 6;
        boolean r202 = r19;
        int r192 = 4;
    L166:
        if (r411 == false) goto L170;
        if (r9 != r6) goto L170;
        if (r26 == r106) goto L170;
        boolean r252 = false;
        boolean r262 = false;
    L171:
        if (r55 == true) goto L173;
        pc r14 = r26;
        a40 r27 = r7;
        r73 = r8;
        a40 r312 = r9;
        int r352 = r134;
        boolean r362 = r152;
        int r135 = r173;
        int r122 = 8;
        pc r155 = r12;
        r1 = r28;
    L178:
        if (this.V == r122) goto L288;
        if (r252 == false) goto L191;
        if (r30 == false) goto L189;
        if (r312 == r6) goto L189;
        if (r362 == true) goto L189;
        if ((r14 instanceof e7) == false) goto L187;
    L188:
        int r412 = 6;
    L190:
        r1.f(r27, r312, r37.c(), r412);
        r1.g(r73, r6, -r38.c(), r412);
        r242 = r412;
        goto L191
    L187:
        if ((r155 instanceof e7) == true) goto L188;
    L189:
        r412 = r242;
    L191:
        if (r30 == false) goto L198;
        if (r47 == false) goto L198;
        if ((r14 instanceof e7) == true) goto L198;
        if ((r155 instanceof e7) == true) goto L198;
        int r413 = 6;
        int r56 = 6;
        boolean r21 = true;
    L199:
        if (r21 == false) goto L230;
        if (r202 == false) goto L221;
        if (r46 == false) goto L203;
        if (r31 == false) goto L221;
    L203:
        if (r14 == r106) goto L208;
        if (r155 == r106) goto L208;
        r162 = r413;
    L208:
        if ((r14 instanceof go) == false) goto L210;
    L211:
        r162 = 5;
    L213:
        if ((r14 instanceof e7) == false) goto L215;
    L216:
        r162 = 5;
    L217:
        if (r46 == false) goto L219;
        int r82 = 5;
    L220:
        r413 = Math.max(r82, r413);
        goto L221
    L219:
        r82 = r162;
        goto L220
    L215:
        if ((r155 instanceof e7) == false) goto L217;
    L210:
        if ((r155 instanceof go) == false) goto L213;
    L221:
        if (r30 == false) goto L228;
        r413 = Math.min(r56, r413);
        if (r44 == false) goto L228;
        if (r46 == true) goto L228;
        if (r14 == r106) goto L227;
        if (r155 != r106) goto L228;
    L227:
        int r107 = 4;
    L229:
        r1.e(r27, r312, r37.c(), r107);
        r1.e(r73, r6, -r38.c(), r107);
    L228:
        r107 = r413;
    L230:
        if (r30 == false) goto L236;
        if (r33 != r312) goto L233;
        int r414 = r37.c();
    L234:
        if (r312 == r33) goto L236;
        r1.f(r27, r33, r414, 5);
        goto L236
    L233:
        r414 = 0;
    L236:
        if (r30 == false) goto L245;
        if (r362 == false) goto L245;
        if (r41 != 0) goto L245;
        if (r352 != 0) goto L245;
        if (r362 == true) goto L242;
    L244:
        r1.f(r73, r27, 0, 5);
        goto L245
    L242:
        if (r135 != 3) goto L244;
        r1.f(r73, r27, 0, 8);
    L198:
        r413 = r192;
        r56 = r242;
        r21 = r262;
        goto L199
    L288:
        return;
    L173:
        if (this.V != 8) goto L175;
        r311 = 4;
    L175:
        r27 = r7;
        r73 = r8;
        int r92 = r311;
        r312 = r9;
        r122 = 8;
        r352 = r134;
        r362 = r152;
        r135 = r173;
        r14 = r26;
        r155 = r12;
        r1 = r28;
        r1.b(r27, r312, r37.c(), r43, r6, r73, r38.c(), r92);
    L170:
        r252 = r411;
        r262 = true;
        goto L171
    L121:
        if ((r12 instanceof e7) == true) goto L124;
        r242 = r20;
        r411 = false;
        r202 = r19;
        r192 = r54;
        r55 = r172;
        r173 = r3;
        r311 = 6;
    L117:
        r54 = 5;
        r172 = true;
        r19 = false;
        r20 = 5;
        goto L119
    L126:
        if (r3 != 1) goto L130;
        r173 = r3;
        r311 = 6;
        r411 = true;
        r55 = true;
        r192 = 4;
        r202 = false;
    L128:
        r242 = 8;
        goto L166
    L130:
        if (r3 != 3) goto L163;
        r173 = r3;
        if (this.s != (-1)) goto L139;
        if (r46 == false) goto L138;
        if (r30 == false) goto L137;
        r311 = 5;
    L136:
        r411 = true;
        r55 = true;
        r192 = 5;
        r202 = true;
        goto L128
    L137:
        r311 = 4;
        goto L136
    L138:
        r311 = 8;
        goto L136
    L139:
        if (r44 == true) goto L141;
        if (r5 <= 0) goto L153;
        r311 = 6;
        r411 = true;
        r55 = true;
        r192 = 5;
    L151:
        r202 = true;
    L152:
        r242 = 5;
        goto L166
    L153:
        if (r5 != 0) goto L162;
        if (r134 != 0) goto L162;
        if (r46 == true) goto L157;
        r311 = 6;
        r411 = true;
        r55 = true;
        r192 = 8;
        goto L151
    L157:
        if (r26 == r106) goto L160;
        if (r12 == r106) goto L160;
        int r313 = 4;
    L161:
        r242 = r313;
        r311 = 6;
        r411 = true;
        r55 = true;
        r192 = 4;
    L148:
        r202 = true;
    L160:
        r313 = 5;
    L162:
        r311 = 6;
        r411 = true;
        r55 = true;
        r192 = 4;
        goto L151
    L141:
        if (r49 != 2) goto L143;
    L146:
        int r314 = 4;
        int r415 = 5;
    L147:
        r192 = r314;
        r242 = r415;
        r311 = 6;
        r411 = true;
        r55 = true;
        goto L148
    L143:
        if (r49 == 1) goto L146;
        r314 = 5;
        r415 = 8;
        goto L147
    L163:
        r173 = r3;
        r311 = 6;
        r411 = false;
        r55 = false;
    L164:
        r192 = 4;
        r202 = false;
        goto L152
    L165:
        r173 = r3;
        r311 = 6;
        r411 = true;
        r55 = true;
        goto L164
    L255:
        r310 = r34;
        r2 = r7;
        r72 = r8;
        r322 = r103;
        r104 = r33;
        r410 = 2;
        goto L256
    L44:
        r1.e(r8, r7, r102, r133);
        goto L45
    L47:
        if (r112 == 2) goto L58;
        if (r44 == true) goto L58;
        if (r3 == 1) goto L52;
        if (r3 != 0) goto L58;
    L52:
        int r210 = Math.max(r4, r102);
        if (r5 <= 0) goto L55;
        r210 = Math.min(r5, r210);
    L55:
        r1.e(r8, r7, r210, 8);
        r103 = r32;
        r134 = r4;
    L56:
        r152 = false;
    L58:
        if (r4 != (-2)) goto L60;
        r4 = r102;
    L60:
        if (r5 != (-2)) goto L62;
        r5 = r102;
    L62:
        if (r102 <= 0) goto L67;
        if (r3 == 1) goto L67;
        r102 = 0;
    L67:
        if (r4 <= 0) goto L70;
        r1.f(r8, r7, r4, 8);
        r102 = Math.max(r102, r4);
    L70:
        if (r5 <= 0) goto L76;
        if (r30 == false) goto L74;
        if (r3 != 1) goto L74;
    L75:
        r102 = Math.min(r102, r5);
    L74:
        r1.g(r8, r7, r5, 8);
    L76:
        if (r3 != 1) goto L83;
        if (r30 == false) goto L79;
        r1.e(r8, r7, r102, 8);
        goto L45
    L79:
        if (r45 == false) goto L81;
        r1.e(r8, r7, r102, 5);
        r1.g(r8, r7, r102, 8);
        goto L45
    L81:
        r1.e(r8, r7, r102, 5);
        r1.g(r8, r7, r102, 8);
        goto L45
    L83:
        if (r3 != 2) goto L91;
        int r136 = r37.c;
        if (r136 == 3) goto L89;
        if (r136 == 5) goto L89;
        a40 r211 = r1.j(this.I.g(2));
        a40 r108 = r1.j(this.I.g(4));
    L90:
        p6 r156 = r1.k();
        r156.d.i(r8, -1.0f);
        r156.d.i(r7, 1.0f);
        r156.d.i(r108, r52);
        r156.d.i(r211, -r52);
        r1.c(r156);
        r103 = r32;
        r134 = r4;
    L89:
        r211 = r1.j(this.I.g(3));
        r108 = r1.j(this.I.g(5));
        goto L90
    L91:
        r134 = r4;
        r152 = r402;
        r103 = true;
    L32:
        if (r16 == false) goto L31;
        if (r17 == true) goto L31;
        r402 = r132;
        r133 = 8;
        r1.e(r7, r9, r37.c(), 8);
        goto L36
    L35:
        r402 = r132;
        r133 = 8;
        goto L36
    L25:
        r132 = r10;
        r102 = r40;
    L17:
        r10 = false;
        goto L23
    L11:
        r3 = r48;
        goto L12
    L5:
        r18 = r16 ? 1 : 0;
        goto L6
    }

    public final void d(int r11, pc r12, int r13, int r14) {
        if (r11 != 7) goto L41;
        if (r13 != 7) goto L32;
        cc r112 = g(2);
        cc r132 = g(4);
        cc r142 = g(3);
        cc r8 = g(5);
        boolean r9 = true;
        if (r112 != null) goto L8;
    L9:
        if (r132 != null) goto L11;
    L13:
        d(2, r12, 2, 0);
        d(4, r12, 4, 0);
        boolean r113 = true;
    L14:
        if (r142 != null) goto L16;
    L17:
        if (r8 != null) goto L19;
    L21:
        d(3, r12, 3, 0);
        d(5, r12, 5, 0);
    L22:
        if (r113 == false) goto L26;
        if (r9 == false) goto L26;
        g(7).a(r12.g(7), 0);
        return;
    L26:
        if (r113 == false) goto L29;
        g(8).a(r12.g(8), 0);
        return;
    L29:
        if (r9 == false) goto L91;
        g(9).a(r12.g(9), 0);
        return;
    L91:
        return;
    L19:
        if (r8.f() == false) goto L21;
    L20:
        r9 = false;
        goto L22
    L16:
        if (r142.f() == true) goto L20;
    L11:
        if (r132.f() == false) goto L13;
    L12:
        r113 = false;
        goto L14
    L8:
        if (r112.f() == true) goto L12;
    L32:
        if (r13 == 2) goto L39;
        if (r13 == 4) goto L39;
        if (r13 == 3) goto L37;
        if (r13 == 5) goto L37;
        return;
    L37:
        d(3, r12, r13, 0);
        d(5, r12, r13, 0);
        g(7).a(r12.g(r13), 0);
        return;
    L39:
        d(2, r12, r13, 0);
        d(4, r12, r13, 0);
        g(7).a(r12.g(r13), 0);
        return;
    L41:
        if (r11 != 8) goto L46;
        if (r13 == 2) goto L44;
        if (r13 != 4) goto L46;
    L44:
        cc r114 = g(2);
        cc r122 = r12.g(r13);
        cc r133 = g(4);
        r114.a(r122, 0);
        r133.a(r122, 0);
        g(8).a(r122, 0);
        return;
    L46:
        if (r11 != 9) goto L51;
        if (r13 == 3) goto L49;
        if (r13 != 5) goto L51;
    L49:
        cc r115 = r12.g(r13);
        g(3).a(r115, 0);
        g(5).a(r115, 0);
        g(9).a(r115, 0);
        return;
    L51:
        if (r11 != 8) goto L55;
        if (r13 != 8) goto L55;
        g(2).a(r12.g(2), 0);
        g(4).a(r12.g(4), 0);
        g(8).a(r12.g(r13), 0);
        return;
    L55:
        if (r11 != 9) goto L59;
        if (r13 != 9) goto L59;
        g(3).a(r12.g(3), 0);
        g(5).a(r12.g(5), 0);
        g(9).a(r12.g(r13), 0);
        return;
    L59:
        cc r82 = g(r11);
        cc r123 = r12.g(r13);
        if (r82.g(r123) == true) goto L62;
        return;
    L62:
        if (r11 != 6) goto L69;
        cc r116 = g(3);
        cc r134 = g(5);
        if (r116 == null) goto L66;
        r116.h();
    L66:
        if (r134 == null) goto L68;
        r134.h();
    L68:
        r14 = 0;
    L89:
        r82.a(r123, r14);
        return;
    L69:
        if (r11 == 3) goto L80;
        if (r11 == 5) goto L80;
        if (r11 == 2) goto L74;
        if (r11 != 4) goto L89;
    L74:
        cc r135 = g(7);
        if (r135.d == r123) goto L77;
        r135.h();
    L77:
        cc r117 = g(r11).d();
        cc r136 = g(8);
        if (r136.f() == false) goto L89;
        r117.h();
        r136.h();
    L80:
        cc r137 = g(6);
        if (r137 == null) goto L83;
        r137.h();
    L83:
        cc r138 = g(7);
        if (r138.d == r123) goto L86;
        r138.h();
    L86:
        cc r118 = g(r11).d();
        cc r139 = g(9);
        if (r139.f() == false) goto L89;
        r118.h();
        r139.h();
        goto L89
    }

    public final void e(cc r2, cc r3, int r4) {
        if (r2.b != this) goto L6;
        d(r2.c, r3.b, r3.c, r4);
        return;
    }

    public final void f(ar r2) {
        r2.j(this.x);
        r2.j(this.y);
        r2.j(this.z);
        r2.j(this.A);
        if (this.P <= 0) goto L6;
        r2.j(this.B);
        return;
    }

    public cc g(int r2) {
        switch(z30.t(r2)) {
            case 0: goto L22;
            case 1: goto L21;
            case 2: goto L19;
            case 3: goto L17;
            case 4: goto L15;
            case 5: goto L13;
            case 6: goto L11;
            case 7: goto L9;
            case 8: goto L7;
            default: goto L5;
        };
    L22:
        return null;
    L5:
        throw new AssertionError(z30.s(r2));
    L7:
        return this.D;
    L9:
        return this.C;
    L11:
        return this.E;
    L13:
        return this.B;
    L15:
        return this.A;
    L17:
        return this.z;
    L19:
        return this.y;
    L21:
        return this.x;
    }

    public final int h(int r4) {
        int[] r1 = this.c0;
        if (r4 != 0) goto L7;
        return r1[0];
    L7:
        if (r4 == 1) goto L9;
        return 0;
    L9:
        return r1[1];
    }

    public final int i() {
        if (this.V != 8) goto L7;
        return 0;
    L7:
        return this.K;
    }

    public final pc j(int r3) {
        if (r3 != 0) goto L10;
        cc r32 = this.z;
        cc r0 = r32.d;
        if (r0 != null) goto L6;
        return null;
    L6:
        if (r0.d == r32) goto L8;
        return null;
    L8:
        return r0.b;
    L10:
        if (r3 != 1) goto L20;
        cc r33 = this.A;
        cc r02 = r33.d;
        if (r02 != null) goto L14;
        return null;
    L14:
        if (r02.d == r33) goto L16;
        return null;
    L16:
        return r02.b;
    L20:
        return null;
    }

    public final pc k(int r3) {
        if (r3 != 0) goto L10;
        cc r32 = this.x;
        cc r0 = r32.d;
        if (r0 != null) goto L6;
        return null;
    L6:
        if (r0.d == r32) goto L8;
        return null;
    L8:
        return r0.b;
    L10:
        if (r3 != 1) goto L20;
        cc r33 = this.y;
        cc r02 = r33.d;
        if (r02 != null) goto L14;
        return null;
    L14:
        if (r02.d == r33) goto L16;
        return null;
    L16:
        return r02.b;
    L20:
        return null;
    }

    public final int l() {
        if (this.V != 8) goto L7;
        return 0;
    L7:
        return this.J;
    }

    public final int m() {
        pc r0 = this.I;
        if (r0 == null) goto L9;
        if ((r0 instanceof qc) == false) goto L9;
        return ((qc) r0).j0 + this.N;
    L9:
        return this.N;
    }

    public final int n() {
        pc r0 = this.I;
        if (r0 == null) goto L9;
        if ((r0 instanceof qc) == false) goto L9;
        return ((qc) r0).k0 + this.O;
    L9:
        return this.O;
    }

    public final void o(int r1, int r2, int r3, int r4, pc r5) {
        g(r1).b(r5.g(r2), r3, r4, true);
    }

    public final boolean p(int r4) {
        int r42 = r4 * 2;
        cc[] r0 = this.F;
        cc r1 = r0[r42];
        cc r2 = r1.d;
        if (r2 != null) goto L5;
        return false;
    L5:
        if (r2.d == r1) goto L13;
        cc r43 = r0[r42 + 1];
        cc r02 = r43.d;
        if (r02 != null) goto L9;
        return false;
    L9:
        if (r02.d != r43) goto L15;
        return true;
    L15:
        return false;
    L13:
        return false;
    }

    public final boolean q() {
        cc r0 = this.x;
        cc r1 = r0.d;
        if (r1 != null) goto L5;
    L6:
        cc r02 = this.z;
        cc r12 = r02.d;
        if (r12 != null) goto L9;
        return false;
    L9:
        if (r12.d != r02) goto L15;
        return true;
    L15:
        return false;
    L5:
        if (r1.d != r0) goto L6;
        return true;
    }

    public final boolean r() {
        cc r0 = this.y;
        cc r1 = r0.d;
        if (r1 != null) goto L5;
    L6:
        cc r02 = this.A;
        cc r12 = r02.d;
        if (r12 != null) goto L9;
        return false;
    L9:
        if (r12.d != r02) goto L15;
        return true;
    L15:
        return false;
    L5:
        if (r1.d != r0) goto L6;
        return true;
    }

    public void s() {
        this.x.h();
        this.y.h();
        this.z.h();
        this.A.h();
        this.B.h();
        this.C.h();
        this.D.h();
        this.E.h();
        this.I = null;
        this.v = 0.0f;
        this.J = 0;
        this.K = 0;
        this.L = 0.0f;
        this.M = -1;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0.5f;
        this.T = 0.5f;
        int[] r3 = this.c0;
        r3[0] = 1;
        r3[1] = 1;
        this.U = null;
        this.V = 0;
        this.X = 0;
        this.Y = 0;
        float[] r0 = this.Z;
        r0[0] = -1.0f;
        r0[1] = -1.0f;
        this.h = -1;
        this.i = -1;
        int[] r02 = this.u;
        r02[0] = Integer.MAX_VALUE;
        r02[1] = Integer.MAX_VALUE;
        this.j = 0;
        this.k = 0;
        this.o = 1.0f;
        this.r = 1.0f;
        this.n = Integer.MAX_VALUE;
        this.q = Integer.MAX_VALUE;
        this.m = 0;
        this.p = 0;
        this.s = -1;
        this.t = 1.0f;
        boolean[] r03 = this.f;
        r03[0] = true;
        r03[1] = true;
        boolean[] r04 = this.H;
        r04[0] = false;
        r04[1] = false;
    }

    public final void t() {
        pc r0 = this.I;
        if (r0 != null) goto L5;
    L7:
        ArrayList r02 = this.G;
        int r1 = r02.size();
        int r2 = 0;
    L8:
        if (r2 >= r1) goto L10;
        ((cc) r02.get(r2)).h();
        r2 = r2 + 1;
        goto L8
    L10:
        return;
    L5:
        if ((r0 instanceof qc) == false) goto L7;
        ((qc) r0).getClass();
        goto L7
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder();
        String r1 = "";
        r0.append("");
        if (this.W == null) goto L5;
        r1 = z30.l(new StringBuilder("id: "), this.W, " ");
    L5:
        r0.append(r1);
        r0.append("(");
        r0.append(this.N);
        r0.append(", ");
        r0.append(this.O);
        r0.append(") - (");
        r0.append(this.J);
        r0.append(" x ");
        r0.append(this.K);
        r0.append(")");
        return r0.toString();
    }

    public void u(a8 r1) {
        this.x.i();
        this.y.i();
        this.z.i();
        this.A.i();
        this.B.i();
        this.E.i();
        this.C.i();
        this.D.i();
    }

    public final void v(int r2) {
        this.K = r2;
        int r0 = this.R;
        if (r2 >= r0) goto L6;
        this.K = r0;
        return;
    }

    public final void w(int r3) {
        this.c0[0] = r3;
    }

    public final void x(int r3) {
        this.c0[1] = r3;
    }

    public final void y(int r2) {
        this.J = r2;
        int r0 = this.Q;
        if (r2 >= r0) goto L6;
        this.J = r0;
        return;
    }

    public void z(boolean r8, boolean r9) {
        po r0 = this.d;
        boolean r82 = r8 & r0.g;
        m90 r1 = this.e;
        boolean r92 = r9 & r1.g;
        int r2 = r0.h.g;
        int r3 = r1.h.g;
        int r02 = r0.i.g;
        int r12 = r1.i.g;
        int r5 = r12 - r3;
        if ((r02 - r2) < 0) goto L15;
        if (r5 < 0) goto L15;
        if (r2 == Integer.MIN_VALUE) goto L15;
        if (r2 == Integer.MAX_VALUE) goto L15;
        if (r3 == Integer.MIN_VALUE) goto L15;
        if (r3 == Integer.MAX_VALUE) goto L15;
        if (r02 == Integer.MIN_VALUE) goto L15;
        if (r02 == Integer.MAX_VALUE) goto L15;
        if (r12 == Integer.MIN_VALUE) goto L15;
        if (r12 == Integer.MAX_VALUE) goto L15;
    L16:
        int r03 = r02 - r2;
        int r13 = r12 - r3;
        if (r82 == false) goto L19;
        this.N = r2;
    L19:
        if (r92 == false) goto L22;
        this.O = r3;
    L22:
        if (this.V != 8) goto L25;
        this.J = 0;
        this.K = 0;
        return;
    L25:
        int[] r32 = this.c0;
        if (r82 == true) goto L28;
    L35:
        if (r92 == true) goto L37;
        return;
    L37:
        if (r32[1] != 1) goto L41;
        int r83 = this.K;
        if (r13 >= r83) goto L41;
        r13 = r83;
    L41:
        this.K = r13;
        int r84 = this.R;
        if (r13 >= r84) goto L46;
        this.K = r84;
        return;
    L46:
        return;
    L28:
        if (r32[0] != 1) goto L32;
        int r85 = this.J;
        if (r03 >= r85) goto L32;
        r03 = r85;
    L32:
        this.J = r03;
        int r86 = this.Q;
        if (r03 >= r86) goto L35;
        this.J = r86;
    L15:
        r02 = 0;
        r12 = 0;
        r2 = 0;
        r3 = 0;
        goto L16
    }
}
