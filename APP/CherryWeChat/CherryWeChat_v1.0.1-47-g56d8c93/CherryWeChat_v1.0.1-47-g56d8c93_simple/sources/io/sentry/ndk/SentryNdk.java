package io.sentry.ndk;

/* JADX INFO: loaded from: classes.dex */
public final class SentryNdk {
    private static volatile boolean nativeLibrariesLoaded;

    private SentryNdk() {
    }

    public static void close() {
        loadNativeLibraries();
        shutdown();
    }

    public static void init(NdkOptions r0) {
        loadNativeLibraries();
        initSentryNative(r0);
    }

    private static native void initSentryNative(NdkOptions r0);

    public static synchronized void loadNativeLibraries() {
        monitor-enter(SentryNdk.class);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (nativeLibrariesLoaded == true) goto L10;
        System.loadLibrary("log");     // Catch: Throwable -> L8
        System.loadLibrary("sentry");     // Catch: Throwable -> L8
        System.loadLibrary("sentry-android");     // Catch: Throwable -> L8
        nativeLibrariesLoaded = true;     // Catch: Throwable -> L8
    L10:
        monitor-exit(SentryNdk.class);
    }

    private static native void shutdown();
}
