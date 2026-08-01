package io.fastkv;

import io.fastkv.interfaces.FastCipher;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class FastBuffer {
    private static final String INVALID_STRING = "Invalid String";
    private static final int MAX_CHAR_LEN = 2048;
    private char[] charBuf;
    public byte[] hb;
    public int position;

    public FastBuffer(int r2) {
        this(new byte[r2], 0);
    }

    private void encodeStr(String r10) {
        byte[] r0 = this.hb;
        int r1 = this.position;
        int r2 = r10.length();
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L18;
        int r4 = r3 + 1;
        char r5 = r10.charAt(r3);
        if (r5 < 128) goto L6;
        if (r5 < MAX_CHAR_LEN) goto L10;
        if (r5 < 55296) goto L17;
        if (r5 > 57343) goto L17;
        r3 = r3 + 2;
        int r52 = ((r5 << '\n') + r10.charAt(r4)) - 56613888;
        r0[r1] = (byte) ((r52 >>> 18) | 240);
        r0[r1 + 1] = (byte) (((r52 >>> 12) & 63) | 128);
        int r42 = r1 + 3;
        r0[r1 + 2] = (byte) (((r52 >>> 6) & 63) | 128);
        r1 = r1 + 4;
        r0[r42] = (byte) ((r52 & 63) | 128);
    L17:
        r0[r1] = (byte) ((r5 >>> '\f') | 224);
        int r7 = r1 + 2;
        r0[r1 + 1] = (byte) (((r5 >>> 6) & 63) | 128);
        r1 = r1 + 3;
        r0[r7] = (byte) ((r5 & '?') | 128);
    L7:
        r3 = r4;
        goto L3
    L10:
        int r32 = r1 + 1;
        r0[r1] = (byte) ((r5 >>> 6) | 192);
        r1 = r1 + 2;
        r0[r32] = (byte) ((r5 & '?') | 128);
        goto L7
    L6:
        r0[r1] = (byte) r5;
        r1 = r1 + 1;
        goto L7
    L18:
        this.position = r1;
    }

    private char[] getCharBuf(int r4) {
        char[] r0 = this.charBuf;
        if (r0 != null) goto L11;
        if (r4 > 256) goto L7;
        char[] r42 = new char[256];
    L8:
        this.charBuf = r42;
        return r42;
    L7:
        r42 = new char[MAX_CHAR_LEN];
        goto L8
    L11:
        if (r0.length >= r4) goto L14;
        char[] r43 = new char[MAX_CHAR_LEN];
        this.charBuf = r43;
        return r43;
    L14:
        return r0;
    }

    public static int getStringSize(String r6) {
        int r0 = r6.length();
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r0) goto L18;
        int r3 = r1 + 1;
        char r4 = r6.charAt(r1);
        if (r4 < 128) goto L6;
        if (r4 < MAX_CHAR_LEN) goto L10;
        if (r4 < 55296) goto L17;
        if (r4 > 57343) goto L17;
        r1 = r1 + 2;
        r2 = r2 + 4;
    L17:
        r2 = r2 + 3;
    L7:
        r1 = r3;
        goto L3
    L10:
        r2 = r2 + 2;
        goto L7
    L6:
        r2 = r2 + 1;
        goto L7
    L18:
        return r2;
    }

    public static int getVarint32Size(int r1) {
        if ((r1 >> 7) != 0) goto L7;
        return 1;
    L7:
        if ((r1 >> 14) != 0) goto L11;
        return 2;
    L11:
        if ((r1 >> 21) != 0) goto L15;
        return 3;
    L15:
        if ((r1 >> 28) != 0) goto L18;
        return 4;
    L18:
        return 5;
    }

    public synchronized String decodeStr(byte[] r11, int r12, int r13) {
        monitor-enter(this);
        char[] r0 = getCharBuf(r13);     // Catch: Throwable -> L8
        int r132 = r13 + r12;     // Catch: Throwable -> L8
        int r2 = 0;
    L4:
        if (r12 >= r132) goto L41;
        int r3 = r12 + 1;     // Catch: Throwable -> L8
        byte r4 = r11[r12];     // Catch: Throwable -> L8
        if (r4 > 0) goto L7;
        if (r4 < (-32)) goto L12;
        if (r4 < (-16)) goto L21;
        byte r32 = r11[r3];     // Catch: Throwable -> L8
        int r7 = r12 + 3;     // Catch: Throwable -> L8
        byte r5 = r11[r12 + 2];     // Catch: Throwable -> L8
        r12 = r12 + 4;     // Catch: Throwable -> L8
        byte r72 = r11[r7];     // Catch: Throwable -> L8
        if (r32 > (-65)) goto L40;
        if ((((r32 + 112) + (r4 << 28)) >> 30) != 0) goto L40;
        if (r5 > (-65)) goto L40;
        if (r72 > (-65)) goto L40;
        int r33 = ((((r32 & DataType.TYPE_MASK) << 12) | ((r4 & 7) << 18)) | ((r5 & DataType.TYPE_MASK) << 6)) | (r72 & DataType.TYPE_MASK);     // Catch: Throwable -> L8
        int r42 = r2 + 1;     // Catch: Throwable -> L8
        r0[r2] = (char) ((r33 >>> 10) + 55232);     // Catch: Throwable -> L8
        r2 = r2 + 2;     // Catch: Throwable -> L8
        r0[r42] = (char) ((r33 & 1023) + 56320);     // Catch: Throwable -> L8
    L40:
        throw new IllegalArgumentException(INVALID_STRING);     // Catch: Throwable -> L8
    L21:
        int r73 = r12 + 2;     // Catch: Throwable -> L8
        byte r34 = r11[r3];     // Catch: Throwable -> L8
        r12 = r12 + 3;     // Catch: Throwable -> L8
        byte r74 = r11[r73];     // Catch: Throwable -> L8
        if (r4 != (-32)) goto L25;
        if (r34 >= (-96)) goto L25;
    L31:
        throw new IllegalArgumentException(INVALID_STRING);     // Catch: Throwable -> L8
    L25:
        if (r4 != (-19)) goto L27;
        if (r34 >= (-96)) goto L31;
    L27:
        if (r34 > (-65)) goto L31;
        if (r74 > (-65)) goto L31;
        int r52 = r2 + 1;     // Catch: Throwable -> L8
        r0[r2] = (char) ((((r34 & DataType.TYPE_MASK) << 6) | ((r4 & 15) << 12)) | (r74 & DataType.TYPE_MASK));     // Catch: Throwable -> L8
    L16:
        r2 = r52;
        goto L4
    L12:
        r12 = r12 + 2;     // Catch: Throwable -> L8
        byte r35 = r11[r3];     // Catch: Throwable -> L8
        if (r4 < (-62)) goto L18;
        if (r35 > (-65)) goto L18;
        r52 = r2 + 1;     // Catch: Throwable -> L8
        r0[r2] = (char) ((r35 & DataType.TYPE_MASK) | ((r4 & 31) << 6));     // Catch: Throwable -> L8
    L18:
        throw new IllegalArgumentException(INVALID_STRING);     // Catch: Throwable -> L8
    L7:
        r0[r2] = (char) r4;     // Catch: Throwable -> L8
        r2 = r2 + 1;     // Catch: Throwable -> L8
        r12 = r3;
        goto L4
    L41:
        if (r12 > r132) goto L46;
        String r112 = new String(r0, 0, r2);     // Catch: Throwable -> L8
        monitor-exit(this);
        return r112;
    L46:
        throw new IllegalArgumentException(INVALID_STRING);     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        throw th;
    }

    public byte get() {
        byte[] r0 = this.hb;
        int r1 = this.position;
        this.position = r1 + 1;
        return r0[r1];
    }

    public byte[] getBytes(int r5) {
        byte[] r0 = new byte[r5];
        System.arraycopy(this.hb, this.position, r0, 0, r5);
        this.position += r5;
        return r0;
    }

    public long getChecksum(int r10, int r11) {
        long r0 = 0;
        if (r11 > 0) goto L5;
        return 0;
    L5:
        int r2 = r11 >> 3;
        int r112 = r11 & 7;
        int r3 = 0;
        int r5 = r10;
        int r4 = 0;
    L6:
        if (r4 >= r2) goto L8;
        r0 = r0 ^ getLong(r5);
        r5 = r5 + 8;
        r4 = r4 + 1;
        goto L6
    L8:
        int r113 = r112 << 3;
    L9:
        if (r3 >= r113) goto L11;
        r0 = r0 ^ ((((long) this.hb[r5]) & 255) << r3);
        r3 = r3 + 8;
        r5 = r5 + 1;
        goto L9
    L11:
        int r102 = (r10 & 7) << 3;
        return (r0 >>> (64 - r102)) | (r0 << r102);
    }

    public double getDouble(FastCipher r3) {
        return Double.longBitsToDouble(getLong(r3));
    }

    public float getFloat(FastCipher r1) {
        return Float.intBitsToFloat(getInt(r1));
    }

    public int getInt(int r5) {
        byte[] r0 = this.hb;
        int r2 = r0[r5] & 255;
        int r3 = r5 + 2;
        int r1 = ((r0[r5 + 1] & 255) << 8) | r2;
        int r12 = r1 | ((r0[r3] & 255) << 16);
        return (r0[r5 + 3] << 24) | r12;
    }

    public long getLong(int r10) {
        byte[] r0 = this.hb;
        long r1 = ((((long) r0[r10]) & 255) | ((((long) r0[r10 + 1]) & 255) << 8)) | ((((long) r0[r10 + 2]) & 255) << 16);
        long r12 = r1 | ((((long) r0[r10 + 3]) & 255) << 24);
        long r13 = r12 | ((((long) r0[r10 + 4]) & 255) << 32);
        int r6 = r10 + 6;
        long r14 = r13 | ((((long) r0[r10 + 5]) & 255) << 40);
        return (r14 | ((((long) r0[r6]) & 255) << 48)) | (((long) r0[r10 + 7]) << 56);
    }

    public short getShort() {
        byte[] r0 = this.hb;
        int r1 = this.position;
        int r2 = r1 + 1;
        this.position = r2;
        int r3 = r0[r1] & 255;
        this.position = r1 + 2;
        return (short) ((r0[r2] << 8) | r3);
    }

    public String getString(FastCipher r4, int r5) {
        if (r4 == null) goto L15;
        if (r5 <= 0) goto L15;
        byte[] r0 = this.hb;
        int r1 = this.position;
        byte[] r42 = r4.decrypt(Arrays.copyOfRange(r0, r1, r1 + r5));
        if (r42 != null) goto L9;
        String r43 = null;
    L12:
        this.position += r5;
        return r43;
    L9:
        if (r42.length <= MAX_CHAR_LEN) goto L11;
        r43 = new String(r42, StandardCharsets.UTF_8);
        goto L12
    L11:
        r43 = decodeStr(r42, 0, r42.length);
    L15:
        return getString(r5);
    }

    public int getVarint32() {
        byte[] r0 = this.hb;
        int r1 = this.position;
        int r2 = r1 + 1;
        this.position = r2;
        byte r3 = r0[r1];
        if ((r3 >> 7) != 0) goto L5;
        return r3;
    L5:
        int r4 = r1 + 2;
        this.position = r4;
        int r22 = r0[r2] << 7;
        int r23 = r22 | (r3 & 127);
        if ((r23 >> 14) != 0) goto L8;
        return r23;
    L8:
        int r32 = r1 + 3;
        this.position = r32;
        int r24 = (r23 & 16383) | (r0[r4] << 14);
        if ((r24 >> 21) != 0) goto L11;
        return r24;
    L11:
        int r42 = r1 + 4;
        this.position = r42;
        int r25 = (r24 & 2097151) | (r0[r32] << 21);
        if ((r25 >> 28) != 0) goto L14;
        return r25;
    L14:
        this.position = r1 + 5;
        int r02 = r0[r42] << 28;
        return r02 | (r25 & 268435455);
    }

    public final void put(byte r4) {
        byte[] r0 = this.hb;
        int r1 = this.position;
        this.position = r1 + 1;
        r0[r1] = r4;
    }

    public void putBytes(byte[] r5) {
        int r0 = r5.length;
        if (r0 <= 0) goto L6;
        System.arraycopy(r5, 0, this.hb, this.position, r0);
        this.position += r0;
        return;
    }

    public void putInt(int r6) {
        byte[] r0 = this.hb;
        int r1 = this.position;
        int r2 = r1 + 1;
        this.position = r2;
        r0[r1] = (byte) r6;
        int r3 = r1 + 2;
        this.position = r3;
        r0[r2] = (byte) (r6 >> 8);
        int r22 = r1 + 3;
        this.position = r22;
        r0[r3] = (byte) (r6 >> 16);
        this.position = r1 + 4;
        r0[r22] = (byte) (r6 >> 24);
    }

    public void putLong(int r6, long r7) {
        byte[] r0 = this.hb;
        r0[r6] = (byte) r7;
        r0[r6 + 1] = (byte) (r7 >> 8);
        r0[r6 + 2] = (byte) (r7 >> 16);
        r0[r6 + 3] = (byte) (r7 >> 24);
        r0[r6 + 4] = (byte) (r7 >> 32);
        r0[r6 + 5] = (byte) (r7 >> 40);
        r0[r6 + 6] = (byte) (r7 >> 48);
        r0[r6 + 7] = (byte) (r7 >> 56);
    }

    public void putShort(short r5) {
        byte[] r0 = this.hb;
        int r1 = this.position;
        int r2 = r1 + 1;
        this.position = r2;
        r0[r1] = (byte) r5;
        this.position = r1 + 2;
        r0[r2] = (byte) (r5 >> 8);
    }

    public void putString(String r2) {
        if (r2 != null) goto L4;
        return;
    L4:
        if (r2.isEmpty() == true) goto L8;
        encodeStr(r2);
        return;
    }

    public int putVarint32(int r4, int r5) {
    L3:
        if ((r5 & (-128)) == 0) goto L5;
        this.hb[r4] = (byte) ((r5 & 127) | 128);
        r5 = r5 >>> 7;
        r4 = r4 + 1;
        goto L3
    L5:
        int r1 = r4 + 1;
        this.hb[r4] = (byte) r5;
        return r1;
    }

    public FastBuffer(byte[] r2) {
        this(r2, 0);
    }

    public int getInt() {
        byte[] r0 = this.hb;
        int r1 = this.position;
        int r2 = r1 + 1;
        this.position = r2;
        int r3 = r0[r1] & 255;
        int r4 = r1 + 2;
        this.position = r4;
        int r22 = ((r0[r2] & 255) << 8) | r3;
        int r32 = r1 + 3;
        this.position = r32;
        int r23 = r22 | ((r0[r4] & 255) << 16);
        this.position = r1 + 4;
        return (r0[r32] << 24) | r23;
    }

    public long getLong() {
        long r0 = getLong(this.position);
        this.position += 8;
        return r0;
    }

    public FastBuffer(byte[] r2, int r3) {
        this.charBuf = null;
        this.hb = r2;
        this.position = r3;
    }

    public int getInt(FastCipher r2) {
        int r0 = getInt();
        if (r2 != null) goto L5;
        return r0;
    L5:
        return r2.decrypt(r0);
    }

    public void putVarint32(int r2) {
        this.position = putVarint32(this.position, r2);
    }

    public byte[] getBytes(FastCipher r1, int r2) {
        byte[] r22 = getBytes(r2);
        if (r1 != null) goto L5;
        return r22;
    L5:
        return r1.decrypt(r22);
    }

    public long getLong(FastCipher r3) {
        long r0 = getLong();
        if (r3 != null) goto L5;
        return r0;
    L5:
        return r3.decrypt(r0);
    }

    public void putInt(int r5, int r6) {
        byte[] r0 = this.hb;
        r0[r5] = (byte) r6;
        int r2 = r5 + 2;
        r0[r5 + 1] = (byte) (r6 >> 8);
        r0[r2] = (byte) (r6 >> 16);
        r0[r5 + 3] = (byte) (r6 >> 24);
    }

    public String getString(int r5) {
        if (r5 >= 0) goto L5;
        return null;
    L5:
        if (r5 != 0) goto L9;
        return "";
    L9:
        if (r5 <= MAX_CHAR_LEN) goto L11;
        String r0 = new String(this.hb, this.position, r5, StandardCharsets.UTF_8);
    L12:
        this.position += r5;
        return r0;
    L11:
        r0 = decodeStr(this.hb, this.position, r5);
        goto L12
    }

    public void putLong(long r2) {
        putLong(this.position, r2);
        this.position += 8;
    }
}
