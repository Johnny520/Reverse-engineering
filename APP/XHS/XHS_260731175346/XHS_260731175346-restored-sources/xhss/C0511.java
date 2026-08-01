package xhss;

/* JADX INFO: renamed from: xhss.ᛵᲀᛲᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0511 extends xhss.AbstractC0252 {

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final java.lang.String f1865;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final java.util.List f1866;

    public C0511(java.util.List r2, char r3) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L12
            r1.f1866 = r2
            java.lang.String r2 = java.lang.Character.toString(r3)
            r1.f1865 = r2
            return
        L12:
            xhss.ᲁᲀᛳ r1 = new xhss.ᲁᲀᛳ
            java.lang.String r2 = "Empty properties"
            r1.<init>(r2)
            throw r1
    }

    @Override // xhss.AbstractC0252
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.String mo130() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            java.lang.String r1 = r3.f1865
            java.util.List r3 = r3.f1866
            java.lang.String r2 = ","
            java.lang.String r3 = xhss.AbstractC0473.m868(r2, r1, r3)
            r0.append(r3)
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // xhss.AbstractC0252
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo131(java.lang.String r4, xhss.AbstractC0356 r5, java.lang.Object r6, xhss.C0530 r7) {
            r3 = this;
            xhss.ᲀᛲᲇ r5 = r7.f1940
            xhss.ᲇᛵᛲᲁ r0 = r5.f2745
            r0.getClass()
            boolean r0 = r6 instanceof java.util.Map
            if (r0 != 0) goto L69
            boolean r7 = r3.m561()
            if (r7 == 0) goto La4
            java.util.Set r7 = r5.f2744
            xhss.ᛳᛳᛱᛳ r0 = xhss.EnumC0250.f930
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto L1d
            goto La4
        L1d:
            if (r6 != 0) goto L22
            java.lang.String r6 = "null"
            goto L2a
        L22:
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
        L2a:
            xhss.ᛸᲁᛴᛷ r7 = new xhss.ᛸᲁᛴᛷ
            java.lang.String r3 = r3.mo130()
            xhss.ᲇᛵᛲᲁ r5 = r5.f2745
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected to find an object with property "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " in path "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = " but found '"
            r0.append(r3)
            r0.append(r6)
            java.lang.String r3 = "'. This is not a json object according to the JsonProvider: '"
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = "'."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r7.<init>(r3)
            throw r7
        L69:
            java.util.List r5 = r3.f1866
            int r0 = r5.size()
            r1 = 1
            if (r0 != r1) goto L73
            goto L7f
        L73:
            boolean r0 = r3.m559()
            if (r0 == 0) goto L83
            int r0 = r5.size()
            if (r0 <= r1) goto L83
        L7f:
            r3.m562(r4, r6, r7, r5)
            return
        L83:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r1 = 0
            r0.add(r1)
            java.util.Iterator r5 = r5.iterator()
        L90:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto La4
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            r0.set(r2, r1)
            r3.m562(r4, r6, r7, r0)
            goto L90
        La4:
            return
    }

    @Override // xhss.AbstractC0252
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public final boolean mo133() {
            r3 = this;
            java.util.List r0 = r3.f1866
            int r1 = r0.size()
            r2 = 1
            if (r1 != r2) goto La
            goto L16
        La:
            boolean r3 = r3.m559()
            if (r3 == 0) goto L17
            int r3 = r0.size()
            if (r3 <= r2) goto L17
        L16:
            return r2
        L17:
            r3 = 0
            return r3
    }
}
