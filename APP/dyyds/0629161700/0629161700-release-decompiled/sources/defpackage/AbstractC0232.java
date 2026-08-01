package defpackage;

/* JADX INFO: renamed from: ᛲᛱᛴᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0232 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C1128 f1403 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C1128 f1404 = null;

    static {
            ᛶᛸᛸᛶ r0 = new ᛶᛸᛸᛶ
            java.nio.charset.Charset r1 = defpackage.AbstractC1422.f6221
            java.lang.String r2 = "\"\\"
            byte[] r1 = r2.getBytes(r1)
            r0.<init>(r1)
            r0.f5018 = r2
            defpackage.AbstractC0232.f1403 = r0
            ᛶᛸᛸᛶ r0 = new ᛶᛸᛸᛶ
            java.nio.charset.Charset r1 = defpackage.AbstractC1422.f6221
            java.lang.String r2 = "\t ,="
            byte[] r1 = r2.getBytes(r1)
            r0.<init>(r1)
            r0.f5018 = r2
            defpackage.AbstractC0232.f1404 = r0
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final boolean m838(defpackage.C1569 r3) {
            r0 = 0
        L1:
            boolean r1 = r3.m2848()
            if (r1 != 0) goto L22
            r1 = 0
            byte r1 = r3.m2857(r1)
            r2 = 44
            if (r1 != r2) goto L16
            r3.m2831()
            r0 = 1
            goto L1
        L16:
            r2 = 32
            if (r1 == r2) goto L1e
            r2 = 9
            if (r1 != r2) goto L22
        L1e:
            r3.m2831()
            goto L1
        L22:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final void m839(defpackage.C1500 r36, defpackage.C0520 r37, defpackage.C0024 r38) {
            r0 = r38
            ᛸᛶᛱᛵ r1 = defpackage.C1500.f6606
            r2 = r36
            if (r2 != r1) goto L9
            return
        L9:
            java.util.regex.Pattern r1 = defpackage.C0837.f3845
            int r1 = r0.size()
            r2 = 0
            r4 = r2
            r5 = 0
        L12:
            if (r4 >= r1) goto L32
            java.lang.String r6 = defpackage.AbstractC0729.m1649(r0, r4)
            java.lang.String r7 = "Set-Cookie"
            boolean r6 = r7.equalsIgnoreCase(r6)
            if (r6 == 0) goto L2f
            if (r5 != 0) goto L28
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 2
            r5.<init>(r6)
        L28:
            java.lang.String r6 = defpackage.AbstractC0729.m1635(r0, r4)
            r5.add(r6)
        L2f:
            int r4 = r4 + 1
            goto L12
        L32:
            if (r5 == 0) goto L39
            java.util.List r0 = java.util.Collections.unmodifiableList(r5)
            goto L3a
        L39:
            r0 = 0
        L3a:
            ᲀᛶᲇ r1 = defpackage.C1698.f7558
            if (r0 != 0) goto L40
            r4 = r1
            goto L41
        L40:
            r4 = r0
        L41:
            int r5 = r4.size()
            r6 = r2
            r7 = 0
        L47:
            if (r6 >= r5) goto L24d
            java.lang.Object r0 = r4.get(r6)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            long r9 = java.lang.System.currentTimeMillis()
            byte[] r0 = defpackage.AbstractC0709.f3358
            int r0 = r8.length()
            r11 = 59
            int r0 = defpackage.AbstractC0709.m1606(r8, r11, r2, r0)
            r12 = 61
            int r13 = defpackage.AbstractC0709.m1606(r8, r12, r2, r0)
            if (r13 != r0) goto L69
            goto L98
        L69:
            int r14 = defpackage.AbstractC0709.m1613(r8, r2, r13)
            int r15 = defpackage.AbstractC0709.m1600(r8, r14, r13)
            java.lang.String r17 = r8.substring(r14, r15)
            int r14 = r17.length()
            if (r14 != 0) goto L7c
            goto L98
        L7c:
            int r14 = defpackage.AbstractC0709.m1612(r17)
            r15 = -1
            if (r14 == r15) goto L84
            goto L98
        L84:
            int r13 = r13 + 1
            int r13 = defpackage.AbstractC0709.m1613(r8, r13, r0)
            int r14 = defpackage.AbstractC0709.m1600(r8, r13, r0)
            java.lang.String r18 = r8.substring(r13, r14)
            int r13 = defpackage.AbstractC0709.m1612(r18)
            if (r13 == r15) goto L9d
        L98:
            r8 = r37
            r3 = 0
            goto L23b
        L9d:
            int r0 = r0 + 1
            int r13 = r8.length()
            r19 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r23 = r2
            r24 = r23
            r25 = r24
            r28 = r19
            r38 = 1
            r3 = 0
            r14 = 0
            r21 = -1
            r26 = 1
            r27 = 0
        Lba:
            r30 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r32 = -9223372036854775808
            if (r0 >= r13) goto L195
            r34 = -1
            int r15 = defpackage.AbstractC0709.m1606(r8, r11, r0, r13)
            int r11 = defpackage.AbstractC0709.m1606(r8, r12, r0, r15)
            int r0 = defpackage.AbstractC0709.m1613(r8, r0, r11)
            int r12 = defpackage.AbstractC0709.m1600(r8, r0, r11)
            java.lang.String r0 = r8.substring(r0, r12)
            if (r11 >= r15) goto Lea
            int r11 = r11 + 1
            int r11 = defpackage.AbstractC0709.m1613(r8, r11, r15)
            int r12 = defpackage.AbstractC0709.m1600(r8, r11, r15)
            java.lang.String r11 = r8.substring(r11, r12)
            goto Lec
        Lea:
            java.lang.String r11 = ""
        Lec:
            java.lang.String r12 = "expires"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L100
            int r0 = r11.length()     // Catch: java.lang.Throwable -> L18d
            long r28 = defpackage.AbstractC1754.m3140(r0, r11)     // Catch: java.lang.Throwable -> L18d
        Lfc:
            r25 = r38
            goto L18d
        L100:
            java.lang.String r12 = "max-age"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L137
            long r11 = java.lang.Long.parseLong(r11)     // Catch: java.lang.NumberFormatException -> L118
            r21 = 0
            int r0 = (r11 > r21 ? 1 : (r11 == r21 ? 0 : -1))
            if (r0 > 0) goto L115
            r21 = r32
            goto Lfc
        L115:
            r21 = r11
            goto Lfc
        L118:
            r0 = move-exception
            java.lang.String r12 = "-?\\d+"
            java.util.regex.Pattern r12 = java.util.regex.Pattern.compile(r12)
            java.util.regex.Matcher r12 = r12.matcher(r11)
            boolean r12 = r12.matches()
            if (r12 == 0) goto L136
            java.lang.String r0 = "-"
            boolean r0 = r11.startsWith(r0)
            if (r0 == 0) goto L133
            r30 = r32
        L133:
            r21 = r30
            goto Lfc
        L136:
            throw r0
        L137:
            java.lang.String r12 = "domain"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L163
            java.lang.String r0 = "."
            boolean r12 = defpackage.AbstractC0651.m1483(r11, r0, r2)     // Catch: java.lang.Throwable -> L18d
            if (r12 != 0) goto L15b
            java.lang.String r0 = defpackage.AbstractC1347.m2513(r11, r0)     // Catch: java.lang.Throwable -> L18d
            java.lang.String r0 = defpackage.AbstractC0673.m1519(r0)     // Catch: java.lang.Throwable -> L18d
            if (r0 == 0) goto L155
            r3 = r0
            r26 = r2
            goto L18d
        L155:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L18d
            r0.<init>()     // Catch: java.lang.Throwable -> L18d
            throw r0     // Catch: java.lang.Throwable -> L18d
        L15b:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L18d
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L18d
            throw r11     // Catch: java.lang.Throwable -> L18d
        L163:
            java.lang.String r12 = "path"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L16d
            r14 = r11
            goto L18d
        L16d:
            java.lang.String r12 = "secure"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L178
            r23 = r38
            goto L18d
        L178:
            java.lang.String r12 = "httponly"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L183
            r24 = r38
            goto L18d
        L183:
            java.lang.String r12 = "samesite"
            boolean r0 = r0.equalsIgnoreCase(r12)
            if (r0 == 0) goto L18d
            r27 = r11
        L18d:
            int r0 = r15 + 1
            r11 = 59
            r12 = 61
            goto Lba
        L195:
            r34 = -1
            int r0 = (r21 > r32 ? 1 : (r21 == r32 ? 0 : -1))
            if (r0 != 0) goto L1a0
            r8 = r37
            r19 = r32
            goto L1c8
        L1a0:
            int r0 = (r21 > r34 ? 1 : (r21 == r34 ? 0 : -1))
            if (r0 == 0) goto L1c4
            r11 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r21 > r11 ? 1 : (r21 == r11 ? 0 : -1))
            if (r0 > 0) goto L1b1
            r11 = 1000(0x3e8, double:4.94E-321)
            long r30 = r21 * r11
        L1b1:
            long r30 = r9 + r30
            int r0 = (r30 > r9 ? 1 : (r30 == r9 ? 0 : -1))
            if (r0 < 0) goto L1c1
            int r0 = (r30 > r19 ? 1 : (r30 == r19 ? 0 : -1))
            if (r0 <= 0) goto L1bc
            goto L1c1
        L1bc:
            r8 = r37
            r19 = r30
            goto L1c8
        L1c1:
            r8 = r37
            goto L1c8
        L1c4:
            r8 = r37
            r19 = r28
        L1c8:
            java.lang.String r0 = r8.f2563
            if (r3 != 0) goto L1ce
            r3 = r0
            goto L1fc
        L1ce:
            boolean r9 = defpackage.AbstractC0498.m1280(r0, r3)
            if (r9 == 0) goto L1d5
            goto L1fc
        L1d5:
            boolean r9 = defpackage.AbstractC0651.m1483(r0, r3, r2)
            if (r9 == 0) goto L20e
            int r9 = r0.length()
            int r10 = r3.length()
            int r9 = r9 - r10
            int r9 = r9 + (-1)
            char r9 = r0.charAt(r9)
            r10 = 46
            if (r9 != r10) goto L20e
            ᲁᲀᲈᛵ r9 = defpackage.AbstractC0673.f3257
            java.util.regex.Pattern r9 = r9.f8356
            java.util.regex.Matcher r9 = r9.matcher(r0)
            boolean r9 = r9.matches()
            if (r9 != 0) goto L20e
        L1fc:
            int r0 = r0.length()
            int r9 = r3.length()
            if (r0 == r9) goto L211
            ᛸᲈᛴᛴ r0 = defpackage.C1601.f7085
            java.lang.String r0 = r0.m2892(r3)
            if (r0 != 0) goto L211
        L20e:
            r16 = 0
            goto L239
        L211:
            java.lang.String r0 = "/"
            if (r14 == 0) goto L21f
            boolean r9 = r14.startsWith(r0)
            if (r9 != 0) goto L21c
            goto L21f
        L21c:
            r22 = r14
            goto L232
        L21f:
            java.lang.String r9 = r8.m1309()
            r10 = 47
            r11 = 6
            int r10 = defpackage.AbstractC1347.m2518(r9, r10, r2, r11)
            if (r10 == 0) goto L230
            java.lang.String r0 = r9.substring(r2, r10)
        L230:
            r14 = r0
            goto L21c
        L232:
            ᛵᛲᛸᛸ r16 = new ᛵᛲᛸᛸ
            r21 = r3
            r16.<init>(r17, r18, r19, r21, r22, r23, r24, r25, r26, r27)
        L239:
            r3 = r16
        L23b:
            if (r3 != 0) goto L23e
            goto L249
        L23e:
            if (r7 != 0) goto L246
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7 = r0
        L246:
            r7.add(r3)
        L249:
            int r6 = r6 + 1
            goto L47
        L24d:
            if (r7 == 0) goto L254
            java.util.List r3 = java.util.Collections.unmodifiableList(r7)
            goto L255
        L254:
            r3 = 0
        L255:
            if (r3 != 0) goto L258
            goto L259
        L258:
            r1 = r3
        L259:
            r1.isEmpty()
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final java.lang.String m840(defpackage.C1569 r4) {
            ᛶᛸᛸᛶ r0 = defpackage.AbstractC0232.f1404
            long r0 = r4.m2834(r0)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto Le
            long r0 = r4.f6928
        Le:
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L1b
            java.nio.charset.Charset r2 = defpackage.AbstractC1422.f6221
            java.lang.String r4 = r4.m2842(r0, r2)
            return r4
        L1b:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final boolean m841(defpackage.C0569 r4) {
            ᛳᛵᛴᛴ r0 = r4.f2828
            java.lang.Object r0 = r0.f2400
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "HEAD"
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 == 0) goto Lf
            goto L40
        Lf:
            int r0 = r4.f2833
            r1 = 100
            if (r0 < r1) goto L19
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 < r1) goto L22
        L19:
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L22
            r1 = 304(0x130, float:4.26E-43)
            if (r0 == r1) goto L22
            goto L42
        L22:
            long r0 = defpackage.AbstractC0508.m1292(r4)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L42
            ᛱᛱᛷᛳ r4 = r4.f2820
            java.lang.String r0 = "Transfer-Encoding"
            java.lang.String r4 = r4.m324(r0)
            if (r4 != 0) goto L37
            r4 = 0
        L37:
            java.lang.String r0 = "chunked"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 == 0) goto L40
            goto L42
        L40:
            r4 = 0
            return r4
        L42:
            r4 = 1
            return r4
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final void m842(defpackage.C1569 r17, java.util.ArrayList r18) {
            r0 = r17
            r1 = r18
            r2 = 0
        L5:
            r3 = r2
        L6:
            if (r3 != 0) goto L13
            m838(r0)
            java.lang.String r3 = m840(r0)
            if (r3 != 0) goto L13
            goto Lfc
        L13:
            boolean r4 = m838(r0)
            java.lang.String r5 = m840(r0)
            if (r5 != 0) goto L30
            boolean r0 = r0.m2848()
            if (r0 != 0) goto L25
            goto Lfc
        L25:
            ᲇᛵᛳᛵ r0 = new ᲇᛵᛳᛵ
            ᲇᛴᛳᲇ r2 = defpackage.C2033.f8764
            r0.<init>(r3, r2)
            r1.add(r0)
            return
        L30:
            int r6 = defpackage.AbstractC0709.m1605(r0)
            boolean r7 = m838(r0)
            if (r4 != 0) goto L61
            if (r7 != 0) goto L42
            boolean r4 = r0.m2848()
            if (r4 == 0) goto L61
        L42:
            ᲇᛵᛳᛵ r4 = new ᲇᛵᛳᛵ
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r5)
            java.lang.String r5 = "="
            java.lang.String r5 = defpackage.AbstractC0651.m1484(r6, r5)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            java.util.Map r5 = java.util.Collections.singletonMap(r2, r5)
            r4.<init>(r3, r5)
            r1.add(r4)
            goto L5
        L61:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            int r7 = defpackage.AbstractC0709.m1605(r0)
            int r7 = r7 + r6
        L6b:
            if (r5 != 0) goto L7c
            java.lang.String r5 = m840(r0)
            boolean r6 = m838(r0)
            if (r6 != 0) goto L100
            int r6 = defpackage.AbstractC0709.m1605(r0)
            r7 = r6
        L7c:
            if (r7 == 0) goto L100
            r6 = 1
            if (r7 <= r6) goto L83
            goto Lfc
        L83:
            boolean r6 = m838(r0)
            if (r6 == 0) goto L8b
            goto Lfc
        L8b:
            boolean r6 = r0.m2848()
            if (r6 != 0) goto Le0
            r8 = 0
            byte r6 = r0.m2857(r8)
            r8 = 34
            if (r6 != r8) goto Le0
            byte r6 = r0.m2831()
            if (r6 != r8) goto Lda
            ᛸᲁᛵ r6 = new ᛸᲁᛵ
            r6.<init>()
        La6:
            ᛶᛸᛸᛶ r9 = defpackage.AbstractC0232.f1403
            long r9 = r0.m2834(r9)
            r11 = -1
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 != 0) goto Lb4
        Lb2:
            r6 = r2
            goto Le4
        Lb4:
            byte r11 = r0.m2857(r9)
            if (r11 != r8) goto Lc5
            r6.mo484(r9, r0)
            r0.m2831()
            java.lang.String r6 = r6.m2856()
            goto Le4
        Lc5:
            long r11 = r0.f6928
            r13 = 1
            long r15 = r9 + r13
            int r11 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r11 != 0) goto Ld0
            goto Lb2
        Ld0:
            r6.mo484(r9, r0)
            r0.m2831()
            r6.mo484(r13, r0)
            goto La6
        Lda:
            java.lang.String r0 = "Failed requirement."
            defpackage.C2264.m3684(r0)
            return
        Le0:
            java.lang.String r6 = m840(r0)
        Le4:
            if (r6 != 0) goto Le7
            goto Lfc
        Le7:
            java.lang.Object r5 = r4.put(r5, r6)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto Lf0
            goto Lfc
        Lf0:
            boolean r5 = m838(r0)
            if (r5 != 0) goto Lfd
            boolean r5 = r0.m2848()
            if (r5 != 0) goto Lfd
        Lfc:
            return
        Lfd:
            r5 = r2
            goto L6b
        L100:
            ᲇᛵᛳᛵ r6 = new ᲇᛵᛳᛵ
            r6.<init>(r3, r4)
            r1.add(r6)
            r3 = r5
            goto L6
    }
}
