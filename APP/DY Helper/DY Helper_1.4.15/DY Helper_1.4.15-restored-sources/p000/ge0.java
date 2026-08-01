package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ge0 {

    /* JADX INFO: renamed from: α */
    public final java.util.ArrayList f4336;

    /* JADX INFO: renamed from: β */
    public final java.lang.Class f4337;

    /* JADX INFO: renamed from: γ */
    public final java.util.ArrayList f4338;

    /* JADX INFO: renamed from: δ */
    public final java.util.ArrayList f4339;

    /* JADX INFO: renamed from: ε */
    public final java.util.ArrayList f4340;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Class f4341;

    /* JADX INFO: renamed from: η */
    public final java.util.ArrayList f4342;

    /* JADX INFO: renamed from: θ */
    public final java.util.ArrayList f4343;

    /* JADX INFO: renamed from: ι */
    public final java.util.List f4344;

    public ge0(java.util.ArrayList r1, java.lang.Class r2, java.util.ArrayList r3, java.util.ArrayList r4, java.util.ArrayList r5, java.lang.Class r6, java.util.ArrayList r7, java.util.ArrayList r8, java.util.List r9) {
            r0 = this;
            r0.<init>()
            r0.f4336 = r1
            r0.f4337 = r2
            r0.f4338 = r3
            r0.f4339 = r4
            r0.f4340 = r5
            r0.f4341 = r6
            r0.f4342 = r7
            r0.f4343 = r8
            r0.f4344 = r9
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L70
        L4:
            boolean r0 = r3 instanceof p000.ge0
            if (r0 != 0) goto La
            goto L6e
        La:
            ge0 r3 = (p000.ge0) r3
            java.util.ArrayList r0 = r2.f4336
            java.util.ArrayList r1 = r3.f4336
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            goto L6e
        L17:
            java.lang.Class r0 = r2.f4337
            java.lang.Class r1 = r3.f4337
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L22
            goto L6e
        L22:
            java.util.ArrayList r0 = r2.f4338
            java.util.ArrayList r1 = r3.f4338
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2d
            goto L6e
        L2d:
            java.util.ArrayList r0 = r2.f4339
            java.util.ArrayList r1 = r3.f4339
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L38
            goto L6e
        L38:
            java.util.ArrayList r0 = r2.f4340
            java.util.ArrayList r1 = r3.f4340
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L43
            goto L6e
        L43:
            java.lang.Class r0 = r2.f4341
            java.lang.Class r1 = r3.f4341
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4e
            goto L6e
        L4e:
            java.util.ArrayList r0 = r2.f4342
            java.util.ArrayList r1 = r3.f4342
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L59
            goto L6e
        L59:
            java.util.ArrayList r0 = r2.f4343
            java.util.ArrayList r1 = r3.f4343
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L64
            goto L6e
        L64:
            java.util.List r2 = r2.f4344
            java.util.List r3 = r3.f4344
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L70
        L6e:
            r2 = 0
            return r2
        L70:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.util.ArrayList r0 = r2.f4336
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Class r1 = r2.f4337
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.ArrayList r0 = r2.f4338
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.ArrayList r1 = r2.f4339
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.ArrayList r0 = r2.f4340
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Class r1 = r2.f4341
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.ArrayList r0 = r2.f4342
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.ArrayList r1 = r2.f4343
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List r2 = r2.f4344
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ShareTargets(searchFilterMethods="
            r0.<init>(r1)
            java.util.ArrayList r1 = r2.f4336
            r0.append(r1)
            java.lang.String r1 = ", contactSelectViewModelClass="
            r0.append(r1)
            java.lang.Class r1 = r2.f4337
            r0.append(r1)
            java.lang.String r1 = ", contactSelectMethods="
            r0.append(r1)
            java.util.ArrayList r1 = r2.f4338
            r0.append(r1)
            java.lang.String r1 = ", contactSelectInheritedMethods="
            r0.append(r1)
            java.util.ArrayList r1 = r2.f4339
            r0.append(r1)
            java.lang.String r1 = ", contactSelectFragmentMethods="
            r0.append(r1)
            java.util.ArrayList r1 = r2.f4340
            r0.append(r1)
            java.lang.String r1 = ", contactSelectStateClass="
            r0.append(r1)
            java.lang.Class r1 = r2.f4341
            r0.append(r1)
            java.lang.String r1 = ", contactSelectStateMethods="
            r0.append(r1)
            java.util.ArrayList r1 = r2.f4342
            r0.append(r1)
            java.lang.String r1 = ", sideSlipListTargets="
            r0.append(r1)
            java.util.ArrayList r1 = r2.f4343
            r0.append(r1)
            java.lang.String r1 = ", pickerListTargets="
            r0.append(r1)
            java.util.List r2 = r2.f4344
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
