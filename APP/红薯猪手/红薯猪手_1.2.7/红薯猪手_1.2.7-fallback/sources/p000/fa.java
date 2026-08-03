package p000;

/* JADX INFO: loaded from: classes.dex */
public final class fa {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final p000.e0 f364;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final ۟.fa.a f365;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public long f366;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public long f367;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public long f368;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public long f369;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public long f370;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public long f371;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public long f372;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public long f373;

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public int f374;

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public int f375;

    /* JADX INFO: renamed from: ۥ۠, reason: contains not printable characters */
    public int f376;

    public static class a extends android.os.Handler {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final p000.fa f377;

        /* JADX INFO: renamed from: ۟.fa$a$a, reason: collision with other inner class name */
        public class RunnableC0010a implements java.lang.Runnable {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final /* synthetic */ android.os.Message f378;

            public RunnableC0010a(android.os.Message r1) {
                    r0 = this;
                    r0.f378 = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public final void run() {
                    r3 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    java.lang.String r1 = "Unhandled stats message."
                    java.lang.StringBuilder r1 = p000.c4.m108(r1)
                    android.os.Message r2 = r3.f378
                    int r2 = r2.what
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }
        }

        public a(android.os.Looper r1, p000.fa r2) {
                r0 = this;
                r0.<init>(r1)
                r0.f377 = r2
                return
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message r6) {
                r5 = this;
                int r0 = r6.what
                r1 = 1
                if (r0 == 0) goto L6a
                r3 = 1
                if (r0 == r3) goto L62
                r1 = 2
                if (r0 == r1) goto L4e
                r1 = 3
                if (r0 == r1) goto L38
                r1 = 4
                if (r0 == r1) goto L1d
                ۟.z7$a r0 = p000.z7.f1248
                ۟.fa$a$a r1 = new ۟.fa$a$a
                r1.<init>(r6)
                r0.post(r1)
                goto L71
            L1d:
                ۟.fa r0 = r5.f377
                java.lang.Object r6 = r6.obj
                java.lang.Long r6 = (java.lang.Long) r6
                int r1 = r0.f374
                int r1 = r1 + r3
                r0.f374 = r1
                long r1 = r0.f368
                long r3 = r6.longValue()
                long r3 = r3 + r1
                r0.f368 = r3
                int r6 = r0.f374
                long r1 = (long) r6
                long r3 = r3 / r1
                r0.f371 = r3
                goto L71
            L38:
                ۟.fa r0 = r5.f377
                int r6 = r6.arg1
                long r1 = (long) r6
                int r6 = r0.f376
                int r6 = r6 + r3
                r0.f376 = r6
                long r3 = r0.f370
                long r3 = r3 + r1
                r0.f370 = r3
                int r6 = r0.f375
                long r1 = (long) r6
                long r3 = r3 / r1
                r0.f373 = r3
                goto L71
            L4e:
                ۟.fa r0 = r5.f377
                int r6 = r6.arg1
                long r1 = (long) r6
                int r6 = r0.f375
                int r6 = r6 + r3
                r0.f375 = r6
                long r3 = r0.f369
                long r3 = r3 + r1
                r0.f369 = r3
                long r1 = (long) r6
                long r3 = r3 / r1
                r0.f372 = r3
                goto L71
            L62:
                ۟.fa r6 = r5.f377
                long r3 = r6.f367
                long r3 = r3 + r1
                r6.f367 = r3
                goto L71
            L6a:
                ۟.fa r6 = r5.f377
                long r3 = r6.f366
                long r3 = r3 + r1
                r6.f366 = r3
            L71:
                return
        }
    }

    public fa(p000.e0 r5) {
            r4 = this;
            r4.<init>()
            r4.f364 = r5
            android.os.HandlerThread r5 = new android.os.HandlerThread
            java.lang.String r0 = "Picasso-Stats"
            r1 = 10
            r5.<init>(r0, r1)
            r5.start()
            android.os.Looper r0 = r5.getLooper()
            java.lang.StringBuilder r1 = p000.ic.f502
            ۟.hc r1 = new ۟.hc
            r1.<init>(r0)
            android.os.Message r0 = r1.obtainMessage()
            r2 = 1000(0x3e8, double:4.94E-321)
            r1.sendMessageDelayed(r0, r2)
            ۟.fa$a r0 = new ۟.fa$a
            android.os.Looper r5 = r5.getLooper()
            r0.<init>(r5, r4)
            r4.f365 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final p000.ga m162() {
            r28 = this;
            r1 = r28
            ۟.ga r0 = new ۟.ga
            ۟.e0 r2 = r1.f364
            ۟.h5 r2 = (p000.h5) r2
            monitor-enter(r2)
            int r3 = r2.f441     // Catch: java.lang.Throwable -> L46
            monitor-exit(r2)
            ۟.e0 r2 = r1.f364
            ۟.h5 r2 = (p000.h5) r2
            monitor-enter(r2)
            int r4 = r2.f442     // Catch: java.lang.Throwable -> L42
            monitor-exit(r2)
            long r5 = r1.f366
            long r7 = r1.f367
            long r9 = r1.f368
            long r11 = r1.f369
            long r13 = r1.f370
            r26 = r5
            long r5 = r1.f371
            r15 = r5
            long r5 = r1.f372
            r17 = r5
            long r5 = r1.f373
            r19 = r5
            int r2 = r1.f374
            r21 = r2
            int r2 = r1.f375
            r22 = r2
            int r2 = r1.f376
            r23 = r2
            long r24 = java.lang.System.currentTimeMillis()
            r2 = r0
            r5 = r26
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r15, r17, r19, r21, r22, r23, r24)
            return r0
        L42:
            r0 = move-exception
            r3 = r0
            monitor-exit(r2)
            throw r3
        L46:
            r0 = move-exception
            r3 = r0
            monitor-exit(r2)
            throw r3
    }
}
