package com.bumptech.glide.request;

/* JADX INFO: renamed from: com.bumptech.glide.request.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3886 implements InterfaceC3882, InterfaceC3883 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public RequestCoordinator$RequestState f10096;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public RequestCoordinator$RequestState f10097;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public volatile InterfaceC3883 f10098;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public volatile C3880 f10099;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f10100;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC3882 f10101;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f10102;

    public C3886(Object obj, InterfaceC3882 interfaceC3882) {
        RequestCoordinator$RequestState requestCoordinator$RequestState = RequestCoordinator$RequestState.CLEARED;
        this.f10097 = requestCoordinator$RequestState;
        this.f10096 = requestCoordinator$RequestState;
        this.f10100 = obj;
        this.f10101 = interfaceC3882;
    }

    @Override // com.bumptech.glide.request.InterfaceC3883
    public final void clear() {
        synchronized (this.f10100) {
            this.f10102 = false;
            RequestCoordinator$RequestState requestCoordinator$RequestState = RequestCoordinator$RequestState.CLEARED;
            this.f10097 = requestCoordinator$RequestState;
            this.f10096 = requestCoordinator$RequestState;
            this.f10098.clear();
            this.f10099.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.bumptech.glide.request.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // com.bumptech.glide.request.InterfaceC3882
    public final InterfaceC3882 getRoot() {
        ?? root;
        synchronized (this.f10100) {
            try {
                InterfaceC3882 interfaceC3882 = this.f10101;
                this = this;
                if (interfaceC3882 != null) {
                    root = interfaceC3882.getRoot();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.InterfaceC3883
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f10100) {
            z = this.f10097 == RequestCoordinator$RequestState.RUNNING;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3882
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo7165(InterfaceC3883 interfaceC3883) {
        boolean z;
        synchronized (this.f10100) {
            try {
                InterfaceC3882 interfaceC3882 = this.f10101;
                z = (interfaceC3882 == null || interfaceC3882.mo7165(this)) && interfaceC3883.equals(this.f10099) && !mo7157();
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3883
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo7153() {
        boolean z;
        synchronized (this.f10100) {
            z = this.f10097 == RequestCoordinator$RequestState.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3883
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo7154() {
        synchronized (this.f10100) {
            try {
                if (!this.f10096.isComplete()) {
                    this.f10096 = RequestCoordinator$RequestState.PAUSED;
                    this.f10098.mo7154();
                }
                if (!this.f10097.isComplete()) {
                    this.f10097 = RequestCoordinator$RequestState.PAUSED;
                    this.f10099.mo7154();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3883
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo7155(InterfaceC3883 interfaceC3883) {
        if (!(interfaceC3883 instanceof C3886)) {
            return false;
        }
        C3886 c3886 = (C3886) interfaceC3883;
        if (this.f10099 == null) {
            if (c3886.f10099 != null) {
                return false;
            }
        } else if (!this.f10099.mo7155(c3886.f10099)) {
            return false;
        }
        return this.f10098 == null ? c3886.f10098 == null : this.f10098.mo7155(c3886.f10098);
    }

    @Override // com.bumptech.glide.request.InterfaceC3882
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo7166(InterfaceC3883 interfaceC3883) {
        synchronized (this.f10100) {
            try {
                if (!interfaceC3883.equals(this.f10099)) {
                    this.f10096 = RequestCoordinator$RequestState.FAILED;
                    return;
                }
                this.f10097 = RequestCoordinator$RequestState.FAILED;
                InterfaceC3882 interfaceC3882 = this.f10101;
                if (interfaceC3882 != null) {
                    interfaceC3882.mo7166(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3882, com.bumptech.glide.request.InterfaceC3883
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo7157() {
        boolean z;
        synchronized (this.f10100) {
            try {
                z = this.f10098.mo7157() || this.f10099.mo7157();
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3883
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo7159() {
        synchronized (this.f10100) {
            try {
                this.f10102 = true;
                try {
                    if (this.f10097 != RequestCoordinator$RequestState.SUCCESS) {
                        RequestCoordinator$RequestState requestCoordinator$RequestState = this.f10096;
                        RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.RUNNING;
                        if (requestCoordinator$RequestState != requestCoordinator$RequestState2) {
                            this.f10096 = requestCoordinator$RequestState2;
                            this.f10098.mo7159();
                        }
                    }
                    if (this.f10102) {
                        RequestCoordinator$RequestState requestCoordinator$RequestState3 = this.f10097;
                        RequestCoordinator$RequestState requestCoordinator$RequestState4 = RequestCoordinator$RequestState.RUNNING;
                        if (requestCoordinator$RequestState3 != requestCoordinator$RequestState4) {
                            this.f10097 = requestCoordinator$RequestState4;
                            this.f10099.mo7159();
                        }
                    }
                    this.f10102 = false;
                } catch (Throwable th) {
                    this.f10102 = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3882
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo7167(InterfaceC3883 interfaceC3883) {
        boolean z;
        synchronized (this.f10100) {
            try {
                InterfaceC3882 interfaceC3882 = this.f10101;
                z = (interfaceC3882 == null || interfaceC3882.mo7167(this)) && (interfaceC3883.equals(this.f10099) || this.f10097 != RequestCoordinator$RequestState.SUCCESS);
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3882
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo7168(InterfaceC3883 interfaceC3883) {
        boolean z;
        synchronized (this.f10100) {
            try {
                InterfaceC3882 interfaceC3882 = this.f10101;
                z = (interfaceC3882 == null || interfaceC3882.mo7168(this)) && interfaceC3883.equals(this.f10099) && this.f10097 != RequestCoordinator$RequestState.PAUSED;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3882
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo7169(InterfaceC3883 interfaceC3883) {
        synchronized (this.f10100) {
            try {
                if (interfaceC3883.equals(this.f10098)) {
                    this.f10096 = RequestCoordinator$RequestState.SUCCESS;
                    return;
                }
                this.f10097 = RequestCoordinator$RequestState.SUCCESS;
                InterfaceC3882 interfaceC3882 = this.f10101;
                if (interfaceC3882 != null) {
                    interfaceC3882.mo7169(this);
                }
                if (!this.f10096.isComplete()) {
                    this.f10098.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3883
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo7164() {
        boolean z;
        synchronized (this.f10100) {
            z = this.f10097 == RequestCoordinator$RequestState.SUCCESS;
        }
        return z;
    }
}
