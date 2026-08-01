package com.github.megatronking.stringfog;

/* JADX INFO: loaded from: classes.dex */
public interface IStringFog {
    String decrypt(byte[] r1, byte[] r2);

    byte[] encrypt(String r1, byte[] r2);

    boolean shouldFog(String r1);
}
