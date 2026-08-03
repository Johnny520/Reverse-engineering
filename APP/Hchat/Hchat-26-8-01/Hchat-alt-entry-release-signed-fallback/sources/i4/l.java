package i4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements u4.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object f6465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f6466h;

    static {
            i4.i r0 = new i4.i
            r0.<init>()
            return
    }

    public l(g8.b r1, v4.e0 r2) {
            r0 = this;
            r0.<init>()
            if (r2 == 0) goto La
            r0.f6465g = r1
            r0.f6466h = r2
            return
        La:
            java.lang.String r1 = "pool == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
    }

    public l(i4.z r1) {
            r0 = this;
            r0.<init>()
            r0.f6466h = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f6465g = r1
            return
    }

    public l(i4.z r1, z4.g r2) {
            r0 = this;
            r0.<init>()
            r0.f6465g = r2
            r0.f6466h = r1
            return
    }

    public int a(int r17, i4.k r18) {
            r16 = this;
            r1 = r16
            r4 = r17
            r2 = r18
            java.lang.String r9 = "...at bytecode offset "
            java.lang.Object r0 = r1.f6466h
            v4.e0 r0 = (v4.e0) r0
            java.lang.Object r3 = r1.f6465g
            g8.b r3 = (g8.b) r3
            byte[] r5 = r3.f4343b
            int r6 = r3.e(r4)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            int[] r7 = i4.h.f6459a     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r7 = r7[r6]     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r7 = 0
            r8 = 5
            r10 = 172(0xac, float:2.41E-43)
            r11 = 46
            r12 = 79
            r13 = 3
            r14 = 2
            r15 = 1
            switch(r6) {
                case 0: goto L48d;
                case 1: goto L47f;
                case 2: goto L471;
                case 3: goto L463;
                case 4: goto L455;
                case 5: goto L447;
                case 6: goto L439;
                case 7: goto L42b;
                case 8: goto L41d;
                case 9: goto L40f;
                case 10: goto L401;
                case 11: goto L3f3;
                case 12: goto L3e5;
                case 13: goto L3d7;
                case 14: goto L3c9;
                case 15: goto L3bb;
                case 16: goto L3a3;
                case 17: goto L38e;
                case 18: goto L36e;
                case 19: goto L34e;
                case 20: goto L338;
                case 21: goto L324;
                case 22: goto L310;
                case 23: goto L2fc;
                case 24: goto L2e8;
                case 25: goto L2d4;
                case 26: goto L2c3;
                case 27: goto L2c3;
                case 28: goto L2c3;
                case 29: goto L2c3;
                case 30: goto L2b2;
                case 31: goto L2b2;
                case 32: goto L2b2;
                case 33: goto L2b2;
                case 34: goto L2a1;
                case 35: goto L2a1;
                case 36: goto L2a1;
                case 37: goto L2a1;
                case 38: goto L290;
                case 39: goto L290;
                case 40: goto L290;
                case 41: goto L290;
                case 42: goto L283;
                case 43: goto L283;
                case 44: goto L283;
                case 45: goto L283;
                case 46: goto L27d;
                case 47: goto L277;
                case 48: goto L271;
                case 49: goto L26b;
                case 50: goto L265;
                case 51: goto L25f;
                case 52: goto L259;
                case 53: goto L253;
                case 54: goto L23f;
                case 55: goto L22b;
                case 56: goto L217;
                case 57: goto L203;
                case 58: goto L1ef;
                case 59: goto L1de;
                case 60: goto L1de;
                case 61: goto L1de;
                case 62: goto L1de;
                case 63: goto L1cd;
                case 64: goto L1cd;
                case 65: goto L1cd;
                case 66: goto L1cd;
                case 67: goto L1bc;
                case 68: goto L1bc;
                case 69: goto L1bc;
                case 70: goto L1bc;
                case 71: goto L1ab;
                case 72: goto L1ab;
                case 73: goto L1ab;
                case 74: goto L1ab;
                case 75: goto L19e;
                case 76: goto L19e;
                case 77: goto L19e;
                case 78: goto L19e;
                case 79: goto L198;
                case 80: goto L192;
                case 81: goto L18c;
                case 82: goto L186;
                case 83: goto L180;
                case 84: goto L17a;
                case 85: goto L174;
                case 86: goto L16e;
                case 87: goto L167;
                case 88: goto L167;
                case 89: goto L167;
                case 90: goto L167;
                case 91: goto L167;
                case 92: goto L167;
                case 93: goto L167;
                case 94: goto L167;
                case 95: goto L167;
                case 96: goto L160;
                case 97: goto L157;
                case 98: goto L14e;
                case 99: goto L145;
                case 100: goto L160;
                case 101: goto L157;
                case 102: goto L14e;
                case 103: goto L145;
                case 104: goto L160;
                case 105: goto L157;
                case 106: goto L14e;
                case 107: goto L145;
                case 108: goto L160;
                case 109: goto L157;
                case 110: goto L14e;
                case 111: goto L145;
                case 112: goto L160;
                case 113: goto L157;
                case 114: goto L14e;
                case 115: goto L145;
                case 116: goto L160;
                case 117: goto L157;
                case 118: goto L14e;
                case 119: goto L145;
                case 120: goto L160;
                case 121: goto L157;
                case 122: goto L160;
                case 123: goto L157;
                case 124: goto L160;
                case 125: goto L157;
                case 126: goto L160;
                case 127: goto L157;
                case 128: goto L160;
                case 129: goto L157;
                case 130: goto L160;
                case 131: goto L157;
                case 132: goto L12d;
                case 133: goto L126;
                case 134: goto L11f;
                case 135: goto L118;
                case 136: goto L111;
                case 137: goto L11f;
                case 138: goto L118;
                case 139: goto L111;
                case 140: goto L126;
                case 141: goto L118;
                case 142: goto L111;
                case 143: goto L126;
                case 144: goto L11f;
                case 145: goto L111;
                case 146: goto L111;
                case 147: goto L111;
                case 148: goto L111;
                case 149: goto L111;
                case 150: goto L111;
                case 151: goto L111;
                case 152: goto L111;
                case 153: goto L105;
                case 154: goto L105;
                case 155: goto L105;
                case 156: goto L105;
                case 157: goto L105;
                case 158: goto L105;
                case 159: goto L105;
                case 160: goto L105;
                case 161: goto L105;
                case 162: goto L105;
                case 163: goto L105;
                case 164: goto L105;
                case 165: goto L105;
                case 166: goto L105;
                case 167: goto L105;
                case 168: goto L105;
                case 169: goto Lf5;
                case 170: goto Lf0;
                case 171: goto Leb;
                case 172: goto Le5;
                case 173: goto Ldf;
                case 174: goto Ld9;
                case 175: goto Ld3;
                case 176: goto Lcd;
                case 177: goto Lc6;
                case 178: goto Lb0;
                case 179: goto Lb0;
                case 180: goto Lb0;
                case 181: goto Lb0;
                case 182: goto Lb0;
                case 183: goto Lb0;
                case 184: goto Lb0;
                case 185: goto L8b;
                case 186: goto L72;
                case 187: goto Lb0;
                case 188: goto L6d;
                case 189: goto Lb0;
                case 190: goto L111;
                case 191: goto Lc6;
                case 192: goto Lb0;
                case 193: goto Lb0;
                case 194: goto Lc6;
                case 195: goto Lc6;
                case 196: goto L68;
                case 197: goto L46;
                case 198: goto L105;
                case 199: goto L105;
                case 200: goto L32;
                case 201: goto L32;
                default: goto L28;
            }     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
        L28:
            r2.d(r6, r4)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L2c:
            r0 = move-exception
            goto L494
        L2f:
            r0 = move-exception
            goto L4a6
        L32:
            int r0 = r4 + 1
            int r0 = r3.b(r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            int r0 = r0 + r4
            r3 = 200(0xc8, float:2.8E-43)
            if (r6 != r3) goto L40
            r3 = 167(0xa7, float:2.34E-43)
            goto L42
        L40:
            r3 = 168(0xa8, float:2.35E-43)
        L42:
            r2.h(r3, r4, r8, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r8
        L46:
            int r5 = r4 + 1
            int r5 = r3.g(r5)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            int r7 = r4 + 3
            int r7 = r3.e(r7)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            v4.a r0 = r0.l(r5)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r5 = 4
            r8 = 4
            r3 = r6
            r6 = r0
            r2.b(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r8
        L5e:
            r0 = move-exception
            r4 = r17
            goto L494
        L63:
            r0 = move-exception
            r4 = r17
            goto L4a6
        L68:
            int r0 = r16.f(r17, r18)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r0
        L6d:
            int r0 = r16.c(r17, r18)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r0
        L72:
            r2 = r6
            int r4 = r17 + 1
            int r3 = r3.g(r4)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            v4.a r0 = r0.l(r3)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r6 = r0
            v4.q r6 = (v4.q) r6     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r5 = 5
            r7 = 0
            r4 = r17
            r3 = r2
            r2 = r18
            r2.b(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r8
        L8b:
            r2 = r6
            int r4 = r17 + 1
            int r4 = r3.g(r4)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            int r5 = r17 + 3
            int r5 = r3.e(r5)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            int r6 = r17 + 4
            int r3 = r3.e(r6)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            v4.a r6 = r0.l(r4)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            int r0 = r3 << 8
            r7 = r5 | r0
            r5 = 5
            r4 = r17
            r3 = r2
            r2 = r18
            r2.b(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r8
        Lb0:
            r2 = r6
            int r4 = r17 + 1
            int r3 = r3.g(r4)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            v4.a r6 = r0.l(r3)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r5 = 3
            r7 = 0
            r4 = r17
            r3 = r2
            r2 = r18
            r2.b(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r13
        Lc6:
            r0 = r6
            w4.c r3 = w4.c.f14874w     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r0, r4, r3)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        Lcd:
            w4.c r0 = w4.c.E     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r10, r4, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        Ld3:
            w4.c r0 = w4.c.f14869r     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r10, r4, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        Ld9:
            w4.c r0 = w4.c.f14870s     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r10, r4, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        Ldf:
            w4.c r0 = w4.c.f14872u     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r10, r4, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        Le5:
            w4.c r0 = w4.c.f14871t     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r10, r4, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        Leb:
            int r0 = r16.b(r17, r18)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r0
        Lf0:
            int r0 = r16.e(r17, r18)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r0
        Lf5:
            r0 = r6
            int r5 = r4 + 1
            int r6 = r3.e(r5)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            w4.c r7 = w4.c.f14876y     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r8 = 0
            r5 = 2
            r3 = r0
            r2.i(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r14
        L105:
            r0 = r6
            int r5 = r4 + 1
            int r3 = r3.d(r5)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            int r3 = r3 + r4
            r2.h(r0, r4, r13, r3)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r13
        L111:
            r0 = r6
            w4.c r3 = w4.c.f14871t     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r0, r4, r3)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L118:
            r0 = r6
            w4.c r3 = w4.c.f14869r     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r0, r4, r3)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L11f:
            r0 = r6
            w4.c r3 = w4.c.f14870s     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r0, r4, r3)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L126:
            r0 = r6
            w4.c r3 = w4.c.f14872u     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r0, r4, r3)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L12d:
            r0 = r6
            int r6 = r4 + 1
            int r6 = r3.e(r6)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            int r7 = r4 + 2
            int r8 = r4 + 3
            r3.a(r7, r8)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r8 = r5[r7]     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            w4.c r7 = w4.c.f14871t     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r5 = 3
            r3 = r0
            r2.i(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r13
        L145:
            r3 = r6
            int r6 = r3 + (-3)
            w4.c r0 = w4.c.f14869r     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r6, r4, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L14e:
            r3 = r6
            int r6 = r3 + (-2)
            w4.c r0 = w4.c.f14870s     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r6, r4, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L157:
            r3 = r6
            int r6 = r3 + (-1)
            w4.c r0 = w4.c.f14872u     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r6, r4, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L160:
            r3 = r6
            w4.c r0 = w4.c.f14871t     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r3, r4, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L167:
            r3 = r6
            w4.c r0 = w4.c.f14874w     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r3, r4, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L16e:
            w4.c r0 = w4.c.f14873v     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r12, r4, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L174:
            w4.c r0 = w4.c.f14868q     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r12, r4, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L17a:
            w4.c r0 = w4.c.f14867p     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r12, r4, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L180:
            w4.c r0 = w4.c.E     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r12, r4, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L186:
            w4.c r0 = w4.c.f14869r     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r12, r4, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L18c:
            w4.c r0 = w4.c.f14870s     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r12, r4, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L192:
            w4.c r0 = w4.c.f14872u     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r12, r4, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L198:
            w4.c r0 = w4.c.f14871t     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r12, r4, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L19e:
            r3 = r6
            int r6 = r3 + (-75)
            w4.c r7 = w4.c.E     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r8 = 0
            r3 = 54
            r5 = 1
            r2.i(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r15
        L1ab:
            r3 = r6
            int r6 = r3 + (-71)
            w4.c r7 = w4.c.f14869r     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r8 = 0
            r3 = 54
            r5 = 1
            r4 = r17
            r2 = r18
            r2.i(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r15
        L1bc:
            r3 = r6
            int r6 = r3 + (-67)
            w4.c r7 = w4.c.f14870s     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r8 = 0
            r3 = 54
            r5 = 1
            r4 = r17
            r2 = r18
            r2.i(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r15
        L1cd:
            r3 = r6
            int r6 = r3 + (-63)
            w4.c r7 = w4.c.f14872u     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r8 = 0
            r3 = 54
            r5 = 1
            r4 = r17
            r2 = r18
            r2.i(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r15
        L1de:
            r3 = r6
            int r6 = r3 + (-59)
            w4.c r7 = w4.c.f14871t     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r8 = 0
            r3 = 54
            r5 = 1
            r4 = r17
            r2 = r18
            r2.i(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r15
        L1ef:
            int r0 = r17 + 1
            int r6 = r3.e(r0)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            w4.c r7 = w4.c.E     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r8 = 0
            r3 = 54
            r5 = 2
            r4 = r17
            r2 = r18
            r2.i(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r14
        L203:
            int r0 = r17 + 1
            int r6 = r3.e(r0)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            w4.c r7 = w4.c.f14869r     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r8 = 0
            r3 = 54
            r5 = 2
            r4 = r17
            r2 = r18
            r2.i(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r14
        L217:
            int r0 = r17 + 1
            int r6 = r3.e(r0)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            w4.c r7 = w4.c.f14870s     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r8 = 0
            r3 = 54
            r5 = 2
            r4 = r17
            r2 = r18
            r2.i(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r14
        L22b:
            int r0 = r17 + 1
            int r6 = r3.e(r0)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            w4.c r7 = w4.c.f14872u     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r8 = 0
            r3 = 54
            r5 = 2
            r4 = r17
            r2 = r18
            r2.i(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r14
        L23f:
            int r0 = r17 + 1
            int r6 = r3.e(r0)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            w4.c r7 = w4.c.f14871t     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r8 = 0
            r3 = 54
            r5 = 2
            r4 = r17
            r2 = r18
            r2.i(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r14
        L253:
            w4.c r0 = w4.c.f14873v     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r11, r4, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L259:
            w4.c r0 = w4.c.f14868q     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r11, r4, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L25f:
            w4.c r0 = w4.c.f14867p     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r11, r4, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L265:
            w4.c r0 = w4.c.E     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r11, r4, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L26b:
            w4.c r0 = w4.c.f14869r     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r11, r4, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L271:
            w4.c r0 = w4.c.f14870s     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r11, r4, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L277:
            w4.c r0 = w4.c.f14872u     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r11, r4, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L27d:
            w4.c r0 = w4.c.f14871t     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r11, r4, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L283:
            r3 = r6
            int r6 = r3 + (-42)
            w4.c r7 = w4.c.E     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r8 = 0
            r3 = 21
            r5 = 1
            r2.i(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r15
        L290:
            r3 = r6
            int r6 = r3 + (-38)
            w4.c r7 = w4.c.f14869r     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r8 = 0
            r3 = 21
            r5 = 1
            r4 = r17
            r2 = r18
            r2.i(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r15
        L2a1:
            r3 = r6
            int r6 = r3 + (-34)
            w4.c r7 = w4.c.f14870s     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r8 = 0
            r3 = 21
            r5 = 1
            r4 = r17
            r2 = r18
            r2.i(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r15
        L2b2:
            r3 = r6
            int r6 = r3 + (-30)
            w4.c r7 = w4.c.f14872u     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r8 = 0
            r3 = 21
            r5 = 1
            r4 = r17
            r2 = r18
            r2.i(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r15
        L2c3:
            r3 = r6
            int r6 = r3 + (-26)
            w4.c r7 = w4.c.f14871t     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r8 = 0
            r3 = 21
            r5 = 1
            r4 = r17
            r2 = r18
            r2.i(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r15
        L2d4:
            int r0 = r17 + 1
            int r6 = r3.e(r0)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            w4.c r7 = w4.c.E     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r8 = 0
            r3 = 21
            r5 = 2
            r4 = r17
            r2 = r18
            r2.i(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r14
        L2e8:
            int r0 = r17 + 1
            int r6 = r3.e(r0)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            w4.c r7 = w4.c.f14869r     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r8 = 0
            r3 = 21
            r5 = 2
            r4 = r17
            r2 = r18
            r2.i(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r14
        L2fc:
            int r0 = r17 + 1
            int r6 = r3.e(r0)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            w4.c r7 = w4.c.f14870s     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r8 = 0
            r3 = 21
            r5 = 2
            r4 = r17
            r2 = r18
            r2.i(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r14
        L310:
            int r0 = r17 + 1
            int r6 = r3.e(r0)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            w4.c r7 = w4.c.f14872u     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r8 = 0
            r3 = 21
            r5 = 2
            r4 = r17
            r2 = r18
            r2.i(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r14
        L324:
            int r0 = r17 + 1
            int r6 = r3.e(r0)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            w4.c r7 = w4.c.f14871t     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r8 = 0
            r3 = 21
            r5 = 2
            r4 = r17
            r2 = r18
            r2.i(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r14
        L338:
            int r2 = r17 + 1
            int r2 = r3.g(r2)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            v4.a r6 = r0.l(r2)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r5 = 3
            r7 = 0
            r3 = 20
            r4 = r17
            r2 = r18
            r2.b(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r13
        L34e:
            int r2 = r17 + 1
            int r2 = r3.g(r2)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            v4.a r6 = r0.l(r2)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            boolean r0 = r6 instanceof v4.o     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            if (r0 == 0) goto L363
            r0 = r6
            v4.o r0 = (v4.o) r0     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            int r7 = r0.n()     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
        L363:
            r3 = 18
            r5 = 3
            r4 = r17
            r2 = r18
            r2.b(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r13
        L36e:
            int r2 = r17 + 1
            int r2 = r3.e(r2)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            v4.a r6 = r0.l(r2)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            boolean r0 = r6 instanceof v4.o     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            if (r0 == 0) goto L383
            r0 = r6
            v4.o r0 = (v4.o) r0     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            int r7 = r0.n()     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
        L383:
            r3 = 18
            r5 = 2
            r4 = r17
            r2 = r18
            r2.b(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r14
        L38e:
            int r0 = r17 + 1
            int r7 = r3.d(r0)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            v4.o r6 = v4.o.o(r7)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r3 = 18
            r5 = 3
            r4 = r17
            r2 = r18
            r2.b(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r13
        L3a3:
            int r0 = r17 + 1
            int r2 = r17 + 2
            r3.a(r0, r2)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r7 = r5[r0]     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            v4.o r6 = v4.o.o(r7)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r3 = 18
            r5 = 2
            r4 = r17
            r2 = r18
            r2.b(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r14
        L3bb:
            v4.k r6 = v4.k.f14100i     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r7 = 0
            r3 = 18
            r5 = 1
            r4 = r17
            r2 = r18
            r2.b(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r15
        L3c9:
            v4.k r6 = v4.k.f14099h     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r7 = 0
            r3 = 18
            r5 = 1
            r4 = r17
            r2 = r18
            r2.b(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r15
        L3d7:
            v4.n r6 = v4.n.f14104j     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r7 = 0
            r3 = 18
            r5 = 1
            r4 = r17
            r2 = r18
            r2.b(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r15
        L3e5:
            v4.n r6 = v4.n.f14103i     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r7 = 0
            r3 = 18
            r5 = 1
            r4 = r17
            r2 = r18
            r2.b(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r15
        L3f3:
            v4.n r6 = v4.n.f14102h     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r7 = 0
            r3 = 18
            r5 = 1
            r4 = r17
            r2 = r18
            r2.b(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r15
        L401:
            v4.v r6 = v4.v.f14124i     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r7 = 0
            r3 = 18
            r5 = 1
            r4 = r17
            r2 = r18
            r2.b(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r15
        L40f:
            v4.v r6 = v4.v.f14123h     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r7 = 0
            r3 = 18
            r5 = 1
            r4 = r17
            r2 = r18
            r2.b(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r15
        L41d:
            v4.o r6 = v4.o.f14112o     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r7 = 5
            r3 = 18
            r5 = 1
            r4 = r17
            r2 = r18
            r2.b(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r15
        L42b:
            v4.o r6 = v4.o.f14111n     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r7 = 4
            r3 = 18
            r5 = 1
            r4 = r17
            r2 = r18
            r2.b(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r15
        L439:
            v4.o r6 = v4.o.f14110m     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r7 = 3
            r3 = 18
            r5 = 1
            r4 = r17
            r2 = r18
            r2.b(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r15
        L447:
            v4.o r6 = v4.o.f14109l     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r7 = 2
            r3 = 18
            r5 = 1
            r4 = r17
            r2 = r18
            r2.b(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r15
        L455:
            v4.o r6 = v4.o.f14108k     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r7 = 1
            r3 = 18
            r5 = 1
            r4 = r17
            r2 = r18
            r2.b(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r15
        L463:
            v4.o r6 = v4.o.f14107j     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r7 = 0
            r3 = 18
            r5 = 1
            r4 = r17
            r2 = r18
            r2.b(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r15
        L471:
            v4.o r6 = v4.o.f14106i     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r7 = -1
            r3 = 18
            r5 = 1
            r4 = r17
            r2 = r18
            r2.b(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            return r15
        L47f:
            v4.r r6 = v4.r.f14120g     // Catch: java.lang.RuntimeException -> L5e i4.b0 -> L63
            r7 = 0
            r3 = 18
            r5 = 1
            r4 = r17
            r2 = r18
            r2.b(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L48d:
            r3 = r6
            w4.c r0 = w4.c.f14874w     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            r2.a(r3, r4, r0)     // Catch: java.lang.RuntimeException -> L2c i4.b0 -> L2f
            return r15
        L494:
            i4.b0 r2 = new i4.b0
            r3 = 0
            r2.<init>(r3, r0)
            java.lang.String r0 = a.a.Y0(r4)
            java.lang.String r0 = r9.concat(r0)
            r2.a(r0)
            throw r2
        L4a6:
            java.lang.String r2 = a.a.Y0(r4)
            java.lang.String r2 = r9.concat(r2)
            r0.a(r2)
            throw r0
    }

    public int b(int r11, i4.k r12) {
            r10 = this;
            java.lang.Object r0 = r10.f6465g
            g8.b r0 = (g8.b) r0
            int r1 = r11 + 4
            r1 = r1 & (-4)
            int r2 = r11 + 1
            r3 = 0
            r4 = r3
        Lc:
            if (r2 >= r1) goto L18
            int r4 = r4 << 8
            int r5 = r0.e(r2)
            r4 = r4 | r5
            int r2 = r2 + 1
            goto Lc
        L18:
            int r2 = r0.b(r1)
            int r2 = r2 + r11
            int r5 = r1 + 4
            int r5 = r0.b(r5)
            int r1 = r1 + 8
            i4.n r6 = new i4.n
            r7 = 1
            r6.<init>(r5, r7)
        L2b:
            if (r3 >= r5) goto L57
            int r7 = r0.b(r1)
            int r8 = r1 + 4
            int r8 = r0.b(r8)
            int r8 = r8 + r11
            int r1 = r1 + 8
            r6.j()
            if (r8 < 0) goto L50
            java.lang.Object r9 = r6.f6474j
            z4.g r9 = (z4.g) r9
            r9.l(r7)
            java.lang.Object r7 = r6.f6475k
            z4.g r7 = (z4.g) r7
            r7.l(r8)
            int r3 = r3 + 1
            goto L2b
        L50:
            java.lang.String r11 = "target < 0"
            j8.o.t(r11)
            r11 = 0
            return r11
        L57:
            r6.s(r2)
            r6.r()
            r6.i()
            int r1 = r1 - r11
            r12.g(r11, r1, r6, r4)
            return r1
    }

    public int c(int r14, i4.k r15) {
            r13 = this;
            java.lang.Object r0 = r13.f6465g
            g8.b r0 = (g8.b) r0
            int r1 = r14 + 1
            int r1 = r0.e(r1)
            r2 = 0
            switch(r1) {
                case 4: goto L33;
                case 5: goto L30;
                case 6: goto L2d;
                case 7: goto L2a;
                case 8: goto L27;
                case 9: goto L24;
                case 10: goto L21;
                case 11: goto L1e;
                default: goto Le;
            }
        Le:
            i4.b0 r14 = new i4.b0
            java.lang.String r15 = a.a.W0(r1)
            java.lang.String r0 = "bad newarray code "
            java.lang.String r15 = r0.concat(r15)
            r14.<init>(r15, r2)
            throw r14
        L1e:
            v4.d0 r3 = v4.d0.f14086y
            goto L35
        L21:
            v4.d0 r3 = v4.d0.f14087z
            goto L35
        L24:
            v4.d0 r3 = v4.d0.A
            goto L35
        L27:
            v4.d0 r3 = v4.d0.f14082u
            goto L35
        L2a:
            v4.d0 r3 = v4.d0.f14084w
            goto L35
        L2d:
            v4.d0 r3 = v4.d0.f14085x
            goto L35
        L30:
            v4.d0 r3 = v4.d0.f14083v
            goto L35
        L33:
            v4.d0 r3 = v4.d0.f14081t
        L35:
            int r4 = r15.f()
            i4.j r5 = new i4.j
            r5.<init>()
            r6 = 0
            if (r4 < 0) goto L52
            r13.a(r4, r5)
            v4.a r7 = r5.f6462h
            boolean r7 = r7 instanceof v4.o
            if (r7 == 0) goto L52
            int r7 = r5.f6463i
            int r7 = r7 + r4
            if (r7 != r14) goto L52
            int r4 = r5.f6464j
            goto L53
        L52:
            r4 = r6
        L53:
            int r7 = r14 + 2
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r4 == 0) goto Lbd
        L5c:
            int r9 = r7 + 1
            int r10 = r0.e(r7)
            r11 = 89
            if (r10 == r11) goto L67
            goto Lbd
        L67:
            r13.a(r9, r5)
            int r10 = r5.f6463i
            if (r10 == 0) goto Lbd
            v4.a r11 = r5.f6462h
            boolean r11 = r11 instanceof v4.o
            if (r11 == 0) goto Lbd
            int r11 = r5.f6464j
            if (r11 == r6) goto L79
            goto Lbd
        L79:
            int r9 = r9 + r10
            r13.a(r9, r5)
            int r10 = r5.f6463i
            if (r10 == 0) goto Lbd
            v4.a r11 = r5.f6462h
            boolean r12 = r11 instanceof v4.u
            if (r12 != 0) goto L88
            goto Lbd
        L88:
            int r9 = r9 + r10
            r8.add(r11)
            int r10 = r9 + 1
            int r9 = r0.e(r9)
            switch(r1) {
                case 4: goto Lb4;
                case 5: goto Laf;
                case 6: goto Laa;
                case 7: goto La5;
                case 8: goto Lb4;
                case 9: goto La0;
                case 10: goto L9b;
                case 11: goto L96;
                default: goto L95;
            }
        L95:
            goto Lbd
        L96:
            r11 = 80
            if (r9 == r11) goto Lb9
            goto Lbd
        L9b:
            r11 = 79
            if (r9 == r11) goto Lb9
            goto Lbd
        La0:
            r11 = 86
            if (r9 == r11) goto Lb9
            goto Lbd
        La5:
            r11 = 82
            if (r9 == r11) goto Lb9
            goto Lbd
        Laa:
            r11 = 81
            if (r9 == r11) goto Lb9
            goto Lbd
        Laf:
            r11 = 85
            if (r9 == r11) goto Lb9
            goto Lbd
        Lb4:
            r11 = 84
            if (r9 == r11) goto Lb9
            goto Lbd
        Lb9:
            int r6 = r6 + 1
            r7 = r10
            goto L5c
        Lbd:
            r0 = 2
            if (r6 < r0) goto Lc8
            if (r6 == r4) goto Lc3
            goto Lc8
        Lc3:
            int r7 = r7 - r14
            r15.c(r14, r7, r3, r8)
            return r7
        Lc8:
            r15.c(r14, r0, r3, r2)
            return r0
    }

    @Override // u4.a
    public void d(u4.b r2) {
            r1 = this;
            java.lang.Object r0 = r1.f6466h
            i4.z r0 = (i4.z) r0
            boolean r0 = r0.h(r2)
            if (r0 == 0) goto L13
            java.lang.Object r0 = r1.f6465g
            z4.g r0 = (z4.g) r0
            int r2 = r2.f13365a
            r0.l(r2)
        L13:
            return
    }

    public int e(int r12, i4.k r13) {
            r11 = this;
            java.lang.Object r0 = r11.f6465g
            g8.b r0 = (g8.b) r0
            int r1 = r12 + 4
            r1 = r1 & (-4)
            int r2 = r12 + 1
            r3 = 0
            r4 = r3
        Lc:
            if (r2 >= r1) goto L18
            int r4 = r4 << 8
            int r5 = r0.e(r2)
            r4 = r4 | r5
            int r2 = r2 + 1
            goto Lc
        L18:
            int r2 = r0.b(r1)
            int r2 = r2 + r12
            int r5 = r1 + 4
            int r5 = r0.b(r5)
            int r6 = r1 + 8
            int r6 = r0.b(r6)
            int r7 = r6 - r5
            int r7 = r7 + 1
            int r1 = r1 + 12
            if (r5 > r6) goto L6d
            i4.n r6 = new i4.n
            r8 = 1
            r6.<init>(r7, r8)
        L37:
            if (r3 >= r7) goto L5f
            int r8 = r0.b(r1)
            int r8 = r8 + r12
            int r1 = r1 + 4
            int r9 = r5 + r3
            r6.j()
            if (r8 < 0) goto L58
            java.lang.Object r10 = r6.f6474j
            z4.g r10 = (z4.g) r10
            r10.l(r9)
            java.lang.Object r9 = r6.f6475k
            z4.g r9 = (z4.g) r9
            r9.l(r8)
            int r3 = r3 + 1
            goto L37
        L58:
            java.lang.String r12 = "target < 0"
            j8.o.t(r12)
            r12 = 0
            return r12
        L5f:
            r6.s(r2)
            r6.r()
            r6.i()
            int r1 = r1 - r12
            r13.g(r12, r1, r6, r4)
            return r1
        L6d:
            i4.b0 r12 = new i4.b0
            java.lang.String r13 = "low / high inversion"
            r0 = 0
            r12.<init>(r13, r0)
            throw r12
    }

    public int f(int r12, i4.k r13) {
            r11 = this;
            java.lang.Object r0 = r11.f6465g
            g8.b r0 = (g8.b) r0
            int r1 = r12 + 1
            int r3 = r0.e(r1)
            int r1 = r12 + 2
            int r8 = r0.g(r1)
            r1 = 132(0x84, float:1.85E-43)
            if (r3 == r1) goto Lab
            r0 = 169(0xa9, float:2.37E-43)
            r1 = 4
            if (r3 == r0) goto L9e
            switch(r3) {
                case 21: goto L92;
                case 22: goto L86;
                case 23: goto L7a;
                case 24: goto L6e;
                case 25: goto L62;
                default: goto L1c;
            }
        L1c:
            switch(r3) {
                case 54: goto L56;
                case 55: goto L4a;
                case 56: goto L3e;
                case 57: goto L32;
                case 58: goto L26;
                default: goto L1f;
            }
        L1f:
            r0 = 196(0xc4, float:2.75E-43)
            r13.d(r0, r12)
            r12 = 1
            return r12
        L26:
            w4.c r9 = w4.c.E
            r10 = 0
            r5 = 54
            r7 = 4
            r6 = r12
            r4 = r13
            r4.i(r5, r6, r7, r8, r9, r10)
            return r1
        L32:
            r6 = r12
            r4 = r13
            w4.c r9 = w4.c.f14869r
            r10 = 0
            r5 = 54
            r7 = 4
            r4.i(r5, r6, r7, r8, r9, r10)
            return r1
        L3e:
            r6 = r12
            r4 = r13
            w4.c r9 = w4.c.f14870s
            r10 = 0
            r5 = 54
            r7 = 4
            r4.i(r5, r6, r7, r8, r9, r10)
            return r1
        L4a:
            r6 = r12
            r4 = r13
            w4.c r9 = w4.c.f14872u
            r10 = 0
            r5 = 54
            r7 = 4
            r4.i(r5, r6, r7, r8, r9, r10)
            return r1
        L56:
            r6 = r12
            r4 = r13
            w4.c r9 = w4.c.f14871t
            r10 = 0
            r5 = 54
            r7 = 4
            r4.i(r5, r6, r7, r8, r9, r10)
            return r1
        L62:
            r6 = r12
            r4 = r13
            w4.c r9 = w4.c.E
            r10 = 0
            r5 = 21
            r7 = 4
            r4.i(r5, r6, r7, r8, r9, r10)
            return r1
        L6e:
            r6 = r12
            r4 = r13
            w4.c r9 = w4.c.f14869r
            r10 = 0
            r5 = 21
            r7 = 4
            r4.i(r5, r6, r7, r8, r9, r10)
            return r1
        L7a:
            r6 = r12
            r4 = r13
            w4.c r9 = w4.c.f14870s
            r10 = 0
            r5 = 21
            r7 = 4
            r4.i(r5, r6, r7, r8, r9, r10)
            return r1
        L86:
            r6 = r12
            r4 = r13
            w4.c r9 = w4.c.f14872u
            r10 = 0
            r5 = 21
            r7 = 4
            r4.i(r5, r6, r7, r8, r9, r10)
            return r1
        L92:
            r6 = r12
            r4 = r13
            w4.c r9 = w4.c.f14871t
            r10 = 0
            r5 = 21
            r7 = 4
            r4.i(r5, r6, r7, r8, r9, r10)
            return r1
        L9e:
            r6 = r12
            r4 = r13
            w4.c r7 = w4.c.f14876y
            r2 = r4
            r4 = r6
            r6 = r8
            r8 = 0
            r5 = 4
            r2.i(r3, r4, r5, r6, r7, r8)
            return r1
        Lab:
            r6 = r12
            r4 = r13
            int r12 = r6 + 4
            int r12 = r0.d(r12)
            r5 = 6
            w4.c r7 = w4.c.f14871t
            r2 = r4
            r4 = r6
            r6 = r8
            r8 = r12
            r2.i(r3, r4, r5, r6, r7, r8)
            r12 = 6
            return r12
    }
}
