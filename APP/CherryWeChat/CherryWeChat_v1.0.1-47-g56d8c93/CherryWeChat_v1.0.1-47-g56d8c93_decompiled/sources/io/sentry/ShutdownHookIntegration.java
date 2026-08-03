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
        Runtime runtime = Runtime.getRuntime();
        AbstractC1856a.m4048D("Runtime is required", runtime);
        this.f5864a = runtime;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5865b != null) {
            try {
                this.f5864a.removeShutdownHook(this.f5865b);
            } catch (IllegalStateException e) {
                String message = e.getMessage();
                if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                    throw e;
                }
            }
        }
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 c2046v2) {
        if (!c2046v2.isEnableShutdownHook()) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.INFO, "enableShutdownHook is disabled.", new Object[0]);
            return;
        }
        this.f5865b = new Thread(new RunnableC2062y1(c2046v2, 3), "sentry-shutdownhook");
        try {
            this.f5864a.addShutdownHook(this.f5865b);
            c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
            AbstractC1856a.m4055a("ShutdownHook");
        } catch (IllegalStateException e) {
            String message = e.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e;
            }
        }
    }
}
