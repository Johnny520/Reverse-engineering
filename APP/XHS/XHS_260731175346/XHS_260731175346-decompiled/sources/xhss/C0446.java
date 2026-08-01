package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛲᛸᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0446 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0321 f1592;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.util.List f1593;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.EnumC0613 f1594;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.C0380 f1595;

    public C0446(xhss.EnumC0613 r1, xhss.C0321 r2, java.util.List r3, xhss.InterfaceC0030 r4) {
            r0 = this;
            r0.<init>()
            r0.f1594 = r1
            r0.f1592 = r2
            r0.f1593 = r3
            xhss.ᛲᛶᲀᛲ r1 = new xhss.ᛲᛶᲀᛲ
            r2 = 0
            r1.<init>(r2, r4)
            xhss.ᛴᛷᛱ r2 = new xhss.ᛴᛷᛱ
            r2.<init>(r1)
            r0.f1595 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof xhss.C0446
            if (r0 == 0) goto L2d
            xhss.ᛵᛲᛸᛲ r3 = (xhss.C0446) r3
            xhss.ᛶᲈᛴ r0 = r3.f1594
            xhss.ᛶᲈᛴ r1 = r2.f1594
            if (r0 != r1) goto L2d
            xhss.ᛳᲁᲇᲀ r0 = r3.f1592
            xhss.ᛳᲁᲇᲀ r1 = r2.f1592
            if (r0 == r1) goto L13
            goto L2d
        L13:
            java.util.List r0 = r3.m819()
            java.util.List r1 = r2.m819()
            boolean r0 = xhss.AbstractC0007.m97(r0, r1)
            if (r0 == 0) goto L2d
            java.util.List r3 = r3.f1593
            java.util.List r2 = r2.f1593
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            xhss.ᛶᲈᛴ r0 = r2.f1594
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            int r0 = r0 * 31
            xhss.ᛳᲁᲇᲀ r1 = r2.f1592
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List r0 = r2.m819()
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List r2 = r2.f1593
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r4 = this;
            java.util.List r0 = r4.m819()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = xhss.AbstractC0249.m554(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r0.next()
            java.security.cert.Certificate r2 = (java.security.cert.Certificate) r2
            boolean r3 = r2 instanceof java.security.cert.X509Certificate
            if (r3 == 0) goto L2c
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            java.security.Principal r2 = r2.getSubjectDN()
            java.lang.String r2 = r2.toString()
            goto L30
        L2c:
            java.lang.String r2 = r2.getType()
        L30:
            r1.add(r2)
            goto L11
        L34:
            java.lang.String r0 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Handshake{tlsVersion="
            r1.<init>(r2)
            xhss.ᛶᲈᛴ r2 = r4.f1594
            r1.append(r2)
            java.lang.String r2 = " cipherSuite="
            r1.append(r2)
            xhss.ᛳᲁᲇᲀ r2 = r4.f1592
            r1.append(r2)
            java.lang.String r2 = " peerCertificates="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " localCertificates="
            r1.append(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r4 = r4.f1593
            int r2 = xhss.AbstractC0249.m554(r4)
            r0.<init>(r2)
            java.util.Iterator r4 = r4.iterator()
        L6a:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L8d
            java.lang.Object r2 = r4.next()
            java.security.cert.Certificate r2 = (java.security.cert.Certificate) r2
            boolean r3 = r2 instanceof java.security.cert.X509Certificate
            if (r3 == 0) goto L85
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            java.security.Principal r2 = r2.getSubjectDN()
            java.lang.String r2 = r2.toString()
            goto L89
        L85:
            java.lang.String r2 = r2.getType()
        L89:
            r0.add(r2)
            goto L6a
        L8d:
            r1.append(r0)
            r4 = 125(0x7d, float:1.75E-43)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.util.List m819() {
            r0 = this;
            xhss.ᛴᛷᛱ r0 = r0.f1595
            java.lang.Object r0 = r0.m734()
            java.util.List r0 = (java.util.List) r0
            return r0
    }
}
