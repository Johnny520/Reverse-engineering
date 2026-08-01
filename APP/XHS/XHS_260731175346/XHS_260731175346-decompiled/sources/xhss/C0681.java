package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛷᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0681 extends xhss.AbstractC0187 implements java.util.Iterator {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public xhss.C0359 f2300;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public xhss.C0359 f2301;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final /* synthetic */ int f2302;

    public C0681(xhss.C0359 r1, xhss.C0359 r2, int r3) {
            r0 = this;
            r0.f2302 = r3
            r0.<init>()
            r0.f2300 = r2
            r0.f2301 = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r0 = this;
            xhss.ᛴᛴᲁᲈ r0 = r0.f2301
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            xhss.ᛴᛴᲁᲈ r0 = r2.f2301
            xhss.ᛴᛴᲁᲈ r1 = r2.f2300
            if (r0 == r1) goto Le
            if (r1 != 0) goto L9
            goto Le
        L9:
            xhss.ᛴᛴᲁᲈ r1 = r2.m1163(r0)
            goto Lf
        Le:
            r1 = 0
        Lf:
            r2.f2301 = r1
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0359 m1163(xhss.C0359 r1) {
            r0 = this;
            int r0 = r0.f2302
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            xhss.ᛴᛴᲁᲈ r0 = r1.f1324
            return r0
        L8:
            xhss.ᛴᛴᲁᲈ r0 = r1.f1325
            return r0
    }

    @Override // xhss.AbstractC0187
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo446(xhss.C0359 r4) {
            r3 = this;
            xhss.ᛴᛴᲁᲈ r0 = r3.f2300
            r1 = 0
            if (r0 != r4) goto Le
            xhss.ᛴᛴᲁᲈ r2 = r3.f2301
            if (r4 != r2) goto Le
            r3.f2301 = r1
            r3.f2300 = r1
            r0 = r1
        Le:
            r2 = r0
            if (r0 != r4) goto L1f
            int r2 = r3.f2302
            switch(r2) {
                case 0: goto L1a;
                default: goto L16;
            }
        L16:
            xhss.ᛴᛴᲁᲈ r0 = r0.f1325
        L18:
            r2 = r0
            goto L1d
        L1a:
            xhss.ᛴᛴᲁᲈ r0 = r0.f1324
            goto L18
        L1d:
            r3.f2300 = r2
        L1f:
            xhss.ᛴᛴᲁᲈ r0 = r3.f2301
            if (r0 != r4) goto L2e
            if (r0 == r2) goto L2c
            if (r2 != 0) goto L28
            goto L2c
        L28:
            xhss.ᛴᛴᲁᲈ r1 = r3.m1163(r0)
        L2c:
            r3.f2301 = r1
        L2e:
            return
    }
}
