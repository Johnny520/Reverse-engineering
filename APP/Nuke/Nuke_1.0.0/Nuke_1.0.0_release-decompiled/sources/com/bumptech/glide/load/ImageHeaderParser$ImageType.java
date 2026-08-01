package com.bumptech.glide.load;

import p078P1.AbstractC1142d;

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
    UNKNOWN(false);


    /* JADX INFO: renamed from: d */
    public final boolean f6562d;

    ImageHeaderParser$ImageType(boolean z5) {
        this.f6562d = z5;
    }

    public boolean hasAlpha() {
        return this.f6562d;
    }

    public boolean isWebp() {
        int i5 = AbstractC1142d.f3778a[ordinal()];
        return i5 == 1 || i5 == 2 || i5 == 3;
    }
}
