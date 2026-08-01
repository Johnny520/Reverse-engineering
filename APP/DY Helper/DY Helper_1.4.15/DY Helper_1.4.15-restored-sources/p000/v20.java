package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class v20 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f11069;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f11070;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f11071;

    /* JADX INFO: renamed from: δ */
    public final p000.p70 f11072;

    /* JADX INFO: renamed from: ε */
    public final p000.a80 f11073;

    /* JADX INFO: renamed from: ζ */
    public final p000.a80 f11074;

    /* JADX INFO: renamed from: η */
    public final p000.p80 f11075;

    public v20(java.lang.String r1, java.lang.String r2, java.lang.String r3, p000.p70 r4, p000.a80 r5, p000.a80 r6, p000.a80 r7) {
            r0 = this;
            r0.<init>()
            r0.f11069 = r1
            r0.f11070 = r2
            r0.f11071 = r3
            r0.f11072 = r4
            r0.f11073 = r5
            r0.f11074 = r6
            p80 r7 = (p000.p80) r7
            r0.f11075 = r7
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L58
        L3:
            boolean r0 = r3 instanceof p000.v20
            if (r0 != 0) goto L8
            goto L56
        L8:
            v20 r3 = (p000.v20) r3
            java.lang.String r0 = r2.f11069
            java.lang.String r1 = r3.f11069
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L56
        L15:
            java.lang.String r0 = r2.f11070
            java.lang.String r1 = r3.f11070
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L56
        L20:
            java.lang.String r0 = r2.f11071
            java.lang.String r1 = r3.f11071
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L56
        L2b:
            p70 r0 = r2.f11072
            p70 r1 = r3.f11072
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L56
        L36:
            a80 r0 = r2.f11073
            a80 r1 = r3.f11073
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            goto L56
        L41:
            a80 r0 = r2.f11074
            a80 r1 = r3.f11074
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4c
            goto L56
        L4c:
            p80 r2 = r2.f11075
            p80 r3 = r3.f11075
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L58
        L56:
            r2 = 0
            return r2
        L58:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f11069
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f11070
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f11071
            int r0 = p000.a12.m15(r0, r1, r2)
            p70 r2 = r3.f11072
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            a80 r0 = r3.f11073
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            a80 r2 = r3.f11074
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            p80 r3 = r3.f11075
            int r3 = r3.hashCode()
            int r3 = r3 + r2
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", label="
            java.lang.String r1 = ", contentDescription="
            java.lang.String r2 = "ButtonSpec(id="
            java.lang.String r3 = r5.f11069
            java.lang.String r4 = r5.f11070
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f11071
            r0.append(r1)
            java.lang.String r1 = ", enabled="
            r0.append(r1)
            p70 r1 = r5.f11072
            r0.append(r1)
            java.lang.String r1 = ", iconProvider="
            r0.append(r1)
            a80 r1 = r5.f11073
            r0.append(r1)
            java.lang.String r1 = ", tintProvider="
            r0.append(r1)
            a80 r1 = r5.f11074
            r0.append(r1)
            java.lang.String r1 = ", onClick="
            r0.append(r1)
            p80 r5 = r5.f11075
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
