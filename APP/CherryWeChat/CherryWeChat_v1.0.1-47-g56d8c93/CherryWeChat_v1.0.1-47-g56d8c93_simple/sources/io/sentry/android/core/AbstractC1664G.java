package io.sentry.android.core;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: io.sentry.android.core.G */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1664G {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ ApplicationInfo m3817a(PackageManager r0, String r1, PackageManager.ApplicationInfoFlags r2) {
        return r0.getApplicationInfo(r1, r2);
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ PackageInfo m3818b(PackageManager r0, String r1, PackageManager.PackageInfoFlags r2) {
        return r0.getPackageInfo(r1, r2);
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ PackageManager.ApplicationInfoFlags m3819c() {
        return PackageManager.ApplicationInfoFlags.of(128);
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ PackageManager.PackageInfoFlags m3820d() {
        return PackageManager.PackageInfoFlags.of(0);
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ PackageManager.PackageInfoFlags m3821e(long r0) {
        return PackageManager.PackageInfoFlags.of(r0);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ void m3822f(PackageManager r0, String r1, PackageManager.PackageInfoFlags r2) {
        r0.getPackageInfo(r1, r2);
    }
}
