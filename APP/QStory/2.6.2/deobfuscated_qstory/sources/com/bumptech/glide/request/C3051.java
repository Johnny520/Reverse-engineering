package com.bumptech.glide.request;

/* JADX INFO: renamed from: com.bumptech.glide.request.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3051 implements InterfaceC3049, InterfaceC3050 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public RequestCoordinator$RequestState f9724;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public RequestCoordinator$RequestState f9725;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public volatile InterfaceC3050 f9726;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public volatile InterfaceC3050 f9727;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC3049 f9728;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f9729;

    public C3051(Object obj, InterfaceC3049 interfaceC3049) {
        RequestCoordinator$RequestState requestCoordinator$RequestState = RequestCoordinator$RequestState.CLEARED;
        this.f9725 = requestCoordinator$RequestState;
        this.f9724 = requestCoordinator$RequestState;
        this.f9729 = obj;
        this.f9728 = interfaceC3049;
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    public final void clear() {
        synchronized (this.f9729) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = RequestCoordinator$RequestState.CLEARED;
                this.f9725 = requestCoordinator$RequestState;
                this.f9727.clear();
                if (this.f9724 != requestCoordinator$RequestState) {
                    this.f9724 = requestCoordinator$RequestState;
                    this.f9726.clear();
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
    @Override // com.bumptech.glide.request.InterfaceC3049
    public final InterfaceC3049 getRoot() {
        ?? root;
        synchronized (this.f9729) {
            try {
                InterfaceC3049 interfaceC3049 = this.f9728;
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
        synchronized (this.f9729) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.f9725;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.RUNNING;
                z = requestCoordinator$RequestState == requestCoordinator$RequestState2 || this.f9724 == requestCoordinator$RequestState2;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3049
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo6545(InterfaceC3050 interfaceC3050) {
        boolean z;
        RequestCoordinator$RequestState requestCoordinator$RequestState;
        synchronized (this.f9729) {
            InterfaceC3049 interfaceC3049 = this.f9728;
            z = false;
            if (interfaceC3049 == null || interfaceC3049.mo6545(this)) {
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = this.f9725;
                RequestCoordinator$RequestState requestCoordinator$RequestState3 = RequestCoordinator$RequestState.FAILED;
                if (requestCoordinator$RequestState2 != requestCoordinator$RequestState3 ? interfaceC3050.equals(this.f9727) : interfaceC3050.equals(this.f9726) && ((requestCoordinator$RequestState = this.f9724) == RequestCoordinator$RequestState.SUCCESS || requestCoordinator$RequestState == requestCoordinator$RequestState3)) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo6533() {
        boolean z;
        synchronized (this.f9729) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.f9725;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.CLEARED;
                z = requestCoordinator$RequestState == requestCoordinator$RequestState2 && this.f9724 == requestCoordinator$RequestState2;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo6534() {
        synchronized (this.f9729) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.f9725;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.RUNNING;
                if (requestCoordinator$RequestState == requestCoordinator$RequestState2) {
                    this.f9725 = RequestCoordinator$RequestState.PAUSED;
                    this.f9727.mo6534();
                }
                if (this.f9724 == requestCoordinator$RequestState2) {
                    this.f9724 = RequestCoordinator$RequestState.PAUSED;
                    this.f9726.mo6534();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo6535(InterfaceC3050 interfaceC3050) {
        if (interfaceC3050 instanceof C3051) {
            C3051 c3051 = (C3051) interfaceC3050;
            if (this.f9727.mo6535(c3051.f9727) && this.f9726.mo6535(c3051.f9726)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.request.InterfaceC3049
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6546(InterfaceC3050 interfaceC3050) {
        synchronized (this.f9729) {
            try {
                if (interfaceC3050.equals(this.f9726)) {
                    this.f9724 = RequestCoordinator$RequestState.FAILED;
                    InterfaceC3049 interfaceC3049 = this.f9728;
                    if (interfaceC3049 != null) {
                        interfaceC3049.mo6546(this);
                    }
                    return;
                }
                this.f9725 = RequestCoordinator$RequestState.FAILED;
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.f9724;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.RUNNING;
                if (requestCoordinator$RequestState != requestCoordinator$RequestState2) {
                    this.f9724 = requestCoordinator$RequestState2;
                    this.f9726.mo6539();
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
        synchronized (this.f9729) {
            try {
                z = this.f9727.mo6537() || this.f9726.mo6537();
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3050
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo6539() {
        synchronized (this.f9729) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.f9725;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.RUNNING;
                if (requestCoordinator$RequestState != requestCoordinator$RequestState2) {
                    this.f9725 = requestCoordinator$RequestState2;
                    this.f9727.mo6539();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3049
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo6547(InterfaceC3050 interfaceC3050) {
        boolean z;
        synchronized (this.f9729) {
            InterfaceC3049 interfaceC3049 = this.f9728;
            z = interfaceC3049 == null || interfaceC3049.mo6547(this);
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3049
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo6548(InterfaceC3050 interfaceC3050) {
        boolean z;
        synchronized (this.f9729) {
            InterfaceC3049 interfaceC3049 = this.f9728;
            z = (interfaceC3049 == null || interfaceC3049.mo6548(this)) && interfaceC3050.equals(this.f9727);
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3049
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo6549(InterfaceC3050 interfaceC3050) {
        synchronized (this.f9729) {
            try {
                if (interfaceC3050.equals(this.f9727)) {
                    this.f9725 = RequestCoordinator$RequestState.SUCCESS;
                } else if (interfaceC3050.equals(this.f9726)) {
                    this.f9724 = RequestCoordinator$RequestState.SUCCESS;
                }
                InterfaceC3049 interfaceC3049 = this.f9728;
                if (interfaceC3049 != null) {
                    interfaceC3049.mo6549(this);
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
        synchronized (this.f9729) {
            try {
                RequestCoordinator$RequestState requestCoordinator$RequestState = this.f9725;
                RequestCoordinator$RequestState requestCoordinator$RequestState2 = RequestCoordinator$RequestState.SUCCESS;
                z = requestCoordinator$RequestState == requestCoordinator$RequestState2 || this.f9724 == requestCoordinator$RequestState2;
            } finally {
            }
        }
        return z;
    }
}
