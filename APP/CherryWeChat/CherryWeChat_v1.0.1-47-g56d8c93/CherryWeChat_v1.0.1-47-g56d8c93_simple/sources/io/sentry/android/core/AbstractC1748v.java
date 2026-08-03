package io.sentry.android.core;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.view.Display;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: renamed from: io.sentry.android.core.v */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1748v {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m3928a(ApplicationExitInfo r0) {
        return r0.getReason();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ long m3929b(ApplicationExitInfo r2) {
        return r2.getTimestamp();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ ApplicationExitInfo m3930c(Object r0) {
        return (ApplicationExitInfo) r0;
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ Display m3931d(Context r0) {
        return r0.getDisplay();
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ InputStream m3932e(ApplicationExitInfo r0) {
        return r0.getTraceInputStream();
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ String m3933f(ApplicationExitInfo r0) {
        return r0.toString();
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ List m3934g(ActivityManager r2) {
        return r2.getHistoricalProcessExitReasons(null, 0, 0);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ int m3935h(ApplicationExitInfo r0) {
        return r0.getImportance();
    }
}
