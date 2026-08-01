package defpackage;

/* JADX INFO: renamed from: ᛶᛳᛸᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1045 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C0389 f4634;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.List f4635;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.EnumC0630 f4636;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1918 f4637;

    public C1045(defpackage.EnumC0630 r1, defpackage.C1918 r2, java.util.List r3, defpackage.InterfaceC1781 r4) {
            r0 = this;
            r0.<init>()
            r0.f4636 = r1
            r0.f4637 = r2
            r0.f4635 = r3
            ᛲᲀ r1 = new ᛲᲀ
            r2 = 8
            r1.<init>(r2, r4)
            ᛲᲈᛶᲈ r2 = new ᛲᲈᛶᲈ
            r2.<init>(r1)
            r0.f4634 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.C1045
            if (r0 == 0) goto L2d
            ᛶᛳᛸᛷ r3 = (defpackage.C1045) r3
            ᛴᛲᲀᛸ r0 = r3.f4636
            ᛴᛲᲀᛸ r1 = r2.f4636
            if (r0 != r1) goto L2d
            ᲁᲀᲇᲀ r0 = r3.f4637
            ᲁᲀᲇᲀ r1 = r2.f4637
            if (r0 == r1) goto L13
            goto L2d
        L13:
            java.util.List r0 = r3.m2002()
            java.util.List r1 = r2.m2002()
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 == 0) goto L2d
            java.util.List r3 = r3.f4635
            java.util.List r2 = r2.f4635
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
            ᛴᛲᲀᛸ r0 = r2.f4636
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            int r0 = r0 * 31
            ᲁᲀᲇᲀ r1 = r2.f4637
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List r0 = r2.m2002()
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List r2 = r2.f4635
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r4 = this;
            java.util.List r0 = r4.m2002()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = defpackage.AbstractC0575.m1369(r0)
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
            ᛴᛲᲀᛸ r2 = r4.f4636
            r1.append(r2)
            java.lang.String r2 = " cipherSuite="
            r1.append(r2)
            ᲁᲀᲇᲀ r2 = r4.f4637
            r1.append(r2)
            java.lang.String r2 = " peerCertificates="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " localCertificates="
            r1.append(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r4 = r4.f4635
            int r2 = defpackage.AbstractC0575.m1369(r4)
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

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.List m2002() {
            r0 = this;
            ᛲᲈᛶᲈ r0 = r0.f4634
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }
}
