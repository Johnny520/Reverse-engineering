package org.apache.commons.compress.archivers.zip;

import java.util.Arrays;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5616 implements InterfaceC5589 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public byte[] f15473;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public byte[] f15474;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ZipShort f15475;

    public AbstractC5616(ZipShort zipShort) {
        this.f15475 = zipShort;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final byte[] getCentralDirectoryData() {
        byte[] bArr = this.f15474;
        return bArr != null ? AbstractC5581.m10946(bArr) : AbstractC5581.m10946(this.f15473);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final ZipShort getCentralDirectoryLength() {
        return this.f15474 != null ? new ZipShort(this.f15474.length) : ZipShort.lengthOf(this.f15473);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final ZipShort getHeaderId() {
        return this.f15475;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final byte[] getLocalFileDataData() {
        return AbstractC5581.m10946(this.f15473);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final ZipShort getLocalFileDataLength() {
        return ZipShort.lengthOf(this.f15473);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
        this.f15474 = AbstractC5581.m10946(bArrCopyOfRange);
        if (this.f15473 == null) {
            this.f15473 = AbstractC5581.m10946(bArrCopyOfRange);
        }
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) {
        this.f15473 = AbstractC5581.m10946(Arrays.copyOfRange(bArr, i, i2 + i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m10977(int i, int i2) throws ZipException {
        if (i2 >= i) {
            return;
        }
        throw new ZipException(getClass().getName() + " is too short, only " + i2 + " bytes, expected at least " + i);
    }
}
