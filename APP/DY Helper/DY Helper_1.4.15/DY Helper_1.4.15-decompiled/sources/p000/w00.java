package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class w00 extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ boolean f11503;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.Class f11504;

    public w00(java.lang.Class r1, boolean r2) {
            r0 = this;
            r0.f11503 = r2
            r0.f11504 = r1
            r0.<init>()
            return
    }

    @Override // p000.m01
    public final void afterHookedMethod(p000.k01 r5) {
            r4 = this;
            r5.getClass()
            java.lang.Object r5 = r5.f5691
            boolean r0 = r4.f11503
            if (r0 == 0) goto L2b
            x00 r1 = p000.x00.f11959     // Catch: java.lang.Throwable -> L29
            r5.getClass()     // Catch: java.lang.Throwable -> L29
            java.lang.Object r1 = p000.x00.m6466(r5)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L15
            goto L61
        L15:
            java.lang.Class r4 = r4.f11504     // Catch: java.lang.Throwable -> L29
            boolean r4 = r4.isInstance(r1)     // Catch: java.lang.Throwable -> L29
            if (r4 == 0) goto L61
            android.view.View r4 = p000.x00.m6467(r5)     // Catch: java.lang.Throwable -> L29
            pq r2 = p000.C0696pq.f8651     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = "feed_selected"
            r2.m4568(r3, r5, r1, r4)     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r4 = move-exception
            goto L69
        L2b:
            pq r4 = p000.C0696pq.f8651     // Catch: java.lang.Throwable -> L29
            r5.getClass()     // Catch: java.lang.Throwable -> L29
        L30:
            java.util.concurrent.atomic.AtomicReference r4 = p000.C0696pq.f8652     // Catch: java.lang.Throwable -> L29
            java.lang.Object r1 = r4.get()     // Catch: java.lang.Throwable -> L29
            lq r1 = (p000.C0521lq) r1     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L3b
            goto L61
        L3b:
            java.lang.ref.WeakReference r2 = r1.f6732     // Catch: java.lang.Throwable -> L29
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L29
            if (r2 == r5) goto L44
            goto L61
        L44:
            r2 = 0
            boolean r3 = r4.compareAndSet(r1, r2)     // Catch: java.lang.Throwable -> L29
            if (r3 == 0) goto L62
            java.util.concurrent.CopyOnWriteArraySet r4 = p000.C0696pq.f8660     // Catch: java.lang.Throwable -> L29
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L29
        L51:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r5 == 0) goto L61
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L29
            a80 r5 = (p000.a80) r5     // Catch: java.lang.Throwable -> L29
            r5.invoke(r2)     // Catch: java.lang.Throwable -> L51
            goto L51
        L61:
            return
        L62:
            java.lang.Object r2 = r4.get()     // Catch: java.lang.Throwable -> L29
            if (r2 == r1) goto L44
            goto L30
        L69:
            if (r0 == 0) goto L6e
            java.lang.String r5 = "selected"
            goto L70
        L6e:
            java.lang.String r5 = "unselected"
        L70:
            java.lang.String r4 = r4.getMessage()
            java.lang.String r0 = "rc7413b448c1a43a1"
            p000.AbstractC0602nx.m4121(r0, r5, r4)
            return
    }
}
