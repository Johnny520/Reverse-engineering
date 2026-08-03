package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class CloseGuard {
    public static final okhttp3.internal.platform.android.CloseGuard.Companion Companion = null;
    private final java.lang.reflect.Method getMethod;
    private final java.lang.reflect.Method openMethod;
    private final java.lang.reflect.Method warnIfOpenMethod;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(gg.g r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final okhttp3.internal.platform.android.CloseGuard get() {
                r5 = this;
                r0 = 0
                java.lang.String r1 = "dalvik.system.CloseGuard"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L22
                java.lang.String r2 = "get"
                java.lang.reflect.Method r2 = r1.getMethod(r2, r0)     // Catch: java.lang.Exception -> L22
                java.lang.String r3 = "open"
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Exception -> L22
                java.lang.reflect.Method r3 = r1.getMethod(r3, r4)     // Catch: java.lang.Exception -> L22
                java.lang.String r4 = "warnIfOpen"
                java.lang.reflect.Method r0 = r1.getMethod(r4, r0)     // Catch: java.lang.Exception -> L22
                r1 = r0
                r0 = r2
                goto L24
            L22:
                r1 = r0
                r3 = r1
            L24:
                okhttp3.internal.platform.android.CloseGuard r2 = new okhttp3.internal.platform.android.CloseGuard
                r2.<init>(r0, r3, r1)
                return r2
        }
    }

    static {
            okhttp3.internal.platform.android.CloseGuard$Companion r0 = new okhttp3.internal.platform.android.CloseGuard$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.android.CloseGuard.Companion = r0
            return
    }

    public CloseGuard(java.lang.reflect.Method r1, java.lang.reflect.Method r2, java.lang.reflect.Method r3) {
            r0 = this;
            r0.<init>()
            r0.getMethod = r1
            r0.openMethod = r2
            r0.warnIfOpenMethod = r3
            return
    }

    public final java.lang.Object createAndOpen(java.lang.String r4) {
            r3 = this;
            r4.getClass()
            java.lang.reflect.Method r0 = r3.getMethod
            r1 = 0
            if (r0 == 0) goto L19
            java.lang.Object r0 = r0.invoke(r1, r1)     // Catch: java.lang.Exception -> L19
            java.lang.reflect.Method r2 = r3.openMethod     // Catch: java.lang.Exception -> L19
            r2.getClass()     // Catch: java.lang.Exception -> L19
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L19
            r2.invoke(r0, r4)     // Catch: java.lang.Exception -> L19
            return r0
        L19:
            return r1
    }

    public final boolean warnIfOpen(java.lang.Object r3) {
            r2 = this;
            if (r3 == 0) goto Ld
            java.lang.reflect.Method r0 = r2.warnIfOpenMethod     // Catch: java.lang.Exception -> Ld
            r0.getClass()     // Catch: java.lang.Exception -> Ld
            r1 = 0
            r0.invoke(r3, r1)     // Catch: java.lang.Exception -> Ld
            r3 = 1
            return r3
        Ld:
            r3 = 0
            return r3
    }
}
