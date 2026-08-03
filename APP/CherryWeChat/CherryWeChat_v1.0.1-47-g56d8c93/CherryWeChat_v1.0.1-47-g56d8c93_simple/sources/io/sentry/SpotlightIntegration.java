package io.sentry;

import io.sentry.config.AbstractC1856a;
import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;

/* JADX INFO: loaded from: classes.dex */
public final class SpotlightIntegration implements InterfaceC1935o0, InterfaceC1917k2, Closeable {

    /* JADX INFO: renamed from: a */
    public C2046v2 f5866a;

    /* JADX INFO: renamed from: b */
    public ILogger f5867b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1833c0 f5868c;

    public SpotlightIntegration() {
        this.f5867b = C1611N0.f5797a;
        this.f5868c = C1599K0.f5775d;
    }

    /* JADX INFO: renamed from: d */
    public static void m3743d(HttpURLConnection r1) {
        r1.getInputStream().close();     // Catch: Throwable -> L5 IOException -> L8
        r1.disconnect();
        return;
    L8:
        r1.disconnect();
        return;
    L5:
        th = move-exception;
        r1.disconnect();
        throw th;
    }

    /* JADX INFO: renamed from: f */
    public static HttpURLConnection m3744f(String r2) {
        HttpURLConnection r22 = (HttpURLConnection) URI.create(r2).toURL().openConnection();
        r22.setReadTimeout(1000);
        r22.setConnectTimeout(1000);
        r22.setRequestMethod("POST");
        r22.setDoOutput(true);
        r22.setRequestProperty("Content-Encoding", "gzip");
        r22.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        r22.setRequestProperty("Accept", "application/json");
        r22.setRequestProperty("Connection", "close");
        r22.connect();
        return r22;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5868c.mo3695g(0);
        C2046v2 r0 = this.f5866a;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.getBeforeEnvelopeCallback() != this) goto L9;
        this.f5866a.setBeforeEnvelopeCallback(null);
        return;
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 r4) {
        this.f5866a = r4;
        this.f5867b = r4.getLogger();
        if (r4.getBeforeEnvelopeCallback() == null) goto L5;
    L8:
        this.f5867b.mo3680e(EnumC1657a2.DEBUG, "SpotlightIntegration is not enabled. BeforeEnvelopeCallback is already set or spotlight is not enabled.", new Object[0]);
        return;
    L5:
        if (r4.isEnableSpotlight() == false) goto L8;
        this.f5868c = new C1638U1(r4);
        r4.setBeforeEnvelopeCallback(this);
        this.f5867b.mo3680e(EnumC1657a2.DEBUG, "SpotlightIntegration enabled.", new Object[0]);
        AbstractC1856a.m4055a("Spotlight");
    }
}
