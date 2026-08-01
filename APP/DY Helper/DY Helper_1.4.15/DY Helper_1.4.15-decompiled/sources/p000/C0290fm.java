package p000;

/* JADX INFO: renamed from: fm */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0290fm {

    /* JADX INFO: renamed from: α */
    public final int f4012;

    /* JADX INFO: renamed from: β */
    public final float f4013;

    /* JADX INFO: renamed from: γ */
    public final boolean f4014;

    /* JADX INFO: renamed from: δ */
    public final boolean f4015;

    /* JADX INFO: renamed from: ε */
    public final boolean f4016;

    /* JADX INFO: renamed from: ζ */
    public final boolean f4017;

    /* JADX INFO: renamed from: η */
    public final boolean f4018;

    /* JADX INFO: renamed from: θ */
    public final int f4019;

    public C0290fm(int r1, float r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, int r8) {
            r0 = this;
            r0.<init>()
            r0.f4012 = r1
            r0.f4013 = r2
            r0.f4014 = r3
            r0.f4015 = r4
            r0.f4016 = r5
            r0.f4017 = r6
            r0.f4018 = r7
            r0.f4019 = r8
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.C0290fm
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fm r5 = (p000.C0290fm) r5
            int r1 = r4.f4012
            int r3 = r5.f4012
            if (r1 == r3) goto L13
            return r2
        L13:
            float r1 = r4.f4013
            float r3 = r5.f4013
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L1e
            return r2
        L1e:
            boolean r1 = r4.f4014
            boolean r3 = r5.f4014
            if (r1 == r3) goto L25
            return r2
        L25:
            boolean r1 = r4.f4015
            boolean r3 = r5.f4015
            if (r1 == r3) goto L2c
            return r2
        L2c:
            boolean r1 = r4.f4016
            boolean r3 = r5.f4016
            if (r1 == r3) goto L33
            return r2
        L33:
            boolean r1 = r4.f4017
            boolean r3 = r5.f4017
            if (r1 == r3) goto L3a
            return r2
        L3a:
            boolean r1 = r4.f4018
            boolean r3 = r5.f4018
            if (r1 == r3) goto L41
            return r2
        L41:
            int r4 = r4.f4019
            int r5 = r5.f4019
            if (r4 == r5) goto L48
            return r2
        L48:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f4012
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f4013
            int r0 = p000.lz1.m3676(r2, r0, r1)
            boolean r2 = r3.f4014
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r2 = r3.f4015
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r2 = r3.f4016
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r2 = r3.f4017
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r2 = r3.f4018
            int r0 = p000.lz1.m3678(r0, r1, r2)
            int r3 = r3.f4019
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OriginalViewState(visibility="
            r0.<init>(r1)
            int r1 = r5.f4012
            r0.append(r1)
            java.lang.String r1 = ", alpha="
            r0.append(r1)
            float r1 = r5.f4013
            r0.append(r1)
            java.lang.String r1 = ", enabled="
            r0.append(r1)
            java.lang.String r1 = ", clickable="
            java.lang.String r2 = ", longClickable="
            boolean r3 = r5.f4014
            boolean r4 = r5.f4015
            p000.AbstractC0602nx.m4120(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", focusable="
            java.lang.String r2 = ", focusableInTouchMode="
            boolean r3 = r5.f4016
            boolean r4 = r5.f4017
            p000.AbstractC0602nx.m4120(r0, r3, r1, r4, r2)
            boolean r1 = r5.f4018
            r0.append(r1)
            java.lang.String r1 = ", importantForAccessibility="
            r0.append(r1)
            int r5 = r5.f4019
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
