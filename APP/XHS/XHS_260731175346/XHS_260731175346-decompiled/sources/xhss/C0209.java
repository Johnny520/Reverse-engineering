package xhss;

/* JADX INFO: renamed from: xhss.ᛲᲁᛸᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0209 extends xhss.AbstractC0187 implements java.util.Iterator {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public xhss.C0359 f776;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public boolean f777;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C1179 f778;

    public C0209(xhss.C1179 r1) {
            r0 = this;
            r0.<init>()
            r0.f778 = r1
            r1 = 1
            r0.f777 = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            boolean r0 = r1.f777
            if (r0 == 0) goto Lb
            xhss.ᲈᲀᲀᛵ r1 = r1.f778
            xhss.ᛴᛴᲁᲈ r1 = r1.f3797
            if (r1 == 0) goto L15
            goto L13
        Lb:
            xhss.ᛴᛴᲁᲈ r1 = r1.f776
            if (r1 == 0) goto L15
            xhss.ᛴᛴᲁᲈ r1 = r1.f1325
            if (r1 == 0) goto L15
        L13:
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r1 = this;
            boolean r0 = r1.f777
            if (r0 == 0) goto Le
            r0 = 0
            r1.f777 = r0
            xhss.ᲈᲀᲀᛵ r0 = r1.f778
            xhss.ᛴᛴᲁᲈ r0 = r0.f3797
            r1.f776 = r0
            return r0
        Le:
            xhss.ᛴᛴᲁᲈ r0 = r1.f776
            if (r0 == 0) goto L15
            xhss.ᛴᛴᲁᲈ r0 = r0.f1325
            goto L16
        L15:
            r0 = 0
        L16:
            r1.f776 = r0
            return r0
    }

    @Override // xhss.AbstractC0187
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo446(xhss.C0359 r2) {
            r1 = this;
            xhss.ᛴᛴᲁᲈ r0 = r1.f776
            if (r2 != r0) goto Lf
            xhss.ᛴᛴᲁᲈ r2 = r0.f1324
            r1.f776 = r2
            if (r2 != 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            r1.f777 = r2
        Lf:
            return
    }
}
