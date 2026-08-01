package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class f00 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f3702;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f3703;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f3704;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f3705;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f3706;

    /* JADX INFO: renamed from: ζ */
    public final boolean f3707;

    public f00(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, boolean r6) {
            r0 = this;
            r0.<init>()
            r0.f3702 = r1
            r0.f3703 = r2
            r0.f3704 = r3
            r0.f3705 = r4
            r0.f3706 = r5
            r0.f3707 = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L49
        L3:
            boolean r0 = r3 instanceof p000.f00
            if (r0 != 0) goto L8
            goto L47
        L8:
            f00 r3 = (p000.f00) r3
            java.lang.String r0 = r2.f3702
            java.lang.String r1 = r3.f3702
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L47
        L15:
            java.lang.String r0 = r2.f3703
            java.lang.String r1 = r3.f3703
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L47
        L20:
            java.lang.String r0 = r2.f3704
            java.lang.String r1 = r3.f3704
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2b
            goto L47
        L2b:
            java.lang.String r0 = r2.f3705
            java.lang.String r1 = r3.f3705
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L36
            goto L47
        L36:
            java.lang.String r0 = r2.f3706
            java.lang.String r1 = r3.f3706
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L41
            goto L47
        L41:
            boolean r2 = r2.f3707
            boolean r3 = r3.f3707
            if (r2 == r3) goto L49
        L47:
            r2 = 0
            return r2
        L49:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            r0 = 0
            java.lang.String r1 = r4.f3702
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            r2 = 31
            int r1 = r1 * r2
            java.lang.String r3 = r4.f3703
            if (r3 != 0) goto L14
            r3 = r0
            goto L18
        L14:
            int r3 = r3.hashCode()
        L18:
            int r1 = r1 + r3
            int r1 = r1 * r2
            java.lang.String r3 = r4.f3704
            if (r3 != 0) goto L20
            r3 = r0
            goto L24
        L20:
            int r3 = r3.hashCode()
        L24:
            int r1 = r1 + r3
            int r1 = r1 * r2
            java.lang.String r3 = r4.f3705
            if (r3 != 0) goto L2c
            r3 = r0
            goto L30
        L2c:
            int r3 = r3.hashCode()
        L30:
            int r1 = r1 + r3
            int r1 = r1 * r2
            java.lang.String r3 = r4.f3706
            if (r3 != 0) goto L37
            goto L3b
        L37:
            int r0 = r3.hashCode()
        L3b:
            int r1 = r1 + r0
            int r1 = r1 * r2
            boolean r4 = r4.f3707
            int r4 = p000.lz1.m3678(r1, r2, r4)
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", awemeCity="
            java.lang.String r1 = ", awemeRegion="
            java.lang.String r2 = "ExtraLocationData(awemeIpAttribution="
            java.lang.String r3 = r5.f3702
            java.lang.String r4 = r5.f3703
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", segmentLatitudes="
            java.lang.String r2 = ", segmentLongitudes="
            java.lang.String r3 = r5.f3704
            java.lang.String r4 = r5.f3705
            p000.AbstractC0602nx.m4119(r0, r3, r1, r4, r2)
            java.lang.String r1 = r5.f3706
            r0.append(r1)
            java.lang.String r1 = ", hasPoiStruct="
            r0.append(r1)
            boolean r5 = r5.f3707
            r0.append(r5)
            java.lang.String r5 = ", rawDebug=null)"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* JADX INFO: renamed from: α */
    public final java.lang.String m1980() {
            r0 = this;
            java.lang.String r0 = r0.f3703
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final java.lang.String m1981() {
            r0 = this;
            java.lang.String r0 = r0.f3702
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final java.lang.String m1982() {
            r0 = this;
            java.lang.String r0 = r0.f3704
            return r0
    }
}
