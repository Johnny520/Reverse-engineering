package com.p001mr.elaris;

import io.github.libxposed.service.XposedService;
import io.github.libxposed.service.XposedServiceHelper;

/* JADX INFO: renamed from: com.mr.elaris.a */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0147a implements XposedServiceHelper.OnServiceListener {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // io.github.libxposed.service.XposedServiceHelper.OnServiceListener
    public final void onServiceBind(XposedService xposedService) {
        FrameworkActivationStatus.sService = xposedService;
        FrameworkActivationStatus.notifyChanged();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // io.github.libxposed.service.XposedServiceHelper.OnServiceListener
    public final void onServiceDied(XposedService xposedService) {
        if (FrameworkActivationStatus.sService == xposedService) {
            FrameworkActivationStatus.sService = null;
        }
        FrameworkActivationStatus.notifyChanged();
    }
}
