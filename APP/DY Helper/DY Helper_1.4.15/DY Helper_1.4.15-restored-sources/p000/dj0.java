package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class dj0 {

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.ScheduledExecutorService f3185 = null;

    /* JADX INFO: renamed from: α */
    public final p000.hi0 f3186;

    /* JADX INFO: renamed from: β */
    public final java.util.concurrent.ScheduledExecutorService f3187;

    static {
            aj r0 = new aj
            r1 = 11
            r0.<init>(r1)
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(r0)
            p000.dj0.f3185 = r0
            return
    }

    public dj0(p000.hi0 r2) {
            r1 = this;
            java.util.concurrent.ScheduledExecutorService r0 = p000.dj0.f3185
            r0.getClass()
            r1.<init>()
            r1.f3186 = r2
            r1.f3187 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m1752(p000.cj0 r4) {
            boolean r0 = r4.f2165
            if (r0 == 0) goto L5
            goto L42
        L5:
            r0 = 1
            r4.f2165 = r0
            java.util.concurrent.ScheduledFuture r0 = r4.f2167
            if (r0 == 0) goto L10
            r1 = 0
            r0.cancel(r1)
        L10:
            r0 = 0
            r4.f2167 = r0
            hi0 r1 = r4.f2168     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L20
            java.lang.Object r1 = r1.f4745     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            java.util.concurrent.ConcurrentHashMap r2 = p000.wi0.f11733     // Catch: java.lang.Throwable -> L20
            r2.remove(r1)     // Catch: java.lang.Throwable -> L20
        L20:
            r4.f2168 = r0
            r4.f2166 = r0
            ji0 r0 = r4.f2161     // Catch: java.lang.Throwable -> L42
            java.util.ArrayList r4 = r4.f2162     // Catch: java.lang.Throwable -> L42
            java.util.List r4 = p000.AbstractC0984xh.m6666(r4)     // Catch: java.lang.Throwable -> L42
            java.util.concurrent.ExecutorService r1 = p000.mi0.f7161     // Catch: java.lang.Throwable -> L42
            li0 r2 = r0.f5477     // Catch: java.lang.Throwable -> L42
            fi0 r3 = new fi0     // Catch: java.lang.Throwable -> L42
            r3.<init>(r0, r2)     // Catch: java.lang.Throwable -> L42
            r1.execute(r3)     // Catch: java.lang.Throwable -> L42
            p3 r0 = new p3     // Catch: java.lang.Throwable -> L42
            r1 = 24
            r0.<init>(r2, r1, r4)     // Catch: java.lang.Throwable -> L42
            r2.m3571(r0)     // Catch: java.lang.Throwable -> L42
        L42:
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m1753(p000.cj0 r5, java.util.concurrent.atomic.AtomicBoolean r6, p000.hj0 r7) {
            r4 = this;
            boolean r0 = r5.f2165
            java.util.ArrayList r1 = r5.f2162
            if (r0 == 0) goto L7
            goto L14
        L7:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f2166
            if (r0 == r6) goto Lc
            goto L14
        Lc:
            r0 = 0
            r2 = 1
            boolean r6 = r6.compareAndSet(r0, r2)
            if (r6 != 0) goto L15
        L14:
            return
        L15:
            java.util.concurrent.ScheduledFuture r6 = r5.f2167
            if (r6 == 0) goto L1c
            r6.cancel(r0)
        L1c:
            r6 = 0
            r5.f2167 = r6
            hi0 r0 = r5.f2168     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r0.f4745     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.ConcurrentHashMap r3 = p000.wi0.f11733     // Catch: java.lang.Throwable -> L2c
            r3.remove(r0)     // Catch: java.lang.Throwable -> L2c
        L2c:
            r5.f2168 = r6
            r5.f2166 = r6
            int r6 = r5.f2163
            int r6 = r6 + r2
            r5.f2163 = r6
            r1.add(r7)
            ji0 r6 = r5.f2161     // Catch: java.lang.Throwable -> L47
            int r0 = r1.size()     // Catch: java.lang.Throwable -> L47
            java.util.ArrayList r1 = r5.f2160     // Catch: java.lang.Throwable -> L47
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L47
            r6.m2960(r0, r1, r7)     // Catch: java.lang.Throwable -> L47
        L47:
            r4.m1754(r5)
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m1754(p000.cj0 r10) {
            r9 = this;
            boolean r0 = r10.f2165
            java.util.ArrayList r1 = r10.f2160
            if (r0 != 0) goto L99
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.f2166
            if (r0 == 0) goto Lc
            goto L99
        Lc:
            boolean r0 = r10.f2164
            if (r0 == 0) goto L44
        L10:
            int r9 = r10.f2163
            java.util.ArrayList r0 = r10.f2162
            int r2 = r1.size()
            if (r9 >= r2) goto L40
            int r9 = r10.f2163
            int r2 = r9 + 1
            r10.f2163 = r2
            java.lang.Object r9 = r1.get(r9)
            xi0 r9 = (p000.xi0) r9
            hj0 r2 = new hj0
            yi0 r3 = p000.yi0.f12638
            java.lang.String r4 = "用户停止了后续删除"
            r2.<init>(r9, r3, r4)
            r0.add(r2)
            ji0 r9 = r10.f2161     // Catch: java.lang.Throwable -> L10
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L10
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L10
            r9.m2960(r0, r3, r2)     // Catch: java.lang.Throwable -> L10
            goto L10
        L40:
            m1752(r10)
            return
        L44:
            int r0 = r10.f2163
            java.lang.Object r0 = p000.AbstractC0984xh.m6641(r0, r1)
            r5 = r0
            xi0 r5 = (p000.xi0) r5
            if (r5 != 0) goto L53
            m1752(r10)
            return
        L53:
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r4.<init>(r0)
            r10.f2166 = r4
            aj0 r1 = new aj0
            r6 = 0
            r2 = r9
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r9 = 20000(0x4e20, double:9.8813E-320)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledExecutorService r8 = r2.f3187
            java.util.concurrent.ScheduledFuture r9 = r8.schedule(r1, r9, r0)
            r3.f2167 = r9
            i0 r9 = new i0
            r9.<init>(r2, r3, r4, r5)
            hi0 r10 = r2.f3186     // Catch: java.lang.Throwable -> L7f
            java.lang.String r0 = r5.f12180     // Catch: java.lang.Throwable -> L7f
            hi0 r9 = r10.m2509(r0, r9)     // Catch: java.lang.Throwable -> L7f
            r3.f2168 = r9     // Catch: java.lang.Throwable -> L7f
            return
        L7f:
            r0 = move-exception
            r9 = r0
            java.lang.String r10 = r9.getMessage()
            if (r10 != 0) goto L8f
            java.lang.Class r9 = r9.getClass()
            java.lang.String r10 = r9.getSimpleName()
        L8f:
            r6 = r10
            bj0 r1 = new bj0
            r7 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.execute(r1)
        L99:
            return
    }
}
