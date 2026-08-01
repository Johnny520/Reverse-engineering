package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛸᛲᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0070 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final /* synthetic */ long f368 = 0;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final /* synthetic */ long f369 = 0;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final /* synthetic */ long f370 = 0;
    private volatile /* synthetic */ java.lang.Object _next$volatile;
    private volatile /* synthetic */ java.lang.Object _prev$volatile;
    private volatile /* synthetic */ java.lang.Object _removedRef$volatile;

    static {
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            java.lang.Class<xhss.ᛱᛸᛲᛴ> r1 = xhss.AbstractC0070.class
            java.lang.String r2 = "_next$volatile"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r2 = r0.objectFieldOffset(r2)
            xhss.AbstractC0070.f368 = r2
            java.lang.String r2 = "_prev$volatile"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r2 = r0.objectFieldOffset(r2)
            xhss.AbstractC0070.f369 = r2
            java.lang.String r2 = "_removedRef$volatile"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            xhss.AbstractC0070.f370 = r0
            return
    }

    public AbstractC0070() {
            r0 = this;
            r0.<init>()
            r0._next$volatile = r0
            r0._prev$volatile = r0
            return
    }

    public java.lang.String toString() {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            xhss.ᛷᲇᲀᛶ r1 = new xhss.ᛷᲇᲀᛶ
            java.lang.String r6 = "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;"
            r2 = 1
            java.lang.Class<xhss.ᛶᛵᛱ> r3 = xhss.AbstractC0561.class
            java.lang.String r5 = "classSimpleName"
            r4 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r0.append(r1)
            r7 = 64
            r0.append(r7)
            java.lang.String r7 = xhss.AbstractC0561.m1011(r4)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            return r7
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final boolean m216(xhss.AbstractC0070 r10, int r11) {
            r9 = this;
        L0:
            xhss.ᛱᛸᛲᛴ r1 = r9.m219()
            boolean r0 = r1 instanceof xhss.C0640
            r6 = 1
            if (r0 == 0) goto L1a
            r9 = r1
            xhss.ᛷᛳᛷᛷ r9 = (xhss.C0640) r9
            int r9 = r9.f2196
            r9 = r9 & r11
            if (r9 != 0) goto L18
            boolean r9 = r1.m216(r10, r11)
            if (r9 == 0) goto L18
            return r6
        L18:
            r9 = 0
            return r9
        L1a:
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r2 = xhss.AbstractC0070.f369
            r0.putObjectVolatile(r10, r2, r1)
            long r7 = xhss.AbstractC0070.f368
            r0.putObjectVolatile(r10, r7, r9)
        L26:
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r2 = xhss.AbstractC0070.f368
            r4 = r9
            r5 = r10
            boolean r9 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r9 == 0) goto L36
            r5.m220(r4)
            return r6
        L36:
            java.lang.Object r9 = r0.getObjectVolatile(r1, r7)
            if (r9 == r4) goto L3f
            r9 = r4
            r10 = r5
            goto L0
        L3f:
            r9 = r4
            r10 = r5
            goto L26
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final xhss.AbstractC0070 m217() {
            r1 = this;
            java.lang.Object r1 = r1.m218()
            boolean r0 = r1 instanceof xhss.C1015
            if (r0 == 0) goto Lc
            r0 = r1
            xhss.ᲇᛲᲈᲀ r0 = (xhss.C1015) r0
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L12
            xhss.ᛱᛸᛲᛴ r1 = r0.f3311
            return r1
        L12:
            xhss.ᛱᛸᛲᛴ r1 = (xhss.AbstractC0070) r1
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final java.lang.Object m218() {
            r3 = this;
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r1 = xhss.AbstractC0070.f368
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            return r3
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final xhss.AbstractC0070 m219() {
            r3 = this;
            xhss.ᛱᛸᛲᛴ r0 = r3.m221()
            if (r0 != 0) goto L20
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r1 = xhss.AbstractC0070.f369
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            xhss.ᛱᛸᛲᛴ r3 = (xhss.AbstractC0070) r3
        L10:
            boolean r0 = r3.mo222()
            if (r0 != 0) goto L17
            return r3
        L17:
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            xhss.ᛱᛸᛲᛴ r3 = (xhss.AbstractC0070) r3
            goto L10
        L20:
            return r0
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final void m220(xhss.AbstractC0070 r10) {
            r9 = this;
        L0:
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r1 = xhss.AbstractC0070.f369
            java.lang.Object r0 = r0.getObjectVolatile(r10, r1)
            r7 = r0
            xhss.ᛱᛸᛲᛴ r7 = (xhss.AbstractC0070) r7
            java.lang.Object r0 = r9.m218()
            if (r0 == r10) goto L12
            goto L27
        L12:
            sun.misc.Unsafe r3 = xhss.AbstractC1067.f3442
            long r5 = xhss.AbstractC0070.f369
            r8 = r9
            r4 = r10
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L28
            boolean r9 = r8.mo222()
            if (r9 == 0) goto L27
            r4.m221()
        L27:
            return
        L28:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            r10 = r4
            if (r9 == r7) goto L31
            r9 = r8
            goto L0
        L31:
            r9 = r8
            goto L12
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.AbstractC0070 m221() {
            r15 = this;
        L0:
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r1 = xhss.AbstractC0070.f369
            java.lang.Object r0 = r0.getObjectVolatile(r15, r1)
            r7 = r0
            xhss.ᛱᛸᛲᛴ r7 = (xhss.AbstractC0070) r7
            r0 = 0
            r9 = r0
            r8 = r7
        Le:
            if (r8 == 0) goto L7a
            sun.misc.Unsafe r3 = xhss.AbstractC1067.f3442
            long r4 = xhss.AbstractC0070.f368
            java.lang.Object r6 = r3.getObjectVolatile(r8, r4)
            if (r6 != r15) goto L36
            if (r7 != r8) goto L1d
            goto L2a
        L1d:
            sun.misc.Unsafe r3 = xhss.AbstractC1067.f3442
            long r5 = xhss.AbstractC0070.f369
            r4 = r15
            boolean r15 = r3.compareAndSwapObject(r4, r5, r7, r8)
            r14 = r7
            r7 = r4
            if (r15 == 0) goto L2b
        L2a:
            return r8
        L2b:
            java.lang.Object r15 = r3.getObjectVolatile(r7, r1)
            if (r15 == r14) goto L33
        L31:
            r15 = r7
            goto L0
        L33:
            r15 = r7
            r7 = r14
            goto L1d
        L36:
            r14 = r7
            r7 = r15
            boolean r15 = r7.mo222()
            if (r15 == 0) goto L3f
            return r0
        L3f:
            boolean r15 = r6 instanceof xhss.C1015
            if (r15 == 0) goto L74
            if (r9 == 0) goto L62
            xhss.ᲇᛲᲈᲀ r6 = (xhss.C1015) r6
            xhss.ᛱᛸᛲᛴ r13 = r6.f3311
        L49:
            r12 = r8
            sun.misc.Unsafe r8 = xhss.AbstractC1067.f3442
            long r10 = xhss.AbstractC0070.f368
            boolean r15 = r8.compareAndSwapObject(r9, r10, r12, r13)
            r3 = r8
            r8 = r12
            if (r15 == 0) goto L5b
            r15 = r7
            r8 = r9
            r7 = r14
            r9 = r0
            goto Le
        L5b:
            java.lang.Object r15 = r3.getObjectVolatile(r9, r4)
            if (r15 == r8) goto L49
            goto L31
        L62:
            if (r8 == 0) goto L6e
            java.lang.Object r15 = r3.getObjectVolatile(r8, r1)
            r8 = r15
            xhss.ᛱᛸᛲᛴ r8 = (xhss.AbstractC0070) r8
        L6b:
            r15 = r7
            r7 = r14
            goto Le
        L6e:
            java.lang.ClassCastException r15 = new java.lang.ClassCastException
            r15.<init>()
            throw r15
        L74:
            r15 = r6
            xhss.ᛱᛸᛲᛴ r15 = (xhss.AbstractC0070) r15
            r9 = r8
            r8 = r15
            goto L6b
        L7a:
            java.lang.ClassCastException r15 = new java.lang.ClassCastException
            r15.<init>()
            throw r15
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public boolean mo222() {
            r0 = this;
            java.lang.Object r0 = r0.m218()
            boolean r0 = r0 instanceof xhss.C1015
            return r0
    }
}
