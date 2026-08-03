package com.bumptech.glide.request;

/* JADX INFO: loaded from: classes.dex */
public class ThumbnailRequestCoordinator implements com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.Request {
    private volatile com.bumptech.glide.request.Request full;

    @Yue.InterfaceC2947("requestLock")
    private com.bumptech.glide.request.RequestCoordinator.RequestState fullState;

    @Yue.InterfaceC2947("requestLock")
    private boolean isRunningDuringBegin;

    @Yue.InterfaceC4544
    private final com.bumptech.glide.request.RequestCoordinator parent;
    private final java.lang.Object requestLock;
    private volatile com.bumptech.glide.request.Request thumb;

    @Yue.InterfaceC2947("requestLock")
    private com.bumptech.glide.request.RequestCoordinator.RequestState thumbState;

    public ThumbnailRequestCoordinator(java.lang.Object r2, @Yue.InterfaceC4544 com.bumptech.glide.request.RequestCoordinator r3) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.request.RequestCoordinator$RequestState r0 = com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED
            r1.fullState = r0
            r1.thumbState = r0
            r1.requestLock = r2
            r1.parent = r3
            return
    }

    @Yue.InterfaceC2947("requestLock")
    private boolean parentCanNotifyCleared() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.parent
            if (r0 == 0) goto Ld
            boolean r0 = r0.canNotifyCleared(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @Yue.InterfaceC2947("requestLock")
    private boolean parentCanNotifyStatusChanged() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.parent
            if (r0 == 0) goto Ld
            boolean r0 = r0.canNotifyStatusChanged(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @Yue.InterfaceC2947("requestLock")
    private boolean parentCanSetImage() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.parent
            if (r0 == 0) goto Ld
            boolean r0 = r0.canSetImage(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @Override // com.bumptech.glide.request.Request
    public void begin() {
            r4 = this;
            java.lang.Object r0 = r4.requestLock
            monitor-enter(r0)
            r1 = 1
            r4.isRunningDuringBegin = r1     // Catch: java.lang.Throwable -> L32
            r1 = 0
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = r4.fullState     // Catch: java.lang.Throwable -> L1b
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch: java.lang.Throwable -> L1b
            if (r2 == r3) goto L1d
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = r4.thumbState     // Catch: java.lang.Throwable -> L1b
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING     // Catch: java.lang.Throwable -> L1b
            if (r2 == r3) goto L1d
            r4.thumbState = r3     // Catch: java.lang.Throwable -> L1b
            com.bumptech.glide.request.Request r2 = r4.thumb     // Catch: java.lang.Throwable -> L1b
            r2.begin()     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r2 = move-exception
            goto L34
        L1d:
            boolean r2 = r4.isRunningDuringBegin     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L2e
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = r4.fullState     // Catch: java.lang.Throwable -> L1b
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING     // Catch: java.lang.Throwable -> L1b
            if (r2 == r3) goto L2e
            r4.fullState = r3     // Catch: java.lang.Throwable -> L1b
            com.bumptech.glide.request.Request r2 = r4.full     // Catch: java.lang.Throwable -> L1b
            r2.begin()     // Catch: java.lang.Throwable -> L1b
        L2e:
            r4.isRunningDuringBegin = r1     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r1 = move-exception
            goto L37
        L34:
            r4.isRunningDuringBegin = r1     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r1
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyCleared(com.bumptech.glide.request.Request r3) {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            boolean r1 = r2.parentCanNotifyCleared()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1b
            com.bumptech.glide.request.Request r1 = r2.full     // Catch: java.lang.Throwable -> L19
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L1b
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = r2.fullState     // Catch: java.lang.Throwable -> L19
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.PAUSED     // Catch: java.lang.Throwable -> L19
            if (r3 == r1) goto L1b
            r3 = 1
            goto L1c
        L19:
            r3 = move-exception
            goto L1e
        L1b:
            r3 = 0
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return r3
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyStatusChanged(com.bumptech.glide.request.Request r3) {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            boolean r1 = r2.parentCanNotifyStatusChanged()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1b
            com.bumptech.glide.request.Request r1 = r2.full     // Catch: java.lang.Throwable -> L19
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L1b
            boolean r3 = r2.isAnyResourceSet()     // Catch: java.lang.Throwable -> L19
            if (r3 != 0) goto L1b
            r3 = 1
            goto L1c
        L19:
            r3 = move-exception
            goto L1e
        L1b:
            r3 = 0
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return r3
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canSetImage(com.bumptech.glide.request.Request r3) {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            boolean r1 = r2.parentCanSetImage()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1c
            com.bumptech.glide.request.Request r1 = r2.full     // Catch: java.lang.Throwable -> L18
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L18
            if (r3 != 0) goto L1a
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = r2.fullState     // Catch: java.lang.Throwable -> L18
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch: java.lang.Throwable -> L18
            if (r3 == r1) goto L1c
            goto L1a
        L18:
            r3 = move-exception
            goto L1f
        L1a:
            r3 = 1
            goto L1d
        L1c:
            r3 = 0
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r3
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r3
    }

    @Override // com.bumptech.glide.request.Request
    public void clear() {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            r1 = 0
            r2.isRunningDuringBegin = r1     // Catch: java.lang.Throwable -> L18
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED     // Catch: java.lang.Throwable -> L18
            r2.fullState = r1     // Catch: java.lang.Throwable -> L18
            r2.thumbState = r1     // Catch: java.lang.Throwable -> L18
            com.bumptech.glide.request.Request r1 = r2.thumb     // Catch: java.lang.Throwable -> L18
            r1.clear()     // Catch: java.lang.Throwable -> L18
            com.bumptech.glide.request.Request r1 = r2.full     // Catch: java.lang.Throwable -> L18
            r1.clear()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public com.bumptech.glide.request.RequestCoordinator getRoot() {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator r1 = r2.parent     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto Le
            com.bumptech.glide.request.RequestCoordinator r1 = r1.getRoot()     // Catch: java.lang.Throwable -> Lc
            goto Lf
        Lc:
            r1 = move-exception
            goto L11
        Le:
            r1 = r2
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.Request
    public boolean isAnyResourceSet() {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.Request r1 = r2.thumb     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isAnyResourceSet()     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            com.bumptech.glide.request.Request r1 = r2.full     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isAnyResourceSet()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L14
            goto L18
        L14:
            r1 = 0
            goto L19
        L16:
            r1 = move-exception
            goto L1b
        L18:
            r1 = 1
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return r1
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isCleared() {
            r3 = this;
            java.lang.Object r0 = r3.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.fullState     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED     // Catch: java.lang.Throwable -> Le
            if (r1 != r2) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isComplete() {
            r3 = this;
            java.lang.Object r0 = r3.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.fullState     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch: java.lang.Throwable -> Le
            if (r1 != r2) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isEquivalentTo(com.bumptech.glide.request.Request r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.request.ThumbnailRequestCoordinator
            r1 = 0
            if (r0 == 0) goto L2e
            com.bumptech.glide.request.ThumbnailRequestCoordinator r4 = (com.bumptech.glide.request.ThumbnailRequestCoordinator) r4
            com.bumptech.glide.request.Request r0 = r3.full
            if (r0 != 0) goto L10
            com.bumptech.glide.request.Request r0 = r4.full
            if (r0 != 0) goto L2e
            goto L1a
        L10:
            com.bumptech.glide.request.Request r0 = r3.full
            com.bumptech.glide.request.Request r2 = r4.full
            boolean r0 = r0.isEquivalentTo(r2)
            if (r0 == 0) goto L2e
        L1a:
            com.bumptech.glide.request.Request r0 = r3.thumb
            if (r0 != 0) goto L23
            com.bumptech.glide.request.Request r4 = r4.thumb
            if (r4 != 0) goto L2e
            goto L2d
        L23:
            com.bumptech.glide.request.Request r0 = r3.thumb
            com.bumptech.glide.request.Request r4 = r4.thumb
            boolean r4 = r0.isEquivalentTo(r4)
            if (r4 == 0) goto L2e
        L2d:
            r1 = 1
        L2e:
            return r1
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isRunning() {
            r3 = this;
            java.lang.Object r0 = r3.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.fullState     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING     // Catch: java.lang.Throwable -> Le
            if (r1 != r2) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void onRequestFailed(com.bumptech.glide.request.Request r3) {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.Request r1 = r2.full     // Catch: java.lang.Throwable -> L11
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L11
            if (r3 != 0) goto L13
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch: java.lang.Throwable -> L11
            r2.thumbState = r3     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r3 = move-exception
            goto L20
        L13:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch: java.lang.Throwable -> L11
            r2.fullState = r3     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.request.RequestCoordinator r3 = r2.parent     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L1e
            r3.onRequestFailed(r2)     // Catch: java.lang.Throwable -> L11
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void onRequestSuccess(com.bumptech.glide.request.Request r3) {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.Request r1 = r2.thumb     // Catch: java.lang.Throwable -> L11
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L13
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch: java.lang.Throwable -> L11
            r2.thumbState = r3     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r3 = move-exception
            goto L2d
        L13:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch: java.lang.Throwable -> L11
            r2.fullState = r3     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.request.RequestCoordinator r3 = r2.parent     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L1e
            r3.onRequestSuccess(r2)     // Catch: java.lang.Throwable -> L11
        L1e:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = r2.thumbState     // Catch: java.lang.Throwable -> L11
            boolean r3 = r3.isComplete()     // Catch: java.lang.Throwable -> L11
            if (r3 != 0) goto L2b
            com.bumptech.glide.request.Request r3 = r2.thumb     // Catch: java.lang.Throwable -> L11
            r3.clear()     // Catch: java.lang.Throwable -> L11
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    @Override // com.bumptech.glide.request.Request
    public void pause() {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r2.thumbState     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.isComplete()     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L17
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.PAUSED     // Catch: java.lang.Throwable -> L15
            r2.thumbState = r1     // Catch: java.lang.Throwable -> L15
            com.bumptech.glide.request.Request r1 = r2.thumb     // Catch: java.lang.Throwable -> L15
            r1.pause()     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r1 = move-exception
            goto L2a
        L17:
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r2.fullState     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.isComplete()     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L28
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.PAUSED     // Catch: java.lang.Throwable -> L15
            r2.fullState = r1     // Catch: java.lang.Throwable -> L15
            com.bumptech.glide.request.Request r1 = r2.full     // Catch: java.lang.Throwable -> L15
            r1.pause()     // Catch: java.lang.Throwable -> L15
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r1
    }

    public void setRequests(com.bumptech.glide.request.Request r1, com.bumptech.glide.request.Request r2) {
            r0 = this;
            r0.full = r1
            r0.thumb = r2
            return
    }
}
