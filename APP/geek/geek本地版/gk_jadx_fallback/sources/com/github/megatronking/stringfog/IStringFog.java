package com.github.megatronking.stringfog;

/* JADX INFO: loaded from: classes.dex */
public interface IStringFog {
    java.lang.String decrypt(byte[] r1, byte[] r2);

    byte[] encrypt(java.lang.String r1, byte[] r2);

    boolean shouldFog(java.lang.String r1);
}
