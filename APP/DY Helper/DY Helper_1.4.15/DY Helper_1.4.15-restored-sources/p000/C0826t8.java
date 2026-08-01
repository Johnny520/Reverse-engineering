package p000;

/* JADX INFO: renamed from: t8 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0826t8 extends p000.AbstractC0073bd {

    /* JADX INFO: renamed from: υ */
    public final p000.C0975x8 f10239;

    public C0826t8(p000.C0975x8 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f10239 = r1
            return
    }

    /* JADX INFO: renamed from: н */
    public static boolean m5614(java.security.cert.X509Certificate r2, java.security.cert.X509Certificate r3, int r4) {
            java.security.Principal r0 = r2.getIssuerDN()
            java.security.Principal r1 = r3.getSubjectDN()
            boolean r0 = p000.ln0.m3626(r0, r1)
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
            boolean r1 = r3 instanceof p000.C0826t8
            if (r1 == 0) goto L15
            t8 r3 = (p000.C0826t8) r3
            x8 r3 = r3.f10239
            x8 r2 = r2.f10239
            boolean r2 = p000.ln0.m3626(r3, r2)
            if (r2 == 0) goto L15
            return r0
        L15:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r0 = this;
            x8 r0 = r0.f10239
            int r0 = r0.hashCode()
            return r0
    }

    @Override // p000.AbstractC0073bd
    /* JADX INFO: renamed from: θ */
    public final java.util.List mo904(java.lang.String r9, java.util.List r10) {
            r8 = this;
            r10.getClass()
            r9.getClass()
            java.util.ArrayDeque r9 = new java.util.ArrayDeque
            r9.<init>(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.Object r0 = r9.removeFirst()
            r0.getClass()
            r10.add(r0)
            r0 = 0
            r1 = r0
        L1c:
            r2 = 9
            if (r0 >= r2) goto Lc3
            int r2 = r10.size()
            r3 = 1
            int r2 = r2 - r3
            java.lang.Object r2 = r10.get(r2)
            r2.getClass()
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            x8 r4 = r8.f10239
            r4.getClass()
            javax.security.auth.x500.X500Principal r5 = r2.getIssuerX500Principal()
            java.util.LinkedHashMap r4 = r4.f12069
            java.lang.Object r4 = r4.get(r5)
            java.util.Set r4 = (java.util.Set) r4
            r5 = 0
            if (r4 != 0) goto L44
            goto L61
        L44:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L4a:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L5f
            java.lang.Object r6 = r4.next()
            r7 = r6
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7
            java.security.PublicKey r7 = r7.getPublicKey()     // Catch: java.lang.Exception -> L4a
            r2.verify(r7)     // Catch: java.lang.Exception -> L4a
            r5 = r6
        L5f:
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5
        L61:
            if (r5 == 0) goto L81
            int r1 = r10.size()
            if (r1 > r3) goto L6f
            boolean r1 = r2.equals(r5)
            if (r1 != 0) goto L72
        L6f:
            r10.add(r5)
        L72:
            int r1 = r10.size()
            int r1 = r1 + (-2)
            boolean r1 = m5614(r5, r5, r1)
            if (r1 == 0) goto L7f
            goto Lae
        L7f:
            r1 = r3
            goto La8
        L81:
            java.util.Iterator r4 = r9.iterator()
            r4.getClass()
        L88:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lac
            java.lang.Object r5 = r4.next()
            r5.getClass()
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5
            int r6 = r10.size()
            int r6 = r6 - r3
            boolean r6 = m5614(r2, r5, r6)
            if (r6 == 0) goto L88
            r4.remove()
            r10.add(r5)
        La8:
            int r0 = r0 + 1
            goto L1c
        Lac:
            if (r1 == 0) goto Laf
        Lae:
            return r10
        Laf:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Failed to find a trusted cert that signed "
            r9.<init>(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        Lc3:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Certificate chain too long: "
            r9.<init>(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }
}
