package tf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends tf.a implements java.util.Set {
    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r4 != r3) goto L4
            r4 = 1
            return r4
        L4:
            boolean r0 = r4 instanceof java.util.Set
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.util.Set r4 = (java.util.Set) r4
            int r0 = r3.size()
            int r2 = r4.size()
            if (r0 == r2) goto L17
            return r1
        L17:
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r3.containsAll(r4)
            return r4
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
            r4 = this;
            java.util.Iterator r0 = r4.iterator()
            r1 = 0
            r2 = r1
        L6:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1a
            java.lang.Object r3 = r0.next()
            if (r3 == 0) goto L17
            int r3 = r3.hashCode()
            goto L18
        L17:
            r3 = r1
        L18:
            int r2 = r2 + r3
            goto L6
        L1a:
            return r2
    }
}
