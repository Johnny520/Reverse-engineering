package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nWebSocketReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketReader.kt\nokhttp3/internal/ws/WebSocketReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1#2:299\n*E\n"})
public final class C6993 implements java.io.Closeable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean f24421;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC0849 f24422;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C6993.InterfaceC6994 f24423;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final boolean f24424;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final boolean f24425;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean f24426;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f24427;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public long f24428;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean f24429;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean f24430;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public boolean f24431;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C0843 f24432;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C0843 f24433;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.C4176 f24434;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final byte[] f24435;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final Yue.C0843.C0844 f24436;

    /* JADX INFO: renamed from: Yue.ۥۢۥۢ$ۥ, reason: contains not printable characters */
    public interface InterfaceC6994 {
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        void mo19764(@Yue.InterfaceC4418 java.lang.String r1) throws java.io.IOException;

        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        void mo19766(@Yue.InterfaceC4418 Yue.C0879 r1) throws java.io.IOException;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        void mo19767(@Yue.InterfaceC4418 Yue.C0879 r1);

        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        void mo19769(@Yue.InterfaceC4418 Yue.C0879 r1);

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        void mo19770(int r1, @Yue.InterfaceC4418 java.lang.String r2);
    }

    public C6993(boolean r2, @Yue.InterfaceC4418 Yue.InterfaceC0849 r3, @Yue.InterfaceC4418 Yue.C6993.InterfaceC6994 r4, boolean r5, boolean r6) {
            r1 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "frameCallback"
            Yue.C3329.m13906(r4, r0)
            r1.<init>()
            r1.f24421 = r2
            r1.f24422 = r3
            r1.f24423 = r4
            r1.f24424 = r5
            r1.f24425 = r6
            Yue.ۥۣ۟ۢۨ r3 = new Yue.ۥۣ۟ۢۨ
            r3.<init>()
            r1.f24432 = r3
            Yue.ۥۣ۟ۢۨ r3 = new Yue.ۥۣ۟ۢۨ
            r3.<init>()
            r1.f24433 = r3
            r3 = 0
            if (r2 == 0) goto L2a
            r4 = r3
            goto L2d
        L2a:
            r4 = 4
            byte[] r4 = new byte[r4]
        L2d:
            r1.f24435 = r4
            if (r2 == 0) goto L32
            goto L37
        L32:
            Yue.ۥۣ۟ۢۨ$ۥ r3 = new Yue.ۥۣ۟ۢۨ$ۥ
            r3.<init>()
        L37:
            r1.f24436 = r3
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            Yue.ۥۡۡ۟ۢ r0 = r1.f24434
            if (r0 == 0) goto L7
            r0.close()
        L7:
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.InterfaceC0849 m27054() {
            r1 = this;
            Yue.ۥۣۣ۟۠ r0 = r1.f24422
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m27055() throws java.io.IOException {
            r1 = this;
            r1.m27057()
            boolean r0 = r1.f24430
            if (r0 == 0) goto Lb
            r1.m27056()
            goto Le
        Lb:
            r1.m27059()
        Le:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m27056() throws java.io.IOException {
            r6 = this;
            long r0 = r6.f24428
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L33
            Yue.ۥۣۣ۟۠ r4 = r6.f24422
            Yue.ۥۣ۟ۢۨ r5 = r6.f24432
            r4.mo4869(r5, r0)
            boolean r0 = r6.f24421
            if (r0 != 0) goto L33
            Yue.ۥۣ۟ۢۨ r0 = r6.f24432
            Yue.ۥۣ۟ۢۨ$ۥ r1 = r6.f24436
            Yue.C3329.m13903(r1)
            r0.m4865(r1)
            Yue.ۥۣ۟ۢۨ$ۥ r0 = r6.f24436
            r0.m4918(r2)
            Yue.ۥۢۥۡۨ r0 = Yue.C6992.f24398
            Yue.ۥۣ۟ۢۨ$ۥ r1 = r6.f24436
            byte[] r4 = r6.f24435
            Yue.C3329.m13903(r4)
            r0.m27052(r1, r4)
            Yue.ۥۣ۟ۢۨ$ۥ r0 = r6.f24436
            r0.close()
        L33:
            int r0 = r6.f24427
            switch(r0) {
                case 8: goto L6d;
                case 9: goto L61;
                case 10: goto L55;
                default: goto L38;
            }
        L38:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown control opcode: "
            r1.append(r2)
            int r2 = r6.f24427
            java.lang.String r2 = Yue.C6656.m25608(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L55:
            Yue.ۥۢۥۢ$ۥ r0 = r6.f24423
            Yue.ۥۣ۟ۢۨ r1 = r6.f24432
            Yue.ۥۣ۟ۥۤ r1 = r1.mo4853()
            r0.mo19769(r1)
            goto La4
        L61:
            Yue.ۥۢۥۢ$ۥ r0 = r6.f24423
            Yue.ۥۣ۟ۢۨ r1 = r6.f24432
            Yue.ۥۣ۟ۥۤ r1 = r1.mo4853()
            r0.mo19767(r1)
            goto La4
        L6d:
            Yue.ۥۣ۟ۢۨ r0 = r6.f24432
            long r0 = r0.m4889()
            r4 = 1
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto La5
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L98
            Yue.ۥۣ۟ۢۨ r0 = r6.f24432
            short r0 = r0.readShort()
            Yue.ۥۣ۟ۢۨ r1 = r6.f24432
            java.lang.String r1 = r1.mo4867()
            Yue.ۥۢۥۡۨ r2 = Yue.C6992.f24398
            java.lang.String r2 = r2.m27051(r0)
            if (r2 != 0) goto L92
            goto L9c
        L92:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            r0.<init>(r2)
            throw r0
        L98:
            r0 = 1005(0x3ed, float:1.408E-42)
            java.lang.String r1 = ""
        L9c:
            Yue.ۥۢۥۢ$ۥ r2 = r6.f24423
            r2.mo19770(r0, r1)
            r0 = 1
            r6.f24426 = r0
        La4:
            return
        La5:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Malformed close payload length of 1."
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m27057() throws java.io.IOException, java.net.ProtocolException {
            r8 = this;
            boolean r0 = r8.f24426
            if (r0 != 0) goto L137
            Yue.ۥۣۣ۟۠ r0 = r8.f24422
            Yue.ۥۢۡۤۧ r0 = r0.mo4177()
            long r0 = r0.mo12064()
            Yue.ۥۣۣ۟۠ r2 = r8.f24422
            Yue.ۥۢۡۤۧ r2 = r2.mo4177()
            r2.mo12058()
            Yue.ۥۣۣ۟۠ r2 = r8.f24422     // Catch: java.lang.Throwable -> L12a
            byte r2 = r2.readByte()     // Catch: java.lang.Throwable -> L12a
            r3 = 255(0xff, float:3.57E-43)
            int r2 = Yue.C6656.m25556(r2, r3)     // Catch: java.lang.Throwable -> L12a
            Yue.ۥۣۣ۟۠ r4 = r8.f24422
            Yue.ۥۢۡۤۧ r4 = r4.mo4177()
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
            r4.mo12063(r0, r5)
            r0 = r2 & 15
            r8.f24427 = r0
            r1 = r2 & 128(0x80, float:1.8E-43)
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L3a
            r1 = r5
            goto L3b
        L3a:
            r1 = r4
        L3b:
            r8.f24429 = r1
            r6 = r2 & 8
            if (r6 == 0) goto L43
            r6 = r5
            goto L44
        L43:
            r6 = r4
        L44:
            r8.f24430 = r6
            if (r6 == 0) goto L53
            if (r1 == 0) goto L4b
            goto L53
        L4b:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Control frames must be final."
            r0.<init>(r1)
            throw r0
        L53:
            r1 = r2 & 64
            if (r1 == 0) goto L59
            r1 = r5
            goto L5a
        L59:
            r1 = r4
        L5a:
            java.lang.String r6 = "Unexpected rsv1 flag"
            if (r0 == r5) goto L6a
            r7 = 2
            if (r0 == r7) goto L6a
            if (r1 != 0) goto L64
            goto L7b
        L64:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            r0.<init>(r6)
            throw r0
        L6a:
            if (r1 == 0) goto L78
            boolean r0 = r8.f24424
            if (r0 == 0) goto L72
            r0 = r5
            goto L79
        L72:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            r0.<init>(r6)
            throw r0
        L78:
            r0 = r4
        L79:
            r8.f24431 = r0
        L7b:
            r0 = r2 & 32
            if (r0 != 0) goto L122
            r0 = r2 & 16
            if (r0 != 0) goto L11a
            Yue.ۥۣۣ۟۠ r0 = r8.f24422
            byte r0 = r0.readByte()
            int r0 = Yue.C6656.m25556(r0, r3)
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L92
            r4 = r5
        L92:
            boolean r1 = r8.f24421
            if (r4 != r1) goto La5
            java.net.ProtocolException r0 = new java.net.ProtocolException
            boolean r1 = r8.f24421
            if (r1 == 0) goto L9f
            java.lang.String r1 = "Server-sent frames must not be masked."
            goto La1
        L9f:
            java.lang.String r1 = "Client-sent frames must be masked."
        La1:
            r0.<init>(r1)
            throw r0
        La5:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            long r0 = (long) r0
            r8.f24428 = r0
            r2 = 126(0x7e, double:6.23E-322)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto Lc1
            Yue.ۥۣۣ۟۠ r0 = r8.f24422
            short r0 = r0.readShort()
            r1 = 65535(0xffff, float:9.1834E-41)
            int r0 = Yue.C6656.m25557(r0, r1)
            long r0 = (long) r0
            r8.f24428 = r0
            goto Lf8
        Lc1:
            r2 = 127(0x7f, double:6.27E-322)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Lf8
            Yue.ۥۣۣ۟۠ r0 = r8.f24422
            long r0 = r0.readLong()
            r8.f24428 = r0
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto Ld6
            goto Lf8
        Ld6:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Frame length 0x"
            r1.append(r2)
            long r2 = r8.f24428
            java.lang.String r2 = Yue.C6656.m25609(r2)
            r1.append(r2)
            java.lang.String r2 = " > 0x7FFFFFFFFFFFFFFF"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lf8:
            boolean r0 = r8.f24430
            if (r0 == 0) goto L10d
            long r0 = r8.f24428
            r2 = 125(0x7d, double:6.2E-322)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L105
            goto L10d
        L105:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Control frame must be less than 125B."
            r0.<init>(r1)
            throw r0
        L10d:
            if (r4 == 0) goto L119
            Yue.ۥۣۣ۟۠ r0 = r8.f24422
            byte[] r1 = r8.f24435
            Yue.C3329.m13903(r1)
            r0.readFully(r1)
        L119:
            return
        L11a:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Unexpected rsv3 flag"
            r0.<init>(r1)
            throw r0
        L122:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Unexpected rsv2 flag"
            r0.<init>(r1)
            throw r0
        L12a:
            r2 = move-exception
            Yue.ۥۣۣ۟۠ r3 = r8.f24422
            Yue.ۥۢۡۤۧ r3 = r3.mo4177()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS
            r3.mo12063(r0, r4)
            throw r2
        L137:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m27058() throws java.io.IOException {
            r5 = this;
        L0:
            boolean r0 = r5.f24426
            if (r0 != 0) goto L6a
            long r0 = r5.f24428
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L40
            Yue.ۥۣۣ۟۠ r2 = r5.f24422
            Yue.ۥۣ۟ۢۨ r3 = r5.f24433
            r2.mo4869(r3, r0)
            boolean r0 = r5.f24421
            if (r0 != 0) goto L40
            Yue.ۥۣ۟ۢۨ r0 = r5.f24433
            Yue.ۥۣ۟ۢۨ$ۥ r1 = r5.f24436
            Yue.C3329.m13903(r1)
            r0.m4865(r1)
            Yue.ۥۣ۟ۢۨ$ۥ r0 = r5.f24436
            Yue.ۥۣ۟ۢۨ r1 = r5.f24433
            long r1 = r1.m4889()
            long r3 = r5.f24428
            long r1 = r1 - r3
            r0.m4918(r1)
            Yue.ۥۢۥۡۨ r0 = Yue.C6992.f24398
            Yue.ۥۣ۟ۢۨ$ۥ r1 = r5.f24436
            byte[] r2 = r5.f24435
            Yue.C3329.m13903(r2)
            r0.m27052(r1, r2)
            Yue.ۥۣ۟ۢۨ$ۥ r0 = r5.f24436
            r0.close()
        L40:
            boolean r0 = r5.f24429
            if (r0 != 0) goto L69
            r5.m27060()
            int r0 = r5.f24427
            if (r0 != 0) goto L4c
            goto L0
        L4c:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected continuation opcode. Got: "
            r1.append(r2)
            int r2 = r5.f24427
            java.lang.String r2 = Yue.C6656.m25608(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L69:
            return
        L6a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m27059() throws java.io.IOException {
            r4 = this;
            int r0 = r4.f24427
            r1 = 1
            if (r0 == r1) goto L24
            r2 = 2
            if (r0 != r2) goto L9
            goto L24
        L9:
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown opcode: "
            r2.append(r3)
            java.lang.String r0 = Yue.C6656.m25608(r0)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L24:
            r4.m27058()
            boolean r2 = r4.f24431
            if (r2 == 0) goto L3d
            Yue.ۥۡۡ۟ۢ r2 = r4.f24434
            if (r2 != 0) goto L38
            Yue.ۥۡۡ۟ۢ r2 = new Yue.ۥۡۡ۟ۢ
            boolean r3 = r4.f24425
            r2.<init>(r3)
            r4.f24434 = r2
        L38:
            Yue.ۥۣ۟ۢۨ r3 = r4.f24433
            r2.m16331(r3)
        L3d:
            if (r0 != r1) goto L4b
            Yue.ۥۢۥۢ$ۥ r0 = r4.f24423
            Yue.ۥۣ۟ۢۨ r1 = r4.f24433
            java.lang.String r1 = r1.mo4867()
            r0.mo19764(r1)
            goto L56
        L4b:
            Yue.ۥۢۥۢ$ۥ r0 = r4.f24423
            Yue.ۥۣ۟ۢۨ r1 = r4.f24433
            Yue.ۥۣ۟ۥۤ r1 = r1.mo4853()
            r0.mo19766(r1)
        L56:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m27060() throws java.io.IOException {
            r1 = this;
        L0:
            boolean r0 = r1.f24426
            if (r0 != 0) goto L10
            r1.m27057()
            boolean r0 = r1.f24430
            if (r0 != 0) goto Lc
            goto L10
        Lc:
            r1.m27056()
            goto L0
        L10:
            return
    }
}
