package com.bumptech.glide.load.resource.bitmap;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultImageHeaderParser$Reader$EndOfFileException extends IOException {
    private static final long serialVersionUID = 1;

    public DefaultImageHeaderParser$Reader$EndOfFileException() {
        super("Unexpectedly reached end of a file");
    }
}
