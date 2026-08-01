package p000;

/* JADX INFO: renamed from: pt */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0699pt {

    /* JADX INFO: renamed from: α */
    public final long f8693;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f8694;

    /* JADX INFO: renamed from: γ */
    public final java.lang.Integer f8695;

    /* JADX INFO: renamed from: δ */
    public final java.lang.Integer f8696;

    public C0699pt(long r1, java.lang.String r3, java.lang.Integer r4, java.lang.Integer r5) {
            r0 = this;
            r0.<init>()
            r0.f8693 = r1
            r0.f8694 = r3
            r0.f8695 = r4
            r0.f8696 = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L35
        L3:
            boolean r0 = r5 instanceof p000.C0699pt
            if (r0 != 0) goto L8
            goto L33
        L8:
            pt r5 = (p000.C0699pt) r5
            long r0 = r4.f8693
            long r2 = r5.f8693
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L33
        L13:
            java.lang.String r0 = r4.f8694
            java.lang.String r1 = r5.f8694
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            goto L33
        L1e:
            java.lang.Integer r0 = r4.f8695
            java.lang.Integer r1 = r5.f8695
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L29
            goto L33
        L29:
            java.lang.Integer r4 = r4.f8696
            java.lang.Integer r5 = r5.f8696
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L35
        L33:
            r4 = 0
            return r4
        L35:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.f8693
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f8694
            int r0 = p000.a12.m15(r0, r1, r2)
            r2 = 0
            java.lang.Integer r3 = r4.f8695
            if (r3 != 0) goto L16
            r3 = r2
            goto L1a
        L16:
            int r3 = r3.hashCode()
        L1a:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Integer r4 = r4.f8696
            if (r4 != 0) goto L21
            goto L25
        L21:
            int r2 = r4.hashCode()
        L25:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "IMUserSnapshot(uid="
            r0.<init>(r1)
            long r1 = r3.f8693
            r0.append(r1)
            java.lang.String r1 = ", displayName="
            r0.append(r1)
            java.lang.String r1 = r3.f8694
            r0.append(r1)
            java.lang.String r1 = ", followStatus="
            r0.append(r1)
            java.lang.Integer r1 = r3.f8695
            r0.append(r1)
            java.lang.String r1 = ", followerStatus="
            r0.append(r1)
            java.lang.Integer r3 = r3.f8696
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
