package com.bumptech.glide.request;

/* JADX INFO: loaded from: classes.dex */
public final class ErrorRequestCoordinator implements com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.Request {
    private volatile com.bumptech.glide.request.Request error;

    @Yue.InterfaceC2947("requestLock")
    private com.bumptech.glide.request.RequestCoordinator.RequestState errorState;

    @Yue.InterfaceC4544
    private final com.bumptech.glide.request.RequestCoordinator parent;
    private volatile com.bumptech.glide.request.Request primary;

    @Yue.InterfaceC2947("requestLock")
    private com.bumptech.glide.request.RequestCoordinator.RequestState primaryState;
    private final java.lang.Object requestLock;

    public ErrorRequestCoordinator(java.lang.Object r2, @Yue.InterfaceC4544 com.bumptech.glide.request.RequestCoordinator r3) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.request.RequestCoordinator$RequestState r0 = com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED
            r1.primaryState = r0
            r1.errorState = r0
            r1.requestLock = r2
            r1.parent = r3
            return
    }

    @Yue.InterfaceC2947("requestLock")
    private boolean isValidRequestForStatusChanged(com.bumptech.glide.request.Request r3) {
            r2 = this;
            com.bumptech.glide.request.RequestCoordinator$RequestState r0 = r2.primaryState
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED
            if (r0 == r1) goto Ld
            com.bumptech.glide.request.Request r0 = r2.primary
            boolean r3 = r3.equals(r0)
            return r3
        Ld:
            com.bumptech.glide.request.Request r0 = r2.error
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L1f
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = r2.errorState
            com.bumptech.glide.request.RequestCoordinator$RequestState r0 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS
            if (r3 == r0) goto L1d
            if (r3 != r1) goto L1f
        L1d:
            r3 = 1
            goto L20
        L1f:
            r3 = 0
        L20:
            return r3
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
            r3 = this;
            java.lang.Object r0 = r3.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.primaryState     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING     // Catch: java.lang.Throwable -> L11
            if (r1 == r2) goto L13
            r3.primaryState = r2     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.request.Request r1 = r3.primary     // Catch: java.lang.Throwable -> L11
            r1.begin()     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r1 = move-exception
            goto L15
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyCleared(com.bumptech.glide.request.Request r3) {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            boolean r1 = r2.parentCanNotifyCleared()     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L15
            com.bumptech.glide.request.Request r1 = r2.primary     // Catch: java.lang.Throwable -> L13
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L13
            if (r3 == 0) goto L15
            r3 = 1
            goto L16
        L13:
            r3 = move-exception
            goto L18
        L15:
            r3 = 0
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r3
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r3
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyStatusChanged(com.bumptech.glide.request.Request r3) {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            boolean r1 = r2.parentCanNotifyStatusChanged()     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            boolean r3 = r2.isValidRequestForStatusChanged(r3)     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L13
            r3 = 1
            goto L14
        L11:
            r3 = move-exception
            goto L16
        L13:
            r3 = 0
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r3
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canSetImage(com.bumptech.glide.request.Request r2) {
            r1 = this;
            java.lang.Object r2 = r1.requestLock
            monitor-enter(r2)
            boolean r0 = r1.parentCanSetImage()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // com.bumptech.glide.request.Request
    public void clear() {
            r3 = this;
            java.lang.Object r0 = r3.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED     // Catch: java.lang.Throwable -> L18
            r3.primaryState = r1     // Catch: java.lang.Throwable -> L18
            com.bumptech.glide.request.Request r2 = r3.primary     // Catch: java.lang.Throwable -> L18
            r2.clear()     // Catch: java.lang.Throwable -> L18
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = r3.errorState     // Catch: java.lang.Throwable -> L18
            if (r2 == r1) goto L1a
            r3.errorState = r1     // Catch: java.lang.Throwable -> L18
            com.bumptech.glide.request.Request r1 = r3.error     // Catch: java.lang.Throwable -> L18
            r1.clear()     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r1 = move-exception
            goto L1c
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L1c:
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
            com.bumptech.glide.request.Request r1 = r2.primary     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isAnyResourceSet()     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            com.bumptech.glide.request.Request r1 = r2.error     // Catch: java.lang.Throwable -> L16
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
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.primaryState     // Catch: java.lang.Throwable -> Lf
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED     // Catch: java.lang.Throwable -> Lf
            if (r1 != r2) goto L11
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.errorState     // Catch: java.lang.Throwable -> Lf
            if (r1 != r2) goto L11
            r1 = 1
            goto L12
        Lf:
            r1 = move-exception
            goto L14
        L11:
            r1 = 0
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isComplete() {
            r3 = this;
            java.lang.Object r0 = r3.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.primaryState     // Catch: java.lang.Throwable -> L10
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch: java.lang.Throwable -> L10
            if (r1 == r2) goto L12
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.errorState     // Catch: java.lang.Throwable -> L10
            if (r1 != r2) goto Le
            goto L12
        Le:
            r1 = 0
            goto L13
        L10:
            r1 = move-exception
            goto L15
        L12:
            r1 = 1
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isEquivalentTo(com.bumptech.glide.request.Request r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.request.ErrorRequestCoordinator
            r1 = 0
            if (r0 == 0) goto L1c
            com.bumptech.glide.request.ErrorRequestCoordinator r4 = (com.bumptech.glide.request.ErrorRequestCoordinator) r4
            com.bumptech.glide.request.Request r0 = r3.primary
            com.bumptech.glide.request.Request r2 = r4.primary
            boolean r0 = r0.isEquivalentTo(r2)
            if (r0 == 0) goto L1c
            com.bumptech.glide.request.Request r0 = r3.error
            com.bumptech.glide.request.Request r4 = r4.error
            boolean r4 = r0.isEquivalentTo(r4)
            if (r4 == 0) goto L1c
            r1 = 1
        L1c:
            return r1
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isRunning() {
            r3 = this;
            java.lang.Object r0 = r3.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.primaryState     // Catch: java.lang.Throwable -> L10
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING     // Catch: java.lang.Throwable -> L10
            if (r1 == r2) goto L12
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.errorState     // Catch: java.lang.Throwable -> L10
            if (r1 != r2) goto Le
            goto L12
        Le:
            r1 = 0
            goto L13
        L10:
            r1 = move-exception
            goto L15
        L12:
            r1 = 1
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void onRequestFailed(com.bumptech.glide.request.Request r3) {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.Request r1 = r2.error     // Catch: java.lang.Throwable -> L1d
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L1d
            if (r3 != 0) goto L21
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch: java.lang.Throwable -> L1d
            r2.primaryState = r3     // Catch: java.lang.Throwable -> L1d
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = r2.errorState     // Catch: java.lang.Throwable -> L1d
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING     // Catch: java.lang.Throwable -> L1d
            if (r3 == r1) goto L1f
            r2.errorState = r1     // Catch: java.lang.Throwable -> L1d
            com.bumptech.glide.request.Request r3 = r2.error     // Catch: java.lang.Throwable -> L1d
            r3.begin()     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r3 = move-exception
            goto L2e
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L21:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch: java.lang.Throwable -> L1d
            r2.errorState = r3     // Catch: java.lang.Throwable -> L1d
            com.bumptech.glide.request.RequestCoordinator r3 = r2.parent     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L2c
            r3.onRequestFailed(r2)     // Catch: java.lang.Throwable -> L1d
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r3
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void onRequestSuccess(com.bumptech.glide.request.Request r3) {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.Request r1 = r2.primary     // Catch: java.lang.Throwable -> L10
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L12
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch: java.lang.Throwable -> L10
            r2.primaryState = r3     // Catch: java.lang.Throwable -> L10
            goto L1e
        L10:
            r3 = move-exception
            goto L27
        L12:
            com.bumptech.glide.request.Request r1 = r2.error     // Catch: java.lang.Throwable -> L10
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L1e
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch: java.lang.Throwable -> L10
            r2.errorState = r3     // Catch: java.lang.Throwable -> L10
        L1e:
            com.bumptech.glide.request.RequestCoordinator r3 = r2.parent     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L25
            r3.onRequestSuccess(r2)     // Catch: java.lang.Throwable -> L10
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    @Override // com.bumptech.glide.request.Request
    public void pause() {
            r3 = this;
            java.lang.Object r0 = r3.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.primaryState     // Catch: java.lang.Throwable -> L13
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING     // Catch: java.lang.Throwable -> L13
            if (r1 != r2) goto L15
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.PAUSED     // Catch: java.lang.Throwable -> L13
            r3.primaryState = r1     // Catch: java.lang.Throwable -> L13
            com.bumptech.glide.request.Request r1 = r3.primary     // Catch: java.lang.Throwable -> L13
            r1.pause()     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L24
        L15:
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.errorState     // Catch: java.lang.Throwable -> L13
            if (r1 != r2) goto L22
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.PAUSED     // Catch: java.lang.Throwable -> L13
            r3.errorState = r1     // Catch: java.lang.Throwable -> L13
            com.bumptech.glide.request.Request r1 = r3.error     // Catch: java.lang.Throwable -> L13
            r1.pause()     // Catch: java.lang.Throwable -> L13
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
    }

    public void setRequests(com.bumptech.glide.request.Request r1, com.bumptech.glide.request.Request r2) {
            r0 = this;
            r0.primary = r1
            r0.error = r2
            return
    }
}
