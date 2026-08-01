package defpackage;

/* JADX INFO: renamed from: ᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1594 implements defpackage.InterfaceC0848 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C0542 f7044;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.ComponentCallbacks2C2190 f7045;

    public C1594(defpackage.ComponentCallbacks2C2190 r1, defpackage.C0542 r2) {
            r0 = this;
            r0.<init>()
            r0.f7045 = r1
            r0.f7044 = r2
            return
    }

    @Override // defpackage.InterfaceC0848
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo1777(boolean r4) {
            r3 = this;
            if (r4 == 0) goto L43
            ᲈᛲᛵᲀ r4 = r3.f7045
            monitor-enter(r4)
            ᛳᲀᛴᲈ r3 = r3.f7044     // Catch: java.lang.Throwable -> L40
            java.lang.Object r0 = r3.f2669     // Catch: java.lang.Throwable -> L40
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L40
            java.util.ArrayList r0 = defpackage.AbstractC1754.m3151(r0)     // Catch: java.lang.Throwable -> L40
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L40
        L13:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L40
            ᲇᛶᲁᛴ r1 = (defpackage.InterfaceC2076) r1     // Catch: java.lang.Throwable -> L40
            boolean r2 = r1.mo921()     // Catch: java.lang.Throwable -> L40
            if (r2 != 0) goto L13
            boolean r2 = r1.mo920()     // Catch: java.lang.Throwable -> L40
            if (r2 != 0) goto L13
            r1.clear()     // Catch: java.lang.Throwable -> L40
            boolean r2 = r3.f2670     // Catch: java.lang.Throwable -> L40
            if (r2 != 0) goto L36
            r1.mo927()     // Catch: java.lang.Throwable -> L40
            goto L13
        L36:
            java.lang.Object r2 = r3.f2672     // Catch: java.lang.Throwable -> L40
            java.util.HashSet r2 = (java.util.HashSet) r2     // Catch: java.lang.Throwable -> L40
            r2.add(r1)     // Catch: java.lang.Throwable -> L40
            goto L13
        L3e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L40
            return
        L40:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L40
            throw r3
        L43:
            return
    }
}
