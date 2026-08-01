package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛱᛲᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0435 extends xhss.AbstractC0121 {
    public C0435() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo119(xhss.C0385 r2) {
            r1 = this;
            int r1 = r2.m762()
            r0 = 9
            if (r1 != r0) goto Ld
            r2.m756()
            r1 = 0
            return r1
        Ld:
            java.lang.String r1 = r2.m739()
            java.net.InetAddress r1 = java.net.InetAddress.getByName(r1)
            return r1
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final void mo120(xhss.C0827 r1, java.lang.Object r2) {
            r0 = this;
            java.net.InetAddress r2 = (java.net.InetAddress) r2
            if (r2 != 0) goto L6
            r0 = 0
            goto La
        L6:
            java.lang.String r0 = r2.getHostAddress()
        La:
            r1.m1405(r0)
            return
    }
}
