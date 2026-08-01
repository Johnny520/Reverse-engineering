package io.fastkv.interfaces;

/* JADX INFO: loaded from: classes.dex */
public interface FastCipher {
    int decrypt(int r1);

    long decrypt(long r1);

    byte[] decrypt(byte[] r1);

    int encrypt(int r1);

    long encrypt(long r1);

    byte[] encrypt(byte[] r1);
}
