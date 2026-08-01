package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class u32 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f10581;

    /* JADX INFO: renamed from: β */
    public java.lang.String f10582;

    /* JADX INFO: renamed from: γ */
    public boolean f10583;

    /* JADX INFO: renamed from: δ */
    public p000.q91 f10584;

    public u32(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f10581 = r1
            r0.f10582 = r2
            r1 = 0
            r0.f10583 = r1
            r1 = 0
            r0.f10584 = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.u32
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            u32 r5 = (p000.u32) r5
            java.lang.String r1 = r4.f10581
            java.lang.String r3 = r5.f10581
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f10582
            java.lang.String r3 = r5.f10582
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            boolean r1 = r4.f10583
            boolean r3 = r5.f10583
            if (r1 == r3) goto L29
            return r2
        L29:
            q91 r4 = r4.f10584
            q91 r5 = r5.f10584
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L34
            return r2
        L34:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f10581
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f10582
            int r0 = p000.a12.m15(r0, r1, r2)
            boolean r2 = r3.f10583
            int r0 = p000.lz1.m3678(r0, r1, r2)
            q91 r3 = r3.f10584
            if (r3 != 0) goto L1b
            r3 = 0
            goto L1f
        L1b:
            int r3 = r3.hashCode()
        L1f:
            int r0 = r0 + r3
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextSubstitution(layoutCache="
            r0.<init>(r1)
            q91 r1 = r2.f10584
            r0.append(r1)
            java.lang.String r1 = ", isShowingSubstitution="
            r0.append(r1)
            boolean r2 = r2.f10583
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
