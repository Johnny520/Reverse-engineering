package defpackage;

/* JADX INFO: renamed from: ᲇᛳᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2025 implements java.util.Iterator, defpackage.InterfaceC0958 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.Object f8729;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public java.util.Iterator f8730;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f8731;

    public C2025(defpackage.C0130 r2) {
            r1 = this;
            r0 = 0
            r1.f8731 = r0
            r1.<init>()
            r1.f8729 = r2
            ᛶᲁᛴ r2 = r2.f1066
            java.util.Iterator r2 = r2.iterator()
            r1.f8730 = r2
            return
    }

    public C2025(defpackage.C1105 r2) {
            r1 = this;
            r0 = 1
            r1.f8731 = r0
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f8729 = r0
            r1.f8730 = r2
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.f8731
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            java.util.Iterator r1 = r1.f8730
            boolean r1 = r1.hasNext()
            return r1
        Lc:
            java.util.Iterator r1 = r1.f8730
            boolean r1 = r1.hasNext()
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r5 = this;
            int r0 = r5.f8731
            java.lang.Object r1 = r5.f8729
            switch(r0) {
                case 0: goto L60;
                default: goto L7;
            }
        L7:
            java.util.Iterator r0 = r5.f8730
            java.lang.Object r0 = r0.next()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r2 = r0
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof android.view.ViewGroup
            r4 = 0
            if (r3 == 0) goto L1a
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L1b
        L1a:
            r2 = r4
        L1b:
            if (r2 == 0) goto L23
            ᛶᛷᛱᲀ r4 = new ᛶᛷᛱᲀ
            r3 = 3
            r4.<init>(r3, r2)
        L23:
            if (r4 == 0) goto L33
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L33
            java.util.Iterator r2 = r5.f8730
            r1.add(r2)
            r5.f8730 = r4
            goto L5f
        L33:
            java.util.Iterator r2 = r5.f8730
            boolean r2 = r2.hasNext()
            if (r2 != 0) goto L5f
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L5f
            java.lang.Object r2 = defpackage.AbstractC1107.m2114(r1)
            java.util.Iterator r2 = (java.util.Iterator) r2
            r5.f8730 = r2
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L57
            int r2 = defpackage.AbstractC0425.m1184(r1)
            r1.remove(r2)
            goto L33
        L57:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r0 = "List is empty."
            r5.<init>(r0)
            throw r5
        L5f:
            return r0
        L60:
            ᛱᛷᛷᛲ r1 = (defpackage.C0130) r1
            java.lang.Object r0 = r1.f1064
            ᛳᲈᲇᛳ r0 = (defpackage.InterfaceC0598) r0
            java.util.Iterator r5 = r5.f8730
            java.lang.Object r5 = r5.next()
            java.lang.Object r5 = r0.mo617(r5)
            return r5
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            int r1 = r1.f8731
            switch(r1) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
        Ld:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }
}
