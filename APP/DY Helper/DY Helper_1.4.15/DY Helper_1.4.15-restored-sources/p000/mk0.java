package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class mk0 {

    /* JADX INFO: renamed from: α */
    public final p000.lk0 f7191;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f7192;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f7193;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f7194;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f7195;

    public mk0(p000.lk0 r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.f7191 = r1
            r0.f7192 = r2
            r0.f7193 = r3
            r0.f7194 = r4
            r0.f7195 = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L42
        L3:
            boolean r0 = r3 instanceof p000.mk0
            if (r0 != 0) goto L8
            goto L40
        L8:
            mk0 r3 = (p000.mk0) r3
            lk0 r0 = r2.f7191
            lk0 r1 = r3.f7191
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L40
        L15:
            java.lang.String r0 = r2.f7192
            java.lang.String r1 = r3.f7192
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L40
        L20:
            java.lang.String r0 = r2.f7193
            java.lang.String r1 = r3.f7193
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2b
            goto L40
        L2b:
            java.lang.String r0 = r2.f7194
            java.lang.String r1 = r3.f7194
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L36
            goto L40
        L36:
            java.lang.String r2 = r2.f7195
            java.lang.String r3 = r3.f7195
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L42
        L40:
            r2 = 0
            return r2
        L42:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            lk0 r0 = r4.f7191
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f7192
            int r0 = p000.a12.m15(r0, r1, r2)
            r2 = 0
            java.lang.String r3 = r4.f7193
            if (r3 != 0) goto L16
            r3 = r2
            goto L1a
        L16:
            int r3 = r3.hashCode()
        L1a:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.f7194
            if (r3 != 0) goto L22
            r3 = r2
            goto L26
        L22:
            int r3 = r3.hashCode()
        L26:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r4 = r4.f7195
            if (r4 != 0) goto L2d
            goto L31
        L2d:
            int r2 = r4.hashCode()
        L31:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HostViewSnapshot(bounds="
            r0.<init>(r1)
            lk0 r1 = r5.f7191
            r0.append(r1)
            java.lang.String r1 = ", className="
            r0.append(r1)
            java.lang.String r1 = r5.f7192
            r0.append(r1)
            java.lang.String r1 = ", resourceName="
            r0.append(r1)
            java.lang.String r1 = ", text="
            java.lang.String r2 = ", contentDescription="
            java.lang.String r3 = r5.f7193
            java.lang.String r4 = r5.f7194
            p000.AbstractC0602nx.m4119(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            java.lang.String r5 = r5.f7195
            java.lang.String r5 = p000.lz1.m3691(r0, r5, r1)
            return r5
    }
}
