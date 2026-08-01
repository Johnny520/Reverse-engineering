package io.fastkv.interfaces;

/* JADX INFO: loaded from: classes.dex */
public interface FastEncoder<T> {
    T decode(byte[] bArr, int i, int i2);

    byte[] encode(T t);

    String tag();
}
