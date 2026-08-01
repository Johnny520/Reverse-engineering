package defpackage;

/* JADX INFO: renamed from: ᛶᛴᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1065 implements java.lang.Cloneable {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicBoolean f4724;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public defpackage.C1894 f4725;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public boolean f4726;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public android.util.CloseGuard f4727;

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public final java.util.concurrent.CopyOnWriteArrayList f4728;

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public volatile defpackage.C0703 f4729;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public boolean f4730;

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public volatile boolean f4731;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C0871 f4732;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public defpackage.C0703 f4733;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C0478 f4734;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C2225 f4735;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public defpackage.InterfaceC0845 f4736;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public boolean f4737;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public boolean f4738;

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public boolean f4739;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public volatile defpackage.AbstractC0443 f4740;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public boolean f4741;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.C0881 f4742;

    static {
            java.lang.Class<ᛳᛳᲀᲁ> r0 = defpackage.AbstractC0443.class
            java.lang.String r1 = "ᲇᛸᲁᛱ"
            java.lang.Class<ᛶᛴᲈ> r2 = defpackage.C1065.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            return
    }

    public C1065(defpackage.C2225 r3, defpackage.C0478 r4) {
            r2 = this;
            r2.<init>()
            r2.f4735 = r3
            r2.f4734 = r4
            ᛸᲈᛸᲈ r0 = r3.f9499
            java.lang.Object r0 = r0.f7101
            ᛵᛴᛶᛷ r0 = (defpackage.C0871) r0
            r2.f4732 = r0
            ᛷᲀᛸᲁ r3 = r3.f9501
            r3.getClass()
            ᛲᲈᛶᛳ r3 = defpackage.AbstractC0443.f2185
            r2.f4740 = r3
            ᛵᛴᲇᲈ r3 = new ᛵᛴᲇᲈ
            r3.<init>(r2)
            r0 = 0
            r3.mo1365(r0)
            r2.f4742 = r3
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r3.<init>()
            r2.f4724 = r3
            r3 = 1
            r2.f4739 = r3
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r2.f4728 = r3
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            java.lang.Object r3 = r4.f2398
            ᛸᛶᛱᛵ r3 = (defpackage.C1500) r3
            r2.<init>(r3)
            return
    }

    public final java.lang.Object clone() {
            r2 = this;
            ᛶᛴᲈ r0 = new ᛶᛴᲈ
            ᲈᛴᛶᲁ r1 = r2.f4735
            ᛳᛵᛴᛴ r2 = r2.f4734
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final java.io.IOException m2018(java.io.IOException r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f4739     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            if (r0 == 0) goto L1c
            r2.f4739 = r1     // Catch: java.lang.Throwable -> L1a
            boolean r0 = r2.f4737     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            boolean r0 = r2.f4730     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            boolean r0 = r2.f4741     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            boolean r0 = r2.f4738     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            r1 = 1
            goto L1c
        L1a:
            r3 = move-exception
            goto L25
        L1c:
            monitor-exit(r2)
            if (r1 == 0) goto L24
            java.io.IOException r2 = r2.m2024(r3)
            return r2
        L24:
            return r3
        L25:
            monitor-exit(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final java.net.Socket m2019() {
            r6 = this;
            ᲁᛸᛲᛶ r0 = r6.f4725
            java.util.TimeZone r1 = defpackage.AbstractC0508.f2501
            java.util.ArrayList r1 = r0.f8210
            java.util.Iterator r2 = r1.iterator()
            r3 = 0
        Lb:
            boolean r4 = r2.hasNext()
            r5 = -1
            if (r4 == 0) goto L26
            java.lang.Object r4 = r2.next()
            java.lang.ref.Reference r4 = (java.lang.ref.Reference) r4
            java.lang.Object r4 = r4.get()
            boolean r4 = defpackage.AbstractC0498.m1280(r4, r6)
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
            r6.f4725 = r2
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L75
            long r3 = java.lang.System.nanoTime()
            r0.f8207 = r3
            ᛵᛴᛶᛷ r6 = r6.f4732
            java.util.concurrent.ConcurrentLinkedQueue r1 = r6.f3939
            java.util.TimeZone r3 = defpackage.AbstractC0508.f2501
            boolean r3 = r0.f8205
            if (r3 != 0) goto L4f
            ᛴᛴᛸᛴ r0 = r6.f3942
            ᛷᛱᛴᲈ r6 = r6.f3940
            r3 = 0
            r0.m1491(r6, r3)
            return r2
        L4f:
            r2 = 1
            r0.f8205 = r2
            r1.remove(r0)
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L72
            ᛴᛴᛸᛴ r6 = r6.f3942
            ᛵᲀᲇᛸ r1 = r6.f3203
            monitor-enter(r1)
            boolean r2 = r6.m1492()     // Catch: java.lang.Throwable -> L6c
            if (r2 == 0) goto L6e
            ᛵᲀᲇᛸ r2 = r6.f3203     // Catch: java.lang.Throwable -> L6c
            r2.m1909(r6)     // Catch: java.lang.Throwable -> L6c
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
            java.net.Socket r6 = r0.f8201
            return r6
        L75:
            return r2
        L76:
            java.lang.String r6 = "Check failed."
            defpackage.C2264.m3676(r6)
            return r2
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void m2020(boolean r9) {
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.f4739     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L24
            monitor-exit(r8)
            if (r9 == 0) goto L20
            ᛴᛷᛳᲀ r2 = r8.f4729
            if (r2 == 0) goto L20
            java.lang.Object r9 = r2.f3353
            ᛸᲀᛷ r9 = (defpackage.InterfaceC1559) r9
            r9.cancel()
            java.lang.Object r9 = r2.f3356
            r1 = r9
            ᛶᛴᲈ r1 = (defpackage.C1065) r1
            r6 = 1
            r7 = 0
            r3 = 1
            r4 = 1
            r5 = 1
            r1.m2026(r2, r3, r4, r5, r6, r7)
        L20:
            r9 = 0
            r8.f4733 = r9
            return
        L24:
            java.lang.String r9 = "released"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2c
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L2c
            throw r0     // Catch: java.lang.Throwable -> L2c
        L2c:
            r0 = move-exception
            r9 = r0
            monitor-exit(r8)
            throw r9
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C0569 m2021() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f4724
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L4d
            ᛵᛴᲇᲈ r0 = r3.f4742
            r0.m3418()
            ᛴᲈᲀᲇ r0 = defpackage.AbstractC1692.f7550
            ᛴᲈᲀᲇ r0 = defpackage.AbstractC1692.f7550
            java.lang.String r1 = "response.body().close()"
            r0.getClass()
            android.util.CloseGuard r0 = new android.util.CloseGuard
            r0.<init>()
            r0.open(r1)
            r3.f4727 = r0
            ᛳᛳᲀᲁ r0 = r3.f4740
            r0.getClass()
            ᲈᛴᛶᲁ r0 = r3.f4735     // Catch: java.lang.Throwable -> L40
            ᛲᛶᛲᲁ r0 = r0.f9504     // Catch: java.lang.Throwable -> L40
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L40
            java.lang.Object r1 = r0.f1619     // Catch: java.lang.Throwable -> L42
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> L42
            r1.add(r3)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            ᛳᲇᛲᲁ r0 = r3.m2025()     // Catch: java.lang.Throwable -> L40
            ᲈᛴᛶᲁ r1 = r3.f4735
            ᛲᛶᛲᲁ r1 = r1.f9504
            r1.m964(r3)
            return r0
        L40:
            r0 = move-exception
            goto L45
        L42:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            throw r1     // Catch: java.lang.Throwable -> L40
        L45:
            ᲈᛴᛶᲁ r1 = r3.f4735
            ᛲᛶᛲᲁ r1 = r1.f9504
            r1.m964(r3)
            throw r0
        L4d:
            java.lang.String r3 = "Already Executed"
            defpackage.C2264.m3676(r3)
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m2022() {
            r2 = this;
            boolean r0 = r2.f4731
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.f4731 = r0
            ᛴᛷᛳᲀ r0 = r2.f4729
            if (r0 == 0) goto L13
            java.lang.Object r0 = r0.f3353
            ᛸᲀᛷ r0 = (defpackage.InterfaceC1559) r0
            r0.cancel()
        L13:
            java.util.concurrent.CopyOnWriteArrayList r0 = r2.f4728
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            ᛱᛴᛶᛳ r1 = (defpackage.InterfaceC0077) r1
            r1.cancel()
            goto L19
        L29:
            ᛳᛳᲀᲁ r2 = r2.f4740
            r2.getClass()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m2023(defpackage.C1894 r3) {
            r2 = this;
            java.util.TimeZone r0 = defpackage.AbstractC0508.f2501
            ᲁᛸᛲᛶ r0 = r2.f4725
            if (r0 != 0) goto L15
            r2.f4725 = r3
            java.util.ArrayList r3 = r3.f8210
            ᲇᛸᲁᲁ r0 = new ᲇᛸᲁᲁ
            android.util.CloseGuard r1 = r2.f4727
            r0.<init>(r2, r1)
            r3.add(r0)
            return
        L15:
            java.lang.String r2 = "Check failed."
            defpackage.C2264.m3676(r2)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.io.IOException m2024(java.io.IOException r3) {
            r2 = this;
            java.util.TimeZone r0 = defpackage.AbstractC0508.f2501
            ᲁᛸᛲᛶ r0 = r2.f4725
            if (r0 == 0) goto L28
            monitor-enter(r0)
            java.net.Socket r1 = r2.m2019()     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)
            ᲁᛸᛲᛶ r0 = r2.f4725
            if (r0 != 0) goto L1b
            if (r1 == 0) goto L15
            defpackage.AbstractC0508.m1294(r1)
        L15:
            ᛳᛳᲀᲁ r0 = r2.f4740
            r0.getClass()
            goto L28
        L1b:
            if (r1 != 0) goto L1e
            goto L28
        L1e:
            java.lang.String r2 = "Check failed."
            defpackage.C2264.m3676(r2)
            r2 = 0
            return r2
        L25:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        L28:
            boolean r0 = r2.f4726
            if (r0 == 0) goto L2d
            goto L35
        L2d:
            ᛵᛴᲇᲈ r0 = r2.f4742
            boolean r0 = r0.m3419()
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
            ᛳᛳᲀᲁ r2 = r2.f4740
            if (r3 == 0) goto L4b
            r2.getClass()
            return r0
        L4b:
            r2.getClass()
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C0569 m2025() {
            r22 = this;
            r1 = r22
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            ᲈᛴᛶᲁ r0 = r1.f4735
            java.util.List r0 = r0.f9513
            defpackage.AbstractC1376.m2542(r2, r0)
            ᲁᛵᛷᲁ r0 = new ᲁᛵᛷᲁ
            r3 = 4
            r0.<init>(r3)
            r2.add(r0)
            ᲁᛵᛷᲁ r0 = new ᲁᛵᛷᲁ
            r3 = 2
            r0.<init>(r3)
            r2.add(r0)
            ᲁᛵᛷᲁ r0 = new ᲁᛵᛷᲁ
            r3 = 3
            r0.<init>(r3)
            r2.add(r0)
            ᲁᛵᛷᲁ r0 = defpackage.C1861.f8114
            r2.add(r0)
            ᲈᛴᛶᲁ r0 = r1.f4735
            java.util.List r0 = r0.f9503
            defpackage.AbstractC1376.m2542(r2, r0)
            ᲁᛵᛷᲁ r0 = defpackage.C1861.f8115
            r2.add(r0)
            ᲀᲁᛷᛱ r0 = new ᲀᲁᛷᛱ
            ᛳᛵᛴᛴ r5 = r1.f4734
            ᲈᛴᛶᲁ r3 = r1.f4735
            int r6 = r3.f9502
            int r7 = r3.f9507
            int r8 = r3.f9508
            ᲈᲈᛳᛷ r9 = r3.f9517
            ᲈᛳᛷ r10 = r3.f9494
            ᛸᲈᛸᲈ r11 = r3.f9499
            ᛸᛶᛱᛵ r12 = r3.f9505
            ᛷᲈᲀ r13 = r3.f9490
            javax.net.ssl.HostnameVerifier r14 = r3.f9496
            ᲀᛴᛱᛱ r15 = r3.f9500
            java.net.ProxySelector r4 = r3.f9491
            r16 = r0
            boolean r0 = r3.f9498
            r17 = r0
            javax.net.SocketFactory r0 = r3.f9506
            r18 = r0
            javax.net.ssl.SSLSocketFactory r0 = r3.f9495
            r19 = r0
            javax.net.ssl.X509TrustManager r0 = r3.f9515
            ᲈᛲᲀᛳ r3 = r3.f9493
            r21 = r3
            r3 = 0
            r20 = r0
            r0 = r16
            r16 = r4
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r2 = 0
            r3 = 0
            ᛳᲇᛲᲁ r0 = r0.m3164(r5)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            boolean r4 = r1.f4731     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            if (r4 != 0) goto L83
            r1.m2018(r2)
            return r0
        L83:
            defpackage.AbstractC0709.m1611(r0)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
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
            java.io.IOException r0 = r1.m2018(r0)     // Catch: java.lang.Throwable -> L8e
            throw r0     // Catch: java.lang.Throwable -> L8e
        L97:
            if (r3 != 0) goto L9c
            r1.m2018(r2)
        L9c:
            throw r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.io.IOException m2026(defpackage.C0703 r4, boolean r5, boolean r6, boolean r7, boolean r8, java.io.IOException r9) {
            r3 = this;
            ᛴᛷᛳᲀ r0 = r3.f4729
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto La
            goto L75
        La:
            monitor-enter(r3)
            r4 = 1
            r0 = 0
            if (r5 == 0) goto L16
            boolean r1 = r3.f4737     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L28
            goto L16
        L14:
            r4 = move-exception
            goto L56
        L16:
            if (r6 == 0) goto L1c
            boolean r1 = r3.f4730     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L28
        L1c:
            if (r8 == 0) goto L22
            boolean r1 = r3.f4741     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L28
        L22:
            if (r7 == 0) goto L58
            boolean r1 = r3.f4738     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L58
        L28:
            if (r5 == 0) goto L2c
            r3.f4737 = r0     // Catch: java.lang.Throwable -> L14
        L2c:
            if (r6 == 0) goto L30
            r3.f4730 = r0     // Catch: java.lang.Throwable -> L14
        L30:
            if (r8 == 0) goto L34
            r3.f4741 = r0     // Catch: java.lang.Throwable -> L14
        L34:
            if (r7 == 0) goto L38
            r3.f4738 = r0     // Catch: java.lang.Throwable -> L14
        L38:
            boolean r5 = r3.f4737     // Catch: java.lang.Throwable -> L14
            if (r5 != 0) goto L4a
            boolean r5 = r3.f4730     // Catch: java.lang.Throwable -> L14
            if (r5 != 0) goto L4a
            boolean r5 = r3.f4741     // Catch: java.lang.Throwable -> L14
            if (r5 != 0) goto L4a
            boolean r5 = r3.f4738     // Catch: java.lang.Throwable -> L14
            if (r5 != 0) goto L4a
            r5 = r4
            goto L4b
        L4a:
            r5 = r0
        L4b:
            if (r5 == 0) goto L52
            boolean r6 = r3.f4739     // Catch: java.lang.Throwable -> L14
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
            r3.f4729 = r6
            ᲁᛸᛲᛶ r6 = r3.f4725
            if (r6 == 0) goto L6e
            monitor-enter(r6)
            int r7 = r6.f8202     // Catch: java.lang.Throwable -> L6b
            int r7 = r7 + r4
            r6.f8202 = r7     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r6)
            goto L6e
        L6b:
            r3 = move-exception
            monitor-exit(r6)
            throw r3
        L6e:
            if (r5 == 0) goto L75
            java.io.IOException r3 = r3.m2024(r9)
            return r3
        L75:
            return r9
    }
}
