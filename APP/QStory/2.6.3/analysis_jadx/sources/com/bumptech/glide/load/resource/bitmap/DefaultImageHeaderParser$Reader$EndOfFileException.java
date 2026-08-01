package com.bumptech.glide.load.resource.bitmap;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultImageHeaderParser$Reader$EndOfFileException extends IOException {
    private static final long serialVersionUID = 1;

    public DefaultImageHeaderParser$Reader$EndOfFileException() {
        super("Unexpectedly reached end of a file");
    }
}
