package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.KryoException;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
