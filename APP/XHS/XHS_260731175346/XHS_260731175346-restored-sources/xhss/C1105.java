package xhss;

/* JADX INFO: renamed from: xhss.ᲇᲈᛵᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1105 implements xhss.InterfaceC0204 {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final /* synthetic */ long f3570 = 0;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final /* synthetic */ long f3571 = 0;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final /* synthetic */ long f3572 = 0;
    private volatile /* synthetic */ java.lang.Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile;
    private volatile /* synthetic */ java.lang.Object _rootCause$volatile;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0409 f3573;

    static {
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            java.lang.Class<xhss.ᲇᲈᛵᲁ> r1 = xhss.C1105.class
            java.lang.String r2 = "_isCompleting$volatile"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r2 = r0.objectFieldOffset(r2)
            xhss.C1105.f3572 = r2
            java.lang.String r2 = "_rootCause$volatile"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r2 = r0.objectFieldOffset(r2)
            xhss.C1105.f3571 = r2
            java.lang.String r2 = "_exceptionsHolder$volatile"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            xhss.C1105.f3570 = r0
            return
    }

    public C1105(xhss.C0409 r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>()
            r0.f3573 = r1
            r1 = 0
            r0._isCompleting$volatile = r1
            r0._rootCause$volatile = r2
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Finishing[cancelling="
            r0.<init>(r1)
            boolean r1 = r4.m1798()
            r0.append(r1)
            java.lang.String r1 = ", completing="
            r0.append(r1)
            boolean r1 = r4.m1801()
            r0.append(r1)
            java.lang.String r1 = ", rootCause="
            r0.append(r1)
            java.lang.Throwable r1 = r4.m1797()
            r0.append(r1)
            java.lang.String r1 = ", exceptions="
            r0.append(r1)
            sun.misc.Unsafe r1 = xhss.AbstractC1067.f3442
            long r2 = xhss.C1105.f3570
            java.lang.Object r1 = r1.getObjectVolatile(r4, r2)
            r0.append(r1)
            java.lang.String r1 = ", list="
            r0.append(r1)
            xhss.ᛴᲁᛶᛲ r4 = r4.f3573
            r0.append(r4)
            r4 = 93
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    @Override // xhss.InterfaceC0204
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final boolean mo465() {
            r0 = this;
            java.lang.Throwable r0 = r0.m1797()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.Throwable m1797() {
            r3 = this;
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r1 = xhss.C1105.f3571
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            return r3
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final boolean m1798() {
            r0 = this;
            java.lang.Throwable r0 = r0.m1797()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m1799(java.lang.Throwable r7) {
            r6 = this;
            java.lang.Throwable r0 = r6.m1797()
            if (r0 != 0) goto Le
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r1 = xhss.C1105.f3571
            r0.putObjectVolatile(r6, r1, r7)
            return
        Le:
            if (r7 != r0) goto L11
            goto L25
        L11:
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r1 = xhss.C1105.f3570
            java.lang.Object r3 = r0.getObjectVolatile(r6, r1)
            if (r3 != 0) goto L1f
            r0.putObjectVolatile(r6, r1, r7)
            return
        L1f:
            boolean r4 = r3 instanceof java.lang.Throwable
            if (r4 == 0) goto L36
            if (r7 != r3) goto L26
        L25:
            return
        L26:
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 4
            r4.<init>(r5)
            r4.add(r3)
            r4.add(r7)
            r0.putObjectVolatile(r6, r1, r4)
            return
        L36:
            boolean r6 = r3 instanceof java.util.ArrayList
            if (r6 == 0) goto L40
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r7)
            return
        L40:
            java.lang.String r6 = "State is "
            xhss.C0532.m948(r3, r6)
            return
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final java.util.ArrayList m1800(java.lang.Throwable r7) {
            r6 = this;
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r1 = xhss.C1105.f3570
            java.lang.Object r3 = r0.getObjectVolatile(r6, r1)
            r4 = 4
            if (r3 != 0) goto L11
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
            goto L25
        L11:
            boolean r5 = r3 instanceof java.lang.Throwable
            if (r5 == 0) goto L1f
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            r5.add(r3)
            r3 = r5
            goto L25
        L1f:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L40
            java.util.ArrayList r3 = (java.util.ArrayList) r3
        L25:
            java.lang.Throwable r4 = r6.m1797()
            if (r4 == 0) goto L2f
            r5 = 0
            r3.add(r5, r4)
        L2f:
            if (r7 == 0) goto L3a
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L3a
            r3.add(r7)
        L3a:
            xhss.ᛶᛲᛷᛵ r7 = xhss.AbstractC0485.f1783
            r0.putObjectVolatile(r6, r1, r7)
            return r3
        L40:
            java.lang.String r6 = "State is "
            xhss.C0532.m948(r3, r6)
            r6 = 0
            return r6
    }

    @Override // xhss.InterfaceC0204
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public final xhss.C0409 mo466() {
            r0 = this;
            xhss.ᛴᲁᛶᛲ r0 = r0.f3573
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final boolean m1801() {
            r3 = this;
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r1 = xhss.C1105.f3572
            int r3 = r0.getIntVolatile(r3, r1)
            if (r3 == 0) goto Lc
            r3 = 1
            return r3
        Lc:
            r3 = 0
            return r3
    }
}
