package org.apache.commons.compress.archivers.zip;

import java.io.Serializable;
import p376.AbstractC8977;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ZipLong implements Cloneable, Serializable {
    private static final long serialVersionUID = 1;
    private final long value;
    public static final ZipLong CFH_SIG = new ZipLong(33639248L);
    public static final ZipLong LFH_SIG = new ZipLong(67324752L);
    public static final ZipLong DD_SIG = new ZipLong(134695760L);
    static final ZipLong ZIP64_MAGIC = new ZipLong(4294967295L);
    public static final ZipLong SINGLE_SEGMENT_SPLIT_MARKER = new ZipLong(808471376L);
    public static final ZipLong AED_SIG = new ZipLong(134630224L);

    public ZipLong(byte[] bArr, int i) {
        this.value = getValue(bArr, i);
    }

    public static byte[] getBytes(long j) {
        byte[] bArr = new byte[4];
        putLong(j, bArr, 0);
        return bArr;
    }

    public static long getValue(byte[] bArr) {
        return getValue(bArr, 0);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof ZipLong) && this.value == ((ZipLong) obj).getValue();
    }

    public int getIntValue() {
        return (int) this.value;
    }

    public int hashCode() {
        return (int) this.value;
    }

    public void putLong(byte[] bArr, int i) {
        putLong(this.value, bArr, i);
    }

    public String toString() {
        return "ZipLong value: " + this.value;
    }

    public static long getValue(byte[] bArr, int i) {
        return AbstractC8977.m14564(i, bArr, 4);
    }

    public static void putLong(long j, byte[] bArr, int i) {
        AbstractC8977.m14562(j, bArr, i, 4);
    }

    public long getValue() {
        return this.value;
    }

    public byte[] getBytes() {
        return getBytes(this.value);
    }

    public ZipLong(byte[] bArr) {
        this(bArr, 0);
    }

    public ZipLong(int i) {
        this.value = i;
    }

    public ZipLong(long j) {
        this.value = j;
    }
}
