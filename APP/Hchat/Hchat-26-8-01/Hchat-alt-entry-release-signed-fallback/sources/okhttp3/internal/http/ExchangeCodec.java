package okhttp3.internal.http;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface ExchangeCodec {
    public static final okhttp3.internal.http.ExchangeCodec.Companion Companion = null;
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        static final /* synthetic */ okhttp3.internal.http.ExchangeCodec.Companion $$INSTANCE = null;
        public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

        static {
                okhttp3.internal.http.ExchangeCodec$Companion r0 = new okhttp3.internal.http.ExchangeCodec$Companion
                r0.<init>()
                okhttp3.internal.http.ExchangeCodec.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            okhttp3.internal.http.ExchangeCodec$Companion r0 = okhttp3.internal.http.ExchangeCodec.Companion.$$INSTANCE
            okhttp3.internal.http.ExchangeCodec.Companion = r0
            return
    }

    void cancel();

    okio.Sink createRequestBody(okhttp3.Request r1, long r2);

    void finishRequest();

    void flushRequest();

    okhttp3.internal.connection.RealConnection getConnection();

    okio.Source openResponseBodySource(okhttp3.Response r1);

    okhttp3.Response.Builder readResponseHeaders(boolean r1);

    long reportedContentLength(okhttp3.Response r1);

    okhttp3.Headers trailers();

    void writeRequestHeaders(okhttp3.Request r1);
}
