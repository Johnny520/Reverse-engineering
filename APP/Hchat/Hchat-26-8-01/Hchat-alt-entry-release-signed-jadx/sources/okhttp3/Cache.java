package okhttp3;

import bsh.C0353j;
import gg.AbstractC1411g;
import gg.AbstractC1416l;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.p220io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import p114hg.InterfaceC1711a;
import p129ig.AbstractC2043a;
import p136j8.C2104o;
import p218og.AbstractC3149m;
import p276sf.InterfaceC3954a;
import tf.C4173t;
import tf.C4175v;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Cache implements Closeable, Flushable {
    public static final Companion Companion = new Companion(null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    private final DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class CacheResponseBody extends ResponseBody {
        private final BufferedSource bodySource;
        private final String contentLength;
        private final String contentType;
        private final DiskLruCache.Snapshot snapshot;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            snapshot.getClass();
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = Okio.buffer(new ForwardingSource(snapshot.getSource(1)) { // from class: okhttp3.Cache.CacheResponseBody.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    this.getSnapshot().close();
                    super.close();
                }
            });
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okhttp3.ResponseBody
        public long contentLength() {
            String str = this.contentLength;
            if (str != null) {
                return Util.toLongOrDefault(str, -1L);
            }
            return -1L;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.Companion.parse(str);
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okhttp3.ResponseBody
        public BufferedSource source() {
            return this.bodySource;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class RealCacheRequest implements CacheRequest {
        private final Sink body;
        private final Sink cacheOut;
        private boolean done;
        private final DiskLruCache.Editor editor;
        final /* synthetic */ Cache this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public RealCacheRequest(final Cache cache, DiskLruCache.Editor editor) {
            editor.getClass();
            this.this$0 = cache;
            this.editor = editor;
            Sink sinkNewSink = editor.newSink(1);
            this.cacheOut = sinkNewSink;
            this.body = new ForwardingSink(sinkNewSink) { // from class: okhttp3.Cache.RealCacheRequest.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    Cache cache2 = cache;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache2) {
                        if (realCacheRequest.getDone()) {
                            return;
                        }
                        realCacheRequest.setDone(true);
                        cache2.setWriteSuccessCount$okhttp(cache2.getWriteSuccessCount$okhttp() + 1);
                        super.close();
                        this.editor.commit();
                    }
                }
            };
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
            Cache cache = this.this$0;
            synchronized (cache) {
                if (this.done) {
                    return;
                }
                this.done = true;
                cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount$okhttp() + 1);
                Util.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException unused) {
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okhttp3.internal.cache.CacheRequest
        public Sink body() {
            return this.body;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean getDone() {
            return this.done;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setDone(boolean z9) {
            this.done = z9;
        }
    }

    /* JADX INFO: renamed from: okhttp3.Cache$urls$1 */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class C31681 implements Iterator<String>, InterfaceC1711a {
        private boolean canRemove;
        private final Iterator<DiskLruCache.Snapshot> delegate;
        private String nextUrl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C31681(Cache cache) {
            this.delegate = cache.getCache$okhttp().snapshots();
        }

        /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextUrl != null) {
                return true;
            }
            this.canRemove = false;
            while (this.delegate.hasNext()) {
                try {
                    DiskLruCache.Snapshot next = this.delegate.next();
                    try {
                        continue;
                        this.nextUrl = Okio.buffer(next.getSource(0)).readUtf8LineStrict();
                        AbstractC2043a.m5035i(next, null);
                        return true;
                    } finally {
                        try {
                            continue;
                        } catch (Throwable th2) {
                        }
                    }
                } catch (IOException unused) {
                }
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        public String next() {
            if (!hasNext()) {
                C0353j.m1307e();
                return null;
            }
            String str = this.nextUrl;
            str.getClass();
            this.nextUrl = null;
            this.canRemove = true;
            return str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.Iterator
        public void remove() {
            if (this.canRemove) {
                this.delegate.remove();
            } else {
                C2104o.m5276A("remove() before next()");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Cache(File file, long j3, FileSystem fileSystem) {
        file.getClass();
        fileSystem.getClass();
        this.cache = new DiskLruCache(fileSystem, file, VERSION, 2, j3, TaskRunner.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String key(HttpUrl httpUrl) {
        return Companion.key(httpUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_directory, reason: not valid java name */
    public final File m10938deprecated_directory() {
        return this.cache.getDirectory();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.cache.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void delete() {
        this.cache.delete();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final File directory() {
        return this.cache.getDirectory();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void evictAll() {
        this.cache.evictAll();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Flushable
    public void flush() {
        this.cache.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Response get$okhttp(Request request) {
        request.getClass();
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(Companion.key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(snapshot);
                if (entry.matches(request, response)) {
                    return response;
                }
                ResponseBody responseBodyBody = response.body();
                if (responseBodyBody != null) {
                    Util.closeQuietly(responseBodyBody);
                }
                return null;
            } catch (IOException unused) {
                Util.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final DiskLruCache getCache$okhttp() {
        return this.cache;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getWriteAbortCount$okhttp() {
        return this.writeAbortCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getWriteSuccessCount$okhttp() {
        return this.writeSuccessCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized int hitCount() {
        return this.hitCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void initialize() {
        this.cache.initialize();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized int networkCount() {
        return this.networkCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final CacheRequest put$okhttp(Response response) {
        DiskLruCache.Editor editorEdit$default;
        response.getClass();
        String strMethod = response.request().method();
        if (HttpMethod.INSTANCE.invalidatesCache(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!AbstractC1416l.m3825a(strMethod, "GET")) {
            return null;
        }
        Companion companion = Companion;
        if (companion.hasVaryAll(response)) {
            return null;
        }
        Entry entry = new Entry(response);
        try {
            editorEdit$default = DiskLruCache.edit$default(this.cache, companion.key(response.request().url()), 0L, 2, null);
            if (editorEdit$default == null) {
                return null;
            }
            try {
                entry.writeTo(editorEdit$default);
                return new RealCacheRequest(this, editorEdit$default);
            } catch (IOException unused2) {
                abortQuietly(editorEdit$default);
                return null;
            }
        } catch (IOException unused3) {
            editorEdit$default = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void remove$okhttp(Request request) {
        request.getClass();
        this.cache.remove(Companion.key(request.url()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized int requestCount() {
        return this.requestCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setWriteAbortCount$okhttp(int i9) {
        this.writeAbortCount = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setWriteSuccessCount$okhttp(int i9) {
        this.writeSuccessCount = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long size() {
        return this.cache.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.hitCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void trackResponse$okhttp(CacheStrategy cacheStrategy) {
        try {
            cacheStrategy.getClass();
            this.requestCount++;
            if (cacheStrategy.getNetworkRequest() != null) {
                this.networkCount++;
            } else if (cacheStrategy.getCacheResponse() != null) {
                this.hitCount++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void update$okhttp(Response response, Response response2) {
        DiskLruCache.Editor editorEdit;
        response.getClass();
        response2.getClass();
        Entry entry = new Entry(response2);
        ResponseBody responseBodyBody = response.body();
        responseBodyBody.getClass();
        try {
            editorEdit = ((CacheResponseBody) responseBodyBody).getSnapshot().edit();
            if (editorEdit == null) {
                return;
            }
            try {
                entry.writeTo(editorEdit);
                editorEdit.commit();
            } catch (IOException unused) {
                abortQuietly(editorEdit);
            }
        } catch (IOException unused2) {
            editorEdit = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Iterator<String> urls() {
        return new C31681(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Entry {
        public static final Companion Companion = new Companion(null);
        private static final String RECEIVED_MILLIS;
        private static final String SENT_MILLIS;
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final HttpUrl url;
        private final Headers varyHeaders;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        static {
            StringBuilder sb2 = new StringBuilder();
            Platform.Companion companion = Platform.Companion;
            sb2.append(companion.get().getPrefix());
            sb2.append("-Sent-Millis");
            SENT_MILLIS = sb2.toString();
            RECEIVED_MILLIS = companion.get().getPrefix() + "-Received-Millis";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        public Entry(Source source) throws IOException {
            source.getClass();
            try {
                BufferedSource bufferedSourceBuffer = Okio.buffer(source);
                String utf8LineStrict = bufferedSourceBuffer.readUtf8LineStrict();
                HttpUrl httpUrl = HttpUrl.Companion.parse(utf8LineStrict);
                if (httpUrl == null) {
                    IOException iOException = new IOException("Cache corruption for " + utf8LineStrict);
                    Platform.Companion.get().log("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.url = httpUrl;
                this.requestMethod = bufferedSourceBuffer.readUtf8LineStrict();
                Headers.Builder builder = new Headers.Builder();
                int int$okhttp = Cache.Companion.readInt$okhttp(bufferedSourceBuffer);
                for (int i9 = 0; i9 < int$okhttp; i9++) {
                    builder.addLenient$okhttp(bufferedSourceBuffer.readUtf8LineStrict());
                }
                this.varyHeaders = builder.build();
                StatusLine statusLine = StatusLine.Companion.parse(bufferedSourceBuffer.readUtf8LineStrict());
                this.protocol = statusLine.protocol;
                this.code = statusLine.code;
                this.message = statusLine.message;
                Headers.Builder builder2 = new Headers.Builder();
                int int$okhttp2 = Cache.Companion.readInt$okhttp(bufferedSourceBuffer);
                for (int i10 = 0; i10 < int$okhttp2; i10++) {
                    builder2.addLenient$okhttp(bufferedSourceBuffer.readUtf8LineStrict());
                }
                String str = SENT_MILLIS;
                String str2 = builder2.get(str);
                String str3 = RECEIVED_MILLIS;
                String str4 = builder2.get(str3);
                builder2.removeAll(str);
                builder2.removeAll(str3);
                this.sentRequestMillis = str2 != null ? Long.parseLong(str2) : 0L;
                this.receivedResponseMillis = str4 != null ? Long.parseLong(str4) : 0L;
                this.responseHeaders = builder2.build();
                if (isHttps()) {
                    String utf8LineStrict2 = bufferedSourceBuffer.readUtf8LineStrict();
                    if (utf8LineStrict2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + utf8LineStrict2 + '\"');
                    }
                    this.handshake = Handshake.Companion.get(!bufferedSourceBuffer.exhausted() ? TlsVersion.Companion.forJavaName(bufferedSourceBuffer.readUtf8LineStrict()) : TlsVersion.SSL_3_0, CipherSuite.Companion.forJavaName(bufferedSourceBuffer.readUtf8LineStrict()), readCertificateList(bufferedSourceBuffer), readCertificateList(bufferedSourceBuffer));
                } else {
                    this.handshake = null;
                }
                source.close();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AbstractC2043a.m5035i(source, th2);
                    throw th3;
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final boolean isHttps() {
            return AbstractC1416l.m3825a(this.url.scheme(), "https");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final List<Certificate> readCertificateList(BufferedSource bufferedSource) throws IOException {
            int int$okhttp = Cache.Companion.readInt$okhttp(bufferedSource);
            if (int$okhttp == -1) {
                return C4173t.f13710g;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(int$okhttp);
                for (int i9 = 0; i9 < int$okhttp; i9++) {
                    String utf8LineStrict = bufferedSource.readUtf8LineStrict();
                    Buffer buffer = new Buffer();
                    ByteString byteStringDecodeBase64 = ByteString.Companion.decodeBase64(utf8LineStrict);
                    if (byteStringDecodeBase64 == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    buffer.write(byteStringDecodeBase64);
                    arrayList.add(certificateFactory.generateCertificate(buffer.inputStream()));
                }
                return arrayList;
            } catch (CertificateException e6) {
                C2104o.m5299y(e6.getMessage());
                return null;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final void writeCertList(BufferedSink bufferedSink, List<? extends Certificate> list) throws IOException {
            try {
                bufferedSink.writeDecimalLong(list.size()).writeByte(10);
                Iterator<? extends Certificate> it = list.iterator();
                while (it.hasNext()) {
                    byte[] encoded = it.next().getEncoded();
                    ByteString.Companion companion = ByteString.Companion;
                    encoded.getClass();
                    bufferedSink.writeUtf8(ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).base64()).writeByte(10);
                }
            } catch (CertificateEncodingException e6) {
                C2104o.m5299y(e6.getMessage());
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean matches(Request request, Response response) {
            request.getClass();
            response.getClass();
            return AbstractC1416l.m3825a(this.url, request.url()) && AbstractC1416l.m3825a(this.requestMethod, request.method()) && Cache.Companion.varyMatches(response, this.varyHeaders, request);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Response response(DiskLruCache.Snapshot snapshot) {
            snapshot.getClass();
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        public final void writeTo(DiskLruCache.Editor editor) {
            editor.getClass();
            BufferedSink bufferedSinkBuffer = Okio.buffer(editor.newSink(0));
            try {
                bufferedSinkBuffer.writeUtf8(this.url.toString()).writeByte(10);
                bufferedSinkBuffer.writeUtf8(this.requestMethod).writeByte(10);
                bufferedSinkBuffer.writeDecimalLong(this.varyHeaders.size()).writeByte(10);
                int size = this.varyHeaders.size();
                for (int i9 = 0; i9 < size; i9++) {
                    bufferedSinkBuffer.writeUtf8(this.varyHeaders.name(i9)).writeUtf8(": ").writeUtf8(this.varyHeaders.value(i9)).writeByte(10);
                }
                bufferedSinkBuffer.writeUtf8(new StatusLine(this.protocol, this.code, this.message).toString()).writeByte(10);
                bufferedSinkBuffer.writeDecimalLong(this.responseHeaders.size() + 2).writeByte(10);
                int size2 = this.responseHeaders.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    bufferedSinkBuffer.writeUtf8(this.responseHeaders.name(i10)).writeUtf8(": ").writeUtf8(this.responseHeaders.value(i10)).writeByte(10);
                }
                bufferedSinkBuffer.writeUtf8(SENT_MILLIS).writeUtf8(": ").writeDecimalLong(this.sentRequestMillis).writeByte(10);
                bufferedSinkBuffer.writeUtf8(RECEIVED_MILLIS).writeUtf8(": ").writeDecimalLong(this.receivedResponseMillis).writeByte(10);
                if (isHttps()) {
                    bufferedSinkBuffer.writeByte(10);
                    Handshake handshake = this.handshake;
                    handshake.getClass();
                    bufferedSinkBuffer.writeUtf8(handshake.cipherSuite().javaName()).writeByte(10);
                    writeCertList(bufferedSinkBuffer, this.handshake.peerCertificates());
                    writeCertList(bufferedSinkBuffer, this.handshake.localCertificates());
                    bufferedSinkBuffer.writeUtf8(this.handshake.tlsVersion().javaName()).writeByte(10);
                }
                AbstractC2043a.m5035i(bufferedSinkBuffer, null);
            } finally {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.Cache.Entry.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
                this();
            }

            private Companion() {
            }
        }

        public Entry(Response response) {
            response.getClass();
            this.url = response.request().url();
            this.varyHeaders = Cache.Companion.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.Cache.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final Set<String> varyFields(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i9 = 0; i9 < size; i9++) {
                if ("Vary".equalsIgnoreCase(headers.name(i9))) {
                    String strValue = headers.value(i9);
                    if (treeSet == null) {
                        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                        comparator.getClass();
                        treeSet = new TreeSet(comparator);
                    }
                    Iterator it = AbstractC3149m.m6691F0(strValue, new char[]{','}, 6).iterator();
                    while (it.hasNext()) {
                        treeSet.add(AbstractC3149m.m6703R0((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? C4175v.f13712g : treeSet;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final Headers varyHeaders(Headers headers, Headers headers2) {
            Set<String> setVaryFields = varyFields(headers2);
            if (setVaryFields.isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i9 = 0; i9 < size; i9++) {
                String strName = headers.name(i9);
                if (setVaryFields.contains(strName)) {
                    builder.add(strName, headers.value(i9));
                }
            }
            return builder.build();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean hasVaryAll(Response response) {
            response.getClass();
            return varyFields(response.headers()).contains("*");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String key(HttpUrl httpUrl) {
            httpUrl.getClass();
            return ByteString.Companion.encodeUtf8(httpUrl.toString()).md5().hex();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int readInt$okhttp(BufferedSource bufferedSource) throws IOException {
            bufferedSource.getClass();
            try {
                long decimalLong = bufferedSource.readDecimalLong();
                String utf8LineStrict = bufferedSource.readUtf8LineStrict();
                if (decimalLong >= 0 && decimalLong <= 2147483647L && utf8LineStrict.length() <= 0) {
                    return (int) decimalLong;
                }
                throw new IOException("expected an int but was \"" + decimalLong + utf8LineStrict + '\"');
            } catch (NumberFormatException e6) {
                C2104o.m5299y(e6.getMessage());
                return 0;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean varyMatches(Response response, Headers headers, Request request) {
            response.getClass();
            headers.getClass();
            request.getClass();
            Set<String> setVaryFields = varyFields(response.headers());
            if ((setVaryFields instanceof Collection) && setVaryFields.isEmpty()) {
                return true;
            }
            for (String str : setVaryFields) {
                if (!AbstractC1416l.m3825a(headers.values(str), request.headers(str))) {
                    return false;
                }
            }
            return true;
        }

        private Companion() {
        }

        public final Headers varyHeaders(Response response) {
            response.getClass();
            Response responseNetworkResponse = response.networkResponse();
            responseNetworkResponse.getClass();
            return varyHeaders(responseNetworkResponse.request().headers(), response.headers());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cache(File file, long j3) {
        this(file, j3, FileSystem.SYSTEM);
        file.getClass();
    }
}
