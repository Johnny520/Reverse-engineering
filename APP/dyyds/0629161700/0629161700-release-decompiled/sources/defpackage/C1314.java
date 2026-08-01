package defpackage;

/* JADX INFO: renamed from: ᛷᛷᛶᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1314 implements defpackage.InterfaceC0848 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0542 f5808;

    public C1314(defpackage.C0542 r1) {
            r0 = this;
            r0.<init>()
            r0.f5808 = r1
            return
    }

    @Override // defpackage.InterfaceC0848
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo1777(boolean r3) {
            r2 = this;
            defpackage.AbstractC1754.m3158()
            ᛳᲀᛴᲈ r0 = r2.f5808
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L27
            ᛳᲀᛴᲈ r2 = r2.f5808     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r2.f2672     // Catch: java.lang.Throwable -> L27
            java.util.HashSet r2 = (java.util.HashSet) r2     // Catch: java.lang.Throwable -> L27
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            java.util.Iterator r2 = r1.iterator()
        L16:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r2.next()
            ᛵᛳᛵ r0 = (defpackage.InterfaceC0848) r0
            r0.mo1777(r3)
            goto L16
        L26:
            return
        L27:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r2
    }
}
