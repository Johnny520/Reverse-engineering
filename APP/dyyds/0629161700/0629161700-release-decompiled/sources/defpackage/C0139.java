package defpackage;

/* JADX INFO: renamed from: ᛱᛸᛲᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0139 extends defpackage.AbstractC1350 implements defpackage.InterfaceC2087 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1772 f1087;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1088;

    public /* synthetic */ C0139(defpackage.C1772 r1, defpackage.InterfaceC0140 r2, int r3) {
            r0 = this;
            r0.f1088 = r3
            r0.f1087 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.InterfaceC2087
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.Object mo388(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f1088
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            switch(r0) {
                case 0: goto L15;
                default: goto Lb;
            }
        Lb:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛱᛸᛲᛷ r2 = (defpackage.C0139) r2
            r2.mo390(r1)
            return r1
        L15:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛱᛸᛲᛷ r2 = (defpackage.C0139) r2
            r2.mo390(r1)
            return r1
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final defpackage.InterfaceC0140 mo389(defpackage.InterfaceC0140 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.f1088
            ᲀᲇᲁᛵ r1 = r1.f1087
            switch(r3) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            ᛱᛸᛲᛷ r3 = new ᛱᛸᛲᛷ
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            ᛱᛸᛲᛷ r3 = new ᛱᛸᛲᛷ
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final java.lang.Object mo390(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f1088
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            ᲀᲇᲁᛵ r2 = r2.f1087
            switch(r0) {
                case 0: goto L12;
                default: goto L9;
            }
        L9:
            defpackage.AbstractC0762.m1680(r3)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.mo617(r3)
            return r1
        L12:
            defpackage.AbstractC0762.m1680(r3)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r2.mo617(r3)
            return r1
    }
}
