package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
