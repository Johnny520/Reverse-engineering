package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,151:1\n52#1:152\n1#2:153\n1#2:156\n1313#3,2:154\n*S KotlinDebug\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n*L\n33#1:152\n33#1:153\n33#1:154,2\n*E\n"})
@Yue.InterfaceC3421(name = "TextStreamsKt")
public final class C6152 {

    /* JADX INFO: renamed from: Yue.ۥۢۡ۠ۧ$ۥ, reason: contains not printable characters */
    public static final class C6153 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.String, Yue.C6593> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.util.ArrayList<java.lang.String> f22117;

        public C6153(java.util.ArrayList<java.lang.String> r1) {
                r0 = this;
                r0.f22117 = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                r0.m23033(r1)
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m23033(@Yue.InterfaceC4418 java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "it"
                Yue.C3329.m13906(r2, r0)
                java.util.ArrayList<java.lang.String> r0 = r1.f22117
                r0.add(r2)
                return
        }
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.io.BufferedReader m23018(java.io.Reader r1, int r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r0 = r1 instanceof java.io.BufferedReader
            if (r0 == 0) goto Lc
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1
            goto L12
        Lc:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r0.<init>(r1, r2)
            r1 = r0
        L12:
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.io.BufferedWriter m23019(java.io.Writer r1, int r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r0 = r1 instanceof java.io.BufferedWriter
            if (r0 == 0) goto Lc
            java.io.BufferedWriter r1 = (java.io.BufferedWriter) r1
            goto L12
        Lc:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            r0.<init>(r1, r2)
            r1 = r0
        L12:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.io.BufferedReader m23020(java.io.Reader r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 8192(0x2000, float:1.148E-41)
        L6:
            java.lang.String r2 = "<this>"
            Yue.C3329.m13906(r0, r2)
            boolean r2 = r0 instanceof java.io.BufferedReader
            if (r2 == 0) goto L12
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0
            goto L18
        L12:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r2.<init>(r0, r1)
            r0 = r2
        L18:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.io.BufferedWriter m23021(java.io.Writer r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 8192(0x2000, float:1.148E-41)
        L6:
            java.lang.String r2 = "<this>"
            Yue.C3329.m13906(r0, r2)
            boolean r2 = r0 instanceof java.io.BufferedWriter
            if (r2 == 0) goto L12
            java.io.BufferedWriter r0 = (java.io.BufferedWriter) r0
            goto L18
        L12:
            java.io.BufferedWriter r2 = new java.io.BufferedWriter
            r2.<init>(r0, r1)
            r0 = r2
        L18:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final long m23022(@Yue.InterfaceC4418 java.io.Reader r5, @Yue.InterfaceC4418 java.io.Writer r6, int r7) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "out"
            Yue.C3329.m13906(r6, r0)
            char[] r7 = new char[r7]
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

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ long m23023(java.io.Reader r0, java.io.Writer r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            r2 = 8192(0x2000, float:1.148E-41)
        L6:
            long r0 = m23022(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final void m23024(@Yue.InterfaceC4418 java.io.Reader r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.lang.String, Yue.C6593> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = r2 instanceof java.io.BufferedReader
            if (r0 == 0) goto L11
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2
            goto L19
        L11:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r2, r1)
            r2 = r0
        L19:
            Yue.ۥۡۨۢ r0 = m23025(r2)     // Catch: java.lang.Throwable -> L2f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2f
        L21:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2f
            r3.invoke(r1)     // Catch: java.lang.Throwable -> L2f
            goto L21
        L2f:
            r3 = move-exception
            goto L38
        L31:
            Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L2f
            r3 = 0
            Yue.C1173.m6114(r2, r3)
            return
        L38:
            throw r3     // Catch: java.lang.Throwable -> L39
        L39:
            r0 = move-exception
            Yue.C1173.m6114(r2, r3)
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final Yue.InterfaceC5609<java.lang.String> m23025(@Yue.InterfaceC4418 java.io.BufferedReader r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥ۠ۧۡۥ r0 = new Yue.ۥ۠ۧۡۥ
            r0.<init>(r1)
            Yue.ۥۡۨۢ r1 = Yue.C5616.m20986(r0)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final byte[] m23026(@Yue.InterfaceC4418 java.net.URL r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.io.InputStream r2 = r2.openStream()
            java.lang.String r0 = "it"
            Yue.C3329.m13905(r2, r0)     // Catch: java.lang.Throwable -> L17
            byte[] r0 = Yue.C0877.m5028(r2)     // Catch: java.lang.Throwable -> L17
            r1 = 0
            Yue.C1173.m6114(r2, r1)
            return r0
        L17:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L19
        L19:
            r1 = move-exception
            Yue.C1173.m6114(r2, r0)
            throw r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final java.util.List<java.lang.String> m23027(@Yue.InterfaceC4418 java.io.Reader r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            Yue.ۥۢۡ۠ۧ$ۥ r1 = new Yue.ۥۢۡ۠ۧ$ۥ
            r1.<init>(r0)
            m23024(r2, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final java.lang.String m23028(@Yue.InterfaceC4418 java.io.Reader r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            r1 = 2
            r2 = 0
            r3 = 0
            m23023(r4, r0, r3, r1, r2)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "buffer.toString()"
            Yue.C3329.m13905(r4, r0)
            return r4
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final java.lang.String m23029(java.net.URL r1, java.nio.charset.Charset r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r2, r0)
            byte[] r1 = m23026(r1)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m23030(java.net.URL r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = Yue.C1099.f3261
        L6:
            java.lang.String r2 = "<this>"
            Yue.C3329.m13906(r0, r2)
            java.lang.String r2 = "charset"
            Yue.C3329.m13906(r1, r2)
            byte[] r0 = m23026(r0)
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0, r1)
            return r2
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final java.io.StringReader m23031(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.io.StringReader r0 = new java.io.StringReader
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final <T> T m23032(@Yue.InterfaceC4418 java.io.Reader r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super Yue.InterfaceC5609<java.lang.String>, ? extends T> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = r2 instanceof java.io.BufferedReader
            if (r0 == 0) goto L11
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2
            goto L19
        L11:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r2, r1)
            r2 = r0
        L19:
            r0 = 1
            Yue.ۥۡۨۢ r1 = m23025(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r3 = r3.invoke(r1)     // Catch: java.lang.Throwable -> L2d
            Yue.C3249.m13687(r0)
            r1 = 0
            Yue.C1173.m6114(r2, r1)
            Yue.C3249.m13686(r0)
            return r3
        L2d:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L2f
        L2f:
            r1 = move-exception
            Yue.C3249.m13687(r0)
            Yue.C1173.m6114(r2, r3)
            Yue.C3249.m13686(r0)
            throw r1
    }
}
