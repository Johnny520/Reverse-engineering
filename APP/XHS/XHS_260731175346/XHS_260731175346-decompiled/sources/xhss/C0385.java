package xhss;

/* JADX INFO: renamed from: xhss.ᛴᛷᛸᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0385 implements java.io.Closeable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.io.StringReader f1377;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final char[] f1378;

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public int[] f1379;

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public int f1380;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public int f1381;

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public int[] f1382;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public long f1383;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public int f1384;

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public int f1385;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public int f1386;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public int f1387;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f1388;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public int f1389;

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public java.lang.String[] f1390;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public java.lang.String f1391;

    static {
            xhss.ᛶᛵᲇᛸ r0 = new xhss.ᛶᛵᲇᛸ
            r1 = 5
            r0.<init>(r1)
            xhss.C0564.f1993 = r0
            return
    }

    public C0385(java.io.StringReader r5) {
            r4 = this;
            r4.<init>()
            r0 = 2
            r4.f1380 = r0
            r0 = 1024(0x400, float:1.435E-42)
            char[] r0 = new char[r0]
            r4.f1378 = r0
            r0 = 0
            r4.f1388 = r0
            r4.f1381 = r0
            r4.f1389 = r0
            r4.f1387 = r0
            r4.f1384 = r0
            r1 = 32
            int[] r2 = new int[r1]
            r4.f1382 = r2
            r3 = 1
            r4.f1385 = r3
            r3 = 6
            r2[r0] = r3
            java.lang.String[] r0 = new java.lang.String[r1]
            r4.f1390 = r0
            int[] r0 = new int[r1]
            r4.f1379 = r0
            r4.f1377 = r5
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r3 = this;
            r0 = 0
            r3.f1384 = r0
            int[] r1 = r3.f1382
            r2 = 8
            r1[r0] = r2
            r0 = 1
            r3.f1385 = r0
            java.io.StringReader r3 = r3.f1377
            r3.close()
            return
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.Class<xhss.ᛴᛷᛸᛷ> r0 = xhss.C0385.class
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = r1.m754()
            java.lang.String r1 = r0.concat(r1)
            return r1
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m735() {
            r3 = this;
            int r0 = r3.f1384
            if (r0 != 0) goto L8
            int r0 = r3.m757()
        L8:
            r1 = 3
            if (r0 != r1) goto L1a
            r0 = 1
            r3.m742(r0)
            int[] r1 = r3.f1379
            int r2 = r3.f1385
            int r2 = r2 - r0
            r0 = 0
            r1[r2] = r0
            r3.f1384 = r0
            return
        L1a:
            java.lang.String r0 = "BEGIN_ARRAY"
            java.lang.IllegalStateException r3 = r3.m745(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ᛱᛱᛴᲀ, reason: contains not printable characters */
    public final void m736(java.lang.String r4) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r4.length()
            if (r0 >= r1) goto L1d
            char r1 = r4.charAt(r0)
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 > r2) goto L12
            int r0 = r0 + 1
            goto L1
        L12:
            java.lang.String r0 = "String contains non-ASCII characters: "
            java.lang.String r4 = r0.concat(r4)
            r3.m761(r4)
            r3 = 0
            throw r3
        L1d:
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᲁᲈ, reason: contains not printable characters */
    public final java.lang.String m737(char r12) {
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.f1388
            int r3 = r11.f1381
        L6:
            r4 = r3
            r3 = r2
        L8:
            r5 = 16
            r6 = 1
            char[] r7 = r11.f1378
            if (r2 >= r4) goto L6b
            int r8 = r2 + 1
            char r2 = r7[r2]
            int r9 = r11.f1380
            r10 = 3
            if (r9 != r10) goto L23
            r9 = 32
            if (r2 < r9) goto L1d
            goto L23
        L1d:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.m761(r12)
            throw r0
        L23:
            if (r2 != r12) goto L39
            r11.f1388 = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L31
            java.lang.String r11 = new java.lang.String
            r11.<init>(r7, r3, r8)
            return r11
        L31:
            r1.append(r7, r3, r8)
            java.lang.String r11 = r1.toString()
            return r11
        L39:
            r9 = 92
            if (r2 != r9) goto L5e
            r11.f1388 = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L4f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r5)
            r1.<init>(r4)
        L4f:
            r1.append(r7, r3, r2)
            char r2 = r11.m759()
            r1.append(r2)
            int r2 = r11.f1388
            int r3 = r11.f1381
            goto L6
        L5e:
            r5 = 10
            if (r2 != r5) goto L69
            int r2 = r11.f1389
            int r2 = r2 + r6
            r11.f1389 = r2
            r11.f1387 = r8
        L69:
            r2 = r8
            goto L8
        L6b:
            if (r1 != 0) goto L7b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L7b:
            int r4 = r2 - r3
            r1.append(r7, r3, r4)
            r11.f1388 = r2
            boolean r2 = r11.m755(r6)
            if (r2 == 0) goto L8a
            goto L2
        L8a:
            java.lang.String r12 = "Unterminated string"
            r11.m761(r12)
            throw r0
    }

    /* JADX INFO: renamed from: ᛱᲈᛳᛴ, reason: contains not printable characters */
    public final void m738() {
            r3 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r3.f1388
            int r1 = r1 + r0
            int r2 = r3.f1381
            if (r1 >= r2) goto L4f
            char[] r2 = r3.f1378
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L49
            r2 = 10
            if (r1 == r2) goto L49
            r2 = 12
            if (r1 == r2) goto L49
            r2 = 13
            if (r1 == r2) goto L49
            r2 = 32
            if (r1 == r2) goto L49
            r2 = 35
            if (r1 == r2) goto L46
            r2 = 44
            if (r1 == r2) goto L49
            r2 = 47
            if (r1 == r2) goto L46
            r2 = 61
            if (r1 == r2) goto L46
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L49
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L49
            r2 = 58
            if (r1 == r2) goto L49
            r2 = 59
            if (r1 == r2) goto L46
            switch(r1) {
                case 91: goto L49;
                case 92: goto L46;
                case 93: goto L49;
                default: goto L43;
            }
        L43:
            int r0 = r0 + 1
            goto L1
        L46:
            r3.m763()
        L49:
            int r1 = r3.f1388
            int r1 = r1 + r0
            r3.f1388 = r1
            return
        L4f:
            r3.f1388 = r1
            r0 = 1
            boolean r0 = r3.m755(r0)
            if (r0 != 0) goto L0
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲀᲈ, reason: contains not printable characters */
    public final java.lang.String m739() {
            r4 = this;
            int r0 = r4.f1384
            if (r0 != 0) goto L8
            int r0 = r4.m757()
        L8:
            r1 = 10
            if (r0 != r1) goto L11
            java.lang.String r0 = r4.m740()
            goto L52
        L11:
            r1 = 8
            if (r0 != r1) goto L1c
            r0 = 39
            java.lang.String r0 = r4.m737(r0)
            goto L52
        L1c:
            r1 = 9
            if (r0 != r1) goto L27
            r0 = 34
            java.lang.String r0 = r4.m737(r0)
            goto L52
        L27:
            r1 = 11
            if (r0 != r1) goto L31
            java.lang.String r0 = r4.f1391
            r1 = 0
            r4.f1391 = r1
            goto L52
        L31:
            r1 = 15
            if (r0 != r1) goto L3c
            long r0 = r4.f1383
            java.lang.String r0 = java.lang.Long.toString(r0)
            goto L52
        L3c:
            r1 = 16
            if (r0 != r1) goto L62
            java.lang.String r0 = new java.lang.String
            int r1 = r4.f1388
            int r2 = r4.f1386
            char[] r3 = r4.f1378
            r0.<init>(r3, r1, r2)
            int r1 = r4.f1388
            int r2 = r4.f1386
            int r1 = r1 + r2
            r4.f1388 = r1
        L52:
            r1 = 0
            r4.f1384 = r1
            int[] r1 = r4.f1379
            int r4 = r4.f1385
            int r4 = r4 + (-1)
            r2 = r1[r4]
            int r2 = r2 + 1
            r1[r4] = r2
            return r0
        L62:
            java.lang.String r0 = "a string"
            java.lang.IllegalStateException r4 = r4.m745(r0)
            throw r4
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛲ, reason: contains not printable characters */
    public final java.lang.String m740() {
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.f1388
            int r3 = r3 + r2
            int r4 = r6.f1381
            char[] r5 = r6.f1378
            if (r3 >= r4) goto L4c
            char r3 = r5[r3]
            r4 = 9
            if (r3 == r4) goto L58
            r4 = 10
            if (r3 == r4) goto L58
            r4 = 12
            if (r3 == r4) goto L58
            r4 = 13
            if (r3 == r4) goto L58
            r4 = 32
            if (r3 == r4) goto L58
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L58
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L58
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L58
            r4 = 58
            if (r3 == r4) goto L58
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L58;
                case 92: goto L48;
                case 93: goto L58;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            r6.m763()
            goto L58
        L4c:
            int r3 = r5.length
            if (r2 >= r3) goto L5a
            int r3 = r2 + 1
            boolean r3 = r6.m755(r3)
            if (r3 == 0) goto L58
            goto L3
        L58:
            r1 = r2
            goto L78
        L5a:
            if (r0 != 0) goto L67
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L67:
            int r3 = r6.f1388
            r0.append(r5, r3, r2)
            int r3 = r6.f1388
            int r3 = r3 + r2
            r6.f1388 = r3
            r2 = 1
            boolean r2 = r6.m755(r2)
            if (r2 != 0) goto L2
        L78:
            int r2 = r6.f1388
            if (r0 != 0) goto L82
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r2, r1)
            goto L89
        L82:
            r0.append(r5, r2, r1)
            java.lang.String r0 = r0.toString()
        L89:
            int r2 = r6.f1388
            int r2 = r2 + r1
            r6.f1388 = r2
            return r0
    }

    /* JADX INFO: renamed from: ᛳᛶᛷᲀ, reason: contains not printable characters */
    public final int m741() {
            r7 = this;
            int r0 = r7.f1384
            if (r0 != 0) goto L8
            int r0 = r7.m757()
        L8:
            r1 = 15
            java.lang.String r2 = "Expected an int but was "
            r3 = 0
            if (r0 != r1) goto L41
            long r0 = r7.f1383
            int r4 = (int) r0
            long r5 = (long) r4
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L26
            r7.f1384 = r3
            int[] r0 = r7.f1379
            int r7 = r7.f1385
            int r7 = r7 + (-1)
            r1 = r0[r7]
            int r1 = r1 + 1
            r0[r7] = r1
            return r4
        L26:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            long r3 = r7.f1383
            java.lang.String r7 = r7.m754()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r3)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L41:
            r1 = 16
            if (r0 != r1) goto L5a
            java.lang.String r0 = new java.lang.String
            int r1 = r7.f1388
            int r4 = r7.f1386
            char[] r5 = r7.f1378
            r0.<init>(r5, r1, r4)
            r7.f1391 = r0
            int r0 = r7.f1388
            int r1 = r7.f1386
            int r0 = r0 + r1
            r7.f1388 = r0
            goto L9c
        L5a:
            r1 = 10
            r4 = 8
            if (r0 == r4) goto L6e
            r5 = 9
            if (r0 == r5) goto L6e
            if (r0 != r1) goto L67
            goto L6e
        L67:
            java.lang.String r0 = "an int"
            java.lang.IllegalStateException r7 = r7.m745(r0)
            throw r7
        L6e:
            if (r0 != r1) goto L77
            java.lang.String r0 = r7.m740()
            r7.f1391 = r0
            goto L84
        L77:
            if (r0 != r4) goto L7c
            r0 = 39
            goto L7e
        L7c:
            r0 = 34
        L7e:
            java.lang.String r0 = r7.m737(r0)
            r7.f1391 = r0
        L84:
            r7.m736(r0)
            java.lang.String r0 = r7.f1391     // Catch: java.lang.NumberFormatException -> L9c
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L9c
            r7.f1384 = r3     // Catch: java.lang.NumberFormatException -> L9c
            int[] r1 = r7.f1379     // Catch: java.lang.NumberFormatException -> L9c
            int r4 = r7.f1385     // Catch: java.lang.NumberFormatException -> L9c
            int r4 = r4 + (-1)
            r5 = r1[r4]     // Catch: java.lang.NumberFormatException -> L9c
            int r5 = r5 + 1
            r1[r4] = r5     // Catch: java.lang.NumberFormatException -> L9c
            return r0
        L9c:
            r0 = 11
            r7.f1384 = r0
            java.lang.String r0 = r7.f1391
            double r0 = java.lang.Double.parseDouble(r0)
            int r4 = (int) r0
            double r5 = (double) r4
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto Lbe
            r0 = 0
            r7.f1391 = r0
            r7.f1384 = r3
            int[] r0 = r7.f1379
            int r7 = r7.f1385
            int r7 = r7 + (-1)
            r1 = r0[r7]
            int r1 = r1 + 1
            r0[r7] = r1
            return r4
        Lbe:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r7.f1391
            java.lang.String r7 = r7.m754()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r1)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r0.<init>(r7)
            throw r0
    }

    /* JADX INFO: renamed from: ᛳᛸᛵᲀ, reason: contains not printable characters */
    public final void m742(int r4) {
            r3 = this;
            int r0 = r3.f1385
            int r1 = r0 + (-1)
            r2 = 255(0xff, float:3.57E-43)
            if (r1 >= r2) goto L32
            int[] r1 = r3.f1382
            int r2 = r1.length
            if (r0 != r2) goto L27
            int r0 = r0 * 2
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.f1382 = r1
            int[] r1 = r3.f1379
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.f1379 = r1
            java.lang.String[] r1 = r3.f1390
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r3.f1390 = r0
        L27:
            int[] r0 = r3.f1382
            int r1 = r3.f1385
            int r2 = r1 + 1
            r3.f1385 = r2
            r0[r1] = r4
            return
        L32:
            xhss.ᲈᲇᲁᲈ r4 = new xhss.ᲈᲇᲁᲈ
            java.lang.String r3 = r3.m754()
            java.lang.String r0 = "Nesting limit 255 reached"
            java.lang.String r3 = r0.concat(r3)
            r4.<init>(r3)
            throw r4
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final void m743() {
            r2 = this;
            int r0 = r2.f1384
            if (r0 != 0) goto L8
            int r0 = r2.m757()
        L8:
            r1 = 1
            if (r0 != r1) goto L13
            r0 = 3
            r2.m742(r0)
            r0 = 0
            r2.f1384 = r0
            return
        L13:
            java.lang.String r0 = "BEGIN_OBJECT"
            java.lang.IllegalStateException r2 = r2.m745(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public final boolean m744() {
            r1 = this;
            int r0 = r1.f1384
            if (r0 != 0) goto L8
            int r0 = r1.m757()
        L8:
            r1 = 2
            if (r0 == r1) goto L14
            r1 = 4
            if (r0 == r1) goto L14
            r1 = 17
            if (r0 == r1) goto L14
            r1 = 1
            return r1
        L14:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛴᲀᛸᛵ, reason: contains not printable characters */
    public final java.lang.IllegalStateException m745(java.lang.String r5) {
            r4 = this;
            int r0 = r4.m762()
            r1 = 9
            if (r0 != r1) goto Lb
            java.lang.String r0 = "adapter-not-null-safe"
            goto Ld
        Lb:
            java.lang.String r0 = "unexpected-json-structure"
        Ld:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = " but was "
            r2.append(r5)
            int r5 = r4.m762()
            java.lang.String r5 = xhss.AbstractC0390.m768(r5)
            r2.append(r5)
            java.lang.String r4 = r4.m754()
            r2.append(r4)
            java.lang.String r4 = "\nSee "
            r2.append(r4)
            java.lang.String r4 = "https://github.com/google/gson/blob/main/Troubleshooting.md#"
            java.lang.String r4 = r4.concat(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            return r1
    }

    /* JADX INFO: renamed from: ᛴᲈᛱᛴ, reason: contains not printable characters */
    public final double m746() {
            r7 = this;
            int r0 = r7.f1384
            if (r0 != 0) goto L8
            int r0 = r7.m757()
        L8:
            r1 = 15
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L1e
            r7.f1384 = r2
            int[] r0 = r7.f1379
            int r1 = r7.f1385
            int r1 = r1 - r3
            r2 = r0[r1]
            int r2 = r2 + r3
            r0[r1] = r2
            long r0 = r7.f1383
            double r0 = (double) r0
            return r0
        L1e:
            r1 = 16
            r4 = 11
            if (r0 != r1) goto L39
            java.lang.String r0 = new java.lang.String
            int r1 = r7.f1388
            int r5 = r7.f1386
            char[] r6 = r7.f1378
            r0.<init>(r6, r1, r5)
            r7.f1391 = r0
            int r0 = r7.f1388
            int r1 = r7.f1386
            int r0 = r0 + r1
            r7.f1388 = r0
            goto L64
        L39:
            r1 = 8
            if (r0 == r1) goto L57
            r5 = 9
            if (r0 != r5) goto L42
            goto L57
        L42:
            r1 = 10
            if (r0 != r1) goto L4d
            java.lang.String r0 = r7.m740()
            r7.f1391 = r0
            goto L64
        L4d:
            if (r0 != r4) goto L50
            goto L64
        L50:
            java.lang.String r0 = "a double"
            java.lang.IllegalStateException r7 = r7.m745(r0)
            throw r7
        L57:
            if (r0 != r1) goto L5c
            r0 = 39
            goto L5e
        L5c:
            r0 = 34
        L5e:
            java.lang.String r0 = r7.m737(r0)
            r7.f1391 = r0
        L64:
            r7.f1384 = r4
            java.lang.String r0 = r7.f1391
            double r0 = java.lang.Double.parseDouble(r0)
            int r4 = r7.f1380
            r5 = 0
            if (r4 == r3) goto L90
            boolean r4 = java.lang.Double.isNaN(r0)
            if (r4 != 0) goto L7e
            boolean r4 = java.lang.Double.isInfinite(r0)
            if (r4 != 0) goto L7e
            goto L90
        L7e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "JSON forbids NaN and infinities: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r7.m761(r0)
            throw r5
        L90:
            r7.f1391 = r5
            r7.f1384 = r2
            int[] r2 = r7.f1379
            int r7 = r7.f1385
            int r7 = r7 - r3
            r4 = r2[r7]
            int r4 = r4 + r3
            r2[r7] = r4
            return r0
    }

    /* JADX INFO: renamed from: ᛵᛲᲁᛶ, reason: contains not printable characters */
    public final void m747(char r6) {
            r5 = this;
        L0:
            int r0 = r5.f1388
            int r1 = r5.f1381
        L4:
            r2 = 1
            if (r0 >= r1) goto L2d
            int r3 = r0 + 1
            char[] r4 = r5.f1378
            char r0 = r4[r0]
            if (r0 != r6) goto L12
            r5.f1388 = r3
            return
        L12:
            r4 = 92
            if (r0 != r4) goto L20
            r5.f1388 = r3
            r5.m759()
            int r0 = r5.f1388
            int r1 = r5.f1381
            goto L4
        L20:
            r4 = 10
            if (r0 != r4) goto L2b
            int r0 = r5.f1389
            int r0 = r0 + r2
            r5.f1389 = r0
            r5.f1387 = r3
        L2b:
            r0 = r3
            goto L4
        L2d:
            r5.f1388 = r0
            boolean r0 = r5.m755(r2)
            if (r0 == 0) goto L36
            goto L0
        L36:
            java.lang.String r6 = "Unterminated string"
            r5.m761(r6)
            r5 = 0
            throw r5
    }

    /* JADX INFO: renamed from: ᛵᛷᛲᛸ, reason: contains not printable characters */
    public final void m748() {
            r4 = this;
        L0:
            int r0 = r4.f1388
            int r1 = r4.f1381
            r2 = 1
            if (r0 < r1) goto Ld
            boolean r0 = r4.m755(r2)
            if (r0 == 0) goto L27
        Ld:
            int r0 = r4.f1388
            int r1 = r0 + 1
            r4.f1388 = r1
            char[] r3 = r4.f1378
            char r0 = r3[r0]
            r3 = 10
            if (r0 != r3) goto L23
            int r0 = r4.f1389
            int r0 = r0 + r2
            r4.f1389 = r0
            r4.f1387 = r1
            return
        L23:
            r1 = 13
            if (r0 != r1) goto L0
        L27:
            return
    }

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public final boolean m749(char r2) {
            r1 = this;
            r0 = 9
            if (r2 == r0) goto L3c
            r0 = 10
            if (r2 == r0) goto L3c
            r0 = 12
            if (r2 == r0) goto L3c
            r0 = 13
            if (r2 == r0) goto L3c
            r0 = 32
            if (r2 == r0) goto L3c
            r0 = 35
            if (r2 == r0) goto L39
            r0 = 44
            if (r2 == r0) goto L3c
            r0 = 47
            if (r2 == r0) goto L39
            r0 = 61
            if (r2 == r0) goto L39
            r0 = 123(0x7b, float:1.72E-43)
            if (r2 == r0) goto L3c
            r0 = 125(0x7d, float:1.75E-43)
            if (r2 == r0) goto L3c
            r0 = 58
            if (r2 == r0) goto L3c
            r0 = 59
            if (r2 == r0) goto L39
            switch(r2) {
                case 91: goto L3c;
                case 92: goto L39;
                case 93: goto L3c;
                default: goto L37;
            }
        L37:
            r1 = 1
            return r1
        L39:
            r1.m763()
        L3c:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public final void m750() {
            r5 = this;
            int r0 = r5.f1384
            if (r0 != 0) goto L8
            int r0 = r5.m757()
        L8:
            r1 = 2
            if (r0 != r1) goto L23
            int r0 = r5.f1385
            int r2 = r0 + (-1)
            r5.f1385 = r2
            java.lang.String[] r3 = r5.f1390
            r4 = 0
            r3[r2] = r4
            int[] r2 = r5.f1379
            int r0 = r0 - r1
            r1 = r2[r0]
            int r1 = r1 + 1
            r2[r0] = r1
            r0 = 0
            r5.f1384 = r0
            return
        L23:
            java.lang.String r0 = "END_OBJECT"
            java.lang.IllegalStateException r5 = r5.m745(r0)
            throw r5
    }

    /* JADX INFO: renamed from: ᛸᛲᛷᛱ, reason: contains not printable characters */
    public final boolean m751() {
            r4 = this;
            int r0 = r4.f1384
            if (r0 != 0) goto L8
            int r0 = r4.m757()
        L8:
            r1 = 5
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L1a
            r4.f1384 = r2
            int[] r0 = r4.f1379
            int r4 = r4.f1385
            int r4 = r4 - r3
            r1 = r0[r4]
            int r1 = r1 + r3
            r0[r4] = r1
            return r3
        L1a:
            r1 = 6
            if (r0 != r1) goto L2a
            r4.f1384 = r2
            int[] r0 = r4.f1379
            int r4 = r4.f1385
            int r4 = r4 - r3
            r1 = r0[r4]
            int r1 = r1 + r3
            r0[r4] = r1
            return r2
        L2a:
            java.lang.String r0 = "a boolean"
            java.lang.IllegalStateException r4 = r4.m745(r0)
            throw r4
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final void m752() {
            r3 = this;
            int r0 = r3.f1384
            if (r0 != 0) goto L8
            int r0 = r3.m757()
        L8:
            r1 = 4
            if (r0 != r1) goto L1f
            int r0 = r3.f1385
            int r1 = r0 + (-1)
            r3.f1385 = r1
            int[] r1 = r3.f1379
            int r0 = r0 + (-2)
            r2 = r1[r0]
            int r2 = r2 + 1
            r1[r0] = r2
            r0 = 0
            r3.f1384 = r0
            return
        L1f:
            java.lang.String r0 = "END_ARRAY"
            java.lang.IllegalStateException r3 = r3.m745(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ᛸᛴᛸᛲ, reason: contains not printable characters */
    public final void m753() {
            r7 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r7.f1384
            if (r2 != 0) goto La
            int r2 = r7.m757()
        La:
            r3 = 39
            r4 = 34
            java.lang.String r5 = "<skipped>"
            r6 = 1
            switch(r2) {
                case 1: goto L6f;
                case 2: goto L5f;
                case 3: goto L59;
                case 4: goto L51;
                case 5: goto L14;
                case 6: goto L14;
                case 7: goto L14;
                case 8: goto L4d;
                case 9: goto L49;
                case 10: goto L45;
                case 11: goto L14;
                case 12: goto L38;
                case 13: goto L2b;
                case 14: goto L1e;
                case 15: goto L14;
                case 16: goto L16;
                case 17: goto L15;
                default: goto L14;
            }
        L14:
            goto L74
        L15:
            return
        L16:
            int r2 = r7.f1388
            int r3 = r7.f1386
            int r2 = r2 + r3
            r7.f1388 = r2
            goto L74
        L1e:
            r7.m738()
            if (r1 != 0) goto L74
            java.lang.String[] r2 = r7.f1390
            int r3 = r7.f1385
            int r3 = r3 - r6
            r2[r3] = r5
            goto L74
        L2b:
            r7.m747(r4)
            if (r1 != 0) goto L74
            java.lang.String[] r2 = r7.f1390
            int r3 = r7.f1385
            int r3 = r3 - r6
            r2[r3] = r5
            goto L74
        L38:
            r7.m747(r3)
            if (r1 != 0) goto L74
            java.lang.String[] r2 = r7.f1390
            int r3 = r7.f1385
            int r3 = r3 - r6
            r2[r3] = r5
            goto L74
        L45:
            r7.m738()
            goto L74
        L49:
            r7.m747(r4)
            goto L74
        L4d:
            r7.m747(r3)
            goto L74
        L51:
            int r2 = r7.f1385
            int r2 = r2 - r6
            r7.f1385 = r2
        L56:
            int r1 = r1 + (-1)
            goto L74
        L59:
            r7.m742(r6)
        L5c:
            int r1 = r1 + 1
            goto L74
        L5f:
            if (r1 != 0) goto L69
            java.lang.String[] r2 = r7.f1390
            int r3 = r7.f1385
            int r3 = r3 - r6
            r4 = 0
            r2[r3] = r4
        L69:
            int r2 = r7.f1385
            int r2 = r2 - r6
            r7.f1385 = r2
            goto L56
        L6f:
            r2 = 3
            r7.m742(r2)
            goto L5c
        L74:
            r7.f1384 = r0
            if (r1 > 0) goto L2
            int[] r0 = r7.f1379
            int r7 = r7.f1385
            int r7 = r7 - r6
            r1 = r0[r7]
            int r1 = r1 + r6
            r0[r7] = r1
            return
    }

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public final java.lang.String m754() {
            r4 = this;
            int r0 = r4.f1389
            int r0 = r0 + 1
            int r1 = r4.f1388
            int r2 = r4.f1387
            int r1 = r1 - r2
            int r1 = r1 + 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " at line "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " column "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " path "
            r2.append(r0)
            r0 = 0
            java.lang.String r4 = r4.m764(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            return r4
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public final boolean m755(int r8) {
            r7 = this;
            int r0 = r7.f1387
            int r1 = r7.f1388
            int r0 = r0 - r1
            r7.f1387 = r0
            int r0 = r7.f1381
            r2 = 0
            char[] r3 = r7.f1378
            if (r0 == r1) goto L15
            int r0 = r0 - r1
            r7.f1381 = r0
            java.lang.System.arraycopy(r3, r1, r3, r2, r0)
            goto L17
        L15:
            r7.f1381 = r2
        L17:
            r7.f1388 = r2
        L19:
            int r0 = r7.f1381
            int r1 = r3.length
            int r1 = r1 - r0
            java.io.StringReader r4 = r7.f1377
            int r0 = r4.read(r3, r0, r1)
            r1 = -1
            if (r0 == r1) goto L4b
            int r1 = r7.f1381
            int r1 = r1 + r0
            r7.f1381 = r1
            int r0 = r7.f1389
            r4 = 1
            if (r0 != 0) goto L48
            int r0 = r7.f1387
            if (r0 != 0) goto L48
            if (r1 <= 0) goto L48
            char r5 = r3[r2]
            r6 = 65279(0xfeff, float:9.1475E-41)
            if (r5 != r6) goto L48
            int r5 = r7.f1388
            int r5 = r5 + r4
            r7.f1388 = r5
            int r0 = r0 + 1
            r7.f1387 = r0
            int r8 = r8 + 1
        L48:
            if (r1 < r8) goto L19
            return r4
        L4b:
            return r2
    }

    /* JADX INFO: renamed from: ᲀᛷᲁᲀ, reason: contains not printable characters */
    public final void m756() {
            r2 = this;
            int r0 = r2.f1384
            if (r0 != 0) goto L8
            int r0 = r2.m757()
        L8:
            r1 = 7
            if (r0 != r1) goto L1b
            r0 = 0
            r2.f1384 = r0
            int[] r0 = r2.f1379
            int r2 = r2.f1385
            int r2 = r2 + (-1)
            r1 = r0[r2]
            int r1 = r1 + 1
            r0[r2] = r1
            return
        L1b:
            java.lang.String r0 = "null"
            java.lang.IllegalStateException r2 = r2.m745(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final int m757() {
            r26 = this;
            r0 = r26
            int[] r1 = r0.f1382
            int r2 = r0.f1385
            r3 = 1
            int r2 = r2 - r3
            r4 = r1[r2]
            r8 = 10
            r10 = 39
            r11 = 6
            r12 = 93
            r13 = 59
            r14 = 44
            r15 = 3
            r16 = 0
            char[] r6 = r0.f1378
            r7 = 4
            r9 = 5
            r20 = 7
            r5 = 2
            if (r4 != r3) goto L25
            r1[r2] = r5
            goto Le1
        L25:
            if (r4 != r5) goto L3f
            int r1 = r0.m760(r3)
            if (r1 == r14) goto Le1
            if (r1 == r13) goto L3a
            if (r1 != r12) goto L34
            r0.f1384 = r7
            return r7
        L34:
            java.lang.String r1 = "Unterminated array"
            r0.m761(r1)
            throw r16
        L3a:
            r0.m763()
            goto Le1
        L3f:
            r5 = 125(0x7d, float:1.75E-43)
            if (r4 == r15) goto L45
            if (r4 != r9) goto L49
        L45:
            r21 = r7
            goto L2d3
        L49:
            if (r4 != r7) goto L7b
            r1[r2] = r9
            int r1 = r0.m760(r3)
            r2 = 58
            if (r1 == r2) goto Le1
            r2 = 61
            if (r1 != r2) goto L75
            r0.m763()
            int r1 = r0.f1388
            int r2 = r0.f1381
            if (r1 < r2) goto L68
            boolean r1 = r0.m755(r3)
            if (r1 == 0) goto Le1
        L68:
            int r1 = r0.f1388
            char r2 = r6[r1]
            r5 = 62
            if (r2 != r5) goto Le1
            int r1 = r1 + r3
            r0.f1388 = r1
            goto Le1
        L75:
            java.lang.String r1 = "Expected ':'"
            r0.m761(r1)
            throw r16
        L7b:
            if (r4 != r11) goto Lc3
            int r1 = r0.f1380
            if (r1 != r3) goto Lbb
            r0.m760(r3)
            int r1 = r0.f1388
            int r2 = r1 + (-1)
            r0.f1388 = r2
            int r1 = r1 + 4
            int r2 = r0.f1381
            if (r1 <= r2) goto L97
            boolean r1 = r0.m755(r9)
            if (r1 != 0) goto L97
            goto Lbb
        L97:
            int r1 = r0.f1388
            char r2 = r6[r1]
            r7 = 41
            if (r2 != r7) goto Lbb
            int r2 = r1 + 1
            char r2 = r6[r2]
            if (r2 != r12) goto Lbb
            int r2 = r1 + 2
            char r2 = r6[r2]
            if (r2 != r5) goto Lbb
            int r2 = r1 + 3
            char r2 = r6[r2]
            if (r2 != r10) goto Lbb
            int r2 = r1 + 4
            char r2 = r6[r2]
            if (r2 == r8) goto Lb8
            goto Lbb
        Lb8:
            int r1 = r1 + r9
            r0.f1388 = r1
        Lbb:
            int[] r1 = r0.f1382
            int r2 = r0.f1385
            int r2 = r2 - r3
            r1[r2] = r20
            goto Le1
        Lc3:
            r1 = r20
            if (r4 != r1) goto Ldd
            r1 = 0
            int r2 = r0.m760(r1)
            r1 = -1
            if (r2 != r1) goto Ld4
            r1 = 17
            r0.f1384 = r1
            return r1
        Ld4:
            r0.m763()
            int r1 = r0.f1388
            int r1 = r1 - r3
            r0.f1388 = r1
            goto Le1
        Ldd:
            r1 = 8
            if (r4 == r1) goto L2cb
        Le1:
            int r1 = r0.m760(r3)
            r2 = 34
            if (r1 == r2) goto L2c6
            if (r1 == r10) goto L2be
            if (r1 == r14) goto L2a5
            if (r1 == r13) goto L2a5
            r2 = 91
            if (r1 == r2) goto L2a2
            if (r1 == r12) goto L29b
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L297
            int r1 = r0.f1388
            int r1 = r1 - r3
            r0.f1388 = r1
            char r1 = r6[r1]
            r2 = 116(0x74, float:1.63E-43)
            if (r1 == r2) goto L12a
            r2 = 84
            if (r1 != r2) goto L109
            goto L12a
        L109:
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L124
            r2 = 70
            if (r1 != r2) goto L112
            goto L124
        L112:
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 == r2) goto L11e
            r2 = 78
            if (r1 != r2) goto L11b
            goto L11e
        L11b:
            r1 = 0
            goto L182
        L11e:
            java.lang.String r1 = "null"
            java.lang.String r2 = "NULL"
            r4 = 7
            goto L12f
        L124:
            java.lang.String r1 = "false"
            java.lang.String r2 = "FALSE"
            r4 = r11
            goto L12f
        L12a:
            java.lang.String r1 = "true"
            java.lang.String r2 = "TRUE"
            r4 = r9
        L12f:
            int r5 = r0.f1380
            if (r5 == r15) goto L135
            r5 = r3
            goto L136
        L135:
            r5 = 0
        L136:
            int r7 = r1.length()
            r10 = 0
        L13b:
            int r12 = r0.f1388
            int r13 = r0.f1381
            if (r10 >= r7) goto L163
            int r12 = r12 + r10
            if (r12 < r13) goto L14d
            int r12 = r10 + 1
            boolean r12 = r0.m755(r12)
            if (r12 != 0) goto L14d
            goto L11b
        L14d:
            int r12 = r0.f1388
            int r12 = r12 + r10
            char r12 = r6[r12]
            char r13 = r1.charAt(r10)
            if (r12 == r13) goto L160
            if (r5 == 0) goto L11b
            char r13 = r2.charAt(r10)
            if (r12 != r13) goto L11b
        L160:
            int r10 = r10 + 1
            goto L13b
        L163:
            int r12 = r12 + r7
            if (r12 < r13) goto L16e
            int r1 = r7 + 1
            boolean r1 = r0.m755(r1)
            if (r1 == 0) goto L17a
        L16e:
            int r1 = r0.f1388
            int r1 = r1 + r7
            char r1 = r6[r1]
            boolean r1 = r0.m749(r1)
            if (r1 == 0) goto L17a
            goto L11b
        L17a:
            int r1 = r0.f1388
            int r1 = r1 + r7
            r0.f1388 = r1
            r0.f1384 = r4
            r1 = r4
        L182:
            if (r1 == 0) goto L185
            return r1
        L185:
            int r1 = r0.f1388
            int r2 = r0.f1381
            r10 = r2
            r13 = r3
            r2 = 0
            r4 = 0
            r7 = 0
            r12 = 0
            r17 = 0
        L192:
            int r14 = r1 + r2
            if (r14 != r10) goto L1ad
            int r1 = r6.length
            if (r2 != r1) goto L19c
        L199:
            r9 = 0
            goto L27c
        L19c:
            int r1 = r2 + 1
            boolean r1 = r0.m755(r1)
            if (r1 != 0) goto L1a9
            r24 = r4
        L1a6:
            r8 = 2
            goto L225
        L1a9:
            int r1 = r0.f1388
            int r10 = r0.f1381
        L1ad:
            int r14 = r1 + r2
            char r14 = r6[r14]
            r8 = 43
            if (r14 == r8) goto L272
            r8 = 69
            if (r14 == r8) goto L26a
            r8 = 101(0x65, float:1.42E-43)
            if (r14 == r8) goto L26a
            r8 = 45
            if (r14 == r8) goto L260
            r8 = 46
            if (r14 == r8) goto L25b
            r8 = 48
            if (r14 < r8) goto L1cd
            r8 = 57
            if (r14 <= r8) goto L1d0
        L1cd:
            r24 = r4
            goto L21e
        L1d0:
            if (r12 == r3) goto L217
            if (r12 != 0) goto L1d5
            goto L217
        L1d5:
            r8 = 2
            if (r12 != r8) goto L200
            int r8 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r8 != 0) goto L1dd
            goto L199
        L1dd:
            r22 = 10
            long r22 = r22 * r4
            int r14 = r14 + (-48)
            r24 = r4
            long r3 = (long) r14
            long r22 = r22 - r3
            r3 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r3 = (r24 > r3 ? 1 : (r24 == r3 ? 0 : -1))
            if (r3 > 0) goto L1fa
            if (r3 != 0) goto L1f8
            int r3 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r3 >= 0) goto L1f8
            goto L1fa
        L1f8:
            r3 = 0
            goto L1fb
        L1fa:
            r3 = 1
        L1fb:
            r13 = r13 & r3
            r4 = r22
            goto L275
        L200:
            r24 = r4
            if (r12 != r15) goto L209
            r4 = r24
            r12 = 4
            goto L275
        L209:
            if (r12 == r9) goto L212
            if (r12 != r11) goto L20e
            goto L212
        L20e:
            r4 = r24
            goto L275
        L212:
            r4 = r24
            r12 = 7
            goto L275
        L217:
            int r14 = r14 + (-48)
            int r3 = -r14
            long r4 = (long) r3
            r12 = 2
            goto L275
        L21e:
            boolean r1 = r0.m749(r14)
            if (r1 != 0) goto L199
            goto L1a6
        L225:
            if (r12 != r8) goto L24c
            if (r13 == 0) goto L232
            r3 = -9223372036854775808
            int r1 = (r24 > r3 ? 1 : (r24 == r3 ? 0 : -1))
            if (r1 != 0) goto L234
            if (r7 == 0) goto L232
            goto L234
        L232:
            r8 = 2
            goto L24c
        L234:
            int r1 = (r24 > r17 ? 1 : (r24 == r17 ? 0 : -1))
            if (r1 != 0) goto L23a
            if (r7 != 0) goto L232
        L23a:
            r4 = r24
            if (r7 == 0) goto L23f
            goto L240
        L23f:
            long r4 = -r4
        L240:
            r0.f1383 = r4
            int r1 = r0.f1388
            int r1 = r1 + r2
            r0.f1388 = r1
            r9 = 15
            r0.f1384 = r9
            goto L27c
        L24c:
            if (r12 == r8) goto L254
            r1 = 4
            if (r12 == r1) goto L254
            r1 = 7
            if (r12 != r1) goto L199
        L254:
            r0.f1386 = r2
            r9 = 16
            r0.f1384 = r9
            goto L27c
        L25b:
            r3 = 2
            if (r12 != r3) goto L199
            r12 = r15
            goto L275
        L260:
            r3 = 2
            if (r12 != 0) goto L266
            r7 = 1
            r12 = 1
            goto L275
        L266:
            if (r12 != r9) goto L199
        L268:
            r12 = r11
            goto L275
        L26a:
            r3 = 2
            if (r12 == r3) goto L270
            r3 = 4
            if (r12 != r3) goto L199
        L270:
            r12 = r9
            goto L275
        L272:
            if (r12 != r9) goto L199
            goto L268
        L275:
            int r2 = r2 + 1
            r3 = 1
            r8 = 10
            goto L192
        L27c:
            if (r9 == 0) goto L27f
            return r9
        L27f:
            int r1 = r0.f1388
            char r1 = r6[r1]
            boolean r1 = r0.m749(r1)
            if (r1 == 0) goto L291
            r0.m763()
            r1 = 10
            r0.f1384 = r1
            return r1
        L291:
            java.lang.String r1 = "Expected value"
            r0.m761(r1)
            throw r16
        L297:
            r8 = r3
            r0.f1384 = r8
            return r8
        L29b:
            r8 = r3
            if (r4 != r8) goto L2a6
            r1 = 4
            r0.f1384 = r1
            return r1
        L2a2:
            r0.f1384 = r15
            return r15
        L2a5:
            r8 = r3
        L2a6:
            if (r4 == r8) goto L2b2
            r3 = 2
            if (r4 != r3) goto L2ac
            goto L2b2
        L2ac:
            java.lang.String r1 = "Unexpected value"
            r0.m761(r1)
            throw r16
        L2b2:
            r0.m763()
            int r1 = r0.f1388
            int r1 = r1 - r8
            r0.f1388 = r1
            r1 = 7
            r0.f1384 = r1
            return r1
        L2be:
            r0.m763()
            r1 = 8
            r0.f1384 = r1
            return r1
        L2c6:
            r1 = 9
            r0.f1384 = r1
            return r1
        L2cb:
            java.lang.String r0 = "JsonReader is closed"
            xhss.C0532.m950(r0)
            r19 = 0
            return r19
        L2d3:
            r1[r2] = r21
            if (r4 != r9) goto L2ef
            r8 = 1
            int r1 = r0.m760(r8)
            if (r1 == r14) goto L2ef
            if (r1 == r13) goto L2ec
            if (r1 != r5) goto L2e6
            r8 = 2
            r0.f1384 = r8
            return r8
        L2e6:
            java.lang.String r1 = "Unterminated object"
            r0.m761(r1)
            throw r16
        L2ec:
            r0.m763()
        L2ef:
            r8 = 1
            int r1 = r0.m760(r8)
            r2 = 34
            if (r1 == r2) goto L328
            if (r1 == r10) goto L320
            java.lang.String r2 = "Expected name"
            if (r1 == r5) goto L316
            r0.m763()
            int r3 = r0.f1388
            int r3 = r3 - r8
            r0.f1388 = r3
            char r1 = (char) r1
            boolean r1 = r0.m749(r1)
            if (r1 == 0) goto L312
            r1 = 14
            r0.f1384 = r1
            return r1
        L312:
            r0.m761(r2)
            throw r16
        L316:
            if (r4 == r9) goto L31c
            r8 = 2
            r0.f1384 = r8
            return r8
        L31c:
            r0.m761(r2)
            throw r16
        L320:
            r0.m763()
            r1 = 12
            r0.f1384 = r1
            return r1
        L328:
            r1 = 13
            r0.f1384 = r1
            return r1
    }

    /* JADX INFO: renamed from: ᲁᛲᛴᛴ, reason: contains not printable characters */
    public final long m758() {
            r7 = this;
            int r0 = r7.f1384
            if (r0 != 0) goto L8
            int r0 = r7.m757()
        L8:
            r1 = 15
            r2 = 0
            if (r0 != r1) goto L1e
            r7.f1384 = r2
            int[] r0 = r7.f1379
            int r1 = r7.f1385
            int r1 = r1 + (-1)
            r2 = r0[r1]
            int r2 = r2 + 1
            r0[r1] = r2
            long r0 = r7.f1383
            return r0
        L1e:
            r1 = 16
            if (r0 != r1) goto L37
            java.lang.String r0 = new java.lang.String
            int r1 = r7.f1388
            int r3 = r7.f1386
            char[] r4 = r7.f1378
            r0.<init>(r4, r1, r3)
            r7.f1391 = r0
            int r0 = r7.f1388
            int r1 = r7.f1386
            int r0 = r0 + r1
            r7.f1388 = r0
            goto L79
        L37:
            r1 = 10
            r3 = 8
            if (r0 == r3) goto L4b
            r4 = 9
            if (r0 == r4) goto L4b
            if (r0 != r1) goto L44
            goto L4b
        L44:
            java.lang.String r0 = "a long"
            java.lang.IllegalStateException r7 = r7.m745(r0)
            throw r7
        L4b:
            if (r0 != r1) goto L54
            java.lang.String r0 = r7.m740()
            r7.f1391 = r0
            goto L61
        L54:
            if (r0 != r3) goto L59
            r0 = 39
            goto L5b
        L59:
            r0 = 34
        L5b:
            java.lang.String r0 = r7.m737(r0)
            r7.f1391 = r0
        L61:
            r7.m736(r0)
            java.lang.String r0 = r7.f1391     // Catch: java.lang.NumberFormatException -> L79
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L79
            r7.f1384 = r2     // Catch: java.lang.NumberFormatException -> L79
            int[] r3 = r7.f1379     // Catch: java.lang.NumberFormatException -> L79
            int r4 = r7.f1385     // Catch: java.lang.NumberFormatException -> L79
            int r4 = r4 + (-1)
            r5 = r3[r4]     // Catch: java.lang.NumberFormatException -> L79
            int r5 = r5 + 1
            r3[r4] = r5     // Catch: java.lang.NumberFormatException -> L79
            return r0
        L79:
            r0 = 11
            r7.f1384 = r0
            java.lang.String r0 = r7.f1391
            double r0 = java.lang.Double.parseDouble(r0)
            long r3 = (long) r0
            double r5 = (double) r3
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L9b
            r0 = 0
            r7.f1391 = r0
            r7.f1384 = r2
            int[] r0 = r7.f1379
            int r7 = r7.f1385
            int r7 = r7 + (-1)
            r1 = r0[r7]
            int r1 = r1 + 1
            r0[r7] = r1
            return r3
        L9b:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r7.f1391
            java.lang.String r7 = r7.m754()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected a long but was "
            r2.<init>(r3)
            r2.append(r1)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r0.<init>(r7)
            throw r0
    }

    /* JADX INFO: renamed from: ᲁᛴᛴᛸ, reason: contains not printable characters */
    public final char m759() {
            r9 = this;
            int r0 = r9.f1388
            int r1 = r9.f1381
            r2 = 0
            java.lang.String r3 = "Unterminated escape sequence"
            r4 = 1
            if (r0 != r1) goto L15
            boolean r0 = r9.m755(r4)
            if (r0 == 0) goto L11
            goto L15
        L11:
            r9.m761(r3)
            throw r2
        L15:
            int r0 = r9.f1388
            int r1 = r0 + 1
            r9.f1388 = r1
            char[] r5 = r9.f1378
            char r6 = r5[r0]
            r7 = 3
            r8 = 10
            if (r6 == r8) goto Lb8
            r1 = 34
            if (r6 == r1) goto Lc7
            r1 = 39
            if (r6 == r1) goto Lc3
            r1 = 47
            if (r6 == r1) goto Lc7
            r1 = 92
            if (r6 == r1) goto Lc7
            r1 = 98
            if (r6 == r1) goto Lb5
            r1 = 102(0x66, float:1.43E-43)
            if (r6 == r1) goto Lb2
            r4 = 110(0x6e, float:1.54E-43)
            if (r6 == r4) goto Lb1
            r4 = 114(0x72, float:1.6E-43)
            if (r6 == r4) goto Lae
            r4 = 116(0x74, float:1.63E-43)
            if (r6 == r4) goto Lab
            r4 = 117(0x75, float:1.64E-43)
            if (r6 != r4) goto La5
            int r0 = r0 + 5
            int r4 = r9.f1381
            r6 = 4
            if (r0 <= r4) goto L5e
            boolean r0 = r9.m755(r6)
            if (r0 == 0) goto L5a
            goto L5e
        L5a:
            r9.m761(r3)
            throw r2
        L5e:
            int r0 = r9.f1388
            int r3 = r0 + 4
            r4 = 0
        L63:
            if (r0 >= r3) goto L9e
            char r7 = r5[r0]
            int r4 = r4 << 4
            r8 = 48
            if (r7 < r8) goto L76
            r8 = 57
            if (r7 > r8) goto L76
            int r7 = r7 + (-48)
        L73:
            int r7 = r7 + r4
            r4 = r7
            goto L8a
        L76:
            r8 = 97
            if (r7 < r8) goto L7f
            if (r7 > r1) goto L7f
            int r7 = r7 + (-87)
            goto L73
        L7f:
            r8 = 65
            if (r7 < r8) goto L8d
            r8 = 70
            if (r7 > r8) goto L8d
            int r7 = r7 + (-55)
            goto L73
        L8a:
            int r0 = r0 + 1
            goto L63
        L8d:
            java.lang.String r0 = new java.lang.String
            int r1 = r9.f1388
            r0.<init>(r5, r1, r6)
            java.lang.String r1 = "Malformed Unicode escape \\u"
            java.lang.String r0 = r1.concat(r0)
            r9.m761(r0)
            throw r2
        L9e:
            int r0 = r9.f1388
            int r0 = r0 + r6
            r9.f1388 = r0
            char r9 = (char) r4
            return r9
        La5:
            java.lang.String r0 = "Invalid escape sequence"
            r9.m761(r0)
            throw r2
        Lab:
            r9 = 9
            return r9
        Lae:
            r9 = 13
            return r9
        Lb1:
            return r8
        Lb2:
            r9 = 12
            return r9
        Lb5:
            r9 = 8
            return r9
        Lb8:
            int r0 = r9.f1380
            if (r0 == r7) goto Lce
            int r0 = r9.f1389
            int r0 = r0 + r4
            r9.f1389 = r0
            r9.f1387 = r1
        Lc3:
            int r0 = r9.f1380
            if (r0 == r7) goto Lc8
        Lc7:
            return r6
        Lc8:
            java.lang.String r0 = "Invalid escaped character \"'\" in strict mode"
            r9.m761(r0)
            throw r2
        Lce:
            java.lang.String r0 = "Cannot escape a newline character in strict mode"
            r9.m761(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ᲁᛴᲇᛲ, reason: contains not printable characters */
    public final int m760(boolean r10) {
            r9 = this;
            int r0 = r9.f1388
            int r1 = r9.f1381
        L4:
            r2 = 1
            if (r0 != r1) goto L27
            r9.f1388 = r0
            boolean r0 = r9.m755(r2)
            if (r0 != 0) goto L23
            if (r10 != 0) goto L13
            r9 = -1
            return r9
        L13:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r9 = r9.m754()
            java.lang.String r0 = "End of input"
            java.lang.String r9 = r0.concat(r9)
            r10.<init>(r9)
            throw r10
        L23:
            int r0 = r9.f1388
            int r1 = r9.f1381
        L27:
            int r3 = r0 + 1
            char[] r4 = r9.f1378
            char r5 = r4[r0]
            r6 = 10
            if (r5 != r6) goto L3a
            int r0 = r9.f1389
            int r0 = r0 + r2
            r9.f1389 = r0
            r9.f1387 = r3
            goto Ld6
        L3a:
            r7 = 32
            if (r5 == r7) goto Ld6
            r7 = 13
            if (r5 == r7) goto Ld6
            r7 = 9
            if (r5 != r7) goto L48
            goto Ld6
        L48:
            r7 = 47
            if (r5 != r7) goto Lc1
            r9.f1388 = r3
            r8 = 2
            if (r3 != r1) goto L5f
            r9.f1388 = r0
            boolean r0 = r9.m755(r8)
            int r1 = r9.f1388
            int r1 = r1 + r2
            r9.f1388 = r1
            if (r0 != 0) goto L5f
            goto L6c
        L5f:
            r9.m763()
            int r0 = r9.f1388
            char r1 = r4[r0]
            r3 = 42
            if (r1 == r3) goto L79
            if (r1 == r7) goto L6d
        L6c:
            return r5
        L6d:
            int r0 = r0 + 1
            r9.f1388 = r0
            r9.m748()
            int r0 = r9.f1388
            int r1 = r9.f1381
            goto L4
        L79:
            int r0 = r0 + 1
            r9.f1388 = r0
        L7d:
            int r0 = r9.f1388
            int r0 = r0 + r8
            int r1 = r9.f1381
            if (r0 <= r1) goto L92
            boolean r0 = r9.m755(r8)
            if (r0 == 0) goto L8b
            goto L92
        L8b:
            java.lang.String r10 = "Unterminated comment"
            r9.m761(r10)
            r9 = 0
            throw r9
        L92:
            int r0 = r9.f1388
            char r1 = r4[r0]
            if (r1 != r6) goto La2
            int r1 = r9.f1389
            int r1 = r1 + r2
            r9.f1389 = r1
            int r0 = r0 + 1
            r9.f1387 = r0
            goto Lb2
        La2:
            r0 = 0
        La3:
            int r1 = r9.f1388
            if (r0 >= r8) goto Lbb
            int r1 = r1 + r0
            char r1 = r4[r1]
            java.lang.String r3 = "*/"
            char r3 = r3.charAt(r0)
            if (r1 == r3) goto Lb8
        Lb2:
            int r0 = r9.f1388
            int r0 = r0 + r2
            r9.f1388 = r0
            goto L7d
        Lb8:
            int r0 = r0 + 1
            goto La3
        Lbb:
            int r0 = r1 + 2
            int r1 = r9.f1381
            goto L4
        Lc1:
            r0 = 35
            if (r5 != r0) goto Ld3
            r9.f1388 = r3
            r9.m763()
            r9.m748()
            int r0 = r9.f1388
            int r1 = r9.f1381
            goto L4
        Ld3:
            r9.f1388 = r3
            return r5
        Ld6:
            r0 = r3
            goto L4
    }

    /* JADX INFO: renamed from: ᲁᛷᲇᲇ, reason: contains not printable characters */
    public final void m761(java.lang.String r3) {
            r2 = this;
            xhss.ᲈᲇᲁᲈ r0 = new xhss.ᲈᲇᲁᲈ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r2 = r2.m754()
            r1.append(r2)
            java.lang.String r2 = "\nSee "
            r1.append(r2)
            java.lang.String r2 = "malformed-json"
            java.lang.String r3 = "https://github.com/google/gson/blob/main/Troubleshooting.md#"
            java.lang.String r2 = r3.concat(r2)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    /* JADX INFO: renamed from: ᲁᲁᛴᲁ, reason: contains not printable characters */
    public final int m762() {
            r1 = this;
            int r0 = r1.f1384
            if (r0 != 0) goto L8
            int r0 = r1.m757()
        L8:
            switch(r0) {
                case 1: goto L26;
                case 2: goto L24;
                case 3: goto L22;
                case 4: goto L20;
                case 5: goto L1d;
                case 6: goto L1d;
                case 7: goto L1a;
                case 8: goto L18;
                case 9: goto L18;
                case 10: goto L18;
                case 11: goto L18;
                case 12: goto L16;
                case 13: goto L16;
                case 14: goto L16;
                case 15: goto L14;
                case 16: goto L14;
                case 17: goto L11;
                default: goto Lb;
            }
        Lb:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L11:
            r1 = 10
            return r1
        L14:
            r1 = 7
            return r1
        L16:
            r1 = 5
            return r1
        L18:
            r1 = 6
            return r1
        L1a:
            r1 = 9
            return r1
        L1d:
            r1 = 8
            return r1
        L20:
            r1 = 2
            return r1
        L22:
            r1 = 1
            return r1
        L24:
            r1 = 4
            return r1
        L26:
            r1 = 3
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final void m763() {
            r2 = this;
            int r0 = r2.f1380
            r1 = 1
            if (r0 != r1) goto L6
            return
        L6:
            java.lang.String r0 = "Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON"
            r2.m761(r0)
            r2 = 0
            throw r2
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public final java.lang.String m764(boolean r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "$"
            r0.<init>(r1)
            r1 = 0
        L8:
            int r2 = r4.f1385
            if (r1 >= r2) goto L4c
            int[] r3 = r4.f1382
            r3 = r3[r1]
            switch(r3) {
                case 1: goto L2e;
                case 2: goto L2e;
                case 3: goto L1f;
                case 4: goto L1f;
                case 5: goto L1f;
                case 6: goto L49;
                case 7: goto L49;
                case 8: goto L49;
                default: goto L13;
            }
        L13:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.String r5 = "Unknown scope value: "
            java.lang.String r5 = xhss.AbstractC0390.m774(r5, r3)
            r4.<init>(r5)
            throw r4
        L1f:
            r2 = 46
            r0.append(r2)
            java.lang.String[] r2 = r4.f1390
            r2 = r2[r1]
            if (r2 == 0) goto L49
            r0.append(r2)
            goto L49
        L2e:
            int[] r3 = r4.f1379
            r3 = r3[r1]
            if (r5 == 0) goto L3c
            if (r3 <= 0) goto L3c
            int r2 = r2 + (-1)
            if (r1 != r2) goto L3c
            int r3 = r3 + (-1)
        L3c:
            r2 = 91
            r0.append(r2)
            r0.append(r3)
            r2 = 93
            r0.append(r2)
        L49:
            int r1 = r1 + 1
            goto L8
        L4c:
            java.lang.String r4 = r0.toString()
            return r4
    }

    /* JADX INFO: renamed from: ᲈᛲᛵᲁ, reason: contains not printable characters */
    public final java.lang.String m765() {
            r2 = this;
            int r0 = r2.f1384
            if (r0 != 0) goto L8
            int r0 = r2.m757()
        L8:
            r1 = 14
            if (r0 != r1) goto L11
            java.lang.String r0 = r2.m740()
            goto L26
        L11:
            r1 = 12
            if (r0 != r1) goto L1c
            r0 = 39
            java.lang.String r0 = r2.m737(r0)
            goto L26
        L1c:
            r1 = 13
            if (r0 != r1) goto L32
            r0 = 34
            java.lang.String r0 = r2.m737(r0)
        L26:
            r1 = 0
            r2.f1384 = r1
            java.lang.String[] r1 = r2.f1390
            int r2 = r2.f1385
            int r2 = r2 + (-1)
            r1[r2] = r0
            return r0
        L32:
            java.lang.String r0 = "a name"
            java.lang.IllegalStateException r2 = r2.m745(r0)
            throw r2
    }
}
