package xhss;

/* JADX INFO: renamed from: xhss.ᲀᲈᛲᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0914 implements xhss.InterfaceC0608 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public volatile boolean f2946;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.util.concurrent.ConcurrentHashMap f2947;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.util.concurrent.LinkedBlockingQueue f2948;

    public C0914() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f2946 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f2947 = r0
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            r1.f2948 = r0
            return
    }

    @Override // xhss.InterfaceC0608
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final synchronized xhss.InterfaceC0869 mo1033(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.ConcurrentHashMap r0 = r3.f2947     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L1a
            xhss.ᲈᛸᛷᲀ r0 = (xhss.C1166) r0     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            xhss.ᲈᛸᛷᲀ r0 = new xhss.ᲈᛸᛷᲀ     // Catch: java.lang.Throwable -> L1a
            java.util.concurrent.LinkedBlockingQueue r1 = r3.f2948     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r3.f2946     // Catch: java.lang.Throwable -> L1a
            r0.<init>(r4, r1, r2)     // Catch: java.lang.Throwable -> L1a
            java.util.concurrent.ConcurrentHashMap r1 = r3.f2947     // Catch: java.lang.Throwable -> L1a
            r1.put(r4, r0)     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r4 = move-exception
            goto L1e
        L1c:
            monitor-exit(r3)
            return r0
        L1e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1a
            throw r4
    }
}
