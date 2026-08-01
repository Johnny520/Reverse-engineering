package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ar {
    public static int o = 1000;
    public static boolean p = true;
    public int a;
    public final zx b;
    public int c;
    public int d;
    public p6[] e;
    public boolean f;
    public boolean[] g;
    public int h;
    public int i;
    public int j;
    public final a8 k;
    public a40[] l;
    public int m;
    public p6 n;

    public ar() {
        this.a = 0;
        this.c = 32;
        this.d = 32;
        this.e = null;
        this.f = false;
        this.g = new boolean[32];
        this.h = 1;
        this.i = 0;
        this.j = 32;
        this.l = new a40[o];
        this.m = 0;
        this.e = new p6[32];
        q();
        a8 r2 = new a8();
        r2.a = new sx();
        r2.b = new sx();
        r2.c = new sx();
        r2.d = new a40[32];
        this.k = r2;
        zx r1 = new zx(r2);
        r1.f = new a40[128];
        r1.g = new a40[128];
        r1.h = 0;
        r1.i = new yx(r1);
        this.b = r1;
        if (p == false) goto L6;
        this.n = new zq(r2);
        return;
    L6:
        this.n = new p6(r2);
    }

    public static int m(Object r1) {
        a40 r12 = ((cc) r1).g;
        if (r12 != null) goto L5;
        return 0;
    L5:
        return (int) (r12.e + 0.5f);
    }

    public final a40 a(int r4) {
        a40 r0 = (a40) ((sx) this.k.c).a();
        if (r0 != null) goto L5;
        r0 = new a40(r4);
        r0.l = r4;
    L6:
        int r42 = this.m;
        int r1 = o;
        if (r42 < r1) goto L9;
        int r12 = r1 * 2;
        o = r12;
        this.l = (a40[]) Arrays.copyOf(this.l, r12);
    L9:
        a40[] r43 = this.l;
        int r13 = this.m;
        this.m = r13 + 1;
        r43[r13] = r0;
        return r0;
    L5:
        r0.c();
        r0.l = r4;
        goto L6
    }

    public final void b(a40 r7, a40 r8, int r9, float r10, a40 r11, a40 r12, int r13, int r14) {
        p6 r0 = k();
        if (r8 != r11) goto L6;
        r0.d.i(r7, 1.0f);
        r0.d.i(r12, 1.0f);
        r0.d.i(r8, -2.0f);
    L22:
        if (r14 == 8) goto L24;
        r0.a(this, r14);
    L24:
        c(r0);
        return;
    L6:
        if (r10 != 0.5f) goto L12;
        r0.d.i(r7, 1.0f);
        r0.d.i(r8, -1.0f);
        r0.d.i(r11, -1.0f);
        r0.d.i(r12, 1.0f);
        if (r9 > 0) goto L10;
        if (r13 <= 0) goto L22;
    L10:
        r0.b = (-r9) + r13;
        goto L22
    L12:
        if (r10 > 0.0f) goto L15;
        r0.d.i(r7, -1.0f);
        r0.d.i(r8, 1.0f);
        r0.b = r9;
        goto L22
    L15:
        if (r10 < 1.0f) goto L17;
        r0.d.i(r12, -1.0f);
        r0.d.i(r11, 1.0f);
        r0.b = -r13;
        goto L22
    L17:
        float r4 = 1.0f - r10;
        r0.d.i(r7, r4 * 1.0f);
        r0.d.i(r8, r4 * (-1.0f));
        r0.d.i(r11, (-1.0f) * r10);
        r0.d.i(r12, 1.0f * r10);
        if (r9 > 0) goto L20;
        if (r13 <= 0) goto L22;
    L20:
        r0.b = (r13 * r10) + ((-r9) * r4);
        goto L22
    }

    public final void c(p6 r18) {
        if ((this.i + 1) < this.j) goto L5;
    L6:
        n();
    L8:
        if (r18.e == true) goto L118;
        ArrayList r2 = r18.c;
        if (this.e.length == 0) goto L32;
        boolean r5 = false;
    L13:
        if (r5 == true) goto L32;
        int r7 = r18.d.k();
        int r8 = 0;
    L15:
        if (r8 >= r7) goto L23;
        a40 r9 = r18.d.e(r8);
        if (r9.c == (-1)) goto L19;
    L20:
        r2.add(r9);
    L21:
        r8 = r8 + 1;
        goto L15
    L19:
        if (r9.f == false) goto L21;
    L23:
        if (r2.size() > 0) goto L24;
        r5 = true;
        goto L13
    L24:
        int r72 = r2.size();
        int r82 = 0;
    L25:
        if (r82 >= r72) goto L30;
        Object r92 = r2.get(r82);
        r82 = r82 + 1;
        a40 r93 = (a40) r92;
        if (r93.f == true) goto L28;
        r18.h(this.e[r93.c], true);
        goto L25
    L28:
        r18.g(r93, true);
        goto L25
    L30:
        r2.clear();
    L32:
        float r52 = 0.0f;
        if (r18.a == null) goto L35;
    L39:
        float r22 = r18.b;
        if (r22 >= 0.0f) goto L42;
        r18.b = r22 * (-1.0f);
        r18.d.j();
    L42:
        int r23 = r18.d.k();
        float r11 = 0.0f;
        float r13 = 0.0f;
        a40 r94 = null;
        a40 r10 = null;
        int r83 = 0;
        boolean r12 = false;
        boolean r14 = false;
    L43:
        if (r83 >= r23) goto L80;
        float r15 = r18.d.a(r83);
        a40 r4 = r18.d.e(r83);
        float r16 = r52;
        if (r4.l != 1) goto L61;
        if (r94 != null) goto L53;
        if (r4.k <= 1) goto L60;
    L50:
        r12 = false;
    L51:
        r94 = r4;
        r11 = r15;
    L79:
        r83 = r83 + 1;
        r52 = r16;
    L60:
        r12 = true;
        goto L51
    L53:
        if (r11 > r15) goto L55;
        if (r12 == true) goto L79;
        if (r4.k > 1) goto L79;
    L55:
        if (r4.k > 1) goto L50;
    L61:
        if (r94 != null) goto L79;
        if (r15 >= r16) goto L79;
        if (r10 != null) goto L71;
        if (r4.k <= 1) goto L78;
    L68:
        r14 = false;
    L69:
        r10 = r4;
        r13 = r15;
    L78:
        r14 = true;
        goto L69
    L71:
        if (r13 > r15) goto L73;
        if (r14 == true) goto L79;
        if (r4.k > 1) goto L79;
    L73:
        if (r4.k > 1) goto L68;
    L80:
        float r162 = r52;
        if (r94 != null) goto L84;
        r94 = r10;
    L84:
        if (r94 != null) goto L86;
        boolean r24 = true;
    L88:
        if (r18.d.k() != 0) goto L90;
        r18.e = true;
    L90:
        if (r24 == true) goto L92;
        boolean r42 = false;
    L111:
        a40 r25 = r18.a;
        if (r25 != null) goto L114;
        return;
    L114:
        if (r25.l != 1) goto L116;
    L119:
        if (r42 == true) goto L149;
        h(r18);
        return;
    L149:
        return;
    L116:
        if (r18.b >= r162) goto L119;
        return;
    L92:
        if ((this.h + 1) < this.d) goto L94;
        n();
    L94:
        a40 r26 = a(3);
        int r43 = this.a + 1;
        this.a = r43;
        this.h++;
        r26.b = r43;
        ((a40[]) this.k.d)[r43] = r26;
        r18.a = r26;
        h(r18);
        p6 r44 = this.n;
        r44.a = null;
        r44.d.clear();
        int r53 = 0;
    L96:
        if (r53 >= r18.d.k()) goto L98;
        r44.d.f(r18.d.e(r53), r18.d.a(r53), true);
        r53 = r53 + 1;
        goto L96
    L98:
        p(this.n);
        if (r26.c == (-1)) goto L101;
    L109:
        r42 = true;
        goto L111
    L101:
        if (r18.a != r26) goto L106;
        a40 r27 = r18.e(null, r26);
        if (r27 == null) goto L106;
        r18.f(r27);
    L106:
        if (r18.e == true) goto L108;
        r18.a.d(r18);
    L108:
        this.i--;
        goto L109
    L86:
        r18.f(r94);
        r24 = false;
        goto L88
    L35:
        if (r18.b != 0.0f) goto L39;
        if (r18.d.k() != 0) goto L39;
        return;
    L118:
        r42 = false;
        goto L119
    L5:
        if ((this.h + 1) < this.d) goto L8;
        goto L6
    }

    public final void d(a40 r5, int r6) {
        int r0 = r5.c;
        if (r0 != (-1)) goto L9;
        r5.e = r6;
        r5.f = true;
        int r62 = r5.j;
        int r1 = 0;
    L5:
        if (r1 >= r62) goto L7;
        r5.i[r1].g(r5, false);
        r1 = r1 + 1;
        goto L5
    L7:
        r5.j = 0;
        return;
    L9:
        if (r0 == (-1)) goto L24;
        p6 r02 = this.e[r0];
        if (r02.e == false) goto L15;
        r02.b = r6;
        return;
    L15:
        if (r02.d.k() != 0) goto L18;
        r02.e = true;
        r02.b = r6;
        return;
    L18:
        p6 r03 = k();
        if (r6 >= 0) goto L21;
        r03.b = r6 * (-1);
        r03.d.i(r5, 1.0f);
    L22:
        c(r03);
        return;
    L21:
        r03.b = r6;
        r03.d.i(r5, -1.0f);
        goto L22
    L24:
        p6 r04 = k();
        r04.a = r5;
        float r63 = r6;
        r5.e = r63;
        r04.b = r63;
        r04.e = true;
        c(r04);
    }

    public final void e(a40 r6, a40 r7, int r8, int r9) {
        boolean r0 = false;
        if (r9 == 8) goto L5;
    L13:
        p6 r3 = k();
        if (r8 == 0) goto L19;
        if (r8 >= 0) goto L17;
        r8 = r8 * (-1);
        r0 = true;
    L17:
        r3.b = r8;
    L19:
        if (r0 == true) goto L21;
        r3.d.i(r6, -1.0f);
        r3.d.i(r7, 1.0f);
    L22:
        if (r9 == 8) goto L24;
        r3.a(this, r9);
    L24:
        c(r3);
        return;
    L21:
        r3.d.i(r6, 1.0f);
        r3.d.i(r7, -1.0f);
        goto L22
    L5:
        if (r7.f == false) goto L13;
        if (r6.c != (-1)) goto L13;
        r6.e = r7.e + r8;
        r6.f = true;
        int r72 = r6.j;
        int r82 = 0;
    L9:
        if (r82 >= r72) goto L11;
        r6.i[r82].g(r6, false);
        r82 = r82 + 1;
        goto L9
    L11:
        r6.j = 0;
    }

    public final void f(a40 r4, a40 r5, int r6, int r7) {
        p6 r0 = k();
        a40 r1 = l();
        r1.d = 0;
        r0.b(r4, r5, r1, r6);
        if (r7 == 8) goto L5;
        int r42 = (int) (r0.d.b(r1) * (-1.0f));
        r0.d.i(i(r7), r42);
    L5:
        c(r0);
    }

    public final void g(a40 r4, a40 r5, int r6, int r7) {
        p6 r0 = k();
        a40 r1 = l();
        r1.d = 0;
        r0.c(r4, r5, r1, r6);
        if (r7 == 8) goto L5;
        int r42 = (int) (r0.d.b(r1) * (-1.0f));
        r0.d.i(i(r7), r42);
    L5:
        c(r0);
    }

    public final void h(p6 r4) {
        boolean r0 = p;
        a8 r1 = this.k;
        if (r0 == false) goto L7;
        p6 r02 = this.e[this.i];
        if (r02 == null) goto L10;
        ((sx) r1.a).b(r02);
    L10:
        p6[] r03 = this.e;
        int r12 = this.i;
        r03[r12] = r4;
        a40 r04 = r4.a;
        r04.c = r12;
        this.i = r12 + 1;
        r04.d(r4);
        return;
    L7:
        p6 r05 = this.e[this.i];
        if (r05 == null) goto L10;
        ((sx) r1.b).b(r05);
        goto L10
    }

    public final a40 i(int r5) {
        if ((this.h + 1) < this.d) goto L5;
        n();
    L5:
        a40 r0 = a(4);
        float[] r1 = r0.h;
        int r2 = this.a + 1;
        this.a = r2;
        this.h++;
        r0.b = r2;
        r0.d = r5;
        ((a40[]) this.k.d)[r2] = r0;
        zx r52 = this.b;
        r52.i.a = r0;
        Arrays.fill(r1, 0.0f);
        r1[r0.d] = 1.0f;
        r52.i(r0);
        return r0;
    }

    public final a40 j(Object r6) {
        if (r6 != null) goto L5;
        return null;
    L5:
        if ((this.h + 1) < this.d) goto L8;
        n();
    L8:
        if ((r6 instanceof cc) == false) goto L24;
        cc r62 = (cc) r6;
        a40 r0 = r62.g;
        if (r0 != null) goto L12;
        r62.i();
        r0 = r62.g;
    L12:
        int r63 = r0.b;
        a8 r3 = this.k;
        if (r63 != (-1)) goto L15;
    L20:
        if (r63 == (-1)) goto L22;
        r0.c();
    L22:
        int r64 = this.a + 1;
        this.a = r64;
        this.h++;
        r0.b = r64;
        r0.l = 1;
        ((a40[]) r3.d)[r64] = r0;
        return r0;
    L15:
        if (r63 > this.a) goto L20;
        if (((a40[]) r3.d)[r63] == null) goto L20;
        return r0;
    L24:
        return null;
    }

    public final p6 k() {
        boolean r0 = p;
        a8 r4 = this.k;
        if (r0 == false) goto L8;
        p6 r02 = (p6) ((sx) r4.a).a();
        if (r02 == null) goto L13;
        r02.a = null;
        r02.d.clear();
        r02.b = 0.0f;
        r02.e = false;
        return r02;
    L13:
        return new zq(r4);
    L8:
        p6 r03 = (p6) ((sx) r4.b).a();
        if (r03 == null) goto L15;
        r03.a = null;
        r03.d.clear();
        r03.b = 0.0f;
        r03.e = false;
        return r03;
    L15:
        return new p6(r4);
    }

    public final a40 l() {
        if ((this.h + 1) < this.d) goto L5;
        n();
    L5:
        a40 r0 = a(3);
        int r1 = this.a + 1;
        this.a = r1;
        this.h++;
        r0.b = r1;
        ((a40[]) this.k.d)[r1] = r0;
        return r0;
    }

    public final void n() {
        int r0 = this.c * 2;
        this.c = r0;
        this.e = (p6[]) Arrays.copyOf(this.e, r0);
        a8 r02 = this.k;
        r02.d = (a40[]) Arrays.copyOf((a40[]) r02.d, this.c);
        int r03 = this.c;
        this.g = new boolean[r03];
        this.d = r03;
        this.j = r03;
    }

    public final void o(zx r19) {
        int r2 = 0;
    L4:
        if (r2 >= this.i) goto L48;
        p6 r3 = this.e[r2];
        int r5 = 1;
        if (r3.a.l == 1) goto L47;
        float r4 = 0.0f;
        if (r3.b >= 0.0f) goto L47;
        boolean r22 = false;
        int r32 = 0;
    L11:
        if (r22 == true) goto L48;
        r32 = r32 + r5;
        float r7 = Float.MAX_VALUE;
        int r9 = -1;
        int r10 = -1;
        int r8 = 0;
        int r11 = 0;
    L13:
        int r12 = this.i;
        a8 r13 = this.k;
        if (r8 >= r12) goto L40;
        p6 r122 = this.e[r8];
        if (r122.a.l == r5) goto L39;
        if (r122.e == true) goto L39;
        if (r122.b >= r4) goto L39;
        int r14 = r5;
    L25:
        if (r14 >= this.h) goto L39;
        a40 r15 = ((a40[]) r13.d)[r14];
        float r1 = r122.d.b(r15);
        if (r1 <= r4) goto L38;
        int r42 = 0;
    L31:
        if (r42 >= 9) goto L38;
        float r52 = r15.g[r42] / r1;
        if (r52 >= r7) goto L35;
        if (r42 != r11) goto L35;
    L36:
        r11 = r42;
        r7 = r52;
        r9 = r8;
        r10 = r14;
    L37:
        r42 = r42 + 1;
    L35:
        if (r42 <= r11) goto L37;
    L38:
        r14 = r14 + 1;
        r4 = 0.0f;
    L39:
        r8 = r8 + 1;
        r4 = 0.0f;
        r5 = 1;
        goto L13
    L40:
        if (r9 == (-1)) goto L42;
        p6 r16 = this.e[r9];
        r16.a.c = -1;
        r16.f(((a40[]) r13.d)[r10]);
        a40 r43 = r16.a;
        r43.c = r9;
        r43.d(r16);
    L44:
        if (r32 <= (this.h / 2)) goto L46;
        r22 = true;
    L46:
        r4 = 0.0f;
        r5 = 1;
        goto L11
    L42:
        r22 = true;
    L47:
        r2 = r2 + 1;
    L48:
        p(r19);
        int r17 = 0;
    L50:
        if (r17 >= this.i) goto L52;
        p6 r23 = this.e[r17];
        r23.a.e = r23.b;
        r17 = r17 + 1;
        goto L50
    }

    public final void p(p6 r13) {
        int r1 = 0;
    L4:
        if (r1 >= this.h) goto L6;
        this.g[r1] = false;
        r1 = r1 + 1;
        goto L4
    L6:
        boolean r12 = false;
        int r2 = 0;
    L7:
        if (r12 == true) goto L41;
        r2 = r2 + 1;
        if (r2 >= (this.h * 2)) goto L60;
        a40 r4 = r13.a;
        if (r4 == null) goto L14;
        this.g[r4.b] = true;
    L14:
        a40 r42 = r13.d(this.g);
        if (r42 == null) goto L20;
        boolean[] r5 = this.g;
        int r6 = r42.b;
        if (r5[r6] == true) goto L61;
        r5[r6] = true;
        goto L20
    L61:
        return;
    L20:
        if (r42 != null) goto L21;
        r12 = true;
        goto L7
    L21:
        float r62 = Float.MAX_VALUE;
        int r7 = 0;
        int r8 = -1;
    L23:
        if (r7 >= this.i) goto L38;
        p6 r9 = this.e[r7];
        if (r9.a.l == 1) goto L37;
        if (r9.e == true) goto L37;
        if (r9.d.c(r42) == false) goto L37;
        float r10 = r9.d.b(r42);
        if (r10 >= 0.0f) goto L37;
        float r92 = (-r9.b) / r10;
        if (r92 >= r62) goto L37;
        r8 = r7;
        r62 = r92;
    L37:
        r7 = r7 + 1;
        goto L23
    L38:
        if (r8 <= (-1)) goto L7;
        p6 r3 = this.e[r8];
        r3.a.c = -1;
        r3.f(r42);
        a40 r43 = r3.a;
        r43.c = r8;
        r43.d(r3);
        goto L7
    L60:
        return;
    }

    public final void q() {
        boolean r0 = p;
        a8 r2 = this.k;
        int r3 = 0;
        if (r0 == false) goto L10;
    L4:
        p6[] r02 = this.e;
        if (r3 >= r02.length) goto L16;
        p6 r03 = r02[r3];
        if (r03 == null) goto L9;
        ((sx) r2.a).b(r03);
    L9:
        this.e[r3] = null;
        r3 = r3 + 1;
        goto L4
    L16:
        return;
    L10:
        p6[] r04 = this.e;
        if (r3 >= r04.length) goto L23;
        p6 r05 = r04[r3];
        if (r05 == null) goto L15;
        ((sx) r2.b).b(r05);
    L15:
        this.e[r3] = null;
        r3 = r3 + 1;
        goto L10
    }

    public final void r() {
        int r1 = 0;
    L3:
        a8 r2 = this.k;
        a40[] r3 = (a40[]) r2.d;
        if (r1 >= r3.length) goto L9;
        a40 r22 = r3[r1];
        if (r22 == null) goto L8;
        r22.c();
    L8:
        r1 = r1 + 1;
        goto L3
    L9:
        sx r12 = (sx) r2.c;
        a40[] r32 = this.l;
        int r4 = this.m;
        r12.getClass();
        if (r4 <= r32.length) goto L12;
        r4 = r32.length;
    L12:
        int r5 = 0;
    L13:
        if (r5 >= r4) goto L18;
        a40 r6 = r32[r5];
        int r7 = r12.c;
        Object[] r8 = r12.b;
        if (r7 >= r8.length) goto L17;
        r8[r7] = r6;
        r12.c = r7 + 1;
    L17:
        r5 = r5 + 1;
        goto L13
    L18:
        this.m = 0;
        Arrays.fill((a40[]) r2.d, null);
        this.a = 0;
        zx r13 = this.b;
        r13.h = 0;
        r13.b = 0.0f;
        this.h = 1;
        int r14 = 0;
    L20:
        if (r14 >= this.i) goto L22;
        this.e[r14].getClass();
        r14 = r14 + 1;
        goto L20
    L22:
        q();
        this.i = 0;
        if (p == false) goto L26;
        this.n = new zq(r2);
        return;
    L26:
        this.n = new p6(r2);
    }
}
