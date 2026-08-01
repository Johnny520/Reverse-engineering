package p000;

/* JADX INFO: renamed from: pq */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0696pq {

    /* JADX INFO: renamed from: α */
    public static final p000.C0696pq f8651 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicReference f8652 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicLong f8653 = null;

    /* JADX INFO: renamed from: δ */
    public static final android.os.Handler f8654 = null;

    /* JADX INFO: renamed from: ε */
    public static final android.os.Handler f8655 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.lang.Object f8656 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.C0595nq f8657 = null;

    /* JADX INFO: renamed from: θ */
    public static final java.util.HashMap f8658 = null;

    /* JADX INFO: renamed from: ι */
    public static final java.util.concurrent.CopyOnWriteArraySet f8659 = null;

    /* JADX INFO: renamed from: κ */
    public static final java.util.concurrent.CopyOnWriteArraySet f8660 = null;

    static {
            pq r0 = new pq
            r0.<init>()
            p000.C0696pq.f8651 = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            p000.C0696pq.f8652 = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            p000.C0696pq.f8653 = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            p000.C0696pq.f8654 = r0
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "rf2ff7ad939a6e83b"
            r2 = 10
            r0.<init>(r1, r2)
            r0.start()
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r0 = r0.getLooper()
            r1.<init>(r0)
            p000.C0696pq.f8655 = r1
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.C0696pq.f8656 = r0
            nq r0 = new nq
            r1 = 1
            r2 = 0
            r3 = 32
            r4 = 1061158912(0x3f400000, float:0.75)
            r0.<init>(r3, r4, r1, r2)
            p000.C0696pq.f8657 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            p000.C0696pq.f8658 = r0
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            p000.C0696pq.f8659 = r0
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            p000.C0696pq.f8660 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.C0558mq m4566() {
            java.util.concurrent.atomic.AtomicReference r0 = p000.C0696pq.f8652
            java.lang.Object r0 = r0.get()
            lq r0 = (p000.C0521lq) r0
            if (r0 == 0) goto Ld
            mq r0 = r0.f6735
            return r0
        Ld:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static p000.C0484kq m4567() {
            java.util.concurrent.atomic.AtomicReference r0 = p000.C0696pq.f8652
            java.lang.Object r0 = r0.get()
            lq r0 = (p000.C0521lq) r0
            r1 = 0
            if (r0 != 0) goto Lc
            goto L1d
        Lc:
            java.lang.ref.WeakReference r2 = r0.f6732
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L15
            goto L1d
        L15:
            java.lang.ref.WeakReference r3 = r0.f6733
            java.lang.Object r3 = r3.get()
            if (r3 != 0) goto L1e
        L1d:
            return r1
        L1e:
            kq r4 = new kq
            java.lang.ref.WeakReference r5 = r0.f6734
            if (r5 == 0) goto L2a
            java.lang.Object r1 = r5.get()
            android.view.View r1 = (android.view.View) r1
        L2a:
            mq r0 = r0.f6735
            r4.<init>(r2, r3, r1, r0)
            return r4
    }

    /* JADX INFO: renamed from: γ */
    public final void m4568(java.lang.String r19, java.lang.Object r20, java.lang.Object r21, android.view.View r22) {
            r18 = this;
            r1 = r20
            r2 = r21
            r3 = r22
            r1.getClass()
            java.util.concurrent.atomic.AtomicReference r4 = p000.C0696pq.f8652
            java.lang.Object r0 = r4.get()
            lq r0 = (p000.C0521lq) r0
            r5 = 0
            if (r0 == 0) goto L1b
            java.lang.ref.WeakReference r6 = r0.f6732
            java.lang.Object r6 = r6.get()
            goto L1c
        L1b:
            r6 = r5
        L1c:
            if (r6 != r1) goto L38
            java.lang.ref.WeakReference r6 = r0.f6733
            java.lang.Object r6 = r6.get()
            if (r6 != r2) goto L38
            if (r3 == 0) goto Lf8
            java.lang.ref.WeakReference r0 = r0.f6734
            if (r0 == 0) goto L33
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            goto L34
        L33:
            r0 = r5
        L34:
            if (r0 != r3) goto L38
            goto Lf8
        L38:
            java.util.concurrent.atomic.AtomicLong r0 = p000.C0696pq.f8653
            long r11 = r0.incrementAndGet()
            long r14 = android.os.SystemClock.uptimeMillis()
            mq r6 = new mq
            r0 = r18
            java.lang.String r7 = r0.m4569(r2)
            r8 = 0
            java.lang.String r0 = "createTime"
            java.lang.Object r0 = p000.qe0.m4879(r2, r0)     // Catch: java.lang.Throwable -> L59
            boolean r10 = r0 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L59
            if (r10 == 0) goto L5b
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L59
            goto L5c
        L59:
            r0 = move-exception
            goto L6a
        L5b:
            r0 = r5
        L5c:
            if (r0 == 0) goto L63
            long r16 = r0.longValue()     // Catch: java.lang.Throwable -> L59
            goto L65
        L63:
            r16 = r8
        L65:
            java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch: java.lang.Throwable -> L59
            goto L70
        L6a:
            eo1 r10 = new eo1
            r10.<init>(r0)
            r0 = r10
        L70:
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            boolean r9 = r0 instanceof p000.eo1
            if (r9 == 0) goto L79
            r0 = r8
        L79:
            java.lang.Number r0 = (java.lang.Number) r0
            long r8 = r0.longValue()
            java.lang.String r0 = "city"
            java.lang.String r10 = "region"
            java.lang.String[] r0 = new java.lang.String[]{r0, r10}     // Catch: java.lang.Throwable -> L9c
            ss1 r0 = p000.AbstractC0312g7.m2232(r0)     // Catch: java.lang.Throwable -> L9c
            ef r10 = new ef     // Catch: java.lang.Throwable -> L9c
            r13 = 5
            r10.<init>(r13, r2)     // Catch: java.lang.Throwable -> L9c
            y30 r0 = p000.us1.m5943(r0, r10)     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r0 = p000.us1.m5953(r0)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L9c
            goto La3
        L9c:
            r0 = move-exception
            eo1 r10 = new eo1
            r10.<init>(r0)
            r0 = r10
        La3:
            boolean r10 = r0 instanceof p000.eo1
            if (r10 == 0) goto La8
            r0 = r5
        La8:
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            r13 = r19
            r6.<init>(r7, r8, r10, r11, r13, r14)
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r1)
            java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
            r10.<init>(r2)
            if (r3 == 0) goto Lc1
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r3)
        Lc1:
            r7 = r11
            r12 = r6
            lq r6 = new lq
            r11 = r5
            r6.<init>(r7, r9, r10, r11, r12)
            r4.set(r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = p000.C0696pq.f8659
            java.util.Iterator r0 = r0.iterator()
        Ld2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Le2
            java.lang.Object r1 = r0.next()
            a80 r1 = (p000.a80) r1
            r1.invoke(r12)     // Catch: java.lang.Throwable -> Ld2
            goto Ld2
        Le2:
            java.util.concurrent.CopyOnWriteArraySet r0 = p000.C0696pq.f8660
            java.util.Iterator r0 = r0.iterator()
        Le8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lf8
            java.lang.Object r1 = r0.next()
            a80 r1 = (p000.a80) r1
            r1.invoke(r12)     // Catch: java.lang.Throwable -> Le8
            goto Le8
        Lf8:
            return
    }

    /* JADX INFO: renamed from: δ */
    public final java.lang.String m4569(java.lang.Object r4) {
            r3 = this;
            java.lang.String r0 = "aid"
            java.lang.String r1 = "awemeId"
            java.lang.String r2 = "id"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}     // Catch: java.lang.Throwable -> L1e
            ss1 r0 = p000.AbstractC0312g7.m2232(r0)     // Catch: java.lang.Throwable -> L1e
            ef r1 = new ef     // Catch: java.lang.Throwable -> L1e
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L1e
            y30 r3 = p000.us1.m5943(r0, r1)     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r3 = p000.us1.m5953(r3)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1e
            goto L25
        L1e:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L25:
            boolean r4 = r3 instanceof p000.eo1
            if (r4 == 0) goto L2a
            r3 = 0
        L2a:
            java.lang.String r3 = (java.lang.String) r3
            return r3
    }
}
