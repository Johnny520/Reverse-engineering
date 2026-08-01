package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛴᛱᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0854 extends xhss.AbstractC1029 {
    @Override // xhss.AbstractC1029
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final java.lang.Object mo621(java.lang.Class r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot allocate "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }
}
