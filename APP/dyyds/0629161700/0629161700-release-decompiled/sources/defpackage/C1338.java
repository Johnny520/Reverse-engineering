package defpackage;

/* JADX INFO: renamed from: ᛷᛸᛸᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1338 implements defpackage.InterfaceC0223 {
    @Override // defpackage.InterfaceC0223
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.InterfaceC1130 mo806(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            ᛷᲁᛲᛳ r0 = new ᛷᲁᛲᛳ
            r0.<init>()
            return r0
    }

    @Override // defpackage.InterfaceC0223
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final boolean mo807(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            boolean r0 = defpackage.C1363.f5962
            if (r0 == 0) goto Lc
            boolean r0 = org.conscrypt.Conscrypt.isConscrypt(r1)
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }
}
