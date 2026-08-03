package io.sentry.android.core;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import io.sentry.C1586H;
import io.sentry.C1627R1;
import io.sentry.C1654a;
import io.sentry.CallableC1600K1;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1566C;
import io.sentry.android.core.internal.util.C1718f;
import io.sentry.android.core.internal.util.PixelCopyOnPixelCopyFinishedListenerC1722j;
import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1944A;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class ScreenshotEventProcessor implements InterfaceC1566C {

    /* JADX INFO: renamed from: a */
    public final SentryAndroidOptions f6009a;

    /* JADX INFO: renamed from: b */
    public final C1666I f6010b;

    /* JADX INFO: renamed from: c */
    public final C1718f f6011c;

    public ScreenshotEventProcessor(SentryAndroidOptions r4, C1666I r5) {
        AbstractC1856a.m4048D("SentryAndroidOptions is required", r4);
        this.f6009a = r4;
        this.f6010b = r5;
        this.f6011c = new C1718f(3, 2000);
        if (r4.isAttachScreenshot() == false) goto L6;
        AbstractC1856a.m4055a("Screenshot");
        return;
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: f */
    public final C1944A mo3584f(C1944A r1, C1586H r2) {
        return r1;
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: i */
    public final C1627R1 mo3585i(C1627R1 r14, C1586H r15) {
        if (r14.m3739d() == false) goto L64;
        SentryAndroidOptions r0 = this.f6009a;
        boolean r2 = false;
        if (r0.isAttachScreenshot() == true) goto L9;
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "attachScreenshot is disabled.", new Object[0]);
        return r14;
    L9:
        WeakReference r1 = (WeakReference) C1666I.f5973b.f5974a;
        Bitmap r3 = null;
        if (r1 == null) goto L12;
        Activity r12 = (Activity) r1.get();
    L13:
        if (r12 == null) goto L64;
        if (AbstractC1856a.m4076w(r15) == true) goto L64;
        boolean r4 = this.f6011c.m3904a();
        r0.getBeforeScreenshotCaptureCallback();
        if (r4 == true) goto L64;
        r0.getThreadChecker();
        ILogger r02 = r0.getLogger();
        C1666I r42 = this.f6010b;
        if (r12.isFinishing() == false) goto L23;
    L60:
        r02.mo3680e(EnumC1657a2.DEBUG, "Activity isn't valid, not taking screenshot.", new Object[0]);
    L61:
        if (r3 == null) goto L64;
        r15.f5732d = new C1654a(new CallableC1600K1(5, this, r3));
        r15.m3668c("android:activity", r12);
        goto L64
    L23:
        if (r12.isDestroyed() == true) goto L60;
        Window r5 = r12.getWindow();
        if (r5 != null) goto L27;
        r02.mo3680e(EnumC1657a2.DEBUG, "Activity window is null, not taking screenshot.", new Object[0]);
        goto L61
    L27:
        View r6 = r5.peekDecorView();
        if (r6 != null) goto L30;
        r02.mo3680e(EnumC1657a2.DEBUG, "DecorView is null, not taking screenshot.", new Object[0]);
        goto L61
    L30:
        View r62 = r6.getRootView();
        if (r62 != null) goto L34;
        r02.mo3680e(EnumC1657a2.DEBUG, "Root view is null, not taking screenshot.", new Object[0]);
        goto L61
    L34:
        if (r62.getWidth() > 0) goto L36;
    L59:
        r02.mo3680e(EnumC1657a2.DEBUG, "View's width and height is zeroed, not taking screenshot.", new Object[0]);
        goto L61
    L36:
        if (r62.getHeight() <= 0) goto L59;
        Bitmap r63 = Bitmap.createBitmap(r62.getWidth(), r62.getHeight(), Bitmap.Config.ARGB_8888);     // Catch: Throwable -> L48
        CountDownLatch r7 = new CountDownLatch(1);     // Catch: Throwable -> L48
        r42.getClass();     // Catch: Throwable -> L48
        HandlerThread r43 = new HandlerThread("SentryScreenshot");     // Catch: Throwable -> L48
        r43.start();     // Catch: Throwable -> L48
        Handler r9 = new Handler(r43.getLooper());     // Catch: Throwable -> L44
        AtomicBoolean r10 = new AtomicBoolean(false);     // Catch: Throwable -> L44
        PixelCopy.request(r5, r63, new PixelCopyOnPixelCopyFinishedListenerC1722j(0, r10, r7), r9);     // Catch: Throwable -> L44
        if (r7.await(1000, TimeUnit.MILLISECONDS) == false) goto L46;
        if (r10.get() == false) goto L46;
        r2 = true;
        goto L46
    L46:
        r43.quit();     // Catch: Throwable -> L48
        if (r2 == false) goto L61;
        r3 = r63;
    L44:
        th = move-exception;
        r02.mo3683r(EnumC1657a2.ERROR, "Taking screenshot using PixelCopy failed.", th);     // Catch: Throwable -> L55
    L55:
        th = move-exception;
        r43.quit();     // Catch: Throwable -> L48
        throw th;     // Catch: Throwable -> L48
    L48:
        th = move-exception;
        r02.mo3683r(EnumC1657a2.ERROR, "Taking screenshot failed.", th);
        goto L61
    L12:
        r12 = null;
    L64:
        return r14;
    }
}
