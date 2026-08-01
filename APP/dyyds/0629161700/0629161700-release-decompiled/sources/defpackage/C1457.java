package defpackage;

/* JADX INFO: renamed from: ᛸᛳᛵᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1457 implements defpackage.InterfaceC1645 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.InterfaceC2087 f6401;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.String f6402;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC0300 f6403;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C0389 f6404;

    public C1457(defpackage.InterfaceC0300 r1, java.lang.String r2, defpackage.InterfaceC2087 r3) {
            r0 = this;
            r0.<init>()
            r0.f6403 = r1
            r0.f6402 = r2
            r0.f6401 = r3
            ᛲᲀ r1 = new ᛲᲀ
            r2 = 14
            r1.<init>(r2, r0)
            ᛲᲈᛶᲈ r2 = new ᛲᲈᛶᲈ
            r2.<init>(r1)
            r0.f6404 = r2
            return
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            ᛲᲈᛶᲈ r2 = r2.f6404
            java.lang.Object r0 = r2.f2022
            ᛸᛶᛱᛵ r1 = defpackage.C1500.f6601
            if (r0 == r1) goto L11
            java.lang.Object r2 = r2.getValue()
            ᲀᛴᛴᛶ r2 = (defpackage.InterfaceC1661) r2
            r2.close()
        L11:
            return
    }

    @Override // defpackage.InterfaceC1645
    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final java.lang.Object mo2654(boolean r4, defpackage.InterfaceC2087 r5, defpackage.AbstractC1016 r6) {
            r3 = this;
            ᛳᛵᲈᛵ r4 = r6.f4527
            ᲁᲁᛷᲈ r0 = defpackage.C1259.f5626
            ᛶᲁᛳᲈ r4 = r4.mo970(r0)
            ᛷᛴᛸᛳ r4 = (defpackage.C1259) r4
            r0 = 0
            if (r4 == 0) goto L10
            ᛸᲈᛱᛷ r4 = r4.f5627
            goto L11
        L10:
            r4 = r0
        L11:
            if (r4 == 0) goto L18
            java.lang.Object r3 = r5.mo388(r4, r6)
            return r3
        L18:
            ᛸᲈᛱᛷ r4 = new ᛸᲈᛱᛷ
            ᛲᲈᛶᲈ r1 = r3.f6404
            java.lang.Object r1 = r1.getValue()
            ᲀᛴᛴᛶ r1 = (defpackage.InterfaceC1661) r1
            ᲇᛷᛳᲀ r3 = r3.f6401
            r4.<init>(r3, r1)
            ᛷᛴᛸᛳ r3 = new ᛷᛴᛸᛳ
            r3.<init>(r4)
            ᛲᛷᛶᛸ r1 = new ᛲᛷᛶᛸ
            r2 = 10
            r1.<init>(r5, r4, r0, r2)
            java.lang.Object r3 = defpackage.AbstractC0397.m1144(r3, r1, r6)
            return r3
    }
}
