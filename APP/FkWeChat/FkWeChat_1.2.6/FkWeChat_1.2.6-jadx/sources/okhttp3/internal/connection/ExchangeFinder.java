package okhttp3.internal.connection;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\bÀ\u0006\u0003"}, m16758d2 = {"Lokhttp3/internal/connection/ExchangeFinder;", _UrlKt.FRAGMENT_ENCODE_SET, "routePlanner", "Lokhttp3/internal/connection/RoutePlanner;", "getRoutePlanner", "()Lokhttp3/internal/connection/RoutePlanner;", "find", "Lokhttp3/internal/connection/RealConnection;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public interface ExchangeFinder {
    RealConnection find();

    RoutePlanner getRoutePlanner();
}
