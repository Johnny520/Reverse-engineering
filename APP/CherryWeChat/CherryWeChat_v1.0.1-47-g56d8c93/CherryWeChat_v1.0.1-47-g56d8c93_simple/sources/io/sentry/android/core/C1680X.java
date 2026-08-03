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

    public C1680X(NetworkCapabilities r3, C1666I r4, long r5) {
        AbstractC1856a.m4048D("NetworkCapabilities is required", r3);
        AbstractC1856a.m4048D("BuildInfoProvider is required", r4);
        this.f6057a = r3.getLinkDownstreamBandwidthKbps();
        this.f6058b = r3.getLinkUpstreamBandwidthKbps();
        int r1 = 0;
        if (Build.VERSION.SDK_INT < 29) goto L5;
        int r42 = AbstractC1663F.m3815a(r3);
    L7:
        if (r42 <= (-100)) goto L9;
        r1 = r42;
    L9:
        this.f6059c = r1;
        this.f6061e = r3.hasTransport(4);
        String r32 = C1714b.m3891o(r3);
        if (r32 != null) goto L13;
        r32 = "";
    L13:
        this.f6062f = r32;
        this.f6060d = r5;
        return;
    L5:
        r42 = 0;
        goto L7
    }
}
