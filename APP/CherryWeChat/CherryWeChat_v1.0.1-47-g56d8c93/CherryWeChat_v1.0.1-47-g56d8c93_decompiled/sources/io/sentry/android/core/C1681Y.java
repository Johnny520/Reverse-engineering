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

    /* JADX INFO: renamed from: b */
    public final C1666I f6064b;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1592I1 f6067e;

    /* JADX INFO: renamed from: c */
    public NetworkCapabilities f6065c = null;

    /* JADX INFO: renamed from: d */
    public long f6066d = 0;

    /* JADX INFO: renamed from: a */
    public final C2054w1 f6063a = C2054w1.f7276a;

    public C1681Y(C1666I c1666i, InterfaceC1592I1 interfaceC1592I1) {
        AbstractC1856a.m4048D("BuildInfoProvider is required", c1666i);
        this.f6064b = c1666i;
        AbstractC1856a.m4048D("SentryDateProvider is required", interfaceC1592I1);
        this.f6067e = interfaceC1592I1;
    }

    /* JADX INFO: renamed from: a */
    public static C1871f m3862a(String str) {
        C1871f c1871f = new C1871f();
        c1871f.f6712e = "system";
        c1871f.f6714g = "network.event";
        c1871f.m4093b("action", str);
        c1871f.f6716i = EnumC1657a2.INFO;
        return c1871f;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f6063a.m4224s(m3862a("NETWORK_AVAILABLE"));
        this.f6065c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    @Override // android.net.ConnectivityManager.NetworkCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        int i;
        C1680X c1680x;
        boolean z;
        C1680X c1680x2;
        long jMo3672d = this.f6067e.mo3603a().mo3672d();
        NetworkCapabilities networkCapabilities2 = this.f6065c;
        long j = this.f6066d;
        C1666I c1666i = this.f6064b;
        if (networkCapabilities2 == null) {
            c1680x2 = new C1680X(networkCapabilities, c1666i, jMo3672d);
        } else {
            AbstractC1856a.m4048D("BuildInfoProvider is required", c1666i);
            int linkDownstreamBandwidthKbps = networkCapabilities2.getLinkDownstreamBandwidthKbps();
            int linkUpstreamBandwidthKbps = networkCapabilities2.getLinkUpstreamBandwidthKbps();
            int signalStrength = Build.VERSION.SDK_INT >= 29 ? networkCapabilities2.getSignalStrength() : 0;
            if (signalStrength <= -100) {
                signalStrength = 0;
            }
            boolean zHasTransport = networkCapabilities2.hasTransport(4);
            String strM3891o = C1714b.m3891o(networkCapabilities2);
            if (strM3891o == null) {
                strM3891o = "";
            }
            C1680X c1680x3 = new C1680X(networkCapabilities, c1666i, jMo3672d);
            int iAbs = Math.abs(signalStrength - c1680x3.f6059c);
            int iAbs2 = Math.abs(linkDownstreamBandwidthKbps - c1680x3.f6057a);
            int iAbs3 = Math.abs(linkUpstreamBandwidthKbps - c1680x3.f6058b);
            boolean z2 = ((double) Math.abs(j - c1680x3.f6060d)) / 1000000.0d < 5000.0d;
            boolean z3 = z2 || iAbs <= 5;
            if (z2) {
                i = linkUpstreamBandwidthKbps;
                c1680x = c1680x3;
            } else {
                c1680x = c1680x3;
                double d = iAbs2;
                i = linkUpstreamBandwidthKbps;
                if (d > Math.max(1000.0d, ((double) Math.abs(linkDownstreamBandwidthKbps)) * 0.1d)) {
                    z = false;
                }
                boolean z4 = !z2 || ((double) iAbs3) <= Math.max(1000.0d, ((double) Math.abs(i)) * 0.1d);
                C1680X c1680x4 = c1680x;
                c1680x2 = (zHasTransport != c1680x4.f6061e && strM3891o.equals(c1680x4.f6062f) && z3 && z && z4) ? null : c1680x4;
            }
            z = true;
            if (z2) {
                C1680X c1680x42 = c1680x;
                if (zHasTransport != c1680x42.f6061e) {
                }
            }
        }
        if (c1680x2 == null) {
            return;
        }
        this.f6065c = networkCapabilities;
        this.f6066d = jMo3672d;
        C1871f c1871fM3862a = m3862a("NETWORK_CAPABILITIES_CHANGED");
        c1871fM3862a.m4093b("download_bandwidth", Integer.valueOf(c1680x2.f6057a));
        c1871fM3862a.m4093b("upload_bandwidth", Integer.valueOf(c1680x2.f6058b));
        c1871fM3862a.m4093b("vpn_active", Boolean.valueOf(c1680x2.f6061e));
        c1871fM3862a.m4093b("network_type", c1680x2.f6062f);
        int i2 = c1680x2.f6059c;
        if (i2 != 0) {
            c1871fM3862a.m4093b("signal_strength", Integer.valueOf(i2));
        }
        C1586H c1586h = new C1586H();
        c1586h.m3668c("android:networkCapabilities", c1680x2);
        this.f6063a.mo3712f(c1871fM3862a, c1586h);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f6063a.m4224s(m3862a("NETWORK_LOST"));
        this.f6065c = null;
    }
}
