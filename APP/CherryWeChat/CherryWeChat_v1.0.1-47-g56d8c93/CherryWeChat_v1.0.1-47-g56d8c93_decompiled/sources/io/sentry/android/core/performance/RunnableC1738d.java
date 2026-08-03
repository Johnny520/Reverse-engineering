package io.sentry.android.core.performance;

import android.os.Handler;
import android.os.Looper;
import io.sentry.android.core.C1696g;
import io.sentry.android.core.C1744r;

/* JADX INFO: renamed from: io.sentry.android.core.performance.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1738d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6301a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1740f f6302b;

    public /* synthetic */ RunnableC1738d(C1740f c1740f, int i) {
        this.f6301a = i;
        this.f6302b = c1740f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6301a) {
            case 0:
                new Handler(Looper.getMainLooper()).post(new RunnableC1738d(this.f6302b, 3));
                break;
            case 1:
                this.f6302b.m3916c();
                break;
            case 2:
                this.f6302b.m3916c();
                break;
            default:
                C1740f c1740f = this.f6302b;
                if (c1740f.f6318m.get() == 0) {
                    c1740f.f6307b = false;
                    C1744r c1744r = c1740f.f6313h;
                    if (c1744r != null && c1744r.isRunning()) {
                        c1740f.f6313h.close();
                        c1740f.f6313h = null;
                    }
                    C1696g c1696g = c1740f.f6314i;
                    if (c1696g != null && c1696g.f6128i) {
                        c1696g.mo3690a(true);
                        c1740f.f6314i = null;
                        break;
                    }
                }
                break;
        }
    }
}
