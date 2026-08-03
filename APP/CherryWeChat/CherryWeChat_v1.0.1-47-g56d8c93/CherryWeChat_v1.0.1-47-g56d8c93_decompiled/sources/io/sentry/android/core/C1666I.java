package io.sentry.android.core;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.config.AbstractC1856a;
import io.sentry.transport.InterfaceC2013h;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: io.sentry.android.core.I */
/* JADX INFO: loaded from: classes.dex */
public final class C1666I implements InterfaceC2013h {

    /* JADX INFO: renamed from: b */
    public static final C1666I f5973b = new C1666I();

    /* JADX INFO: renamed from: a */
    public Object f5974a;

    public C1666I() {
        this.f5974a = new Handler(Looper.getMainLooper());
    }

    @Override // io.sentry.transport.InterfaceC2013h
    /* JADX INFO: renamed from: a */
    public boolean mo3833a() {
        int i = AbstractC1745s.f6344a[((C2046v2) this.f5974a).getConnectionStatusProvider().mo3684g().ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Boolean m3834b() {
        boolean z;
        try {
            if (!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) {
                String str = Build.FINGERPRINT;
                if (str.startsWith("generic") || str.startsWith("unknown")) {
                    z = true;
                } else {
                    String str2 = Build.HARDWARE;
                    if (!str2.contains("goldfish") && !str2.contains("ranchu")) {
                        String str3 = Build.MODEL;
                        if (!str3.contains("google_sdk") && !str3.contains("Emulator") && !str3.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion")) {
                            String str4 = Build.PRODUCT;
                            if (!str4.contains("sdk_google") && !str4.contains("google_sdk") && !str4.contains("sdk") && !str4.contains("sdk_x86") && !str4.contains("vbox86p") && !str4.contains("emulator") && !str4.contains("simulator")) {
                                z = false;
                            }
                        }
                    }
                }
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            ((ILogger) this.f5974a).mo3683r(EnumC1657a2.ERROR, "Error checking whether application is running in an emulator.", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m3835c(Activity activity) {
        WeakReference weakReference = (WeakReference) this.f5974a;
        if (weakReference == null || weakReference.get() != activity) {
            this.f5974a = new WeakReference(activity);
        }
    }

    public C1666I(ILogger iLogger) {
        AbstractC1856a.m4048D("The ILogger object is required.", iLogger);
        this.f5974a = iLogger;
    }
}
