package org.apache.commons.compress.archivers.zip;

import java.io.Serializable;
import org.apache.commons.lang3.AbstractC5686;
import p379.AbstractC8996;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ZipShort implements Cloneable, Serializable {
    private static final int SIZE = 2;
    public static final ZipShort ZERO = new ZipShort(0);
    private static final long serialVersionUID = 1;
    private final int value;

    public ZipShort(byte[] bArr, int i) {
        this.value = getValue(bArr, i);
    }

    public static int getValue(byte[] bArr, int i) {
        return (int) AbstractC8996.m14600(i, bArr, 2);
    }

    public static ZipShort lengthOf(byte[] bArr) {
        return new ZipShort(AbstractC5686.m11053(bArr));
    }

    public static void putShort(int i, byte[] bArr, int i2) {
        AbstractC8996.m14598(i, bArr, i2, 2);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof ZipShort) && this.value == ((ZipShort) obj).getValue();
    }

    public byte[] getBytes() {
        byte[] bArr = new byte[2];
        AbstractC8996.m14598(this.value, bArr, 0, 2);
        return bArr;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return "ZipShort value: " + this.value;
    }

    public static int getValue(byte[] bArr) {
        return getValue(bArr, 0);
    }

    public int getValue() {
        return this.value;
    }

    public ZipShort(byte[] bArr) {
        this(bArr, 0);
    }

    public ZipShort(int i) {
        this.value = i;
    }

    public static byte[] getBytes(int i) {
        byte[] bArr = new byte[2];
        putShort(i, bArr, 0);
        return bArr;
    }
}
