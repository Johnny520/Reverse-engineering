package com.bumptech.glide.load;

import p000.AbstractC1269cl;

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


    /* JADX INFO: renamed from: a */
    public final boolean f4344a;

    ImageHeaderParser$ImageType(boolean z) {
        this.f4344a = z;
    }

    public boolean hasAlpha() {
        return this.f4344a;
    }

    public boolean isWebp() {
        int i = AbstractC1269cl.f4314a[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
