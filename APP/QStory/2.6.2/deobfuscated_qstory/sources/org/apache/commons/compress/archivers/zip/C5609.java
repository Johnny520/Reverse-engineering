package org.apache.commons.compress.archivers.zip;

import java.util.Arrays;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5609 implements InterfaceC5588 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public byte[] f15460;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public byte[] f15461;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public ZipShort f15462;

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final byte[] getCentralDirectoryData() {
        byte[] bArr = this.f15461;
        return bArr != null ? AbstractC5580.m10889(bArr) : AbstractC5580.m10889(this.f15460);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final ZipShort getCentralDirectoryLength() {
        return this.f15461 != null ? new ZipShort(this.f15461.length) : ZipShort.lengthOf(this.f15460);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final ZipShort getHeaderId() {
        return this.f15462;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final byte[] getLocalFileDataData() {
        return AbstractC5580.m10889(this.f15460);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final ZipShort getLocalFileDataLength() {
        return ZipShort.lengthOf(this.f15460);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
        this.f15461 = AbstractC5580.m10889(bArrCopyOfRange);
        if (this.f15460 == null) {
            this.f15460 = AbstractC5580.m10889(bArrCopyOfRange);
        }
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final void parseFromLocalFileData(byte[] bArr, int i, int i2) {
        this.f15460 = AbstractC5580.m10889(Arrays.copyOfRange(bArr, i, i2 + i));
    }
}
