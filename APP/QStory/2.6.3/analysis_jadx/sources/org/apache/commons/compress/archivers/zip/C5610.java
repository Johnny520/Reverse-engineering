package org.apache.commons.compress.archivers.zip;

import java.util.Arrays;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5610 implements InterfaceC5589 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public byte[] f15460;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public byte[] f15461;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public ZipShort f15462;

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final byte[] getCentralDirectoryData() {
        byte[] bArr = this.f15461;
        return bArr != null ? AbstractC5581.m10946(bArr) : AbstractC5581.m10946(this.f15460);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final ZipShort getCentralDirectoryLength() {
        return this.f15461 != null ? new ZipShort(this.f15461.length) : ZipShort.lengthOf(this.f15460);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final ZipShort getHeaderId() {
        return this.f15462;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final byte[] getLocalFileDataData() {
        return AbstractC5581.m10946(this.f15460);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final ZipShort getLocalFileDataLength() {
        return ZipShort.lengthOf(this.f15460);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
        this.f15461 = AbstractC5581.m10946(bArrCopyOfRange);
        if (this.f15460 == null) {
            this.f15460 = AbstractC5581.m10946(bArrCopyOfRange);
        }
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final void parseFromLocalFileData(byte[] bArr, int i, int i2) {
        this.f15460 = AbstractC5581.m10946(Arrays.copyOfRange(bArr, i, i2 + i));
    }
}
