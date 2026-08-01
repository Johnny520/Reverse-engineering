package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ih0 {

    /* JADX INFO: renamed from: α */
    public final boolean f5084;

    /* JADX INFO: renamed from: β */
    public final java.lang.Long f5085;

    /* JADX INFO: renamed from: γ */
    public final java.lang.Long f5086;

    /* JADX INFO: renamed from: δ */
    public final p000.hh0 f5087;

    /* JADX INFO: renamed from: ε */
    public final long f5088;

    /* JADX INFO: renamed from: ζ */
    public final int f5089;

    public ih0(boolean r3, java.lang.Long r4, java.lang.Long r5, p000.hh0 r6, int r7) {
            r2 = this;
            r0 = r7 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r7 = r7 & 4
            if (r7 == 0) goto Lb
            r5 = r1
        Lb:
            r2.<init>()
            r2.f5084 = r3
            r2.f5085 = r4
            r2.f5086 = r5
            r2.f5087 = r6
            r3 = 5000(0x1388, double:2.4703E-320)
            r2.f5088 = r3
            r3 = 100
            r2.f5089 = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L3f
        L3:
            boolean r0 = r5 instanceof p000.ih0
            if (r0 != 0) goto L8
            goto L3d
        L8:
            ih0 r5 = (p000.ih0) r5
            boolean r0 = r4.f5084
            boolean r1 = r5.f5084
            if (r0 == r1) goto L11
            goto L3d
        L11:
            java.lang.Long r0 = r4.f5085
            java.lang.Long r1 = r5.f5085
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L1c
            goto L3d
        L1c:
            java.lang.Long r0 = r4.f5086
            java.lang.Long r1 = r5.f5086
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L27
            goto L3d
        L27:
            hh0 r0 = r4.f5087
            hh0 r1 = r5.f5087
            if (r0 == r1) goto L2e
            goto L3d
        L2e:
            long r0 = r4.f5088
            long r2 = r5.f5088
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L37
            goto L3d
        L37:
            int r4 = r4.f5089
            int r5 = r5.f5089
            if (r4 == r5) goto L3f
        L3d:
            r4 = 0
            return r4
        L3f:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r5 = this;
            boolean r0 = r5.f5084
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            java.lang.Long r3 = r5.f5085
            if (r3 != 0) goto L10
            r3 = r2
            goto L14
        L10:
            int r3 = r3.hashCode()
        L14:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Long r3 = r5.f5086
            if (r3 != 0) goto L1b
            goto L1f
        L1b:
            int r2 = r3.hashCode()
        L1f:
            int r0 = r0 + r2
            int r0 = r0 * r1
            hh0 r2 = r5.f5087
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            long r3 = r5.f5088
            int r0 = p000.lz1.m3677(r2, r1, r3)
            int r5 = r5.f5089
            int r5 = java.lang.Integer.hashCode(r5)
            int r5 = r5 + r0
            return r5
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ExportOptions(fullLoad="
            r0.<init>(r1)
            boolean r1 = r3.f5084
            r0.append(r1)
            java.lang.String r1 = ", startTimeMs="
            r0.append(r1)
            java.lang.Long r1 = r3.f5085
            r0.append(r1)
            java.lang.String r1 = ", endTimeMs="
            r0.append(r1)
            java.lang.Long r1 = r3.f5086
            r0.append(r1)
            java.lang.String r1 = ", format="
            r0.append(r1)
            hh0 r1 = r3.f5087
            r0.append(r1)
            java.lang.String r1 = ", loadWaitMs="
            r0.append(r1)
            long r1 = r3.f5088
            r0.append(r1)
            java.lang.String r1 = ", pageLimit="
            r0.append(r1)
            int r3 = r3.f5089
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
