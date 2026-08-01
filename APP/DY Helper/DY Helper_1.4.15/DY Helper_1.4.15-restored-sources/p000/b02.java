package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class b02 {
    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r0 = r1 instanceof p000.b02
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final int hashCode() {
            r2 = this;
            r0 = 0
            int r2 = java.lang.Long.hashCode(r0)
            int r2 = r2 * 31
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r8 = this;
            zt0 r8 = new zt0
            r0 = 2
            r8.<init>(r0)
            zt0 r1 = p000.AbstractC1021yh.m6883(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "SharingStarted.WhileSubscribed("
            r8.<init>(r0)
            r6 = 0
            r7 = 63
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            java.lang.String r0 = p000.AbstractC0984xh.m6644(r1, r2, r3, r4, r5, r6, r7)
            r1 = 41
            java.lang.String r8 = p000.AbstractC0602nx.m4132(r8, r0, r1)
            return r8
    }
}
