package v4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends v4.f0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f14067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g8.b f14068h;

    static {
            v4.c0 r0 = new v4.c0
            java.lang.String r1 = ""
            r0.<init>(r1)
            return
    }

    public c0(g8.b r13) {
            r12 = this;
            r12.<init>()
            r12.f14068h = r13
            int r0 = r13.f4344c
            char[] r1 = new char[r0]
            r2 = 0
            r3 = r2
            r4 = r3
        Lc:
            if (r0 <= 0) goto L93
            int r5 = r13.e(r4)
            int r6 = r5 >> 4
            r7 = 0
            r8 = 128(0x80, float:1.8E-43)
            switch(r6) {
                case 0: goto L82;
                case 1: goto L82;
                case 2: goto L82;
                case 3: goto L82;
                case 4: goto L82;
                case 5: goto L82;
                case 6: goto L82;
                case 7: goto L82;
                case 8: goto L1a;
                case 9: goto L1a;
                case 10: goto L1a;
                case 11: goto L1a;
                case 12: goto L58;
                case 13: goto L58;
                case 14: goto L1e;
                default: goto L1a;
            }
        L1a:
            k(r5, r4)
            throw r7
        L1e:
            int r0 = r0 + (-3)
            if (r0 < 0) goto L54
            int r6 = r4 + 1
            int r9 = r13.e(r6)
            r10 = r9 & 192(0xc0, float:2.69E-43)
            if (r10 != r8) goto L50
            int r6 = r4 + 2
            int r11 = r13.e(r6)
            if (r10 != r8) goto L4c
            r5 = r5 & 15
            int r5 = r5 << 12
            r8 = r9 & 63
            int r8 = r8 << 6
            r5 = r5 | r8
            r8 = r11 & 63
            r5 = r5 | r8
            r8 = 2048(0x800, float:2.87E-42)
            if (r5 < r8) goto L48
            char r5 = (char) r5
            int r4 = r4 + 3
            goto L89
        L48:
            k(r11, r6)
            throw r7
        L4c:
            k(r11, r6)
            throw r7
        L50:
            k(r9, r6)
            throw r7
        L54:
            k(r5, r4)
            throw r7
        L58:
            int r0 = r0 + (-2)
            if (r0 < 0) goto L7e
            int r6 = r4 + 1
            int r9 = r13.e(r6)
            r10 = r9 & 192(0xc0, float:2.69E-43)
            if (r10 != r8) goto L7a
            r5 = r5 & 31
            int r5 = r5 << 6
            r10 = r9 & 63
            r5 = r5 | r10
            if (r5 == 0) goto L76
            if (r5 < r8) goto L72
            goto L76
        L72:
            k(r9, r6)
            throw r7
        L76:
            char r5 = (char) r5
            int r4 = r4 + 2
            goto L89
        L7a:
            k(r9, r6)
            throw r7
        L7e:
            k(r5, r4)
            throw r7
        L82:
            int r0 = r0 + (-1)
            if (r5 == 0) goto L8f
            char r5 = (char) r5
            int r4 = r4 + 1
        L89:
            r1[r3] = r5
            int r3 = r3 + 1
            goto Lc
        L8f:
            k(r5, r4)
            throw r7
        L93:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r1, r2, r3)
            java.lang.String r13 = r13.intern()
            r12.f14067g = r13
            return
    }

    public c0(java.lang.String r11) {
            r10 = this;
            r10.<init>()
            if (r11 == 0) goto L6f
            java.lang.String r0 = r11.intern()
            r10.f14067g = r0
            g8.b r0 = new g8.b
            int r1 = r11.length()
            int r2 = r1 * 3
            byte[] r2 = new byte[r2]
            r3 = 0
            r4 = r3
            r5 = r4
        L18:
            if (r4 >= r1) goto L62
            char r6 = r11.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 == 0) goto L2a
            if (r6 >= r7) goto L2a
            byte r6 = (byte) r6
            r2[r5] = r6
            int r5 = r5 + 1
            goto L5f
        L2a:
            r8 = 2048(0x800, float:2.87E-42)
            if (r6 >= r8) goto L42
            int r8 = r6 >> 6
            r8 = r8 & 31
            r8 = r8 | 192(0xc0, float:2.69E-43)
            byte r8 = (byte) r8
            r2[r5] = r8
            int r8 = r5 + 1
            r6 = r6 & 63
            r6 = r6 | r7
            byte r6 = (byte) r6
            r2[r8] = r6
            int r5 = r5 + 2
            goto L5f
        L42:
            int r8 = r6 >> 12
            r8 = r8 & 15
            r8 = r8 | 224(0xe0, float:3.14E-43)
            byte r8 = (byte) r8
            r2[r5] = r8
            int r8 = r5 + 1
            int r9 = r6 >> 6
            r9 = r9 & 63
            r9 = r9 | r7
            byte r9 = (byte) r9
            r2[r8] = r9
            int r8 = r5 + 2
            r6 = r6 & 63
            r6 = r6 | r7
            byte r6 = (byte) r6
            r2[r8] = r6
            int r5 = r5 + 3
        L5f:
            int r4 = r4 + 1
            goto L18
        L62:
            byte[] r11 = new byte[r5]
            java.lang.System.arraycopy(r2, r3, r11, r3, r5)
            r1 = 3
            r2 = 0
            r0.<init>(r11, r1, r2)
            r10.f14068h = r0
            return
        L6f:
            java.lang.String r11 = "string == null"
            bsh.j.c(r11)
            r11 = 0
            throw r11
    }

    public static void k(int r3, int r4) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "bad utf-8 byte "
            r1.<init>(r2)
            java.lang.String r3 = a.a.W0(r3)
            r1.append(r3)
            java.lang.String r3 = " at offset "
            r1.append(r3)
            java.lang.String r3 = a.a.Y0(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // z4.k
    public final java.lang.String a() {
            r11 = this;
            java.lang.String r0 = r11.f14067g
            int r1 = r0.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r1 * 3
            int r3 = r3 / 2
            r2.<init>(r3)
            r3 = 0
            r4 = r3
        L11:
            if (r4 >= r1) goto Lbb
            char r5 = r0.charAt(r4)
            r6 = 32
            r7 = 127(0x7f, float:1.78E-43)
            r8 = 92
            if (r5 < r6) goto L33
            if (r5 >= r7) goto L33
            r6 = 39
            if (r5 == r6) goto L2b
            r6 = 34
            if (r5 == r6) goto L2b
            if (r5 != r8) goto L2e
        L2b:
            r2.append(r8)
        L2e:
            r2.append(r5)
            goto Lb7
        L33:
            if (r5 > r7) goto L88
            r6 = 9
            if (r5 == r6) goto L82
            r6 = 10
            if (r5 == r6) goto L7c
            r6 = 13
            if (r5 == r6) goto L76
            int r6 = r1 + (-1)
            if (r4 >= r6) goto L4c
            int r6 = r4 + 1
            char r6 = r0.charAt(r6)
            goto L4d
        L4c:
            r6 = r3
        L4d:
            r7 = 48
            r9 = 1
            if (r6 < r7) goto L58
            r10 = 55
            if (r6 > r10) goto L58
            r6 = r9
            goto L59
        L58:
            r6 = r3
        L59:
            r2.append(r8)
            r8 = 6
        L5d:
            if (r8 < 0) goto L70
            int r10 = r5 >> r8
            r10 = r10 & 7
            int r10 = r10 + r7
            char r10 = (char) r10
            if (r10 != r7) goto L69
            if (r6 == 0) goto L6d
        L69:
            r2.append(r10)
            r6 = r9
        L6d:
            int r8 = r8 + (-3)
            goto L5d
        L70:
            if (r6 != 0) goto Lb7
            r2.append(r7)
            goto Lb7
        L76:
            java.lang.String r5 = "\\r"
            r2.append(r5)
            goto Lb7
        L7c:
            java.lang.String r5 = "\\n"
            r2.append(r5)
            goto Lb7
        L82:
            java.lang.String r5 = "\\t"
            r2.append(r5)
            goto Lb7
        L88:
            java.lang.String r6 = "\\u"
            r2.append(r6)
            int r6 = r5 >> 12
            r7 = 16
            char r6 = java.lang.Character.forDigit(r6, r7)
            r2.append(r6)
            int r6 = r5 >> 8
            r6 = r6 & 15
            char r6 = java.lang.Character.forDigit(r6, r7)
            r2.append(r6)
            int r6 = r5 >> 4
            r6 = r6 & 15
            char r6 = java.lang.Character.forDigit(r6, r7)
            r2.append(r6)
            r5 = r5 & 15
            char r5 = java.lang.Character.forDigit(r5, r7)
            r2.append(r5)
        Lb7:
            int r4 = r4 + 1
            goto L11
        Lbb:
            java.lang.String r0 = r2.toString()
            return r0
    }

    @Override // v4.a
    public final int e(v4.a r2) {
            r1 = this;
            v4.c0 r2 = (v4.c0) r2
            java.lang.String r2 = r2.f14067g
            java.lang.String r0 = r1.f14067g
            int r2 = r0.compareTo(r2)
            return r2
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof v4.c0
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            v4.c0 r2 = (v4.c0) r2
            java.lang.String r2 = r2.f14067g
            java.lang.String r0 = r1.f14067g
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // w4.d
    public final w4.c getType() {
            r1 = this;
            w4.c r0 = w4.c.G
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f14067g
            int r0 = r0.hashCode()
            return r0
    }

    @Override // v4.a
    public final boolean i() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // v4.a
    public final java.lang.String j() {
            r1 = this;
            java.lang.String r0 = "utf8"
            return r0
    }

    public final java.lang.String l() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\""
            r0.<init>(r1)
            java.lang.String r1 = r2.a()
            r0.append(r1)
            r1 = 34
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "string{\""
            r0.<init>(r1)
            java.lang.String r1 = r2.a()
            r0.append(r1)
            java.lang.String r1 = "\"}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
