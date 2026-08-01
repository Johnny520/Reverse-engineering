package com.github.megatronking.stringfog.xor;

/* JADX INFO: loaded from: classes.dex */
public final class StringFogImpl implements com.github.megatronking.stringfog.IStringFog {
    public StringFogImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    private static byte[] xor(byte[] r7, byte[] r8) {
            int r0 = r7.length
            int r1 = r8.length
            r2 = 0
            r3 = r2
            r4 = r3
        L5:
            if (r3 >= r0) goto L17
            if (r4 < r1) goto La
            r4 = r2
        La:
            r5 = r7[r3]
            r6 = r8[r4]
            r5 = r5 ^ r6
            byte r5 = (byte) r5
            r7[r3] = r5
            int r3 = r3 + 1
            int r4 = r4 + 1
            goto L5
        L17:
            return r7
    }

    @Override // com.github.megatronking.stringfog.IStringFog
    public java.lang.String decrypt(byte[] r2, byte[] r3) {
            r1 = this;
            java.lang.String r0 = new java.lang.String
            byte[] r2 = xor(r2, r3)
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            r0.<init>(r2, r3)
            return r0
    }

    @Override // com.github.megatronking.stringfog.IStringFog
    public byte[] encrypt(java.lang.String r2, byte[] r3) {
            r1 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r2 = r2.getBytes(r0)
            byte[] r2 = xor(r2, r3)
            return r2
    }

    @Override // com.github.megatronking.stringfog.IStringFog
    public boolean shouldFog(java.lang.String r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
