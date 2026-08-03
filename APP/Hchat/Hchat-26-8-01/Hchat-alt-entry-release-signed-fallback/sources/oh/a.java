package oh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends java.lang.InheritableThreadLocal {
    @Override // java.lang.InheritableThreadLocal
    public final java.lang.Object childValue(java.lang.Object r2) {
            r1 = this;
            java.util.Map r2 = (java.util.Map) r2
            if (r2 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r2)
            return r0
    }
}
