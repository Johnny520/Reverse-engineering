package okhttp3;

/* JADX INFO: compiled from: Response.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001FB{\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018J\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\b+J\r\u0010\u001a\u001a\u00020\u001bH\u0007¢\u0006\u0002\b,J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0002\b-J\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/J\b\u00101\u001a\u000202H\u0016J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b3J\u000f\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\b4J\u001e\u00105\u001a\u0004\u0018\u00010\u00072\u0006\u00106\u001a\u00020\u00072\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0007H\u0007J\r\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\b8J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070/2\u0006\u00106\u001a\u00020\u0007J\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b9J\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0002\b:J\u0006\u0010;\u001a\u00020<J\u000e\u0010=\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u0014J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0002\b?J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b@J\r\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0002\bAJ\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\bBJ\r\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\bCJ\b\u0010D\u001a\u00020\u0007H\u0016J\u0006\u0010E\u001a\u00020\rR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001dR\u0013\u0010\b\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001eR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u001fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010 R\u0013\u0010\f\u001a\u00020\r8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010!R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b\"\u0010$R\u0011\u0010%\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b%\u0010$R\u0010\u0010&\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010'R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001dR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u001dR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010(R\u0013\u0010\u0015\u001a\u00020\u00148\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010)R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010*R\u0013\u0010\u0013\u001a\u00020\u00148\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010)¨\u0006G"}, m115d2 = {"Lokhttp3/Response;", "Ljava/io/Closeable;", "request", "Lokhttp3/Request;", "protocol", "Lokhttp3/Protocol;", "message", "", "code", "", "handshake", "Lokhttp3/Handshake;", "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/ResponseBody;", "networkResponse", "cacheResponse", "priorResponse", "sentRequestAtMillis", "", "receivedResponseAtMillis", "exchange", "Lokhttp3/internal/connection/Exchange;", "(Lokhttp3/Request;Lokhttp3/Protocol;Ljava/lang/String;ILokhttp3/Handshake;Lokhttp3/Headers;Lokhttp3/ResponseBody;Lokhttp3/Response;Lokhttp3/Response;Lokhttp3/Response;JJLokhttp3/internal/connection/Exchange;)V", "()Lokhttp3/ResponseBody;", "cacheControl", "Lokhttp3/CacheControl;", "()Lokhttp3/CacheControl;", "()Lokhttp3/Response;", "()I", "()Lokhttp3/internal/connection/Exchange;", "()Lokhttp3/Handshake;", "()Lokhttp3/Headers;", "isRedirect", "", "()Z", "isSuccessful", "lazyCacheControl", "()Ljava/lang/String;", "()Lokhttp3/Protocol;", "()J", "()Lokhttp3/Request;", "-deprecated_body", "-deprecated_cacheControl", "-deprecated_cacheResponse", "challenges", "", "Lokhttp3/Challenge;", "close", "", "-deprecated_code", "-deprecated_handshake", "header", "name", "defaultValue", "-deprecated_headers", "-deprecated_message", "-deprecated_networkResponse", "newBuilder", "Lokhttp3/Response$Builder;", "peekBody", "byteCount", "-deprecated_priorResponse", "-deprecated_protocol", "-deprecated_receivedResponseAtMillis", "-deprecated_request", "-deprecated_sentRequestAtMillis", "toString", "trailers", "Builder", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class Response implements java.io.Closeable {
    private final okhttp3.ResponseBody body;
    private final okhttp3.Response cacheResponse;
    private final int code;
    private final okhttp3.internal.connection.Exchange exchange;
    private final okhttp3.Handshake handshake;
    private final okhttp3.Headers headers;
    private okhttp3.CacheControl lazyCacheControl;
    private final java.lang.String message;
    private final okhttp3.Response networkResponse;
    private final okhttp3.Response priorResponse;
    private final okhttp3.Protocol protocol;
    private final long receivedResponseAtMillis;
    private final okhttp3.Request request;
    private final long sentRequestAtMillis;

    /* JADX INFO: compiled from: Response.kt */
    @kotlin.Metadata(m114d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020)2\u0006\u0010K\u001a\u00020)H\u0016J\u0012\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010L\u001a\u00020\u0004H\u0016J\u0012\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010M\u001a\u00020N2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002J\u001a\u0010O\u001a\u00020N2\u0006\u0010J\u001a\u00020)2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u001c\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0018\u0010P\u001a\u00020\u00002\u0006\u0010J\u001a\u00020)2\u0006\u0010K\u001a\u00020)H\u0016J\u0010\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020QH\u0016J\u0015\u0010R\u001a\u00020N2\u0006\u0010S\u001a\u00020\u0017H\u0000¢\u0006\u0002\bTJ\u0010\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)H\u0016J\u0012\u0010.\u001a\u00020\u00002\b\u0010.\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u00101\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u00104\u001a\u00020\u00002\u0006\u00104\u001a\u000205H\u0016J\u0010\u0010:\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;H\u0016J\u0010\u0010U\u001a\u00020\u00002\u0006\u0010J\u001a\u00020)H\u0016J\u0010\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010F\u001a\u00020\u00002\u0006\u0010F\u001a\u00020;H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0010\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u000e\"\u0004\b0\u0010\u0005R\u001c\u00101\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u000e\"\u0004\b3\u0010\u0005R\u001c\u00104\u001a\u0004\u0018\u000105X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020;X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001c\u0010@\u001a\u0004\u0018\u00010AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010F\u001a\u00020;X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010=\"\u0004\bH\u0010?¨\u0006V"}, m115d2 = {"Lokhttp3/Response$Builder;", "", "()V", "response", "Lokhttp3/Response;", "(Lokhttp3/Response;)V", "body", "Lokhttp3/ResponseBody;", "getBody$okhttp", "()Lokhttp3/ResponseBody;", "setBody$okhttp", "(Lokhttp3/ResponseBody;)V", "cacheResponse", "getCacheResponse$okhttp", "()Lokhttp3/Response;", "setCacheResponse$okhttp", "code", "", "getCode$okhttp", "()I", "setCode$okhttp", "(I)V", "exchange", "Lokhttp3/internal/connection/Exchange;", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "setExchange$okhttp", "(Lokhttp3/internal/connection/Exchange;)V", "handshake", "Lokhttp3/Handshake;", "getHandshake$okhttp", "()Lokhttp3/Handshake;", "setHandshake$okhttp", "(Lokhttp3/Handshake;)V", "headers", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "message", "", "getMessage$okhttp", "()Ljava/lang/String;", "setMessage$okhttp", "(Ljava/lang/String;)V", "networkResponse", "getNetworkResponse$okhttp", "setNetworkResponse$okhttp", "priorResponse", "getPriorResponse$okhttp", "setPriorResponse$okhttp", "protocol", "Lokhttp3/Protocol;", "getProtocol$okhttp", "()Lokhttp3/Protocol;", "setProtocol$okhttp", "(Lokhttp3/Protocol;)V", "receivedResponseAtMillis", "", "getReceivedResponseAtMillis$okhttp", "()J", "setReceivedResponseAtMillis$okhttp", "(J)V", "request", "Lokhttp3/Request;", "getRequest$okhttp", "()Lokhttp3/Request;", "setRequest$okhttp", "(Lokhttp3/Request;)V", "sentRequestAtMillis", "getSentRequestAtMillis$okhttp", "setSentRequestAtMillis$okhttp", "addHeader", "name", "value", "build", "checkPriorResponse", "", "checkSupportResponse", "header", "Lokhttp3/Headers;", "initExchange", "deferredTrailers", "initExchange$okhttp", "removeHeader", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static class Builder {
        private okhttp3.ResponseBody body;
        private okhttp3.Response cacheResponse;
        private int code;
        private okhttp3.internal.connection.Exchange exchange;
        private okhttp3.Handshake handshake;
        private okhttp3.Headers.Builder headers;
        private java.lang.String message;
        private okhttp3.Response networkResponse;
        private okhttp3.Response priorResponse;
        private okhttp3.Protocol protocol;
        private long receivedResponseAtMillis;
        private okhttp3.Request request;
        private long sentRequestAtMillis;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.code = r0
                okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
                r0.<init>()
                r1.headers = r0
                return
        }

        public Builder(okhttp3.Response r3) {
                r2 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r2.<init>()
                r0 = -1
                r2.code = r0
                okhttp3.Request r0 = r3.request()
                r2.request = r0
                okhttp3.Protocol r0 = r3.protocol()
                r2.protocol = r0
                int r0 = r3.code()
                r2.code = r0
                java.lang.String r0 = r3.message()
                r2.message = r0
                okhttp3.Handshake r0 = r3.handshake()
                r2.handshake = r0
                okhttp3.Headers r0 = r3.headers()
                okhttp3.Headers$Builder r0 = r0.newBuilder()
                r2.headers = r0
                okhttp3.ResponseBody r0 = r3.body()
                r2.body = r0
                okhttp3.Response r0 = r3.networkResponse()
                r2.networkResponse = r0
                okhttp3.Response r0 = r3.cacheResponse()
                r2.cacheResponse = r0
                okhttp3.Response r0 = r3.priorResponse()
                r2.priorResponse = r0
                long r0 = r3.sentRequestAtMillis()
                r2.sentRequestAtMillis = r0
                long r0 = r3.receivedResponseAtMillis()
                r2.receivedResponseAtMillis = r0
                okhttp3.internal.connection.Exchange r0 = r3.exchange()
                r2.exchange = r0
                return
        }

        private final void checkPriorResponse(okhttp3.Response r5) {
                r4 = this;
                if (r5 == 0) goto L1f
                r0 = r5
                r1 = 0
                okhttp3.ResponseBody r2 = r0.body()
                if (r2 != 0) goto Lc
                r2 = 1
                goto Ld
            Lc:
                r2 = 0
            Ld:
                if (r2 == 0) goto L11
            L10:
                goto L1f
            L11:
                r2 = 0
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "priorResponse.body != null"
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            L1f:
                return
        }

        private final void checkSupportResponse(java.lang.String r6, okhttp3.Response r7) {
                r5 = this;
                if (r7 == 0) goto Lab
                r0 = r7
                r1 = 0
                okhttp3.ResponseBody r2 = r0.body()
                r3 = 1
                r4 = 0
                if (r2 != 0) goto Le
                r2 = r3
                goto Lf
            Le:
                r2 = r4
            Lf:
                if (r2 == 0) goto L8d
                okhttp3.Response r2 = r0.networkResponse()
                if (r2 != 0) goto L19
                r2 = r3
                goto L1a
            L19:
                r2 = r4
            L1a:
                if (r2 == 0) goto L6f
                okhttp3.Response r2 = r0.cacheResponse()
                if (r2 != 0) goto L24
                r2 = r3
                goto L25
            L24:
                r2 = r4
            L25:
                if (r2 == 0) goto L51
                okhttp3.Response r2 = r0.priorResponse()
                if (r2 != 0) goto L2e
                goto L2f
            L2e:
                r3 = r4
            L2f:
                if (r3 == 0) goto L33
            L32:
                goto Lab
            L33:
                r2 = 0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.StringBuilder r3 = r3.append(r6)
                java.lang.String r4 = ".priorResponse != null"
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r2 = r3.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                throw r3
            L51:
                r2 = 0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.StringBuilder r3 = r3.append(r6)
                java.lang.String r4 = ".cacheResponse != null"
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r2 = r3.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                throw r3
            L6f:
                r2 = 0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.StringBuilder r3 = r3.append(r6)
                java.lang.String r4 = ".networkResponse != null"
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r2 = r3.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                throw r3
            L8d:
                r2 = 0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.StringBuilder r3 = r3.append(r6)
                java.lang.String r4 = ".body != null"
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r2 = r3.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                throw r3
            Lab:
                return
        }

        public okhttp3.Response.Builder addHeader(java.lang.String r4, java.lang.String r5) {
                r3 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = r3
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                r1 = 0
                okhttp3.Headers$Builder r2 = r0.headers
                r2.add(r4, r5)
                r0 = r3
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                return r0
        }

        public okhttp3.Response.Builder body(okhttp3.ResponseBody r3) {
                r2 = this;
                r0 = r2
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                r1 = 0
                r0.body = r3
                r0 = r2
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                return r0
        }

        public okhttp3.Response build() {
                r19 = this;
                r0 = r19
                int r1 = r0.code
                if (r1 < 0) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                if (r1 == 0) goto L69
            Lc:
                okhttp3.Request r3 = r0.request
                if (r3 == 0) goto L5b
                okhttp3.Protocol r4 = r0.protocol
                if (r4 == 0) goto L4d
                java.lang.String r5 = r0.message
                if (r5 == 0) goto L3f
                int r6 = r0.code
                okhttp3.Handshake r7 = r0.handshake
                okhttp3.Headers$Builder r1 = r0.headers
                okhttp3.Headers r8 = r1.build()
                okhttp3.ResponseBody r9 = r0.body
                okhttp3.Response r10 = r0.networkResponse
                okhttp3.Response r11 = r0.cacheResponse
                okhttp3.Response r12 = r0.priorResponse
                long r13 = r0.sentRequestAtMillis
                long r1 = r0.receivedResponseAtMillis
                okhttp3.internal.connection.Exchange r15 = r0.exchange
                okhttp3.Response r18 = new okhttp3.Response
                r16 = r1
                r2 = r18
                r1 = r15
                r15 = r16
                r17 = r1
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r17)
                return r18
            L3f:
                r1 = 0
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "message == null"
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L4d:
                r1 = 0
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "protocol == null"
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L5b:
                r1 = 0
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "request == null"
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L69:
                r1 = 0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "code < 0: "
                java.lang.StringBuilder r2 = r2.append(r3)
                int r3 = r0.code
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r1 = r2.toString()
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        public okhttp3.Response.Builder cacheResponse(okhttp3.Response r4) {
                r3 = this;
                r0 = r3
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                r1 = 0
                java.lang.String r2 = "cacheResponse"
                r0.checkSupportResponse(r2, r4)
                r0.cacheResponse = r4
                r0 = r3
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                return r0
        }

        public okhttp3.Response.Builder code(int r3) {
                r2 = this;
                r0 = r2
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                r1 = 0
                r0.code = r3
                r0 = r2
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                return r0
        }

        public final okhttp3.ResponseBody getBody$okhttp() {
                r1 = this;
                okhttp3.ResponseBody r0 = r1.body
                return r0
        }

        public final okhttp3.Response getCacheResponse$okhttp() {
                r1 = this;
                okhttp3.Response r0 = r1.cacheResponse
                return r0
        }

        public final int getCode$okhttp() {
                r1 = this;
                int r0 = r1.code
                return r0
        }

        public final okhttp3.internal.connection.Exchange getExchange$okhttp() {
                r1 = this;
                okhttp3.internal.connection.Exchange r0 = r1.exchange
                return r0
        }

        public final okhttp3.Handshake getHandshake$okhttp() {
                r1 = this;
                okhttp3.Handshake r0 = r1.handshake
                return r0
        }

        public final okhttp3.Headers.Builder getHeaders$okhttp() {
                r1 = this;
                okhttp3.Headers$Builder r0 = r1.headers
                return r0
        }

        public final java.lang.String getMessage$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.message
                return r0
        }

        public final okhttp3.Response getNetworkResponse$okhttp() {
                r1 = this;
                okhttp3.Response r0 = r1.networkResponse
                return r0
        }

        public final okhttp3.Response getPriorResponse$okhttp() {
                r1 = this;
                okhttp3.Response r0 = r1.priorResponse
                return r0
        }

        public final okhttp3.Protocol getProtocol$okhttp() {
                r1 = this;
                okhttp3.Protocol r0 = r1.protocol
                return r0
        }

        public final long getReceivedResponseAtMillis$okhttp() {
                r2 = this;
                long r0 = r2.receivedResponseAtMillis
                return r0
        }

        public final okhttp3.Request getRequest$okhttp() {
                r1 = this;
                okhttp3.Request r0 = r1.request
                return r0
        }

        public final long getSentRequestAtMillis$okhttp() {
                r2 = this;
                long r0 = r2.sentRequestAtMillis
                return r0
        }

        public okhttp3.Response.Builder handshake(okhttp3.Handshake r3) {
                r2 = this;
                r0 = r2
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                r1 = 0
                r0.handshake = r3
                r0 = r2
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                return r0
        }

        public okhttp3.Response.Builder header(java.lang.String r4, java.lang.String r5) {
                r3 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = r3
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                r1 = 0
                okhttp3.Headers$Builder r2 = r0.headers
                r2.set(r4, r5)
                r0 = r3
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                return r0
        }

        public okhttp3.Response.Builder headers(okhttp3.Headers r4) {
                r3 = this;
                java.lang.String r0 = "headers"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r0 = r3
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                r1 = 0
                okhttp3.Headers$Builder r2 = r4.newBuilder()
                r0.headers = r2
                r0 = r3
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                return r0
        }

        public final void initExchange$okhttp(okhttp3.internal.connection.Exchange r2) {
                r1 = this;
                java.lang.String r0 = "deferredTrailers"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.exchange = r2
                return
        }

        public okhttp3.Response.Builder message(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "message"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = r2
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                r1 = 0
                r0.message = r3
                r0 = r2
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                return r0
        }

        public okhttp3.Response.Builder networkResponse(okhttp3.Response r4) {
                r3 = this;
                r0 = r3
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                r1 = 0
                java.lang.String r2 = "networkResponse"
                r0.checkSupportResponse(r2, r4)
                r0.networkResponse = r4
                r0 = r3
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                return r0
        }

        public okhttp3.Response.Builder priorResponse(okhttp3.Response r3) {
                r2 = this;
                r0 = r2
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                r1 = 0
                r0.checkPriorResponse(r3)
                r0.priorResponse = r3
                r0 = r2
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                return r0
        }

        public okhttp3.Response.Builder protocol(okhttp3.Protocol r3) {
                r2 = this;
                java.lang.String r0 = "protocol"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = r2
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                r1 = 0
                r0.protocol = r3
                r0 = r2
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                return r0
        }

        public okhttp3.Response.Builder receivedResponseAtMillis(long r3) {
                r2 = this;
                r0 = r2
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                r1 = 0
                r0.receivedResponseAtMillis = r3
                r0 = r2
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                return r0
        }

        public okhttp3.Response.Builder removeHeader(java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r0 = r3
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                r1 = 0
                okhttp3.Headers$Builder r2 = r0.headers
                r2.removeAll(r4)
                r0 = r3
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                return r0
        }

        public okhttp3.Response.Builder request(okhttp3.Request r3) {
                r2 = this;
                java.lang.String r0 = "request"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = r2
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                r1 = 0
                r0.request = r3
                r0 = r2
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                return r0
        }

        public okhttp3.Response.Builder sentRequestAtMillis(long r3) {
                r2 = this;
                r0 = r2
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                r1 = 0
                r0.sentRequestAtMillis = r3
                r0 = r2
                okhttp3.Response$Builder r0 = (okhttp3.Response.Builder) r0
                return r0
        }

        public final void setBody$okhttp(okhttp3.ResponseBody r1) {
                r0 = this;
                r0.body = r1
                return
        }

        public final void setCacheResponse$okhttp(okhttp3.Response r1) {
                r0 = this;
                r0.cacheResponse = r1
                return
        }

        public final void setCode$okhttp(int r1) {
                r0 = this;
                r0.code = r1
                return
        }

        public final void setExchange$okhttp(okhttp3.internal.connection.Exchange r1) {
                r0 = this;
                r0.exchange = r1
                return
        }

        public final void setHandshake$okhttp(okhttp3.Handshake r1) {
                r0 = this;
                r0.handshake = r1
                return
        }

        public final void setHeaders$okhttp(okhttp3.Headers.Builder r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.headers = r2
                return
        }

        public final void setMessage$okhttp(java.lang.String r1) {
                r0 = this;
                r0.message = r1
                return
        }

        public final void setNetworkResponse$okhttp(okhttp3.Response r1) {
                r0 = this;
                r0.networkResponse = r1
                return
        }

        public final void setPriorResponse$okhttp(okhttp3.Response r1) {
                r0 = this;
                r0.priorResponse = r1
                return
        }

        public final void setProtocol$okhttp(okhttp3.Protocol r1) {
                r0 = this;
                r0.protocol = r1
                return
        }

        public final void setReceivedResponseAtMillis$okhttp(long r1) {
                r0 = this;
                r0.receivedResponseAtMillis = r1
                return
        }

        public final void setRequest$okhttp(okhttp3.Request r1) {
                r0 = this;
                r0.request = r1
                return
        }

        public final void setSentRequestAtMillis$okhttp(long r1) {
                r0 = this;
                r0.sentRequestAtMillis = r1
                return
        }
    }

    public Response(okhttp3.Request r17, okhttp3.Protocol r18, java.lang.String r19, int r20, okhttp3.Handshake r21, okhttp3.Headers r22, okhttp3.ResponseBody r23, okhttp3.Response r24, okhttp3.Response r25, okhttp3.Response r26, long r27, long r29, okhttp3.internal.connection.Exchange r31) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r22
            java.lang.String r5 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            java.lang.String r5 = "protocol"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            java.lang.String r5 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r5)
            java.lang.String r5 = "headers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            r16.<init>()
            r0.request = r1
            r0.protocol = r2
            r0.message = r3
            r5 = r20
            r0.code = r5
            r6 = r21
            r0.handshake = r6
            r0.headers = r4
            r7 = r23
            r0.body = r7
            r8 = r24
            r0.networkResponse = r8
            r9 = r25
            r0.cacheResponse = r9
            r10 = r26
            r0.priorResponse = r10
            r11 = r27
            r0.sentRequestAtMillis = r11
            r13 = r29
            r0.receivedResponseAtMillis = r13
            r15 = r31
            r0.exchange = r15
            return
    }

    public static /* synthetic */ java.lang.String header$default(okhttp3.Response r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.lang.String r0 = r0.header(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "body", imports = {}))
    /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name */
    public final okhttp3.ResponseBody m10350deprecated_body() {
            r1 = this;
            okhttp3.ResponseBody r0 = r1.body
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cacheControl", imports = {}))
    /* JADX INFO: renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final okhttp3.CacheControl m10351deprecated_cacheControl() {
            r1 = this;
            okhttp3.CacheControl r0 = r1.cacheControl()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cacheResponse", imports = {}))
    /* JADX INFO: renamed from: -deprecated_cacheResponse, reason: not valid java name */
    public final okhttp3.Response m10352deprecated_cacheResponse() {
            r1 = this;
            okhttp3.Response r0 = r1.cacheResponse
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "code", imports = {}))
    /* JADX INFO: renamed from: -deprecated_code, reason: not valid java name */
    public final int m10353deprecated_code() {
            r1 = this;
            int r0 = r1.code
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "handshake", imports = {}))
    /* JADX INFO: renamed from: -deprecated_handshake, reason: not valid java name */
    public final okhttp3.Handshake m10354deprecated_handshake() {
            r1 = this;
            okhttp3.Handshake r0 = r1.handshake
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "headers", imports = {}))
    /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name */
    public final okhttp3.Headers m10355deprecated_headers() {
            r1 = this;
            okhttp3.Headers r0 = r1.headers
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "message", imports = {}))
    /* JADX INFO: renamed from: -deprecated_message, reason: not valid java name */
    public final java.lang.String m10356deprecated_message() {
            r1 = this;
            java.lang.String r0 = r1.message
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "networkResponse", imports = {}))
    /* JADX INFO: renamed from: -deprecated_networkResponse, reason: not valid java name */
    public final okhttp3.Response m10357deprecated_networkResponse() {
            r1 = this;
            okhttp3.Response r0 = r1.networkResponse
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "priorResponse", imports = {}))
    /* JADX INFO: renamed from: -deprecated_priorResponse, reason: not valid java name */
    public final okhttp3.Response m10358deprecated_priorResponse() {
            r1 = this;
            okhttp3.Response r0 = r1.priorResponse
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "protocol", imports = {}))
    /* JADX INFO: renamed from: -deprecated_protocol, reason: not valid java name */
    public final okhttp3.Protocol m10359deprecated_protocol() {
            r1 = this;
            okhttp3.Protocol r0 = r1.protocol
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "receivedResponseAtMillis", imports = {}))
    /* JADX INFO: renamed from: -deprecated_receivedResponseAtMillis, reason: not valid java name */
    public final long m10360deprecated_receivedResponseAtMillis() {
            r2 = this;
            long r0 = r2.receivedResponseAtMillis
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "request", imports = {}))
    /* JADX INFO: renamed from: -deprecated_request, reason: not valid java name */
    public final okhttp3.Request m10361deprecated_request() {
            r1 = this;
            okhttp3.Request r0 = r1.request
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "sentRequestAtMillis", imports = {}))
    /* JADX INFO: renamed from: -deprecated_sentRequestAtMillis, reason: not valid java name */
    public final long m10362deprecated_sentRequestAtMillis() {
            r2 = this;
            long r0 = r2.sentRequestAtMillis
            return r0
    }

    public final okhttp3.ResponseBody body() {
            r1 = this;
            okhttp3.ResponseBody r0 = r1.body
            return r0
    }

    public final okhttp3.CacheControl cacheControl() {
            r3 = this;
            okhttp3.CacheControl r0 = r3.lazyCacheControl
            if (r0 != 0) goto Le
            okhttp3.CacheControl$Companion r1 = okhttp3.CacheControl.Companion
            okhttp3.Headers r2 = r3.headers
            okhttp3.CacheControl r0 = r1.parse(r2)
            r3.lazyCacheControl = r0
        Le:
            return r0
    }

    public final okhttp3.Response cacheResponse() {
            r1 = this;
            okhttp3.Response r0 = r1.cacheResponse
            return r0
    }

    public final java.util.List<okhttp3.Challenge> challenges() {
            r2 = this;
            okhttp3.Headers r0 = r2.headers
            int r1 = r2.code
            switch(r1) {
                case 401: goto Lf;
                case 407: goto Lc;
                default: goto L7;
            }
        L7:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
        Lc:
            java.lang.String r1 = "Proxy-Authenticate"
            goto L11
        Lf:
            java.lang.String r1 = "WWW-Authenticate"
        L11:
            java.util.List r0 = okhttp3.internal.http.HttpHeaders.parseChallenges(r0, r1)
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            okhttp3.ResponseBody r0 = r2.body
            if (r0 == 0) goto L8
            r0.close()
            return
        L8:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "response is not eligible for a body and must not be closed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final int code() {
            r1 = this;
            int r0 = r1.code
            return r0
    }

    public final okhttp3.internal.connection.Exchange exchange() {
            r1 = this;
            okhttp3.internal.connection.Exchange r0 = r1.exchange
            return r0
    }

    public final okhttp3.Handshake handshake() {
            r1 = this;
            okhttp3.Handshake r0 = r1.handshake
            return r0
    }

    public final java.lang.String header(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r1 = 2
            java.lang.String r0 = header$default(r2, r3, r0, r1, r0)
            return r0
    }

    public final java.lang.String header(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.Headers r0 = r1.headers
            java.lang.String r0 = r0.get(r2)
            if (r0 != 0) goto Le
            r0 = r3
        Le:
            return r0
    }

    public final java.util.List<java.lang.String> headers(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.Headers r0 = r1.headers
            java.util.List r0 = r0.values(r2)
            return r0
    }

    public final okhttp3.Headers headers() {
            r1 = this;
            okhttp3.Headers r0 = r1.headers
            return r0
    }

    public final boolean isRedirect() {
            r1 = this;
            int r0 = r1.code
            switch(r0) {
                case 300: goto L7;
                case 301: goto L7;
                case 302: goto L7;
                case 303: goto L7;
                case 304: goto L5;
                case 305: goto L5;
                case 306: goto L5;
                case 307: goto L7;
                case 308: goto L7;
                default: goto L5;
            }
        L5:
            r0 = 0
            goto L8
        L7:
            r0 = 1
        L8:
            return r0
    }

    public final boolean isSuccessful() {
            r3 = this;
            int r0 = r3.code
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r1 > r0) goto Lc
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 >= r1) goto Lc
            r2 = 1
        Lc:
            return r2
    }

    public final java.lang.String message() {
            r1 = this;
            java.lang.String r0 = r1.message
            return r0
    }

    public final okhttp3.Response networkResponse() {
            r1 = this;
            okhttp3.Response r0 = r1.networkResponse
            return r0
    }

    public final okhttp3.Response.Builder newBuilder() {
            r1 = this;
            okhttp3.Response$Builder r0 = new okhttp3.Response$Builder
            r0.<init>(r1)
            return r0
    }

    public final okhttp3.ResponseBody peekBody(long r8) throws java.io.IOException {
            r7 = this;
            okhttp3.ResponseBody r0 = r7.body
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            okio.BufferedSource r0 = r0.source()
            okio.BufferedSource r0 = r0.peek()
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            r0.request(r8)
            r2 = r0
            okio.Source r2 = (okio.Source) r2
            okio.Buffer r3 = r0.getBuffer()
            long r3 = r3.size()
            long r3 = java.lang.Math.min(r8, r3)
            r1.write(r2, r3)
            okhttp3.ResponseBody$Companion r2 = okhttp3.ResponseBody.Companion
            r3 = r1
            okio.BufferedSource r3 = (okio.BufferedSource) r3
            okhttp3.ResponseBody r4 = r7.body
            okhttp3.MediaType r4 = r4.contentType()
            long r5 = r1.size()
            okhttp3.ResponseBody r2 = r2.create(r3, r4, r5)
            return r2
    }

    public final okhttp3.Response priorResponse() {
            r1 = this;
            okhttp3.Response r0 = r1.priorResponse
            return r0
    }

    public final okhttp3.Protocol protocol() {
            r1 = this;
            okhttp3.Protocol r0 = r1.protocol
            return r0
    }

    public final long receivedResponseAtMillis() {
            r2 = this;
            long r0 = r2.receivedResponseAtMillis
            return r0
    }

    public final okhttp3.Request request() {
            r1 = this;
            okhttp3.Request r0 = r1.request
            return r0
    }

    public final long sentRequestAtMillis() {
            r2 = this;
            long r0 = r2.sentRequestAtMillis
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Response{protocol="
            java.lang.StringBuilder r0 = r0.append(r1)
            okhttp3.Protocol r1 = r2.protocol
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", code="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.code
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", message="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.message
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", url="
            java.lang.StringBuilder r0 = r0.append(r1)
            okhttp3.Request r1 = r2.request
            okhttp3.HttpUrl r1 = r1.url()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final okhttp3.Headers trailers() throws java.io.IOException {
            r2 = this;
            okhttp3.internal.connection.Exchange r0 = r2.exchange
            if (r0 == 0) goto L9
            okhttp3.Headers r0 = r0.trailers()
            return r0
        L9:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "trailers not available"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
