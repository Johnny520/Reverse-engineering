package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(27)
public final class ExifInterfaceImageHeaderParser implements com.bumptech.glide.load.ImageHeaderParser {
    public ExifInterfaceImageHeaderParser() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int getOrientation(@Yue.InterfaceC4410 java.io.InputStream r2, @Yue.InterfaceC4410 com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r3) throws java.io.IOException {
            r1 = this;
            Yue.ۥۣ۠ۡۦ r3 = new Yue.ۥۣ۠ۡۦ
            r3.<init>(r2)
            java.lang.String r2 = "Orientation"
            r0 = 1
            int r2 = r3.m10547(r2, r0)
            if (r2 != 0) goto Lf
            r2 = -1
        Lf:
            return r2
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int getOrientation(@Yue.InterfaceC4410 java.nio.ByteBuffer r1, @Yue.InterfaceC4410 com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2) throws java.io.IOException {
            r0 = this;
            java.io.InputStream r1 = com.bumptech.glide.util.ByteBufferUtil.toStream(r1)
            int r1 = r0.getOrientation(r1, r2)
            return r1
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @Yue.InterfaceC4410
    public com.bumptech.glide.load.ImageHeaderParser.ImageType getType(@Yue.InterfaceC4410 java.io.InputStream r1) {
            r0 = this;
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r1
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @Yue.InterfaceC4410
    public com.bumptech.glide.load.ImageHeaderParser.ImageType getType(@Yue.InterfaceC4410 java.nio.ByteBuffer r1) {
            r0 = this;
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r1
    }
}
