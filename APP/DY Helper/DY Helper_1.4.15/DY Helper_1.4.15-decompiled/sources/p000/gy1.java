package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class gy1 {

    /* JADX INFO: renamed from: α */
    public final boolean f4505;

    /* JADX INFO: renamed from: β */
    public final boolean f4506;

    public gy1(boolean r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f4505 = r1
            r0.f4506 = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.gy1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            gy1 r5 = (p000.gy1) r5
            boolean r1 = r4.f4505
            boolean r3 = r5.f4505
            if (r1 == r3) goto L13
            return r2
        L13:
            boolean r4 = r4.f4506
            boolean r5 = r5.f4506
            if (r4 == r5) goto L1a
            return r2
        L1a:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            boolean r0 = r1.f4505
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 * 31
            boolean r1 = r1.f4506
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CustomRuleDecision(matched="
            r0.<init>(r1)
            boolean r1 = r2.f4505
            r0.append(r1)
            java.lang.String r1 = ", enabled="
            r0.append(r1)
            boolean r2 = r2.f4506
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
