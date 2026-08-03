package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends qg.p {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final sf.i f22004s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d6.m f22005t = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final android.view.Choreographer f22006i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final android.os.Handler f22007j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Object f22008k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final tf.k f22009l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f22010m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f22011n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f22012o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f22013p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y1.m0 f22014q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i0.d f22015r;

    static {
            y1.h0 r0 = y1.h0.f21924m
            sf.i r1 = new sf.i
            r1.<init>(r0)
            y1.n0.f22004s = r1
            d6.m r0 = new d6.m
            r1 = 3
            r0.<init>(r1)
            y1.n0.f22005t = r0
            return
    }

    public n0(android.view.Choreographer r1, android.os.Handler r2) {
            r0 = this;
            r0.<init>()
            r0.f22006i = r1
            r0.f22007j = r2
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r0.f22008k = r2
            tf.k r2 = new tf.k
            r2.<init>()
            r0.f22009l = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f22010m = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f22011n = r2
            y1.m0 r2 = new y1.m0
            r2.<init>(r0)
            r0.f22014q = r2
            i0.d r2 = new i0.d
            r2.<init>(r1, r0)
            r0.f22015r = r2
            return
    }

    public static final void z(y1.n0 r4) {
        L0:
            java.lang.Object r0 = r4.f22008k
            monitor-enter(r0)
            tf.k r1 = r4.f22009l     // Catch: java.lang.Throwable -> L4a
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4a
            r3 = 0
            if (r2 == 0) goto Le
            r1 = r3
            goto L12
        Le:
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L4a
        L12:
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r0)
        L15:
            if (r1 == 0) goto L32
            r1.run()
            java.lang.Object r0 = r4.f22008k
            monitor-enter(r0)
            tf.k r1 = r4.f22009l     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L27
            r1 = r3
            goto L2b
        L27:
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L2f
        L2b:
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)
            goto L15
        L2f:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        L32:
            java.lang.Object r0 = r4.f22008k
            monitor-enter(r0)
            tf.k r1 = r4.f22009l     // Catch: java.lang.Throwable -> L41
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L43
            r1 = 0
            r4.f22012o = r1     // Catch: java.lang.Throwable -> L41
            goto L44
        L41:
            r4 = move-exception
            goto L48
        L43:
            r1 = 1
        L44:
            monitor-exit(r0)
            if (r1 != 0) goto L0
            return
        L48:
            monitor-exit(r0)
            throw r4
        L4a:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    @Override // qg.p
    public final void w(wf.g r3, java.lang.Runnable r4) {
            r2 = this;
            java.lang.Object r3 = r2.f22008k
            monitor-enter(r3)
            tf.k r0 = r2.f22009l     // Catch: java.lang.Throwable -> L24
            r0.addLast(r4)     // Catch: java.lang.Throwable -> L24
            boolean r4 = r2.f22012o     // Catch: java.lang.Throwable -> L24
            if (r4 != 0) goto L26
            r4 = 1
            r2.f22012o = r4     // Catch: java.lang.Throwable -> L24
            android.os.Handler r0 = r2.f22007j     // Catch: java.lang.Throwable -> L24
            y1.m0 r1 = r2.f22014q     // Catch: java.lang.Throwable -> L24
            r0.post(r1)     // Catch: java.lang.Throwable -> L24
            boolean r0 = r2.f22013p     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L26
            r2.f22013p = r4     // Catch: java.lang.Throwable -> L24
            android.view.Choreographer r4 = r2.f22006i     // Catch: java.lang.Throwable -> L24
            y1.m0 r0 = r2.f22014q     // Catch: java.lang.Throwable -> L24
            r4.postFrameCallback(r0)     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r4 = move-exception
            goto L28
        L26:
            monitor-exit(r3)
            return
        L28:
            monitor-exit(r3)
            throw r4
    }
}
