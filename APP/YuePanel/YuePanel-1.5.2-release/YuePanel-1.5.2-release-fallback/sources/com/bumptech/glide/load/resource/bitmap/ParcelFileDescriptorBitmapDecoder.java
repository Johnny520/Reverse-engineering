package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(21)
public final class ParcelFileDescriptorBitmapDecoder implements com.bumptech.glide.load.ResourceDecoder<android.os.ParcelFileDescriptor, android.graphics.Bitmap> {
    private static final int MAXIMUM_FILE_BYTE_SIZE_FOR_FILE_DESCRIPTOR_DECODER = 536870912;
    private final com.bumptech.glide.load.resource.bitmap.Downsampler downsampler;

    public ParcelFileDescriptorBitmapDecoder(com.bumptech.glide.load.resource.bitmap.Downsampler r1) {
            r0 = this;
            r0.<init>()
            r0.downsampler = r1
            return
    }

    private boolean isSafeToTryDecoding(@Yue.InterfaceC4410 android.os.ParcelFileDescriptor r6) {
            r5 = this;
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "HUAWEI"
            boolean r1 = r1.equalsIgnoreCase(r0)
            r2 = 1
            if (r1 != 0) goto L15
            java.lang.String r1 = "HONOR"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L14
            goto L15
        L14:
            return r2
        L15:
            long r0 = r6.getStatSize()
            r3 = 536870912(0x20000000, double:2.65249474E-315)
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 > 0) goto L21
            goto L22
        L21:
            r2 = 0
        L22:
            return r2
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode2(@Yue.InterfaceC4410 android.os.ParcelFileDescriptor r2, int r3, int r4, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r5) throws java.io.IOException {
            r1 = this;
            com.bumptech.glide.load.resource.bitmap.Downsampler r0 = r1.downsampler
            com.bumptech.glide.load.engine.Resource r2 = r0.decode(r2, r3, r4, r5)
            return r2
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    @Yue.InterfaceC4544
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(@Yue.InterfaceC4410 android.os.ParcelFileDescriptor r1, int r2, int r3, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r4) throws java.io.IOException {
            r0 = this;
            android.os.ParcelFileDescriptor r1 = (android.os.ParcelFileDescriptor) r1
            com.bumptech.glide.load.engine.Resource r1 = r0.decode2(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public boolean handles2(@Yue.InterfaceC4410 android.os.ParcelFileDescriptor r1, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r2) {
            r0 = this;
            boolean r2 = r0.isSafeToTryDecoding(r1)
            if (r2 == 0) goto L10
            com.bumptech.glide.load.resource.bitmap.Downsampler r2 = r0.downsampler
            boolean r1 = r2.handles(r1)
            if (r1 == 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public /* bridge */ /* synthetic */ boolean handles(@Yue.InterfaceC4410 android.os.ParcelFileDescriptor r1, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r2) throws java.io.IOException {
            r0 = this;
            android.os.ParcelFileDescriptor r1 = (android.os.ParcelFileDescriptor) r1
            boolean r1 = r0.handles2(r1, r2)
            return r1
    }
}
