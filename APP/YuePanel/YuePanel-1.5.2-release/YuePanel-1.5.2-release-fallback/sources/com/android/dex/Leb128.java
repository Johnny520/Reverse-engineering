package com.android.dex;

/* JADX INFO: loaded from: classes.dex */
public final class Leb128 {
    private Leb128() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int readSignedLeb128(com.android.dex.util.ByteInput r6) {
            r0 = 0
            r1 = -1
            r2 = r1
            r1 = r0
        L4:
            byte r3 = r6.readByte()
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r1 * 7
            int r4 = r4 << r5
            r0 = r0 | r4
            int r2 = r2 << 7
            int r1 = r1 + 1
            r4 = 128(0x80, float:1.8E-43)
            r3 = r3 & r4
            if (r3 != r4) goto L1a
            r5 = 5
            if (r1 < r5) goto L4
        L1a:
            if (r3 == r4) goto L23
            int r6 = r2 >> 1
            r6 = r6 & r0
            if (r6 == 0) goto L22
            r0 = r0 | r2
        L22:
            return r0
        L23:
            com.android.dex.DexException r6 = new com.android.dex.DexException
            java.lang.String r0 = "invalid LEB128 sequence"
            r6.<init>(r0)
            throw r6
    }

    public static int readUnsignedLeb128(com.android.dex.util.ByteInput r5) {
            r0 = 0
            r1 = r0
        L2:
            byte r2 = r5.readByte()
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r4 = r1 * 7
            int r3 = r3 << r4
            r0 = r0 | r3
            int r1 = r1 + 1
            r3 = 128(0x80, float:1.8E-43)
            r2 = r2 & r3
            if (r2 != r3) goto L16
            r4 = 5
            if (r1 < r4) goto L2
        L16:
            if (r2 == r3) goto L19
            return r0
        L19:
            com.android.dex.DexException r5 = new com.android.dex.DexException
            java.lang.String r0 = "invalid LEB128 sequence"
            r5.<init>(r0)
            throw r5
    }

    public static int unsignedLeb128Size(int r1) {
            int r1 = r1 >> 7
            r0 = 0
        L3:
            if (r1 == 0) goto La
            int r1 = r1 >> 7
            int r0 = r0 + 1
            goto L3
        La:
            int r0 = r0 + 1
            return r0
    }

    public static void writeSignedLeb128(com.android.dex.util.ByteOutput r7, int r8) {
            int r0 = r8 >> 7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r8
            r2 = 0
            if (r1 != 0) goto La
            r1 = r2
            goto Lb
        La:
            r1 = -1
        Lb:
            r3 = 1
            r4 = r3
        Ld:
            r6 = r0
            r0 = r8
            r8 = r6
            if (r4 == 0) goto L2f
            if (r8 != r1) goto L1e
            r4 = r8 & 1
            int r5 = r0 >> 6
            r5 = r5 & r3
            if (r4 == r5) goto L1c
            goto L1e
        L1c:
            r4 = r2
            goto L1f
        L1e:
            r4 = r3
        L1f:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            if (r4 == 0) goto L26
            r5 = 128(0x80, float:1.8E-43)
            goto L27
        L26:
            r5 = r2
        L27:
            r0 = r0 | r5
            byte r0 = (byte) r0
            r7.writeByte(r0)
            int r0 = r8 >> 7
            goto Ld
        L2f:
            return
    }

    public static void writeUnsignedLeb128(com.android.dex.util.ByteOutput r2, int r3) {
        L0:
            int r0 = r3 >>> 7
            r1 = r0
            r0 = r3
            r3 = r1
            if (r3 == 0) goto L10
            r0 = r0 & 127(0x7f, float:1.78E-43)
            r0 = r0 | 128(0x80, float:1.8E-43)
            byte r0 = (byte) r0
            r2.writeByte(r0)
            goto L0
        L10:
            r3 = r0 & 127(0x7f, float:1.78E-43)
            byte r3 = (byte) r3
            r2.writeByte(r3)
            return
    }
}
