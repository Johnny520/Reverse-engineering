package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class l50 {

    /* JADX INFO: renamed from: α */
    public java.lang.String f6424;

    /* JADX INFO: renamed from: β */
    public java.lang.String f6425;

    /* JADX INFO: renamed from: γ */
    public java.util.List f6426;

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.l50
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            l50 r5 = (p000.l50) r5
            java.lang.String r1 = r4.f6424
            java.lang.String r3 = r5.f6424
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L2b
            java.lang.String r1 = r4.f6425
            java.lang.String r3 = r5.f6425
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L2b
            java.util.List r4 = r4.f6426
            java.util.List r5 = r5.f6426
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 == 0) goto L2b
            return r0
        L2b:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f6424
            java.lang.String r1 = r2.f6425
            java.util.List r2 = r2.f6426
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r1, r2}
            int r2 = java.util.Objects.hash(r2)
            return r2
    }
}
