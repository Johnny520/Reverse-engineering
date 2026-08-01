package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class m22 {

    /* JADX INFO: renamed from: α */
    public java.lang.String f6911;

    /* JADX INFO: renamed from: β */
    public java.lang.Integer f6912;

    /* JADX INFO: renamed from: γ */
    public java.lang.Boolean f6913;

    /* JADX INFO: renamed from: δ */
    public java.lang.Boolean f6914;

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.m22
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            m22 r5 = (p000.m22) r5
            java.lang.String r1 = r4.f6911
            java.lang.String r3 = r5.f6911
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.Integer r1 = r4.f6912
            java.lang.Integer r3 = r5.f6912
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.Boolean r1 = r4.f6913
            java.lang.Boolean r3 = r5.f6913
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.Boolean r4 = r4.f6914
            java.lang.Boolean r5 = r5.f6914
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L38
            return r2
        L38:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f6911
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Integer r1 = r3.f6912
            r2 = 0
            if (r1 != 0) goto Lf
            r1 = r2
            goto L13
        Lf:
            int r1 = r1.hashCode()
        L13:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Boolean r1 = r3.f6913
            if (r1 != 0) goto L1c
            r1 = r2
            goto L20
        L1c:
            int r1 = r1.hashCode()
        L20:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Boolean r3 = r3.f6914
            if (r3 != 0) goto L28
            goto L2c
        L28:
            int r2 = r3.hashCode()
        L2c:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = r5.f6911
            java.lang.Integer r1 = r5.f6912
            java.lang.Boolean r2 = r5.f6913
            java.lang.Boolean r5 = r5.f6914
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "BottomTabViewState(tabId="
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ", originalVisibility="
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = ", originalEnabled="
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = ", originalClickable="
            r3.append(r0)
            r3.append(r5)
            java.lang.String r5 = ")"
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            return r5
    }
}
