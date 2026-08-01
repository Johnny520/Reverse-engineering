package defpackage;

/* JADX INFO: renamed from: ᛶᲁᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1161 implements defpackage.InterfaceC0391 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f5266;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0682 f5267;

    public /* synthetic */ C1161(defpackage.C0682 r1, int r2) {
            r0 = this;
            r0.f5266 = r2
            r0.f5267 = r1
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC0391
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final defpackage.InterfaceC1901 mo382(java.lang.Object r1, int r2, int r3, defpackage.C0533 r4) {
            r0 = this;
            int r0 = r0.f5266
            switch(r0) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            java.io.InputStream r1 = (java.io.InputStream) r1
            java.nio.ByteBuffer r0 = defpackage.AbstractC0036.m364(r1)
            android.graphics.ImageDecoder$Source r0 = android.graphics.ImageDecoder.createSource(r0)
            ᛵᛲᲁᲇ r0 = defpackage.C0682.m1537(r0, r2, r3, r4)
            return r0
        L14:
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            android.graphics.ImageDecoder$Source r0 = android.graphics.ImageDecoder.createSource(r1)
            ᛵᛲᲁᲇ r0 = defpackage.C0682.m1537(r0, r2, r3, r4)
            return r0
    }

    @Override // defpackage.InterfaceC0391
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final boolean mo383(java.lang.Object r4, defpackage.C0533 r5) {
            r3 = this;
            int r5 = r3.f5266
            r0 = 1
            r1 = 0
            r2 = 31
            ᛴᛵᲇᲇ r3 = r3.f5267
            switch(r5) {
                case 0: goto L28;
                default: goto Lb;
            }
        Lb:
            java.io.InputStream r4 = (java.io.InputStream) r4
            java.lang.Object r5 = r3.f3286
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r3 = r3.f3285
            ᲇᛶᛳᛱ r3 = (defpackage.C2063) r3
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = defpackage.AbstractC1849.m3241(r5, r4, r3)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r4 = com.bumptech.glide.load.ImageHeaderParser$ImageType.ANIMATED_WEBP
            if (r3 == r4) goto L27
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r2) goto L26
            com.bumptech.glide.load.ImageHeaderParser$ImageType r4 = com.bumptech.glide.load.ImageHeaderParser$ImageType.ANIMATED_AVIF
            if (r3 != r4) goto L26
            goto L27
        L26:
            r0 = r1
        L27:
            return r0
        L28:
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            java.lang.Object r3 = r3.f3286
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = defpackage.AbstractC1849.m3250(r3, r4)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r4 = com.bumptech.glide.load.ImageHeaderParser$ImageType.ANIMATED_WEBP
            if (r3 == r4) goto L40
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r2) goto L3f
            com.bumptech.glide.load.ImageHeaderParser$ImageType r4 = com.bumptech.glide.load.ImageHeaderParser$ImageType.ANIMATED_AVIF
            if (r3 != r4) goto L3f
            goto L40
        L3f:
            r0 = r1
        L40:
            return r0
    }
}
