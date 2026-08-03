package io.sentry.android.replay.gestures;

import android.view.View;
import android.view.Window;
import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.android.replay.C1757B;
import io.sentry.android.replay.InterfaceC1781e;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.config.AbstractC1856a;
import io.sentry.util.C2029a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p000.AbstractC0714Qj;
import p000.AbstractC2711xa;

/* JADX INFO: renamed from: io.sentry.android.replay.gestures.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1785b implements InterfaceC1781e {

    /* JADX INFO: renamed from: a */
    public final C2046v2 f6485a;

    /* JADX INFO: renamed from: b */
    public final ReplayIntegration f6486b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f6487c;

    /* JADX INFO: renamed from: d */
    public final C2029a f6488d;

    public C1785b(C2046v2 r1, ReplayIntegration r2) {
        this.f6485a = r1;
        this.f6486b = r2;
        this.f6487c = new ArrayList();
        this.f6488d = new C2029a();
    }

    /* JADX INFO: renamed from: a */
    public final void m3969a() {
        ArrayList r0 = this.f6487c;
        C1981r r1 = this.f6488d.m4173a();
        Iterator r2 = r0.iterator();     // Catch: Throwable -> L9
    L5:
        if (r2.hasNext() == false) goto L11;
        View r3 = (View) ((WeakReference) r2.next()).get();     // Catch: Throwable -> L9
        if (r3 == null) goto L5;
        m3970b(r3);     // Catch: Throwable -> L9
        goto L5
    L11:
        r0.clear();     // Catch: Throwable -> L9
        AbstractC0714Qj.m1489k(r1, null);
        return;
    L9:
        th = move-exception;
        throw th;     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        AbstractC0714Qj.m1489k(r1, th);
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public final void m3970b(View r4) {
        Window r42 = AbstractC1856a.m4071q(r4);
        if (r42 != null) goto L6;
        this.f6485a.getLogger().mo3680e(EnumC1657a2.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
        return;
    L6:
        Window.Callback r0 = r42.getCallback();
        if ((r0 instanceof WindowCallbackC1784a) == false) goto L10;
        r42.setCallback(((WindowCallbackC1784a) r0).f6482a);
        return;
    }

    @Override // io.sentry.android.replay.InterfaceC1781e
    /* JADX INFO: renamed from: d */
    public final void mo3939d(View r5, boolean r6) {
        C1981r r0 = this.f6488d.m4173a();
        ArrayList r1 = this.f6487c;
        if (r6 == false) goto L12;
        r1.add(new WeakReference(r5));     // Catch: Throwable -> L10
        C2046v2 r62 = this.f6485a;     // Catch: Throwable -> L10
        Window r52 = AbstractC1856a.m4071q(r5);     // Catch: Throwable -> L10
        if (r52 != null) goto L7;
        r62.getLogger().mo3680e(EnumC1657a2.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);     // Catch: Throwable -> L10
    L13:
        AbstractC0714Qj.m1489k(r0, null);
        return;
    L7:
        Window.Callback r12 = r52.getCallback();     // Catch: Throwable -> L10
        if ((r12 instanceof WindowCallbackC1784a) == true) goto L13;
        r52.setCallback(new WindowCallbackC1784a(r62, this.f6486b, r12));     // Catch: Throwable -> L10
        goto L13
    L12:
        m3970b(r5);     // Catch: Throwable -> L10
        AbstractC2711xa.m5283e0(r1, new C1757B(r5, 1));     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        throw th;     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        AbstractC0714Qj.m1489k(r0, th);
        throw th;
    }
}
