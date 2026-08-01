package p000;

/* JADX INFO: renamed from: im */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0400im {

    /* JADX INFO: renamed from: α */
    public final int f5120;

    /* JADX INFO: renamed from: β */
    public final float f5121;

    /* JADX INFO: renamed from: γ */
    public final boolean f5122;

    /* JADX INFO: renamed from: δ */
    public final boolean f5123;

    /* JADX INFO: renamed from: ε */
    public final boolean f5124;

    /* JADX INFO: renamed from: ζ */
    public final int f5125;

    public C0400im(int r1, float r2, boolean r3, boolean r4, boolean r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.f5120 = r1
            r0.f5121 = r2
            r0.f5122 = r3
            r0.f5123 = r4
            r0.f5124 = r5
            r0.f5125 = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.C0400im
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            im r5 = (p000.C0400im) r5
            int r1 = r4.f5120
            int r3 = r5.f5120
            if (r1 == r3) goto L13
            return r2
        L13:
            float r1 = r4.f5121
            float r3 = r5.f5121
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L1e
            return r2
        L1e:
            boolean r1 = r4.f5122
            boolean r3 = r5.f5122
            if (r1 == r3) goto L25
            return r2
        L25:
            boolean r1 = r4.f5123
            boolean r3 = r5.f5123
            if (r1 == r3) goto L2c
            return r2
        L2c:
            boolean r1 = r4.f5124
            boolean r3 = r5.f5124
            if (r1 == r3) goto L33
            return r2
        L33:
            int r4 = r4.f5125
            int r5 = r5.f5125
            if (r4 == r5) goto L3a
            return r2
        L3a:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f5120
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f5121
            int r0 = p000.lz1.m3676(r2, r0, r1)
            boolean r2 = r3.f5122
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r2 = r3.f5123
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r2 = r3.f5124
            int r0 = p000.lz1.m3678(r0, r1, r2)
            int r3 = r3.f5125
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OriginalViewState(visibility="
            r0.<init>(r1)
            int r1 = r5.f5120
            r0.append(r1)
            java.lang.String r1 = ", alpha="
            r0.append(r1)
            float r1 = r5.f5121
            r0.append(r1)
            java.lang.String r1 = ", enabled="
            r0.append(r1)
            java.lang.String r1 = ", clickable="
            java.lang.String r2 = ", focusable="
            boolean r3 = r5.f5122
            boolean r4 = r5.f5123
            p000.AbstractC0602nx.m4120(r0, r3, r1, r4, r2)
            boolean r1 = r5.f5124
            r0.append(r1)
            java.lang.String r1 = ", importantForAccessibility="
            r0.append(r1)
            int r5 = r5.f5125
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
