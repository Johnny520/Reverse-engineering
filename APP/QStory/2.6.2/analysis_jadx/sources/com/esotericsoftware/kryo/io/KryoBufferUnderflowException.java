package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.KryoException;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class KryoBufferUnderflowException extends KryoException {
    public KryoBufferUnderflowException() {
    }

    public KryoBufferUnderflowException(String str, Throwable th) {
        super(str, th);
    }

    public KryoBufferUnderflowException(String str) {
        super(str);
    }

    public KryoBufferUnderflowException(Throwable th) {
        super(th);
    }
}
