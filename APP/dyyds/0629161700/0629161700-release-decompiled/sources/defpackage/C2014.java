package defpackage;

/* JADX INFO: renamed from: ᲇᛳᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2014 implements defpackage.InterfaceC1901 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int f8700;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public boolean f8701;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.InterfaceC1901 f8702;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final boolean f8703;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final boolean f8704;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C0827 f8705;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.InterfaceC1711 f8706;

    public C2014(defpackage.InterfaceC1901 r2, boolean r3, boolean r4, defpackage.InterfaceC1711 r5, defpackage.C0827 r6) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Argument must not be null"
            defpackage.C0292.m944(r2, r0)
            r1.f8702 = r2
            r1.f8704 = r3
            r1.f8703 = r4
            r1.f8706 = r5
            defpackage.C0292.m944(r6, r0)
            r1.f8705 = r6
            return
    }

    @Override // defpackage.InterfaceC1901
    public final java.lang.Object get() {
            r0 = this;
            ᲁᛸᛸ r0 = r0.f8702
            java.lang.Object r0 = r0.get()
            return r0
    }

    public final synchronized java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "EngineResource{isMemoryCacheable="
            monitor-enter(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L4a
            boolean r0 = r2.f8704     // Catch: java.lang.Throwable -> L4a
            r1.append(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = ", listener="
            r1.append(r0)     // Catch: java.lang.Throwable -> L4a
            ᛵᛲᛵᛴ r0 = r2.f8705     // Catch: java.lang.Throwable -> L4a
            r1.append(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = ", key="
            r1.append(r0)     // Catch: java.lang.Throwable -> L4a
            ᲀᛷᛶᲈ r0 = r2.f8706     // Catch: java.lang.Throwable -> L4a
            r1.append(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = ", acquired="
            r1.append(r0)     // Catch: java.lang.Throwable -> L4a
            int r0 = r2.f8700     // Catch: java.lang.Throwable -> L4a
            r1.append(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = ", isRecycled="
            r1.append(r0)     // Catch: java.lang.Throwable -> L4a
            boolean r0 = r2.f8701     // Catch: java.lang.Throwable -> L4a
            r1.append(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = ", resource="
            r1.append(r0)     // Catch: java.lang.Throwable -> L4a
            ᲁᛸᛸ r0 = r2.f8702     // Catch: java.lang.Throwable -> L4a
            r1.append(r0)     // Catch: java.lang.Throwable -> L4a
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r2)
            return r0
        L4a:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4a
            throw r0
    }

    @Override // defpackage.InterfaceC1901
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final synchronized void mo692() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f8700     // Catch: java.lang.Throwable -> L16
            if (r0 > 0) goto L22
            boolean r0 = r2.f8701     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L1a
            r0 = 1
            r2.f8701 = r0     // Catch: java.lang.Throwable -> L16
            boolean r0 = r2.f8703     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L18
            ᲁᛸᛸ r0 = r2.f8702     // Catch: java.lang.Throwable -> L16
            r0.mo692()     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r0 = move-exception
            goto L2a
        L18:
            monitor-exit(r2)
            return
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = "Cannot recycle a resource that has already been recycled"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L16
            throw r0     // Catch: java.lang.Throwable -> L16
        L22:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = "Cannot recycle a resource while it is still acquired"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L16
            throw r0     // Catch: java.lang.Throwable -> L16
        L2a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r0
    }

    @Override // defpackage.InterfaceC1901
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final java.lang.Class mo693() {
            r0 = this;
            ᲁᛸᛸ r0 = r0.f8702
            java.lang.Class r0 = r0.mo693()
            return r0
    }

    @Override // defpackage.InterfaceC1901
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final int mo694() {
            r0 = this;
            ᲁᛸᛸ r0 = r0.f8702
            int r0 = r0.mo694()
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final synchronized void m3403() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f8701     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Lf
            int r0 = r2.f8700     // Catch: java.lang.Throwable -> Ld
            int r0 = r0 + 1
            r2.f8700 = r0     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return
        Ld:
            r0 = move-exception
            goto L17
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = "Cannot acquire a recycled resource"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Ld
            throw r0     // Catch: java.lang.Throwable -> Ld
        L17:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m3404() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f8700     // Catch: java.lang.Throwable -> L18
            if (r0 <= 0) goto L1a
            r1 = 1
            int r0 = r0 - r1
            r2.f8700 = r0     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L17
            ᛵᛲᛵᛴ r0 = r2.f8705
            ᲀᛷᛶᲈ r1 = r2.f8706
            r0.m1756(r1, r2)
        L17:
            return
        L18:
            r0 = move-exception
            goto L22
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "Cannot release a recycled or not yet acquired resource"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L18
            throw r0     // Catch: java.lang.Throwable -> L18
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r0
    }
}
