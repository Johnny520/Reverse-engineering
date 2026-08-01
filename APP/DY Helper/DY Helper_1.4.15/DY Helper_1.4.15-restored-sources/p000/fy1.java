package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class fy1 {

    /* JADX INFO: renamed from: α */
    public final boolean f4171;

    /* JADX INFO: renamed from: β */
    public final boolean f4172;

    /* JADX INFO: renamed from: γ */
    public final int f4173;

    public fy1(int r1, boolean r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f4171 = r2
            r0.f4172 = r3
            r0.f4173 = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.fy1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fy1 r5 = (p000.fy1) r5
            boolean r1 = r4.f4171
            boolean r3 = r5.f4171
            if (r1 == r3) goto L13
            return r2
        L13:
            boolean r1 = r4.f4172
            boolean r3 = r5.f4172
            if (r1 == r3) goto L1a
            return r2
        L1a:
            int r4 = r4.f4173
            int r5 = r5.f4173
            if (r4 == r5) goto L21
            return r2
        L21:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f4171
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.f4172
            int r0 = p000.lz1.m3678(r0, r1, r2)
            int r3 = r3.f4173
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ConversationClassification(isSingle="
            r0.<init>(r1)
            boolean r1 = r2.f4171
            r0.append(r1)
            java.lang.String r1 = ", isGroup="
            r0.append(r1)
            boolean r1 = r2.f4172
            r0.append(r1)
            java.lang.String r1 = ", conversationType="
            r0.append(r1)
            java.lang.String r1 = ")"
            int r2 = r2.f4173
            java.lang.String r2 = p000.AbstractC0602nx.m4131(r0, r2, r1)
            return r2
    }
}
