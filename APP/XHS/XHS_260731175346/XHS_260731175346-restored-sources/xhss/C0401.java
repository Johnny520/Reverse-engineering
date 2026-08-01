package xhss;

/* JADX INFO: renamed from: xhss.ᛴᲀᛱᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0401 extends xhss.AbstractC0121 {
    public C0401() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo119(xhss.C0385 r3) {
            r2 = this;
            int r2 = r3.m762()
            r0 = 9
            r1 = 0
            if (r2 != r0) goto Ld
            r3.m756()
            return r1
        Ld:
            java.lang.String r2 = r3.m739()     // Catch: java.net.URISyntaxException -> L20
            java.lang.String r3 = "null"
            boolean r3 = r2.equals(r3)     // Catch: java.net.URISyntaxException -> L20
            if (r3 == 0) goto L1a
            return r1
        L1a:
            java.net.URI r3 = new java.net.URI     // Catch: java.net.URISyntaxException -> L20
            r3.<init>(r2)     // Catch: java.net.URISyntaxException -> L20
            return r3
        L20:
            r2 = move-exception
            xhss.ᛱᲈᛲᛷ r3 = new xhss.ᛱᲈᛲᛷ
            r3.<init>(r2)
            throw r3
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final void mo120(xhss.C0827 r1, java.lang.Object r2) {
            r0 = this;
            java.net.URI r2 = (java.net.URI) r2
            if (r2 != 0) goto L6
            r0 = 0
            goto La
        L6:
            java.lang.String r0 = r2.toASCIIString()
        La:
            r1.m1405(r0)
            return
    }
}
