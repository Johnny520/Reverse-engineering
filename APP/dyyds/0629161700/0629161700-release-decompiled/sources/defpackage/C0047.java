package defpackage;

/* JADX INFO: renamed from: ᛱᛲᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0047 extends defpackage.AbstractC1350 implements defpackage.InterfaceC2087 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final /* synthetic */ android.content.Context f564;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1250 f565;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f566;

    public /* synthetic */ C0047(android.content.Context r1, defpackage.C1250 r2, defpackage.InterfaceC0140 r3, int r4) {
            r0 = this;
            r0.f566 = r4
            r0.f564 = r1
            r0.f565 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.InterfaceC2087
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final java.lang.Object mo388(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f566
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            switch(r0) {
                case 0: goto L15;
                default: goto Lb;
            }
        Lb:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛱᛲᲈᲈ r2 = (defpackage.C0047) r2
            r2.mo390(r1)
            return r1
        L15:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛱᛲᲈᲈ r2 = (defpackage.C0047) r2
            r2.mo390(r1)
            return r1
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final defpackage.InterfaceC0140 mo389(defpackage.InterfaceC0140 r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.f566
            switch(r4) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            ᛱᛲᲈᲈ r4 = new ᛱᛲᲈᲈ
            ᛷᛳᲈᲈ r0 = r2.f565
            r1 = 1
            android.content.Context r2 = r2.f564
            r4.<init>(r2, r0, r3, r1)
            return r4
        L10:
            ᛱᛲᲈᲈ r4 = new ᛱᛲᲈᲈ
            ᛷᛳᲈᲈ r0 = r2.f565
            r1 = 0
            android.content.Context r2 = r2.f564
            r4.<init>(r2, r0, r3, r1)
            return r4
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final java.lang.Object mo390(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f566
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            ᛷᛳᲈᲈ r2 = r3.f565
            android.content.Context r3 = r3.f564
            switch(r0) {
                case 0: goto L1c;
                default: goto Lb;
            }
        Lb:
            defpackage.AbstractC0762.m1680(r4)
            ᛶᛸᛱᲀ r4 = defpackage.C1121.f5003
            defpackage.C1121.m2134(r3)
            defpackage.C0525.m1317()
            java.lang.String r3 = r2.f5581
            defpackage.AbstractC0209.m764(r3)
            return r1
        L1c:
            defpackage.AbstractC0762.m1680(r4)
            ᛶᛸᛱᲀ r4 = defpackage.C1121.f5003
            defpackage.C1121.m2134(r3)
            defpackage.C0525.m1317()
            java.lang.String r3 = r2.f5581
            defpackage.AbstractC0209.m764(r3)
            return r1
    }
}
