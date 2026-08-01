package xhss;

/* JADX INFO: renamed from: xhss.ᛶᛵᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0562 extends xhss.AbstractC0121 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0199 f1988;

    public AbstractC0562(xhss.C0199 r1) {
            r0 = this;
            r0.<init>()
            r0.f1988 = r1
            return
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo119(xhss.C0385 r4) {
            r3 = this;
            int r0 = r4.m762()
            r1 = 9
            if (r0 != r1) goto Ld
            r4.m756()
            r3 = 0
            return r3
        Ld:
            java.lang.Object r0 = r3.mo289()
            xhss.ᛲᛸᲈᲇ r1 = r3.f1988
            java.util.Map r1 = r1.f760
            r4.m743()     // Catch: java.lang.IllegalAccessException -> L3a java.lang.IllegalStateException -> L45
        L18:
            boolean r2 = r4.m744()     // Catch: java.lang.IllegalAccessException -> L3a java.lang.IllegalStateException -> L45
            if (r2 == 0) goto L32
            java.lang.String r2 = r4.m765()     // Catch: java.lang.IllegalAccessException -> L3a java.lang.IllegalStateException -> L45
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.IllegalAccessException -> L3a java.lang.IllegalStateException -> L45
            xhss.ᲁᲀᛸᛲ r2 = (xhss.C0981) r2     // Catch: java.lang.IllegalAccessException -> L3a java.lang.IllegalStateException -> L45
            if (r2 != 0) goto L2e
            r4.m753()     // Catch: java.lang.IllegalAccessException -> L3a java.lang.IllegalStateException -> L45
            goto L18
        L2e:
            r3.mo290(r0, r4, r2)     // Catch: java.lang.IllegalAccessException -> L3a java.lang.IllegalStateException -> L45
            goto L18
        L32:
            r4.m750()
            java.lang.Object r3 = r3.mo288(r0)
            return r3
        L3a:
            r3 = move-exception
            xhss.ᲈᲀᲀᛱ r4 = xhss.AbstractC1031.f3335
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r0 = "Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."
            r4.<init>(r0, r3)
            throw r4
        L45:
            r3 = move-exception
            xhss.ᛱᲈᛲᛷ r4 = new xhss.ᛱᲈᛲᛷ
            r4.<init>(r3)
            throw r4
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final void mo120(xhss.C0827 r2, java.lang.Object r3) {
            r1 = this;
            if (r3 != 0) goto L6
            r2.m1396()
            return
        L6:
            r2.m1407()
            xhss.ᛲᛸᲈᲇ r1 = r1.f1988     // Catch: java.lang.IllegalAccessException -> L25
            java.util.List r1 = r1.f759     // Catch: java.lang.IllegalAccessException -> L25
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.IllegalAccessException -> L25
        L11:
            boolean r0 = r1.hasNext()     // Catch: java.lang.IllegalAccessException -> L25
            if (r0 == 0) goto L21
            java.lang.Object r0 = r1.next()     // Catch: java.lang.IllegalAccessException -> L25
            xhss.ᲁᲀᛸᛲ r0 = (xhss.C0981) r0     // Catch: java.lang.IllegalAccessException -> L25
            r0.m1617(r2, r3)     // Catch: java.lang.IllegalAccessException -> L25
            goto L11
        L21:
            r2.m1399()
            return
        L25:
            r1 = move-exception
            xhss.ᲈᲀᲀᛱ r2 = xhss.AbstractC1031.f3335
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."
            r2.<init>(r3, r1)
            throw r2
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public abstract java.lang.Object mo288(java.lang.Object r1);

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public abstract java.lang.Object mo289();

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ */
    public abstract void mo290(java.lang.Object r1, xhss.C0385 r2, xhss.C0981 r3);
}
