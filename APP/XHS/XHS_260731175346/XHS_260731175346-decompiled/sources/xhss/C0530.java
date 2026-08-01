package xhss;

/* JADX INFO: renamed from: xhss.ᛵᲈᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0530 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.Object f1937;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.Object f1938;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final java.lang.Object f1939;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0844 f1940;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public int f1941;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final boolean f1942;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.C0417 f1943;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final java.util.HashMap f1944;

    static {
            xhss.ᛷᲀᛴᛲ r0 = new xhss.ᛷᲀᛴᛲ
            r0.<init>()
            return
    }

    public C0530(xhss.C0417 r2, java.lang.Object r3, xhss.C0844 r4) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f1944 = r0
            r0 = 0
            r1.f1941 = r0
            java.lang.String r0 = "root can not be null"
            xhss.AbstractC0473.m858(r3, r0)
            java.lang.String r0 = "configuration can not be null"
            xhss.AbstractC0473.m858(r4, r0)
            r1.f1943 = r2
            r1.f1939 = r3
            r1.f1940 = r4
            xhss.ᲇᛵᛲᲁ r2 = r4.f2745
            java.lang.Object r3 = r2.f3349
            xhss.ᛸᛵᛷᲁ r3 = (xhss.C0768) r3
            r3.getClass()
            xhss.ᛸᛱᲈᛵ r3 = new xhss.ᛸᛱᲈᛵ
            r3.<init>()
            r1.f1937 = r3
            java.lang.Object r2 = r2.f3349
            xhss.ᛸᛵᛷᲁ r2 = (xhss.C0768) r2
            r2.getClass()
            xhss.ᛸᛱᲈᛵ r2 = new xhss.ᛸᛱᲈᛵ
            r2.<init>()
            r1.f1938 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            xhss.ᛳᛳᛱᛳ r2 = xhss.EnumC0250.f930
            java.util.Set r3 = r4.f2744
            boolean r2 = r3.contains(r2)
            r1.f1942 = r2
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.util.ArrayList m942() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r2.f1941
            if (r1 <= 0) goto L27
            xhss.ᲀᛲᲇ r1 = r2.f1940
            xhss.ᲇᛵᛲᲁ r1 = r1.f2745
            java.lang.Object r2 = r2.f1938
            java.lang.Iterable r2 = r1.m1691(r2)
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
            goto L17
        L27:
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.Object m943(boolean r5) {
            r4 = this;
            xhss.ᛴᲇᲀᛴ r0 = r4.f1943
            xhss.ᲀᛷᲈᛳ r0 = r0.f1479
            boolean r1 = r0.m563()
            java.lang.Object r2 = r4.f1937
            if (r1 == 0) goto L4d
            int r1 = r4.f1941
            r3 = 0
            if (r1 != 0) goto L2e
            boolean r4 = r4.f1942
            if (r4 == 0) goto L16
            return r3
        L16:
            xhss.ᛸᲁᛴᛷ r4 = new xhss.ᛸᲁᛴᛷ
            java.lang.String r5 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No results for path: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        L2e:
            xhss.ᲀᛲᲇ r4 = r4.f1940
            xhss.ᲇᛵᛲᲁ r0 = r4.f2745
            xhss.ᲇᛵᛲᲁ r4 = r4.f2745
            int r0 = r0.m1696(r2)
            if (r0 <= 0) goto L45
            int r0 = r0 + (-1)
            r4.getClass()
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r2.get(r0)
        L45:
            if (r3 == 0) goto L4c
            if (r5 == 0) goto L4c
            r4.getClass()
        L4c:
            return r3
        L4d:
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m944(java.lang.String r4, xhss.AbstractC0356 r5, java.lang.Object r6) {
            r3 = this;
            xhss.ᲀᛲᲇ r5 = r3.f1940
            xhss.ᲇᛵᛲᲁ r0 = r5.f2745
            int r1 = r3.f1941
            java.lang.Object r2 = r3.f1937
            r0.m1689(r1, r2, r6)
            xhss.ᲇᛵᛲᲁ r6 = r5.f2745
            int r0 = r3.f1941
            java.lang.Object r1 = r3.f1938
            r6.m1689(r0, r1, r4)
            int r4 = r3.f1941
            int r4 = r4 + 1
            r3.f1941 = r4
            java.util.Collection r3 = r5.f2746
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L3a
            java.util.Iterator r3 = r3.iterator()
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L2d
            goto L3a
        L2d:
            java.lang.Object r3 = r3.next()
            r3.getClass()
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            r3.<init>()
            throw r3
        L3a:
            return
    }
}
