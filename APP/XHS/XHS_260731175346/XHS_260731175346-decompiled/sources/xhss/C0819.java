package xhss;

/* JADX INFO: renamed from: xhss.ᛸᲇᲇᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0819 implements java.lang.Cloneable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0504 f2659;

    /* JADX INFO: renamed from: ᛳᛶᛷᲀ, reason: contains not printable characters */
    public final java.util.concurrent.CopyOnWriteArrayList f2660;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0355 f2661;

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public boolean f2662;

    /* JADX INFO: renamed from: ᛴᲈᛱᛴ, reason: contains not printable characters */
    public volatile xhss.C1066 f2663;

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public boolean f2664;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public volatile xhss.AbstractC0893 f2665;

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public xhss.C1066 f2666;

    /* JADX INFO: renamed from: ᛸᛲᛷᛱ, reason: contains not printable characters */
    public volatile boolean f2667;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public xhss.InterfaceC0521 f2668;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public android.util.CloseGuard f2669;

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public boolean f2670;

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public boolean f2671;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public xhss.C1184 f2672;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicBoolean f2673;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.C1127 f2674;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.C1187 f2675;

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public boolean f2676;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public boolean f2677;

    static {
            java.lang.Class<xhss.ᲀᲀᛱᲇ> r0 = xhss.AbstractC0893.class
            java.lang.String r1 = "ᛷᛴᛷᛱ"
            java.lang.Class<xhss.ᛸᲇᲇᛶ> r2 = xhss.C0819.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            return
    }

    public C0819(xhss.C0504 r3, xhss.C0355 r4) {
            r2 = this;
            r2.<init>()
            r2.f2659 = r3
            r2.f2661 = r4
            xhss.ᲇᛵᛲᲁ r0 = r3.f1833
            java.lang.Object r0 = r0.f3349
            xhss.ᲈᛲᲀᛵ r0 = (xhss.C1127) r0
            r2.f2674 = r0
            xhss.ᛴᛳᲀᛷ r3 = r3.f1852
            r3.getClass()
            xhss.ᛴᛸᛳᛱ r3 = xhss.AbstractC0893.f2885
            r2.f2665 = r3
            xhss.ᲈᲁᛶᛱ r3 = new xhss.ᲈᲁᛶᛱ
            r3.<init>(r2)
            r0 = 0
            r3.mo481(r0)
            r2.f2675 = r3
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r3.<init>()
            r2.f2673 = r3
            r3 = 1
            r2.f2670 = r3
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r2.f2660 = r3
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            java.lang.Object r3 = r4.f1315
            xhss.ᛳᛴᲀᲁ r3 = (xhss.C0263) r3
            r2.<init>(r3)
            return
    }

    public final java.lang.Object clone() {
            r2 = this;
            xhss.ᛸᲇᲇᛶ r0 = new xhss.ᛸᲇᲇᛶ
            xhss.ᛵᛸᛷᛲ r1 = r2.f2659
            xhss.ᛴᛴᛴᛵ r2 = r2.f2661
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.io.IOException m1383(java.io.IOException r3) {
            r2 = this;
            java.util.TimeZone r0 = xhss.AbstractC0559.f1984
            xhss.ᲈᲁᛲᲇ r0 = r2.f2672
            if (r0 == 0) goto L28
            monitor-enter(r0)
            java.net.Socket r1 = r2.m1387()     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)
            xhss.ᲈᲁᛲᲇ r0 = r2.f2672
            if (r0 != 0) goto L1b
            if (r1 == 0) goto L15
            xhss.AbstractC0559.m987(r1)
        L15:
            xhss.ᲀᲀᛱᲇ r0 = r2.f2665
            r0.getClass()
            goto L28
        L1b:
            if (r1 != 0) goto L1e
            goto L28
        L1e:
            java.lang.String r2 = "Check failed."
            xhss.C0532.m950(r2)
            r2 = 0
            return r2
        L25:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        L28:
            boolean r0 = r2.f2677
            if (r0 == 0) goto L2d
            goto L35
        L2d:
            xhss.ᲈᲁᛶᛱ r0 = r2.f2675
            boolean r0 = r0.m1892()
            if (r0 != 0) goto L37
        L35:
            r0 = r3
            goto L43
        L37:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "timeout"
            r0.<init>(r1)
            if (r3 == 0) goto L43
            r0.initCause(r3)
        L43:
            xhss.ᲀᲀᛱᲇ r2 = r2.f2665
            if (r3 == 0) goto L4b
            r2.getClass()
            return r0
        L4b:
            r2.getClass()
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0871 m1384() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f2673
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L4d
            xhss.ᲈᲁᛶᛱ r0 = r3.f2675
            r0.m1893()
            xhss.ᛵᛳᛸᲇ r0 = xhss.AbstractC0831.f2712
            xhss.ᛵᛳᛸᲇ r0 = xhss.AbstractC0831.f2712
            java.lang.String r1 = "response.body().close()"
            r0.getClass()
            android.util.CloseGuard r0 = new android.util.CloseGuard
            r0.<init>()
            r0.open(r1)
            r3.f2669 = r0
            xhss.ᲀᲀᛱᲇ r0 = r3.f2665
            r0.getClass()
            xhss.ᛵᛸᛷᛲ r0 = r3.f2659     // Catch: java.lang.Throwable -> L40
            xhss.ᲇᛸᛶ r0 = r0.f1840     // Catch: java.lang.Throwable -> L40
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L40
            java.lang.Object r1 = r0.f3447     // Catch: java.lang.Throwable -> L42
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> L42
            r1.add(r3)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            xhss.ᲀᛶᛷᲁ r0 = r3.m1385()     // Catch: java.lang.Throwable -> L40
            xhss.ᛵᛸᛷᛲ r1 = r3.f2659
            xhss.ᲇᛸᛶ r1 = r1.f1840
            r1.m1728(r3)
            return r0
        L40:
            r0 = move-exception
            goto L45
        L42:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            throw r1     // Catch: java.lang.Throwable -> L40
        L45:
            xhss.ᛵᛸᛷᛲ r1 = r3.f2659
            xhss.ᲇᛸᛶ r1 = r1.f1840
            r1.m1728(r3)
            throw r0
        L4d:
            java.lang.String r3 = "Already Executed"
            xhss.C0532.m950(r3)
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final xhss.C0871 m1385() {
            r22 = this;
            r1 = r22
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            xhss.ᛵᛸᛷᛲ r0 = r1.f2659
            java.util.List r0 = r0.f1830
            xhss.AbstractC0648.m1133(r2, r0)
            xhss.ᲇᲀᛵᲀ r0 = new xhss.ᲇᲀᛵᲀ
            r3 = 4
            r0.<init>(r3)
            r2.add(r0)
            xhss.ᲇᲀᛵᲀ r0 = new xhss.ᲇᲀᛵᲀ
            r3 = 2
            r0.<init>(r3)
            r2.add(r0)
            xhss.ᲇᲀᛵᲀ r0 = new xhss.ᲇᲀᛵᲀ
            r3 = 3
            r0.<init>(r3)
            r2.add(r0)
            xhss.ᲇᲀᛵᲀ r0 = xhss.C1079.f3477
            r2.add(r0)
            xhss.ᛵᛸᛷᛲ r0 = r1.f2659
            java.util.List r0 = r0.f1835
            xhss.AbstractC0648.m1133(r2, r0)
            xhss.ᲇᲀᛵᲀ r0 = xhss.C1079.f3476
            r2.add(r0)
            xhss.ᲁᲈᲀᲈ r0 = new xhss.ᲁᲈᲀᲈ
            xhss.ᛴᛴᛴᛵ r5 = r1.f2661
            xhss.ᛵᛸᛷᛲ r3 = r1.f2659
            int r6 = r3.f1855
            int r7 = r3.f1851
            int r8 = r3.f1848
            xhss.ᛳᛴᲀᲁ r9 = r3.f1849
            xhss.ᛲᛷᲀᲇ r10 = r3.f1834
            xhss.ᲇᛵᛲᲁ r11 = r3.f1833
            xhss.ᛳᛴᲀᲁ r12 = r3.f1847
            xhss.ᛳᛴᲀᲁ r13 = r3.f1856
            xhss.ᲈᛷᛴ r14 = r3.f1837
            xhss.ᛳᛴᲀᲁ r15 = r3.f1846
            java.net.ProxySelector r4 = r3.f1841
            r16 = r0
            boolean r0 = r3.f1839
            r17 = r0
            javax.net.SocketFactory r0 = r3.f1854
            r18 = r0
            javax.net.ssl.SSLSocketFactory r0 = r3.f1836
            r19 = r0
            javax.net.ssl.X509TrustManager r0 = r3.f1838
            xhss.ᛵᛶᲀᲇ r3 = r3.f1850
            r21 = r3
            r3 = 0
            r20 = r0
            r0 = r16
            r16 = r4
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r2 = 0
            r3 = 0
            xhss.ᲀᛶᛷᲁ r0 = r0.m1641(r5)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            boolean r4 = r1.f2667     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            if (r4 != 0) goto L83
            r1.m1388(r2)
            return r0
        L83:
            xhss.AbstractC0577.m1041(r0)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            java.lang.String r4 = "Canceled"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            throw r0     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
        L8e:
            r0 = move-exception
            goto L97
        L90:
            r0 = move-exception
            r3 = 1
            java.io.IOException r0 = r1.m1388(r0)     // Catch: java.lang.Throwable -> L8e
            throw r0     // Catch: java.lang.Throwable -> L8e
        L97:
            if (r3 != 0) goto L9c
            r1.m1388(r2)
        L9c:
            throw r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m1386(xhss.C1184 r3) {
            r2 = this;
            java.util.TimeZone r0 = xhss.AbstractC0559.f1984
            xhss.ᲈᲁᛲᲇ r0 = r2.f2672
            if (r0 != 0) goto L15
            r2.f2672 = r3
            java.util.ArrayList r3 = r3.f3824
            xhss.ᛱᛵᲁᲇ r0 = new xhss.ᛱᛵᲁᲇ
            android.util.CloseGuard r1 = r2.f2669
            r0.<init>(r2, r1)
            r3.add(r0)
            return
        L15:
            java.lang.String r2 = "Check failed."
            xhss.C0532.m950(r2)
            return
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final java.net.Socket m1387() {
            r6 = this;
            xhss.ᲈᲁᛲᲇ r0 = r6.f2672
            java.util.TimeZone r1 = xhss.AbstractC0559.f1984
            java.util.ArrayList r1 = r0.f3824
            java.util.Iterator r2 = r1.iterator()
            r3 = 0
        Lb:
            boolean r4 = r2.hasNext()
            r5 = -1
            if (r4 == 0) goto L26
            java.lang.Object r4 = r2.next()
            java.lang.ref.Reference r4 = (java.lang.ref.Reference) r4
            java.lang.Object r4 = r4.get()
            boolean r4 = xhss.AbstractC0007.m97(r4, r6)
            if (r4 == 0) goto L23
            goto L27
        L23:
            int r3 = r3 + 1
            goto Lb
        L26:
            r3 = r5
        L27:
            r2 = 0
            if (r3 == r5) goto L76
            r1.remove(r3)
            r6.f2672 = r2
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L75
            long r3 = java.lang.System.nanoTime()
            r0.f3829 = r3
            xhss.ᲈᛲᲀᛵ r6 = r6.f2674
            java.util.concurrent.ConcurrentLinkedQueue r1 = r6.f3641
            java.util.TimeZone r3 = xhss.AbstractC0559.f1984
            boolean r3 = r0.f3831
            if (r3 != 0) goto L4f
            xhss.ᲇᲀᲀᛷ r0 = r6.f3638
            xhss.ᛷᲀᲁᲇ r6 = r6.f3639
            r3 = 0
            r0.m1739(r6, r3)
            return r2
        L4f:
            r2 = 1
            r0.f3831 = r2
            r1.remove(r0)
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L72
            xhss.ᲇᲀᲀᛷ r6 = r6.f3638
            xhss.ᛸᛱᛴᛳ r1 = r6.f3483
            monitor-enter(r1)
            boolean r2 = r6.m1741()     // Catch: java.lang.Throwable -> L6c
            if (r2 == 0) goto L6e
            xhss.ᛸᛱᛴᛳ r2 = r6.f3483     // Catch: java.lang.Throwable -> L6c
            r2.m1268(r6)     // Catch: java.lang.Throwable -> L6c
            goto L6e
        L6c:
            r6 = move-exception
            goto L70
        L6e:
            monitor-exit(r1)
            goto L72
        L70:
            monitor-exit(r1)
            throw r6
        L72:
            java.net.Socket r6 = r0.f3825
            return r6
        L75:
            return r2
        L76:
            java.lang.String r6 = "Check failed."
            xhss.C0532.m950(r6)
            return r2
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final java.io.IOException m1388(java.io.IOException r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f2670     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            if (r0 == 0) goto L1c
            r2.f2670 = r1     // Catch: java.lang.Throwable -> L1a
            boolean r0 = r2.f2671     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            boolean r0 = r2.f2676     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            boolean r0 = r2.f2662     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            boolean r0 = r2.f2664     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            r1 = 1
            goto L1c
        L1a:
            r3 = move-exception
            goto L25
        L1c:
            monitor-exit(r2)
            if (r1 == 0) goto L24
            java.io.IOException r2 = r2.m1383(r3)
            return r2
        L24:
            return r3
        L25:
            monitor-exit(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final void m1389(boolean r9) {
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.f2670     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L1f
            monitor-exit(r8)
            if (r9 == 0) goto L1b
            xhss.ᲇᛸᛵᛴ r2 = r8.f2663
            if (r2 == 0) goto L1b
            xhss.ᛷᛶᛷᛲ r9 = r2.f3439
            r9.cancel()
            xhss.ᛸᲇᲇᛶ r1 = r2.f3440
            r6 = 1
            r7 = 0
            r3 = 1
            r4 = 1
            r5 = 1
            r1.m1390(r2, r3, r4, r5, r6, r7)
        L1b:
            r9 = 0
            r8.f2666 = r9
            return
        L1f:
            java.lang.String r9 = "released"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L27
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L27
            throw r0     // Catch: java.lang.Throwable -> L27
        L27:
            r0 = move-exception
            r9 = r0
            monitor-exit(r8)
            throw r9
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final java.io.IOException m1390(xhss.C1066 r4, boolean r5, boolean r6, boolean r7, boolean r8, java.io.IOException r9) {
            r3 = this;
            xhss.ᲇᛸᛵᛴ r0 = r3.f2663
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto La
            goto L75
        La:
            monitor-enter(r3)
            r4 = 1
            r0 = 0
            if (r5 == 0) goto L16
            boolean r1 = r3.f2671     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L28
            goto L16
        L14:
            r4 = move-exception
            goto L56
        L16:
            if (r6 == 0) goto L1c
            boolean r1 = r3.f2676     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L28
        L1c:
            if (r8 == 0) goto L22
            boolean r1 = r3.f2662     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L28
        L22:
            if (r7 == 0) goto L58
            boolean r1 = r3.f2664     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L58
        L28:
            if (r5 == 0) goto L2c
            r3.f2671 = r0     // Catch: java.lang.Throwable -> L14
        L2c:
            if (r6 == 0) goto L30
            r3.f2676 = r0     // Catch: java.lang.Throwable -> L14
        L30:
            if (r8 == 0) goto L34
            r3.f2662 = r0     // Catch: java.lang.Throwable -> L14
        L34:
            if (r7 == 0) goto L38
            r3.f2664 = r0     // Catch: java.lang.Throwable -> L14
        L38:
            boolean r5 = r3.f2671     // Catch: java.lang.Throwable -> L14
            if (r5 != 0) goto L4a
            boolean r5 = r3.f2676     // Catch: java.lang.Throwable -> L14
            if (r5 != 0) goto L4a
            boolean r5 = r3.f2662     // Catch: java.lang.Throwable -> L14
            if (r5 != 0) goto L4a
            boolean r5 = r3.f2664     // Catch: java.lang.Throwable -> L14
            if (r5 != 0) goto L4a
            r5 = r4
            goto L4b
        L4a:
            r5 = r0
        L4b:
            if (r5 == 0) goto L52
            boolean r6 = r3.f2670     // Catch: java.lang.Throwable -> L14
            if (r6 != 0) goto L52
            r0 = r4
        L52:
            r2 = r0
            r0 = r5
            r5 = r2
            goto L59
        L56:
            monitor-exit(r3)
            throw r4
        L58:
            r5 = r0
        L59:
            monitor-exit(r3)
            if (r0 == 0) goto L6e
            r6 = 0
            r3.f2663 = r6
            xhss.ᲈᲁᛲᲇ r6 = r3.f2672
            if (r6 == 0) goto L6e
            monitor-enter(r6)
            int r7 = r6.f3830     // Catch: java.lang.Throwable -> L6b
            int r7 = r7 + r4
            r6.f3830 = r7     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r6)
            goto L6e
        L6b:
            r3 = move-exception
            monitor-exit(r6)
            throw r3
        L6e:
            if (r5 == 0) goto L75
            java.io.IOException r3 = r3.m1383(r9)
            return r3
        L75:
            return r9
    }
}
