package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class e62 {

    /* JADX INFO: renamed from: ε */
    public static p000.e62 f3421;

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f3422;

    /* JADX INFO: renamed from: β */
    public int f3423;

    /* JADX INFO: renamed from: γ */
    public long f3424;

    /* JADX INFO: renamed from: δ */
    public long f3425;

    public /* synthetic */ e62() {
            r1 = this;
            r0 = 0
            r1.f3422 = r0
            r1.<init>()
            return
    }

    public e62(int r2) {
            r1 = this;
            r0 = 1
            r1.f3422 = r0
            r1.<init>()
            r1.f3423 = r2
            return
    }

    /* JADX INFO: renamed from: γ */
    public static void m1850(p000.e62 r3, long r4, long r6, int r8) {
            r0 = r8 & 1
            r1 = 0
            if (r0 == 0) goto L7
            r4 = r1
        L7:
            r8 = r8 & 2
            if (r8 == 0) goto Lc
            r6 = r1
        Lc:
            monitor-enter(r3)
            int r8 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r8 < 0) goto L37
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 < 0) goto L2f
            long r0 = r3.f3424     // Catch: java.lang.Throwable -> L2d
            long r0 = r0 + r4
            r3.f3424 = r0     // Catch: java.lang.Throwable -> L2d
            long r4 = r3.f3425     // Catch: java.lang.Throwable -> L2d
            long r4 = r4 + r6
            r3.f3425 = r4     // Catch: java.lang.Throwable -> L2d
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 > 0) goto L25
            monitor-exit(r3)
            return
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2d
            java.lang.String r5 = "Check failed."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2d
            throw r4     // Catch: java.lang.Throwable -> L2d
        L2d:
            r4 = move-exception
            goto L3f
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2d
            java.lang.String r5 = "Check failed."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2d
            throw r4     // Catch: java.lang.Throwable -> L2d
        L37:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2d
            java.lang.String r5 = "Check failed."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2d
            throw r4     // Catch: java.lang.Throwable -> L2d
        L3f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2d
            throw r4
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.f3422
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r3 = super.toString()
            return r3
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "WindowCounter(streamId="
            r0.<init>(r1)
            int r1 = r3.f3423
            r0.append(r1)
            java.lang.String r1 = ", total="
            r0.append(r1)
            long r1 = r3.f3424
            r0.append(r1)
            java.lang.String r1 = ", acknowledged="
            r0.append(r1)
            long r1 = r3.f3425
            r0.append(r1)
            java.lang.String r1 = ", unacknowledged="
            r0.append(r1)
            long r1 = r3.m1852()
            r0.append(r1)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: α */
    public void m1851(long r15, double r17, double r19) {
            r14 = this;
            r0 = 946728000000(0xdc6d62da00, double:4.67745780756E-312)
            long r2 = r15 - r0
            float r2 = (float) r2
            r3 = 1285868416(0x4ca4cb80, float:8.64E7)
            float r2 = r2 / r3
            r3 = 1015868197(0x3c8ceb25, float:0.01720197)
            float r3 = r3 * r2
            r4 = 1086828178(0x40c7ae92, float:6.24006)
            float r3 = r3 + r4
            double r4 = (double) r3
            r6 = 4584977093208571904(0x3fa11c5fc0000000, double:0.03341960161924362)
            double r8 = java.lang.Math.sin(r4)
            double r8 = r8 * r6
            double r8 = r8 + r4
            r6 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 * r3
            double r6 = (double) r6
            double r6 = java.lang.Math.sin(r6)
            r10 = 4555074754578481152(0x3f36e05b00000000, double:3.4906598739326E-4)
            double r6 = r6 * r10
            double r6 = r6 + r8
            r8 = 1077936128(0x40400000, float:3.0)
            float r3 = r3 * r8
            double r8 = (double) r3
            double r8 = java.lang.Math.sin(r8)
            r10 = 4527795603731644416(0x3ed5f61cc0000000, double:5.236000106378924E-6)
            double r8 = r8 * r10
            double r8 = r8 + r6
            r6 = 4610769955021710130(0x3ffcbed85e1ce332, double:1.796593063)
            double r8 = r8 + r6
            r6 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r8 = r8 + r6
            r6 = r19
            double r6 = -r6
            r10 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r6 = r6 / r10
            r3 = 980151802(0x3a6bedfa, float:9.0E-4)
            float r2 = r2 - r3
            double r10 = (double) r2
            double r10 = r10 - r6
            long r10 = java.lang.Math.round(r10)
            float r2 = (float) r10
            float r2 = r2 + r3
            double r2 = (double) r2
            double r2 = r2 + r6
            r6 = 4572760506128099233(0x3f75b573eab367a1, double:0.0053)
            double r4 = java.lang.Math.sin(r4)
            double r4 = r4 * r6
            double r4 = r4 + r2
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = r2 * r8
            double r2 = java.lang.Math.sin(r2)
            r6 = -4648766856319305620(0xbf7c432ca57a786c, double:-0.0069)
            double r2 = r2 * r6
            double r2 = r2 + r4
            double r4 = java.lang.Math.sin(r8)
            r6 = 4601044547609296896(0x3fda31a380000000, double:0.4092797040939331)
            double r6 = java.lang.Math.sin(r6)
            double r6 = r6 * r4
            double r4 = java.lang.Math.asin(r6)
            r6 = 4580687790437564416(0x3f91df46a0000000, double:0.01745329238474369)
            double r6 = r6 * r17
            r8 = -4631161762379464704(0xbfbaceea00000000, double:-0.10471975803375244)
            double r8 = java.lang.Math.sin(r8)
            double r10 = java.lang.Math.sin(r6)
            double r12 = java.lang.Math.sin(r4)
            double r12 = r12 * r10
            double r8 = r8 - r12
            double r6 = java.lang.Math.cos(r6)
            double r4 = java.lang.Math.cos(r4)
            double r4 = r4 * r6
            double r8 = r8 / r4
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            r5 = 1
            r6 = -1
            if (r4 < 0) goto Lc0
            r14.f3423 = r5
            r14.f3424 = r6
            r14.f3425 = r6
            return
        Lc0:
            r10 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            r10 = 0
            if (r4 > 0) goto Lce
            r14.f3423 = r10
            r14.f3424 = r6
            r14.f3425 = r6
            return
        Lce:
            double r6 = java.lang.Math.acos(r8)
            r8 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r6 = r6 / r8
            float r4 = (float) r6
            double r6 = (double) r4
            double r8 = r2 + r6
            r11 = 4725570615333879808(0x4194997000000000, double:8.64E7)
            double r8 = r8 * r11
            long r8 = java.lang.Math.round(r8)
            long r8 = r8 + r0
            r14.f3424 = r8
            double r2 = r2 - r6
            double r2 = r2 * r11
            long r2 = java.lang.Math.round(r2)
            long r2 = r2 + r0
            r14.f3425 = r2
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 >= 0) goto Lff
            long r0 = r14.f3424
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 <= 0) goto Lff
            r14.f3423 = r10
            return
        Lff:
            r14.f3423 = r5
            return
    }

    /* JADX INFO: renamed from: β */
    public synchronized long m1852() {
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.f3424     // Catch: java.lang.Throwable -> L8
            long r2 = r4.f3425     // Catch: java.lang.Throwable -> L8
            long r0 = r0 - r2
            monitor-exit(r4)
            return r0
        L8:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L8
            throw r0
    }
}
