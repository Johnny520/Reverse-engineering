package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class lj0 {

    /* JADX INFO: renamed from: α */
    public final java.util.List f6686;

    /* JADX INFO: renamed from: β */
    public final java.lang.Object f6687;

    /* JADX INFO: renamed from: γ */
    public final boolean f6688;

    /* JADX INFO: renamed from: δ */
    public final boolean f6689;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f6690;

    public lj0(java.util.List r1, java.util.Set r2, boolean r3, boolean r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.f6686 = r1
            r0.f6687 = r2
            r0.f6688 = r3
            r0.f6689 = r4
            r0.f6690 = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3a
        L3:
            boolean r0 = r3 instanceof p000.lj0
            if (r0 != 0) goto L8
            goto L38
        L8:
            lj0 r3 = (p000.lj0) r3
            java.util.List r0 = r2.f6686
            java.util.List r1 = r3.f6686
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L38
        L15:
            java.lang.Object r0 = r2.f6687
            java.lang.Object r1 = r3.f6687
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L38
        L20:
            boolean r0 = r2.f6688
            boolean r1 = r3.f6688
            if (r0 == r1) goto L27
            goto L38
        L27:
            boolean r0 = r2.f6689
            boolean r1 = r3.f6689
            if (r0 == r1) goto L2e
            goto L38
        L2e:
            java.lang.String r2 = r2.f6690
            java.lang.String r3 = r3.f6690
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3a
        L38:
            r2 = 0
            return r2
        L3a:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.util.List r0 = r3.f6686
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.Object r2 = r3.f6687
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.f6688
            int r0 = p000.lz1.m3678(r2, r1, r0)
            boolean r2 = r3.f6689
            int r0 = p000.lz1.m3678(r0, r1, r2)
            java.lang.String r3 = r3.f6690
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LoadResult(entries="
            r0.<init>(r1)
            java.util.List r1 = r5.f6686
            r0.append(r1)
            java.lang.String r1 = ", strangerConversationIds="
            r0.append(r1)
            java.lang.Object r1 = r5.f6687
            r0.append(r1)
            java.lang.String r1 = ", regularSettled="
            r0.append(r1)
            java.lang.String r1 = ", strangerComplete="
            java.lang.String r2 = ", warningMessage="
            boolean r3 = r5.f6688
            boolean r4 = r5.f6689
            p000.AbstractC0602nx.m4120(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            java.lang.String r5 = r5.f6690
            java.lang.String r5 = p000.lz1.m3691(r0, r5, r1)
            return r5
    }
}
