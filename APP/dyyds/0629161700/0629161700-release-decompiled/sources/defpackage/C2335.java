package defpackage;

/* JADX INFO: renamed from: ᲈᲁᛵᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2335 implements java.util.Iterator, defpackage.InterfaceC0958 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public java.lang.Object f10080;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f10081;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.Iterator f10082;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1273 f10083;

    public C2335(defpackage.C1273 r1) {
            r0 = this;
            r0.<init>()
            r0.f10083 = r1
            ᛶᲁᛴ r1 = r1.f5698
            java.util.Iterator r1 = r1.iterator()
            r0.f10082 = r1
            r1 = -1
            r0.f10081 = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f10081
            r1 = -1
            if (r0 != r1) goto L8
            r2.m3817()
        L8:
            int r2 = r2.f10081
            r0 = 1
            if (r2 != r0) goto Le
            return r0
        Le:
            r2 = 0
            return r2
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f10081
            r1 = -1
            if (r0 != r1) goto L8
            r3.m3817()
        L8:
            int r0 = r3.f10081
            if (r0 == 0) goto L14
            java.lang.Object r0 = r3.f10080
            r2 = 0
            r3.f10080 = r2
            r3.f10081 = r1
            return r0
        L14:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
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
    public final void m3817() {
            r3 = this;
        L0:
            java.util.Iterator r0 = r3.f10082
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r0 = r0.next()
            ᛷᛵᛵᛶ r1 = r3.f10083
            ᛳᲈᲇᛳ r2 = r1.f5697
            java.lang.Object r2 = r2.mo617(r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            boolean r1 = r1.f5699
            if (r2 != r1) goto L0
            r3.f10080 = r0
            r0 = 1
            r3.f10081 = r0
            return
        L24:
            r0 = 0
            r3.f10081 = r0
            return
    }
}
