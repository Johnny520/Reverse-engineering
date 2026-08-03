package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥۣۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6986 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C6986.C6987 f24365 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.lang.String f24366 = "Sec-WebSocket-Extensions";

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC3417
    public final boolean f24367;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC3417
    @Yue.InterfaceC4543
    public final java.lang.Integer f24368;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC3417
    public final boolean f24369;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC3417
    @Yue.InterfaceC4543
    public final java.lang.Integer f24370;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC3417
    public final boolean f24371;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC3417
    public final boolean f24372;

    /* JADX INFO: renamed from: Yue.ۥۢۥۣۡ$ۥ, reason: contains not printable characters */
    public static final class C6987 {
        public C6987() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C6987(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C6986 m27016(@Yue.InterfaceC4418 Yue.C2994 r21) throws java.io.IOException {
                r20 = this;
                r0 = r21
                java.lang.String r1 = "responseHeaders"
                Yue.C3329.m13906(r0, r1)
                int r1 = r21.size()
                r4 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
            L12:
                if (r4 >= r1) goto Ld0
                java.lang.String r5 = r0.m12682(r4)
                java.lang.String r12 = "Sec-WebSocket-Extensions"
                r13 = 1
                boolean r5 = Yue.C5988.m22281(r5, r12, r13)
                if (r5 != 0) goto L23
                goto Lcc
            L23:
                java.lang.String r5 = r0.m12686(r4)
                r12 = 0
            L28:
                int r14 = r5.length()
                if (r12 >= r14) goto Lcc
                r18 = 4
                r19 = 0
                r15 = 44
                r17 = 0
                r14 = r5
                r16 = r12
                int r14 = Yue.C6656.m25573(r14, r15, r16, r17, r18, r19)
                r15 = 59
                int r2 = Yue.C6656.m25571(r5, r15, r12, r14)
                java.lang.String r12 = Yue.C6656.m25616(r5, r12, r2)
                int r2 = r2 + r13
                java.lang.String r3 = "permessage-deflate"
                boolean r3 = Yue.C5988.m22281(r12, r3, r13)
                if (r3 == 0) goto Lc8
                if (r6 == 0) goto L53
                r11 = r13
            L53:
                r12 = r2
            L54:
                if (r12 >= r14) goto Lc5
                int r2 = Yue.C6656.m25571(r5, r15, r12, r14)
                r3 = 61
                int r3 = Yue.C6656.m25571(r5, r3, r12, r2)
                java.lang.String r6 = Yue.C6656.m25616(r5, r12, r3)
                if (r3 >= r2) goto L73
                int r3 = r3 + 1
                java.lang.String r3 = Yue.C6656.m25616(r5, r3, r2)
                java.lang.String r12 = "\""
                java.lang.String r3 = Yue.C5989.m22410(r3, r12)
                goto L74
            L73:
                r3 = 0
            L74:
                int r12 = r2 + 1
                java.lang.String r2 = "client_max_window_bits"
                boolean r2 = Yue.C5988.m22281(r6, r2, r13)
                if (r2 == 0) goto L8e
                if (r7 == 0) goto L81
                r11 = r13
            L81:
                if (r3 == 0) goto L89
                java.lang.Integer r2 = Yue.C5987.m22242(r3)
                r7 = r2
                goto L8a
            L89:
                r7 = 0
            L8a:
                if (r7 != 0) goto L54
            L8c:
                r11 = r13
                goto L54
            L8e:
                java.lang.String r2 = "client_no_context_takeover"
                boolean r2 = Yue.C5988.m22281(r6, r2, r13)
                if (r2 == 0) goto L9e
                if (r8 == 0) goto L99
                r11 = r13
            L99:
                if (r3 == 0) goto L9c
                r11 = r13
            L9c:
                r8 = r13
                goto L54
            L9e:
                java.lang.String r2 = "server_max_window_bits"
                boolean r2 = Yue.C5988.m22281(r6, r2, r13)
                if (r2 == 0) goto Lb5
                if (r9 == 0) goto La9
                r11 = r13
            La9:
                if (r3 == 0) goto Lb1
                java.lang.Integer r2 = Yue.C5987.m22242(r3)
                r9 = r2
                goto Lb2
            Lb1:
                r9 = 0
            Lb2:
                if (r9 != 0) goto L54
                goto L8c
            Lb5:
                java.lang.String r2 = "server_no_context_takeover"
                boolean r2 = Yue.C5988.m22281(r6, r2, r13)
                if (r2 == 0) goto L8c
                if (r10 == 0) goto Lc0
                r11 = r13
            Lc0:
                if (r3 == 0) goto Lc3
                r11 = r13
            Lc3:
                r10 = r13
                goto L54
            Lc5:
                r6 = r13
                goto L28
            Lc8:
                r12 = r2
                r11 = r13
                goto L28
            Lcc:
                int r4 = r4 + 1
                goto L12
            Ld0:
                Yue.ۥۢۥۣۡ r0 = new Yue.ۥۢۥۣۡ
                r5 = r0
                r5.<init>(r6, r7, r8, r9, r10, r11)
                return r0
        }
    }

    static {
            Yue.ۥۢۥۣۡ$ۥ r0 = new Yue.ۥۢۥۣۡ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C6986.f24365 = r0
            return
    }

    public C6986() {
            r9 = this;
            r7 = 63
            r8 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public C6986(boolean r1, @Yue.InterfaceC4543 java.lang.Integer r2, boolean r3, @Yue.InterfaceC4543 java.lang.Integer r4, boolean r5, boolean r6) {
            r0 = this;
            r0.<init>()
            r0.f24367 = r1
            r0.f24368 = r2
            r0.f24369 = r3
            r0.f24370 = r4
            r0.f24371 = r5
            r0.f24372 = r6
            return
    }

    public /* synthetic */ C6986(boolean r6, java.lang.Integer r7, boolean r8, java.lang.Integer r9, boolean r10, boolean r11, int r12, Yue.C1769 r13) {
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L7
            r13 = r0
            goto L8
        L7:
            r13 = r6
        L8:
            r6 = r12 & 2
            r1 = 0
            if (r6 == 0) goto Lf
            r2 = r1
            goto L10
        Lf:
            r2 = r7
        L10:
            r6 = r12 & 4
            if (r6 == 0) goto L16
            r3 = r0
            goto L17
        L16:
            r3 = r8
        L17:
            r6 = r12 & 8
            if (r6 == 0) goto L1c
            goto L1d
        L1c:
            r1 = r9
        L1d:
            r6 = r12 & 16
            if (r6 == 0) goto L23
            r4 = r0
            goto L24
        L23:
            r4 = r10
        L24:
            r6 = r12 & 32
            if (r6 == 0) goto L2a
            r12 = r0
            goto L2b
        L2a:
            r12 = r11
        L2b:
            r6 = r5
            r7 = r13
            r8 = r2
            r9 = r3
            r10 = r1
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ Yue.C6986 m27007(Yue.C6986 r4, boolean r5, java.lang.Integer r6, boolean r7, java.lang.Integer r8, boolean r9, boolean r10, int r11, java.lang.Object r12) {
            r12 = r11 & 1
            if (r12 == 0) goto L6
            boolean r5 = r4.f24367
        L6:
            r12 = r11 & 2
            if (r12 == 0) goto Lc
            java.lang.Integer r6 = r4.f24368
        Lc:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L13
            boolean r7 = r4.f24369
        L13:
            r0 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L1a
            java.lang.Integer r8 = r4.f24370
        L1a:
            r1 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L21
            boolean r9 = r4.f24371
        L21:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L28
            boolean r10 = r4.f24372
        L28:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r3
            Yue.ۥۢۥۣۡ r4 = r6.m27014(r7, r8, r9, r10, r11, r12)
            return r4
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof Yue.C6986
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥۢۥۣۡ r5 = (Yue.C6986) r5
            boolean r1 = r4.f24367
            boolean r3 = r5.f24367
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.Integer r1 = r4.f24368
            java.lang.Integer r3 = r5.f24368
            boolean r1 = Yue.C3329.m13897(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            boolean r1 = r4.f24369
            boolean r3 = r5.f24369
            if (r1 == r3) goto L25
            return r2
        L25:
            java.lang.Integer r1 = r4.f24370
            java.lang.Integer r3 = r5.f24370
            boolean r1 = Yue.C3329.m13897(r1, r3)
            if (r1 != 0) goto L30
            return r2
        L30:
            boolean r1 = r4.f24371
            boolean r3 = r5.f24371
            if (r1 == r3) goto L37
            return r2
        L37:
            boolean r1 = r4.f24372
            boolean r5 = r5.f24372
            if (r1 == r5) goto L3e
            return r2
        L3e:
            return r0
    }

    public int hashCode() {
            r4 = this;
            boolean r0 = r4.f24367
            r1 = 1
            if (r0 == 0) goto L6
            r0 = r1
        L6:
            int r0 = r0 * 31
            java.lang.Integer r2 = r4.f24368
            r3 = 0
            if (r2 != 0) goto Lf
            r2 = r3
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r2 = r4.f24369
            if (r2 == 0) goto L1b
            r2 = r1
        L1b:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Integer r2 = r4.f24370
            if (r2 != 0) goto L23
            goto L27
        L23:
            int r3 = r2.hashCode()
        L27:
            int r0 = r0 + r3
            int r0 = r0 * 31
            boolean r2 = r4.f24371
            if (r2 == 0) goto L2f
            r2 = r1
        L2f:
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r2 = r4.f24372
            if (r2 == 0) goto L37
            goto L38
        L37:
            r1 = r2
        L38:
            int r0 = r0 + r1
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "WebSocketExtensions(perMessageDeflate="
            r0.append(r1)
            boolean r1 = r2.f24367
            r0.append(r1)
            java.lang.String r1 = ", clientMaxWindowBits="
            r0.append(r1)
            java.lang.Integer r1 = r2.f24368
            r0.append(r1)
            java.lang.String r1 = ", clientNoContextTakeover="
            r0.append(r1)
            boolean r1 = r2.f24369
            r0.append(r1)
            java.lang.String r1 = ", serverMaxWindowBits="
            r0.append(r1)
            java.lang.Integer r1 = r2.f24370
            r0.append(r1)
            java.lang.String r1 = ", serverNoContextTakeover="
            r0.append(r1)
            boolean r1 = r2.f24371
            r0.append(r1)
            java.lang.String r1 = ", unknownValues="
            r0.append(r1)
            boolean r1 = r2.f24372
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final boolean m27008() {
            r1 = this;
            boolean r0 = r1.f24367
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.lang.Integer m27009() {
            r1 = this;
            java.lang.Integer r0 = r1.f24368
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m27010() {
            r1 = this;
            boolean r0 = r1.f24369
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final java.lang.Integer m27011() {
            r1 = this;
            java.lang.Integer r0 = r1.f24370
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m27012() {
            r1 = this;
            boolean r0 = r1.f24371
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final boolean m27013() {
            r1 = this;
            boolean r0 = r1.f24372
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final Yue.C6986 m27014(boolean r9, @Yue.InterfaceC4543 java.lang.Integer r10, boolean r11, @Yue.InterfaceC4543 java.lang.Integer r12, boolean r13, boolean r14) {
            r8 = this;
            Yue.ۥۢۥۣۡ r7 = new Yue.ۥۢۥۣۡ
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean m27015(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            boolean r1 = r0.f24369
            goto L7
        L5:
            boolean r1 = r0.f24371
        L7:
            return r1
    }
}
