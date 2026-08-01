package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qb0 implements hg {
    public int a;
    public pc b;
    public j10 c;
    public int d;
    public final sg e;
    public int f;
    public boolean g;
    public final jg h;
    public final jg i;
    public int j;

    public qb0(pc r2) {
        this.e = new sg(this);
        this.f = 0;
        this.g = false;
        this.h = new jg(this);
        this.i = new jg(this);
        this.j = 1;
        this.b = r2;
    }

    public static void b(jg r1, jg r2, int r3) {
        r1.l.add(r2);
        r1.f = r3;
        r2.k.add(r1);
    }

    public static jg h(cc r3) {
        cc r32 = r3.d;
        if (r32 == null) goto L27;
        pc r0 = r32.b;
        po r1 = r0.d;
        m90 r02 = r0.e;
        int r33 = z30.t(r32.c);
        if (r33 == 1) goto L26;
        if (r33 == 2) goto L24;
        if (r33 == 3) goto L22;
        if (r33 == 4) goto L20;
        if (r33 == 5) goto L18;
        return null;
    L18:
        return r02.k;
    L20:
        return r02.i;
    L22:
        return r1.i;
    L24:
        return r02.h;
    L26:
        return r1.h;
    L27:
        return null;
    }

    public static jg i(cc r1, int r2) {
        cc r12 = r1.d;
        if (r12 == null) goto L23;
        pc r0 = r12.b;
        if (r2 != 0) goto L8;
        qb0 r22 = r0.d;
    L9:
        int r13 = z30.t(r12.c);
        if (r13 == 1) goto L22;
        if (r13 == 2) goto L22;
        if (r13 == 3) goto L20;
        if (r13 == 4) goto L20;
        return null;
    L20:
        return r22.i;
    L22:
        return r22.h;
    L8:
        r22 = r0.e;
        goto L9
    L23:
        return null;
    }

    public final void c(jg r3, jg r4, int r5, sg r6) {
        r3.l.add(r4);
        r3.l.add(this.e);
        r3.h = r5;
        r3.i = r6;
        r4.k.add(r3);
        r6.k.add(r3);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int r2, int r3) {
        if (r3 != 0) goto L8;
        pc r32 = this.b;
        int r0 = r32.n;
        int r33 = Math.max(r32.m, r2);
        if (r0 <= 0) goto L6;
        r33 = Math.min(r0, r2);
    L6:
        if (r33 == r2) goto L13;
        return r33;
    L13:
        return r2;
    L8:
        pc r34 = this.b;
        int r02 = r34.q;
        int r35 = Math.max(r34.p, r2);
        if (r02 <= 0) goto L11;
        r35 = Math.min(r02, r2);
    L11:
        if (r35 == r2) goto L13;
        return r35;
    }

    public long j() {
        if (this.e.j == true) goto L5;
        return 0;
    L5:
        return r0.g;
    }

    public abstract boolean k();

    public final void l(cc r12, cc r13, int r14) {
        jg r0 = h(r12);
        jg r1 = h(r13);
        if (r0.j == true) goto L5;
        return;
    L5:
        if (r1.j == false) goto L66;
        int r122 = r12.c() + r0.g;
        int r2 = r1.g - r13.c();
        int r132 = r2 - r122;
        sg r3 = this.e;
        if (r3.j == true) goto L51;
        if (this.d != 3) goto L51;
        int r4 = this.a;
        if (r4 != 0) goto L14;
        r3.d(g(r132, r14));
        goto L51
    L14:
        if (r4 != 1) goto L16;
        r3.d(Math.min(g(r3.m, r14), r132));
        goto L51
    L16:
        if (r4 == 2) goto L37;
        if (r4 != 3) goto L51;
        pc r42 = this.b;
        qb0 r8 = r42.d;
        m90 r9 = r42.e;
        if (r8.d == 3) goto L22;
    L28:
        if (r14 != 0) goto L31;
        r8 = r9;
    L31:
        if (r8.e.j == false) goto L51;
        float r43 = r42.L;
        if (r14 != 1) goto L35;
        int r44 = (int) ((r6.g / r43) + 0.5f);
    L36:
        r3.d(r44);
        goto L51
    L35:
        r44 = (int) ((r43 * r6.g) + 0.5f);
        goto L36
    L22:
        if (r8.a != 3) goto L28;
        if (r9.d != 3) goto L28;
        if (r9.a != 3) goto L28;
    L37:
        pc r45 = this.b;
        pc r6 = r45.I;
        if (r6 == null) goto L51;
        if (r14 != 0) goto L41;
        qb0 r62 = r6.d;
    L43:
        if (r62.e.j == false) goto L51;
        if (r14 != 0) goto L46;
        float r46 = r45.o;
    L47:
        r3.d(g((int) ((r6.g * r46) + 0.5f), r14));
        goto L51
    L46:
        r46 = r45.r;
        goto L47
    L41:
        r62 = r6.e;
    L51:
        if (r3.j == false) goto L67;
        int r47 = r3.g;
        jg r63 = this.i;
        jg r7 = this.h;
        if (r47 != r132) goto L57;
        r7.d(r122);
        r63.d(r2);
        return;
    L57:
        pc r133 = this.b;
        if (r14 != 0) goto L60;
        float r134 = r133.S;
    L61:
        if (r0 != r1) goto L63;
        r122 = r0.g;
        r2 = r1.g;
        r134 = 0.5f;
    L63:
        r7.d((int) ((((r2 - r122) - r47) * r134) + (r122 + 0.5f)));
        r63.d(r7.g + r3.g);
        return;
    L60:
        r134 = r133.T;
        goto L61
    L67:
        return;
    }
}
