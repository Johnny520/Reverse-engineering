package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mo {
    public double a;
    public int b;

    public static mo a(double r57, double r59, double r61) {
        double[] r0 = ff.p;
        if (r59 >= 1.0E-4d) goto L5;
    L8:
        double r44 = 3.8d;
        double r48 = 0.25d;
        double r38 = 3846.153846153846d;
        int r02 = a80.i(a80.J(r61)) & 255;
        int r1 = ((r02 << 16) | (-16777216)) | (r02 << 8);
    L119:
        int r12 = r1 | r02;
    L121:
        mo r03 = new mo();
        r03.b = r12;
        fb0 r2 = fb0.k;
        int r5 = r12 & 255;
        double r6 = a80.s((16711680 & r12) >> 16);
        double r3 = a80.s((65280 & r12) >> 8);
        double r8 = a80.s(r5);
        double r10 = (0.18051042d * r8) + ((0.35762064d * r3) + (0.41233895d * r6));
        double r15 = (0.0722d * r8) + ((0.7152d * r3) + (0.2126d * r6));
        double r82 = (r8 * 0.95034478d) + ((r3 * 0.11916382d) + (r6 * 0.01932141d));
        double[][] r32 = a80.a;
        double[] r4 = r32[0];
        double r62 = (r4[2] * r82) + ((r4[1] * r15) + (r4[0] * r10));
        double[] r42 = r32[1];
        double r34 = (r42[2] * r82) + ((r42[1] * r15) + (r42[0] * r10));
        double[] r33 = r32[2];
        double r83 = (r82 * r33[2]) + ((r15 * r33[1]) + (r10 * r33[0]));
        double[] r35 = r2.g;
        double r102 = r2.i;
        double r122 = r2.d;
        double r14 = r2.a;
        double r36 = r35[0] * r62;
        double r63 = r35[1] * r34;
        double r342 = r35[2] * r83;
        double r84 = r2.h;
        double r43 = Math.pow((Math.abs(r36) * r84) / 100.0d, 0.42d);
        double r37 = Math.pow((Math.abs(r63) * r84) / 100.0d, 0.42d);
        double r52 = Math.pow((Math.abs(r342) * r84) / 100.0d, 0.42d);
        double r7 = ((Math.signum(r36) * 400.0d) * r43) / (r43 + 27.13d);
        double r422 = ((Math.signum(r63) * 400.0d) * r37) / (r37 + 27.13d);
        double r39 = ((Math.signum(r342) * 400.0d) * r52) / (r52 + 27.13d);
        double r53 = ((((-12.0d) * r422) + (r7 * 11.0d)) + r39) / 11.0d;
        double r310 = ((r7 + r422) - (r39 * 2.0d)) / 9.0d;
        double r423 = r422 * 20.0d;
        double r362 = ((21.0d * r39) + ((r7 * 20.0d) + r423)) / 20.0d;
        double r72 = (((r7 * 40.0d) + r423) + r39) / 20.0d;
        double r19 = Math.toDegrees(Math.atan2(r310, r53));
        if (r19 >= 0.0d) goto L125;
        r19 = r19 + 360.0d;
    L127:
        double r322 = Math.toRadians(r19);
        double r73 = (Math.pow((r2.b * r72) / r14, r2.j * r122) * 100.0d) / 100.0d;
        Math.sqrt(r73);
        double r142 = r14 + 4.0d;
        if (r19 >= 20.14d) goto L130;
        r19 = r19 + 360.0d;
    L130:
        double r22 = Math.pow((Math.hypot(r53, r310) * (((((Math.cos(Math.toRadians(r19) + 2.0d) + r44) * r48) * r38) * r2.e) * r2.c)) / (r362 + 0.305d), 0.9d) * Math.pow(1.64d - Math.pow(0.29d, r2.f), 0.73d);
        double r45 = Math.sqrt(r73) * r22;
        Math.sqrt((r22 * r122) / r142);
        Math.log1p((r45 * r102) * 0.0228d);
        Math.cos(r322);
        Math.sin(r322);
        r03.a = r45;
        double r23 = zt.F(new double[]{a80.s((r12 >> 16) & 255), a80.s((r12 >> 8) & 255), a80.s(r5)}, a80.b)[1] / 100.0d;
        if (r23 <= 0.008856451679035631d) goto L133;
        Math.pow(r23, 0.3333333333333333d);
    L133:
        return r03;
    L125:
        if (r19 < 360.0d) goto L127;
        r19 = r19 - 360.0d;
        goto L127
    L5:
        if (r61 < 1.0E-4d) goto L8;
        if (r61 > 99.9999d) goto L8;
        double r152 = r57 % 360.0d;
        if (r152 >= 0.0d) goto L12;
        r152 = r152 + 360.0d;
    L12:
        double r153 = (r152 / 180.0d) * 3.141592653589793d;
        double r343 = a80.J(r61);
        double r363 = Math.sqrt(r343) * 11.0d;
        fb0 r311 = fb0.k;
        r38 = 3846.153846153846d;
        double r74 = 1.0d / Math.pow(1.64d - Math.pow(0.29d, r311.f), 0.73d);
        r44 = 3.8d;
        double r424 = ((((Math.cos(r153 + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * r311.e) * r311.c;
        double r9 = Math.sin(r153);
        double r46 = Math.cos(r153);
        r48 = 0.25d;
        int r11 = 0;
    L14:
        if (r11 >= 5) goto L47;
        double r13 = r363 / 100.0d;
        if (r59 != 0.0d) goto L18;
    L22:
        double r50 = 0.0d;
    L23:
        int r612 = 1;
        double r572 = r153;
        double r54 = Math.pow(r50 * r74, 1.1111111111111112d);
        int r622 = 8;
        double r16 = (Math.pow(r13, (1.0d / r311.d) / r311.j) * r311.a) / r311.b;
        double r55 = (((r16 + 0.305d) * 23.0d) * r54) / (((108.0d * r54) * r9) + (((r54 * 11.0d) * r46) + (23.0d * r424)));
        double r123 = r55 * r46;
        double r56 = r55 * r9;
        double r17 = r16 * 460.0d;
        double[] r18 = zt.F(new double[]{ff.x(((288.0d * r56) + ((451.0d * r123) + r17)) / 1403.0d), ff.x(((r17 - (891.0d * r123)) - (261.0d * r56)) / 1403.0d), ff.x(((r17 - (r123 * 220.0d)) - (r56 * 6300.0d)) / 1403.0d)}, ff.o);
        double r47 = r18[0];
        if (r47 < 0.0d) goto L32;
        double r124 = r18[1];
        if (r124 < 0.0d) goto L32;
        double r143 = r18[2];
        if (r143 < 0.0d) goto L32;
        double r51 = r0[0];
        double r552 = (r0[2] * r143) + ((r0[1] * r124) + (r51 * r47));
        if (r552 <= 0.0d) goto L32;
        if (r11 == 4) goto L39;
        double r49 = r552 - r343;
        if (Math.abs(r49) < 0.002d) goto L39;
        r363 = r363 - ((r49 * r363) / (r552 * 2.0d));
        r11 = r11 + 1;
        r153 = r572;
    L39:
        double r24 = r18[0];
        if (r24 > 100.01d) goto L32;
        if (r18[1] > 100.01d) goto L32;
        if (r18[2] > 100.01d) goto L32;
        r12 = (a80.i(r18[2]) & 255) | ((((a80.i(r24) & 255) << 16) | (-16777216)) | ((a80.i(r18[1]) & 255) << 8));
    L48:
        if (r12 != 0) goto L121;
        double[] r110 = new double[3];
        r110[0] = -1.0d;
        r110[r612] = -1.0d;
        r110[2] = -1.0d;
        int r410 = r612;
        double[] r25 = r110;
        boolean r312 = false;
        int r58 = 0;
        double r64 = 0.0d;
        double r103 = 0.0d;
    L52:
        if (r58 >= 12) goto L95;
        double r85 = r0[0];
        double r364 = r0[r612];
        double r40 = r0[2];
        if ((r58 % 4) > r612) goto L56;
        double r425 = 0.0d;
    L58:
        if ((r58 % 2) != 0) goto L61;
        double r154 = 0.0d;
    L62:
        if (r58 >= 4) goto L69;
        double r365 = ((r343 - (r364 * r425)) - (r40 * r154)) / r85;
        if (ff.y(r365) == false) goto L67;
        double[] r86 = {r365, r425, r154};
    L66:
        double[] r132 = r86;
    L79:
        if (r132[0] < 0.0d) goto L88;
        double r87 = ff.v(r132);
        if (r312 == true) goto L84;
        double r155 = r572;
        r64 = r87;
        r103 = r64;
        r110 = r132;
        r25 = r110;
        r312 = true;
    L94:
        r58 = r58 + 1;
        r572 = r155;
        r612 = 1;
        r622 = 8;
        goto L52
    L84:
        if (r410 == 0) goto L86;
    L87:
        double r592 = r572;
        double r573 = r64;
        r64 = r573;
        r155 = r592;
        if (ff.b(r573, r592, r87) == false) goto L93;
        r103 = r87;
        r25 = r132;
    L92:
        r410 = 0;
        goto L94
    L93:
        r64 = r87;
        r110 = r132;
        goto L92
    L86:
        if (ff.b(r64, r87, r103) == true) goto L87;
    L88:
        r155 = r572;
        goto L94
    L67:
        r86 = new double[]{-1.0d, -1.0d, -1.0d};
        goto L66
    L69:
        if (r58 >= r622) goto L74;
        double r88 = ((r343 - (r85 * r154)) - (r40 * r425)) / r364;
        if (ff.y(r88) == false) goto L73;
        r132 = new double[]{r154, r88, r425};
        goto L79
    L73:
        r86 = new double[]{-1.0d, -1.0d, -1.0d};
        goto L66
    L74:
        double r89 = ((r343 - (r85 * r425)) - (r364 * r154)) / r40;
        if (ff.y(r89) == false) goto L77;
        r132 = new double[]{r425, r154, r89};
        goto L79
    L77:
        r86 = new double[]{-1.0d, -1.0d, -1.0d};
        goto L66
    L61:
        r154 = 100.0d;
        goto L62
    L56:
        r425 = 100.0d;
        goto L58
    L95:
        double r156 = r572;
        double[][] r04 = {r110, r25};
        double[] r111 = r04[0];
        double r26 = ff.v(r111);
        double[] r05 = r04[1];
        int r411 = 0;
    L97:
        if (r411 >= 3) goto L118;
        double r510 = r111[r411];
        double r75 = r05[r411];
        if (r510 == r75) goto L117;
        if (r510 >= r75) goto L104;
        int r511 = (int) Math.floor(ff.U(r510) - 0.5d);
        double r65 = Math.ceil(ff.U(r05[r411]) - 0.5d);
    L103:
        int r66 = (int) r65;
        int r76 = 0;
    L107:
        if (r76 >= 8) goto L116;
        if (Math.abs(r66 - r511) <= 1) goto L116;
        int r810 = (int) Math.floor(((double) (r511 + r66)) / 2.0d);
        double r104 = ff.q[r810];
        double r344 = r111[r411];
        double r105 = (r104 - r344) / (r05[r411] - r344);
        double r345 = r111[0];
        double r366 = ((r05[0] - r345) * r105) + r345;
        double r346 = r111[1];
        double r402 = ((r05[1] - r346) * r105) + r346;
        double r347 = r111[2];
        double[] r106 = {r366, r402, ((r05[2] - r347) * r105) + r347};
        double r348 = ff.v(r106);
        double r574 = r26;
        if (ff.b(r574, r156, r348) == false) goto L114;
        r66 = r810;
        r05 = r106;
        r26 = r574;
    L115:
        r76 = r76 + 1;
        goto L107
    L114:
        r511 = r810;
        r111 = r106;
        r26 = r348;
    L116:
        r26 = r26;
        goto L117
    L104:
        r511 = (int) Math.ceil(ff.U(r510) - 0.5d);
        r65 = Math.floor(ff.U(r05[r411]) - 0.5d);
    L117:
        r411 = r411 + 1;
        goto L97
    L118:
        double[] r06 = {(r111[0] + r05[0]) / 2.0d, (r111[1] + r05[1]) / 2.0d, (r111[2] + r05[2]) / 2.0d};
        r1 = (((a80.i(r06[0]) & 255) << 16) | (-16777216)) | ((a80.i(r06[1]) & 255) << 8);
        r02 = a80.i(r06[2]) & 255;
    L32:
        r12 = 0;
        goto L48
    L18:
        if (r363 == 0.0d) goto L22;
        r50 = r59 / Math.sqrt(r13);
        goto L23
    L47:
        r572 = r153;
        r612 = 1;
        r622 = 8;
        goto L32
    }
}
