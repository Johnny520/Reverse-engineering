package defpackage;

import android.graphics.Path;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class ox {
    public char a;
    public float[] b;

    public static void a(Path r54, float r55, float r56, float r57, float r58, float r59, float r60, float r61, boolean r62, boolean r63) {
        double r4 = Math.toRadians(r61);
        double r8 = Math.cos(r4);
        double r10 = Math.sin(r4);
        double r12 = r55;
        double r42 = r56;
        double r14 = r59;
        double r18 = ((r42 * r10) + (r12 * r8)) / r14;
        double r0 = r60;
        double r20 = ((r42 * r8) + (((double) (-r55)) * r10)) / r0;
        double r1 = r58;
        double r26 = ((r1 * r10) + (((double) r57) * r8)) / r14;
        double r24 = ((r1 * r8) + (((double) (-r57)) * r10)) / r0;
        double r02 = r18 - r26;
        double r28 = r20 - r24;
        double r30 = (r18 + r26) / 2.0d;
        double r34 = (r20 + r24) / 2.0d;
        double r03 = (r28 * r28) + (r02 * r02);
        if (r03 != 0.0d) goto L6;
        Log.w("PathParser", " Points are coincident");
        return;
    L6:
        double r422 = (1.0d / r03) - 0.25d;
        if (r422 >= 0.0d) goto L10;
        Log.w("PathParser", "Points are too far apart " + r03);
        float r04 = (float) (Math.sqrt(r03) / 1.99999d);
        a(r54, r55, r56, r57, r58, r59 * r04, r04 * r60, r61, r62, r63);
        return;
    L10:
        double r13 = Math.sqrt(r422);
        double r6 = r13 * r02;
        double r15 = r13 * r28;
        if (r62 != r63) goto L13;
        double r302 = r30 - r15;
        double r342 = r34 + r6;
    L14:
        double r16 = Math.atan2(r20 - r342, r18 - r302);
        double r17 = Math.atan2(r24 - r342, r26 - r302) - r16;
        if (r17 < 0.0d) goto L17;
        boolean r7 = true;
    L18:
        if (r63 != r7) goto L20;
    L23:
        double r303 = r302 * r14;
        double r343 = r342 * r0;
        double r182 = (r303 * r8) - (r343 * r10);
        double r344 = (r343 * r8) + (r303 * r10);
        int r05 = (int) Math.ceil(Math.abs((r17 * 4.0d) / 3.141592653589793d));
        double r9 = Math.cos(r4);
        double r162 = Math.sin(r4);
        double r202 = Math.cos(r16);
        double r242 = Math.sin(r16);
        double r64 = -r14;
        double r262 = r64 * r9;
        double r304 = r0 * r162;
        double r282 = (r262 * r242) - (r304 * r202);
        double r65 = r64 * r162;
        double r22 = r0 * r9;
        double r19 = r17 / ((double) r05);
        double r243 = (r202 * r22) + (r242 * r65);
        double r203 = r12;
        double r11 = r42;
        int r5 = 0;
        double r3 = r16;
    L24:
        if (r5 >= r05) goto L26;
        double r36 = r3 + r19;
        double r40 = Math.sin(r36);
        double r423 = Math.cos(r36);
        int r82 = r05;
        double r06 = (((r14 * r9) * r423) + r182) - (r304 * r40);
        double r2 = (r22 * r40) + (((r14 * r162) * r423) + r344);
        double r44 = (r262 * r40) - (r304 * r423);
        double r402 = (r423 * r22) + (r40 * r65);
        double r424 = r36 - r3;
        double r46 = Math.tan(r424 / 2.0d);
        double r462 = ((Math.sqrt(((r46 * 3.0d) * r46) + 4.0d) - 1.0d) * Math.sin(r424)) / 3.0d;
        double r112 = (r243 * r462) + r11;
        double r244 = r65;
        r54.rLineTo(0.0f, 0.0f);
        r54.cubicTo((float) ((r282 * r462) + r203), (float) r112, (float) (r06 - (r462 * r44)), (float) (r2 - (r462 * r402)), (float) r06, (float) r2);
        r5 = r5 + 1;
        r11 = r2;
        r9 = r9;
        r65 = r244;
        r3 = r36;
        r243 = r402;
        r203 = r06;
        r05 = r82;
        r282 = r44;
        r19 = r19;
        goto L24
    L26:
        return;
    L20:
        if (r17 <= 0.0d) goto L22;
        r17 = r17 - 6.283185307179586d;
        goto L23
    L22:
        r17 = r17 + 6.283185307179586d;
        goto L23
    L17:
        r7 = false;
        goto L18
    L13:
        r302 = r30 + r15;
        r342 = r34 - r6;
        goto L14
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(ox[] r31, Path r32) {
        Path r1 = r32;
        int r11 = 6;
        float[] r12 = new float[6];
        int r14 = 0;
        char r2 = 'm';
        int r15 = 0;
    L4:
        if (r15 >= r31.length) goto L140;
        ox r3 = r31[r15];
        char r8 = r3.a;
        float[] r9 = r3.b;
        float r33 = r12[r14];
        float r4 = r12[1];
        float r5 = r12[2];
        float r6 = r12[3];
        float r7 = r12[4];
        float r10 = r12[5];
        switch(r8) {
            case 65: goto L12;
            case 67: goto L11;
            case 72: goto L10;
            case 81: goto L9;
            case 83: goto L9;
            case 86: goto L10;
            case 90: goto L8;
            case 97: goto L12;
            case 99: goto L11;
            case 104: goto L10;
            case 113: goto L9;
            case 115: goto L9;
            case 118: goto L10;
            case 122: goto L8;
            default: goto L7;
        };
    L7:
        int r21 = 2;
    L13:
        float r22 = r4;
        float r23 = r7;
        float r24 = r10;
        float r102 = r33;
        int r34 = r14;
    L15:
        if (r34 >= r9.length) goto L139;
        if (r8 != 'A') goto L19;
        int r28 = r34;
        float[] r27 = r9;
        float r25 = r102;
        int r252 = r14;
        float r35 = r22;
        char r222 = r8;
        int r112 = r28 + 5;
        float r42 = r27[r112];
        int r142 = r28 + 6;
        float r52 = r27[r142];
        float r62 = r27[r28];
        float r72 = r27[r28 + 1];
        float r82 = r27[r28 + 2];
        if (r27[r28 + 3] == 0.0f) goto L131;
        boolean r92 = 1;
    L133:
        if (r27[r28 + 4] == 0.0f) goto L136;
        boolean r103 = 1;
    L137:
        a(r32, r25, r35, r42, r52, r62, r72, r82, r92, r103);
        r5 = r27[r112];
        r102 = r5;
        float r36 = r27[r142];
        r6 = r36;
    L138:
        r2 = r222;
        r8 = r2;
        r14 = r252;
        r9 = r27;
        r22 = r36;
        r34 = r28 + r21;
        r1 = r32;
        goto L15
    L136:
        r103 = r252;
        goto L137
    L131:
        r92 = r252;
        goto L133
    L19:
        if (r8 != 'C') goto L21;
        r28 = r34;
        r222 = r8;
        r27 = r9;
        r252 = r14;
        int r83 = r28 + 2;
        int r93 = r28 + 3;
        int r104 = r28 + 4;
        int r113 = r28 + 5;
        r1.cubicTo(r27[r28], r27[r28 + 1], r27[r83], r27[r93], r27[r104], r27[r113]);
        float r13 = r27[r104];
        float r26 = r27[r113];
        r102 = r13;
        r5 = r27[r83];
        r6 = r27[r93];
        r36 = r26;
        goto L138
    L21:
        if (r8 != 'H') goto L23;
        r28 = r34;
        r27 = r9;
        r252 = r14;
        r36 = r22;
        r222 = r8;
        r1.lineTo(r27[r28], r36);
        r102 = r27[r28];
        goto L138
    L23:
        if (r8 == 'Q') goto L125;
        r252 = r14;
        if (r8 != 'V') goto L27;
        r28 = r34;
        r222 = r8;
        r27 = r9;
        r1.lineTo(r102, r27[r28]);
        r36 = r27[r28];
        goto L138
    L27:
        if (r8 != 'a') goto L29;
        r28 = r34;
        int r114 = r28 + 5;
        float r43 = r9[r114] + r102;
        int r143 = r28 + 6;
        float r53 = r9[r143] + r22;
        float r63 = r9[r28];
        float r73 = r9[r28 + 1];
        float r16 = r9[r28 + 2];
        if (r9[r28 + 3] == 0.0f) goto L117;
        float[] r29 = r9;
        boolean r94 = 1;
    L118:
        float r37 = r29[r28 + 4];
        r27 = r29;
        float r210 = r102;
        if (r37 == 0.0f) goto L122;
        boolean r105 = 1;
    L121:
        float r38 = r22;
        r222 = r8;
        a(r32, r210, r38, r43, r53, r63, r73, r16, r94, r105);
        r102 = r210 + r27[r114];
        r36 = r27[r143] + r38;
        r6 = r36;
        r5 = r102;
        goto L138
    L122:
        r105 = r252;
        goto L121
    L117:
        r29 = r9;
        r94 = r252;
        goto L118
    L29:
        if (r8 != 'c') goto L31;
        r28 = r34;
        int r115 = r28 + 2;
        int r144 = r28 + 3;
        int r262 = r28 + 4;
        int r272 = r28 + 5;
        r1.rCubicTo(r9[r28], r9[r28 + 1], r9[r115], r9[r144], r9[r262], r9[r272]);
        float r17 = r9[r115] + r102;
        float r211 = r22 + r9[r144];
        r102 = r102 + r9[r262];
        r22 = r22 + r9[r272];
        r5 = r17;
        r6 = r211;
    L50:
        r27 = r9;
        r36 = r22;
    L51:
        r222 = r8;
        goto L138
    L31:
        if (r8 != 'h') goto L33;
        r28 = r34;
        r1.rLineTo(r9[r28], 0.0f);
        r102 = r102 + r9[r28];
        goto L50
    L33:
        if (r8 != 'q') goto L35;
        r28 = r34;
        int r39 = r28 + 1;
        int r54 = r28 + 2;
        int r74 = r28 + 3;
        r1.rQuadTo(r9[r28], r9[r39], r9[r54], r9[r74]);
        float r212 = r9[r28] + r102;
        float r310 = r22 + r9[r39];
        r102 = r102 + r9[r54];
        float r44 = r9[r74];
    L73:
        r22 = r22 + r44;
        r5 = r212;
        r6 = r310;
        goto L50
    L35:
        if (r8 != 'v') goto L37;
        r28 = r34;
        r1.rLineTo(0.0f, r9[r28]);
        float r213 = r9[r28];
    L79:
        r22 = r22 + r213;
        goto L50
    L37:
        if (r8 != 'L') goto L39;
        r28 = r34;
        int r311 = r28 + 1;
        r1.lineTo(r9[r28], r9[r311]);
        float r214 = r9[r28];
        r36 = r9[r311];
    L106:
        r102 = r214;
    L107:
        r222 = r8;
        r27 = r9;
        goto L138
    L39:
        if (r8 != 'M') goto L41;
        r28 = r34;
        r214 = r9[r28];
        r36 = r9[r28 + 1];
        if (r28 <= 0) goto L108;
        r1.lineTo(r214, r36);
        goto L106
    L108:
        r1.moveTo(r214, r36);
        r102 = r214;
        r23 = r102;
        r24 = r36;
        goto L107
    L41:
        if (r8 != 'S') goto L43;
        r28 = r34;
        if (r2 == 'c') goto L100;
        if (r2 == 's') goto L100;
        if (r2 == 'C') goto L100;
        if (r2 == 'S') goto L100;
    L99:
        float r215 = r102;
        int r106 = r28 + 1;
        int r116 = r28 + 2;
        int r145 = r28 + 3;
        r1.cubicTo(r215, r22, r9[r28], r9[r106], r9[r116], r9[r145]);
        float r216 = r9[r28];
        float r312 = r9[r106];
        r6 = r312;
        r102 = r9[r116];
        r36 = r9[r145];
        r222 = r8;
        r27 = r9;
    L102:
        r5 = r216;
    L100:
        r102 = (r102 * 2.0f) - r5;
        r22 = (r22 * 2.0f) - r6;
        goto L99
    L43:
        if (r8 != 'T') goto L45;
        r28 = r34;
        if (r2 == 'q') goto L89;
        if (r2 == 't') goto L89;
        if (r2 == 'Q') goto L89;
        if (r2 == 'T') goto L89;
    L88:
        float r217 = r22;
        int r45 = r28 + 1;
        r1.quadTo(r102, r217, r9[r28], r9[r45]);
        r6 = r217;
        r222 = r8;
        r27 = r9;
        r5 = r102;
        r102 = r9[r28];
        r36 = r9[r45];
    L89:
        r102 = (r102 * 2.0f) - r5;
        r22 = (r22 * 2.0f) - r6;
        goto L88
    L45:
        if (r8 == 'l') goto L78;
        if (r8 == 'm') goto L74;
        if (r8 == 's') goto L63;
        if (r8 == 't') goto L52;
        r28 = r34;
        goto L50
    L52:
        if (r2 == 'q') goto L60;
        if (r2 == 't') goto L60;
        if (r2 == 'Q') goto L60;
        if (r2 == 'T') goto L60;
        float r218 = 0.0f;
        float r75 = 0.0f;
    L61:
        int r55 = r34 + 1;
        r1.rQuadTo(r75, r218, r9[r34], r9[r55]);
        float r76 = r75 + r102;
        float r219 = r22 + r218;
        r102 = r102 + r9[r34];
        r22 = r22 + r9[r55];
        r6 = r219;
        r28 = r34;
        r5 = r76;
    L60:
        r75 = r102 - r5;
        r218 = r22 - r6;
        goto L61
    L63:
        if (r2 == 'c') goto L71;
        if (r2 == 's') goto L71;
        if (r2 == 'C') goto L71;
        if (r2 == 'S') goto L71;
        float r220 = 0.0f;
        float r77 = 0.0f;
    L72:
        int r117 = r34 + 1;
        int r146 = r34 + 2;
        int r263 = r34 + 3;
        int r273 = r34;
        r28 = r273;
        r1.rCubicTo(r220, r77, r9[r34], r9[r117], r9[r146], r9[r263]);
        r212 = r9[r28] + r102;
        r310 = r22 + r9[r117];
        r102 = r102 + r9[r146];
        r44 = r9[r263];
    L71:
        r77 = r22 - r6;
        r220 = r102 - r5;
        goto L72
    L74:
        r28 = r34;
        float r221 = r9[r28];
        r102 = r102 + r221;
        float r313 = r9[r28 + 1];
        r22 = r22 + r313;
        if (r28 <= 0) goto L77;
        r1.rLineTo(r221, r313);
        goto L50
    L77:
        r1.rMoveTo(r221, r313);
        r27 = r9;
        r23 = r102;
        r36 = r22;
        r24 = r36;
        goto L51
    L78:
        r28 = r34;
        int r314 = r28 + 1;
        r1.rLineTo(r9[r28], r9[r314]);
        r102 = r102 + r9[r28];
        r213 = r9[r314];
        goto L79
    L125:
        r28 = r34;
        r222 = r8;
        r27 = r9;
        r252 = r14;
        int r315 = r28 + 1;
        int r56 = r28 + 2;
        int r78 = r28 + 3;
        r1.quadTo(r27[r28], r27[r315], r27[r56], r27[r78]);
        r216 = r27[r28];
        float r316 = r27[r315];
        r6 = r316;
        r102 = r27[r56];
        r36 = r27[r78];
        goto L102
    L139:
        r12[r14] = r102;
        r12[1] = r22;
        r12[2] = r5;
        r12[3] = r6;
        r12[4] = r23;
        r12[5] = r24;
        r2 = r31[r15].a;
        r15 = r15 + 1;
        r1 = r32;
        r11 = 6;
        goto L4
    L8:
        r1.close();
        r1.moveTo(r7, r10);
        r33 = r7;
        r5 = r33;
        r4 = r10;
        r6 = r4;
        goto L7
    L9:
        r21 = 4;
        goto L13
    L10:
        r21 = 1;
        goto L13
    L11:
        r21 = r11;
        goto L13
    L12:
        r21 = 7;
        goto L13
    }
}
