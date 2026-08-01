package defpackage;

/* JADX INFO: renamed from: ᛳᲁᛱᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0551 extends defpackage.AbstractC1350 implements defpackage.InterfaceC0598 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f2720;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.InterfaceC0598 f2721;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1595 f2722;

    public C0551(defpackage.C1595 r1, java.lang.String r2, defpackage.InterfaceC0598 r3, defpackage.InterfaceC0140 r4) {
            r0 = this;
            r0.f2722 = r1
            r0.f2720 = r2
            r0.f2721 = r3
            r1 = 1
            r0.<init>(r1, r4)
            return
    }

    @Override // defpackage.InterfaceC0598
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final java.lang.Object mo617(java.lang.Object r4) {
            r3 = this;
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            ᛳᲁᛱᛶ r0 = new ᛳᲁᛱᛶ
            java.lang.String r1 = r3.f2720
            ᛳᲈᲇᛳ r2 = r3.f2721
            ᛸᲈᛱᛷ r3 = r3.f2722
            r0.<init>(r3, r1, r2, r4)
            ᲁᲀᛱᲁ r3 = defpackage.C1907.f8270
            java.lang.Object r3 = r0.mo390(r3)
            return r3
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final java.lang.Object mo390(java.lang.Object r2) {
            r1 = this;
            defpackage.AbstractC0762.m1680(r2)
            ᛸᲈᛱᛷ r2 = r1.f2722
            ᲀᛴᛴᛶ r2 = r2.f7049
            java.lang.String r0 = r1.f2720
            ᛲᛳᲇᛱ r2 = r2.mo892(r0)
            ᛳᲈᲇᛳ r1 = r1.f2721
            java.lang.Object r1 = r1.mo617(r2)     // Catch: java.lang.Throwable -> L18
            r0 = 0
            defpackage.AbstractC0209.m772(r2, r0)
            return r1
        L18:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L1a
        L1a:
            r0 = move-exception
            defpackage.AbstractC0209.m772(r2, r1)
            throw r0
    }
}
