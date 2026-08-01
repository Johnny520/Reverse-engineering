package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class lh0 {

    /* JADX INFO: renamed from: α */
    public final android.net.Uri f6635;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f6636;

    /* JADX INFO: renamed from: γ */
    public final p000.hh0 f6637;

    /* JADX INFO: renamed from: δ */
    public final int f6638;

    /* JADX INFO: renamed from: ε */
    public final int f6639;

    /* JADX INFO: renamed from: ζ */
    public final boolean f6640;

    /* JADX INFO: renamed from: η */
    public final java.lang.String f6641;

    /* JADX INFO: renamed from: θ */
    public final java.lang.Long f6642;

    /* JADX INFO: renamed from: ι */
    public final java.lang.Long f6643;

    /* JADX INFO: renamed from: κ */
    public final int f6644;

    public lh0(android.net.Uri r1, java.lang.String r2, p000.hh0 r3, int r4, int r5, boolean r6, java.lang.String r7, java.lang.Long r8, java.lang.Long r9, int r10) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r0.<init>()
            r0.f6635 = r1
            r0.f6636 = r2
            r0.f6637 = r3
            r0.f6638 = r4
            r0.f6639 = r5
            r0.f6640 = r6
            r0.f6641 = r7
            r0.f6642 = r8
            r0.f6643 = r9
            r0.f6644 = r10
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L66
        L4:
            boolean r0 = r3 instanceof p000.lh0
            if (r0 != 0) goto L9
            goto L64
        L9:
            lh0 r3 = (p000.lh0) r3
            android.net.Uri r0 = r2.f6635
            android.net.Uri r1 = r3.f6635
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L16
            goto L64
        L16:
            java.lang.String r0 = r2.f6636
            java.lang.String r1 = r3.f6636
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L21
            goto L64
        L21:
            hh0 r0 = r2.f6637
            hh0 r1 = r3.f6637
            if (r0 == r1) goto L28
            goto L64
        L28:
            int r0 = r2.f6638
            int r1 = r3.f6638
            if (r0 == r1) goto L2f
            goto L64
        L2f:
            int r0 = r2.f6639
            int r1 = r3.f6639
            if (r0 == r1) goto L36
            goto L64
        L36:
            boolean r0 = r2.f6640
            boolean r1 = r3.f6640
            if (r0 == r1) goto L3d
            goto L64
        L3d:
            java.lang.String r0 = r2.f6641
            java.lang.String r1 = r3.f6641
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L48
            goto L64
        L48:
            java.lang.Long r0 = r2.f6642
            java.lang.Long r1 = r3.f6642
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L53
            goto L64
        L53:
            java.lang.Long r0 = r2.f6643
            java.lang.Long r1 = r3.f6643
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L5e
            goto L64
        L5e:
            int r2 = r2.f6644
            int r3 = r3.f6644
            if (r2 == r3) goto L66
        L64:
            r2 = 0
            return r2
        L66:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            android.net.Uri r0 = r4.f6635
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f6636
            int r0 = p000.a12.m15(r0, r1, r2)
            hh0 r2 = r4.f6637
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r0 = r4.f6638
            int r0 = p000.a12.m14(r0, r2, r1)
            int r2 = r4.f6639
            int r0 = p000.a12.m14(r2, r0, r1)
            boolean r2 = r4.f6640
            int r0 = p000.lz1.m3678(r0, r1, r2)
            java.lang.String r2 = r4.f6641
            int r0 = p000.a12.m15(r0, r1, r2)
            r2 = 0
            java.lang.Long r3 = r4.f6642
            if (r3 != 0) goto L36
            r3 = r2
            goto L3a
        L36:
            int r3 = r3.hashCode()
        L3a:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Long r3 = r4.f6643
            if (r3 != 0) goto L41
            goto L45
        L41:
            int r2 = r3.hashCode()
        L45:
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r4 = r4.f6644
            int r4 = java.lang.Integer.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ExportResult(uri="
            r0.<init>(r1)
            android.net.Uri r1 = r2.f6635
            r0.append(r1)
            java.lang.String r1 = ", fileName="
            r0.append(r1)
            java.lang.String r1 = r2.f6636
            r0.append(r1)
            java.lang.String r1 = ", format="
            r0.append(r1)
            hh0 r1 = r2.f6637
            r0.append(r1)
            java.lang.String r1 = ", messageCount="
            r0.append(r1)
            int r1 = r2.f6638
            r0.append(r1)
            java.lang.String r1 = ", rawMessageCount="
            r0.append(r1)
            int r1 = r2.f6639
            r0.append(r1)
            java.lang.String r1 = ", complete="
            r0.append(r1)
            boolean r1 = r2.f6640
            r0.append(r1)
            java.lang.String r1 = ", completionNote="
            r0.append(r1)
            java.lang.String r1 = r2.f6641
            r0.append(r1)
            java.lang.String r1 = ", earliestMessageTimeMs="
            r0.append(r1)
            java.lang.Long r1 = r2.f6642
            r0.append(r1)
            java.lang.String r1 = ", latestMessageTimeMs="
            r0.append(r1)
            java.lang.Long r1 = r2.f6643
            r0.append(r1)
            java.lang.String r1 = ", monthCount="
            r0.append(r1)
            int r2 = r2.f6644
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
