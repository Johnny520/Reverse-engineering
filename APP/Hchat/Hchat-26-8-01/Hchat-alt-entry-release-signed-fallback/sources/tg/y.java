package tg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof tg.y
            if (r1 == 0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r8 = this;
            uf.c r0 = new uf.c
            r1 = 2
            r0.<init>(r1)
            uf.c r2 = a.a.t(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SharingStarted.WhileSubscribed("
            r0.<init>(r1)
            r6 = 0
            r7 = 63
            r3 = 0
            r4 = 0
            r5 = 0
            java.lang.String r1 = tf.m.A1(r2, r3, r4, r5, r6, r7)
            r2 = 41
            java.lang.String r0 = eh.a.q(r0, r1, r2)
            return r0
    }
}
