package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class db0 {

    /* JADX INFO: renamed from: α */
    public final int f3023;

    /* JADX INFO: renamed from: β */
    public final int f3024;

    public db0(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f3023 = r1
            r0.f3024 = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.db0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            db0 r5 = (p000.db0) r5
            int r1 = r4.f3023
            int r3 = r5.f3023
            if (r1 == r3) goto L13
            return r2
        L13:
            int r4 = r4.f3024
            int r5 = r5.f3024
            if (r4 == r5) goto L1a
            return r2
        L1a:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f3023
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            int r1 = r1.f3024
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = ", totalCount="
            java.lang.String r1 = ")"
            java.lang.String r2 = "GroupApplyApprovalProgress(submittedCount="
            int r3 = r4.f3023
            int r4 = r4.f3024
            java.lang.String r4 = p000.AbstractC0602nx.m4128(r2, r3, r0, r4, r1)
            return r4
    }
}
