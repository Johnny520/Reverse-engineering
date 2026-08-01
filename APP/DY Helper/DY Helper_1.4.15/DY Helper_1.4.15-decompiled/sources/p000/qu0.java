package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class qu0 {

    /* JADX INFO: renamed from: α */
    public final int f9110;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f9111;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f9112;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f9113;

    /* JADX INFO: renamed from: ε */
    public final java.util.List f9114;

    /* JADX INFO: renamed from: ζ */
    public final java.util.List f9115;

    public qu0(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.util.List r5, java.util.List r6) {
            r0 = this;
            r0.<init>()
            r0.f9110 = r1
            r0.f9111 = r2
            r0.f9112 = r3
            r0.f9113 = r4
            r0.f9114 = r5
            r0.f9115 = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.qu0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qu0 r5 = (p000.qu0) r5
            int r1 = r4.f9110
            int r3 = r5.f9110
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.f9111
            java.lang.String r3 = r5.f9111
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r4.f9112
            java.lang.String r3 = r5.f9112
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            java.lang.String r1 = r4.f9113
            java.lang.String r3 = r5.f9113
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            java.util.List r1 = r4.f9114
            java.util.List r3 = r5.f9114
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            java.util.List r4 = r4.f9115
            java.util.List r5 = r5.f9115
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L4a
            return r2
        L4a:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f9110
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            r1 = 0
            java.lang.String r2 = r3.f9111
            if (r2 != 0) goto Lf
            r2 = r1
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r3.f9112
            if (r2 != 0) goto L1c
            r2 = r1
            goto L20
        L1c:
            int r2 = r2.hashCode()
        L20:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r3.f9113
            if (r2 != 0) goto L29
            r2 = r1
            goto L2d
        L29:
            int r2 = r2.hashCode()
        L2d:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.util.List r2 = r3.f9114
            if (r2 != 0) goto L36
            r2 = r1
            goto L3a
        L36:
            int r2 = r2.hashCode()
        L3a:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.util.List r3 = r3.f9115
            if (r3 != 0) goto L42
            goto L46
        L42:
            int r1 = r3.hashCode()
        L46:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", videoUrl="
            java.lang.String r1 = ", imageUrl="
            int r2 = r5.f9110
            java.lang.String r3 = "LivePhotoItem(pageIndex="
            java.lang.String r4 = r5.f9111
            java.lang.StringBuilder r0 = p000.a12.m20(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", coverUrl="
            java.lang.String r2 = ", videoUrlCandidates="
            java.lang.String r3 = r5.f9112
            java.lang.String r4 = r5.f9113
            p000.AbstractC0602nx.m4119(r0, r3, r1, r4, r2)
            java.util.List r1 = r5.f9114
            r0.append(r1)
            java.lang.String r1 = ", imageUrlCandidates="
            r0.append(r1)
            java.util.List r5 = r5.f9115
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
