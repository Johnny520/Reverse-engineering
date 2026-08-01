package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛲᛱᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1009 implements xhss.InterfaceC0869, java.io.Serializable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public java.lang.String f3299;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public xhss.C1166 f3300;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public java.util.concurrent.LinkedBlockingQueue f3301;

    @Override // xhss.InterfaceC0869
    public final java.lang.String getName() {
            r0 = this;
            java.lang.String r0 = r0.f3299
            return r0
    }

    @Override // xhss.InterfaceC0869
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final void mo376(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            r0 = 4
            r1.m1662(r0, r2, r3)
            return
    }

    @Override // xhss.InterfaceC0869
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final boolean mo377() {
            r0 = this;
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public final void m1662(int r3, java.lang.String r4, java.lang.Object[] r5) {
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
            r2.m1663(r3, r0)
            return
        L25:
            java.lang.String r2 = "non-sensical empty or null argument array"
            xhss.C0532.m950(r2)
            return
        L2b:
            r2.m1663(r3, r5)
            return
    }

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public final void m1663(int r2, java.lang.Object[] r3) {
            r1 = this;
            xhss.ᲀᲀᛴᛴ r0 = new xhss.ᲀᲀᛴᛴ
            r0.<init>()
            java.lang.System.currentTimeMillis()
            r0.f2892 = r2
            xhss.ᲈᛸᛷᲀ r2 = r1.f3300
            r0.f2890 = r2
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.getName()
            r0.f2891 = r3
            java.util.concurrent.LinkedBlockingQueue r1 = r1.f3301
            r1.add(r0)
            return
    }

    @Override // xhss.InterfaceC0869
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public final void mo378(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r1 = 2
            r2 = 0
            r0.m1663(r1, r2)
            return
    }

    @Override // xhss.InterfaceC0869
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo379(java.lang.Object r2) {
            r1 = this;
            r0 = 4
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r1.m1663(r0, r2)
            return
    }

    @Override // xhss.InterfaceC0869
    /* JADX INFO: renamed from: ᛷᲁᲁ */
    public final void mo380(java.lang.String r2) {
            r1 = this;
            r2 = 4
            r0 = 0
            r1.m1663(r2, r0)
            return
    }

    @Override // xhss.InterfaceC0869
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public final boolean mo381() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // xhss.InterfaceC0869
    /* JADX INFO: renamed from: ᛸᛶᲈᛶ */
    public final boolean mo382() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // xhss.InterfaceC0869
    /* JADX INFO: renamed from: ᛸᛷᲈᲈ */
    public final boolean mo383() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // xhss.InterfaceC0869
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public final void mo384(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            r0 = 5
            r1.m1662(r0, r2, r3)
            return
    }

    @Override // xhss.InterfaceC0869
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public final boolean mo385() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // xhss.InterfaceC0869
    /* JADX INFO: renamed from: ᲇᛶᛴᲀ */
    public final void mo386(java.lang.Object r2, java.lang.Boolean r3) {
            r1 = this;
            r0 = 5
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            r1.m1663(r0, r2)
            return
    }

    @Override // xhss.InterfaceC0869
    /* JADX INFO: renamed from: ᲇᛸᛳᲁ */
    public final void mo387(java.lang.Object r2) {
            r1 = this;
            r0 = 5
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r1.m1663(r0, r2)
            return
    }

    @Override // xhss.InterfaceC0869
    /* JADX INFO: renamed from: ᲈᛳᲀ */
    public final void mo388(java.lang.String r2) {
            r1 = this;
            r2 = 4
            r0 = 0
            r1.m1663(r2, r0)
            return
    }
}
