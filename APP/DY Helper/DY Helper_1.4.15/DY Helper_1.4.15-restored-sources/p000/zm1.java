package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class zm1 {

    /* JADX INFO: renamed from: ε */
    public static final p000.zm1 f13170 = null;

    /* JADX INFO: renamed from: α */
    public final java.lang.String f13171;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f13172;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f13173;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f13174;

    static {
            zm1 r0 = new zm1
            r1 = 0
            java.lang.String r2 = "未知地区"
            r0.<init>(r1, r1, r1, r2)
            p000.zm1.f13170 = r0
            return
    }

    public zm1(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.f13171 = r1
            r0.f13172 = r2
            r0.f13173 = r3
            r0.f13174 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof p000.zm1
            if (r0 != 0) goto L8
            goto L35
        L8:
            zm1 r3 = (p000.zm1) r3
            java.lang.String r0 = r2.f13171
            java.lang.String r1 = r3.f13171
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            java.lang.String r0 = r2.f13172
            java.lang.String r1 = r3.f13172
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            java.lang.String r0 = r2.f13173
            java.lang.String r1 = r3.f13173
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            java.lang.String r2 = r2.f13174
            java.lang.String r3 = r3.f13174
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L37
        L35:
            r2 = 0
            return r2
        L37:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            java.lang.String r1 = r3.f13171
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            java.lang.String r2 = r3.f13172
            if (r2 != 0) goto L13
            r2 = r0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.String r2 = r3.f13173
            if (r2 != 0) goto L1f
            goto L23
        L1f:
            int r0 = r2.hashCode()
        L23:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r3 = r3.f13174
            int r3 = r3.hashCode()
            int r3 = r3 + r1
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", city="
            java.lang.String r1 = ", county="
            java.lang.String r2 = "RegionInfo(province="
            java.lang.String r3 = r5.f13171
            java.lang.String r4 = r5.f13172
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f13173
            r0.append(r1)
            java.lang.String r1 = ", fullName="
            r0.append(r1)
            java.lang.String r5 = r5.f13174
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
