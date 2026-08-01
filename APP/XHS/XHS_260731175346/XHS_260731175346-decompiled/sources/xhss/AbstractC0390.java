package xhss;

/* JADX INFO: renamed from: xhss.ᛴᛸᛲᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0390 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final /* synthetic */ int[] f1395 = null;

    static {
            r0 = 15
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15} // fill-array
            xhss.AbstractC0390.f1395 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static java.lang.Double m767(java.lang.String r6, xhss.C0385 r7) {
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
            int r4 = r7.f1380     // Catch: java.lang.NumberFormatException -> L16
            if (r4 != r2) goto L1d
        L1c:
            return r3
        L1d:
            xhss.ᲈᲇᲁᲈ r4 = new xhss.ᲈᲇᲁᲈ     // Catch: java.lang.NumberFormatException -> L16
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L16
            r5.<init>(r1)     // Catch: java.lang.NumberFormatException -> L16
            r5.append(r3)     // Catch: java.lang.NumberFormatException -> L16
            r5.append(r0)     // Catch: java.lang.NumberFormatException -> L16
            java.lang.String r1 = r7.m764(r2)     // Catch: java.lang.NumberFormatException -> L16
            r5.append(r1)     // Catch: java.lang.NumberFormatException -> L16
            java.lang.String r1 = r5.toString()     // Catch: java.lang.NumberFormatException -> L16
            r4.<init>(r1)     // Catch: java.lang.NumberFormatException -> L16
            throw r4     // Catch: java.lang.NumberFormatException -> L16
        L39:
            xhss.ᛵᛲᛲᲇ r3 = new xhss.ᛵᛲᛲᲇ
            java.lang.String r7 = r7.m764(r2)
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

    /* JADX INFO: renamed from: ᛱᛳᲁᲈ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m768(int r0) {
            switch(r0) {
                case 1: goto L21;
                case 2: goto L1e;
                case 3: goto L1b;
                case 4: goto L18;
                case 5: goto L15;
                case 6: goto L12;
                case 7: goto Lf;
                case 8: goto Lc;
                case 9: goto L9;
                case 10: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "null"
            return r0
        L6:
            java.lang.String r0 = "END_DOCUMENT"
            return r0
        L9:
            java.lang.String r0 = "NULL"
            return r0
        Lc:
            java.lang.String r0 = "BOOLEAN"
            return r0
        Lf:
            java.lang.String r0 = "NUMBER"
            return r0
        L12:
            java.lang.String r0 = "STRING"
            return r0
        L15:
            java.lang.String r0 = "NAME"
            return r0
        L18:
            java.lang.String r0 = "END_OBJECT"
            return r0
        L1b:
            java.lang.String r0 = "BEGIN_OBJECT"
            return r0
        L1e:
            java.lang.String r0 = "END_ARRAY"
            return r0
        L21:
            java.lang.String r0 = "BEGIN_ARRAY"
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛴᲀᲈ, reason: contains not printable characters */
    public static /* synthetic */ int[] m769(int r3) {
            int[] r0 = new int[r3]
            int[] r1 = xhss.AbstractC0390.f1395
            r2 = 0
            java.lang.System.arraycopy(r1, r2, r0, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ᛳᛶᛷᲀ, reason: contains not printable characters */
    public static void m770(long r0, long r2, xhss.C0960 r4) {
            xhss.AbstractC0775.m1313(r0)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r2)
            xhss.C0960.m1571(r4, r0)
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static int m771(char[] r10) {
            int r0 = r10.length
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            if (r2 >= r0) goto L26
            char r4 = r10[r2]
            r5 = 7
            int[] r5 = m769(r5)
            int r6 = r5.length
            r7 = r1
        Lf:
            if (r7 >= r6) goto L21
            r8 = r5[r7]
            char r9 = m785(r8)
            if (r9 != r4) goto L1e
            int r4 = m789(r8)
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

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public static java.lang.String m772(java.lang.Class r0, java.lang.StringBuilder r1) {
            xhss.ᛱᛸᛷᛸ r0 = xhss.AbstractC0256.m565(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    /* JADX INFO: renamed from: ᛴᲈᛱᛴ, reason: contains not printable characters */
    public static xhss.C0960 m773(long r1) {
            xhss.ᲁᛶᛷ r0 = new xhss.ᲁᛶᛷ
            r0.<init>()
            xhss.AbstractC0775.m1313(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public static java.lang.String m774(java.lang.String r1, int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static java.lang.String m775(java.lang.String r5) {
            int r0 = r5.length()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L50
            char r3 = r5.charAt(r2)
            boolean r4 = java.lang.Character.isLetter(r3)
            if (r4 == 0) goto L4d
            boolean r0 = java.lang.Character.isUpperCase(r3)
            if (r0 == 0) goto L19
            goto L50
        L19:
            char r0 = java.lang.Character.toUpperCase(r3)
            r3 = 1
            if (r2 != 0) goto L34
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r5 = r5.substring(r3)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
        L34:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = r5.substring(r1, r2)
            r4.<init>(r1)
            r4.append(r0)
            int r2 = r2 + r3
            java.lang.String r5 = r5.substring(r2)
            r4.append(r5)
            java.lang.String r5 = r4.toString()
            return r5
        L4d:
            int r2 = r2 + 1
            goto L6
        L50:
            return r5
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static java.lang.Number m776(int r4, xhss.C0385 r5) {
            r0 = 1
            if (r4 == r0) goto L5c
            r1 = 2
            if (r4 == r1) goto L52
            r1 = 3
            if (r4 == r1) goto L33
            java.lang.String r4 = r5.m739()
            java.math.BigDecimal r4 = xhss.AbstractC1178.m1867(r4)     // Catch: java.lang.NumberFormatException -> L12
            return r4
        L12:
            r1 = move-exception
            xhss.ᛵᛲᛲᲇ r2 = new xhss.ᛵᛲᛲᲇ
            java.lang.String r5 = r5.m764(r0)
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
            java.lang.String r4 = r5.m739()
            r0 = 46
            int r0 = r4.indexOf(r0)
            if (r0 < 0) goto L44
            java.lang.Double r4 = m767(r4, r5)
            goto L51
        L44:
            long r0 = java.lang.Long.parseLong(r4)     // Catch: java.lang.NumberFormatException -> L4d
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L4d
            goto L51
        L4d:
            java.lang.Double r4 = m767(r4, r5)
        L51:
            return r4
        L52:
            xhss.ᛴᛷᛴᲇ r4 = new xhss.ᛴᛷᛴᲇ
            java.lang.String r5 = r5.m739()
            r4.<init>(r5)
            return r4
        L5c:
            double r4 = r5.m746()
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            return r4
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public static java.lang.Long m777(java.lang.Long r2, com.tencent.mmkv.MMKV r3, java.lang.String r4) {
            long r0 = r2.longValue()
            long r2 = r3.getLong(r4, r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            return r2
    }

    /* JADX INFO: renamed from: ᛸᛲᛷᛱ, reason: contains not printable characters */
    public static xhss.C0616 m778(long r2) {
            xhss.ᛶᲈᛷᲁ r0 = new xhss.ᛶᲈᛷᲁ
            r1 = 1
            r0.<init>(r1)
            xhss.AbstractC0775.m1313(r2)
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static com.tencent.mmkv.MMKV m779(java.lang.StringBuilder r0, java.lang.String r1, long r2, java.lang.String r4) {
            r0.append(r1)
            java.lang.String r1 = xhss.AbstractC0775.m1313(r2)
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            xhss.C1085.m1750(r0)
            com.tencent.mmkv.MMKV r0 = xhss.C0210.m475()
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static int m780(long r0, java.lang.String r2, long r3) {
            xhss.AbstractC0775.m1313(r0)
            xhss.AbstractC0775.m1313(r3)
            int r0 = r2.length()
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public static java.lang.String m781(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public static java.lang.String m782(int r1, int r2, java.lang.String r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r1)
            r0.append(r4)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public static com.tencent.mmkv.MMKV m783(xhss.C0210 r0, long r1) {
            r0.getClass()
            com.tencent.mmkv.MMKV r0 = xhss.C0210.m476()
            xhss.AbstractC0775.m1313(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᲀᛷᲁᲀ, reason: contains not printable characters */
    public static /* synthetic */ int m784(int r0) {
            if (r0 == 0) goto L5
            int r0 = r0 + (-1)
            return r0
        L5:
            r0 = 0
            throw r0
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static /* synthetic */ char m785(int r0) {
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

    /* JADX INFO: renamed from: ᲁᛲᛴᛴ, reason: contains not printable characters */
    public static /* synthetic */ void m786(java.lang.Object r0) {
            if (r0 != 0) goto L3
            return
        L3:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ᲁᛴᲇᛲ, reason: contains not printable characters */
    public static void m787(long r0, long r2, xhss.C0960 r4) {
            xhss.AbstractC0775.m1313(r0)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r2)
            xhss.C0960.m1573(r4, r0)
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static java.lang.String m788(java.lang.String r5, char r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r5.length()
            r2 = 0
        La:
            if (r2 >= r1) goto L25
            char r3 = r5.charAt(r2)
            boolean r4 = java.lang.Character.isUpperCase(r3)
            if (r4 == 0) goto L1f
            int r4 = r0.length()
            if (r4 == 0) goto L1f
            r0.append(r6)
        L1f:
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L25:
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static /* synthetic */ int m789(int r0) {
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

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public static java.lang.String m790(long r0, long r2, xhss.C0960 r4) {
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            xhss.C0960.m1571(r4, r0)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r2)
            return r0
    }

    /* JADX INFO: renamed from: ᲈᛲᛵᲁ, reason: contains not printable characters */
    public static void m791(java.lang.StringBuilder r0, java.lang.String r1, char r2) {
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            xhss.C1085.m1750(r0)
            return
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public static java.lang.Integer m792(java.lang.Integer r0, com.tencent.mmkv.MMKV r1, java.lang.String r2) {
            int r0 = r0.intValue()
            int r0 = r1.getInt(r2, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }
}
