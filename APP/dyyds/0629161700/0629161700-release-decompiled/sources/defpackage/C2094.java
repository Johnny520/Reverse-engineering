package defpackage;

/* JADX INFO: renamed from: ᲇᛷᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2094 {

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static final defpackage.C0682 f8945 = null;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static final defpackage.C0245 f8946 = null;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public static final int f8947 = 0;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public static final defpackage.C2094 f8948 = null;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static final defpackage.C0622 f8949 = null;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static final java.util.List f8950 = null;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public static final int f8951 = 0;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public static final int f8952 = 0;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final int f8953;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final int f8954;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public defpackage.C0622 f8955;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.util.ArrayList f8956;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.ArrayList f8957;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1814 f8958;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.util.HashMap f8959;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.util.ArrayDeque f8960;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final int f8961;

    static {
            ᛴᛲᛵᛱ r0 = defpackage.C0622.f3054
            defpackage.C2094.f8949 = r0
            r0 = 1
            defpackage.C2094.f8947 = r0
            defpackage.C2094.f8952 = r0
            r0 = 2
            defpackage.C2094.f8951 = r0
            ᛴᛵᲇᲇ r0 = new ᛴᛵᲇᲇ
            java.util.Map r1 = java.util.Collections.EMPTY_MAP
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            r3 = 15
            r0.<init>(r1, r3, r2)
            defpackage.C2094.f8945 = r0
            ᛲᛲᛲᛵ r1 = new ᛲᛲᛲᛵ
            r1.<init>(r0)
            defpackage.C2094.f8946 = r1
            ᲇᛷᛸᲇ r2 = new ᲇᛷᛸᲇ
            r2.<init>()
            defpackage.C2094.f8948 = r2
            java.util.List r0 = r2.m3520(r0, r1)
            defpackage.C2094.f8950 = r0
            return
    }

    public C2094() {
            r1 = this;
            r1.<init>()
            ᲁᛲᛷᛲ r0 = defpackage.C1814.f7940
            r1.f8958 = r0
            int r0 = defpackage.C2094.f8947
            r1.f8961 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f8959 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f8957 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f8956 = r0
            ᛴᛲᛵᛱ r0 = defpackage.C2094.f8949
            r1.f8955 = r0
            int r0 = defpackage.C2094.f8952
            r1.f8953 = r0
            int r0 = defpackage.C2094.f8951
            r1.f8954 = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.f8960 = r0
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static java.util.List m3519(java.util.AbstractCollection r2) {
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

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.List m3520(defpackage.C0682 r9, defpackage.C0245 r10) {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ᛳᛴᛷᲈ r1 = defpackage.AbstractC1108.f4954
            r0.add(r1)
            int r1 = r8.f8953
            r2 = 1
            if (r1 != r2) goto L12
            ᲁᲈᲀᛸ r1 = defpackage.C1446.f6347
            goto L18
        L12:
            ᲁᲈᲀᛸ r3 = new ᲁᲈᲀᛸ
            r3.<init>(r1)
            r1 = r3
        L18:
            r0.add(r1)
            ᲁᛲᛷᛲ r1 = r8.f8958
            r0.add(r1)
            java.util.ArrayList r1 = r8.f8957
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L33
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            java.util.Collections.reverse(r3)
            r0.addAll(r3)
        L33:
            java.util.ArrayList r1 = r8.f8956
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L46
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            java.util.Collections.reverse(r3)
            r0.addAll(r3)
        L46:
            java.util.List r1 = defpackage.AbstractC0463.f2338
            ᛳᛴᛷᲈ r1 = defpackage.AbstractC1108.f4968
            r0.add(r1)
            ᛶᛱᲀᛵ r1 = defpackage.AbstractC1108.f4974
            r0.add(r1)
            ᛶᛱᲀᛵ r1 = defpackage.AbstractC1108.f4958
            r0.add(r1)
            ᛶᛱᲀᛵ r1 = defpackage.AbstractC1108.f4955
            r0.add(r1)
            ᛶᛱᲀᛵ r1 = defpackage.AbstractC1108.f4971
            r0.add(r1)
            ᲁᛷᛸᛲ r1 = defpackage.AbstractC1108.f4947
            ᛶᛱᲀᛵ r3 = new ᛶᛱᲀᛵ
            java.lang.Class r4 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r5 = java.lang.Long.class
            r3.<init>(r4, r5, r1)
            r0.add(r3)
            ᛴᲇᲁᛴ r3 = defpackage.AbstractC1108.f4957
            ᛶᛱᲀᛵ r4 = new ᛶᛱᲀᛵ
            java.lang.Class r5 = java.lang.Double.TYPE
            java.lang.Class<java.lang.Double> r6 = java.lang.Double.class
            r4.<init>(r5, r6, r3)
            r0.add(r4)
            ᛴᲇᲁᛴ r3 = defpackage.AbstractC1108.f4948
            ᛶᛱᲀᛵ r4 = new ᛶᛱᲀᛵ
            java.lang.Class r5 = java.lang.Float.TYPE
            java.lang.Class<java.lang.Float> r6 = java.lang.Float.class
            r4.<init>(r5, r6, r3)
            r0.add(r4)
            r3 = 2
            r4 = 0
            int r5 = r8.f8954
            if (r5 != r3) goto L94
            ᛳᛳᲇᛴ r3 = defpackage.C0186.f1252
            goto L9f
        L94:
            ᛱᲁᲁᛲ r3 = new ᛱᲁᲁᛲ
            r3.<init>(r5)
            ᛳᛳᲇᛴ r5 = new ᛳᛳᲇᛴ
            r5.<init>(r3, r4)
            r3 = r5
        L9f:
            r0.add(r3)
            ᛳᛴᛷᲈ r3 = defpackage.AbstractC1108.f4946
            r0.add(r3)
            ᛳᛴᛷᲈ r3 = defpackage.AbstractC1108.f4949
            r0.add(r3)
            ᛷᛱᲀᛸ r3 = new ᛷᛱᲀᛸ
            r3.<init>(r1, r2)
            ᛴᛶᲁᛸ r3 = r3.m1677()
            ᛳᛴᛷᲈ r5 = new ᛳᛴᛷᲈ
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r6 = java.util.concurrent.atomic.AtomicLong.class
            r5.<init>(r6, r3, r4)
            r0.add(r5)
            ᛷᛱᲀᛸ r3 = new ᛷᛱᲀᛸ
            r3.<init>(r1, r4)
            ᛴᛶᲁᛸ r1 = r3.m1677()
            ᛳᛴᛷᲈ r3 = new ᛳᛴᛷᲈ
            java.lang.Class<java.util.concurrent.atomic.AtomicLongArray> r5 = java.util.concurrent.atomic.AtomicLongArray.class
            r3.<init>(r5, r1, r4)
            r0.add(r3)
            ᛳᛴᛷᲈ r1 = defpackage.AbstractC1108.f4962
            r0.add(r1)
            ᛶᛱᲀᛵ r1 = defpackage.AbstractC1108.f4963
            r0.add(r1)
            ᛳᛴᛷᲈ r1 = defpackage.AbstractC1108.f4953
            r0.add(r1)
            ᛳᛴᛷᲈ r1 = defpackage.AbstractC1108.f4951
            r0.add(r1)
            ᛳᛴᛷᲈ r1 = defpackage.AbstractC1108.f4952
            r0.add(r1)
            ᛳᛴᛷᲈ r1 = defpackage.AbstractC1108.f4972
            r0.add(r1)
            ᛳᛴᛷᲈ r1 = defpackage.AbstractC1108.f4967
            r0.add(r1)
            ᛳᛴᛷᲈ r1 = defpackage.AbstractC1108.f4950
            r0.add(r1)
            ᛳᛴᛷᲈ r1 = defpackage.AbstractC1108.f4959
            r0.add(r1)
            ᛳᛴᛷᲈ r1 = defpackage.AbstractC1108.f4965
            r0.add(r1)
            ᛳᛴᛷᲈ r1 = defpackage.AbstractC1108.f4973
            r0.add(r1)
            ᛳᛴᛷᲈ r1 = defpackage.AbstractC1108.f4966
            r0.add(r1)
            ᛳᛴᛷᲈ r1 = defpackage.AbstractC1108.f4964
            r0.add(r1)
            ᛳᛴᛷᲈ r1 = defpackage.AbstractC1108.f4970
            r0.add(r1)
            ᲇᲀᲁᛶ r1 = defpackage.C1489.f6578
            r0.add(r1)
            ᛳᛳᲇᛴ r1 = defpackage.AbstractC1108.f4969
            r0.add(r1)
            r1 = 0
            java.lang.Class<ᛴᛸᲇᛸ> r3 = defpackage.C0736.class
            ᲁᛲᲀᲁ r5 = defpackage.C0736.f3483     // Catch: java.lang.Throwable -> L138
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L138
            java.lang.Object r3 = r3.newInstance(r1)     // Catch: java.lang.Throwable -> L138
            ᲈᲁᛲᛲ r3 = (defpackage.InterfaceC2331) r3     // Catch: java.lang.Throwable -> L138
            ᛴᛸᲇᛸ r3 = (defpackage.C0736) r3     // Catch: java.lang.Throwable -> L138
            r3.getClass()     // Catch: java.lang.Throwable -> L138
            ᛴᛸᲇᛸ$ᲇᛶᛵᲇ r1 = defpackage.C0736.f3484     // Catch: java.lang.Throwable -> L138
        L138:
            if (r1 == 0) goto L13d
            r0.add(r1)
        L13d:
            java.util.List r1 = defpackage.AbstractC0463.f2338
            r0.addAll(r1)
            ᛱᲀᛲᲀ r1 = defpackage.C0182.f1223
            r0.add(r1)
            ᛳᛴᛷᲈ r1 = defpackage.AbstractC1108.f4961
            r0.add(r1)
            ᛸᲇᛱ r1 = new ᛸᲇᛱ
            r1.<init>(r9, r4)
            r0.add(r1)
            ᛸᲇᛱ r1 = new ᛸᲇᛱ
            r1.<init>(r9, r2)
            r0.add(r1)
            r0.add(r10)
            ᛵᛴᲈᛷ r1 = defpackage.AbstractC1108.f4956
            r0.add(r1)
            ᲇᛶᛴᲀ r2 = new ᲇᛶᛴᲀ
            java.util.ArrayDeque r1 = r8.f8960
            java.util.List r7 = m3519(r1)
            int r4 = r8.f8961
            ᲁᛲᛷᛲ r5 = r8.f8958
            r3 = r9
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
            r0.trimToSize()
            java.util.List r8 = java.util.Collections.unmodifiableList(r0)
            return r8
    }
}
