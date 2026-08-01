package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class f20 {

    /* JADX INFO: renamed from: α */
    public final long f3721;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f3722;

    /* JADX INFO: renamed from: γ */
    public final p000.e20 f3723;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f3724;

    /* JADX INFO: renamed from: ε */
    public final int f3725;

    public f20(long r1, java.lang.String r3, p000.e20 r4, java.lang.String r5, int r6) {
            r0 = this;
            r5.getClass()
            r0.<init>()
            r0.f3721 = r1
            r0.f3722 = r3
            r0.f3723 = r4
            r0.f3724 = r5
            r0.f3725 = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L38
        L3:
            boolean r0 = r5 instanceof p000.f20
            if (r0 != 0) goto L8
            goto L36
        L8:
            f20 r5 = (p000.f20) r5
            long r0 = r4.f3721
            long r2 = r5.f3721
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L36
        L13:
            java.lang.String r0 = r4.f3722
            java.lang.String r1 = r5.f3722
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            goto L36
        L1e:
            e20 r0 = r4.f3723
            e20 r1 = r5.f3723
            if (r0 == r1) goto L25
            goto L36
        L25:
            java.lang.String r0 = r4.f3724
            java.lang.String r1 = r5.f3724
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L30
            goto L36
        L30:
            int r4 = r4.f3725
            int r5 = r5.f3725
            if (r4 == r5) goto L38
        L36:
            r4 = 0
            return r4
        L38:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.f3721
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3722
            int r0 = p000.a12.m15(r0, r1, r2)
            e20 r2 = r3.f3723
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.String r0 = r3.f3724
            int r0 = p000.a12.m15(r2, r1, r0)
            int r3 = r3.f3725
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "InjectState(generation="
            r0.<init>(r1)
            long r1 = r3.f3721
            r0.append(r1)
            java.lang.String r1 = ", awemeId="
            r0.append(r1)
            java.lang.String r1 = r3.f3722
            r0.append(r1)
            java.lang.String r1 = ", mode="
            r0.append(r1)
            e20 r1 = r3.f3723
            r0.append(r1)
            java.lang.String r1 = ", text="
            r0.append(r1)
            java.lang.String r1 = r3.f3724
            r0.append(r1)
            java.lang.String r1 = ", styleKey="
            r0.append(r1)
            int r3 = r3.f3725
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
