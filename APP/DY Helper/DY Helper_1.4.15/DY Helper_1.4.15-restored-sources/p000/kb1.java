package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class kb1 {

    /* JADX INFO: renamed from: α */
    public final java.util.List f5834;

    /* JADX INFO: renamed from: β */
    public final int f5835;

    /* JADX INFO: renamed from: γ */
    public final boolean f5836;

    /* JADX INFO: renamed from: δ */
    public final java.lang.Integer f5837;

    /* JADX INFO: renamed from: ε */
    public final int f5838;

    /* JADX INFO: renamed from: ζ */
    public final int f5839;

    /* JADX INFO: renamed from: η */
    public final int f5840;

    /* JADX INFO: renamed from: θ */
    public final int f5841;

    /* JADX INFO: renamed from: ι */
    public final int f5842;

    /* JADX INFO: renamed from: κ */
    public final java.util.List f5843;

    public kb1(java.util.List r1, int r2, boolean r3, java.lang.Integer r4, int r5, int r6, int r7, int r8, int r9, java.util.List r10) {
            r0 = this;
            r0.<init>()
            r0.f5834 = r1
            r0.f5835 = r2
            r0.f5836 = r3
            r0.f5837 = r4
            r0.f5838 = r5
            r0.f5839 = r6
            r0.f5840 = r7
            r0.f5841 = r8
            r0.f5842 = r9
            r0.f5843 = r10
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L5d
        L3:
            boolean r0 = r3 instanceof p000.kb1
            if (r0 != 0) goto L8
            goto L5b
        L8:
            kb1 r3 = (p000.kb1) r3
            java.util.List r0 = r2.f5834
            java.util.List r1 = r3.f5834
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L5b
        L15:
            int r0 = r2.f5835
            int r1 = r3.f5835
            if (r0 == r1) goto L1c
            goto L5b
        L1c:
            boolean r0 = r2.f5836
            boolean r1 = r3.f5836
            if (r0 == r1) goto L23
            goto L5b
        L23:
            java.lang.Integer r0 = r2.f5837
            java.lang.Integer r1 = r3.f5837
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2e
            goto L5b
        L2e:
            int r0 = r2.f5838
            int r1 = r3.f5838
            if (r0 == r1) goto L35
            goto L5b
        L35:
            int r0 = r2.f5839
            int r1 = r3.f5839
            if (r0 == r1) goto L3c
            goto L5b
        L3c:
            int r0 = r2.f5840
            int r1 = r3.f5840
            if (r0 == r1) goto L43
            goto L5b
        L43:
            int r0 = r2.f5841
            int r1 = r3.f5841
            if (r0 == r1) goto L4a
            goto L5b
        L4a:
            int r0 = r2.f5842
            int r1 = r3.f5842
            if (r0 == r1) goto L51
            goto L5b
        L51:
            java.util.List r2 = r2.f5843
            java.util.List r3 = r3.f5843
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L5d
        L5b:
            r2 = 0
            return r2
        L5d:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.util.List r0 = r3.f5834
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f5835
            int r0 = p000.a12.m14(r2, r0, r1)
            boolean r2 = r3.f5836
            int r0 = p000.lz1.m3678(r0, r1, r2)
            java.lang.Integer r2 = r3.f5837
            if (r2 != 0) goto L1b
            r2 = 0
            goto L1f
        L1b:
            int r2 = r2.hashCode()
        L1f:
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r2 = r3.f5838
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f5839
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f5840
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f5841
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f5842
            int r0 = p000.a12.m14(r2, r0, r1)
            java.util.List r3 = r3.f5843
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "WorldRelationPage(secPetIds="
            r0.<init>(r1)
            java.util.List r1 = r5.f5834
            r0.append(r1)
            java.lang.String r1 = ", matchedRelationCount="
            r0.append(r1)
            int r1 = r5.f5835
            r0.append(r1)
            java.lang.String r1 = ", hasMore="
            r0.append(r1)
            boolean r1 = r5.f5836
            r0.append(r1)
            java.lang.String r1 = ", nextOffset="
            r0.append(r1)
            java.lang.Integer r1 = r5.f5837
            r0.append(r1)
            java.lang.String r1 = ", petCount="
            r0.append(r1)
            java.lang.String r1 = ", relationCount="
            java.lang.String r2 = ", relationIdentityCount="
            int r3 = r5.f5838
            int r4 = r5.f5839
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", friendUserIdCount="
            java.lang.String r2 = ", explicitSecPetIdCount="
            int r3 = r5.f5840
            int r4 = r5.f5841
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            int r1 = r5.f5842
            r0.append(r1)
            java.lang.String r1 = ", conversationIds="
            r0.append(r1)
            java.util.List r5 = r5.f5843
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
