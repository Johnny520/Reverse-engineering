package androidx.core.os;

/* JADX INFO: loaded from: classes2.dex */
public final class ProcessCompat {

    static class Api16Impl {
        private static java.lang.reflect.Method sMethodUserIdIsAppMethod;
        private static boolean sResolved;
        private static final java.lang.Object sResolvedLock = null;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                androidx.core.os.ProcessCompat.Api16Impl.sResolvedLock = r0
                return
        }

        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isApplicationUid(int r5) {
                r0 = 1
                java.lang.Object r1 = androidx.core.os.ProcessCompat.Api16Impl.sResolvedLock     // Catch: java.lang.Exception -> L45
                monitor-enter(r1)     // Catch: java.lang.Exception -> L45
                boolean r2 = androidx.core.os.ProcessCompat.Api16Impl.sResolved     // Catch: java.lang.Throwable -> L42
                if (r2 != 0) goto L1e
                androidx.core.os.ProcessCompat.Api16Impl.sResolved = r0     // Catch: java.lang.Throwable -> L42
                java.lang.String r2 = "android.os.UserId"
                java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L42
                java.lang.String r3 = "isApp"
                java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L42
                java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> L42
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L42
                androidx.core.os.ProcessCompat.Api16Impl.sMethodUserIdIsAppMethod = r2     // Catch: java.lang.Throwable -> L42
            L1e:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L42
                java.lang.reflect.Method r1 = androidx.core.os.ProcessCompat.Api16Impl.sMethodUserIdIsAppMethod     // Catch: java.lang.Exception -> L45
                if (r1 == 0) goto L41
                java.lang.reflect.Method r1 = androidx.core.os.ProcessCompat.Api16Impl.sMethodUserIdIsAppMethod     // Catch: java.lang.Exception -> L45
                java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L45
                java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Exception -> L45
                r3 = 0
                java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.Exception -> L45
                java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L45
                if (r1 == 0) goto L3b
                boolean r0 = r1.booleanValue()     // Catch: java.lang.Exception -> L45
                return r0
            L3b:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L45
                r2.<init>()     // Catch: java.lang.Exception -> L45
                throw r2     // Catch: java.lang.Exception -> L45
            L41:
                goto L49
            L42:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L42
                throw r2     // Catch: java.lang.Exception -> L45
            L45:
                r1 = move-exception
                r1.printStackTrace()
            L49:
                return r0
        }
    }

    static class Api17Impl {
        private static java.lang.reflect.Method sMethodUserHandleIsAppMethod;
        private static boolean sResolved;
        private static final java.lang.Object sResolvedLock = null;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                androidx.core.os.ProcessCompat.Api17Impl.sResolvedLock = r0
                return
        }

        private Api17Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isApplicationUid(int r5) {
                r0 = 1
                java.lang.Object r1 = androidx.core.os.ProcessCompat.Api17Impl.sResolvedLock     // Catch: java.lang.Exception -> L41
                monitor-enter(r1)     // Catch: java.lang.Exception -> L41
                boolean r2 = androidx.core.os.ProcessCompat.Api17Impl.sResolved     // Catch: java.lang.Throwable -> L3e
                if (r2 != 0) goto L1a
                androidx.core.os.ProcessCompat.Api17Impl.sResolved = r0     // Catch: java.lang.Throwable -> L3e
                java.lang.Class<android.os.UserHandle> r2 = android.os.UserHandle.class
                java.lang.String r3 = "isApp"
                java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L3e
                java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> L3e
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L3e
                androidx.core.os.ProcessCompat.Api17Impl.sMethodUserHandleIsAppMethod = r2     // Catch: java.lang.Throwable -> L3e
            L1a:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L3e
                java.lang.reflect.Method r1 = androidx.core.os.ProcessCompat.Api17Impl.sMethodUserHandleIsAppMethod     // Catch: java.lang.Exception -> L41
                if (r1 == 0) goto L3d
                java.lang.reflect.Method r1 = androidx.core.os.ProcessCompat.Api17Impl.sMethodUserHandleIsAppMethod     // Catch: java.lang.Exception -> L41
                java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L41
                java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Exception -> L41
                r3 = 0
                java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.Exception -> L41
                java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L41
                if (r1 == 0) goto L37
                boolean r0 = r1.booleanValue()     // Catch: java.lang.Exception -> L41
                return r0
            L37:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L41
                r2.<init>()     // Catch: java.lang.Exception -> L41
                throw r2     // Catch: java.lang.Exception -> L41
            L3d:
                goto L45
            L3e:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L3e
                throw r2     // Catch: java.lang.Exception -> L41
            L41:
                r1 = move-exception
                r1.printStackTrace()
            L45:
                return r0
        }
    }

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isApplicationUid(int r1) {
                boolean r0 = android.os.Process.isApplicationUid(r1)
                return r0
        }
    }

    private ProcessCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isApplicationUid(int r1) {
            boolean r0 = androidx.core.os.ProcessCompat.Api24Impl.isApplicationUid(r1)
            return r0
    }
}
