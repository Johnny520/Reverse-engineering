package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3421(name = "ByteStreamsKt")
public final class C0877 {

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۥۣ$ۥ, reason: contains not printable characters */
    public static final class C0878 extends Yue.AbstractC0875 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f2552;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public boolean f2553;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f2554;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ java.io.BufferedInputStream f2555;

        public C0878(java.io.BufferedInputStream r1) {
                r0 = this;
                r0.f2555 = r1
                r0.<init>()
                r1 = -1
                r0.f2552 = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                r1.m5038()
                boolean r0 = r1.f2554
                r0 = r0 ^ 1
                return r0
        }

        @Override // Yue.AbstractC0875
        /* JADX INFO: renamed from: ۥ۟ */
        public byte mo1979() {
                r2 = this;
                r2.m5038()
                boolean r0 = r2.f2554
                if (r0 != 0) goto Le
                int r0 = r2.f2552
                byte r0 = (byte) r0
                r1 = 0
                r2.f2553 = r1
                return r0
            Le:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                java.lang.String r1 = "Input stream is over."
                r0.<init>(r1)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final boolean m5035() {
                r1 = this;
                boolean r0 = r1.f2554
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final int m5036() {
                r1 = this;
                int r0 = r1.f2552
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final boolean m5037() {
                r1 = this;
                boolean r0 = r1.f2553
                return r0
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final void m5038() {
                r3 = this;
                boolean r0 = r3.f2553
                if (r0 != 0) goto L1a
                boolean r0 = r3.f2554
                if (r0 != 0) goto L1a
                java.io.BufferedInputStream r0 = r3.f2555
                int r0 = r0.read()
                r3.f2552 = r0
                r1 = 1
                r3.f2553 = r1
                r2 = -1
                if (r0 != r2) goto L17
                goto L18
            L17:
                r1 = 0
            L18:
                r3.f2554 = r1
            L1a:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final void m5039(boolean r1) {
                r0 = this;
                r0.f2554 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final void m5040(int r1) {
                r0 = this;
                r0.f2552 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final void m5041(boolean r1) {
                r0 = this;
                r0.f2553 = r1
                return
        }
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.io.BufferedInputStream m5013(java.io.InputStream r1, int r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r0 = r1 instanceof java.io.BufferedInputStream
            if (r0 == 0) goto Lc
            java.io.BufferedInputStream r1 = (java.io.BufferedInputStream) r1
            goto L12
        Lc:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r0.<init>(r1, r2)
            r1 = r0
        L12:
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.io.BufferedOutputStream m5014(java.io.OutputStream r1, int r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r0 = r1 instanceof java.io.BufferedOutputStream
            if (r0 == 0) goto Lc
            java.io.BufferedOutputStream r1 = (java.io.BufferedOutputStream) r1
            goto L12
        Lc:
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            r0.<init>(r1, r2)
            r1 = r0
        L12:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.io.BufferedInputStream m5015(java.io.InputStream r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 8192(0x2000, float:1.148E-41)
        L6:
            java.lang.String r2 = "<this>"
            Yue.C3329.m13906(r0, r2)
            boolean r2 = r0 instanceof java.io.BufferedInputStream
            if (r2 == 0) goto L12
            java.io.BufferedInputStream r0 = (java.io.BufferedInputStream) r0
            goto L18
        L12:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream
            r2.<init>(r0, r1)
            r0 = r2
        L18:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.io.BufferedOutputStream m5016(java.io.OutputStream r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 8192(0x2000, float:1.148E-41)
        L6:
            java.lang.String r2 = "<this>"
            Yue.C3329.m13906(r0, r2)
            boolean r2 = r0 instanceof java.io.BufferedOutputStream
            if (r2 == 0) goto L12
            java.io.BufferedOutputStream r0 = (java.io.BufferedOutputStream) r0
            goto L18
        L12:
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream
            r2.<init>(r0, r1)
            r0 = r2
        L18:
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.io.BufferedReader m5017(java.io.InputStream r1, java.nio.charset.Charset r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r2, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r1, r2)
            java.io.BufferedReader r1 = new java.io.BufferedReader
            r2 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r0, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ java.io.BufferedReader m5018(java.io.InputStream r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = Yue.C1099.f3261
        L6:
            java.lang.String r2 = "<this>"
            Yue.C3329.m13906(r0, r2)
            java.lang.String r2 = "charset"
            Yue.C3329.m13906(r1, r2)
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            r2.<init>(r0, r1)
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r2, r1)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.io.BufferedWriter m5019(java.io.OutputStream r1, java.nio.charset.Charset r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r2, r0)
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            r0.<init>(r1, r2)
            java.io.BufferedWriter r1 = new java.io.BufferedWriter
            r2 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r0, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ java.io.BufferedWriter m5020(java.io.OutputStream r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = Yue.C1099.f3261
        L6:
            java.lang.String r2 = "<this>"
            Yue.C3329.m13906(r0, r2)
            java.lang.String r2 = "charset"
            Yue.C3329.m13906(r1, r2)
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter
            r2.<init>(r0, r1)
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            r1 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r2, r1)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final java.io.ByteArrayInputStream m5021(java.lang.String r1, java.nio.charset.Charset r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r2, r0)
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            byte[] r1 = r1.getBytes(r2)
            java.lang.String r2 = "this as java.lang.String).getBytes(charset)"
            Yue.C3329.m13905(r1, r2)
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ java.io.ByteArrayInputStream m5022(java.lang.String r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = Yue.C1099.f3261
        L6:
            java.lang.String r2 = "<this>"
            Yue.C3329.m13906(r0, r2)
            java.lang.String r2 = "charset"
            Yue.C3329.m13906(r1, r2)
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            byte[] r0 = r0.getBytes(r1)
            java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
            Yue.C3329.m13905(r0, r1)
            r2.<init>(r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final long m5023(@Yue.InterfaceC4418 java.io.InputStream r5, @Yue.InterfaceC4418 java.io.OutputStream r6, int r7) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "out"
            Yue.C3329.m13906(r6, r0)
            byte[] r7 = new byte[r7]
            int r0 = r5.read(r7)
            r1 = 0
        L12:
            if (r0 < 0) goto L1f
            r3 = 0
            r6.write(r7, r3, r0)
            long r3 = (long) r0
            long r1 = r1 + r3
            int r0 = r5.read(r7)
            goto L12
        L1f:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ long m5024(java.io.InputStream r0, java.io.OutputStream r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            r2 = 8192(0x2000, float:1.148E-41)
        L6:
            long r0 = m5023(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final java.io.ByteArrayInputStream m5025(byte[] r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final java.io.ByteArrayInputStream m5026(byte[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final Yue.AbstractC0875 m5027(@Yue.InterfaceC4418 java.io.BufferedInputStream r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥۣ۟ۥۣ$ۥ r0 = new Yue.ۥۣ۟ۥۣ$ۥ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final byte[] m5028(@Yue.InterfaceC4418 java.io.InputStream r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            int r1 = r4.available()
            r2 = 8192(0x2000, float:1.148E-41)
            int r1 = java.lang.Math.max(r2, r1)
            r0.<init>(r1)
            r1 = 2
            r2 = 0
            r3 = 0
            m5024(r4, r0, r3, r1, r2)
            byte[] r4 = r0.toByteArray()
            java.lang.String r0 = "buffer.toByteArray()"
            Yue.C3329.m13905(r4, r0)
            return r4
    }

    @Yue.InterfaceC1818(errorSince = "1.5", warningSince = "1.3")
    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @Yue.InterfaceC5313(expression = "readBytes()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final byte[] m5029(@Yue.InterfaceC4418 java.io.InputStream r3, int r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            int r1 = r3.available()
            int r4 = java.lang.Math.max(r4, r1)
            r0.<init>(r4)
            r4 = 2
            r1 = 0
            r2 = 0
            m5024(r3, r0, r2, r4, r1)
            byte[] r3 = r0.toByteArray()
            java.lang.String r4 = "buffer.toByteArray()"
            Yue.C3329.m13905(r3, r4)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static /* synthetic */ byte[] m5030(java.io.InputStream r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 8192(0x2000, float:1.148E-41)
        L6:
            byte[] r0 = m5029(r0, r1)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final java.io.InputStreamReader m5031(java.io.InputStream r1, java.nio.charset.Charset r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r2, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ java.io.InputStreamReader m5032(java.io.InputStream r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = Yue.C1099.f3261
        L6:
            java.lang.String r2 = "<this>"
            Yue.C3329.m13906(r0, r2)
            java.lang.String r2 = "charset"
            Yue.C3329.m13906(r1, r2)
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            r2.<init>(r0, r1)
            return r2
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final java.io.OutputStreamWriter m5033(java.io.OutputStream r1, java.nio.charset.Charset r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r2, r0)
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static /* synthetic */ java.io.OutputStreamWriter m5034(java.io.OutputStream r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = Yue.C1099.f3261
        L6:
            java.lang.String r2 = "<this>"
            Yue.C3329.m13906(r0, r2)
            java.lang.String r2 = "charset"
            Yue.C3329.m13906(r1, r2)
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter
            r2.<init>(r0, r1)
            return r2
    }
}
