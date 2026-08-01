package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: CloseGuard.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m115d2 = {"Lokhttp3/internal/platform/android/CloseGuard;", "", "getMethod", "Ljava/lang/reflect/Method;", "openMethod", "warnIfOpenMethod", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "createAndOpen", "closer", "", "warnIfOpen", "", "closeGuardInstance", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class CloseGuard {
    public static final okhttp3.internal.platform.android.CloseGuard.Companion Companion = null;
    private final java.lang.reflect.Method getMethod;
    private final java.lang.reflect.Method openMethod;
    private final java.lang.reflect.Method warnIfOpenMethod;

    /* JADX INFO: compiled from: CloseGuard.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m115d2 = {"Lokhttp3/internal/platform/android/CloseGuard$Companion;", "", "()V", "get", "Lokhttp3/internal/platform/android/CloseGuard;", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final okhttp3.internal.platform.android.CloseGuard get() {
                r7 = this;
                r0 = 0
                r1 = 0
                r2 = 0
                java.lang.String r3 = "dalvik.system.CloseGuard"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> L2b
                java.lang.String r4 = "get"
                r5 = 0
                java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L2b
                java.lang.reflect.Method r4 = r3.getMethod(r4, r6)     // Catch: java.lang.Exception -> L2b
                r0 = r4
                java.lang.String r4 = "open"
                java.lang.Class<java.lang.String> r6 = java.lang.String.class
                java.lang.Class[] r6 = new java.lang.Class[]{r6}     // Catch: java.lang.Exception -> L2b
                java.lang.reflect.Method r4 = r3.getMethod(r4, r6)     // Catch: java.lang.Exception -> L2b
                r1 = r4
                java.lang.String r4 = "warnIfOpen"
                java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L2b
                java.lang.reflect.Method r4 = r3.getMethod(r4, r5)     // Catch: java.lang.Exception -> L2b
                r2 = r4
                goto L2f
            L2b:
                r3 = move-exception
                r0 = 0
                r1 = 0
                r2 = 0
            L2f:
                okhttp3.internal.platform.android.CloseGuard r3 = new okhttp3.internal.platform.android.CloseGuard
                r3.<init>(r0, r1, r2)
                return r3
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

    public final java.lang.Object createAndOpen(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "closer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.reflect.Method r0 = r4.getMethod
            r1 = 0
            if (r0 == 0) goto L22
        Lb:
            java.lang.reflect.Method r0 = r4.getMethod     // Catch: java.lang.Exception -> L21
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L21
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L21
            java.lang.reflect.Method r2 = r4.openMethod     // Catch: java.lang.Exception -> L21
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch: java.lang.Exception -> L21
            java.lang.Object[] r3 = new java.lang.Object[]{r5}     // Catch: java.lang.Exception -> L21
            r2.invoke(r0, r3)     // Catch: java.lang.Exception -> L21
            return r0
        L21:
            r0 = move-exception
        L22:
            return r1
    }

    public final boolean warnIfOpen(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L12
        L4:
            java.lang.reflect.Method r1 = r3.warnIfOpenMethod     // Catch: java.lang.Exception -> L11
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Exception -> L11
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L11
            r1.invoke(r4, r2)     // Catch: java.lang.Exception -> L11
            r0 = 1
            goto L12
        L11:
            r1 = move-exception
        L12:
            return r0
    }
}
