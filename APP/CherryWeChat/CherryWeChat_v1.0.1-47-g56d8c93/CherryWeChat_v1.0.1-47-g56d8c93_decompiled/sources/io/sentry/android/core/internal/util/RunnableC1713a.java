package io.sentry.android.core.internal.util;

import android.net.ConnectivityManager;
import io.sentry.C1981r;
import io.sentry.EnumC1606M;
import io.sentry.InterfaceC1610N;
import io.sentry.android.core.C1662E;
import java.util.Iterator;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1713a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6203a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1714b f6204b;

    public /* synthetic */ RunnableC1713a(C1714b c1714b, int i) {
        this.f6203a = i;
        this.f6204b = c1714b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1981r c1981rM4173a;
        switch (this.f6203a) {
            case 0:
                this.f6204b.m3893l();
                return;
            case 1:
                C1714b c1714b = this.f6204b;
                c1714b.m3897s(true);
                C1981r c1981rM4173a2 = C1714b.f6207n.m4173a();
                try {
                    C1714b.f6208o.clear();
                    c1981rM4173a2.close();
                    c1981rM4173a = C1714b.f6205l.m4173a();
                    try {
                        C1714b.f6206m = null;
                        c1981rM4173a.close();
                        C1662E.f5959e.m3812l(c1714b);
                        return;
                    } finally {
                        try {
                            c1981rM4173a.close();
                            break;
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                } finally {
                    try {
                        c1981rM4173a2.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            case 2:
                this.f6204b.m3897s(false);
                return;
            default:
                C1714b c1714b2 = this.f6204b;
                c1714b2.m3898t(null);
                EnumC1606M enumC1606MM3894m = c1714b2.m3894m();
                if (enumC1606MM3894m == EnumC1606M.DISCONNECTED) {
                    c1714b2.f6221k.set(false);
                    c1981rM4173a = C1714b.f6207n.m4173a();
                    try {
                        Iterator it = C1714b.f6208o.iterator();
                        while (it.hasNext()) {
                            ((ConnectivityManager.NetworkCallback) it.next()).onLost(null);
                            break;
                        }
                        c1981rM4173a.close();
                    } finally {
                        try {
                            break;
                        } catch (Throwable th3) {
                        }
                    }
                }
                C1981r c1981rM4173a3 = c1714b2.f6216f.m4173a();
                try {
                    Iterator it2 = c1714b2.f6215e.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1610N) it2.next()).mo3725i(enumC1606MM3894m);
                        break;
                    }
                    c1981rM4173a3.close();
                    c1714b2.m3893l();
                    return;
                } finally {
                    try {
                        break;
                    } catch (Throwable th4) {
                    }
                }
        }
    }
}
