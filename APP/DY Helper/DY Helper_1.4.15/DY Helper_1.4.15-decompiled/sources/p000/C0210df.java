package p000;

/* JADX INFO: renamed from: df */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0210df {

    /* JADX INFO: renamed from: α */
    public final java.util.concurrent.atomic.AtomicLong f3110;

    /* JADX INFO: renamed from: β */
    public final java.lang.Object f3111;

    /* JADX INFO: renamed from: γ */
    public volatile p000.C0111cf f3112;

    public C0210df() {
            r4 = this;
            r4.<init>()
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = -9223372036854775808
            r0.<init>(r1)
            r4.f3110 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.f3111 = r0
            cf r0 = new cf
            r3 = 0
            r0.<init>(r1, r3)
            r4.f3112 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public final boolean m1734(long r5, p000.p70 r7) {
            r4 = this;
            cf r0 = r4.f3112
            long r1 = r0.f2092
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 >= 0) goto Lb
            boolean r4 = r0.f2091
            return r4
        Lb:
            java.lang.Object r0 = r4.f3111
            monitor-enter(r0)
            cf r1 = r4.f3112     // Catch: java.lang.Throwable -> L19
            long r2 = r1.f2092     // Catch: java.lang.Throwable -> L19
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 >= 0) goto L1b
            boolean r4 = r1.f2091     // Catch: java.lang.Throwable -> L19
            goto L3f
        L19:
            r4 = move-exception
            goto L41
        L1b:
            java.lang.Object r7 = r7.invoke()     // Catch: java.lang.Throwable -> L20
            goto L27
        L20:
            r7 = move-exception
            eo1 r1 = new eo1     // Catch: java.lang.Throwable -> L19
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L19
            r7 = r1
        L27:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L19
            boolean r2 = r7 instanceof p000.eo1     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L2e
            r7 = r1
        L2e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L19
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L19
            cf r1 = new cf     // Catch: java.lang.Throwable -> L19
            r2 = 5000(0x1388, double:2.4703E-320)
            long r5 = r5 + r2
            r1.<init>(r5, r7)     // Catch: java.lang.Throwable -> L19
            r4.f3112 = r1     // Catch: java.lang.Throwable -> L19
            r4 = r7
        L3f:
            monitor-exit(r0)
            return r4
        L41:
            monitor-exit(r0)
            throw r4
    }

    /* JADX INFO: renamed from: β */
    public final boolean m1735(long r8) {
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicLong r0 = r7.f3110
            long r1 = r0.get()
            r3 = -9223372036854775808
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L16
            long r3 = r8 - r1
            r5 = 1500(0x5dc, double:7.41E-321)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L16
            r7 = 0
            return r7
        L16:
            boolean r0 = r0.compareAndSet(r1, r8)
            if (r0 == 0) goto L0
            r7 = 1
            return r7
    }
}
