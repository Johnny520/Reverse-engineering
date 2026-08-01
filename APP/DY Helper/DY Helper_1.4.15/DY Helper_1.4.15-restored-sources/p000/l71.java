package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class l71 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f6463;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f6464;

    /* JADX INFO: renamed from: γ */
    public final java.lang.Long f6465;

    public l71(java.lang.String r1, java.lang.String r2, java.lang.Long r3) {
            r0 = this;
            r0.<init>()
            r0.f6463 = r1
            r0.f6464 = r2
            r0.f6465 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof p000.l71
            if (r0 != 0) goto L8
            goto L2a
        L8:
            l71 r3 = (p000.l71) r3
            java.lang.String r0 = r2.f6463
            java.lang.String r1 = r3.f6463
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.lang.String r0 = r2.f6464
            java.lang.String r1 = r3.f6464
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.lang.Long r2 = r2.f6465
            java.lang.Long r3 = r3.f6465
            boolean r2 = p000.ln0.m3626(r2, r3)
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
            java.lang.String r0 = r3.f6463
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            r1 = 0
            java.lang.String r2 = r3.f6464
            if (r2 != 0) goto Lf
            r2 = r1
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Long r3 = r3.f6465
            if (r3 != 0) goto L1b
            goto L1f
        L1b:
            int r1 = r3.hashCode()
        L1f:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", format="
            java.lang.String r1 = ", fileSize="
            java.lang.String r2 = "SeekinVideoMedia(url="
            java.lang.String r3 = r5.f6463
            java.lang.String r4 = r5.f6464
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.Long r5 = r5.f6465
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
