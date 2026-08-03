package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3357 implements Yue.InterfaceC0664 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC1943 f10810;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۨۦ$ۥ, reason: contains not printable characters */
    public /* synthetic */ class C3358 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ int[] f10811 = null;

        static {
                java.net.Proxy$Type[] r0 = java.net.Proxy.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                Yue.C3357.C3358.f10811 = r0
                return
        }
    }

    public C3357() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
    }

    public C3357(@Yue.InterfaceC4418 Yue.InterfaceC1943 r2) {
            r1 = this;
            java.lang.String r0 = "defaultDns"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f10810 = r2
            return
    }

    public /* synthetic */ C3357(Yue.InterfaceC1943 r1, int r2, Yue.C1769 r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            Yue.ۥ۠۟ۧۢ r1 = Yue.InterfaceC1943.f6090
        L6:
            r0.<init>(r1)
            return
    }

    @Override // Yue.InterfaceC0664
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ */
    public Yue.C5317 mo4336(@Yue.InterfaceC4543 Yue.C5436 r20, @Yue.InterfaceC4418 Yue.C5377 r21) throws java.io.IOException {
            r19 = this;
            r0 = r19
            java.lang.String r1 = "response"
            r2 = r21
            Yue.C3329.m13906(r2, r1)
            java.util.List r1 = r21.m20283()
            Yue.ۥۡۦۤۧ r3 = r21.m20300()
            Yue.ۥ۠ۤۨۥ r4 = r3.m20090()
            int r2 = r21.m20284()
            r5 = 407(0x197, float:5.7E-43)
            r6 = 1
            if (r2 != r5) goto L20
            r2 = r6
            goto L21
        L20:
            r2 = 0
        L21:
            if (r20 == 0) goto L29
            java.net.Proxy r5 = r20.m20513()
            if (r5 != 0) goto L2b
        L29:
            java.net.Proxy r5 = java.net.Proxy.NO_PROXY
        L2b:
            java.util.Iterator r1 = r1.iterator()
        L2f:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto Le9
            java.lang.Object r7 = r1.next()
            Yue.ۥ۟ۤ۠ۡ r7 = (Yue.C0969) r7
            java.lang.String r8 = r7.m5470()
            java.lang.String r9 = "Basic"
            boolean r8 = Yue.C5988.m22281(r9, r8, r6)
            if (r8 != 0) goto L48
            goto L2f
        L48:
            if (r20 == 0) goto L56
            Yue.ۥ۟۠ۢ r8 = r20.m20512()
            if (r8 == 0) goto L56
            Yue.ۥ۠۟ۧۢ r8 = r8.m1309()
            if (r8 != 0) goto L58
        L56:
            Yue.ۥ۠۟ۧۢ r8 = r0.f10810
        L58:
            java.lang.String r9 = "proxy"
            if (r2 == 0) goto L8d
            java.net.SocketAddress r10 = r5.address()
            java.lang.String r11 = "null cannot be cast to non-null type java.net.InetSocketAddress"
            Yue.C3329.m13904(r10, r11)
            java.net.InetSocketAddress r10 = (java.net.InetSocketAddress) r10
            java.lang.String r11 = r10.getHostName()
            Yue.C3329.m13905(r5, r9)
            java.net.InetAddress r12 = r0.m13965(r5, r4, r8)
            int r13 = r10.getPort()
            java.lang.String r14 = r4.m13480()
            java.lang.String r15 = r7.m5469()
            java.lang.String r16 = r7.m5470()
            java.net.URL r17 = r4.m13483()
            java.net.Authenticator$RequestorType r18 = java.net.Authenticator.RequestorType.PROXY
            java.net.PasswordAuthentication r8 = java.net.Authenticator.requestPasswordAuthentication(r11, r12, r13, r14, r15, r16, r17, r18)
            goto Lb4
        L8d:
            java.lang.String r10 = r4.m13463()
            Yue.C3329.m13905(r5, r9)
            java.net.InetAddress r8 = r0.m13965(r5, r4, r8)
            int r11 = r4.m13470()
            java.lang.String r12 = r4.m13480()
            java.lang.String r13 = r7.m5469()
            java.lang.String r14 = r7.m5470()
            java.net.URL r15 = r4.m13483()
            java.net.Authenticator$RequestorType r16 = java.net.Authenticator.RequestorType.SERVER
            r9 = r10
            r10 = r8
            java.net.PasswordAuthentication r8 = java.net.Authenticator.requestPasswordAuthentication(r9, r10, r11, r12, r13, r14, r15, r16)
        Lb4:
            if (r8 == 0) goto L2f
            if (r2 == 0) goto Lbb
            java.lang.String r1 = "Proxy-Authorization"
            goto Lbd
        Lbb:
            java.lang.String r1 = "Authorization"
        Lbd:
            java.lang.String r2 = r8.getUserName()
            java.lang.String r4 = "auth.userName"
            Yue.C3329.m13905(r2, r4)
            char[] r4 = r8.getPassword()
            java.lang.String r5 = "auth.password"
            Yue.C3329.m13905(r4, r5)
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            java.nio.charset.Charset r4 = r7.m5468()
            java.lang.String r2 = Yue.C1673.m8047(r2, r5, r4)
            Yue.ۥۡۦۤۧ$ۥ r3 = r3.m20087()
            Yue.ۥۡۦۤۧ$ۥ r1 = r3.m20104(r1, r2)
            Yue.ۥۡۦۤۧ r1 = r1.m20093()
            return r1
        Le9:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.net.InetAddress m13965(java.net.Proxy r3, Yue.C3171 r4, Yue.InterfaceC1943 r5) throws java.io.IOException {
            r2 = this;
            java.net.Proxy$Type r0 = r3.type()
            if (r0 != 0) goto L8
            r0 = -1
            goto L10
        L8:
            int[] r1 = Yue.C3357.C3358.f10811
            int r0 = r0.ordinal()
            r0 = r1[r0]
        L10:
            r1 = 1
            if (r0 != r1) goto L22
            java.lang.String r3 = r4.m13463()
            java.util.List r3 = r5.mo8933(r3)
            java.lang.Object r3 = Yue.C1219.m6361(r3)
            java.net.InetAddress r3 = (java.net.InetAddress) r3
            goto L36
        L22:
            java.net.SocketAddress r3 = r3.address()
            java.lang.String r4 = "null cannot be cast to non-null type java.net.InetSocketAddress"
            Yue.C3329.m13904(r3, r4)
            java.net.InetSocketAddress r3 = (java.net.InetSocketAddress) r3
            java.net.InetAddress r3 = r3.getAddress()
            java.lang.String r4 = "address() as InetSocketAddress).address"
            Yue.C3329.m13905(r3, r4)
        L36:
            return r3
    }
}
