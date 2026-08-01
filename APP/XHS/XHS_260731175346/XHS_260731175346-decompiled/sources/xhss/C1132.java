package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛳᛷᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1132 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public long f3654;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public long f3655;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final int f3656;

    public C1132(int r1) {
            r0 = this;
            r0.<init>()
            r0.f3656 = r1
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static void m1824(xhss.C1132 r3, long r4, long r6, int r8) {
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
            long r0 = r3.f3654     // Catch: java.lang.Throwable -> L2d
            long r0 = r0 + r4
            r3.f3654 = r0     // Catch: java.lang.Throwable -> L2d
            long r4 = r3.f3655     // Catch: java.lang.Throwable -> L2d
            long r4 = r4 + r6
            r3.f3655 = r4     // Catch: java.lang.Throwable -> L2d
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

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "WindowCounter(streamId="
            r0.<init>(r1)
            int r1 = r3.f3656
            r0.append(r1)
            java.lang.String r1 = ", total="
            r0.append(r1)
            long r1 = r3.f3654
            r0.append(r1)
            java.lang.String r1 = ", acknowledged="
            r0.append(r1)
            long r1 = r3.f3655
            r0.append(r1)
            java.lang.String r1 = ", unacknowledged="
            r0.append(r1)
            long r1 = r3.m1825()
            r0.append(r1)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final synchronized long m1825() {
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.f3654     // Catch: java.lang.Throwable -> L8
            long r2 = r4.f3655     // Catch: java.lang.Throwable -> L8
            long r0 = r0 - r2
            monitor-exit(r4)
            return r0
        L8:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L8
            throw r0
    }
}
