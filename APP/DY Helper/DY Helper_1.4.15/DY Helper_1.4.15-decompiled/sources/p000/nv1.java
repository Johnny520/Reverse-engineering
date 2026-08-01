package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class nv1 {

    /* JADX INFO: renamed from: α */
    public final int f7767;

    /* JADX INFO: renamed from: β */
    public final int f7768;

    /* JADX INFO: renamed from: γ */
    public final int f7769;

    /* JADX INFO: renamed from: δ */
    public final int f7770;

    /* JADX INFO: renamed from: ε */
    public final int f7771;

    /* JADX INFO: renamed from: ζ */
    public final int f7772;

    /* JADX INFO: renamed from: η */
    public final int f7773;

    /* JADX INFO: renamed from: θ */
    public final int f7774;

    /* JADX INFO: renamed from: ι */
    public final int f7775;

    /* JADX INFO: renamed from: κ */
    public final int f7776;

    public nv1(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10) {
            r0 = this;
            r0.<init>()
            r0.f7767 = r1
            r0.f7768 = r2
            r0.f7769 = r3
            r0.f7770 = r4
            r0.f7771 = r5
            r0.f7772 = r6
            r0.f7773 = r7
            r0.f7774 = r8
            r0.f7775 = r9
            r0.f7776 = r10
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p000.nv1
            if (r1 != 0) goto L9
            goto L50
        L9:
            nv1 r4 = (p000.nv1) r4
            int r1 = r3.f7767
            int r2 = r4.f7767
            if (r1 == r2) goto L12
            goto L50
        L12:
            int r1 = r3.f7768
            int r2 = r4.f7768
            if (r1 == r2) goto L19
            goto L50
        L19:
            int r1 = r3.f7769
            int r2 = r4.f7769
            if (r1 == r2) goto L20
            goto L50
        L20:
            int r1 = r3.f7770
            int r2 = r4.f7770
            if (r1 == r2) goto L27
            goto L50
        L27:
            int r1 = r3.f7771
            int r2 = r4.f7771
            if (r1 == r2) goto L2e
            goto L50
        L2e:
            int r1 = r3.f7772
            int r2 = r4.f7772
            if (r1 == r2) goto L35
            goto L50
        L35:
            int r1 = r3.f7773
            int r2 = r4.f7773
            if (r1 == r2) goto L3c
            goto L50
        L3c:
            int r1 = r3.f7774
            int r2 = r4.f7774
            if (r1 == r2) goto L43
            goto L50
        L43:
            int r1 = r3.f7775
            int r2 = r4.f7775
            if (r1 == r2) goto L4a
            goto L50
        L4a:
            int r3 = r3.f7776
            int r4 = r4.f7776
            if (r3 == r4) goto L52
        L50:
            r3 = 0
            return r3
        L52:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f7767
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f7768
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f7769
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f7770
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f7771
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f7772
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f7773
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f7774
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f7775
            int r0 = p000.a12.m14(r2, r0, r1)
            int r3 = r3.f7776
            int r3 = p000.a12.m14(r3, r0, r1)
            r0 = -1
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 + r3
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", cardEnd="
            java.lang.String r1 = ", cardStroke="
            java.lang.String r2 = "Colors(cardStart="
            int r3 = r5.f7767
            int r4 = r5.f7768
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", textPrimary="
            java.lang.String r2 = ", textSecondary="
            int r3 = r5.f7769
            int r4 = r5.f7770
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", textTertiary="
            java.lang.String r2 = ", chipBg="
            int r3 = r5.f7771
            int r4 = r5.f7772
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", chipText="
            java.lang.String r2 = ", actionBg="
            int r3 = r5.f7773
            int r4 = r5.f7774
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            int r1 = r5.f7775
            r0.append(r1)
            java.lang.String r1 = ", actionStroke="
            r0.append(r1)
            int r5 = r5.f7776
            r0.append(r5)
            java.lang.String r5 = ", iconText=-1)"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
