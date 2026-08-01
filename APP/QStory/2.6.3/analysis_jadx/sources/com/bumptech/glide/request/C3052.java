package com.bumptech.glide.request;

/* JADX INFO: renamed from: com.bumptech.glide.request.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3052 implements InterfaceC3050, InterfaceC3051 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public RequestCoordinator$RequestState f9726;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public RequestCoordinator$RequestState f9727;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public volatile InterfaceC3051 f9728;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public volatile InterfaceC3051 f9729;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC3050 f9730;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f9731;

    public C3052(Object obj, InterfaceC3050 interfaceC3050) {
        RequestCoordinator$RequestState requestCoordinator$RequestState = RequestCoordinator$RequestState.CLEARED;
        this.f9727 = requestCoordinator$RequestState;
        this.f9726 = requestCoordinator$RequestState;
        this.f9731 = obj;
        this.f9730 = interfaceC3050;
    }

    @Override // com.bumptech.glide.request.InterfaceC3051
    public final void clear() {
        synchronized (this.f9731) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = RequestCoordinator$RequestState.CLEARED;
                this.f9727 = requestCoordinator$RequestState;
                this.f9729.clear();
                if (this.f9726 != requestCoordinator$RequestState) {
                    this.f9726 = requestCoordinator$RequestState;
                    this.f9728.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.bumptech.glide.request.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // com.bumptech.glide.request.InterfaceC3050
    public final InterfaceC3050 getRoot() {
        ?? root;
        synchronized (this.f9731) {
            try {
                InterfaceC3050 interfaceC3050 = this.f9730;
                this = this;
                if (interfaceC3050 != null) {
                    root = interfaceC3050.getRoot();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.InterfaceC3051
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f9731) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.f9727;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.RUNNING;
                z = requestCoordinator$RequestState == requestCoordinator$RequestState2 || this.f9726 == requestCoordinator$RequestState2;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo6605(InterfaceC3051 interfaceC3051) {
        boolean z;
        RequestCoordinator$RequestState requestCoordinator$RequestState;
        synchronized (this.f9731) {
            InterfaceC3050 interfaceC3050 = this.f9730;
            z = false;
            if (interfaceC3050 == null || interfaceC3050.mo6605(this)) {
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = this.f9727;
                RequestCoordinator$RequestState requestCoordinator$RequestState3 = RequestCoordinator$RequestState.FAILED;
                if (requestCoordinator$RequestState2 != requestCoordinator$RequestState3 ? interfaceC3051.equals(this.f9729) : interfaceC3051.equals(this.f9728) && ((requestCoordinator$RequestState = this.f9726) == RequestCoordinator$RequestState.SUCCESS || requestCoordinator$RequestState == requestCoordinator$RequestState3)) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3051
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo6593() {
        boolean z;
        synchronized (this.f9731) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.f9727;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.CLEARED;
                z = requestCoordinator$RequestState == requestCoordinator$RequestState2 && this.f9726 == requestCoordinator$RequestState2;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3051
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo6594() {
        synchronized (this.f9731) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.f9727;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.RUNNING;
                if (requestCoordinator$RequestState == requestCoordinator$RequestState2) {
                    this.f9727 = RequestCoordinator$RequestState.PAUSED;
                    this.f9729.mo6594();
                }
                if (this.f9726 == requestCoordinator$RequestState2) {
                    this.f9726 = RequestCoordinator$RequestState.PAUSED;
                    this.f9728.mo6594();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3051
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo6595(InterfaceC3051 interfaceC3051) {
        if (interfaceC3051 instanceof C3052) {
            C3052 c3052 = (C3052) interfaceC3051;
            if (this.f9729.mo6595(c3052.f9729) && this.f9728.mo6595(c3052.f9728)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6606(InterfaceC3051 interfaceC3051) {
        synchronized (this.f9731) {
            try {
                if (interfaceC3051.equals(this.f9728)) {
                    this.f9726 = RequestCoordinator$RequestState.FAILED;
                    InterfaceC3050 interfaceC3050 = this.f9730;
                    if (interfaceC3050 != null) {
                        interfaceC3050.mo6606(this);
                    }
                    return;
                }
                this.f9727 = RequestCoordinator$RequestState.FAILED;
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.f9726;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.RUNNING;
                if (requestCoordinator$RequestState != requestCoordinator$RequestState2) {
                    this.f9726 = requestCoordinator$RequestState2;
                    this.f9728.mo6599();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3050, com.bumptech.glide.request.InterfaceC3051
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo6597() {
        boolean z;
        synchronized (this.f9731) {
            try {
                z = this.f9729.mo6597() || this.f9728.mo6597();
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3051
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo6599() {
        synchronized (this.f9731) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.f9727;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.RUNNING;
                if (requestCoordinator$RequestState != requestCoordinator$RequestState2) {
                    this.f9727 = requestCoordinator$RequestState2;
                    this.f9729.mo6599();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo6607(InterfaceC3051 interfaceC3051) {
        boolean z;
        synchronized (this.f9731) {
            InterfaceC3050 interfaceC3050 = this.f9730;
            z = interfaceC3050 == null || interfaceC3050.mo6607(this);
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo6608(InterfaceC3051 interfaceC3051) {
        boolean z;
        synchronized (this.f9731) {
            InterfaceC3050 interfaceC3050 = this.f9730;
            z = (interfaceC3050 == null || interfaceC3050.mo6608(this)) && interfaceC3051.equals(this.f9729);
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo6609(InterfaceC3051 interfaceC3051) {
        synchronized (this.f9731) {
            try {
                if (interfaceC3051.equals(this.f9729)) {
                    this.f9727 = RequestCoordinator$RequestState.SUCCESS;
                } else if (interfaceC3051.equals(this.f9728)) {
                    this.f9726 = RequestCoordinator$RequestState.SUCCESS;
                }
                InterfaceC3050 interfaceC3050 = this.f9730;
                if (interfaceC3050 != null) {
                    interfaceC3050.mo6609(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3051
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo6604() {
        boolean z;
        synchronized (this.f9731) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.f9727;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.SUCCESS;
                z = requestCoordinator$RequestState == requestCoordinator$RequestState2 || this.f9726 == requestCoordinator$RequestState2;
            } finally {
            }
        }
        return z;
    }
}
