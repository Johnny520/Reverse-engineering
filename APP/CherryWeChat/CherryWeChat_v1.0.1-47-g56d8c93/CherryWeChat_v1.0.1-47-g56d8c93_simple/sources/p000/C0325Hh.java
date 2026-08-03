package p000;

/* JADX INFO: renamed from: Hh */
/* JADX INFO: loaded from: classes.dex */
public final class C0325Hh {

    /* JADX INFO: renamed from: a */
    public int f1090a;

    /* JADX INFO: renamed from: b */
    public C2454rb f1091b;

    /* JADX INFO: renamed from: c */
    public int f1092c;

    /* JADX INFO: renamed from: d */
    public C1259cb f1093d;

    /* JADX INFO: renamed from: e */
    public C1259cb f1094e;

    /* JADX INFO: renamed from: f */
    public C1259cb f1095f;

    /* JADX INFO: renamed from: g */
    public C1259cb f1096g;

    /* JADX INFO: renamed from: h */
    public int f1097h;

    /* JADX INFO: renamed from: i */
    public int f1098i;

    /* JADX INFO: renamed from: j */
    public int f1099j;

    /* JADX INFO: renamed from: k */
    public int f1100k;

    /* JADX INFO: renamed from: l */
    public int f1101l;

    /* JADX INFO: renamed from: m */
    public int f1102m;

    /* JADX INFO: renamed from: n */
    public int f1103n;

    /* JADX INFO: renamed from: o */
    public int f1104o;

    /* JADX INFO: renamed from: p */
    public int f1105p;

    /* JADX INFO: renamed from: q */
    public int f1106q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C0368Ih f1107r;

    public C0325Hh(C0368Ih r2, int r3, C1259cb r4, C1259cb r5, C1259cb r6, C1259cb r7, int r8) {
        this.f1107r = r2;
        this.f1091b = null;
        this.f1092c = 0;
        this.f1101l = 0;
        this.f1102m = 0;
        this.f1103n = 0;
        this.f1104o = 0;
        this.f1105p = 0;
        this.f1090a = r3;
        this.f1093d = r4;
        this.f1094e = r5;
        this.f1095f = r6;
        this.f1096g = r7;
        this.f1097h = r2.f1280w0;
        this.f1098i = r2.f1276s0;
        this.f1099j = r2.f1281x0;
        this.f1100k = r2.f1277t0;
        this.f1106q = r8;
    }

    /* JADX INFO: renamed from: a */
    public final void m688a(C2454rb r9) {
        int r0 = this.f1090a;
        int r4 = 0;
        C0368Ih r5 = this.f1107r;
        if (r0 != 0) goto L16;
        int r02 = r5.m811U(r9, this.f1106q);
        if (r9.f8637p0[0] != 3) goto L7;
        this.f1105p++;
        r02 = 0;
    L7:
        int r2 = r5.f1263P0;
        if (r9.f8619g0 == 8) goto L11;
        r4 = r2;
    L11:
        this.f1101l = (r02 + r4) + this.f1101l;
        int r03 = r5.m810T(r9, this.f1106q);
        if (this.f1091b != null) goto L14;
    L15:
        this.f1091b = r9;
        this.f1092c = r03;
        this.f1102m = r03;
    L28:
        this.f1104o++;
        return;
    L14:
        if (this.f1092c >= r03) goto L28;
    L16:
        int r04 = r5.m811U(r9, this.f1106q);
        int r6 = r5.m810T(r9, this.f1106q);
        if (r9.f8637p0[1] != 3) goto L19;
        this.f1105p++;
        r6 = 0;
    L19:
        int r22 = r5.f1264Q0;
        if (r9.f8619g0 == 8) goto L23;
        r4 = r22;
    L23:
        this.f1102m = (r6 + r4) + this.f1102m;
        if (this.f1091b != null) goto L26;
    L27:
        this.f1091b = r9;
        this.f1092c = r04;
        this.f1101l = r04;
        goto L28
    L26:
        if (this.f1092c >= r04) goto L28;
        goto L27
    }

