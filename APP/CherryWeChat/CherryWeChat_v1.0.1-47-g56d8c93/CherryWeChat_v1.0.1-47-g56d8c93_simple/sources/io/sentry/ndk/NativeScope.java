package io.sentry.ndk;

/* JADX INFO: loaded from: classes.dex */
public final class NativeScope {
    public static native void nativeAddBreadcrumb(String r0, String r1, String r2, String r3, String r4, String r5);

    public static native void nativeSetTrace(String r0, String r1);
}
