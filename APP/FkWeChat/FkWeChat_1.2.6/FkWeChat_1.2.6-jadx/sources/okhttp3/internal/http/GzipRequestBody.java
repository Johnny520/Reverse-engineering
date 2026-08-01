package okhttp3.internal.http;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.url._UrlKt;
import p172l8.C4700i0;
import p325w8.AbstractC9202b;
import p376zd.AbstractC9988e0;
import p376zd.C10021v;
import p376zd.InterfaceC9997j;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m16758d2 = {"Lokhttp3/internal/http/GzipRequestBody;", "Lokhttp3/RequestBody;", "delegate", "<init>", "(Lokhttp3/RequestBody;)V", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", _UrlKt.FRAGMENT_ENCODE_SET, "contentLength", "()J", "Lzd/j;", "sink", "Ll8/i0;", "writeTo", "(Lzd/j;)V", _UrlKt.FRAGMENT_ENCODE_SET, "isOneShot", "()Z", "Lokhttp3/RequestBody;", "getDelegate", "()Lokhttp3/RequestBody;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class GzipRequestBody extends RequestBody {
    private final RequestBody delegate;

    public GzipRequestBody(RequestBody requestBody) {
        requestBody.getClass();
        this.delegate = requestBody;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return -1L;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public MediaType get$contentType() {
        return this.delegate.get$contentType();
    }

    public final RequestBody getDelegate() {
        return this.delegate;
    }

    @Override // okhttp3.RequestBody
    public boolean isOneShot() {
        return this.delegate.isOneShot();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(InterfaceC9997j sink) throws IllegalAccessException, IOException, InvocationTargetException {
        sink.getClass();
        InterfaceC9997j interfaceC9997jM38647b = AbstractC9988e0.m38647b(new C10021v(sink));
        try {
            this.delegate.writeTo(interfaceC9997jM38647b);
            C4700i0 c4700i0 = C4700i0.f13910a;
            AbstractC9202b.m35830a(interfaceC9997jM38647b, null);
        } finally {
        }
    }
}
