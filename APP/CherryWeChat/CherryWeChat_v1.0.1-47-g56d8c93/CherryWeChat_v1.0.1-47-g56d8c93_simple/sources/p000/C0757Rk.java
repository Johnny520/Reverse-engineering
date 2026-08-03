package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: Rk */
/* JADX INFO: loaded from: classes.dex */
public final class C0757Rk extends AbstractC1449gF {

    /* JADX INFO: renamed from: k */
    public static final int[] f2406k = null;

    static {
        f2406k = new int[2];
    }

    /* JADX INFO: renamed from: m */
    public static void m1545m(int[] r2, int r3, int r4, int r5, int r6, float r7, int r8) {
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

    @Override // p000.InterfaceC2542td
    /* JADX INFO: renamed from: a */
    public final void mo1546a(InterfaceC2542td r24) {
        if (AbstractC0213Ey.m424v(this.f5066j) == 3) goto L170;
        C0750Rd r1 = this.f5061e;
        boolean r4 = r1.f9119j;
        C2628vd r7 = this.f5064h;
        C2628vd r8 = this.f5065i;
        if (r4 == false) goto L7;
    L11:
        float r242 = 0.5f;
    L125:
        boolean r42 = r7.f9112c;
        ArrayList r5 = r7.f9121l;
        if (r42 == false) goto L179;
        boolean r43 = r8.f9112c;
        ArrayList r9 = r8.f9121l;
        if (r43 == true) goto L131;
        return;
    L131:
        if (r7.f9119j == false) goto L138;
        if (r8.f9119j == false) goto L138;
        if (r1.f9119j == false) goto L138;
        return;
    L138:
        if (r1.f9119j == true) goto L148;
        if (this.f5060d != 3) goto L148;
        C2454rb r44 = this.f5058b;
        if (r44.f8639r != 0) goto L148;
        if (r44.m4944x() == true) goto L148;
        C2628vd r2 = (C2628vd) r5.get(0);
        C2628vd r3 = (C2628vd) r9.get(0);
        int r22 = r2.f9116g + r7.f9115f;
        int r32 = r3.f9116g + r8.f9115f;
        r7.mo1539d(r22);
        r8.mo1539d(r32);
        r1.mo1539d(r32 - r22);
        return;
    L148:
        if (r1.f9119j == true) goto L162;
        if (this.f5060d != 3) goto L162;
        if (this.f5057a != 1) goto L162;
        if (r5.size() <= 0) goto L162;
        if (r9.size() <= 0) goto L162;
        C2628vd r23 = (C2628vd) r5.get(0);
        C2628vd r45 = (C2628vd) r9.get(0);
        int r25 = Math.min((r45.f9116g + r8.f9115f) - (r23.f9116g + r7.f9115f), r1.f2386m);
        C2454rb r46 = this.f5058b;
        int r6 = r46.f8643v;
        int r26 = Math.max(r46.f8642u, r25);
        if (r6 <= 0) goto L160;
        r26 = Math.min(r6, r26);
    L160:
        r1.mo1539d(r26);
    L162:
        if (r1.f9119j == false) goto L187;
        C2628vd r27 = (C2628vd) r5.get(0);
        C2628vd r33 = (C2628vd) r9.get(0);
        int r47 = r27.f9116g;
        int r52 = r7.f9115f + r47;
        int r62 = r33.f9116g;
        int r92 = r8.f9115f + r62;
        float r10 = this.f5058b.f8613d0;
        if (r27 != r33) goto L167;
        r10 = r242;
    L168:
        r7.mo1539d((int) ((((r62 - r47) - r1.f9116g) * r10) + (r47 + r242)));
        r8.mo1539d(r7.f9116g + r1.f9116g);
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
        if (this.f5060d != 3) goto L11;
        C2454rb r48 = this.f5058b;
        int r93 = r48.f8639r;
        if (r93 == 2) goto L120;
        if (r93 != 3) goto L11;
        int r94 = r48.f8640s;
        if (r94 == 0) goto L27;
        if (r94 == 3) goto L27;
        int r95 = r48.f8603X;
        if (r95 == (-1)) goto L25;
        if (r95 == 0) goto L24;
        if (r95 == 1) goto L21;
        int r49 = 0;
    L26:
        r1.mo1539d(r49);
        goto L11
    L21:
        float r96 = r48.f8614e.f5061e.f9116g;
        float r410 = r48.f8602W;
    L22:
        float r97 = r96 * r410;
    L23:
        r49 = (int) (r97 + 0.5f);
        goto L26
    L24:
        r97 = r48.f8614e.f5061e.f9116g / r48.f8602W;
        goto L23
    L25:
        r96 = r48.f8614e.f5061e.f9116g;
        r410 = r48.f8602W;
    L27:
        C0830TD r98 = r48.f8614e;
        C2628vd r11 = r98.f5064h;
        C2628vd r99 = r98.f5065i;
        if (r48.f8588I.f4270f == null) goto L30;
        boolean r12 = true;
    L32:
        if (r48.f8589J.f4270f == null) goto L34;
        boolean r13 = true;
    L36:
        if (r48.f8590K.f4270f == null) goto L38;
        boolean r14 = true;
    L40:
        if (r48.f8591L.f4270f == null) goto L43;
        boolean r15 = true;
    L42:
        r242 = 0.5f;
        int r53 = r48.f8603X;
        if (r12 == false) goto L80;
        if (r13 == false) goto L80;
        if (r14 == false) goto L80;
        if (r15 == false) goto L80;
        float r411 = r48.f8602W;
        boolean r102 = r11.f9119j;
        ArrayList r122 = r11.f9121l;
        int[] r16 = f2406k;
        if (r102 == false) goto L61;
        if (r99.f9119j == false) goto L61;
        if (r7.f9112c == true) goto L56;
        return;
    L56:
        if (r8.f9112c == false) goto L180;
        m1545m(r16, ((C2628vd) r7.f9121l.get(0)).f9116g + r7.f9115f, ((C2628vd) r8.f9121l.get(0)).f9116g - r8.f9115f, r11.f9116g + r11.f9115f, r99.f9116g - r99.f9115f, r411, r53);
        r1.mo1539d(r16[0]);
        this.f5058b.f8614e.f5061e.mo1539d(r16[1]);
        return;
    L180:
        return;
    L61:
        if (r7.f9119j == false) goto L71;
        if (r8.f9119j == false) goto L71;
        if (r11.f9112c == true) goto L67;
        return;
    L67:
        if (r99.f9112c == false) goto L181;
        m1545m(r16, r7.f9116g + r7.f9115f, r8.f9116g - r8.f9115f, ((C2628vd) r122.get(0)).f9116g + r11.f9115f, ((C2628vd) r99.f9121l.get(0)).f9116g - r99.f9115f, r411, r53);
        r1.mo1539d(r16[0]);
        this.f5058b.f8614e.f5061e.mo1539d(r16[1]);
        goto L71
    L181:
        return;
    L71:
        if (r7.f9112c == true) goto L73;
        return;
    L73:
        if (r8.f9112c == true) goto L75;
        return;
    L75:
        if (r11.f9112c == true) goto L77;
        return;
    L77:
        if (r99.f9112c == false) goto L182;
        m1545m(r16, ((C2628vd) r7.f9121l.get(0)).f9116g + r7.f9115f, ((C2628vd) r8.f9121l.get(0)).f9116g - r8.f9115f, ((C2628vd) r122.get(0)).f9116g + r11.f9115f, ((C2628vd) r99.f9121l.get(0)).f9116g - r99.f9115f, r411, r53);
        r1.mo1539d(r16[0]);
        this.f5058b.f8614e.f5061e.mo1539d(r16[1]);
        goto L125
    L182:
        return;
    L80:
        if (r12 == false) goto L100;
        if (r14 == false) goto L100;
        if (r7.f9112c == true) goto L85;
        return;
    L85:
        if (r8.f9112c == false) goto L183;
        float r412 = r48.f8602W;
        int r910 = ((C2628vd) r7.f9121l.get(0)).f9116g + r7.f9115f;
        int r112 = ((C2628vd) r8.f9121l.get(0)).f9116g - r8.f9115f;
        if (r53 == (-1)) goto L96;
        if (r53 == 0) goto L96;
        if (r53 != 1) goto L125;
        int r54 = m2778g(r112 - r910, 0);
        int r911 = (int) ((r54 / r412) + 0.5f);
        int r103 = m2778g(r911, 1);
        if (r911 == r103) goto L95;
        r54 = (int) ((r103 * r412) + 0.5f);
    L95:
        r1.mo1539d(r54);
        this.f5058b.f8614e.f5061e.mo1539d(r103);
    L96:
        int r55 = m2778g(r112 - r910, 0);
        int r912 = (int) ((r55 * r412) + 0.5f);
        int r104 = m2778g(r912, 1);
        if (r912 == r104) goto L99;
        r55 = (int) ((r104 / r412) + 0.5f);
    L99:
        r1.mo1539d(r55);
        this.f5058b.f8614e.f5061e.mo1539d(r104);
        goto L125
    L183:
        return;
    L100:
        if (r13 == false) goto L125;
        if (r15 == false) goto L125;
        if (r11.f9112c == true) goto L105;
        return;
    L105:
        if (r99.f9112c == false) goto L184;
        float r413 = r48.f8602W;
        int r123 = ((C2628vd) r11.f9121l.get(0)).f9116g + r11.f9115f;
        int r113 = ((C2628vd) r99.f9121l.get(0)).f9116g - r99.f9115f;
        if (r53 == (-1)) goto L116;
        if (r53 == 0) goto L112;
        if (r53 == 1) goto L116;
    L112:
        int r56 = m2778g(r113 - r123, 1);
        int r913 = (int) ((r56 * r413) + 0.5f);
        int r105 = m2778g(r913, 0);
        if (r913 == r105) goto L115;
        r56 = (int) ((r105 / r413) + 0.5f);
    L115:
        r1.mo1539d(r105);
        this.f5058b.f8614e.f5061e.mo1539d(r56);
    L116:
        int r57 = m2778g(r113 - r123, 1);
        int r914 = (int) ((r57 / r413) + 0.5f);
        int r106 = m2778g(r914, 0);
        if (r914 == r106) goto L119;
        r57 = (int) ((r106 * r413) + 0.5f);
    L119:
        r1.mo1539d(r106);
        this.f5058b.f8614e.f5061e.mo1539d(r57);
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
        C2454rb r58 = r48.f8599T;
        if (r58 == null) goto L125;
        if (r58.f8612d.f5061e.f9119j == false) goto L125;
        r1.mo1539d((int) ((r5.f9116g * r48.f8644w) + 0.5f));
        goto L125
    L170:
        C2454rb r17 = this.f5058b;
        m2780l(r17.f8588I, r17.f8590K, 0);
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: d */
    public final void mo1547d() {
        C2454rb r0 = this.f5058b;
        boolean r1 = r0.f8606a;
        C0750Rd r2 = this.f5061e;
        if (r1 == false) goto L5;
        r2.mo1539d(r0.m4937q());
    L5:
        boolean r02 = r2.f9119j;
        ArrayList r12 = r2.f9120k;
        ArrayList r3 = r2.f9121l;
        C2628vd r8 = this.f5065i;
        C2628vd r9 = this.f5064h;
        if (r02 == true) goto L20;
        C2454rb r03 = this.f5058b;
        int r10 = r03.f8637p0[0];
        this.f5060d = r10;
        if (r10 == 3) goto L29;
        if (r10 != 4) goto L17;
        C2454rb r11 = r03.f8599T;
        if (r11 == null) goto L17;
        int r122 = r11.f8637p0[0];
        if (r122 == 1) goto L15;
        if (r122 != 4) goto L17;
    L15:
        int r04 = (r11.m4937q() - this.f5058b.f8588I.m2384e()) - this.f5058b.f8590K.m2384e();
        AbstractC1449gF.m2774b(r9, r11.f8612d.f5064h, this.f5058b.f8588I.m2384e());
        AbstractC1449gF.m2774b(r8, r11.f8612d.f5065i, -this.f5058b.f8590K.m2384e());
        r2.mo1539d(r04);
        return;
    L17:
        if (r10 != 1) goto L29;
        r2.mo1539d(r03.m4937q());
    L29:
        if (r2.f9119j == false) goto L68;
        C2454rb r05 = this.f5058b;
        if (r05.f8606a == false) goto L68;
        C1259cb[] r13 = r05.f8596Q;
        C1259cb r32 = r13[0];
        C1259cb r4 = r32.f4270f;
        if (r4 != null) goto L35;
    L48:
        if (r4 == null) goto L53;
        C2628vd r06 = AbstractC1449gF.m2775h(r32);
        if (r06 == null) goto L119;
        AbstractC1449gF.m2774b(r9, r06, this.f5058b.f8596Q[0].m2384e());
        AbstractC1449gF.m2774b(r8, r9, r2.f9116g);
        return;
    L119:
        return;
    L53:
        C1259cb r14 = r13[1];
        if (r14.f4270f == null) goto L60;
        C2628vd r07 = AbstractC1449gF.m2775h(r14);
        if (r07 == null) goto L120;
        AbstractC1449gF.m2774b(r8, r07, -this.f5058b.f8596Q[1].m2384e());
        AbstractC1449gF.m2774b(r9, r8, -r2.f9116g);
        return;
    L120:
        return;
    L60:
        if ((r05 instanceof AbstractC2592uk) == false) goto L62;
        return;
    L62:
        if (r05.f8599T != null) goto L64;
        return;
    L64:
        if (r05.mo4340i(7).f4270f != null) goto L123;
        C2454rb r08 = this.f5058b;
        AbstractC1449gF.m2774b(r9, r08.f8599T.f8612d.f5064h, r08.m4938r());
        AbstractC1449gF.m2774b(r8, r9, r2.f9116g);
        return;
    L123:
        return;
    L35:
        if (r13[1].f4270f == null) goto L48;
        if (r05.m4944x() == false) goto L40;
        r9.f9115f = this.f5058b.f8596Q[0].m2384e();
        r8.f9115f = -this.f5058b.f8596Q[1].m2384e();
        return;
    L40:
        C2628vd r09 = AbstractC1449gF.m2775h(this.f5058b.f8596Q[0]);
        if (r09 == null) goto L43;
        AbstractC1449gF.m2774b(r9, r09, this.f5058b.f8596Q[0].m2384e());
    L43:
        C2628vd r010 = AbstractC1449gF.m2775h(this.f5058b.f8596Q[1]);
        if (r010 == null) goto L46;
        AbstractC1449gF.m2774b(r8, r010, -this.f5058b.f8596Q[1].m2384e());
    L46:
        r9.f9111b = true;
        r8.f9111b = true;
        return;
    L68:
        if (this.f5060d != 3) goto L87;
        C2454rb r011 = this.f5058b;
        int r102 = r011.f8639r;
        if (r102 == 2) goto L83;
        if (r102 != 3) goto L87;
        if (r011.f8640s != 3) goto L82;
        r9.f9110a = this;
        r8.f9110a = this;
        C0830TD r42 = r011.f8614e;
        r42.f5064h.f9110a = this;
        r42.f5065i.f9110a = this;
        r2.f9110a = this;
        if (r011.m4945y() == false) goto L79;
        r3.add(this.f5058b.f8614e.f5061e);
        this.f5058b.f8614e.f5061e.f9120k.add(r2);
        C0830TD r012 = this.f5058b.f8614e;
        r012.f5061e.f9110a = this;
        r3.add(r012.f5064h);
        r3.add(this.f5058b.f8614e.f5065i);
        this.f5058b.f8614e.f5064h.f9120k.add(r2);
        this.f5058b.f8614e.f5065i.f9120k.add(r2);
        goto L87
    L79:
        if (this.f5058b.m4944x() == false) goto L81;
        this.f5058b.f8614e.f5061e.f9121l.add(r2);
        r12.add(this.f5058b.f8614e.f5061e);
        goto L87
    L81:
        this.f5058b.f8614e.f5061e.f9121l.add(r2);
        goto L87
    L82:
        C0750Rd r013 = r011.f8614e.f5061e;
        r3.add(r013);
        r013.f9120k.add(r2);
        this.f5058b.f8614e.f5064h.f9120k.add(r2);
        this.f5058b.f8614e.f5065i.f9120k.add(r2);
        r2.f9111b = true;
        r12.add(r9);
        r12.add(r8);
        r9.f9121l.add(r2);
        r8.f9121l.add(r2);
        goto L87
    L83:
        C2454rb r014 = r011.f8599T;
        if (r014 == null) goto L87;
        C0750Rd r015 = r014.f8614e.f5061e;
        r3.add(r015);
        r015.f9120k.add(r2);
        r2.f9111b = true;
        r12.add(r9);
        r12.add(r8);
    L87:
        C2454rb r016 = this.f5058b;
        C1259cb[] r15 = r016.f8596Q;
        C1259cb r33 = r15[0];
        C1259cb r43 = r33.f4270f;
        if (r43 != null) goto L90;
    L102:
        if (r43 == null) goto L107;
        C2628vd r017 = AbstractC1449gF.m2775h(r33);
        if (r017 == null) goto L124;
        AbstractC1449gF.m2774b(r9, r017, this.f5058b.f8596Q[0].m2384e());
        m2777c(r8, r9, 1, r2);
        return;
    L124:
        return;
    L107:
        C1259cb r16 = r15[1];
        if (r16.f4270f == null) goto L114;
        C2628vd r018 = AbstractC1449gF.m2775h(r16);
        if (r018 == null) goto L125;
        AbstractC1449gF.m2774b(r8, r018, -this.f5058b.f8596Q[1].m2384e());
        m2777c(r9, r8, -1, r2);
        return;
    L125:
        return;
    L114:
        if ((r016 instanceof AbstractC2592uk) == true) goto L126;
        C2454rb r17 = r016.f8599T;
        if (r17 == null) goto L127;
        AbstractC1449gF.m2774b(r9, r17.f8612d.f5064h, r016.m4938r());
        m2777c(r8, r9, 1, r2);
        return;
    L127:
        return;
    L126:
        return;
    L90:
        if (r15[1].f4270f == null) goto L102;
        if (r016.m4944x() == false) goto L95;
        r9.f9115f = this.f5058b.f8596Q[0].m2384e();
        r8.f9115f = -this.f5058b.f8596Q[1].m2384e();
        return;
    L95:
        C2628vd r019 = AbstractC1449gF.m2775h(this.f5058b.f8596Q[0]);
        C2628vd r18 = AbstractC1449gF.m2775h(this.f5058b.f8596Q[1]);
        if (r019 == null) goto L98;
        r019.m5143b(this);
    L98:
        if (r18 == null) goto L100;
        r18.m5143b(this);
    L100:
        this.f5066j = 4;
        return;
    L20:
        if (this.f5060d != 4) goto L29;
        C2454rb r020 = this.f5058b;
        C2454rb r103 = r020.f8599T;
        if (r103 == null) goto L29;
        int r112 = r103.f8637p0[0];
        if (r112 == 1) goto L26;
        if (r112 != 4) goto L29;
    L26:
        AbstractC1449gF.m2774b(r9, r103.f8612d.f5064h, r020.f8588I.m2384e());
        AbstractC1449gF.m2774b(r8, r103.f8612d.f5065i, -this.f5058b.f8590K.m2384e());
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: e */
    public final void mo1548e() {
        C2628vd r0 = this.f5064h;
        if (r0.f9119j == false) goto L6;
        C2454rb r1 = this.f5058b;
        r1.f8604Y = r0.f9116g;
        return;
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: f */
    public final void mo1549f() {
        this.f5059c = null;
        this.f5064h.m5144c();
        this.f5065i.m5144c();
        this.f5061e.m5144c();
        this.f5063g = false;
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: k */
    public final boolean mo1550k() {
        if (this.f5060d == 3) goto L5;
        return true;
    L5:
        if (this.f5058b.f8639r == 0) goto L11;
        return false;
    L11:
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final void m1551n() {
        this.f5063g = false;
        C2628vd r1 = this.f5064h;
        r1.m5144c();
        r1.f9119j = false;
        C2628vd r12 = this.f5065i;
        r12.m5144c();
        r12.f9119j = false;
        this.f5061e.f9119j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f5058b.f8621h0;
    }
}
