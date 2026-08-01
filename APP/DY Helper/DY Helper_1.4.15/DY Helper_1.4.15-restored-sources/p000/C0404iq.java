package p000;

/* JADX INFO: renamed from: iq */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0404iq {

    /* JADX INFO: renamed from: α */
    public final p000.C0276f8 f5166;

    /* JADX INFO: renamed from: β */
    public final long f5167;

    public C0404iq(p000.C0276f8 r1, long r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f5166 = r1
            r0.f5167 = r2
            return
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p000.C0404iq
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            iq r6 = (p000.C0404iq) r6
            f8 r1 = r5.f5166
            f8 r3 = r6.f5166
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r5.f5167
            long r5 = r6.f5167
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L20
            return r2
        L20:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            f8 r0 = r3.f5166
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            long r1 = r3.f5167
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CachedInfo(info="
            r0.<init>(r1)
            f8 r1 = r3.f5166
            r0.append(r1)
            java.lang.String r1 = ", createdAt="
            r0.append(r1)
            long r1 = r3.f5167
            r0.append(r1)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
