package com.bumptech.glide;

/* JADX INFO: renamed from: com.bumptech.glide.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1929k extends RuntimeException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1929k(Class cls) {
        super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
    }
}
