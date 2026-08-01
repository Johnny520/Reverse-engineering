package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class eh0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.Long f3558;

    /* JADX INFO: renamed from: β */
    public final java.lang.Long f3559;

    /* JADX INFO: renamed from: γ */
    public final java.util.ArrayList f3560;

    public eh0(java.lang.Long r1, java.lang.Long r2, java.util.ArrayList r3) {
            r0 = this;
            r0.<init>()
            r0.f3558 = r1
            r0.f3559 = r2
            r0.f3560 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof p000.eh0
            if (r0 != 0) goto L8
            goto L2a
        L8:
            eh0 r3 = (p000.eh0) r3
            java.lang.Long r0 = r2.f3558
            java.lang.Long r1 = r3.f3558
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.lang.Long r0 = r2.f3559
            java.lang.Long r1 = r3.f3559
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.util.ArrayList r2 = r2.f3560
            java.util.ArrayList r3 = r3.f3560
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2c
        L2a:
            r2 = 0
            return r2
        L2c:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            java.lang.Long r1 = r3.f3558
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            java.lang.Long r2 = r3.f3559
            if (r2 != 0) goto L12
            goto L16
        L12:
            int r0 = r2.hashCode()
        L16:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.ArrayList r3 = r3.f3560
            int r3 = r3.hashCode()
            int r3 = r3 + r1
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Timeline(earliestTimeMs="
            r0.<init>(r1)
            java.lang.Long r1 = r2.f3558
            r0.append(r1)
            java.lang.String r1 = ", latestTimeMs="
            r0.append(r1)
            java.lang.Long r1 = r2.f3559
            r0.append(r1)
            java.lang.String r1 = ", monthBatches="
            r0.append(r1)
            java.util.ArrayList r2 = r2.f3560
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