    /* JADX INFO: renamed from: b */
    public final void m689b(int r23, boolean r24, boolean r25) {
        int r1 = this.f1104o;
        int r3 = 0;
    L3:
        C0368Ih r4 = this.f1107r;
        if (r3 >= r1) goto L12;
        int r5 = this.f1103n + r3;
        if (r5 >= r4.f1275b1) goto L12;
        C2454rb r42 = r4.f1274a1[r5];
        if (r42 == null) goto L11;
        r42.m4915D();
    L11:
        r3 = r3 + 1;
    L12:
        if (r1 != 0) goto L14;
        return;
    L14:
        if (this.f1091b == null) goto L236;
        if (r25 == false) goto L19;
        if (r23 != 0) goto L19;
        boolean r52 = true;
    L20:
        int r7 = 0;
        int r8 = -1;
        int r9 = -1;
    L21:
        if (r7 >= r1) goto L37;
        if (r24 == false) goto L24;
        int r10 = (r1 - 1) - r7;
    L25:
        int r11 = this.f1103n + r10;
        if (r11 >= r4.f1275b1) goto L37;
        C2454rb r102 = r4.f1274a1[r11];
        if (r102 == null) goto L35;
        if (r102.f8619g0 != 0) goto L35;
        if (r8 != (-1)) goto L34;
        r8 = r7;
    L34:
        r9 = r7;
    L35:
        r7 = r7 + 1;
        goto L21
    L24:
        r10 = r7;
    L37:
        if (this.f1090a != 0) goto L137;
        C2454rb r72 = this.f1091b;
        r72.f8625j0 = r4.f1252E0;
        C1259cb r112 = r72.f8591L;
        C1259cb r12 = r72.f8589J;
        int r13 = this.f1098i;
        if (r23 <= 0) goto L41;
        r13 = r13 + r4.f1264Q0;
    L41:
        r12.m2380a(this.f1094e, r13);
        if (r25 == false) goto L44;
        r112.m2380a(this.f1096g, this.f1100k);
    L44:
        if (r23 <= 0) goto L47;
        this.f1094e.f4268d.f8591L.m2380a(r12, 0);
    L47:
        if (r4.f1266S0 == 3) goto L49;
    L62:
        C2454rb r103 = r72;
    L63:
        int r15 = 0;
        C2454rb r132 = null;
    L64:
        if (r15 >= r1) goto L237;
        if (r24 == false) goto L68;
        int r16 = (r1 - 1) - r15;
    L69:
        int r32 = this.f1103n + r16;
        if (r32 >= r4.f1275b1) goto L238;
        C2454rb r33 = r4.f1274a1[r32];
        if (r33 != null) goto L75;
        int r20 = r1;
        boolean r18 = r52;
        int r19 = r9;
        char r53 = 3;
    L136:
        r15 = r15 + 1;
        r52 = r18;
        r9 = r19;
        r1 = r20;
        goto L64
    L75:
        C1259cb r14 = r33.f8591L;
        C1259cb r2 = r33.f8589J;
        C1259cb r6 = r33.f8588I;
        r18 = r52;
        if (r15 != 0) goto L78;
        r19 = r9;
        r33.m4929f(r6, this.f1093d, this.f1097h);
    L79:
        if (r16 != 0) goto L103;
        int r54 = r4.f1251D0;
        if (r24 == false) goto L84;
        float r162 = 1.0f;
        float r92 = 1.0f - r4.f1257J0;
    L86:
        if (this.f1103n != 0) goto L93;
        int r55 = r4.f1253F0;
        float r21 = r92;
        if (r55 == (-1)) goto L94;
        if (r24 == false) goto L92;
        float r93 = r4.f1259L0;
    L91:
        float r94 = r162 - r93;
    L101:
        r33.f8623i0 = r55;
        r33.f8613d0 = r94;
        goto L103
    L92:
        r94 = r4.f1259L0;
    L94:
        if (r25 == false) goto L100;
        r55 = r4.f1255H0;
        if (r55 == (-1)) goto L100;
        if (r24 == false) goto L99;
        r93 = r4.f1261N0;
        goto L91
    L99:
        r94 = r4.f1261N0;
    L100:
        r55 = r54;
        r94 = r21;
        goto L101
    L93:
        r21 = r92;
        goto L94
    L84:
        r162 = 1.0f;
        r92 = r4.f1257J0;
    L103:
        if (r15 != (r1 - 1)) goto L105;
        r20 = r1;
        r33.m4929f(r33.f8590K, this.f1095f, this.f1099j);
    L106:
        if (r132 == null) goto L117;
        C1259cb r17 = r132.f8590K;
        r6.m2380a(r17, r4.f1263P0);
        if (r15 != r8) goto L112;
        int r56 = this.f1097h;
        if (r6.m2387h() == false) goto L112;
        r6.f4272h = r56;
    L112:
        r17.m2380a(r6, 0);
        if (r15 != (r19 + 1)) goto L117;
        int r57 = this.f1099j;
        if (r17.m2387h() == false) goto L117;
        r17.f4272h = r57;
    L117:
        if (r33 == r72) goto L134;
        int r110 = r4.f1266S0;
        r53 = 3;
        if (r110 == 3) goto L121;
    L126:
        if (r110 != 0) goto L128;
        r2.m2380a(r12, 0);
    L135:
        r132 = r33;
        goto L136
    L128:
        if (r110 == 1) goto L132;
        if (r18 == false) goto L131;
        r2.m2380a(this.f1094e, this.f1098i);
        r14.m2380a(this.f1096g, this.f1100k);
        goto L135
    L131:
        r2.m2380a(r12, 0);
        r14.m2380a(r112, 0);
        goto L135
    L132:
        r14.m2380a(r112, 0);
        goto L135
    L121:
        if (r103.f8584E == false) goto L126;
        if (r33 == r103) goto L126;
        if (r33.f8584E == false) goto L126;
        r33.f8592M.m2380a(r103.f8592M, 0);
        goto L135
    L134:
        r53 = 3;
        goto L135
    L105:
        r20 = r1;
        goto L106
    L78:
        r19 = r9;
        goto L79
    L238:
        return;
    L68:
        r16 = r15;
        goto L69
    L237:
        return;
    L49:
        if (r72.f8584E == true) goto L62;
        int r133 = 0;
    L51:
        if (r133 >= r1) goto L62;
        if (r24 == false) goto L54;
        int r152 = (r1 - 1) - r133;
    L55:
        int r104 = this.f1103n + r152;
        if (r104 >= r4.f1275b1) goto L62;
        r103 = r4.f1274a1[r104];
        if (r103.f8584E == true) goto L63;
        r133 = r133 + 1;
        goto L51
    L54:
        r152 = r133;
        goto L55
    L137:
        int r202 = r1;
        boolean r182 = r52;
        int r192 = r9;
        C2454rb r111 = this.f1091b;
        r111.f8623i0 = r4.f1251D0;
        C1259cb r22 = r111.f8588I;
        C1259cb r34 = r111.f8590K;
        int r58 = this.f1097h;
        if (r23 <= 0) goto L140;
        r58 = r58 + r4.f1263P0;
    L140:
        if (r24 == false) goto L146;
        r34.m2380a(this.f1095f, r58);
        if (r25 == false) goto L144;
        r22.m2380a(this.f1093d, this.f1099j);
    L144:
        if (r23 <= 0) goto L151;
        this.f1095f.f4268d.f8588I.m2380a(r34, 0);
    L151:
        int r59 = 0;
        C2454rb r105 = null;
    L152:
        int r62 = r202;
        if (r59 >= r62) goto L239;
        int r73 = this.f1103n + r59;
        if (r73 >= r4.f1275b1) goto L240;
        C2454rb r74 = r4.f1274a1[r73];
        if (r74 != null) goto L160;
        r202 = r62;
    L214:
        r59 = r59 + 1;
        goto L152
    L160:
        C1259cb r95 = r74.f8589J;
        C1259cb r113 = r74.f8590K;
        C1259cb r122 = r74.f8588I;
        if (r59 != 0) goto L174;
        r74.m4929f(r95, this.f1094e, this.f1098i);
        int r134 = r4.f1252E0;
        float r142 = r4.f1258K0;
        if (this.f1103n != 0) goto L168;
        int r153 = r4.f1254G0;
        r202 = r62;
        int r63 = -1;
        if (r153 == (-1)) goto L169;
        r142 = r4.f1260M0;
    L167:
        r134 = r153;
    L173:
        r74.f8625j0 = r134;
        r74.f8615e0 = r142;
    L176:
        if (r59 != (r202 - 1)) goto L178;
        r74.m4929f(r74.f8591L, this.f1096g, this.f1100k);
    L178:
        if (r105 == null) goto L189;
        C1259cb r106 = r105.f8591L;
        r95.m2380a(r106, r4.f1264Q0);
        if (r59 != r8) goto L184;
        int r135 = this.f1098i;
        if (r95.m2387h() == false) goto L184;
        r95.f4272h = r135;
    L184:
        r106.m2380a(r95, 0);
        if (r59 != (r192 + 1)) goto L189;
        int r96 = this.f1100k;
        if (r106.m2387h() == false) goto L189;
        r106.f4272h = r96;
    L189:
        if (r74 == r111) goto L213;
        if (r24 == false) goto L202;
        int r107 = r4.f1265R0;
        if (r107 != 0) goto L195;
        r113.m2380a(r34, 0);
        goto L213
    L195:
        if (r107 == 1) goto L199;
        if (r107 != 2) goto L213;
        r122.m2380a(r22, 0);
        r113.m2380a(r34, 0);
        goto L213
    L199:
        r122.m2380a(r22, 0);
        goto L213
    L202:
        int r108 = r4.f1265R0;
        if (r108 != 0) goto L205;
        r122.m2380a(r22, 0);
        goto L213
    L205:
        if (r108 == 1) goto L211;
        if (r108 != 2) goto L213;
        if (r182 == false) goto L210;
        r122.m2380a(this.f1093d, this.f1097h);
        r113.m2380a(this.f1095f, this.f1099j);
        goto L213
    L210:
        r122.m2380a(r22, 0);
        r113.m2380a(r34, 0);
        goto L213
    L211:
        r113.m2380a(r34, 0);
    L213:
        r105 = r74;
    L169:
        if (r25 == false) goto L173;
        r153 = r4.f1256I0;
        if (r153 == r63) goto L173;
        r142 = r4.f1262O0;
        goto L167
    L168:
        r202 = r62;
        r63 = -1;
        goto L169
    L174:
        r202 = r62;
        goto L176
    L240:
        return;
    L239:
        return;
    L146:
        r22.m2380a(this.f1093d, r58);
        if (r25 == false) goto L149;
        r34.m2380a(this.f1095f, this.f1099j);
    L149:
        if (r23 <= 0) goto L151;
        this.f1093d.f4268d.f8590K.m2380a(r22, 0);
    L19:
        r52 = false;
        goto L20
    }

