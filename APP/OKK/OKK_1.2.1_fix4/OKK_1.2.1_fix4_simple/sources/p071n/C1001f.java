package p071n;

/* JADX INFO: renamed from: n.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1001f {

    /* JADX INFO: renamed from: a */
    public int f3654a;

    /* JADX INFO: renamed from: b */
    public C0999d f3655b;

    /* JADX INFO: renamed from: c */
    public int f3656c;

    /* JADX INFO: renamed from: d */
    public C0998c f3657d;

    /* JADX INFO: renamed from: e */
    public C0998c f3658e;

    /* JADX INFO: renamed from: f */
    public C0998c f3659f;

    /* JADX INFO: renamed from: g */
    public C0998c f3660g;

    /* JADX INFO: renamed from: h */
    public int f3661h;

    /* JADX INFO: renamed from: i */
    public int f3662i;

    /* JADX INFO: renamed from: j */
    public int f3663j;

    /* JADX INFO: renamed from: k */
    public int f3664k;

    /* JADX INFO: renamed from: l */
    public int f3665l;

    /* JADX INFO: renamed from: m */
    public int f3666m;

    /* JADX INFO: renamed from: n */
    public int f3667n;

    /* JADX INFO: renamed from: o */
    public int f3668o;

    /* JADX INFO: renamed from: p */
    public int f3669p;

    /* JADX INFO: renamed from: q */
    public int f3670q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C1002g f3671r;

    public C1001f(C1002g r2, int r3, C0998c r4, C0998c r5, C0998c r6, C0998c r7, int r8) {
        this.f3671r = r2;
        this.f3655b = null;
        this.f3656c = 0;
        this.f3661h = 0;
        this.f3662i = 0;
        this.f3663j = 0;
        this.f3664k = 0;
        this.f3665l = 0;
        this.f3666m = 0;
        this.f3667n = 0;
        this.f3668o = 0;
        this.f3669p = 0;
        this.f3670q = 0;
        this.f3654a = r3;
        this.f3657d = r4;
        this.f3658e = r5;
        this.f3659f = r6;
        this.f3660g = r7;
        this.f3661h = r2.f3691j0;
        this.f3662i = r2.f3687f0;
        this.f3663j = r2.f3692k0;
        this.f3664k = r2.f3688g0;
        this.f3670q = r8;
    }

    /* JADX INFO: renamed from: a */
    public final void m2426a(C0999d r9) {
        int r02 = this.f3654a;
        int r4 = 0;
        C1002g r5 = this.f3671r;
        if (r02 != 0) goto L16;
        int r03 = r5.m2434D(r9, this.f3670q);
        if (r9.f3615c0[0] != 3) goto L7;
        this.f3669p++;
        r03 = 0;
    L7:
        int r2 = r5.f3674C0;
        if (r9.f3605V == 8) goto L11;
        r4 = r2;
    L11:
        this.f3665l = (r03 + r4) + this.f3665l;
        int r04 = r5.m2433C(r9, this.f3670q);
        if (this.f3655b != null) goto L14;
    L15:
        this.f3655b = r9;
        this.f3656c = r04;
        this.f3666m = r04;
    L28:
        this.f3668o++;
        return;
    L14:
        if (this.f3656c >= r04) goto L28;
    L16:
        int r05 = r5.m2434D(r9, this.f3670q);
        int r6 = r5.m2433C(r9, this.f3670q);
        if (r9.f3615c0[1] != 3) goto L19;
        this.f3669p++;
        r6 = 0;
    L19:
        int r22 = r5.f3675D0;
        if (r9.f3605V == 8) goto L23;
        r4 = r22;
    L23:
        this.f3666m = (r6 + r4) + this.f3666m;
        if (this.f3655b != null) goto L26;
    L27:
        this.f3655b = r9;
        this.f3656c = r05;
        this.f3665l = r05;
        goto L28
    L26:
        if (this.f3656c >= r05) goto L28;
        goto L27
    }

    /* JADX INFO: renamed from: b */
    public final void m2427b(int r18, boolean r19, boolean r20) {
        int r1 = this.f3668o;
        int r3 = 0;
    L3:
        C1002g r4 = this.f3671r;
        if (r3 >= r1) goto L12;
        int r5 = this.f3667n + r3;
        if (r5 >= r4.f3686O0) goto L12;
        C0999d r42 = r4.f3685N0[r5];
        if (r42 == null) goto L11;
        r42.m2415t();
    L11:
        r3 = r3 + 1;
    L12:
        if (r1 != 0) goto L14;
        return;
    L14:
        if (this.f3655b == null) goto L220;
        if (r20 == false) goto L19;
        if (r18 != 0) goto L19;
        boolean r52 = true;
    L20:
        int r7 = 0;
        int r8 = -1;
        int r9 = -1;
    L21:
        if (r7 >= r1) goto L35;
        if (r19 == false) goto L24;
        int r10 = (r1 - 1) - r7;
    L25:
        int r11 = this.f3667n + r10;
        if (r11 >= r4.f3686O0) goto L35;
        if (r4.f3685N0[r11].f3605V != 0) goto L33;
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
        if (this.f3654a != 0) goto L119;
        C0999d r72 = this.f3655b;
        r72.f3608Y = r4.f3699r0;
        int r112 = this.f3662i;
        if (r18 <= 0) goto L39;
        r112 = r112 + r4.f3675D0;
    L39:
        C0998c r12 = this.f3658e;
        C0998c r13 = r72.f3637y;
        r13.m2388a(r12, r112);
        C0998c r113 = r72.f3584A;
        if (r20 == false) goto L42;
        r113.m2388a(this.f3660g, this.f3664k);
    L42:
        if (r18 <= 0) goto L45;
        this.f3658e.f3578b.f3584A.m2388a(r13, 0);
    L45:
        if (r4.f3677F0 == 3) goto L47;
    L60:
        C0999d r102 = r72;
    L61:
        int r15 = 0;
        C0999d r122 = null;
    L62:
        if (r15 >= r1) goto L221;
        if (r19 == false) goto L65;
        int r16 = (r1 - 1) - r15;
    L66:
        int r14 = this.f3667n + r16;
        if (r14 >= r4.f3686O0) goto L222;
        C0999d r32 = r4.f3685N0[r14];
        if (r15 != 0) goto L72;
        r32.m2400e(r32.f3636x, this.f3657d, this.f3661h);
    L72:
        if (r16 != 0) goto L87;
        int r2 = r4.f3698q0;
        float r6 = r4.f3704w0;
        if (this.f3667n != 0) goto L79;
        int r142 = r4.f3700s0;
        int r162 = r2;
        int r22 = -1;
        if (r142 == (-1)) goto L80;
        r6 = r4.f3706y0;
    L78:
        int r23 = r142;
    L85:
        r32.f3607X = r23;
        r32.f3602S = r6;
    L80:
        if (r20 == false) goto L84;
        r142 = r4.f3702u0;
        if (r142 == r22) goto L84;
        r6 = r4.f3672A0;
    L84:
        r23 = r162;
        goto L85
    L79:
        r162 = r2;
        r22 = -1;
    L87:
        if (r15 != (r1 - 1)) goto L89;
        r32.m2400e(r32.f3638z, this.f3659f, this.f3663j);
    L89:
        if (r122 == null) goto L100;
        C0998c r24 = r32.f3636x;
        int r62 = r4.f3674C0;
        C0998c r123 = r122.f3638z;
        r24.m2388a(r123, r62);
        C0998c r25 = r32.f3636x;
        if (r15 != r8) goto L95;
        int r63 = this.f3661h;
        if (r25.m2393f() == false) goto L95;
        r25.f3582f = r63;
    L95:
        r123.m2388a(r25, 0);
        if (r15 != (r9 + 1)) goto L100;
        int r26 = this.f3663j;
        if (r123.m2393f() == false) goto L100;
        r123.f3582f = r26;
    L100:
        if (r32 == r72) goto L117;
        int r27 = r4.f3677F0;
        char r64 = 3;
        if (r27 == 3) goto L104;
    L109:
        if (r27 != 0) goto L111;
        r32.f3637y.m2388a(r13, 0);
    L118:
        r15 = r15 + 1;
        r122 = r32;
        goto L62
    L111:
        if (r27 == 1) goto L115;
        if (r52 == false) goto L114;
        r32.f3637y.m2388a(this.f3658e, this.f3662i);
        r32.f3584A.m2388a(this.f3660g, this.f3664k);
        goto L118
    L114:
        r32.f3637y.m2388a(r13, 0);
        r32.f3584A.m2388a(r113, 0);
        goto L118
    L115:
        r32.f3584A.m2388a(r113, 0);
        goto L118
    L104:
        if (r102.f3635w == false) goto L109;
        if (r32 == r102) goto L109;
        if (r32.f3635w == false) goto L109;
        r32.f3585B.m2388a(r102.f3585B, 0);
        goto L118
    L117:
        r64 = 3;
        goto L118
    L222:
        return;
    L65:
        r16 = r15;
        goto L66
    L221:
        return;
    L47:
        if (r72.f3635w == true) goto L60;
        int r124 = 0;
    L49:
        if (r124 >= r1) goto L60;
        if (r19 == false) goto L52;
        int r152 = (r1 - 1) - r124;
    L53:
        int r103 = this.f3667n + r152;
        if (r103 >= r4.f3686O0) goto L60;
        r102 = r4.f3685N0[r103];
        if (r102.f3635w == true) goto L61;
        r124 = r124 + 1;
        goto L49
    L52:
        r152 = r124;
        goto L53
    L119:
        C0999d r28 = this.f3655b;
        r28.f3607X = r4.f3698q0;
        int r33 = this.f3661h;
        if (r18 <= 0) goto L122;
        r33 = r33 + r4.f3674C0;
    L122:
        C0998c r65 = r28.f3636x;
        C0998c r73 = r28.f3638z;
        if (r19 == false) goto L129;
        r73.m2388a(this.f3659f, r33);
        if (r20 == false) goto L127;
        r65.m2388a(this.f3657d, this.f3663j);
    L127:
        if (r18 <= 0) goto L134;
        this.f3659f.f3578b.f3636x.m2388a(r73, 0);
    L134:
        int r34 = 0;
        C0999d r104 = null;
    L135:
        if (r34 >= r1) goto L223;
        int r114 = this.f3667n + r34;
        if (r114 >= r4.f3686O0) goto L224;
        C0999d r115 = r4.f3685N0[r114];
        if (r34 != 0) goto L155;
        r115.m2400e(r115.f3637y, this.f3658e, this.f3662i);
        int r125 = r4.f3699r0;
        float r132 = r4.f3705x0;
        if (this.f3667n != 0) goto L147;
        int r143 = r4.f3701t0;
        int r153 = -1;
        if (r143 == (-1)) goto L148;
        r132 = r4.f3707z0;
    L146:
        r125 = r143;
    L152:
        r115.f3608Y = r125;
        r115.f3603T = r132;
    L148:
        if (r20 == false) goto L152;
        r143 = r4.f3703v0;
        if (r143 == r153) goto L152;
        r132 = r4.f3673B0;
        goto L146
    L147:
        r153 = -1;
    L155:
        if (r34 != (r1 - 1)) goto L157;
        r115.m2400e(r115.f3584A, this.f3660g, this.f3664k);
    L157:
        if (r104 == null) goto L168;
        C0998c r126 = r115.f3637y;
        int r133 = r4.f3675D0;
        C0998c r105 = r104.f3584A;
        r126.m2388a(r105, r133);
        C0998c r127 = r115.f3637y;
        if (r34 != r8) goto L163;
        int r134 = this.f3662i;
        if (r127.m2393f() == false) goto L163;
        r127.f3582f = r134;
    L163:
        r105.m2388a(r127, 0);
        if (r34 != (r9 + 1)) goto L168;
        int r128 = this.f3664k;
        if (r105.m2393f() == false) goto L168;
        r105.f3582f = r128;
    L168:
        if (r115 == r28) goto L192;
        if (r19 == false) goto L181;
        int r129 = r4.f3676E0;
        if (r129 != 0) goto L174;
        r115.f3638z.m2388a(r73, 0);
        goto L192
    L174:
        if (r129 == 1) goto L178;
        if (r129 != 2) goto L192;
        r115.f3636x.m2388a(r65, 0);
        r115.f3638z.m2388a(r73, 0);
        goto L192
    L178:
        r115.f3636x.m2388a(r65, 0);
        goto L192
    L181:
        int r1210 = r4.f3676E0;
        if (r1210 != 0) goto L184;
        r115.f3636x.m2388a(r65, 0);
        goto L192
    L184:
        if (r1210 == 1) goto L190;
        if (r1210 != 2) goto L192;
        if (r52 == false) goto L189;
        r115.f3636x.m2388a(this.f3657d, this.f3661h);
        r115.f3638z.m2388a(this.f3659f, this.f3663j);
        goto L192
    L189:
        r115.f3636x.m2388a(r65, 0);
        r115.f3638z.m2388a(r73, 0);
        goto L192
    L190:
        r115.f3638z.m2388a(r73, 0);
    L192:
        r34 = r34 + 1;
        r104 = r115;
        goto L135
    L224:
        return;
    L223:
        return;
    L129:
        r65.m2388a(this.f3657d, r33);
        if (r20 == false) goto L132;
        r73.m2388a(this.f3659f, this.f3663j);
    L132:
        if (r18 <= 0) goto L134;
        this.f3657d.f3578b.f3638z.m2388a(r65, 0);
    L19:
        r52 = false;
        goto L20
    }

    /* JADX INFO: renamed from: c */
    public final int m2428c() {
        if (this.f3654a != 1) goto L7;
        return this.f3666m - this.f3671r.f3675D0;
    L7:
        return this.f3666m;
    }

    /* JADX INFO: renamed from: d */
    public final int m2429d() {
        if (this.f3654a != 0) goto L7;
        return this.f3665l - this.f3671r.f3674C0;
    L7:
        return this.f3665l;
    }

    /* JADX INFO: renamed from: e */
    public final void m2430e(int r11) {
        int r02 = this.f3669p;
        if (r02 != 0) goto L5;
        return;
    L5:
        int r1 = this.f3668o;
        int r112 = r11 / r02;
        int r8 = 0;
    L6:
        C1002g r2 = this.f3671r;
        if (r8 >= r1) goto L26;
        int r3 = this.f3667n + r8;
        if (r3 >= r2.f3686O0) goto L26;
        C0999d r7 = r2.f3685N0[r3];
        if (this.f3654a != 0) goto L19;
        if (r7 == null) goto L25;
        int[] r32 = r7.f3615c0;
        if (r32[0] != 3) goto L25;
        if (r7.f3622j != 0) goto L25;
        r2.m2435E(1, r112, r32[1], r7.m2404i(), r7);
    L25:
        r8 = r8 + 1;
        goto L6
    L19:
        if (r7 == null) goto L25;
        int[] r33 = r7.f3615c0;
        if (r33[1] != 3) goto L25;
        if (r7.f3623k != 0) goto L25;
        r2.m2435E(r33[0], r7.m2407l(), 1, r112, r7);
    L26:
        this.f3665l = 0;
        this.f3666m = 0;
        this.f3655b = null;
        this.f3656c = 0;
        int r113 = this.f3668o;
        int r12 = 0;
    L27:
        if (r12 >= r113) goto L50;
        int r34 = this.f3667n + r12;
        if (r34 >= r2.f3686O0) goto L67;
        C0999d r35 = r2.f3685N0[r34];
        if (this.f3654a != 0) goto L41;
        int r4 = r35.m2407l();
        int r6 = r2.f3674C0;
        if (r35.f3605V != 8) goto L36;
        r6 = 0;
    L36:
        this.f3665l = (r4 + r6) + this.f3665l;
        int r42 = r2.m2433C(r35, this.f3670q);
        if (this.f3655b != null) goto L39;
    L40:
        this.f3655b = r35;
        this.f3656c = r42;
        this.f3666m = r42;
    L49:
        r12 = r12 + 1;
        goto L27
    L39:
        if (this.f3656c >= r42) goto L49;
    L41:
        int r43 = r2.m2434D(r35, this.f3670q);
        int r62 = r2.m2433C(r35, this.f3670q);
        int r72 = r2.f3675D0;
        if (r35.f3605V != 8) goto L44;
        r72 = 0;
    L44:
        this.f3666m = (r62 + r72) + this.f3666m;
        if (this.f3655b != null) goto L47;
    L48:
        this.f3655b = r35;
        this.f3656c = r43;
        this.f3665l = r43;
        goto L49
    L47:
        if (this.f3656c >= r43) goto L49;
    L67:
        return;
    }

    /* JADX INFO: renamed from: f */
    public final void m2431f(int r1, C0998c r2, C0998c r3, C0998c r4, C0998c r5, int r6, int r7, int r8, int r9, int r10) {
        this.f3654a = r1;
        this.f3657d = r2;
        this.f3658e = r3;
        this.f3659f = r4;
        this.f3660g = r5;
        this.f3661h = r6;
        this.f3662i = r7;
        this.f3663j = r8;
        this.f3664k = r9;
        this.f3670q = r10;
    }
}
