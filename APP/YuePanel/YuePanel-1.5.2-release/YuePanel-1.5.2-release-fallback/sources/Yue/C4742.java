package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤ۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4742 {

    /* JADX INFO: renamed from: Yue.ۥۡۤ۟ۨ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(23)
    public static class C4743 {
        public C4743() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m18923(@Yue.InterfaceC4410 android.app.PendingIntent r0, @Yue.InterfaceC4410 android.content.Context r1, int r2, @Yue.InterfaceC4410 android.content.Intent r3, @Yue.InterfaceC4544 android.app.PendingIntent.OnFinished r4, @Yue.InterfaceC4544 android.os.Handler r5, @Yue.InterfaceC4544 java.lang.String r6, @Yue.InterfaceC4544 android.os.Bundle r7) throws android.app.PendingIntent.CanceledException {
                r0.send(r1, r2, r3, r4, r5, r6, r7)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤ۟ۨ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(26)
    public static class C4744 {
        public C4744() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.app.PendingIntent m18924(android.content.Context r0, int r1, android.content.Intent r2, int r3) {
                android.app.PendingIntent r0 = android.app.PendingIntent.getForegroundService(r0, r1, r2, r3)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤ۟ۨ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC4745 {
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤ۟ۨ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C4746 implements java.io.Closeable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final java.util.concurrent.CountDownLatch f15052;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public android.app.PendingIntent.OnFinished f15053;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f15054;

        public C4746(@Yue.InterfaceC4544 android.app.PendingIntent.OnFinished r3) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
                r1 = 1
                r0.<init>(r1)
                r2.f15052 = r0
                r2.f15053 = r3
                r3 = 0
                r2.f15054 = r3
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static /* synthetic */ void m18925(Yue.C4742.C4746 r0, android.app.PendingIntent r1, android.content.Intent r2, int r3, java.lang.String r4, android.os.Bundle r5) {
                r0.m18927(r1, r2, r3, r4, r5)
                return
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                boolean r0 = r1.f15054
                if (r0 != 0) goto L7
                r0 = 0
                r1.f15053 = r0
            L7:
                java.util.concurrent.CountDownLatch r0 = r1.f15052
                r0.countDown()
                return
        }

        public void complete() {
                r1 = this;
                r0 = 1
                r1.f15054 = r0
                return
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public android.app.PendingIntent.OnFinished m18926() {
                r1 = this;
                android.app.PendingIntent$OnFinished r0 = r1.f15053
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                Yue.ۥۡۤ۠ r0 = new Yue.ۥۡۤ۠
                r0.<init>(r1)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m18927(android.app.PendingIntent r8, android.content.Intent r9, int r10, java.lang.String r11, android.os.Bundle r12) {
                r7 = this;
                r0 = 0
            L1:
                java.util.concurrent.CountDownLatch r1 = r7.f15052     // Catch: java.lang.Throwable -> L1f java.lang.InterruptedException -> L2a
                r1.await()     // Catch: java.lang.Throwable -> L1f java.lang.InterruptedException -> L2a
                if (r0 == 0) goto Lf
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            Lf:
                android.app.PendingIntent$OnFinished r1 = r7.f15053
                if (r1 == 0) goto L1e
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r1.onSendFinished(r2, r3, r4, r5, r6)
                r8 = 0
                r7.f15053 = r8
            L1e:
                return
            L1f:
                r8 = move-exception
                if (r0 == 0) goto L29
                java.lang.Thread r9 = java.lang.Thread.currentThread()
                r9.interrupt()
            L29:
                throw r8
            L2a:
                r0 = 1
                goto L1
        }
    }

    public C4742() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static int m18912(boolean r1, int r2) {
            if (r1 == 0) goto Lc
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto Lf
            r1 = 33554432(0x2000000, float:9.403955E-38)
        La:
            r2 = r2 | r1
            goto Lf
        Lc:
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            goto La
        Lf:
            return r2
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static android.app.PendingIntent m18913(@Yue.InterfaceC4410 android.content.Context r0, int r1, @Yue.InterfaceC4410 @android.annotation.SuppressLint({"ArrayReturn"}) android.content.Intent[] r2, int r3, @Yue.InterfaceC4544 android.os.Bundle r4, boolean r5) {
            int r3 = m18912(r5, r3)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivities(r0, r1, r2, r3, r4)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static android.app.PendingIntent m18914(@Yue.InterfaceC4410 android.content.Context r0, int r1, @Yue.InterfaceC4410 @android.annotation.SuppressLint({"ArrayReturn"}) android.content.Intent[] r2, int r3, boolean r4) {
            int r3 = m18912(r4, r3)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivities(r0, r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static android.app.PendingIntent m18915(@Yue.InterfaceC4410 android.content.Context r0, int r1, @Yue.InterfaceC4410 android.content.Intent r2, int r3, @Yue.InterfaceC4544 android.os.Bundle r4, boolean r5) {
            int r3 = m18912(r5, r3)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r0, r1, r2, r3, r4)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static android.app.PendingIntent m18916(@Yue.InterfaceC4410 android.content.Context r0, int r1, @Yue.InterfaceC4410 android.content.Intent r2, int r3, boolean r4) {
            int r3 = m18912(r4, r3)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r0, r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static android.app.PendingIntent m18917(@Yue.InterfaceC4410 android.content.Context r0, int r1, @Yue.InterfaceC4410 android.content.Intent r2, int r3, boolean r4) {
            int r3 = m18912(r4, r3)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r0, r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5336(26)
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static android.app.PendingIntent m18918(@Yue.InterfaceC4410 android.content.Context r0, int r1, @Yue.InterfaceC4410 android.content.Intent r2, int r3, boolean r4) {
            int r3 = m18912(r4, r3)
            android.app.PendingIntent r0 = Yue.C4742.C4744.m18924(r0, r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static android.app.PendingIntent m18919(@Yue.InterfaceC4410 android.content.Context r0, int r1, @Yue.InterfaceC4410 android.content.Intent r2, int r3, boolean r4) {
            int r3 = m18912(r4, r3)
            android.app.PendingIntent r0 = android.app.PendingIntent.getService(r0, r1, r2, r3)
            return r0
    }

    @android.annotation.SuppressLint({"LambdaLast"})
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m18920(@Yue.InterfaceC4410 android.app.PendingIntent r1, int r2, @Yue.InterfaceC4544 android.app.PendingIntent.OnFinished r3, @Yue.InterfaceC4544 android.os.Handler r4) throws android.app.PendingIntent.CanceledException {
            Yue.ۥۡۤ۟ۨ$ۥ۟۟۟ r0 = new Yue.ۥۡۤ۟ۨ$ۥ۟۟۟
            r0.<init>(r3)
            android.app.PendingIntent$OnFinished r3 = r0.m18926()     // Catch: java.lang.Throwable -> L13
            r1.send(r2, r3, r4)     // Catch: java.lang.Throwable -> L13
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

    @android.annotation.SuppressLint({"LambdaLast"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static void m18921(@Yue.InterfaceC4410 android.app.PendingIntent r8, @Yue.InterfaceC4410 @android.annotation.SuppressLint({"ContextFirst"}) android.content.Context r9, int r10, @Yue.InterfaceC4410 android.content.Intent r11, @Yue.InterfaceC4544 android.app.PendingIntent.OnFinished r12, @Yue.InterfaceC4544 android.os.Handler r13) throws android.app.PendingIntent.CanceledException {
            r6 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            m18922(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @android.annotation.SuppressLint({"LambdaLast"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m18922(@Yue.InterfaceC4410 android.app.PendingIntent r1, @Yue.InterfaceC4410 @android.annotation.SuppressLint({"ContextFirst"}) android.content.Context r2, int r3, @Yue.InterfaceC4410 android.content.Intent r4, @Yue.InterfaceC4544 android.app.PendingIntent.OnFinished r5, @Yue.InterfaceC4544 android.os.Handler r6, @Yue.InterfaceC4544 java.lang.String r7, @Yue.InterfaceC4544 android.os.Bundle r8) throws android.app.PendingIntent.CanceledException {
            Yue.ۥۡۤ۟ۨ$ۥ۟۟۟ r0 = new Yue.ۥۡۤ۟ۨ$ۥ۟۟۟
            r0.<init>(r5)
            Yue.C4742.C4743.m18923(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lf
            r0.complete()     // Catch: java.lang.Throwable -> Lf
            r0.close()
            return
        Lf:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L14
            goto L18
        L14:
            r2 = move-exception
            r1.addSuppressed(r2)
        L18:
            throw r1
    }
}
