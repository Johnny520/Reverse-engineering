package bsh.org.objectweb.asm;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ByteVector {
    byte[] data;
    int length;

    public ByteVector() {
            r1 = this;
            r1.<init>()
            r0 = 64
            byte[] r0 = new byte[r0]
            r1.data = r0
            return
    }

    public ByteVector(int r1) {
            r0 = this;
            r0.<init>()
            byte[] r1 = new byte[r1]
            r0.data = r1
            return
    }

    public ByteVector(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.data = r1
            int r1 = r1.length
            r0.length = r1
            return
    }

    private void enlarge(int r4) {
            r3 = this;
            byte[] r0 = r3.data
            int r1 = r0.length
            int r1 = r1 * 2
            int r2 = r3.length
            int r4 = r4 + r2
            if (r1 <= r4) goto Lb
            goto Lc
        Lb:
            r1 = r4
        Lc:
            byte[] r4 = new byte[r1]
            r1 = 0
            java.lang.System.arraycopy(r0, r1, r4, r1, r2)
            r3.data = r4
            return
    }

    public final bsh.org.objectweb.asm.ByteVector encodeUTF8(java.lang.String r10, int r11, int r12) {
            r9 = this;
            int r0 = r10.length()
            r1 = r11
            r2 = r1
        L6:
            r3 = 2047(0x7ff, float:2.868E-42)
            r4 = 127(0x7f, float:1.78E-43)
            r5 = 1
            if (r1 >= r0) goto L22
            char r6 = r10.charAt(r1)
            if (r6 < r5) goto L18
            if (r6 > r4) goto L18
            int r2 = r2 + 1
            goto L1f
        L18:
            if (r6 > r3) goto L1d
            int r2 = r2 + 2
            goto L1f
        L1d:
            int r2 = r2 + 3
        L1f:
            int r1 = r1 + 1
            goto L6
        L22:
            if (r2 > r12) goto L95
            int r12 = r9.length
            int r1 = r12 - r11
            int r6 = r1 + (-2)
            if (r6 < 0) goto L37
            byte[] r7 = r9.data
            int r8 = r2 >>> 8
            byte r8 = (byte) r8
            r7[r6] = r8
            int r1 = r1 - r5
            byte r6 = (byte) r2
            r7[r1] = r6
        L37:
            int r12 = r12 + r2
            int r12 = r12 - r11
            byte[] r1 = r9.data
            int r1 = r1.length
            if (r12 <= r1) goto L42
            int r2 = r2 - r11
            r9.enlarge(r2)
        L42:
            int r12 = r9.length
        L44:
            if (r11 >= r0) goto L92
            char r1 = r10.charAt(r11)
            if (r1 < r5) goto L57
            if (r1 > r4) goto L57
            byte[] r2 = r9.data
            int r6 = r12 + 1
            byte r1 = (byte) r1
            r2[r12] = r1
            r12 = r6
            goto L8f
        L57:
            byte[] r2 = r9.data
            if (r1 > r3) goto L70
            int r6 = r12 + 1
            int r7 = r1 >> 6
            r7 = r7 & 31
            r7 = r7 | 192(0xc0, float:2.69E-43)
            byte r7 = (byte) r7
            r2[r12] = r7
            int r12 = r12 + 2
            r1 = r1 & 63
            r1 = r1 | 128(0x80, float:1.8E-43)
            byte r1 = (byte) r1
            r2[r6] = r1
            goto L8f
        L70:
            int r6 = r12 + 1
            int r7 = r1 >> 12
            r7 = r7 & 15
            r7 = r7 | 224(0xe0, float:3.14E-43)
            byte r7 = (byte) r7
            r2[r12] = r7
            int r7 = r12 + 2
            int r8 = r1 >> 6
            r8 = r8 & 63
            r8 = r8 | 128(0x80, float:1.8E-43)
            byte r8 = (byte) r8
            r2[r6] = r8
            int r12 = r12 + 3
            r1 = r1 & 63
            r1 = r1 | 128(0x80, float:1.8E-43)
            byte r1 = (byte) r1
            r2[r7] = r1
        L8f:
            int r11 = r11 + 1
            goto L44
        L92:
            r9.length = r12
            return r9
        L95:
            j8.o.o()
            r10 = 0
            return r10
    }

    public final bsh.org.objectweb.asm.ByteVector put11(int r5, int r6) {
            r4 = this;
            int r0 = r4.length
            int r1 = r0 + 2
            byte[] r2 = r4.data
            int r2 = r2.length
            r3 = 2
            if (r1 <= r2) goto Ld
            r4.enlarge(r3)
        Ld:
            byte[] r1 = r4.data
            int r2 = r0 + 1
            byte r5 = (byte) r5
            r1[r0] = r5
            int r0 = r0 + r3
            byte r5 = (byte) r6
            r1[r2] = r5
            r4.length = r0
            return r4
    }

    public final bsh.org.objectweb.asm.ByteVector put112(int r5, int r6, int r7) {
            r4 = this;
            int r0 = r4.length
            int r1 = r0 + 4
            byte[] r2 = r4.data
            int r2 = r2.length
            r3 = 4
            if (r1 <= r2) goto Ld
            r4.enlarge(r3)
        Ld:
            byte[] r1 = r4.data
            int r2 = r0 + 1
            byte r5 = (byte) r5
            r1[r0] = r5
            int r5 = r0 + 2
            byte r6 = (byte) r6
            r1[r2] = r6
            int r6 = r0 + 3
            int r2 = r7 >>> 8
            byte r2 = (byte) r2
            r1[r5] = r2
            int r0 = r0 + r3
            byte r5 = (byte) r7
            r1[r6] = r5
            r4.length = r0
            return r4
    }

    public final bsh.org.objectweb.asm.ByteVector put12(int r6, int r7) {
            r5 = this;
            int r0 = r5.length
            int r1 = r0 + 3
            byte[] r2 = r5.data
            int r2 = r2.length
            r3 = 3
            if (r1 <= r2) goto Ld
            r5.enlarge(r3)
        Ld:
            byte[] r1 = r5.data
            int r2 = r0 + 1
            byte r6 = (byte) r6
            r1[r0] = r6
            int r6 = r0 + 2
            int r4 = r7 >>> 8
            byte r4 = (byte) r4
            r1[r2] = r4
            int r0 = r0 + r3
            byte r7 = (byte) r7
            r1[r6] = r7
            r5.length = r0
            return r5
    }

    public final bsh.org.objectweb.asm.ByteVector put122(int r6, int r7, int r8) {
            r5 = this;
            int r0 = r5.length
            int r1 = r0 + 5
            byte[] r2 = r5.data
            int r2 = r2.length
            r3 = 5
            if (r1 <= r2) goto Ld
            r5.enlarge(r3)
        Ld:
            byte[] r1 = r5.data
            int r2 = r0 + 1
            byte r6 = (byte) r6
            r1[r0] = r6
            int r6 = r0 + 2
            int r4 = r7 >>> 8
            byte r4 = (byte) r4
            r1[r2] = r4
            int r2 = r0 + 3
            byte r7 = (byte) r7
            r1[r6] = r7
            int r6 = r0 + 4
            int r7 = r8 >>> 8
            byte r7 = (byte) r7
            r1[r2] = r7
            int r0 = r0 + r3
            byte r7 = (byte) r8
            r1[r6] = r7
            r5.length = r0
            return r5
    }

    public bsh.org.objectweb.asm.ByteVector putByte(int r4) {
            r3 = this;
            int r0 = r3.length
            int r1 = r0 + 1
            byte[] r2 = r3.data
            int r2 = r2.length
            if (r1 <= r2) goto Ld
            r2 = 1
            r3.enlarge(r2)
        Ld:
            byte[] r2 = r3.data
            byte r4 = (byte) r4
            r2[r0] = r4
            r3.length = r1
            return r3
    }

    public bsh.org.objectweb.asm.ByteVector putByteArray(byte[] r3, int r4, int r5) {
            r2 = this;
            int r0 = r2.length
            int r0 = r0 + r5
            byte[] r1 = r2.data
            int r1 = r1.length
            if (r0 <= r1) goto Lb
            r2.enlarge(r5)
        Lb:
            if (r3 == 0) goto L14
            byte[] r0 = r2.data
            int r1 = r2.length
            java.lang.System.arraycopy(r3, r4, r0, r1, r5)
        L14:
            int r3 = r2.length
            int r3 = r3 + r5
            r2.length = r3
            return r2
    }

    public bsh.org.objectweb.asm.ByteVector putInt(int r7) {
            r6 = this;
            int r0 = r6.length
            int r1 = r0 + 4
            byte[] r2 = r6.data
            int r2 = r2.length
            r3 = 4
            if (r1 <= r2) goto Ld
            r6.enlarge(r3)
        Ld:
            byte[] r1 = r6.data
            int r2 = r0 + 1
            int r4 = r7 >>> 24
            byte r4 = (byte) r4
            r1[r0] = r4
            int r4 = r0 + 2
            int r5 = r7 >>> 16
            byte r5 = (byte) r5
            r1[r2] = r5
            int r2 = r0 + 3
            int r5 = r7 >>> 8
            byte r5 = (byte) r5
            r1[r4] = r5
            int r0 = r0 + r3
            byte r7 = (byte) r7
            r1[r2] = r7
            r6.length = r0
            return r6
    }

    public bsh.org.objectweb.asm.ByteVector putLong(long r8) {
            r7 = this;
            int r0 = r7.length
            int r1 = r0 + 8
            byte[] r2 = r7.data
            int r2 = r2.length
            r3 = 8
            if (r1 <= r2) goto Le
            r7.enlarge(r3)
        Le:
            byte[] r1 = r7.data
            r2 = 32
            long r4 = r8 >>> r2
            int r2 = (int) r4
            int r4 = r0 + 1
            int r5 = r2 >>> 24
            byte r5 = (byte) r5
            r1[r0] = r5
            int r5 = r0 + 2
            int r6 = r2 >>> 16
            byte r6 = (byte) r6
            r1[r4] = r6
            int r4 = r0 + 3
            int r6 = r2 >>> 8
            byte r6 = (byte) r6
            r1[r5] = r6
            int r5 = r0 + 4
            byte r2 = (byte) r2
            r1[r4] = r2
            int r8 = (int) r8
            int r9 = r0 + 5
            int r2 = r8 >>> 24
            byte r2 = (byte) r2
            r1[r5] = r2
            int r2 = r0 + 6
            int r4 = r8 >>> 16
            byte r4 = (byte) r4
            r1[r9] = r4
            int r9 = r0 + 7
            int r4 = r8 >>> 8
            byte r4 = (byte) r4
            r1[r2] = r4
            int r0 = r0 + r3
            byte r8 = (byte) r8
            r1[r9] = r8
            r7.length = r0
            return r7
    }

    public bsh.org.objectweb.asm.ByteVector putShort(int r6) {
            r5 = this;
            int r0 = r5.length
            int r1 = r0 + 2
            byte[] r2 = r5.data
            int r2 = r2.length
            r3 = 2
            if (r1 <= r2) goto Ld
            r5.enlarge(r3)
        Ld:
            byte[] r1 = r5.data
            int r2 = r0 + 1
            int r4 = r6 >>> 8
            byte r4 = (byte) r4
            r1[r0] = r4
            int r0 = r0 + r3
            byte r6 = (byte) r6
            r1[r2] = r6
            r5.length = r0
            return r5
    }

    public bsh.org.objectweb.asm.ByteVector putUTF8(java.lang.String r8) {
            r7 = this;
            int r0 = r8.length()
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 > r1) goto L47
            int r2 = r7.length
            int r3 = r2 + 2
            int r3 = r3 + r0
            byte[] r4 = r7.data
            int r4 = r4.length
            if (r3 <= r4) goto L18
            int r3 = r0 + 2
            r7.enlarge(r3)
        L18:
            byte[] r3 = r7.data
            int r4 = r2 + 1
            int r5 = r0 >>> 8
            byte r5 = (byte) r5
            r3[r2] = r5
            int r2 = r2 + 2
            byte r5 = (byte) r0
            r3[r4] = r5
            r4 = 0
        L27:
            if (r4 >= r0) goto L44
            char r5 = r8.charAt(r4)
            r6 = 1
            if (r5 < r6) goto L3d
            r6 = 127(0x7f, float:1.78E-43)
            if (r5 > r6) goto L3d
            int r6 = r2 + 1
            byte r5 = (byte) r5
            r3[r2] = r5
            int r4 = r4 + 1
            r2 = r6
            goto L27
        L3d:
            r7.length = r2
            bsh.org.objectweb.asm.ByteVector r8 = r7.encodeUTF8(r8, r4, r1)
            return r8
        L44:
            r7.length = r2
            return r7
        L47:
            j8.o.o()
            r8 = 0
            return r8
    }
}
