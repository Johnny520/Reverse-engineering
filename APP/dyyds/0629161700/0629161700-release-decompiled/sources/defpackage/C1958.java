package defpackage;

/* JADX INFO: renamed from: ᲁᲈᛲᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1958 implements defpackage.InterfaceC0319 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final java.util.ArrayDeque f8510;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final defpackage.C1972 f8511;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final defpackage.C1122 f8512;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public boolean f8513;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public java.io.IOException f8514;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C1835 f8515;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final defpackage.C1122 f8516;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C2361 f8517;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f8518;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final defpackage.C0969 f8519;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public int f8520;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public long f8521;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public long f8522;

    public C1958(int r4, defpackage.C2361 r5, boolean r6, boolean r7, defpackage.C0024 r8) {
            r3 = this;
            r3.<init>()
            r3.f8518 = r4
            r3.f8517 = r5
            ᲁᛳᛸᲈ r0 = new ᲁᛳᛸᲈ
            r0.<init>(r4)
            r3.f8515 = r0
            ᛴᛶᛳᛷ r4 = r5.f10211
            int r4 = r4.m1574()
            long r0 = (long) r4
            r3.f8522 = r0
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            r3.f8510 = r4
            ᛵᲁᛵᛴ r0 = new ᛵᲁᛵᛴ
            ᛴᛶᛳᛷ r5 = r5.f10213
            int r5 = r5.m1574()
            long r1 = (long) r5
            r0.<init>(r3, r1, r7)
            r3.f8519 = r0
            ᲁᲈᲀᲀ r5 = new ᲁᲈᲀᲀ
            r5.<init>(r3, r6)
            r3.f8511 = r5
            ᛶᛸᛲᛵ r5 = new ᛶᛸᛲᛵ
            r5.<init>(r3)
            r3.f8512 = r5
            ᛶᛸᛲᛵ r5 = new ᛶᛸᛲᛵ
            r5.<init>(r3)
            r3.f8516 = r5
            r5 = 0
            if (r8 == 0) goto L54
            boolean r3 = r3.m3373()
            if (r3 != 0) goto L4e
            r4.add(r8)
            return
        L4e:
            java.lang.String r3 = "locally-initiated streams shouldn't have headers yet"
            defpackage.C2264.m3676(r3)
            throw r5
        L54:
            boolean r3 = r3.m3373()
            if (r3 == 0) goto L5b
            return
        L5b:
            java.lang.String r3 = "remotely-initiated streams should have headers"
            defpackage.C2264.m3676(r3)
            throw r5
    }

    @Override // defpackage.InterfaceC0319
    public final defpackage.InterfaceC2182 getSource() {
            r0 = this;
            ᛵᲁᛵᛴ r0 = r0.f8519
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final boolean m3373() {
            r3 = this;
            int r0 = r3.f8518
            r1 = 1
            r0 = r0 & r1
            r2 = 0
            if (r0 != r1) goto L9
            r0 = r1
            goto La
        L9:
            r0 = r2
        La:
            ᲈᲈ r3 = r3.f8517
            r3.getClass()
            if (r1 != r0) goto L12
            return r1
        L12:
            return r2
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final boolean m3374() {
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.m3381()     // Catch: java.lang.Throwable -> L15
            r1 = 0
            if (r0 == 0) goto La
            monitor-exit(r3)
            return r1
        La:
            ᛵᲁᛵᛴ r0 = r3.f8519     // Catch: java.lang.Throwable -> L15
            boolean r2 = r0.f4323     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L17
            boolean r0 = r0.f4326     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L27
            goto L17
        L15:
            r0 = move-exception
            goto L2a
        L17:
            ᲁᲈᲀᲀ r0 = r3.f8511     // Catch: java.lang.Throwable -> L15
            boolean r2 = r0.f8554     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L21
            boolean r0 = r0.f8552     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L27
        L21:
            boolean r0 = r3.f8513     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L27
            monitor-exit(r3)
            return r1
        L27:
            monitor-exit(r3)
            r3 = 1
            return r3
        L2a:
            monitor-exit(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void m3375(int r2) {
            r1 = this;
            r0 = 0
            boolean r0 = r1.m3376(r2, r0)
            if (r0 != 0) goto L8
            return
        L8:
            ᲈᲈ r0 = r1.f8517
            int r1 = r1.f8518
            r0.m3859(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final boolean m3376(int r3, java.io.IOException r4) {
            r2 = this;
            java.util.TimeZone r0 = defpackage.AbstractC0508.f2501
            monitor-enter(r2)
            int r0 = r2.m3381()     // Catch: java.lang.Throwable -> L21
            r1 = 0
            if (r0 == 0) goto Lc
            monitor-exit(r2)
            return r1
        Lc:
            r2.f8520 = r3     // Catch: java.lang.Throwable -> L21
            r2.f8514 = r4     // Catch: java.lang.Throwable -> L21
            r2.notifyAll()     // Catch: java.lang.Throwable -> L21
            ᛵᲁᛵᛴ r3 = r2.f8519     // Catch: java.lang.Throwable -> L21
            boolean r3 = r3.f4323     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L23
            ᲁᲈᲀᲀ r3 = r2.f8511     // Catch: java.lang.Throwable -> L21
            boolean r3 = r3.f8554     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L23
            monitor-exit(r2)
            return r1
        L21:
            r3 = move-exception
            goto L2d
        L23:
            monitor-exit(r2)
            ᲈᲈ r3 = r2.f8517
            int r2 = r2.f8518
            r3.m3858(r2)
            r2 = 1
            return r2
        L2d:
            monitor-exit(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m3377(int r1, java.io.IOException r2) {
            r0 = this;
            boolean r2 = r0.m3376(r1, r2)
            if (r2 != 0) goto L7
            return
        L7:
            int r2 = r0.f8518
            ᲈᲈ r0 = r0.f8517
            ᛴᲈᛲᲀ r0 = r0.f10229
            r0.m1718(r2, r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m3378() {
            r2 = this;
            java.util.TimeZone r0 = defpackage.AbstractC0508.f2501
            monitor-enter(r2)
            ᛵᲁᛵᛴ r0 = r2.f8519     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f4323     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1c
            boolean r0 = r0.f4326     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            ᲁᲈᲀᲀ r0 = r2.f8511     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f8554     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            boolean r0 = r0.f8552     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            goto L1a
        L18:
            r0 = move-exception
            goto L35
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            boolean r1 = r2.m3374()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            if (r0 == 0) goto L2b
            r0 = 9
            r1 = 0
            r2.m3377(r0, r1)
            return
        L2b:
            if (r1 != 0) goto L34
            ᲈᲈ r0 = r2.f8517
            int r2 = r2.f8518
            r0.m3858(r2)
        L34:
            return
        L35:
            monitor-exit(r2)
            throw r0
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final void m3379(defpackage.C0024 r3, boolean r4) {
            r2 = this;
            java.util.TimeZone r0 = defpackage.AbstractC0508.f2501
            monitor-enter(r2)
            boolean r0 = r2.f8513     // Catch: java.lang.Throwable -> L1f
            r1 = 1
            if (r0 == 0) goto L21
            java.lang.String r0 = ":status"
            java.lang.String r0 = r3.m324(r0)     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L21
            java.lang.String r0 = ":method"
            java.lang.String r0 = r3.m324(r0)     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L19
            goto L21
        L19:
            ᛵᲁᛵᛴ r3 = r2.f8519     // Catch: java.lang.Throwable -> L1f
            r3.getClass()     // Catch: java.lang.Throwable -> L1f
            goto L28
        L1f:
            r3 = move-exception
            goto L40
        L21:
            r2.f8513 = r1     // Catch: java.lang.Throwable -> L1f
            java.util.ArrayDeque r0 = r2.f8510     // Catch: java.lang.Throwable -> L1f
            r0.add(r3)     // Catch: java.lang.Throwable -> L1f
        L28:
            if (r4 == 0) goto L2e
            ᛵᲁᛵᛴ r3 = r2.f8519     // Catch: java.lang.Throwable -> L1f
            r3.f4323 = r1     // Catch: java.lang.Throwable -> L1f
        L2e:
            boolean r3 = r2.m3374()     // Catch: java.lang.Throwable -> L1f
            r2.notifyAll()     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r2)
            if (r3 != 0) goto L3f
            ᲈᲈ r3 = r2.f8517
            int r2 = r2.f8518
            r3.m3858(r2)
        L3f:
            return
        L40:
            monitor-exit(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m3380() {
            r2 = this;
            ᲁᲈᲀᲀ r0 = r2.f8511
            boolean r1 = r0.f8552
            if (r1 != 0) goto L26
            boolean r0 = r0.f8554
            if (r0 != 0) goto L20
            int r0 = r2.m3381()
            if (r0 == 0) goto L1f
            java.io.IOException r0 = r2.f8514
            if (r0 == 0) goto L15
            goto L1e
        L15:
            ᛳᛸᲁᲈ r0 = new ᛳᛸᲁᲈ
            int r2 = r2.m3381()
            r0.<init>(r2)
        L1e:
            throw r0
        L1f:
            return
        L20:
            java.lang.String r2 = "stream finished"
            defpackage.C2264.m3682(r2)
            return
        L26:
            java.lang.String r2 = "stream closed"
            defpackage.C2264.m3682(r2)
            return
    }

    @Override // defpackage.InterfaceC0319
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final defpackage.InterfaceC2085 mo967() {
            r0 = this;
            ᲁᲈᲀᲀ r0 = r0.f8511
            return r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final int m3381() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.f8520     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
