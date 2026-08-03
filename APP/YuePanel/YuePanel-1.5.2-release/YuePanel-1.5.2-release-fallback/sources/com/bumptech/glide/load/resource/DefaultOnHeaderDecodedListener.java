package com.bumptech.glide.load.resource;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(api = 28)
public final class DefaultOnHeaderDecodedListener implements android.graphics.ImageDecoder$OnHeaderDecodedListener {
    private static final java.lang.String TAG = "ImageDecoder";
    private final com.bumptech.glide.load.DecodeFormat decodeFormat;
    private final com.bumptech.glide.load.resource.bitmap.HardwareConfigState hardwareConfigState;
    private final boolean isHardwareConfigAllowed;
    private final com.bumptech.glide.load.PreferredColorSpace preferredColorSpace;
    private final int requestedHeight;
    private final int requestedWidth;
    private final com.bumptech.glide.load.resource.bitmap.DownsampleStrategy strategy;


    public DefaultOnHeaderDecodedListener(int r2, int r3, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r4) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.resource.bitmap.HardwareConfigState r0 = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.getInstance()
            r1.hardwareConfigState = r0
            r1.requestedWidth = r2
            r1.requestedHeight = r3
            com.bumptech.glide.load.Option<com.bumptech.glide.load.DecodeFormat> r2 = com.bumptech.glide.load.resource.bitmap.Downsampler.DECODE_FORMAT
            java.lang.Object r2 = r4.get(r2)
            com.bumptech.glide.load.DecodeFormat r2 = (com.bumptech.glide.load.DecodeFormat) r2
            r1.decodeFormat = r2
            com.bumptech.glide.load.Option<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy> r2 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.OPTION
            java.lang.Object r2 = r4.get(r2)
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2 = (com.bumptech.glide.load.resource.bitmap.DownsampleStrategy) r2
            r1.strategy = r2
            com.bumptech.glide.load.Option<java.lang.Boolean> r2 = com.bumptech.glide.load.resource.bitmap.Downsampler.ALLOW_HARDWARE_CONFIG
            java.lang.Object r3 = r4.get(r2)
            if (r3 == 0) goto L37
            java.lang.Object r2 = r4.get(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L37
            r2 = 1
            goto L38
        L37:
            r2 = 0
        L38:
            r1.isHardwareConfigAllowed = r2
            com.bumptech.glide.load.Option<com.bumptech.glide.load.PreferredColorSpace> r2 = com.bumptech.glide.load.resource.bitmap.Downsampler.PREFERRED_COLOR_SPACE
            java.lang.Object r2 = r4.get(r2)
            com.bumptech.glide.load.PreferredColorSpace r2 = (com.bumptech.glide.load.PreferredColorSpace) r2
            r1.preferredColorSpace = r2
            return
    }

    public void onHeaderDecoded(@Yue.InterfaceC4410 android.graphics.ImageDecoder r7, @Yue.InterfaceC4410 android.graphics.ImageDecoder.ImageInfo r8, @Yue.InterfaceC4410 android.graphics.ImageDecoder.Source r9) {
            r6 = this;
            com.bumptech.glide.load.resource.bitmap.HardwareConfigState r9 = r6.hardwareConfigState
            int r0 = r6.requestedWidth
            int r1 = r6.requestedHeight
            boolean r2 = r6.isHardwareConfigAllowed
            r3 = 0
            boolean r9 = r9.isHardwareConfigAllowed(r0, r1, r2, r3)
            if (r9 == 0) goto L14
            r9 = 3
            Yue.C1775.m8461(r7, r9)
            goto L18
        L14:
            r9 = 1
            Yue.C1775.m8461(r7, r9)
        L18:
            com.bumptech.glide.load.DecodeFormat r9 = r6.decodeFormat
            com.bumptech.glide.load.DecodeFormat r0 = com.bumptech.glide.load.DecodeFormat.PREFER_RGB_565
            if (r9 != r0) goto L21
            Yue.C1776.m8462(r7, r3)
        L21:
            com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener$1 r9 = new com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener$1
            r9.<init>(r6)
            Yue.C1777.m8463(r7, r9)
            android.util.Size r9 = Yue.C1778.m8464(r8)
            int r0 = r6.requestedWidth
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto L37
            int r0 = r9.getWidth()
        L37:
            int r2 = r6.requestedHeight
            if (r2 != r1) goto L3f
            int r2 = r9.getHeight()
        L3f:
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r1 = r6.strategy
            int r3 = r9.getWidth()
            int r4 = r9.getHeight()
            float r0 = r1.getScaleFactor(r3, r4, r0, r2)
            int r1 = r9.getWidth()
            float r1 = (float) r1
            float r1 = r1 * r0
            int r1 = java.lang.Math.round(r1)
            int r2 = r9.getHeight()
            float r2 = (float) r2
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            r3 = 2
            java.lang.String r4 = "ImageDecoder"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto La4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resizing from ["
            r3.append(r5)
            int r5 = r9.getWidth()
            r3.append(r5)
            java.lang.String r5 = "x"
            r3.append(r5)
            int r9 = r9.getHeight()
            r3.append(r9)
            java.lang.String r9 = "] to ["
            r3.append(r9)
            r3.append(r1)
            r3.append(r5)
            r3.append(r2)
            java.lang.String r9 = "] scaleFactor: "
            r3.append(r9)
            r3.append(r0)
            java.lang.String r9 = r3.toString()
            android.util.Log.v(r4, r9)
        La4:
            Yue.C1779.m8465(r7, r1, r2)
            com.bumptech.glide.load.PreferredColorSpace r9 = r6.preferredColorSpace
            if (r9 == 0) goto Ldb
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld2
            com.bumptech.glide.load.PreferredColorSpace r0 = com.bumptech.glide.load.PreferredColorSpace.DISPLAY_P3
            if (r9 != r0) goto Lc8
            android.graphics.ColorSpace r9 = Yue.C1780.m8466(r8)
            if (r9 == 0) goto Lc8
            android.graphics.ColorSpace r8 = Yue.C1780.m8466(r8)
            boolean r8 = r8.isWideGamut()
            if (r8 == 0) goto Lc8
            android.graphics.ColorSpace$Named r8 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto Lca
        Lc8:
            android.graphics.ColorSpace$Named r8 = android.graphics.ColorSpace.Named.SRGB
        Lca:
            android.graphics.ColorSpace r8 = android.graphics.ColorSpace.get(r8)
            Yue.C1781.m8467(r7, r8)
            goto Ldb
        Ld2:
            android.graphics.ColorSpace$Named r8 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r8 = android.graphics.ColorSpace.get(r8)
            Yue.C1781.m8467(r7, r8)
        Ldb:
            return
    }
}
