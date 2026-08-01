package com.p001mr.elaris;

/* JADX INFO: renamed from: com.mr.elaris.b */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0148b implements Runnable {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = FrameworkActivationStatus.sListener;
        if (runnable != null) {
            runnable.run();
        }
    }
}
