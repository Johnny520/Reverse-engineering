package xhss;

/* JADX INFO: renamed from: xhss.ᲁᛷᛲᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0965 implements xhss.InterfaceC1173 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public xhss.InterfaceC1173 f3167;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.InterfaceC0198 f3168;

    public C0965(xhss.InterfaceC0198 r1) {
            r0 = this;
            r0.<init>()
            r0.f3168 = r1
            return
    }

    @Override // xhss.InterfaceC1173
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.String mo467(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            xhss.ᲈᲀᛳᲇ r0 = r0.m1603(r1)
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.mo467(r1)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // xhss.InterfaceC1173
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final boolean mo468() {
            r0 = this;
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final synchronized xhss.InterfaceC1173 m1603(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            monitor-enter(r1)
            xhss.ᲈᲀᛳᲇ r0 = r1.f3167     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L18
            xhss.ᛲᛸᲇᛷ r0 = r1.f3168     // Catch: java.lang.Throwable -> L16
            boolean r0 = r0.mo461(r2)     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L18
            xhss.ᛲᛸᲇᛷ r0 = r1.f3168     // Catch: java.lang.Throwable -> L16
            xhss.ᲈᲀᛳᲇ r2 = r0.mo460(r2)     // Catch: java.lang.Throwable -> L16
            r1.f3167 = r2     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r2 = move-exception
            goto L1c
        L18:
            xhss.ᲈᲀᛳᲇ r2 = r1.f3167     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)
            return r2
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r2
    }

    @Override // xhss.InterfaceC1173
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final boolean mo469(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            xhss.ᛲᛸᲇᛷ r0 = r0.f3168
            boolean r0 = r0.mo461(r1)
            return r0
    }

    @Override // xhss.InterfaceC1173
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public final void mo470(javax.net.ssl.SSLSocket r1, java.lang.String r2, java.util.List r3) {
            r0 = this;
            xhss.ᲈᲀᛳᲇ r0 = r0.m1603(r1)
            if (r0 == 0) goto L9
            r0.mo470(r1, r2, r3)
        L9:
            return
    }
}
