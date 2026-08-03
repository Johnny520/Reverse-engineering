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
    public ILogger f5867b = C1611N0.f5797a;

    /* JADX INFO: renamed from: c */
    public InterfaceC1833c0 f5868c = C1599K0.f5775d;

    /* JADX INFO: renamed from: d */
    public static void m3743d(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* JADX INFO: renamed from: f */
    public static HttpURLConnection m3744f(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) URI.create(str).toURL().openConnection();
        httpURLConnection.setReadTimeout(1000);
        httpURLConnection.setConnectTimeout(1000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5868c.mo3695g(0L);
        C2046v2 c2046v2 = this.f5866a;
        if (c2046v2 == null || c2046v2.getBeforeEnvelopeCallback() != this) {
            return;
        }
        this.f5866a.setBeforeEnvelopeCallback(null);
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 c2046v2) {
        this.f5866a = c2046v2;
        this.f5867b = c2046v2.getLogger();
        if (c2046v2.getBeforeEnvelopeCallback() != null || !c2046v2.isEnableSpotlight()) {
            this.f5867b.mo3680e(EnumC1657a2.DEBUG, "SpotlightIntegration is not enabled. BeforeEnvelopeCallback is already set or spotlight is not enabled.", new Object[0]);
            return;
        }
        this.f5868c = new C1638U1(c2046v2);
        c2046v2.setBeforeEnvelopeCallback(this);
        this.f5867b.mo3680e(EnumC1657a2.DEBUG, "SpotlightIntegration enabled.", new Object[0]);
        AbstractC1856a.m4055a("Spotlight");
    }
}
