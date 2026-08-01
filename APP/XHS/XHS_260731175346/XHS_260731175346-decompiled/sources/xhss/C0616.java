package xhss;

/* JADX INFO: renamed from: xhss.ᛶᲈᛷᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0616 extends xhss.AbstractC0171 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public java.util.List f2131;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final /* synthetic */ int f2132;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public xhss.AbstractC0561 f2133;

    public /* synthetic */ C0616(int r1) {
            r0 = this;
            r0.f2132 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛵᛷᛲᛸ, reason: contains not printable characters */
    public void m1080(xhss.InterfaceC0645 r2) {
            r1 = this;
            xhss.ᲁᛶᛷ r0 = new xhss.ᲁᛶᛷ
            r0.<init>()
            r2.mo112(r0)
            r1.f2133 = r0
            return
    }

    @Override // xhss.AbstractC0561
    /* JADX INFO: renamed from: ᛸᛶᲈᛶ */
    public final int mo135(xhss.C0099 r14) {
            r13 = this;
            int r0 = r13.f2132
            r1 = 3
            r2 = 4
            r3 = 6
            r4 = 7
            r5 = 8
            r6 = -1
            java.lang.String r7 = "not has id"
            r8 = 1
            r9 = 0
            switch(r0) {
                case 0: goto L83;
                default: goto L10;
            }
        L10:
            java.util.List r0 = r13.f2131
            if (r0 == 0) goto L5c
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = xhss.AbstractC0249.m554(r0)
            r10.<init>(r11)
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L43
            java.lang.Object r11 = r0.next()
            xhss.ᲇᛸᛳᛸ r11 = (xhss.C1062) r11
            int r12 = r11.f3095
            if (r12 < 0) goto L3f
            int r11 = r11.f3093
            long r11 = xhss.AbstractC0954.m1548(r11, r12)
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r10.add(r11)
            goto L21
        L3f:
            xhss.C0532.m950(r7)
            goto L82
        L43:
            long[] r0 = xhss.AbstractC0713.m1241(r10)
            int r7 = r0.length
            r14.m263(r5, r7, r5)
            int r5 = r0.length
            int r5 = r5 - r8
        L4d:
            if (r6 >= r5) goto L57
            r10 = r0[r5]
            r14.m252(r10)
            int r5 = r5 + (-1)
            goto L4d
        L57:
            int r0 = r14.m256()
            goto L5d
        L5c:
            r0 = r9
        L5d:
            xhss.ᛶᛵᛱ r13 = r13.f2133
            xhss.ᲁᛶᛷ r13 = (xhss.C0960) r13
            if (r13 == 0) goto L68
            int r13 = r13.mo135(r14)
            goto L69
        L68:
            r13 = r9
        L69:
            r14.m258(r4)
            r14.m253(r3, r13)
            r14.m253(r2, r9)
            r14.m253(r1, r0)
            r14.m253(r8, r9)
            r14.m253(r9, r9)
            int r9 = r14.m257()
            r14.m259(r9)
        L82:
            return r9
        L83:
            java.util.List r0 = r13.f2131
            if (r0 == 0) goto Lcf
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = xhss.AbstractC0249.m554(r0)
            r10.<init>(r11)
            java.util.Iterator r0 = r0.iterator()
        L94:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto Lb6
            java.lang.Object r11 = r0.next()
            xhss.ᲇᛸᛳᛸ r11 = (xhss.C1062) r11
            int r12 = r11.f3095
            if (r12 < 0) goto Lb2
            int r11 = r11.f3093
            long r11 = xhss.AbstractC0954.m1548(r11, r12)
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r10.add(r11)
            goto L94
        Lb2:
            xhss.C0532.m950(r7)
            goto Lf5
        Lb6:
            long[] r0 = xhss.AbstractC0713.m1241(r10)
            int r7 = r0.length
            r14.m263(r5, r7, r5)
            int r5 = r0.length
            int r5 = r5 - r8
        Lc0:
            if (r6 >= r5) goto Lca
            r10 = r0[r5]
            r14.m252(r10)
            int r5 = r5 + (-1)
            goto Lc0
        Lca:
            int r0 = r14.m256()
            goto Ld0
        Lcf:
            r0 = r9
        Ld0:
            xhss.ᛶᛵᛱ r13 = r13.f2133
            xhss.ᛴᲁᛶᲁ r13 = (xhss.C0410) r13
            if (r13 == 0) goto Ldb
            int r13 = r13.mo135(r14)
            goto Ldc
        Ldb:
            r13 = r9
        Ldc:
            r14.m258(r4)
            r14.m253(r3, r13)
            r14.m253(r2, r9)
            r14.m253(r1, r0)
            r14.m253(r8, r9)
            r14.m253(r9, r9)
            int r9 = r14.m257()
            r14.m259(r9)
        Lf5:
            return r9
    }
}
