package defpackage;

/* JADX INFO: renamed from: ᲀᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1744 implements defpackage.InterfaceC0660 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final boolean f7727;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC0660 f7728;

    public C1744(defpackage.InterfaceC0660 r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f7728 = r1
            r0.f7727 = r2
            return
    }

    @Override // defpackage.InterfaceC1711
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.C1744
            if (r0 == 0) goto Lf
            ᲀᲀᛸ r2 = (defpackage.C1744) r2
            ᛴᛴᲀᛶ r1 = r1.f7728
            ᛴᛴᲀᛶ r2 = r2.f7728
            boolean r1 = r1.equals(r2)
            return r1
        Lf:
            r1 = 0
            return r1
    }

    @Override // defpackage.InterfaceC1711
    public final int hashCode() {
            r0 = this;
            ᛴᛴᲀᛶ r0 = r0.f7728
            int r0 = r0.hashCode()
            return r0
    }

    @Override // defpackage.InterfaceC0660
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final defpackage.InterfaceC1901 mo1493(android.content.Context r3, defpackage.InterfaceC1901 r4, int r5, int r6) {
            r2 = this;
            com.bumptech.glide.ᛷᲁᛳᛳ r0 = com.bumptech.glide.ComponentCallbacks2C0007.m235(r3)
            ᛸᲈᲇᲁ r0 = r0.f354
            java.lang.Object r1 = r4.get()
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            ᛱᲀᛴᲁ r0 = defpackage.AbstractC0729.m1638(r0, r1, r5, r6)
            if (r0 != 0) goto L20
            boolean r2 = r2.f7727
            if (r2 != 0) goto L17
            return r4
        L17:
            java.lang.String r2 = "Unable to convert "
            java.lang.String r3 = " to a Bitmap"
            defpackage.C0086.m559(r1, r2, r3)
            r2 = 0
            return r2
        L20:
            ᛴᛴᲀᛶ r2 = r2.f7728
            ᲁᛸᛸ r2 = r2.mo1493(r3, r0, r5, r6)
            boolean r5 = r2.equals(r0)
            if (r5 == 0) goto L30
            r2.mo692()
            return r4
        L30:
            android.content.res.Resources r3 = r3.getResources()
            ᛱᲀᛴᲁ r4 = new ᛱᲀᛴᲁ
            r4.<init>(r3, r2)
            return r4
    }

    @Override // defpackage.InterfaceC1711
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo1225(java.security.MessageDigest r1) {
            r0 = this;
            ᛴᛴᲀᛶ r0 = r0.f7728
            r0.mo1225(r1)
            return
    }
}
