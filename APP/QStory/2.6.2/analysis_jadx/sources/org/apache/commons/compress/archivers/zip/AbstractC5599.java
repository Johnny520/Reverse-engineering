package org.apache.commons.compress.archivers.zip;

import androidx.activity.AbstractC0053;
import java.util.Arrays;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5599 implements InterfaceC5588 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public byte[] f15426;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public byte[] f15427;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public long f15428;

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final byte[] getCentralDirectoryData() {
        if (this.f15427 == null) {
            m10912();
        }
        byte[] bArr = this.f15427;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final ZipShort getCentralDirectoryLength() {
        if (this.f15427 == null) {
            m10912();
        }
        return ZipShort.lengthOf(this.f15427);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final byte[] getLocalFileDataData() {
        return getCentralDirectoryData();
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final ZipShort getLocalFileDataLength() {
        return getCentralDirectoryLength();
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        parseFromLocalFileData(bArr, i, i2);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 < 5) {
            throw new ZipException("UniCode path extra data must have at least 5 bytes.");
        }
        byte b = bArr[i];
        if (b != 1) {
            throw new ZipException(AbstractC0053.m161(b, "Unsupported version [", "] for UniCode path extra data."));
        }
        this.f15428 = ZipLong.getValue(bArr, i + 1);
        int i3 = i2 - 5;
        byte[] bArr2 = new byte[i3];
        this.f15426 = bArr2;
        System.arraycopy(bArr, i + 5, bArr2, 0, i3);
        this.f15427 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m10912() {
        byte[] bArr = this.f15426;
        if (bArr == null) {
            return;
        }
        byte[] bArr2 = new byte[bArr.length + 5];
        this.f15427 = bArr2;
        bArr2[0] = 1;
        System.arraycopy(ZipLong.getBytes(this.f15428), 0, this.f15427, 1, 4);
        byte[] bArr3 = this.f15426;
        System.arraycopy(bArr3, 0, this.f15427, 5, bArr3.length);
    }
}
