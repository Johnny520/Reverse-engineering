package com.p001mr.elaris;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ElarisApplication extends Application {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        FrameworkActivationStatus.init(this);
    }
}
