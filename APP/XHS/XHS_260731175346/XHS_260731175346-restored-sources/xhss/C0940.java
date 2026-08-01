package xhss;

/* JADX INFO: renamed from: xhss.ᲁᛳᲁᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0940 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.util.LinkedHashMap f3054;

    public C0940(java.security.cert.X509Certificate... r7) {
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
            r6.f3054 = r0
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto L15
            boolean r0 = r2 instanceof xhss.C0940
            if (r0 == 0) goto L13
            xhss.ᲁᛳᲁᛱ r2 = (xhss.C0940) r2
            java.util.LinkedHashMap r2 = r2.f3054
            java.util.LinkedHashMap r1 = r1.f3054
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
            java.util.LinkedHashMap r0 = r0.f3054
            int r0 = r0.hashCode()
            return r0
    }
}
