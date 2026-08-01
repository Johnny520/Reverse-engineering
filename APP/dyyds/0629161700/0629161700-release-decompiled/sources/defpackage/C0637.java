package defpackage;

/* JADX INFO: renamed from: ᛴᛳᛵᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0637 implements java.util.Iterator, defpackage.InterfaceC0958 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f3153;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f3154;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f3155;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ int f3156;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f3157;

    public C0637(int r1) {
            r0 = this;
            r0.<init>()
            r0.f3155 = r1
            return
    }

    public C0637(defpackage.C1499 r1, int r2) {
            r0 = this;
            r0.f3156 = r2
            switch(r2) {
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            r0.f3157 = r1
            int r1 = r1.f6994
            r0.<init>(r1)
            return
        Ld:
            r0.f3157 = r1
            int r1 = r1.f6994
            r0.<init>(r1)
            return
    }

    public C0637(defpackage.C2048 r2) {
            r1 = this;
            r0 = 2
            r1.f3156 = r0
            r1.f3157 = r2
            int r2 = r2.f8821
            r1.<init>(r2)
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.f3154
            int r1 = r1.f3155
            if (r0 >= r1) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2c
            int r0 = r3.f3154
            int r1 = r3.f3156
            java.lang.Object r2 = r3.f3157
            switch(r1) {
                case 0: goto L1d;
                case 1: goto L16;
                default: goto Lf;
            }
        Lf:
            ᲇᛵᛲᛲ r2 = (defpackage.C2048) r2
            java.lang.Object[] r1 = r2.f8822
            r0 = r1[r0]
            goto L23
        L16:
            ᛸᛶᛱᛲ r2 = (defpackage.C1499) r2
            java.lang.Object r0 = r2.m2863(r0)
            goto L23
        L1d:
            ᛸᛶᛱᛲ r2 = (defpackage.C1499) r2
            java.lang.Object r0 = r2.m2865(r0)
        L23:
            int r1 = r3.f3154
            r2 = 1
            int r1 = r1 + r2
            r3.f3154 = r1
            r3.f3153 = r2
            return r0
        L2c:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @Override // java.util.Iterator
    public final void remove() {
            r3 = this;
            boolean r0 = r3.f3153
            if (r0 == 0) goto L2c
            int r0 = r3.f3154
            int r0 = r0 + (-1)
            r3.f3154 = r0
            int r1 = r3.f3156
            java.lang.Object r2 = r3.f3157
            switch(r1) {
                case 0: goto L1d;
                case 1: goto L17;
                default: goto L11;
            }
        L11:
            ᲇᛵᛲᛲ r2 = (defpackage.C2048) r2
            r2.m3451(r0)
            goto L22
        L17:
            ᛸᛶᛱᛲ r2 = (defpackage.C1499) r2
            r2.mo1421(r0)
            goto L22
        L1d:
            ᛸᛶᛱᛲ r2 = (defpackage.C1499) r2
            r2.mo1421(r0)
        L22:
            int r0 = r3.f3155
            int r0 = r0 + (-1)
            r3.f3155 = r0
            r0 = 0
            r3.f3153 = r0
            return
        L2c:
            java.lang.String r3 = "Call next() before removing an element."
            defpackage.C2264.m3676(r3)
            return
    }
}
