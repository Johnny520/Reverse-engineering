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

    /* JADX INFO: renamed from: l */
    public static final C2029a f6205l = null;

    /* JADX INFO: renamed from: m */
    public static volatile ConnectivityManager f6206m;

    /* JADX INFO: renamed from: n */
    public static final C2029a f6207n = null;

    /* JADX INFO: renamed from: o */
    public static final ArrayList f6208o = null;

    /* JADX INFO: renamed from: p */
    public static final int[] f6209p = null;

    /* JADX INFO: renamed from: q */
    public static final int[] f6210q = null;

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

    static {
        f6205l = new C2029a();
        f6207n = new C2029a();
        f6208o = new ArrayList();
        f6209p = new int[]{1, 0, 3, 2};
        f6210q = new int[2];
    }

    public C1714b(Context r4, C1666I r5, SentryAndroidOptions r6) {
        C1715c r0 = C1715c.f6222a;
        this.f6216f = new C2029a();
        this.f6220j = 0;
        this.f6221k = new AtomicBoolean(false);
        Context r1 = r4.getApplicationContext();
        if (r1 == null) goto L5;
        r4 = r1;
    L5:
        this.f6211a = r4;
        this.f6212b = r6;
        this.f6213c = r5;
        this.f6214d = r0;
        this.f6215e = new ArrayList();
        int[] r42 = f6210q;
        r42[0] = 12;
        r42[1] = 16;
        m3896r(new RunnableC1713a(this, 0));
        C1662E.f5959e.m3809d(this);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m3890i(Context r1, ILogger r2, C1666I r3, ConnectivityManager.NetworkCallback r4) {
        r3.getClass();
        if (AbstractC1856a.m4074u(r1) == true) goto L6;
        r2.mo3680e(EnumC1657a2.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
        return false;
    L6:
        C1981r r12 = f6207n.m4173a();
        f6208o.add(r4);     // Catch: Throwable -> L10
        r12.close();
        return true;
    L10:
        th = move-exception;
        r12.close();     // Catch: Throwable -> L13
    L15:
        throw th;
    L13:
        th = move-exception;
        th.addSuppressed(th);
        goto L15
    }

    /* JADX INFO: renamed from: o */
    public static String m3891o(NetworkCapabilities r1) {
        if (r1.hasTransport(3) == false) goto L7;
        return "ethernet";
    L7:
        if (r1.hasTransport(1) == false) goto L11;
        return "wifi";
    L11:
        if (r1.hasTransport(0) == false) goto L14;
        return "cellular";
    L14:
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static ConnectivityManager m3892q(Context r3, ILogger r4) {
        if (f6206m != null) goto L5;
        C1981r r0 = f6205l.m4173a();
    L12:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L22
    L24:
        throw th;
    L22:
        th = move-exception;
        th.addSuppressed(th);
        goto L24
    L8:
        if (f6206m == null) goto L14;
        ConnectivityManager r32 = f6206m;     // Catch: Throwable -> L12
        r0.close();
        return r32;
    L14:
        f6206m = (ConnectivityManager) r3.getSystemService("connectivity");     // Catch: Throwable -> L12
        if (f6206m != null) goto L17;
        r4.mo3680e(EnumC1657a2.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);     // Catch: Throwable -> L12
    L17:
        ConnectivityManager r33 = f6206m;     // Catch: Throwable -> L12
        r0.close();
        return r33;
    L5:
        return f6206m;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m3896r(new RunnableC1713a(this, 1));
    }

    @Override // io.sentry.android.core.InterfaceC1659B
    /* JADX INFO: renamed from: d */
    public final void mo3807d() {
        if (this.f6217g == null) goto L5;
        return;
    L5:
        m3896r(new RunnableC1713a(this, 3));
    }

    @Override // io.sentry.android.core.InterfaceC1659B
    /* JADX INFO: renamed from: f */
    public final void mo3808f() {
        if (this.f6217g != null) goto L5;
        return;
    L5:
        m3896r(new RunnableC1713a(this, 2));
    }

    @Override // io.sentry.InterfaceC1614O
    /* JADX INFO: renamed from: g */
    public final EnumC1606M mo3684g() {
        this.f6214d.getClass();
        if ((SystemClock.uptimeMillis() - this.f6220j) < 120000) goto L7;
        m3898t(null);
    L7:
        return m3894m();
    }

    @Override // io.sentry.InterfaceC1614O
    /* JADX INFO: renamed from: h */
    public final boolean mo3685h(InterfaceC1610N r3) {
        C1981r r0 = this.f6216f.m4173a();
        this.f6215e.add(r3);     // Catch: Throwable -> L10
        r0.close();
        m3893l();
        if (this.f6217g == null) goto L8;
        return true;
    L8:
        return false;
    L10:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L13
    L15:
        throw th;
    L13:
        th = move-exception;
        th.addSuppressed(th);
        goto L15
    }

    @Override // io.sentry.InterfaceC1614O
    /* JADX INFO: renamed from: k */
    public final String mo3686k() {
        this.f6214d.getClass();
        if ((SystemClock.uptimeMillis() - this.f6220j) < 120000) goto L7;
        m3898t(null);
    L7:
        return m3895p();
    }

    /* JADX INFO: renamed from: l */
    public final void m3893l() {
        if (AbstractC1665H.m3826d() == true) goto L6;
        return;
    L6:
        if (this.f6217g == null) goto L8;
        return;
    L8:
        C1981r r0 = this.f6216f.m4173a();
    L22:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L31
    L33:
        throw th;
    L31:
        th = move-exception;
        th.addSuppressed(th);
        goto L33
    L10:
        if (this.f6217g == null) goto L13;
        r0.close();
        return;
    L13:
        C2649vy r1 = new C2649vy(1, this);     // Catch: Throwable -> L22
        Context r2 = this.f6211a;     // Catch: Throwable -> L22
        ILogger r3 = this.f6212b.getLogger();     // Catch: Throwable -> L22
        this.f6213c.getClass();     // Catch: Throwable -> L22
        ConnectivityManager r4 = m3892q(r2, r3);     // Catch: Throwable -> L22
        if (r4 != null) goto L17;
    L26:
        this.f6212b.getLogger().mo3680e(EnumC1657a2.WARNING, "Failed to register network callback", new Object[0]);     // Catch: Throwable -> L22
    L27:
        r0.close();
        return;
    L17:
        if (AbstractC1856a.m4074u(r2) == true) goto L37;
        r3.mo3680e(EnumC1657a2.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);     // Catch: Throwable -> L22
        goto L26
    L37:
        r4.registerDefaultNetworkCallback(r1);     // Catch: Throwable -> L24
        this.f6217g = r1;     // Catch: Throwable -> L22
        this.f6212b.getLogger().mo3680e(EnumC1657a2.DEBUG, "Network callback registered successfully", new Object[0]);     // Catch: Throwable -> L22
        goto L27
    L24:
        th = move-exception;
        r3.mo3683r(EnumC1657a2.WARNING, "registerDefaultNetworkCallback failed", th);     // Catch: Throwable -> L22
        goto L26
    }

    /* JADX INFO: renamed from: m */
    public final EnumC1606M m3894m() {
        int r1 = 0;
        if (this.f6218h == null) goto L20;
        NetworkCapabilities r0 = this.f6218h;
        if (r0 == null) goto L19;
        boolean r2 = r0.hasCapability(12);
        this.f6213c.getClass();
        if (r2 == false) goto L19;
        if (r0.hasCapability(16) == false) goto L19;
        int[] r22 = f6209p;
        int r3 = r22.length;
    L12:
        if (r1 >= r3) goto L19;
        if (r0.hasTransport(r22[r1]) == true) goto L16;
        r1 = r1 + 1;
        goto L12
    L16:
        return EnumC1606M.CONNECTED;
    L19:
        return EnumC1606M.DISCONNECTED;
    L20:
        ConnectivityManager r02 = m3892q(this.f6211a, this.f6212b.getLogger());
        if (r02 == null) goto L41;
        Context r23 = this.f6211a;
        ILogger r32 = this.f6212b.getLogger();
        if (AbstractC1856a.m4074u(r23) == true) goto L42;
        r32.mo3680e(EnumC1657a2.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
        return EnumC1606M.NO_PERMISSION;
    L42:
        NetworkInfo r03 = r02.getActiveNetworkInfo();     // Catch: Throwable -> L30
        if (r03 != null) goto L33;
        r32.mo3680e(EnumC1657a2.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);     // Catch: Throwable -> L30
        return EnumC1606M.DISCONNECTED;
    L33:
        if (r03.isConnected() == false) goto L37;
        return EnumC1606M.CONNECTED;
    L37:
        return EnumC1606M.DISCONNECTED;
    L30:
        th = move-exception;
        r32.mo3683r(EnumC1657a2.WARNING, "Could not retrieve Connection Status", th);
        return EnumC1606M.UNKNOWN;
    L41:
        return EnumC1606M.UNKNOWN;
    }

    @Override // io.sentry.InterfaceC1614O
    /* JADX INFO: renamed from: n */
    public final void mo3687n(InterfaceC1610N r3) {
        C1981r r0 = this.f6216f.m4173a();
        this.f6215e.remove(r3);     // Catch: Throwable -> L6
        r0.close();
        return;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    /* JADX INFO: renamed from: p */
    public final String m3895p() {
        NetworkCapabilities r0 = this.f6218h;
        if (r0 != null) goto L5;
        Context r02 = this.f6211a;
        ILogger r1 = this.f6212b.getLogger();
        C1666I r2 = this.f6213c;
        ConnectivityManager r3 = m3892q(r02, r1);
        if (r3 != null) goto L10;
    L33:
        return null;
    L10:
        if (AbstractC1856a.m4074u(r02) == true) goto L36;
        r1.mo3680e(EnumC1657a2.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
        return null;
    L36:
        r2.getClass();     // Catch: Throwable -> L17
        Network r03 = r3.getActiveNetwork();     // Catch: Throwable -> L17
        if (r03 != null) goto L19;
        r1.mo3680e(EnumC1657a2.INFO, "Network is null and cannot check network status", new Object[0]);     // Catch: Throwable -> L17
        return null;
    L19:
        NetworkCapabilities r04 = r3.getNetworkCapabilities(r03);     // Catch: Throwable -> L17
        if (r04 != null) goto L23;
        r1.mo3680e(EnumC1657a2.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);     // Catch: Throwable -> L17
        return null;
    L23:
        boolean r22 = r04.hasTransport(3);     // Catch: Throwable -> L17
        boolean r32 = r04.hasTransport(1);     // Catch: Throwable -> L17
        boolean r05 = r04.hasTransport(0);     // Catch: Throwable -> L17
        if (r22 == false) goto L27;
        return "ethernet";
    L27:
        if (r32 == false) goto L30;
        return "wifi";
    L30:
        if (r05 == false) goto L33;
        return "cellular";
    L17:
        th = move-exception;
        r1.mo3683r(EnumC1657a2.ERROR, "Failed to retrieve network info", th);
        return null;
    L5:
        return m3891o(r0);
    }

    /* JADX INFO: renamed from: r */
    public final void m3896r(Runnable r4) {
        C2046v2 r0 = this.f6212b;
        r0.getExecutorService().submit(r4);     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        r0.getLogger().mo3683r(EnumC1657a2.ERROR, "AndroidConnectionStatusProvider submit failed", th);
    }

    /* JADX INFO: renamed from: s */
    public final void m3897s(boolean r6) {
        C1981r r0 = this.f6216f.m4173a();
        if (r6 == true) goto L28;
    L7:
        C2649vy r62 = this.f6217g;     // Catch: Throwable -> L5
        this.f6217g = null;     // Catch: Throwable -> L5
        if (r62 == null) goto L16;
        Context r2 = this.f6211a;     // Catch: Throwable -> L5
        ILogger r3 = this.f6212b.getLogger();     // Catch: Throwable -> L5
        ConnectivityManager r22 = m3892q(r2, r3);     // Catch: Throwable -> L5
        if (r22 == null) goto L16;
        r22.unregisterNetworkCallback(r62);     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        r3.mo3683r(EnumC1657a2.WARNING, "unregisterNetworkCallback failed", th);     // Catch: Throwable -> L5
    L5:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L21
    L23:
        throw th;
    L21:
        th = move-exception;
        th.addSuppressed(th);
    L16:
        this.f6218h = null;     // Catch: Throwable -> L5
        this.f6219i = null;     // Catch: Throwable -> L5
        this.f6220j = 0;     // Catch: Throwable -> L5
        r0.close();
        this.f6212b.getLogger().mo3680e(EnumC1657a2.DEBUG, "Network callback unregistered", new Object[0]);
        return;
    L28:
        this.f6215e.clear();     // Catch: Throwable -> L5
        goto L7
    }

    /* JADX INFO: renamed from: t */
    public final void m3898t(NetworkCapabilities r7) {
        C1981r r1 = this.f6216f.m4173a();
        if (r7 == null) goto L8;
        this.f6218h = r7;     // Catch: Throwable -> L5
    L20:
        this.f6214d.getClass();     // Catch: Throwable -> L5
        this.f6220j = SystemClock.uptimeMillis();     // Catch: Throwable -> L5
        this.f6212b.getLogger().mo3680e(EnumC1657a2.DEBUG, "Cache updated - Status: " + m3894m() + ", Type: " + m3895p(), new Object[0]);     // Catch: Throwable -> L5
    L23:
        r1.close();
        return;
    L8:
        if (AbstractC1856a.m4074u(this.f6211a) == true) goto L12;
        this.f6212b.getLogger().mo3680e(EnumC1657a2.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);     // Catch: Throwable -> L5
        this.f6218h = null;     // Catch: Throwable -> L5
        this.f6214d.getClass();     // Catch: Throwable -> L5
        this.f6220j = SystemClock.uptimeMillis();     // Catch: Throwable -> L5
        r1.close();
        return;
    L12:
        this.f6213c.getClass();     // Catch: Throwable -> L5
        ConnectivityManager r72 = m3892q(this.f6211a, this.f6212b.getLogger());     // Catch: Throwable -> L5
        if (r72 == null) goto L19;
        Network r4 = r72.getActiveNetwork();     // Catch: Throwable -> L5
        if (r4 == null) goto L17;
        NetworkCapabilities r73 = r72.getNetworkCapabilities(r4);     // Catch: Throwable -> L5
    L18:
        this.f6218h = r73;     // Catch: Throwable -> L5
        goto L20
    L17:
        r73 = null;
        goto L18
    L19:
        this.f6218h = null;     // Catch: Throwable -> L5
    L5:
        th = move-exception;
        this.f6212b.getLogger().mo3683r(EnumC1657a2.WARNING, "Failed to update connection status cache", th);     // Catch: Throwable -> L25
        this.f6218h = null;     // Catch: Throwable -> L25
        this.f6214d.getClass();     // Catch: Throwable -> L25
        this.f6220j = SystemClock.uptimeMillis();     // Catch: Throwable -> L25
    L25:
        th = move-exception;
        r1.close();     // Catch: Throwable -> L28
    L30:
        throw th;
    L28:
        th = move-exception;
        th.addSuppressed(th);
        goto L30
    }
}
