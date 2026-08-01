package defpackage;

/* JADX INFO: renamed from: ᲀᲀᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1731 implements java.util.Iterator {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f7660;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public defpackage.C0527 f7661;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.C0527 f7662;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0977 f7663;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f7664;

    public C1731(defpackage.C0977 r1, int r2) {
            r0 = this;
            r0.f7664 = r2
            r0.<init>()
            r0.f7663 = r1
            ᛳᛸᛶᛷ r2 = r1.f4371
            ᛳᛸᛶᛷ r2 = r2.f2601
            r0.f7662 = r2
            r2 = 0
            r0.f7661 = r2
            int r1 = r1.f4378
            r0.f7660 = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            ᛳᛸᛶᛷ r0 = r1.f7662
            ᛵᲇᛳᛳ r1 = r1.f7663
            ᛳᛸᛶᛷ r1 = r1.f4371
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
            int r0 = r1.f7664
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.m3108()
            return r1
        La:
            ᛳᛸᛶᛷ r1 = r1.m3109()
            java.lang.Object r1 = r1.f2594
            return r1
    }

    @Override // java.util.Iterator
    public final void remove() {
            r3 = this;
            ᛳᛸᛶᛷ r0 = r3.f7661
            if (r0 == 0) goto L12
            r1 = 1
            ᛵᲇᛳᛳ r2 = r3.f7663
            r2.m1917(r0, r1)
            r0 = 0
            r3.f7661 = r0
            int r0 = r2.f4378
            r3.f7660 = r0
            return
        L12:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Object m3108() {
            r0 = this;
            ᛳᛸᛶᛷ r0 = r0.m3109()
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0527 m3109() {
            r3 = this;
            ᛳᛸᛶᛷ r0 = r3.f7662
            ᛵᲇᛳᛳ r1 = r3.f7663
            ᛳᛸᛶᛷ r2 = r1.f4371
            if (r0 == r2) goto L1b
            int r1 = r1.f4378
            int r2 = r3.f7660
            if (r1 != r2) goto L15
            ᛳᛸᛶᛷ r1 = r0.f2601
            r3.f7662 = r1
            r3.f7661 = r0
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
}
