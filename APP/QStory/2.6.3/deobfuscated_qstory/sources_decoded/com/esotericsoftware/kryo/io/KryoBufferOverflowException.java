package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.KryoException;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class KryoBufferOverflowException extends KryoException {
    public KryoBufferOverflowException() {
    }

    public KryoBufferOverflowException(String str, Throwable th) {
        super(str, th);
    }

    public KryoBufferOverflowException(String str) {
        super(str);
    }

    public KryoBufferOverflowException(Throwable th) {
        super(th);
    }
}
