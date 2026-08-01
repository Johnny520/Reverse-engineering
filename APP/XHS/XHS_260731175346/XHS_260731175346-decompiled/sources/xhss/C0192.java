package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛷᲁᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0192 implements xhss.InterfaceC0517 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f751;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f752;

    public /* synthetic */ C0192(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f751 = r1
            r0.f752 = r2
            r0.<init>()
            return
    }

    @Override // xhss.InterfaceC0517
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final java.lang.Object mo115(java.lang.Object r11, java.lang.Object r12) {
            r10 = this;
            int r0 = r10.f751
            r1 = 1
            r2 = 0
            java.lang.Object r10 = r10.f752
            r3 = 0
            switch(r0) {
                case 0: goto L29;
                default: goto La;
            }
        La:
            char[] r10 = (char[]) r10
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            int r10 = xhss.AbstractC0120.m353(r11, r10, r12, r2)
            if (r10 >= 0) goto L1b
            goto L28
        L1b:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            xhss.ᲀᛴᛳᛸ r3 = new xhss.ᲀᛴᛳᛸ
            r3.<init>(r10, r11)
        L28:
            return r3
        L29:
            java.util.List r10 = (java.util.List) r10
            r6 = r11
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r11 = r12.intValue()
            int r12 = r10.size()
            if (r12 != r1) goto L6c
            int r12 = r10.size()
            if (r12 == 0) goto L64
            if (r12 != r1) goto L5d
            java.lang.Object r10 = r10.get(r2)
            java.lang.String r10 = (java.lang.String) r10
            r12 = 4
            int r11 = xhss.AbstractC0120.m350(r6, r10, r11, r2, r12)
            if (r11 >= 0) goto L52
        L4f:
            r12 = r3
            goto Lf4
        L52:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            xhss.ᲀᛴᛳᛸ r12 = new xhss.ᲀᛴᛳᛸ
            r12.<init>(r11, r10)
            goto Lf4
        L5d:
            java.lang.String r10 = "List has more than one element."
            xhss.C0532.m959(r10)
            goto L109
        L64:
            java.util.NoSuchElementException r10 = new java.util.NoSuchElementException
            java.lang.String r11 = "List is empty."
            r10.<init>(r11)
            throw r10
        L6c:
            xhss.ᛱᛲᲇᲀ r12 = new xhss.ᛱᛲᲇᲀ
            if (r11 >= 0) goto L71
            r11 = r2
        L71:
            int r0 = r6.length()
            r12.<init>(r11, r0, r1)
            boolean r0 = r6 instanceof java.lang.String
            int r1 = r12.f3092
            int r12 = r12.f3091
            if (r0 == 0) goto Lba
            if (r1 <= 0) goto L84
            if (r11 <= r12) goto L88
        L84:
            if (r1 >= 0) goto L4f
            if (r12 > r11) goto L4f
        L88:
            java.util.Iterator r0 = r10.iterator()
        L8c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto La7
            java.lang.Object r4 = r0.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r5.length()
            boolean r5 = r5.regionMatches(r2, r7, r11, r8)
            if (r5 == 0) goto L8c
            goto La8
        La7:
            r4 = r3
        La8:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto Lb6
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            xhss.ᲀᛴᛳᛸ r12 = new xhss.ᲀᛴᛳᛸ
            r12.<init>(r10, r4)
            goto Lf4
        Lb6:
            if (r11 == r12) goto L4f
            int r11 = r11 + r1
            goto L88
        Lba:
            if (r1 <= 0) goto Lbe
            if (r11 <= r12) goto Lc2
        Lbe:
            if (r1 >= 0) goto L4f
            if (r12 > r11) goto L4f
        Lc2:
            r7 = r11
        Lc3:
            java.util.Iterator r11 = r10.iterator()
        Lc7:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Le1
            java.lang.Object r0 = r11.next()
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            int r8 = r4.length()
            r9 = 0
            boolean r2 = xhss.AbstractC0120.m354(r4, r5, r6, r7, r8, r9)
            if (r2 == 0) goto Lc7
            goto Le2
        Le1:
            r0 = r3
        Le2:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lf0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            xhss.ᲀᛴᛳᛸ r12 = new xhss.ᲀᛴᛳᛸ
            r12.<init>(r10, r0)
            goto Lf4
        Lf0:
            if (r7 == r12) goto L4f
            int r7 = r7 + r1
            goto Lc3
        Lf4:
            if (r12 == 0) goto L109
            java.lang.Object r10 = r12.f2767
            java.lang.Object r11 = r12.f2768
            java.lang.String r11 = (java.lang.String) r11
            int r11 = r11.length()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            xhss.ᲀᛴᛳᛸ r3 = new xhss.ᲀᛴᛳᛸ
            r3.<init>(r10, r11)
        L109:
            return r3
    }
}
