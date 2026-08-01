package org.apache.commons.compress.archivers.zip;

import androidx.activity.AbstractC0053;
import java.nio.charset.Charset;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5599 implements InterfaceC5589, Cloneable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final ZipShort f15419 = new ZipShort(30062);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f15420;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public String f15421;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public CRC32 f15422;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f15423;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f15424;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f15425;

    public final Object clone() {
        try {
            C5599 c5599 = (C5599) super.clone();
            c5599.f15422 = new CRC32();
            return c5599;
        } catch (CloneNotSupportedException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final byte[] getCentralDirectoryData() {
        return getLocalFileDataData();
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final ZipShort getCentralDirectoryLength() {
        return getLocalFileDataLength();
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final ZipShort getHeaderId() {
        return f15419;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final byte[] getLocalFileDataData() {
        int value = getLocalFileDataLength().getValue();
        int i = value - 4;
        byte[] bArr = new byte[i];
        System.arraycopy(ZipShort.getBytes(this.f15425), 0, bArr, 0, 2);
        byte[] bytes = this.f15421.getBytes(Charset.defaultCharset());
        System.arraycopy(ZipLong.getBytes(bytes.length), 0, bArr, 2, 4);
        System.arraycopy(ZipShort.getBytes(this.f15423), 0, bArr, 6, 2);
        System.arraycopy(ZipShort.getBytes(this.f15424), 0, bArr, 8, 2);
        System.arraycopy(bytes, 0, bArr, 10, bytes.length);
        this.f15422.reset();
        this.f15422.update(bArr);
        long value2 = this.f15422.getValue();
        byte[] bArr2 = new byte[value];
        System.arraycopy(ZipLong.getBytes(value2), 0, bArr2, 0, 4);
        System.arraycopy(bArr, 0, bArr2, 4, i);
        return bArr2;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final ZipShort getLocalFileDataLength() {
        return new ZipShort(this.f15421.getBytes(Charset.defaultCharset()).length + 14);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        parseFromLocalFileData(bArr, i, i2);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 < 14) {
            throw new ZipException(AbstractC0053.m162(i2, "The length is too short, only ", " bytes, expected at least 14"));
        }
        long value = ZipLong.getValue(bArr, i);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i + 4, bArr2, 0, i3);
        this.f15422.reset();
        this.f15422.update(bArr2);
        long value2 = this.f15422.getValue();
        if (value != value2) {
            throw new ZipException("Bad CRC checksum, expected " + Long.toHexString(value) + " instead of " + Long.toHexString(value2));
        }
        int value3 = ZipShort.getValue(bArr2, 0);
        int value4 = (int) ZipLong.getValue(bArr2, 2);
        if (value4 < 0 || value4 > i2 - 14) {
            throw new ZipException(AbstractC0053.m162(value4, "Bad symbolic link name length ", " in ASI extra field"));
        }
        this.f15423 = ZipShort.getValue(bArr2, 6);
        this.f15424 = ZipShort.getValue(bArr2, 8);
        if (value4 == 0) {
            this.f15421 = "";
        } else {
            byte[] bArr3 = new byte[value4];
            System.arraycopy(bArr2, 10, bArr3, 0, value4);
            this.f15421 = new String(bArr3, Charset.defaultCharset());
        }
        this.f15420 = (value3 & 16384) != 0;
        this.f15425 = m10968(this.f15425);
        this.f15425 = m10968(value3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m10968(int i) {
        return (!this.f15421.isEmpty() ? 40960 : (this.f15420 && this.f15421.isEmpty()) ? 16384 : 32768) | (i & 4095);
    }
}
