package defpackage;

/* JADX INFO: renamed from: ᛴᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0718 extends defpackage.AbstractC2193 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C0543 f3375;

    public C0718(defpackage.C0543 r1) {
            r0 = this;
            r0.<init>()
            r0.f3375 = r1
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static boolean m1624(java.security.cert.X509Certificate r2, java.security.cert.X509Certificate r3, int r4) {
            java.security.Principal r0 = r2.getIssuerDN()
            java.security.Principal r1 = r3.getSubjectDN()
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 != 0) goto Lf
            goto L1f
        Lf:
            int r0 = r3.getBasicConstraints()
            if (r0 >= r4) goto L16
            goto L1f
        L16:
            java.security.PublicKey r3 = r3.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L1f
            r2.verify(r3)     // Catch: java.security.GeneralSecurityException -> L1f
            r2 = 1
            return r2
        L1f:
            r2 = 0
            return r2
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r3 != r2) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof defpackage.C0718
            if (r1 == 0) goto L15
            ᛴᛸ r3 = (defpackage.C0718) r3
            ᛳᲀᛶᛲ r3 = r3.f3375
            ᛳᲀᛶᛲ r2 = r2.f3375
            boolean r2 = defpackage.AbstractC0498.m1280(r3, r2)
            if (r2 == 0) goto L15
            return r0
        L15:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r0 = this;
            ᛳᲀᛶᛲ r0 = r0.f3375
            int r0 = r0.hashCode()
            return r0
    }

    @Override // defpackage.AbstractC2193
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.util.List mo1625(java.util.List r9, java.lang.String r10) {
            r8 = this;
            java.util.ArrayDeque r10 = new java.util.ArrayDeque
            r10.<init>(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.Object r0 = r10.removeFirst()
            r9.add(r0)
            r0 = 0
            r1 = r0
        L13:
            r2 = 9
            if (r0 >= r2) goto Laf
            int r2 = r9.size()
            r3 = 1
            int r2 = r2 - r3
            java.lang.Object r2 = r9.get(r2)
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            ᛳᲀᛶᛲ r4 = r8.f3375
            r4.getClass()
            javax.security.auth.x500.X500Principal r5 = r2.getIssuerX500Principal()
            java.util.LinkedHashMap r4 = r4.f2673
            java.lang.Object r4 = r4.get(r5)
            java.util.Set r4 = (java.util.Set) r4
            r5 = 0
            if (r4 != 0) goto L38
            goto L53
        L38:
            java.util.Iterator r4 = r4.iterator()
        L3c:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L51
            java.lang.Object r6 = r4.next()
            r7 = r6
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7
            java.security.PublicKey r7 = r7.getPublicKey()     // Catch: java.lang.Exception -> L3c
            r2.verify(r7)     // Catch: java.lang.Exception -> L3c
            r5 = r6
        L51:
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5
        L53:
            if (r5 == 0) goto L73
            int r1 = r9.size()
            if (r1 > r3) goto L61
            boolean r1 = r2.equals(r5)
            if (r1 != 0) goto L64
        L61:
            r9.add(r5)
        L64:
            int r1 = r9.size()
            int r1 = r1 + (-2)
            boolean r1 = m1624(r5, r5, r1)
            if (r1 == 0) goto L71
            goto L9a
        L71:
            r1 = r3
            goto L94
        L73:
            java.util.Iterator r4 = r10.iterator()
        L77:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L98
            java.lang.Object r5 = r4.next()
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5
            int r6 = r9.size()
            int r6 = r6 - r3
            boolean r6 = m1624(r2, r5, r6)
            if (r6 == 0) goto L77
            r4.remove()
            r9.add(r5)
        L94:
            int r0 = r0 + 1
            goto L13
        L98:
            if (r1 == 0) goto L9b
        L9a:
            return r9
        L9b:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Failed to find a trusted cert that signed "
            r9.<init>(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        Laf:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Certificate chain too long: "
            r10.<init>(r0)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
    }
}
