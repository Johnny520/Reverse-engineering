package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cr implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15542h;

    public /* synthetic */ cr(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f15541g = r2
            r0.f15542h = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            int r0 = r7.f15541g
            switch(r0) {
                case 0: goto L122;
                case 1: goto L117;
                case 2: goto L10f;
                case 3: goto Ld9;
                case 4: goto Laa;
                case 5: goto L40;
                case 6: goto L38;
                case 7: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r7.f15542h
            ya.a r0 = (ya.a) r0
            r0.a()
            return
        Ld:
            java.lang.Object r0 = r7.f15542h
            y1.z r0 = (y1.z) r0
            java.lang.String r1 = "measureAndLayout"
            android.os.Trace.beginSection(r1)
            y1.t r1 = r0.f22166j     // Catch: java.lang.Throwable -> L33
            r2 = 1
            r1.x(r2)     // Catch: java.lang.Throwable -> L33
            android.os.Trace.endSection()
            java.lang.String r1 = "checkForSemanticsChanges"
            android.os.Trace.beginSection(r1)
            r0.g()     // Catch: java.lang.Throwable -> L2e
            android.os.Trace.endSection()
            r1 = 0
            r0.O = r1
            return
        L2e:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L33:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L38:
            java.lang.Object r0 = r7.f15542h
            y1.a r0 = (y1.a) r0
            r0.b()
            return
        L40:
            java.lang.Object r0 = r7.f15542h
            xa.m r0 = (xa.m) r0
            java.util.Map r1 = r0.f21453i
            r1.getClass()
            monitor-enter(r1)
            java.util.Map r2 = r0.f21453i     // Catch: java.lang.Throwable -> L7c
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L7c
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L7c
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7c
            int r4 = tf.n.e1(r2)     // Catch: java.lang.Throwable -> L7c
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L7c
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L7c
        L5f:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L7c
            if (r4 == 0) goto L7e
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L7c
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L7c
            sf.e r6 = new sf.e     // Catch: java.lang.Throwable -> L7c
            r6.<init>(r5, r4)     // Catch: java.lang.Throwable -> L7c
            r3.add(r6)     // Catch: java.lang.Throwable -> L7c
            goto L5f
        L7c:
            r0 = move-exception
            goto La8
        L7e:
            java.util.Map r0 = r0.f21453i     // Catch: java.lang.Throwable -> L7c
            r0.clear()     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r1)
            java.util.Iterator r0 = r3.iterator()
        L88:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La7
            java.lang.Object r1 = r0.next()
            sf.e r1 = (sf.e) r1
            java.lang.Object r2 = r1.f12418g
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r1 = r1.f12419h
            xa.h r1 = (xa.h) r1
            android.view.View$OnLongClickListener r3 = r1.f21436c     // Catch: java.lang.Throwable -> L88
            r2.setOnLongClickListener(r3)     // Catch: java.lang.Throwable -> L88
            boolean r1 = r1.f21437d     // Catch: java.lang.Throwable -> L88
            r2.setLongClickable(r1)     // Catch: java.lang.Throwable -> L88
            goto L88
        La7:
            return
        La8:
            monitor-exit(r1)
            throw r0
        Laa:
            java.lang.Object r0 = r7.f15542h
            x8.n r0 = (x8.n) r0
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f21320g
            boolean r1 = r1.get()
            if (r1 == 0) goto Lb7
            goto Ld8
        Lb7:
            java.util.concurrent.atomic.AtomicReference r1 = r0.f21319f
            java.lang.Object r1 = r1.get()
            if (r1 == 0) goto Lc0
            goto Ld8
        Lc0:
            long r1 = java.lang.System.currentTimeMillis()
            java.util.concurrent.atomic.AtomicLong r3 = r0.f21322i
            long r3 = r3.get()
            long r1 = r1 - r3
            r3 = 90000(0x15f90, double:4.4466E-319)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto Ld3
            goto Ld8
        Ld3:
            java.lang.String r1 = "idle timeout"
            r0.a(r1)
        Ld8:
            return
        Ld9:
            java.lang.Object r0 = r7.f15542h
            x8.k r0 = (x8.k) r0
            r1 = 30000(0x7530, double:1.4822E-319)
            java.lang.Thread.sleep(r1)     // Catch: java.lang.Throwable -> Lee
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f21295i     // Catch: java.lang.Throwable -> Lee
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> Lee
            if (r1 != 0) goto Lf0
            r0.c()     // Catch: java.lang.Throwable -> Lee
            goto Lf0
        Lee:
            r1 = move-exception
            goto Lf3
        Lf0:
            sf.n r1 = sf.n.f12433a     // Catch: java.lang.Throwable -> Lee
            goto Lf9
        Lf3:
            sf.f r2 = new sf.f
            r2.<init>(r1)
            r1 = r2
        Lf9:
            java.lang.Throwable r1 = sf.g.b(r1)
            if (r1 == 0) goto L10e
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f21296j
            r2 = 0
            r0.set(r2)
            java.lang.String r0 = r1.getMessage()
            java.lang.String r2 = "[Hchat:AutoReply] 小智MCP桥接重连失败: "
            eh.a.x(r2, r0, r1)
        L10e:
            return
        L10f:
            java.lang.Object r0 = r7.f15542h
            c9.r0 r0 = (c9.r0) r0
            r0.invoke()
            return
        L117:
            java.lang.Object r0 = r7.f15542h
            wb.wt r0 = (wb.wt) r0
            r1 = 0
            r0.f20055d = r1
            r0.a()
            return
        L122:
            java.lang.Object r0 = r7.f15542h
            wb.dr r0 = (wb.dr) r0
            r0.getClass()
            r0.a()
            return
    }
}
