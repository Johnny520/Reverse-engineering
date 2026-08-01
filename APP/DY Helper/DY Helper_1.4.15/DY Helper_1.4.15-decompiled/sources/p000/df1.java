package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class df1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f3116;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f3117;

    /* JADX INFO: renamed from: γ */
    public final java.lang.Integer f3118;

    /* JADX INFO: renamed from: δ */
    public final java.lang.Integer f3119;

    /* JADX INFO: renamed from: ε */
    public final java.lang.Integer f3120;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f3121;

    /* JADX INFO: renamed from: η */
    public final java.lang.String f3122;

    public df1(java.lang.String r1, java.lang.String r2, java.lang.Integer r3, java.lang.Integer r4, java.lang.Integer r5, java.lang.String r6, java.lang.String r7) {
            r0 = this;
            r0.<init>()
            r0.f3116 = r1
            r0.f3117 = r2
            r0.f3118 = r3
            r0.f3119 = r4
            r0.f3120 = r5
            r0.f3121 = r6
            r0.f3122 = r7
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L58
        L3:
            boolean r0 = r3 instanceof p000.df1
            if (r0 != 0) goto L8
            goto L56
        L8:
            df1 r3 = (p000.df1) r3
            java.lang.String r0 = r2.f3116
            java.lang.String r1 = r3.f3116
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L56
        L15:
            java.lang.String r0 = r2.f3117
            java.lang.String r1 = r3.f3117
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L56
        L20:
            java.lang.Integer r0 = r2.f3118
            java.lang.Integer r1 = r3.f3118
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2b
            goto L56
        L2b:
            java.lang.Integer r0 = r2.f3119
            java.lang.Integer r1 = r3.f3119
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L36
            goto L56
        L36:
            java.lang.Integer r0 = r2.f3120
            java.lang.Integer r1 = r3.f3120
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L41
            goto L56
        L41:
            java.lang.String r0 = r2.f3121
            java.lang.String r1 = r3.f3121
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L4c
            goto L56
        L4c:
            java.lang.String r2 = r2.f3122
            java.lang.String r3 = r3.f3122
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L58
        L56:
            r2 = 0
            return r2
        L58:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f3116
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f3117
            int r0 = p000.a12.m15(r0, r1, r2)
            r2 = 0
            java.lang.Integer r3 = r4.f3118
            if (r3 != 0) goto L16
            r3 = r2
            goto L1a
        L16:
            int r3 = r3.hashCode()
        L1a:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Integer r3 = r4.f3119
            if (r3 != 0) goto L22
            r3 = r2
            goto L26
        L22:
            int r3 = r3.hashCode()
        L26:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Integer r3 = r4.f3120
            if (r3 != 0) goto L2e
            r3 = r2
            goto L32
        L2e:
            int r3 = r3.hashCode()
        L32:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.f3121
            if (r3 != 0) goto L3a
            r3 = r2
            goto L3e
        L3a:
            int r3 = r3.hashCode()
        L3e:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r4 = r4.f3122
            if (r4 != 0) goto L45
            goto L49
        L45:
            int r2 = r4.hashCode()
        L49:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", name="
            java.lang.String r1 = ", lastPrice="
            java.lang.String r2 = "CachedFood(id="
            java.lang.String r3 = r5.f3116
            java.lang.String r4 = r5.f3117
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.Integer r1 = r5.f3118
            r0.append(r1)
            java.lang.String r1 = ", durationSeconds="
            r0.append(r1)
            java.lang.Integer r1 = r5.f3119
            r0.append(r1)
            java.lang.String r1 = ", closeness="
            r0.append(r1)
            java.lang.Integer r1 = r5.f3120
            r0.append(r1)
            java.lang.String r1 = ", iconUrl="
            r0.append(r1)
            java.lang.String r1 = r5.f3121
            r0.append(r1)
            java.lang.String r1 = ", label="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r5 = r5.f3122
            java.lang.String r5 = p000.lz1.m3691(r0, r5, r1)
            return r5
    }
}
