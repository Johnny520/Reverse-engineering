package defpackage;

/* JADX INFO: renamed from: ᛷᲀᛳᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1349 implements defpackage.InterfaceC0270 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1033 f5925;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final long f5926;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC0270 f5927;

    public C1349(defpackage.C1033 r1, defpackage.InterfaceC0270 r2) {
            r0 = this;
            r0.<init>()
            r0.f5925 = r1
            r0.f5927 = r2
            long r1 = defpackage.AbstractC2279.m3702()
            r0.f5926 = r1
            return
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r7 = this;
            ᛶᛳᛴᛶ r0 = r7.f5925
            boolean r0 = r0.f4599
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L1f
            long r3 = r7.f5926
            long r5 = defpackage.AbstractC2279.m3702()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L19
            ᛲᛳᲇᛱ r7 = r7.f5927
            r7.close()
            return
        L19:
            java.lang.String r7 = "Attempted to use statement on a different thread"
            defpackage.AbstractC1628.m2954(r2, r7)
            throw r1
        L1f:
            java.lang.String r7 = "Statement is recycled"
            defpackage.AbstractC1628.m2954(r2, r7)
            throw r1
    }

    @Override // defpackage.InterfaceC0270
    public final int getColumnCount() {
            r7 = this;
            ᛶᛳᛴᛶ r0 = r7.f5925
            boolean r0 = r0.f4599
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L20
            long r3 = r7.f5926
            long r5 = defpackage.AbstractC2279.m3702()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L1a
            ᛲᛳᲇᛱ r7 = r7.f5927
            int r7 = r7.getColumnCount()
            return r7
        L1a:
            java.lang.String r7 = "Attempted to use statement on a different thread"
            defpackage.AbstractC1628.m2954(r2, r7)
            throw r1
        L20:
            java.lang.String r7 = "Statement is recycled"
            defpackage.AbstractC1628.m2954(r2, r7)
            throw r1
    }

    @Override // defpackage.InterfaceC0270
    public final java.lang.String getColumnName(int r8) {
            r7 = this;
            ᛶᛳᛴᛶ r0 = r7.f5925
            boolean r0 = r0.f4599
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L20
            long r3 = r7.f5926
            long r5 = defpackage.AbstractC2279.m3702()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L1a
            ᛲᛳᲇᛱ r7 = r7.f5927
            java.lang.String r7 = r7.getColumnName(r8)
            return r7
        L1a:
            java.lang.String r7 = "Attempted to use statement on a different thread"
            defpackage.AbstractC1628.m2954(r2, r7)
            throw r1
        L20:
            java.lang.String r7 = "Statement is recycled"
            defpackage.AbstractC1628.m2954(r2, r7)
            throw r1
    }

    @Override // defpackage.InterfaceC0270
    public final long getLong(int r8) {
            r7 = this;
            ᛶᛳᛴᛶ r0 = r7.f5925
            boolean r0 = r0.f4599
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L20
            long r3 = r7.f5926
            long r5 = defpackage.AbstractC2279.m3702()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L1a
            ᛲᛳᲇᛱ r7 = r7.f5927
            long r7 = r7.getLong(r8)
            return r7
        L1a:
            java.lang.String r7 = "Attempted to use statement on a different thread"
            defpackage.AbstractC1628.m2954(r2, r7)
            throw r1
        L20:
            java.lang.String r7 = "Statement is recycled"
            defpackage.AbstractC1628.m2954(r2, r7)
            throw r1
    }

    @Override // defpackage.InterfaceC0270
    public final boolean isNull(int r8) {
            r7 = this;
            ᛶᛳᛴᛶ r0 = r7.f5925
            boolean r0 = r0.f4599
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L20
            long r3 = r7.f5926
            long r5 = defpackage.AbstractC2279.m3702()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L1a
            ᛲᛳᲇᛱ r7 = r7.f5927
            boolean r7 = r7.isNull(r8)
            return r7
        L1a:
            java.lang.String r7 = "Attempted to use statement on a different thread"
            defpackage.AbstractC1628.m2954(r2, r7)
            throw r1
        L20:
            java.lang.String r7 = "Statement is recycled"
            defpackage.AbstractC1628.m2954(r2, r7)
            throw r1
    }

    @Override // defpackage.InterfaceC0270
    public final void reset() {
            r7 = this;
            ᛶᛳᛴᛶ r0 = r7.f5925
            boolean r0 = r0.f4599
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L1f
            long r3 = r7.f5926
            long r5 = defpackage.AbstractC2279.m3702()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L19
            ᛲᛳᲇᛱ r7 = r7.f5927
            r7.reset()
            return
        L19:
            java.lang.String r7 = "Attempted to use statement on a different thread"
            defpackage.AbstractC1628.m2954(r2, r7)
            throw r1
        L1f:
            java.lang.String r7 = "Statement is recycled"
            defpackage.AbstractC1628.m2954(r2, r7)
            throw r1
    }

    @Override // defpackage.InterfaceC0270
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.String mo526(int r8) {
            r7 = this;
            ᛶᛳᛴᛶ r0 = r7.f5925
            boolean r0 = r0.f4599
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L20
            long r3 = r7.f5926
            long r5 = defpackage.AbstractC2279.m3702()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L1a
            ᛲᛳᲇᛱ r7 = r7.f5927
            java.lang.String r7 = r7.mo526(r8)
            return r7
        L1a:
            java.lang.String r7 = "Attempted to use statement on a different thread"
            defpackage.AbstractC1628.m2954(r2, r7)
            throw r1
        L20:
            java.lang.String r7 = "Statement is recycled"
            defpackage.AbstractC1628.m2954(r2, r7)
            throw r1
    }

    @Override // defpackage.InterfaceC0270
    /* JADX INFO: renamed from: ᛲᲈᛷᛵ */
    public final void mo527(int r8, java.lang.String r9) {
            r7 = this;
            ᛶᛳᛴᛶ r0 = r7.f5925
            boolean r0 = r0.f4599
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L1f
            long r3 = r7.f5926
            long r5 = defpackage.AbstractC2279.m3702()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L19
            ᛲᛳᲇᛱ r7 = r7.f5927
            r7.mo527(r8, r9)
            return
        L19:
            java.lang.String r7 = "Attempted to use statement on a different thread"
            defpackage.AbstractC1628.m2954(r2, r7)
            throw r1
        L1f:
            java.lang.String r7 = "Statement is recycled"
            defpackage.AbstractC1628.m2954(r2, r7)
            throw r1
    }

    @Override // defpackage.InterfaceC0270
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final void mo894() {
            r7 = this;
            ᛶᛳᛴᛶ r0 = r7.f5925
            boolean r0 = r0.f4599
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L1f
            long r3 = r7.f5926
            long r5 = defpackage.AbstractC2279.m3702()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L19
            ᛲᛳᲇᛱ r7 = r7.f5927
            r7.mo894()
            return
        L19:
            java.lang.String r7 = "Attempted to use statement on a different thread"
            defpackage.AbstractC1628.m2954(r2, r7)
            throw r1
        L1f:
            java.lang.String r7 = "Statement is recycled"
            defpackage.AbstractC1628.m2954(r2, r7)
            throw r1
    }

    @Override // defpackage.InterfaceC0270
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo528(long r8, int r10) {
            r7 = this;
            ᛶᛳᛴᛶ r0 = r7.f5925
            boolean r0 = r0.f4599
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L1f
            long r3 = r7.f5926
            long r5 = defpackage.AbstractC2279.m3702()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L19
            ᛲᛳᲇᛱ r7 = r7.f5927
            r7.mo528(r8, r10)
            return
        L19:
            java.lang.String r7 = "Attempted to use statement on a different thread"
            defpackage.AbstractC1628.m2954(r2, r7)
            throw r1
        L1f:
            java.lang.String r7 = "Statement is recycled"
            defpackage.AbstractC1628.m2954(r2, r7)
            throw r1
    }

    @Override // defpackage.InterfaceC0270
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo529(int r8) {
            r7 = this;
            ᛶᛳᛴᛶ r0 = r7.f5925
            boolean r0 = r0.f4599
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L1f
            long r3 = r7.f5926
            long r5 = defpackage.AbstractC2279.m3702()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L19
            ᛲᛳᲇᛱ r7 = r7.f5927
            r7.mo529(r8)
            return
        L19:
            java.lang.String r7 = "Attempted to use statement on a different thread"
            defpackage.AbstractC1628.m2954(r2, r7)
            throw r1
        L1f:
            java.lang.String r7 = "Statement is recycled"
            defpackage.AbstractC1628.m2954(r2, r7)
            throw r1
    }

    @Override // defpackage.InterfaceC0270
    /* JADX INFO: renamed from: ᲈᛵᲀᛱ */
    public final boolean mo530() {
            r7 = this;
            ᛶᛳᛴᛶ r0 = r7.f5925
            boolean r0 = r0.f4599
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L20
            long r3 = r7.f5926
            long r5 = defpackage.AbstractC2279.m3702()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L1a
            ᛲᛳᲇᛱ r7 = r7.f5927
            boolean r7 = r7.mo530()
            return r7
        L1a:
            java.lang.String r7 = "Attempted to use statement on a different thread"
            defpackage.AbstractC1628.m2954(r2, r7)
            throw r1
        L20:
            java.lang.String r7 = "Statement is recycled"
            defpackage.AbstractC1628.m2954(r2, r7)
            throw r1
    }
}
