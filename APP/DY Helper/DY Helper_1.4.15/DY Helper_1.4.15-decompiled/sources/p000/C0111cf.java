package p000;

/* JADX INFO: renamed from: cf */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0111cf {

    /* JADX INFO: renamed from: α */
    public final boolean f2091;

    /* JADX INFO: renamed from: β */
    public final long f2092;

    public C0111cf(long r1, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f2091 = r3
            r0.f2092 = r1
            return
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p000.C0111cf
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            cf r6 = (p000.C0111cf) r6
            boolean r1 = r5.f2091
            boolean r3 = r6.f2091
            if (r1 == r3) goto L13
            return r2
        L13:
            long r3 = r5.f2092
            long r5 = r6.f2092
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L1c
            return r2
        L1c:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f2091
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 * 31
            long r1 = r3.f2092
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "EnabledSnapshot(value="
            r0.<init>(r1)
            boolean r1 = r3.f2091
            r0.append(r1)
            java.lang.String r1 = ", expiresAtMs="
            r0.append(r1)
            long r1 = r3.f2092
            r0.append(r1)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
