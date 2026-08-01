package defpackage;

/* JADX INFO: renamed from: ᛱᛵᛸᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0095 implements defpackage.InterfaceC0391 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C2063 f897;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.ArrayList f898;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1713 f899;

    public C0095(java.util.ArrayList r1, defpackage.C1713 r2, defpackage.C2063 r3) {
            r0 = this;
            r0.<init>()
            r0.f898 = r1
            r0.f899 = r2
            r0.f897 = r3
            return
    }

    @Override // defpackage.InterfaceC0391
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final defpackage.InterfaceC1901 mo382(java.lang.Object r6, int r7, int r8, defpackage.C0533 r9) {
            r5 = this;
            java.io.InputStream r6 = (java.io.InputStream) r6
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 16384(0x4000, float:2.2959E-41)
            r0.<init>(r1)
            r2 = 0
            byte[] r1 = new byte[r1]     // Catch: java.io.IOException -> L18
        Lc:
            int r3 = r6.read(r1)     // Catch: java.io.IOException -> L18
            r4 = -1
            if (r3 == r4) goto L1a
            r4 = 0
            r0.write(r1, r4, r3)     // Catch: java.io.IOException -> L18
            goto Lc
        L18:
            r6 = move-exception
            goto L22
        L1a:
            r0.flush()     // Catch: java.io.IOException -> L18
            byte[] r6 = r0.toByteArray()
            goto L31
        L22:
            r0 = 5
            java.lang.String r1 = "StreamGifDecoder"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L30
            java.lang.String r0 = "Error reading data from stream"
            android.util.Log.w(r1, r0, r6)
        L30:
            r6 = r2
        L31:
            if (r6 != 0) goto L34
            goto L3e
        L34:
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            ᲀᛷᲁᛶ r5 = r5.f899
            ᲁᛸᛸ r2 = r5.mo382(r6, r7, r8, r9)
        L3e:
            return r2
    }

    @Override // defpackage.InterfaceC0391
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final boolean mo383(java.lang.Object r2, defpackage.C0533 r3) {
            r1 = this;
            java.io.InputStream r2 = (java.io.InputStream) r2
            ᛵᲇᛳᲇ r0 = defpackage.AbstractC1299.f5760
            java.lang.Object r3 = r3.m1326(r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L1e
            java.util.ArrayList r3 = r1.f898
            ᲇᛶᛳᛱ r1 = r1.f897
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = defpackage.AbstractC1849.m3241(r3, r2, r1)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = com.bumptech.glide.load.ImageHeaderParser$ImageType.GIF
            if (r1 != r2) goto L1e
            r1 = 1
            return r1
        L1e:
            r1 = 0
            return r1
    }
}
