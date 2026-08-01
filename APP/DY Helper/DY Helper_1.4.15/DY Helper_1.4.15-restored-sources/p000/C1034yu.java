package p000;

/* JADX INFO: renamed from: yu */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1034yu {

    /* JADX INFO: renamed from: α */
    public final p000.EnumC1071zu f12791;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f12792;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f12793;

    /* JADX INFO: renamed from: δ */
    public final boolean f12794;

    /* JADX INFO: renamed from: ε */
    public final boolean f12795;

    public C1034yu(p000.EnumC1071zu r1, java.lang.String r2, java.lang.String r3, boolean r4, boolean r5) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.f12791 = r1
            r0.f12792 = r2
            r0.f12793 = r3
            r0.f12794 = r4
            r0.f12795 = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L36
        L3:
            boolean r0 = r3 instanceof p000.C1034yu
            if (r0 != 0) goto L8
            goto L34
        L8:
            yu r3 = (p000.C1034yu) r3
            zu r0 = r2.f12791
            zu r1 = r3.f12791
            if (r0 == r1) goto L11
            goto L34
        L11:
            java.lang.String r0 = r2.f12792
            java.lang.String r1 = r3.f12792
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L1c
            goto L34
        L1c:
            java.lang.String r0 = r2.f12793
            java.lang.String r1 = r3.f12793
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L34
        L27:
            boolean r0 = r2.f12794
            boolean r1 = r3.f12794
            if (r0 == r1) goto L2e
            goto L34
        L2e:
            boolean r2 = r2.f12795
            boolean r3 = r3.f12795
            if (r2 == r3) goto L36
        L34:
            r2 = 0
            return r2
        L36:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            zu r0 = r3.f12791
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f12792
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f12793
            int r0 = p000.a12.m15(r0, r1, r2)
            boolean r2 = r3.f12794
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r3 = r3.f12795
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SaveResult(target="
            r0.<init>(r1)
            zu r1 = r2.f12791
            r0.append(r1)
            java.lang.String r1 = ", template="
            r0.append(r1)
            java.lang.String r1 = r2.f12792
            r0.append(r1)
            java.lang.String r1 = ", dateFormat="
            r0.append(r1)
            java.lang.String r1 = r2.f12793
            r0.append(r1)
            java.lang.String r1 = ", showNotification="
            r0.append(r1)
            boolean r1 = r2.f12794
            r0.append(r1)
            java.lang.String r1 = ", confirmFileName="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r2 = r2.f12795
            java.lang.String r2 = p000.lz1.m3693(r0, r2, r1)
            return r2
    }
}
