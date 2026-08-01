package p000;

/* JADX INFO: renamed from: fu */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0298fu {

    /* JADX INFO: renamed from: α */
    public final int f4133;

    /* JADX INFO: renamed from: β */
    public final int f4134;

    /* JADX INFO: renamed from: γ */
    public final float f4135;

    public C0298fu(float r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f4133 = r2
            r0.f4134 = r3
            r0.f4135 = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.C0298fu
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fu r5 = (p000.C0298fu) r5
            int r1 = r4.f4133
            int r3 = r5.f4133
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.f4134
            int r3 = r5.f4134
            if (r1 == r3) goto L1a
            return r2
        L1a:
            float r4 = r4.f4135
            float r5 = r5.f4135
            int r4 = java.lang.Float.compare(r4, r5)
            if (r4 == 0) goto L25
            return r2
        L25:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f4133
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f4134
            int r0 = p000.a12.m14(r2, r0, r1)
            float r3 = r3.f4135
            int r3 = java.lang.Float.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", expHi="
            java.lang.String r1 = ", blend="
            java.lang.String r2 = "DownScaleBlend(expLo="
            int r3 = r5.f4133
            int r4 = r5.f4134
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r2, r3, r0, r4, r1)
            float r5 = r5.f4135
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
