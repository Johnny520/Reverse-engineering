package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛷᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1159 implements java.util.Iterator, xhss.InterfaceC0057 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public java.lang.Object f3754;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public int f3755;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C1111 f3756;

    public C1159(xhss.C1111 r1) {
            r0 = this;
            r0.<init>()
            r0.f3756 = r1
            r1 = -2
            r0.f3755 = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.f3755
            if (r0 >= 0) goto L7
            r1.m1857()
        L7:
            int r1 = r1.f3755
            r0 = 1
            if (r1 != r0) goto Ld
            return r0
        Ld:
            r1 = 0
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            int r0 = r2.f3755
            if (r0 >= 0) goto L7
            r2.m1857()
        L7:
            int r0 = r2.f3755
            if (r0 == 0) goto L11
            java.lang.Object r0 = r2.f3754
            r1 = -1
            r2.f3755 = r1
            return r0
        L11:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m1857() {
            r2 = this;
            int r0 = r2.f3755
            r1 = -2
            if (r0 != r1) goto L10
            xhss.ᲈᛱᛱᲀ r0 = r2.f3756
            java.lang.Object r0 = r0.f3583
            xhss.ᛲᛶᲀᛲ r0 = (xhss.C0177) r0
            java.lang.Object r0 = r0.mo136()
            goto L20
        L10:
            java.lang.Object r0 = r2.f3754
            android.view.View r0 = (android.view.View) r0
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L1f
            android.view.View r0 = (android.view.View) r0
            goto L20
        L1f:
            r0 = 0
        L20:
            r2.f3754 = r0
            if (r0 != 0) goto L26
            r0 = 0
            goto L27
        L26:
            r0 = 1
        L27:
            r2.f3755 = r0
            return
    }
}
