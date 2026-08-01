package defpackage;

/* JADX INFO: renamed from: ᛳᲀᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0543 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.LinkedHashMap f2673;

    public C0543(java.security.cert.X509Certificate... r7) {
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
            r6.f2673 = r0
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto L15
            boolean r0 = r2 instanceof defpackage.C0543
            if (r0 == 0) goto L13
            ᛳᲀᛶᛲ r2 = (defpackage.C0543) r2
            java.util.LinkedHashMap r2 = r2.f2673
            java.util.LinkedHashMap r1 = r1.f2673
            boolean r1 = r2.equals(r1)
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
            java.util.LinkedHashMap r0 = r0.f2673
            int r0 = r0.hashCode()
            return r0
    }
}
