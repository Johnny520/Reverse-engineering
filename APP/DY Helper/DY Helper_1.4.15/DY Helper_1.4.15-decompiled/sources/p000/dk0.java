package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class dk0 {

    /* JADX INFO: renamed from: α */
    public final boolean f3195;

    /* JADX INFO: renamed from: β */
    public final boolean f3196;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f3197;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f3198;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f3199;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f3200;

    public dk0(boolean r1, boolean r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r0.f3195 = r1
            r0.f3196 = r2
            r0.f3197 = r3
            r0.f3198 = r4
            r0.f3199 = r5
            r0.f3200 = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L45
        L3:
            boolean r0 = r3 instanceof p000.dk0
            if (r0 != 0) goto L8
            goto L43
        L8:
            dk0 r3 = (p000.dk0) r3
            boolean r0 = r2.f3195
            boolean r1 = r3.f3195
            if (r0 == r1) goto L11
            goto L43
        L11:
            boolean r0 = r2.f3196
            boolean r1 = r3.f3196
            if (r0 == r1) goto L18
            goto L43
        L18:
            java.lang.String r0 = r2.f3197
            java.lang.String r1 = r3.f3197
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L23
            goto L43
        L23:
            java.lang.String r0 = r2.f3198
            java.lang.String r1 = r3.f3198
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2e
            goto L43
        L2e:
            java.lang.String r0 = r2.f3199
            java.lang.String r1 = r3.f3199
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L39
            goto L43
        L39:
            java.lang.String r2 = r2.f3200
            java.lang.String r3 = r3.f3200
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L45
        L43:
            r2 = 0
            return r2
        L45:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f3195
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.f3196
            int r0 = p000.lz1.m3678(r0, r1, r2)
            java.lang.String r2 = r3.f3197
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f3198
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f3199
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r3 = r3.f3200
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "IMTimeLabelConfig(timeEnabled="
            r0.<init>(r1)
            boolean r1 = r5.f3195
            r0.append(r1)
            java.lang.String r1 = ", recallEnabled="
            r0.append(r1)
            boolean r1 = r5.f3196
            r0.append(r1)
            java.lang.String r1 = ", timePattern="
            r0.append(r1)
            java.lang.String r1 = ", textTemplate="
            java.lang.String r2 = ", lightColor="
            java.lang.String r3 = r5.f3197
            java.lang.String r4 = r5.f3198
            p000.AbstractC0602nx.m4119(r0, r3, r1, r4, r2)
            java.lang.String r1 = r5.f3199
            r0.append(r1)
            java.lang.String r1 = ", darkColor="
            r0.append(r1)
            java.lang.String r5 = r5.f3200
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
