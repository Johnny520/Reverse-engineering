package defpackage;

/* JADX INFO: renamed from: ᛴᲈᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0795 extends defpackage.AbstractC1350 implements defpackage.InterfaceC0598 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1595 f3683;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.EnumC0469 f3684;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.InterfaceC2087 f3685;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f3686;

    public C0795(defpackage.C1595 r1, defpackage.EnumC0469 r2, defpackage.InterfaceC2087 r3, defpackage.InterfaceC0140 r4) {
            r0 = this;
            r0.f3683 = r1
            r0.f3684 = r2
            r0.f3685 = r3
            r1 = 1
            r0.<init>(r1, r4)
            return
    }

    @Override // defpackage.InterfaceC0598
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final java.lang.Object mo617(java.lang.Object r4) {
            r3 = this;
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            ᛴᲈᛴᛲ r0 = new ᛴᲈᛴᛲ
            ᛳᛴᲈᛶ r1 = r3.f3684
            ᲇᛷᛳᲀ r2 = r3.f3685
            ᛸᲈᛱᛷ r3 = r3.f3683
            r0.<init>(r3, r1, r2, r4)
            ᲁᲀᛱᲁ r3 = defpackage.C1907.f8270
            java.lang.Object r3 = r0.mo390(r3)
            return r3
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final java.lang.Object mo390(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f3686
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 != r1) goto Lb
            defpackage.AbstractC0762.m1680(r3)
            return r3
        Lb:
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r2)
            r2 = 0
            return r2
        L12:
            defpackage.AbstractC0762.m1680(r3)
            r2.f3686 = r1
            ᛸᲈᛱᛷ r3 = r2.f3683
            ᛳᛴᲈᛶ r0 = r2.f3684
            ᲇᛷᛳᲀ r1 = r2.f3685
            java.lang.Object r2 = r3.m2889(r0, r1, r2)
            ᛴᛵ r3 = defpackage.EnumC0670.f3246
            if (r2 != r3) goto L26
            return r3
        L26:
            return r2
    }
}
