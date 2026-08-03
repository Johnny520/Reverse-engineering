package okhttp3.internal.authenticator;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class JavaNetAuthenticator implements okhttp3.Authenticator {
    private final okhttp3.Dns defaultDns;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                java.net.Proxy$Type[] r0 = java.net.Proxy.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                okhttp3.internal.authenticator.JavaNetAuthenticator.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    public JavaNetAuthenticator() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
    }

    public JavaNetAuthenticator(okhttp3.Dns r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.defaultDns = r1
            return
    }

    public /* synthetic */ JavaNetAuthenticator(okhttp3.Dns r1, int r2, gg.g r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            okhttp3.Dns r1 = okhttp3.Dns.SYSTEM
        L6:
            r0.<init>(r1)
            return
    }

    private final java.net.InetAddress connectToInetAddress(java.net.Proxy r3, okhttp3.HttpUrl r4, okhttp3.Dns r5) {
            r2 = this;
            java.net.Proxy$Type r0 = r3.type()
            if (r0 != 0) goto L8
            r0 = -1
            goto L10
        L8:
            int[] r1 = okhttp3.internal.authenticator.JavaNetAuthenticator.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
        L10:
            r1 = 1
            if (r0 != r1) goto L22
            java.lang.String r3 = r4.host()
            java.util.List r3 = r5.lookup(r3)
            java.lang.Object r3 = tf.m.t1(r3)
            java.net.InetAddress r3 = (java.net.InetAddress) r3
            return r3
        L22:
            java.net.SocketAddress r3 = r3.address()
            r3.getClass()
            java.net.InetSocketAddress r3 = (java.net.InetSocketAddress) r3
            java.net.InetAddress r3 = r3.getAddress()
            r3.getClass()
            return r3
    }

    @Override // okhttp3.Authenticator
    public okhttp3.Request authenticate(okhttp3.Route r18, okhttp3.Response r19) {
            r17 = this;
            r0 = r17
            r19.getClass()
            java.util.List r1 = r19.challenges()
            okhttp3.Request r2 = r19.request()
            okhttp3.HttpUrl r3 = r2.url()
            int r4 = r19.code()
            r5 = 407(0x197, float:5.7E-43)
            if (r4 != r5) goto L1b
            r4 = 1
            goto L1c
        L1b:
            r4 = 0
        L1c:
            if (r18 == 0) goto L24
            java.net.Proxy r5 = r18.proxy()
            if (r5 != 0) goto L26
        L24:
            java.net.Proxy r5 = java.net.Proxy.NO_PROXY
        L26:
            java.util.Iterator r1 = r1.iterator()
        L2a:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto Ld7
            java.lang.Object r6 = r1.next()
            okhttp3.Challenge r6 = (okhttp3.Challenge) r6
            java.lang.String r7 = "Basic"
            java.lang.String r8 = r6.scheme()
            boolean r7 = r7.equalsIgnoreCase(r8)
            if (r7 != 0) goto L43
            goto L2a
        L43:
            if (r18 == 0) goto L51
            okhttp3.Address r7 = r18.address()
            if (r7 == 0) goto L51
            okhttp3.Dns r7 = r7.dns()
            if (r7 != 0) goto L53
        L51:
            okhttp3.Dns r7 = r0.defaultDns
        L53:
            if (r4 == 0) goto L81
            java.net.SocketAddress r8 = r5.address()
            r8.getClass()
            java.net.InetSocketAddress r8 = (java.net.InetSocketAddress) r8
            java.lang.String r9 = r8.getHostName()
            java.net.InetAddress r10 = r0.connectToInetAddress(r5, r3, r7)
            int r11 = r8.getPort()
            java.lang.String r12 = r3.scheme()
            java.lang.String r13 = r6.realm()
            java.lang.String r14 = r6.scheme()
            java.net.URL r15 = r3.url()
            java.net.Authenticator$RequestorType r16 = java.net.Authenticator.RequestorType.PROXY
            java.net.PasswordAuthentication r7 = java.net.Authenticator.requestPasswordAuthentication(r9, r10, r11, r12, r13, r14, r15, r16)
            goto La6
        L81:
            java.lang.String r8 = r3.host()
            r5.getClass()
            java.net.InetAddress r9 = r0.connectToInetAddress(r5, r3, r7)
            int r10 = r3.port()
            java.lang.String r11 = r3.scheme()
            java.lang.String r12 = r6.realm()
            java.lang.String r13 = r6.scheme()
            java.net.URL r14 = r3.url()
            java.net.Authenticator$RequestorType r15 = java.net.Authenticator.RequestorType.SERVER
            java.net.PasswordAuthentication r7 = java.net.Authenticator.requestPasswordAuthentication(r8, r9, r10, r11, r12, r13, r14, r15)
        La6:
            if (r7 == 0) goto L2a
            if (r4 == 0) goto Lad
            java.lang.String r1 = "Proxy-Authorization"
            goto Laf
        Lad:
            java.lang.String r1 = "Authorization"
        Laf:
            java.lang.String r3 = r7.getUserName()
            r3.getClass()
            char[] r4 = r7.getPassword()
            r4.getClass()
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            java.nio.charset.Charset r4 = r6.charset()
            java.lang.String r3 = okhttp3.Credentials.basic(r3, r5, r4)
            okhttp3.Request$Builder r2 = r2.newBuilder()
            okhttp3.Request$Builder r1 = r2.header(r1, r3)
            okhttp3.Request r1 = r1.build()
            return r1
        Ld7:
            r1 = 0
            return r1
    }
}
