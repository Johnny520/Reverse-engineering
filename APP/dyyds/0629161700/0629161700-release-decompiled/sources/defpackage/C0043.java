package defpackage;

/* JADX INFO: renamed from: ᛱᛲᲀᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0043 implements defpackage.InterfaceC0391 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f560;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC1612 f561;

    public C0043() {
            r2 = this;
            r0 = 0
            r2.f560 = r0
            r2.<init>()
            ᛷᲈᲀ r0 = new ᛷᲈᲀ
            r1 = 12
            r0.<init>(r1)
            r2.f561 = r0
            return
    }

    public C0043(defpackage.InterfaceC1612 r2) {
            r1 = this;
            r0 = 1
            r1.f560 = r0
            r1.<init>()
            r1.f561 = r2
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.C0162 m381(android.graphics.ImageDecoder.Source r4, int r5, int r6, defpackage.C0533 r7) {
            r3 = this;
            ᛵᛶᲇᛳ r0 = new ᛵᛶᲇᛳ
            r0.<init>(r5, r6, r7)
            android.graphics.Bitmap r4 = android.graphics.ImageDecoder.decodeBitmap(r4, r0)
            r7 = 2
            java.lang.String r0 = "BitmapImageDecoder"
            boolean r7 = android.util.Log.isLoggable(r0, r7)
            if (r7 == 0) goto L46
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "Decoded ["
            r7.<init>(r1)
            int r1 = r4.getWidth()
            r7.append(r1)
            java.lang.String r1 = "x"
            r7.append(r1)
            int r2 = r4.getHeight()
            r7.append(r2)
            java.lang.String r2 = "] for ["
            r7.append(r2)
            r7.append(r5)
            r7.append(r1)
            r7.append(r6)
            java.lang.String r5 = "]"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            android.util.Log.v(r0, r5)
        L46:
            ᛱᲀᛴᲁ r5 = new ᛱᲀᛴᲁ
            ᛸᲈᲇᲁ r3 = r3.f561
            ᛷᲈᲀ r3 = (defpackage.C1403) r3
            r5.<init>(r3, r4)
            return r5
    }

    @Override // defpackage.InterfaceC0391
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.InterfaceC1901 mo382(java.lang.Object r2, int r3, int r4, defpackage.C0533 r5) {
            r1 = this;
            int r0 = r1.f560
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            ᛱᛷᛴᛷ r2 = (defpackage.C0127) r2
            android.graphics.Bitmap r2 = r2.m641()
            ᛸᲈᲇᲁ r1 = r1.f561
            ᛱᲀᛴᲁ r1 = defpackage.C0162.m691(r1, r2)
            return r1
        L12:
            android.graphics.ImageDecoder$Source r2 = (android.graphics.ImageDecoder.Source) r2
            ᛱᲀᛴᲁ r1 = r1.m381(r2, r3, r4, r5)
            return r1
    }

    @Override // defpackage.InterfaceC0391
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final boolean mo383(java.lang.Object r1, defpackage.C0533 r2) {
            r0 = this;
            int r0 = r0.f560
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            ᛱᛷᛴᛷ r1 = (defpackage.C0127) r1
        L7:
            r0 = 1
            return r0
        L9:
            android.graphics.ImageDecoder$Source r1 = (android.graphics.ImageDecoder.Source) r1
            goto L7
    }
}
