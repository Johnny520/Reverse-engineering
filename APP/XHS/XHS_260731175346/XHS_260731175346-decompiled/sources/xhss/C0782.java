package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛷᛲᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0782 extends xhss.AbstractC0252 {
    @Override // xhss.AbstractC0252
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.String mo130() {
            r0 = this;
            java.lang.String r0 = "[*]"
            return r0
    }

    @Override // xhss.AbstractC0252
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo131(java.lang.String r5, xhss.AbstractC0356 r6, java.lang.Object r7, xhss.C0530 r8) {
            r4 = this;
            xhss.ᲀᛲᲇ r6 = r8.f1940
            xhss.ᲇᛵᛲᲁ r0 = r6.f2745
            r0.getClass()
            boolean r0 = r7 instanceof java.util.Map
            if (r0 == 0) goto L29
            xhss.ᲇᛵᛲᲁ r6 = r6.f2745
            java.util.Set r6 = r6.m1690(r7)
            java.util.Iterator r6 = r6.iterator()
        L15:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r4.m562(r5, r7, r8, r0)
            goto L15
        L29:
            xhss.ᲇᛵᛲᲁ r0 = r6.f2745
            r0.getClass()
            boolean r0 = r7 instanceof java.util.List
            if (r0 == 0) goto L4e
            r0 = 0
        L33:
            xhss.ᲇᛵᛲᲁ r1 = r6.f2745
            int r1 = r1.m1696(r7)
            if (r0 >= r1) goto L4e
            r4.m558(r0, r5, r7, r8)     // Catch: xhss.C0806 -> L3f
            goto L4a
        L3f:
            r1 = move-exception
            java.util.Set r2 = r6.f2744
            xhss.ᛳᛳᛱᛳ r3 = xhss.EnumC0250.f933
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L4d
        L4a:
            int r0 = r0 + 1
            goto L33
        L4d:
            throw r1
        L4e:
            return
    }

    @Override // xhss.AbstractC0252
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public final boolean mo133() {
            r0 = this;
            r0 = 0
            return r0
    }
}
