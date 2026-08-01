package com.bumptech.glide.request;

/* JADX INFO: renamed from: com.bumptech.glide.request.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3884 implements InterfaceC3882, InterfaceC3883 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public RequestCoordinator$RequestState f10071;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public RequestCoordinator$RequestState f10072;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public volatile InterfaceC3883 f10073;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public volatile InterfaceC3883 f10074;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC3882 f10075;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f10076;

    public C3884(Object obj, InterfaceC3882 interfaceC3882) {
        RequestCoordinator$RequestState requestCoordinator$RequestState = RequestCoordinator$RequestState.CLEARED;
        this.f10072 = requestCoordinator$RequestState;
        this.f10071 = requestCoordinator$RequestState;
        this.f10076 = obj;
        this.f10075 = interfaceC3882;
    }

    @Override // com.bumptech.glide.request.InterfaceC3883
    public final void clear() {
        synchronized (this.f10076) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = RequestCoordinator$RequestState.CLEARED;
                this.f10072 = requestCoordinator$RequestState;
                this.f10074.clear();
                if (this.f10071 != requestCoordinator$RequestState) {
                    this.f10071 = requestCoordinator$RequestState;
                    this.f10073.clear();
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
    @Override // com.bumptech.glide.request.InterfaceC3882
    public final InterfaceC3882 getRoot() {
        ?? root;
        synchronized (this.f10076) {
            try {
                InterfaceC3882 interfaceC3882 = this.f10075;
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
        synchronized (this.f10076) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.f10072;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.RUNNING;
                z = requestCoordinator$RequestState == requestCoordinator$RequestState2 || this.f10071 == requestCoordinator$RequestState2;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3882
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo7165(InterfaceC3883 interfaceC3883) {
        boolean z;
        RequestCoordinator$RequestState requestCoordinator$RequestState;
        synchronized (this.f10076) {
            InterfaceC3882 interfaceC3882 = this.f10075;
            z = false;
            if (interfaceC3882 == null || interfaceC3882.mo7165(this)) {
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = this.f10072;
                RequestCoordinator$RequestState requestCoordinator$RequestState3 = RequestCoordinator$RequestState.FAILED;
                if (requestCoordinator$RequestState2 != requestCoordinator$RequestState3 ? interfaceC3883.equals(this.f10074) : interfaceC3883.equals(this.f10073) && ((requestCoordinator$RequestState = this.f10071) == RequestCoordinator$RequestState.SUCCESS || requestCoordinator$RequestState == requestCoordinator$RequestState3)) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3883
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo7153() {
        boolean z;
        synchronized (this.f10076) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.f10072;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.CLEARED;
                z = requestCoordinator$RequestState == requestCoordinator$RequestState2 && this.f10071 == requestCoordinator$RequestState2;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3883
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo7154() {
        synchronized (this.f10076) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.f10072;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.RUNNING;
                if (requestCoordinator$RequestState == requestCoordinator$RequestState2) {
                    this.f10072 = RequestCoordinator$RequestState.PAUSED;
                    this.f10074.mo7154();
                }
                if (this.f10071 == requestCoordinator$RequestState2) {
                    this.f10071 = RequestCoordinator$RequestState.PAUSED;
                    this.f10073.mo7154();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3883
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo7155(InterfaceC3883 interfaceC3883) {
        if (interfaceC3883 instanceof C3884) {
            C3884 c3884 = (C3884) interfaceC3883;
            if (this.f10074.mo7155(c3884.f10074) && this.f10073.mo7155(c3884.f10073)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.request.InterfaceC3882
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo7166(InterfaceC3883 interfaceC3883) {
        synchronized (this.f10076) {
            try {
                if (interfaceC3883.equals(this.f10073)) {
                    this.f10071 = RequestCoordinator$RequestState.FAILED;
                    InterfaceC3882 interfaceC3882 = this.f10075;
                    if (interfaceC3882 != null) {
                        interfaceC3882.mo7166(this);
                    }
                    return;
                }
                this.f10072 = RequestCoordinator$RequestState.FAILED;
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.f10071;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.RUNNING;
                if (requestCoordinator$RequestState != requestCoordinator$RequestState2) {
                    this.f10071 = requestCoordinator$RequestState2;
                    this.f10073.mo7159();
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
        synchronized (this.f10076) {
            try {
                z = this.f10074.mo7157() || this.f10073.mo7157();
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3883
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo7159() {
        synchronized (this.f10076) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.f10072;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.RUNNING;
                if (requestCoordinator$RequestState != requestCoordinator$RequestState2) {
                    this.f10072 = requestCoordinator$RequestState2;
                    this.f10074.mo7159();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3882
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo7167(InterfaceC3883 interfaceC3883) {
        boolean z;
        synchronized (this.f10076) {
            InterfaceC3882 interfaceC3882 = this.f10075;
            z = interfaceC3882 == null || interfaceC3882.mo7167(this);
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3882
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo7168(InterfaceC3883 interfaceC3883) {
        boolean z;
        synchronized (this.f10076) {
            InterfaceC3882 interfaceC3882 = this.f10075;
            z = (interfaceC3882 == null || interfaceC3882.mo7168(this)) && interfaceC3883.equals(this.f10074);
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3882
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo7169(InterfaceC3883 interfaceC3883) {
        synchronized (this.f10076) {
            try {
                if (interfaceC3883.equals(this.f10074)) {
                    this.f10072 = RequestCoordinator$RequestState.SUCCESS;
                } else if (interfaceC3883.equals(this.f10073)) {
                    this.f10071 = RequestCoordinator$RequestState.SUCCESS;
                }
                InterfaceC3882 interfaceC3882 = this.f10075;
                if (interfaceC3882 != null) {
                    interfaceC3882.mo7169(this);
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
        synchronized (this.f10076) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.f10072;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.SUCCESS;
                z = requestCoordinator$RequestState == requestCoordinator$RequestState2 || this.f10071 == requestCoordinator$RequestState2;
            } finally {
            }
        }
        return z;
    }
}
