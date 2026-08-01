package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛸᛷᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1167 extends xhss.AbstractC0473 {

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final xhss.C1013 f3776;

    public C1167(xhss.AbstractC0796 r2) {
            r1 = this;
            r1.<init>()
            xhss.ᲇᛲᛶᛴ r0 = new xhss.ᲇᛲᛶᛴ
            r0.<init>(r2)
            r1.f3776 = r0
            return
    }

    @Override // xhss.AbstractC0473
    /* JADX INFO: renamed from: ᛳᛶᛷᲀ */
    public final void mo871(boolean r2) {
            r1 = this;
            xhss.ᛵᲁᛱᲁ r0 = xhss.C0514.f1869
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 != 0) goto La
            return
        La:
            xhss.ᲇᛲᛶᛴ r1 = r1.f3776
            r1.mo871(r2)
            return
    }

    @Override // xhss.AbstractC0473
    /* JADX INFO: renamed from: ᛷᲁᲁ */
    public final android.text.InputFilter[] mo872(android.text.InputFilter[] r2) {
            r1 = this;
            xhss.ᛵᲁᛱᲁ r0 = xhss.C0514.f1869
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 != 0) goto La
            return r2
        La:
            xhss.ᲇᛲᛶᛴ r1 = r1.f3776
            android.text.InputFilter[] r1 = r1.mo872(r2)
            return r1
    }

    @Override // xhss.AbstractC0473
    /* JADX INFO: renamed from: ᲁᛲᛴᛴ */
    public final void mo873(boolean r2) {
            r1 = this;
            xhss.ᛵᲁᛱᲁ r0 = xhss.C0514.f1869
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            xhss.ᲇᛲᛶᛴ r1 = r1.f3776
            if (r0 != 0) goto Le
            r1.f3308 = r2
            return
        Le:
            r1.mo873(r2)
            return
    }
}
