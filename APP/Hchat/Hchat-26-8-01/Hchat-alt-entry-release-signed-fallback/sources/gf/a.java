package gf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a5.a f4491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ac.k f4492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ac.k f4493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public gf.c f4494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f4499i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4500j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f4501k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4502l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4503m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public sc.a f4504n;

    public a(a5.a r2, ac.k r3) {
            r1 = this;
            r1.<init>()
            r0 = 5
            int[] r0 = new int[r0]
            r1.f4499i = r0
            r1.f4491a = r2
            r1.f4492b = r3
            ac.k r2 = r3.g()
            r1.f4493c = r2
            return
    }

    public final void a() {
            r10 = this;
            gf.c r0 = r10.f4494d
            if (r0 == 0) goto L2cc
            boolean r1 = r10.f4495e
            if (r1 != 0) goto L2cc
            gf.b r0 = r0.f4535c
            int r1 = r10.f4496f
            a5.a r2 = r10.f4491a
            java.lang.Object r2 = r2.f57i
            ac.k r2 = (ac.k) r2
            int r0 = r0.f4530c
            switch(r0) {
                case 0: goto L2b5;
                case 1: goto L293;
                case 2: goto L283;
                case 3: goto L269;
                case 4: goto L250;
                case 5: goto L231;
                case 6: goto L214;
                case 7: goto L1f8;
                case 8: goto L1e9;
                case 9: goto L1d7;
                case 10: goto L2c9;
                case 11: goto L1c1;
                case 12: goto L1a9;
                case 13: goto L194;
                case 14: goto L18f;
                case 15: goto L18a;
                case 16: goto L17f;
                case 17: goto L174;
                case 18: goto L15f;
                case 19: goto L130;
                case 20: goto Lfd;
                case 21: goto Leb;
                case 22: goto L7b;
                case 23: goto L65;
                case 24: goto L5a;
                case 25: goto L50;
                case 26: goto L41;
                case 27: goto L2f;
                default: goto L17;
            }
        L17:
            int[] r0 = r10.f4499i
            r3 = 0
            int r1 = gf.b.a(r1)
            r0[r3] = r1
            int r0 = r10.f4498h
            java.lang.Object r1 = r2.f178i
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            short r1 = r1.getShort()
            int r1 = r1 + r0
            r10.f4502l = r1
            goto L2c9
        L2f:
            int[] r0 = r10.f4499i
            r3 = 0
            int r1 = gf.b.a(r1)
            r0[r3] = r1
            r1 = 1
            int r2 = r2.L()
            r0[r1] = r2
            goto L2c9
        L41:
            int r0 = r10.f4498h
            java.lang.Object r1 = r2.f178i
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            short r1 = r1.getShort()
            int r1 = r1 + r0
            r10.f4502l = r1
            goto L2c9
        L50:
            int r0 = r10.f4498h
            int r1 = r1 >> 8
            byte r1 = (byte) r1
            int r0 = r0 + r1
            r10.f4502l = r0
            goto L2c9
        L5a:
            int[] r0 = r10.f4499i
            r2 = 0
            int r1 = gf.b.a(r1)
            r0[r2] = r1
            goto L2c9
        L65:
            int[] r0 = r10.f4499i
            r2 = 0
            int r3 = gf.b.c(r1)
            r0[r2] = r3
            int r0 = r1 >> 12
            r0 = r0 & 15
            int r0 = r0 << 28
            int r0 = r0 >> 28
            long r0 = (long) r0
            r10.f4501k = r0
            goto L2c9
        L7b:
            int r0 = r2.L()
            java.lang.Object r1 = r2.f178i
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r3 = r1.getInt()
            r4 = 4
            r5 = 2
            r6 = 0
            r7 = 1
            if (r0 == 0) goto Ld9
            if (r0 == r7) goto Lcb
            if (r0 == r5) goto Lbd
            if (r0 == r4) goto Lb0
            r2 = 8
            if (r0 != r2) goto La4
            long[] r2 = new long[r3]
        L99:
            if (r6 >= r3) goto Ldb
            long r8 = r1.getLong()
            r2[r6] = r8
            int r6 = r6 + 1
            goto L99
        La4:
            af.d r1 = new af.d
            java.lang.String r2 = "Unexpected element size in FILL_ARRAY_DATA_PAYLOAD: "
            java.lang.String r0 = eh.a.l(r0, r2)
            r1.<init>(r0)
            throw r1
        Lb0:
            int[] r2 = new int[r3]
        Lb2:
            if (r6 >= r3) goto Ldb
            int r8 = r1.getInt()
            r2[r6] = r8
            int r6 = r6 + 1
            goto Lb2
        Lbd:
            short[] r2 = new short[r3]
        Lbf:
            if (r6 >= r3) goto Ldb
            short r8 = r1.getShort()
            short r8 = (short) r8
            r2[r6] = r8
            int r6 = r6 + 1
            goto Lbf
        Lcb:
            byte[] r6 = new byte[r3]
            r1.get(r6)
            int r1 = r3 % 2
            if (r1 == 0) goto Ld7
            r2.K()
        Ld7:
            r2 = r6
            goto Ldb
        Ld9:
            byte[] r2 = new byte[r6]
        Ldb:
            int r1 = r3 * r0
            int r1 = r1 + r7
            int r1 = r1 / r5
            int r1 = r1 + r4
            r10.f4497g = r1
            hf.a r1 = new hf.a
            r1.<init>(r3, r0, r2)
            r10.f4504n = r1
            goto L2c9
        Leb:
            int[] r0 = r10.f4499i
            r2 = 0
            int r3 = gf.b.c(r1)
            r0[r2] = r3
            r2 = 1
            int r1 = gf.b.d(r1)
            r0[r2] = r1
            goto L2c9
        Lfd:
            int r0 = r2.L()
            java.lang.Object r1 = r2.f178i
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int[] r2 = new int[r0]
            r3 = 0
            r4 = r3
        L109:
            if (r4 >= r0) goto L114
            int r5 = r1.getInt()
            r2[r4] = r5
            int r4 = r4 + 1
            goto L109
        L114:
            int[] r4 = new int[r0]
        L116:
            if (r3 >= r0) goto L121
            int r5 = r1.getInt()
            r4[r3] = r5
            int r3 = r3 + 1
            goto L116
        L121:
            tc.a r1 = new tc.a
            r1.<init>(r0, r2, r4)
            r10.f4504n = r1
            int r0 = r0 * 4
            int r0 = r0 + 2
            r10.f4497g = r0
            goto L2c9
        L130:
            int r0 = r2.L()
            java.lang.Object r1 = r2.f178i
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r2 = r1.getInt()
            int[] r3 = new int[r0]
            int[] r4 = new int[r0]
            r5 = 0
        L141:
            if (r5 >= r0) goto L150
            int r6 = r1.getInt()
            r4[r5] = r6
            int r6 = r2 + r5
            r3[r5] = r6
            int r5 = r5 + 1
            goto L141
        L150:
            tc.a r1 = new tc.a
            r1.<init>(r0, r3, r4)
            r10.f4504n = r1
            int r0 = r0 * 2
            int r0 = r0 + 4
            r10.f4497g = r0
            goto L2c9
        L15f:
            int[] r0 = r10.f4499i
            r3 = 0
            int r1 = gf.b.a(r1)
            r0[r3] = r1
            java.lang.Object r0 = r2.f178i
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            long r0 = r0.getLong()
            r10.f4501k = r0
            goto L2c9
        L174:
            gf.b.f(r10, r1, r2)
            int r0 = r2.L()
            r10.f4502l = r0
            goto L2c9
        L17f:
            gf.b.e(r10, r1, r2)
            int r0 = r2.L()
            r10.f4502l = r0
            goto L2c9
        L18a:
            gf.b.f(r10, r1, r2)
            goto L2c9
        L18f:
            gf.b.e(r10, r1, r2)
            goto L2c9
        L194:
            int[] r0 = r10.f4499i
            r3 = 0
            int r1 = gf.b.a(r1)
            r0[r3] = r1
            java.lang.Object r0 = r2.f178i
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r0 = r0.getInt()
            r10.f4503m = r0
            goto L2c9
        L1a9:
            int[] r0 = r10.f4499i
            r3 = 0
            int r1 = gf.b.a(r1)
            r0[r3] = r1
            int r0 = r10.f4498h
            java.lang.Object r1 = r2.f178i
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r1.getInt()
            int r1 = r1 + r0
            r10.f4502l = r1
            goto L2c9
        L1c1:
            int[] r0 = r10.f4499i
            r3 = 0
            int r1 = gf.b.a(r1)
            r0[r3] = r1
            java.lang.Object r0 = r2.f178i
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r0 = r0.getInt()
            long r0 = (long) r0
            r10.f4501k = r0
            goto L2c9
        L1d7:
            int[] r0 = r10.f4499i
            r1 = 0
            int r3 = r2.L()
            r0[r1] = r3
            r1 = 1
            int r2 = r2.L()
            r0[r1] = r2
            goto L2c9
        L1e9:
            int r0 = r10.f4498h
            java.lang.Object r1 = r2.f178i
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r1.getInt()
            int r1 = r1 + r0
            r10.f4502l = r1
            goto L2c9
        L1f8:
            int[] r0 = r10.f4499i
            r3 = 0
            int r4 = gf.b.c(r1)
            r0[r3] = r4
            r3 = 1
            int r1 = gf.b.d(r1)
            r0[r3] = r1
            int r0 = r2.L()
            r10.f4503m = r0
            r0 = 0
            r10.f4501k = r0
            goto L2c9
        L214:
            int[] r0 = r10.f4499i
            r3 = 0
            int r4 = gf.b.c(r1)
            r0[r3] = r4
            r3 = 1
            int r1 = gf.b.d(r1)
            r0[r3] = r1
            java.lang.Object r0 = r2.f178i
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            short r0 = r0.getShort()
            long r0 = (long) r0
            r10.f4501k = r0
            goto L2c9
        L231:
            int[] r0 = r10.f4499i
            r3 = 0
            int r4 = gf.b.c(r1)
            r0[r3] = r4
            r3 = 1
            int r1 = gf.b.d(r1)
            r0[r3] = r1
            int r0 = r10.f4498h
            java.lang.Object r1 = r2.f178i
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            short r1 = r1.getShort()
            int r1 = r1 + r0
            r10.f4502l = r1
            goto L2c9
        L250:
            int[] r0 = r10.f4499i
            r3 = 0
            int r1 = gf.b.a(r1)
            r0[r3] = r1
            int r1 = r2.L()
            r2 = r1 & 255(0xff, float:3.57E-43)
            r3 = 1
            r0[r3] = r2
            int r0 = r1 >> 8
            byte r0 = (byte) r0
            long r0 = (long) r0
            r10.f4501k = r0
            goto L2c9
        L269:
            int[] r0 = r10.f4499i
            r3 = 0
            int r1 = gf.b.a(r1)
            r0[r3] = r1
            int r1 = r2.L()
            r2 = r1 & 255(0xff, float:3.57E-43)
            r3 = 1
            r0[r3] = r2
            r2 = 2
            int r1 = gf.b.a(r1)
            r0[r2] = r1
            goto L2c9
        L283:
            int[] r0 = r10.f4499i
            r3 = 0
            int r1 = gf.b.a(r1)
            r0[r3] = r1
            int r0 = r2.L()
            r10.f4503m = r0
            goto L2c9
        L293:
            int[] r0 = r10.f4499i
            r3 = 0
            int r4 = gf.b.a(r1)
            r0[r3] = r4
            java.lang.Object r0 = r2.f178i
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            short r0 = r0.getShort()
            long r2 = (long) r0
            r0 = r1 & 255(0xff, float:3.57E-43)
            r1 = 21
            if (r0 != r1) goto L2ae
            r0 = 16
            goto L2b0
        L2ae:
            r0 = 48
        L2b0:
            long r0 = r2 << r0
            r10.f4501k = r0
            goto L2c9
        L2b5:
            int[] r0 = r10.f4499i
            r3 = 0
            int r1 = gf.b.a(r1)
            r0[r3] = r1
            java.lang.Object r0 = r2.f178i
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            short r0 = r0.getShort()
            long r0 = (long) r0
            r10.f4501k = r0
        L2c9:
            r0 = 1
            r10.f4495e = r0
        L2cc:
            return
    }

    public final java.lang.String b() {
            r2 = this;
            ac.k r0 = r2.f4492b
            int r1 = r2.f4503m
            java.lang.String r0 = r0.y(r1)
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r4.f4498h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "0x%04X"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            gf.c r1 = r4.f4494d
            if (r1 != 0) goto L23
            r1 = 1
            goto L25
        L23:
            int r1 = r1.f4534b
        L25:
            switch(r1) {
                case 1: goto L27b;
                case 2: goto L278;
                case 3: goto L275;
                case 4: goto L272;
                case 5: goto L26f;
                case 6: goto L26c;
                case 7: goto L269;
                case 8: goto L266;
                case 9: goto L263;
                case 10: goto L260;
                case 11: goto L25d;
                case 12: goto L25a;
                case 13: goto L257;
                case 14: goto L254;
                case 15: goto L251;
                case 16: goto L24e;
                case 17: goto L24b;
                case 18: goto L248;
                case 19: goto L245;
                case 20: goto L242;
                case 21: goto L23f;
                case 22: goto L23c;
                case 23: goto L239;
                case 24: goto L236;
                case 25: goto L233;
                case 26: goto L230;
                case 27: goto L22c;
                case 28: goto L228;
                case 29: goto L224;
                case 30: goto L220;
                case 31: goto L21c;
                case 32: goto L218;
                case 33: goto L214;
                case 34: goto L210;
                case 35: goto L20c;
                case 36: goto L208;
                case 37: goto L204;
                case 38: goto L200;
                case 39: goto L1fc;
                case 40: goto L1f8;
                case 41: goto L1f4;
                case 42: goto L1f0;
                case 43: goto L1ec;
                case 44: goto L1e8;
                case 45: goto L1e4;
                case 46: goto L1e0;
                case 47: goto L1dc;
                case 48: goto L1d8;
                case 49: goto L1d4;
                case 50: goto L1d0;
                case 51: goto L1cc;
                case 52: goto L1c8;
                case 53: goto L1c4;
                case 54: goto L1c0;
                case 55: goto L1bc;
                case 56: goto L1b8;
                case 57: goto L1b4;
                case 58: goto L1b0;
                case 59: goto L1ac;
                case 60: goto L1a8;
                case 61: goto L1a4;
                case 62: goto L1a0;
                case 63: goto L19c;
                case 64: goto L198;
                case 65: goto L194;
                case 66: goto L190;
                case 67: goto L18c;
                case 68: goto L188;
                case 69: goto L184;
                case 70: goto L180;
                case 71: goto L17c;
                case 72: goto L178;
                case 73: goto L174;
                case 74: goto L170;
                case 75: goto L16c;
                case 76: goto L168;
                case 77: goto L164;
                case 78: goto L160;
                case 79: goto L15c;
                case 80: goto L158;
                case 81: goto L154;
                case 82: goto L150;
                case 83: goto L14c;
                case 84: goto L148;
                case 85: goto L144;
                case 86: goto L140;
                case 87: goto L13c;
                case 88: goto L138;
                case 89: goto L134;
                case 90: goto L130;
                case 91: goto L12c;
                case 92: goto L128;
                case 93: goto L124;
                case 94: goto L120;
                case 95: goto L11c;
                case 96: goto L118;
                case 97: goto L114;
                case 98: goto L110;
                case 99: goto L10c;
                case 100: goto L108;
                case 101: goto L104;
                case 102: goto L100;
                case 103: goto Lfc;
                case 104: goto Lf8;
                case 105: goto Lf4;
                case 106: goto Lf0;
                case 107: goto Lec;
                case 108: goto Le8;
                case 109: goto Le4;
                case 110: goto Le0;
                case 111: goto Ldc;
                case 112: goto Ld8;
                case 113: goto Ld4;
                case 114: goto Ld0;
                case 115: goto Lcc;
                case 116: goto Lc8;
                case 117: goto Lc4;
                case 118: goto Lc0;
                case 119: goto Lbc;
                case 120: goto Lb8;
                case 121: goto Lb4;
                case 122: goto Lb0;
                case 123: goto Lac;
                case 124: goto La8;
                case 125: goto La4;
                case 126: goto La0;
                case 127: goto L9c;
                case 128: goto L98;
                case 129: goto L94;
                case 130: goto L90;
                case 131: goto L8c;
                case 132: goto L88;
                case 133: goto L84;
                case 134: goto L80;
                case 135: goto L7c;
                case 136: goto L78;
                case 137: goto L74;
                case 138: goto L70;
                case 139: goto L6c;
                case 140: goto L68;
                case 141: goto L64;
                case 142: goto L60;
                case 143: goto L5c;
                case 144: goto L58;
                case 145: goto L54;
                case 146: goto L50;
                case 147: goto L4c;
                case 148: goto L48;
                case 149: goto L44;
                case 150: goto L40;
                case 151: goto L3c;
                case 152: goto L38;
                case 153: goto L34;
                case 154: goto L30;
                case 155: goto L2c;
                default: goto L28;
            }
        L28:
            java.lang.String r1 = "null"
            goto L27d
        L2c:
            java.lang.String r1 = "JAVA_RET"
            goto L27d
        L30:
            java.lang.String r1 = "JAVA_JSR"
            goto L27d
        L34:
            java.lang.String r1 = "CONST_METHOD_TYPE"
            goto L27d
        L38:
            java.lang.String r1 = "CONST_METHOD_HANDLE"
            goto L27d
        L3c:
            java.lang.String r1 = "INVOKE_CUSTOM_RANGE"
            goto L27d
        L40:
            java.lang.String r1 = "INVOKE_CUSTOM"
            goto L27d
        L44:
            java.lang.String r1 = "INVOKE_POLYMORPHIC_RANGE"
            goto L27d
        L48:
            java.lang.String r1 = "INVOKE_POLYMORPHIC"
            goto L27d
        L4c:
            java.lang.String r1 = "SPARSE_SWITCH_PAYLOAD"
            goto L27d
        L50:
            java.lang.String r1 = "SPARSE_SWITCH"
            goto L27d
        L54:
            java.lang.String r1 = "PACKED_SWITCH_PAYLOAD"
            goto L27d
        L58:
            java.lang.String r1 = "PACKED_SWITCH"
            goto L27d
        L5c:
            java.lang.String r1 = "FILL_ARRAY_DATA_PAYLOAD"
            goto L27d
        L60:
            java.lang.String r1 = "FILL_ARRAY_DATA"
            goto L27d
        L64:
            java.lang.String r1 = "FILLED_NEW_ARRAY_RANGE"
            goto L27d
        L68:
            java.lang.String r1 = "FILLED_NEW_ARRAY"
            goto L27d
        L6c:
            java.lang.String r1 = "NEW_ARRAY"
            goto L27d
        L70:
            java.lang.String r1 = "XOR_LONG"
            goto L27d
        L74:
            java.lang.String r1 = "XOR_INT_LIT"
            goto L27d
        L78:
            java.lang.String r1 = "XOR_INT"
            goto L27d
        L7c:
            java.lang.String r1 = "USHR_LONG"
            goto L27d
        L80:
            java.lang.String r1 = "USHR_INT_LIT"
            goto L27d
        L84:
            java.lang.String r1 = "USHR_INT"
            goto L27d
        L88:
            java.lang.String r1 = "THROW"
            goto L27d
        L8c:
            java.lang.String r1 = "SUB_LONG"
            goto L27d
        L90:
            java.lang.String r1 = "SUB_INT"
            goto L27d
        L94:
            java.lang.String r1 = "SUB_FLOAT"
            goto L27d
        L98:
            java.lang.String r1 = "SUB_DOUBLE"
            goto L27d
        L9c:
            java.lang.String r1 = "SHR_LONG"
            goto L27d
        La0:
            java.lang.String r1 = "SHR_INT_LIT"
            goto L27d
        La4:
            java.lang.String r1 = "SHR_INT"
            goto L27d
        La8:
            java.lang.String r1 = "SHL_LONG"
            goto L27d
        Lac:
            java.lang.String r1 = "SHL_INT_LIT"
            goto L27d
        Lb0:
            java.lang.String r1 = "SHL_INT"
            goto L27d
        Lb4:
            java.lang.String r1 = "RSUB_INT"
            goto L27d
        Lb8:
            java.lang.String r1 = "RETURN_VOID"
            goto L27d
        Lbc:
            java.lang.String r1 = "RETURN"
            goto L27d
        Lc0:
            java.lang.String r1 = "REM_LONG"
            goto L27d
        Lc4:
            java.lang.String r1 = "REM_INT_LIT"
            goto L27d
        Lc8:
            java.lang.String r1 = "REM_INT"
            goto L27d
        Lcc:
            java.lang.String r1 = "REM_FLOAT"
            goto L27d
        Ld0:
            java.lang.String r1 = "REM_DOUBLE"
            goto L27d
        Ld4:
            java.lang.String r1 = "OR_LONG"
            goto L27d
        Ld8:
            java.lang.String r1 = "OR_INT_LIT"
            goto L27d
        Ldc:
            java.lang.String r1 = "OR_INT"
            goto L27d
        Le0:
            java.lang.String r1 = "NOT_LONG"
            goto L27d
        Le4:
            java.lang.String r1 = "NOT_INT"
            goto L27d
        Le8:
            java.lang.String r1 = "NEW_INSTANCE"
            goto L27d
        Lec:
            java.lang.String r1 = "NEG_LONG"
            goto L27d
        Lf0:
            java.lang.String r1 = "NEG_INT"
            goto L27d
        Lf4:
            java.lang.String r1 = "NEG_FLOAT"
            goto L27d
        Lf8:
            java.lang.String r1 = "NEG_DOUBLE"
            goto L27d
        Lfc:
            java.lang.String r1 = "NEG"
            goto L27d
        L100:
            java.lang.String r1 = "MUL_LONG"
            goto L27d
        L104:
            java.lang.String r1 = "MUL_INT_LIT"
            goto L27d
        L108:
            java.lang.String r1 = "MUL_INT"
            goto L27d
        L10c:
            java.lang.String r1 = "MUL_FLOAT"
            goto L27d
        L110:
            java.lang.String r1 = "MUL_DOUBLE"
            goto L27d
        L114:
            java.lang.String r1 = "MOVE_WIDE"
            goto L27d
        L118:
            java.lang.String r1 = "MOVE_RESULT"
            goto L27d
        L11c:
            java.lang.String r1 = "MOVE_OBJECT"
            goto L27d
        L120:
            java.lang.String r1 = "MOVE_EXCEPTION"
            goto L27d
        L124:
            java.lang.String r1 = "MOVE_MULTI"
            goto L27d
        L128:
            java.lang.String r1 = "MOVE"
            goto L27d
        L12c:
            java.lang.String r1 = "MONITOR_EXIT"
            goto L27d
        L130:
            java.lang.String r1 = "MONITOR_ENTER"
            goto L27d
        L134:
            java.lang.String r1 = "LONG_TO_INT"
            goto L27d
        L138:
            java.lang.String r1 = "LONG_TO_FLOAT"
            goto L27d
        L13c:
            java.lang.String r1 = "LONG_TO_DOUBLE"
            goto L27d
        L140:
            java.lang.String r1 = "SPUT"
            goto L27d
        L144:
            java.lang.String r1 = "SGET"
            goto L27d
        L148:
            java.lang.String r1 = "IPUT"
            goto L27d
        L14c:
            java.lang.String r1 = "IGET"
            goto L27d
        L150:
            java.lang.String r1 = "INVOKE_SPECIAL"
            goto L27d
        L154:
            java.lang.String r1 = "INVOKE_VIRTUAL_RANGE"
            goto L27d
        L158:
            java.lang.String r1 = "INVOKE_VIRTUAL"
            goto L27d
        L15c:
            java.lang.String r1 = "INVOKE_SUPER_RANGE"
            goto L27d
        L160:
            java.lang.String r1 = "INVOKE_SUPER"
            goto L27d
        L164:
            java.lang.String r1 = "INVOKE_STATIC_RANGE"
            goto L27d
        L168:
            java.lang.String r1 = "INVOKE_STATIC"
            goto L27d
        L16c:
            java.lang.String r1 = "INVOKE_INTERFACE_RANGE"
            goto L27d
        L170:
            java.lang.String r1 = "INVOKE_INTERFACE"
            goto L27d
        L174:
            java.lang.String r1 = "INVOKE_DIRECT_RANGE"
            goto L27d
        L178:
            java.lang.String r1 = "INVOKE_DIRECT"
            goto L27d
        L17c:
            java.lang.String r1 = "INT_TO_SHORT"
            goto L27d
        L180:
            java.lang.String r1 = "INT_TO_LONG"
            goto L27d
        L184:
            java.lang.String r1 = "INT_TO_FLOAT"
            goto L27d
        L188:
            java.lang.String r1 = "INT_TO_DOUBLE"
            goto L27d
        L18c:
            java.lang.String r1 = "INT_TO_CHAR"
            goto L27d
        L190:
            java.lang.String r1 = "INT_TO_BYTE"
            goto L27d
        L194:
            java.lang.String r1 = "INSTANCE_OF"
            goto L27d
        L198:
            java.lang.String r1 = "IF_NEZ"
            goto L27d
        L19c:
            java.lang.String r1 = "IF_NE"
            goto L27d
        L1a0:
            java.lang.String r1 = "IF_LTZ"
            goto L27d
        L1a4:
            java.lang.String r1 = "IF_LT"
            goto L27d
        L1a8:
            java.lang.String r1 = "IF_LEZ"
            goto L27d
        L1ac:
            java.lang.String r1 = "IF_LE"
            goto L27d
        L1b0:
            java.lang.String r1 = "IF_GTZ"
            goto L27d
        L1b4:
            java.lang.String r1 = "IF_GT"
            goto L27d
        L1b8:
            java.lang.String r1 = "IF_GEZ"
            goto L27d
        L1bc:
            java.lang.String r1 = "IF_GE"
            goto L27d
        L1c0:
            java.lang.String r1 = "IF_EQZ"
            goto L27d
        L1c4:
            java.lang.String r1 = "IF_EQ"
            goto L27d
        L1c8:
            java.lang.String r1 = "IF"
            goto L27d
        L1cc:
            java.lang.String r1 = "GOTO"
            goto L27d
        L1d0:
            java.lang.String r1 = "FLOAT_TO_LONG"
            goto L27d
        L1d4:
            java.lang.String r1 = "FLOAT_TO_INT"
            goto L27d
        L1d8:
            java.lang.String r1 = "FLOAT_TO_DOUBLE"
            goto L27d
        L1dc:
            java.lang.String r1 = "DOUBLE_TO_LONG"
            goto L27d
        L1e0:
            java.lang.String r1 = "DOUBLE_TO_INT"
            goto L27d
        L1e4:
            java.lang.String r1 = "DOUBLE_TO_FLOAT"
            goto L27d
        L1e8:
            java.lang.String r1 = "DIV_LONG"
            goto L27d
        L1ec:
            java.lang.String r1 = "DIV_INT_LIT"
            goto L27d
        L1f0:
            java.lang.String r1 = "DIV_INT"
            goto L27d
        L1f4:
            java.lang.String r1 = "DIV_FLOAT"
            goto L27d
        L1f8:
            java.lang.String r1 = "DIV_DOUBLE"
            goto L27d
        L1fc:
            java.lang.String r1 = "CONST_WIDE"
            goto L27d
        L200:
            java.lang.String r1 = "CONST_STRING"
            goto L27d
        L204:
            java.lang.String r1 = "CONST_CLASS"
            goto L27d
        L208:
            java.lang.String r1 = "CONST"
            goto L27d
        L20c:
            java.lang.String r1 = "CMP_LONG"
            goto L27d
        L210:
            java.lang.String r1 = "CMPL_FLOAT"
            goto L27d
        L214:
            java.lang.String r1 = "CMPL_DOUBLE"
            goto L27d
        L218:
            java.lang.String r1 = "CMPG_FLOAT"
            goto L27d
        L21c:
            java.lang.String r1 = "CMPG_DOUBLE"
            goto L27d
        L220:
            java.lang.String r1 = "CHECK_CAST"
            goto L27d
        L224:
            java.lang.String r1 = "CAST"
            goto L27d
        L228:
            java.lang.String r1 = "ARRAY_LENGTH"
            goto L27d
        L22c:
            java.lang.String r1 = "ARITH"
            goto L27d
        L230:
            java.lang.String r1 = "APUT_WIDE"
            goto L27d
        L233:
            java.lang.String r1 = "APUT_SHORT"
            goto L27d
        L236:
            java.lang.String r1 = "APUT_OBJECT"
            goto L27d
        L239:
            java.lang.String r1 = "APUT_CHAR"
            goto L27d
        L23c:
            java.lang.String r1 = "APUT_BYTE_BOOLEAN"
            goto L27d
        L23f:
            java.lang.String r1 = "APUT_BYTE"
            goto L27d
        L242:
            java.lang.String r1 = "APUT_BOOLEAN"
            goto L27d
        L245:
            java.lang.String r1 = "APUT"
            goto L27d
        L248:
            java.lang.String r1 = "AGET_WIDE"
            goto L27d
        L24b:
            java.lang.String r1 = "AGET_SHORT"
            goto L27d
        L24e:
            java.lang.String r1 = "AGET_OBJECT"
            goto L27d
        L251:
            java.lang.String r1 = "AGET_CHAR"
            goto L27d
        L254:
            java.lang.String r1 = "AGET_BYTE_BOOLEAN"
            goto L27d
        L257:
            java.lang.String r1 = "AGET_BYTE"
            goto L27d
        L25a:
            java.lang.String r1 = "AGET_BOOLEAN"
            goto L27d
        L25d:
            java.lang.String r1 = "AGET"
            goto L27d
        L260:
            java.lang.String r1 = "AND_LONG"
            goto L27d
        L263:
            java.lang.String r1 = "AND_INT_LIT"
            goto L27d
        L266:
            java.lang.String r1 = "AND_INT"
            goto L27d
        L269:
            java.lang.String r1 = "ADD_LONG"
            goto L27d
        L26c:
            java.lang.String r1 = "ADD_INT_LIT"
            goto L27d
        L26f:
            java.lang.String r1 = "ADD_INT"
            goto L27d
        L272:
            java.lang.String r1 = "ADD_FLOAT"
            goto L27d
        L275:
            java.lang.String r1 = "ADD_DOUBLE"
            goto L27d
        L278:
            java.lang.String r1 = "NOP"
            goto L27d
        L27b:
            java.lang.String r1 = "UNKNOWN"
        L27d:
            r0.append(r1)
            gf.c r1 = r4.f4494d
            if (r1 != 0) goto L298
            int r1 = r4.f4496f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "(0x%04X)"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L2bc
        L298:
            int r1 = r4.f4500j
            boolean r2 = r4.f4495e
            if (r2 == 0) goto L2bc
            r2 = 32
            r0.append(r2)
            r2 = 0
        L2a4:
            if (r2 >= r1) goto L2bc
            if (r2 == 0) goto L2ad
            java.lang.String r3 = ", "
            r0.append(r3)
        L2ad:
            java.lang.String r3 = "r"
            r0.append(r3)
            int[] r3 = r4.f4499i
            r3 = r3[r2]
            r0.append(r3)
            int r2 = r2 + 1
            goto L2a4
        L2bc:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
