package okhttp3.internal;

import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okhttp3.internal.url._UrlKt;
import p376zd.AbstractC9988e0;
import p376zd.C10026x0;
import p376zd.C9995i;
import p376zd.InterfaceC10024w0;
import p376zd.InterfaceC9999k;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001b¨\u0006\u001c"}, m16758d2 = {"Lokhttp3/internal/UnreadableResponseBody;", "Lokhttp3/ResponseBody;", "Lzd/w0;", "Lokhttp3/MediaType;", "mediaType", _UrlKt.FRAGMENT_ENCODE_SET, "contentLength", "<init>", "(Lokhttp3/MediaType;J)V", "contentType", "()Lokhttp3/MediaType;", "()J", "Lzd/k;", "source", "()Lzd/k;", "Lzd/i;", "sink", "byteCount", "read", "(Lzd/i;J)J", "Lzd/x0;", "timeout", "()Lzd/x0;", "Ll8/i0;", "close", "()V", "Lokhttp3/MediaType;", "J", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class UnreadableResponseBody extends ResponseBody implements InterfaceC10024w0 {
    private final long contentLength;
    private final MediaType mediaType;

    public UnreadableResponseBody(MediaType mediaType, long j10) {
        this.mediaType = mediaType;
        this.contentLength = j10;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentLength, reason: from getter */
    public long getContentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentType, reason: from getter */
    public MediaType getMediaType() {
        return this.mediaType;
    }

    @Override // p376zd.InterfaceC10024w0
    public long read(C9995i sink, long byteCount) {
        sink.getClass();
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: source */
    public InterfaceC9999k getSource() {
        return AbstractC9988e0.m38648c(this);
    }

    @Override // p376zd.InterfaceC10024w0
    public C10026x0 timeout() {
        return C10026x0.NONE;
    }

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
