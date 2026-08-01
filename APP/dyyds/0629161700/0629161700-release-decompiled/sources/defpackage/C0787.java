package defpackage;

/* JADX INFO: renamed from: ᛴᲇᲁᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0787 extends defpackage.AbstractC0758 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f3659;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final boolean f3660;

    public /* synthetic */ C0787(int r1, boolean r2) {
            r0 = this;
            r0.f3659 = r1
            r0.f3660 = r2
            r0.<init>()
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo561(defpackage.C0353 r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.f3659
            boolean r3 = r3.f3660
            switch(r0) {
                case 0: goto L26;
                default: goto L7;
            }
        L7:
            java.lang.Number r5 = (java.lang.Number) r5
            if (r5 != 0) goto Lf
            r4.m1067()
            goto L25
        Lf:
            float r0 = r5.floatValue()
            if (r3 == 0) goto L19
            double r1 = (double) r0
            defpackage.AbstractC1108.m2129(r1)
        L19:
            boolean r3 = r5 instanceof java.lang.Float
            if (r3 == 0) goto L1e
            goto L22
        L1e:
            java.lang.Float r5 = java.lang.Float.valueOf(r0)
        L22:
            r4.m1076(r5)
        L25:
            return
        L26:
            java.lang.Number r5 = (java.lang.Number) r5
            if (r5 != 0) goto L2e
            r4.m1067()
            goto L6c
        L2e:
            double r0 = r5.doubleValue()
            if (r3 == 0) goto L37
            defpackage.AbstractC1108.m2129(r0)
        L37:
            r4.m1071()
            int r3 = r4.f1844
            r5 = 1
            if (r3 == r5) goto L60
            boolean r3 = java.lang.Double.isNaN(r0)
            if (r3 != 0) goto L4c
            boolean r3 = java.lang.Double.isInfinite(r0)
            if (r3 != 0) goto L4c
            goto L60
        L4c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Numeric values must be finite, but was "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L60:
            r4.m1078()
            java.io.Writer r3 = r4.f1843
            java.lang.String r4 = java.lang.Double.toString(r0)
            r3.append(r4)
        L6c:
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r3) {
            r2 = this;
            int r2 = r2.f3659
            r0 = 0
            r1 = 9
            switch(r2) {
                case 0: goto L1c;
                default: goto L8;
            }
        L8:
            int r2 = r3.m2090()
            if (r2 != r1) goto L12
            r3.m2108()
            goto L1b
        L12:
            double r2 = r3.m2087()
            float r2 = (float) r2
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
        L1b:
            return r0
        L1c:
            int r2 = r3.m2090()
            if (r2 != r1) goto L26
            r3.m2108()
            goto L2e
        L26:
            double r2 = r3.m2087()
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
        L2e:
            return r0
    }
}
