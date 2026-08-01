package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class n91 {

    /* JADX INFO: renamed from: α */
    public final p000.C0932w2 f7474;

    /* JADX INFO: renamed from: β */
    public final int f7475;

    /* JADX INFO: renamed from: γ */
    public final int f7476;

    public n91(p000.C0932w2 r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f7474 = r1
            r0.f7475 = r2
            r0.f7476 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L24
        L3:
            boolean r0 = r3 instanceof p000.n91
            if (r0 != 0) goto L8
            goto L22
        L8:
            n91 r3 = (p000.n91) r3
            w2 r0 = r2.f7474
            w2 r1 = r3.f7474
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L22
        L15:
            int r0 = r2.f7475
            int r1 = r3.f7475
            if (r0 == r1) goto L1c
            goto L22
        L1c:
            int r2 = r2.f7476
            int r3 = r3.f7476
            if (r2 == r3) goto L24
        L22:
            r2 = 0
            return r2
        L24:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            w2 r0 = r3.f7474
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f7475
            int r0 = p000.a12.m14(r2, r0, r1)
            int r3 = r3.f7476
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ParagraphIntrinsicInfo(intrinsics="
            r0.<init>(r1)
            w2 r1 = r2.f7474
            r0.append(r1)
            java.lang.String r1 = ", startIndex="
            r0.append(r1)
            int r1 = r2.f7475
            r0.append(r1)
            java.lang.String r1 = ", endIndex="
            r0.append(r1)
            int r2 = r2.f7476
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
