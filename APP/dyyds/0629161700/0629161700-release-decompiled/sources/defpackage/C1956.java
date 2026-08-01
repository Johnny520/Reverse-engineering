package defpackage;

/* JADX INFO: renamed from: ᲁᲈᛱᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1956 implements java.util.Iterator, defpackage.InterfaceC0958 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0954 f8507;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f8508;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public java.lang.Object f8509;

    public C1956(defpackage.C0954 r1) {
            r0 = this;
            r0.<init>()
            r0.f8507 = r1
            r1 = -2
            r0.f8508 = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.f8508
            if (r0 >= 0) goto L7
            r1.m3372()
        L7:
            int r1 = r1.f8508
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
            int r0 = r2.f8508
            if (r0 >= 0) goto L7
            r2.m3372()
        L7:
            int r0 = r2.f8508
            if (r0 == 0) goto L11
            java.lang.Object r0 = r2.f8509
            r1 = -1
            r2.f8508 = r1
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

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m3372() {
            r2 = this;
            int r0 = r2.f8508
            r1 = -2
            if (r0 != r1) goto L10
            ᛵᲀᛱᲈ r0 = r2.f8507
            java.lang.Object r0 = r0.f4260
            ᛲᲀ r0 = (defpackage.C0345) r0
            java.lang.Object r0 = r0.mo1032()
            goto L20
        L10:
            java.lang.Object r0 = r2.f8509
            android.view.View r0 = (android.view.View) r0
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L1f
            android.view.View r0 = (android.view.View) r0
            goto L20
        L1f:
            r0 = 0
        L20:
            r2.f8509 = r0
            if (r0 != 0) goto L26
            r0 = 0
            goto L27
        L26:
            r0 = 1
        L27:
            r2.f8508 = r0
            return
    }
}
