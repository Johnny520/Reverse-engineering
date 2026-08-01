package xhss;

/* JADX INFO: renamed from: xhss.ᲁᲀᲇᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0983 implements xhss.InterfaceC0198 {
    @Override // xhss.InterfaceC0198
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final xhss.InterfaceC1173 mo460(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            xhss.ᛸᛳᲇᲇ r0 = new xhss.ᛸᛳᲇᲇ
            r0.<init>()
            return r0
    }

    @Override // xhss.InterfaceC0198
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final boolean mo461(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            boolean r0 = xhss.C0746.f2499
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
