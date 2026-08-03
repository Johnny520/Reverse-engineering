package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Intent;
import android.net.NetworkCapabilities;

/* JADX INFO: renamed from: io.sentry.android.core.F */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1663F {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m3815a(NetworkCapabilities r0) {
        return r0.getSignalStrength();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ Intent m3816b(ActivityManager.RecentTaskInfo r0) {
        return r0.baseIntent;
    }
}
