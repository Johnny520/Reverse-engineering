package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢ۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nFileReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n231#1:234\n1#2:233\n1#2:235\n*S KotlinDebug\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n*L\n230#1:234\n230#1:235\n*E\n"})
public class C2392 extends Yue.C2391 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۢ۟ۥ$ۥ, reason: contains not printable characters */
    public static final class C2393 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.String, Yue.C6593> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.util.ArrayList<java.lang.String> f7817;

        public C2393(java.util.ArrayList<java.lang.String> r1) {
                r0 = this;
                r0.f7817 = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                r0.m11036(r1)
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m11036(@Yue.InterfaceC4418 java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "it"
                Yue.C3329.m13906(r2, r0)
                java.util.ArrayList<java.lang.String> r0 = r1.f7817
                r0.add(r2)
                return
        }
    }

    public C2392() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final void m11007(@Yue.InterfaceC4418 java.io.File r2, @Yue.InterfaceC4418 byte[] r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r3, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r1 = 1
            r0.<init>(r2, r1)
            r0.write(r3)     // Catch: java.lang.Throwable -> L1a
            Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L1a
            r2 = 0
            Yue.C1173.m6114(r0, r2)
            return
        L1a:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            Yue.C1173.m6114(r0, r2)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final void m11008(@Yue.InterfaceC4418 java.io.File r1, @Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 java.nio.charset.Charset r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "text"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r3, r0)
            byte[] r2 = r2.getBytes(r3)
            java.lang.String r3 = "this as java.lang.String).getBytes(charset)"
            Yue.C3329.m13905(r2, r3)
            m11007(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m11009(java.io.File r0, java.lang.String r1, java.nio.charset.Charset r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            java.nio.charset.Charset r2 = Yue.C1099.f3261
        L6:
            m11008(r0, r1, r2)
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final java.io.BufferedReader m11010(java.io.File r2, java.nio.charset.Charset r3, int r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r3, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r2.<init>(r0, r4)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ java.io.BufferedReader m11011(java.io.File r0, java.nio.charset.Charset r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.nio.charset.Charset r1 = Yue.C1099.f3261
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 8192(0x2000, float:1.148E-41)
        Lc:
            java.lang.String r3 = "<this>"
            Yue.C3329.m13906(r0, r3)
            java.lang.String r3 = "charset"
            Yue.C3329.m13906(r1, r3)
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.io.FileInputStream r4 = new java.io.FileInputStream
            r4.<init>(r0)
            r3.<init>(r4, r1)
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r0.<init>(r3, r2)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final java.io.BufferedWriter m11012(java.io.File r2, java.nio.charset.Charset r3, int r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r3, r0)
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            java.io.BufferedWriter r2 = new java.io.BufferedWriter
            r2.<init>(r0, r4)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ java.io.BufferedWriter m11013(java.io.File r0, java.nio.charset.Charset r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.nio.charset.Charset r1 = Yue.C1099.f3261
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 8192(0x2000, float:1.148E-41)
        Lc:
            java.lang.String r3 = "<this>"
            Yue.C3329.m13906(r0, r3)
            java.lang.String r3 = "charset"
            Yue.C3329.m13906(r1, r3)
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r4 = new java.io.FileOutputStream
            r4.<init>(r0)
            r3.<init>(r4, r1)
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            r0.<init>(r3, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final void m11014(@Yue.InterfaceC4418 java.io.File r1, int r2, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super byte[], ? super java.lang.Integer, Yue.C6593> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r3, r0)
            r0 = 512(0x200, float:7.17E-43)
            int r2 = Yue.C5196.m19514(r2, r0)
            byte[] r2 = new byte[r2]
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
        L17:
            int r1 = r0.read(r2)     // Catch: java.lang.Throwable -> L24
            if (r1 > 0) goto L26
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L24
            r1 = 0
            Yue.C1173.m6114(r0, r1)
            return
        L24:
            r1 = move-exception
            goto L2e
        L26:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L24
            r3.invoke(r2, r1)     // Catch: java.lang.Throwable -> L24
            goto L17
        L2e:
            throw r1     // Catch: java.lang.Throwable -> L2f
        L2f:
            r2 = move-exception
            Yue.C1173.m6114(r0, r1)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final void m11015(@Yue.InterfaceC4418 java.io.File r1, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super byte[], ? super java.lang.Integer, Yue.C6593> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r2, r0)
            r0 = 4096(0x1000, float:5.74E-42)
            m11014(r1, r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final void m11016(@Yue.InterfaceC4418 java.io.File r3, @Yue.InterfaceC4418 java.nio.charset.Charset r4, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.lang.String, Yue.C6593> r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r5, r0)
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r3)
            r1.<init>(r2, r4)
            r0.<init>(r1)
            Yue.C6152.m23024(r0, r5)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static /* synthetic */ void m11017(java.io.File r0, java.nio.charset.Charset r1, Yue.InterfaceC2825 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            java.nio.charset.Charset r1 = Yue.C1099.f3261
        L6:
            m11016(r0, r1, r2)
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final java.io.FileInputStream m11018(java.io.File r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final java.io.FileOutputStream m11019(java.io.File r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final java.io.PrintWriter m11020(java.io.File r3, java.nio.charset.Charset r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r4, r0)
            java.io.PrintWriter r0 = new java.io.PrintWriter
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r3)
            r1.<init>(r2, r4)
            java.io.BufferedWriter r3 = new java.io.BufferedWriter
            r4 = 8192(0x2000, float:1.148E-41)
            r3.<init>(r1, r4)
            r0.<init>(r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static /* synthetic */ java.io.PrintWriter m11021(java.io.File r1, java.nio.charset.Charset r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            java.nio.charset.Charset r2 = Yue.C1099.f3261
        L6:
            java.lang.String r3 = "<this>"
            Yue.C3329.m13906(r1, r3)
            java.lang.String r3 = "charset"
            Yue.C3329.m13906(r2, r3)
            java.io.PrintWriter r3 = new java.io.PrintWriter
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            r4.<init>(r0, r2)
            java.io.BufferedWriter r1 = new java.io.BufferedWriter
            r2 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r4, r2)
            r3.<init>(r1)
            return r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final byte[] m11022(@Yue.InterfaceC4418 java.io.File r10) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r10, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r10)
            long r1 = r10.length()     // Catch: java.lang.Throwable -> L28
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            java.lang.String r4 = "File "
            if (r3 > 0) goto L86
            int r1 = (int) r1
            byte[] r2 = new byte[r1]     // Catch: java.lang.Throwable -> L28
            r3 = 0
            r5 = r1
            r6 = r3
        L1d:
            if (r5 <= 0) goto L2b
            int r7 = r0.read(r2, r6, r5)     // Catch: java.lang.Throwable -> L28
            if (r7 < 0) goto L2b
            int r5 = r5 - r7
            int r6 = r6 + r7
            goto L1d
        L28:
            r10 = move-exception
            goto La8
        L2b:
            java.lang.String r7 = "copyOf(this, newSize)"
            r8 = 0
            if (r5 <= 0) goto L38
            byte[] r2 = java.util.Arrays.copyOf(r2, r6)     // Catch: java.lang.Throwable -> L28
            Yue.C3329.m13905(r2, r7)     // Catch: java.lang.Throwable -> L28
            goto L68
        L38:
            int r5 = r0.read()     // Catch: java.lang.Throwable -> L28
            r6 = -1
            if (r5 != r6) goto L40
            goto L68
        L40:
            Yue.ۥ۠ۡۥۦ r6 = new Yue.ۥ۠ۡۥۦ     // Catch: java.lang.Throwable -> L28
            r9 = 8193(0x2001, float:1.1481E-41)
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L28
            r6.write(r5)     // Catch: java.lang.Throwable -> L28
            r5 = 2
            Yue.C0877.m5024(r0, r6, r3, r5, r8)     // Catch: java.lang.Throwable -> L28
            int r5 = r6.size()     // Catch: java.lang.Throwable -> L28
            int r5 = r5 + r1
            if (r5 < 0) goto L6c
            byte[] r10 = r6.m10687()     // Catch: java.lang.Throwable -> L28
            byte[] r2 = java.util.Arrays.copyOf(r2, r5)     // Catch: java.lang.Throwable -> L28
            Yue.C3329.m13905(r2, r7)     // Catch: java.lang.Throwable -> L28
            int r4 = r6.size()     // Catch: java.lang.Throwable -> L28
            byte[] r2 = Yue.C0586.m2170(r10, r2, r1, r3, r4)     // Catch: java.lang.Throwable -> L28
        L68:
            Yue.C1173.m6114(r0, r8)
            return r2
        L6c:
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> L28
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r2.<init>()     // Catch: java.lang.Throwable -> L28
            r2.append(r4)     // Catch: java.lang.Throwable -> L28
            r2.append(r10)     // Catch: java.lang.Throwable -> L28
            java.lang.String r10 = " is too big to fit in memory."
            r2.append(r10)     // Catch: java.lang.Throwable -> L28
            java.lang.String r10 = r2.toString()     // Catch: java.lang.Throwable -> L28
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L28
            throw r1     // Catch: java.lang.Throwable -> L28
        L86:
            java.lang.OutOfMemoryError r3 = new java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> L28
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r5.<init>()     // Catch: java.lang.Throwable -> L28
            r5.append(r4)     // Catch: java.lang.Throwable -> L28
            r5.append(r10)     // Catch: java.lang.Throwable -> L28
            java.lang.String r10 = " is too big ("
            r5.append(r10)     // Catch: java.lang.Throwable -> L28
            r5.append(r1)     // Catch: java.lang.Throwable -> L28
            java.lang.String r10 = " bytes) to fit in memory."
            r5.append(r10)     // Catch: java.lang.Throwable -> L28
            java.lang.String r10 = r5.toString()     // Catch: java.lang.Throwable -> L28
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L28
            throw r3     // Catch: java.lang.Throwable -> L28
        La8:
            throw r10     // Catch: java.lang.Throwable -> La9
        La9:
            r1 = move-exception
            Yue.C1173.m6114(r0, r10)
            throw r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final java.util.List<java.lang.String> m11023(@Yue.InterfaceC4418 java.io.File r2, @Yue.InterfaceC4418 java.nio.charset.Charset r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            Yue.ۥ۠ۢ۟ۥ$ۥ r1 = new Yue.ۥ۠ۢ۟ۥ$ۥ
            r1.<init>(r0)
            m11016(r2, r3, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static /* synthetic */ java.util.List m11024(java.io.File r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = Yue.C1099.f3261
        L6:
            java.util.List r0 = m11023(r0, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final java.lang.String m11025(@Yue.InterfaceC4418 java.io.File r2, @Yue.InterfaceC4418 java.nio.charset.Charset r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r3, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            java.lang.String r2 = Yue.C6152.m23028(r0)     // Catch: java.lang.Throwable -> L1d
            r3 = 0
            Yue.C1173.m6114(r0, r3)
            return r2
        L1d:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L1f
        L1f:
            r3 = move-exception
            Yue.C1173.m6114(r0, r2)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m11026(java.io.File r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = Yue.C1099.f3261
        L6:
            java.lang.String r0 = m11025(r0, r1)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final java.io.InputStreamReader m11027(java.io.File r2, java.nio.charset.Charset r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r3, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static /* synthetic */ java.io.InputStreamReader m11028(java.io.File r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = Yue.C1099.f3261
        L6:
            java.lang.String r2 = "<this>"
            Yue.C3329.m13906(r0, r2)
            java.lang.String r2 = "charset"
            Yue.C3329.m13906(r1, r2)
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r0)
            r2.<init>(r3, r1)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final <T> T m11029(@Yue.InterfaceC4418 java.io.File r2, @Yue.InterfaceC4418 java.nio.charset.Charset r3, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super Yue.InterfaceC5609<java.lang.String>, ? extends T> r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r4, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r3 = 8192(0x2000, float:1.148E-41)
            r2.<init>(r0, r3)
            r3 = 1
            Yue.ۥۡۨۢ r0 = Yue.C6152.m23025(r2)     // Catch: java.lang.Throwable -> L34
            java.lang.Object r4 = r4.invoke(r0)     // Catch: java.lang.Throwable -> L34
            Yue.C3249.m13687(r3)
            r0 = 0
            Yue.C1173.m6114(r2, r0)
            Yue.C3249.m13686(r3)
            return r4
        L34:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L36
        L36:
            r0 = move-exception
            Yue.C3249.m13687(r3)
            Yue.C1173.m6114(r2, r4)
            Yue.C3249.m13686(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Object m11030(java.io.File r1, java.nio.charset.Charset r2, Yue.InterfaceC2825 r3, int r4, java.lang.Object r5) {
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L6
            java.nio.charset.Charset r2 = Yue.C1099.f3261
        L6:
            java.io.InputStreamReader r4 = new java.io.InputStreamReader
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            r4.<init>(r0, r2)
            java.io.BufferedReader r1 = new java.io.BufferedReader
            r2 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r4, r2)
            Yue.ۥۡۨۢ r2 = Yue.C6152.m23025(r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r2 = r3.invoke(r2)     // Catch: java.lang.Throwable -> L2a
            Yue.C3249.m13687(r5)
            r3 = 0
            Yue.C1173.m6114(r1, r3)
            Yue.C3249.m13686(r5)
            return r2
        L2a:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L2c
        L2c:
            r3 = move-exception
            Yue.C3249.m13687(r5)
            Yue.C1173.m6114(r1, r2)
            Yue.C3249.m13686(r5)
            throw r3
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final void m11031(@Yue.InterfaceC4418 java.io.File r1, @Yue.InterfaceC4418 byte[] r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r2, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            r0.write(r2)     // Catch: java.lang.Throwable -> L19
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L19
            r1 = 0
            Yue.C1173.m6114(r0, r1)
            return
        L19:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L1b
        L1b:
            r2 = move-exception
            Yue.C1173.m6114(r0, r1)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final void m11032(@Yue.InterfaceC4418 java.io.File r1, @Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 java.nio.charset.Charset r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "text"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r3, r0)
            byte[] r2 = r2.getBytes(r3)
            java.lang.String r3 = "this as java.lang.String).getBytes(charset)"
            Yue.C3329.m13905(r2, r3)
            m11031(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static /* synthetic */ void m11033(java.io.File r0, java.lang.String r1, java.nio.charset.Charset r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            java.nio.charset.Charset r2 = Yue.C1099.f3261
        L6:
            m11032(r0, r1, r2)
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final java.io.OutputStreamWriter m11034(java.io.File r2, java.nio.charset.Charset r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r3, r0)
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static /* synthetic */ java.io.OutputStreamWriter m11035(java.io.File r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = Yue.C1099.f3261
        L6:
            java.lang.String r2 = "<this>"
            Yue.C3329.m13906(r0, r2)
            java.lang.String r2 = "charset"
            Yue.C3329.m13906(r1, r2)
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r3 = new java.io.FileOutputStream
            r3.<init>(r0)
            r2.<init>(r3, r1)
            return r2
    }
}
