package p085v;

import android.graphics.Path;

/* JADX INFO: renamed from: v.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1105f {

    /* JADX INFO: renamed from: a */
    public final char f4254a;

    /* JADX INFO: renamed from: b */
    public final float[] f4255b;

    public C1105f(char r1, float[] r2) {
        this.f4254a = r1;
        this.f4255b = r2;
    }

    /* JADX INFO: renamed from: a */
    public static void m2602a(Path r51, float r52, float r53, float r54, float r55, float r56, float r57, float r58, boolean r59, boolean r60) {
        double r4 = Math.toRadians(r58);
        double r10 = Math.cos(r4);
        double r12 = Math.sin(r4);
        double r14 = r52;
        double r7 = r53;
        double r18 = (r7 * r12) + (r14 * r10);
        double r16 = r14;
        double r142 = r56;
        double r182 = r18 / r142;
        double r42 = r57;
        double r22 = ((r7 * r10) + (((double) (-r52)) * r12)) / r42;
        double r24 = r7;
        double r1 = r55;
        double r26 = ((r1 * r12) + (((double) r54) * r10)) / r142;
        double r13 = ((r1 * r10) + (((double) (-r54)) * r12)) / r42;
        double r6 = r182 - r26;
        double r28 = r22 - r13;
        double r30 = (r182 + r26) / 2.0d;
        double r34 = (r22 + r13) / 2.0d;
        double r38 = (r28 * r28) + (r6 * r6);
        if (r38 != 0.0d) goto L5;
        return;
    L5:
        double r422 = (1.0d / r38) - 0.25d;
        if (r422 >= 0.0d) goto L9;
        float r15 = (float) (Math.sqrt(r38) / 1.99999d);
        m2602a(r51, r52, r53, r54, r55, r56 * r15, r57 * r15, r58, r59, r60);
        return;
    L9:
        double r382 = Math.sqrt(r422);
        double r62 = r6 * r382;
        double r383 = r382 * r28;
        if (r59 != r60) goto L12;
        double r302 = r30 - r383;
        double r342 = r34 + r62;
    L13:
        double r63 = Math.atan2(r22 - r342, r182 - r302);
        double r02 = Math.atan2(r13 - r342, r26 - r302) - r63;
        if (r02 < 0.0d) goto L16;
        boolean r8 = true;
    L17:
        if (r60 != r8) goto L19;
    L22:
        double r303 = r302 * r142;
        double r343 = r342 * r42;
        double r82 = (r303 * r10) - (r343 * r12);
        double r344 = (r343 * r10) + (r303 * r12);
        int r2 = (int) Math.ceil(Math.abs((r02 * 4.0d) / 3.141592653589793d));
        double r122 = Math.cos(r4);
        double r183 = Math.sin(r4);
        double r20 = Math.cos(r63);
        double r222 = Math.sin(r63);
        double r102 = -r142;
        double r262 = r102 * r122;
        double r304 = r42 * r183;
        double r282 = (r262 * r222) - (r304 * r20);
        double r103 = r102 * r183;
        double r43 = r42 * r122;
        double r202 = (r20 * r43) + (r222 * r103);
        double r552 = r43;
        double r03 = r02 / ((double) r2);
        int r3 = 0;
    L23:
        if (r3 >= r2) goto L25;
        double r44 = r63 + r03;
        double r223 = Math.sin(r44);
        double r36 = Math.cos(r44);
        double r572 = r03;
        double r04 = (((r142 * r122) * r36) + r82) - (r304 * r223);
        double r423 = r552;
        double r542 = r82;
        double r83 = (r423 * r223) + (((r142 * r183) * r36) + r344);
        double r384 = (r262 * r223) - (r304 * r36);
        double r224 = (r36 * r423) + (r223 * r103);
        double r64 = r44 - r63;
        double r362 = Math.tan(r64 / 2.0d);
        double r46 = ((Math.sqrt(((r362 * 3.0d) * r362) + 4.0d) - 1.0d) * Math.sin(r64)) / 3.0d;
        double r592 = r103;
        r51.rLineTo(0.0f, 0.0f);
        r51.cubicTo((float) ((r282 * r46) + r16), (float) ((r202 * r46) + r24), (float) (r04 - (r46 * r384)), (float) (r83 - (r46 * r224)), (float) r04, (float) r83);
        r3 = r3 + 1;
        r63 = r44;
        r103 = r592;
        r122 = r122;
        r2 = r2;
        r202 = r224;
        r142 = r142;
        r282 = r384;
        r16 = r04;
        r24 = r83;
        r82 = r542;
        r03 = r572;
        r552 = r423;
        goto L23
    L25:
        return;
    L19:
        if (r02 <= 0.0d) goto L21;
        r02 = r02 - 6.283185307179586d;
        goto L22
    L21:
        r02 = r02 + 6.283185307179586d;
        goto L22
    L16:
        r8 = false;
        goto L17
    L12:
        r302 = r30 + r383;
        r342 = r34 - r62;
        goto L13
    }

    /* JADX INFO: renamed from: b */
    public static void m2603b(C1105f[] r33, Path r34) {
        C1105f[] r02 = r33;
        int r12 = 6;
        float[] r13 = new float[6];
        int r14 = r02.length;
        int r10 = 0;
        char r1 = 'm';
    L3:
        if (r10 >= r14) goto L140;
        C1105f r9 = r02[r10];
        char r8 = r9.f4254a;
        float r2 = r13[0];
        float r3 = r13[1];
        float r4 = r13[2];
        float r5 = r13[3];
        float r6 = r13[4];
        float r7 = r13[5];
        switch(r8) {
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
        float r23 = r6;
        float r24 = r7;
        float r72 = r2;
        float r62 = r3;
        int r32 = 0;
    L13:
        float[] r25 = r9.f4255b;
        if (r32 >= r25.length) goto L139;
        if (r8 != 'A') goto L18;
        int r322 = r32;
        float r122 = r62;
        float r03 = r72;
        char r29 = r8;
        int r30 = r10;
        int r27 = r14;
        C1105f r142 = r9;
        int r15 = r322 + 5;
        float r42 = r25[r15];
        int r26 = r322 + 6;
        float r52 = r25[r26];
        float r63 = r25[r322];
        float r73 = r25[r322 + 1];
        float r82 = r25[r322 + 2];
        if (r25[r322 + 3] == 0.0f) goto L132;
        boolean r92 = true;
    L134:
        if (r25[r322 + 4] == 0.0f) goto L136;
        boolean r102 = true;
    L137:
        m2602a(r34, r03, r122, r42, r52, r63, r73, r82, r92, r102);
        r72 = r25[r15];
        r62 = r25[r26];
    L123:
        r5 = r62;
        r4 = r72;
    L138:
        r32 = r322 + r22;
        r9 = r142;
        r14 = r27;
        r1 = r29;
        r8 = r1;
        r10 = r30;
        goto L13
    L136:
        r102 = false;
        goto L137
    L132:
        r92 = false;
        goto L134
    L18:
        if (r8 != 'C') goto L20;
        r322 = r32;
        r29 = r8;
        r30 = r10;
        r27 = r14;
        r142 = r9;
        int r04 = r322 + 2;
        int r83 = r322 + 3;
        int r93 = r322 + 4;
        int r103 = r322 + 5;
        r34.cubicTo(r25[r322], r25[r322 + 1], r25[r04], r25[r83], r25[r93], r25[r103]);
        r72 = r25[r93];
        r62 = r25[r103];
        float r05 = r25[r04];
        float r16 = r25[r83];
    L126:
        r4 = r05;
        r5 = r16;
        goto L138
    L20:
        if (r8 != 'H') goto L22;
        r322 = r32;
        r29 = r8;
        r30 = r10;
        r27 = r14;
        r142 = r9;
        r34.lineTo(r25[r322], r62);
        r72 = r25[r322];
        goto L138
    L22:
        if (r8 != 'Q') goto L24;
        r322 = r32;
        r29 = r8;
        r30 = r10;
        r27 = r14;
        r142 = r9;
        float r06 = r25[r322];
        int r35 = r322 + 1;
        float r17 = r25[r35];
        int r28 = r322 + 2;
        int r53 = r322 + 3;
        r34.quadTo(r06, r17, r25[r28], r25[r53]);
        r05 = r25[r322];
        r16 = r25[r35];
        r72 = r25[r28];
        r62 = r25[r53];
        goto L126
    L24:
        if (r8 != 'V') goto L26;
        r322 = r32;
        r29 = r8;
        r30 = r10;
        r27 = r14;
        r142 = r9;
        r34.lineTo(r72, r25[r322]);
        r62 = r25[r322];
        goto L138
    L26:
        if (r8 != 'a') goto L28;
        r322 = r32;
        float r123 = r62;
        float r07 = r72;
        int r152 = r322 + 5;
        float r43 = r25[r152] + r07;
        int r262 = r322 + 6;
        float r54 = r25[r262] + r123;
        float r64 = r25[r322];
        float r74 = r25[r322 + 1];
        float r272 = r25[r322 + 2];
        if (r25[r322 + 3] == 0.0f) goto L117;
        boolean r252 = true;
    L119:
        if (r25[r322 + 4] == 0.0f) goto L121;
        boolean r282 = true;
    L122:
        r29 = r8;
        r27 = r14;
        r142 = r9;
        r30 = r10;
        m2602a(r34, r07, r123, r43, r54, r64, r74, r272, r252, r282);
        r72 = r07 + r25[r152];
        r62 = r123 + r25[r262];
        goto L123
    L121:
        r282 = false;
        goto L122
    L117:
        r252 = false;
        goto L119
    L28:
        if (r8 != 'c') goto L30;
        r322 = r32;
        float r124 = r62;
        float r08 = r72;
        int r153 = r322 + 2;
        int r253 = r322 + 3;
        int r263 = r322 + 4;
        int r273 = r322 + 5;
        r34.rCubicTo(r25[r322], r25[r322 + 1], r25[r153], r25[r253], r25[r263], r25[r273]);
        float r75 = r08 + r25[r153];
        float r65 = r124 + r25[r253];
        float r09 = r08 + r25[r263];
        float r18 = r25[r273] + r124;
    L75:
        r5 = r65;
        r4 = r75;
        r29 = r8;
        r30 = r10;
        r27 = r14;
        r72 = r09;
        r62 = r18;
    L52:
        r142 = r9;
        goto L138
    L30:
        if (r8 != 'h') goto L32;
        r322 = r32;
        r34.rLineTo(r25[r322], 0.0f);
        r72 = r72 + r25[r322];
    L51:
        r29 = r8;
        r30 = r10;
        r27 = r14;
        goto L52
    L32:
        if (r8 != 'q') goto L34;
        r322 = r32;
        float r125 = r62;
        float r010 = r72;
        int r36 = r322 + 1;
        int r44 = r322 + 2;
        int r66 = r322 + 3;
        r34.rQuadTo(r25[r322], r25[r36], r25[r44], r25[r66]);
        float r76 = r010 + r25[r322];
        float r19 = r25[r36] + r125;
        float r011 = r010 + r25[r44];
        r62 = r125 + r25[r66];
        r5 = r19;
        r4 = r76;
        r29 = r8;
        r30 = r10;
        r27 = r14;
        r72 = r011;
        goto L52
    L34:
        if (r8 != 'v') goto L36;
        r322 = r32;
        r34.rLineTo(0.0f, r25[r322]);
        r62 = r62 + r25[r322];
        goto L51
    L36:
        if (r8 != 'L') goto L38;
        r322 = r32;
        int r37 = r322 + 1;
        r34.lineTo(r25[r322], r25[r37]);
        r72 = r25[r322];
        r62 = r25[r37];
        goto L51
    L38:
        if (r8 != 'M') goto L40;
        r322 = r32;
        r72 = r25[r322];
        r62 = r25[r322 + 1];
        if (r322 <= 0) goto L108;
        r34.lineTo(r72, r62);
        goto L51
    L108:
        r34.moveTo(r72, r62);
    L80:
        r24 = r62;
        r23 = r72;
        goto L51
    L40:
        if (r8 != 'S') goto L42;
        r322 = r32;
        float r126 = r62;
        float r012 = r72;
        if (r1 == 'c') goto L103;
        if (r1 == 's') goto L103;
        if (r1 == 'C') goto L103;
        if (r1 == 'S') goto L103;
        float r210 = r012;
        float r38 = r126;
    L104:
        int r013 = r322 + 1;
        int r127 = r322 + 2;
        int r154 = r322 + 3;
        r34.cubicTo(r210, r38, r25[r322], r25[r013], r25[r127], r25[r154]);
        float r110 = r25[r322];
        float r014 = r25[r013];
        r72 = r25[r127];
        r62 = r25[r154];
        r5 = r014;
        r4 = r110;
    L103:
        r38 = (r126 * 2.0f) - r5;
        r210 = (r012 * 2.0f) - r4;
        goto L104
    L42:
        if (r8 != 'T') goto L44;
        r322 = r32;
        float r155 = r62;
        float r015 = r72;
        if (r1 != 'q') goto L85;
    L92:
        r75 = (r015 * 2.0f) - r4;
        r65 = (r155 * 2.0f) - r5;
    L93:
        int r39 = r322 + 1;
        r34.quadTo(r75, r65, r25[r322], r25[r39]);
        r09 = r25[r322];
        r18 = r25[r39];
        goto L75
    L85:
        if (r1 == 't') goto L92;
        if (r1 == 'Q') goto L92;
        if (r1 == 'T') goto L92;
        r75 = r015;
        r65 = r155;
        goto L93
    L44:
        if (r8 != 'l') goto L46;
        r322 = r32;
        int r310 = r322 + 1;
        r34.rLineTo(r25[r322], r25[r310]);
        r72 = r72 + r25[r322];
        r62 = r62 + r25[r310];
        goto L51
    L46:
        if (r8 == 'm') goto L76;
        if (r8 == 's') goto L65;
        if (r8 == 't') goto L54;
        r322 = r32;
        goto L51
    L54:
        if (r1 == 'q') goto L62;
        if (r1 == 't') goto L62;
        if (r1 == 'Q') goto L62;
        if (r1 == 'T') goto L62;
        float r111 = 0.0f;
        float r156 = 0.0f;
    L63:
        int r55 = r32 + 1;
        r34.rQuadTo(r156, r111, r25[r32], r25[r55]);
        float r157 = r156 + r72;
        float r112 = r111 + r62;
        r72 = r72 + r25[r32];
        r62 = r62 + r25[r55];
        r5 = r112;
        r322 = r32;
        r29 = r8;
        r30 = r10;
        r27 = r14;
        r4 = r157;
    L62:
        r156 = r72 - r4;
        r111 = r62 - r5;
        goto L63
    L65:
        if (r1 == 'c') goto L73;
        if (r1 == 's') goto L73;
        if (r1 == 'C') goto L73;
        if (r1 == 'S') goto L73;
        float r45 = 0.0f;
        float r254 = 0.0f;
    L74:
        int r128 = r32 + 1;
        int r264 = r32 + 2;
        int r283 = r32 + 3;
        r322 = r32;
        float r158 = r62;
        float r016 = r72;
        r34.rCubicTo(r254, r45, r25[r32], r25[r128], r25[r264], r25[r283]);
        r75 = r016 + r25[r322];
        r65 = r158 + r25[r128];
        r09 = r016 + r25[r264];
        r18 = r25[r283] + r158;
    L73:
        float r113 = r72 - r4;
        r45 = r62 - r5;
        r254 = r113;
        goto L74
    L76:
        r322 = r32;
        float r114 = r25[r322];
        r72 = r72 + r114;
        float r017 = r25[r322 + 1];
        r62 = r62 + r017;
        if (r322 <= 0) goto L79;
        r34.rLineTo(r114, r017);
        goto L51
    L79:
        r34.rMoveTo(r114, r017);
        goto L80
    L139:
        r13[0] = r72;
        r13[1] = r62;
        r13[2] = r4;
        r13[3] = r5;
        r13[4] = r23;
        r13[5] = r24;
        r1 = r9.f4254a;
        r10 = r10 + 1;
        r02 = r33;
        r14 = r14;
        r12 = 6;
        goto L3
    L7:
        r34.close();
        r34.moveTo(r6, r7);
        r2 = r6;
        r4 = r2;
        r3 = r7;
        r5 = r3;
        goto L6
    L8:
        r22 = 4;
        goto L12
    L9:
        r22 = 1;
        goto L12
    L10:
        r22 = r12;
        goto L12
    L11:
        r22 = 7;
        goto L12
    }
}
