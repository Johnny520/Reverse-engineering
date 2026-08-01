package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class lu1 {

    /* JADX INFO: renamed from: α */
    public final p000.th0 f6799;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f6800;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f6801;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f6802;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f6803;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f6804;

    public lu1(p000.th0 r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.f6799 = r1
            r0.f6800 = r2
            r0.f6801 = r3
            r0.f6802 = r4
            r0.f6803 = r5
            r0.f6804 = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L4d
        L3:
            boolean r0 = r3 instanceof p000.lu1
            if (r0 != 0) goto L8
            goto L4b
        L8:
            lu1 r3 = (p000.lu1) r3
            th0 r0 = r2.f6799
            th0 r1 = r3.f6799
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L4b
        L15:
            java.lang.String r0 = r2.f6800
            java.lang.String r1 = r3.f6800
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L4b
        L20:
            java.lang.String r0 = r2.f6801
            java.lang.String r1 = r3.f6801
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2b
            goto L4b
        L2b:
            java.lang.String r0 = r2.f6802
            java.lang.String r1 = r3.f6802
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L36
            goto L4b
        L36:
            java.lang.String r0 = r2.f6803
            java.lang.String r1 = r3.f6803
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            goto L4b
        L41:
            java.lang.String r2 = r2.f6804
            java.lang.String r3 = r3.f6804
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4d
        L4b:
            r2 = 0
            return r2
        L4d:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            th0 r0 = r3.f6799
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f6800
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f6801
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f6802
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f6803
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r3 = r3.f6804
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "IMRuleDialogItem(entry="
            r0.<init>(r1)
            th0 r1 = r5.f6799
            r0.append(r1)
            java.lang.String r1 = ", token="
            r0.append(r1)
            java.lang.String r1 = r5.f6800
            r0.append(r1)
            java.lang.String r1 = ", displayTitle="
            r0.append(r1)
            java.lang.String r1 = ", subtitle="
            java.lang.String r2 = ", searchLower="
            java.lang.String r3 = r5.f6801
            java.lang.String r4 = r5.f6802
            p000.AbstractC0602nx.m4119(r0, r3, r1, r4, r2)
            java.lang.String r1 = r5.f6803
            r0.append(r1)
            java.lang.String r1 = ", ruleLine="
            r0.append(r1)
            java.lang.String r5 = r5.f6804
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
