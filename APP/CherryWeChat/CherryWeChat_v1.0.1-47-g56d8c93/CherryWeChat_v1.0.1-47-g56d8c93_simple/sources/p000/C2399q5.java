package p000;

/* JADX INFO: renamed from: q5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2399q5 extends AbstractC2592uk {

    /* JADX INFO: renamed from: s0 */
    public int f8407s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f8408t0;

    /* JADX INFO: renamed from: u0 */
    public int f8409u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f8410v0;

    @Override // p000.C2454rb
    /* JADX INFO: renamed from: A */
    public final boolean mo4334A() {
        return this.f8410v0;
    }

    @Override // p000.C2454rb
    /* JADX INFO: renamed from: B */
    public final boolean mo4335B() {
        return this.f8410v0;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m4835T() {
        int r1 = 0;
        boolean r3 = true;
        int r2 = 0;
    L3:
        int r4 = this.f8966r0;
        if (r2 >= r4) goto L23;
        C2454rb r42 = this.f8965q0[r2];
        if (this.f8408t0 == false) goto L8;
    L10:
        int r7 = this.f8407s0;
        if (r7 == 0) goto L14;
        if (r7 == 1) goto L14;
    L16:
        int r72 = this.f8407s0;
        if (r72 == 2) goto L20;
        if (r72 == 3) goto L20;
    L22:
        r2 = r2 + 1;
    L20:
        if (r42.mo4335B() == true) goto L22;
    L15:
        r3 = false;
    L14:
        if (r42.mo4334A() == true) goto L16;
    L8:
        if (r42.mo4339c() == true) goto L10;
    L23:
        if (r3 == false) goto L63;
        if (r4 <= 0) goto L63;
        int r22 = 0;
        boolean r32 = false;
    L27:
        if (r1 >= this.f8966r0) goto L55;
        C2454rb r43 = this.f8965q0[r1];
        if (this.f8408t0 == true) goto L34;
        if (r43.mo4339c() == true) goto L34;
    L54:
        r1 = r1 + 1;
    L34:
        if (r32 == true) goto L45;
        int r33 = this.f8407s0;
        if (r33 != 0) goto L38;
        r22 = r43.mo4340i(2).m2383d();
    L44:
        r32 = true;
        goto L45
    L38:
        if (r33 != 1) goto L40;
        r22 = r43.mo4340i(4).m2383d();
        goto L44
    L40:
        if (r33 != 2) goto L42;
        r22 = r43.mo4340i(3).m2383d();
        goto L44
    L42:
        if (r33 != 3) goto L44;
        r22 = r43.mo4340i(5).m2383d();
    L45:
        int r9 = this.f8407s0;
        if (r9 != 0) goto L48;
        r22 = Math.min(r22, r43.mo4340i(2).m2383d());
        goto L54
    L48:
        if (r9 != 1) goto L50;
        r22 = Math.max(r22, r43.mo4340i(4).m2383d());
        goto L54
    L50:
        if (r9 != 2) goto L52;
        r22 = Math.min(r22, r43.mo4340i(3).m2383d());
        goto L54
    L52:
        if (r9 != 3) goto L54;
        r22 = Math.max(r22, r43.mo4340i(5).m2383d());
        goto L54
    L55:
        int r23 = r22 + this.f8409u0;
        int r12 = this.f8407s0;
        if (r12 == 0) goto L60;
        if (r12 == 1) goto L60;
        m4920K(r23, r23);
    L61:
        this.f8410v0 = true;
        return true;
    L60:
        m4919J(r23, r23);
    L63:
        return false;
    }

    /* JADX INFO: renamed from: U */
    public final int m4836U() {
        int r0 = this.f8407s0;
        if (r0 != 0) goto L5;
        return 0;
    L5:
        if (r0 != 1) goto L7;
        return 0;
    L7:
        if (r0 != 2) goto L9;
    L12:
        return 1;
    L9:
        if (r0 == 3) goto L12;
        return -1;
    }

    @Override // p000.C2454rb
    /* JADX INFO: renamed from: b */
    public final void mo813b(C2244mo r17, boolean r18) {
        C1259cb[] r2 = this.f8596Q;
        C1259cb r4 = this.f8588I;
        r2[0] = r4;
        int r5 = 2;
        C1259cb r6 = this.f8589J;
        r2[2] = r6;
        C1259cb r8 = this.f8590K;
        r2[1] = r8;
        C1259cb r10 = this.f8591L;
        r2[3] = r10;
        int r11 = 0;
    L4:
        if (r11 >= r2.length) goto L6;
        C1259cb r12 = r2[r11];
        r12.f4273i = r17.m4572k(r12);
        r11 = r11 + 1;
        goto L4
    L6:
        int r112 = this.f8407s0;
        if (r112 >= 0) goto L9;
        return;
    L9:
        if (r112 >= 4) goto L133;
        C1259cb r22 = r2[r112];
        if (this.f8410v0 == true) goto L14;
        m4835T();
    L14:
        if (this.f8410v0 == false) goto L25;
        this.f8410v0 = false;
        int r23 = this.f8407s0;
        if (r23 == 0) goto L23;
        if (r23 == 1) goto L23;
        if (r23 == 2) goto L21;
        if (r23 == 3) goto L21;
        return;
    L21:
        r17.m4565d(r6.f4273i, this.f8605Z);
        r17.m4565d(r10.f4273i, this.f8605Z);
        return;
    L23:
        r17.m4565d(r4.f4273i, this.f8604Y);
        r17.m4565d(r8.f4273i, this.f8604Y);
        return;
    L25:
        int r113 = 0;
    L27:
        if (r113 >= this.f8966r0) goto L53;
        C2454rb r13 = this.f8965q0[r113];
        if (this.f8408t0 == false) goto L31;
    L33:
        int r14 = this.f8407s0;
        if (r14 == 0) goto L37;
        if (r14 == 1) goto L37;
    L43:
        if (r14 == 2) goto L46;
        if (r14 == 3) goto L46;
    L52:
        r113 = r113 + 1;
    L46:
        if (r13.f8637p0[1] != 3) goto L52;
        if (r13.f8589J.f4270f == null) goto L52;
        if (r13.f8591L.f4270f == null) goto L52;
    L42:
        boolean r114 = true;
    L55:
        if (r4.m2386g() == false) goto L57;
    L60:
        boolean r132 = true;
    L62:
        if (r6.m2386g() == false) goto L64;
    L67:
        boolean r142 = true;
    L68:
        if (r114 == true) goto L79;
        int r115 = this.f8407s0;
        if (r115 != 0) goto L72;
        if (r132 == false) goto L72;
    L78:
        boolean r116 = true;
    L80:
        if (r116 == true) goto L82;
        int r117 = 4;
    L83:
        int r133 = 0;
    L85:
        if (r133 >= this.f8966r0) goto L104;
        C2454rb r143 = this.f8965q0[r133];
        if (this.f8408t0 == false) goto L89;
    L91:
        C0256Fy r9 = r17.m4572k(r143.f8596Q[this.f8407s0]);
        C1259cb[] r144 = r143.f8596Q;
        int r15 = this.f8407s0;
        C1259cb r145 = r144[r15];
        r145.f4273i = r9;
        C1259cb r7 = r145.f4270f;
        if (r7 != null) goto L94;
    L96:
        int r72 = 0;
    L97:
        if (r15 == 0) goto L101;
        if (r15 == r5) goto L101;
        C0256Fy r146 = r22.f4273i;
        int r152 = this.f8409u0 + r72;
        C0564N4 r52 = r17.m4573l();
        C0256Fy r122 = r17.m4574m();
        r122.f832d = 0;
        r52.m1104b(r146, r9, r122, r152);
        r17.m4564c(r52);
    L102:
        r17.m4566e(r22.f4273i, r9, this.f8409u0 + r72, r117);
    L103:
        r133 = r133 + 1;
        r5 = 2;
    L101:
        C0256Fy r53 = r22.f4273i;
        int r123 = this.f8409u0 - r72;
        C0564N4 r147 = r17.m4573l();
        C0256Fy r153 = r17.m4574m();
        r153.f832d = 0;
        r147.m1105c(r53, r9, r153, r123);
        r17.m4564c(r147);
        goto L102
    L94:
        if (r7.f4268d != this) goto L96;
        r72 = r145.f4271g;
        goto L97
    L89:
        if (r143.mo4339c() == true) goto L91;
    L104:
        int r24 = this.f8407s0;
        if (r24 != 0) goto L109;
        r17.m4566e(r8.f4273i, r4.f4273i, 0, 8);
        r17.m4566e(r4.f4273i, this.f8599T.f8590K.f4273i, 0, 4);
        r17.m4566e(r4.f4273i, this.f8599T.f8588I.f4273i, 0, 0);
        return;
    L109:
        if (r24 != 1) goto L113;
        r17.m4566e(r4.f4273i, r8.f4273i, 0, 8);
        r17.m4566e(r4.f4273i, this.f8599T.f8588I.f4273i, 0, 4);
        r17.m4566e(r4.f4273i, this.f8599T.f8590K.f4273i, 0, 0);
        return;
    L113:
        if (r24 != 2) goto L117;
        r17.m4566e(r10.f4273i, r6.f4273i, 0, 8);
        r17.m4566e(r6.f4273i, this.f8599T.f8591L.f4273i, 0, 4);
        r17.m4566e(r6.f4273i, this.f8599T.f8589J.f4273i, 0, 0);
        return;
    L117:
        if (r24 != 3) goto L135;
        r17.m4566e(r6.f4273i, r10.f4273i, 0, 8);
        r17.m4566e(r6.f4273i, this.f8599T.f8589J.f4273i, 0, 4);
        r17.m4566e(r6.f4273i, this.f8599T.f8591L.f4273i, 0, 0);
        return;
    L135:
        return;
    L82:
        r117 = 5;
    L72:
        if (r115 != 2) goto L74;
        if (r142 == true) goto L78;
    L74:
        if (r115 != 1) goto L76;
        if (r132 == true) goto L78;
    L76:
        if (r115 != 3) goto L79;
        if (r142 == true) goto L78;
    L79:
        r116 = false;
        goto L80
    L64:
        if (r10.m2386g() == true) goto L67;
        r142 = false;
        goto L68
    L57:
        if (r8.m2386g() == true) goto L60;
        r132 = false;
    L37:
        if (r13.f8637p0[0] != 3) goto L43;
        if (r13.f8588I.f4270f == null) goto L43;
        if (r13.f8590K.f4270f == null) goto L43;
    L31:
        if (r13.mo4339c() == true) goto L33;
    L53:
        r114 = false;
        goto L55
    }

    @Override // p000.C2454rb
    /* JADX INFO: renamed from: c */
    public final boolean mo4339c() {
        return true;
    }

    @Override // p000.C2454rb
    public final String toString() {
        String r0 = AbstractC0213Ey.m410h(new StringBuilder("[Barrier] "), this.f8621h0, " {");
        int r1 = 0;
    L4:
        if (r1 >= this.f8966r0) goto L10;
        C2454rb r2 = this.f8965q0[r1];
        if (r1 <= 0) goto L8;
        r0 = AbstractC0213Ey.m407e(r0, ", ");
    L8:
        r0 = r0 + r2.f8621h0;
        r1 = r1 + 1;
        goto L4
    L10:
        return AbstractC0213Ey.m407e(r0, "}");
    }
}
