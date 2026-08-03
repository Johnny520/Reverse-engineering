package com.bumptech.glide.load;

import Yue.InterfaceC6490;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class HttpException extends IOException {
    public static final int UNKNOWN = -1;
    private static final long serialVersionUID = 1;
    private final int statusCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public HttpException(int i) {
        this("Http request failed", i);
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Deprecated
    public HttpException(String str) {
        this(str, -1);
    }

    public HttpException(String str, int i) {
        this(str, i, null);
    }

    public HttpException(String str, int i, @InterfaceC6490 Throwable th) {
        super(str + ", status code: " + i, th);
        this.statusCode = i;
    }
}
