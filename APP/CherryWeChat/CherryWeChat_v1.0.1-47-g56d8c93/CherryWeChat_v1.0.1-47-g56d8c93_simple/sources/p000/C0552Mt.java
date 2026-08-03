package p000;

import android.graphics.Path;

/* JADX INFO: renamed from: Mt */
/* JADX INFO: loaded from: classes.dex */
public final class C0552Mt {

    /* JADX INFO: renamed from: a */
    public char f1820a;

    /* JADX INFO: renamed from: b */
    public final float[] f1821b;

    public C0552Mt(char r1, float[] r2) {
        this.f1820a = r1;
        this.f1821b = r2;
    }

    /* JADX INFO: renamed from: a */
    public static void m1094a(Path r52, float r53, float r54, float r55, float r56, float r57, float r58, float r59, boolean r60, boolean r61) {
        double r4 = Math.toRadians(r59);
        double r8 = Math.cos(r4);
        double r10 = Math.sin(r4);
        double r12 = r53;
        double r42 = r54;
        double r14 = r57;
        double r18 = ((r42 * r10) + (r12 * r8)) / r14;
        double r0 = r58;
        double r20 = ((r42 * r8) + (((double) (-r53)) * r10)) / r0;
        double r1 = r56;
        double r26 = ((r1 * r10) + (((double) r55) * r8)) / r14;
        double r24 = ((r1 * r8) + (((double) (-r55)) * r10)) / r0;
        double r02 = r18 - r26;
        double r28 = r20 - r24;
        double r30 = (r18 + r26) / 2.0d;
        double r34 = (r20 + r24) / 2.0d;
        double r38 = (r28 * r28) + (r02 * r02);
        if (r38 != 0.0d) goto L5;
        return;
    L5:
        double r422 = (1.0d / r38) - 0.25d;
        if (r422 >= 0.0d) goto L9;
        float r03 = (float) (Math.sqrt(r38) / 1.99999d);
        m1094a(r52, r53, r54, r55, r56, r57 * r03, r03 * r58, r59, r60, r61);
        return;
    L9:
        double r6 = Math.sqrt(r422);
        double r04 = r02 * r6;
        double r62 = r6 * r28;
        if (r60 != r61) goto L12;
        double r302 = r30 - r62;
        double r342 = r34 + r04;
    L13:
        double r05 = Math.atan2(r20 - r342, r18 - r302);
        double r06 = Math.atan2(r24 - r342, r26 - r302) - r05;
        if (r06 < 0.0d) goto L16;
        boolean r7 = true;
    L17:
        if (r61 != r7) goto L19;
    L22:
        double r303 = r302 * r14;
        double r343 = r342 * r0;
        double r2 = (r303 * r8) - (r343 * r10);
        double r344 = (r343 * r8) + (r303 * r10);
        int r9 = (int) Math.ceil(Math.abs((r06 * 4.0d) / 3.141592653589793d));
        double r102 = Math.cos(r4);
        double r16 = Math.sin(r4);
        double r182 = Math.cos(r05);
        double r202 = Math.sin(r05);
        double r63 = -r14;
        double r242 = r63 * r102;
        double r282 = r0 * r16;
        double r262 = (r242 * r202) - (r282 * r182);
        double r64 = r63 * r16;
        double r22 = r0 * r102;
        double r07 = r06 / ((double) r9);
        double r203 = (r182 * r22) + (r202 * r64);
        int r82 = 0;
        double r183 = r12;
        double r122 = r42;
        double r43 = r05;
    L23:
        if (r82 >= r9) goto L25;
        double r304 = r43 + r07;
        double r36 = Math.sin(r304);
        double r382 = Math.cos(r304);
        double r46 = r07;
        double r08 = (((r14 * r102) * r382) + r2) - (r282 * r36);
        double r48 = r2;
        double r23 = (r22 * r36) + (((r14 * r16) * r382) + r344);
        double r423 = (r242 * r36) - (r282 * r382);
        double r362 = (r382 * r22) + (r36 * r64);
        double r44 = r304 - r43;
        double r383 = Math.tan(r44 / 2.0d);
        double r384 = ((Math.sqrt(((r383 * 3.0d) * r383) + 4.0d) - 1.0d) * Math.sin(r44)) / 3.0d;
        double r123 = (r203 * r384) + r122;
        double r204 = r64;
        r52.rLineTo(0.0f, 0.0f);
        r52.cubicTo((float) ((r262 * r384) + r183), (float) r123, (float) (r08 - (r384 * r423)), (float) (r23 - (r384 * r362)), (float) r08, (float) r23);
        r82 = r82 + 1;
        r122 = r23;
        r9 = r9;
        r64 = r204;
        r102 = r102;
        r43 = r304;
        r203 = r362;
        r262 = r423;
        r2 = r48;
        r183 = r08;
        r07 = r46;
        goto L23
    L25:
        return;
    L19:
        if (r06 <= 0.0d) goto L21;
        r06 = r06 - 6.283185307179586d;
        goto L22
    L21:
        r06 = r06 + 6.283185307179586d;
        goto L22
    L16:
        r7 = false;
        goto L17
    L12:
        r302 = r30 + r62;
        r342 = r34 - r04;
        goto L13
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static void m1095b(C0552Mt[] r33, Path r34) {
        C0552Mt[] r0 = r33;
        Path r1 = r34;
        float[] r12 = new float[6];
        int r13 = r0.length;
        int r15 = 0;
        int r8 = 0;
        char r2 = 'm';
    L3:
        if (r8 >= r13) goto L142;
        C0552Mt r9 = r0[r8];
        char r10 = r9.f1820a;
        float[] r3 = r9.f1821b;
        float r4 = r12[r15];
        float r5 = r12[1];
        float r6 = r12[2];
        float r7 = r12[3];
        float r11 = r12[4];
        int r21 = r15;
        float r152 = r12[5];
        switch(r10) {
            case 65: goto L11;
            case 67: goto L10;
            case 72: goto L9;
            case 81: goto L8;
            case 83: goto L8;
            case 86: goto L9;
            case 90: goto L7;
            case 97: goto L11;
            case 99: goto L10;
            case 104: goto L9;
            case 113: goto L8;
            case 115: goto L8;
            case 118: goto L9;
            case 122: goto L7;
            default: goto L6;
        };
    L6:
        int r22 = 2;
    L12:
        float r23 = r11;
        float r24 = r152;
        float r112 = r4;
        float r153 = r5;
        int r42 = r21;
    L14:
        if (r42 >= r3.length) goto L141;
        if (r10 != 'A') goto L18;
        float[] r25 = r3;
        int r30 = r42;
        C0552Mt r02 = r9;
        float r26 = r112;
        float r32 = r153;
        int r154 = r8;
        char r113 = r10;
        int r14 = r30 + 5;
        float r43 = r25[r14];
        int r27 = r30 + 6;
        float r52 = r25[r27];
        float r62 = r25[r30];
        float r72 = r25[r30 + 1];
        float r82 = r25[r30 + 2];
        if (r25[r30 + 3] == 0.0f) goto L133;
        boolean r92 = 1;
    L135:
        if (r25[r30 + 4] == 0.0f) goto L138;
        boolean r102 = 1;
    L139:
        m1094a(r34, r26, r32, r43, r52, r62, r72, r82, r92, r102);
        r6 = r25[r14];
        float r35 = r25[r27];
        r7 = r35;
        float r28 = r6;
    L140:
        r42 = r30 + r22;
        r1 = r34;
        r9 = r02;
        r10 = r113;
        r8 = r154;
        r112 = r28;
        r153 = r35;
        r2 = r10;
        r3 = r25;
        goto L14
    L138:
        r102 = r21;
        goto L139
    L133:
        r92 = r21;
        goto L135
    L18:
        if (r10 != 'C') goto L20;
        r25 = r3;
        r30 = r42;
        r154 = r8;
        r02 = r9;
        r113 = r10;
        int r83 = r30 + 2;
        int r93 = r30 + 3;
        int r103 = r30 + 4;
        int r142 = r30 + 5;
        r1.cubicTo(r25[r30], r25[r30 + 1], r25[r83], r25[r93], r25[r103], r25[r142]);
        float r16 = r25[r103];
        float r29 = r25[r142];
        r6 = r25[r83];
        r7 = r25[r93];
        r35 = r29;
        r28 = r16;
        goto L140
    L20:
        if (r10 != 'H') goto L22;
        r25 = r3;
        r30 = r42;
        r02 = r9;
        r113 = r10;
        r35 = r153;
        r154 = r8;
        r1.lineTo(r25[r30], r35);
        r28 = r25[r30];
        goto L140
    L22:
        if (r10 != 'Q') goto L24;
        r25 = r3;
        r30 = r42;
        r154 = r8;
        r02 = r9;
        r113 = r10;
        int r44 = r30 + 1;
        int r53 = r30 + 2;
        int r73 = r30 + 3;
        r1.quadTo(r25[r30], r25[r44], r25[r53], r25[r73]);
        float r210 = r25[r30];
        float r36 = r25[r44];
        float r45 = r25[r53];
        float r54 = r25[r73];
        r6 = r210;
        r7 = r36;
        r28 = r45;
        r35 = r54;
        goto L140
    L24:
        if (r10 != 'V') goto L26;
        r25 = r3;
        r30 = r42;
        r154 = r8;
        r02 = r9;
        r28 = r112;
        r113 = r10;
        r1.lineTo(r28, r25[r30]);
        r35 = r25[r30];
        goto L140
    L26:
        if (r10 != 'a') goto L28;
        r25 = r3;
        r30 = r42;
        int r143 = r30 + 5;
        float r46 = r25[r143] + r112;
        int r272 = r30 + 6;
        float r55 = r25[r272] + r153;
        float r63 = r25[r30];
        float r74 = r25[r30 + 1];
        float r17 = r25[r30 + 2];
        if (r25[r30 + 3] == 0.0f) goto L119;
        C0552Mt r211 = r9;
        boolean r94 = 1;
    L120:
        r02 = r211;
        float r212 = r112;
        r113 = r10;
        if (r25[r30 + 4] == 0.0f) goto L124;
        boolean r104 = 1;
    L123:
        float r37 = r153;
        r154 = r8;
        m1094a(r34, r212, r37, r46, r55, r63, r74, r17, r94, r104);
        r28 = r212 + r25[r143];
        r35 = r37 + r25[r272];
        r6 = r28;
        r7 = r35;
        goto L140
    L124:
        r104 = r21;
        goto L123
    L119:
        r211 = r9;
        r94 = r21;
        goto L120
    L28:
        if (r10 != 'c') goto L30;
        r25 = r3;
        r30 = r42;
        int r144 = r30 + 2;
        int r262 = r30 + 3;
        int r273 = r30 + 4;
        int r282 = r30 + 5;
        r1.rCubicTo(r25[r30], r25[r30 + 1], r25[r144], r25[r262], r25[r273], r25[r282]);
        float r18 = r25[r144] + r112;
        float r213 = r25[r262] + r153;
        r112 = r112 + r25[r273];
        r153 = r153 + r25[r282];
        r6 = r18;
        r7 = r213;
    L78:
        r02 = r9;
        r28 = r112;
        r35 = r153;
    L52:
        r154 = r8;
    L53:
        r113 = r10;
        goto L140
    L30:
        if (r10 != 'h') goto L32;
        r25 = r3;
        r30 = r42;
        r1.rLineTo(r25[r30], 0.0f);
        r112 = r112 + r25[r30];
        goto L78
    L32:
        if (r10 != 'q') goto L34;
        r25 = r3;
        r30 = r42;
        int r47 = r30 + 1;
        int r56 = r30 + 2;
        int r75 = r30 + 3;
        r1.rQuadTo(r25[r30], r25[r47], r25[r56], r25[r75]);
        float r214 = r25[r30] + r112;
        float r38 = r25[r47] + r153;
        r112 = r112 + r25[r56];
        float r48 = r25[r75];
    L77:
        r153 = r153 + r48;
        r6 = r214;
        r7 = r38;
        goto L78
    L34:
        if (r10 != 'v') goto L36;
        r25 = r3;
        r30 = r42;
        r1.rLineTo(0.0f, r25[r30]);
        float r215 = r25[r30];
    L84:
        r153 = r153 + r215;
        goto L78
    L36:
        if (r10 != 'L') goto L38;
        r25 = r3;
        r30 = r42;
        int r49 = r30 + 1;
        r1.lineTo(r25[r30], r25[r49]);
        r28 = r25[r30];
        r35 = r25[r49];
    L106:
        r154 = r8;
        r02 = r9;
        goto L53
    L38:
        if (r10 != 'M') goto L40;
        r25 = r3;
        r30 = r42;
        r28 = r25[r30];
        r35 = r25[r30 + 1];
        if (r30 <= 0) goto L110;
        r1.lineTo(r28, r35);
        goto L106
    L110:
        r1.moveTo(r28, r35);
        r23 = r28;
        r24 = r35;
        goto L106
    L40:
        if (r10 != 'S') goto L42;
        r25 = r3;
        r30 = r42;
        if (r2 == 'c') goto L104;
        if (r2 == 's') goto L104;
        if (r2 == 'C') goto L104;
        if (r2 == 'S') goto L104;
    L103:
        float r216 = r112;
        float r39 = r153;
        int r114 = r30 + 1;
        int r145 = r30 + 2;
        int r155 = r30 + 3;
        r1.cubicTo(r216, r39, r25[r30], r25[r114], r25[r145], r25[r155]);
        float r217 = r25[r30];
        float r310 = r25[r114];
        r6 = r217;
        r7 = r310;
        r28 = r25[r145];
        r35 = r25[r155];
    L104:
        r112 = (r112 * 2.0f) - r6;
        r153 = (r153 * 2.0f) - r7;
        goto L103
    L42:
        if (r10 != 'T') goto L44;
        r25 = r3;
        r30 = r42;
        if (r2 != 'q') goto L88;
    L93:
        r112 = (r112 * 2.0f) - r6;
        r153 = (r153 * 2.0f) - r7;
    L94:
        int r410 = r30 + 1;
        r1.quadTo(r112, r153, r25[r30], r25[r410]);
        r28 = r25[r30];
        r35 = r25[r410];
        r02 = r9;
        r6 = r112;
        r7 = r153;
        goto L52
    L88:
        if (r2 == 't') goto L93;
        if (r2 == 'Q') goto L93;
        if (r2 != 'T') goto L94;
    L44:
        if (r10 != 'l') goto L46;
        r25 = r3;
        r30 = r42;
        int r411 = r30 + 1;
        r1.rLineTo(r25[r30], r25[r411]);
        r112 = r112 + r25[r30];
        r215 = r25[r411];
        goto L84
    L46:
        if (r10 == 'm') goto L79;
        if (r10 == 's') goto L66;
        if (r10 == 't') goto L55;
        r25 = r3;
        r30 = r42;
        r02 = r9;
        r28 = r112;
    L51:
        r35 = r153;
        goto L52
    L55:
        if (r2 == 'q') goto L63;
        if (r2 == 't') goto L63;
        if (r2 == 'Q') goto L63;
        if (r2 == 'T') goto L63;
        float r218 = 0.0f;
        float r146 = 0.0f;
    L64:
        int r64 = r42 + 1;
        r1.rQuadTo(r146, r218, r3[r42], r3[r64]);
        float r147 = r146 + r112;
        float r219 = r218 + r153;
        float r115 = r112 + r3[r42];
        r153 = r153 + r3[r64];
        r7 = r219;
        r25 = r3;
        r30 = r42;
        r02 = r9;
        r28 = r115;
        r6 = r147;
    L63:
        r146 = r112 - r6;
        r218 = r153 - r7;
        goto L64
    L66:
        if (r2 == 'c') goto L75;
        if (r2 == 's') goto L75;
        if (r2 == 'C') goto L75;
        if (r2 == 'S') goto L75;
        float r220 = 0.0f;
        float r148 = 0.0f;
    L74:
        int r57 = r42;
        int r263 = r57 + 1;
        int r274 = r57 + 2;
        int r283 = r57 + 3;
        r25 = r3;
        r30 = r57;
        r1.rCubicTo(r220, r148, r3[r57], r3[r263], r3[r274], r3[r283]);
        r214 = r25[r30] + r112;
        r38 = r25[r263] + r153;
        r112 = r112 + r25[r274];
        r48 = r25[r283];
    L75:
        r148 = r153 - r7;
        r220 = r112 - r6;
        goto L74
    L79:
        r25 = r3;
        r30 = r42;
        float r221 = r25[r30];
        r112 = r112 + r221;
        float r311 = r25[r30 + 1];
        r153 = r153 + r311;
        if (r30 <= 0) goto L82;
        r1.rLineTo(r221, r311);
        goto L78
    L82:
        r1.rMoveTo(r221, r311);
        r02 = r9;
        r28 = r112;
        r23 = r28;
        r35 = r153;
        r24 = r35;
        goto L52
    L141:
        r12[r21] = r112;
        r12[1] = r153;
        r12[2] = r6;
        r12[3] = r7;
        r12[4] = r23;
        r12[5] = r24;
        r2 = r9.f1820a;
        r8 = r8 + 1;
        r0 = r33;
        r1 = r34;
        r15 = r21;
        goto L3
    L7:
        r1.close();
        r1.moveTo(r11, r152);
        r4 = r11;
        r6 = r4;
        r5 = r152;
        r7 = r5;
        goto L6
    L8:
        r22 = 4;
        goto L12
    L9:
        r22 = 1;
        goto L12
    L10:
        r22 = 6;
        goto L12
    L11:
        r22 = 7;
        goto L12
    }

    public C0552Mt(C0552Mt r2) {
        this.f1820a = r2.f1820a;
        float[] r22 = r2.f1821b;
        this.f1821b = AbstractC1406fG.m2684I(r22, r22.length);
    }
}
