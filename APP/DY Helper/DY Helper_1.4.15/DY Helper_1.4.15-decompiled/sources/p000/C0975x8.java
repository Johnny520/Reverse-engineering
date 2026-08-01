package p000;

/* JADX INFO: renamed from: x8 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0975x8 {

    /* JADX INFO: renamed from: α */
    public final java.util.LinkedHashMap f12069;

    public C0975x8(java.security.cert.X509Certificate... r7) {
            r6 = this;
            r6.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            int r1 = r7.length
            r2 = 0
        La:
            if (r2 >= r1) goto L28
            r3 = r7[r2]
            javax.security.auth.x500.X500Principal r4 = r3.getSubjectX500Principal()
            java.lang.Object r5 = r0.get(r4)
            if (r5 != 0) goto L20
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            r0.put(r4, r5)
        L20:
            java.util.Set r5 = (java.util.Set) r5
            r5.add(r3)
            int r2 = r2 + 1
            goto La
        L28:
            r6.f12069 = r0
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto L15
            boolean r0 = r2 instanceof p000.C0975x8
            if (r0 == 0) goto L13
            x8 r2 = (p000.C0975x8) r2
            java.util.LinkedHashMap r2 = r2.f12069
            java.util.LinkedHashMap r1 = r1.f12069
            boolean r1 = p000.ln0.m3626(r2, r1)
            if (r1 == 0) goto L13
            goto L15
        L13:
            r1 = 0
            return r1
        L15:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.util.LinkedHashMap r0 = r0.f12069
            int r0 = r0.hashCode()
            return r0
    }
}
