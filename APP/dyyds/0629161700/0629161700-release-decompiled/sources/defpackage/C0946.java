package defpackage;

/* JADX INFO: renamed from: ᛵᛸᛶᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0946 extends defpackage.AbstractC1350 implements defpackage.InterfaceC2087 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final /* synthetic */ com.ss.android.ugc.awemes.WardDatabase f4236;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.InterfaceC0598 f4237;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final /* synthetic */ boolean f4238;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ boolean f4239;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f4240;

    public C0946(defpackage.InterfaceC0140 r1, defpackage.InterfaceC0598 r2, com.ss.android.ugc.awemes.WardDatabase r3, boolean r4, boolean r5) {
            r0 = this;
            r0.f4236 = r3
            r0.f4238 = r4
            r0.f4239 = r5
            r0.f4237 = r2
            r2 = 2
            r0.<init>(r2, r1)
            return
    }

    @Override // defpackage.InterfaceC2087
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.Object mo388(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            ᛷᲈᛳᛳ r1 = (defpackage.InterfaceC1399) r1
            ᛱᛸᛲᲀ r2 = (defpackage.InterfaceC0140) r2
            ᛱᛸᛲᲀ r0 = r0.mo389(r2, r1)
            ᛵᛸᛶᛴ r0 = (defpackage.C0946) r0
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            java.lang.Object r0 = r0.mo390(r1)
            return r0
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final defpackage.InterfaceC0140 mo389(defpackage.InterfaceC0140 r7, java.lang.Object r8) {
            r6 = this;
            ᛵᛸᛶᛴ r0 = new ᛵᛸᛶᛴ
            boolean r5 = r6.f4239
            ᛳᲈᲇᛳ r2 = r6.f4237
            com.ss.android.ugc.awemes.WardDatabase r3 = r6.f4236
            boolean r4 = r6.f4238
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final java.lang.Object mo390(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f4240
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 != r1) goto Lb
            defpackage.AbstractC0762.m1680(r9)
            return r9
        Lb:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r8)
            r8 = 0
            return r8
        L12:
            defpackage.AbstractC0762.m1680(r9)
            ᛸᛶᛸᛱ r2 = new ᛸᛶᛸᛱ
            r3 = 0
            ᛳᲈᲇᛳ r4 = r8.f4237
            com.ss.android.ugc.awemes.WardDatabase r5 = r8.f4236
            boolean r6 = r8.f4239
            boolean r7 = r8.f4238
            r2.<init>(r3, r4, r5, r6, r7)
            r8.f4240 = r1
            java.lang.Object r8 = r5.m304(r7, r2, r8)
            ᛴᛵ r9 = defpackage.EnumC0670.f3246
            if (r8 != r9) goto L2e
            return r9
        L2e:
            return r8
    }
}
