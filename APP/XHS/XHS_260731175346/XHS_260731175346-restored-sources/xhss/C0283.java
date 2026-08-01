package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛶᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0283 extends xhss.AbstractC0381 {

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.C0172 f1097;

    public C0283(xhss.C0172 r1) {
            r0 = this;
            r0.<init>()
            r0.f1097 = r1
            return
    }

    @Override // xhss.AbstractC0381
    /* JADX INFO: renamed from: ᛷᲁᲁ */
    public final boolean mo438() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // xhss.AbstractC0381
    /* JADX INFO: renamed from: ᛸᛶᲈᛶ */
    public final void mo439(java.lang.Throwable r15) {
            r14 = this;
            xhss.ᛸᛷᛳᲈ r15 = r14.f1375
            if (r15 == 0) goto L5
            goto L6
        L5:
            r15 = 0
        L6:
            java.util.concurrent.CancellationException r5 = r15.m1343()
            xhss.ᛲᛶᛳᲁ r14 = r14.f1097
            boolean r15 = r14.m416()
            if (r15 != 0) goto L13
            goto L4b
        L13:
            xhss.ᛱᛴᛶᛴ r15 = r14.f690
            r1 = r15
            xhss.ᛸᲇᲁᛱ r1 = (xhss.C0817) r1
            long r12 = xhss.C0817.f2652
        L1a:
            sun.misc.Unsafe r15 = xhss.AbstractC1067.f3442
            java.lang.Object r10 = r15.getObjectVolatile(r1, r12)
            xhss.ᛶᛲᛷᛵ r4 = xhss.AbstractC1178.f3789
            boolean r15 = xhss.AbstractC0007.m97(r10, r4)
            if (r15 == 0) goto L3a
        L28:
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r2 = xhss.C0817.f2652
            boolean r15 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r15 == 0) goto L33
            goto L57
        L33:
            java.lang.Object r15 = r0.getObjectVolatile(r1, r12)
            if (r15 == r4) goto L28
            goto L1a
        L3a:
            boolean r15 = r10 instanceof java.lang.Throwable
            if (r15 == 0) goto L3f
            goto L57
        L3f:
            sun.misc.Unsafe r6 = xhss.AbstractC1067.f3442
            long r8 = xhss.C0817.f2652
            r11 = 0
            r7 = r1
            boolean r15 = r6.compareAndSwapObject(r7, r8, r10, r11)
            if (r15 == 0) goto L58
        L4b:
            r14.m425(r5)
            boolean r15 = r14.m416()
            if (r15 != 0) goto L57
            r14.m418()
        L57:
            return
        L58:
            java.lang.Object r15 = r6.getObjectVolatile(r1, r12)
            if (r15 == r10) goto L3f
            goto L1a
    }
}
