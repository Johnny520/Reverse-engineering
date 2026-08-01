package defpackage;

/* JADX INFO: renamed from: ᲈᲈᲁᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2373 implements defpackage.InterfaceC0660 {

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC0660 f10258;

    public C2373(defpackage.InterfaceC0660 r1) {
            r0 = this;
            r0.<init>()
            r0.f10258 = r1
            return
    }

    @Override // defpackage.InterfaceC1711
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.C2373
            if (r0 == 0) goto Lf
            ᲈᲈᲁᛵ r2 = (defpackage.C2373) r2
            ᛴᛴᲀᛶ r1 = r1.f10258
            ᛴᛴᲀᛶ r2 = r2.f10258
            boolean r1 = r1.equals(r2)
            return r1
        Lf:
            r1 = 0
            return r1
    }

    @Override // defpackage.InterfaceC1711
    public final int hashCode() {
            r0 = this;
            ᛴᛴᲀᛶ r0 = r0.f10258
            int r0 = r0.hashCode()
            return r0
    }

    @Override // defpackage.InterfaceC0660
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final defpackage.InterfaceC1901 mo1493(android.content.Context r5, defpackage.InterfaceC1901 r6, int r7, int r8) {
            r4 = this;
            java.lang.Object r0 = r6.get()
            ᛶᛴᲁᛱ r0 = (defpackage.C1064) r0
            com.bumptech.glide.ᛷᲁᛳᛳ r1 = com.bumptech.glide.ComponentCallbacks2C0007.m235(r5)
            ᛸᲈᲇᲁ r1 = r1.f354
            ᛲᛱᲀᲈ r2 = r0.f4720
            ᛲᲀᲁᛲ r2 = r2.f1435
            android.graphics.Bitmap r2 = r2.f1819
            ᛱᲀᛴᲁ r3 = new ᛱᲀᛴᲁ
            r3.<init>(r1, r2)
            ᛴᛴᲀᛶ r4 = r4.f10258
            ᲁᛸᛸ r5 = r4.mo1493(r5, r3, r7, r8)
            if (r3 == r5) goto L22
            r3.mo692()
        L22:
            java.lang.Object r5 = r5.get()
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            ᛲᛱᲀᲈ r7 = r0.f4720
            ᛲᲀᲁᛲ r7 = r7.f1435
            r7.m1063(r4, r5)
            return r6
    }

    @Override // defpackage.InterfaceC1711
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo1225(java.security.MessageDigest r1) {
            r0 = this;
            ᛴᛴᲀᛶ r0 = r0.f10258
            r0.mo1225(r1)
            return
    }
}
