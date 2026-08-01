package okhttp3.internal;

import kotlin.Metadata;
import okhttp3.Response;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, m16758d2 = {"stripBody", "Lokhttp3/Response;", "okhttp"}, m16759k = 2, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class UnreadableResponseBodyKt {
    public static final Response stripBody(Response response) {
        response.getClass();
        return response.newBuilder().body(new UnreadableResponseBody(response.body().getMediaType(), response.body().getContentLength())).build();
    }
}