    /* JADX INFO: renamed from: c */
    public final int m690c() {
        if (this.f1090a != 1) goto L7;
        return this.f1102m - this.f1107r.f1264Q0;
    L7:
        return this.f1102m;
    }

    /* JADX INFO: renamed from: d */
    public final int m691d() {
        if (this.f1090a != 0) goto L7;
        return this.f1101l - this.f1107r.f1263P0;
    L7:
        return this.f1101l;
    }

    /* JADX INFO: renamed from: e */
    public final void m692e(int r12) {
        int r0 = this.f1105p;
        if (r0 == 0) goto L51;
        int r1 = this.f1104o;
        int r4 = r12 / r0;
        int r02 = 0;
    L6:
        C0368Ih r2 = this.f1107r;
        if (r02 >= r1) goto L27;
        int r3 = this.f1103n + r02;
        if (r3 >= r2.f1275b1) goto L27;
        C2454rb r7 = r2.f1274a1[r3];
        if (this.f1090a != 0) goto L20;
        if (r7 == null) goto L26;
        int[] r32 = r7.f8637p0;
        if (r32[0] != 3) goto L26;
        if (r7.f8639r != 0) goto L26;
        r2.m812V(1, r4, r32[1], r7.m4933k(), r7);
    L26:
        r02 = r02 + 1;
        goto L6
    L20:
        if (r7 == null) goto L26;
        int[] r5 = r7.f8637p0;
        if (r5[1] != 3) goto L26;
        if (r7.f8640s != 0) goto L26;
        int r6 = r4;
        r2.m812V(r5[0], r7.m4937q(), 1, r6, r7);
        r4 = r6;
    L27:
        this.f1101l = 0;
        this.f1102m = 0;
        this.f1091b = null;
        this.f1092c = 0;
        int r03 = this.f1104o;
        int r13 = 0;
    L28:
        if (r13 >= r03) goto L68;
        int r33 = this.f1103n + r13;
        if (r33 >= r2.f1275b1) goto L69;
        C2454rb r34 = r2.f1274a1[r33];
        if (this.f1090a != 0) goto L42;
        int r42 = r34.m4937q();
        int r62 = r2.f1263P0;
        if (r34.f8619g0 != 8) goto L37;
        r62 = 0;
    L37:
        this.f1101l = (r42 + r62) + this.f1101l;
        int r43 = r2.m810T(r34, this.f1106q);
        if (this.f1091b != null) goto L40;
    L41:
        this.f1091b = r34;
        this.f1092c = r43;
        this.f1102m = r43;
    L50:
        r13 = r13 + 1;
        goto L28
    L40:
        if (this.f1092c >= r43) goto L50;
    L42:
        int r44 = r2.m811U(r34, this.f1106q);
        int r63 = r2.m810T(r34, this.f1106q);
        int r72 = r2.f1264Q0;
        if (r34.f8619g0 != 8) goto L45;
        r72 = 0;
    L45:
        this.f1102m = (r63 + r72) + this.f1102m;
        if (this.f1091b != null) goto L48;
    L49:
        this.f1091b = r34;
        this.f1092c = r44;
        this.f1101l = r44;
        goto L50
    L48:
        if (this.f1092c >= r44) goto L50;
    L69:
        return;
    L68:
        return;
    }

    /* JADX INFO: renamed from: f */
    public final void m693f(int r1, C1259cb r2, C1259cb r3, C1259cb r4, C1259cb r5, int r6, int r7, int r8, int r9, int r10) {
        this.f1090a = r1;
        this.f1093d = r2;
        this.f1094e = r3;
        this.f1095f = r4;
        this.f1096g = r5;
        this.f1097h = r6;
        this.f1098i = r7;
        this.f1099j = r8;
        this.f1100k = r9;
        this.f1106q = r10;
    }
}
