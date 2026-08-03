package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nPathReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,326:1\n1#2:327\n1#2:329\n52#3:328\n1313#4,2:330\n*S KotlinDebug\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n*L\n202#1:329\n202#1:328\n202#1:330,2\n*E\n"})
public class C4724 {
    public C4724() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final void m18757(java.nio.file.Path r3, byte[] r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r4, r0)
            r0 = 1
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            java.nio.file.StandardOpenOption r1 = java.nio.file.StandardOpenOption.APPEND
            r2 = 0
            r0[r2] = r1
            java.nio.file.Files.write(r3, r4, r0)
            return
    }

    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.nio.file.Path m18758(java.nio.file.Path r3, Yue.InterfaceC5609<? extends java.lang.CharSequence> r4, java.nio.charset.Charset r5) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "lines"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r5, r0)
            java.lang.Iterable r4 = Yue.C5629.m21026(r4)
            r0 = 1
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            java.nio.file.StandardOpenOption r1 = java.nio.file.StandardOpenOption.APPEND
            r2 = 0
            r0[r2] = r1
            java.nio.file.Path r3 = java.nio.file.Files.write(r3, r4, r5, r0)
            java.lang.String r4 = "write(this, lines.asIter…tandardOpenOption.APPEND)"
            Yue.C3329.m13905(r3, r4)
            return r3
    }

    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.nio.file.Path m18759(java.nio.file.Path r3, java.lang.Iterable<? extends java.lang.CharSequence> r4, java.nio.charset.Charset r5) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "lines"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r5, r0)
            r0 = 1
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            java.nio.file.StandardOpenOption r1 = java.nio.file.StandardOpenOption.APPEND
            r2 = 0
            r0[r2] = r1
            java.nio.file.Path r3 = java.nio.file.Files.write(r3, r4, r5, r0)
            java.lang.String r4 = "write(this, lines, chars…tandardOpenOption.APPEND)"
            Yue.C3329.m13905(r3, r4)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.nio.file.Path m18760(java.nio.file.Path r1, Yue.InterfaceC5609 r2, java.nio.charset.Charset r3, int r4, java.lang.Object r5) throws java.io.IOException {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            java.nio.charset.Charset r3 = Yue.C1099.f3261
        L6:
            java.lang.String r4 = "<this>"
            Yue.C3329.m13906(r1, r4)
            java.lang.String r4 = "lines"
            Yue.C3329.m13906(r2, r4)
            java.lang.String r4 = "charset"
            Yue.C3329.m13906(r3, r4)
            java.lang.Iterable r2 = Yue.C5629.m21026(r2)
            r4 = 1
            java.nio.file.OpenOption[] r4 = new java.nio.file.OpenOption[r4]
            java.nio.file.StandardOpenOption r5 = java.nio.file.StandardOpenOption.APPEND
            r0 = 0
            r4[r0] = r5
            java.nio.file.Path r1 = java.nio.file.Files.write(r1, r2, r3, r4)
            java.lang.String r2 = "write(this, lines.asIter…tandardOpenOption.APPEND)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.nio.file.Path m18761(java.nio.file.Path r1, java.lang.Iterable r2, java.nio.charset.Charset r3, int r4, java.lang.Object r5) throws java.io.IOException {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            java.nio.charset.Charset r3 = Yue.C1099.f3261
        L6:
            java.lang.String r4 = "<this>"
            Yue.C3329.m13906(r1, r4)
            java.lang.String r4 = "lines"
            Yue.C3329.m13906(r2, r4)
            java.lang.String r4 = "charset"
            Yue.C3329.m13906(r3, r4)
            r4 = 1
            java.nio.file.OpenOption[] r4 = new java.nio.file.OpenOption[r4]
            java.nio.file.StandardOpenOption r5 = java.nio.file.StandardOpenOption.APPEND
            r0 = 0
            r4[r0] = r5
            java.nio.file.Path r1 = java.nio.file.Files.write(r1, r2, r3, r4)
            java.lang.String r2 = "write(this, lines, chars…tandardOpenOption.APPEND)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m18762(@Yue.InterfaceC4418 java.nio.file.Path r3, @Yue.InterfaceC4418 java.lang.CharSequence r4, @Yue.InterfaceC4418 java.nio.charset.Charset r5) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "text"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r5, r0)
            r0 = 1
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            java.nio.file.StandardOpenOption r1 = java.nio.file.StandardOpenOption.APPEND
            r2 = 0
            r0[r2] = r1
            java.io.OutputStream r3 = java.nio.file.Files.newOutputStream(r3, r0)
            java.lang.String r0 = "newOutputStream(this, StandardOpenOption.APPEND)"
            Yue.C3329.m13905(r3, r0)
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            r0.<init>(r3, r5)
            r0.append(r4)     // Catch: java.lang.Throwable -> L2d
            r3 = 0
            Yue.C1173.m6114(r0, r3)
            return
        L2d:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L2f
        L2f:
            r4 = move-exception
            Yue.C1173.m6114(r0, r3)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m18763(java.nio.file.Path r0, java.lang.CharSequence r1, java.nio.charset.Charset r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            java.nio.charset.Charset r2 = Yue.C1099.f3261
        L6:
            m18762(r0, r1, r2)
            return
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.io.BufferedReader m18764(java.nio.file.Path r3, java.nio.charset.Charset r4, int r5, java.nio.file.OpenOption... r6) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r6, r0)
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            int r2 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r2)
            java.nio.file.OpenOption[] r6 = (java.nio.file.OpenOption[]) r6
            java.io.InputStream r3 = java.nio.file.Files.newInputStream(r3, r6)
            r1.<init>(r3, r4)
            r0.<init>(r1, r5)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.io.BufferedReader m18765(java.nio.file.Path r1, java.nio.charset.Charset r2, int r3, java.nio.file.OpenOption[] r4, int r5, java.lang.Object r6) throws java.io.IOException {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.nio.charset.Charset r2 = Yue.C1099.f3261
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lc
            r3 = 8192(0x2000, float:1.148E-41)
        Lc:
            java.lang.String r5 = "<this>"
            Yue.C3329.m13906(r1, r5)
            java.lang.String r5 = "charset"
            Yue.C3329.m13906(r2, r5)
            java.lang.String r5 = "options"
            Yue.C3329.m13906(r4, r5)
            java.io.BufferedReader r5 = new java.io.BufferedReader
            java.io.InputStreamReader r6 = new java.io.InputStreamReader
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            java.io.InputStream r1 = java.nio.file.Files.newInputStream(r1, r4)
            r6.<init>(r1, r2)
            r5.<init>(r6, r3)
            return r5
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final java.io.BufferedWriter m18766(java.nio.file.Path r3, java.nio.charset.Charset r4, int r5, java.nio.file.OpenOption... r6) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r6, r0)
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            int r2 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r2)
            java.nio.file.OpenOption[] r6 = (java.nio.file.OpenOption[]) r6
            java.io.OutputStream r3 = java.nio.file.Files.newOutputStream(r3, r6)
            r1.<init>(r3, r4)
            r0.<init>(r1, r5)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ java.io.BufferedWriter m18767(java.nio.file.Path r1, java.nio.charset.Charset r2, int r3, java.nio.file.OpenOption[] r4, int r5, java.lang.Object r6) throws java.io.IOException {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.nio.charset.Charset r2 = Yue.C1099.f3261
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lc
            r3 = 8192(0x2000, float:1.148E-41)
        Lc:
            java.lang.String r5 = "<this>"
            Yue.C3329.m13906(r1, r5)
            java.lang.String r5 = "charset"
            Yue.C3329.m13906(r2, r5)
            java.lang.String r5 = "options"
            Yue.C3329.m13906(r4, r5)
            java.io.BufferedWriter r5 = new java.io.BufferedWriter
            java.io.OutputStreamWriter r6 = new java.io.OutputStreamWriter
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            java.io.OutputStream r1 = java.nio.file.Files.newOutputStream(r1, r4)
            r6.<init>(r1, r2)
            r5.<init>(r6, r3)
            return r5
    }

    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final void m18768(java.nio.file.Path r2, java.nio.charset.Charset r3, Yue.InterfaceC2825<? super java.lang.String, Yue.C6593> r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r4, r0)
            java.io.BufferedReader r2 = java.nio.file.Files.newBufferedReader(r2, r3)
            java.lang.String r3 = "newBufferedReader(this, charset)"
            Yue.C3329.m13905(r2, r3)
            r3 = 1
            Yue.ۥۡۨۢ r0 = Yue.C6152.m23025(r2)     // Catch: java.lang.Throwable -> L2f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2f
        L21:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2f
            r4.invoke(r1)     // Catch: java.lang.Throwable -> L2f
            goto L21
        L2f:
            r4 = move-exception
            goto L3e
        L31:
            Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L2f
            Yue.C3249.m13687(r3)
            r4 = 0
            Yue.C1173.m6114(r2, r4)
            Yue.C3249.m13686(r3)
            return
        L3e:
            throw r4     // Catch: java.lang.Throwable -> L3f
        L3f:
            r0 = move-exception
            Yue.C3249.m13687(r3)
            Yue.C1173.m6114(r2, r4)
            Yue.C3249.m13686(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ void m18769(java.nio.file.Path r0, java.nio.charset.Charset r1, Yue.InterfaceC2825 r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L6
            java.nio.charset.Charset r1 = Yue.C1099.f3261
        L6:
            java.lang.String r3 = "<this>"
            Yue.C3329.m13906(r0, r3)
            java.lang.String r3 = "charset"
            Yue.C3329.m13906(r1, r3)
            java.lang.String r3 = "action"
            Yue.C3329.m13906(r2, r3)
            java.io.BufferedReader r0 = java.nio.file.Files.newBufferedReader(r0, r1)
            java.lang.String r1 = "newBufferedReader(this, charset)"
            Yue.C3329.m13905(r0, r1)
            Yue.ۥۡۨۢ r1 = Yue.C6152.m23025(r0)     // Catch: java.lang.Throwable -> L34
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L34
        L26:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L36
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L34
            r2.invoke(r3)     // Catch: java.lang.Throwable -> L34
            goto L26
        L34:
            r1 = move-exception
            goto L43
        L36:
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L34
            Yue.C3249.m13687(r4)
            r1 = 0
            Yue.C1173.m6114(r0, r1)
            Yue.C3249.m13686(r4)
            return
        L43:
            throw r1     // Catch: java.lang.Throwable -> L44
        L44:
            r2 = move-exception
            Yue.C3249.m13687(r4)
            Yue.C1173.m6114(r0, r1)
            Yue.C3249.m13686(r4)
            throw r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final java.io.InputStream m18770(java.nio.file.Path r1, java.nio.file.OpenOption... r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.OpenOption[] r2 = (java.nio.file.OpenOption[]) r2
            java.io.InputStream r1 = java.nio.file.Files.newInputStream(r1, r2)
            java.lang.String r2 = "newInputStream(this, *options)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final java.io.OutputStream m18771(java.nio.file.Path r1, java.nio.file.OpenOption... r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.OpenOption[] r2 = (java.nio.file.OpenOption[]) r2
            java.io.OutputStream r1 = java.nio.file.Files.newOutputStream(r1, r2)
            java.lang.String r2 = "newOutputStream(this, *options)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final byte[] m18772(java.nio.file.Path r1) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            byte[] r1 = java.nio.file.Files.readAllBytes(r1)
            java.lang.String r0 = "readAllBytes(this)"
            Yue.C3329.m13905(r1, r0)
            return r1
    }

    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final java.util.List<java.lang.String> m18773(java.nio.file.Path r1, java.nio.charset.Charset r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r2, r0)
            java.util.List r1 = java.nio.file.Files.readAllLines(r1, r2)
            java.lang.String r2 = "readAllLines(this, charset)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static /* synthetic */ java.util.List m18774(java.nio.file.Path r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) throws java.io.IOException {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = Yue.C1099.f3261
        L6:
            java.lang.String r2 = "<this>"
            Yue.C3329.m13906(r0, r2)
            java.lang.String r2 = "charset"
            Yue.C3329.m13906(r1, r2)
            java.util.List r0 = java.nio.file.Files.readAllLines(r0, r1)
            java.lang.String r1 = "readAllLines(this, charset)"
            Yue.C3329.m13905(r0, r1)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final java.lang.String m18775(@Yue.InterfaceC4418 java.nio.file.Path r3, @Yue.InterfaceC4418 java.nio.charset.Charset r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r4, r0)
            r0 = 0
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r0]
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.nio.file.OpenOption[] r0 = (java.nio.file.OpenOption[]) r0
            java.io.InputStream r3 = java.nio.file.Files.newInputStream(r3, r0)
            r2.<init>(r3, r4)
            java.lang.String r3 = Yue.C6152.m23028(r2)     // Catch: java.lang.Throwable -> L25
            r4 = 0
            Yue.C1173.m6114(r2, r4)
            return r3
        L25:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L27
        L27:
            r4 = move-exception
            Yue.C1173.m6114(r2, r3)
            throw r4
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m18776(java.nio.file.Path r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) throws java.io.IOException {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = Yue.C1099.f3261
        L6:
            java.lang.String r0 = m18775(r0, r1)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final java.io.InputStreamReader m18777(java.nio.file.Path r2, java.nio.charset.Charset r3, java.nio.file.OpenOption... r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r4, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            int r1 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            java.io.InputStream r2 = java.nio.file.Files.newInputStream(r2, r4)
            r0.<init>(r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static /* synthetic */ java.io.InputStreamReader m18778(java.nio.file.Path r0, java.nio.charset.Charset r1, java.nio.file.OpenOption[] r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            java.nio.charset.Charset r1 = Yue.C1099.f3261
        L6:
            java.lang.String r3 = "<this>"
            Yue.C3329.m13906(r0, r3)
            java.lang.String r3 = "charset"
            Yue.C3329.m13906(r1, r3)
            java.lang.String r3 = "options"
            Yue.C3329.m13906(r2, r3)
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            int r4 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r4)
            java.nio.file.OpenOption[] r2 = (java.nio.file.OpenOption[]) r2
            java.io.InputStream r0 = java.nio.file.Files.newInputStream(r0, r2)
            r3.<init>(r0, r1)
            return r3
    }

    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final <T> T m18779(java.nio.file.Path r1, java.nio.charset.Charset r2, Yue.InterfaceC2825<? super Yue.InterfaceC5609<java.lang.String>, ? extends T> r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r3, r0)
            java.io.BufferedReader r1 = java.nio.file.Files.newBufferedReader(r1, r2)
            r2 = 1
            java.lang.String r0 = "it"
            Yue.C3329.m13905(r1, r0)     // Catch: java.lang.Throwable -> L2c
            Yue.ۥۡۨۢ r0 = Yue.C6152.m23025(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r3 = r3.invoke(r0)     // Catch: java.lang.Throwable -> L2c
            Yue.C3249.m13687(r2)
            r0 = 0
            Yue.C1173.m6114(r1, r0)
            Yue.C3249.m13686(r2)
            return r3
        L2c:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L2e
        L2e:
            r0 = move-exception
            Yue.C3249.m13687(r2)
            Yue.C1173.m6114(r1, r3)
            Yue.C3249.m13686(r2)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Object m18780(java.nio.file.Path r0, java.nio.charset.Charset r1, Yue.InterfaceC2825 r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L6
            java.nio.charset.Charset r1 = Yue.C1099.f3261
        L6:
            java.lang.String r3 = "<this>"
            Yue.C3329.m13906(r0, r3)
            java.lang.String r3 = "charset"
            Yue.C3329.m13906(r1, r3)
            java.lang.String r3 = "block"
            Yue.C3329.m13906(r2, r3)
            java.io.BufferedReader r0 = java.nio.file.Files.newBufferedReader(r0, r1)
            java.lang.String r1 = "it"
            Yue.C3329.m13905(r0, r1)     // Catch: java.lang.Throwable -> L31
            Yue.ۥۡۨۢ r1 = Yue.C6152.m23025(r0)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r1 = r2.invoke(r1)     // Catch: java.lang.Throwable -> L31
            Yue.C3249.m13687(r4)
            r2 = 0
            Yue.C1173.m6114(r0, r2)
            Yue.C3249.m13686(r4)
            return r1
        L31:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L33
        L33:
            r2 = move-exception
            Yue.C3249.m13687(r4)
            Yue.C1173.m6114(r0, r1)
            Yue.C3249.m13686(r4)
            throw r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final void m18781(java.nio.file.Path r1, byte[] r2, java.nio.file.OpenOption... r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.OpenOption[] r3 = (java.nio.file.OpenOption[]) r3
            java.nio.file.Files.write(r1, r2, r3)
            return
    }

    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final java.nio.file.Path m18782(java.nio.file.Path r1, Yue.InterfaceC5609<? extends java.lang.CharSequence> r2, java.nio.charset.Charset r3, java.nio.file.OpenOption... r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "lines"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r4, r0)
            java.lang.Iterable r2 = Yue.C5629.m21026(r2)
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            java.nio.file.Path r1 = java.nio.file.Files.write(r1, r2, r3, r4)
            java.lang.String r2 = "write(this, lines.asIterable(), charset, *options)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final java.nio.file.Path m18783(java.nio.file.Path r1, java.lang.Iterable<? extends java.lang.CharSequence> r2, java.nio.charset.Charset r3, java.nio.file.OpenOption... r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "lines"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r4, r0)
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            java.nio.file.Path r1 = java.nio.file.Files.write(r1, r2, r3, r4)
            java.lang.String r2 = "write(this, lines, charset, *options)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static /* synthetic */ java.nio.file.Path m18784(java.nio.file.Path r0, Yue.InterfaceC5609 r1, java.nio.charset.Charset r2, java.nio.file.OpenOption[] r3, int r4, java.lang.Object r5) throws java.io.IOException {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            java.nio.charset.Charset r2 = Yue.C1099.f3261
        L6:
            java.lang.String r4 = "<this>"
            Yue.C3329.m13906(r0, r4)
            java.lang.String r4 = "lines"
            Yue.C3329.m13906(r1, r4)
            java.lang.String r4 = "charset"
            Yue.C3329.m13906(r2, r4)
            java.lang.String r4 = "options"
            Yue.C3329.m13906(r3, r4)
            java.lang.Iterable r1 = Yue.C5629.m21026(r1)
            int r4 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            java.nio.file.OpenOption[] r3 = (java.nio.file.OpenOption[]) r3
            java.nio.file.Path r0 = java.nio.file.Files.write(r0, r1, r2, r3)
            java.lang.String r1 = "write(this, lines.asIterable(), charset, *options)"
            Yue.C3329.m13905(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static /* synthetic */ java.nio.file.Path m18785(java.nio.file.Path r0, java.lang.Iterable r1, java.nio.charset.Charset r2, java.nio.file.OpenOption[] r3, int r4, java.lang.Object r5) throws java.io.IOException {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            java.nio.charset.Charset r2 = Yue.C1099.f3261
        L6:
            java.lang.String r4 = "<this>"
            Yue.C3329.m13906(r0, r4)
            java.lang.String r4 = "lines"
            Yue.C3329.m13906(r1, r4)
            java.lang.String r4 = "charset"
            Yue.C3329.m13906(r2, r4)
            java.lang.String r4 = "options"
            Yue.C3329.m13906(r3, r4)
            int r4 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            java.nio.file.OpenOption[] r3 = (java.nio.file.OpenOption[]) r3
            java.nio.file.Path r0 = java.nio.file.Files.write(r0, r1, r2, r3)
            java.lang.String r1 = "write(this, lines, charset, *options)"
            Yue.C3329.m13905(r0, r1)
            return r0
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final void m18786(@Yue.InterfaceC4418 java.nio.file.Path r1, @Yue.InterfaceC4418 java.lang.CharSequence r2, @Yue.InterfaceC4418 java.nio.charset.Charset r3, @Yue.InterfaceC4418 java.nio.file.OpenOption... r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "text"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r4, r0)
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            java.io.OutputStream r1 = java.nio.file.Files.newOutputStream(r1, r4)
            java.lang.String r4 = "newOutputStream(this, *options)"
            Yue.C3329.m13905(r1, r4)
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter
            r4.<init>(r1, r3)
            r4.append(r2)     // Catch: java.lang.Throwable -> L31
            r1 = 0
            Yue.C1173.m6114(r4, r1)
            return
        L31:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L33
        L33:
            r2 = move-exception
            Yue.C1173.m6114(r4, r1)
            throw r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m18787(java.nio.file.Path r0, java.lang.CharSequence r1, java.nio.charset.Charset r2, java.nio.file.OpenOption[] r3, int r4, java.lang.Object r5) throws java.io.IOException {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            java.nio.charset.Charset r2 = Yue.C1099.f3261
        L6:
            m18786(r0, r1, r2, r3)
            return
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final java.io.OutputStreamWriter m18788(java.nio.file.Path r2, java.nio.charset.Charset r3, java.nio.file.OpenOption... r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r4, r0)
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            int r1 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            java.io.OutputStream r2 = java.nio.file.Files.newOutputStream(r2, r4)
            r0.<init>(r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static /* synthetic */ java.io.OutputStreamWriter m18789(java.nio.file.Path r0, java.nio.charset.Charset r1, java.nio.file.OpenOption[] r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            java.nio.charset.Charset r1 = Yue.C1099.f3261
        L6:
            java.lang.String r3 = "<this>"
            Yue.C3329.m13906(r0, r3)
            java.lang.String r3 = "charset"
            Yue.C3329.m13906(r1, r3)
            java.lang.String r3 = "options"
            Yue.C3329.m13906(r2, r3)
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter
            int r4 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r4)
            java.nio.file.OpenOption[] r2 = (java.nio.file.OpenOption[]) r2
            java.io.OutputStream r0 = java.nio.file.Files.newOutputStream(r0, r2)
            r3.<init>(r0, r1)
            return r3
    }
}
