package org.apache.commons.compress.archivers.zip;

import java.util.zip.ZipException;
import net.bytebuddy.asm.Advice;
import p025.AbstractC7012;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6438 implements InterfaceC6419 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final ZipShort f15798 = new ZipShort(41246);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f15799;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f15800;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public short f15801;

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final byte[] getCentralDirectoryData() {
        return ZipShort.getBytes((this.f15799 ? Short.MIN_VALUE : (short) 0) | this.f15801);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final ZipShort getCentralDirectoryLength() {
        return new ZipShort(2);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final ZipShort getHeaderId() {
        return f15798;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final byte[] getLocalFileDataData() {
        byte[] bArr = new byte[this.f15800 + 2];
        ZipShort.putShort((this.f15799 ? Short.MIN_VALUE : (short) 0) | this.f15801, bArr, 0);
        return bArr;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final ZipShort getLocalFileDataLength() {
        return new ZipShort(this.f15800 + 2);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 < 2) {
            throw new ZipException(AbstractC7012.m12147(i2, "Too short content for ResourceAlignmentExtraField (0xa11e): "));
        }
        int value = ZipShort.getValue(bArr, i);
        this.f15801 = (short) (value & Advice.MethodSizeHandler.UNDEFINED_SIZE);
        this.f15799 = (value & 32768) != 0;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        parseFromCentralDirectoryData(bArr, i, i2);
        this.f15800 = i2 - 2;
    }
}
