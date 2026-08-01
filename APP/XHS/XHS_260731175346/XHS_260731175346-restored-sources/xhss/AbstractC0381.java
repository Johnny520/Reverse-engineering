package xhss;

/* JADX INFO: renamed from: xhss.ᛴᛷᛴᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0381 extends xhss.AbstractC0070 implements xhss.InterfaceC0022, xhss.InterfaceC0204 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public xhss.AbstractC0784 f1375;

    @Override // xhss.AbstractC0070
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = xhss.AbstractC0561.m1011(r2)
            r0.append(r1)
            java.lang.String r1 = "[job@"
            r0.append(r1)
            xhss.ᛸᛷᛳᲈ r2 = r2.f1375
            if (r2 == 0) goto L23
            goto L24
        L23:
            r2 = 0
        L24:
            java.lang.String r2 = xhss.AbstractC0561.m1011(r2)
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // xhss.InterfaceC0204
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final boolean mo465() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // xhss.InterfaceC0022
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo125() {
            r7 = this;
            xhss.ᛸᛷᛳᲈ r0 = r7.f1375
            if (r0 == 0) goto L6
        L4:
            r2 = r0
            goto L8
        L6:
            r0 = 0
            goto L4
        L8:
            java.lang.Object r5 = r2.m1351()
            boolean r0 = r5 instanceof xhss.AbstractC0381
            if (r0 == 0) goto L28
            if (r5 == r7) goto L14
            goto L76
        L14:
            sun.misc.Unsafe r1 = xhss.AbstractC1067.f3442
            long r3 = xhss.AbstractC0784.f2569
            xhss.ᛳᛵᲁᛵ r6 = xhss.AbstractC0485.f1781
            boolean r0 = r1.compareAndSwapObject(r2, r3, r5, r6)
            if (r0 == 0) goto L21
            goto L76
        L21:
            java.lang.Object r0 = r1.getObjectVolatile(r2, r3)
            if (r0 == r5) goto L14
            goto L8
        L28:
            boolean r0 = r5 instanceof xhss.InterfaceC0204
            if (r0 == 0) goto L76
            xhss.ᛲᲀᛵᛳ r5 = (xhss.InterfaceC0204) r5
            xhss.ᛴᲁᛶᛲ r0 = r5.mo466()
            if (r0 == 0) goto L76
        L34:
            java.lang.Object r5 = r7.m218()
            boolean r0 = r5 instanceof xhss.C1015
            if (r0 == 0) goto L3d
            goto L76
        L3d:
            if (r5 != r7) goto L42
            xhss.ᛱᛸᛲᛴ r5 = (xhss.AbstractC0070) r5
            return
        L42:
            r0 = r5
            xhss.ᛱᛸᛲᛴ r0 = (xhss.AbstractC0070) r0
            r0.getClass()
            sun.misc.Unsafe r1 = xhss.AbstractC1067.f3442
            long r2 = xhss.AbstractC0070.f370
            java.lang.Object r4 = r1.getObjectVolatile(r0, r2)
            xhss.ᲇᛲᲈᲀ r4 = (xhss.C1015) r4
            if (r4 != 0) goto L5c
            xhss.ᲇᛲᲈᲀ r4 = new xhss.ᲇᛲᲈᲀ
            r4.<init>(r0)
            r1.putObjectVolatile(r0, r2, r4)
        L5c:
            r6 = r4
        L5d:
            sun.misc.Unsafe r1 = xhss.AbstractC1067.f3442
            long r3 = xhss.AbstractC0070.f368
            r2 = r7
            boolean r7 = r1.compareAndSwapObject(r2, r3, r5, r6)
            if (r7 == 0) goto L6c
            r0.m221()
            return
        L6c:
            java.lang.Object r7 = r1.getObjectVolatile(r2, r3)
            if (r7 == r5) goto L74
            r7 = r2
            goto L34
        L74:
            r7 = r2
            goto L5d
        L76:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ */
    public abstract boolean mo438();

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ */
    public abstract void mo439(java.lang.Throwable r1);

    @Override // xhss.InterfaceC0204
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public final xhss.C0409 mo466() {
            r0 = this;
            r0 = 0
            return r0
    }
}
