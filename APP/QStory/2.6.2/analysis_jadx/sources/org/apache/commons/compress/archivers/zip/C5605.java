package org.apache.commons.compress.archivers.zip;

import java.util.zip.ZipException;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5605 extends AbstractC5615 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final ZipShort f15451 = new ZipShort(21);

    @Override // org.apache.commons.compress.archivers.zip.AbstractC5615, org.apache.commons.compress.archivers.zip.InterfaceC5588
    public final void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        m10920(4, i2);
        super.parseFromCentralDirectoryData(bArr, i, i2);
        ZipShort.getValue(bArr, i);
        PKWareExtraHeader$HashAlgorithm.getAlgorithmByCode(ZipShort.getValue(bArr, i + 2));
    }
}
