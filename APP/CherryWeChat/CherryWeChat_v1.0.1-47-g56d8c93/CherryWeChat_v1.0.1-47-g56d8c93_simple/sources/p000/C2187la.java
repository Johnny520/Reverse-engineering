package p000;

import java.util.List;

/* JADX INFO: renamed from: la */
/* JADX INFO: loaded from: classes.dex */
public final class C2187la {

    /* JADX INFO: renamed from: a */
    public final AbstractC2140ka f7628a;

    /* JADX INFO: renamed from: b */
    public int f7629b;

    /* JADX INFO: renamed from: c */
    public int f7630c;

    /* JADX INFO: renamed from: d */
    public int f7631d;

    public C2187la(AbstractC2140ka r2) {
        this.f7631d = 0;
        AbstractC0501Ll.m982a("input", r2);
        this.f7628a = r2;
        r2.f7486b = this;
    }

    /* JADX INFO: renamed from: w */
    public static void m4401w(int r0) {
        if ((r0 & 3) != 0) goto L6;
        return;
    L6:
        throw C0673Pl.m1369f();
    }

    /* JADX INFO: renamed from: x */
    public static void m4402x(int r0) {
        if ((r0 & 7) != 0) goto L6;
        return;
    L6:
        throw C0673Pl.m1369f();
    }

    /* JADX INFO: renamed from: a */
    public final int m4403a() {
        int r0 = this.f7631d;
        if (r0 == 0) goto L5;
        this.f7629b = r0;
        this.f7631d = 0;
    L6:
        int r02 = this.f7629b;
        if (r02 != 0) goto L9;
        return Integer.MAX_VALUE;
    L9:
        if (r02 != this.f7630c) goto L12;
        return Integer.MAX_VALUE;
    L12:
        return r02 >>> 3;
    L5:
        this.f7629b = this.f7628a.mo2927B();
        goto L6
    }

    /* JADX INFO: renamed from: b */
    public final void m4404b(Object r3, InterfaceC2253mx r4, C0839Tg r5) {
        int r0 = this.f7630c;
        this.f7630c = ((this.f7629b >>> 3) << 3) | 4;
        r4.mo1079i(r3, this, r5);     // Catch: Throwable -> L9
        if (this.f7629b != this.f7630c) goto L8;
        this.f7630c = r0;
        return;
    L8:
        throw C0673Pl.m1369f();     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        this.f7630c = r0;
        throw th;
    }

