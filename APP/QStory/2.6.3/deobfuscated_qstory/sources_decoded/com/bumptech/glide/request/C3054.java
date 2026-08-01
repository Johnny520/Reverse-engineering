package com.bumptech.glide.request;

/* JADX INFO: renamed from: com.bumptech.glide.request.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3054 implements InterfaceC3050, InterfaceC3051 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public RequestCoordinator$RequestState f9751;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public RequestCoordinator$RequestState f9752;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public volatile InterfaceC3051 f9753;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public volatile C3048 f9754;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f9755;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC3050 f9756;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f9757;

    public C3054(Object obj, InterfaceC3050 interfaceC3050) {
        RequestCoordinator$RequestState requestCoordinator$RequestState = RequestCoordinator$RequestState.CLEARED;
        this.f9752 = requestCoordinator$RequestState;
        this.f9751 = requestCoordinator$RequestState;
        this.f9755 = obj;
        this.f9756 = interfaceC3050;
    }

    @Override // com.bumptech.glide.request.InterfaceC3051
    public final void clear() {
        synchronized (this.f9755) {
            this.f9757 = false;
            RequestCoordinator$RequestState requestCoordinator$RequestState = RequestCoordinator$RequestState.CLEARED;
            this.f9752 = requestCoordinator$RequestState;
            this.f9751 = requestCoordinator$RequestState;
            this.f9753.clear();
            this.f9754.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.bumptech.glide.request.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // com.bumptech.glide.request.InterfaceC3050
    public final InterfaceC3050 getRoot() {
        ?? root;
        synchronized (this.f9755) {
            try {
                InterfaceC3050 interfaceC3050 = this.f9756;
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
        synchronized (this.f9755) {
            z = this.f9752 == RequestCoordinator$RequestState.RUNNING;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo6605(InterfaceC3051 interfaceC3051) {
        boolean z;
        synchronized (this.f9755) {
            try {
                InterfaceC3050 interfaceC3050 = this.f9756;
                z = (interfaceC3050 == null || interfaceC3050.mo6605(this)) && interfaceC3051.equals(this.f9754) && !mo6597();
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3051
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo6593() {
        boolean z;
        synchronized (this.f9755) {
            z = this.f9752 == RequestCoordinator$RequestState.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3051
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo6594() {
        synchronized (this.f9755) {
            try {
                if (!this.f9751.isComplete()) {
                    this.f9751 = RequestCoordinator$RequestState.PAUSED;
                    this.f9753.mo6594();
                }
                if (!this.f9752.isComplete()) {
                    this.f9752 = RequestCoordinator$RequestState.PAUSED;
                    this.f9754.mo6594();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3051
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo6595(InterfaceC3051 interfaceC3051) {
        if (!(interfaceC3051 instanceof C3054)) {
            return false;
        }
        C3054 c3054 = (C3054) interfaceC3051;
        if (this.f9754 == null) {
            if (c3054.f9754 != null) {
                return false;
            }
        } else if (!this.f9754.mo6595(c3054.f9754)) {
            return false;
        }
        return this.f9753 == null ? c3054.f9753 == null : this.f9753.mo6595(c3054.f9753);
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6606(InterfaceC3051 interfaceC3051) {
        synchronized (this.f9755) {
            try {
                if (!interfaceC3051.equals(this.f9754)) {
                    this.f9751 = RequestCoordinator$RequestState.FAILED;
                    return;
                }
                this.f9752 = RequestCoordinator$RequestState.FAILED;
                InterfaceC3050 interfaceC3050 = this.f9756;
                if (interfaceC3050 != null) {
                    interfaceC3050.mo6606(this);
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
        synchronized (this.f9755) {
            try {
                z = this.f9753.mo6597() || this.f9754.mo6597();
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3051
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo6599() {
        synchronized (this.f9755) {
            try {
                this.f9757 = true;
                try {
                    if (this.f9752 != RequestCoordinator$RequestState.SUCCESS) {
                        RequestCoordinator$RequestState requestCoordinator$RequestState = this.f9751;
                        RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.RUNNING;
                        if (requestCoordinator$RequestState != requestCoordinator$RequestState2) {
                            this.f9751 = requestCoordinator$RequestState2;
                            this.f9753.mo6599();
                        }
                    }
                    if (this.f9757) {
                        RequestCoordinator$RequestState requestCoordinator$RequestState3 = this.f9752;
                        RequestCoordinator$RequestState requestCoordinator$RequestState4 = RequestCoordinator$RequestState.RUNNING;
                        if (requestCoordinator$RequestState3 != requestCoordinator$RequestState4) {
                            this.f9752 = requestCoordinator$RequestState4;
                            this.f9754.mo6599();
                        }
                    }
                    this.f9757 = false;
                } catch (Throwable th) {
                    this.f9757 = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo6607(InterfaceC3051 interfaceC3051) {
        boolean z;
        synchronized (this.f9755) {
            try {
                InterfaceC3050 interfaceC3050 = this.f9756;
                z = (interfaceC3050 == null || interfaceC3050.mo6607(this)) && (interfaceC3051.equals(this.f9754) || this.f9752 != RequestCoordinator$RequestState.SUCCESS);
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo6608(InterfaceC3051 interfaceC3051) {
        boolean z;
        synchronized (this.f9755) {
            try {
                InterfaceC3050 interfaceC3050 = this.f9756;
                z = (interfaceC3050 == null || interfaceC3050.mo6608(this)) && interfaceC3051.equals(this.f9754) && this.f9752 != RequestCoordinator$RequestState.PAUSED;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo6609(InterfaceC3051 interfaceC3051) {
        synchronized (this.f9755) {
            try {
                if (interfaceC3051.equals(this.f9753)) {
                    this.f9751 = RequestCoordinator$RequestState.SUCCESS;
                    return;
                }
                this.f9752 = RequestCoordinator$RequestState.SUCCESS;
                InterfaceC3050 interfaceC3050 = this.f9756;
                if (interfaceC3050 != null) {
                    interfaceC3050.mo6609(this);
                }
                if (!this.f9751.isComplete()) {
                    this.f9753.clear();
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
        synchronized (this.f9755) {
            z = this.f9752 == RequestCoordinator$RequestState.SUCCESS;
        }
        return z;
    }
}
