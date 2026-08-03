package h.Hchat.crash;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class NativeCrashBridge {
    private NativeCrashBridge() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean install(java.lang.String r1) {
            if (r1 == 0) goto L10
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L10
            boolean r1 = nativeInstall(r1)
            if (r1 == 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    private static native boolean nativeInstall(java.lang.String r0);
}
