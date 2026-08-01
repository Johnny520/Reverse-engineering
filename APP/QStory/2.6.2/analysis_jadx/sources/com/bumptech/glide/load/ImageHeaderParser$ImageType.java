package com.bumptech.glide.load;

import p286.AbstractC8394;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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

    private final boolean hasAlpha;

    ImageHeaderParser$ImageType(boolean z) {
        this.hasAlpha = z;
    }

    public boolean hasAlpha() {
        return this.hasAlpha;
    }

    public boolean isWebp() {
        int i = AbstractC8394.f23272[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
