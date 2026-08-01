package okhttp3.internal.cache;

import kotlin.Metadata;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.internal.http.HttpMethod;
import p024b9.AbstractC1061t;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0002¨\u0006\u0002"}, m16758d2 = {"requestForCache", "Lokhttp3/Request;", "okhttp"}, m16759k = 2, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class CacheInterceptorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Request requestForCache(Request request) {
        HttpUrl cacheUrlOverride = request.getCacheUrlOverride();
        return cacheUrlOverride != null ? (HttpMethod.INSTANCE.isCacheable(request.method()) || AbstractC1061t.m3842c(request.method(), "POST")) ? request.newBuilder().get().url(cacheUrlOverride).cacheUrlOverride(null).build() : request : request;
    }
}
