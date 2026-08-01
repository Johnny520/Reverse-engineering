package p000;

/* JADX INFO: renamed from: ls */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0523ls {

    /* JADX INFO: renamed from: α */
    public final int f6758;

    /* JADX INFO: renamed from: β */
    public final int f6759;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f6760;

    /* JADX INFO: renamed from: δ */
    public final boolean f6761;

    /* JADX INFO: renamed from: ε */
    public final boolean f6762;

    /* JADX INFO: renamed from: ζ */
    public final java.util.ArrayList f6763;

    public C0523ls(int r1, int r2, java.lang.String r3, boolean r4, boolean r5, java.util.ArrayList r6) {
            r0 = this;
            r0.<init>()
            r0.f6758 = r1
            r0.f6759 = r2
            r0.f6760 = r3
            r0.f6761 = r4
            r0.f6762 = r5
            r0.f6763 = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3d
        L3:
            boolean r0 = r3 instanceof p000.C0523ls
            if (r0 != 0) goto L8
            goto L3b
        L8:
            ls r3 = (p000.C0523ls) r3
            int r0 = r2.f6758
            int r1 = r3.f6758
            if (r0 == r1) goto L11
            goto L3b
        L11:
            int r0 = r2.f6759
            int r1 = r3.f6759
            if (r0 == r1) goto L18
            goto L3b
        L18:
            java.lang.String r0 = r2.f6760
            java.lang.String r1 = r3.f6760
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L23
            goto L3b
        L23:
            boolean r0 = r2.f6761
            boolean r1 = r3.f6761
            if (r0 == r1) goto L2a
            goto L3b
        L2a:
            boolean r0 = r2.f6762
            boolean r1 = r3.f6762
            if (r0 == r1) goto L31
            goto L3b
        L31:
            java.util.ArrayList r2 = r2.f6763
            java.util.ArrayList r3 = r3.f6763
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3d
        L3b:
            r2 = 0
            return r2
        L3d:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f6758
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f6759
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r2 = r3.f6760
            if (r2 != 0) goto L15
            r2 = 0
            goto L19
        L15:
            int r2 = r2.hashCode()
        L19:
            int r0 = r0 + r2
            int r0 = r0 * r1
            boolean r2 = r3.f6761
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r2 = r3.f6762
            int r0 = p000.lz1.m3678(r0, r1, r2)
            java.util.ArrayList r3 = r3.f6763
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", finished="
            java.lang.String r1 = ", currentText="
            java.lang.String r2 = "ProgressSnapshot(total="
            int r3 = r5.f6758
            int r4 = r5.f6759
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f6760
            r0.append(r1)
            java.lang.String r1 = ", allFinished="
            r0.append(r1)
            boolean r1 = r5.f6761
            r0.append(r1)
            java.lang.String r1 = ", hasFailed="
            r0.append(r1)
            boolean r1 = r5.f6762
            r0.append(r1)
            java.lang.String r1 = ", failedTexts="
            r0.append(r1)
            java.util.ArrayList r5 = r5.f6763
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
