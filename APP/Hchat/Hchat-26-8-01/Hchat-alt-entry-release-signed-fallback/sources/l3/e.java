package l3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a7.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l3.f f7785b;

    public e(l3.f r1) {
            r0 = this;
            r0.<init>()
            r0.f7785b = r1
            return
    }

    @Override // a7.a
    public final void D(java.lang.Throwable r2) {
            r1 = this;
            l3.f r0 = r1.f7785b
            l3.i r0 = r0.f7786a
            r0.f(r2)
            return
    }

    @Override // a7.a
    public final void E(hb.c r9) {
            r8 = this;
            l3.f r0 = r8.f7785b
            r0.f7788c = r9
            b5.c r1 = new b5.c
            hb.c r9 = r0.f7788c
            l3.i r2 = r0.f7786a
            a2.a r3 = r2.f7799g
            l3.d r2 = r2.f7801i
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 34
            if (r4 < r5) goto L19
            java.util.Set r4 = l3.n.a()
            goto L1d
        L19:
            java.util.Set r4 = ac.p.v()
        L1d:
            r1.<init>()
            r1.f469a = r3
            r1.f470b = r9
            r1.f471c = r2
            boolean r9 = r4.isEmpty()
            if (r9 == 0) goto L2d
            goto L55
        L2d:
            java.util.Iterator r9 = r4.iterator()
        L31:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L55
            java.lang.Object r2 = r9.next()
            int[] r2 = (int[]) r2
            r3 = r2
            java.lang.String r2 = new java.lang.String
            r4 = 0
            int r5 = r3.length
            r2.<init>(r3, r4, r5)
            l3.q r7 = new l3.q
            r3 = 0
            r7.<init>(r2, r3)
            int r4 = r2.length()
            r5 = 1
            r6 = 1
            r1.G(r2, r3, r4, r5, r6, r7)
            goto L31
        L55:
            r0.f7787b = r1
            l3.i r9 = r0.f7786a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r9.f7793a
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.lock()
            r1 = 1
            r9.f7795c = r1     // Catch: java.lang.Throwable -> L8b
            f.f r1 = r9.f7794b     // Catch: java.lang.Throwable -> L8b
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L8b
            f.f r1 = r9.f7794b     // Catch: java.lang.Throwable -> L8b
            r1.clear()     // Catch: java.lang.Throwable -> L8b
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r9.f7793a
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            android.os.Handler r1 = r9.f7796d
            l3.g r2 = new l3.g
            int r9 = r9.f7795c
            r3 = 0
            r2.<init>(r0, r9, r3)
            r1.post(r2)
            return
        L8b:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r9 = r9.f7793a
            java.util.concurrent.locks.Lock r9 = r9.writeLock()
            r9.unlock()
            throw r0
    }
}
