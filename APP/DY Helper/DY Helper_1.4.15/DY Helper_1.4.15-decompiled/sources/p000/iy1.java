package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class iy1 {

    /* JADX INFO: renamed from: α */
    public final boolean f5246;

    /* JADX INFO: renamed from: β */
    public final boolean f5247;

    /* JADX INFO: renamed from: γ */
    public final boolean f5248;

    public iy1(boolean r1, boolean r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f5246 = r1
            r0.f5247 = r2
            r0.f5248 = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.iy1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            iy1 r5 = (p000.iy1) r5
            boolean r1 = r4.f5246
            boolean r3 = r5.f5246
            if (r1 == r3) goto L13
            return r2
        L13:
            boolean r1 = r4.f5247
            boolean r3 = r5.f5247
            if (r1 == r3) goto L1a
            return r2
        L1a:
            boolean r4 = r4.f5248
            boolean r5 = r5.f5248
            if (r4 == r5) goto L21
            return r2
        L21:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f5246
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.f5247
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r3 = r3.f5248
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PetTaskPersonPolicy(enabled="
            r0.<init>(r1)
            boolean r1 = r2.f5246
            r0.append(r1)
            java.lang.String r1 = ", mutualMessageEnabled="
            r0.append(r1)
            boolean r1 = r2.f5247
            r0.append(r1)
            java.lang.String r1 = ", imageEnabled="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r2 = r2.f5248
            java.lang.String r2 = p000.lz1.m3693(r0, r2, r1)
            return r2
    }
}
