package xhss;

/* JADX INFO: renamed from: xhss.ᛴᛷᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0387 extends xhss.AbstractC0121 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final boolean f1392;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1393;

    public /* synthetic */ C0387(int r1, boolean r2) {
            r0 = this;
            r0.f1393 = r1
            r0.f1392 = r2
            r0.<init>()
            return
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo119(xhss.C0385 r3) {
            r2 = this;
            int r2 = r2.f1393
            r0 = 0
            r1 = 9
            switch(r2) {
                case 0: goto L1c;
                default: goto L8;
            }
        L8:
            int r2 = r3.m762()
            if (r2 != r1) goto L12
            r3.m756()
            goto L1b
        L12:
            double r2 = r3.m746()
            float r2 = (float) r2
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
        L1b:
            return r0
        L1c:
            int r2 = r3.m762()
            if (r2 != r1) goto L26
            r3.m756()
            goto L2e
        L26:
            double r2 = r3.m746()
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
        L2e:
            return r0
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final void mo120(xhss.C0827 r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.f1393
            boolean r3 = r3.f1392
            switch(r0) {
                case 0: goto L26;
                default: goto L7;
            }
        L7:
            java.lang.Number r5 = (java.lang.Number) r5
            if (r5 != 0) goto Lf
            r4.m1396()
            goto L25
        Lf:
            float r0 = r5.floatValue()
            if (r3 == 0) goto L19
            double r1 = (double) r0
            xhss.AbstractC0073.m225(r1)
        L19:
            boolean r3 = r5 instanceof java.lang.Float
            if (r3 == 0) goto L1e
            goto L22
        L1e:
            java.lang.Float r5 = java.lang.Float.valueOf(r0)
        L22:
            r4.m1394(r5)
        L25:
            return
        L26:
            java.lang.Number r5 = (java.lang.Number) r5
            if (r5 != 0) goto L2e
            r4.m1396()
            goto L6c
        L2e:
            double r0 = r5.doubleValue()
            if (r3 == 0) goto L37
            xhss.AbstractC0073.m225(r0)
        L37:
            r4.m1406()
            int r3 = r4.f2695
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
            r4.m1393()
            java.io.Writer r3 = r4.f2691
            java.lang.String r4 = java.lang.Double.toString(r0)
            r3.append(r4)
        L6c:
            return
    }
}
