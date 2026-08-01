package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛷᛵᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0060 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final xhss.C0564 f345 = null;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final xhss.C0263 f346 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final xhss.C0564 f347 = null;

    static {
            xhss.ᛶᛵᲇᛸ r0 = new xhss.ᛶᛵᲇᛸ
            r1 = 3
            r0.<init>(r1)
            xhss.AbstractC0060.f347 = r0
            xhss.ᛶᛵᲇᛸ r0 = new xhss.ᛶᛵᲇᛸ
            r1 = 0
            r0.<init>(r1)
            xhss.AbstractC0060.f345 = r0
            xhss.ᛳᛴᲀᲁ r0 = new xhss.ᛳᛴᲀᲁ
            r1 = 29
            r0.<init>(r1)
            xhss.AbstractC0060.f346 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static void m179(xhss.AbstractC0631 r2) {
            r0 = r2
            xhss.ᲀᛸᛳᲈ r0 = (xhss.InterfaceC0883) r0
            int r0 = r0.mo665()
            r1 = 2
            if (r0 != r1) goto Lb
            return
        Lb:
            java.lang.String r0 = "kotlin.jvm.functions.Function2"
            m182(r2, r0)
            r2 = 0
            throw r2
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static void m180(java.lang.String r2) {
            int r0 = r2.length()
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 > r1) goto L9
            goto Le
        L9:
            r0 = 0
            java.lang.String r2 = r2.substring(r0, r1)
        Le:
            android.os.Trace.beginSection(r2)
            return
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public static void m181(android.app.Activity r3, android.view.View r4) {
            xhss.ᛶᛵᲇᛸ r0 = xhss.AbstractC1069.f3451
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r3)
            android.view.ViewParent r1 = r4.getParent()
            if (r1 == 0) goto L16
            android.view.ViewParent r1 = r4.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.removeView(r4)
        L16:
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r0.addView(r4, r1)
            java.lang.String r4 = "window"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.WindowManager$LayoutParams r4 = new android.view.WindowManager$LayoutParams
            r4.<init>()
            r1 = 16
            r4.gravity = r1
            r2 = -2
            r4.format = r2
            r2 = 1003(0x3eb, float:1.406E-42)
            r4.type = r2
            r2 = 201327872(0xc000500, float:9.862266E-32)
            r4.flags = r2
            r4.softInputMode = r1
            r1 = 1
            r4.layoutInDisplayCutoutMode = r1
            r3.addView(r0, r4)
            return
    }

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public static void m182(java.lang.Object r1, java.lang.String r2) {
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = " cannot be cast to "
            java.lang.String r1 = xhss.AbstractC0390.m781(r1, r0, r2)
            java.lang.ClassCastException r2 = new java.lang.ClassCastException
            r2.<init>(r1)
            java.lang.Class<xhss.ᛱᛷᛵᛷ> r1 = xhss.AbstractC0060.class
            java.lang.String r1 = r1.getName()
            xhss.AbstractC0007.m104(r2, r1)
            throw r2
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final void m183(int r1) {
            r0 = 1
            if (r1 < r0) goto L4
            return
        L4:
            java.lang.String r0 = "Expected positive parallelism level, but got "
            java.lang.String r1 = xhss.AbstractC0390.m774(r0, r1)
            xhss.C0532.m946(r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static java.util.Set m184(java.lang.Object r1) {
            boolean r0 = r1 instanceof xhss.InterfaceC0057
            if (r0 == 0) goto L10
            boolean r0 = r1 instanceof xhss.InterfaceC1158
            if (r0 == 0) goto L9
            goto L10
        L9:
            java.lang.String r0 = "kotlin.collections.MutableSet"
            m182(r1, r0)
            r1 = 0
            throw r1
        L10:
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.ClassCastException -> L13
            return r1
        L13:
            r1 = move-exception
            java.lang.Class<xhss.ᛱᛷᛵᛷ> r0 = xhss.AbstractC0060.class
            java.lang.String r0 = r0.getName()
            xhss.AbstractC0007.m104(r1, r0)
            throw r1
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public static boolean m185(char r1) {
            if (r1 < 0) goto L6
            r0 = 31
            if (r1 <= r0) goto L16
        L6:
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 < r0) goto Le
            r0 = 159(0x9f, float:2.23E-43)
            if (r1 <= r0) goto L16
        Le:
            r0 = 8192(0x2000, float:1.148E-41)
            if (r1 < r0) goto L18
            r0 = 8447(0x20ff, float:1.1837E-41)
            if (r1 > r0) goto L18
        L16:
            r1 = 1
            return r1
        L18:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static final void m186(xhss.C0172 r11, xhss.InterfaceC0554 r12) {
            long r0 = xhss.C0172.f687
        L2:
            sun.misc.Unsafe r2 = xhss.AbstractC1067.f3442
            java.lang.Object r7 = r2.getObjectVolatile(r11, r0)
            boolean r3 = r7 instanceof xhss.C0590
            if (r3 == 0) goto L2a
        Lc:
            sun.misc.Unsafe r3 = xhss.AbstractC1067.f3442
            long r5 = xhss.C0172.f687
            r4 = r11
            r8 = r12
            boolean r11 = r3.compareAndSwapObject(r4, r5, r7, r8)
            r12 = r4
            r9 = r8
            r8 = r7
            if (r11 == 0) goto L1d
            goto L9b
        L1d:
            java.lang.Object r11 = r3.getObjectVolatile(r12, r0)
            if (r11 == r8) goto L26
            r4 = r12
            goto La2
        L26:
            r11 = r12
            r7 = r8
            r12 = r9
            goto Lc
        L2a:
            r9 = r12
            r8 = r7
            r12 = r11
            boolean r11 = r8 instanceof xhss.InterfaceC0554
            r10 = 0
            if (r11 != 0) goto La6
            boolean r11 = r8 instanceof xhss.C0711
            if (r11 == 0) goto L51
            r3 = r8
            xhss.ᛷᲁᲇᛷ r3 = (xhss.C0711) r3
            r7 = 1
            long r4 = xhss.C0711.f2384
            r6 = 0
            boolean r11 = r2.compareAndSwapInt(r3, r4, r6, r7)
            if (r11 == 0) goto L4d
            boolean r11 = r8 instanceof xhss.C0403
            if (r11 == 0) goto L9b
            java.lang.Throwable r11 = r3.f2385
            r12.m422(r9, r11)
            return
        L4d:
            xhss.C0172.m410(r9, r8)
            throw r10
        L51:
            boolean r11 = r8 instanceof xhss.C1088
            if (r11 == 0) goto L88
            r7 = r8
            xhss.ᲇᲁᛲᛳ r7 = (xhss.C1088) r7
            xhss.ᛶᛳᲁᲈ r11 = r7.f3512
            if (r11 != 0) goto L83
            java.lang.Throwable r11 = r7.f3515
            if (r11 == 0) goto L64
            r12.m422(r9, r11)
            return
        L64:
            r11 = 29
            xhss.ᲇᲁᛲᛳ r11 = xhss.C1088.m1774(r7, r9, r10, r11)
        L6a:
            sun.misc.Unsafe r3 = xhss.AbstractC1067.f3442
            long r5 = xhss.C0172.f687
            r4 = r12
            r7 = r8
            r8 = r11
            boolean r11 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r11 == 0) goto L78
            goto L9b
        L78:
            java.lang.Object r11 = r3.getObjectVolatile(r4, r0)
            if (r11 == r7) goto L7f
            goto La2
        L7f:
            r12 = r4
            r11 = r8
            r8 = r7
            goto L6a
        L83:
            r7 = r8
            xhss.C0172.m410(r9, r7)
            throw r10
        L88:
            r4 = r12
            r7 = r8
            xhss.ᲇᲁᛲᛳ r8 = new xhss.ᲇᲁᛲᛳ
            r11 = 28
            r8.<init>(r7, r9, r10, r11)
        L91:
            sun.misc.Unsafe r3 = xhss.AbstractC1067.f3442
            long r5 = xhss.C0172.f687
            boolean r11 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r11 == 0) goto L9c
        L9b:
            return
        L9c:
            java.lang.Object r11 = r3.getObjectVolatile(r4, r0)
            if (r11 == r7) goto L91
        La2:
            r11 = r4
            r12 = r9
            goto L2
        La6:
            r7 = r8
            xhss.C0172.m410(r9, r7)
            throw r10
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static final int m187(xhss.C0339 r4, java.lang.Object r5, int r6) {
            int r0 = r4.f1264
            if (r0 != 0) goto L6
            r4 = -1
            return r4
        L6:
            int[] r1 = r4.f1262     // Catch: java.lang.IndexOutOfBoundsException -> L4c
            int r1 = xhss.AbstractC0473.m859(r0, r6, r1)     // Catch: java.lang.IndexOutOfBoundsException -> L4c
            if (r1 >= 0) goto Lf
            goto L19
        Lf:
            java.lang.Object[] r2 = r4.f1263
            r2 = r2[r1]
            boolean r2 = xhss.AbstractC0007.m97(r5, r2)
            if (r2 == 0) goto L1a
        L19:
            return r1
        L1a:
            int r2 = r1 + 1
        L1c:
            if (r2 >= r0) goto L32
            int[] r3 = r4.f1262
            r3 = r3[r2]
            if (r3 != r6) goto L32
            java.lang.Object[] r3 = r4.f1263
            r3 = r3[r2]
            boolean r3 = xhss.AbstractC0007.m97(r5, r3)
            if (r3 == 0) goto L2f
            return r2
        L2f:
            int r2 = r2 + 1
            goto L1c
        L32:
            int r1 = r1 + (-1)
        L34:
            if (r1 < 0) goto L4a
            int[] r0 = r4.f1262
            r0 = r0[r1]
            if (r0 != r6) goto L4a
            java.lang.Object[] r0 = r4.f1263
            r0 = r0[r1]
            boolean r0 = xhss.AbstractC0007.m97(r5, r0)
            if (r0 == 0) goto L47
            return r1
        L47:
            int r1 = r1 + (-1)
            goto L34
        L4a:
            int r4 = ~r2
            return r4
        L4c:
            java.util.ConcurrentModificationException r4 = new java.util.ConcurrentModificationException
            r4.<init>()
            throw r4
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public static xhss.InterfaceC0362 m188(xhss.InterfaceC0362 r2, xhss.InterfaceC0362 r3) {
            xhss.ᲇᛷᲁᛷ r0 = xhss.C1059.f3421
            if (r3 != r0) goto L5
            return r2
        L5:
            xhss.ᲇᛵᲈᛵ r0 = new xhss.ᲇᛵᲈᛵ
            r1 = 1
            r0.<init>(r1)
            java.lang.Object r2 = r3.mo598(r2, r0)
            xhss.ᛴᛵᛳᛵ r2 = (xhss.InterfaceC0362) r2
            return r2
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public static boolean m189(java.lang.String r3) {
            int r0 = r3.length()
            r1 = 3
            r2 = 0
            if (r0 >= r1) goto L9
            return r2
        L9:
            char r0 = r3.charAt(r2)
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 != r1) goto L18
            java.lang.String r0 = "null"
            boolean r3 = r3.equals(r0)
            return r3
        L18:
            r1 = 116(0x74, float:1.63E-43)
            if (r0 != r1) goto L23
            java.lang.String r0 = "true"
            boolean r3 = r3.equals(r0)
            return r3
        L23:
            r1 = 102(0x66, float:1.43E-43)
            if (r0 != r1) goto L2e
            java.lang.String r0 = "false"
            boolean r3 = r3.equals(r0)
            return r3
        L2e:
            r1 = 78
            if (r0 != r1) goto L39
            java.lang.String r0 = "NaN"
            boolean r3 = r3.equals(r0)
            return r3
        L39:
            return r2
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static xhss.C0446 m190(javax.net.ssl.SSLSession r6) {
            java.lang.String r0 = r6.getCipherSuite()
            r1 = 0
            if (r0 == 0) goto L64
            java.lang.String r2 = "TLS_NULL_WITH_NULL_NULL"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L5a
            java.lang.String r2 = "SSL_NULL_WITH_NULL_NULL"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L5a
            xhss.ᛳᛴᲀᲁ r2 = xhss.C0321.f1207
            xhss.ᛳᲁᲇᲀ r0 = r2.m584(r0)
            java.lang.String r2 = r6.getProtocol()
            if (r2 == 0) goto L54
            java.lang.String r3 = "NONE"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L4e
            xhss.ᛶᲈᛴ r1 = xhss.C0915.m1503(r2)
            java.security.cert.Certificate[] r2 = r6.getPeerCertificates()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L38
            java.util.List r2 = xhss.AbstractC0559.m992(r2)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L38
            goto L3a
        L38:
            xhss.ᛵᛷᛶᛱ r2 = xhss.C0492.f1802
        L3a:
            xhss.ᛵᛲᛸᛲ r3 = new xhss.ᛵᛲᛸᛲ
            java.security.cert.Certificate[] r6 = r6.getLocalCertificates()
            java.util.List r6 = xhss.AbstractC0559.m992(r6)
            xhss.ᛲᛶᲀᛲ r4 = new xhss.ᛲᛶᲀᛲ
            r5 = 1
            r4.<init>(r5, r2)
            r3.<init>(r1, r0, r6, r4)
            return r3
        L4e:
            java.lang.String r6 = "tlsVersion == NONE"
            xhss.C0532.m947(r6)
            return r1
        L54:
            java.lang.String r6 = "tlsVersion == null"
            xhss.C0532.m950(r6)
            return r1
        L5a:
            java.lang.String r6 = "cipherSuite == "
            java.lang.String r6 = r6.concat(r0)
            xhss.C0532.m947(r6)
            return r1
        L64:
            java.lang.String r6 = "cipherSuite == null"
            xhss.C0532.m950(r6)
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static void m191(java.lang.Object r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            xhss.C0532.m953(r1)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static final int m192(char r3) {
            r0 = 48
            if (r0 > r3) goto La
            r1 = 58
            if (r3 >= r1) goto La
            int r3 = r3 - r0
            return r3
        La:
            r0 = 97
            if (r0 > r3) goto L15
            r0 = 103(0x67, float:1.44E-43)
            if (r3 >= r0) goto L15
            int r3 = r3 + (-87)
            return r3
        L15:
            r0 = 65
            if (r0 > r3) goto L20
            r0 = 71
            if (r3 >= r0) goto L20
            int r3 = r3 + (-55)
            return r3
        L20:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected hex digit: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public static final void m193(xhss.C0172 r3, xhss.InterfaceC0038 r4, boolean r5) {
            java.lang.Object r0 = r3.mo420()
            java.lang.Throwable r1 = r3.mo414(r0)
            if (r1 == 0) goto L10
            xhss.ᲈᛳᛱᲇ r3 = new xhss.ᲈᛳᛱᲇ
            r3.<init>(r1)
            goto L14
        L10:
            java.lang.Object r3 = r3.mo423(r0)
        L14:
            if (r5 == 0) goto L4c
            xhss.ᛸᲇᲁᛱ r4 = (xhss.C0817) r4
            xhss.ᛸᛴᛳᛷ r5 = r4.f2656
            java.lang.Object r0 = r4.f2654
            xhss.ᛴᛵᛳᛵ r1 = r5.f2508
            java.lang.Object r0 = xhss.C0614.m1072(r1, r0)
            xhss.ᛶᛲᛷᛵ r2 = xhss.C0614.f2112
            if (r0 == r2) goto L2b
            xhss.ᲈᲇᛵ r5 = xhss.AbstractC0485.m891(r5, r1, r0)
            goto L2c
        L2b:
            r5 = 0
        L2c:
            xhss.ᛸᛴᛳᛷ r4 = r4.f2656     // Catch: java.lang.Throwable -> L3f
            r4.mo152(r3)     // Catch: java.lang.Throwable -> L3f
            if (r5 == 0) goto L3b
            boolean r3 = r5.m1917()
            if (r3 == 0) goto L3a
            goto L3b
        L3a:
            return
        L3b:
            xhss.C0614.m1065(r1, r0)
            return
        L3f:
            r3 = move-exception
            if (r5 == 0) goto L48
            boolean r4 = r5.m1917()
            if (r4 == 0) goto L4b
        L48:
            xhss.C0614.m1065(r1, r0)
        L4b:
            throw r3
        L4c:
            r4.mo152(r3)
            return
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public static boolean m194(char r1) {
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 == r0) goto L23
            r0 = 91
            if (r1 == r0) goto L23
            r0 = 44
            if (r1 == r0) goto L23
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 == r0) goto L23
            r0 = 93
            if (r1 == r0) goto L23
            r0 = 58
            if (r1 == r0) goto L23
            r0 = 39
            if (r1 == r0) goto L23
            r0 = 34
            if (r1 != r0) goto L21
            goto L23
        L21:
            r1 = 0
            return r1
        L23:
            r1 = 1
            return r1
    }
}
