package defpackage;

/* JADX INFO: renamed from: ᛲᲈᛸᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0393 extends defpackage.C1908 {

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final /* synthetic */ int f2025;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1909 f2026;

    public C0393(defpackage.C1909 r9, android.content.Context r10, defpackage.SubMenuC1502 r11, android.view.View r12) {
            r8 = this;
            r0 = 0
            r8.f2025 = r0
            r8.f2026 = r9
            r6 = 1711538210(0x66040022, float:1.558387E23)
            r7 = 0
            r5 = 0
            r1 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            ᛲᛲᛶᲁ r8 = r3.f6612
            int r8 = r8.f1503
            r10 = 32
            r8 = r8 & r10
            if (r8 != r10) goto L1b
            goto L25
        L1b:
            ᛵᲀᛸᲈ r8 = r9.f8283
            if (r8 != 0) goto L23
            ᲇᲁᛸᲈ r8 = r9.f8295
            android.view.View r8 = (android.view.View) r8
        L23:
            r1.f8274 = r8
        L25:
            ᛸᲈᛸᲈ r8 = r9.f8303
            r1.f8271 = r8
            ᛶᲇᲀᛵ r9 = r1.f8273
            if (r9 == 0) goto L30
            r9.mo851(r8)
        L30:
            return
    }

    public C0393(defpackage.C1909 r9, android.content.Context r10, defpackage.MenuC1701 r11, android.view.View r12) {
            r8 = this;
            r0 = 1
            r8.f2025 = r0
            r8.f2026 = r9
            r6 = 1711538210(0x66040022, float:1.558387E23)
            r7 = 0
            r5 = 1
            r1 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8 = 8388613(0x800005, float:1.175495E-38)
            r1.f8280 = r8
            ᛸᲈᛸᲈ r8 = r9.f8303
            r1.f8271 = r8
            ᛶᲇᲀᛵ r9 = r1.f8273
            if (r9 == 0) goto L21
            r9.mo851(r8)
        L21:
            return
    }

    @Override // defpackage.C1908
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void mo1135() {
            r4 = this;
            int r0 = r4.f2025
            r1 = 0
            ᲁᲀᛴᛷ r2 = r4.f2026
            switch(r0) {
                case 0: goto L16;
                default: goto L8;
            }
        L8:
            ᲀᛷᛱᲇ r0 = r2.f8290
            if (r0 == 0) goto L10
            r3 = 1
            r0.m3082(r3)
        L10:
            r2.f8286 = r1
            super.mo1135()
            return
        L16:
            r2.f8293 = r1
            super.mo1135()
            return
    }
}
