package io.sentry.android.ndk;

import io.sentry.C1650Y1;
import io.sentry.android.core.EnumC1679W;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.config.AbstractC1856a;
import io.sentry.ndk.EnumC1933a;
import io.sentry.ndk.NdkOptions;
import io.sentry.protocol.C1968r;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p000.RunnableC2531t8;

/* JADX INFO: loaded from: classes.dex */
public final class SentryNdk {
    private static final CountDownLatch loadLibraryLatch = null;

    static {
        loadLibraryLatch = new CountDownLatch(1);
        new Thread(new RunnableC2531t8(3), "SentryNdkLoadLibs").start();
    }

    private SentryNdk() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3938a() {
        lambda$static$0();
    }

    public static void close() {
    L8:
        e = move-exception;
        throw new IllegalStateException("Thread interrupted while waiting for NDK libs to be loaded", e);
    L3:
        if (loadLibraryLatch.await(2000, TimeUnit.MILLISECONDS) == false) goto L7;
        io.sentry.ndk.SentryNdk.close();     // Catch: InterruptedException -> L8
        return;
    L7:
        throw new IllegalStateException("Timeout waiting for Sentry NDK library to load");     // Catch: InterruptedException -> L8
    }

    public static void init(SentryAndroidOptions r10) {
        C1968r r0 = r10.getSdkVersion();
        int r1 = AbstractC1755c.f6363a;
        if (r0 == null) goto L28;
        C1650Y1.m3790d().m3792b("maven:io.sentry:sentry-android-ndk", "8.21.1");
    L28:
    L25:
        e = move-exception;
        throw new IllegalStateException("Thread interrupted while waiting for NDK libs to be loaded", e);
    L7:
        if (loadLibraryLatch.await(2000, TimeUnit.MILLISECONDS) == false) goto L24;
        String r2 = r10.getDsn();     // Catch: InterruptedException -> L25
        AbstractC1856a.m4048D("DSN is required for sentry-ndk", r2);     // Catch: InterruptedException -> L25
        boolean r3 = r10.isDebug();     // Catch: InterruptedException -> L25
        String r4 = r10.getOutboxPath();     // Catch: InterruptedException -> L25
        AbstractC1856a.m4048D("outbox path is required for sentry-ndk", r4);     // Catch: InterruptedException -> L25
        NdkOptions r12 = new NdkOptions(r2, r3, r4, r10.getRelease(), r10.getEnvironment(), r10.getDist(), r10.getMaxBreadcrumbs(), r10.getNativeSdkName());     // Catch: InterruptedException -> L25
        int r02 = r10.getNdkHandlerStrategy();     // Catch: InterruptedException -> L25
        if (r02 != EnumC1679W.SENTRY_HANDLER_STRATEGY_DEFAULT.getValue()) goto L12;
        r12.setNdkHandlerStrategy(EnumC1933a.SENTRY_HANDLER_STRATEGY_DEFAULT);     // Catch: InterruptedException -> L25
    L14:
        Double r03 = r10.getTracesSampleRate();     // Catch: InterruptedException -> L25
        if (r03 != null) goto L17;
        r12.setTracesSampleRate(0.0f);     // Catch: InterruptedException -> L25
    L18:
        io.sentry.ndk.SentryNdk.init(r12);     // Catch: InterruptedException -> L25
        if (r10.isEnableScopeSync() == false) goto L21;
        r10.addScopeObserver(new C1754b(r10));     // Catch: InterruptedException -> L25
    L21:
        r10.setDebugImagesLoader(new C1753a());     // Catch: InterruptedException -> L25
        return;
    L17:
        r12.setTracesSampleRate(r03.floatValue());     // Catch: InterruptedException -> L25
        goto L18
    L12:
        if (r02 != EnumC1679W.SENTRY_HANDLER_STRATEGY_CHAIN_AT_START.getValue()) goto L14;
        r12.setNdkHandlerStrategy(EnumC1933a.SENTRY_HANDLER_STRATEGY_CHAIN_AT_START);     // Catch: InterruptedException -> L25
        goto L14
    L24:
        throw new IllegalStateException("Timeout waiting for Sentry NDK library to load");     // Catch: InterruptedException -> L25
    }

    private static /* synthetic */ void lambda$static$0() {
        io.sentry.ndk.SentryNdk.loadNativeLibraries();     // Catch: Throwable -> L5
    L3:
        loadLibraryLatch.countDown();
    }
}
