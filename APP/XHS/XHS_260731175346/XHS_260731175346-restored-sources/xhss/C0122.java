package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛱᛶᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0122 extends xhss.AbstractC1169 implements xhss.InterfaceC0336, xhss.InterfaceC0645 {
    public C0122(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            r1 = 0
            xhss.ᛲᛵᲇᛲ r3 = xhss.C0167.f675
            java.lang.Class<xhss.ᛳᛱᛲᛲ> r2 = xhss.C0229.class
            r0 = r6
            r4 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // xhss.AbstractC0006
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public final xhss.InterfaceC0957 mo92() {
            r1 = this;
            xhss.ᛷᛸᲈᛳ r0 = xhss.AbstractC0256.f946
            r0.getClass()
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final void m358() {
            r1 = this;
            boolean r0 = r1.f2578
            if (r0 != 0) goto L1a
            xhss.ᲁᛶᛳᲀ r0 = r1.m1356()
            if (r0 == r1) goto L12
            xhss.ᛴᛲᛱᲇ r0 = (xhss.InterfaceC0336) r0
            xhss.ᛲᛱᛶᛵ r0 = (xhss.C0122) r0
            r0.m358()
            return
        L12:
            xhss.ᛲᛳᛱᲁ r1 = new xhss.ᛲᛳᛱᲁ
            java.lang.String r0 = "Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath"
            r1.<init>(r0)
            throw r1
        L1a:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980"
            r1.<init>(r0)
            throw r1
    }

    @Override // xhss.InterfaceC0645
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public final java.lang.Object mo112(java.lang.Object r1) {
            r0 = this;
            r0.m358()
            r0 = 0
            throw r0
    }
}
