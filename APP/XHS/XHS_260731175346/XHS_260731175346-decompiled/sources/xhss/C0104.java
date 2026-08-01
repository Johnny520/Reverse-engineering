package xhss;

/* JADX INFO: renamed from: xhss.ᛱᲁᲈᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0104 extends xhss.AbstractC0562 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.InterfaceC0979 f479;

    public C0104(xhss.InterfaceC0979 r1, xhss.C0199 r2) {
            r0 = this;
            r0.<init>(r2)
            r0.f479 = r1
            return
    }

    @Override // xhss.AbstractC0562
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final java.lang.Object mo288(java.lang.Object r1) {
            r0 = this;
            return r1
    }

    @Override // xhss.AbstractC0562
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.lang.Object mo289() {
            r0 = this;
            xhss.ᲁᲀᛶᛲ r0 = r0.f479
            java.lang.Object r0 = r0.mo964()
            return r0
    }

    @Override // xhss.AbstractC0562
    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final void mo290(java.lang.Object r2, xhss.C0385 r3, xhss.C0981 r4) {
            r1 = this;
            java.lang.reflect.Field r1 = r4.f3184
            xhss.ᛲᛱᛶᛴ r0 = r4.f3191
            java.lang.Object r3 = r0.mo119(r3)
            if (r3 != 0) goto L10
            boolean r0 = r4.f3189
            if (r0 != 0) goto Lf
            goto L10
        Lf:
            return
        L10:
            boolean r4 = r4.f3188
            if (r4 != 0) goto L18
            r1.set(r2, r3)
            return
        L18:
            r2 = 0
            java.lang.String r1 = xhss.AbstractC1031.m1680(r1, r2)
            xhss.ᛱᲈᛲᛷ r2 = new xhss.ᛱᲈᛲᛷ
            java.lang.String r3 = "Cannot set value of 'static final' "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
    }
}
