package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class ServiceException extends Exception {
    private static final long serialVersionUID = -1219262335729891920L;

    public ServiceException(String str) {
        super(str);
    }

    public ServiceException(Throwable th) {
        super(th);
    }

    public ServiceException(String str, Throwable th) {
        super(str, th);
    }
}
