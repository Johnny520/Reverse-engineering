package defpackage;

/* JADX INFO: renamed from: ᛲᛴᲈᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0289 implements defpackage.InterfaceC1850, defpackage.InterfaceC2076 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f1570;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public volatile defpackage.InterfaceC2076 f1571;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public volatile defpackage.C1622 f1572;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.InterfaceC1850 f1573;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f1574;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f1575;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public boolean f1576;

    public C0289(java.lang.Object r2, defpackage.InterfaceC1850 r3) {
            r1 = this;
            r1.<init>()
            r0 = 3
            r1.f1570 = r0
            r1.f1575 = r0
            r1.f1574 = r2
            r1.f1573 = r3
            return
    }

    @Override // defpackage.InterfaceC2076
    public final void clear() {
            r2 = this;
            java.lang.Object r0 = r2.f1574
            monitor-enter(r0)
            r1 = 0
            r2.f1576 = r1     // Catch: java.lang.Throwable -> L17
            r1 = 3
            r2.f1570 = r1     // Catch: java.lang.Throwable -> L17
            r2.f1575 = r1     // Catch: java.lang.Throwable -> L17
            ᲇᛶᲁᛴ r1 = r2.f1571     // Catch: java.lang.Throwable -> L17
            r1.clear()     // Catch: java.lang.Throwable -> L17
            ᲀᛱᲇᛶ r2 = r2.f1572     // Catch: java.lang.Throwable -> L17
            r2.clear()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L17:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r2
    }

    @Override // defpackage.InterfaceC1850
    public final defpackage.InterfaceC1850 getRoot() {
            r2 = this;
            java.lang.Object r0 = r2.f1574
            monitor-enter(r0)
            ᲁᛴᲈᛱ r1 = r2.f1573     // Catch: java.lang.Throwable -> Lc
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
            r2 = this;
            java.lang.Object r0 = r2.f1574
            monitor-enter(r0)
            int r2 = r2.f1570     // Catch: java.lang.Throwable -> Lc
            r1 = 1
            if (r2 != r1) goto L9
            goto La
        L9:
            r1 = 0
        La:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }

    @Override // defpackage.InterfaceC2076
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final boolean mo920() {
            r2 = this;
            java.lang.Object r0 = r2.f1574
            monitor-enter(r0)
            int r2 = r2.f1570     // Catch: java.lang.Throwable -> Ld
            r1 = 3
            if (r2 != r1) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r2
        Ld:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    @Override // defpackage.InterfaceC2076
    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final boolean mo921() {
            r2 = this;
            java.lang.Object r0 = r2.f1574
            monitor-enter(r0)
            int r2 = r2.f1570     // Catch: java.lang.Throwable -> Ld
            r1 = 4
            if (r2 != r1) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r2
        Ld:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    @Override // defpackage.InterfaceC2076
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final void mo922() {
            r3 = this;
            java.lang.Object r0 = r3.f1574
            monitor-enter(r0)
            int r1 = r3.f1575     // Catch: java.lang.Throwable -> L14
            boolean r1 = defpackage.AbstractC1124.m2152(r1)     // Catch: java.lang.Throwable -> L14
            r2 = 2
            if (r1 != 0) goto L16
            r3.f1575 = r2     // Catch: java.lang.Throwable -> L14
            ᲇᛶᲁᛴ r1 = r3.f1571     // Catch: java.lang.Throwable -> L14
            r1.mo922()     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r3 = move-exception
            goto L27
        L16:
            int r1 = r3.f1570     // Catch: java.lang.Throwable -> L14
            boolean r1 = defpackage.AbstractC1124.m2152(r1)     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L25
            r3.f1570 = r2     // Catch: java.lang.Throwable -> L14
            ᲀᛱᲇᛶ r3 = r3.f1572     // Catch: java.lang.Throwable -> L14
            r3.mo922()     // Catch: java.lang.Throwable -> L14
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    @Override // defpackage.InterfaceC1850
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void mo923(defpackage.InterfaceC2076 r3) {
            r2 = this;
            java.lang.Object r0 = r2.f1574
            monitor-enter(r0)
            ᲀᛱᲇᛶ r1 = r2.f1572     // Catch: java.lang.Throwable -> L10
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L10
            r1 = 5
            if (r3 != 0) goto L12
            r2.f1575 = r1     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r2 = move-exception
            goto L1d
        L12:
            r2.f1570 = r1     // Catch: java.lang.Throwable -> L10
            ᲁᛴᲈᛱ r3 = r2.f1573     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L1b
            r3.mo923(r2)     // Catch: java.lang.Throwable -> L10
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    @Override // defpackage.InterfaceC1850
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final boolean mo924(defpackage.InterfaceC2076 r3) {
            r2 = this;
            java.lang.Object r0 = r2.f1574
            monitor-enter(r0)
            ᲁᛴᲈᛱ r1 = r2.f1573     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto Ld
            boolean r1 = r1.mo924(r2)     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
        Ld:
            ᲀᛱᲇᛶ r1 = r2.f1572     // Catch: java.lang.Throwable -> L1d
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L1f
            boolean r2 = r2.mo926()     // Catch: java.lang.Throwable -> L1d
            if (r2 != 0) goto L1f
            r2 = 1
            goto L20
        L1d:
            r2 = move-exception
            goto L22
        L1f:
            r2 = 0
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return r2
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r2
    }

    @Override // defpackage.InterfaceC1850
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final boolean mo925(defpackage.InterfaceC2076 r3) {
            r2 = this;
            java.lang.Object r0 = r2.f1574
            monitor-enter(r0)
            ᲁᛴᲈᛱ r1 = r2.f1573     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto Ld
            boolean r1 = r1.mo925(r2)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1e
        Ld:
            ᲀᛱᲇᛶ r1 = r2.f1572     // Catch: java.lang.Throwable -> L1c
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L1e
            int r2 = r2.f1570     // Catch: java.lang.Throwable -> L1c
            r3 = 2
            if (r2 == r3) goto L1e
            r2 = 1
            goto L1f
        L1c:
            r2 = move-exception
            goto L21
        L1e:
            r2 = 0
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return r2
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r2
    }

    @Override // defpackage.InterfaceC1850, defpackage.InterfaceC2076
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean mo926() {
            r2 = this;
            java.lang.Object r0 = r2.f1574
            monitor-enter(r0)
            ᲇᛶᲁᛴ r1 = r2.f1571     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.mo926()     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            ᲀᛱᲇᛶ r2 = r2.f1572     // Catch: java.lang.Throwable -> L16
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
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final void mo927() {
            r5 = this;
            java.lang.Object r0 = r5.f1574
            monitor-enter(r0)
            r1 = 1
            r5.f1576 = r1     // Catch: java.lang.Throwable -> L2d
            r2 = 0
            int r3 = r5.f1570     // Catch: java.lang.Throwable -> L18
            r4 = 4
            if (r3 == r4) goto L1a
            int r3 = r5.f1575     // Catch: java.lang.Throwable -> L18
            if (r3 == r1) goto L1a
            r5.f1575 = r1     // Catch: java.lang.Throwable -> L18
            ᲇᛶᲁᛴ r3 = r5.f1571     // Catch: java.lang.Throwable -> L18
            r3.mo927()     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r1 = move-exception
            goto L2f
        L1a:
            boolean r3 = r5.f1576     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L29
            int r3 = r5.f1570     // Catch: java.lang.Throwable -> L18
            if (r3 == r1) goto L29
            r5.f1570 = r1     // Catch: java.lang.Throwable -> L18
            ᲀᛱᲇᛶ r1 = r5.f1572     // Catch: java.lang.Throwable -> L18
            r1.mo927()     // Catch: java.lang.Throwable -> L18
        L29:
            r5.f1576 = r2     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            return
        L2d:
            r5 = move-exception
            goto L32
        L2f:
            r5.f1576 = r2     // Catch: java.lang.Throwable -> L2d
            throw r1     // Catch: java.lang.Throwable -> L2d
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            throw r5
    }

    @Override // defpackage.InterfaceC2076
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final boolean mo928(defpackage.InterfaceC2076 r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.C0289
            if (r0 == 0) goto L2e
            ᛲᛴᲈᛷ r3 = (defpackage.C0289) r3
            ᲀᛱᲇᛶ r0 = r2.f1572
            if (r0 != 0) goto Lf
            ᲀᛱᲇᛶ r0 = r3.f1572
            if (r0 != 0) goto L2e
            goto L19
        Lf:
            ᲀᛱᲇᛶ r0 = r2.f1572
            ᲀᛱᲇᛶ r1 = r3.f1572
            boolean r0 = r0.mo928(r1)
            if (r0 == 0) goto L2e
        L19:
            ᲇᛶᲁᛴ r0 = r2.f1571
            if (r0 != 0) goto L22
            ᲇᛶᲁᛴ r2 = r3.f1571
            if (r2 != 0) goto L2e
            goto L2c
        L22:
            ᲇᛶᲁᛴ r2 = r2.f1571
            ᲇᛶᲁᛴ r3 = r3.f1571
            boolean r2 = r2.mo928(r3)
            if (r2 == 0) goto L2e
        L2c:
            r2 = 1
            return r2
        L2e:
            r2 = 0
            return r2
    }

    @Override // defpackage.InterfaceC1850
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final boolean mo929(defpackage.InterfaceC2076 r3) {
            r2 = this;
            java.lang.Object r0 = r2.f1574
            monitor-enter(r0)
            ᲁᛴᲈᛱ r1 = r2.f1573     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto Ld
            boolean r1 = r1.mo929(r2)     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1b
        Ld:
            ᲀᛱᲇᛶ r1 = r2.f1572     // Catch: java.lang.Throwable -> L1d
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L1d
            if (r3 != 0) goto L1f
            int r2 = r2.f1570     // Catch: java.lang.Throwable -> L1d
            r3 = 4
            if (r2 == r3) goto L1b
            goto L1f
        L1b:
            r2 = 0
            goto L20
        L1d:
            r2 = move-exception
            goto L22
        L1f:
            r2 = 1
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return r2
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r2
    }

    @Override // defpackage.InterfaceC1850
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final void mo930(defpackage.InterfaceC2076 r3) {
            r2 = this;
            java.lang.Object r0 = r2.f1574
            monitor-enter(r0)
            ᲇᛶᲁᛴ r1 = r2.f1571     // Catch: java.lang.Throwable -> L10
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L10
            r1 = 4
            if (r3 == 0) goto L12
            r2.f1575 = r1     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r2 = move-exception
            goto L2a
        L12:
            r2.f1570 = r1     // Catch: java.lang.Throwable -> L10
            ᲁᛴᲈᛱ r3 = r2.f1573     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L1b
            r3.mo930(r2)     // Catch: java.lang.Throwable -> L10
        L1b:
            int r3 = r2.f1575     // Catch: java.lang.Throwable -> L10
            boolean r3 = defpackage.AbstractC1124.m2152(r3)     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L28
            ᲇᛶᲁᛴ r2 = r2.f1571     // Catch: java.lang.Throwable -> L10
            r2.clear()     // Catch: java.lang.Throwable -> L10
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r2
    }
}
