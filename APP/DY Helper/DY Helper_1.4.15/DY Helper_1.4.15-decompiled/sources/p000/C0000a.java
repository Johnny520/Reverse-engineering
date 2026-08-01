package p000;

/* JADX INFO: renamed from: a */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0000a {

    /* JADX INFO: renamed from: α */
    public final java.lang.Object f0;

    /* JADX INFO: renamed from: β */
    public volatile java.lang.Object f1;

    public C0000a(int r9) {
            r8 = this;
            switch(r9) {
                case 2: goto L1c;
                default: goto L3;
            }
        L3:
            r8.<init>()
            java.util.concurrent.atomic.AtomicLong r9 = new java.util.concurrent.atomic.AtomicLong
            r0 = 0
            r9.<init>(r0)
            r8.f0 = r9
            ｚ r2 = new ｚ
            r6 = 0
            r7 = 0
            r3 = 0
            r5 = 0
            r2.<init>(r3, r5, r6, r7)
            r8.f1 = r2
            return
        L1c:
            r8.<init>()
            java.util.concurrent.CopyOnWriteArraySet r9 = new java.util.concurrent.CopyOnWriteArraySet
            r9.<init>()
            r8.f0 = r9
            return
    }

    public C0000a(java.util.Set r1) {
            r0 = this;
            r0.<init>()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Set r1 = p000.AbstractC0984xh.m6671(r1)
            r0.f0 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public synchronized void m0(long r3, p000.dc1 r5) {
            r2 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r2.f1     // Catch: java.lang.Throwable -> L1b
            ｚ r0 = (p000.C1156) r0     // Catch: java.lang.Throwable -> L1b
            long r0 = r0.f13524     // Catch: java.lang.Throwable -> L1b
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto Ld
            monitor-exit(r2)
            return
        Ld:
            java.lang.Object r3 = r2.f1     // Catch: java.lang.Throwable -> L1b
            ｚ r3 = (p000.C1156) r3     // Catch: java.lang.Throwable -> L1b
            r4 = 0
            r0 = 5
            ｚ r3 = p000.C1156.m7363(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> L1b
            r2.f1 = r3     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r2)
            return
        L1b:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r3
    }
}
