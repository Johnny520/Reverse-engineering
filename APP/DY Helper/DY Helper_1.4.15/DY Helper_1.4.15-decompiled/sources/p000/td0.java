package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class td0 {

    /* JADX INFO: renamed from: α */
    public final java.util.ArrayList f10321;

    /* JADX INFO: renamed from: β */
    public final boolean f10322;

    /* JADX INFO: renamed from: γ */
    public final boolean f10323;

    public td0(java.util.ArrayList r1, boolean r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f10321 = r1
            r0.f10322 = r2
            r0.f10323 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L24
        L3:
            boolean r0 = r3 instanceof p000.td0
            if (r0 != 0) goto L8
            goto L22
        L8:
            td0 r3 = (p000.td0) r3
            java.util.ArrayList r0 = r2.f10321
            java.util.ArrayList r1 = r3.f10321
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L22
        L15:
            boolean r0 = r2.f10322
            boolean r1 = r3.f10322
            if (r0 == r1) goto L1c
            goto L22
        L1c:
            boolean r2 = r2.f10323
            boolean r3 = r3.f10323
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
            java.util.ArrayList r0 = r3.f10321
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.f10322
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r3 = r3.f10323
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ShareContactFilterResult(items="
            r0.<init>(r1)
            java.util.ArrayList r1 = r2.f10321
            r0.append(r1)
            java.lang.String r1 = ", applicable="
            r0.append(r1)
            boolean r1 = r2.f10322
            r0.append(r1)
            java.lang.String r1 = ", changed="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r2 = r2.f10323
            java.lang.String r2 = p000.lz1.m3693(r0, r2, r1)
            return r2
    }
}
