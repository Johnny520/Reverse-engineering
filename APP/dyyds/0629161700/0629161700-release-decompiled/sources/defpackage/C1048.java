package defpackage;

/* JADX INFO: renamed from: ᛶᛳᲁᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1048 extends defpackage.AbstractC1350 implements defpackage.InterfaceC2087 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public /* synthetic */ java.lang.Object f4641;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.InterfaceC0598 f4642;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f4643;

    public /* synthetic */ C1048(defpackage.InterfaceC0140 r1, defpackage.InterfaceC0598 r2, int r3) {
            r0 = this;
            r0.f4643 = r3
            r0.f4642 = r2
            r2 = 2
            r0.<init>(r2, r1)
            return
    }

    @Override // defpackage.InterfaceC2087
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.Object mo388(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f4643
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            ᛵᲀᛷᛲ r3 = (defpackage.C0959) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            switch(r0) {
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛶᛳᲁᛱ r2 = (defpackage.C1048) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L16:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛶᛳᲁᛱ r2 = (defpackage.C1048) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final defpackage.InterfaceC0140 mo389(defpackage.InterfaceC0140 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f4643
            ᛳᲈᲇᛳ r2 = r2.f4642
            switch(r0) {
                case 0: goto L10;
                default: goto L7;
            }
        L7:
            ᛶᛳᲁᛱ r0 = new ᛶᛳᲁᛱ
            r1 = 1
            r0.<init>(r3, r2, r1)
            r0.f4641 = r4
            return r0
        L10:
            ᛶᛳᲁᛱ r0 = new ᛶᛳᲁᛱ
            r1 = 0
            r0.<init>(r3, r2, r1)
            r0.f4641 = r4
            return r0
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final java.lang.Object mo390(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f4643
            ᛳᲈᲇᛳ r1 = r2.f4642
            switch(r0) {
                case 0: goto L19;
                default: goto L7;
            }
        L7:
            defpackage.AbstractC0762.m1680(r3)
            java.lang.Object r2 = r2.f4641
            ᛵᲀᛷᛲ r2 = (defpackage.C0959) r2
            ᛵᛱᲁᛳ r2 = (defpackage.InterfaceC0819) r2
            ᲀᛴᛴᛶ r2 = r2.mo1748()
            java.lang.Object r2 = r1.mo617(r2)
            return r2
        L19:
            defpackage.AbstractC0762.m1680(r3)
            java.lang.Object r2 = r2.f4641
            ᛵᲀᛷᛲ r2 = (defpackage.C0959) r2
            ᛵᛱᲁᛳ r2 = (defpackage.InterfaceC0819) r2
            ᲀᛴᛴᛶ r2 = r2.mo1748()
            java.lang.Object r2 = r1.mo617(r2)
            return r2
    }
}
