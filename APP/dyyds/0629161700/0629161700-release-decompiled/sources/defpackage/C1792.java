package defpackage;

/* JADX INFO: renamed from: ᲁᛱᛱᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1792 implements defpackage.InterfaceC0150 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final java.util.concurrent.LinkedBlockingQueue f7876;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final boolean f7877;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public java.lang.Boolean f7878;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public volatile defpackage.InterfaceC0150 f7879;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f7880;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public java.lang.reflect.Method f7881;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.C0558 f7882;

    public C1792(java.lang.String r1, java.util.concurrent.LinkedBlockingQueue r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f7880 = r1
            r0.f7876 = r2
            r0.f7877 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1b
        L3:
            if (r3 == 0) goto L1d
            java.lang.Class<ᲁᛱᛱᲁ> r0 = defpackage.C1792.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Le
            goto L1d
        Le:
            ᲁᛱᛱᲁ r3 = (defpackage.C1792) r3
            java.lang.String r2 = r2.f7880
            java.lang.String r3 = r3.f7880
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

    @Override // defpackage.InterfaceC0150
    public final java.lang.String getName() {
            r0 = this;
            java.lang.String r0 = r0.f7880
            return r0
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.f7880
            int r0 = r0.hashCode()
            return r0
    }

    @Override // defpackage.InterfaceC0150
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final boolean mo671() {
            r0 = this;
            ᛱᛸᲀᛱ r0 = r0.m3183()
            boolean r0 = r0.mo671()
            return r0
    }

    @Override // defpackage.InterfaceC0150
    /* JADX INFO: renamed from: ᛲᛲᛵ */
    public final void mo672(java.lang.String r1) {
            r0 = this;
            ᛱᛸᲀᛱ r0 = r0.m3183()
            r0.mo672(r1)
            return
    }

    @Override // defpackage.InterfaceC0150
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final void mo673(java.lang.String r1) {
            r0 = this;
            ᛱᛸᲀᛱ r0 = r0.m3183()
            r0.mo673(r1)
            return
    }

    @Override // defpackage.InterfaceC0150
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final boolean mo674(int r1) {
            r0 = this;
            ᛱᛸᲀᛱ r0 = r0.m3183()
            boolean r0 = r0.mo674(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final defpackage.InterfaceC0150 m3183() {
            r3 = this;
            ᛱᛸᲀᛱ r0 = r3.f7879
            if (r0 == 0) goto L7
            ᛱᛸᲀᛱ r3 = r3.f7879
            return r3
        L7:
            boolean r0 = r3.f7877
            if (r0 == 0) goto Le
            ᛵᛷᛳᛲ r3 = defpackage.C0925.f4184
            return r3
        Le:
            ᛳᲁᛶᛷ r0 = r3.f7882
            if (r0 != 0) goto L23
            ᛳᲁᛶᛷ r0 = new ᛳᲁᛶᛷ
            java.util.concurrent.LinkedBlockingQueue r1 = r3.f7876
            r0.<init>()
            r0.f2749 = r3
            java.lang.String r2 = r3.f7880
            r0.f2750 = r2
            r0.f2748 = r1
            r3.f7882 = r0
        L23:
            return r0
    }

    @Override // defpackage.InterfaceC0150
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final void mo675(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            ᛱᛸᲀᛱ r0 = r0.m3183()
            r0.mo675(r1, r2)
            return
    }

    @Override // defpackage.InterfaceC0150
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ */
    public final boolean mo676() {
            r0 = this;
            ᛱᛸᲀᛱ r0 = r0.m3183()
            boolean r0 = r0.mo676()
            return r0
    }

    @Override // defpackage.InterfaceC0150
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final boolean mo677() {
            r0 = this;
            ᛱᛸᲀᛱ r0 = r0.m3183()
            boolean r0 = r0.mo677()
            return r0
    }

    @Override // defpackage.InterfaceC0150
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final boolean mo678() {
            r0 = this;
            ᛱᛸᲀᛱ r0 = r0.m3183()
            boolean r0 = r0.mo678()
            return r0
    }

    @Override // defpackage.InterfaceC0150
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo679(java.lang.Object r1) {
            r0 = this;
            ᛱᛸᲀᛱ r0 = r0.m3183()
            r0.mo679(r1)
            return
    }

    @Override // defpackage.InterfaceC0150
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final boolean mo680() {
            r0 = this;
            ᛱᛸᲀᛱ r0 = r0.m3183()
            boolean r0 = r0.mo680()
            return r0
    }

    @Override // defpackage.InterfaceC0150
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final void mo681(java.lang.Object r1) {
            r0 = this;
            ᛱᛸᲀᛱ r0 = r0.m3183()
            r0.mo681(r1)
            return
    }

    @Override // defpackage.InterfaceC0150
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo682(java.lang.String r1, java.lang.Object... r2) {
            r0 = this;
            ᛱᛸᲀᛱ r0 = r0.m3183()
            r0.mo682(r1, r2)
            return
    }

    @Override // defpackage.InterfaceC0150
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final void mo683(java.lang.Object r1, java.lang.Boolean r2) {
            r0 = this;
            ᛱᛸᲀᛱ r0 = r0.m3183()
            r0.mo683(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final boolean m3184() {
            r3 = this;
            java.lang.Boolean r0 = r3.f7878
            if (r0 == 0) goto L9
            boolean r3 = r0.booleanValue()
            return r3
        L9:
            ᛱᛸᲀᛱ r0 = r3.f7879     // Catch: java.lang.NoSuchMethodException -> L22
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.NoSuchMethodException -> L22
            java.lang.String r1 = "log"
            java.lang.Class<ᛴᛶᛲᛶ> r2 = defpackage.C0686.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.NoSuchMethodException -> L22
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L22
            r3.f7881 = r0     // Catch: java.lang.NoSuchMethodException -> L22
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.NoSuchMethodException -> L22
            r3.f7878 = r0     // Catch: java.lang.NoSuchMethodException -> L22
            goto L26
        L22:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.f7878 = r0
        L26:
            boolean r3 = r0.booleanValue()
            return r3
    }

    @Override // defpackage.InterfaceC0150
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final void mo684(java.lang.String r1, java.lang.Object... r2) {
            r0 = this;
            ᛱᛸᲀᛱ r0 = r0.m3183()
            r0.mo684(r1, r2)
            return
    }
}
