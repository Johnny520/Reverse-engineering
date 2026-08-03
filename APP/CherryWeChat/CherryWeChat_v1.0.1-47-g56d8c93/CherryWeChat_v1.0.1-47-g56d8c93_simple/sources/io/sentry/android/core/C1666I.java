package io.sentry.android.core;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import io.sentry.C2046v2;
import io.sentry.EnumC1606M;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.config.AbstractC1856a;
import io.sentry.transport.InterfaceC2013h;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: io.sentry.android.core.I */
/* JADX INFO: loaded from: classes.dex */
public final class C1666I implements InterfaceC2013h {

    /* JADX INFO: renamed from: b */
    public static final C1666I f5973b = null;

    /* JADX INFO: renamed from: a */
    public Object f5974a;

    static {
        f5973b = new C1666I();
    }

    public C1666I() {
        this.f5974a = new Handler(Looper.getMainLooper());
    }

    @Override // io.sentry.transport.InterfaceC2013h
    /* JADX INFO: renamed from: a */
    public boolean mo3833a() {
        EnumC1606M r0 = ((C2046v2) this.f5974a).getConnectionStatusProvider().mo3684g();
        int r02 = AbstractC1745s.f6344a[r0.ordinal()];
        if (r02 != 1) goto L5;
    L10:
        return true;
    L5:
        if (r02 == 2) goto L10;
        if (r02 == 3) goto L10;
        return false;
    }

    /* JADX INFO: renamed from: b */
    public Boolean m3834b() {
    L8:
        th = move-exception;
        ((ILogger) this.f5974a).mo3683r(EnumC1657a2.ERROR, "Error checking whether application is running in an emulator.", th);
        return null;
    L4:
        if (Build.BRAND.startsWith("generic") == true) goto L6;
    L10:
        String r2 = Build.FINGERPRINT;     // Catch: Throwable -> L8
        if (r2.startsWith("generic") == false) goto L13;
    L42:
        boolean r0 = true;
    L43:
        return Boolean.valueOf(r0);
    L13:
        if (r2.startsWith("unknown") == true) goto L42;
        String r1 = Build.HARDWARE;     // Catch: Throwable -> L8
        if (r1.contains("goldfish") == true) goto L42;
        if (r1.contains("ranchu") == true) goto L42;
        String r12 = Build.MODEL;     // Catch: Throwable -> L8
        if (r12.contains("google_sdk") == true) goto L42;
        if (r12.contains("Emulator") == true) goto L42;
        if (r12.contains("Android SDK built for x86") == true) goto L42;
        if (Build.MANUFACTURER.contains("Genymotion") == true) goto L42;
        String r13 = Build.PRODUCT;     // Catch: Throwable -> L8
        if (r13.contains("sdk_google") == true) goto L42;
        if (r13.contains("google_sdk") == true) goto L42;
        if (r13.contains("sdk") == true) goto L42;
        if (r13.contains("sdk_x86") == true) goto L42;
        if (r13.contains("vbox86p") == true) goto L42;
        if (r13.contains("emulator") == true) goto L42;
        if (r13.contains("simulator") == true) goto L42;
        r0 = false;
        goto L43
    L6:
        if (Build.DEVICE.startsWith("generic") == true) goto L42;
        goto L42
    }

    /* JADX INFO: renamed from: c */
    public void m3835c(Activity r2) {
        WeakReference r0 = (WeakReference) this.f5974a;
        if (r0 != null) goto L5;
    L7:
        this.f5974a = new WeakReference(r2);
        return;
    L5:
        if (r0.get() != r2) goto L7;
    }

    public C1666I(ILogger r2) {
        AbstractC1856a.m4048D("The ILogger object is required.", r2);
        this.f5974a = r2;
    }
}
