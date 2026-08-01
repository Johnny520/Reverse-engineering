package defpackage;

/* JADX INFO: renamed from: ᛴᛵᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0678 implements java.util.Iterator, defpackage.InterfaceC0958 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f3264;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int f3265;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f3266;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f3267;

    public C0678(int r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            r2.f3266 = r5
            r2.f3265 = r4
            r0 = 0
            r1 = 1
            if (r5 <= 0) goto Lf
            if (r3 > r4) goto L12
        Ld:
            r0 = r1
            goto L12
        Lf:
            if (r3 < r4) goto L12
            goto Ld
        L12:
            r2.f3264 = r0
            if (r0 == 0) goto L17
            goto L18
        L17:
            r3 = r4
        L18:
            r2.f3267 = r3
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r0 = this;
            boolean r0 = r0.f3264
            return r0
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
            r0 = this;
            int r0 = r0.nextInt()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    public final int nextInt() {
            r2 = this;
            int r0 = r2.f3267
            int r1 = r2.f3265
            if (r0 != r1) goto L14
            boolean r1 = r2.f3264
            if (r1 == 0) goto Le
            r1 = 0
            r2.f3264 = r1
            return r0
        Le:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
        L14:
            int r1 = r2.f3266
            int r1 = r1 + r0
            r2.f3267 = r1
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }
}
