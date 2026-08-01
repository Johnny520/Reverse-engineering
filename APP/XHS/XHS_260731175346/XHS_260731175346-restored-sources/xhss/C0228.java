package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛱᛱᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0228 implements java.util.Iterator {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public xhss.C0445 f842;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public xhss.C0445 f843;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0042 f844;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f845;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f846;

    public C0228(xhss.C0042 r1, int r2) {
            r0 = this;
            r0.f846 = r2
            r0.<init>()
            r0.f844 = r1
            xhss.ᛵᛲᛶᛵ r2 = r1.f280
            xhss.ᛵᛲᛶᛵ r2 = r2.f1585
            r0.f842 = r2
            r2 = 0
            r0.f843 = r2
            int r1 = r1.f282
            r0.f845 = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            xhss.ᛵᛲᛶᛵ r0 = r1.f842
            xhss.ᛱᛴᲈᛵ r1 = r1.f844
            xhss.ᛵᛲᛶᛵ r1 = r1.f280
            if (r0 == r1) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
            r1 = this;
            int r0 = r1.f846
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.m500()
            return r1
        La:
            xhss.ᛵᛲᛶᛵ r1 = r1.m499()
            java.lang.Object r1 = r1.f1589
            return r1
    }

    @Override // java.util.Iterator
    public final void remove() {
            r3 = this;
            xhss.ᛵᛲᛶᛵ r0 = r3.f843
            if (r0 == 0) goto L12
            r1 = 1
            xhss.ᛱᛴᲈᛵ r2 = r3.f844
            r2.m155(r0, r1)
            r0 = 0
            r3.f843 = r0
            int r0 = r2.f282
            r3.f845 = r0
            return
        L12:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0445 m499() {
            r3 = this;
            xhss.ᛵᛲᛶᛵ r0 = r3.f842
            xhss.ᛱᛴᲈᛵ r1 = r3.f844
            xhss.ᛵᛲᛶᛵ r2 = r1.f280
            if (r0 == r2) goto L1b
            int r1 = r1.f282
            int r2 = r3.f845
            if (r1 != r2) goto L15
            xhss.ᛵᛲᛶᛵ r1 = r0.f1585
            r3.f842 = r1
            r3.f843 = r0
            return r0
        L15:
            java.util.ConcurrentModificationException r3 = new java.util.ConcurrentModificationException
            r3.<init>()
            throw r3
        L1b:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.Object m500() {
            r0 = this;
            xhss.ᛵᛲᛶᛵ r0 = r0.m499()
            return r0
    }
}
