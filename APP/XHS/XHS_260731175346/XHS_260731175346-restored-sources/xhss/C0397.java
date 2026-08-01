package xhss;

/* JADX INFO: renamed from: xhss.ᛴᛸᛸᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0397 extends xhss.AbstractC0121 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ xhss.AbstractC0121 f1409;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1410;

    public /* synthetic */ C0397(xhss.AbstractC0121 r1, int r2) {
            r0 = this;
            r0.f1410 = r2
            r0.f1409 = r1
            r0.<init>()
            return
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo119(xhss.C0385 r5) {
            r4 = this;
            int r0 = r4.f1410
            xhss.ᛲᛱᛶᛴ r4 = r4.f1409
            switch(r0) {
                case 0: goto L17;
                default: goto L7;
            }
        L7:
            java.lang.Object r4 = r4.mo119(r5)
            java.lang.Number r4 = (java.lang.Number) r4
            java.util.concurrent.atomic.AtomicLong r5 = new java.util.concurrent.atomic.AtomicLong
            long r0 = r4.longValue()
            r5.<init>(r0)
            return r5
        L17:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.m735()
        L1f:
            boolean r1 = r5.m744()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r4.mo119(r5)
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.add(r1)
            goto L1f
        L37:
            r5.m752()
            int r4 = r0.size()
            java.util.concurrent.atomic.AtomicLongArray r5 = new java.util.concurrent.atomic.AtomicLongArray
            r5.<init>(r4)
            r1 = 0
        L44:
            if (r1 >= r4) goto L56
            java.lang.Object r2 = r0.get(r1)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r5.set(r1, r2)
            int r1 = r1 + 1
            goto L44
        L56:
            return r5
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final void mo120(xhss.C0827 r5, java.lang.Object r6) {
            r4 = this;
            int r0 = r4.f1410
            xhss.ᛲᛱᛶᛴ r4 = r4.f1409
            switch(r0) {
                case 0: goto L15;
                default: goto L7;
            }
        L7:
            java.util.concurrent.atomic.AtomicLong r6 = (java.util.concurrent.atomic.AtomicLong) r6
            long r0 = r6.get()
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            r4.mo120(r5, r6)
            return
        L15:
            java.util.concurrent.atomic.AtomicLongArray r6 = (java.util.concurrent.atomic.AtomicLongArray) r6
            r5.m1395()
            int r0 = r6.length()
            r1 = 0
        L1f:
            if (r1 >= r0) goto L2f
            long r2 = r6.get(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r4.mo120(r5, r2)
            int r1 = r1 + 1
            goto L1f
        L2f:
            r5.m1401()
            return
    }
}
