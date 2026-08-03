package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.view.Window;
import io.sentry.EnumC1657a2;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.k */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1723k implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6248a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1727o f6249b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Window f6250c;

    public /* synthetic */ RunnableC1723k(C1727o c1727o, Window window, int i) {
        this.f6248a = i;
        this.f6249b = c1727o;
        this.f6250c = window;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6248a) {
            case 0:
                C1727o c1727o = this.f6249b;
                CopyOnWriteArraySet copyOnWriteArraySet = c1727o.f6258b;
                Window window = this.f6250c;
                if (copyOnWriteArraySet.add(window)) {
                    try {
                        C1715c c1715c = c1727o.f6264h;
                        WindowOnFrameMetricsAvailableListenerC1725m windowOnFrameMetricsAvailableListenerC1725m = c1727o.f6265i;
                        Handler handler = c1727o.f6260d;
                        c1715c.getClass();
                        if (windowOnFrameMetricsAvailableListenerC1725m != null) {
                            window.addOnFrameMetricsAvailableListener(windowOnFrameMetricsAvailableListenerC1725m, handler);
                        }
                    } catch (Throwable th) {
                        c1727o.f6259c.mo3683r(EnumC1657a2.ERROR, "Failed to add frameMetricsAvailableListener", th);
                        return;
                    }
                }
                break;
            default:
                C1727o c1727o2 = this.f6249b;
                Window window2 = this.f6250c;
                try {
                    if (c1727o2.f6258b.remove(window2)) {
                        C1715c c1715c2 = c1727o2.f6264h;
                        WindowOnFrameMetricsAvailableListenerC1725m windowOnFrameMetricsAvailableListenerC1725m2 = c1727o2.f6265i;
                        c1715c2.getClass();
                        if (windowOnFrameMetricsAvailableListenerC1725m2 != null) {
                            window2.removeOnFrameMetricsAvailableListener(windowOnFrameMetricsAvailableListenerC1725m2);
                        }
                    }
                } catch (Throwable th2) {
                    c1727o2.f6259c.mo3683r(EnumC1657a2.ERROR, "Failed to remove frameMetricsAvailableListener", th2);
                }
                break;
        }
    }
}
