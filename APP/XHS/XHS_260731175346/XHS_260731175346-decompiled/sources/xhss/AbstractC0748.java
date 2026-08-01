package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛴᛳᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0748 extends xhss.AbstractC0631 {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.InterfaceC0362 f2508;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public transient xhss.InterfaceC0038 f2509;

    public AbstractC0748(xhss.InterfaceC0038 r2) {
            r1 = this;
            if (r2 == 0) goto L7
            xhss.ᛴᛵᛳᛵ r0 = r2.mo153()
            goto L8
        L7:
            r0 = 0
        L8:
            r1.<init>(r2)
            r1.f2508 = r0
            return
    }

    @Override // xhss.AbstractC0631
    /* JADX INFO: renamed from: ᛸᛷᲈᲈ */
    public final void mo1103() {
            r6 = this;
            xhss.ᛱᛴᛶᛴ r0 = r6.f2509
            if (r0 == 0) goto L32
            if (r0 == r6) goto L32
            xhss.ᛴᛵᛳᛵ r1 = r6.f2508
            xhss.ᛳᛴᲀᲁ r2 = xhss.C0263.f972
            xhss.ᛳᛵᲈᛲ r1 = r1.mo442(r2)
            xhss.ᛲᛶᲇᲇ r1 = (xhss.AbstractC0180) r1
            r1.getClass()
            xhss.ᛸᲇᲁᛱ r0 = (xhss.C0817) r0
        L15:
            sun.misc.Unsafe r1 = xhss.AbstractC1067.f3442
            long r2 = xhss.C0817.f2652
            java.lang.Object r4 = r1.getObjectVolatile(r0, r2)
            xhss.ᛶᛲᛷᛵ r5 = xhss.AbstractC1178.f3789
            if (r4 == r5) goto L15
            java.lang.Object r0 = r1.getObjectVolatile(r0, r2)
            boolean r1 = r0 instanceof xhss.C0172
            if (r1 == 0) goto L2c
            xhss.ᛲᛶᛳᲁ r0 = (xhss.C0172) r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            if (r0 == 0) goto L32
            r0.m418()
        L32:
            xhss.ᛶᲀᲁᲁ r0 = xhss.C0592.f2051
            r6.f2509 = r0
            return
    }

    @Override // xhss.InterfaceC0038
    /* JADX INFO: renamed from: ᲇᛶᛴᲀ */
    public final xhss.InterfaceC0362 mo153() {
            r0 = this;
            xhss.ᛴᛵᛳᛵ r0 = r0.f2508
            return r0
    }
}
