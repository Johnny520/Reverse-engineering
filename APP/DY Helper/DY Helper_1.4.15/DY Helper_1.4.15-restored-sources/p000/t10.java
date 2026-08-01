package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class t10 {

    /* JADX INFO: renamed from: α */
    public final boolean f10131;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f10132;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f10133;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f10134;

    public t10(java.lang.String r1, java.lang.String r2, java.lang.String r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f10131 = r4
            r0.f10132 = r1
            r0.f10133 = r2
            r0.f10134 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof p000.t10
            if (r0 != 0) goto L8
            goto L31
        L8:
            t10 r3 = (p000.t10) r3
            boolean r0 = r2.f10131
            boolean r1 = r3.f10131
            if (r0 == r1) goto L11
            goto L31
        L11:
            java.lang.String r0 = r2.f10132
            java.lang.String r1 = r3.f10132
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L31
        L1c:
            java.lang.String r0 = r2.f10133
            java.lang.String r1 = r3.f10133
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L31
        L27:
            java.lang.String r2 = r2.f10134
            java.lang.String r3 = r3.f10134
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
            r3 = this;
            boolean r0 = r3.f10131
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f10132
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f10133
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r3 = r3.f10134
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SelectionEvidence(active="
            r0.<init>(r1)
            boolean r1 = r2.f10131
            r0.append(r1)
            java.lang.String r1 = ", source="
            r0.append(r1)
            java.lang.String r1 = r2.f10132
            r0.append(r1)
            java.lang.String r1 = ", viewClass="
            r0.append(r1)
            java.lang.String r1 = r2.f10133
            r0.append(r1)
            java.lang.String r1 = ", rejectReason="
            r0.append(r1)
            java.lang.String r2 = r2.f10134
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
