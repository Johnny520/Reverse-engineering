package com.bumptech.glide.load;

import p000.AbstractC1269cl;

/* JADX INFO: loaded from: classes.dex */
public enum ImageHeaderParser$ImageType extends Enum<ImageHeaderParser$ImageType> {
    private static final /* synthetic */ ImageHeaderParser$ImageType[] $VALUES = null;
    public static final ImageHeaderParser$ImageType ANIMATED_AVIF = null;
    public static final ImageHeaderParser$ImageType ANIMATED_WEBP = null;
    public static final ImageHeaderParser$ImageType AVIF = null;
    public static final ImageHeaderParser$ImageType GIF = null;
    public static final ImageHeaderParser$ImageType JPEG = null;
    public static final ImageHeaderParser$ImageType PNG = null;
    public static final ImageHeaderParser$ImageType PNG_A = null;
    public static final ImageHeaderParser$ImageType RAW = null;
    public static final ImageHeaderParser$ImageType UNKNOWN = null;
    public static final ImageHeaderParser$ImageType WEBP = null;
    public static final ImageHeaderParser$ImageType WEBP_A = null;

    /* JADX INFO: renamed from: a */
    public final boolean f4344a;

    static {
        ImageHeaderParser$ImageType r0 = new ImageHeaderParser$ImageType(0, "GIF", true);
        GIF = r0;
        ImageHeaderParser$ImageType r1 = new ImageHeaderParser$ImageType(1, "JPEG", false);
        JPEG = r1;
        ImageHeaderParser$ImageType r2 = new ImageHeaderParser$ImageType(2, "RAW", false);
        RAW = r2;
        ImageHeaderParser$ImageType r3 = new ImageHeaderParser$ImageType(3, "PNG_A", true);
        PNG_A = r3;
        ImageHeaderParser$ImageType r4 = new ImageHeaderParser$ImageType(4, "PNG", false);
        PNG = r4;
        ImageHeaderParser$ImageType r5 = new ImageHeaderParser$ImageType(5, "WEBP_A", true);
        WEBP_A = r5;
        ImageHeaderParser$ImageType r6 = new ImageHeaderParser$ImageType(6, "WEBP", false);
        WEBP = r6;
        ImageHeaderParser$ImageType r7 = new ImageHeaderParser$ImageType(7, "ANIMATED_WEBP", true);
        ANIMATED_WEBP = r7;
        ImageHeaderParser$ImageType r8 = new ImageHeaderParser$ImageType(8, "AVIF", true);
        AVIF = r8;
        ImageHeaderParser$ImageType r9 = new ImageHeaderParser$ImageType(9, "ANIMATED_AVIF", true);
        ANIMATED_AVIF = r9;
        ImageHeaderParser$ImageType r10 = new ImageHeaderParser$ImageType(10, "UNKNOWN", false);
        UNKNOWN = r10;
        $VALUES = new ImageHeaderParser$ImageType[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10};
    }

    ImageHeaderParser$ImageType(int r1, String r2, boolean r3) {
        this.f4344a = r3;
    }

    public static ImageHeaderParser$ImageType valueOf(String r1) {
        return (ImageHeaderParser$ImageType) Enum.valueOf(ImageHeaderParser$ImageType.class, r1);
    }

    public static ImageHeaderParser$ImageType[] values() {
        return (ImageHeaderParser$ImageType[]) $VALUES.clone();
    }

    public boolean hasAlpha() {
        return this.f4344a;
    }

    public boolean isWebp() {
        int r0 = AbstractC1269cl.f4314a[ordinal()];
        if (r0 != 1) goto L5;
    L10:
        return true;
    L5:
        if (r0 == 2) goto L10;
        if (r0 == 3) goto L10;
        return false;
    }
}
