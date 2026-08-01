package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class tv0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f10473;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f10474;

    public tv0(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f10473 = r1
            r0.f10474 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof p000.tv0
            if (r0 != 0) goto L8
            goto L1f
        L8:
            tv0 r3 = (p000.tv0) r3
            java.lang.String r0 = r2.f10473
            java.lang.String r1 = r3.f10473
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            java.lang.String r2 = r2.f10474
            java.lang.String r3 = r3.f10474
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
            java.lang.String r0 = r1.f10473
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r1.f10474
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = ", listenerProviderClassName="
            java.lang.String r1 = ")"
            java.lang.String r2 = "CommentActionSignature(actionParamsClassName="
            java.lang.String r3 = r4.f10473
            java.lang.String r4 = r4.f10474
            java.lang.String r4 = p000.lz1.m3689(r2, r3, r0, r4, r1)
            return r4
    }
}
