package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class b91 extends p000.v01 {

    /* JADX INFO: renamed from: α */
    public final float f1568;

    /* JADX INFO: renamed from: β */
    public final float f1569;

    /* JADX INFO: renamed from: γ */
    public final float f1570;

    /* JADX INFO: renamed from: δ */
    public final float f1571;

    public b91(float r4, float r5, float r6, float r7) {
            r3 = this;
            r3.<init>()
            r3.f1568 = r4
            r3.f1569 = r5
            r3.f1570 = r6
            r3.f1571 = r7
            r3 = 0
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 >= 0) goto L1b
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 == 0) goto L19
            goto L1b
        L19:
            r4 = r2
            goto L1c
        L1b:
            r4 = r1
        L1c:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L29
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L27
            goto L29
        L27:
            r5 = r2
            goto L2a
        L29:
            r5 = r1
        L2a:
            r4 = r4 & r5
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 >= 0) goto L38
            boolean r5 = java.lang.Float.isNaN(r6)
            if (r5 == 0) goto L36
            goto L38
        L36:
            r5 = r2
            goto L39
        L38:
            r5 = r1
        L39:
            r4 = r4 & r5
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 >= 0) goto L46
            boolean r3 = java.lang.Float.isNaN(r7)
            if (r3 == 0) goto L45
            goto L46
        L45:
            r1 = r2
        L46:
            r3 = r4 & r1
            if (r3 != 0) goto L4f
            java.lang.String r3 = "Padding must be non-negative"
            p000.yl0.m6938(r3)
        L4f:
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.b91
            if (r0 == 0) goto L7
            b91 r3 = (p000.b91) r3
            goto L8
        L7:
            r3 = 0
        L8:
            if (r3 != 0) goto Lb
            goto L35
        Lb:
            float r0 = r2.f1568
            float r1 = r3.f1568
            boolean r0 = p000.C0408iv.m2806(r0, r1)
            if (r0 == 0) goto L35
            float r0 = r2.f1569
            float r1 = r3.f1569
            boolean r0 = p000.C0408iv.m2806(r0, r1)
            if (r0 == 0) goto L35
            float r0 = r2.f1570
            float r1 = r3.f1570
            boolean r0 = p000.C0408iv.m2806(r0, r1)
            if (r0 == 0) goto L35
            float r2 = r2.f1571
            float r3 = r3.f1571
            boolean r2 = p000.C0408iv.m2806(r2, r3)
            if (r2 == 0) goto L35
            r2 = 1
            return r2
        L35:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f1568
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f1569
            int r0 = p000.lz1.m3676(r2, r0, r1)
            float r2 = r3.f1570
            int r0 = p000.lz1.m3676(r2, r0, r1)
            float r3 = r3.f1571
            int r3 = p000.lz1.m3676(r3, r0, r1)
            r0 = 1
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r3
            return r0
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: δ */
    public final p000.q01 mo56() {
            r2 = this;
            c91 r0 = new c91
            r0.<init>()
            float r1 = r2.f1568
            r0.f2016 = r1
            float r1 = r2.f1569
            r0.f2017 = r1
            float r1 = r2.f1570
            r0.f2018 = r1
            float r2 = r2.f1571
            r0.f2019 = r2
            r2 = 1
            r0.f2020 = r2
            return r0
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: ε */
    public final void mo57(p000.q01 r2) {
            r1 = this;
            c91 r2 = (p000.c91) r2
            float r0 = r1.f1568
            r2.f2016 = r0
            float r0 = r1.f1569
            r2.f2017 = r0
            float r0 = r1.f1570
            r2.f2018 = r0
            float r1 = r1.f1571
            r2.f2019 = r1
            r1 = 1
            r2.f2020 = r1
            return
    }
}
