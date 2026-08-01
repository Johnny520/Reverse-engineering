package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class mg0 {
    static {
            dd r0 = p000.C0208dd.f3085
            java.lang.String r0 = "\"\\"
            p000.C0381i2.m2592(r0)
            java.lang.String r0 = "\t ,="
            p000.C0381i2.m2592(r0)
            return
    }

    /* JADX INFO: renamed from: α */
    public static final boolean m3822(p000.zn1 r4) {
            i5 r0 = r4.f13197
            java.lang.Object r0 = r0.f4915
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "HEAD"
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto Lf
            goto L40
        Lf:
            int r0 = r4.f13200
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
            long r0 = p000.ud2.m5847(r4)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L42
            vc0 r4 = r4.f13202
            java.lang.String r0 = "Transfer-Encoding"
            java.lang.String r4 = r4.m6168(r0)
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

    /* JADX INFO: renamed from: β */
    public static final void m3823(p000.C0966x r36, p000.og0 r37, p000.vc0 r38) {
            r0 = r38
            r36.getClass()
            r37.getClass()
            r0.getClass()
            x r1 = p000.C0966x.f11917
            r2 = r36
            if (r2 != r1) goto L12
            return
        L12:
            java.util.regex.Pattern r1 = p000.C0732qp.f9060
            int r1 = r0.size()
            r2 = 0
            r4 = r2
            r5 = 0
        L1b:
            if (r4 >= r1) goto L3b
            java.lang.String r6 = r0.m6169(r4)
            java.lang.String r7 = "Set-Cookie"
            boolean r6 = r7.equalsIgnoreCase(r6)
            if (r6 == 0) goto L38
            if (r5 != 0) goto L31
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 2
            r5.<init>(r6)
        L31:
            java.lang.String r6 = r0.m6171(r4)
            r5.add(r6)
        L38:
            int r4 = r4 + 1
            goto L1b
        L3b:
            if (r5 == 0) goto L45
            java.util.List r0 = java.util.Collections.unmodifiableList(r5)
            r0.getClass()
            goto L46
        L45:
            r0 = 0
        L46:
            jz r1 = p000.C0450jz.f5672
            if (r0 != 0) goto L4c
            r4 = r1
            goto L4d
        L4c:
            r4 = r0
        L4d:
            int r5 = r4.size()
            r6 = r2
            r7 = 0
        L53:
            if (r6 >= r5) goto L259
            java.lang.Object r0 = r4.get(r6)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            r8.getClass()
            long r9 = java.lang.System.currentTimeMillis()
            byte[] r0 = p000.sd2.f9867
            int r0 = r8.length()
            r11 = 59
            int r0 = p000.sd2.m5474(r8, r11, r2, r0)
            r12 = 61
            int r13 = p000.sd2.m5474(r8, r12, r2, r0)
            if (r13 != r0) goto L78
            goto La7
        L78:
            int r14 = p000.sd2.m5477(r2, r13, r8)
            int r15 = p000.sd2.m5478(r14, r13, r8)
            java.lang.String r17 = r8.substring(r14, r15)
            int r14 = r17.length()
            if (r14 != 0) goto L8b
            goto La7
        L8b:
            int r14 = p000.sd2.m5476(r17)
            r15 = -1
            if (r14 == r15) goto L93
            goto La7
        L93:
            int r13 = r13 + 1
            int r13 = p000.sd2.m5477(r13, r0, r8)
            int r14 = p000.sd2.m5478(r13, r0, r8)
            java.lang.String r18 = r8.substring(r13, r14)
            int r13 = p000.sd2.m5476(r18)
            if (r13 == r15) goto Lac
        La7:
            r8 = r37
            r3 = 0
            goto L248
        Lac:
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
        Lc9:
            r30 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r32 = -9223372036854775808
            if (r0 >= r13) goto L1a7
            r34 = -1
            int r15 = p000.sd2.m5474(r8, r11, r0, r13)
            int r11 = p000.sd2.m5474(r8, r12, r0, r15)
            int r0 = p000.sd2.m5477(r0, r11, r8)
            int r12 = p000.sd2.m5478(r0, r11, r8)
            java.lang.String r0 = r8.substring(r0, r12)
            if (r11 >= r15) goto Lf9
            int r11 = r11 + 1
            int r11 = p000.sd2.m5477(r11, r15, r8)
            int r12 = p000.sd2.m5478(r11, r15, r8)
            java.lang.String r11 = r8.substring(r11, r12)
            goto Lfb
        Lf9:
            java.lang.String r11 = ""
        Lfb:
            java.lang.String r12 = "expires"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L10f
            int r0 = r11.length()     // Catch: java.lang.Throwable -> L19f
            long r28 = p000.jx0.m3029(r11, r0)     // Catch: java.lang.Throwable -> L19f
        L10b:
            r25 = r38
            goto L19f
        L10f:
            java.lang.String r12 = "max-age"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L149
            long r11 = java.lang.Long.parseLong(r11)     // Catch: java.lang.NumberFormatException -> L127
            r21 = 0
            int r0 = (r11 > r21 ? 1 : (r11 == r21 ? 0 : -1))
            if (r0 > 0) goto L124
            r21 = r32
            goto L10b
        L124:
            r21 = r11
            goto L10b
        L127:
            r0 = move-exception
            java.lang.String r12 = "-?\\d+"
            java.util.regex.Pattern r12 = java.util.regex.Pattern.compile(r12)
            r12.getClass()
            java.util.regex.Matcher r12 = r12.matcher(r11)
            boolean r12 = r12.matches()
            if (r12 == 0) goto L148
            java.lang.String r0 = "-"
            boolean r0 = p000.x02.m6485(r11, r0, r2)
            if (r0 == 0) goto L145
            r30 = r32
        L145:
            r21 = r30
            goto L10b
        L148:
            throw r0
        L149:
            java.lang.String r12 = "domain"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L175
            java.lang.String r0 = "."
            boolean r12 = p000.x02.m6479(r11, r0, r2)     // Catch: java.lang.Throwable -> L19f
            if (r12 != 0) goto L16d
            java.lang.String r0 = p000.q02.m4678(r11, r0)     // Catch: java.lang.Throwable -> L19f
            java.lang.String r0 = p000.qd2.m4868(r0)     // Catch: java.lang.Throwable -> L19f
            if (r0 == 0) goto L167
            r3 = r0
            r26 = r2
            goto L19f
        L167:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L19f
            r0.<init>()     // Catch: java.lang.Throwable -> L19f
            throw r0     // Catch: java.lang.Throwable -> L19f
        L16d:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L19f
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L19f
            throw r11     // Catch: java.lang.Throwable -> L19f
        L175:
            java.lang.String r12 = "path"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L17f
            r14 = r11
            goto L19f
        L17f:
            java.lang.String r12 = "secure"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L18a
            r23 = r38
            goto L19f
        L18a:
            java.lang.String r12 = "httponly"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L195
            r24 = r38
            goto L19f
        L195:
            java.lang.String r12 = "samesite"
            boolean r0 = r0.equalsIgnoreCase(r12)
            if (r0 == 0) goto L19f
            r27 = r11
        L19f:
            int r0 = r15 + 1
            r11 = 59
            r12 = 61
            goto Lc9
        L1a7:
            r34 = -1
            int r0 = (r21 > r32 ? 1 : (r21 == r32 ? 0 : -1))
            if (r0 != 0) goto L1b2
            r8 = r37
            r19 = r32
            goto L1db
        L1b2:
            int r0 = (r21 > r34 ? 1 : (r21 == r34 ? 0 : -1))
            if (r0 == 0) goto L1d7
            r11 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r21 > r11 ? 1 : (r21 == r11 ? 0 : -1))
            if (r0 > 0) goto L1c4
            r0 = 1000(0x3e8, float:1.401E-42)
            long r11 = (long) r0
            long r30 = r21 * r11
        L1c4:
            long r30 = r9 + r30
            int r0 = (r30 > r9 ? 1 : (r30 == r9 ? 0 : -1))
            if (r0 < 0) goto L1d4
            int r0 = (r30 > r19 ? 1 : (r30 == r19 ? 0 : -1))
            if (r0 <= 0) goto L1cf
            goto L1d4
        L1cf:
            r8 = r37
            r19 = r30
            goto L1db
        L1d4:
            r8 = r37
            goto L1db
        L1d7:
            r8 = r37
            r19 = r28
        L1db:
            java.lang.String r0 = r8.f8093
            if (r3 != 0) goto L1e1
            r3 = r0
            goto L209
        L1e1:
            boolean r9 = p000.ln0.m3626(r0, r3)
            if (r9 == 0) goto L1e8
            goto L209
        L1e8:
            boolean r9 = p000.x02.m6479(r0, r3, r2)
            if (r9 == 0) goto L21b
            int r9 = r0.length()
            int r10 = r3.length()
            int r9 = r9 - r10
            int r9 = r9 + (-1)
            char r9 = r0.charAt(r9)
            r10 = 46
            if (r9 != r10) goto L21b
            ym1 r9 = p000.qd2.f8976
            boolean r9 = r9.m6942(r0)
            if (r9 != 0) goto L21b
        L209:
            int r0 = r0.length()
            int r9 = r3.length()
            if (r0 == r9) goto L21e
            bk1 r0 = p000.bk1.f1770
            java.lang.String r0 = r0.m975(r3)
            if (r0 != 0) goto L21e
        L21b:
            r16 = 0
            goto L246
        L21e:
            java.lang.String r0 = "/"
            if (r14 == 0) goto L22c
            boolean r9 = p000.x02.m6485(r14, r0, r2)
            if (r9 != 0) goto L229
            goto L22c
        L229:
            r22 = r14
            goto L23f
        L22c:
            java.lang.String r9 = r8.m4231()
            r10 = 47
            r11 = 6
            int r10 = p000.q02.m4674(r9, r10, r2, r11)
            if (r10 == 0) goto L23d
            java.lang.String r0 = r9.substring(r2, r10)
        L23d:
            r14 = r0
            goto L229
        L23f:
            qp r16 = new qp
            r21 = r3
            r16.<init>(r17, r18, r19, r21, r22, r23, r24, r25, r26, r27)
        L246:
            r3 = r16
        L248:
            if (r3 != 0) goto L24b
            goto L255
        L24b:
            if (r7 != 0) goto L252
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L252:
            r7.add(r3)
        L255:
            int r6 = r6 + 1
            goto L53
        L259:
            if (r7 == 0) goto L263
            java.util.List r3 = java.util.Collections.unmodifiableList(r7)
            r3.getClass()
            goto L264
        L263:
            r3 = 0
        L264:
            if (r3 != 0) goto L267
            goto L268
        L267:
            r1 = r3
        L268:
            r1.isEmpty()
            return
    }
}
