package p099h.Hchat.crash;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class NativeCrashBridge {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private NativeCrashBridge() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean install(String str) {
        return (str == null || str.isEmpty() || !nativeInstall(str)) ? false : true;
    }

    private static native boolean nativeInstall(String str);
}
