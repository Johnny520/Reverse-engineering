package org.apache.commons.compress.archivers.zip;

import androidx.activity.AbstractC0900;
import java.util.Arrays;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6430 implements InterfaceC6419 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public byte[] f15771;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public byte[] f15772;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public long f15773;

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final byte[] getCentralDirectoryData() {
        if (this.f15772 == null) {
            m11528();
        }
        byte[] bArr = this.f15772;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final ZipShort getCentralDirectoryLength() {
        if (this.f15772 == null) {
            m11528();
        }
        return ZipShort.lengthOf(this.f15772);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final byte[] getLocalFileDataData() {
        return getCentralDirectoryData();
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final ZipShort getLocalFileDataLength() {
        return getCentralDirectoryLength();
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        parseFromLocalFileData(bArr, i, i2);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 < 5) {
            throw new ZipException("UniCode path extra data must have at least 5 bytes.");
        }
        byte b = bArr[i];
        if (b != 1) {
            throw new ZipException(AbstractC0900.m722(b, "Unsupported version [", "] for UniCode path extra data."));
        }
        this.f15773 = ZipLong.getValue(bArr, i + 1);
        int i3 = i2 - 5;
        byte[] bArr2 = new byte[i3];
        this.f15771 = bArr2;
        System.arraycopy(bArr, i + 5, bArr2, 0, i3);
        this.f15772 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11528() {
        byte[] bArr = this.f15771;
        if (bArr == null) {
            return;
        }
        byte[] bArr2 = new byte[bArr.length + 5];
        this.f15772 = bArr2;
        bArr2[0] = 1;
        System.arraycopy(ZipLong.getBytes(this.f15773), 0, this.f15772, 1, 4);
        byte[] bArr3 = this.f15771;
        System.arraycopy(bArr3, 0, this.f15772, 5, bArr3.length);
    }
}
