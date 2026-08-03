package io.sentry.android.core.internal.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.SystemClock;
import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.EnumC1606M;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1610N;
import io.sentry.InterfaceC1614O;
import io.sentry.android.core.AbstractC1665H;
import io.sentry.android.core.C1662E;
import io.sentry.android.core.C1666I;
import io.sentry.android.core.InterfaceC1659B;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.config.AbstractC1856a;
import io.sentry.util.C2029a;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.C2649vy;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1714b implements InterfaceC1614O, InterfaceC1659B {

    /* JADX INFO: renamed from: m */
    public static volatile ConnectivityManager f6206m;

    /* JADX INFO: renamed from: a */
    public final Context f6211a;

    /* JADX INFO: renamed from: b */
    public final C2046v2 f6212b;

    /* JADX INFO: renamed from: c */
    public final C1666I f6213c;

    /* JADX INFO: renamed from: d */
    public final C1715c f6214d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f6215e;

    /* JADX INFO: renamed from: f */
    public final C2029a f6216f;

    /* JADX INFO: renamed from: g */
    public volatile C2649vy f6217g;

    /* JADX INFO: renamed from: h */
    public volatile NetworkCapabilities f6218h;

    /* JADX INFO: renamed from: i */
    public volatile Network f6219i;

    /* JADX INFO: renamed from: j */
    public volatile long f6220j;

    /* JADX INFO: renamed from: k */
    public final AtomicBoolean f6221k;

    /* JADX INFO: renamed from: l */
    public static final C2029a f6205l = new C2029a();

    /* JADX INFO: renamed from: n */
    public static final C2029a f6207n = new C2029a();

    /* JADX INFO: renamed from: o */
    public static final ArrayList f6208o = new ArrayList();

    /* JADX INFO: renamed from: p */
    public static final int[] f6209p = {1, 0, 3, 2};

    /* JADX INFO: renamed from: q */
    public static final int[] f6210q = new int[2];

    public C1714b(Context context, C1666I c1666i, SentryAndroidOptions sentryAndroidOptions) {
        C1715c c1715c = C1715c.f6222a;
        this.f6216f = new C2029a();
        this.f6220j = 0L;
        this.f6221k = new AtomicBoolean(false);
        Context applicationContext = context.getApplicationContext();
        this.f6211a = applicationContext != null ? applicationContext : context;
        this.f6212b = sentryAndroidOptions;
        this.f6213c = c1666i;
        this.f6214d = c1715c;
        this.f6215e = new ArrayList();
        int[] iArr = f6210q;
        iArr[0] = 12;
        iArr[1] = 16;
        m3896r(new RunnableC1713a(this, 0));
        C1662E.f5959e.m3809d(this);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m3890i(Context context, ILogger iLogger, C1666I c1666i, ConnectivityManager.NetworkCallback networkCallback) {
        c1666i.getClass();
        if (!AbstractC1856a.m4074u(context)) {
            iLogger.mo3680e(EnumC1657a2.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        C1981r c1981rM4173a = f6207n.m4173a();
        try {
            f6208o.add(networkCallback);
            c1981rM4173a.close();
            return true;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: o */
    public static String m3891o(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "cellular";
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static ConnectivityManager m3892q(Context context, ILogger iLogger) {
        if (f6206m != null) {
            return f6206m;
        }
        C1981r c1981rM4173a = f6205l.m4173a();
        try {
            if (f6206m != null) {
                ConnectivityManager connectivityManager = f6206m;
                c1981rM4173a.close();
                return connectivityManager;
            }
            f6206m = (ConnectivityManager) context.getSystemService("connectivity");
            if (f6206m == null) {
                iLogger.mo3680e(EnumC1657a2.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
            }
            ConnectivityManager connectivityManager2 = f6206m;
            c1981rM4173a.close();
            return connectivityManager2;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m3896r(new RunnableC1713a(this, 1));
    }

    @Override // io.sentry.android.core.InterfaceC1659B
    /* JADX INFO: renamed from: d */
    public final void mo3807d() {
        if (this.f6217g != null) {
            return;
        }
        m3896r(new RunnableC1713a(this, 3));
    }

    @Override // io.sentry.android.core.InterfaceC1659B
    /* JADX INFO: renamed from: f */
    public final void mo3808f() {
        if (this.f6217g == null) {
            return;
        }
        m3896r(new RunnableC1713a(this, 2));
    }

    @Override // io.sentry.InterfaceC1614O
    /* JADX INFO: renamed from: g */
    public final EnumC1606M mo3684g() {
        this.f6214d.getClass();
        if (SystemClock.uptimeMillis() - this.f6220j >= 120000) {
            m3898t(null);
        }
        return m3894m();
    }

    @Override // io.sentry.InterfaceC1614O
    /* JADX INFO: renamed from: h */
    public final boolean mo3685h(InterfaceC1610N interfaceC1610N) {
        C1981r c1981rM4173a = this.f6216f.m4173a();
        try {
            this.f6215e.add(interfaceC1610N);
            c1981rM4173a.close();
            m3893l();
            return this.f6217g != null;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.InterfaceC1614O
    /* JADX INFO: renamed from: k */
    public final String mo3686k() {
        this.f6214d.getClass();
        if (SystemClock.uptimeMillis() - this.f6220j >= 120000) {
            m3898t(null);
        }
        return m3895p();
    }

    /* JADX INFO: renamed from: l */
    public final void m3893l() {
        if (AbstractC1665H.m3826d() && this.f6217g == null) {
            C1981r c1981rM4173a = this.f6216f.m4173a();
            try {
                if (this.f6217g != null) {
                    c1981rM4173a.close();
                    return;
                }
                C2649vy c2649vy = new C2649vy(1, this);
                Context context = this.f6211a;
                ILogger logger = this.f6212b.getLogger();
                this.f6213c.getClass();
                ConnectivityManager connectivityManagerM3892q = m3892q(context, logger);
                if (connectivityManagerM3892q != null) {
                    if (AbstractC1856a.m4074u(context)) {
                        try {
                            connectivityManagerM3892q.registerDefaultNetworkCallback(c2649vy);
                            this.f6217g = c2649vy;
                            this.f6212b.getLogger().mo3680e(EnumC1657a2.DEBUG, "Network callback registered successfully", new Object[0]);
                        } catch (Throwable th) {
                            logger.mo3683r(EnumC1657a2.WARNING, "registerDefaultNetworkCallback failed", th);
                            this.f6212b.getLogger().mo3680e(EnumC1657a2.WARNING, "Failed to register network callback", new Object[0]);
                        }
                        c1981rM4173a.close();
                    }
                    logger.mo3680e(EnumC1657a2.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                }
                this.f6212b.getLogger().mo3680e(EnumC1657a2.WARNING, "Failed to register network callback", new Object[0]);
                c1981rM4173a.close();
            } catch (Throwable th2) {
                try {
                    c1981rM4173a.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final EnumC1606M m3894m() {
        if (this.f6218h != null) {
            NetworkCapabilities networkCapabilities = this.f6218h;
            if (networkCapabilities != null) {
                boolean zHasCapability = networkCapabilities.hasCapability(12);
                this.f6213c.getClass();
                if (zHasCapability && networkCapabilities.hasCapability(16)) {
                    for (int i : f6209p) {
                        if (networkCapabilities.hasTransport(i)) {
                            return EnumC1606M.CONNECTED;
                        }
                    }
                }
            }
            return EnumC1606M.DISCONNECTED;
        }
        ConnectivityManager connectivityManagerM3892q = m3892q(this.f6211a, this.f6212b.getLogger());
        if (connectivityManagerM3892q == null) {
            return EnumC1606M.UNKNOWN;
        }
        Context context = this.f6211a;
        ILogger logger = this.f6212b.getLogger();
        if (!AbstractC1856a.m4074u(context)) {
            logger.mo3680e(EnumC1657a2.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return EnumC1606M.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManagerM3892q.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected() ? EnumC1606M.CONNECTED : EnumC1606M.DISCONNECTED;
            }
            logger.mo3680e(EnumC1657a2.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
            return EnumC1606M.DISCONNECTED;
        } catch (Throwable th) {
            logger.mo3683r(EnumC1657a2.WARNING, "Could not retrieve Connection Status", th);
            return EnumC1606M.UNKNOWN;
        }
    }

    @Override // io.sentry.InterfaceC1614O
    /* JADX INFO: renamed from: n */
    public final void mo3687n(InterfaceC1610N interfaceC1610N) {
        C1981r c1981rM4173a = this.f6216f.m4173a();
        try {
            this.f6215e.remove(interfaceC1610N);
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

    /* JADX INFO: renamed from: p */
    public final String m3895p() {
        NetworkCapabilities networkCapabilities = this.f6218h;
        if (networkCapabilities != null) {
            return m3891o(networkCapabilities);
        }
        Context context = this.f6211a;
        ILogger logger = this.f6212b.getLogger();
        C1666I c1666i = this.f6213c;
        ConnectivityManager connectivityManagerM3892q = m3892q(context, logger);
        if (connectivityManagerM3892q != null) {
            if (!AbstractC1856a.m4074u(context)) {
                logger.mo3680e(EnumC1657a2.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                return null;
            }
            try {
                c1666i.getClass();
                Network activeNetwork = connectivityManagerM3892q.getActiveNetwork();
                if (activeNetwork == null) {
                    logger.mo3680e(EnumC1657a2.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities2 = connectivityManagerM3892q.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities2 == null) {
                    logger.mo3680e(EnumC1657a2.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean zHasTransport = networkCapabilities2.hasTransport(3);
                boolean zHasTransport2 = networkCapabilities2.hasTransport(1);
                boolean zHasTransport3 = networkCapabilities2.hasTransport(0);
                if (zHasTransport) {
                    return "ethernet";
                }
                if (zHasTransport2) {
                    return "wifi";
                }
                if (zHasTransport3) {
                    return "cellular";
                }
            } catch (Throwable th) {
                logger.mo3683r(EnumC1657a2.ERROR, "Failed to retrieve network info", th);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m3896r(Runnable runnable) {
        C2046v2 c2046v2 = this.f6212b;
        try {
            c2046v2.getExecutorService().submit(runnable);
        } catch (Throwable th) {
            c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "AndroidConnectionStatusProvider submit failed", th);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m3897s(boolean z) {
        C1981r c1981rM4173a = this.f6216f.m4173a();
        if (z) {
            try {
                this.f6215e.clear();
            } catch (Throwable th) {
                try {
                    c1981rM4173a.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C2649vy c2649vy = this.f6217g;
        this.f6217g = null;
        if (c2649vy != null) {
            Context context = this.f6211a;
            ILogger logger = this.f6212b.getLogger();
            ConnectivityManager connectivityManagerM3892q = m3892q(context, logger);
            if (connectivityManagerM3892q != null) {
                try {
                    connectivityManagerM3892q.unregisterNetworkCallback(c2649vy);
                } catch (Throwable th3) {
                    logger.mo3683r(EnumC1657a2.WARNING, "unregisterNetworkCallback failed", th3);
                }
            }
        }
        this.f6218h = null;
        this.f6219i = null;
        this.f6220j = 0L;
        c1981rM4173a.close();
        this.f6212b.getLogger().mo3680e(EnumC1657a2.DEBUG, "Network callback unregistered", new Object[0]);
    }

    /* JADX INFO: renamed from: t */
    public final void m3898t(NetworkCapabilities networkCapabilities) {
        C1981r c1981rM4173a = this.f6216f.m4173a();
        try {
            if (networkCapabilities != null) {
                this.f6218h = networkCapabilities;
            } else {
                if (!AbstractC1856a.m4074u(this.f6211a)) {
                    this.f6212b.getLogger().mo3680e(EnumC1657a2.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                    this.f6218h = null;
                    this.f6214d.getClass();
                    this.f6220j = SystemClock.uptimeMillis();
                    c1981rM4173a.close();
                    return;
                }
                this.f6213c.getClass();
                ConnectivityManager connectivityManagerM3892q = m3892q(this.f6211a, this.f6212b.getLogger());
                if (connectivityManagerM3892q != null) {
                    Network activeNetwork = connectivityManagerM3892q.getActiveNetwork();
                    this.f6218h = activeNetwork != null ? connectivityManagerM3892q.getNetworkCapabilities(activeNetwork) : null;
                } else {
                    this.f6218h = null;
                }
            }
            this.f6214d.getClass();
            this.f6220j = SystemClock.uptimeMillis();
            this.f6212b.getLogger().mo3680e(EnumC1657a2.DEBUG, "Cache updated - Status: " + m3894m() + ", Type: " + m3895p(), new Object[0]);
        } catch (Throwable th) {
            try {
                this.f6212b.getLogger().mo3683r(EnumC1657a2.WARNING, "Failed to update connection status cache", th);
                this.f6218h = null;
                this.f6214d.getClass();
                this.f6220j = SystemClock.uptimeMillis();
            } catch (Throwable th2) {
                try {
                    c1981rM4173a.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        c1981rM4173a.close();
    }
}
