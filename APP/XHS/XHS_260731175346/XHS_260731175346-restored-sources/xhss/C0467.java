package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛴᛳᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0467 extends xhss.AbstractC0561 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public xhss.C0467 f1685;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public java.util.ArrayList f1686;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public xhss.C0643 f1687;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public xhss.C0487 f1688;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public xhss.C0241 f1689;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public xhss.C0824 f1690;

    /* JADX INFO: renamed from: ᛵᛷᛲᛸ, reason: contains not printable characters */
    public static /* synthetic */ void m844(xhss.C0467 r1, java.lang.String r2, int r3) {
            r0 = 2
            r3 = r3 & r0
            if (r3 == 0) goto L5
            r0 = 5
        L5:
            r3 = 0
            r1.m847(r2, r0, r3)
            return
    }

    /* JADX INFO: renamed from: ᛱᲈᛳᛴ, reason: contains not printable characters */
    public final void m845(xhss.InterfaceC0645 r2) {
            r1 = this;
            xhss.ᛵᛷᛲᛱ r0 = new xhss.ᛵᛷᛲᛱ
            r0.<init>()
            r2.mo112(r0)
            r1.f1688 = r0
            return
    }

    /* JADX INFO: renamed from: ᛴᲀᛸᛵ, reason: contains not printable characters */
    public final void m846(java.lang.String... r8) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r8.length
            r0.<init>(r1)
            int r1 = r8.length
            r2 = 0
            r3 = r2
        L9:
            if (r3 >= r1) goto L19
            r4 = r8[r3]
            xhss.ᛳᛲᛶᛶ r5 = new xhss.ᛳᛲᛶᛶ
            r6 = 5
            r5.<init>(r4, r6, r2)
            r0.add(r5)
            int r3 = r3 + 1
            goto L9
        L19:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            r7.f1686 = r8
            return
    }

    /* JADX INFO: renamed from: ᛵᛲᲁᛶ, reason: contains not printable characters */
    public final void m847(java.lang.String r2, int r3, boolean r4) {
            r1 = this;
            xhss.ᛳᛲᛶᛶ r0 = new xhss.ᛳᛲᛶᛶ
            r0.<init>(r2, r3, r4)
            r1.f1689 = r0
            return
    }

    /* JADX INFO: renamed from: ᛸᛴᛸᛲ, reason: contains not printable characters */
    public final void m848(xhss.InterfaceC0645 r2) {
            r1 = this;
            xhss.ᛷᛴᛱᛱ r0 = new xhss.ᛷᛴᛱᛱ
            r0.<init>()
            r2.mo112(r0)
            r1.f1687 = r0
            return
    }

    @Override // xhss.AbstractC0561
    /* JADX INFO: renamed from: ᛸᛶᲈᛶ */
    public final int mo135(xhss.C0099 r9) {
            r8 = this;
            xhss.ᛳᛲᛶᛶ r0 = r8.f1689
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.mo135(r9)
            goto Lb
        La:
            r0 = r1
        Lb:
            xhss.ᛵᛴᛳᛶ r2 = r8.f1685
            if (r2 == 0) goto L14
            int r2 = r2.mo135(r9)
            goto L15
        L14:
            r2 = r1
        L15:
            xhss.ᛸᲈᛴᛸ r3 = r8.f1690
            if (r3 == 0) goto L1e
            int r3 = r3.mo135(r9)
            goto L1f
        L1e:
            r3 = r1
        L1f:
            xhss.ᛵᛷᛲᛱ r4 = r8.f1688
            if (r4 == 0) goto L28
            int r4 = r4.mo135(r9)
            goto L29
        L28:
            r4 = r1
        L29:
            xhss.ᛷᛴᛱᛱ r5 = r8.f1687
            if (r5 == 0) goto L32
            int r5 = r5.mo135(r9)
            goto L33
        L32:
            r5 = r1
        L33:
            java.util.ArrayList r8 = r8.f1686
            if (r8 == 0) goto L65
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = xhss.AbstractC0249.m554(r8)
            r6.<init>(r7)
            java.util.Iterator r8 = r8.iterator()
        L44:
            boolean r7 = r8.hasNext()
            if (r7 == 0) goto L5c
            java.lang.Object r7 = r8.next()
            xhss.ᛳᛲᛶᛶ r7 = (xhss.C0241) r7
            int r7 = r7.mo135(r9)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.add(r7)
            goto L44
        L5c:
            int[] r8 = xhss.AbstractC0713.m1238(r6)
            int r8 = r9.m260(r8)
            goto L66
        L65:
            r8 = r1
        L66:
            r6 = 12
            r9.m258(r6)
            r6 = 11
            r9.m253(r6, r1)
            r6 = 10
            r9.m253(r6, r1)
            r6 = 9
            r9.m253(r6, r1)
            r6 = 8
            r9.m253(r6, r8)
            r8 = 7
            r9.m253(r8, r5)
            r8 = 6
            r9.m253(r8, r4)
            r8 = 5
            r9.m253(r8, r1)
            r8 = 4
            r9.m253(r8, r3)
            r8 = 3
            r9.m253(r8, r2)
            r8 = 2
            r9.m253(r8, r1)
            r8 = 1
            r9.m253(r8, r0)
            r9.m253(r1, r1)
            int r8 = r9.m257()
            r9.m259(r8)
            return r8
    }

    /* JADX INFO: renamed from: ᲁᛷᲇᲇ, reason: contains not printable characters */
    public final void m849(xhss.InterfaceC0645 r2) {
            r1 = this;
            xhss.ᛵᛴᛳᛶ r0 = new xhss.ᛵᛴᛳᛶ
            r0.<init>()
            r2.mo112(r0)
            r1.f1685 = r0
            return
    }
}
