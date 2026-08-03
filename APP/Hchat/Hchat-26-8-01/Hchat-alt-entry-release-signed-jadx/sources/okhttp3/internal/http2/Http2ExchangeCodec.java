package okhttp3.internal.http2;

import gg.AbstractC1411g;
import gg.AbstractC1416l;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p136j8.AbstractC2091b;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Http2ExchangeCodec implements ExchangeCodec {
    private volatile boolean canceled;
    private final RealInterceptorChain chain;
    private final RealConnection connection;
    private final Http2Connection http2Connection;
    private final Protocol protocol;
    private volatile Http2Stream stream;
    public static final Companion Companion = new Companion(null);
    private static final String CONNECTION = "connection";
    private static final String HOST = "host";
    private static final String KEEP_ALIVE = "keep-alive";
    private static final String PROXY_CONNECTION = "proxy-connection";

    /* JADX INFO: renamed from: TE */
    private static final String f10230TE = "te";
    private static final String TRANSFER_ENCODING = "transfer-encoding";
    private static final String ENCODING = "encoding";
    private static final String UPGRADE = "upgrade";
    private static final List<String> HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableListOf(CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, f10230TE, TRANSFER_ENCODING, ENCODING, UPGRADE, Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);
    private static final List<String> HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableListOf(CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, f10230TE, TRANSFER_ENCODING, ENCODING, UPGRADE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Http2ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, RealInterceptorChain realInterceptorChain, Http2Connection http2Connection) {
        okHttpClient.getClass();
        realConnection.getClass();
        realInterceptorChain.getClass();
        http2Connection.getClass();
        this.connection = realConnection;
        this.chain = realInterceptorChain;
        this.http2Connection = http2Connection;
        List<Protocol> listProtocols = okHttpClient.protocols();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.protocol = listProtocols.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        this.canceled = true;
        Http2Stream http2Stream = this.stream;
        if (http2Stream != null) {
            http2Stream.closeLater(ErrorCode.CANCEL);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.http.ExchangeCodec
    public Sink createRequestBody(Request request, long j3) {
        request.getClass();
        Http2Stream http2Stream = this.stream;
        http2Stream.getClass();
        return http2Stream.getSink();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        Http2Stream http2Stream = this.stream;
        http2Stream.getClass();
        http2Stream.getSink().close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
        this.http2Connection.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.http.ExchangeCodec
    public RealConnection getConnection() {
        return this.connection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.http.ExchangeCodec
    public Source openResponseBodySource(Response response) {
        response.getClass();
        Http2Stream http2Stream = this.stream;
        http2Stream.getClass();
        return http2Stream.getSource$okhttp();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean z9) throws IOException {
        Http2Stream http2Stream = this.stream;
        if (http2Stream == null) {
            C2104o.m5299y("stream wasn't created");
            return null;
        }
        Response.Builder http2HeadersList = Companion.readHttp2HeadersList(http2Stream.takeHeaders(), this.protocol);
        if (z9 && http2HeadersList.getCode$okhttp() == 100) {
            return null;
        }
        return http2HeadersList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(Response response) {
        response.getClass();
        if (HttpHeaders.promisesBody(response)) {
            return Util.headersContentLength(response);
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.http.ExchangeCodec
    public Headers trailers() {
        Http2Stream http2Stream = this.stream;
        http2Stream.getClass();
        return http2Stream.trailers();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) throws IOException {
        request.getClass();
        if (this.stream != null) {
            return;
        }
        this.stream = this.http2Connection.newStream(Companion.http2HeadersList(request), request.body() != null);
        boolean z9 = this.canceled;
        Http2Stream http2Stream = this.stream;
        if (z9) {
            http2Stream.getClass();
            http2Stream.closeLater(ErrorCode.CANCEL);
            C2104o.m5299y("Canceled");
            return;
        }
        http2Stream.getClass();
        Timeout timeout = http2Stream.readTimeout();
        long readTimeoutMillis$okhttp = this.chain.getReadTimeoutMillis$okhttp();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(readTimeoutMillis$okhttp, timeUnit);
        Http2Stream http2Stream2 = this.stream;
        http2Stream2.getClass();
        http2Stream2.writeTimeout().timeout(this.chain.getWriteTimeoutMillis$okhttp(), timeUnit);
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.internal.http2.Http2ExchangeCodec.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final List<Header> http2HeadersList(Request request) {
            request.getClass();
            Headers headers = request.headers();
            ArrayList arrayList = new ArrayList(headers.size() + 4);
            arrayList.add(new Header(Header.TARGET_METHOD, request.method()));
            arrayList.add(new Header(Header.TARGET_PATH, RequestLine.INSTANCE.requestPath(request.url())));
            String strHeader = request.header("Host");
            if (strHeader != null) {
                arrayList.add(new Header(Header.TARGET_AUTHORITY, strHeader));
            }
            arrayList.add(new Header(Header.TARGET_SCHEME, request.url().scheme()));
            int size = headers.size();
            for (int i9 = 0; i9 < size; i9++) {
                String strName = headers.name(i9);
                Locale locale = Locale.US;
                String strM5165l = AbstractC2091b.m5165l(locale, strName, locale);
                if (!Http2ExchangeCodec.HTTP_2_SKIPPED_REQUEST_HEADERS.contains(strM5165l) || (strM5165l.equals(Http2ExchangeCodec.f10230TE) && AbstractC1416l.m3825a(headers.value(i9), "trailers"))) {
                    arrayList.add(new Header(strM5165l, headers.value(i9)));
                }
            }
            return arrayList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Response.Builder readHttp2HeadersList(Headers headers, Protocol protocol) throws ProtocolException {
            headers.getClass();
            protocol.getClass();
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            StatusLine statusLine = null;
            for (int i9 = 0; i9 < size; i9++) {
                String strName = headers.name(i9);
                String strValue = headers.value(i9);
                if (AbstractC1416l.m3825a(strName, Header.RESPONSE_STATUS_UTF8)) {
                    statusLine = StatusLine.Companion.parse("HTTP/1.1 " + strValue);
                } else if (!Http2ExchangeCodec.HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(strName)) {
                    builder.addLenient$okhttp(strName, strValue);
                }
            }
            if (statusLine != null) {
                return new Response.Builder().protocol(protocol).code(statusLine.code).message(statusLine.message).headers(builder.build());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        private Companion() {
        }
    }
}
