package io.fastkv.interfaces;

/* JADX INFO: loaded from: classes.dex */
public interface FastEncoder<T> {
    T decode(byte[] r1, int r2, int r3);

    byte[] encode(T r1);

    java.lang.String tag();
}
