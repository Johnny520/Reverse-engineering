package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class bc1 {

    /* JADX INFO: renamed from: α */
    public final java.util.ArrayList f1630;

    /* JADX INFO: renamed from: β */
    public final int f1631;

    /* JADX INFO: renamed from: γ */
    public final long f1632;

    /* JADX INFO: renamed from: δ */
    public final java.util.LinkedHashSet f1633;

    /* JADX INFO: renamed from: ε */
    public final java.util.ArrayList f1634;

    /* JADX INFO: renamed from: ζ */
    public final java.util.LinkedHashMap f1635;

    /* JADX INFO: renamed from: η */
    public final int f1636;

    /* JADX INFO: renamed from: θ */
    public final int f1637;

    /* JADX INFO: renamed from: ι */
    public final int f1638;

    /* JADX INFO: renamed from: κ */
    public final java.lang.Integer f1639;

    public bc1(java.util.ArrayList r1, int r2, long r3, java.util.LinkedHashSet r5, java.util.ArrayList r6, java.util.LinkedHashMap r7, int r8, int r9, int r10, java.lang.Integer r11) {
            r0 = this;
            r0.<init>()
            r0.f1630 = r1
            r0.f1631 = r2
            r0.f1632 = r3
            r0.f1633 = r5
            r0.f1634 = r6
            r0.f1635 = r7
            r0.f1636 = r8
            r0.f1637 = r9
            r0.f1638 = r10
            r0.f1639 = r11
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            goto L68
        L4:
            boolean r0 = r5 instanceof p000.bc1
            if (r0 != 0) goto L9
            goto L66
        L9:
            bc1 r5 = (p000.bc1) r5
            java.util.ArrayList r0 = r4.f1630
            java.util.ArrayList r1 = r5.f1630
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L16
            goto L66
        L16:
            int r0 = r4.f1631
            int r1 = r5.f1631
            if (r0 == r1) goto L1d
            goto L66
        L1d:
            long r0 = r4.f1632
            long r2 = r5.f1632
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L26
            goto L66
        L26:
            java.util.LinkedHashSet r0 = r4.f1633
            java.util.LinkedHashSet r1 = r5.f1633
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L31
            goto L66
        L31:
            java.util.ArrayList r0 = r4.f1634
            java.util.ArrayList r1 = r5.f1634
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3c
            goto L66
        L3c:
            java.util.LinkedHashMap r0 = r4.f1635
            java.util.LinkedHashMap r1 = r5.f1635
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L47
            goto L66
        L47:
            int r0 = r4.f1636
            int r1 = r5.f1636
            if (r0 == r1) goto L4e
            goto L66
        L4e:
            int r0 = r4.f1637
            int r1 = r5.f1637
            if (r0 == r1) goto L55
            goto L66
        L55:
            int r0 = r4.f1638
            int r1 = r5.f1638
            if (r0 == r1) goto L5c
            goto L66
        L5c:
            java.lang.Integer r4 = r4.f1639
            java.lang.Integer r5 = r5.f1639
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L68
        L66:
            r4 = 0
            return r4
        L68:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            java.util.ArrayList r0 = r4.f1630
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r4.f1631
            int r0 = p000.a12.m14(r2, r0, r1)
            long r2 = r4.f1632
            int r0 = p000.lz1.m3677(r0, r1, r2)
            java.util.LinkedHashSet r2 = r4.f1633
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.ArrayList r0 = r4.f1634
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.util.LinkedHashMap r2 = r4.f1635
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r0 = r4.f1636
            int r0 = p000.a12.m14(r0, r2, r1)
            int r2 = r4.f1637
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r4.f1638
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.Integer r4 = r4.f1639
            if (r4 != 0) goto L45
            r4 = 0
            goto L49
        L45:
            int r4 = r4.hashCode()
        L49:
            int r0 = r0 + r4
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ActionPlan(targets="
            r0.<init>(r1)
            java.util.ArrayList r1 = r3.f1630
            r0.append(r1)
            java.lang.String r1 = ", operationCount="
            r0.append(r1)
            int r1 = r3.f1631
            r0.append(r1)
            java.lang.String r1 = ", estimatedCost="
            r0.append(r1)
            long r1 = r3.f1632
            r0.append(r1)
            java.lang.String r1 = ", seedNames="
            r0.append(r1)
            java.util.LinkedHashSet r1 = r3.f1633
            r0.append(r1)
            java.lang.String r1 = ", plantPlans="
            r0.append(r1)
            java.util.ArrayList r1 = r3.f1634
            r0.append(r1)
            java.lang.String r1 = ", operationCounts="
            r0.append(r1)
            java.util.LinkedHashMap r1 = r3.f1635
            r0.append(r1)
            java.lang.String r1 = ", disabledPeople="
            r0.append(r1)
            int r1 = r3.f1636
            r0.append(r1)
            java.lang.String r1 = ", unavailablePeople="
            r0.append(r1)
            int r1 = r3.f1637
            r0.append(r1)
            java.lang.String r1 = ", noCandidatePeople="
            r0.append(r1)
            int r1 = r3.f1638
            r0.append(r1)
            java.lang.String r1 = ", remainingQuota="
            r0.append(r1)
            java.lang.Integer r3 = r3.f1639
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
