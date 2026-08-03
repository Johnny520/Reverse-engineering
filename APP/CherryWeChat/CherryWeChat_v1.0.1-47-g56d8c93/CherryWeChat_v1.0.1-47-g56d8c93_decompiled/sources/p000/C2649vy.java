package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.SystemClock;
import io.sentry.C1981r;
import io.sentry.EnumC1606M;
import io.sentry.EnumC1657a2;
import io.sentry.InterfaceC1610N;
import io.sentry.android.core.internal.util.C1714b;
import java.util.Iterator;

/* JADX INFO: renamed from: vy */
/* JADX INFO: loaded from: classes.dex */
public final class C2649vy extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9167a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9168b;

    public /* synthetic */ C2649vy(int i, Object obj) {
        this.f9167a = i;
        this.f9168b = obj;
    }

    /* JADX INFO: renamed from: a */
    public void m5183a() {
        ((C1714b) this.f9168b).f6221k.set(false);
        C1981r c1981rM4173a = ((C1714b) this.f9168b).f6216f.m4173a();
        try {
            ((C1714b) this.f9168b).f6218h = null;
            ((C1714b) this.f9168b).f6219i = null;
            C1714b c1714b = (C1714b) this.f9168b;
            c1714b.f6214d.getClass();
            c1714b.f6220j = SystemClock.uptimeMillis();
            ((C1714b) this.f9168b).f6212b.getLogger().mo3680e(EnumC1657a2.DEBUG, "Cache cleared - network lost/unavailable", new Object[0]);
            Iterator it = ((C1714b) this.f9168b).f6215e.iterator();
            while (it.hasNext()) {
                ((InterfaceC1610N) it.next()).mo3725i(EnumC1606M.DISCONNECTED);
            }
            c1981rM4173a.close();
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        switch (this.f9167a) {
            case 0:
                AbstractC2622vD.m5135f().post(new RunnableC0778S4(this, true));
                return;
            default:
                ((C1714b) this.f9168b).f6219i = network;
                if (((C1714b) this.f9168b).f6221k.getAndSet(true)) {
                    return;
                }
                C1981r c1981rM4173a = C1714b.f6207n.m4173a();
                try {
                    Iterator it = C1714b.f6208o.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onAvailable(network);
                        break;
                    }
                    c1981rM4173a.close();
                    return;
                } catch (Throwable th) {
                    try {
                        c1981rM4173a.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0083 A[Catch: all -> 0x008d, LOOP:3: B:35:0x007d->B:37:0x0083, LOOP_END, TRY_LEAVE, TryCatch #3 {all -> 0x008d, blocks: (B:34:0x0073, B:35:0x007d, B:37:0x0083), top: B:69:0x0073 }] */
    @Override // android.net.ConnectivityManager.NetworkCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        C1981r c1981rM4173a;
        Iterator it;
        switch (this.f9167a) {
            case 1:
                if (network.equals(((C1714b) this.f9168b).f6219i)) {
                    NetworkCapabilities networkCapabilities2 = ((C1714b) this.f9168b).f6218h;
                    if ((networkCapabilities2 == null) != (networkCapabilities == null)) {
                        ((C1714b) this.f9168b).m3898t(networkCapabilities);
                        EnumC1606M enumC1606MM3894m = ((C1714b) this.f9168b).m3894m();
                        c1981rM4173a = ((C1714b) this.f9168b).f6216f.m4173a();
                        it = ((C1714b) this.f9168b).f6215e.iterator();
                        while (it.hasNext()) {
                            break;
                        }
                        c1981rM4173a.close();
                    } else if (networkCapabilities2 != null || networkCapabilities != null) {
                        int[] iArr = C1714b.f6210q;
                        int length = iArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                for (int i2 : C1714b.f6209p) {
                                    if (networkCapabilities2.hasTransport(i2) == networkCapabilities.hasTransport(i2)) {
                                    }
                                }
                            } else {
                                int i3 = iArr[i];
                                if (i3 == 0 || networkCapabilities2.hasCapability(i3) == networkCapabilities.hasCapability(i3)) {
                                    i++;
                                }
                            }
                        }
                        ((C1714b) this.f9168b).m3898t(networkCapabilities);
                        EnumC1606M enumC1606MM3894m2 = ((C1714b) this.f9168b).m3894m();
                        c1981rM4173a = ((C1714b) this.f9168b).f6216f.m4173a();
                        try {
                            it = ((C1714b) this.f9168b).f6215e.iterator();
                            while (it.hasNext()) {
                                ((InterfaceC1610N) it.next()).mo3725i(enumC1606MM3894m2);
                                break;
                            }
                            c1981rM4173a.close();
                        } finally {
                            try {
                                break;
                            } catch (Throwable th) {
                            }
                        }
                    }
                    c1981rM4173a = C1714b.f6207n.m4173a();
                    try {
                        Iterator it2 = C1714b.f6208o.iterator();
                        while (it2.hasNext()) {
                            ((ConnectivityManager.NetworkCallback) it2.next()).onCapabilitiesChanged(network, networkCapabilities);
                            break;
                        }
                        c1981rM4173a.close();
                        return;
                    } finally {
                        try {
                            break;
                        } catch (Throwable th2) {
                        }
                    }
                }
                return;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f9167a) {
            case 0:
                AbstractC2622vD.m5135f().post(new RunnableC0778S4(this, false));
                return;
            default:
                if (network.equals(((C1714b) this.f9168b).f6219i)) {
                    m5183a();
                    C1981r c1981rM4173a = C1714b.f6207n.m4173a();
                    try {
                        Iterator it = C1714b.f6208o.iterator();
                        while (it.hasNext()) {
                            ((ConnectivityManager.NetworkCallback) it.next()).onLost(network);
                            break;
                        }
                        c1981rM4173a.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            c1981rM4173a.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        switch (this.f9167a) {
            case 1:
                m5183a();
                C1981r c1981rM4173a = C1714b.f6207n.m4173a();
                try {
                    Iterator it = C1714b.f6208o.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onUnavailable();
                        break;
                    }
                    c1981rM4173a.close();
                    return;
                } catch (Throwable th) {
                    try {
                        c1981rM4173a.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                super.onUnavailable();
                return;
        }
    }
}
