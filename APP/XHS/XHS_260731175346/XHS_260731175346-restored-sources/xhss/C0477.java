package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛶᛱᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0477 {

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public static final int f1717 = 0;

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public static final int f1718 = 0;

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public static final xhss.C0105 f1719 = null;

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public static final int f1720 = 0;

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public static final xhss.C0477 f1721 = null;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public static final xhss.C0089 f1722 = null;

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public static final java.util.List f1723 = null;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public static final xhss.C0230 f1724 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.util.HashMap f1725;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.util.ArrayList f1726;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public xhss.C0089 f1727;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0067 f1728;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final int f1729;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final int f1730;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final int f1731;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.util.ArrayList f1732;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final java.util.ArrayDeque f1733;

    static {
            xhss.ᛱᲀᛸᛸ r0 = xhss.C0089.f435
            xhss.C0477.f1722 = r0
            r0 = 1
            xhss.C0477.f1717 = r0
            xhss.C0477.f1718 = r0
            r0 = 2
            xhss.C0477.f1720 = r0
            xhss.ᛳᛱᛲᲀ r0 = new xhss.ᛳᛱᛲᲀ
            java.util.Map r1 = java.util.Collections.EMPTY_MAP
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            r3 = 4
            r0.<init>(r3, r1, r2)
            xhss.C0477.f1724 = r0
            xhss.ᛱᲁᲈᛷ r1 = new xhss.ᛱᲁᲈᛷ
            r1.<init>(r0)
            xhss.C0477.f1719 = r1
            xhss.ᛵᛶᛱᛸ r2 = new xhss.ᛵᛶᛱᛸ
            r2.<init>()
            xhss.C0477.f1721 = r2
            java.util.List r0 = r2.m877(r0, r1)
            xhss.C0477.f1723 = r0
            return
    }

    public C0477() {
            r1 = this;
            r1.<init>()
            xhss.ᛱᛷᲈᛱ r0 = xhss.C0067.f362
            r1.f1728 = r0
            int r0 = xhss.C0477.f1717
            r1.f1731 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f1725 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1726 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1732 = r0
            xhss.ᛱᲀᛸᛸ r0 = xhss.C0477.f1722
            r1.f1727 = r0
            int r0 = xhss.C0477.f1718
            r1.f1730 = r0
            int r0 = xhss.C0477.f1720
            r1.f1729 = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.f1733 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static java.util.List m876(java.util.AbstractCollection r2) {
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            return r2
        L9:
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L29
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto L1c
            java.util.List r2 = (java.util.List) r2
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            goto L24
        L1c:
            java.util.Iterator r2 = r2.iterator()
            java.lang.Object r2 = r2.next()
        L24:
            java.util.List r2 = java.util.Collections.singletonList(r2)
            return r2
        L29:
            java.lang.Object[] r2 = r2.toArray()
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.util.List m877(xhss.C0230 r9, xhss.C0105 r10) {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            xhss.ᲀᛲᛵᛲ r1 = xhss.AbstractC0073.f396
            r0.add(r1)
            int r1 = r8.f1730
            r2 = 1
            if (r1 != r2) goto L12
            xhss.ᛸᲁᲀᛵ r1 = xhss.C0929.f3013
            goto L18
        L12:
            xhss.ᛸᲁᲀᛵ r3 = new xhss.ᛸᲁᲀᛵ
            r3.<init>(r1)
            r1 = r3
        L18:
            r0.add(r1)
            xhss.ᛱᛷᲈᛱ r1 = r8.f1728
            r0.add(r1)
            java.util.ArrayList r1 = r8.f1726
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L33
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            java.util.Collections.reverse(r3)
            r0.addAll(r3)
        L33:
            java.util.ArrayList r1 = r8.f1732
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L46
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            java.util.Collections.reverse(r3)
            r0.addAll(r3)
        L46:
            java.util.List r1 = xhss.AbstractC0685.f2318
            xhss.ᲀᛲᛵᛲ r1 = xhss.AbstractC0073.f386
            r0.add(r1)
            xhss.ᛵᲇᛸᛴ r1 = xhss.AbstractC0073.f393
            r0.add(r1)
            xhss.ᛵᲇᛸᛴ r1 = xhss.AbstractC0073.f397
            r0.add(r1)
            xhss.ᛵᲇᛸᛴ r1 = xhss.AbstractC0073.f383
            r0.add(r1)
            xhss.ᛵᲇᛸᛴ r1 = xhss.AbstractC0073.f398
            r0.add(r1)
            xhss.ᲁᛶᲇᛳ r1 = xhss.AbstractC0073.f401
            xhss.ᛵᲇᛸᛴ r3 = new xhss.ᛵᲇᛸᛴ
            java.lang.Class r4 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r5 = java.lang.Long.class
            r3.<init>(r4, r5, r1)
            r0.add(r3)
            xhss.ᛴᛷᲀᲈ r3 = xhss.AbstractC0073.f390
            xhss.ᛵᲇᛸᛴ r4 = new xhss.ᛵᲇᛸᛴ
            java.lang.Class r5 = java.lang.Double.TYPE
            java.lang.Class<java.lang.Double> r6 = java.lang.Double.class
            r4.<init>(r5, r6, r3)
            r0.add(r4)
            xhss.ᛴᛷᲀᲈ r3 = xhss.AbstractC0073.f385
            xhss.ᛵᲇᛸᛴ r4 = new xhss.ᛵᲇᛸᛴ
            java.lang.Class r5 = java.lang.Float.TYPE
            java.lang.Class<java.lang.Float> r6 = java.lang.Float.class
            r4.<init>(r5, r6, r3)
            r0.add(r4)
            r3 = 2
            r4 = 0
            int r5 = r8.f1729
            if (r5 != r3) goto L94
            xhss.ᲇᲈᛷᲁ r3 = xhss.C0813.f2635
            goto L9f
        L94:
            xhss.ᛸᲁᲈᛳ r3 = new xhss.ᛸᲁᲈᛳ
            r3.<init>(r5)
            xhss.ᲇᲈᛷᲁ r5 = new xhss.ᲇᲈᛷᲁ
            r5.<init>(r3, r4)
            r3 = r5
        L9f:
            r0.add(r3)
            xhss.ᲀᛲᛵᛲ r3 = xhss.AbstractC0073.f388
            r0.add(r3)
            xhss.ᲀᛲᛵᛲ r3 = xhss.AbstractC0073.f387
            r0.add(r3)
            xhss.ᛴᛸᛸᛱ r3 = new xhss.ᛴᛸᛸᛱ
            r3.<init>(r1, r2)
            xhss.ᛲᛲᛸᲇ r3 = r3.m357()
            xhss.ᲀᛲᛵᛲ r5 = new xhss.ᲀᛲᛵᛲ
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r6 = java.util.concurrent.atomic.AtomicLong.class
            r5.<init>(r6, r3, r4)
            r0.add(r5)
            xhss.ᛴᛸᛸᛱ r3 = new xhss.ᛴᛸᛸᛱ
            r3.<init>(r1, r4)
            xhss.ᛲᛲᛸᲇ r1 = r3.m357()
            xhss.ᲀᛲᛵᛲ r3 = new xhss.ᲀᛲᛵᛲ
            java.lang.Class<java.util.concurrent.atomic.AtomicLongArray> r5 = java.util.concurrent.atomic.AtomicLongArray.class
            r3.<init>(r5, r1, r4)
            r0.add(r3)
            xhss.ᲀᛲᛵᛲ r1 = xhss.AbstractC0073.f391
            r0.add(r1)
            xhss.ᛵᲇᛸᛴ r1 = xhss.AbstractC0073.f399
            r0.add(r1)
            xhss.ᲀᛲᛵᛲ r1 = xhss.AbstractC0073.f381
            r0.add(r1)
            xhss.ᲀᛲᛵᛲ r1 = xhss.AbstractC0073.f377
            r0.add(r1)
            xhss.ᲀᛲᛵᛲ r1 = xhss.AbstractC0073.f380
            r0.add(r1)
            xhss.ᲀᛲᛵᛲ r1 = xhss.AbstractC0073.f382
            r0.add(r1)
            xhss.ᲀᛲᛵᛲ r1 = xhss.AbstractC0073.f389
            r0.add(r1)
            xhss.ᲀᛲᛵᛲ r1 = xhss.AbstractC0073.f394
            r0.add(r1)
            xhss.ᲀᛲᛵᛲ r1 = xhss.AbstractC0073.f400
            r0.add(r1)
            xhss.ᲀᛲᛵᛲ r1 = xhss.AbstractC0073.f392
            r0.add(r1)
            xhss.ᲀᛲᛵᛲ r1 = xhss.AbstractC0073.f374
            r0.add(r1)
            xhss.ᲀᛲᛵᛲ r1 = xhss.AbstractC0073.f376
            r0.add(r1)
            xhss.ᲀᛲᛵᛲ r1 = xhss.AbstractC0073.f395
            r0.add(r1)
            xhss.ᲀᛲᛵᛲ r1 = xhss.AbstractC0073.f373
            r0.add(r1)
            xhss.ᲀᛶᲈᛲ r1 = xhss.C0045.f285
            r0.add(r1)
            xhss.ᲇᲈᛷᲁ r1 = xhss.AbstractC0073.f375
            r0.add(r1)
            r1 = 0
            java.lang.Class<xhss.ᲇᛸᲀᲁ> r3 = xhss.C1070.class
            xhss.ᛳᲈᛷᛸ r5 = xhss.C1070.f3459     // Catch: java.lang.Throwable -> L138
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L138
            java.lang.Object r3 = r3.newInstance(r1)     // Catch: java.lang.Throwable -> L138
            xhss.ᛴᛴᛷᛸ r3 = (xhss.InterfaceC0358) r3     // Catch: java.lang.Throwable -> L138
            xhss.ᲇᛸᲀᲁ r3 = (xhss.C1070) r3     // Catch: java.lang.Throwable -> L138
            r3.getClass()     // Catch: java.lang.Throwable -> L138
            xhss.ᲇᛸᲀᲁ$ᛱᛱᛲᲇ r1 = xhss.C1070.f3462     // Catch: java.lang.Throwable -> L138
        L138:
            if (r1 == 0) goto L13d
            r0.add(r1)
        L13d:
            java.util.List r1 = xhss.AbstractC0685.f2318
            r0.addAll(r1)
            xhss.ᲈᛲᛶ r1 = xhss.C0168.f676
            r0.add(r1)
            xhss.ᲀᛲᛵᛲ r1 = xhss.AbstractC0073.f384
            r0.add(r1)
            xhss.ᲇᲈᛸᛱ r1 = new xhss.ᲇᲈᛸᛱ
            r1.<init>(r9, r4)
            r0.add(r1)
            xhss.ᲇᲈᛸᛱ r1 = new xhss.ᲇᲈᛸᛱ
            r1.<init>(r9, r2)
            r0.add(r1)
            r0.add(r10)
            xhss.ᛸᛵᛳᛵ r1 = xhss.AbstractC0073.f378
            r0.add(r1)
            xhss.ᛷᛲᲀᲀ r2 = new xhss.ᛷᛲᲀᲀ
            java.util.ArrayDeque r1 = r8.f1733
            java.util.List r7 = m876(r1)
            int r4 = r8.f1731
            xhss.ᛱᛷᲈᛱ r5 = r8.f1728
            r3 = r9
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
            r0.trimToSize()
            java.util.List r8 = java.util.Collections.unmodifiableList(r0)
            return r8
    }
}
