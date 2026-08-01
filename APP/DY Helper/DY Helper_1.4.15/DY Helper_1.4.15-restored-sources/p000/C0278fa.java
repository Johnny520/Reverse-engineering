package p000;

/* JADX INFO: renamed from: fa */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0278fa {

    /* JADX INFO: renamed from: α */
    public final boolean f3833;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f3834;

    /* JADX INFO: renamed from: γ */
    public final boolean f3835;

    public C0278fa(java.lang.String r1, boolean r2, boolean r3) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f3833 = r2
            r0.f3834 = r1
            r0.f3835 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L24
        L3:
            boolean r0 = r3 instanceof p000.C0278fa
            if (r0 != 0) goto L8
            goto L22
        L8:
            fa r3 = (p000.C0278fa) r3
            boolean r0 = r2.f3833
            boolean r1 = r3.f3833
            if (r0 == r1) goto L11
            goto L22
        L11:
            java.lang.String r0 = r2.f3834
            java.lang.String r1 = r3.f3834
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L1c
            goto L22
        L1c:
            boolean r2 = r2.f3835
            boolean r3 = r3.f3835
            if (r2 == r3) goto L24
        L22:
            r2 = 0
            return r2
        L24:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f3833
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3834
            int r0 = p000.a12.m15(r0, r1, r2)
            boolean r3 = r3.f3835
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BlacklistResult(blocked="
            r0.<init>(r1)
            boolean r1 = r2.f3833
            r0.append(r1)
            java.lang.String r1 = ", reason="
            r0.append(r1)
            java.lang.String r1 = r2.f3834
            r0.append(r1)
            java.lang.String r1 = ", conclusive="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r2 = r2.f3835
            java.lang.String r2 = p000.lz1.m3693(r0, r2, r1)
            return r2
    }
}
