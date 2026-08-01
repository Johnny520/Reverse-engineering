package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ou1 {

    /* JADX INFO: renamed from: α */
    public final p000.pu1 f8259;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f8260;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f8261;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f8262;

    /* JADX INFO: renamed from: ε */
    public final p000.a80 f8263;

    /* JADX INFO: renamed from: ζ */
    public final p000.p80 f8264;

    public ou1(p000.pu1 r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, p000.a80 r5, p000.a80 r6) {
            r0 = this;
            r0.<init>()
            r0.f8259 = r1
            r0.f8260 = r2
            r0.f8261 = r3
            r0.f8262 = r4
            r0.f8263 = r5
            p80 r6 = (p000.p80) r6
            r0.f8264 = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L49
        L3:
            boolean r0 = r3 instanceof p000.ou1
            if (r0 != 0) goto L8
            goto L47
        L8:
            ou1 r3 = (p000.ou1) r3
            pu1 r0 = r2.f8259
            pu1 r1 = r3.f8259
            if (r0 == r1) goto L11
            goto L47
        L11:
            java.lang.String r0 = r2.f8260
            java.lang.String r1 = r3.f8260
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L47
        L1c:
            java.lang.String r0 = r2.f8261
            java.lang.String r1 = r3.f8261
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L47
        L27:
            java.lang.String r0 = r2.f8262
            java.lang.String r1 = r3.f8262
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            goto L47
        L32:
            a80 r0 = r2.f8263
            a80 r1 = r3.f8263
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3d
            goto L47
        L3d:
            p80 r2 = r2.f8264
            p80 r3 = r3.f8264
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L49
        L47:
            r2 = 0
            return r2
        L49:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            pu1 r0 = r3.f8259
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f8260
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f8261
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f8262
            int r0 = p000.a12.m15(r0, r1, r2)
            a80 r2 = r3.f8263
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            p80 r3 = r3.f8264
            int r3 = r3.hashCode()
            int r3 = r3 + r2
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SettingsSectionSpec(tab="
            r0.<init>(r1)
            pu1 r1 = r5.f8259
            r0.append(r1)
            java.lang.String r1 = ", id="
            r0.append(r1)
            java.lang.String r1 = r5.f8260
            r0.append(r1)
            java.lang.String r1 = ", title="
            r0.append(r1)
            java.lang.String r1 = ", keywords="
            java.lang.String r2 = ", isActive="
            java.lang.String r3 = r5.f8261
            java.lang.String r4 = r5.f8262
            p000.AbstractC0602nx.m4119(r0, r3, r1, r4, r2)
            a80 r1 = r5.f8263
            r0.append(r1)
            java.lang.String r1 = ", builder="
            r0.append(r1)
            p80 r5 = r5.f8264
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
