package xhss;

/* JADX INFO: renamed from: xhss.ᛴᲇᛴᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0415 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public java.lang.String f1469;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public java.lang.String f1470;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public int f1471;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public java.lang.String f1472;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public java.lang.String f1473;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public java.util.ArrayList f1474;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public java.lang.String f1475;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final java.util.ArrayList f1476;

    public C0415() {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = ""
            r4.f1469 = r0
            r4.f1470 = r0
            r1 = -1
            r4.f1471 = r1
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.ArrayList r1 = new java.util.ArrayList
            xhss.ᛳᛲᛷᛷ r2 = new xhss.ᛳᛲᛷᛷ
            r3 = 1
            r2.<init>(r3, r0)
            r1.<init>(r2)
            r4.f1476 = r1
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static java.util.ArrayList m806(java.lang.String r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r6.length()
            if (r1 > r2) goto L44
            r2 = 38
            r3 = 4
            int r2 = xhss.AbstractC0120.m351(r6, r2, r1, r3)
            r4 = -1
            if (r2 != r4) goto L1a
            int r2 = r6.length()
        L1a:
            r5 = 61
            int r3 = xhss.AbstractC0120.m351(r6, r5, r1, r3)
            if (r3 == r4) goto L36
            if (r3 <= r2) goto L25
            goto L36
        L25:
            java.lang.String r1 = r6.substring(r1, r3)
            r0.add(r1)
            int r3 = r3 + 1
            java.lang.String r1 = r6.substring(r3, r2)
            r0.add(r1)
            goto L41
        L36:
            java.lang.String r1 = r6.substring(r1, r2)
            r0.add(r1)
            r1 = 0
            r0.add(r1)
        L41:
            int r1 = r2 + 1
            goto L6
        L44:
            return r0
    }

    public final java.lang.String toString() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.f1472
            if (r1 == 0) goto L12
            r0.append(r1)
            java.lang.String r1 = "://"
            r0.append(r1)
            goto L17
        L12:
            java.lang.String r1 = "//"
            r0.append(r1)
        L17:
            java.lang.String r1 = r8.f1469
            int r1 = r1.length()
            r2 = 58
            if (r1 <= 0) goto L22
            goto L2a
        L22:
            java.lang.String r1 = r8.f1470
            int r1 = r1.length()
            if (r1 <= 0) goto L44
        L2a:
            java.lang.String r1 = r8.f1469
            r0.append(r1)
            java.lang.String r1 = r8.f1470
            int r1 = r1.length()
            if (r1 <= 0) goto L3f
            r0.append(r2)
            java.lang.String r1 = r8.f1470
            r0.append(r1)
        L3f:
            r1 = 64
            r0.append(r1)
        L44:
            java.lang.String r1 = r8.f1475
            if (r1 == 0) goto L63
            boolean r1 = xhss.AbstractC0120.m338(r1, r2)
            if (r1 == 0) goto L5e
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = r8.f1475
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            goto L63
        L5e:
            java.lang.String r1 = r8.f1475
            r0.append(r1)
        L63:
            int r1 = r8.f1471
            r3 = -1
            if (r1 != r3) goto L6c
            java.lang.String r1 = r8.f1472
            if (r1 == 0) goto L91
        L6c:
            int r1 = r8.m807()
            java.lang.String r4 = r8.f1472
            if (r4 == 0) goto L8b
            java.lang.String r5 = "http"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L7f
            r3 = 80
            goto L89
        L7f:
            java.lang.String r5 = "https"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L89
            r3 = 443(0x1bb, float:6.21E-43)
        L89:
            if (r1 == r3) goto L91
        L8b:
            r0.append(r2)
            r0.append(r1)
        L91:
            java.util.ArrayList r1 = r8.f1476
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        L99:
            if (r4 >= r2) goto Lac
            r5 = 47
            r0.append(r5)
            java.lang.Object r5 = r1.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            r0.append(r5)
            int r4 = r4 + 1
            goto L99
        Lac:
            java.util.ArrayList r1 = r8.f1474
            if (r1 == 0) goto Lf8
            r1 = 63
            r0.append(r1)
            java.util.ArrayList r1 = r8.f1474
            int r2 = r1.size()
            xhss.ᛱᛲᲇᲀ r2 = xhss.AbstractC0473.m855(r3, r2)
            r3 = 2
            xhss.ᲁᛵᛶᲁ r2 = xhss.AbstractC0473.m869(r2, r3)
            int r3 = r2.f3090
            int r4 = r2.f3091
            int r2 = r2.f3092
            if (r2 <= 0) goto Lce
            if (r3 <= r4) goto Ld2
        Lce:
            if (r2 >= 0) goto Lf8
            if (r4 > r3) goto Lf8
        Ld2:
            java.lang.Object r5 = r1.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r3 + 1
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r3 <= 0) goto Le7
            r7 = 38
            r0.append(r7)
        Le7:
            r0.append(r5)
            if (r6 == 0) goto Lf4
            r5 = 61
            r0.append(r5)
            r0.append(r6)
        Lf4:
            if (r3 == r4) goto Lf8
            int r3 = r3 + r2
            goto Ld2
        Lf8:
            java.lang.String r1 = r8.f1473
            if (r1 == 0) goto L106
            r1 = 35
            r0.append(r1)
            java.lang.String r8 = r8.f1473
            r0.append(r8)
        L106:
            java.lang.String r8 = r0.toString()
            return r8
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final int m807() {
            r2 = this;
            int r0 = r2.f1471
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            java.lang.String r2 = r2.f1472
            java.lang.String r0 = "http"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L13
            r1 = 80
            goto L1d
        L13:
            java.lang.String r0 = "https"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L1d
            r1 = 443(0x1bb, float:6.21E-43)
        L1d:
            return r1
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final void m808(xhss.C0669 r19, java.lang.String r20) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            byte[] r3 = xhss.AbstractC0577.f2010
            int r3 = r2.length()
            r8 = 0
            int r4 = xhss.AbstractC0577.m1048(r2, r8, r3)
            int r3 = r2.length()
            int r9 = xhss.AbstractC0577.m1046(r2, r4, r3)
            int r3 = r9 - r4
            r10 = 48
            r11 = 91
            r12 = 58
            r13 = -1
            r14 = 2
            if (r3 >= r14) goto L27
        L25:
            r15 = r13
            goto L79
        L27:
            char r3 = r2.charAt(r4)
            r5 = 97
            int r6 = xhss.AbstractC0007.m102(r3, r5)
            r7 = 65
            if (r6 < 0) goto L3d
            r6 = 122(0x7a, float:1.71E-43)
            int r6 = xhss.AbstractC0007.m102(r3, r6)
            if (r6 <= 0) goto L4c
        L3d:
            int r6 = xhss.AbstractC0007.m102(r3, r7)
            if (r6 < 0) goto L25
            r6 = 90
            int r3 = xhss.AbstractC0007.m102(r3, r6)
            if (r3 <= 0) goto L4c
            goto L25
        L4c:
            int r3 = r4 + 1
        L4e:
            if (r3 >= r9) goto L25
            char r6 = r2.charAt(r3)
            if (r5 > r6) goto L5b
            r15 = 123(0x7b, float:1.72E-43)
            if (r6 >= r15) goto L5b
            goto L76
        L5b:
            if (r7 > r6) goto L60
            if (r6 >= r11) goto L60
            goto L76
        L60:
            if (r10 > r6) goto L65
            if (r6 >= r12) goto L65
            goto L76
        L65:
            r15 = 43
            if (r6 == r15) goto L76
            r15 = 45
            if (r6 == r15) goto L76
            r15 = 46
            if (r6 != r15) goto L72
            goto L76
        L72:
            if (r6 != r12) goto L25
            r15 = r3
            goto L79
        L76:
            int r3 = r3 + 1
            goto L4e
        L79:
            java.lang.String r3 = "http"
            java.lang.String r5 = "https"
            r6 = r3
            r3 = 1
            if (r15 == r13) goto Lc9
            r7 = r6
            r6 = 0
            r16 = r7
            r7 = 6
            r17 = r5
            java.lang.String r5 = "https:"
            r10 = r16
            r11 = r17
            boolean r5 = r2.regionMatches(r3, r4, r5, r6, r7)
            if (r5 == 0) goto L9b
            r0.f1472 = r11
            int r4 = r4 + 6
            r2 = r20
            goto Ld1
        L9b:
            r6 = 0
            r7 = 5
            java.lang.String r5 = "http:"
            r2 = r20
            boolean r5 = r2.regionMatches(r3, r4, r5, r6, r7)
            if (r5 == 0) goto Lac
            r0.f1472 = r10
            int r4 = r4 + 5
            goto Ld1
        Lac:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r2.substring(r8, r15)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected URL scheme 'http' or 'https' but was '"
            r2.<init>(r3)
            r2.append(r1)
            r1 = 39
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        Lc9:
            r11 = r5
            r10 = r6
            if (r1 == 0) goto L371
            java.lang.String r5 = r1.f2285
            r0.f1472 = r5
        Ld1:
            r5 = r4
            r6 = r8
        Ld3:
            r7 = 92
            r15 = 47
            r17 = r3
            if (r5 >= r9) goto Leb
            char r3 = r2.charAt(r5)
            if (r3 == r15) goto Le4
            if (r3 == r7) goto Le4
            goto Leb
        Le4:
            int r6 = r6 + 1
            int r5 = r5 + 1
            r3 = r17
            goto Ld3
        Leb:
            java.lang.String r5 = " \"'<>#"
            java.lang.String r3 = ""
            java.util.ArrayList r12 = r0.f1476
            r7 = 35
            if (r6 >= r14) goto L13e
            if (r1 == 0) goto L13e
            java.lang.String r14 = r1.f2285
            java.lang.String r15 = r0.f1472
            boolean r14 = xhss.AbstractC0007.m97(r14, r15)
            if (r14 != 0) goto L102
            goto L13e
        L102:
            java.lang.String r6 = r1.m1156()
            r0.f1469 = r6
            java.lang.String r6 = r1.m1157()
            r0.f1470 = r6
            java.lang.String r6 = r1.f2288
            r0.f1475 = r6
            int r6 = r1.f2284
            r0.f1471 = r6
            r12.clear()
            java.util.ArrayList r6 = r1.m1155()
            r12.addAll(r6)
            if (r4 == r9) goto L128
            char r6 = r2.charAt(r4)
            if (r6 != r7) goto L253
        L128:
            java.lang.String r1 = r1.m1160()
            if (r1 == 0) goto L139
            r6 = 83
            java.lang.String r1 = xhss.C0915.m1489(r1, r8, r8, r5, r6)
            java.util.ArrayList r1 = m806(r1)
            goto L13a
        L139:
            r1 = 0
        L13a:
            r0.f1474 = r1
            goto L253
        L13e:
            int r4 = r4 + r6
            r6 = r4
            r1 = r8
            r4 = r1
        L142:
            java.lang.String r14 = "@/\\?#"
            int r14 = xhss.AbstractC0577.m1038(r6, r9, r2, r14)
            if (r14 == r9) goto L14f
            char r15 = r2.charAt(r14)
            goto L150
        L14f:
            r15 = r13
        L150:
            if (r15 == r13) goto L1c4
            if (r15 == r7) goto L1c4
            r8 = 47
            if (r15 == r8) goto L1c4
            r8 = 92
            if (r15 == r8) goto L1c4
            r8 = 63
            if (r15 == r8) goto L1c4
            r8 = 64
            if (r15 == r8) goto L166
            r8 = 0
            goto L142
        L166:
            java.lang.String r8 = " \"':;<=>@[]^`{}|/\\?#"
            java.lang.String r15 = "%40"
            if (r1 != 0) goto L1a1
            r7 = 58
            int r13 = xhss.AbstractC0577.m1039(r2, r7, r6, r14)
            r7 = 112(0x70, float:1.57E-43)
            java.lang.String r6 = xhss.C0915.m1489(r2, r6, r13, r8, r7)
            if (r4 == 0) goto L18b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = r0.f1469
            r4.<init>(r7)
            r4.append(r15)
            r4.append(r6)
            java.lang.String r6 = r4.toString()
        L18b:
            r0.f1469 = r6
            if (r13 == r14) goto L19c
            int r13 = r13 + 1
            r7 = 112(0x70, float:1.57E-43)
            java.lang.String r1 = xhss.C0915.m1489(r2, r13, r14, r8, r7)
            r0.f1470 = r1
            r1 = r17
            goto L19e
        L19c:
            r7 = 112(0x70, float:1.57E-43)
        L19e:
            r4 = r17
            goto L1bc
        L1a1:
            r7 = 112(0x70, float:1.57E-43)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r7 = r0.f1470
            r13.<init>(r7)
            r13.append(r15)
            r7 = 112(0x70, float:1.57E-43)
            java.lang.String r6 = xhss.C0915.m1489(r2, r6, r14, r8, r7)
            r13.append(r6)
            java.lang.String r6 = r13.toString()
            r0.f1470 = r6
        L1bc:
            int r6 = r14 + 1
            r7 = 35
            r8 = 0
            r13 = -1
            goto L142
        L1c4:
            r1 = r6
        L1c5:
            if (r1 >= r14) goto L1e3
            char r4 = r2.charAt(r1)
            r7 = 58
            if (r4 == r7) goto L1e4
            r8 = 91
            if (r4 == r8) goto L1d4
            goto L1e0
        L1d4:
            int r1 = r1 + 1
            if (r1 >= r14) goto L1e0
            char r4 = r2.charAt(r1)
            r13 = 93
            if (r4 != r13) goto L1d4
        L1e0:
            int r1 = r1 + 1
            goto L1c5
        L1e3:
            r1 = r14
        L1e4:
            int r4 = r1 + 1
            r7 = 4
            r8 = 34
            if (r4 >= r14) goto L22e
            java.lang.String r7 = xhss.C0915.m1496(r6, r1, r7, r2)
            java.lang.String r7 = xhss.AbstractC0898.m1458(r7)
            r0.f1475 = r7
            r7 = 120(0x78, float:1.68E-43)
            java.lang.String r7 = xhss.C0915.m1489(r2, r4, r14, r3, r7)     // Catch: java.lang.NumberFormatException -> L208
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L208
            r10 = r17
            if (r10 > r7) goto L208
            r10 = 65536(0x10000, float:9.1835E-41)
            if (r7 >= r10) goto L208
            goto L209
        L208:
            r7 = -1
        L209:
            r0.f1471 = r7
            r13 = -1
            if (r7 == r13) goto L20f
            goto L24e
        L20f:
            java.lang.String r0 = r2.substring(r4, r14)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid URL port: \""
            r1.<init>(r2)
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L22e:
            r13 = -1
            java.lang.String r4 = xhss.C0915.m1496(r6, r1, r7, r2)
            java.lang.String r4 = xhss.AbstractC0898.m1458(r4)
            r0.f1475 = r4
            java.lang.String r4 = r0.f1472
            boolean r7 = r4.equals(r10)
            if (r7 == 0) goto L244
            r13 = 80
            goto L24c
        L244:
            boolean r4 = r4.equals(r11)
            if (r4 == 0) goto L24c
            r13 = 443(0x1bb, float:6.21E-43)
        L24c:
            r0.f1471 = r13
        L24e:
            java.lang.String r4 = r0.f1475
            if (r4 == 0) goto L352
            r4 = r14
        L253:
            java.lang.String r1 = "?#"
            int r1 = xhss.AbstractC0577.m1038(r4, r9, r2, r1)
            if (r4 != r1) goto L25d
            goto L31c
        L25d:
            char r6 = r2.charAt(r4)
            r8 = 47
            if (r6 == r8) goto L275
            r8 = 92
            if (r6 == r8) goto L275
            int r6 = r12.size()
            r17 = 1
            int r6 = r6 + (-1)
            r12.set(r6, r3)
            goto L27d
        L275:
            r12.clear()
            r12.add(r3)
            int r4 = r4 + 1
        L27d:
            if (r4 >= r1) goto L31c
            java.lang.String r6 = "/\\"
            int r6 = xhss.AbstractC0577.m1038(r4, r1, r2, r6)
            if (r6 >= r1) goto L289
            r7 = 1
            goto L28a
        L289:
            r7 = 0
        L28a:
            java.lang.String r8 = " \"<>^`{}|/\\?#"
            r10 = 112(0x70, float:1.57E-43)
            java.lang.String r4 = xhss.C0915.m1489(r2, r4, r6, r8, r10)
            java.lang.String r8 = "."
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L313
            java.lang.String r8 = "%2e"
            boolean r8 = r4.equalsIgnoreCase(r8)
            if (r8 == 0) goto L2a4
            goto L313
        L2a4:
            java.lang.String r8 = ".."
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L2ec
            java.lang.String r8 = "%2e."
            boolean r8 = r4.equalsIgnoreCase(r8)
            if (r8 != 0) goto L2ec
            java.lang.String r8 = ".%2e"
            boolean r8 = r4.equalsIgnoreCase(r8)
            if (r8 != 0) goto L2ec
            java.lang.String r8 = "%2e%2e"
            boolean r8 = r4.equalsIgnoreCase(r8)
            if (r8 == 0) goto L2c5
            goto L2ec
        L2c5:
            int r8 = r12.size()
            r17 = 1
            int r8 = r8 + (-1)
            java.lang.Object r8 = r12.get(r8)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            int r8 = r8.length()
            if (r8 != 0) goto L2e3
            int r8 = r12.size()
            int r8 = r8 + (-1)
            r12.set(r8, r4)
            goto L2e6
        L2e3:
            r12.add(r4)
        L2e6:
            if (r7 == 0) goto L313
            r12.add(r3)
            goto L313
        L2ec:
            int r4 = r12.size()
            r17 = 1
            int r4 = r4 + (-1)
            java.lang.Object r4 = r12.remove(r4)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.length()
            if (r4 != 0) goto L310
            boolean r4 = r12.isEmpty()
            if (r4 != 0) goto L310
            int r4 = r12.size()
            int r4 = r4 + (-1)
            r12.set(r4, r3)
            goto L313
        L310:
            r12.add(r3)
        L313:
            if (r7 == 0) goto L319
            int r4 = r6 + 1
            goto L27d
        L319:
            r4 = r6
            goto L27d
        L31c:
            if (r1 >= r9) goto L33b
            char r4 = r2.charAt(r1)
            r8 = 63
            if (r4 != r8) goto L33b
            r4 = 35
            int r6 = xhss.AbstractC0577.m1039(r2, r4, r1, r9)
            int r1 = r1 + 1
            r4 = 80
            java.lang.String r1 = xhss.C0915.m1489(r2, r1, r6, r5, r4)
            java.util.ArrayList r1 = m806(r1)
            r0.f1474 = r1
            r1 = r6
        L33b:
            if (r1 >= r9) goto L351
            char r4 = r2.charAt(r1)
            r5 = 35
            if (r4 != r5) goto L351
            r17 = 1
            int r1 = r1 + 1
            r4 = 48
            java.lang.String r1 = xhss.C0915.m1489(r2, r1, r9, r3, r4)
            r0.f1473 = r1
        L351:
            return
        L352:
            java.lang.String r0 = r2.substring(r6, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid URL host: \""
            r1.<init>(r2)
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L371:
            int r0 = r2.length()
            r1 = 6
            if (r0 <= r1) goto L383
            java.lang.String r0 = xhss.AbstractC0120.m348(r2, r1)
            java.lang.String r1 = "..."
            java.lang.String r0 = r0.concat(r1)
            goto L384
        L383:
            r0 = r2
        L384:
            java.lang.String r1 = "Expected URL scheme 'http' or 'https' but no scheme was found for "
            java.lang.String r0 = r1.concat(r0)
            xhss.C0532.m959(r0)
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0669 m809() {
            r12 = this;
            java.lang.String r1 = r12.f1472
            r0 = 0
            if (r1 == 0) goto L86
            java.lang.String r2 = r12.f1469
            r3 = 0
            r4 = 7
            java.lang.String r2 = xhss.C0915.m1496(r3, r3, r4, r2)
            java.lang.String r5 = r12.f1470
            java.lang.String r5 = xhss.C0915.m1496(r3, r3, r4, r5)
            r6 = r4
            java.lang.String r4 = r12.f1475
            if (r4 == 0) goto L80
            r7 = r3
            r3 = r5
            int r5 = r12.m807()
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.ArrayList r9 = r12.f1476
            int r10 = xhss.AbstractC0249.m554(r9)
            r8.<init>(r10)
            java.util.Iterator r9 = r9.iterator()
        L2d:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L41
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r10 = xhss.C0915.m1496(r7, r7, r6, r10)
            r8.add(r10)
            goto L2d
        L41:
            java.util.ArrayList r8 = r12.f1474
            if (r8 == 0) goto L6b
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = xhss.AbstractC0249.m554(r8)
            r9.<init>(r10)
            java.util.Iterator r8 = r8.iterator()
        L52:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L6c
            java.lang.Object r10 = r8.next()
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L66
            r11 = 3
            java.lang.String r10 = xhss.C0915.m1496(r7, r7, r11, r10)
            goto L67
        L66:
            r10 = r0
        L67:
            r9.add(r10)
            goto L52
        L6b:
            r9 = r0
        L6c:
            java.lang.String r8 = r12.f1473
            if (r8 == 0) goto L74
            java.lang.String r0 = xhss.C0915.m1496(r7, r7, r6, r8)
        L74:
            r7 = r0
            java.lang.String r8 = r12.toString()
            xhss.ᛷᛶᲁᛵ r0 = new xhss.ᛷᛶᲁᛵ
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        L80:
            java.lang.String r12 = "host == null"
            xhss.C0532.m950(r12)
            return r0
        L86:
            java.lang.String r12 = "scheme == null"
            xhss.C0532.m950(r12)
            return r0
    }
}
