package com.github.megatronking.stringfog.xor;

import com.github.megatronking.stringfog.IStringFog;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class StringFogImpl implements IStringFog {
    public StringFogImpl() {
    }

    private static byte[] xor(byte[] r7, byte[] r8) {
        int r0 = r7.length;
        int r1 = r8.length;
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r3 >= r0) goto L7;
        if (r4 < r1) goto L6;
        r4 = 0;
    L6:
        r7[r3] = (byte) (r7[r3] ^ r8[r4]);
        r3 = r3 + 1;
        r4 = r4 + 1;
        goto L3
    L7:
        return r7;
    }

    @Override // com.github.megatronking.stringfog.IStringFog
    public String decrypt(byte[] r2, byte[] r3) {
        return new String(xor(r2, r3), StandardCharsets.UTF_8);
    }

    @Override // com.github.megatronking.stringfog.IStringFog
    public byte[] encrypt(String r2, byte[] r3) {
        return xor(r2.getBytes(StandardCharsets.UTF_8), r3);
    }

    @Override // com.github.megatronking.stringfog.IStringFog
    public boolean shouldFog(String r1) {
        return true;
    }
}
