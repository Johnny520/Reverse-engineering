package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import io.sentry.C1586H;
import io.sentry.C1627R1;
import io.sentry.C1654a;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1566C;
import io.sentry.android.core.internal.gestures.AbstractC1709h;
import io.sentry.android.core.internal.util.C1718f;
import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1944A;
import io.sentry.protocol.C1949F;
import io.sentry.protocol.C1950G;
import io.sentry.util.thread.InterfaceC2040a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ViewHierarchyEventProcessor implements InterfaceC1566C {

    /* JADX INFO: renamed from: a */
    public final SentryAndroidOptions f6055a;

    /* JADX INFO: renamed from: b */
    public final C1718f f6056b;

    public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
        AbstractC1856a.m4048D("SentryAndroidOptions is required", sentryAndroidOptions);
        this.f6055a = sentryAndroidOptions;
        this.f6056b = new C1718f(3, 2000L);
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            AbstractC1856a.m4055a("ViewHierarchy");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3860a(View view, C1950G c1950g, List list) {
        if (view instanceof ViewGroup) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    C1950G c1950gM3861b = m3861b(childAt);
                    arrayList.add(c1950gM3861b);
                    m3860a(childAt, c1950gM3861b, list);
                }
            }
            c1950g.f6870k = arrayList;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C1950G m3861b(View view) {
        C1950G c1950g = new C1950G();
        c1950g.f6861b = AbstractC1856a.m4066l(view);
        try {
            c1950g.f6862c = AbstractC1709h.m3885b(view);
        } catch (Throwable unused) {
        }
        c1950g.f6866g = Double.valueOf(view.getX());
        c1950g.f6867h = Double.valueOf(view.getY());
        c1950g.f6864e = Double.valueOf(view.getWidth());
        c1950g.f6865f = Double.valueOf(view.getHeight());
        c1950g.f6869j = Double.valueOf(view.getAlpha());
        int visibility = view.getVisibility();
        if (visibility == 0) {
            c1950g.f6868i = "visible";
        } else if (visibility == 4) {
            c1950g.f6868i = "invisible";
        } else if (visibility == 8) {
            c1950g.f6868i = "gone";
        }
        return c1950g;
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
            SentryAndroidOptions sentryAndroidOptions = this.f6055a;
            if (!sentryAndroidOptions.isAttachViewHierarchy()) {
                sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
                return c1627r1;
            }
            if (!AbstractC1856a.m4076w(c1586h)) {
                boolean zM3904a = this.f6056b.m3904a();
                sentryAndroidOptions.getBeforeViewHierarchyCaptureCallback();
                if (!zM3904a) {
                    WeakReference weakReference = (WeakReference) C1666I.f5973b.f5974a;
                    C1949F c1949f = null;
                    Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                    final List<Object> viewHierarchyExporters = sentryAndroidOptions.getViewHierarchyExporters();
                    InterfaceC2040a threadChecker = sentryAndroidOptions.getThreadChecker();
                    final ILogger logger = sentryAndroidOptions.getLogger();
                    if (activity == null) {
                        logger.mo3680e(EnumC1657a2.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
                    } else {
                        Window window = activity.getWindow();
                        if (window == null) {
                            logger.mo3680e(EnumC1657a2.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
                        } else {
                            final View viewPeekDecorView = window.peekDecorView();
                            if (viewPeekDecorView == null) {
                                logger.mo3680e(EnumC1657a2.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
                            } else {
                                try {
                                    if (threadChecker.mo3902c()) {
                                        ArrayList arrayList = new ArrayList(1);
                                        C1949F c1949f2 = new C1949F("android_view_system", arrayList);
                                        C1950G c1950gM3861b = m3861b(viewPeekDecorView);
                                        arrayList.add(c1950gM3861b);
                                        m3860a(viewPeekDecorView, c1950gM3861b, viewHierarchyExporters);
                                        c1949f = c1949f2;
                                    } else {
                                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                                        final AtomicReference atomicReference = new AtomicReference(null);
                                        activity.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.i0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                AtomicReference atomicReference2 = atomicReference;
                                                View view = viewPeekDecorView;
                                                List list = viewHierarchyExporters;
                                                CountDownLatch countDownLatch2 = countDownLatch;
                                                try {
                                                    ArrayList arrayList2 = new ArrayList(1);
                                                    C1949F c1949f3 = new C1949F("android_view_system", arrayList2);
                                                    C1950G c1950gM3861b2 = ViewHierarchyEventProcessor.m3861b(view);
                                                    arrayList2.add(c1950gM3861b2);
                                                    ViewHierarchyEventProcessor.m3860a(view, c1950gM3861b2, list);
                                                    atomicReference2.set(c1949f3);
                                                    countDownLatch2.countDown();
                                                } catch (Throwable th) {
                                                    logger.mo3683r(EnumC1657a2.ERROR, "Failed to process view hierarchy.", th);
                                                }
                                            }
                                        });
                                        if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                            c1949f = (C1949F) atomicReference.get();
                                        }
                                    }
                                } catch (Throwable th) {
                                    logger.mo3683r(EnumC1657a2.ERROR, "Failed to process view hierarchy.", th);
                                }
                            }
                        }
                    }
                    if (c1949f != null) {
                        c1586h.f5733e = new C1654a(c1949f);
                    }
                }
            }
        }
        return c1627r1;
    }
}
