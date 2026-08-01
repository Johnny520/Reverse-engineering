package io.fastkv.interfaces;

/* JADX INFO: loaded from: classes.dex */
public interface FastCipher {
    int decrypt(int i);

    long decrypt(long j);

    byte[] decrypt(byte[] bArr);

    int encrypt(int i);

    long encrypt(long j);

    byte[] encrypt(byte[] bArr);
}
