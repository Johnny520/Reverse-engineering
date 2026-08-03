package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nWebSocketProtocol.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketProtocol.kt\nokhttp3/internal/ws/WebSocketProtocol\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n1#2:142\n*E\n"})
public final class C6992 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C6992 f24398 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.lang.String f24399 = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f24400 = 128;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f24401 = 64;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f24402 = 32;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f24403 = 16;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f24404 = 15;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f24405 = 8;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f24406 = 128;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f24407 = 127;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f24408 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f24409 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f24410 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f24411 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f24412 = 9;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f24413 = 10;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final long f24414 = 125;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final long f24415 = 123;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f24416 = 126;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final long f24417 = 65535;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f24418 = 127;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f24419 = 1001;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f24420 = 1005;

    static {
            Yue.ۥۢۥۡۨ r0 = new Yue.ۥۢۥۡۨ
            r0.<init>()
            Yue.C6992.f24398 = r0
            return
    }

    public C6992() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.String m27050(@Yue.InterfaceC4418 java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "key"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥۣ۟ۥۤ$ۥ r0 = Yue.C0879.f2556
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            Yue.ۥۣ۟ۥۤ r3 = r0.m5121(r3)
            Yue.ۥۣ۟ۥۤ r3 = r3.m5092()
            java.lang.String r3 = r3.mo5059()
            return r3
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.lang.String m27051(int r3) {
            r2 = this;
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r0) goto L33
            r0 = 5000(0x1388, float:7.006E-42)
            if (r3 < r0) goto L9
            goto L33
        L9:
            r0 = 1004(0x3ec, float:1.407E-42)
            if (r0 > r3) goto L12
            r0 = 1007(0x3ef, float:1.411E-42)
            if (r3 >= r0) goto L12
            goto L1a
        L12:
            r0 = 1015(0x3f7, float:1.422E-42)
            if (r0 > r3) goto L31
            r0 = 3000(0xbb8, float:4.204E-42)
            if (r3 >= r0) goto L31
        L1a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Code "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " is reserved and may not be used."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            goto L44
        L31:
            r3 = 0
            goto L44
        L33:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Code must be in range [1000,5000): "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L44:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m27052(@Yue.InterfaceC4418 Yue.C0843.C0844 r8, @Yue.InterfaceC4418 byte[] r9) {
            r7 = this;
            java.lang.String r0 = "cursor"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "key"
            Yue.C3329.m13906(r9, r0)
            int r0 = r9.length
            r1 = 0
        Lc:
            byte[] r2 = r8.f2384
            int r3 = r8.f2385
            int r4 = r8.f2386
            if (r2 == 0) goto L24
        L14:
            if (r3 >= r4) goto L24
            int r1 = r1 % r0
            r5 = r2[r3]
            r6 = r9[r1]
            r5 = r5 ^ r6
            byte r5 = (byte) r5
            r2[r3] = r5
            int r3 = r3 + 1
            int r1 = r1 + 1
            goto L14
        L24:
            int r2 = r8.m4916()
            r3 = -1
            if (r2 != r3) goto Lc
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m27053(int r2) {
            r1 = this;
            java.lang.String r2 = r1.m27051(r2)
            if (r2 != 0) goto L7
            return
        L7:
            Yue.C3329.m13903(r2)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }
}
