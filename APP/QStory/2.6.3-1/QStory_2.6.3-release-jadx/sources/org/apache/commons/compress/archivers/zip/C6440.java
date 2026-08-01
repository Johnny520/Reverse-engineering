package org.apache.commons.compress.archivers.zip;

import java.util.Arrays;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6440 implements InterfaceC6419 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public byte[] f15805;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public byte[] f15806;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public ZipShort f15807;

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final byte[] getCentralDirectoryData() {
        byte[] bArr = this.f15806;
        return bArr != null ? AbstractC6411.m11505(bArr) : AbstractC6411.m11505(this.f15805);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final ZipShort getCentralDirectoryLength() {
        return this.f15806 != null ? new ZipShort(this.f15806.length) : ZipShort.lengthOf(this.f15805);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final ZipShort getHeaderId() {
        return this.f15807;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final byte[] getLocalFileDataData() {
        return AbstractC6411.m11505(this.f15805);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final ZipShort getLocalFileDataLength() {
        return ZipShort.lengthOf(this.f15805);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
        this.f15806 = AbstractC6411.m11505(bArrCopyOfRange);
        if (this.f15805 == null) {
            this.f15805 = AbstractC6411.m11505(bArrCopyOfRange);
        }
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final void parseFromLocalFileData(byte[] bArr, int i, int i2) {
        this.f15805 = AbstractC6411.m11505(Arrays.copyOfRange(bArr, i, i2 + i));
    }
}
