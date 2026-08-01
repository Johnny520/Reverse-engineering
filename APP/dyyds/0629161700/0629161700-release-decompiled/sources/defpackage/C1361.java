package defpackage;

/* JADX INFO: renamed from: ᛷᲁᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1361 implements defpackage.InterfaceC1850, defpackage.InterfaceC2076 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f5952;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public volatile defpackage.InterfaceC2076 f5953;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public volatile defpackage.InterfaceC2076 f5954;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Object f5955;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC1850 f5956;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f5957;

    public C1361(java.lang.Object r2, defpackage.InterfaceC1850 r3) {
            r1 = this;
            r1.<init>()
            r0 = 3
            r1.f5952 = r0
            r1.f5957 = r0
            r1.f5955 = r2
            r1.f5956 = r3
            return
    }

    @Override // defpackage.InterfaceC2076
    public final void clear() {
            r3 = this;
            java.lang.Object r0 = r3.f5955
            monitor-enter(r0)
            r1 = 3
            r3.f5952 = r1     // Catch: java.lang.Throwable -> L17
            ᲇᛶᲁᛴ r2 = r3.f5954     // Catch: java.lang.Throwable -> L17
            r2.clear()     // Catch: java.lang.Throwable -> L17
            int r2 = r3.f5957     // Catch: java.lang.Throwable -> L17
            if (r2 == r1) goto L19
            r3.f5957 = r1     // Catch: java.lang.Throwable -> L17
            ᲇᛶᲁᛴ r3 = r3.f5953     // Catch: java.lang.Throwable -> L17
            r3.clear()     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r3 = move-exception
            goto L1b
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r3
    }

    @Override // defpackage.InterfaceC1850
    public final defpackage.InterfaceC1850 getRoot() {
            r2 = this;
            java.lang.Object r0 = r2.f5955
            monitor-enter(r0)
            ᲁᛴᲈᛱ r1 = r2.f5956     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto Le
            ᲁᛴᲈᛱ r2 = r1.getRoot()     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r2 = move-exception
            goto L10
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r2
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }

    @Override // defpackage.InterfaceC2076
    public final boolean isRunning() {
            r3 = this;
            java.lang.Object r0 = r3.f5955
            monitor-enter(r0)
            int r1 = r3.f5952     // Catch: java.lang.Throwable -> Lf
            r2 = 1
            if (r1 == r2) goto L11
            int r3 = r3.f5957     // Catch: java.lang.Throwable -> Lf
            if (r3 != r2) goto Ld
            goto L11
        Ld:
            r2 = 0
            goto L11
        Lf:
            r3 = move-exception
            goto L13
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r2
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    @Override // defpackage.InterfaceC2076
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final boolean mo920() {
            r3 = this;
            java.lang.Object r0 = r3.f5955
            monitor-enter(r0)
            int r1 = r3.f5952     // Catch: java.lang.Throwable -> Le
            r2 = 3
            if (r1 != r2) goto L10
            int r3 = r3.f5957     // Catch: java.lang.Throwable -> Le
            if (r3 != r2) goto L10
            r3 = 1
            goto L11
        Le:
            r3 = move-exception
            goto L13
        L10:
            r3 = 0
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r3
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
    }

    @Override // defpackage.InterfaceC2076
    /* JADX INFO: renamed from: ᛲᛲᛵ */
    public final boolean mo921() {
            r3 = this;
            java.lang.Object r0 = r3.f5955
            monitor-enter(r0)
            int r1 = r3.f5952     // Catch: java.lang.Throwable -> Lf
            r2 = 4
            if (r1 == r2) goto L11
            int r3 = r3.f5957     // Catch: java.lang.Throwable -> Lf
            if (r3 != r2) goto Ld
            goto L11
        Ld:
            r3 = 0
            goto L12
        Lf:
            r3 = move-exception
            goto L14
        L11:
            r3 = 1
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r3
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    @Override // defpackage.InterfaceC2076
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final void mo922() {
            r4 = this;
            java.lang.Object r0 = r4.f5955
            monitor-enter(r0)
            int r1 = r4.f5952     // Catch: java.lang.Throwable -> L11
            r2 = 2
            r3 = 1
            if (r1 != r3) goto L13
            r4.f5952 = r2     // Catch: java.lang.Throwable -> L11
            ᲇᛶᲁᛴ r1 = r4.f5954     // Catch: java.lang.Throwable -> L11
            r1.mo922()     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r4 = move-exception
            goto L20
        L13:
            int r1 = r4.f5957     // Catch: java.lang.Throwable -> L11
            if (r1 != r3) goto L1e
            r4.f5957 = r2     // Catch: java.lang.Throwable -> L11
            ᲇᛶᲁᛴ r4 = r4.f5953     // Catch: java.lang.Throwable -> L11
            r4.mo922()     // Catch: java.lang.Throwable -> L11
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r4
    }

    @Override // defpackage.InterfaceC1850
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final void mo923(defpackage.InterfaceC2076 r3) {
            r2 = this;
            java.lang.Object r0 = r2.f5955
            monitor-enter(r0)
            ᲇᛶᲁᛴ r1 = r2.f5953     // Catch: java.lang.Throwable -> L1b
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L1b
            r1 = 5
            if (r3 != 0) goto L1f
            r2.f5952 = r1     // Catch: java.lang.Throwable -> L1b
            int r3 = r2.f5957     // Catch: java.lang.Throwable -> L1b
            r1 = 1
            if (r3 == r1) goto L1d
            r2.f5957 = r1     // Catch: java.lang.Throwable -> L1b
            ᲇᛶᲁᛴ r2 = r2.f5953     // Catch: java.lang.Throwable -> L1b
            r2.mo927()     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r2 = move-exception
            goto L2a
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L1f:
            r2.f5957 = r1     // Catch: java.lang.Throwable -> L1b
            ᲁᛴᲈᛱ r3 = r2.f5956     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L28
            r3.mo923(r2)     // Catch: java.lang.Throwable -> L1b
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r2
    }

    @Override // defpackage.InterfaceC1850
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final boolean mo924(defpackage.InterfaceC2076 r6) {
            r5 = this;
            java.lang.Object r0 = r5.f5955
            monitor-enter(r0)
            ᲁᛴᲈᛱ r1 = r5.f5956     // Catch: java.lang.Throwable -> L32
            r2 = 0
            if (r1 == 0) goto Le
            boolean r1 = r1.mo924(r5)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L30
        Le:
            int r1 = r5.f5952     // Catch: java.lang.Throwable -> L32
            r3 = 1
            r4 = 5
            if (r1 == r4) goto L1b
            ᲇᛶᲁᛴ r5 = r5.f5954     // Catch: java.lang.Throwable -> L32
            boolean r5 = r6.equals(r5)     // Catch: java.lang.Throwable -> L32
            goto L2d
        L1b:
            ᲇᛶᲁᛴ r1 = r5.f5953     // Catch: java.lang.Throwable -> L32
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Throwable -> L32
            if (r6 == 0) goto L2c
            int r5 = r5.f5957     // Catch: java.lang.Throwable -> L32
            r6 = 4
            if (r5 == r6) goto L2a
            if (r5 != r4) goto L2c
        L2a:
            r5 = r3
            goto L2d
        L2c:
            r5 = r2
        L2d:
            if (r5 == 0) goto L30
            r2 = r3
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r2
        L32:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
    }

    @Override // defpackage.InterfaceC1850
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final boolean mo925(defpackage.InterfaceC2076 r3) {
            r2 = this;
            java.lang.Object r0 = r2.f5955
            monitor-enter(r0)
            ᲁᛴᲈᛱ r1 = r2.f5956     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto Ld
            boolean r1 = r1.mo925(r2)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L17
        Ld:
            ᲇᛶᲁᛴ r2 = r2.f5954     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return r2
        L1a:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r2
    }

    @Override // defpackage.InterfaceC1850, defpackage.InterfaceC2076
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final boolean mo926() {
            r2 = this;
            java.lang.Object r0 = r2.f5955
            monitor-enter(r0)
            ᲇᛶᲁᛴ r1 = r2.f5954     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.mo926()     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            ᲇᛶᲁᛴ r2 = r2.f5953     // Catch: java.lang.Throwable -> L16
            boolean r2 = r2.mo926()     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L14
            goto L18
        L14:
            r2 = 0
            goto L19
        L16:
            r2 = move-exception
            goto L1b
        L18:
            r2 = 1
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return r2
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r2
    }

    @Override // defpackage.InterfaceC2076
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final void mo927() {
            r3 = this;
            java.lang.Object r0 = r3.f5955
            monitor-enter(r0)
            int r1 = r3.f5952     // Catch: java.lang.Throwable -> L10
            r2 = 1
            if (r1 == r2) goto L12
            r3.f5952 = r2     // Catch: java.lang.Throwable -> L10
            ᲇᛶᲁᛴ r3 = r3.f5954     // Catch: java.lang.Throwable -> L10
            r3.mo927()     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r3 = move-exception
            goto L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    @Override // defpackage.InterfaceC2076
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final boolean mo928(defpackage.InterfaceC2076 r4) {
            r3 = this;
            boolean r0 = r4 instanceof defpackage.C1361
            r1 = 0
            if (r0 == 0) goto L1d
            ᛷᲁᛱ r4 = (defpackage.C1361) r4
            ᲇᛶᲁᛴ r0 = r3.f5954
            ᲇᛶᲁᛴ r2 = r4.f5954
            boolean r0 = r0.mo928(r2)
            if (r0 == 0) goto L1d
            ᲇᛶᲁᛴ r3 = r3.f5953
            ᲇᛶᲁᛴ r4 = r4.f5953
            boolean r3 = r3.mo928(r4)
            if (r3 == 0) goto L1d
            r3 = 1
            return r3
        L1d:
            return r1
    }

    @Override // defpackage.InterfaceC1850
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final boolean mo929(defpackage.InterfaceC2076 r2) {
            r1 = this;
            java.lang.Object r2 = r1.f5955
            monitor-enter(r2)
            ᲁᛴᲈᛱ r0 = r1.f5956     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L10
            boolean r1 = r0.mo929(r1)     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto Le
            goto L10
        Le:
            r1 = 0
            goto L11
        L10:
            r1 = 1
        L11:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            return r1
        L13:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r1
    }

    @Override // defpackage.InterfaceC1850
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final void mo930(defpackage.InterfaceC2076 r4) {
            r3 = this;
            java.lang.Object r0 = r3.f5955
            monitor-enter(r0)
            ᲇᛶᲁᛴ r1 = r3.f5954     // Catch: java.lang.Throwable -> Lf
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Throwable -> Lf
            r2 = 4
            if (r1 == 0) goto L11
            r3.f5952 = r2     // Catch: java.lang.Throwable -> Lf
            goto L1b
        Lf:
            r3 = move-exception
            goto L24
        L11:
            ᲇᛶᲁᛴ r1 = r3.f5953     // Catch: java.lang.Throwable -> Lf
            boolean r4 = r4.equals(r1)     // Catch: java.lang.Throwable -> Lf
            if (r4 == 0) goto L1b
            r3.f5957 = r2     // Catch: java.lang.Throwable -> Lf
        L1b:
            ᲁᛴᲈᛱ r4 = r3.f5956     // Catch: java.lang.Throwable -> Lf
            if (r4 == 0) goto L22
            r4.mo930(r3)     // Catch: java.lang.Throwable -> Lf
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }
}
