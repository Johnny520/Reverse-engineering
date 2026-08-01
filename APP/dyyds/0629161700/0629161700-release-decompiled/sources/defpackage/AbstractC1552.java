package defpackage;

/* JADX INFO: renamed from: ᛸᛸᲈᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1552 implements defpackage.InterfaceC0660 {
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public abstract android.graphics.Bitmap mo1821(defpackage.InterfaceC1612 r1, android.graphics.Bitmap r2, int r3, int r4);

    @Override // defpackage.InterfaceC0660
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final defpackage.InterfaceC1901 mo1493(android.content.Context r3, defpackage.InterfaceC1901 r4, int r5, int r6) {
            r2 = this;
            boolean r0 = defpackage.AbstractC1754.m3156(r5, r6)
            if (r0 == 0) goto L30
            com.bumptech.glide.ᛷᲁᛳᛳ r3 = com.bumptech.glide.ComponentCallbacks2C0007.m235(r3)
            ᛸᲈᲇᲁ r3 = r3.f354
            java.lang.Object r0 = r4.get()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r1) goto L1a
            int r5 = r0.getWidth()
        L1a:
            if (r6 != r1) goto L20
            int r6 = r0.getHeight()
        L20:
            android.graphics.Bitmap r2 = r2.mo1821(r3, r0, r5, r6)
            boolean r5 = r0.equals(r2)
            if (r5 == 0) goto L2b
            return r4
        L2b:
            ᛱᲀᛴᲁ r2 = defpackage.C0162.m691(r3, r2)
            return r2
        L30:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Cannot apply transformation on width: "
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r4 = " or height: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " less than or equal to zero and not Target.SIZE_ORIGINAL"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }
}
