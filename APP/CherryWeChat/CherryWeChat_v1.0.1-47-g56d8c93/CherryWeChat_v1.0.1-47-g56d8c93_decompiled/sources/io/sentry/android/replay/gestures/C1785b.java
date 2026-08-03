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
    public final ArrayList f6487c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final C2029a f6488d = new C2029a();

    public C1785b(C2046v2 c2046v2, ReplayIntegration replayIntegration) {
        this.f6485a = c2046v2;
        this.f6486b = replayIntegration;
    }

    /* JADX INFO: renamed from: a */
    public final void m3969a() {
        ArrayList arrayList = this.f6487c;
        C1981r c1981rM4173a = this.f6488d.m4173a();
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null) {
                    m3970b(view);
                }
            }
            arrayList.clear();
            AbstractC0714Qj.m1489k(c1981rM4173a, null);
        } finally {
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3970b(View view) {
        Window windowM4071q = AbstractC1856a.m4071q(view);
        if (windowM4071q == null) {
            this.f6485a.getLogger().mo3680e(EnumC1657a2.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
            return;
        }
        Window.Callback callback = windowM4071q.getCallback();
        if (callback instanceof WindowCallbackC1784a) {
            windowM4071q.setCallback(((WindowCallbackC1784a) callback).f6482a);
        }
    }

    @Override // io.sentry.android.replay.InterfaceC1781e
    /* JADX INFO: renamed from: d */
    public final void mo3939d(View view, boolean z) {
        C1981r c1981rM4173a = this.f6488d.m4173a();
        ArrayList arrayList = this.f6487c;
        try {
            if (z) {
                arrayList.add(new WeakReference(view));
                C2046v2 c2046v2 = this.f6485a;
                Window windowM4071q = AbstractC1856a.m4071q(view);
                if (windowM4071q == null) {
                    c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);
                } else {
                    Window.Callback callback = windowM4071q.getCallback();
                    if (!(callback instanceof WindowCallbackC1784a)) {
                        windowM4071q.setCallback(new WindowCallbackC1784a(c2046v2, this.f6486b, callback));
                    }
                }
            } else {
                m3970b(view);
                AbstractC2711xa.m5283e0(arrayList, new C1757B(view, 1));
            }
            AbstractC0714Qj.m1489k(c1981rM4173a, null);
        } finally {
        }
    }
}
