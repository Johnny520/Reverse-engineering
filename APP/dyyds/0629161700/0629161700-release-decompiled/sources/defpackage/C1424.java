package defpackage;

/* JADX INFO: renamed from: ᛸᛱᲀᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1424 implements defpackage.InterfaceC1215 {
    @Override // defpackage.InterfaceC1215
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final boolean mo800(java.io.InputStream r1, defpackage.C2063 r2) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC1215
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final int mo801(java.nio.ByteBuffer r2, defpackage.C2063 r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = defpackage.AbstractC0036.f535
            ᛵᛱᲈᛷ r0 = new ᛵᛱᲈᛷ
            r0.<init>(r2)
            int r1 = r1.mo804(r0, r3)
            return r1
    }

    @Override // defpackage.InterfaceC1215
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final boolean mo802(java.nio.ByteBuffer r1, defpackage.C2063 r2) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC1215
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final com.bumptech.glide.load.ImageHeaderParser$ImageType mo803(java.nio.ByteBuffer r1) {
            r0 = this;
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN
            return r0
    }

    @Override // defpackage.InterfaceC1215
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final int mo804(java.io.InputStream r1, defpackage.C2063 r2) {
            r0 = this;
            ᛸᛸᛴ r0 = new ᛸᛸᛴ
            r0.<init>(r1)
            java.lang.String r1 = "Orientation"
            ᲈᛱᛵᛸ r1 = r0.m2811(r1)
            if (r1 != 0) goto Le
            goto L15
        Le:
            java.nio.ByteOrder r0 = r0.f6834     // Catch: java.lang.NumberFormatException -> L15
            int r0 = r1.m3574(r0)     // Catch: java.lang.NumberFormatException -> L15
            goto L16
        L15:
            r0 = 1
        L16:
            if (r0 != 0) goto L19
            r0 = -1
        L19:
            return r0
    }

    @Override // defpackage.InterfaceC1215
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final com.bumptech.glide.load.ImageHeaderParser$ImageType mo805(java.io.InputStream r1) {
            r0 = this;
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN
            return r0
    }
}
