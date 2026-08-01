package com.bumptech.glide.request;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
