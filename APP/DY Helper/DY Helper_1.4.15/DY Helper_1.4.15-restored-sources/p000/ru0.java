package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ru0 {

    /* JADX INFO: renamed from: α */
    public final int f9513;

    /* JADX INFO: renamed from: β */
    public final java.util.List f9514;

    /* JADX INFO: renamed from: γ */
    public final java.util.List f9515;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f9516;

    public ru0(int r1, java.util.List r2, java.util.List r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.f9513 = r1
            r0.f9514 = r2
            r0.f9515 = r3
            r0.f9516 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof p000.ru0
            if (r0 != 0) goto L8
            goto L31
        L8:
            ru0 r3 = (p000.ru0) r3
            int r0 = r2.f9513
            int r1 = r3.f9513
            if (r0 == r1) goto L11
            goto L31
        L11:
            java.util.List r0 = r2.f9514
            java.util.List r1 = r3.f9514
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L31
        L1c:
            java.util.List r0 = r2.f9515
            java.util.List r1 = r3.f9515
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L31
        L27:
            java.lang.String r2 = r2.f9516
            java.lang.String r3 = r3.f9516
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L33
        L31:
            r2 = 0
            return r2
        L33:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f9513
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.util.List r2 = r3.f9514
            int r0 = p000.a12.m16(r2, r0, r1)
            java.util.List r2 = r3.f9515
            int r0 = p000.a12.m16(r2, r0, r1)
            java.lang.String r3 = r3.f9516
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LivePhotoMergeTask(pageIndex="
            r0.<init>(r1)
            int r1 = r2.f9513
            r0.append(r1)
            java.lang.String r1 = ", stillImageCandidates="
            r0.append(r1)
            java.util.List r1 = r2.f9514
            r0.append(r1)
            java.lang.String r1 = ", videoCandidates="
            r0.append(r1)
            java.util.List r1 = r2.f9515
            r0.append(r1)
            java.lang.String r1 = ", suffix="
            r0.append(r1)
            java.lang.String r2 = r2.f9516
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
