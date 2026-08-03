package com.bumptech.glide.request;

/* JADX INFO: loaded from: classes.dex */
public class RequestFutureTarget<R> implements com.bumptech.glide.request.FutureTarget<R>, com.bumptech.glide.request.RequestListener<R> {
    private static final com.bumptech.glide.request.RequestFutureTarget.Waiter DEFAULT_WAITER = null;
    private final boolean assertBackgroundThread;

    @Yue.InterfaceC2947("this")
    @Yue.InterfaceC4544
    private com.bumptech.glide.load.engine.GlideException exception;
    private final int height;

    @Yue.InterfaceC2947("this")
    private boolean isCancelled;

    @Yue.InterfaceC2947("this")
    private boolean loadFailed;

    @Yue.InterfaceC2947("this")
    @Yue.InterfaceC4544
    private com.bumptech.glide.request.Request request;

    @Yue.InterfaceC2947("this")
    @Yue.InterfaceC4544
    private R resource;

    @Yue.InterfaceC2947("this")
    private boolean resultReceived;
    private final com.bumptech.glide.request.RequestFutureTarget.Waiter waiter;
    private final int width;

    @Yue.InterfaceC6959
    public static class Waiter {
        public Waiter() {
                r0 = this;
                r0.<init>()
                return
        }

        public void notifyAll(java.lang.Object r1) {
                r0 = this;
                r1.notifyAll()
                return
        }

        public void waitForTimeout(java.lang.Object r1, long r2) throws java.lang.InterruptedException {
                r0 = this;
                r1.wait(r2)
                return
        }
    }

    static {
            com.bumptech.glide.request.RequestFutureTarget$Waiter r0 = new com.bumptech.glide.request.RequestFutureTarget$Waiter
            r0.<init>()
            com.bumptech.glide.request.RequestFutureTarget.DEFAULT_WAITER = r0
            return
    }

