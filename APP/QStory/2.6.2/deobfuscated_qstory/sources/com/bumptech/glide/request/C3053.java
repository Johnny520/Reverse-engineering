package com.bumptech.glide.request;

/* JADX INFO: renamed from: com.bumptech.glide.request.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3053 implements InterfaceC3049, InterfaceC3050 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public RequestCoordinator$RequestState f9749;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public RequestCoordinator$RequestState f9750;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public volatile InterfaceC3050 f9751;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public volatile C3047 f9752;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f9753;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC3049 f9754;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f9755;

    public C3053(Object obj, InterfaceC3049 interfaceC3049) {
        RequestCoordinator$RequestState requestCoordinator$RequestState = RequestCoordinator$RequestState.CLEARED;
        this.f9750 = requestCoordinator$RequestState;
        this.f9749 = requestCoordinator$RequestState;
        this.f9753 = obj;
        this.f9754 = interfaceC3049;
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    public final void clear() {
        synchronized (this.f9753) {
            this.f9755 = false;
            RequestCoordinator$RequestState requestCoordinator$RequestState = RequestCoordinator$RequestState.CLEARED;
            this.f9750 = requestCoordinator$RequestState;
            this.f9749 = requestCoordinator$RequestState;
            this.f9751.clear();
            this.f9752.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.bumptech.glide.request.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // com.bumptech.glide.request.InterfaceC3049
    public final InterfaceC3049 getRoot() {
        ?? root;
        synchronized (this.f9753) {
            try {
                InterfaceC3049 interfaceC3049 = this.f9754;
                this = this;
                if (interfaceC3049 != null) {
                    root = interfaceC3049.getRoot();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f9753) {
            z = this.f9750 == RequestCoordinator$RequestState.RUNNING;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3049
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo6545(InterfaceC3050 interfaceC3050) {
        boolean z;
        synchronized (this.f9753) {
            try {
                InterfaceC3049 interfaceC3049 = this.f9754;
                z = (interfaceC3049 == null || interfaceC3049.mo6545(this)) && interfaceC3050.equals(this.f9752) && !mo6537();
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo6533() {
        boolean z;
        synchronized (this.f9753) {
            z = this.f9750 == RequestCoordinator$RequestState.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo6534() {
        synchronized (this.f9753) {
            try {
                if (!this.f9749.isComplete()) {
                    this.f9749 = RequestCoordinator$RequestState.PAUSED;
                    this.f9751.mo6534();
                }
                if (!this.f9750.isComplete()) {
                    this.f9750 = RequestCoordinator$RequestState.PAUSED;
                    this.f9752.mo6534();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo6535(InterfaceC3050 interfaceC3050) {
        if (!(interfaceC3050 instanceof C3053)) {
            return false;
        }
        C3053 c3053 = (C3053) interfaceC3050;
        if (this.f9752 == null) {
            if (c3053.f9752 != null) {
                return false;
            }
        } else if (!this.f9752.mo6535(c3053.f9752)) {
            return false;
        }
        return this.f9751 == null ? c3053.f9751 == null : this.f9751.mo6535(c3053.f9751);
    }

    @Override // com.bumptech.glide.request.InterfaceC3049
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6546(InterfaceC3050 interfaceC3050) {
        synchronized (this.f9753) {
            try {
                if (!interfaceC3050.equals(this.f9752)) {
                    this.f9749 = RequestCoordinator$RequestState.FAILED;
                    return;
                }
                this.f9750 = RequestCoordinator$RequestState.FAILED;
                InterfaceC3049 interfaceC3049 = this.f9754;
                if (interfaceC3049 != null) {
                    interfaceC3049.mo6546(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3049, com.bumptech.glide.request.InterfaceC3050
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo6537() {
        boolean z;
        synchronized (this.f9753) {
            try {
                z = this.f9751.mo6537() || this.f9752.mo6537();
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo6539() {
        synchronized (this.f9753) {
            try {
                this.f9755 = true;
                try {
                    if (this.f9750 != RequestCoordinator$RequestState.SUCCESS) {
                        RequestCoordinator$RequestState requestCoordinator$RequestState = this.f9749;
                        RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.RUNNING;
                        if (requestCoordinator$RequestState != requestCoordinator$RequestState2) {
                            this.f9749 = requestCoordinator$RequestState2;
                            this.f9751.mo6539();
                        }
                    }
                    if (this.f9755) {
                        RequestCoordinator$RequestState requestCoordinator$RequestState3 = this.f9750;
                        RequestCoordinator$RequestState requestCoordinator$RequestState4 = RequestCoordinator$RequestState.RUNNING;
                        if (requestCoordinator$RequestState3 != requestCoordinator$RequestState4) {
                            this.f9750 = requestCoordinator$RequestState4;
                            this.f9752.mo6539();
                        }
                    }
                    this.f9755 = false;
                } catch (Throwable th) {
                    this.f9755 = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3049
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo6547(InterfaceC3050 interfaceC3050) {
        boolean z;
        synchronized (this.f9753) {
            try {
                InterfaceC3049 interfaceC3049 = this.f9754;
                z = (interfaceC3049 == null || interfaceC3049.mo6547(this)) && (interfaceC3050.equals(this.f9752) || this.f9750 != RequestCoordinator$RequestState.SUCCESS);
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3049
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo6548(InterfaceC3050 interfaceC3050) {
        boolean z;
        synchronized (this.f9753) {
            try {
                InterfaceC3049 interfaceC3049 = this.f9754;
                z = (interfaceC3049 == null || interfaceC3049.mo6548(this)) && interfaceC3050.equals(this.f9752) && this.f9750 != RequestCoordinator$RequestState.PAUSED;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3049
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo6549(InterfaceC3050 interfaceC3050) {
        synchronized (this.f9753) {
            try {
                if (interfaceC3050.equals(this.f9751)) {
                    this.f9749 = RequestCoordinator$RequestState.SUCCESS;
                    return;
                }
                this.f9750 = RequestCoordinator$RequestState.SUCCESS;
                InterfaceC3049 interfaceC3049 = this.f9754;
                if (interfaceC3049 != null) {
                    interfaceC3049.mo6549(this);
                }
                if (!this.f9749.isComplete()) {
                    this.f9751.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo6544() {
        boolean z;
        synchronized (this.f9753) {
            z = this.f9750 == RequestCoordinator$RequestState.SUCCESS;
        }
        return z;
    }
}
