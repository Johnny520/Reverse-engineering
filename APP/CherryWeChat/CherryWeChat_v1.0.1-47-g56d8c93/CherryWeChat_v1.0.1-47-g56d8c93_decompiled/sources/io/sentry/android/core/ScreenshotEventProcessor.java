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

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, C1666I c1666i) {
        AbstractC1856a.m4048D("SentryAndroidOptions is required", sentryAndroidOptions);
        this.f6009a = sentryAndroidOptions;
        this.f6010b = c1666i;
        this.f6011c = new C1718f(3, 2000L);
        if (sentryAndroidOptions.isAttachScreenshot()) {
            AbstractC1856a.m4055a("Screenshot");
        }
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: f */
    public final C1944A mo3584f(C1944A c1944a, C1586H c1586h) {
        return c1944a;
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: i */
    public final C1627R1 mo3585i(C1627R1 c1627r1, C1586H c1586h) {
        if (c1627r1.m3739d()) {
            SentryAndroidOptions sentryAndroidOptions = this.f6009a;
            boolean z = false;
            if (!sentryAndroidOptions.isAttachScreenshot()) {
                sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, "attachScreenshot is disabled.", new Object[0]);
                return c1627r1;
            }
            WeakReference weakReference = (WeakReference) C1666I.f5973b.f5974a;
            Bitmap bitmap = null;
            Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
            if (activity != null && !AbstractC1856a.m4076w(c1586h)) {
                boolean zM3904a = this.f6011c.m3904a();
                sentryAndroidOptions.getBeforeScreenshotCaptureCallback();
                if (!zM3904a) {
                    sentryAndroidOptions.getThreadChecker();
                    ILogger logger = sentryAndroidOptions.getLogger();
                    C1666I c1666i = this.f6010b;
                    if (activity.isFinishing() || activity.isDestroyed()) {
                        logger.mo3680e(EnumC1657a2.DEBUG, "Activity isn't valid, not taking screenshot.", new Object[0]);
                    } else {
                        Window window = activity.getWindow();
                        if (window == null) {
                            logger.mo3680e(EnumC1657a2.DEBUG, "Activity window is null, not taking screenshot.", new Object[0]);
                        } else {
                            View viewPeekDecorView = window.peekDecorView();
                            if (viewPeekDecorView == null) {
                                logger.mo3680e(EnumC1657a2.DEBUG, "DecorView is null, not taking screenshot.", new Object[0]);
                            } else {
                                View rootView = viewPeekDecorView.getRootView();
                                if (rootView == null) {
                                    logger.mo3680e(EnumC1657a2.DEBUG, "Root view is null, not taking screenshot.", new Object[0]);
                                } else if (rootView.getWidth() <= 0 || rootView.getHeight() <= 0) {
                                    logger.mo3680e(EnumC1657a2.DEBUG, "View's width and height is zeroed, not taking screenshot.", new Object[0]);
                                } else {
                                    try {
                                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
                                        CountDownLatch countDownLatch = new CountDownLatch(1);
                                        c1666i.getClass();
                                        HandlerThread handlerThread = new HandlerThread("SentryScreenshot");
                                        handlerThread.start();
                                        try {
                                            Handler handler = new Handler(handlerThread.getLooper());
                                            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                                            PixelCopy.request(window, bitmapCreateBitmap, new PixelCopyOnPixelCopyFinishedListenerC1722j(0, atomicBoolean, countDownLatch), handler);
                                            if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                                if (atomicBoolean.get()) {
                                                    z = true;
                                                }
                                            }
                                        } finally {
                                            try {
                                            } finally {
                                            }
                                        }
                                        if (z) {
                                            bitmap = bitmapCreateBitmap;
                                        }
                                    } catch (Throwable th) {
                                        logger.mo3683r(EnumC1657a2.ERROR, "Taking screenshot failed.", th);
                                    }
                                }
                            }
                        }
                    }
                    if (bitmap != null) {
                        c1586h.f5732d = new C1654a(new CallableC1600K1(5, this, bitmap));
                        c1586h.m3668c("android:activity", activity);
                    }
                }
            }
        }
        return c1627r1;
    }
}
