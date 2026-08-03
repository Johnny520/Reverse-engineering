package com.android.dex;

/* JADX INFO: loaded from: classes.dex */
public final class EncodedValueCodec {
    private EncodedValueCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int readSignedInt(com.android.dex.util.ByteInput r3, int r4) {
            r0 = 0
            r1 = r4
        L2:
            if (r1 < 0) goto L12
            int r0 = r0 >>> 8
            byte r2 = r3.readByte()
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r0 = r0 | r2
            int r1 = r1 + (-1)
            goto L2
        L12:
            int r3 = 3 - r4
            int r3 = r3 * 8
            int r3 = r0 >> r3
            return r3
    }

    public static long readSignedLong(com.android.dex.util.ByteInput r7, int r8) {
            r0 = 0
            r2 = r8
        L3:
            r3 = 8
            if (r2 < 0) goto L17
            long r0 = r0 >>> r3
            byte r3 = r7.readByte()
            long r3 = (long) r3
            r5 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r5
            r5 = 56
            long r3 = r3 << r5
            long r0 = r0 | r3
            int r2 = r2 + (-1)
            goto L3
        L17:
            int r7 = 7 - r8
            int r7 = r7 * r3
            long r7 = r0 >> r7
            return r7
    }

    public static int readUnsignedInt(com.android.dex.util.ByteInput r2, int r3, boolean r4) {
            r0 = 0
            if (r4 != 0) goto L1b
            r4 = r3
        L4:
            if (r4 < 0) goto L14
            int r0 = r0 >>> 8
            byte r1 = r2.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 24
            r0 = r0 | r1
            int r4 = r4 + (-1)
            goto L4
        L14:
            int r2 = 3 - r3
            int r2 = r2 * 8
            int r2 = r0 >>> r2
            goto L2c
        L1b:
            if (r3 < 0) goto L2b
            int r4 = r0 >>> 8
            byte r0 = r2.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            r0 = r0 | r4
            int r3 = r3 + (-1)
            goto L1b
        L2b:
            r2 = r0
        L2c:
            return r2
    }

    public static long readUnsignedLong(com.android.dex.util.ByteInput r8, int r9, boolean r10) {
            r0 = 56
            r1 = 255(0xff, double:1.26E-321)
            r3 = 8
            r4 = 0
            if (r10 != 0) goto L1f
            r10 = r9
        Lb:
            if (r10 < 0) goto L19
            long r4 = r4 >>> r3
            byte r6 = r8.readByte()
            long r6 = (long) r6
            long r6 = r6 & r1
            long r6 = r6 << r0
            long r4 = r4 | r6
            int r10 = r10 + (-1)
            goto Lb
        L19:
            int r8 = 7 - r9
            int r8 = r8 * r3
            long r8 = r4 >>> r8
            goto L2e
        L1f:
            if (r9 < 0) goto L2d
            long r4 = r4 >>> r3
            byte r10 = r8.readByte()
            long r6 = (long) r10
            long r6 = r6 & r1
            long r6 = r6 << r0
            long r4 = r4 | r6
            int r9 = r9 + (-1)
            goto L1f
        L2d:
            r8 = r4
        L2e:
            return r8
    }

    public static void writeRightZeroExtendedValue(com.android.dex.util.ByteOutput r2, int r3, long r4) {
            int r0 = java.lang.Long.numberOfTrailingZeros(r4)
            int r0 = 64 - r0
            if (r0 != 0) goto L9
            r0 = 1
        L9:
            int r0 = r0 + 7
            int r0 = r0 >> 3
            int r1 = r0 * 8
            int r1 = 64 - r1
            long r4 = r4 >> r1
            int r1 = r0 + (-1)
            int r1 = r1 << 5
            r3 = r3 | r1
            r2.writeByte(r3)
        L1a:
            if (r0 <= 0) goto L27
            int r3 = (int) r4
            byte r3 = (byte) r3
            r2.writeByte(r3)
            r3 = 8
            long r4 = r4 >> r3
            int r0 = r0 + (-1)
            goto L1a
        L27:
            return
    }

    public static void writeSignedIntegralValue(com.android.dex.util.ByteOutput r2, int r3, long r4) {
            r0 = 63
            long r0 = r4 >> r0
            long r0 = r0 ^ r4
            int r0 = java.lang.Long.numberOfLeadingZeros(r0)
            int r0 = 72 - r0
            int r0 = r0 >> 3
            int r1 = r0 + (-1)
            int r1 = r1 << 5
            r3 = r3 | r1
            r2.writeByte(r3)
        L15:
            if (r0 <= 0) goto L22
            int r3 = (int) r4
            byte r3 = (byte) r3
            r2.writeByte(r3)
            r3 = 8
            long r4 = r4 >> r3
            int r0 = r0 + (-1)
            goto L15
        L22:
            return
    }

    public static void writeUnsignedIntegralValue(com.android.dex.util.ByteOutput r2, int r3, long r4) {
            int r0 = java.lang.Long.numberOfLeadingZeros(r4)
            int r0 = 64 - r0
            if (r0 != 0) goto L9
            r0 = 1
        L9:
            int r0 = r0 + 7
            int r0 = r0 >> 3
            int r1 = r0 + (-1)
            int r1 = r1 << 5
            r3 = r3 | r1
            r2.writeByte(r3)
        L15:
            if (r0 <= 0) goto L22
            int r3 = (int) r4
            byte r3 = (byte) r3
            r2.writeByte(r3)
            r3 = 8
            long r4 = r4 >> r3
            int r0 = r0 + (-1)
            goto L15
        L22:
            return
    }
}
