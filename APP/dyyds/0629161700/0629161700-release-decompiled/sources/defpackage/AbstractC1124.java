package defpackage;

/* JADX INFO: renamed from: ᛶᛸᛳᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1124 {
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static java.lang.String m2143(int r1, int r2, java.lang.String r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r1)
            r0.append(r4)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m2144(int r1) {
            r0 = 1
            if (r1 == r0) goto L12
            r0 = 2
            if (r1 == r0) goto Lf
            r0 = 3
            if (r1 == r0) goto Lc
            java.lang.String r1 = "null"
            return r1
        Lc:
            java.lang.String r1 = "WRITE_AHEAD_LOGGING"
            return r1
        Lf:
            java.lang.String r1 = "TRUNCATE"
            return r1
        L12:
            java.lang.String r1 = "AUTOMATIC"
            return r1
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static java.lang.String m2145(int r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static /* synthetic */ char m2146(int r0) {
            switch(r0) {
                case 1: goto L17;
                case 2: goto L14;
                case 3: goto L11;
                case 4: goto Le;
                case 5: goto Lb;
                case 6: goto L8;
                case 7: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            throw r0
        L5:
            r0 = 85
            return r0
        L8:
            r0 = 117(0x75, float:1.64E-43)
            return r0
        Lb:
            r0 = 115(0x73, float:1.61E-43)
            return r0
        Le:
            r0 = 109(0x6d, float:1.53E-43)
            return r0
        L11:
            r0 = 120(0x78, float:1.68E-43)
            return r0
        L14:
            r0 = 105(0x69, float:1.47E-43)
            return r0
        L17:
            r0 = 100
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static /* synthetic */ int m2147(int r0) {
            switch(r0) {
                case 1: goto L15;
                case 2: goto L13;
                case 3: goto L11;
                case 4: goto Le;
                case 5: goto Lb;
                case 6: goto L8;
                case 7: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            throw r0
        L5:
            r0 = 256(0x100, float:3.59E-43)
            return r0
        L8:
            r0 = 64
            return r0
        Lb:
            r0 = 32
            return r0
        Le:
            r0 = 8
            return r0
        L11:
            r0 = 4
            return r0
        L13:
            r0 = 2
            return r0
        L15:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static int m2148(char[] r10) {
            int r0 = r10.length
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            if (r2 >= r0) goto L26
            char r4 = r10[r2]
            r5 = 7
            int[] r5 = defpackage.AbstractC0225.m825(r5)
            int r6 = r5.length
            r7 = r1
        Lf:
            if (r7 >= r6) goto L21
            r8 = r5[r7]
            char r9 = m2146(r8)
            if (r9 != r4) goto L1e
            int r4 = m2147(r8)
            goto L22
        L1e:
            int r7 = r7 + 1
            goto Lf
        L21:
            r4 = r1
        L22:
            r3 = r3 | r4
            int r2 = r2 + 1
            goto L4
        L26:
            return r3
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static java.lang.Number m2149(int r4, defpackage.C1103 r5) {
            r0 = 1
            if (r4 == r0) goto L5c
            r1 = 2
            if (r4 == r1) goto L52
            r1 = 3
            if (r4 == r1) goto L33
            java.lang.String r4 = r5.m2096()
            java.math.BigDecimal r4 = defpackage.AbstractC2279.m3696(r4)     // Catch: java.lang.NumberFormatException -> L12
            return r4
        L12:
            r1 = move-exception
            ᛸᛵᛳᲀ r2 = new ᛸᛵᛳᲀ
            java.lang.String r5 = r5.m2106(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Cannot parse "
            r0.<init>(r3)
            r0.append(r4)
            java.lang.String r4 = "; at path "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            r2.<init>(r4, r1)
            throw r2
        L33:
            java.lang.String r4 = r5.m2096()
            r0 = 46
            int r0 = r4.indexOf(r0)
            if (r0 < 0) goto L44
            java.lang.Double r4 = m2151(r4, r5)
            goto L51
        L44:
            long r0 = java.lang.Long.parseLong(r4)     // Catch: java.lang.NumberFormatException -> L4d
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L4d
            goto L51
        L4d:
            java.lang.Double r4 = m2151(r4, r5)
        L51:
            return r4
        L52:
            ᛷᛲᛳᛷ r4 = new ᛷᛲᛳᛷ
            java.lang.String r5 = r5.m2096()
            r4.<init>(r5)
            return r4
        L5c:
            double r4 = r5.m2087()
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            return r4
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static /* synthetic */ void m2150(java.lang.Object r0) {
            if (r0 != 0) goto L3
            return
        L3:
            defpackage.C2264.m3679()
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static java.lang.Double m2151(java.lang.String r6, defpackage.C1103 r7) {
            java.lang.String r0 = "; at path "
            java.lang.String r1 = "JSON forbids NaN and infinities: "
            r2 = 1
            java.lang.Double r3 = java.lang.Double.valueOf(r6)     // Catch: java.lang.NumberFormatException -> L16
            boolean r4 = r3.isInfinite()     // Catch: java.lang.NumberFormatException -> L16
            if (r4 != 0) goto L18
            boolean r4 = r3.isNaN()     // Catch: java.lang.NumberFormatException -> L16
            if (r4 == 0) goto L1c
            goto L18
        L16:
            r1 = move-exception
            goto L39
        L18:
            int r4 = r7.f4923     // Catch: java.lang.NumberFormatException -> L16
            if (r4 != r2) goto L1d
        L1c:
            return r3
        L1d:
            ᛵᛸᛱᛶ r4 = new ᛵᛸᛱᛶ     // Catch: java.lang.NumberFormatException -> L16
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L16
            r5.<init>(r1)     // Catch: java.lang.NumberFormatException -> L16
            r5.append(r3)     // Catch: java.lang.NumberFormatException -> L16
            r5.append(r0)     // Catch: java.lang.NumberFormatException -> L16
            java.lang.String r1 = r7.m2106(r2)     // Catch: java.lang.NumberFormatException -> L16
            r5.append(r1)     // Catch: java.lang.NumberFormatException -> L16
            java.lang.String r1 = r5.toString()     // Catch: java.lang.NumberFormatException -> L16
            r4.<init>(r1)     // Catch: java.lang.NumberFormatException -> L16
            throw r4     // Catch: java.lang.NumberFormatException -> L16
        L39:
            ᛸᛵᛳᲀ r3 = new ᛸᛵᛳᲀ
            java.lang.String r7 = r7.m2106(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Cannot parse "
            r2.<init>(r4)
            r2.append(r6)
            r2.append(r0)
            r2.append(r7)
            java.lang.String r6 = r2.toString()
            r3.<init>(r6, r1)
            throw r3
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2152(int r3) {
            r0 = 0
            r1 = 1
            if (r3 == r1) goto L14
            r2 = 2
            if (r3 == r2) goto L14
            r2 = 3
            if (r3 == r2) goto L14
            r0 = 4
            if (r3 == r0) goto L13
            r0 = 5
            if (r3 != r0) goto L11
            return r1
        L11:
            r3 = 0
            throw r3
        L13:
            return r1
        L14:
            return r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static int m2153(java.lang.String r0, int r1, int r2) {
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * r2
            return r0
    }
}
