package p000;

/* JADX INFO: renamed from: lu */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0525lu {

    /* JADX INFO: renamed from: α */
    public final p000.C0585ng f6778;

    /* JADX INFO: renamed from: β */
    public final p000.ny0 f6779;

    public C0525lu(p000.C0585ng r1, p000.ny0 r2) {
            r0 = this;
            r0.<init>()
            r0.f6778 = r1
            r0.f6779 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof p000.C0525lu
            if (r0 != 0) goto L8
            goto L1f
        L8:
            lu r3 = (p000.C0525lu) r3
            ng r0 = r2.f6778
            ng r1 = r3.f6778
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            ny0 r2 = r2.f6779
            ny0 r3 = r3.f6779
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            ng r0 = r1.f6778
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            ny0 r1 = r1.f6779
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VideoPolicy(isWatermarkVideoUrl="
            r0.<init>(r1)
            ng r1 = r2.f6778
            r0.append(r1)
            java.lang.String r1 = ", watermarkScore="
            r0.append(r1)
            ny0 r2 = r2.f6779
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
