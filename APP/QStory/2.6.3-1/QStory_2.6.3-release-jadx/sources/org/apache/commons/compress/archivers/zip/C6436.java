package org.apache.commons.compress.archivers.zip;

import java.util.zip.ZipException;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6436 extends AbstractC6446 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final ZipShort f15796 = new ZipShort(21);

    @Override // org.apache.commons.compress.archivers.zip.AbstractC6446, org.apache.commons.compress.archivers.zip.InterfaceC6419
    public final void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        m11536(4, i2);
        super.parseFromCentralDirectoryData(bArr, i, i2);
        ZipShort.getValue(bArr, i);
        PKWareExtraHeader$HashAlgorithm.getAlgorithmByCode(ZipShort.getValue(bArr, i + 2));
    }
}
