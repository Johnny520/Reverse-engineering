package xhss;

/* JADX INFO: renamed from: xhss.ᲇᲈᲀᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1109 {
    static {
            xhss.ᛳᛶᲈᲈ r0 = new xhss.ᛳᛶᲈᲈ
            java.nio.charset.Charset r1 = xhss.AbstractC0619.f2136
            java.lang.String r2 = "\"\\"
            byte[] r1 = r2.getBytes(r1)
            r0.<init>(r1)
            r0.f1120 = r2
            xhss.ᛳᛶᲈᲈ r0 = new xhss.ᛳᛶᲈᲈ
            java.nio.charset.Charset r1 = xhss.AbstractC0619.f2136
            java.lang.String r2 = "\t ,="
            byte[] r1 = r2.getBytes(r1)
            r0.<init>(r1)
            r0.f1120 = r2
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final void m1805(xhss.C0263 r36, xhss.C0669 r37, xhss.C0972 r38) {
            r0 = r38
            xhss.ᛳᛴᲀᲁ r1 = xhss.C0263.f980
            r2 = r36
            if (r2 != r1) goto L9
            return
        L9:
            java.util.regex.Pattern r1 = xhss.C0595.f2059
            int r1 = r0.size()
            r2 = 0
            r4 = r2
            r5 = 0
        L12:
            if (r4 >= r1) goto L32
            java.lang.String r6 = xhss.AbstractC0694.m1204(r0, r4)
            java.lang.String r7 = "Set-Cookie"
            boolean r6 = r7.equalsIgnoreCase(r6)
            if (r6 == 0) goto L2f
            if (r5 != 0) goto L28
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 2
            r5.<init>(r6)
        L28:
            java.lang.String r6 = xhss.AbstractC0694.m1219(r0, r4)
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
            xhss.ᛵᛷᛶᛱ r1 = xhss.C0492.f1802
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
            if (r6 >= r5) goto L24f
            java.lang.Object r0 = r4.get(r6)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            long r9 = java.lang.System.currentTimeMillis()
            byte[] r0 = xhss.AbstractC0577.f2010
            int r0 = r8.length()
            r11 = 59
            int r0 = xhss.AbstractC0577.m1039(r8, r11, r2, r0)
            r12 = 61
            int r13 = xhss.AbstractC0577.m1039(r8, r12, r2, r0)
            if (r13 != r0) goto L69
            goto L98
        L69:
            int r14 = xhss.AbstractC0577.m1048(r8, r2, r13)
            int r15 = xhss.AbstractC0577.m1046(r8, r14, r13)
            java.lang.String r17 = r8.substring(r14, r15)
            int r14 = r17.length()
            if (r14 != 0) goto L7c
            goto L98
        L7c:
            int r14 = xhss.AbstractC0577.m1040(r17)
            r15 = -1
            if (r14 == r15) goto L84
            goto L98
        L84:
            int r13 = r13 + 1
            int r13 = xhss.AbstractC0577.m1048(r8, r13, r0)
            int r14 = xhss.AbstractC0577.m1046(r8, r13, r0)
            java.lang.String r18 = r8.substring(r13, r14)
            int r13 = xhss.AbstractC0577.m1040(r18)
            if (r13 == r15) goto L9d
        L98:
            r8 = r37
            r3 = 0
            goto L23d
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
            int r15 = xhss.AbstractC0577.m1039(r8, r11, r0, r13)
            int r11 = xhss.AbstractC0577.m1039(r8, r12, r0, r15)
            int r0 = xhss.AbstractC0577.m1048(r8, r0, r11)
            int r12 = xhss.AbstractC0577.m1046(r8, r0, r11)
            java.lang.String r0 = r8.substring(r0, r12)
            if (r11 >= r15) goto Lea
            int r11 = r11 + 1
            int r11 = xhss.AbstractC0577.m1048(r8, r11, r15)
            int r12 = xhss.AbstractC0577.m1046(r8, r11, r15)
            java.lang.String r11 = r8.substring(r11, r12)
            goto Lec
        Lea:
            java.lang.String r11 = ""
        Lec:
            java.lang.String r12 = "expires"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L100
            int r0 = r11.length()     // Catch: java.lang.Throwable -> L18d
            long r28 = xhss.C0915.m1499(r11, r0)     // Catch: java.lang.Throwable -> L18d
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
            boolean r0 = xhss.AbstractC0226.m492(r11, r0, r2)
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
            boolean r12 = r11.endsWith(r0)     // Catch: java.lang.Throwable -> L18d
            if (r12 != 0) goto L15b
            java.lang.String r0 = xhss.AbstractC0120.m349(r11, r0)     // Catch: java.lang.Throwable -> L18d
            java.lang.String r0 = xhss.AbstractC0898.m1458(r0)     // Catch: java.lang.Throwable -> L18d
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
            java.lang.String r0 = r8.f2288
            if (r3 != 0) goto L1ce
            r3 = r0
            goto L1fe
        L1ce:
            boolean r9 = xhss.AbstractC0007.m97(r0, r3)
            if (r9 == 0) goto L1d5
            goto L1fe
        L1d5:
            boolean r9 = r0.endsWith(r3)
            if (r9 == 0) goto L210
            int r9 = r0.length()
            int r10 = r3.length()
            int r9 = r9 - r10
            int r9 = r9 + (-1)
            char r9 = r0.charAt(r9)
            r10 = 46
            if (r9 != r10) goto L210
            xhss.ᛲᛳᛴᲁ r9 = xhss.AbstractC0898.f2925
            java.lang.Object r9 = r9.f617
            java.util.regex.Pattern r9 = (java.util.regex.Pattern) r9
            java.util.regex.Matcher r9 = r9.matcher(r0)
            boolean r9 = r9.matches()
            if (r9 != 0) goto L210
        L1fe:
            int r0 = r0.length()
            int r9 = r3.length()
            if (r0 == r9) goto L213
            xhss.ᲇᛷᛷᲀ r0 = xhss.C1057.f3419
            java.lang.String r0 = r0.m1719(r3)
            if (r0 != 0) goto L213
        L210:
            r16 = 0
            goto L23b
        L213:
            java.lang.String r0 = "/"
            if (r14 == 0) goto L221
            boolean r9 = xhss.AbstractC0226.m492(r14, r0, r2)
            if (r9 != 0) goto L21e
            goto L221
        L21e:
            r22 = r14
            goto L234
        L221:
            java.lang.String r9 = r8.m1154()
            r10 = 47
            r11 = 6
            int r10 = xhss.AbstractC0120.m355(r9, r10, r2, r11)
            if (r10 == 0) goto L232
            java.lang.String r0 = r9.substring(r2, r10)
        L232:
            r14 = r0
            goto L21e
        L234:
            xhss.ᛶᲁᛸᲇ r16 = new xhss.ᛶᲁᛸᲇ
            r21 = r3
            r16.<init>(r17, r18, r19, r21, r22, r23, r24, r25, r26, r27)
        L23b:
            r3 = r16
        L23d:
            if (r3 != 0) goto L240
            goto L24b
        L240:
            if (r7 != 0) goto L248
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7 = r0
        L248:
            r7.add(r3)
        L24b:
            int r6 = r6 + 1
            goto L47
        L24f:
            if (r7 == 0) goto L256
            java.util.List r3 = java.util.Collections.unmodifiableList(r7)
            goto L257
        L256:
            r3 = 0
        L257:
            if (r3 != 0) goto L25a
            goto L25b
        L25a:
            r1 = r3
        L25b:
            r1.isEmpty()
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final boolean m1806(xhss.C0871 r4) {
            xhss.ᛴᛴᛴᛵ r0 = r4.f2809
            java.lang.Object r0 = r0.f1314
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "HEAD"
            boolean r0 = xhss.AbstractC0007.m97(r0, r1)
            if (r0 == 0) goto Lf
            goto L40
        Lf:
            int r0 = r4.f2813
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
            long r0 = xhss.AbstractC0559.m988(r4)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L42
            xhss.ᲁᛸᛱᛵ r4 = r4.f2820
            java.lang.String r0 = "Transfer-Encoding"
            java.lang.String r4 = r4.m1605(r0)
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
}
