package com.bumptech.glide.load.engine;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
final class CallbackException extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    public CallbackException(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
