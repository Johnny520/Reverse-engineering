package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛸᛷᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1166 implements xhss.InterfaceC0869 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.String f3769;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public volatile xhss.InterfaceC0869 f3770;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public java.lang.reflect.Method f3771;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final boolean f3772;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final java.util.concurrent.LinkedBlockingQueue f3773;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public java.lang.Boolean f3774;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public xhss.C1009 f3775;

    public C1166(java.lang.String r1, java.util.concurrent.LinkedBlockingQueue r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f3769 = r1
            r0.f3773 = r2
            r0.f3772 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1b
        L3:
            if (r3 == 0) goto L1d
            java.lang.Class<xhss.ᲈᛸᛷᲀ> r0 = xhss.C1166.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Le
            goto L1d
        Le:
            xhss.ᲈᛸᛷᲀ r3 = (xhss.C1166) r3
            java.lang.String r2 = r2.f3769
            java.lang.String r3 = r3.f3769
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1b
            goto L1d
        L1b:
            r2 = 1
            return r2
        L1d:
            r2 = 0
            return r2
    }

    @Override // xhss.InterfaceC0869
    public final java.lang.String getName() {
            r0 = this;
            java.lang.String r0 = r0.f3769
            return r0
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.f3769
            int r0 = r0.hashCode()
            return r0
    }

    @Override // xhss.InterfaceC0869
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final void mo376(java.lang.String r1, java.lang.Object... r2) {
            r0 = this;
            xhss.ᲀᛶᛶᲀ r0 = r0.m1861()
            r0.mo376(r1, r2)
            return
    }

    @Override // xhss.InterfaceC0869
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final boolean mo377() {
            r0 = this;
            xhss.ᲀᛶᛶᲀ r0 = r0.m1861()
            boolean r0 = r0.mo377()
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public final xhss.InterfaceC0869 m1861() {
            r3 = this;
            xhss.ᲀᛶᛶᲀ r0 = r3.f3770
            if (r0 == 0) goto L7
            xhss.ᲀᛶᛶᲀ r3 = r3.f3770
            return r3
        L7:
            boolean r0 = r3.f3772
            if (r0 == 0) goto Le
            xhss.ᛲᛳᛶᛷ r3 = xhss.C0145.f618
            return r3
        Le:
            xhss.ᲇᛲᛱᲈ r0 = r3.f3775
            if (r0 != 0) goto L23
            xhss.ᲇᛲᛱᲈ r0 = new xhss.ᲇᛲᛱᲈ
            java.util.concurrent.LinkedBlockingQueue r1 = r3.f3773
            r0.<init>()
            r0.f3300 = r3
            java.lang.String r2 = r3.f3769
            r0.f3299 = r2
            r0.f3301 = r1
            r3.f3775 = r0
        L23:
            return r0
    }

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public final boolean m1862() {
            r3 = this;
            java.lang.Boolean r0 = r3.f3774
            if (r0 == 0) goto L9
            boolean r3 = r0.booleanValue()
            return r3
        L9:
            xhss.ᲀᛶᛶᲀ r0 = r3.f3770     // Catch: java.lang.NoSuchMethodException -> L22
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.NoSuchMethodException -> L22
            java.lang.String r1 = "log"
            java.lang.Class<xhss.ᲀᲀᛴᛴ> r2 = xhss.C0895.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.NoSuchMethodException -> L22
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L22
            r3.f3771 = r0     // Catch: java.lang.NoSuchMethodException -> L22
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.NoSuchMethodException -> L22
            r3.f3774 = r0     // Catch: java.lang.NoSuchMethodException -> L22
            goto L26
        L22:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.f3774 = r0
        L26:
            boolean r3 = r0.booleanValue()
            return r3
    }

    @Override // xhss.InterfaceC0869
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public final void mo378(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            xhss.ᲀᛶᛶᲀ r0 = r0.m1861()
            r0.mo378(r1, r2)
            return
    }

    @Override // xhss.InterfaceC0869
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo379(java.lang.Object r1) {
            r0 = this;
            xhss.ᲀᛶᛶᲀ r0 = r0.m1861()
            r0.mo379(r1)
            return
    }

    @Override // xhss.InterfaceC0869
    /* JADX INFO: renamed from: ᛷᲁᲁ */
    public final void mo380(java.lang.String r1) {
            r0 = this;
            xhss.ᲀᛶᛶᲀ r0 = r0.m1861()
            r0.mo380(r1)
            return
    }

    @Override // xhss.InterfaceC0869
    /* JADX INFO: renamed from: ᛸᛲᲀᛵ */
    public final boolean mo1441(int r1) {
            r0 = this;
            xhss.ᲀᛶᛶᲀ r0 = r0.m1861()
            boolean r0 = r0.mo1441(r1)
            return r0
    }

    @Override // xhss.InterfaceC0869
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public final boolean mo381() {
            r0 = this;
            xhss.ᲀᛶᛶᲀ r0 = r0.m1861()
            boolean r0 = r0.mo381()
            return r0
    }

    @Override // xhss.InterfaceC0869
    /* JADX INFO: renamed from: ᛸᛶᲈᛶ */
    public final boolean mo382() {
            r0 = this;
            xhss.ᲀᛶᛶᲀ r0 = r0.m1861()
            boolean r0 = r0.mo382()
            return r0
    }

    @Override // xhss.InterfaceC0869
    /* JADX INFO: renamed from: ᛸᛷᲈᲈ */
    public final boolean mo383() {
            r0 = this;
            xhss.ᲀᛶᛶᲀ r0 = r0.m1861()
            boolean r0 = r0.mo383()
            return r0
    }

    @Override // xhss.InterfaceC0869
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public final void mo384(java.lang.String r1, java.lang.Object... r2) {
            r0 = this;
            xhss.ᲀᛶᛶᲀ r0 = r0.m1861()
            r0.mo384(r1, r2)
            return
    }

    @Override // xhss.InterfaceC0869
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public final boolean mo385() {
            r0 = this;
            xhss.ᲀᛶᛶᲀ r0 = r0.m1861()
            boolean r0 = r0.mo385()
            return r0
    }

    @Override // xhss.InterfaceC0869
    /* JADX INFO: renamed from: ᲇᛶᛴᲀ */
    public final void mo386(java.lang.Object r1, java.lang.Boolean r2) {
            r0 = this;
            xhss.ᲀᛶᛶᲀ r0 = r0.m1861()
            r0.mo386(r1, r2)
            return
    }

    @Override // xhss.InterfaceC0869
    /* JADX INFO: renamed from: ᲇᛸᛳᲁ */
    public final void mo387(java.lang.Object r1) {
            r0 = this;
            xhss.ᲀᛶᛶᲀ r0 = r0.m1861()
            r0.mo387(r1)
            return
    }

    @Override // xhss.InterfaceC0869
    /* JADX INFO: renamed from: ᲈᛳᲀ */
    public final void mo388(java.lang.String r1) {
            r0 = this;
            xhss.ᲀᛶᛶᲀ r0 = r0.m1861()
            r0.mo388(r1)
            return
    }
}
