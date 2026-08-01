package okhttp3.internal.http;

import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okhttp3.internal.url._UrlKt;
import p376zd.InterfaceC9999k;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u000eR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0012"}, m16758d2 = {"Lokhttp3/internal/http/RealResponseBody;", "Lokhttp3/ResponseBody;", _UrlKt.FRAGMENT_ENCODE_SET, "contentTypeString", _UrlKt.FRAGMENT_ENCODE_SET, "contentLength", "Lzd/k;", "source", "<init>", "(Ljava/lang/String;JLzd/k;)V", "()J", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "()Lzd/k;", "Ljava/lang/String;", "J", "Lzd/k;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final InterfaceC9999k source;

    public RealResponseBody(String str, long j10, InterfaceC9999k interfaceC9999k) {
        interfaceC9999k.getClass();
        this.contentTypeString = str;
        this.contentLength = j10;
        this.source = interfaceC9999k;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentLength, reason: from getter */
    public long getContentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentType */
    public MediaType get$contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.INSTANCE.parse(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: source, reason: from getter */
    public InterfaceC9999k getSource() {
        return this.source;
    }
}
