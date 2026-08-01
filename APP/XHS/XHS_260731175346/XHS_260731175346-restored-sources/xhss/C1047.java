package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛶᛳᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1047 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.String f3370;

    public C1047(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = xhss.AbstractC0021.m121(r1)
            r0.f3370 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof xhss.C1047
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            xhss.ᲇᛶᛳᛵ r2 = (xhss.C1047) r2
            java.lang.String r2 = r2.f3370
            java.lang.String r1 = r1.f3370
            boolean r1 = r1.equals(r2)
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.f3370
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.f3370
            java.lang.String r0 = xhss.AbstractC0021.m124(r0)
            return r0
    }
}
