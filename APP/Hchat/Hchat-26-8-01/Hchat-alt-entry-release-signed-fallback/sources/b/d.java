package b;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements androidx.lifecycle.o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f328i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public java.lang.Object f329j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f330k;

    public d(b.f r2, androidx.lifecycle.s r3, b.g r4) {
            r1 = this;
            r0 = 0
            r1.f326g = r0
            r1.<init>()
            r1.f330k = r2
            r1.f327h = r3
            r1.f328i = r4
            r3.a(r1)
            return
    }

    public d(vg.c r2, i0.d r3, i0.y1 r4, gg.u r5) {
            r1 = this;
            r0 = 1
            r1.f326g = r0
            r1.<init>()
            r1.f327h = r2
            r1.f328i = r3
            r1.f329j = r4
            r1.f330k = r5
            return
    }

    @Override // androidx.lifecycle.o
    public final void b(androidx.lifecycle.q r10, androidx.lifecycle.k r11) {
            r9 = this;
            int r0 = r9.f326g
            switch(r0) {
                case 0: goto Lb4;
                default: goto L5;
            }
        L5:
            int[] r0 = y1.t2.f22124a
            int r11 = r11.ordinal()
            r11 = r0[r11]
            r0 = 0
            r1 = 1
            switch(r11) {
                case 1: goto L9a;
                case 2: goto L2f;
                case 3: goto L20;
                case 4: goto L18;
                case 5: goto L15;
                case 6: goto L15;
                case 7: goto L15;
                default: goto L12;
            }
        L12:
            okio.a.k()
        L15:
            r6 = r9
            goto Lb3
        L18:
            java.lang.Object r10 = r9.f329j
            i0.y1 r10 = (i0.y1) r10
            r10.x()
            goto L15
        L20:
            java.lang.Object r10 = r9.f329j
            i0.y1 r10 = (i0.y1) r10
            java.lang.Object r11 = r10.f6098c
            monitor-enter(r11)
            r10.f6115t = r1     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r11)
            goto L15
        L2b:
            r0 = move-exception
            r10 = r0
            monitor-exit(r11)
            throw r10
        L2f:
            java.lang.Object r10 = r9.f328i
            i0.d r10 = (i0.d) r10
            r11 = 0
            if (r10 == 0) goto L77
            java.lang.Object r10 = r10.f5861i
            j8.f r10 = (j8.f) r10
            java.lang.Object r2 = r10.f6781b
            monitor-enter(r2)
            java.lang.Object r3 = r10.f6781b     // Catch: java.lang.Throwable -> L6a
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L6a
            boolean r4 = r10.f6780a     // Catch: java.lang.Throwable -> L71
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L47
        L45:
            monitor-exit(r2)
            goto L77
        L47:
            java.lang.Object r3 = r10.f6782c     // Catch: java.lang.Throwable -> L6a
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r4 = r10.f6783d     // Catch: java.lang.Throwable -> L6a
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch: java.lang.Throwable -> L6a
            r10.f6782c = r4     // Catch: java.lang.Throwable -> L6a
            r10.f6783d = r3     // Catch: java.lang.Throwable -> L6a
            r10.f6780a = r1     // Catch: java.lang.Throwable -> L6a
            int r10 = r3.size()     // Catch: java.lang.Throwable -> L6a
            r1 = r11
        L5a:
            if (r1 >= r10) goto L6d
            java.lang.Object r4 = r3.get(r1)     // Catch: java.lang.Throwable -> L6a
            wf.c r4 = (wf.c) r4     // Catch: java.lang.Throwable -> L6a
            sf.n r5 = sf.n.f12433a     // Catch: java.lang.Throwable -> L6a
            r4.resumeWith(r5)     // Catch: java.lang.Throwable -> L6a
            int r1 = r1 + 1
            goto L5a
        L6a:
            r0 = move-exception
            r10 = r0
            goto L75
        L6d:
            r3.clear()     // Catch: java.lang.Throwable -> L6a
            goto L45
        L71:
            r0 = move-exception
            r10 = r0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6a
            throw r10     // Catch: java.lang.Throwable -> L6a
        L75:
            monitor-exit(r2)
            throw r10
        L77:
            java.lang.Object r10 = r9.f329j
            i0.y1 r10 = (i0.y1) r10
            java.lang.Object r1 = r10.f6098c
            monitor-enter(r1)
            boolean r2 = r10.f6115t     // Catch: java.lang.Throwable -> L89
            if (r2 == 0) goto L8c
            r10.f6115t = r11     // Catch: java.lang.Throwable -> L89
            qg.f r0 = r10.y()     // Catch: java.lang.Throwable -> L89
            goto L8c
        L89:
            r0 = move-exception
            r10 = r0
            goto L98
        L8c:
            monitor-exit(r1)
            if (r0 == 0) goto L15
            sf.n r10 = sf.n.f12433a
            qg.g r0 = (qg.g) r0
            r0.resumeWith(r10)
            goto L15
        L98:
            monitor-exit(r1)
            throw r10
        L9a:
            java.lang.Object r11 = r9.f327h
            vg.c r11 = (vg.c) r11
            ci.e r2 = new ci.e
            java.lang.Object r3 = r9.f330k
            gg.u r3 = (gg.u) r3
            java.lang.Object r4 = r9.f329j
            i0.y1 r4 = (i0.y1) r4
            r7 = 0
            r8 = 13
            r6 = r9
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            qg.v.q(r11, r0, r2, r1)
        Lb3:
            return
        Lb4:
            r6 = r9
            androidx.lifecycle.k r10 = androidx.lifecycle.k.ON_START
            if (r11 != r10) goto Lde
            java.lang.Object r10 = r6.f330k
            b.f r10 = (b.f) r10
            java.lang.Object r11 = r6.f328i
            b.g r11 = (b.g) r11
            java.lang.Object r0 = r10.f336c
            tf.k r0 = (tf.k) r0
            r0.addLast(r11)
            b.e r0 = new b.e
            r0.<init>(r10, r11)
            java.util.concurrent.CopyOnWriteArrayList r11 = r11.f339a
            r11.add(r0)
            int r11 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r11 < r1) goto Ldb
            r10.d()
        Ldb:
            r6.f329j = r0
            goto L10c
        Lde:
            androidx.lifecycle.k r10 = androidx.lifecycle.k.ON_STOP
            if (r11 != r10) goto Lec
            java.lang.Object r10 = r6.f329j
            b.e r10 = (b.e) r10
            if (r10 == 0) goto L10c
            r10.cancel()
            goto L10c
        Lec:
            androidx.lifecycle.k r10 = androidx.lifecycle.k.ON_DESTROY
            if (r11 != r10) goto L10c
            java.lang.Object r10 = r6.f327h
            androidx.lifecycle.s r10 = (androidx.lifecycle.s) r10
            r10.f(r9)
            java.lang.Object r10 = r6.f328i
            b.g r10 = (b.g) r10
            java.util.concurrent.CopyOnWriteArrayList r10 = r10.f339a
            r10.remove(r9)
            java.lang.Object r10 = r6.f329j
            b.e r10 = (b.e) r10
            if (r10 == 0) goto L109
            r10.cancel()
        L109:
            r10 = 0
            r6.f329j = r10
        L10c:
            return
    }
}
