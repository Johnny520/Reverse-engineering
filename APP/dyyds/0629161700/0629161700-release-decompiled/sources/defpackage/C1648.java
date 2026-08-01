package defpackage;

/* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1648 extends defpackage.C1105 implements java.util.ListIterator {

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.AbstractC2115 f7342;

    public C1648(defpackage.AbstractC2115 r3, int r4) {
            r2 = this;
            r2.f7342 = r3
            r0 = 0
            r2.<init>(r0, r3)
            int r3 = r3.mo395()
            if (r4 < 0) goto L11
            if (r4 > r3) goto L11
            r2.f4942 = r4
            return
        L11:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r3 = defpackage.AbstractC1124.m2143(r4, r3, r0, r1)
            r2.<init>(r3)
            throw r2
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r0 = this;
            int r0 = r0.f4942
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r0 = this;
            int r0 = r0.f4942
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r1 = this;
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L13
            int r0 = r1.f4942
            int r0 = r0 + (-1)
            r1.f4942 = r0
            ᲇᲀᛲᛱ r1 = r1.f7342
            java.lang.Object r1 = r1.get(r0)
            return r1
        L13:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>()
            throw r1
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r0 = this;
            int r0 = r0.f4942
            int r0 = r0 + (-1)
            return r0
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
