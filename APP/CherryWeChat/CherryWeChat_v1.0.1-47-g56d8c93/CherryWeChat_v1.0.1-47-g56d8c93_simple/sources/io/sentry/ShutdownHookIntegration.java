package io.sentry;

import io.sentry.config.AbstractC1856a;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class ShutdownHookIntegration implements InterfaceC1935o0, Closeable {

    /* JADX INFO: renamed from: a */
    public final Runtime f5864a;

    /* JADX INFO: renamed from: b */
    public Thread f5865b;

    public ShutdownHookIntegration() {
        Runtime r0 = Runtime.getRuntime();
        AbstractC1856a.m4048D("Runtime is required", r0);
        this.f5864a = r0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5865b != null) goto L16;
        return;
    L16:
        this.f5864a.removeShutdownHook(this.f5865b);     // Catch: IllegalStateException -> L6
        return;
    L6:
        e = move-exception;
        String r1 = e.getMessage();
        if (r1 != null) goto L10;
    L14:
        throw e;
    L10:
        if (r1.equals("Shutdown in progress") == false) goto L12;
        return;
    L12:
        if (r1.equals("VM already shutting down") == false) goto L14;
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 r5) {
        if (r5.isEnableShutdownHook() == false) goto L16;
        this.f5865b = new Thread(new RunnableC2062y1(r5, 3), "sentry-shutdownhook");
        this.f5864a.addShutdownHook(this.f5865b);     // Catch: IllegalStateException -> L7
        r5.getLogger().mo3680e(EnumC1657a2.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);     // Catch: IllegalStateException -> L7
        AbstractC1856a.m4055a("ShutdownHook");     // Catch: IllegalStateException -> L7
        return;
    L7:
        e = move-exception;
        String r0 = e.getMessage();
        if (r0 != null) goto L11;
    L15:
        throw e;
    L11:
        if (r0.equals("Shutdown in progress") == false) goto L13;
        return;
    L13:
        if (r0.equals("VM already shutting down") == false) goto L15;
        return;
    L16:
        r5.getLogger().mo3680e(EnumC1657a2.INFO, "enableShutdownHook is disabled.", new Object[0]);
    }
}
