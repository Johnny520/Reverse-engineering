package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class h71 {

    /* JADX INFO: renamed from: α */
    public final p000.i71 f4609;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f4610;

    /* JADX INFO: renamed from: γ */
    public final int f4611;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f4612;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f4613;

    /* JADX INFO: renamed from: ζ */
    public final java.util.ArrayList f4614;

    public h71(p000.i71 r1, java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5, java.util.ArrayList r6) {
            r0 = this;
            r4.getClass()
            r5.getClass()
            r0.<init>()
            r0.f4609 = r1
            r0.f4610 = r2
            r0.f4611 = r3
            r0.f4612 = r4
            r0.f4613 = r5
            r0.f4614 = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L45
        L3:
            boolean r0 = r3 instanceof p000.h71
            if (r0 != 0) goto L8
            goto L43
        L8:
            h71 r3 = (p000.h71) r3
            i71 r0 = r2.f4609
            i71 r1 = r3.f4609
            if (r0 == r1) goto L11
            goto L43
        L11:
            java.lang.String r0 = r2.f4610
            java.lang.String r1 = r3.f4610
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L43
        L1c:
            int r0 = r2.f4611
            int r1 = r3.f4611
            if (r0 == r1) goto L23
            goto L43
        L23:
            java.lang.String r0 = r2.f4612
            java.lang.String r1 = r3.f4612
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2e
            goto L43
        L2e:
            java.lang.String r0 = r2.f4613
            java.lang.String r1 = r3.f4613
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L39
            goto L43
        L39:
            java.util.ArrayList r2 = r2.f4614
            java.util.ArrayList r3 = r3.f4614
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
            i71 r0 = r3.f4609
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f4610
            int r0 = p000.a12.m15(r0, r1, r2)
            int r2 = r3.f4611
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r2 = r3.f4612
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f4613
            int r0 = p000.a12.m15(r0, r1, r2)
            java.util.ArrayList r3 = r3.f4614
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ActionCategory(key="
            r0.<init>(r1)
            i71 r1 = r5.f4609
            r0.append(r1)
            java.lang.String r1 = ", title="
            r0.append(r1)
            java.lang.String r1 = r5.f4610
            r0.append(r1)
            java.lang.String r1 = ", iconRes="
            r0.append(r1)
            java.lang.String r1 = ", iconBg="
            java.lang.String r2 = ", iconTint="
            int r3 = r5.f4611
            java.lang.String r4 = r5.f4612
            p000.lz1.m3671(r0, r3, r1, r4, r2)
            java.lang.String r1 = r5.f4613
            r0.append(r1)
            java.lang.String r1 = ", actions="
            r0.append(r1)
            java.util.ArrayList r5 = r5.f4614
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
