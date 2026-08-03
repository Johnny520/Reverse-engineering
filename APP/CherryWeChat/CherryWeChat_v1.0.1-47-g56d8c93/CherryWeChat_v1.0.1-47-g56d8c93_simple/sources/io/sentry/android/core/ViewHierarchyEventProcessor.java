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

    public ViewHierarchyEventProcessor(SentryAndroidOptions r5) {
        AbstractC1856a.m4048D("SentryAndroidOptions is required", r5);
        this.f6055a = r5;
        this.f6056b = new C1718f(3, 2000);
        if (r5.isAttachViewHierarchy() == false) goto L6;
        AbstractC1856a.m4055a("ViewHierarchy");
        return;
    }

    /* JADX INFO: renamed from: a */
    public static void m3860a(View r5, C1950G r6, List r7) {
        if ((r5 instanceof ViewGroup) == false) goto L23;
        Iterator r0 = r7.iterator();
        if (r0.hasNext() == true) goto L18;
        ViewGroup r52 = (ViewGroup) r5;
        int r02 = r52.getChildCount();
        if (r02 != 0) goto L10;
        return;
    L10:
        ArrayList r1 = new ArrayList(r02);
        int r2 = 0;
    L11:
        if (r2 >= r02) goto L16;
        View r3 = r52.getChildAt(r2);
        if (r3 == null) goto L15;
        C1950G r4 = m3861b(r3);
        r1.add(r4);
        m3860a(r3, r4, r7);
    L15:
        r2 = r2 + 1;
        goto L11
    L16:
        r6.f6870k = r1;
        return;
    L18:
        r0.next().getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: b */
    public static C1950G m3861b(View r3) {
        C1950G r0 = new C1950G();
        r0.f6861b = AbstractC1856a.m4066l(r3);
        r0.f6862c = AbstractC1709h.m3885b(r3);     // Catch: Throwable -> L15
    L4:
        r0.f6866g = Double.valueOf(r3.getX());
        r0.f6867h = Double.valueOf(r3.getY());
        r0.f6864e = Double.valueOf(r3.getWidth());
        r0.f6865f = Double.valueOf(r3.getHeight());
        r0.f6869j = Double.valueOf(r3.getAlpha());
        int r32 = r3.getVisibility();
        if (r32 != 0) goto L7;
        r0.f6868i = "visible";
    L14:
        return r0;
    L7:
        if (r32 != 4) goto L9;
        r0.f6868i = "invisible";
        goto L14
    L9:
        if (r32 != 8) goto L14;
        r0.f6868i = "gone";
        goto L14
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: f */
    public final C1944A mo3584f(C1944A r1, C1586H r2) {
        return r1;
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: i */
    public final C1627R1 mo3585i(C1627R1 r11, C1586H r12) {
        if (r11.m3739d() == false) goto L39;
        SentryAndroidOptions r0 = this.f6055a;
        if (r0.isAttachViewHierarchy() == true) goto L10;
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
        return r11;
    L10:
        if (AbstractC1856a.m4076w(r12) == true) goto L39;
        boolean r1 = this.f6056b.m3904a();
        r0.getBeforeViewHierarchyCaptureCallback();
        if (r1 == true) goto L39;
        WeakReference r13 = (WeakReference) C1666I.f5973b.f5974a;
        C1949F r3 = null;
        if (r13 == null) goto L18;
        Activity r14 = (Activity) r13.get();
    L19:
        final List<Object> r7 = r0.getViewHierarchyExporters();
        InterfaceC2040a r4 = r0.getThreadChecker();
        final ILogger r9 = r0.getLogger();
        if (r14 != null) goto L22;
        r9.mo3680e(EnumC1657a2.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
    L37:
        if (r3 == null) goto L39;
        r12.f5733e = new C1654a(r3);
        goto L39
    L22:
        Window r02 = r14.getWindow();
        if (r02 != null) goto L25;
        r9.mo3680e(EnumC1657a2.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
        goto L37
    L25:
        final View r6 = r02.peekDecorView();
        if (r6 != null) goto L41;
        r9.mo3680e(EnumC1657a2.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
        goto L37
    L41:
    L35:
        th = move-exception;
        r9.mo3683r(EnumC1657a2.ERROR, "Failed to process view hierarchy.", th);
        goto L37
    L29:
        if (r4.mo3902c() == false) goto L31;
        ArrayList r03 = new ArrayList(1);     // Catch: Throwable -> L35
        C1949F r15 = new C1949F("android_view_system", r03);     // Catch: Throwable -> L35
        C1950G r2 = m3861b(r6);     // Catch: Throwable -> L35
        r03.add(r2);     // Catch: Throwable -> L35
        m3860a(r6, r2, r7);     // Catch: Throwable -> L35
        r3 = r15;
    L40:
        goto L37
    L31:
        final CountDownLatch r8 = new CountDownLatch(1);     // Catch: Throwable -> L35
        final AtomicReference r5 = new AtomicReference(null);     // Catch: Throwable -> L35
        r14.runOnUiThread(new RunnableC1701i0(r5, r6, r7, r8, r9));     // Catch: Throwable -> L35
        if (r8.await(1000, TimeUnit.MILLISECONDS) == false) goto L40;
        r3 = (C1949F) r5.get();     // Catch: Throwable -> L35
        goto L40
    L18:
        r14 = null;
    L39:
        return r11;
    }
}
