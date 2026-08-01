package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class oc1 {

    /* JADX INFO: renamed from: α */
    public final p000.id1 f8028;

    /* JADX INFO: renamed from: β */
    public final p000.EnumC0831td f8029;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f8030;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f8031;

    public oc1(p000.id1 r1, p000.EnumC0831td r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.f8028 = r1
            r0.f8029 = r2
            r0.f8030 = r3
            r0.f8031 = r4
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.oc1 m4218(p000.oc1 r4) {
            td r0 = r4.f8029
            java.lang.String r4 = r4.f8030
            oc1 r1 = new oc1
            r2 = 0
            java.lang.String r3 = "固定种子不在当前会话活动时间"
            r1.<init>(r2, r0, r4, r3)
            return r1
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof p000.oc1
            if (r0 != 0) goto L8
            goto L31
        L8:
            oc1 r3 = (p000.oc1) r3
            id1 r0 = r2.f8028
            id1 r1 = r3.f8028
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            td r0 = r2.f8029
            td r1 = r3.f8029
            if (r0 == r1) goto L1c
            goto L31
        L1c:
            java.lang.String r0 = r2.f8030
            java.lang.String r1 = r3.f8030
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L31
        L27:
            java.lang.String r2 = r2.f8031
            java.lang.String r3 = r3.f8031
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L33
        L31:
            r2 = 0
            return r2
        L33:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            r0 = 0
            id1 r1 = r4.f8028
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            r2 = 31
            int r1 = r1 * r2
            td r3 = r4.f8029
            if (r3 != 0) goto L13
            goto L17
        L13:
            int r0 = r3.hashCode()
        L17:
            int r1 = r1 + r0
            int r1 = r1 * r2
            java.lang.String r0 = r4.f8030
            int r0 = p000.a12.m15(r1, r2, r0)
            java.lang.String r4 = r4.f8031
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PlantSeedResolution(seed="
            r0.<init>(r1)
            id1 r1 = r2.f8028
            r0.append(r1)
            java.lang.String r1 = ", mode="
            r0.append(r1)
            td r1 = r2.f8029
            r0.append(r1)
            java.lang.String r1 = ", source="
            r0.append(r1)
            java.lang.String r1 = r2.f8030
            r0.append(r1)
            java.lang.String r1 = ", reason="
            r0.append(r1)
            java.lang.String r2 = r2.f8031
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
