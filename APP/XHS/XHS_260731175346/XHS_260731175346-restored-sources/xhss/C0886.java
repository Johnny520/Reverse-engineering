package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛸᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0886 extends xhss.AbstractC0652 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0623 f2860;

    public C0886(xhss.C0623 r1) {
            r0 = this;
            r0.<init>()
            r0.f2860 = r1
            return
    }

    @Override // xhss.AbstractC0652, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r0 = 1
            goto L6
        L4:
            boolean r0 = r2 instanceof xhss.C0655
        L6:
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            xhss.ᛷᛴᲇᲀ r2 = (xhss.C0655) r2
            boolean r1 = super.contains(r2)
            return r1
    }

    @Override // xhss.AbstractC0652, java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r4 = this;
            xhss.ᛱᛲᲇᲀ r0 = new xhss.ᛱᛲᲇᲀ
            int r1 = r4.size()
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            r0.<init>(r3, r1, r2)
            xhss.ᲈᛱᛱᲀ r1 = new xhss.ᲈᛱᛱᲀ
            r2 = 0
            r1.<init>(r2, r0)
            xhss.ᲇᛴᲇᛵ r0 = new xhss.ᲇᛴᲇᛵ
            r2 = 4
            r0.<init>(r2, r4)
            xhss.ᲀᛲᲇᛲ r4 = new xhss.ᲀᛲᲇᛲ
            r2 = 1
            r4.<init>(r1, r0, r2)
            xhss.ᛵᛴᛱᲈ r0 = new xhss.ᛵᛴᛱᲈ
            r0.<init>(r4)
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0655 m1451(int r3) {
            r2 = this;
            xhss.ᛷᛱᛳᲁ r2 = r2.f2860
            java.lang.Object r2 = r2.f2151
            java.util.regex.Matcher r2 = (java.util.regex.Matcher) r2
            int r0 = r2.start(r3)
            int r1 = r2.end(r3)
            xhss.ᛱᛲᲇᲀ r0 = xhss.AbstractC0473.m855(r0, r1)
            int r1 = r0.f3090
            if (r1 < 0) goto L20
            xhss.ᛷᛴᲇᲀ r1 = new xhss.ᛷᛴᲇᲀ
            java.lang.String r2 = r2.group(r3)
            r1.<init>(r2, r0)
            return r1
        L20:
            r2 = 0
            return r2
    }

    @Override // xhss.AbstractC0652
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final int mo426() {
            r0 = this;
            xhss.ᛷᛱᛳᲁ r0 = r0.f2860
            java.lang.Object r0 = r0.f2151
            java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
            int r0 = r0.groupCount()
            int r0 = r0 + 1
            return r0
    }
}
