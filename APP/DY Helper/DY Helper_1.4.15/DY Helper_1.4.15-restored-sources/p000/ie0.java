package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ie0 {

    /* JADX INFO: renamed from: α */
    public final float f5060;

    /* JADX INFO: renamed from: β */
    public final float f5061;

    /* JADX INFO: renamed from: γ */
    public final p000.C0505la f5062;

    static {
            ie0 r0 = new ie0
            la r1 = p000.C0505la.f6505
            r0.<init>(r1)
            ie0 r0 = new ie0
            la r1 = p000.C0505la.f6506
            r0.<init>(r1)
            ie0 r0 = new ie0
            la r1 = p000.C0505la.f6507
            r0.<init>(r1)
            ie0 r0 = new ie0
            la r1 = p000.C0505la.f6508
            r0.<init>(r1)
            ie0 r0 = new ie0
            la r1 = p000.C0505la.f6509
            r0.<init>(r1)
            ie0 r0 = new ie0
            la r1 = p000.C0505la.f6510
            r0.<init>(r1)
            return
    }

    public ie0(float r1, float r2, p000.C0505la r3) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.f5060 = r1
            r0.f5061 = r2
            r0.f5062 = r3
            return
    }

    public ie0(p000.C0505la r3) {
            r2 = this;
            r0 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r0, r1, r3)
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof p000.ie0
            if (r0 != 0) goto L8
            goto L2a
        L8:
            ie0 r3 = (p000.ie0) r3
            float r0 = r2.f5060
            float r1 = r3.f5060
            boolean r0 = p000.C0408iv.m2806(r0, r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            float r0 = r2.f5061
            float r1 = r3.f5061
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L20
            goto L2a
        L20:
            la r2 = r2.f5062
            la r3 = r3.f5062
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L2c
        L2a:
            r2 = 0
            return r2
        L2c:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f5060
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f5061
            int r0 = p000.lz1.m3676(r2, r0, r1)
            la r3 = r3.f5062
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            float r0 = r3.f5060
            java.lang.String r0 = p000.C0408iv.m2807(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Highlight(width="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", alpha="
            r1.append(r0)
            float r0 = r3.f5061
            r1.append(r0)
            java.lang.String r0 = ", style="
            r1.append(r0)
            la r3 = r3.f5062
            r1.append(r3)
            java.lang.String r3 = ")"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }
}
