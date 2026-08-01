package defpackage;

/* JADX INFO: renamed from: ᛳᛶᛳᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0498 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static android.graphics.drawable.GradientDrawable f2475;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static android.view.View f2476;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.InterfaceC0140[] f2477 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final java.lang.Object f2478 = null;

    static {
            r0 = 0
            ᛱᛸᛲᲀ[] r0 = new defpackage.InterfaceC0140[r0]
            defpackage.AbstractC0498.f2477 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.AbstractC0498.f2478 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static java.lang.String m1269(java.lang.String r4) {
            java.lang.String r0 = "getprop "
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L38
            r3.append(r4)     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> L38
            java.lang.Process r4 = r2.exec(r4)     // Catch: java.lang.Throwable -> L38
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L38
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L38
            java.io.InputStream r4 = r4.getInputStream()     // Catch: java.lang.Throwable -> L38
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L38
            r4 = 1024(0x400, float:1.435E-42)
            r0.<init>(r2, r4)     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = r0.readLine()     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L31
            r0.close()     // Catch: java.io.IOException -> L30
        L30:
            return r4
        L31:
            r0.close()     // Catch: java.io.IOException -> L34
        L34:
            return r1
        L35:
            r4 = move-exception
            r1 = r0
            goto L39
        L38:
            r4 = move-exception
        L39:
            if (r1 == 0) goto L3e
            r1.close()     // Catch: java.io.IOException -> L3e
        L3e:
            throw r4
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static final java.lang.Object m1270(defpackage.InterfaceC0493 r5, defpackage.InterfaceC2087 r6) {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            ᲀᛴᛱᛱ r1 = defpackage.C1654.f7364
            ᛶᲁᛳᲈ r2 = r5.mo970(r1)
            ᲁᛲᛱᛵ r2 = (defpackage.AbstractC1805) r2
            ᛲᛶᛳᛱ r3 = defpackage.C0303.f1620
            r4 = 1
            if (r2 != 0) goto L2c
            ᛱᛵᛶᲇ r2 = defpackage.AbstractC1054.m2007()
            ᛳᛵᲈᛵ r5 = r5.mo971(r2)
            ᛳᛵᲈᛵ r5 = defpackage.AbstractC0762.m1678(r3, r5, r4)
            ᛶᛸᛳ r3 = defpackage.AbstractC1572.f6948
            if (r5 == r3) goto L46
            ᛶᲁᛳᲈ r1 = r5.mo970(r1)
            if (r1 != 0) goto L46
            ᛳᛵᲈᛵ r5 = r5.mo971(r3)
            goto L46
        L2c:
            java.lang.ThreadLocal r2 = defpackage.AbstractC1054.f4655
            java.lang.Object r2 = r2.get()
            ᛱᛵᛶᲇ r2 = (defpackage.AbstractC0092) r2
            ᛳᛵᲈᛵ r5 = defpackage.AbstractC0762.m1678(r3, r5, r4)
            ᛶᛸᛳ r3 = defpackage.AbstractC1572.f6948
            if (r5 == r3) goto L46
            ᛶᲁᛳᲈ r1 = r5.mo970(r1)
            if (r1 != 0) goto L46
            ᛳᛵᲈᛵ r5 = r5.mo971(r3)
        L46:
            ᲁᲀᲁᛶ r1 = new ᲁᲀᲁᛶ
            r1.<init>(r5, r0, r2)
            r1.m918(r4, r1, r6)
            r5 = 0
            ᛱᛵᛶᲇ r6 = r1.f8330
            if (r6 == 0) goto L56
            r6.m575(r5)
        L56:
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto L92
            if (r6 == 0) goto L65
            long r2 = r6.m582()     // Catch: java.lang.Throwable -> L63
            goto L6a
        L63:
            r0 = move-exception
            goto L9b
        L65:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L6a:
            java.lang.Object r0 = r1.m1442()     // Catch: java.lang.Throwable -> L63
            boolean r0 = r0 instanceof defpackage.InterfaceC0887     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L76
            java.util.concurrent.locks.LockSupport.parkNanos(r1, r2)     // Catch: java.lang.Throwable -> L63
            goto L56
        L76:
            if (r6 == 0) goto L7b
            r6.m580(r5)
        L7b:
            java.lang.Object r5 = r1.m1442()
            java.lang.Object r5 = defpackage.AbstractC1754.m3154(r5)
            boolean r6 = r5 instanceof defpackage.C0142
            if (r6 == 0) goto L8b
            r6 = r5
            ᛱᛸᛳᛱ r6 = (defpackage.C0142) r6
            goto L8c
        L8b:
            r6 = 0
        L8c:
            if (r6 != 0) goto L8f
            return r5
        L8f:
            java.lang.Throwable r5 = r6.f1092
            throw r5
        L92:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> L63
            r0.<init>()     // Catch: java.lang.Throwable -> L63
            r1.m1435(r0)     // Catch: java.lang.Throwable -> L63
            throw r0     // Catch: java.lang.Throwable -> L63
        L9b:
            if (r6 == 0) goto La0
            r6.m580(r5)
        La0:
            throw r0
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static void m1271(java.lang.RuntimeException r5, java.lang.String r6) {
            java.lang.StackTraceElement[] r0 = r5.getStackTrace()
            int r1 = r0.length
            r2 = -1
            r3 = 0
        L7:
            if (r3 >= r1) goto L19
            r4 = r0[r3]
            java.lang.String r4 = r4.getClassName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L16
            r2 = r3
        L16:
            int r3 = r3 + 1
            goto L7
        L19:
            int r2 = r2 + 1
            java.lang.Object[] r6 = java.util.Arrays.copyOfRange(r0, r2, r1)
            java.lang.StackTraceElement[] r6 = (java.lang.StackTraceElement[]) r6
            r5.setStackTrace(r6)
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static java.lang.String m1272(java.lang.String r7) {
            java.lang.String r0 = ""
            if (r7 == 0) goto L73
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto Lb
            goto L73
        Lb:
            r1 = 0
            java.lang.String r2 = "android.os.SystemProperties"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> L29
            java.lang.String r3 = "get"
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Class[] r4 = new java.lang.Class[]{r4, r4}     // Catch: java.lang.Exception -> L29
            java.lang.reflect.Method r3 = r2.getMethod(r3, r4)     // Catch: java.lang.Exception -> L29
            java.lang.Object[] r4 = new java.lang.Object[]{r7, r0}     // Catch: java.lang.Exception -> L29
            java.lang.Object r2 = r3.invoke(r2, r4)     // Catch: java.lang.Exception -> L29
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L29
            goto L2a
        L29:
            r2 = r1
        L2a:
            if (r2 == 0) goto L33
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L33
            return r2
        L33:
            java.lang.String r2 = m1269(r7)     // Catch: java.io.IOException -> L37
        L37:
            if (r2 == 0) goto L40
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L40
            return r2
        L40:
            java.util.Properties r3 = new java.util.Properties     // Catch: java.lang.Throwable -> L63
            r3.<init>()     // Catch: java.lang.Throwable -> L63
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L63
            java.io.File r5 = android.os.Environment.getRootDirectory()     // Catch: java.lang.Throwable -> L63
            java.lang.String r6 = "build.prop"
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L63
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L63
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L63
            r3.load(r5)     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = r3.getProperty(r7, r0)     // Catch: java.lang.Throwable -> L60
            r5.close()     // Catch: java.io.IOException -> L6a
            goto L6a
        L60:
            r7 = move-exception
            r1 = r5
            goto L64
        L63:
            r7 = move-exception
        L64:
            if (r1 == 0) goto L69
            r1.close()     // Catch: java.io.IOException -> L69
        L69:
            throw r7     // Catch: java.io.IOException -> L6a
        L6a:
            if (r2 == 0) goto L73
            boolean r7 = r2.isEmpty()
            if (r7 != 0) goto L73
            return r2
        L73:
            return r0
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final long m1273(long r3) {
            ᛷᲈᲀ r0 = defpackage.AbstractC0984.f4413
            r1 = 1
            long r3 = r3 << r1
            r1 = 1
            long r3 = r3 + r1
            r0.getClass()
            int r0 = defpackage.AbstractC1556.f6889
            return r3
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public static final long m1274(int r2, defpackage.EnumC1551 r3) {
            ᛸᛸᲁᛵ r0 = defpackage.EnumC1551.f6877
            int r0 = r3.compareTo(r0)
            if (r0 > 0) goto L18
            long r0 = (long) r2
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.util.concurrent.TimeUnit r3 = r3.f6879
            long r2 = r2.convert(r0, r3)
            ᛷᲈᲀ r0 = defpackage.AbstractC0984.f4413
            r0 = 1
            long r2 = r2 << r0
            int r0 = defpackage.AbstractC1556.f6889
            return r2
        L18:
            long r0 = (long) r2
            long r2 = m1279(r0, r3)
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static int m1275(int r0, int r1) {
            if (r0 >= r1) goto L4
            r0 = -1
            return r0
        L4:
            if (r0 != r1) goto L8
            r0 = 0
            return r0
        L8:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static void m1276(int r3, int r4, int r5) {
            java.lang.String r0 = "fromIndex: "
            if (r3 < 0) goto L13
            if (r4 > r5) goto L13
            if (r3 > r4) goto L9
            return
        L9:
            java.lang.String r5 = " > toIndex: "
            java.lang.String r3 = defpackage.AbstractC1124.m2143(r3, r4, r0, r5)
            defpackage.C2264.m3684(r3)
            return
        L13:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r3)
            java.lang.String r3 = ", toIndex: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = ", size: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = r2.toString()
            r1.<init>(r3)
            throw r1
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final long m1277(long r5, long r7) {
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r3 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            if (r2 == 0) goto L23
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L13
            goto L23
        L13:
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 == 0) goto L22
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 != 0) goto L1c
            goto L22
        L1c:
            long r5 = r5 + r7
            long r5 = defpackage.AbstractC1754.m3138(r5)
            return r5
        L22:
            return r7
        L23:
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 >= 0) goto L2c
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto L2c
            goto L33
        L2c:
            long r7 = r7 ^ r5
            r0 = 0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 < 0) goto L34
        L33:
            return r5
        L34:
            r5 = 9223372036854759646(0x7fffffffffffc0de, double:NaN)
            return r5
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static boolean m1278(java.lang.String[] r4) {
            int r0 = r4.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L16
            r3 = r4[r2]
            java.lang.String r3 = m1272(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L13
            r4 = 1
            return r4
        L13:
            int r2 = r2 + 1
            goto L3
        L16:
            return r1
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static final long m1279(long r8, defpackage.EnumC1551 r10) {
            java.util.concurrent.TimeUnit r0 = r10.f6879
            r1 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = r0.convert(r1, r3)
            long r4 = -r1
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 > 0) goto L21
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 > 0) goto L21
            long r8 = r3.convert(r8, r0)
            ᛷᲈᲀ r10 = defpackage.AbstractC0984.f4413
            r10 = 1
            long r8 = r8 << r10
            int r10 = defpackage.AbstractC1556.f6889
            return r8
        L21:
            ᛸᛸᲁᛵ r1 = defpackage.EnumC1551.f6875
            int r1 = r10.compareTo(r1)
            if (r1 < 0) goto La8
            int r0 = java.lang.Long.signum(r8)
            long r0 = (long) r0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 >= 0) goto L38
            r8 = r2
        L38:
            long r8 = java.lang.Math.abs(r8)
            int r2 = r10.ordinal()
            r3 = 2
            r4 = 0
            r6 = 1
            if (r2 == r3) goto L68
            r3 = 3
            if (r2 == r3) goto L65
            r3 = 4
            if (r2 == r3) goto L61
            r3 = 5
            if (r2 == r3) goto L5d
            r3 = 6
            if (r2 != r3) goto L57
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L69
        L57:
            java.lang.String r8 = "Wrong unit for millisMultiplier: "
            defpackage.C2264.m3681(r10, r8)
            return r4
        L5d:
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            goto L69
        L61:
            r2 = 60000(0xea60, double:2.9644E-319)
            goto L69
        L65:
            r2 = 1000(0x3e8, double:4.94E-321)
            goto L69
        L68:
            r2 = r6
        L69:
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 != 0) goto L6f
        L6d:
            r8 = r4
            goto La2
        L6f:
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r4 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            if (r10 != 0) goto L7f
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L7d
            goto La1
        L7d:
            r8 = r2
            goto La2
        L7f:
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 != 0) goto L88
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 <= 0) goto La2
            goto La1
        L88:
            int r10 = java.lang.Long.numberOfLeadingZeros(r8)
            int r10 = 128 - r10
            int r6 = java.lang.Long.numberOfLeadingZeros(r2)
            int r10 = r10 - r6
            r6 = 63
            if (r10 >= r6) goto L99
            long r8 = r8 * r2
            goto La2
        L99:
            if (r10 <= r6) goto L9c
            goto La1
        L9c:
            long r8 = r8 * r2
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 <= 0) goto La2
        La1:
            goto L6d
        La2:
            long r0 = r0 * r8
            long r8 = m1273(r0)
            return r8
        La8:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r8 = r10.convert(r8, r0)
            long r8 = defpackage.AbstractC1754.m3138(r8)
            long r8 = m1273(r8)
            return r8
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static boolean m1280(java.lang.Object r0, java.lang.Object r1) {
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

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final java.util.List m1281(defpackage.C0448 r9, int r10, int r11) {
            if (r10 != r11) goto L5
            ᲀᛶᲇ r9 = defpackage.C1698.f7558
            return r9
        L5:
            r0 = 0
            r1 = 1
            if (r11 <= r10) goto Lb
            r2 = r1
            goto Lc
        Lb:
            r2 = r0
        Lc:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L11:
            if (r2 == 0) goto L16
            if (r10 >= r11) goto L8d
            goto L18
        L16:
            if (r10 <= r11) goto L8d
        L18:
            java.util.LinkedHashMap r4 = r9.f2205
            r5 = 0
            if (r2 == 0) goto L35
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r6)
            java.util.TreeMap r4 = (java.util.TreeMap) r4
            if (r4 != 0) goto L2b
        L29:
            r7 = r5
            goto L4b
        L2b:
            java.util.NavigableSet r6 = r4.descendingKeySet()
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r4, r6)
            goto L4b
        L35:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r6)
            java.util.TreeMap r4 = (java.util.TreeMap) r4
            if (r4 != 0) goto L42
            goto L29
        L42:
            java.util.Set r6 = r4.keySet()
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r4, r6)
        L4b:
            if (r7 != 0) goto L4e
            goto L8c
        L4e:
            java.lang.Object r4 = r7.component1()
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r6 = r7.component2()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L5e:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L89
            java.lang.Object r7 = r6.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r2 == 0) goto L77
            int r8 = r10 + 1
            if (r8 > r7) goto L5e
            if (r7 > r11) goto L5e
            goto L7b
        L77:
            if (r11 > r7) goto L5e
            if (r7 >= r10) goto L5e
        L7b:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.lang.Object r10 = r4.get(r10)
            r3.add(r10)
            r4 = r1
            r10 = r7
            goto L8a
        L89:
            r4 = r0
        L8a:
            if (r4 != 0) goto L11
        L8c:
            return r5
        L8d:
            return r3
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static void m1282(java.util.List r1) {
            java.util.Iterator r1 = r1.iterator()
            boolean r0 = r1.hasNext()
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Object r1 = r1.next()
            r1.getClass()
            defpackage.C2264.m3679()
            return
    }
}