    /* JADX INFO: renamed from: c */
    public final void m4405c(Object r5, InterfaceC2253mx r6, C0839Tg r7) {
        AbstractC2140ka r0 = this.f7628a;
        int r1 = r0.mo2928C();
        if (r0.f7485a >= 100) goto L7;
        int r12 = r0.mo2940l(r1);
        r0.f7485a++;
        r6.mo1079i(r5, this, r7);
        r0.mo2936b(0);
        r0.f7485a--;
        r0.mo2939j(r12);
        return;
    L7:
        throw new C0673Pl("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX INFO: renamed from: d */
    public final void m4406d(List r4) {
        boolean r0 = r4 instanceof AbstractC0779S5;
        AbstractC2140ka r2 = this.f7628a;
        if (r0 == false) goto L21;
        AbstractC0779S5 r02 = (AbstractC0779S5) r4;
        int r42 = this.f7629b & 7;
        if (r42 == 0) goto L14;
        if (r42 != 2) goto L13;
        int r43 = r2.mo2928C();
        int r1 = r2.mo2937f() + r43;
    L8:
        r02.m1601b(r2.mo2941m());
        if (r2.mo2937f() < r1) goto L8;
        m4423u(r1);
        return;
    L13:
        throw C0673Pl.m1366c();
    L14:
        r02.m1601b(r2.mo2941m());
        if (r2.mo2938g() == true) goto L33;
        int r44 = r2.mo2927B();
        if (r44 == this.f7629b) goto L14;
        this.f7631d = r44;
        return;
    L33:
        return;
    L21:
        int r03 = this.f7629b & 7;
        if (r03 == 0) goto L31;
        if (r03 != 2) goto L30;
        int r04 = r2.mo2928C();
        int r12 = r2.mo2937f() + r04;
    L25:
        r4.add(Boolean.valueOf(r2.mo2941m()));
        if (r2.mo2937f() < r12) goto L25;
        m4423u(r12);
        return;
    L30:
        throw C0673Pl.m1366c();
    L31:
        r4.add(Boolean.valueOf(r2.mo2941m()));
        if (r2.mo2938g() == true) goto L48;
        int r05 = r2.mo2927B();
        if (r05 == this.f7629b) goto L31;
        this.f7631d = r05;
        return;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC2744y6 m4407e() {
        m4424v(2);
        return this.f7628a.mo2942n();
    }

    /* JADX INFO: renamed from: f */
    public final void m4408f(List r3) {
        if ((this.f7629b & 7) != 2) goto L12;
    L4:
        r3.add(m4407e());
        AbstractC2140ka r0 = this.f7628a;
        if (r0.mo2938g() == true) goto L6;
        int r02 = r0.mo2927B();
        if (r02 == this.f7629b) goto L4;
        this.f7631d = r02;
        return;
    L6:
        return;
    L12:
        throw C0673Pl.m1366c();
    }

    /* JADX INFO: renamed from: g */
    public final void m4409g(List r7) {
        boolean r0 = r7 instanceof AbstractC2191le;
        AbstractC2140ka r3 = this.f7628a;
        if (r0 == false) goto L20;
        AbstractC2191le r02 = (AbstractC2191le) r7;
        int r72 = this.f7629b & 7;
        if (r72 == 1) goto L13;
        if (r72 != 2) goto L12;
        int r73 = r3.mo2928C();
        m4402x(r73);
        int r1 = r3.mo2937f() + r73;
    L8:
        r02.m4426b(r3.mo2943o());
        if (r3.mo2937f() < r1) goto L8;
        return;
    L12:
        throw C0673Pl.m1366c();
    L13:
        r02.m4426b(r3.mo2943o());
        if (r3.mo2938g() == true) goto L46;
        int r74 = r3.mo2927B();
        if (r74 == this.f7629b) goto L13;
        this.f7631d = r74;
        return;
    L46:
        return;
    L20:
        int r03 = this.f7629b & 7;
        if (r03 == 1) goto L29;
        if (r03 != 2) goto L28;
        int r04 = r3.mo2928C();
        m4402x(r04);
        int r12 = r3.mo2937f() + r04;
    L24:
        r7.add(Double.valueOf(r3.mo2943o()));
        if (r3.mo2937f() < r12) goto L24;
        return;
    L28:
        throw C0673Pl.m1366c();
    L29:
        r7.add(Double.valueOf(r3.mo2943o()));
        if (r3.mo2938g() == true) goto L48;
        int r05 = r3.mo2927B();
        if (r05 == this.f7629b) goto L29;
        this.f7631d = r05;
        return;
    }

    /* JADX INFO: renamed from: h */
    public final void m4410h(List r4) {
        boolean r0 = r4 instanceof AbstractC0071Bl;
        AbstractC2140ka r2 = this.f7628a;
        if (r0 == false) goto L21;
        AbstractC0071Bl r02 = (AbstractC0071Bl) r4;
        int r42 = this.f7629b & 7;
        if (r42 == 0) goto L14;
        if (r42 != 2) goto L13;
        int r43 = r2.mo2928C();
        int r1 = r2.mo2937f() + r43;
    L8:
        r02.m119b(r2.mo2944p());
        if (r2.mo2937f() < r1) goto L8;
        m4423u(r1);
        return;
    L13:
        throw C0673Pl.m1366c();
    L14:
        r02.m119b(r2.mo2944p());
        if (r2.mo2938g() == true) goto L33;
        int r44 = r2.mo2927B();
        if (r44 == this.f7629b) goto L14;
        this.f7631d = r44;
        return;
    L33:
        return;
    L21:
        int r03 = this.f7629b & 7;
        if (r03 == 0) goto L31;
        if (r03 != 2) goto L30;
        int r04 = r2.mo2928C();
        int r12 = r2.mo2937f() + r04;
    L25:
        r4.add(Integer.valueOf(r2.mo2944p()));
        if (r2.mo2937f() < r12) goto L25;
        m4423u(r12);
        return;
    L30:
        throw C0673Pl.m1366c();
    L31:
        r4.add(Integer.valueOf(r2.mo2944p()));
        if (r2.mo2938g() == true) goto L48;
        int r05 = r2.mo2927B();
        if (r05 == this.f7629b) goto L31;
        this.f7631d = r05;
        return;
    }

    /* JADX INFO: renamed from: i */
    public final void m4411i(List r6) {
        boolean r0 = r6 instanceof AbstractC0071Bl;
        AbstractC2140ka r3 = this.f7628a;
        if (r0 == false) goto L20;
        AbstractC0071Bl r02 = (AbstractC0071Bl) r6;
        int r62 = this.f7629b & 7;
        if (r62 == 2) goto L16;
        if (r62 != 5) goto L15;
    L7:
        r02.m119b(r3.mo2945q());
        if (r3.mo2938g() == true) goto L35;
        int r63 = r3.mo2927B();
        if (r63 == this.f7629b) goto L7;
        this.f7631d = r63;
        return;
    L35:
        return;
    L15:
        throw C0673Pl.m1366c();
    L16:
        int r64 = r3.mo2928C();
        m4401w(r64);
        int r4 = r3.mo2937f() + r64;
    L17:
        r02.m119b(r3.mo2945q());
        if (r3.mo2937f() < r4) goto L17;
        return;
    L20:
        int r03 = this.f7629b & 7;
        if (r03 == 2) goto L32;
        if (r03 != 5) goto L31;
    L23:
        r6.add(Integer.valueOf(r3.mo2945q()));
        if (r3.mo2938g() == true) goto L47;
        int r04 = r3.mo2927B();
        if (r04 == this.f7629b) goto L23;
        this.f7631d = r04;
        return;
    L47:
        return;
    L31:
        throw C0673Pl.m1366c();
    L32:
        int r05 = r3.mo2928C();
        m4401w(r05);
        int r1 = r3.mo2937f() + r05;
    L33:
        r6.add(Integer.valueOf(r3.mo2945q()));
        if (r3.mo2937f() < r1) goto L33;
    }

    /* JADX INFO: renamed from: j */
    public final void m4412j(List r7) {
        boolean r0 = r7 instanceof AbstractC2382pp;
        AbstractC2140ka r3 = this.f7628a;
        if (r0 == false) goto L20;
        AbstractC2382pp r02 = (AbstractC2382pp) r7;
        int r72 = this.f7629b & 7;
        if (r72 == 1) goto L13;
        if (r72 != 2) goto L12;
        int r73 = r3.mo2928C();
        m4402x(r73);
        int r1 = r3.mo2937f() + r73;
    L8:
        r02.m4821b(r3.mo2946r());
        if (r3.mo2937f() < r1) goto L8;
        return;
    L12:
        throw C0673Pl.m1366c();
    L13:
        r02.m4821b(r3.mo2946r());
        if (r3.mo2938g() == true) goto L46;
        int r74 = r3.mo2927B();
        if (r74 == this.f7629b) goto L13;
        this.f7631d = r74;
        return;
    L46:
        return;
    L20:
        int r03 = this.f7629b & 7;
        if (r03 == 1) goto L29;
        if (r03 != 2) goto L28;
        int r04 = r3.mo2928C();
        m4402x(r04);
        int r12 = r3.mo2937f() + r04;
    L24:
        r7.add(Long.valueOf(r3.mo2946r()));
        if (r3.mo2937f() < r12) goto L24;
        return;
    L28:
        throw C0673Pl.m1366c();
    L29:
        r7.add(Long.valueOf(r3.mo2946r()));
        if (r3.mo2938g() == true) goto L48;
        int r05 = r3.mo2927B();
        if (r05 == this.f7629b) goto L29;
        this.f7631d = r05;
        return;
    }

    /* JADX INFO: renamed from: k */
    public final void m4413k(List r6) {
        boolean r0 = r6 instanceof AbstractC0196Eh;
        AbstractC2140ka r3 = this.f7628a;
        if (r0 == false) goto L20;
        AbstractC0196Eh r02 = (AbstractC0196Eh) r6;
        int r62 = this.f7629b & 7;
        if (r62 == 2) goto L16;
        if (r62 != 5) goto L15;
    L7:
        r02.m389b(r3.mo2947s());
        if (r3.mo2938g() == true) goto L35;
        int r63 = r3.mo2927B();
        if (r63 == this.f7629b) goto L7;
        this.f7631d = r63;
        return;
    L35:
        return;
    L15:
        throw C0673Pl.m1366c();
    L16:
        int r64 = r3.mo2928C();
        m4401w(r64);
        int r4 = r3.mo2937f() + r64;
    L17:
        r02.m389b(r3.mo2947s());
        if (r3.mo2937f() < r4) goto L17;
        return;
    L20:
        int r03 = this.f7629b & 7;
        if (r03 == 2) goto L32;
        if (r03 != 5) goto L31;
    L23:
        r6.add(Float.valueOf(r3.mo2947s()));
        if (r3.mo2938g() == true) goto L47;
        int r04 = r3.mo2927B();
        if (r04 == this.f7629b) goto L23;
        this.f7631d = r04;
        return;
    L47:
        return;
    L31:
        throw C0673Pl.m1366c();
    L32:
        int r05 = r3.mo2928C();
        m4401w(r05);
        int r1 = r3.mo2937f() + r05;
    L33:
        r6.add(Float.valueOf(r3.mo2947s()));
        if (r3.mo2937f() < r1) goto L33;
    }

    /* JADX INFO: renamed from: l */
    public final void m4414l(List r4) {
        boolean r0 = r4 instanceof AbstractC0071Bl;
        AbstractC2140ka r2 = this.f7628a;
        if (r0 == false) goto L21;
        AbstractC0071Bl r02 = (AbstractC0071Bl) r4;
        int r42 = this.f7629b & 7;
        if (r42 == 0) goto L14;
        if (r42 != 2) goto L13;
        int r43 = r2.mo2928C();
        int r1 = r2.mo2937f() + r43;
    L8:
        r02.m119b(r2.mo2948t());
        if (r2.mo2937f() < r1) goto L8;
        m4423u(r1);
        return;
    L13:
        throw C0673Pl.m1366c();
    L14:
        r02.m119b(r2.mo2948t());
        if (r2.mo2938g() == true) goto L33;
        int r44 = r2.mo2927B();
        if (r44 == this.f7629b) goto L14;
        this.f7631d = r44;
        return;
    L33:
        return;
    L21:
        int r03 = this.f7629b & 7;
        if (r03 == 0) goto L31;
        if (r03 != 2) goto L30;
        int r04 = r2.mo2928C();
        int r12 = r2.mo2937f() + r04;
    L25:
        r4.add(Integer.valueOf(r2.mo2948t()));
        if (r2.mo2937f() < r12) goto L25;
        m4423u(r12);
        return;
    L30:
        throw C0673Pl.m1366c();
    L31:
        r4.add(Integer.valueOf(r2.mo2948t()));
        if (r2.mo2938g() == true) goto L48;
        int r05 = r2.mo2927B();
        if (r05 == this.f7629b) goto L31;
        this.f7631d = r05;
        return;
    }

    /* JADX INFO: renamed from: m */
    public final void m4415m(List r6) {
        boolean r0 = r6 instanceof AbstractC2382pp;
        AbstractC2140ka r2 = this.f7628a;
        if (r0 == false) goto L21;
        AbstractC2382pp r02 = (AbstractC2382pp) r6;
        int r62 = this.f7629b & 7;
        if (r62 == 0) goto L14;
        if (r62 != 2) goto L13;
        int r63 = r2.mo2928C();
        int r1 = r2.mo2937f() + r63;
    L8:
        r02.m4821b(r2.mo2949u());
        if (r2.mo2937f() < r1) goto L8;
        m4423u(r1);
        return;
    L13:
        throw C0673Pl.m1366c();
    L14:
        r02.m4821b(r2.mo2949u());
        if (r2.mo2938g() == true) goto L33;
        int r64 = r2.mo2927B();
        if (r64 == this.f7629b) goto L14;
        this.f7631d = r64;
        return;
    L33:
        return;
    L21:
        int r03 = this.f7629b & 7;
        if (r03 == 0) goto L31;
        if (r03 != 2) goto L30;
        int r04 = r2.mo2928C();
        int r12 = r2.mo2937f() + r04;
    L25:
        r6.add(Long.valueOf(r2.mo2949u()));
        if (r2.mo2937f() < r12) goto L25;
        m4423u(r12);
        return;
    L30:
        throw C0673Pl.m1366c();
    L31:
        r6.add(Long.valueOf(r2.mo2949u()));
        if (r2.mo2938g() == true) goto L48;
        int r05 = r2.mo2927B();
        if (r05 == this.f7629b) goto L31;
        this.f7631d = r05;
        return;
    }

    /* JADX INFO: renamed from: n */
    public final void m4416n(List r6) {
        boolean r0 = r6 instanceof AbstractC0071Bl;
        AbstractC2140ka r3 = this.f7628a;
        if (r0 == false) goto L20;
        AbstractC0071Bl r02 = (AbstractC0071Bl) r6;
        int r62 = this.f7629b & 7;
        if (r62 == 2) goto L16;
        if (r62 != 5) goto L15;
    L7:
        r02.m119b(r3.mo2950v());
        if (r3.mo2938g() == true) goto L35;
        int r63 = r3.mo2927B();
        if (r63 == this.f7629b) goto L7;
        this.f7631d = r63;
        return;
    L35:
        return;
    L15:
        throw C0673Pl.m1366c();
    L16:
        int r64 = r3.mo2928C();
        m4401w(r64);
        int r4 = r3.mo2937f() + r64;
    L17:
        r02.m119b(r3.mo2950v());
        if (r3.mo2937f() < r4) goto L17;
        return;
    L20:
        int r03 = this.f7629b & 7;
        if (r03 == 2) goto L32;
        if (r03 != 5) goto L31;
    L23:
        r6.add(Integer.valueOf(r3.mo2950v()));
        if (r3.mo2938g() == true) goto L47;
        int r04 = r3.mo2927B();
        if (r04 == this.f7629b) goto L23;
        this.f7631d = r04;
        return;
    L47:
        return;
    L31:
        throw C0673Pl.m1366c();
    L32:
        int r05 = r3.mo2928C();
        m4401w(r05);
        int r1 = r3.mo2937f() + r05;
    L33:
        r6.add(Integer.valueOf(r3.mo2950v()));
        if (r3.mo2937f() < r1) goto L33;
    }

    /* JADX INFO: renamed from: o */
    public final void m4417o(List r7) {
        boolean r0 = r7 instanceof AbstractC2382pp;
        AbstractC2140ka r3 = this.f7628a;
        if (r0 == false) goto L20;
        AbstractC2382pp r02 = (AbstractC2382pp) r7;
        int r72 = this.f7629b & 7;
        if (r72 == 1) goto L13;
        if (r72 != 2) goto L12;
        int r73 = r3.mo2928C();
        m4402x(r73);
        int r1 = r3.mo2937f() + r73;
    L8:
        r02.m4821b(r3.mo2951w());
        if (r3.mo2937f() < r1) goto L8;
        return;
    L12:
        throw C0673Pl.m1366c();
    L13:
        r02.m4821b(r3.mo2951w());
        if (r3.mo2938g() == true) goto L46;
        int r74 = r3.mo2927B();
        if (r74 == this.f7629b) goto L13;
        this.f7631d = r74;
        return;
    L46:
        return;
    L20:
        int r03 = this.f7629b & 7;
        if (r03 == 1) goto L29;
        if (r03 != 2) goto L28;
        int r04 = r3.mo2928C();
        m4402x(r04);
        int r12 = r3.mo2937f() + r04;
    L24:
        r7.add(Long.valueOf(r3.mo2951w()));
        if (r3.mo2937f() < r12) goto L24;
        return;
    L28:
        throw C0673Pl.m1366c();
    L29:
        r7.add(Long.valueOf(r3.mo2951w()));
        if (r3.mo2938g() == true) goto L48;
        int r05 = r3.mo2927B();
        if (r05 == this.f7629b) goto L29;
        this.f7631d = r05;
        return;
    }

    /* JADX INFO: renamed from: p */
    public final void m4418p(List r4) {
        boolean r0 = r4 instanceof AbstractC0071Bl;
        AbstractC2140ka r2 = this.f7628a;
        if (r0 == false) goto L21;
        AbstractC0071Bl r02 = (AbstractC0071Bl) r4;
        int r42 = this.f7629b & 7;
        if (r42 == 0) goto L14;
        if (r42 != 2) goto L13;
        int r43 = r2.mo2928C();
        int r1 = r2.mo2937f() + r43;
    L8:
        r02.m119b(r2.mo2952x());
        if (r2.mo2937f() < r1) goto L8;
        m4423u(r1);
        return;
    L13:
        throw C0673Pl.m1366c();
    L14:
        r02.m119b(r2.mo2952x());
        if (r2.mo2938g() == true) goto L33;
        int r44 = r2.mo2927B();
        if (r44 == this.f7629b) goto L14;
        this.f7631d = r44;
        return;
    L33:
        return;
    L21:
        int r03 = this.f7629b & 7;
        if (r03 == 0) goto L31;
        if (r03 != 2) goto L30;
        int r04 = r2.mo2928C();
        int r12 = r2.mo2937f() + r04;
    L25:
        r4.add(Integer.valueOf(r2.mo2952x()));
        if (r2.mo2937f() < r12) goto L25;
        m4423u(r12);
        return;
    L30:
        throw C0673Pl.m1366c();
    L31:
        r4.add(Integer.valueOf(r2.mo2952x()));
        if (r2.mo2938g() == true) goto L48;
        int r05 = r2.mo2927B();
        if (r05 == this.f7629b) goto L31;
        this.f7631d = r05;
        return;
    }

    /* JADX INFO: renamed from: q */
    public final void m4419q(List r6) {
        boolean r0 = r6 instanceof AbstractC2382pp;
        AbstractC2140ka r2 = this.f7628a;
        if (r0 == false) goto L21;
        AbstractC2382pp r02 = (AbstractC2382pp) r6;
        int r62 = this.f7629b & 7;
        if (r62 == 0) goto L14;
        if (r62 != 2) goto L13;
        int r63 = r2.mo2928C();
        int r1 = r2.mo2937f() + r63;
    L8:
        r02.m4821b(r2.mo2953y());
        if (r2.mo2937f() < r1) goto L8;
        m4423u(r1);
        return;
    L13:
        throw C0673Pl.m1366c();
    L14:
        r02.m4821b(r2.mo2953y());
        if (r2.mo2938g() == true) goto L33;
        int r64 = r2.mo2927B();
        if (r64 == this.f7629b) goto L14;
        this.f7631d = r64;
        return;
    L33:
        return;
    L21:
        int r03 = this.f7629b & 7;
        if (r03 == 0) goto L31;
        if (r03 != 2) goto L30;
        int r04 = r2.mo2928C();
        int r12 = r2.mo2937f() + r04;
    L25:
        r6.add(Long.valueOf(r2.mo2953y()));
        if (r2.mo2937f() < r12) goto L25;
        m4423u(r12);
        return;
    L30:
        throw C0673Pl.m1366c();
    L31:
        r6.add(Long.valueOf(r2.mo2953y()));
        if (r2.mo2938g() == true) goto L48;
        int r05 = r2.mo2927B();
        if (r05 == this.f7629b) goto L31;
        this.f7631d = r05;
        return;
    }

    /* JADX INFO: renamed from: r */
    public final void m4420r(List r5, boolean r6) {
        if ((this.f7629b & 7) != 2) goto L26;
        boolean r0 = r5 instanceof InterfaceC0374In;
        AbstractC2140ka r2 = this.f7628a;
        if (r0 == false) goto L15;
        if (r6 == true) goto L15;
        InterfaceC0374In r02 = (InterfaceC0374In) r5;
    L8:
        r02.mo715d(m4407e());
        if (r2.mo2938g() == true) goto L20;
        int r52 = r2.mo2927B();
        if (r52 == this.f7629b) goto L8;
        this.f7631d = r52;
        return;
    L20:
        return;
    L15:
        if (r6 == false) goto L17;
        m4424v(2);
        String r03 = r2.mo2926A();
    L18:
        r5.add(r03);
        if (r2.mo2938g() == true) goto L34;
        int r04 = r2.mo2927B();
        if (r04 == this.f7629b) goto L15;
        this.f7631d = r04;
        return;
    L34:
        return;
    L17:
        m4424v(2);
        r03 = r2.mo2954z();
        goto L18
    L26:
        throw C0673Pl.m1366c();
    }

    /* JADX INFO: renamed from: s */
    public final void m4421s(List r4) {
        boolean r0 = r4 instanceof AbstractC0071Bl;
        AbstractC2140ka r2 = this.f7628a;
        if (r0 == false) goto L21;
        AbstractC0071Bl r02 = (AbstractC0071Bl) r4;
        int r42 = this.f7629b & 7;
        if (r42 == 0) goto L14;
        if (r42 != 2) goto L13;
        int r43 = r2.mo2928C();
        int r1 = r2.mo2937f() + r43;
    L8:
        r02.m119b(r2.mo2928C());
        if (r2.mo2937f() < r1) goto L8;
        m4423u(r1);
        return;
    L13:
        throw C0673Pl.m1366c();
    L14:
        r02.m119b(r2.mo2928C());
        if (r2.mo2938g() == true) goto L33;
        int r44 = r2.mo2927B();
        if (r44 == this.f7629b) goto L14;
        this.f7631d = r44;
        return;
    L33:
        return;
    L21:
        int r03 = this.f7629b & 7;
        if (r03 == 0) goto L31;
        if (r03 != 2) goto L30;
        int r04 = r2.mo2928C();
        int r12 = r2.mo2937f() + r04;
    L25:
        r4.add(Integer.valueOf(r2.mo2928C()));
        if (r2.mo2937f() < r12) goto L25;
        m4423u(r12);
        return;
    L30:
        throw C0673Pl.m1366c();
    L31:
        r4.add(Integer.valueOf(r2.mo2928C()));
        if (r2.mo2938g() == true) goto L48;
        int r05 = r2.mo2927B();
        if (r05 == this.f7629b) goto L31;
        this.f7631d = r05;
        return;
    }

    /* JADX INFO: renamed from: t */
    public final void m4422t(List r6) {
        boolean r0 = r6 instanceof AbstractC2382pp;
        AbstractC2140ka r2 = this.f7628a;
        if (r0 == false) goto L21;
        AbstractC2382pp r02 = (AbstractC2382pp) r6;
        int r62 = this.f7629b & 7;
        if (r62 == 0) goto L14;
        if (r62 != 2) goto L13;
        int r63 = r2.mo2928C();
        int r1 = r2.mo2937f() + r63;
    L8:
        r02.m4821b(r2.mo2929D());
        if (r2.mo2937f() < r1) goto L8;
        m4423u(r1);
        return;
    L13:
        throw C0673Pl.m1366c();
    L14:
        r02.m4821b(r2.mo2929D());
        if (r2.mo2938g() == true) goto L33;
        int r64 = r2.mo2927B();
        if (r64 == this.f7629b) goto L14;
        this.f7631d = r64;
        return;
    L33:
        return;
    L21:
        int r03 = this.f7629b & 7;
        if (r03 == 0) goto L31;
        if (r03 != 2) goto L30;
        int r04 = r2.mo2928C();
        int r12 = r2.mo2937f() + r04;
    L25:
        r6.add(Long.valueOf(r2.mo2929D()));
        if (r2.mo2937f() < r12) goto L25;
        m4423u(r12);
        return;
    L30:
        throw C0673Pl.m1366c();
    L31:
        r6.add(Long.valueOf(r2.mo2929D()));
        if (r2.mo2938g() == true) goto L48;
        int r05 = r2.mo2927B();
        if (r05 == this.f7629b) goto L31;
        this.f7631d = r05;
        return;
    }

    /* JADX INFO: renamed from: u */
    public final void m4423u(int r2) {
        if (this.f7628a.mo2937f() != r2) goto L6;
        return;
    L6:
        throw C0673Pl.m1370g();
    }

    /* JADX INFO: renamed from: v */
    public final void m4424v(int r2) {
        if ((this.f7629b & 7) != r2) goto L6;
        return;
    L6:
        throw C0673Pl.m1366c();
    }
}
