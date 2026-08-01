package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class oh0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f8112;

    /* JADX INFO: renamed from: β */
    public final java.util.List f8113;

    public oh0(java.lang.String r1, java.util.List r2) {
            r0 = this;
            r0.<init>()
            r0.f8112 = r1
            r0.f8113 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof p000.oh0
            if (r0 != 0) goto L8
            goto L1f
        L8:
            oh0 r3 = (p000.oh0) r3
            java.lang.String r0 = r2.f8112
            java.lang.String r1 = r3.f8112
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            java.util.List r2 = r2.f8113
            java.util.List r3 = r3.f8113
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
            java.lang.String r0 = r1.f8112
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List r1 = r1.f8113
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ContentSummary(typeLabel="
            r0.<init>(r1)
            java.lang.String r1 = r2.f8112
            r0.append(r1)
            java.lang.String r1 = ", lines="
            r0.append(r1)
            java.util.List r2 = r2.f8113
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
