package io.sentry.android.core.internal.util;

import android.view.PixelCopy;
import android.view.View;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.android.replay.ViewTreeObserverOnDrawListenerC1810v;
import io.sentry.android.replay.viewhierarchy.AbstractC1820f;
import io.sentry.config.AbstractC1856a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.RunnableC2260n3;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class PixelCopyOnPixelCopyFinishedListenerC1722j implements PixelCopy.OnPixelCopyFinishedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6245a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f6246b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f6247c;

    public /* synthetic */ PixelCopyOnPixelCopyFinishedListenerC1722j(int i, Object obj, Object obj2) {
        this.f6245a = i;
        this.f6246b = obj;
        this.f6247c = obj2;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        switch (this.f6245a) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f6246b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f6247c;
                atomicBoolean.set(i == 0);
                countDownLatch.countDown();
                break;
            default:
                ViewTreeObserverOnDrawListenerC1810v viewTreeObserverOnDrawListenerC1810v = (ViewTreeObserverOnDrawListenerC1810v) this.f6246b;
                AtomicBoolean atomicBoolean2 = viewTreeObserverOnDrawListenerC1810v.f6554n;
                C2046v2 c2046v2 = viewTreeObserverOnDrawListenerC1810v.f6542b;
                View view = (View) this.f6247c;
                if (i != 0) {
                    c2046v2.getLogger().mo3680e(EnumC1657a2.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i));
                    atomicBoolean2.set(false);
                } else if (!viewTreeObserverOnDrawListenerC1810v.f6552l.get()) {
                    AbstractC1820f abstractC1820fM4064j = AbstractC1856a.m4064j(view, null, c2046v2);
                    AbstractC1856a.m4053I(view, abstractC1820fM4064j, c2046v2);
                    AbstractC1856a.m4052H(viewTreeObserverOnDrawListenerC1810v.f6544d, c2046v2, "screenshot_recorder.mask", new RunnableC2260n3(viewTreeObserverOnDrawListenerC1810v, abstractC1820fM4064j, view, 28));
                } else {
                    c2046v2.getLogger().mo3680e(EnumC1657a2.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
                    atomicBoolean2.set(false);
                }
                break;
        }
    }
}
