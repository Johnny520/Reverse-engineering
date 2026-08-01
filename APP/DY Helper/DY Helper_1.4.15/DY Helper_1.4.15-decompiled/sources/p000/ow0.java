package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ow0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f8279;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f8280;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f8281;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f8282;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f8283;

    /* JADX INFO: renamed from: ζ */
    public final java.util.List f8284;

    /* JADX INFO: renamed from: η */
    public final boolean f8285;

    public ow0(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.util.List r6, boolean r7) {
            r0 = this;
            r5.getClass()
            r0.<init>()
            r0.f8279 = r1
            r0.f8280 = r2
            r0.f8281 = r3
            r0.f8282 = r4
            r0.f8283 = r5
            r0.f8284 = r6
            r0.f8285 = r7
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L54
        L3:
            boolean r0 = r3 instanceof p000.ow0
            if (r0 != 0) goto L8
            goto L52
        L8:
            ow0 r3 = (p000.ow0) r3
            java.lang.String r0 = r2.f8279
            java.lang.String r1 = r3.f8279
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L52
        L15:
            java.lang.String r0 = r2.f8280
            java.lang.String r1 = r3.f8280
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L52
        L20:
            java.lang.String r0 = r2.f8281
            java.lang.String r1 = r3.f8281
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2b
            goto L52
        L2b:
            java.lang.String r0 = r2.f8282
            java.lang.String r1 = r3.f8282
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L36
            goto L52
        L36:
            java.lang.String r0 = r2.f8283
            java.lang.String r1 = r3.f8283
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L41
            goto L52
        L41:
            java.util.List r0 = r2.f8284
            java.util.List r1 = r3.f8284
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L4c
            goto L52
        L4c:
            boolean r2 = r2.f8285
            boolean r3 = r3.f8285
            if (r2 == r3) goto L54
        L52:
            r2 = 0
            return r2
        L54:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f8279
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f8280
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f8281
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f8282
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f8283
            int r0 = p000.a12.m15(r0, r1, r2)
            java.util.List r2 = r3.f8284
            int r0 = p000.a12.m16(r2, r0, r1)
            boolean r3 = r3.f8285
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", title="
            java.lang.String r1 = ", subtitle="
            java.lang.String r2 = "FeatureGroup(icon="
            java.lang.String r3 = r5.f8279
            java.lang.String r4 = r5.f8280
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", color="
            java.lang.String r2 = ", bg="
            java.lang.String r3 = r5.f8281
            java.lang.String r4 = r5.f8282
            p000.AbstractC0602nx.m4119(r0, r3, r1, r4, r2)
            java.lang.String r1 = r5.f8283
            r0.append(r1)
            java.lang.String r1 = ", items="
            r0.append(r1)
            java.util.List r1 = r5.f8284
            r0.append(r1)
            java.lang.String r1 = ", initiallyExpanded="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r5 = r5.f8285
            java.lang.String r5 = p000.lz1.m3693(r0, r5, r1)
            return r5
    }
}
