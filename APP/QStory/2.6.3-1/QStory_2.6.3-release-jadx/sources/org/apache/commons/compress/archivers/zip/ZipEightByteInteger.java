package org.apache.commons.compress.archivers.zip;

import java.io.Serializable;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ZipEightByteInteger implements Serializable {
    static final int BYTES = 8;
    private static final long serialVersionUID = 1;
    private final long value;
    public static final ZipEightByteInteger ZERO = new ZipEightByteInteger(0);
    private static final BigInteger HIGHEST_BIT = BigInteger.ONE.shiftLeft(63);

    public ZipEightByteInteger(BigInteger bigInteger) {
        this.value = bigInteger.longValue();
    }

    public static byte[] getBytes(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array();
    }

    public static long getLongValue(byte[] bArr, int i) {
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getLong(i);
    }

    public static BigInteger getValue(byte[] bArr, int i) {
        return toUnsignedBigInteger(getLongValue(bArr, i));
    }

    public static BigInteger toUnsignedBigInteger(long j) {
        return j >= 0 ? BigInteger.valueOf(j) : BigInteger.valueOf(j & Long.MAX_VALUE).add(HIGHEST_BIT);
    }

    public boolean equals(Object obj) {
        return (obj instanceof ZipEightByteInteger) && this.value == ((ZipEightByteInteger) obj).value;
    }

    public int hashCode() {
        return Long.hashCode(this.value);
    }

    public String toString() {
        return Long.toUnsignedString(this.value);
    }

    public static BigInteger getValue(byte[] bArr) {
        return getValue(bArr, 0);
    }

    public ZipEightByteInteger(byte[] bArr) {
        this(bArr, 0);
    }

    public BigInteger getValue() {
        return toUnsignedBigInteger(this.value);
    }

    public ZipEightByteInteger(byte[] bArr, int i) {
        this.value = getLongValue(bArr, i);
    }

    public ZipEightByteInteger(long j) {
        this.value = j;
    }

    public static long getLongValue(byte[] bArr) {
        return getLongValue(bArr, 0);
    }

    public long getLongValue() {
        return this.value;
    }

    public static byte[] getBytes(BigInteger bigInteger) {
        return getBytes(bigInteger.longValue());
    }

    public byte[] getBytes() {
        return getBytes(this.value);
    }
}
