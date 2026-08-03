package io.sentry.android.core;

import android.net.NetworkCapabilities;
import android.os.Build;
import io.sentry.android.core.internal.util.C1714b;
import io.sentry.config.AbstractC1856a;

/* JADX INFO: renamed from: io.sentry.android.core.X */
/* JADX INFO: loaded from: classes.dex */
public final class C1680X {

    /* JADX INFO: renamed from: a */
    public final int f6057a;

    /* JADX INFO: renamed from: b */
    public final int f6058b;

    /* JADX INFO: renamed from: c */
    public final int f6059c;

    /* JADX INFO: renamed from: d */
    public final long f6060d;

    /* JADX INFO: renamed from: e */
    public final boolean f6061e;

    /* JADX INFO: renamed from: f */
    public final String f6062f;

    public C1680X(NetworkCapabilities networkCapabilities, C1666I c1666i, long j) {
        AbstractC1856a.m4048D("NetworkCapabilities is required", networkCapabilities);
        AbstractC1856a.m4048D("BuildInfoProvider is required", c1666i);
        this.f6057a = networkCapabilities.getLinkDownstreamBandwidthKbps();
        this.f6058b = networkCapabilities.getLinkUpstreamBandwidthKbps();
        int signalStrength = Build.VERSION.SDK_INT >= 29 ? networkCapabilities.getSignalStrength() : 0;
        this.f6059c = signalStrength > -100 ? signalStrength : 0;
        this.f6061e = networkCapabilities.hasTransport(4);
        String strM3891o = C1714b.m3891o(networkCapabilities);
        this.f6062f = strM3891o == null ? "" : strM3891o;
        this.f6060d = j;
    }
}
