package b8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c8.b {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public java.io.StringReader f504e0;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            java.io.StringReader r0 = r1.f504e0
            if (r0 == 0) goto La
            r0.close()
            r0 = 0
            r1.f504e0 = r0
        La:
            return
    }

    public final int z() {
            r19 = this;
            r0 = r19
            java.io.StringReader r1 = r0.f504e0
            r2 = 1
            if (r1 != 0) goto L8
            return r2
        L8:
            java.io.StringReader r1 = r0.f1068n
            if (r1 == 0) goto L483
            int r1 = r0.f1075u
            r3 = 3
            if (r1 != r3) goto L16
            int r1 = r0.f1064j
            int r1 = r1 - r2
            r0.f1064j = r1
        L16:
            boolean r1 = r0.A
            r4 = 0
            if (r1 == 0) goto L21
            r0.A = r4
            r0.f1075u = r3
            goto L47d
        L21:
            java.lang.String r1 = r0.E
            r5 = 0
            if (r1 == 0) goto L28
            r0.E = r5
        L28:
            int r1 = r0.l(r4)
            r0.f1075u = r1
            r6 = 998(0x3e6, float:1.398E-42)
            char[] r7 = c8.b.M
            r8 = 2
            r9 = 6
            r10 = 7
            if (r1 != r6) goto Lcd
            int r1 = r0.f1073s
            if (r1 != 0) goto L43
            int r1 = r0.f1074t
            if (r1 != 0) goto L43
            int r1 = r0.f1071q
            if (r1 == 0) goto L48
        L43:
            java.lang.String r1 = "processing instructions must not start with xml"
            r0.a(r1)
        L48:
            r0.o(r7)
            r0.i(r2, r2)
            int r1 = r0.B
            if (r1 < r2) goto L5e
            java.lang.String[] r1 = r0.D
            r1 = r1[r8]
            java.lang.String r6 = "version"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L63
        L5e:
            java.lang.String r1 = "version expected"
            r0.a(r1)
        L63:
            java.lang.String[] r1 = r0.D
            r6 = r1[r3]
            int r6 = r0.B
            if (r2 >= r6) goto L7b
            java.lang.String r6 = "encoding"
            r1 = r1[r9]
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L7b
            java.lang.String[] r1 = r0.D
            r1 = r1[r10]
            r1 = r8
            goto L7c
        L7b:
            r1 = r2
        L7c:
            int r6 = r0.B
            if (r1 >= r6) goto Lba
            java.lang.String[] r6 = r0.D
            int r11 = r1 * 4
            int r12 = r11 + 2
            r6 = r6[r12]
            java.lang.String r12 = "standalone"
            boolean r6 = r12.equals(r6)
            if (r6 == 0) goto Lba
            java.lang.String[] r6 = r0.D
            int r11 = r11 + r3
            r6 = r6[r11]
            java.lang.String r11 = "yes"
            boolean r11 = r11.equals(r6)
            if (r11 == 0) goto L9e
            goto Lb8
        L9e:
            java.lang.String r11 = "no"
            boolean r11 = r11.equals(r6)
            if (r11 == 0) goto La7
            goto Lb8
        La7:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "illegal standalone value: "
            r11.<init>(r12)
            r11.append(r6)
            java.lang.String r6 = r11.toString()
            r0.a(r6)
        Lb8:
            int r1 = r1 + 1
        Lba:
            int r6 = r0.B
            if (r1 == r6) goto Lc3
            java.lang.String r1 = "unexpected attributes in XML declaration"
            r0.a(r1)
        Lc3:
            r0.f1076v = r2
            r0.f1080z = r5
            int r1 = r0.l(r4)
            r0.f1075u = r1
        Lcd:
            r0.f1080z = r5
            r0.f1076v = r2
            r0.f1078x = r5
            r0.f1079y = r5
            r0.f1077w = r5
            r1 = -1
            r0.B = r1
        Lda:
            int r6 = r0.f1075u
            char[] r11 = c8.b.N
            java.lang.String r12 = "Unexpected token"
            r13 = 62
            r14 = 60
            switch(r6) {
                case 1: goto L47c;
                case 2: goto L475;
                case 3: goto L3f3;
                case 4: goto L389;
                case 5: goto L38d;
                case 6: goto L389;
                case 7: goto Le7;
                case 8: goto L37f;
                case 9: goto L379;
                case 10: goto Led;
                default: goto Le7;
            }
        Le7:
            af.e r1 = new af.e
            r1.<init>(r12, r0)
            throw r1
        Led:
            char[] r6 = c8.b.O
            r0.o(r6)
            r0.y()
            r0.t()
            r0.s(r2, r2)
            r0.y()
            int r6 = r0.k()
            r14 = 91
            if (r6 != r14) goto L119
            r0.m(r14)
        L109:
            r0.y()
            int r6 = r0.k()
            r14 = 93
            if (r6 != r14) goto L11d
            int r6 = r0.f1071q
            int r6 = r6 + r2
            r0.f1071q = r6
        L119:
            r5 = r1
            r4 = r3
            goto L366
        L11d:
            int r6 = r0.l(r2)
            r14 = 39
            r5 = 34
            r15 = 41
            r9 = 40
            switch(r6) {
                case 8: goto L352;
                case 9: goto L34c;
                case 10: goto L12c;
                case 11: goto L2dc;
                case 12: goto L26a;
                case 13: goto L15d;
                case 14: goto L13a;
                case 15: goto L132;
                default: goto L12c;
            }
        L12c:
            af.e r1 = new af.e
            r1.<init>(r12, r0)
            throw r1
        L132:
            af.e r1 = new af.e
            java.lang.String r2 = "Parameter entity references are not supported"
            r1.<init>(r2, r0)
            throw r1
        L13a:
            char[] r5 = c8.b.U
            r0.o(r5)
            r0.y()
            r0.t()
            boolean r5 = r0.s(r4, r4)
            if (r5 == 0) goto L155
            r0.y()
            r0.m(r13)
        L151:
            r5 = r1
            r4 = r3
            goto L35b
        L155:
            af.e r1 = new af.e
            java.lang.String r2 = "Expected external ID or public ID for notation"
            r1.<init>(r2, r0)
            throw r1
        L15d:
            char[] r6 = c8.b.S
            r0.o(r6)
            r0.y()
            java.lang.String r6 = r0.t()
        L169:
            r0.y()
            int r10 = r0.k()
            if (r10 != r13) goto L178
            int r5 = r0.f1071q
            int r5 = r5 + r2
            r0.f1071q = r5
            goto L151
        L178:
            java.lang.String r10 = r0.t()
            r0.y()
            int r1 = r0.f1071q
            int r1 = r1 + r2
            int r13 = r0.f1072r
            if (r1 < r13) goto L195
            boolean r1 = r0.c(r8)
            if (r1 == 0) goto L18d
            goto L195
        L18d:
            af.e r1 = new af.e
            java.lang.String r2 = "Malformed attribute list"
            r1.<init>(r2, r0)
            throw r1
        L195:
            char[] r1 = r0.f1070p
            int r13 = r0.f1071q
            char r8 = r1[r13]
            char[] r3 = c8.b.Y
            r18 = r4
            char r4 = r3[r18]
            if (r8 != r4) goto L1b1
            int r13 = r13 + 1
            char r1 = r1[r13]
            char r4 = r3[r2]
            if (r1 != r4) goto L1b1
            r0.o(r3)
            r0.y()
        L1b1:
            int r1 = r0.k()
            java.lang.String r3 = "Malformed attribute type"
            if (r1 != r9) goto L1e3
            int r1 = r0.f1071q
            int r1 = r1 + r2
            r0.f1071q = r1
        L1be:
            r0.y()
            r0.t()
            r0.y()
            int r1 = r0.k()
            if (r1 != r15) goto L1d3
            int r1 = r0.f1071q
            int r1 = r1 + r2
            r0.f1071q = r1
            goto L1e6
        L1d3:
            r4 = 124(0x7c, float:1.74E-43)
            if (r1 != r4) goto L1dd
            int r1 = r0.f1071q
            int r1 = r1 + r2
            r0.f1071q = r1
            goto L1be
        L1dd:
            af.e r1 = new af.e
            r1.<init>(r3, r0)
            throw r1
        L1e3:
            r0.t()
        L1e6:
            r0.y()
            int r1 = r0.k()
            r4 = 35
            if (r1 != r4) goto L225
            int r1 = r0.f1071q
            int r1 = r1 + r2
            r0.f1071q = r1
            int r1 = r0.k()
            r4 = 82
            if (r1 != r4) goto L204
            char[] r1 = c8.b.Z
            r0.o(r1)
            goto L217
        L204:
            r4 = 73
            if (r1 != r4) goto L20e
            char[] r1 = c8.b.f1057a0
            r0.o(r1)
            goto L217
        L20e:
            r4 = 70
            if (r1 != r4) goto L21f
            char[] r1 = c8.b.f1058b0
            r0.o(r1)
        L217:
            r0.y()
            int r1 = r0.k()
            goto L225
        L21f:
            af.e r1 = new af.e
            r1.<init>(r3, r0)
            throw r1
        L225:
            if (r1 == r5) goto L229
            if (r1 != r14) goto L260
        L229:
            int r3 = r0.f1071q
            int r3 = r3 + r2
            r0.f1071q = r3
            char r3 = (char) r1
            java.lang.String r3 = r0.x(r3, r2, r2, r2)
            int r4 = r0.k()
            if (r4 != r1) goto L23e
            int r1 = r0.f1071q
            int r1 = r1 + r2
            r0.f1071q = r1
        L23e:
            java.util.HashMap r1 = r0.f1063i
            if (r1 != 0) goto L249
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f1063i = r1
        L249:
            java.util.HashMap r1 = r0.f1063i
            java.lang.Object r1 = r1.get(r6)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L25d
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.HashMap r4 = r0.f1063i
            r4.put(r6, r1)
        L25d:
            r1.put(r10, r3)
        L260:
            r4 = r18
            r1 = -1
            r3 = 3
            r8 = 2
            r10 = 7
            r13 = 62
            goto L169
        L26a:
            r18 = r4
            char[] r1 = c8.b.T
            r0.o(r1)
            r0.y()
            int r1 = r0.k()
            r3 = 37
            if (r1 != r3) goto L284
            int r1 = r0.f1071q
            int r1 = r1 + r2
            r0.f1071q = r1
            r0.y()
        L284:
            r0.t()
            r0.y()
            int r1 = r0.k()
            if (r1 == r5) goto L2bb
            if (r1 != r14) goto L293
            goto L2bb
        L293:
            r3 = r18
            boolean r1 = r0.s(r2, r3)
            if (r1 == 0) goto L2b3
            r0.y()
            int r1 = r0.k()
            char[] r4 = c8.b.X
            char r5 = r4[r3]
            if (r1 != r5) goto L2b1
            r0.o(r4)
            r0.y()
            r0.t()
        L2b1:
            r4 = 3
            goto L2d1
        L2b3:
            af.e r1 = new af.e
            java.lang.String r2 = "Expected entity value or external ID"
            r1.<init>(r2, r0)
            throw r1
        L2bb:
            int r3 = r0.f1071q
            int r3 = r3 + r2
            r0.f1071q = r3
            char r3 = (char) r1
            r4 = 3
            r5 = 0
            r0.x(r3, r2, r5, r4)
            int r3 = r0.k()
            if (r3 != r1) goto L2d1
            int r1 = r0.f1071q
            int r1 = r1 + r2
            r0.f1071q = r1
        L2d1:
            r0.y()
            r1 = 62
            r0.m(r1)
            r5 = -1
            goto L35b
        L2dc:
            r4 = r3
            char[] r1 = c8.b.R
            r0.o(r1)
            r0.y()
            r0.t()
            r0.y()
            int r1 = r0.k()
            if (r1 != r9) goto L325
            r3 = 0
        L2f2:
            if (r1 != r9) goto L2f8
            int r3 = r3 + 1
        L2f6:
            r5 = -1
            goto L300
        L2f8:
            if (r1 != r15) goto L2fd
            int r3 = r3 + (-1)
            goto L2f6
        L2fd:
            r5 = -1
            if (r1 == r5) goto L31d
        L300:
            int r1 = r0.f1071q
            int r1 = r1 + r2
            r0.f1071q = r1
            int r1 = r0.k()
            if (r3 > 0) goto L2f2
            r3 = 42
            if (r1 == r3) goto L317
            r3 = 63
            if (r1 == r3) goto L317
            r3 = 43
            if (r1 != r3) goto L33b
        L317:
            int r1 = r0.f1071q
            int r1 = r1 + r2
            r0.f1071q = r1
            goto L33b
        L31d:
            af.e r1 = new af.e
            java.lang.String r2 = "Unterminated element content spec"
            r1.<init>(r2, r0)
            throw r1
        L325:
            r5 = -1
            char[] r3 = c8.b.V
            r18 = 0
            char r6 = r3[r18]
            if (r1 != r6) goto L332
            r0.o(r3)
            goto L33b
        L332:
            char[] r3 = c8.b.W
            char r6 = r3[r18]
            if (r1 != r6) goto L344
            r0.o(r3)
        L33b:
            r0.y()
            r1 = 62
            r0.m(r1)
            goto L35b
        L344:
            af.e r1 = new af.e
            java.lang.String r2 = "Expected element content spec"
            r1.<init>(r2, r0)
            throw r1
        L34c:
            r5 = r1
            r4 = r3
            r0.q()
            goto L35b
        L352:
            r5 = r1
            r4 = r3
            r0.o(r7)
            r3 = 0
            r0.w(r11, r3)
        L35b:
            r3 = r4
            r1 = r5
            r4 = 0
            r5 = 0
            r8 = 2
            r9 = 6
            r10 = 7
            r13 = 62
            goto L109
        L366:
            r0.y()
            r1 = 62
            r0.m(r1)
            boolean r1 = r0.C
            if (r1 != 0) goto L373
            goto L3ae
        L373:
            af.e r1 = new af.e
            r1.<init>(r12, r0)
            throw r1
        L379:
            r5 = r1
            r4 = r3
            r0.q()
            goto L3ae
        L37f:
            r5 = r1
            r4 = r3
            r0.o(r7)
            r3 = 0
            r0.w(r11, r3)
            goto L3ae
        L389:
            r5 = r1
            r4 = r3
            r1 = r8
            goto L39d
        L38d:
            r5 = r1
            r4 = r3
            char[] r1 = c8.b.K
            r0.o(r1)
            char[] r1 = c8.b.L
            java.lang.String r1 = r0.w(r1, r2)
            r0.f1080z = r1
            goto L3ae
        L39d:
            java.lang.String r3 = r0.x(r14, r2, r2, r1)
            r0.f1080z = r3
            int r1 = r0.f1064j
            if (r1 != 0) goto L3ae
            boolean r1 = r0.f1076v
            if (r1 == 0) goto L3ae
            r1 = 7
            r0.f1075u = r1
        L3ae:
            int r1 = r0.f1064j
            if (r1 != 0) goto L3c4
            int r1 = r0.f1075u
            r3 = 6
            if (r1 == r3) goto L3be
            r6 = 4
            if (r1 == r6) goto L3be
            r6 = 5
            if (r1 == r6) goto L3be
            goto L3c5
        L3be:
            af.e r1 = new af.e
            r1.<init>(r12, r0)
            throw r1
        L3c4:
            r3 = 6
        L3c5:
            int r1 = r0.f1075u
            r6 = 7
            if (r1 != r6) goto L3cf
            r1 = 0
            r0.f1080z = r1
        L3cd:
            r8 = 0
            goto L3d1
        L3cf:
            r1 = 0
            goto L3cd
        L3d1:
            int r9 = r0.l(r8)
            java.lang.String r8 = r0.f1080z
            if (r8 == 0) goto L3e7
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L3e7
            r8 = 4
            if (r9 >= r8) goto L3e7
            r0.f1075u = r8
            r3 = 4
            goto L47d
        L3e7:
            r0.f1075u = r9
            r8 = r5
            r5 = r1
            r1 = r8
            r9 = r3
            r3 = r4
            r10 = r6
            r4 = 0
            r8 = 2
            goto Lda
        L3f3:
            r0.m(r14)
            r1 = 47
            r0.m(r1)
            java.lang.String r1 = r0.t()
            r0.f1079y = r1
            r0.y()
            r1 = 62
            r0.m(r1)
            int r1 = r0.f1064j
            int r3 = r1 + (-1)
            r16 = 4
            int r3 = r3 * 4
            java.lang.String r4 = r0.f1079y
            if (r1 != 0) goto L430
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "read end tag "
            r1.<init>(r3)
            r1.append(r4)
            java.lang.String r3 = " with no tags open"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.a(r1)
            r1 = 9
            r0.f1075u = r1
            goto L450
        L430:
            java.lang.String[] r1 = r0.f1065k
            int r5 = r3 + 3
            r1 = r1[r5]
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L453
            java.lang.String[] r1 = r0.f1065k
            r4 = r1[r3]
            r0.f1077w = r4
            int r4 = r3 + 1
            r4 = r1[r4]
            r0.f1078x = r4
            r17 = 2
            int r3 = r3 + 2
            r1 = r1[r3]
            r0.f1079y = r1
        L450:
            int r3 = r0.f1075u
            goto L47d
        L453:
            af.e r1 = new af.e
            java.lang.String[] r2 = r0.f1065k
            r2 = r2[r5]
            java.lang.String r3 = r0.f1079y
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "expected: /"
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = " read: "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2, r0)
            throw r1
        L475:
            r3 = r4
            r0.i(r3, r2)
            int r3 = r0.f1075u
            goto L47d
        L47c:
            r3 = r6
        L47d:
            if (r3 != r2) goto L482
            r0.close()
        L482:
            return r3
        L483:
            af.e r1 = new af.e
            java.lang.String r2 = "setInput() must be called first."
            r1.<init>(r2, r0)
            throw r1
    }
}
