package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class gj0 {

    /* JADX INFO: renamed from: α */
    public final java.util.List f4385;

    /* JADX INFO: renamed from: β */
    public final boolean f4386;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f4387;

    public gj0(java.util.List r1, boolean r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.f4385 = r1
            r0.f4386 = r2
            r0.f4387 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof p000.gj0
            if (r0 != 0) goto L8
            goto L26
        L8:
            gj0 r3 = (p000.gj0) r3
            java.util.List r0 = r2.f4385
            java.util.List r1 = r3.f4385
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            boolean r0 = r2.f4386
            boolean r1 = r3.f4386
            if (r0 == r1) goto L1c
            goto L26
        L1c:
            java.lang.String r2 = r2.f4387
            java.lang.String r3 = r3.f4387
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L28
        L26:
            r2 = 0
            return r2
        L28:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.util.List r0 = r3.f4385
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.f4386
            int r0 = p000.lz1.m3678(r0, r1, r2)
            java.lang.String r3 = r3.f4387
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LoadResult(items="
            r0.<init>(r1)
            java.util.List r1 = r2.f4385
            r0.append(r1)
            java.lang.String r1 = ", strangerComplete="
            r0.append(r1)
            boolean r1 = r2.f4386
            r0.append(r1)
            java.lang.String r1 = ", warningMessage="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r2.f4387
            java.lang.String r2 = p000.lz1.m3691(r0, r2, r1)
            return r2
    }
}
