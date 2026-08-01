package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class z00 {

    /* JADX INFO: renamed from: α */
    public final long f12913;

    /* JADX INFO: renamed from: β */
    public final long f12914;

    /* JADX INFO: renamed from: γ */
    public final long f12915;

    public z00(long r1, long r3, long r5) {
            r0 = this;
            r0.<init>()
            r0.f12913 = r1
            r0.f12914 = r3
            r0.f12915 = r5
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p000.z00
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            z00 r8 = (p000.z00) r8
            long r3 = r7.f12913
            long r5 = r8.f12913
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            long r3 = r7.f12914
            long r5 = r8.f12914
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L1e
            return r2
        L1e:
            long r3 = r7.f12915
            long r7 = r8.f12915
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L27
            return r2
        L27:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.f12913
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f12914
            int r0 = p000.lz1.m3677(r0, r1, r2)
            long r1 = r4.f12915
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "StatisticData(diggCount="
            r0.<init>(r1)
            long r1 = r3.f12913
            r0.append(r1)
            java.lang.String r1 = ", commentCount="
            r0.append(r1)
            long r1 = r3.f12914
            r0.append(r1)
            java.lang.String r1 = ", collectCount="
            r0.append(r1)
            long r1 = r3.f12915
            r0.append(r1)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: α */
    public final long m7052() {
            r2 = this;
            long r0 = r2.f12915
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final long m7053() {
            r2 = this;
            long r0 = r2.f12914
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final long m7054() {
            r2 = this;
            long r0 = r2.f12913
            return r0
    }
}
