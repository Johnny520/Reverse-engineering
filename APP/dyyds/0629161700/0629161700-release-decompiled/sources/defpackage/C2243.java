package defpackage;

/* JADX INFO: renamed from: ᲈᛵᛷᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2243 implements defpackage.InterfaceC0429 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.Object f9560;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public volatile java.lang.Object f9561;

    public /* synthetic */ C2243(java.lang.Object r1) {
            r0 = this;
            r0.f9560 = r1
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC0429
    public java.lang.Object get() {
            r2 = this;
            java.lang.Object r0 = r2.f9561
            if (r0 != 0) goto L1f
            monitor-enter(r2)
            java.lang.Object r0 = r2.f9561     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L1b
            java.lang.Object r0 = r2.f9560     // Catch: java.lang.Throwable -> L19
            ᛳᛲᲀ r0 = (defpackage.InterfaceC0429) r0     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "Argument must not be null"
            defpackage.C0292.m944(r0, r1)     // Catch: java.lang.Throwable -> L19
            r2.f9561 = r0     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r0 = move-exception
            goto L1d
        L1b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            goto L1f
        L1d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r0
        L1f:
            java.lang.Object r2 = r2.f9561
            return r2
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public defpackage.InterfaceC0373 m3632() {
            r4 = this;
            java.lang.Object r0 = r4.f9561
            ᛲᲇᛵᲈ r0 = (defpackage.InterfaceC0373) r0
            if (r0 != 0) goto L53
            monitor-enter(r4)
            java.lang.Object r0 = r4.f9561     // Catch: java.lang.Throwable -> L3e
            ᛲᲇᛵᲈ r0 = (defpackage.InterfaceC0373) r0     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L40
            java.lang.Object r0 = r4.f9560     // Catch: java.lang.Throwable -> L3e
            ᛶᲈᛱᲈ r0 = (defpackage.C1180) r0     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r0 = r0.f5356     // Catch: java.lang.Throwable -> L3e
            ᛷᲁᛷᛶ r0 = (defpackage.C1372) r0     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = "image_manager_disk_cache"
            android.content.Context r0 = r0.f6000     // Catch: java.lang.Throwable -> L3e
            java.io.File r0 = r0.getCacheDir()     // Catch: java.lang.Throwable -> L3e
            r2 = 0
            if (r0 != 0) goto L22
            r3 = r2
            goto L27
        L22:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L3e
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> L3e
        L27:
            if (r3 != 0) goto L2a
            goto L3b
        L2a:
            boolean r0 = r3.isDirectory()     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L36
            boolean r0 = r3.mkdirs()     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L3b
        L36:
            ᛲᛶᛲᲁ r2 = new ᛲᛶᛲᲁ     // Catch: java.lang.Throwable -> L3e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3e
        L3b:
            r4.f9561 = r2     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r0 = move-exception
            goto L51
        L40:
            java.lang.Object r0 = r4.f9561     // Catch: java.lang.Throwable -> L3e
            ᛲᲇᛵᲈ r0 = (defpackage.InterfaceC0373) r0     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L4f
            ᛷᲈᲀ r0 = new ᛷᲈᲀ     // Catch: java.lang.Throwable -> L3e
            r1 = 18
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3e
            r4.f9561 = r0     // Catch: java.lang.Throwable -> L3e
        L4f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3e
            goto L53
        L51:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3e
            throw r0
        L53:
            java.lang.Object r4 = r4.f9561
            ᛲᲇᛵᲈ r4 = (defpackage.InterfaceC0373) r4
            return r4
    }
}
