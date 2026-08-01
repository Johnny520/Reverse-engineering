package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ze1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f13064;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f13065;

    /* JADX INFO: renamed from: γ */
    public final java.lang.Integer f13066;

    /* JADX INFO: renamed from: δ */
    public final java.lang.Integer f13067;

    /* JADX INFO: renamed from: ε */
    public final java.lang.Integer f13068;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f13069;

    /* JADX INFO: renamed from: η */
    public final java.lang.String f13070;

    /* JADX INFO: renamed from: θ */
    public final java.lang.String f13071;

    public ze1(java.lang.String r1, java.lang.String r2, java.lang.Integer r3, java.lang.Integer r4, java.lang.Integer r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r0 = this;
            r0.<init>()
            r0.f13064 = r1
            r0.f13065 = r2
            r0.f13066 = r3
            r0.f13067 = r4
            r0.f13068 = r5
            r0.f13069 = r6
            r0.f13070 = r7
            r0.f13071 = r8
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L63
        L3:
            boolean r0 = r3 instanceof p000.ze1
            if (r0 != 0) goto L8
            goto L61
        L8:
            ze1 r3 = (p000.ze1) r3
            java.lang.String r0 = r2.f13064
            java.lang.String r1 = r3.f13064
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L61
        L15:
            java.lang.String r0 = r2.f13065
            java.lang.String r1 = r3.f13065
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L61
        L20:
            java.lang.Integer r0 = r2.f13066
            java.lang.Integer r1 = r3.f13066
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2b
            goto L61
        L2b:
            java.lang.Integer r0 = r2.f13067
            java.lang.Integer r1 = r3.f13067
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L36
            goto L61
        L36:
            java.lang.Integer r0 = r2.f13068
            java.lang.Integer r1 = r3.f13068
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L41
            goto L61
        L41:
            java.lang.String r0 = r2.f13069
            java.lang.String r1 = r3.f13069
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L4c
            goto L61
        L4c:
            java.lang.String r0 = r2.f13070
            java.lang.String r1 = r3.f13070
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L57
            goto L61
        L57:
            java.lang.String r2 = r2.f13071
            java.lang.String r3 = r3.f13071
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L63
        L61:
            r2 = 0
            return r2
        L63:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f13064
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f13065
            int r0 = p000.a12.m15(r0, r1, r2)
            r2 = 0
            java.lang.Integer r3 = r4.f13066
            if (r3 != 0) goto L16
            r3 = r2
            goto L1a
        L16:
            int r3 = r3.hashCode()
        L1a:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Integer r3 = r4.f13067
            if (r3 != 0) goto L22
            r3 = r2
            goto L26
        L22:
            int r3 = r3.hashCode()
        L26:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Integer r3 = r4.f13068
            if (r3 != 0) goto L2e
            r3 = r2
            goto L32
        L2e:
            int r3 = r3.hashCode()
        L32:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.f13069
            if (r3 != 0) goto L3a
            r3 = r2
            goto L3e
        L3a:
            int r3 = r3.hashCode()
        L3e:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.f13070
            if (r3 != 0) goto L45
            goto L49
        L45:
            int r2 = r3.hashCode()
        L49:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r4 = r4.f13071
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", name="
            java.lang.String r1 = ", price="
            java.lang.String r2 = "FoodItem(id="
            java.lang.String r3 = r5.f13064
            java.lang.String r4 = r5.f13065
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.Integer r1 = r5.f13066
            r0.append(r1)
            java.lang.String r1 = ", durationSeconds="
            r0.append(r1)
            java.lang.Integer r1 = r5.f13067
            r0.append(r1)
            java.lang.String r1 = ", closeness="
            r0.append(r1)
            java.lang.Integer r1 = r5.f13068
            r0.append(r1)
            java.lang.String r1 = ", iconUrl="
            r0.append(r1)
            java.lang.String r1 = r5.f13069
            r0.append(r1)
            java.lang.String r1 = ", label="
            r0.append(r1)
            java.lang.String r1 = r5.f13070
            r0.append(r1)
            java.lang.String r1 = ", sourcePath="
            r0.append(r1)
            java.lang.String r5 = r5.f13071
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
