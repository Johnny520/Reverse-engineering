package okhttp3.internal.authenticator;

/* JADX INFO: compiled from: JavaNetAuthenticator.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m115d2 = {"Lokhttp3/internal/authenticator/JavaNetAuthenticator;", "Lokhttp3/Authenticator;", "defaultDns", "Lokhttp3/Dns;", "(Lokhttp3/Dns;)V", "authenticate", "Lokhttp3/Request;", "route", "Lokhttp3/Route;", "response", "Lokhttp3/Response;", "connectToInetAddress", "Ljava/net/InetAddress;", "Ljava/net/Proxy;", "url", "Lokhttp3/HttpUrl;", "dns", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class JavaNetAuthenticator implements okhttp3.Authenticator {
    private final okhttp3.Dns defaultDns;

    /* JADX INFO: compiled from: JavaNetAuthenticator.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 8, 0}, m119xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                java.net.Proxy$Type[] r0 = java.net.Proxy.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT     // Catch: java.lang.NoSuchFieldError -> L11
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L11
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L11
                goto L12
            L11:
                r1 = move-exception
            L12:
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

    public JavaNetAuthenticator(okhttp3.Dns r2) {
            r1 = this;
            java.lang.String r0 = "defaultDns"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.defaultDns = r2
            return
    }

    public /* synthetic */ JavaNetAuthenticator(okhttp3.Dns r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            okhttp3.Dns r1 = okhttp3.Dns.SYSTEM
        L6:
            r0.<init>(r1)
            return
    }

    private final java.net.InetAddress connectToInetAddress(java.net.Proxy r3, okhttp3.HttpUrl r4, okhttp3.Dns r5) throws java.io.IOException {
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
            java.lang.String r0 = r4.host()
            java.util.List r0 = r5.lookup(r0)
            java.lang.Object r0 = kotlin.collections.CollectionsKt.first(r0)
            java.net.InetAddress r0 = (java.net.InetAddress) r0
            goto L36
        L22:
            java.net.SocketAddress r0 = r3.address()
            java.lang.String r1 = "null cannot be cast to non-null type java.net.InetSocketAddress"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.net.InetSocketAddress r0 = (java.net.InetSocketAddress) r0
            java.net.InetAddress r0 = r0.getAddress()
            java.lang.String r1 = "address() as InetSocketAddress).address"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        L36:
            return r0
    }

    @Override // okhttp3.Authenticator
    public okhttp3.Request authenticate(okhttp3.Route r22, okhttp3.Response r23) throws java.io.IOException {
            r21 = this;
            r0 = r21
            java.lang.String r1 = "response"
            r2 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            java.util.List r1 = r23.challenges()
            okhttp3.Request r3 = r23.request()
            okhttp3.HttpUrl r4 = r3.url()
            int r5 = r23.code()
            r6 = 407(0x197, float:5.7E-43)
            r7 = 1
            if (r5 != r6) goto L20
            r5 = r7
            goto L21
        L20:
            r5 = 0
        L21:
            if (r22 == 0) goto L29
            java.net.Proxy r6 = r22.proxy()
            if (r6 != 0) goto L2b
        L29:
            java.net.Proxy r6 = java.net.Proxy.NO_PROXY
        L2b:
            java.util.Iterator r8 = r1.iterator()
        L2f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Le8
            java.lang.Object r9 = r8.next()
            okhttp3.Challenge r9 = (okhttp3.Challenge) r9
            java.lang.String r10 = "Basic"
            java.lang.String r11 = r9.scheme()
            boolean r10 = kotlin.text.StringsKt.equals(r10, r11, r7)
            if (r10 != 0) goto L48
            goto L2f
        L48:
            if (r22 == 0) goto L56
            okhttp3.Address r10 = r22.address()
            if (r10 == 0) goto L56
            okhttp3.Dns r10 = r10.dns()
            if (r10 != 0) goto L58
        L56:
            okhttp3.Dns r10 = r0.defaultDns
        L58:
            java.lang.String r11 = "proxy"
            if (r5 == 0) goto L8d
            java.net.SocketAddress r12 = r6.address()
            java.lang.String r13 = "null cannot be cast to non-null type java.net.InetSocketAddress"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r12, r13)
            java.net.InetSocketAddress r12 = (java.net.InetSocketAddress) r12
            java.lang.String r13 = r12.getHostName()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r11)
            java.net.InetAddress r14 = r0.connectToInetAddress(r6, r4, r10)
            int r15 = r12.getPort()
            java.lang.String r16 = r4.scheme()
            java.lang.String r17 = r9.realm()
            java.lang.String r18 = r9.scheme()
            java.net.URL r19 = r4.url()
            java.net.Authenticator$RequestorType r20 = java.net.Authenticator.RequestorType.PROXY
            java.net.PasswordAuthentication r11 = java.net.Authenticator.requestPasswordAuthentication(r13, r14, r15, r16, r17, r18, r19, r20)
            goto Lb2
        L8d:
            java.lang.String r12 = r4.host()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r11)
            java.net.InetAddress r13 = r0.connectToInetAddress(r6, r4, r10)
            int r14 = r4.port()
            java.lang.String r15 = r4.scheme()
            java.lang.String r16 = r9.realm()
            java.lang.String r17 = r9.scheme()
            java.net.URL r18 = r4.url()
            java.net.Authenticator$RequestorType r19 = java.net.Authenticator.RequestorType.SERVER
            java.net.PasswordAuthentication r11 = java.net.Authenticator.requestPasswordAuthentication(r12, r13, r14, r15, r16, r17, r18, r19)
        Lb2:
            if (r11 == 0) goto L2f
            if (r5 == 0) goto Lba
            java.lang.String r7 = "Proxy-Authorization"
            goto Lbc
        Lba:
            java.lang.String r7 = "Authorization"
        Lbc:
            java.lang.String r8 = r11.getUserName()
            java.lang.String r12 = "auth.userName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r12)
            char[] r12 = r11.getPassword()
            java.lang.String r13 = "auth.password"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r13)
            java.lang.String r13 = new java.lang.String
            r13.<init>(r12)
            java.nio.charset.Charset r12 = r9.charset()
            java.lang.String r8 = okhttp3.Credentials.basic(r8, r13, r12)
            okhttp3.Request$Builder r12 = r3.newBuilder()
            okhttp3.Request$Builder r12 = r12.header(r7, r8)
            okhttp3.Request r12 = r12.build()
            return r12
        Le8:
            r7 = 0
            return r7
    }
}
