package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nConsole.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Console.kt\nkotlin/io/LineReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,299:1\n1#2:300\n*E\n"})
public final class C3595 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C3595 f11462 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f11463 = 32;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.nio.charset.CharsetDecoder f11464;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean f11465;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final byte[] f11466 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final char[] f11467 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.nio.ByteBuffer f11468 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.nio.CharBuffer f11469 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.lang.StringBuilder f11470 = null;

    static {
            Yue.ۥۣ۠ۧ۠ r0 = new Yue.ۥۣ۠ۧ۠
            r0.<init>()
            Yue.C3595.f11462 = r0
            r0 = 32
            byte[] r1 = new byte[r0]
            Yue.C3595.f11466 = r1
            char[] r0 = new char[r0]
            Yue.C3595.f11467 = r0
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            java.lang.String r2 = "wrap(bytes)"
            Yue.C3329.m13905(r1, r2)
            Yue.C3595.f11468 = r1
            java.nio.CharBuffer r0 = java.nio.CharBuffer.wrap(r0)
            java.lang.String r1 = "wrap(chars)"
            Yue.C3329.m13905(r0, r1)
            Yue.C3595.f11469 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            Yue.C3595.f11470 = r0
            return
    }

    public C3595() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final int m14538() {
            r3 = this;
            java.nio.ByteBuffer r0 = Yue.C3595.f11468
            r0.compact()
            int r1 = r0.position()
            r2 = 0
            r0.position(r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final int m14539(boolean r6) {
            r5 = this;
        L0:
            java.nio.charset.CharsetDecoder r0 = Yue.C3595.f11464
            if (r0 != 0) goto La
            java.lang.String r0 = "decoder"
            Yue.C3329.m13935(r0)
            r0 = 0
        La:
            java.nio.ByteBuffer r1 = Yue.C3595.f11468
            java.nio.CharBuffer r2 = Yue.C3595.f11469
            java.nio.charset.CoderResult r0 = r0.decode(r1, r2, r6)
            java.lang.String r1 = "decoder.decode(byteBuf, charBuf, endOfInput)"
            Yue.C3329.m13905(r0, r1)
            boolean r1 = r0.isError()
            if (r1 == 0) goto L23
            r5.m14542()
            r0.throwException()
        L23:
            int r1 = r2.position()
            boolean r0 = r0.isOverflow()
            if (r0 != 0) goto L2e
            return r1
        L2e:
            java.lang.StringBuilder r0 = Yue.C3595.f11470
            char[] r3 = Yue.C3595.f11467
            int r1 = r1 + (-1)
            r4 = 0
            r0.append(r3, r4, r1)
            r2.position(r4)
            r0 = 32
            r2.limit(r0)
            char r0 = r3[r1]
            r2.put(r0)
            goto L0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int m14540(int r2, int r3) {
            r1 = this;
            java.nio.ByteBuffer r0 = Yue.C3595.f11468
            r0.limit(r2)
            java.nio.CharBuffer r2 = Yue.C3595.f11469
            r2.position(r3)
            r2 = 1
            int r2 = r1.m14539(r2)
            java.nio.charset.CharsetDecoder r3 = Yue.C3595.f11464
            if (r3 != 0) goto L19
            java.lang.String r3 = "decoder"
            Yue.C3329.m13935(r3)
            r3 = 0
        L19:
            r3.reset()
            r3 = 0
            r0.position(r3)
            return r2
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final synchronized java.lang.String m14541(@Yue.InterfaceC4418 java.io.InputStream r10, @Yue.InterfaceC4418 java.nio.charset.Charset r11) {
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "inputStream"
            Yue.C3329.m13906(r10, r0)     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r11, r0)     // Catch: java.lang.Throwable -> L19
            java.nio.charset.CharsetDecoder r0 = Yue.C3595.f11464     // Catch: java.lang.Throwable -> L19
            r1 = 0
            if (r0 == 0) goto L26
            if (r0 != 0) goto L1c
            java.lang.String r0 = "decoder"
            Yue.C3329.m13935(r0)     // Catch: java.lang.Throwable -> L19
            r0 = r1
            goto L1c
        L19:
            r10 = move-exception
            goto Lc5
        L1c:
            java.nio.charset.Charset r0 = r0.charset()     // Catch: java.lang.Throwable -> L19
            boolean r0 = Yue.C3329.m13897(r0, r11)     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L29
        L26:
            r9.m14544(r11)     // Catch: java.lang.Throwable -> L19
        L29:
            r11 = 0
            r0 = r11
            r2 = r0
        L2c:
            int r3 = r10.read()     // Catch: java.lang.Throwable -> L19
            r4 = 32
            r5 = -1
            r6 = 10
            if (r3 != r5) goto L4a
            java.lang.StringBuilder r10 = Yue.C3595.f11470     // Catch: java.lang.Throwable -> L19
            int r10 = r10.length()     // Catch: java.lang.Throwable -> L19
            if (r10 != 0) goto L45
            if (r0 != 0) goto L45
            if (r2 != 0) goto L45
            monitor-exit(r9)
            return r1
        L45:
            int r10 = r9.m14540(r0, r2)     // Catch: java.lang.Throwable -> L19
            goto L78
        L4a:
            byte[] r5 = Yue.C3595.f11466     // Catch: java.lang.Throwable -> L19
            int r7 = r0 + 1
            byte r8 = (byte) r3     // Catch: java.lang.Throwable -> L19
            r5[r0] = r8     // Catch: java.lang.Throwable -> L19
            if (r3 == r6) goto L5c
            if (r7 == r4) goto L5c
            boolean r0 = Yue.C3595.f11465     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L5a
            goto L5c
        L5a:
            r0 = r7
            goto L2c
        L5c:
            java.nio.ByteBuffer r0 = Yue.C3595.f11468     // Catch: java.lang.Throwable -> L19
            r0.limit(r7)     // Catch: java.lang.Throwable -> L19
            java.nio.CharBuffer r3 = Yue.C3595.f11469     // Catch: java.lang.Throwable -> L19
            r3.position(r2)     // Catch: java.lang.Throwable -> L19
            int r2 = r9.m14539(r11)     // Catch: java.lang.Throwable -> L19
            if (r2 <= 0) goto Lbf
            char[] r3 = Yue.C3595.f11467     // Catch: java.lang.Throwable -> L19
            int r5 = r2 + (-1)
            char r3 = r3[r5]     // Catch: java.lang.Throwable -> L19
            if (r3 != r6) goto Lbf
            r0.position(r11)     // Catch: java.lang.Throwable -> L19
            r10 = r2
        L78:
            if (r10 <= 0) goto L92
            char[] r0 = Yue.C3595.f11467     // Catch: java.lang.Throwable -> L19
            int r1 = r10 + (-1)
            char r1 = r0[r1]     // Catch: java.lang.Throwable -> L19
            if (r1 != r6) goto L92
            int r1 = r10 + (-1)
            if (r1 <= 0) goto L91
            int r2 = r10 + (-2)
            char r0 = r0[r2]     // Catch: java.lang.Throwable -> L19
            r2 = 13
            if (r0 != r2) goto L91
            int r10 = r10 + (-2)
            goto L92
        L91:
            r10 = r1
        L92:
            java.lang.StringBuilder r0 = Yue.C3595.f11470     // Catch: java.lang.Throwable -> L19
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto La3
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L19
            char[] r1 = Yue.C3595.f11467     // Catch: java.lang.Throwable -> L19
            r0.<init>(r1, r11, r10)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r9)
            return r0
        La3:
            char[] r1 = Yue.C3595.f11467     // Catch: java.lang.Throwable -> L19
            r0.append(r1, r11, r10)     // Catch: java.lang.Throwable -> L19
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "sb.toString()"
            Yue.C3329.m13905(r10, r1)     // Catch: java.lang.Throwable -> L19
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L19
            if (r1 <= r4) goto Lba
            r9.m14543()     // Catch: java.lang.Throwable -> L19
        Lba:
            r0.setLength(r11)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r9)
            return r10
        Lbf:
            int r0 = r9.m14538()     // Catch: java.lang.Throwable -> L19
            goto L2c
        Lc5:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L19
            throw r10
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m14542() {
            r2 = this;
            java.nio.charset.CharsetDecoder r0 = Yue.C3595.f11464
            if (r0 != 0) goto La
            java.lang.String r0 = "decoder"
            Yue.C3329.m13935(r0)
            r0 = 0
        La:
            r0.reset()
            java.nio.ByteBuffer r0 = Yue.C3595.f11468
            r1 = 0
            r0.position(r1)
            java.lang.StringBuilder r0 = Yue.C3595.f11470
            r0.setLength(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m14543() {
            r2 = this;
            java.lang.StringBuilder r0 = Yue.C3595.f11470
            r1 = 32
            r0.setLength(r1)
            r0.trimToSize()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m14544(java.nio.charset.Charset r5) {
            r4 = this;
            java.nio.charset.CharsetDecoder r5 = r5.newDecoder()
            java.lang.String r0 = "charset.newDecoder()"
            Yue.C3329.m13905(r5, r0)
            Yue.C3595.f11464 = r5
            java.nio.ByteBuffer r5 = Yue.C3595.f11468
            r5.clear()
            java.nio.CharBuffer r0 = Yue.C3595.f11469
            r0.clear()
            r1 = 10
            r5.put(r1)
            r5.flip()
            java.nio.charset.CharsetDecoder r2 = Yue.C3595.f11464
            if (r2 != 0) goto L27
            java.lang.String r2 = "decoder"
            Yue.C3329.m13935(r2)
            r2 = 0
        L27:
            r3 = 0
            r2.decode(r5, r0, r3)
            int r5 = r0.position()
            r2 = 1
            if (r5 != r2) goto L39
            char r5 = r0.get(r3)
            if (r5 != r1) goto L39
            r3 = r2
        L39:
            Yue.C3595.f11465 = r3
            r4.m14542()
            return
    }
}
