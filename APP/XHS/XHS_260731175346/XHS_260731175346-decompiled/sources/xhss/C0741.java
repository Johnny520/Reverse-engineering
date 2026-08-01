package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛳᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0741 implements xhss.InterfaceC0268 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final int f2478;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0927 f2479;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public long f2480;

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public final xhss.C0471 f2481;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final xhss.C0090 f2482;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public boolean f2483;

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public int f2484;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final xhss.C0842 f2485;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final java.util.ArrayDeque f2486;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.C1132 f2487;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public long f2488;

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public java.io.IOException f2489;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final xhss.C0471 f2490;

    public C0741(int r4, xhss.C0927 r5, boolean r6, boolean r7, xhss.C0972 r8) {
            r3 = this;
            r3.<init>()
            r3.f2478 = r4
            r3.f2479 = r5
            xhss.ᲈᛳᛷᲀ r0 = new xhss.ᲈᛳᛷᲀ
            r0.<init>(r4)
            r3.f2487 = r0
            xhss.ᛴᲇᛳᲇ r4 = r5.f2993
            int r4 = r4.m805()
            long r0 = (long) r4
            r3.f2488 = r0
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            r3.f2486 = r4
            xhss.ᛱᲀᲇᛳ r0 = new xhss.ᛱᲀᲇᛳ
            xhss.ᛴᲇᛳᲇ r5 = r5.f2997
            int r5 = r5.m805()
            long r1 = (long) r5
            r0.<init>(r3, r1, r7)
            r3.f2482 = r0
            xhss.ᲀᛲᲀᲁ r5 = new xhss.ᲀᛲᲀᲁ
            r5.<init>(r3, r6)
            r3.f2485 = r5
            xhss.ᛵᛴᲇ r5 = new xhss.ᛵᛴᲇ
            r5.<init>(r3)
            r3.f2490 = r5
            xhss.ᛵᛴᲇ r5 = new xhss.ᛵᛴᲇ
            r5.<init>(r3)
            r3.f2481 = r5
            r5 = 0
            if (r8 == 0) goto L54
            boolean r3 = r3.m1282()
            if (r3 != 0) goto L4e
            r4.add(r8)
            return
        L4e:
            java.lang.String r3 = "locally-initiated streams shouldn't have headers yet"
            xhss.C0532.m950(r3)
            throw r5
        L54:
            boolean r3 = r3.m1282()
            if (r3 == 0) goto L5b
            return
        L5b:
            java.lang.String r3 = "remotely-initiated streams should have headers"
            xhss.C0532.m950(r3)
            throw r5
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m1279() {
            r2 = this;
            xhss.ᲀᛲᲀᲁ r0 = r2.f2485
            boolean r1 = r0.f2729
            if (r1 != 0) goto L26
            boolean r0 = r0.f2726
            if (r0 != 0) goto L20
            int r0 = r2.m1283()
            if (r0 == 0) goto L1f
            java.io.IOException r0 = r2.f2489
            if (r0 == 0) goto L15
            goto L1e
        L15:
            xhss.ᛱᲁᛲᛱ r0 = new xhss.ᛱᲁᛲᛱ
            int r2 = r2.m1283()
            r0.<init>(r2)
        L1e:
            throw r0
        L1f:
            return
        L20:
            java.lang.String r2 = "stream finished"
            xhss.C0532.m947(r2)
            return
        L26:
            java.lang.String r2 = "stream closed"
            xhss.C0532.m947(r2)
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final void m1280(int r1, java.io.IOException r2) {
            r0 = this;
            boolean r2 = r0.m1286(r1, r2)
            if (r2 != 0) goto L7
            return
        L7:
            int r2 = r0.f2478
            xhss.ᲁᛲᛵ r0 = r0.f2479
            xhss.ᲀᛱᛶᛳ r0 = r0.f3003
            r0.m1415(r2, r1)
            return
    }

    @Override // xhss.InterfaceC0268
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public final xhss.InterfaceC1095 mo527() {
            r0 = this;
            xhss.ᛱᲀᲇᛳ r0 = r0.f2482
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m1281() {
            r2 = this;
            java.util.TimeZone r0 = xhss.AbstractC0559.f1984
            monitor-enter(r2)
            xhss.ᛱᲀᲇᛳ r0 = r2.f2482     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f440     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1c
            boolean r0 = r0.f444     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            xhss.ᲀᛲᲀᲁ r0 = r2.f2485     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f2726     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            boolean r0 = r0.f2729     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            goto L1a
        L18:
            r0 = move-exception
            goto L35
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            boolean r1 = r2.m1284()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            if (r0 == 0) goto L2b
            r0 = 9
            r1 = 0
            r2.m1280(r0, r1)
            return
        L2b:
            if (r1 != 0) goto L34
            xhss.ᲁᛲᛵ r0 = r2.f2479
            int r2 = r2.f2478
            r0.m1526(r2)
        L34:
            return
        L35:
            monitor-exit(r2)
            throw r0
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final boolean m1282() {
            r3 = this;
            int r0 = r3.f2478
            r1 = 1
            r0 = r0 & r1
            r2 = 0
            if (r0 != r1) goto L9
            r0 = r1
            goto La
        L9:
            r0 = r2
        La:
            xhss.ᲁᛲᛵ r3 = r3.f2479
            r3.getClass()
            if (r1 != r0) goto L12
            return r1
        L12:
            return r2
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final int m1283() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.f2484     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final boolean m1284() {
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.m1283()     // Catch: java.lang.Throwable -> L15
            r1 = 0
            if (r0 == 0) goto La
            monitor-exit(r3)
            return r1
        La:
            xhss.ᛱᲀᲇᛳ r0 = r3.f2482     // Catch: java.lang.Throwable -> L15
            boolean r2 = r0.f440     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L17
            boolean r0 = r0.f444     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L27
            goto L17
        L15:
            r0 = move-exception
            goto L2a
        L17:
            xhss.ᲀᛲᲀᲁ r0 = r3.f2485     // Catch: java.lang.Throwable -> L15
            boolean r2 = r0.f2726     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L21
            boolean r0 = r0.f2729     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L27
        L21:
            boolean r0 = r3.f2483     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L27
            monitor-exit(r3)
            return r1
        L27:
            monitor-exit(r3)
            r3 = 1
            return r3
        L2a:
            monitor-exit(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final void m1285(int r2) {
            r1 = this;
            r0 = 0
            boolean r0 = r1.m1286(r2, r0)
            if (r0 != 0) goto L8
            return
        L8:
            xhss.ᲁᛲᛵ r0 = r1.f2479
            int r1 = r1.f2478
            r0.m1524(r1, r2)
            return
    }

    @Override // xhss.InterfaceC0268
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public final xhss.InterfaceC0102 mo535() {
            r0 = this;
            xhss.ᲀᛲᲀᲁ r0 = r0.f2485
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final boolean m1286(int r3, java.io.IOException r4) {
            r2 = this;
            java.util.TimeZone r0 = xhss.AbstractC0559.f1984
            monitor-enter(r2)
            int r0 = r2.m1283()     // Catch: java.lang.Throwable -> L21
            r1 = 0
            if (r0 == 0) goto Lc
            monitor-exit(r2)
            return r1
        Lc:
            r2.f2484 = r3     // Catch: java.lang.Throwable -> L21
            r2.f2489 = r4     // Catch: java.lang.Throwable -> L21
            r2.notifyAll()     // Catch: java.lang.Throwable -> L21
            xhss.ᛱᲀᲇᛳ r3 = r2.f2482     // Catch: java.lang.Throwable -> L21
            boolean r3 = r3.f440     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L23
            xhss.ᲀᛲᲀᲁ r3 = r2.f2485     // Catch: java.lang.Throwable -> L21
            boolean r3 = r3.f2726     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L23
            monitor-exit(r2)
            return r1
        L21:
            r3 = move-exception
            goto L2d
        L23:
            monitor-exit(r2)
            xhss.ᲁᛲᛵ r3 = r2.f2479
            int r2 = r2.f2478
            r3.m1526(r2)
            r2 = 1
            return r2
        L2d:
            monitor-exit(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final void m1287(xhss.C0972 r3, boolean r4) {
            r2 = this;
            java.util.TimeZone r0 = xhss.AbstractC0559.f1984
            monitor-enter(r2)
            boolean r0 = r2.f2483     // Catch: java.lang.Throwable -> L1f
            r1 = 1
            if (r0 == 0) goto L21
            java.lang.String r0 = ":status"
            java.lang.String r0 = r3.m1605(r0)     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L21
            java.lang.String r0 = ":method"
            java.lang.String r0 = r3.m1605(r0)     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L19
            goto L21
        L19:
            xhss.ᛱᲀᲇᛳ r3 = r2.f2482     // Catch: java.lang.Throwable -> L1f
            r3.getClass()     // Catch: java.lang.Throwable -> L1f
            goto L28
        L1f:
            r3 = move-exception
            goto L40
        L21:
            r2.f2483 = r1     // Catch: java.lang.Throwable -> L1f
            java.util.ArrayDeque r0 = r2.f2486     // Catch: java.lang.Throwable -> L1f
            r0.add(r3)     // Catch: java.lang.Throwable -> L1f
        L28:
            if (r4 == 0) goto L2e
            xhss.ᛱᲀᲇᛳ r3 = r2.f2482     // Catch: java.lang.Throwable -> L1f
            r3.f440 = r1     // Catch: java.lang.Throwable -> L1f
        L2e:
            boolean r3 = r2.m1284()     // Catch: java.lang.Throwable -> L1f
            r2.notifyAll()     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r2)
            if (r3 != 0) goto L3f
            xhss.ᲁᛲᛵ r3 = r2.f2479
            int r2 = r2.f2478
            r3.m1526(r2)
        L3f:
            return
        L40:
            monitor-exit(r2)
            throw r3
    }
}