    public RequestFutureTarget(int r3, int r4) {
            r2 = this;
            r0 = 1
            com.bumptech.glide.request.RequestFutureTarget$Waiter r1 = com.bumptech.glide.request.RequestFutureTarget.DEFAULT_WAITER
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public RequestFutureTarget(int r1, int r2, boolean r3, com.bumptech.glide.request.RequestFutureTarget.Waiter r4) {
            r0 = this;
            r0.<init>()
            r0.width = r1
            r0.height = r2
            r0.assertBackgroundThread = r3
            r0.waiter = r4
            return
    }

    private synchronized R doGet(java.lang.Long r5) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.assertBackgroundThread     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L12
            boolean r0 = r4.isDone()     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L12
            com.bumptech.glide.util.Util.assertBackgroundThread()     // Catch: java.lang.Throwable -> Lf
            goto L12
        Lf:
            r5 = move-exception
            goto L91
        L12:
            boolean r0 = r4.isCancelled     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L8b
            boolean r0 = r4.loadFailed     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L83
            boolean r0 = r4.resultReceived     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L22
            R r5 = r4.resource     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r4)
            return r5
        L22:
            r0 = 0
            if (r5 != 0) goto L2c
            com.bumptech.glide.request.RequestFutureTarget$Waiter r5 = r4.waiter     // Catch: java.lang.Throwable -> Lf
            r5.waitForTimeout(r4, r0)     // Catch: java.lang.Throwable -> Lf
            goto L53
        L2c:
            long r2 = r5.longValue()     // Catch: java.lang.Throwable -> Lf
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L53
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lf
            long r2 = r5.longValue()     // Catch: java.lang.Throwable -> Lf
            long r2 = r2 + r0
        L3d:
            boolean r5 = r4.isDone()     // Catch: java.lang.Throwable -> Lf
            if (r5 != 0) goto L53
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L53
            com.bumptech.glide.request.RequestFutureTarget$Waiter r5 = r4.waiter     // Catch: java.lang.Throwable -> Lf
            long r0 = r2 - r0
            r5.waitForTimeout(r4, r0)     // Catch: java.lang.Throwable -> Lf
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lf
            goto L3d
        L53:
            boolean r5 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> Lf
            if (r5 != 0) goto L7d
            boolean r5 = r4.loadFailed     // Catch: java.lang.Throwable -> Lf
            if (r5 != 0) goto L75
            boolean r5 = r4.isCancelled     // Catch: java.lang.Throwable -> Lf
            if (r5 != 0) goto L6f
            boolean r5 = r4.resultReceived     // Catch: java.lang.Throwable -> Lf
            if (r5 == 0) goto L69
            R r5 = r4.resource     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r4)
            return r5
        L69:
            java.util.concurrent.TimeoutException r5 = new java.util.concurrent.TimeoutException     // Catch: java.lang.Throwable -> Lf
            r5.<init>()     // Catch: java.lang.Throwable -> Lf
            throw r5     // Catch: java.lang.Throwable -> Lf
        L6f:
            java.util.concurrent.CancellationException r5 = new java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> Lf
            r5.<init>()     // Catch: java.lang.Throwable -> Lf
            throw r5     // Catch: java.lang.Throwable -> Lf
        L75:
            java.util.concurrent.ExecutionException r5 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> Lf
            com.bumptech.glide.load.engine.GlideException r0 = r4.exception     // Catch: java.lang.Throwable -> Lf
            r5.<init>(r0)     // Catch: java.lang.Throwable -> Lf
            throw r5     // Catch: java.lang.Throwable -> Lf
        L7d:
            java.lang.InterruptedException r5 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> Lf
            r5.<init>()     // Catch: java.lang.Throwable -> Lf
            throw r5     // Catch: java.lang.Throwable -> Lf
        L83:
            java.util.concurrent.ExecutionException r5 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> Lf
            com.bumptech.glide.load.engine.GlideException r0 = r4.exception     // Catch: java.lang.Throwable -> Lf
            r5.<init>(r0)     // Catch: java.lang.Throwable -> Lf
            throw r5     // Catch: java.lang.Throwable -> Lf
        L8b:
            java.util.concurrent.CancellationException r5 = new java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> Lf
            r5.<init>()     // Catch: java.lang.Throwable -> Lf
            throw r5     // Catch: java.lang.Throwable -> Lf
        L91:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lf
            throw r5
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isDone()     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Lc
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            r3 = 0
            return r3
        La:
            r3 = move-exception
            goto L23
        Lc:
            r0 = 1
            r2.isCancelled = r0     // Catch: java.lang.Throwable -> La
            com.bumptech.glide.request.RequestFutureTarget$Waiter r1 = r2.waiter     // Catch: java.lang.Throwable -> La
            r1.notifyAll(r2)     // Catch: java.lang.Throwable -> La
            r1 = 0
            if (r3 == 0) goto L1c
            com.bumptech.glide.request.Request r3 = r2.request     // Catch: java.lang.Throwable -> La
            r2.request = r1     // Catch: java.lang.Throwable -> La
            r1 = r3
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto L22
            r1.clear()
        L22:
            return r0
        L23:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    @Override // java.util.concurrent.Future
    public R get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r2 = this;
            r0 = 0
            java.lang.Object r0 = r2.doGet(r0)     // Catch: java.util.concurrent.TimeoutException -> L6
            return r0
        L6:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.concurrent.Future
    public R get(long r1, @Yue.InterfaceC4410 java.util.concurrent.TimeUnit r3) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r0 = this;
            long r1 = r3.toMillis(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r0.doGet(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.target.Target
    @Yue.InterfaceC4544
    public synchronized com.bumptech.glide.request.Request getRequest() {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.request.Request r0 = r1.request     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @Override // com.bumptech.glide.request.target.Target
    public void getSize(@Yue.InterfaceC4410 com.bumptech.glide.request.target.SizeReadyCallback r3) {
            r2 = this;
            int r0 = r2.width
            int r1 = r2.height
            r3.onSizeReady(r0, r1)
            return
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isCancelled     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isCancelled     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            boolean r0 = r1.resultReceived     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            boolean r0 = r1.loadFailed     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            goto L12
        Le:
            r0 = 0
            goto L13
        L10:
            r0 = move-exception
            goto L15
        L12:
            r0 = 1
        L13:
            monitor-exit(r1)
            return r0
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadCleared(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1) {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    public synchronized void onLoadFailed(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1) {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }

    @Override // com.bumptech.glide.request.RequestListener
    public synchronized boolean onLoadFailed(@Yue.InterfaceC4544 com.bumptech.glide.load.engine.GlideException r1, java.lang.Object r2, @Yue.InterfaceC4410 com.bumptech.glide.request.target.Target<R> r3, boolean r4) {
            r0 = this;
            monitor-enter(r0)
            r2 = 1
            r0.loadFailed = r2     // Catch: java.lang.Throwable -> Le
            r0.exception = r1     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.request.RequestFutureTarget$Waiter r1 = r0.waiter     // Catch: java.lang.Throwable -> Le
            r1.notifyAll(r0)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            r1 = 0
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadStarted(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1) {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    public synchronized void onResourceReady(@Yue.InterfaceC4410 R r1, @Yue.InterfaceC4544 com.bumptech.glide.request.transition.Transition<? super R> r2) {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }

    @Override // com.bumptech.glide.request.RequestListener
    public synchronized boolean onResourceReady(@Yue.InterfaceC4410 R r1, @Yue.InterfaceC4410 java.lang.Object r2, com.bumptech.glide.request.target.Target<R> r3, @Yue.InterfaceC4410 com.bumptech.glide.load.DataSource r4, boolean r5) {
            r0 = this;
            monitor-enter(r0)
            r2 = 1
            r0.resultReceived = r2     // Catch: java.lang.Throwable -> Le
            r0.resource = r1     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.request.RequestFutureTarget$Waiter r1 = r0.waiter     // Catch: java.lang.Throwable -> Le
            r1.notifyAll(r0)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            r1 = 0
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    public void removeCallback(@Yue.InterfaceC4410 com.bumptech.glide.request.target.SizeReadyCallback r1) {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    public synchronized void setRequest(@Yue.InterfaceC4544 com.bumptech.glide.request.Request r1) {
            r0 = this;
            monitor-enter(r0)
            r0.request = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            monitor-enter(r4)
            boolean r1 = r4.isCancelled     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            if (r1 == 0) goto L20
            java.lang.String r1 = "CANCELLED"
            goto L32
        L1e:
            r0 = move-exception
            goto L67
        L20:
            boolean r1 = r4.loadFailed     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L27
            java.lang.String r1 = "FAILURE"
            goto L32
        L27:
            boolean r1 = r4.resultReceived     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L2e
            java.lang.String r1 = "SUCCESS"
            goto L32
        L2e:
            java.lang.String r1 = "PENDING"
            com.bumptech.glide.request.Request r2 = r4.request     // Catch: java.lang.Throwable -> L1e
        L32:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L52
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = ", request=["
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = "]]"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
        L52:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "]"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        L67:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            throw r0
    }
}
