package com.bumptech.glide.load.engine;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
final class CallbackException extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    public CallbackException(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
