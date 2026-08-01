package defpackage;

/* JADX INFO: renamed from: ᛳᲁᛶᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0558 implements defpackage.InterfaceC0150, java.io.Serializable {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public java.util.concurrent.LinkedBlockingQueue f2748;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public defpackage.C1792 f2749;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public java.lang.String f2750;

    @Override // defpackage.InterfaceC0150
    public final java.lang.String getName() {
            r0 = this;
            java.lang.String r0 = r0.f2750
            return r0
    }

    @Override // defpackage.InterfaceC0150
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final boolean mo671() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.InterfaceC0150
    /* JADX INFO: renamed from: ᛲᛲᛵ */
    public final void mo672(java.lang.String r2) {
            r1 = this;
            r2 = 4
            r0 = 0
            r1.m1345(r2, r0)
            return
    }

    @Override // defpackage.InterfaceC0150
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final void mo673(java.lang.String r2) {
            r1 = this;
            r2 = 4
            r0 = 0
            r1.m1345(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final void m1344(int r3, java.lang.String r4, java.lang.Object[] r5) {
            r2 = this;
            int r4 = r5.length
            r0 = 0
            if (r4 != 0) goto L5
            goto L11
        L5:
            int r4 = r5.length
            int r4 = r4 + (-1)
            r4 = r5[r4]
            boolean r1 = r4 instanceof java.lang.Throwable
            if (r1 == 0) goto L11
            r0 = r4
            java.lang.Throwable r0 = (java.lang.Throwable) r0
        L11:
            if (r0 == 0) goto L2b
            int r4 = r5.length
            if (r4 == 0) goto L25
            int r4 = r5.length
            int r4 = r4 + (-1)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            if (r4 <= 0) goto L21
            r1 = 0
            java.lang.System.arraycopy(r5, r1, r0, r1, r4)
        L21:
            r2.m1345(r3, r0)
            return
        L25:
            java.lang.String r2 = "non-sensical empty or null argument array"
            defpackage.C2264.m3676(r2)
            return
        L2b:
            r2.m1345(r3, r5)
            return
    }

    @Override // defpackage.InterfaceC0150
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final void mo675(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r1 = 2
            r2 = 0
            r0.m1345(r1, r2)
            return
    }

    @Override // defpackage.InterfaceC0150
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ */
    public final boolean mo676() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.InterfaceC0150
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final boolean mo677() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.InterfaceC0150
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final boolean mo678() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.InterfaceC0150
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo679(java.lang.Object r2) {
            r1 = this;
            r0 = 4
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r1.m1345(r0, r2)
            return
    }

    @Override // defpackage.InterfaceC0150
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final boolean mo680() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.InterfaceC0150
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final void mo681(java.lang.Object r2) {
            r1 = this;
            r0 = 5
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r1.m1345(r0, r2)
            return
    }

    @Override // defpackage.InterfaceC0150
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo682(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            r0 = 4
            r1.m1344(r0, r2, r3)
            return
    }

    @Override // defpackage.InterfaceC0150
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final void mo683(java.lang.Object r2, java.lang.Boolean r3) {
            r1 = this;
            r0 = 5
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            r1.m1345(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final void m1345(int r2, java.lang.Object[] r3) {
            r1 = this;
            ᛴᛶᛲᛶ r0 = new ᛴᛶᛲᛶ
            r0.<init>()
            java.lang.System.currentTimeMillis()
            r0.f3309 = r2
            ᲁᛱᛱᲁ r2 = r1.f2749
            r0.f3310 = r2
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.getName()
            r0.f3308 = r3
            java.util.concurrent.LinkedBlockingQueue r1 = r1.f2748
            r1.add(r0)
            return
    }

    @Override // defpackage.InterfaceC0150
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final void mo684(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            r0 = 5
            r1.m1344(r0, r2, r3)
            return
    }
}
