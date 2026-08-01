package defpackage;

/* JADX INFO: renamed from: ᛳᛱᛸᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0410 implements defpackage.InterfaceC1563 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1594 f2073;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.content.Context f2074;

    public C0410(android.content.Context r1, defpackage.C1594 r2) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.f2074 = r1
            r0.f2073 = r2
            return
    }

    @Override // defpackage.InterfaceC1960
    /* JADX INFO: renamed from: ᛲᛲᛵ */
    public final void mo321() {
            r0 = this;
            return
    }

    @Override // defpackage.InterfaceC1960
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final void mo322() {
            r2 = this;
            android.content.Context r0 = r2.f2074
            ᛳᲀᛴᲈ r0 = defpackage.C0542.m1328(r0)
            ᛸᲈ r2 = r2.f2073
            monitor-enter(r0)
            java.lang.Object r1 = r0.f2672     // Catch: java.lang.Throwable -> L15
            java.util.HashSet r1 = (java.util.HashSet) r1     // Catch: java.lang.Throwable -> L15
            r1.add(r2)     // Catch: java.lang.Throwable -> L15
            r0.m1331()     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            return
        L15:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r2
    }

    @Override // defpackage.InterfaceC1960
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo323() {
            r2 = this;
            android.content.Context r0 = r2.f2074
            ᛳᲀᛴᲈ r0 = defpackage.C0542.m1328(r0)
            ᛸᲈ r2 = r2.f2073
            monitor-enter(r0)
            java.lang.Object r1 = r0.f2672     // Catch: java.lang.Throwable -> L39
            java.util.HashSet r1 = (java.util.HashSet) r1     // Catch: java.lang.Throwable -> L39
            r1.remove(r2)     // Catch: java.lang.Throwable -> L39
            boolean r2 = r0.f2670     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L37
            java.lang.Object r2 = r0.f2672     // Catch: java.lang.Throwable -> L39
            java.util.HashSet r2 = (java.util.HashSet) r2     // Catch: java.lang.Throwable -> L39
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L39
            if (r2 != 0) goto L1f
            goto L37
        L1f:
            java.lang.Object r2 = r0.f2669     // Catch: java.lang.Throwable -> L39
            ᛴᛷᛳᲀ r2 = (defpackage.C0703) r2     // Catch: java.lang.Throwable -> L39
            java.lang.Object r1 = r2.f3354     // Catch: java.lang.Throwable -> L39
            ᲈᛵᛷᛱ r1 = (defpackage.C2243) r1     // Catch: java.lang.Throwable -> L39
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L39
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch: java.lang.Throwable -> L39
            java.lang.Object r2 = r2.f3353     // Catch: java.lang.Throwable -> L39
            ᛷᛴᛱᛸ r2 = (defpackage.C1251) r2     // Catch: java.lang.Throwable -> L39
            r1.unregisterNetworkCallback(r2)     // Catch: java.lang.Throwable -> L39
            r2 = 0
            r0.f2670 = r2     // Catch: java.lang.Throwable -> L39
        L37:
            monitor-exit(r0)
            return
        L39:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r2
    }
}
