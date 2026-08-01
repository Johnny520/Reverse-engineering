package com.bumptech.glide.request;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public enum RequestCoordinator$RequestState {
    RUNNING(false),
    PAUSED(false),
    CLEARED(false),
    SUCCESS(true),
    FAILED(true);

    private final boolean isComplete;

    RequestCoordinator$RequestState(boolean z) {
        this.isComplete = z;
    }

    public boolean isComplete() {
        return this.isComplete;
    }
}
