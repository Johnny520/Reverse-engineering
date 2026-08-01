package defpackage;

/* JADX INFO: renamed from: ᛲᛲᛶᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0253 implements defpackage.InterfaceC1130 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.InterfaceC0223 f1477;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public defpackage.InterfaceC1130 f1478;

    public C0253(defpackage.InterfaceC0223 r1) {
            r0 = this;
            r0.<init>()
            r0.f1477 = r1
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final synchronized defpackage.InterfaceC1130 m877(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            monitor-enter(r1)
            ᛶᛸᲀᛵ r0 = r1.f1478     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L18
            ᛱᲈᛸᛵ r0 = r1.f1477     // Catch: java.lang.Throwable -> L16
            boolean r0 = r0.mo807(r2)     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L18
            ᛱᲈᛸᛵ r0 = r1.f1477     // Catch: java.lang.Throwable -> L16
            ᛶᛸᲀᛵ r2 = r0.mo806(r2)     // Catch: java.lang.Throwable -> L16
            r1.f1478 = r2     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r2 = move-exception
            goto L1c
        L18:
            ᛶᛸᲀᛵ r2 = r1.f1478     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)
            return r2
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r2
    }

    @Override // defpackage.InterfaceC1130
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo686(javax.net.ssl.SSLSocket r1, java.lang.String r2, java.util.List r3) {
            r0 = this;
            ᛶᛸᲀᛵ r0 = r0.m877(r1)
            if (r0 == 0) goto L9
            r0.mo686(r1, r2, r3)
        L9:
            return
    }

    @Override // defpackage.InterfaceC1130
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final boolean mo687() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.InterfaceC1130
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.lang.String mo688(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            ᛶᛸᲀᛵ r0 = r0.m877(r1)
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.mo688(r1)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC1130
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final boolean mo689(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            ᛱᲈᛸᛵ r0 = r0.f1477
            boolean r0 = r0.mo807(r1)
            return r0
    }
}
