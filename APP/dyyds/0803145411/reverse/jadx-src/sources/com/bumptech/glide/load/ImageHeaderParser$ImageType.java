package com.bumptech.glide.load;

import yyds.AbstractC0563;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
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


    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean f374;

    ImageHeaderParser$ImageType(boolean z) {
        this.f374 = z;
    }

    public boolean hasAlpha() {
        return this.f374;
    }

    public boolean isWebp() {
        int i = AbstractC0563.f2696[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
