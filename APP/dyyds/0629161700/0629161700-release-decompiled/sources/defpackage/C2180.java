package defpackage;

/* JADX INFO: renamed from: ᲈᛱᲁᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2180 implements java.util.Iterator, defpackage.InterfaceC0958 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0733 f9259;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f9260;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f9261;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f9262;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public defpackage.C0106 f9263;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f9264;

    public C2180(defpackage.C0733 r2) {
            r1 = this;
            r1.<init>()
            r1.f9259 = r2
            r0 = -1
            r1.f9262 = r0
            java.lang.CharSequence r2 = r2.f3467
            int r2 = r2.length()
            r0 = 0
            int r2 = defpackage.AbstractC1754.m3135(r0, r0, r2)
            r1.f9261 = r2
            r1.f9260 = r2
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f9262
            r1 = -1
            if (r0 != r1) goto L8
            r2.m3579()
        L8:
            int r2 = r2.f9262
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
            int r0 = r3.f9262
            r1 = -1
            if (r0 != r1) goto L8
            r3.m3579()
        L8:
            int r0 = r3.f9262
            if (r0 == 0) goto L14
            ᛱᛵᲇᲇ r0 = r3.f9263
            r2 = 0
            r3.f9263 = r2
            r3.f9262 = r1
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
    public final void m3579() {
            r8 = this;
            ᛴᛸᲀᛲ r0 = r8.f9259
            java.lang.CharSequence r1 = r0.f3467
            int r2 = r8.f9260
            r3 = 0
            if (r2 >= 0) goto Lf
            r8.f9262 = r3
            r0 = 0
            r8.f9263 = r0
            return
        Lf:
            int r4 = r0.f3468
            r5 = -1
            r6 = 1
            if (r4 <= 0) goto L1c
            int r7 = r8.f9264
            int r7 = r7 + r6
            r8.f9264 = r7
            if (r7 >= r4) goto L22
        L1c:
            int r4 = r1.length()
            if (r2 <= r4) goto L32
        L22:
            ᛱᛵᲇᲇ r0 = new ᛱᛵᲇᲇ
            int r2 = r8.f9261
            int r1 = defpackage.AbstractC1347.m2516(r1)
            r0.<init>(r2, r1, r6)
            r8.f9263 = r0
            r8.f9260 = r5
            goto L77
        L32:
            ᲇᛷᛳᲀ r0 = r0.f3466
            int r2 = r8.f9260
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.mo388(r1, r2)
            kotlin.Pair r0 = (kotlin.Pair) r0
            if (r0 != 0) goto L52
            ᛱᛵᲇᲇ r0 = new ᛱᛵᲇᲇ
            int r2 = r8.f9261
            int r1 = defpackage.AbstractC1347.m2516(r1)
            r0.<init>(r2, r1, r6)
            r8.f9263 = r0
            r8.f9260 = r5
            goto L77
        L52:
            java.lang.Object r1 = r0.component1()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.component2()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r2 = r8.f9261
            ᛱᛵᲇᲇ r2 = defpackage.AbstractC1754.m3143(r2, r1)
            r8.f9263 = r2
            int r1 = r1 + r0
            r8.f9261 = r1
            if (r0 != 0) goto L74
            r3 = r6
        L74:
            int r1 = r1 + r3
            r8.f9260 = r1
        L77:
            r8.f9262 = r6
            return
    }
}
