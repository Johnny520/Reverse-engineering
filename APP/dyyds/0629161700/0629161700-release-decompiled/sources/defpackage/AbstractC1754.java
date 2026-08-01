package defpackage;

/* JADX INFO: renamed from: ᲀᲁᛵᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1754 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final defpackage.C0454 f7737 = null;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static final defpackage.C2086 f7738 = null;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static volatile boolean f7739 = true;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static final defpackage.C0454 f7740 = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final defpackage.C0454 f7741 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final char[] f7742 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static volatile android.os.Handler f7743;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final char[] f7744 = null;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static final defpackage.C2086 f7745 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final char[] f7746 = null;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final defpackage.C0454 f7747 = null;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static final defpackage.C0454 f7748 = null;

    static {
            r0 = 16
            char[] r1 = new char[r0]
            r1 = {x0056: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            defpackage.AbstractC1754.f7744 = r1
            r1 = 64
            char[] r1 = new char[r1]
            defpackage.AbstractC1754.f7746 = r1
            char[] r0 = new char[r0]
            r0 = {x006a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            defpackage.AbstractC1754.f7742 = r0
            ᛳᛴᛵᛱ r0 = new ᛳᛴᛵᛱ
            java.lang.String r1 = "COMPLETING_ALREADY"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.AbstractC1754.f7741 = r0
            ᛳᛴᛵᛱ r0 = new ᛳᛴᛵᛱ
            java.lang.String r1 = "COMPLETING_WAITING_CHILDREN"
            r0.<init>(r1, r2)
            defpackage.AbstractC1754.f7747 = r0
            ᛳᛴᛵᛱ r0 = new ᛳᛴᛵᛱ
            java.lang.String r1 = "COMPLETING_RETRY"
            r0.<init>(r1, r2)
            defpackage.AbstractC1754.f7748 = r0
            ᛳᛴᛵᛱ r0 = new ᛳᛴᛵᛱ
            java.lang.String r1 = "TOO_LATE_TO_CANCEL"
            r0.<init>(r1, r2)
            defpackage.AbstractC1754.f7737 = r0
            ᛳᛴᛵᛱ r0 = new ᛳᛴᛵᛱ
            java.lang.String r1 = "SEALED"
            r0.<init>(r1, r2)
            defpackage.AbstractC1754.f7740 = r0
            ᲇᛷᛳᛷ r0 = new ᲇᛷᛳᛷ
            r1 = 0
            r0.<init>(r1)
            defpackage.AbstractC1754.f7745 = r0
            ᲇᛷᛳᛷ r0 = new ᲇᛷᛳᛷ
            r1 = 1
            r0.<init>(r1)
            defpackage.AbstractC1754.f7738 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static int m3135(int r2, int r3, int r4) {
            if (r3 > r4) goto L9
            if (r2 >= r3) goto L5
            return r3
        L5:
            if (r2 <= r4) goto L8
            return r4
        L8:
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot coerce value to an empty range: maximum "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " is less than minimum "
            r0.append(r4)
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static int m3136(android.graphics.Bitmap r5) {
            boolean r0 = r5.isRecycled()
            if (r0 != 0) goto L15
            int r5 = r5.getAllocationByteCount()     // Catch: java.lang.NullPointerException -> Lb
            return r5
        Lb:
            int r0 = r5.getHeight()
            int r5 = r5.getRowBytes()
            int r5 = r5 * r0
            return r5
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot obtain size for recycled Bitmap: "
            r1.<init>(r2)
            r1.append(r5)
            int r2 = r5.getWidth()
            int r3 = r5.getHeight()
            android.graphics.Bitmap$Config r5 = r5.getConfig()
            java.lang.String r4 = "["
            r1.append(r4)
            r1.append(r2)
            java.lang.String r2 = "x"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = "] "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static int m3137(android.graphics.Bitmap.Config r2) {
            if (r2 != 0) goto L4
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L4:
            int[] r0 = defpackage.AbstractC2206.f9417
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L1c
            r0 = 2
            if (r2 == r0) goto L1c
            r1 = 3
            if (r2 == r1) goto L1c
            r0 = 4
            if (r2 == r0) goto L19
            return r0
        L19:
            r2 = 8
            return r2
        L1c:
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static long m3138(long r3) {
            r0 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto La
            return r0
        La:
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L14
            return r0
        L14:
            return r3
    }

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public static int m3139(defpackage.C0106 r3) {
            ᛴᛸᲈᲈ r0 = defpackage.AbstractC1482.f6568
            boolean r0 = r3.isEmpty()     // Catch: java.lang.IllegalArgumentException -> L44
            if (r0 != 0) goto L30
            int r0 = r3.f9423     // Catch: java.lang.IllegalArgumentException -> L44
            int r3 = r3.f9424     // Catch: java.lang.IllegalArgumentException -> L44
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 >= r1) goto L1a
            int r0 = r0 + 1
            ᛴᛸᲈᲈ r1 = defpackage.AbstractC1482.f6568     // Catch: java.lang.IllegalArgumentException -> L44
            int r3 = r1.mo1888(r3, r0)     // Catch: java.lang.IllegalArgumentException -> L44
            return r3
        L1a:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 <= r1) goto L29
            int r3 = r3 + (-1)
            ᛴᛸᲈᲈ r1 = defpackage.AbstractC1482.f6568     // Catch: java.lang.IllegalArgumentException -> L44
            int r3 = r1.mo1888(r3, r0)     // Catch: java.lang.IllegalArgumentException -> L44
            int r3 = r3 + 1
            return r3
        L29:
            ᛴᛸᲈᲈ r3 = defpackage.AbstractC1482.f6568     // Catch: java.lang.IllegalArgumentException -> L44
            int r3 = r3.mo1660()     // Catch: java.lang.IllegalArgumentException -> L44
            return r3
        L30:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L44
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L44
            java.lang.String r2 = "Cannot get random in empty range: "
            r1.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L44
            r1.append(r3)     // Catch: java.lang.IllegalArgumentException -> L44
            java.lang.String r3 = r1.toString()     // Catch: java.lang.IllegalArgumentException -> L44
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L44
            throw r0     // Catch: java.lang.IllegalArgumentException -> L44
        L44:
            r3 = move-exception
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r3 = r3.getMessage()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public static long m3140(int r13, java.lang.String r14) {
            r0 = 0
            int r1 = m3150(r14, r0, r13, r0)
            java.util.regex.Pattern r2 = defpackage.C0837.f3848
            java.util.regex.Matcher r2 = r2.matcher(r14)
            r3 = -1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L12:
            r10 = 2
            r11 = 1
            if (r1 >= r13) goto La0
            int r12 = r1 + 1
            int r12 = m3150(r14, r12, r13, r11)
            r2.region(r1, r12)
            if (r5 != r3) goto L47
            java.util.regex.Pattern r1 = defpackage.C0837.f3848
            java.util.regex.Matcher r1 = r2.usePattern(r1)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L47
            java.lang.String r1 = r2.group(r11)
            int r5 = java.lang.Integer.parseInt(r1)
            java.lang.String r1 = r2.group(r10)
            int r8 = java.lang.Integer.parseInt(r1)
            r1 = 3
            java.lang.String r1 = r2.group(r1)
            int r9 = java.lang.Integer.parseInt(r1)
            goto L98
        L47:
            if (r6 != r3) goto L5e
            java.util.regex.Pattern r1 = defpackage.C0837.f3847
            java.util.regex.Matcher r1 = r2.usePattern(r1)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L5e
            java.lang.String r1 = r2.group(r11)
            int r6 = java.lang.Integer.parseInt(r1)
            goto L98
        L5e:
            if (r7 != r3) goto L82
            java.util.regex.Pattern r1 = defpackage.C0837.f3846
            java.util.regex.Matcher r10 = r2.usePattern(r1)
            boolean r10 = r10.matches()
            if (r10 == 0) goto L82
            java.lang.String r7 = r2.group(r11)
            java.util.Locale r10 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r10)
            java.lang.String r1 = r1.pattern()
            r10 = 6
            int r1 = defpackage.AbstractC1347.m2517(r1, r7, r0, r0, r10)
            int r7 = r1 / 4
            goto L98
        L82:
            if (r4 != r3) goto L98
            java.util.regex.Pattern r1 = defpackage.C0837.f3845
            java.util.regex.Matcher r1 = r2.usePattern(r1)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L98
            java.lang.String r1 = r2.group(r11)
            int r4 = java.lang.Integer.parseInt(r1)
        L98:
            int r12 = r12 + 1
            int r1 = m3150(r14, r12, r13, r0)
            goto L12
        La0:
            r13 = 70
            if (r13 > r4) goto Laa
            r14 = 100
            if (r4 >= r14) goto Laa
            int r4 = r4 + 1900
        Laa:
            if (r4 < 0) goto Lb0
            if (r4 >= r13) goto Lb0
            int r4 = r4 + 2000
        Lb0:
            r13 = 1601(0x641, float:2.243E-42)
            r1 = 0
            java.lang.String r14 = "Failed requirement."
            if (r4 < r13) goto L112
            if (r7 == r3) goto L10e
            if (r11 > r6) goto L10a
            r13 = 32
            if (r6 >= r13) goto L10a
            if (r5 < 0) goto L106
            r13 = 24
            if (r5 >= r13) goto L106
            if (r8 < 0) goto L102
            r13 = 60
            if (r8 >= r13) goto L102
            if (r9 < 0) goto Lfe
            if (r9 >= r13) goto Lfe
            java.util.GregorianCalendar r13 = new java.util.GregorianCalendar
            java.util.TimeZone r14 = defpackage.AbstractC0508.f2501
            r13.<init>(r14)
            r13.setLenient(r0)
            r13.set(r11, r4)
            int r7 = r7 - r11
            r13.set(r10, r7)
            r14 = 5
            r13.set(r14, r6)
            r14 = 11
            r13.set(r14, r5)
            r14 = 12
            r13.set(r14, r8)
            r14 = 13
            r13.set(r14, r9)
            r14 = 14
            r13.set(r14, r0)
            long r13 = r13.getTimeInMillis()
            return r13
        Lfe:
            defpackage.C2264.m3684(r14)
            return r1
        L102:
            defpackage.C2264.m3684(r14)
            return r1
        L106:
            defpackage.C2264.m3684(r14)
            return r1
        L10a:
            defpackage.C2264.m3684(r14)
            return r1
        L10e:
            defpackage.C2264.m3684(r14)
            return r1
        L112:
            defpackage.C2264.m3684(r14)
            return r1
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public static android.os.Handler m3141() {
            android.os.Handler r0 = defpackage.AbstractC1754.f7743
            if (r0 != 0) goto L1d
            java.lang.Class<ᲀᲁᛵᲁ> r0 = defpackage.AbstractC1754.class
            monitor-enter(r0)
            android.os.Handler r1 = defpackage.AbstractC1754.f7743     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L19
            android.os.Handler r1 = new android.os.Handler     // Catch: java.lang.Throwable -> L17
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            defpackage.AbstractC1754.f7743 = r1     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r1 = move-exception
            goto L1b
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            goto L1d
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
        L1d:
            android.os.Handler r0 = defpackage.AbstractC1754.f7743
            return r0
    }

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public static android.graphics.drawable.Drawable m3142(android.content.Context r1, int r2, android.content.res.Resources.Theme r3) {
            if (r3 == 0) goto L2d
            ᛴᛱᲈᛳ r0 = new ᛴᛱᲈᛳ
            r0.<init>(r1)
            r0.f3032 = r3
            android.content.res.Resources r1 = r3.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            android.content.res.Resources r3 = r0.f3028
            if (r3 != 0) goto L27
            android.content.res.Configuration r3 = r0.f3029
            if (r3 != 0) goto L21
            android.content.res.Configuration r3 = new android.content.res.Configuration
            r3.<init>(r1)
            r0.f3029 = r3
            goto L2c
        L21:
            java.lang.String r1 = "Override configuration has already been set"
            defpackage.C2264.m3676(r1)
            goto L2c
        L27:
            java.lang.String r1 = "getResources() or getAssets() has already been called"
            defpackage.C2264.m3676(r1)
        L2c:
            r1 = r0
        L2d:
            android.graphics.drawable.Drawable r1 = defpackage.AbstractC1592.m2873(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ᛴᲀᲁᛴ, reason: contains not printable characters */
    public static defpackage.C0106 m3143(int r2, int r3) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 > r0) goto L9
            ᛱᛵᲇᲇ r2 = defpackage.C0106.f937
            ᛱᛵᲇᲇ r2 = defpackage.C0106.f937
            return r2
        L9:
            ᛱᛵᲇᲇ r0 = new ᛱᛵᲇᲇ
            r1 = 1
            int r3 = r3 - r1
            r0.<init>(r2, r3, r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static boolean m3144(java.lang.Object r0, java.lang.Object r1) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
        L8:
            boolean r0 = r0.equals(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public static android.graphics.drawable.Drawable m3145(android.content.Context r1, android.content.Context r2, int r3, android.content.res.Resources.Theme r4) {
            boolean r0 = defpackage.AbstractC1754.f7739     // Catch: java.lang.IllegalStateException -> L9 java.lang.NoClassDefFoundError -> L1e android.content.res.Resources.NotFoundException -> L21
            if (r0 == 0) goto L21
            android.graphics.drawable.Drawable r1 = m3142(r2, r3, r4)     // Catch: java.lang.IllegalStateException -> L9 java.lang.NoClassDefFoundError -> L1e android.content.res.Resources.NotFoundException -> L21
            return r1
        L9:
            r4 = move-exception
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = r2.getPackageName()
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1d
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r3)
            return r1
        L1d:
            throw r4
        L1e:
            r1 = 0
            defpackage.AbstractC1754.f7739 = r1
        L21:
            if (r4 == 0) goto L24
            goto L28
        L24:
            android.content.res.Resources$Theme r4 = r2.getTheme()
        L28:
            android.content.res.Resources r1 = r2.getResources()
            java.lang.ThreadLocal r2 = defpackage.AbstractC2064.f8872
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final void m3146(boolean r5, android.view.View... r6) {
            int r0 = r6.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L13
            r3 = r6[r2]
            if (r5 == 0) goto Lb
            r4 = r1
            goto Ld
        Lb:
            r4 = 8
        Ld:
            r3.setVisibility(r4)
            int r2 = r2 + 1
            goto L3
        L13:
            return
    }

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public static defpackage.C1688 m3147(java.nio.MappedByteBuffer r14) {
            java.nio.ByteBuffer r14 = r14.duplicate()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r14.order(r0)
            int r0 = r14.position()
            int r0 = r0 + 4
            r14.position(r0)
            short r0 = r14.getShort()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r1 = 100
            r2 = 0
            java.lang.String r3 = "Cannot read metadata."
            if (r0 > r1) goto Ld4
            int r1 = r14.position()
            int r1 = r1 + 6
            r14.position(r1)
            r1 = 0
            r4 = r1
        L2c:
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r7 = -1
            if (r4 >= r0) goto L5a
            int r9 = r14.getInt()
            int r10 = r14.position()
            int r10 = r10 + 4
            r14.position(r10)
            int r10 = r14.getInt()
            long r10 = (long) r10
            long r10 = r10 & r5
            int r12 = r14.position()
            int r12 = r12 + 4
            r14.position(r12)
            r12 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r12 != r9) goto L57
            goto L5b
        L57:
            int r4 = r4 + 1
            goto L2c
        L5a:
            r10 = r7
        L5b:
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 == 0) goto Ld0
            int r0 = r14.position()
            long r7 = (long) r0
            long r7 = r10 - r7
            int r0 = (int) r7
            int r4 = r14.position()
            int r4 = r4 + r0
            r14.position(r4)
            int r0 = r14.position()
            int r0 = r0 + 12
            r14.position(r0)
            int r0 = r14.getInt()
            long r7 = (long) r0
            long r7 = r7 & r5
        L7e:
            long r12 = (long) r1
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r0 >= 0) goto Ld0
            int r0 = r14.getInt()
            int r4 = r14.getInt()
            long r12 = (long) r4
            long r12 = r12 & r5
            r14.getInt()
            r4 = 1164798569(0x456d6a69, float:3798.6506)
            if (r4 == r0) goto L9e
            r4 = 1701669481(0x656d6a69, float:7.0072736E22)
            if (r4 != r0) goto L9b
            goto L9e
        L9b:
            int r1 = r1 + 1
            goto L7e
        L9e:
            long r12 = r12 + r10
            int r0 = (int) r12
            r14.position(r0)
            ᲀᛶᛴᲇ r0 = new ᲀᛶᛴᲇ
            r0.<init>()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r14.order(r1)
            int r1 = r14.position()
            int r1 = r14.getInt(r1)
            int r2 = r14.position()
            int r2 = r2 + r1
            r0.f5769 = r14
            r0.f5768 = r2
            int r14 = r14.getInt(r2)
            int r2 = r2 - r14
            r0.f5767 = r2
            java.lang.Object r14 = r0.f5769
            java.nio.ByteBuffer r14 = (java.nio.ByteBuffer) r14
            short r14 = r14.getShort(r2)
            r0.f5766 = r14
            return r0
        Ld0:
            defpackage.C2264.m3682(r3)
            return r2
        Ld4:
            defpackage.C2264.m3682(r3)
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static void m3148(android.content.Context r24, com.ss.android.ugc.aweme.feed.model.Aweme r25, defpackage.C0892 r26, android.view.View r27) {
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            boolean r3 = defpackage.AbstractC2093.m3516(r0, r3)
            if (r3 != 0) goto L10
            goto L575
        L10:
            ᛶᲀᛵ r3 = defpackage.C1141.f5173
            r3.getClass()
            ᲀᲇᛸᛶ r3 = defpackage.C1141.f5095
            ᲁᛷᛶᛶ[] r4 = defpackage.C1141.f5221
            r5 = 147(0x93, float:2.06E-43)
            r4 = r4[r5]
            java.lang.Object r3 = r3.m3169(r4)
            java.util.Set r3 = (java.util.Set) r3
            r4 = -148881030946350(0xffff7897ef0961d2, double:NaN)
            java.lang.String r4 = "location"
            boolean r4 = r3.contains(r4)
            android.widget.LinearLayout r5 = r2.f4022
            android.widget.Button r6 = r2.f4031
            android.view.View r7 = r2.f4044
            android.widget.LinearLayout r8 = r2.f4025
            android.widget.LinearLayout r9 = r2.f4018
            android.view.View r10 = r2.f4029
            android.widget.LinearLayout r11 = r2.f4047
            android.view.View r12 = r2.f4017
            android.widget.LinearLayout r13 = r2.f4038
            android.view.View r14 = r2.f4045
            r15 = -148919685652014(0xffff788eef0961d2, double:NaN)
            android.view.View r15 = r2.f4024
            r16 = -148975520226862(0xffff7881ef0961d2, double:NaN)
            r16 = r5
            r5 = 2
            r17 = r7
            android.view.View[] r7 = new android.view.View[r5]
            r27 = r5
            r5 = 0
            r7[r5] = r16
            r16 = r5
            r5 = 1
            r7[r5] = r15
            m3146(r4, r7)
            r18 = -149044239703598(0xffff7871ef0961d2, double:NaN)
            java.lang.String r4 = "publish_time"
            boolean r4 = r3.contains(r4)
            android.widget.LinearLayout r7 = r2.f4032
            r18 = -149100074278446(0xffff7864ef0961d2, double:NaN)
            android.view.View[] r15 = new android.view.View[r5]
            r15[r16] = r7
            m3146(r4, r15)
            r18 = -149168793755182(0xffff7854ef0961d2, double:NaN)
            java.lang.String r4 = "duration"
            boolean r4 = r3.contains(r4)
            r18 = -149207448460846(0xffff784bef0961d2, double:NaN)
            r18 = -149263283035694(0xffff783eef0961d2, double:NaN)
            android.view.View r7 = r2.f4035
            r18 = -149301937741358(0xffff7835ef0961d2, double:NaN)
            r15 = 3
            r18 = r5
            android.view.View[] r5 = new android.view.View[r15]
            r5[r16] = r14
            r5[r18] = r13
            r5[r27] = r7
            m3146(r4, r5)
            r4 = -149370657218094(0xffff7825ef0961d2, double:NaN)
            java.lang.String r4 = "statistics"
            boolean r4 = r3.contains(r4)
            android.widget.LinearLayout r5 = r2.f4036
            r19 = -149417901858350(0xffff781aef0961d2, double:NaN)
            android.view.View r7 = r2.f4040
            r19 = -149482326367790(0xffff780bef0961d2, double:NaN)
            r15 = r27
            r20 = r5
            android.view.View[] r5 = new android.view.View[r15]
            r5[r16] = r20
            r5[r18] = r7
            m3146(r4, r5)
            r4 = -149559635779118(0xffff77f9ef0961d2, double:NaN)
            java.lang.String r4 = "video"
            boolean r4 = r3.contains(r4)
            android.widget.LinearLayout r5 = r2.f4023
            r20 = -149585405582894(0xffff77f3ef0961d2, double:NaN)
            r7 = r18
            android.view.View[] r15 = new android.view.View[r7]
            r15[r16] = r5
            m3146(r4, r15)
            r4 = -149645535125038(0xffff77e5ef0961d2, double:NaN)
            r4 = -149688484797998(0xffff77dbef0961d2, double:NaN)
            r15 = 2
            android.view.View[] r4 = new android.view.View[r15]
            r4[r16] = r12
            r4[r7] = r11
            r5 = r16
            m3146(r5, r4)
            r20 = -149722844536366(0xffff77d3ef0961d2, double:NaN)
            r20 = -149774384143918(0xffff77c7ef0961d2, double:NaN)
            android.view.View[] r4 = new android.view.View[r15]
            r4[r5] = r10
            r4[r7] = r9
            m3146(r5, r4)
            r20 = -149817333816878(0xffff77bdef0961d2, double:NaN)
            java.lang.String r4 = "music"
            boolean r4 = r3.contains(r4)
            r20 = -149843103620654(0xffff77b7ef0961d2, double:NaN)
            r20 = -149903233162798(0xffff77a9ef0961d2, double:NaN)
            android.view.View[] r5 = new android.view.View[r15]
            r5[r16] = r8
            r5[r7] = r17
            m3146(r4, r5)
            r4 = -149959067737646(0xffff779cef0961d2, double:NaN)
            java.lang.String r4 = "statistics"
            boolean r4 = r3.contains(r4)
            if (r4 == 0) goto L1e1
            ᛲᲀᛱᲁ r4 = defpackage.C0346.f1773
            r20 = -150006312377902(0xffff7791ef0961d2, double:NaN)
            java.lang.String r5 = "statistics"
            r4.getClass()
            java.lang.Object r4 = defpackage.C0346.m1039(r1, r5)
            android.widget.TextView r5 = r2.f4026
            java.util.Map r7 = defpackage.C1746.f7729
            r20 = -150053557018158(0xffff7786ef0961d2, double:NaN)
            java.lang.String r7 = "digg_count"
            java.lang.Object r7 = defpackage.C0346.m1039(r4, r7)
            java.lang.String r7 = defpackage.C1746.m3128(r7)
            r5.setText(r7)
            android.widget.TextView r5 = r2.f4042
            r20 = -150100801658414(0xffff777bef0961d2, double:NaN)
            java.lang.String r7 = "comment_count"
            java.lang.Object r7 = defpackage.C0346.m1039(r4, r7)
            java.lang.String r7 = defpackage.C1746.m3128(r7)
            r5.setText(r7)
            android.widget.TextView r5 = r2.f4039
            r20 = -150160931200558(0xffff776def0961d2, double:NaN)
            java.lang.String r7 = "collect_count"
            java.lang.Object r7 = defpackage.C0346.m1039(r4, r7)
            java.lang.String r7 = defpackage.C1746.m3128(r7)
            r5.setText(r7)
            android.widget.TextView r5 = r2.f4030
            r20 = -150221060742702(0xffff775fef0961d2, double:NaN)
            java.lang.String r7 = "share_count"
            java.lang.Object r4 = defpackage.C0346.m1039(r4, r7)
            java.lang.String r4 = defpackage.C1746.m3128(r4)
            r5.setText(r4)
        L1e1:
            java.util.Map r4 = defpackage.C1746.f7729
            java.lang.String r4 = defpackage.C1746.m3133(r1)
            r20 = -352393761300014(0xfffebf7fef0961d2, double:NaN)
            com.ss.android.ugc.aweme.music.model.Music r5 = r1.music
            r7 = 0
            if (r5 == 0) goto L203
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r5.playUrl
            if (r5 == 0) goto L203
            java.util.List r5 = r5.urlList
            if (r5 == 0) goto L203
            java.lang.Object r5 = defpackage.AbstractC1107.m2124(r5)
            java.lang.String r5 = (java.lang.String) r5
            goto L204
        L203:
            r5 = r7
        L204:
            r20 = -150272600350254(0xffff7753ef0961d2, double:NaN)
            java.lang.String r15 = "publish_time"
            boolean r15 = r3.contains(r15)
            if (r15 == 0) goto L21f
            android.widget.TextView r15 = r2.f4019
            r20 = r5
            java.lang.String r5 = defpackage.C1746.m3131(r1, r7)
            r15.setText(r5)
            goto L221
        L21f:
            r20 = r5
        L221:
            r21 = -150328434925102(0xffff7746ef0961d2, double:NaN)
            java.lang.String r5 = "location"
            boolean r5 = r3.contains(r5)
            if (r5 == 0) goto L242
            ᛷᲈᛳᛳ r5 = defpackage.AbstractC1140.m2170()
            ᛲᛷᛶᛸ r15 = new ᛲᛷᛶᛸ
            r21 = r8
            r8 = 14
            r15.<init>(r1, r2, r7, r8)
            r8 = 3
            defpackage.AbstractC0397.m1149(r5, r7, r15, r8)
            goto L244
        L242:
            r21 = r8
        L244:
            r22 = -150367089630766(0xffff773def0961d2, double:NaN)
            java.lang.String r5 = "music"
            boolean r5 = r3.contains(r5)
            if (r5 == 0) goto L269
            if (r20 == 0) goto L269
            boolean r5 = defpackage.AbstractC1347.m2524(r20)
            if (r5 == 0) goto L25c
            goto L269
        L25c:
            android.widget.Button r5 = r2.f4033
            ᛳᛲᛶᛶ r8 = new ᛳᛲᛶᛶ
            r15 = 18
            r8.<init>(r0, r15, r1)
            r5.setOnClickListener(r8)
            goto L286
        L269:
            r22 = -150392859434542(0xffff7737ef0961d2, double:NaN)
            r22 = -150452988976686(0xffff7729ef0961d2, double:NaN)
            r15 = 2
            android.view.View[] r5 = new android.view.View[r15]
            r8 = 0
            r5[r8] = r21
            r18 = 1
            r5[r18] = r17
            m3146(r8, r5)
        L286:
            r20 = -150508823551534(0xffff771cef0961d2, double:NaN)
            java.lang.String r5 = "video"
            boolean r5 = r3.contains(r5)
            if (r5 == 0) goto L2a8
            ᲇᛸᲀᲁ r5 = new ᲇᛸᲀᲁ
            r8 = 22
            r5.<init>(r4, r0, r1, r8)
            r6.setOnClickListener(r5)
            ᲀᛱᛳᛶ r4 = new ᲀᛱᛳᛶ
            r5 = 6
            r4.<init>(r5, r1)
            r6.setOnLongClickListener(r4)
        L2a8:
            r4 = -352363696528942(0xfffebf86ef0961d2, double:NaN)
            java.lang.String r4 = r1.desc
            if (r4 != 0) goto L2bd
            r4 = -352389466332718(0xfffebf80ef0961d2, double:NaN)
            java.lang.String r4 = ""
        L2bd:
            boolean r5 = defpackage.AbstractC1347.m2524(r4)
            if (r5 != 0) goto L2db
            r5 = -150534593355310(0xffff7716ef0961d2, double:NaN)
            java.lang.String r5 = "description"
            boolean r5 = r3.contains(r5)
            if (r5 == 0) goto L2db
            android.widget.TextView r5 = r2.f4037
            r8 = 0
            r5.setVisibility(r8)
            r5.setText(r4)
        L2db:
            boolean r5 = defpackage.AbstractC1347.m2524(r4)
            if (r5 != 0) goto L316
            r5 = -150586132962862(0xffff770aef0961d2, double:NaN)
            java.lang.String r5 = "description"
            boolean r5 = r3.contains(r5)
            if (r5 == 0) goto L316
            r5 = -150637672570414(0xffff76feef0961d2, double:NaN)
            java.lang.String r5 = "copy_description"
            boolean r5 = r3.contains(r5)
            if (r5 == 0) goto L316
            android.widget.Button r5 = r2.f4043
            r20 = -150710687014446(0xffff76edef0961d2, double:NaN)
            r8 = 0
            r5.setVisibility(r8)
            ᛱᛱᛵᛴ r6 = new ᛱᛱᛵᛴ
            r15 = 2
            r6.<init>(r0, r4, r15)
            r5.setOnClickListener(r6)
        L316:
            r4 = -150775111523886(0xffff76deef0961d2, double:NaN)
            java.lang.String r4 = "duration"
            boolean r4 = r3.contains(r4)
            if (r4 == 0) goto L368
            java.lang.Integer r4 = r1.duration
            if (r4 == 0) goto L333
            ᲈᲈᲁᛶ r5 = defpackage.C2374.f10260
            r5.getClass()
            java.lang.String r4 = defpackage.C2374.m3890(r4)
            goto L334
        L333:
            r4 = r7
        L334:
            if (r4 != 0) goto L33f
            r4 = -150813766229550(0xffff76d5ef0961d2, double:NaN)
            java.lang.String r4 = ""
        L33f:
            boolean r5 = defpackage.AbstractC1347.m2524(r4)
            if (r5 != 0) goto L34b
            android.widget.TextView r5 = r2.f4046
            r5.setText(r4)
            goto L368
        L34b:
            r4 = -150818061196846(0xffff76d4ef0961d2, double:NaN)
            r4 = -150856715902510(0xffff76cbef0961d2, double:NaN)
            r15 = 2
            android.view.View[] r4 = new android.view.View[r15]
            r8 = 0
            r4[r8] = r13
            r18 = 1
            r4[r18] = r14
            m3146(r8, r4)
        L368:
            com.ss.android.ugc.aweme.feed.model.Video r4 = r1.video
            if (r4 == 0) goto L372
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r4.cover
            if (r4 == 0) goto L372
            java.util.List r7 = r4.urlList
        L372:
            r4 = -150912550477358(0xffff76beef0961d2, double:NaN)
            java.lang.String r4 = "cover"
            boolean r4 = r3.contains(r4)
            ᛸᛶᛵᛲ r5 = defpackage.C1506.f6658
            if (r4 == 0) goto L44d
            if (r7 == 0) goto L44d
            boolean r4 = r7.isEmpty()
            if (r4 == 0) goto L38d
            goto L44d
        L38d:
            r13 = -150938320281134(0xffff76b8ef0961d2, double:NaN)
            r13 = -150981269954094(0xffff76aeef0961d2, double:NaN)
            r15 = 2
            android.view.View[] r4 = new android.view.View[r15]
            r16 = 0
            r4[r16] = r12
            r6 = 1
            r4[r6] = r11
            m3146(r6, r4)
            ᛶᛸᛱᲀ r4 = defpackage.C1121.f5003
            java.lang.String r4 = defpackage.C1121.m2137(r7)
            android.widget.ImageView r6 = r2.f4041
            android.content.Context r7 = r6.getContext()
            if (r7 == 0) goto L3dc
            if (r4 == 0) goto L3dc
            ᲈᛲᛵᲀ r7 = com.bumptech.glide.ComponentCallbacks2C0007.m234(r7)
            ᲀᛷᛴᲀ r7 = r7.m3586(r4)
            ᲇᛴᛸᲇ r7 = r7.m3439(r5)
            ᲀᛷᛴᲀ r7 = (defpackage.C1706) r7
            r7.getClass()
            ᛳᛸᛲᛲ r8 = defpackage.C0521.f2571
            ᛷᛸᛱᛳ r11 = new ᛷᛸᛱᛳ
            r11.<init>()
            ᲇᛴᛸᲇ r7 = r7.m3444(r8, r11)
            ᲀᛷᛴᲀ r7 = (defpackage.C1706) r7
            r7.m3097(r6)
            goto L442
        L3dc:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r11 = -383738432626222(0xfffea2fdef0961d2, double:NaN)
            java.lang.String r11 = "context = "
            r8.<init>(r11)
            r8.append(r7)
            r11 = -383785677266478(0xfffea2f2ef0961d2, double:NaN)
            java.lang.String r7 = " url = "
            r8.append(r7)
            r8.append(r4)
            r11 = -383820037004846(0xfffea2eaef0961d2, double:NaN)
            java.lang.String r7 = " view = "
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            r11 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            int r7 = defpackage.AbstractC0225.m818(r7, r6, r11)
            if (r7 != 0) goto L420
            goto L442
        L420:
            int r7 = r6.length()
            r8 = 0
        L425:
            if (r8 >= r7) goto L442
            int r11 = r8 + 2000
            if (r11 <= r7) goto L42c
            r11 = r7
        L42c:
            java.lang.String r8 = r6.substring(r8, r11)
            r12 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r12 = defpackage.C0346.f1773
            r12.getClass()
            defpackage.C0346.m1040(r8)
            r8 = r11
            goto L425
        L442:
            android.widget.Button r6 = r2.f4027
            ᛱᛱᛵᛴ r7 = new ᛱᛱᛵᛴ
            r8 = 3
            r7.<init>(r0, r4, r8)
            r6.setOnClickListener(r7)
        L44d:
            java.util.List r4 = r1.images
            ᛲᲀᛱᲁ r6 = defpackage.C0346.f1773
            r7 = -151015629692462(0xffff76a6ef0961d2, double:NaN)
            java.lang.String r7 = "photosCurPos"
            r6.getClass()
            java.lang.Object r1 = defpackage.C0346.m1035(r1, r7)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r6 = -151071464267310(0xffff7699ef0961d2, double:NaN)
            java.lang.String r6 = "current_image"
            boolean r3 = r3.contains(r6)
            if (r3 == 0) goto L575
            if (r1 == 0) goto L575
            int r3 = r1.intValue()
            if (r3 < 0) goto L575
            if (r4 == 0) goto L575
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L575
            r6 = -151131593809454(0xffff768bef0961d2, double:NaN)
            r6 = -151183133417006(0xffff767fef0961d2, double:NaN)
            r15 = 2
            android.view.View[] r3 = new android.view.View[r15]
            r16 = 0
            r3[r16] = r10
            r6 = 1
            r3[r6] = r9
            m3146(r6, r3)
            int r3 = r4.size()
            android.widget.TextView r7 = r2.f4020
            if (r3 <= r6) goto L4ca
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r8 = "第"
            r3.<init>(r8)
            int r8 = r1.intValue()
            int r8 = r8 + r6
            r3.append(r8)
            r8 = -151226083089966(0xffff7675ef0961d2, double:NaN)
            java.lang.String r6 = "张图片"
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r7.setText(r3)
            goto L4d6
        L4ca:
            r8 = -151243262959150(0xffff7671ef0961d2, double:NaN)
            java.lang.String r3 = "当前图片"
            r7.setText(r3)
        L4d6:
            int r1 = r1.intValue()
            java.lang.Object r1 = r4.get(r1)
            com.ss.ugc.aweme.ImageUrlStruct r1 = (com.ss.ugc.aweme.ImageUrlStruct) r1
            java.util.List r3 = r1.urlList
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r6 = r3.iterator()
        L4eb:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L52a
            java.lang.Object r7 = r6.next()
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            r9 = -151264737795630(0xffff766cef0961d2, double:NaN)
            java.lang.String r9 = ".jpeg"
            r10 = 0
            boolean r9 = defpackage.AbstractC1347.m2500(r8, r9, r10)
            if (r9 != 0) goto L526
            r11 = -151290507599406(0xffff7666ef0961d2, double:NaN)
            java.lang.String r9 = ".png"
            boolean r9 = defpackage.AbstractC1347.m2500(r8, r9, r10)
            if (r9 != 0) goto L526
            r11 = -151311982435886(0xffff7661ef0961d2, double:NaN)
            java.lang.String r9 = ".webp"
            boolean r8 = defpackage.AbstractC1347.m2500(r8, r9, r10)
            if (r8 == 0) goto L4eb
        L526:
            r4.add(r7)
            goto L4eb
        L52a:
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto L531
            r3 = r4
        L531:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L540
            java.util.Map r3 = defpackage.C1746.f7729
            com.ss.android.ugc.aweme.feed.model.Video r3 = r1.video
            java.lang.String r3 = defpackage.C1746.m3132(r3)
            goto L546
        L540:
            java.lang.Object r3 = defpackage.AbstractC1107.m2122(r3)
            java.lang.String r3 = (java.lang.String) r3
        L546:
            ᲈᛲᛵᲀ r4 = com.bumptech.glide.ComponentCallbacks2C0007.m234(r0)
            ᲀᛷᛴᲀ r4 = r4.m3586(r3)
            ᲇᛴᛸᲇ r4 = r4.m3439(r5)
            ᲀᛷᛴᲀ r4 = (defpackage.C1706) r4
            r4.getClass()
            ᛳᛸᛲᛲ r5 = defpackage.C0521.f2571
            ᛷᛸᛱᛳ r6 = new ᛷᛸᛱᛳ
            r6.<init>()
            ᲇᛴᛸᲇ r4 = r4.m3444(r5, r6)
            ᲀᛷᛴᲀ r4 = (defpackage.C1706) r4
            android.widget.ImageView r5 = r2.f4034
            r4.m3097(r5)
            android.widget.Button r2 = r2.f4021
            ᲇᛸᲀᲁ r4 = new ᲇᛸᲀᲁ
            r5 = 23
            r4.<init>(r1, r0, r3, r5)
            r2.setOnClickListener(r4)
        L575:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.C1525 m3149() {
            ᛸᛷᛱᛷ r0 = new ᛸᛷᛱᛷ
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static int m3150(java.lang.String r4, int r5, int r6, boolean r7) {
        L0:
            if (r5 >= r6) goto L3c
            char r0 = r4.charAt(r5)
            r1 = 32
            r2 = 1
            if (r0 >= r1) goto Lf
            r1 = 9
            if (r0 != r1) goto L33
        Lf:
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 >= r1) goto L33
            r1 = 48
            r3 = 58
            if (r1 > r0) goto L1c
            if (r0 >= r3) goto L1c
            goto L33
        L1c:
            r1 = 97
            if (r1 > r0) goto L25
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 >= r1) goto L25
            goto L33
        L25:
            r1 = 65
            if (r1 > r0) goto L2e
            r1 = 91
            if (r0 >= r1) goto L2e
            goto L33
        L2e:
            if (r0 != r3) goto L31
            goto L33
        L31:
            r0 = 0
            goto L34
        L33:
            r0 = r2
        L34:
            r1 = r7 ^ 1
            if (r0 != r1) goto L39
            return r5
        L39:
            int r5 = r5 + 1
            goto L0
        L3c:
            return r6
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static java.util.ArrayList m3151(java.util.Collection r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        Ld:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r2.next()
            if (r1 == 0) goto Ld
            r0.add(r1)
            goto Ld
        L1d:
            return r0
    }

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public static void m3152(android.content.Context r17, java.util.List r18, com.ss.android.ugc.aweme.feed.model.Aweme r19) {
            r0 = -79062042582574(0xffffb817ef0961d2, double:NaN)
            r0 = -79096402320942(0xffffb80fef0961d2, double:NaN)
            r0 = -79139351993902(0xffffb805ef0961d2, double:NaN)
            android.view.LayoutInflater r0 = defpackage.AbstractC1668.m3063(r17)
            r1 = 1712062581(0x660c0075, float:1.6528493E23)
            r2 = 0
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r2, r3)
            r1 = 1711866002(0x66090092, float:1.6174368E23)
            android.view.View r4 = defpackage.AbstractC1193.m2331(r0, r1)
            android.widget.Button r4 = (android.widget.Button) r4
            if (r4 == 0) goto L192
            r1 = 1711866011(0x6609009b, float:1.6174384E23)
            android.view.View r5 = defpackage.AbstractC1193.m2331(r0, r1)
            android.widget.Button r5 = (android.widget.Button) r5
            if (r5 == 0) goto L192
            r1 = 1711866653(0x6609031d, float:1.6175541E23)
            android.view.View r6 = defpackage.AbstractC1193.m2331(r0, r1)
            r8 = r6
            com.android.app.CustomRecyclerView r8 = (com.android.app.CustomRecyclerView) r8
            if (r8 == 0) goto L192
            r1 = 1711866900(0x66090414, float:1.6175986E23)
            android.view.View r6 = defpackage.AbstractC1193.m2331(r0, r1)
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L192
            ᛶᲈᛱᲈ r1 = new ᛶᲈᛱᲈ
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.<init>()
            r1.f5356 = r4
            r9 = -79165121797678(0xffffb7ffef0961d2, double:NaN)
            androidx.recyclerview.widget.LinearLayoutManager r7 = new androidx.recyclerview.widget.LinearLayoutManager
            r7.<init>(r3)
            r8.setLayoutManager(r7)
            ᛸᛱᛴᲁ r14 = new ᛸᛱᛴᲁ
            r14.<init>()
            ᛳᲁᛳᛴ r15 = defpackage.AbstractC1628.m2975()
            ᛸᛱᛴᲁ r7 = new ᛸᛱᛴᲁ
            r7.<init>()
            ᛵᲁᛸᛸ r9 = new ᛵᲁᛸᛸ
            ᛷᛷᲀᛳ r10 = new ᛷᛷᲀᛳ
            r11 = 3
            r10.<init>(r15, r11, r14)
            ᲈᲈᛸᲁ r11 = new ᲈᲈᛸᲁ
            r12 = 2
            r11.<init>(r12, r1)
            r13 = r18
            r2 = r19
            r9.<init>(r13, r2, r10, r11)
            r7.f6211 = r9
            r8.setAdapter(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r10 = -79276790947374(0xffffb7e5ef0961d2, double:NaN)
            java.lang.String r10 = "图片信息("
            r9.<init>(r10)
            int r10 = r13.size()
            r9.append(r10)
            r10 = 41
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r6.setText(r9)
            m3153(r1, r3)
            ᛷᛸᛱᛸ r1 = new ᛷᛸᛱᛸ
            r1.<init>(r8)
            android.content.Context r6 = r8.getContext()
            r9 = 1711800407(0x66080057, float:1.6056203E23)
            android.graphics.drawable.Drawable r9 = defpackage.AbstractC1592.m2873(r6, r9)
            r1.f5856 = r9
            r9 = 1711800406(0x66080056, float:1.6056201E23)
            android.graphics.drawable.Drawable r6 = defpackage.AbstractC1592.m2873(r6, r9)
            r1.f5857 = r6
            ᲀᛵᛳᲁ r6 = defpackage.AbstractC1533.f6753
            r1.f5859 = r6
            r6 = r7
            ᛳᲁᛶᲀ r7 = new ᛳᲁᛶᲀ
            ᲁᛷᛵ r9 = new ᲁᛷᛵ
            r9.<init>(r8)
            java.lang.Object r10 = r1.f5856
            android.graphics.drawable.Drawable r10 = (android.graphics.drawable.Drawable) r10
            java.lang.Object r11 = r1.f5857
            android.graphics.drawable.Drawable r11 = (android.graphics.drawable.Drawable) r11
            java.lang.Object r1 = r1.f5859
            ᛸᛶᲈᛵ r1 = (defpackage.InterfaceC1521) r1
            ᲁᛶᲀᛷ r13 = new ᲁᛶᲀᛷ
            r13.<init>(r8)
            r16 = r12
            r12 = r1
            r1 = r16
            r7.<init>(r8, r9, r10, r11, r12, r13)
            android.app.AlertDialog$Builder r7 = new android.app.AlertDialog$Builder
            r11 = r17
            r7.<init>(r11)
            r8 = 1
            android.app.AlertDialog$Builder r7 = r7.setCancelable(r8)
            android.app.AlertDialog$Builder r0 = r7.setView(r0)
            android.app.AlertDialog r0 = r0.create()
            r7 = -79302560751150(0xffffb7dfef0961d2, double:NaN)
            r14.f6211 = r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L150
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>(r3)
            r0.setBackgroundDrawable(r7)
            r3 = 17
            r0.setGravity(r3)
            android.content.res.Resources r3 = r11.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.widthPixels
            double r7 = (double) r3
            r9 = 4605831338911806259(0x3feb333333333333, double:0.85)
            double r7 = r7 * r9
            int r3 = (int) r7
            android.content.res.Resources r7 = r11.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            int r7 = r7.heightPixels
            double r7 = (double) r7
            double r7 = r7 * r9
            int r7 = (int) r7
            r0.setLayout(r3, r7)
            r3 = 16973826(0x1030002, float:2.4060906E-38)
            r0.setWindowAnimations(r3)
        L150:
            java.lang.Object r0 = r14.f6211
            if (r0 != 0) goto L15e
            r7 = -79384165129774(0xffffb7ccef0961d2, double:NaN)
            r0 = 0
            goto L160
        L15e:
            android.app.AlertDialog r0 = (android.app.AlertDialog) r0
        L160:
            r0.show()
            java.lang.Object r0 = r14.f6211
            if (r0 != 0) goto L171
            r7 = -79414229900846(0xffffb7c5ef0961d2, double:NaN)
            r0 = 0
            goto L173
        L171:
            android.app.AlertDialog r0 = (android.app.AlertDialog) r0
        L173:
            ᛲᲁᛲᛳ r3 = new ᛲᲁᛲᛳ
            r3.<init>(r1, r15)
            r0.setOnDismissListener(r3)
            ᛸᛴᲀᛴ r0 = new ᛸᛴᲀᛴ
            r1 = 4
            r0.<init>(r1, r14)
            r5.setOnClickListener(r0)
            ᛱᛶᛷᛸ r9 = new ᛱᛶᛷᛸ
            r12 = r18
            r13 = r6
            r10 = r14
            r14 = r2
            r9.<init>(r10, r11, r12, r13, r14)
            r4.setOnClickListener(r9)
            return
        L192:
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            r1 = -1157279222505006(0xfffbe375ef0961d2, double:NaN)
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r0 = r1.concat(r0)
            defpackage.C2264.m3673(r0)
            return
    }

    /* JADX INFO: renamed from: ᲁᛴᛵᛲ, reason: contains not printable characters */
    public static final void m3153(defpackage.C1180 r3, int r4) {
            java.lang.Object r3 = r3.f5356
            android.widget.Button r3 = (android.widget.Button) r3
            if (r4 <= 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -79663338004014(0xffffb78bef0961d2, double:NaN)
            java.lang.String r1 = "保存选中("
            r0.<init>(r1)
            r0.append(r4)
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            goto L2a
        L21:
            r0 = -79689107807790(0xffffb785ef0961d2, double:NaN)
            java.lang.String r4 = "批量保存"
        L2a:
            r3.setText(r4)
            return
    }

    /* JADX INFO: renamed from: ᲁᲈᛳ, reason: contains not printable characters */
    public static final java.lang.Object m3154(java.lang.Object r1) {
            boolean r0 = r1 instanceof defpackage.C2342
            if (r0 == 0) goto L8
            r0 = r1
            ᲈᲁᲀᛷ r0 = (defpackage.C2342) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto Ld
            ᛵᛵᛳᛷ r1 = r0.f10100
        Ld:
            return r1
    }

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public static int m3155(int r0, java.lang.Object r1) {
            if (r1 != 0) goto L4
            r1 = 0
            goto L8
        L4:
            int r1 = r1.hashCode()
        L8:
            int r0 = m3160(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public static boolean m3156(int r1, int r2) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 > 0) goto L6
            if (r1 != r0) goto Lb
        L6:
            if (r2 > 0) goto Ld
            if (r2 != r0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛳᛴᲈ, reason: contains not printable characters */
    public static defpackage.C2210 m3157(defpackage.C0106 r2, int r3) {
            if (r3 <= 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            if (r0 == 0) goto L1b
            int r0 = r2.f9424
            int r1 = r2.f9423
            int r2 = r2.f9422
            if (r2 <= 0) goto L14
            goto L15
        L14:
            int r3 = -r3
        L15:
            ᲈᛳᛷᛴ r2 = new ᲈᛳᛷᛴ
            r2.<init>(r0, r1, r3)
            return r2
        L1b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Step must be positive, was: "
            r3.<init>(r0)
            r3.append(r1)
            r0 = 46
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static void m3158() {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto Lb
            return
        Lb:
            java.lang.String r0 = "You must call this method on the main thread"
            defpackage.C2264.m3684(r0)
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final java.lang.Float m3159(float r1) {
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public static int m3160(int r0, int r1) {
            int r1 = r1 * 31
            int r1 = r1 + r0
            return r1
    }

    /* JADX INFO: renamed from: ᲈᛵᲀᛱ, reason: contains not printable characters */
    public static void m3161(android.content.Context r42, com.ss.android.ugc.aweme.feed.model.Aweme r43) {
            r1 = r42
            r2 = -148722117156398(0xffff78bcef0961d2, double:NaN)
            r2 = -148756476894766(0xffff78b4ef0961d2, double:NaN)
            android.app.Activity r6 = com.ss.android.ugc.aweme.utils.ActivityStack.getTopActivity()
            r7 = 1
            defpackage.AbstractC2093.m3512(r6, r7)
            android.view.LayoutInflater r0 = defpackage.AbstractC1668.m3063(r1)
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            r2.<init>(r1)
            r3 = 1712062626(0x660c00a2, float:1.6528575E23)
            r8 = 0
            android.view.View r0 = r0.inflate(r3, r2, r8)
            r2 = 1711866053(0x660900c5, float:1.617446E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            r11 = r3
            android.widget.Button r11 = (android.widget.Button) r11
            if (r11 == 0) goto L265
            r2 = 1711866054(0x660900c6, float:1.6174462E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            r12 = r3
            android.widget.Button r12 = (android.widget.Button) r12
            if (r12 == 0) goto L265
            r2 = 1711866097(0x660900f1, float:1.617454E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            r13 = r3
            android.widget.Button r13 = (android.widget.Button) r13
            if (r13 == 0) goto L265
            r2 = 1711866184(0x66090148, float:1.6174696E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            r14 = r3
            android.widget.Button r14 = (android.widget.Button) r14
            if (r14 == 0) goto L265
            r2 = 1711866186(0x6609014a, float:1.61747E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            r15 = r3
            android.widget.LinearLayout r15 = (android.widget.LinearLayout) r15
            if (r15 == 0) goto L265
            r2 = 1711866187(0x6609014b, float:1.6174701E23)
            android.view.View r16 = defpackage.AbstractC1193.m2331(r0, r2)
            if (r16 == 0) goto L265
            r2 = 1711866190(0x6609014e, float:1.6174707E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            r17 = r3
            android.widget.Button r17 = (android.widget.Button) r17
            if (r17 == 0) goto L265
            r2 = 1711866191(0x6609014f, float:1.6174709E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            r18 = r3
            android.widget.ImageView r18 = (android.widget.ImageView) r18
            if (r18 == 0) goto L265
            r2 = 1711866192(0x66090150, float:1.617471E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            r19 = r3
            android.widget.LinearLayout r19 = (android.widget.LinearLayout) r19
            if (r19 == 0) goto L265
            r2 = 1711866193(0x66090151, float:1.6174712E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            r20 = r3
            android.widget.TextView r20 = (android.widget.TextView) r20
            if (r20 == 0) goto L265
            r2 = 1711866194(0x66090152, float:1.6174714E23)
            android.view.View r21 = defpackage.AbstractC1193.m2331(r0, r2)
            if (r21 == 0) goto L265
            r2 = 1711866246(0x66090186, float:1.6174808E23)
            android.view.View r22 = defpackage.AbstractC1193.m2331(r0, r2)
            if (r22 == 0) goto L265
            r2 = 1711866247(0x66090187, float:1.617481E23)
            android.view.View r23 = defpackage.AbstractC1193.m2331(r0, r2)
            if (r23 == 0) goto L265
            r2 = 1711866248(0x66090188, float:1.6174811E23)
            android.view.View r24 = defpackage.AbstractC1193.m2331(r0, r2)
            if (r24 == 0) goto L265
            r2 = 1711866249(0x66090189, float:1.6174813E23)
            android.view.View r25 = defpackage.AbstractC1193.m2331(r0, r2)
            if (r25 == 0) goto L265
            r2 = 1711866397(0x6609021d, float:1.617508E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            r26 = r3
            android.widget.ImageView r26 = (android.widget.ImageView) r26
            if (r26 == 0) goto L265
            r2 = 1711866421(0x66090235, float:1.6175123E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            r27 = r3
            android.widget.LinearLayout r27 = (android.widget.LinearLayout) r27
            if (r27 == 0) goto L265
            r2 = 1711866422(0x66090236, float:1.6175125E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            r28 = r3
            android.widget.LinearLayout r28 = (android.widget.LinearLayout) r28
            if (r28 == 0) goto L265
            r2 = 1711866423(0x66090237, float:1.6175127E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            r29 = r3
            android.widget.LinearLayout r29 = (android.widget.LinearLayout) r29
            if (r29 == 0) goto L265
            r2 = 1711866424(0x66090238, float:1.6175128E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            r30 = r3
            android.widget.LinearLayout r30 = (android.widget.LinearLayout) r30
            if (r30 == 0) goto L265
            r2 = 1711866425(0x66090239, float:1.617513E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            r31 = r3
            android.widget.LinearLayout r31 = (android.widget.LinearLayout) r31
            if (r31 == 0) goto L265
            r2 = 1711866426(0x6609023a, float:1.6175132E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            r32 = r3
            android.widget.LinearLayout r32 = (android.widget.LinearLayout) r32
            if (r32 == 0) goto L265
            r2 = 1711866427(0x6609023b, float:1.6175134E23)
            android.view.View r33 = defpackage.AbstractC1193.m2331(r0, r2)
            if (r33 == 0) goto L265
            r2 = 1711866465(0x66090261, float:1.6175202E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L265
            r2 = 1711866466(0x66090262, float:1.6175204E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L265
            r2 = 1711866467(0x66090263, float:1.6175206E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L265
            r2 = 1711866468(0x66090264, float:1.6175208E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L265
            r2 = 1711866469(0x66090265, float:1.617521E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L265
            r4 = r0
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r2 = 1711866878(0x660903fe, float:1.6175946E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            r34 = r3
            android.widget.TextView r34 = (android.widget.TextView) r34
            if (r34 == 0) goto L265
            r2 = 1711866879(0x660903ff, float:1.6175948E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            r35 = r3
            android.widget.TextView r35 = (android.widget.TextView) r35
            if (r35 == 0) goto L265
            r2 = 1711866881(0x66090401, float:1.6175952E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            r36 = r3
            android.widget.TextView r36 = (android.widget.TextView) r36
            if (r36 == 0) goto L265
            r2 = 1711866882(0x66090402, float:1.6175953E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            r37 = r3
            android.widget.TextView r37 = (android.widget.TextView) r37
            if (r37 == 0) goto L265
            r2 = 1711866883(0x66090403, float:1.6175955E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            r38 = r3
            android.widget.TextView r38 = (android.widget.TextView) r38
            if (r38 == 0) goto L265
            r2 = 1711866884(0x66090404, float:1.6175957E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            r39 = r3
            android.widget.TextView r39 = (android.widget.TextView) r39
            if (r39 == 0) goto L265
            r2 = 1711866885(0x66090405, float:1.6175959E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            r40 = r3
            android.widget.TextView r40 = (android.widget.TextView) r40
            if (r40 == 0) goto L265
            r2 = 1711866886(0x66090406, float:1.617596E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r2)
            r41 = r3
            android.widget.TextView r41 = (android.widget.TextView) r41
            if (r41 == 0) goto L265
            ᛵᛵᛸᲀ r3 = new ᛵᛵᛸᲀ
            r9 = r3
            r10 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r9 = -148782246698542(0xffff78aeef0961d2, double:NaN)
            ᛲᲀᛱᲁ r0 = defpackage.C0346.f1773
            r0.getClass()
            defpackage.C0346.m1052(r4)
            ᛶᲀᛵ r0 = defpackage.C1141.f5173
            r0.getClass()
            ᲀᲇᛸᛶ r0 = defpackage.C1141.f5181
            ᲁᛷᛶᛶ[] r2 = defpackage.C1141.f5221
            r5 = 148(0x94, float:2.07E-43)
            r2 = r2[r5]
            java.lang.Object r0 = r0.m3169(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != 0) goto L236
            ᛱᲁᲀᲁ r9 = defpackage.C0185.m722(r1)
            r10 = -148838081273390(0xffff78a1ef0961d2, double:NaN)
            java.lang.String r0 = "视频信息"
            r9.f1240 = r0
            r9.mo723()
            ᲇᛶᛲᛶ r0 = new ᲇᛶᛲᛶ
            r5 = 0
            r2 = r43
            r0.<init>(r1, r2, r3, r4, r5)
            r9.f1248 = r0
            r9.mo723()
            r9.f1234 = r7
            r9.mo723()
            ᛳᲀᲇᲀ r0 = new ᛳᲀᲇᲀ
            r0.<init>(r6, r8)
            r9.f384 = r0
            r9.m724(r1)
            return
        L236:
            ᛶᛵᛳᛸ r8 = defpackage.C1069.m2030(r1)
            r9 = -148859556109870(0xffff789cef0961d2, double:NaN)
            java.lang.String r0 = "视频信息"
            r8.f4775 = r0
            r8.mo2037()
            ᲇᛶᛲᛶ r0 = new ᲇᛶᛲᛶ
            r5 = 1
            r2 = r43
            r0.<init>(r1, r2, r3, r4, r5)
            r8.f4776 = r0
            r8.mo2037()
            r8.f4763 = r7
            r8.mo2037()
            ᛳᲀᲇᲀ r0 = new ᛳᲀᲇᲀ
            r0.<init>(r6, r7)
            r8.f384 = r0
            r8.m2034(r1)
            return
        L265:
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r0 = r0.getResourceName(r2)
            r1 = -1165465430171182(0xfffbdc03ef0961d2, double:NaN)
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r0 = r1.concat(r0)
            defpackage.C2264.m3673(r0)
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static float m3162(float r2) {
            r0 = 1036831949(0x3dcccccd, float:0.1)
            int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r1 >= 0) goto L8
            return r0
        L8:
            r0 = 1077936128(0x40400000, float:3.0)
            int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r1 <= 0) goto Lf
            return r0
        Lf:
            return r2
    }
}
