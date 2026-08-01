package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛲᛵᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0444 extends java.lang.InheritableThreadLocal {
    @Override // java.lang.InheritableThreadLocal
    public final java.lang.Object childValue(java.lang.Object r1) {
            r0 = this;
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            return r0
    }
}
