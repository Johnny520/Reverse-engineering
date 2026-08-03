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

    public /* synthetic */ PixelCopyOnPixelCopyFinishedListenerC1722j(int r1, Object r2, Object r3) {
        this.f6245a = r1;
        this.f6246b = r2;
        this.f6247c = r3;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int r7) {
        switch(this.f6245a) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        ViewTreeObserverOnDrawListenerC1810v r0 = (ViewTreeObserverOnDrawListenerC1810v) this.f6246b;
        AtomicBoolean r1 = r0.f6554n;
        C2046v2 r2 = r0.f6542b;
        View r3 = (View) this.f6247c;
        if (r7 == 0) goto L8;
        r2.getLogger().mo3680e(EnumC1657a2.INFO, "Failed to capture replay recording: %d", new Object[]{Integer.valueOf(r7)});
        r1.set(false);
        return;
    L8:
        if (r0.f6552l.get() == false) goto L10;
        r2.getLogger().mo3680e(EnumC1657a2.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
        r1.set(false);
        return;
    L10:
        AbstractC1820f r72 = AbstractC1856a.m4064j(r3, null, r2);
        AbstractC1856a.m4053I(r3, r72, r2);
        AbstractC1856a.m4052H(r0.f6544d, r2, "screenshot_recorder.mask", new RunnableC2260n3(r0, r72, r3, 28));
        return;
    L12:
        AtomicBoolean r02 = (AtomicBoolean) this.f6246b;
        CountDownLatch r12 = (CountDownLatch) this.f6247c;
        if (r7 != 0) goto L15;
        boolean r73 = true;
    L16:
        r02.set(r73);
        r12.countDown();
        return;
    L15:
        r73 = false;
        goto L16
    }
}
