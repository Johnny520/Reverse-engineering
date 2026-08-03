package okhttp3.internal.connection;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RouteDatabase {
    private final java.util.Set<okhttp3.Route> failedRoutes;

    public RouteDatabase() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.failedRoutes = r0
            return
    }

    public final synchronized void connected(okhttp3.Route r2) {
            r1 = this;
            monitor-enter(r1)
            r2.getClass()     // Catch: java.lang.Throwable -> Lb
            java.util.Set<okhttp3.Route> r0 = r1.failedRoutes     // Catch: java.lang.Throwable -> Lb
            r0.remove(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    public final synchronized void failed(okhttp3.Route r2) {
            r1 = this;
            monitor-enter(r1)
            r2.getClass()     // Catch: java.lang.Throwable -> Lb
            java.util.Set<okhttp3.Route> r0 = r1.failedRoutes     // Catch: java.lang.Throwable -> Lb
            r0.add(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    public final synchronized boolean shouldPostpone(okhttp3.Route r2) {
            r1 = this;
            monitor-enter(r1)
            r2.getClass()     // Catch: java.lang.Throwable -> Lc
            java.util.Set<okhttp3.Route> r0 = r1.failedRoutes     // Catch: java.lang.Throwable -> Lc
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return r2
        Lc:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }
}
