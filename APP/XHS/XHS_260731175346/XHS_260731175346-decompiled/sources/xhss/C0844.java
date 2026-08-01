package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛲᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0844 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0468 f2743;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.util.Set f2744;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C1037 f2745;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.util.Collection f2746;

    public C0844(xhss.C1037 r2, xhss.C0468 r3, java.util.EnumSet r4, java.util.ArrayList r5) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "jsonProvider can not be null"
            xhss.AbstractC0473.m858(r2, r0)
            java.lang.String r0 = "mappingProvider can not be null"
            xhss.AbstractC0473.m858(r3, r0)
            java.lang.String r0 = "setOptions can not be null"
            xhss.AbstractC0473.m858(r4, r0)
            java.lang.String r0 = "evaluationListeners can not be null"
            xhss.AbstractC0473.m858(r5, r0)
            r1.f2745 = r2
            r1.f2743 = r3
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r4)
            r1.f2744 = r2
            java.util.Collection r2 = java.util.Collections.unmodifiableCollection(r5)
            r1.f2746 = r2
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static xhss.C1068 m1429() {
            xhss.ᲇᛸᛶ r0 = new xhss.ᲇᛸᛶ
            r1 = 1
            r0.<init>(r1)
            java.lang.Class<xhss.ᛳᛳᛱᛳ> r1 = xhss.EnumC0250.class
            java.util.EnumSet r1 = java.util.EnumSet.noneOf(r1)
            r0.f3445 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f3447 = r1
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L39
            java.lang.Class<xhss.ᲀᛲᲇ> r2 = xhss.C0844.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L39
        L10:
            xhss.ᲀᛲᲇ r5 = (xhss.C0844) r5
            xhss.ᲇᛵᛲᲁ r2 = r4.f2745
            java.lang.Class r2 = r2.getClass()
            xhss.ᲇᛵᛲᲁ r3 = r5.f2745
            java.lang.Class r3 = r3.getClass()
            if (r2 != r3) goto L39
            xhss.ᛵᛴᛷᛵ r2 = r4.f2743
            java.lang.Class r2 = r2.getClass()
            xhss.ᛵᛴᛷᛵ r3 = r5.f2743
            java.lang.Class r3 = r3.getClass()
            if (r2 != r3) goto L39
            java.util.Set r4 = r4.f2744
            java.util.Set r5 = r5.f2744
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 == 0) goto L39
            return r0
        L39:
            return r1
    }
}
