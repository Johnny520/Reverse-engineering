package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RpcUtil$AlreadyCalledException extends RuntimeException {
    private static final long serialVersionUID = 5469741279507848266L;

    public RpcUtil$AlreadyCalledException() {
        super("This RpcCallback was already called and cannot be called multiple times.");
    }
}
