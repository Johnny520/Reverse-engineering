package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class su0 {

    /* JADX INFO: renamed from: α */
    public final long f10046;

    /* JADX INFO: renamed from: β */
    public final long f10047;

    public su0(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.f10046 = r1
            r0.f10047 = r3
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p000.su0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            su0 r8 = (p000.su0) r8
            long r3 = r7.f10046
            long r5 = r8.f10046
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            long r3 = r7.f10047
            long r7 = r8.f10047
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.f10046
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            long r1 = r3.f10047
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CountRange(lower="
            r0.<init>(r1)
            long r1 = r3.f10046
            r0.append(r1)
            java.lang.String r1 = ", upperExclusive="
            r0.append(r1)
            long r1 = r3.f10047
            r0.append(r1)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
