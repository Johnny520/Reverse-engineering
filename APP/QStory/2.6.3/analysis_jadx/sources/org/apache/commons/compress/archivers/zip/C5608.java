package org.apache.commons.compress.archivers.zip;

import java.util.zip.ZipException;
import net.bytebuddy.asm.Advice;
import p009.AbstractC6183;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5608 implements InterfaceC5589 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final ZipShort f15453 = new ZipShort(41246);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f15454;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f15455;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public short f15456;

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final byte[] getCentralDirectoryData() {
        return ZipShort.getBytes((this.f15454 ? Short.MIN_VALUE : (short) 0) | this.f15456);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final ZipShort getCentralDirectoryLength() {
        return new ZipShort(2);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final ZipShort getHeaderId() {
        return f15453;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final byte[] getLocalFileDataData() {
        byte[] bArr = new byte[this.f15455 + 2];
        ZipShort.putShort((this.f15454 ? Short.MIN_VALUE : (short) 0) | this.f15456, bArr, 0);
        return bArr;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final ZipShort getLocalFileDataLength() {
        return new ZipShort(this.f15455 + 2);
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 < 2) {
            throw new ZipException(AbstractC6183.m11588(i2, "Too short content for ResourceAlignmentExtraField (0xa11e): "));
        }
        int value = ZipShort.getValue(bArr, i);
        this.f15456 = (short) (value & Advice.MethodSizeHandler.UNDEFINED_SIZE);
        this.f15454 = (value & 32768) != 0;
    }

    @Override // org.apache.commons.compress.archivers.zip.InterfaceC5589
    public final void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        parseFromCentralDirectoryData(bArr, i, i2);
        this.f15455 = i2 - 2;
    }
}
