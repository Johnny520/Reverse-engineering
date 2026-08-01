package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import okhttp3.Route;
import okhttp3.internal.url._UrlKt;
import p185m8.AbstractC5081g0;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m16758d2 = {"Lokhttp3/internal/connection/RouteDatabase;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "Lokhttp3/Route;", "failedRoute", "Ll8/i0;", "failed", "(Lokhttp3/Route;)V", "route", "connected", _UrlKt.FRAGMENT_ENCODE_SET, "shouldPostpone", "(Lokhttp3/Route;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "_failedRoutes", "Ljava/util/Set;", _UrlKt.FRAGMENT_ENCODE_SET, "getFailedRoutes", "()Ljava/util/Set;", "failedRoutes", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class RouteDatabase {
    private final Set<Route> _failedRoutes = new LinkedHashSet();

    public final synchronized void connected(Route route) {
        route.getClass();
        this._failedRoutes.remove(route);
    }

    public final synchronized void failed(Route failedRoute) {
        failedRoute.getClass();
        this._failedRoutes.add(failedRoute);
    }

    public final synchronized Set<Route> getFailedRoutes() {
        return AbstractC5081g0.m20564c1(this._failedRoutes);
    }

    public final synchronized boolean shouldPostpone(Route route) {
        route.getClass();
        return this._failedRoutes.contains(route);
    }
}
