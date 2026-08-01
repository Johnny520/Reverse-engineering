package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class pr0 {

    /* JADX INFO: renamed from: α */
    public final p000.or0 f8668;

    /* JADX INFO: renamed from: β */
    public final long f8669;

    /* JADX INFO: renamed from: γ */
    public final float f8670;

    public pr0(p000.or0 r3, float r4) {
            r2 = this;
            long r0 = p000.C0114ci.f2121
            r2.<init>(r3, r0, r4)
            return
    }

    public pr0(p000.or0 r1, long r2, float r4) {
            r0 = this;
            r0.<init>()
            r0.f8668 = r1
            r0.f8669 = r2
            r0.f8670 = r4
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p000.pr0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            pr0 r8 = (p000.pr0) r8
            or0 r1 = r7.f8668
            or0 r3 = r8.f8668
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.f8669
            long r5 = r8.f8669
            boolean r1 = p000.C0114ci.m1192(r3, r5)
            if (r1 != 0) goto L22
            return r2
        L22:
            float r7 = r7.f8670
            float r8 = r8.f8670
            int r7 = java.lang.Float.compare(r7, r8)
            if (r7 == 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            or0 r0 = r4.f8668
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = p000.C0114ci.f2126
            long r2 = r4.f8669
            int r0 = p000.lz1.m3677(r0, r1, r2)
            float r4 = r4.f8670
            int r4 = java.lang.Float.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            long r0 = r3.f8669
            java.lang.String r0 = p000.C0114ci.m1198(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "LightSource(position="
            r1.<init>(r2)
            or0 r2 = r3.f8668
            r1.append(r2)
            java.lang.String r2 = ", color="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ", intensity="
            r1.append(r0)
            float r3 = r3.f8670
            r1.append(r3)
            java.lang.String r3 = ")"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }
}
