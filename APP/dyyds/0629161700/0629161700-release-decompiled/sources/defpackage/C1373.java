package defpackage;

/* JADX INFO: renamed from: ᛷᲁᛸᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1373 extends defpackage.AbstractC1350 implements defpackage.InterfaceC2087 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final /* synthetic */ java.io.File f6002;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f6003;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f6004;

    public /* synthetic */ C1373(java.io.File r1, java.lang.String r2, defpackage.InterfaceC0140 r3, int r4) {
            r0 = this;
            r0.f6004 = r4
            r0.f6002 = r1
            r0.f6003 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.InterfaceC2087
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.Object mo388(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f6004
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            switch(r0) {
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛷᲁᛸᛷ r2 = (defpackage.C1373) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L16:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛷᲁᛸᛷ r2 = (defpackage.C1373) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final defpackage.InterfaceC0140 mo389(defpackage.InterfaceC0140 r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.f6004
            java.lang.String r0 = r2.f6003
            java.io.File r2 = r2.f6002
            switch(r4) {
                case 0: goto L10;
                default: goto L9;
            }
        L9:
            ᛷᲁᛸᛷ r4 = new ᛷᲁᛸᛷ
            r1 = 1
            r4.<init>(r2, r0, r3, r1)
            return r4
        L10:
            ᛷᲁᛸᛷ r4 = new ᛷᲁᛸᛷ
            r1 = 0
            r4.<init>(r2, r0, r3, r1)
            return r4
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final java.lang.Object mo390(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f6004
            java.lang.String r1 = r2.f6003
            java.io.File r2 = r2.f6002
            switch(r0) {
                case 0: goto L1a;
                default: goto L9;
            }
        L9:
            defpackage.AbstractC0762.m1680(r3)
            ᲈᲈᲁᛶ r3 = defpackage.C2374.f10260
            r3.getClass()
            boolean r2 = defpackage.C2374.m3886(r2, r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L1a:
            defpackage.AbstractC0762.m1680(r3)
            ᲈᲈᲁᛶ r3 = defpackage.C2374.f10260
            r3.getClass()
            boolean r2 = defpackage.C2374.m3886(r2, r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }
}
