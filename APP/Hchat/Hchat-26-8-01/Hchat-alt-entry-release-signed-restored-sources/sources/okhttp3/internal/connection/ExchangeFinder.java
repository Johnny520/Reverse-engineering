package okhttp3.internal.connection;

import gg.AbstractC1416l;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import okhttp3.Address;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ExchangeFinder {
    private final Address address;
    private final RealCall call;
    private final RealConnectionPool connectionPool;
    private int connectionShutdownCount;
    private final EventListener eventListener;
    private Route nextRouteToTry;
    private int otherFailureCount;
    private int refusedStreamCount;
    private RouteSelector.Selection routeSelection;
    private RouteSelector routeSelector;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ExchangeFinder(RealConnectionPool realConnectionPool, Address address, RealCall realCall, EventListener eventListener) {
        realConnectionPool.getClass();
        address.getClass();
        realCall.getClass();
        eventListener.getClass();
        this.connectionPool = realConnectionPool;
        this.address = address;
        this.call = realCall;
        this.eventListener = eventListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final RealConnection findConnection(int i9, int i10, int i11, int i12, boolean z9) throws IOException {
        List<Route> routes;
        Socket socketReleaseConnectionNoEvents$okhttp;
        if (this.call.isCanceled()) {
            C2104o.m5299y("Canceled");
            return null;
        }
        RealConnection connection = this.call.getConnection();
        if (connection != null) {
            synchronized (connection) {
                try {
                    socketReleaseConnectionNoEvents$okhttp = (connection.getNoNewExchanges() || !sameHostAndPort(connection.route().address().url())) ? this.call.releaseConnectionNoEvents$okhttp() : null;
                } finally {
                }
            }
            if (this.call.getConnection() != null) {
                if (socketReleaseConnectionNoEvents$okhttp == null) {
                    return connection;
                }
                C2104o.m5276A("Check failed.");
                return null;
            }
            if (socketReleaseConnectionNoEvents$okhttp != null) {
                Util.closeQuietly(socketReleaseConnectionNoEvents$okhttp);
            }
            this.eventListener.connectionReleased(this.call, connection);
        }
        this.refusedStreamCount = 0;
        this.connectionShutdownCount = 0;
        this.otherFailureCount = 0;
        if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, null, false)) {
            RealConnection connection2 = this.call.getConnection();
            connection2.getClass();
            this.eventListener.connectionAcquired(this.call, connection2);
            return connection2;
        }
        Route next = this.nextRouteToTry;
        try {
            if (next == null) {
                RouteSelector.Selection selection = this.routeSelection;
                if (selection != null) {
                    selection.getClass();
                    if (selection.hasNext()) {
                        RouteSelector.Selection selection2 = this.routeSelection;
                        selection2.getClass();
                        next = selection2.next();
                    }
                }
                RouteSelector routeSelector = this.routeSelector;
                if (routeSelector == null) {
                    routeSelector = new RouteSelector(this.address, this.call.getClient().getRouteDatabase(), this.call, this.eventListener);
                    this.routeSelector = routeSelector;
                }
                RouteSelector.Selection next2 = routeSelector.next();
                this.routeSelection = next2;
                routes = next2.getRoutes();
                if (this.call.isCanceled()) {
                    C2104o.m5299y("Canceled");
                    return null;
                }
                if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, false)) {
                    RealConnection connection3 = this.call.getConnection();
                    connection3.getClass();
                    this.eventListener.connectionAcquired(this.call, connection3);
                    return connection3;
                }
                next = next2.next();
                RealConnection realConnection = new RealConnection(this.connectionPool, next);
                this.call.setConnectionToCancel(realConnection);
                realConnection.connect(i9, i10, i11, i12, z9, this.call, this.eventListener);
                this.call.setConnectionToCancel(null);
                this.call.getClient().getRouteDatabase().connected(realConnection.route());
                if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, true)) {
                    synchronized (realConnection) {
                        this.connectionPool.put(realConnection);
                        this.call.acquireConnectionNoEvents(realConnection);
                    }
                    this.eventListener.connectionAcquired(this.call, realConnection);
                    return realConnection;
                }
                RealConnection connection4 = this.call.getConnection();
                connection4.getClass();
                this.nextRouteToTry = next;
                Util.closeQuietly(realConnection.socket());
                this.eventListener.connectionAcquired(this.call, connection4);
                return connection4;
            }
            next.getClass();
            this.nextRouteToTry = null;
            realConnection.connect(i9, i10, i11, i12, z9, this.call, this.eventListener);
            this.call.setConnectionToCancel(null);
            this.call.getClient().getRouteDatabase().connected(realConnection.route());
            if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, true)) {
            }
        } catch (Throwable th2) {
            this.call.setConnectionToCancel(null);
            throw th2;
        }
        routes = null;
        RealConnection realConnection2 = new RealConnection(this.connectionPool, next);
        this.call.setConnectionToCancel(realConnection2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final RealConnection findHealthyConnection(int i9, int i10, int i11, int i12, boolean z9, boolean z10) throws IOException {
        while (true) {
            RealConnection realConnectionFindConnection = findConnection(i9, i10, i11, i12, z9);
            boolean z11 = z9;
            int i13 = i12;
            int i14 = i11;
            int i15 = i10;
            int i16 = i9;
            if (realConnectionFindConnection.isHealthy(z10)) {
                return realConnectionFindConnection;
            }
            realConnectionFindConnection.noNewExchanges$okhttp();
            if (this.nextRouteToTry == null) {
                RouteSelector.Selection selection = this.routeSelection;
                if (selection != null ? selection.hasNext() : true) {
                    continue;
                } else {
                    RouteSelector routeSelector = this.routeSelector;
                    if (!(routeSelector != null ? routeSelector.hasNext() : true)) {
                        C2104o.m5299y("exhausted all routes");
                        return null;
                    }
                }
            }
            i9 = i16;
            i10 = i15;
            i11 = i14;
            i12 = i13;
            z9 = z11;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Route retryRoute() {
        RealConnection connection;
        if (this.refusedStreamCount > 1 || this.connectionShutdownCount > 1 || this.otherFailureCount > 0 || (connection = this.call.getConnection()) == null) {
            return null;
        }
        synchronized (connection) {
            if (connection.getRouteFailureCount$okhttp() != 0) {
                return null;
            }
            if (Util.canReuseConnectionFor(connection.route().address().url(), this.address.url())) {
                return connection.route();
            }
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ExchangeCodec find(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain) {
        okHttpClient.getClass();
        realInterceptorChain.getClass();
        try {
        } catch (IOException e6) {
            e = e6;
        } catch (RouteException e7) {
            e = e7;
        }
        try {
            return findHealthyConnection(realInterceptorChain.getConnectTimeoutMillis$okhttp(), realInterceptorChain.getReadTimeoutMillis$okhttp(), realInterceptorChain.getWriteTimeoutMillis$okhttp(), okHttpClient.pingIntervalMillis(), okHttpClient.retryOnConnectionFailure(), !AbstractC1416l.m3825a(realInterceptorChain.getRequest$okhttp().method(), "GET")).newCodec$okhttp(okHttpClient, realInterceptorChain);
        } catch (IOException e10) {
            e = e10;
            IOException iOException = e;
            trackFailure(iOException);
            throw new RouteException(iOException);
        } catch (RouteException e11) {
            e = e11;
            RouteException routeException = e;
            trackFailure(routeException.getLastConnectException());
            throw routeException;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Address getAddress$okhttp() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean retryAfterFailure() {
        RouteSelector routeSelector;
        if (this.refusedStreamCount == 0 && this.connectionShutdownCount == 0 && this.otherFailureCount == 0) {
            return false;
        }
        if (this.nextRouteToTry != null) {
            return true;
        }
        Route routeRetryRoute = retryRoute();
        if (routeRetryRoute != null) {
            this.nextRouteToTry = routeRetryRoute;
            return true;
        }
        RouteSelector.Selection selection = this.routeSelection;
        if ((selection == null || !selection.hasNext()) && (routeSelector = this.routeSelector) != null) {
            return routeSelector.hasNext();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean sameHostAndPort(HttpUrl httpUrl) {
        httpUrl.getClass();
        HttpUrl httpUrlUrl = this.address.url();
        return httpUrl.port() == httpUrlUrl.port() && AbstractC1416l.m3825a(httpUrl.host(), httpUrlUrl.host());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void trackFailure(IOException iOException) {
        iOException.getClass();
        this.nextRouteToTry = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
            this.refusedStreamCount++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.connectionShutdownCount++;
        } else {
            this.otherFailureCount++;
        }
    }
}
