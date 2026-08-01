package androidx.core.app;

/* JADX INFO: loaded from: classes2.dex */
public final class PendingIntentCompat {

    private static class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static android.app.PendingIntent getActivities(android.content.Context r1, int r2, android.content.Intent[] r3, int r4, android.os.Bundle r5) {
                android.app.PendingIntent r0 = android.app.PendingIntent.getActivities(r1, r2, r3, r4, r5)
                return r0
        }

        public static android.app.PendingIntent getActivity(android.content.Context r1, int r2, android.content.Intent r3, int r4, android.os.Bundle r5) {
                android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r1, r2, r3, r4, r5)
                return r0
        }
    }

    private static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void send(android.app.PendingIntent r0, android.content.Context r1, int r2, android.content.Intent r3, android.app.PendingIntent.OnFinished r4, android.os.Handler r5, java.lang.String r6, android.os.Bundle r7) throws android.app.PendingIntent.CanceledException {
                r0.send(r1, r2, r3, r4, r5, r6, r7)
                return
        }
    }

    private static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static android.app.PendingIntent getForegroundService(android.content.Context r1, int r2, android.content.Intent r3, int r4) {
                android.app.PendingIntent r0 = android.app.PendingIntent.getForegroundService(r1, r2, r3, r4)
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    private static class GatedCallback implements java.io.Closeable {
        private android.app.PendingIntent.OnFinished mCallback;
        private final java.util.concurrent.CountDownLatch mComplete;
        private boolean mSuccess;

        /* JADX INFO: renamed from: $r8$lambda$-_JLK_p2qvpYOAwGjpaXu2HJ864, reason: not valid java name */
        public static /* synthetic */ void m777$r8$lambda$_JLK_p2qvpYOAwGjpaXu2HJ864(androidx.core.app.PendingIntentCompat.GatedCallback r0, android.app.PendingIntent r1, android.content.Intent r2, int r3, java.lang.String r4, android.os.Bundle r5) {
                r0.onSendFinished(r1, r2, r3, r4, r5)
                return
        }

        GatedCallback(android.app.PendingIntent.OnFinished r3) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
                r1 = 1
                r0.<init>(r1)
                r2.mComplete = r0
                r2.mCallback = r3
                r0 = 0
                r2.mSuccess = r0
                return
        }

        private void onSendFinished(android.app.PendingIntent r9, android.content.Intent r10, int r11, java.lang.String r12, android.os.Bundle r13) {
                r8 = this;
                r0 = 0
            L1:
                java.util.concurrent.CountDownLatch r1 = r8.mComplete     // Catch: java.lang.Throwable -> L22 java.lang.InterruptedException -> L2d
                r1.await()     // Catch: java.lang.Throwable -> L22 java.lang.InterruptedException -> L2d
                if (r0 == 0) goto L10
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L10:
                android.app.PendingIntent$OnFinished r1 = r8.mCallback
                if (r1 == 0) goto L21
                android.app.PendingIntent$OnFinished r2 = r8.mCallback
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r7 = r13
                r2.onSendFinished(r3, r4, r5, r6, r7)
                r1 = 0
                r8.mCallback = r1
            L21:
                return
            L22:
                r1 = move-exception
                if (r0 == 0) goto L2c
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                r2.interrupt()
            L2c:
                throw r1
            L2d:
                r1 = move-exception
                r0 = 1
                goto L1
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                boolean r0 = r1.mSuccess
                if (r0 != 0) goto L7
                r0 = 0
                r1.mCallback = r0
            L7:
                java.util.concurrent.CountDownLatch r0 = r1.mComplete
                r0.countDown()
                return
        }

        public void complete() {
                r1 = this;
                r0 = 1
                r1.mSuccess = r0
                return
        }

        public android.app.PendingIntent.OnFinished getCallback() {
                r1 = this;
                android.app.PendingIntent$OnFinished r0 = r1.mCallback
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                androidx.core.app.PendingIntentCompat$GatedCallback$$ExternalSyntheticLambda0 r0 = new androidx.core.app.PendingIntentCompat$GatedCallback$$ExternalSyntheticLambda0
                r0.<init>(r1)
                return r0
        }
    }

    private PendingIntentCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int addMutabilityFlags(boolean r2, int r3) {
            if (r2 == 0) goto Lc
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L10
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r3 = r3 | r0
            goto L10
        Lc:
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r3 = r3 | r0
        L10:
            return r3
    }

    public static android.app.PendingIntent getActivities(android.content.Context r1, int r2, android.content.Intent[] r3, int r4, android.os.Bundle r5, boolean r6) {
            int r0 = addMutabilityFlags(r6, r4)
            android.app.PendingIntent r0 = androidx.core.app.PendingIntentCompat.Api16Impl.getActivities(r1, r2, r3, r0, r5)
            return r0
    }

    public static android.app.PendingIntent getActivities(android.content.Context r1, int r2, android.content.Intent[] r3, int r4, boolean r5) {
            int r0 = addMutabilityFlags(r5, r4)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivities(r1, r2, r3, r0)
            return r0
    }

    public static android.app.PendingIntent getActivity(android.content.Context r1, int r2, android.content.Intent r3, int r4, android.os.Bundle r5, boolean r6) {
            int r0 = addMutabilityFlags(r6, r4)
            android.app.PendingIntent r0 = androidx.core.app.PendingIntentCompat.Api16Impl.getActivity(r1, r2, r3, r0, r5)
            return r0
    }

    public static android.app.PendingIntent getActivity(android.content.Context r1, int r2, android.content.Intent r3, int r4, boolean r5) {
            int r0 = addMutabilityFlags(r5, r4)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r1, r2, r3, r0)
            return r0
    }

    public static android.app.PendingIntent getBroadcast(android.content.Context r1, int r2, android.content.Intent r3, int r4, boolean r5) {
            int r0 = addMutabilityFlags(r5, r4)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r1, r2, r3, r0)
            return r0
    }

    public static android.app.PendingIntent getForegroundService(android.content.Context r1, int r2, android.content.Intent r3, int r4, boolean r5) {
            int r0 = addMutabilityFlags(r5, r4)
            android.app.PendingIntent r0 = androidx.core.app.PendingIntentCompat.Api26Impl.getForegroundService(r1, r2, r3, r0)
            return r0
    }

    public static android.app.PendingIntent getService(android.content.Context r1, int r2, android.content.Intent r3, int r4, boolean r5) {
            int r0 = addMutabilityFlags(r5, r4)
            android.app.PendingIntent r0 = android.app.PendingIntent.getService(r1, r2, r3, r0)
            return r0
    }

    public static void send(android.app.PendingIntent r3, int r4, android.app.PendingIntent.OnFinished r5, android.os.Handler r6) throws android.app.PendingIntent.CanceledException {
            androidx.core.app.PendingIntentCompat$GatedCallback r0 = new androidx.core.app.PendingIntentCompat$GatedCallback
            r0.<init>(r5)
            android.app.PendingIntent$OnFinished r1 = r0.getCallback()     // Catch: java.lang.Throwable -> L13
            r3.send(r4, r1, r6)     // Catch: java.lang.Throwable -> L13
            r0.complete()     // Catch: java.lang.Throwable -> L13
            r0.close()
            return
        L13:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L18
            goto L1c
        L18:
            r2 = move-exception
            r1.addSuppressed(r2)
        L1c:
            throw r1
    }

    public static void send(android.app.PendingIntent r8, android.content.Context r9, int r10, android.content.Intent r11, android.app.PendingIntent.OnFinished r12, android.os.Handler r13) throws android.app.PendingIntent.CanceledException {
            r6 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            send(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void send(android.app.PendingIntent r3, android.content.Context r4, int r5, android.content.Intent r6, android.app.PendingIntent.OnFinished r7, android.os.Handler r8, java.lang.String r9, android.os.Bundle r10) throws android.app.PendingIntent.CanceledException {
            androidx.core.app.PendingIntentCompat$GatedCallback r0 = new androidx.core.app.PendingIntentCompat$GatedCallback
            r0.<init>(r7)
            androidx.core.app.PendingIntentCompat.Api23Impl.send(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L10
            r0.complete()     // Catch: java.lang.Throwable -> L10
            r0.close()
            return
        L10:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r2 = move-exception
            r1.addSuppressed(r2)
        L19:
            throw r1
    }
}
