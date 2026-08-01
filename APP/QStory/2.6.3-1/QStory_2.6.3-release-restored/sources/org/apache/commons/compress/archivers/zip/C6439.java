package org.apache.commons.compress.archivers.zip;

import java.util.Arrays;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6439 implements InterfaceC6419 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final ZipShort f15802 = new ZipShort(44225);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public byte[] f15803;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public byte[] f15804;

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final byte[] getCentralDirectoryData() {
        byte[] bArr = this.f15803;
        return bArr == null ? AbstractC6411.m11505(this.f15804) : AbstractC6411.m11505(bArr);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final ZipShort getCentralDirectoryLength() {
        return this.f15803 == null ? ZipShort.lengthOf(this.f15804) : new ZipShort(this.f15803.length);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final ZipShort getHeaderId() {
        return f15802;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final byte[] getLocalFileDataData() {
        return AbstractC6411.m11505(this.f15804);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final ZipShort getLocalFileDataLength() {
        return ZipShort.lengthOf(this.f15804);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) {
        this.f15803 = Arrays.copyOfRange(bArr, i, i + i2);
        if (this.f15804 == null) {
            parseFromLocalFileData(bArr, i, i2);
        }
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final void parseFromLocalFileData(byte[] bArr, int i, int i2) {
        this.f15804 = Arrays.copyOfRange(bArr, i, i2 + i);
    }
}
