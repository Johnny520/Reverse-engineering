package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class s71 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f9753;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f9754;

    /* JADX INFO: renamed from: γ */
    public final int f9755;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f9756;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f9757;

    /* JADX INFO: renamed from: ζ */
    public final boolean f9758;

    /* JADX INFO: renamed from: η */
    public final p000.s61 f9759;

    public s71(java.lang.String r1, java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5, boolean r6, p000.s61 r7) {
            r0 = this;
            r4.getClass()
            r5.getClass()
            r0.<init>()
            r0.f9753 = r1
            r0.f9754 = r2
            r0.f9755 = r3
            r0.f9756 = r4
            r0.f9757 = r5
            r0.f9758 = r6
            r0.f9759 = r7
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L50
        L3:
            boolean r0 = r3 instanceof p000.s71
            if (r0 != 0) goto L8
            goto L4e
        L8:
            s71 r3 = (p000.s71) r3
            java.lang.String r0 = r2.f9753
            java.lang.String r1 = r3.f9753
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L4e
        L15:
            java.lang.String r0 = r2.f9754
            java.lang.String r1 = r3.f9754
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L4e
        L20:
            int r0 = r2.f9755
            int r1 = r3.f9755
            if (r0 == r1) goto L27
            goto L4e
        L27:
            java.lang.String r0 = r2.f9756
            java.lang.String r1 = r3.f9756
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L32
            goto L4e
        L32:
            java.lang.String r0 = r2.f9757
            java.lang.String r1 = r3.f9757
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L3d
            goto L4e
        L3d:
            boolean r0 = r2.f9758
            boolean r1 = r3.f9758
            if (r0 == r1) goto L44
            goto L4e
        L44:
            s61 r2 = r2.f9759
            s61 r3 = r3.f9759
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L50
        L4e:
            r2 = 0
            return r2
        L50:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f9753
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f9754
            int r0 = p000.a12.m15(r0, r1, r2)
            int r2 = r3.f9755
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r2 = r3.f9756
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f9757
            int r0 = p000.a12.m15(r0, r1, r2)
            boolean r2 = r3.f9758
            int r0 = p000.lz1.m3678(r0, r1, r2)
            s61 r3 = r3.f9759
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", label="
            java.lang.String r1 = ", iconRes="
            java.lang.String r2 = "OperationQuickAction(id="
            java.lang.String r3 = r5.f9753
            java.lang.String r4 = r5.f9754
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", iconBg="
            java.lang.String r2 = ", iconTint="
            int r3 = r5.f9755
            java.lang.String r4 = r5.f9756
            p000.lz1.m3671(r0, r3, r1, r4, r2)
            java.lang.String r1 = r5.f9757
            r0.append(r1)
            java.lang.String r1 = ", locked="
            r0.append(r1)
            boolean r1 = r5.f9758
            r0.append(r1)
            java.lang.String r1 = ", onClick="
            r0.append(r1)
            s61 r5 = r5.f9759
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
