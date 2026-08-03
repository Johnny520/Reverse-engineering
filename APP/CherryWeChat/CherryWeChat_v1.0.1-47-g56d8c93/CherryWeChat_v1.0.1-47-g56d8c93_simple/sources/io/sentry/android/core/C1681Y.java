package io.sentry.android.core;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import io.sentry.C1586H;
import io.sentry.C1871f;
import io.sentry.C2054w1;
import io.sentry.EnumC1657a2;
import io.sentry.InterfaceC1592I1;
import io.sentry.android.core.internal.util.C1714b;
import io.sentry.config.AbstractC1856a;

/* JADX INFO: renamed from: io.sentry.android.core.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C1681Y extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final C2054w1 f6063a;

    /* JADX INFO: renamed from: b */
    public final C1666I f6064b;

    /* JADX INFO: renamed from: c */
    public NetworkCapabilities f6065c;

    /* JADX INFO: renamed from: d */
    public long f6066d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1592I1 f6067e;

    public C1681Y(C1666I r3, InterfaceC1592I1 r4) {
        this.f6065c = null;
        this.f6066d = 0;
        this.f6063a = C2054w1.f7276a;
        AbstractC1856a.m4048D("BuildInfoProvider is required", r3);
        this.f6064b = r3;
        AbstractC1856a.m4048D("SentryDateProvider is required", r4);
        this.f6067e = r4;
    }

    /* JADX INFO: renamed from: a */
    public static C1871f m3862a(String r2) {
        C1871f r0 = new C1871f();
        r0.f6712e = "system";
        r0.f6714g = "network.event";
        r0.m4093b("action", r2);
        r0.f6716i = EnumC1657a2.INFO;
        return r0;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network r2) {
        C1871f r22 = m3862a("NETWORK_AVAILABLE");
        this.f6063a.m4224s(r22);
        this.f6065c = null;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network r20, NetworkCapabilities r21) {
        long r2 = this.f6067e.mo3603a().mo3672d();
        NetworkCapabilities r4 = this.f6065c;
        long r5 = this.f6066d;
        C1666I r7 = this.f6064b;
        if (r4 != null) goto L5;
        C1680X r42 = new C1680X(r21, r7, r2);
    L51:
        if (r42 != null) goto L53;
        return;
    L53:
        this.f6065c = r21;
        this.f6066d = r2;
        C1871f r1 = m3862a("NETWORK_CAPABILITIES_CHANGED");
        r1.m4093b("download_bandwidth", Integer.valueOf(r42.f6057a));
        r1.m4093b("upload_bandwidth", Integer.valueOf(r42.f6058b));
        r1.m4093b("vpn_active", Boolean.valueOf(r42.f6061e));
        r1.m4093b("network_type", r42.f6062f);
        int r22 = r42.f6059c;
        if (r22 == 0) goto L56;
        r1.m4093b("signal_strength", Integer.valueOf(r22));
    L56:
        C1586H r23 = new C1586H();
        r23.m3668c("android:networkCapabilities", r42);
        this.f6063a.mo3712f(r1, r23);
        return;
    L5:
        AbstractC1856a.m4048D("BuildInfoProvider is required", r7);
        int r8 = r4.getLinkDownstreamBandwidthKbps();
        int r9 = r4.getLinkUpstreamBandwidthKbps();
        if (Build.VERSION.SDK_INT < 29) goto L8;
        int r10 = AbstractC1663F.m3815a(r4);
    L10:
        if (r10 > (-100)) goto L13;
        r10 = 0;
    L13:
        boolean r11 = r4.hasTransport(4);
        String r43 = C1714b.m3891o(r4);
        if (r43 != null) goto L17;
        r43 = "";
    L17:
        C1680X r13 = new C1680X(r21, r7, r2);
        int r72 = Math.abs(r10 - r13.f6059c);
        int r102 = Math.abs(r8 - r13.f6057a);
        int r14 = Math.abs(r9 - r13.f6058b);
        if ((Math.abs(r5 - r13.f6060d) / 1000000.0d) >= 5000.0d) goto L20;
        boolean r52 = true;
    L21:
        if (r52 == false) goto L23;
    L26:
        boolean r73 = true;
    L27:
        boolean r17 = r73;
        if (r52 == true) goto L33;
        C1680X r18 = r13;
        double r12 = r102;
        int r103 = r9;
        if (r12 <= Math.max(1000.0d, ((double) Math.abs(r8)) * 0.1d)) goto L34;
        boolean r82 = false;
    L35:
        if (r52 == false) goto L37;
    L41:
        boolean r122 = true;
    L40:
        C1680X r53 = r18;
        if (r11 == r53.f6061e) goto L45;
    L50:
        r42 = r53;
        goto L51
    L45:
        if (r43.equals(r53.f6062f) == false) goto L50;
        if (r17 == false) goto L50;
        if (r82 == false) goto L50;
        if (r122 == false) goto L50;
        r42 = null;
        goto L51
    L37:
        if (r14 <= Math.max(1000.0d, ((double) Math.abs(r103)) * 0.1d)) goto L41;
        r122 = false;
    L34:
        r82 = true;
        goto L35
    L33:
        r103 = r9;
        r18 = r13;
        goto L34
    L23:
        if (r72 <= 5) goto L26;
        r73 = false;
        goto L27
    L20:
        r52 = false;
        goto L21
    L8:
        r10 = 0;
        goto L10
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network r2) {
        C1871f r22 = m3862a("NETWORK_LOST");
        this.f6063a.m4224s(r22);
        this.f6065c = null;
    }
}
