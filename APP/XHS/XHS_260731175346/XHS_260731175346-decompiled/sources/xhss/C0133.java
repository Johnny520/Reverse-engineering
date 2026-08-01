package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛲᛶᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0133 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final android.content.res.Resources.Theme f593;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final android.content.res.Resources f594;

    public C0133(android.content.res.Resources r1, android.content.res.Resources.Theme r2) {
            r0 = this;
            r0.<init>()
            r0.f594 = r1
            r0.f593 = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L27
            java.lang.Class<xhss.ᛲᛲᛶᛳ> r2 = xhss.C0133.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L27
        L10:
            xhss.ᛲᛲᛶᛳ r5 = (xhss.C0133) r5
            android.content.res.Resources r2 = r4.f594
            android.content.res.Resources r3 = r5.f594
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L27
            android.content.res.Resources$Theme r4 = r4.f593
            android.content.res.Resources$Theme r5 = r5.f593
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 == 0) goto L27
            return r0
        L27:
            return r1
    }

    public final int hashCode() {
            r1 = this;
            android.content.res.Resources r0 = r1.f594
            android.content.res.Resources$Theme r1 = r1.f593
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}
            int r1 = java.util.Objects.hash(r1)
            return r1
    }
}
