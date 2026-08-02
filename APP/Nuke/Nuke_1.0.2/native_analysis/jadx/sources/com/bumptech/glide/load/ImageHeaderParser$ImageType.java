package com.bumptech.glide.load;

import p000.jx0;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    HEIF(true),
    ANIMATED_HEIF(true),
    UNKNOWN(false);


    /* JADX INFO: renamed from: h */
    public final boolean f1650h;

    ImageHeaderParser$ImageType(boolean z) {
        this.f1650h = z;
    }

    public boolean hasAlpha() {
        return this.f1650h;
    }

    public boolean isWebp() {
        int i = jx0.f5254a[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
