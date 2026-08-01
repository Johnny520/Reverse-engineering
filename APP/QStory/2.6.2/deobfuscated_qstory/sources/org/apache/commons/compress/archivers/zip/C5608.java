package org.apache.commons.compress.archivers.zip;

import java.util.Arrays;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5608 implements InterfaceC5588 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final ZipShort f15457 = new ZipShort(44225);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public byte[] f15458;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public byte[] f15459;

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final byte[] getCentralDirectoryData() {
        byte[] bArr = this.f15458;
        return bArr == null ? AbstractC5580.m10889(this.f15459) : AbstractC5580.m10889(bArr);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final ZipShort getCentralDirectoryLength() {
        return this.f15458 == null ? ZipShort.lengthOf(this.f15459) : new ZipShort(this.f15458.length);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final ZipShort getHeaderId() {
        return f15457;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final byte[] getLocalFileDataData() {
        return AbstractC5580.m10889(this.f15459);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final ZipShort getLocalFileDataLength() {
        return ZipShort.lengthOf(this.f15459);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) {
        this.f15458 = Arrays.copyOfRange(bArr, i, i + i2);
        if (this.f15459 == null) {
            parseFromLocalFileData(bArr, i, i2);
        }
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final void parseFromLocalFileData(byte[] bArr, int i, int i2) {
        this.f15459 = Arrays.copyOfRange(bArr, i, i2 + i);
    }
}
