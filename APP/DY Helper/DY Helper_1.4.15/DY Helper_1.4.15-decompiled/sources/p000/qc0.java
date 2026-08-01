package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class qc0 {

    /* JADX INFO: renamed from: α */
    public final p000.q42 f8957;

    /* JADX INFO: renamed from: β */
    public final p000.C0870uf f8958;

    /* JADX INFO: renamed from: γ */
    public final java.util.List f8959;

    /* JADX INFO: renamed from: δ */
    public final p000.h22 f8960;

    public qc0(p000.q42 r1, p000.C0870uf r2, java.util.List r3, p000.p70 r4) {
            r0 = this;
            r0.<init>()
            r0.f8957 = r1
            r0.f8958 = r2
            r0.f8959 = r3
            pc0 r1 = new pc0
            r2 = 0
            r1.<init>(r2, r4)
            h22 r2 = new h22
            r2.<init>(r1)
            r0.f8960 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.qc0
            if (r0 == 0) goto L30
            qc0 r3 = (p000.qc0) r3
            q42 r0 = r3.f8957
            q42 r1 = r2.f8957
            if (r0 != r1) goto L30
            uf r0 = r3.f8958
            uf r1 = r2.f8958
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L30
            java.util.List r0 = r3.m4851()
            java.util.List r1 = r2.m4851()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L30
            java.util.List r3 = r3.f8959
            java.util.List r2 = r2.f8959
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L30
            r2 = 1
            return r2
        L30:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            q42 r0 = r2.f8957
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            int r0 = r0 * 31
            uf r1 = r2.f8958
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List r0 = r2.m4851()
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List r2 = r2.f8959
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r5 = this;
            java.util.List r0 = r5.m4851()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r3 = p000.AbstractC1021yh.m6889(r0, r2)
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L39
            java.lang.Object r3 = r0.next()
            java.security.cert.Certificate r3 = (java.security.cert.Certificate) r3
            boolean r4 = r3 instanceof java.security.cert.X509Certificate
            if (r4 == 0) goto L2e
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            java.security.Principal r3 = r3.getSubjectDN()
            java.lang.String r3 = r3.toString()
            goto L35
        L2e:
            java.lang.String r3 = r3.getType()
            r3.getClass()
        L35:
            r1.add(r3)
            goto L13
        L39:
            java.lang.String r0 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Handshake{tlsVersion="
            r1.<init>(r3)
            q42 r3 = r5.f8957
            r1.append(r3)
            java.lang.String r3 = " cipherSuite="
            r1.append(r3)
            uf r3 = r5.f8958
            r1.append(r3)
            java.lang.String r3 = " peerCertificates="
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = " localCertificates="
            r1.append(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r5 = r5.f8959
            int r2 = p000.AbstractC1021yh.m6889(r5, r2)
            r0.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L6f:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L95
            java.lang.Object r2 = r5.next()
            java.security.cert.Certificate r2 = (java.security.cert.Certificate) r2
            boolean r3 = r2 instanceof java.security.cert.X509Certificate
            if (r3 == 0) goto L8a
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            java.security.Principal r2 = r2.getSubjectDN()
            java.lang.String r2 = r2.toString()
            goto L91
        L8a:
            java.lang.String r2 = r2.getType()
            r2.getClass()
        L91:
            r0.add(r2)
            goto L6f
        L95:
            r1.append(r0)
            r5 = 125(0x7d, float:1.75E-43)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
    }

    /* JADX INFO: renamed from: α */
    public final java.util.List m4851() {
            r0 = this;
            h22 r0 = r0.f8960
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }
}
