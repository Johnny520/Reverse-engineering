package xhss;

/* JADX INFO: renamed from: xhss.ᛶᛸᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0588 extends xhss.AbstractC0561 {

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public java.lang.Object f2045;

    /* JADX INFO: renamed from: ᛵᛲᲁᛶ, reason: contains not printable characters */
    public final void m1051(java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = r3.f2045
            if (r0 != 0) goto L7
            r3.f2045 = r4
            return
        L7:
            java.lang.Class r4 = r3.getClass()
            java.lang.reflect.Member r0 = r3.mo464()
            java.lang.Object r3 = r3.f2045
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Instance already set for this resolver \""
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = "\" of \""
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = "("
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = ")\". To prevent problems, the instance object can only be set once in a resolver, otherwise use copy() to reuse the resolver."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    /* JADX INFO: renamed from: ᛵᛷᛲᛸ */
    public abstract xhss.AbstractC0588 mo463(java.lang.Object r1);
}
