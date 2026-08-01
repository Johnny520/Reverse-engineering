package p000;

/* JADX INFO: renamed from: nl */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0590nl {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f7664;

    /* JADX INFO: renamed from: β */
    public final boolean f7665;

    public C0590nl(java.lang.String r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f7664 = r1
            r0.f7665 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof p000.C0590nl
            if (r0 != 0) goto L8
            goto L1b
        L8:
            nl r3 = (p000.C0590nl) r3
            java.lang.String r0 = r2.f7664
            java.lang.String r1 = r3.f7664
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1b
        L15:
            boolean r2 = r2.f7665
            boolean r3 = r3.f7665
            if (r2 == r3) goto L1d
        L1b:
            r2 = 0
            return r2
        L1d:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f7664
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            boolean r1 = r1.f7665
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "EmojiDownloadAsset(url="
            r0.<init>(r1)
            java.lang.String r1 = r2.f7664
            r0.append(r1)
            java.lang.String r1 = ", animationExpected="
            r0.append(r1)
            boolean r2 = r2.f7665
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
